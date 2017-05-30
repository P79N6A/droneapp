package com.tencent.open.weiyun;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.text.TextUtils;
import com.baidu.tts.loopj.AsyncHttpClient;
import com.facebook.common.util.UriUtil;
import com.fimi.soul.entity.User;
import com.fimi.soul.module.setting.i;
import com.tencent.connect.auth.QQAuth;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.BaseApi$TempRequestListener;
import com.tencent.open.a.f;
import com.tencent.open.utils.DataConvert;
import com.tencent.open.utils.Global;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.utils.HttpUtils.HttpStatusException;
import com.tencent.open.utils.HttpUtils.NetworkUnavailableException;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import com.xiaomi.market.sdk.j;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import org.a.a.e;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FileManager extends BaseApi {
    private static final String[] a = new String[]{"https://graph.qq.com/weiyun/get_photo_list", "https://graph.qq.com/weiyun/get_music_list", "https://graph.qq.com/weiyun/get_video_list"};
    private static final String[] b = new String[]{"https://graph.qq.com/weiyun/delete_photo", "https://graph.qq.com/weiyun/delete_music", "https://graph.qq.com/weiyun/delete_video"};

    private class DownLoadImp {
        private static final String DOWNLOAD_COOKIE_NAME = "dl_cookie_name";
        private static final String DOWNLOAD_COOKIE_VALUE = "dl_cookie_value";
        private static final String DOWNLOAD_ENCRYPT_URL = "dl_encrypt_url";
        private static final String DOWNLOAD_MUSIC_URL = "https://graph.qq.com/weiyun/download_music";
        private static final String DOWNLOAD_PIC_URL = "https://graph.qq.com/weiyun/download_photo";
        private static final int DOWNLOAD_PROGRESS = 1;
        private static final int DOWNLOAD_PROGRESS_DONE = 2;
        private static final String DOWNLOAD_SERVER_HOST = "dl_svr_host";
        private static final String DOWNLOAD_SERVER_PORT = "dl_svr_port";
        private static final String DOWNLOAD_THUMB_SIZE = "dl_thumb_size";
        private static final String DOWNLOAD_THUMB_URL = "https://graph.qq.com/weiyun/get_photo_thumb";
        private static final String DOWNLOAD_VIDEO_URL = "https://graph.qq.com/weiyun/download_video";
        private static final int GET_PERMISSON_DOWN = 0;
        private static final int MAX_ERROR_TIMES = 10;
        private IDownLoadFileCallBack mCallback;
        private Context mContext;
        private String mDownloadCookieName;
        private String mDownloadCookieValue;
        private String mDownloadEncryptUrl;
        private String mDownloadServerHost;
        private int mDownloadServerPort;
        private String mDownloadThumbSize;
        private File mFile;
        private WeiyunFileType mFileType;
        private Handler mHandler;
        private String mSavePath;
        private String mThumbSize;
        private WeiyunFile mWeiyunFile;

        public DownLoadImp(Context context, WeiyunFileType weiyunFileType, WeiyunFile weiyunFile, String str, IDownLoadFileCallBack iDownLoadFileCallBack) {
            this.mContext = context;
            this.mFileType = weiyunFileType;
            this.mWeiyunFile = weiyunFile;
            this.mSavePath = str;
            this.mCallback = iDownLoadFileCallBack;
            this.mHandler = new Handler(this.mContext.getMainLooper(), FileManager.this) {
                public void handleMessage(Message message) {
                    switch (message.what) {
                        case 0:
                            JSONObject jSONObject = (JSONObject) message.obj;
                            try {
                                int i = jSONObject.getInt("ret");
                                if (i != 0) {
                                    DownLoadImp.this.mCallback.onError(new UiError(i, jSONObject.toString(), null));
                                    return;
                                }
                                jSONObject = jSONObject.getJSONObject(UriUtil.DATA_SCHEME);
                                DownLoadImp.this.mDownloadEncryptUrl = jSONObject.getString(DownLoadImp.DOWNLOAD_ENCRYPT_URL);
                                DownLoadImp.this.mDownloadCookieName = jSONObject.getString(DownLoadImp.DOWNLOAD_COOKIE_NAME);
                                DownLoadImp.this.mDownloadCookieValue = jSONObject.getString(DownLoadImp.DOWNLOAD_COOKIE_VALUE);
                                DownLoadImp.this.mDownloadServerPort = jSONObject.getInt(DownLoadImp.DOWNLOAD_SERVER_PORT);
                                DownLoadImp.this.mDownloadServerHost = jSONObject.getString(DownLoadImp.DOWNLOAD_SERVER_HOST);
                                if (jSONObject.has(DownLoadImp.DOWNLOAD_THUMB_SIZE)) {
                                    DownLoadImp.this.mDownloadThumbSize = jSONObject.getString(DownLoadImp.DOWNLOAD_THUMB_SIZE);
                                }
                                DownLoadImp.this.mCallback.onDownloadStart();
                                DownLoadImp.this.doDownload();
                                return;
                            } catch (JSONException e) {
                                DownLoadImp.this.mCallback.onError(new UiError(-4, e.getMessage(), null));
                                return;
                            }
                        case 1:
                            DownLoadImp.this.mCallback.onDownloadProgress(Integer.parseInt((String) message.obj));
                            return;
                        case 2:
                            DownLoadImp.this.mCallback.onDownloadSuccess(DownLoadImp.this.mSavePath);
                            return;
                        default:
                            DownLoadImp.this.mCallback.onError(new UiError(message.what, (String) message.obj, null));
                            return;
                    }
                }
            };
        }

        private void doDownload() {
            new Thread() {
                public void run() {
                    Message obtainMessage;
                    Throwable th;
                    FileOutputStream fileOutputStream;
                    Exception exception;
                    HttpParams basicHttpParams = new BasicHttpParams();
                    HttpConnectionParams.setConnectionTimeout(basicHttpParams, 15000);
                    HttpConnectionParams.setSoTimeout(basicHttpParams, 20000);
                    HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
                    HttpProtocolParams.setContentCharset(basicHttpParams, "UTF-8");
                    HttpProtocolParams.setUserAgent(basicHttpParams, "TX_QQF_ANDROID");
                    String str = "http://" + DownLoadImp.this.mDownloadServerHost + ":" + DownLoadImp.this.mDownloadServerPort + "/ftn_handler/" + DownLoadImp.this.mDownloadEncryptUrl + "/";
                    if (!TextUtils.isEmpty(DownLoadImp.this.mDownloadThumbSize)) {
                        str = str + "?size=" + DownLoadImp.this.mDownloadThumbSize;
                    }
                    HttpClient defaultHttpClient = new DefaultHttpClient(basicHttpParams);
                    InputStream inputStream = null;
                    FileOutputStream fileOutputStream2 = null;
                    InputStream inputStream2;
                    Message obtainMessage2;
                    try {
                        FileOutputStream fileOutputStream3 = new FileOutputStream(new File(DownLoadImp.this.mSavePath));
                        try {
                            byte[] bArr = new byte[AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START];
                            int read;
                            int i;
                            if (TextUtils.isEmpty(DownLoadImp.this.mThumbSize)) {
                                long fileSize = (DownLoadImp.this.mWeiyunFile.getFileSize() > 262144 ? 262144 : DownLoadImp.this.mWeiyunFile.getFileSize()) + 0;
                                long j = 0;
                                int i2 = 0;
                                inputStream2 = inputStream;
                                while (fileSize <= DownLoadImp.this.mWeiyunFile.getFileSize()) {
                                    long j2;
                                    try {
                                        HttpUriRequest httpGet = new HttpGet(str);
                                        httpGet.addHeader("Accept-Encoding", AsyncHttpClient.ENCODING_GZIP);
                                        httpGet.addHeader(e.z, DownLoadImp.this.mDownloadServerHost);
                                        httpGet.addHeader(e.j, "Keep-Alive");
                                        httpGet.addHeader("Cookie", DownLoadImp.this.mDownloadCookieName + "=" + DownLoadImp.this.mDownloadCookieValue);
                                        httpGet.addHeader(e.L, "no-cache");
                                        httpGet.addHeader("RANGE", "bytes=" + j + Constants.ACCEPT_TIME_SEPARATOR_SERVER + fileSize + "");
                                        HttpResponse execute = defaultHttpClient.execute(httpGet);
                                        f.c("weiyun_test", "uploadFileToWeiyun doDownloadPic response:" + execute.toString());
                                        int statusCode = execute.getStatusLine().getStatusCode();
                                        if (statusCode != 200 && statusCode != 206) {
                                            inputStream = inputStream2;
                                            break;
                                        }
                                        inputStream2 = execute.getEntity().getContent();
                                        while (true) {
                                            read = inputStream2.read(bArr);
                                            if (read <= 0) {
                                                break;
                                            }
                                            fileOutputStream3.write(bArr, 0, read);
                                            j += (long) read;
                                        }
                                        j2 = j;
                                        inputStream = inputStream2;
                                        i = i2;
                                        if (DownLoadImp.this.mWeiyunFile.getFileSize() - fileSize > 0) {
                                            long fileSize2 = (DownLoadImp.this.mWeiyunFile.getFileSize() - j2 > 262144 ? 262144 : DownLoadImp.this.mWeiyunFile.getFileSize() - j2) + j2;
                                            obtainMessage2 = DownLoadImp.this.mHandler.obtainMessage();
                                            obtainMessage2.what = 1;
                                            obtainMessage2.obj = ((100 * fileSize2) / DownLoadImp.this.mWeiyunFile.getFileSize()) + "";
                                            DownLoadImp.this.mHandler.sendMessage(obtainMessage2);
                                            fileSize = fileSize2;
                                            inputStream2 = inputStream;
                                            i2 = i;
                                            j = j2;
                                        }
                                    } catch (Exception e) {
                                        i2++;
                                        if (i2 > 10) {
                                            e.printStackTrace();
                                            f.e("weiyun_test", "uploadFileToWeiyun doDownloadPic error:" + e.getMessage() + "");
                                            obtainMessage = DownLoadImp.this.mHandler.obtainMessage();
                                            obtainMessage.what = -2;
                                            obtainMessage.obj = e.getMessage();
                                            DownLoadImp.this.mHandler.sendMessage(obtainMessage);
                                            inputStream = inputStream2;
                                            break;
                                        }
                                        j2 = j;
                                        inputStream = inputStream2;
                                        i = i2;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fileOutputStream = fileOutputStream3;
                                    }
                                }
                                inputStream = inputStream2;
                            } else {
                                HttpUriRequest httpGet2 = new HttpGet(str);
                                httpGet2.addHeader("Accept-Encoding", AsyncHttpClient.ENCODING_GZIP);
                                httpGet2.addHeader(e.z, DownLoadImp.this.mDownloadServerHost);
                                httpGet2.addHeader(e.j, "Keep-Alive");
                                httpGet2.addHeader("Cookie", DownLoadImp.this.mDownloadCookieName + "=" + DownLoadImp.this.mDownloadCookieValue + "");
                                httpGet2.addHeader(e.L, "no-cache");
                                try {
                                    InputStream content;
                                    HttpResponse execute2 = defaultHttpClient.execute(httpGet2);
                                    f.c("weiyun_test", "uploadFileToWeiyun doDownloadPic response:" + execute2.toString());
                                    i = execute2.getStatusLine().getStatusCode();
                                    if (i == 200 || i == 206) {
                                        content = execute2.getEntity().getContent();
                                        while (true) {
                                            try {
                                                read = content.read(bArr);
                                                if (read <= 0) {
                                                    break;
                                                }
                                                fileOutputStream3.write(bArr, 0, read);
                                            } catch (Exception e2) {
                                                Exception exception2 = e2;
                                                inputStream = content;
                                                exception = exception2;
                                            } catch (Throwable th3) {
                                                inputStream2 = content;
                                                th = th3;
                                                fileOutputStream = fileOutputStream3;
                                            }
                                        }
                                    } else {
                                        content = inputStream;
                                    }
                                    inputStream = content;
                                } catch (Exception e3) {
                                    exception = e3;
                                    exception.printStackTrace();
                                    f.e("weiyun_test", "uploadFileToWeiyun doDownloadPic error:" + exception.getMessage() + "");
                                    Message obtainMessage3 = DownLoadImp.this.mHandler.obtainMessage();
                                    obtainMessage3.what = -2;
                                    obtainMessage3.obj = exception.getMessage();
                                    DownLoadImp.this.mHandler.sendMessage(obtainMessage3);
                                    if (fileOutputStream3 != null) {
                                        try {
                                            fileOutputStream3.close();
                                        } catch (IOException e4) {
                                            e4.printStackTrace();
                                        }
                                    }
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                            return;
                                        } catch (IOException e42) {
                                            e42.printStackTrace();
                                            return;
                                        }
                                    }
                                    return;
                                }
                            }
                            try {
                                obtainMessage = DownLoadImp.this.mHandler.obtainMessage();
                                obtainMessage.what = 2;
                                DownLoadImp.this.mHandler.sendMessage(obtainMessage);
                                if (fileOutputStream3 != null) {
                                    try {
                                        fileOutputStream3.close();
                                    } catch (IOException e422) {
                                        e422.printStackTrace();
                                    }
                                }
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException e4222) {
                                        e4222.printStackTrace();
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                inputStream2 = inputStream;
                                fileOutputStream = fileOutputStream3;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            inputStream2 = inputStream;
                            fileOutputStream = fileOutputStream3;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e5) {
                                    e5.printStackTrace();
                                }
                            }
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (IOException e52) {
                                    e52.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException e6) {
                        obtainMessage2 = DownLoadImp.this.mHandler.obtainMessage();
                        obtainMessage2.what = -2;
                        obtainMessage2.obj = e6.getMessage();
                        DownLoadImp.this.mHandler.sendMessage(obtainMessage2);
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e42222) {
                                e42222.printStackTrace();
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e422222) {
                                e422222.printStackTrace();
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        inputStream2 = inputStream;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        throw th;
                    }
                }
            }.start();
        }

        private void getDownloadPermission() {
            new Thread() {
                public void run() {
                    Bundle c = FileManager.this.composeCGIParams();
                    c.putString("file_id", DownLoadImp.this.mWeiyunFile.getFileId());
                    if (!TextUtils.isEmpty(DownLoadImp.this.mThumbSize)) {
                        c.putString("thumb", DownLoadImp.this.mThumbSize);
                    }
                    Message obtainMessage;
                    try {
                        JSONObject request = HttpUtils.request(FileManager.this.mToken, DownLoadImp.this.mContext, DownLoadImp.this.getDownloadUrl(DownLoadImp.this.mFileType), c, "GET");
                        obtainMessage = DownLoadImp.this.mHandler.obtainMessage();
                        obtainMessage.what = 0;
                        obtainMessage.obj = request;
                        DownLoadImp.this.mHandler.sendMessage(obtainMessage);
                    } catch (MalformedURLException e) {
                        obtainMessage = DownLoadImp.this.mHandler.obtainMessage();
                        obtainMessage.what = -3;
                        obtainMessage.obj = e.getMessage();
                        DownLoadImp.this.mHandler.sendMessage(obtainMessage);
                    } catch (IOException e2) {
                        obtainMessage = DownLoadImp.this.mHandler.obtainMessage();
                        obtainMessage.obj = e2.getMessage();
                        obtainMessage.what = -2;
                        DownLoadImp.this.mHandler.sendMessage(obtainMessage);
                    } catch (JSONException e3) {
                        obtainMessage = DownLoadImp.this.mHandler.obtainMessage();
                        obtainMessage.obj = e3.getMessage();
                        obtainMessage.what = -4;
                        DownLoadImp.this.mHandler.sendMessage(obtainMessage);
                    } catch (NetworkUnavailableException e4) {
                        obtainMessage = DownLoadImp.this.mHandler.obtainMessage();
                        obtainMessage.obj = e4.getMessage();
                        obtainMessage.what = -10;
                        DownLoadImp.this.mHandler.sendMessage(obtainMessage);
                    } catch (HttpStatusException e5) {
                        obtainMessage = DownLoadImp.this.mHandler.obtainMessage();
                        obtainMessage.obj = e5.getMessage();
                        obtainMessage.what = -9;
                        DownLoadImp.this.mHandler.sendMessage(obtainMessage);
                    }
                }
            }.start();
        }

        private String getDownloadUrl(WeiyunFileType weiyunFileType) {
            return weiyunFileType == WeiyunFileType.ImageFile ? this.mThumbSize != null ? DOWNLOAD_THUMB_URL : DOWNLOAD_PIC_URL : weiyunFileType == WeiyunFileType.MusicFile ? DOWNLOAD_MUSIC_URL : weiyunFileType == WeiyunFileType.VideoFile ? DOWNLOAD_VIDEO_URL : DOWNLOAD_PIC_URL;
        }

        public void setThumbSize(String str) {
            this.mThumbSize = str;
        }

        public void start() {
            if (this.mSavePath == null || this.mFileType == null || this.mWeiyunFile == null || this.mWeiyunFile.getFileId() == null) {
                Message obtainMessage = this.mHandler.obtainMessage();
                obtainMessage.what = -5;
                obtainMessage.obj = new String("");
                this.mHandler.sendMessage(obtainMessage);
                return;
            }
            this.mFile = new File(this.mSavePath);
            if (this.mFile.exists()) {
                obtainMessage = this.mHandler.obtainMessage();
                obtainMessage.what = -11;
                obtainMessage.obj = new String("");
                this.mHandler.sendMessage(obtainMessage);
                return;
            }
            this.mCallback.onPrepareStart();
            getDownloadPermission();
        }
    }

    private class GetFileListListener implements IUiListener {
        private IGetFileListListener mListener;

        public GetFileListListener(IGetFileListListener iGetFileListListener) {
            this.mListener = iGetFileListListener;
        }

        public void onCancel() {
        }

        public void onComplete(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            try {
                List arrayList = new ArrayList();
                JSONObject jSONObject2 = jSONObject.getJSONObject(UriUtil.DATA_SCHEME);
                if (!jSONObject2.isNull("content")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("content");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                        arrayList.add(new WeiyunFile(jSONObject3.getString("file_id"), jSONObject3.getString("file_name"), jSONObject3.getString("file_ctime"), (long) jSONObject3.getInt("file_size")));
                    }
                }
                this.mListener.onComplete(arrayList);
            } catch (JSONException e) {
                this.mListener.onError(new UiError(-4, com.tencent.connect.common.Constants.MSG_JSON_ERROR, jSONObject.toString()));
            }
        }

        public void onError(UiError uiError) {
            this.mListener.onError(uiError);
        }
    }

    private class UploadFileImp {
        private static final int GET_PERMISSON_DONE = 0;
        private static final String UPLOAD_IMAGE_URL = "https://graph.qq.com/weiyun/upload_photo";
        private static final String UPLOAD_MUSIC_URL = "https://graph.qq.com/weiyun/upload_music";
        private static final int UPLOAD_PROGRESS = 1;
        private static final int UPLOAD_PROGRESS_DONE = 2;
        private static final String UPLOAD_VIDEO_URL = "https://graph.qq.com/weiyun/upload_video";
        private final IUploadFileCallBack mCallback;
        private final Context mContext;
        private String mFileKey;
        private final String mFilePath;
        private long mFileSize;
        private final WeiyunFileType mFileType;
        private final Handler mHandler;
        private String mHost;
        private String mMD5Hash;
        private byte[] mUKey;

        public UploadFileImp(Context context, WeiyunFileType weiyunFileType, String str, IUploadFileCallBack iUploadFileCallBack) {
            this.mContext = context;
            this.mFileType = weiyunFileType;
            this.mFilePath = str;
            this.mCallback = iUploadFileCallBack;
            this.mHandler = new Handler(this.mContext.getMainLooper(), FileManager.this) {
                public void handleMessage(Message message) {
                    switch (message.what) {
                        case 0:
                            JSONObject jSONObject = (JSONObject) message.obj;
                            try {
                                int i = jSONObject.getInt("ret");
                                if (i != 0) {
                                    UploadFileImp.this.mCallback.onError(new UiError(i, jSONObject.toString(), null));
                                    return;
                                }
                                jSONObject = jSONObject.getJSONObject(UriUtil.DATA_SCHEME);
                                UploadFileImp.this.mUKey = DataConvert.string2bytes(jSONObject.getString("csum"));
                                UploadFileImp.this.mHost = jSONObject.getString(j.HOST);
                                UploadFileImp.this.mCallback.onUploadStart();
                                UploadFileImp.this.doUpload();
                                return;
                            } catch (Exception e) {
                                UploadFileImp.this.mCallback.onError(new UiError(-4, e.getMessage(), null));
                                return;
                            }
                        case 1:
                            UploadFileImp.this.mCallback.onUploadProgress(Integer.parseInt((String) message.obj));
                            return;
                        case 2:
                            UploadFileImp.this.mCallback.onUploadSuccess();
                            return;
                        default:
                            UploadFileImp.this.mCallback.onError(new UiError(message.what, (String) message.obj, null));
                            return;
                    }
                }
            };
        }

        private void doUpload() {
            new Thread() {
                public void run() {
                    Message obtainMessage;
                    Message obtainMessage2;
                    HttpParams basicHttpParams = new BasicHttpParams();
                    HttpConnectionParams.setConnectionTimeout(basicHttpParams, 15000);
                    HttpConnectionParams.setSoTimeout(basicHttpParams, 20000);
                    HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
                    HttpProtocolParams.setContentCharset(basicHttpParams, "UTF-8");
                    HttpProtocolParams.setUserAgent(basicHttpParams, "TX_QQF_ANDROID");
                    HttpClient defaultHttpClient = new DefaultHttpClient(basicHttpParams);
                    byte[] bArr = new byte[131072];
                    try {
                        FileInputStream fileInputStream = new FileInputStream(UploadFileImp.this.mFilePath);
                        int i = 0;
                        while (((long) i) < UploadFileImp.this.mFileSize) {
                            try {
                                int read = fileInputStream.read(bArr);
                                byte[] access$1400 = UploadFileImp.this.packPostBody(bArr, read, i);
                                i += read;
                                if (access$1400 != null) {
                                    HttpUriRequest httpPost = new HttpPost("http://" + UploadFileImp.this.mHost + "/ftn_handler/?bmd5=" + UploadFileImp.this.mMD5Hash);
                                    httpPost.addHeader("Accept-Encoding", "*/*");
                                    httpPost.setHeader(e.j, "Keep-Alive");
                                    httpPost.setHeader(e.L, "no-cache");
                                    httpPost.setHeader("Content-Type", org.a.a.c.f.j.a);
                                    httpPost.setEntity(new ByteArrayEntity(access$1400));
                                    try {
                                        read = defaultHttpClient.execute(httpPost).getStatusLine().getStatusCode();
                                    } catch (IOException e) {
                                        obtainMessage = UploadFileImp.this.mHandler.obtainMessage();
                                        obtainMessage.what = -2;
                                        obtainMessage.obj = "";
                                        UploadFileImp.this.mHandler.sendMessage(obtainMessage);
                                        read = 0;
                                    }
                                    if (read != 200) {
                                        obtainMessage2 = UploadFileImp.this.mHandler.obtainMessage();
                                        obtainMessage2.what = -9;
                                        obtainMessage2.obj = "";
                                        UploadFileImp.this.mHandler.sendMessage(obtainMessage2);
                                        break;
                                    } else if (((long) i) < UploadFileImp.this.mFileSize) {
                                        read = (int) ((((long) i) * 100) / UploadFileImp.this.mFileSize);
                                        Message obtainMessage3 = UploadFileImp.this.mHandler.obtainMessage();
                                        obtainMessage3.what = 1;
                                        obtainMessage3.obj = read + "";
                                        UploadFileImp.this.mHandler.sendMessage(obtainMessage3);
                                    } else {
                                        obtainMessage = UploadFileImp.this.mHandler.obtainMessage();
                                        obtainMessage.what = 2;
                                        obtainMessage.obj = "";
                                        UploadFileImp.this.mHandler.sendMessage(obtainMessage);
                                    }
                                }
                            } catch (IOException e2) {
                                obtainMessage2 = UploadFileImp.this.mHandler.obtainMessage();
                                obtainMessage2.what = -2;
                                obtainMessage2.obj = "";
                                UploadFileImp.this.mHandler.sendMessage(obtainMessage2);
                            }
                        }
                        try {
                            fileInputStream.close();
                        } catch (IOException e3) {
                            Message obtainMessage4 = UploadFileImp.this.mHandler.obtainMessage();
                            obtainMessage4.what = -2;
                            obtainMessage4.obj = e3.getMessage();
                            UploadFileImp.this.mHandler.sendMessage(obtainMessage4);
                        }
                    } catch (FileNotFoundException e4) {
                        obtainMessage2 = UploadFileImp.this.mHandler.obtainMessage();
                        obtainMessage2.what = -2;
                        obtainMessage2.obj = "";
                        UploadFileImp.this.mHandler.sendMessage(obtainMessage2);
                    }
                }
            }.start();
        }

        private String getRequestUrl(WeiyunFileType weiyunFileType) {
            return weiyunFileType == WeiyunFileType.ImageFile ? UPLOAD_IMAGE_URL : weiyunFileType == WeiyunFileType.MusicFile ? UPLOAD_MUSIC_URL : UPLOAD_VIDEO_URL;
        }

        private void getUploadPermission() {
            new Thread() {
                public void run() {
                    Message obtainMessage;
                    String str = SystemClock.elapsedRealtime() + "__" + Uri.parse(UploadFileImp.this.mFilePath).getLastPathSegment();
                    Bundle a = FileManager.this.composeCGIParams();
                    a.putString("sha", UploadFileImp.this.mFileKey);
                    a.putString("md5", UploadFileImp.this.mMD5Hash);
                    a.putString("size", UploadFileImp.this.mFileSize + "");
                    a.putString(User.FN_NAME, str);
                    a.putString("upload_type", "control");
                    try {
                        JSONObject request = HttpUtils.request(FileManager.this.mToken, UploadFileImp.this.mContext, UploadFileImp.this.getRequestUrl(UploadFileImp.this.mFileType), a, "GET");
                        obtainMessage = UploadFileImp.this.mHandler.obtainMessage();
                        obtainMessage.what = 0;
                        obtainMessage.obj = request;
                        UploadFileImp.this.mHandler.sendMessage(obtainMessage);
                    } catch (MalformedURLException e) {
                        obtainMessage = UploadFileImp.this.mHandler.obtainMessage();
                        obtainMessage.what = -3;
                        obtainMessage.obj = e.getMessage();
                        UploadFileImp.this.mHandler.sendMessage(obtainMessage);
                    } catch (IOException e2) {
                        obtainMessage = UploadFileImp.this.mHandler.obtainMessage();
                        obtainMessage.obj = e2.getMessage();
                        obtainMessage.what = -2;
                        UploadFileImp.this.mHandler.sendMessage(obtainMessage);
                    } catch (JSONException e3) {
                        obtainMessage = UploadFileImp.this.mHandler.obtainMessage();
                        obtainMessage.obj = e3.getMessage();
                        obtainMessage.what = -4;
                        UploadFileImp.this.mHandler.sendMessage(obtainMessage);
                    } catch (NetworkUnavailableException e4) {
                        obtainMessage = UploadFileImp.this.mHandler.obtainMessage();
                        obtainMessage.obj = e4.getMessage();
                        obtainMessage.what = -10;
                        UploadFileImp.this.mHandler.sendMessage(obtainMessage);
                    } catch (HttpStatusException e5) {
                        obtainMessage = UploadFileImp.this.mHandler.obtainMessage();
                        obtainMessage.obj = e5.getMessage();
                        obtainMessage.what = -9;
                        UploadFileImp.this.mHandler.sendMessage(obtainMessage);
                    }
                }
            }.start();
        }

        private byte[] packPostBody(byte[] bArr, int i, int i2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(bArr, 0, i);
                this.mMD5Hash = DataConvert.toHexString(instance.digest());
                instance.reset();
                int i3 = i + 340;
                byte[] bArr2 = new byte[((((i3 + 4) + 4) + 4) + 4)];
                int putInt2Bytes = DataConvert.putInt2Bytes(-1412589450, bArr2, 0) + 0;
                putInt2Bytes += DataConvert.putInt2Bytes(1000, bArr2, putInt2Bytes);
                putInt2Bytes += DataConvert.putInt2Bytes(0, bArr2, putInt2Bytes);
                i3 = DataConvert.putInt2Bytes(i3, bArr2, putInt2Bytes) + putInt2Bytes;
                i3 += DataConvert.putShort2Bytes(304, bArr2, i3);
                i3 += DataConvert.putBytes2Bytes(this.mUKey, bArr2, i3);
                i3 += DataConvert.putShort2Bytes(20, bArr2, i3);
                i3 += DataConvert.putString2Bytes(this.mFileKey, bArr2, i3);
                i3 += DataConvert.putInt2Bytes((int) this.mFileSize, bArr2, i3);
                i3 += DataConvert.putInt2Bytes(i2, bArr2, i3);
                i3 += DataConvert.putInt2Bytes(i, bArr2, i3);
                i3 += DataConvert.putBytes2Bytes(bArr, i, bArr2, i3);
                return bArr2;
            } catch (NoSuchAlgorithmException e) {
                Message obtainMessage = this.mHandler.obtainMessage();
                obtainMessage.what = -2;
                obtainMessage.obj = e.getMessage();
                this.mHandler.sendMessage(obtainMessage);
                return null;
            }
        }

        public void start() {
            FileInputStream fileInputStream;
            FileInputStream fileInputStream2;
            Message obtainMessage;
            Throwable th;
            Throwable th2;
            FileInputStream fileInputStream3;
            DigestInputStream digestInputStream = null;
            if (this.mFilePath == null || !new File(this.mFilePath).exists()) {
                Message obtainMessage2 = this.mHandler.obtainMessage();
                obtainMessage2.what = -5;
                obtainMessage2.obj = new String("");
                this.mHandler.sendMessage(obtainMessage2);
                return;
            }
            this.mCallback.onPrepareStart();
            File file = new File(this.mFilePath);
            this.mFileSize = file.length();
            DigestInputStream digestInputStream2;
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-1");
                fileInputStream = new FileInputStream(file);
                try {
                    digestInputStream2 = new DigestInputStream(fileInputStream, instance);
                    try {
                        do {
                        } while (digestInputStream2.read(new byte[AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END]) > 0);
                        instance = digestInputStream2.getMessageDigest();
                        this.mFileKey = DataConvert.toHexString(instance.digest());
                        instance.reset();
                        if (digestInputStream2 != null) {
                            try {
                                digestInputStream2.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        try {
                            instance = MessageDigest.getInstance("MD5");
                            fileInputStream = new FileInputStream(file);
                            try {
                                digestInputStream2 = new DigestInputStream(fileInputStream, instance);
                            } catch (Exception e3) {
                                fileInputStream2 = fileInputStream;
                                try {
                                    obtainMessage = this.mHandler.obtainMessage();
                                    obtainMessage.what = -2;
                                    obtainMessage.obj = new String("");
                                    this.mHandler.sendMessage(obtainMessage);
                                    if (digestInputStream != null) {
                                        try {
                                            digestInputStream.close();
                                        } catch (IOException e4) {
                                            e4.printStackTrace();
                                        }
                                    }
                                    if (fileInputStream2 == null) {
                                        try {
                                            fileInputStream2.close();
                                        } catch (IOException e22) {
                                            e22.printStackTrace();
                                            return;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    fileInputStream = fileInputStream2;
                                    th2 = th;
                                    if (digestInputStream != null) {
                                        try {
                                            digestInputStream.close();
                                        } catch (IOException e42) {
                                            e42.printStackTrace();
                                        }
                                    }
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (IOException e422) {
                                            e422.printStackTrace();
                                        }
                                    }
                                    throw th2;
                                }
                            } catch (Throwable th4) {
                                th2 = th4;
                                if (digestInputStream != null) {
                                    digestInputStream.close();
                                }
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                throw th2;
                            }
                            try {
                                do {
                                } while (digestInputStream2.read(new byte[AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END]) > 0);
                                MessageDigest messageDigest = digestInputStream2.getMessageDigest();
                                this.mMD5Hash = DataConvert.toHexString(messageDigest.digest());
                                messageDigest.reset();
                                fileInputStream.close();
                                digestInputStream2.close();
                                if (digestInputStream2 != null) {
                                    try {
                                        digestInputStream2.close();
                                    } catch (IOException e222) {
                                        e222.printStackTrace();
                                    }
                                }
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e2222) {
                                        e2222.printStackTrace();
                                    }
                                }
                                getUploadPermission();
                            } catch (Exception e5) {
                                digestInputStream = digestInputStream2;
                                fileInputStream2 = fileInputStream;
                                obtainMessage = this.mHandler.obtainMessage();
                                obtainMessage.what = -2;
                                obtainMessage.obj = new String("");
                                this.mHandler.sendMessage(obtainMessage);
                                if (digestInputStream != null) {
                                    digestInputStream.close();
                                }
                                if (fileInputStream2 == null) {
                                    fileInputStream2.close();
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                digestInputStream = digestInputStream2;
                                th2 = th;
                                if (digestInputStream != null) {
                                    digestInputStream.close();
                                }
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                throw th2;
                            }
                        } catch (Exception e6) {
                            fileInputStream2 = null;
                            obtainMessage = this.mHandler.obtainMessage();
                            obtainMessage.what = -2;
                            obtainMessage.obj = new String("");
                            this.mHandler.sendMessage(obtainMessage);
                            if (digestInputStream != null) {
                                digestInputStream.close();
                            }
                            if (fileInputStream2 == null) {
                                fileInputStream2.close();
                            }
                        } catch (Throwable th6) {
                            th2 = th6;
                            fileInputStream = null;
                            if (digestInputStream != null) {
                                digestInputStream.close();
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            throw th2;
                        }
                    } catch (Exception e7) {
                        fileInputStream3 = fileInputStream;
                        try {
                            obtainMessage = this.mHandler.obtainMessage();
                            obtainMessage.what = -2;
                            obtainMessage.obj = new String("");
                            this.mHandler.sendMessage(obtainMessage);
                            if (digestInputStream2 != null) {
                                try {
                                    digestInputStream2.close();
                                } catch (IOException e22222) {
                                    e22222.printStackTrace();
                                }
                            }
                            if (fileInputStream3 == null) {
                                try {
                                    fileInputStream3.close();
                                } catch (IOException e222222) {
                                    e222222.printStackTrace();
                                }
                            }
                        } catch (Throwable th32) {
                            th = th32;
                            fileInputStream = fileInputStream3;
                            digestInputStream = digestInputStream2;
                            th2 = th;
                            if (digestInputStream != null) {
                                try {
                                    digestInputStream.close();
                                } catch (IOException e4222) {
                                    e4222.printStackTrace();
                                }
                            }
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e42222) {
                                    e42222.printStackTrace();
                                }
                            }
                            throw th2;
                        }
                    } catch (Throwable th52) {
                        th = th52;
                        digestInputStream = digestInputStream2;
                        th2 = th;
                        if (digestInputStream != null) {
                            digestInputStream.close();
                        }
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        throw th2;
                    }
                } catch (Exception e8) {
                    digestInputStream2 = null;
                    fileInputStream3 = fileInputStream;
                    obtainMessage = this.mHandler.obtainMessage();
                    obtainMessage.what = -2;
                    obtainMessage.obj = new String("");
                    this.mHandler.sendMessage(obtainMessage);
                    if (digestInputStream2 != null) {
                        digestInputStream2.close();
                    }
                    if (fileInputStream3 == null) {
                        fileInputStream3.close();
                    }
                } catch (Throwable th7) {
                    th2 = th7;
                    if (digestInputStream != null) {
                        digestInputStream.close();
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th2;
                }
            } catch (Exception e9) {
                digestInputStream2 = null;
                obtainMessage = this.mHandler.obtainMessage();
                obtainMessage.what = -2;
                obtainMessage.obj = new String("");
                this.mHandler.sendMessage(obtainMessage);
                if (digestInputStream2 != null) {
                    digestInputStream2.close();
                }
                if (fileInputStream3 == null) {
                    fileInputStream3.close();
                }
            } catch (Throwable th8) {
                th2 = th8;
                fileInputStream = null;
                if (digestInputStream != null) {
                    digestInputStream.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th2;
            }
        }
    }

    public enum WeiyunFileType {
        ImageFile(0),
        MusicFile(1),
        VideoFile(2);
        
        private final int mType;

        private WeiyunFileType(int i) {
            this.mType = i;
        }

        public int value() {
            return this.mType;
        }
    }

    public FileManager(Context context, QQAuth qQAuth, QQToken qQToken) {
        super(qQAuth, qQToken);
    }

    public FileManager(Context context, QQToken qQToken) {
        super(qQToken);
    }

    public void deleteFile(WeiyunFileType weiyunFileType, String str, IUiListener iUiListener) {
        String str2 = b[weiyunFileType.value()];
        Bundle composeCGIParams = composeCGIParams();
        composeCGIParams.putString("file_id", str);
        HttpUtils.requestAsync(this.mToken, Global.getContext(), str2, composeCGIParams, "GET", new BaseApi$TempRequestListener(this, iUiListener));
    }

    public void downLoadFile(WeiyunFileType weiyunFileType, WeiyunFile weiyunFile, String str, IDownLoadFileCallBack iDownLoadFileCallBack) {
        new DownLoadImp(Global.getContext(), weiyunFileType, weiyunFile, str, iDownLoadFileCallBack).start();
    }

    public void downLoadThumb(WeiyunFile weiyunFile, String str, String str2, IDownLoadFileCallBack iDownLoadFileCallBack) {
        DownLoadImp downLoadImp = new DownLoadImp(Global.getContext(), WeiyunFileType.ImageFile, weiyunFile, str, iDownLoadFileCallBack);
        downLoadImp.setThumbSize(str2);
        downLoadImp.start();
    }

    public void getFileList(WeiyunFileType weiyunFileType, IGetFileListListener iGetFileListListener) {
        String str = a[weiyunFileType.value()];
        Bundle composeCGIParams = composeCGIParams();
        composeCGIParams.putString("offset", "0");
        composeCGIParams.putString("number", i.b);
        HttpUtils.requestAsync(this.mToken, Global.getContext(), str, composeCGIParams, "GET", new BaseApi$TempRequestListener(this, new GetFileListListener(iGetFileListListener)));
    }

    public void uploadFile(WeiyunFileType weiyunFileType, String str, IUploadFileCallBack iUploadFileCallBack) {
        new UploadFileImp(Global.getContext(), weiyunFileType, str, iUploadFileCallBack).start();
    }
}
