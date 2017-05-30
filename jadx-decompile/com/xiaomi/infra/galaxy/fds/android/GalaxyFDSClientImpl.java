package com.xiaomi.infra.galaxy.fds.android;

import android.util.Log;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.wallet.e;
import com.google.gson.Gson;
import com.xiaomi.infra.galaxy.fds.android.auth.GalaxyFDSCredential;
import com.xiaomi.infra.galaxy.fds.android.exception.GalaxyFDSClientException;
import com.xiaomi.infra.galaxy.fds.android.model.FDSObject;
import com.xiaomi.infra.galaxy.fds.android.model.HttpMethod;
import com.xiaomi.infra.galaxy.fds.android.model.InitMultipartUploadResult;
import com.xiaomi.infra.galaxy.fds.android.model.ObjectMetadata;
import com.xiaomi.infra.galaxy.fds.android.model.ProgressListener;
import com.xiaomi.infra.galaxy.fds.android.model.PutObjectResult;
import com.xiaomi.infra.galaxy.fds.android.model.ThumbParam;
import com.xiaomi.infra.galaxy.fds.android.model.UploadPartResult;
import com.xiaomi.infra.galaxy.fds.android.model.UploadPartResultList;
import com.xiaomi.infra.galaxy.fds.android.model.UserParam;
import com.xiaomi.infra.galaxy.fds.android.util.Args;
import com.xiaomi.infra.galaxy.fds.android.util.Consts;
import com.xiaomi.infra.galaxy.fds.android.util.ObjectInputStream;
import com.xiaomi.infra.galaxy.fds.android.util.RequestFactory;
import com.xiaomi.infra.galaxy.fds.android.util.Util;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public class GalaxyFDSClientImpl implements GalaxyFDSClient {
    private static final String HTTPS_SCHEME = "https";
    private static final String HTTP_SCHEME = "http";
    private static final String LOG_TAG = "GalaxyFDSClientImpl";
    private static final boolean TEST_MODE;
    private final FDSClientConfiguration config;
    private final HttpClient httpClient = createHttpClient(this.config);

    static {
        String property = System.getProperty("java.runtime.name");
        if (property == null || !property.equals("android runtime")) {
            TEST_MODE = true;
        } else {
            TEST_MODE = false;
        }
    }

    public GalaxyFDSClientImpl(FDSClientConfiguration fDSClientConfiguration) {
        this.config = fDSClientConfiguration;
    }

    @Deprecated
    public GalaxyFDSClientImpl(String str, GalaxyFDSCredential galaxyFDSCredential, FDSClientConfiguration fDSClientConfiguration) {
        this.config = fDSClientConfiguration;
        this.config.setCredential(galaxyFDSCredential);
    }

    private void abortMultipartUpload(String str, String str2, String str3) {
        InputStream inputStream = null;
        String str4 = this.config.getUploadBaseUri() + "/" + str + "/" + str2 + "?uploadId=" + str3;
        try {
            HttpResponse execute = this.httpClient.execute(RequestFactory.createRequest(str4, this.config.getCredential(), HttpMethod.DELETE, null));
            inputStream = execute.getEntity().getContent();
            if (execute.getStatusLine().getStatusCode() != 200) {
                throw new GalaxyFDSClientException("Unable to upload object[" + str + "/" + str2 + "] to URI :" + str4 + ". Fail to abort multipart upload: " + execute.getStatusLine().toString());
            } else if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                }
            }
        } catch (Throwable e2) {
            throw new GalaxyFDSClientException("Fail to abort multipart upload. URI:" + str4, e2);
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                }
            }
        }
    }

    private PutObjectResult completeMultipartUpload(String str, String str2, String str3, ObjectMetadata objectMetadata, UploadPartResultList uploadPartResultList, List<UserParam> list) {
        Map allMetadata;
        InputStream inputStream;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.config.getUploadBaseUri() + "/" + str2 + "/" + str3 + "?uploadId=" + str);
        if (list != null) {
            for (UserParam userParam : list) {
                stringBuilder.append('&');
                stringBuilder.append(userParam.toString());
            }
        }
        String stringBuilder2 = stringBuilder.toString();
        if (objectMetadata != null) {
            try {
                allMetadata = objectMetadata.getAllMetadata();
            } catch (IOException e) {
                e = e;
                inputStream = null;
                try {
                    Throwable e2;
                    throw new GalaxyFDSClientException("Fail to complete multipart upload. URI:" + stringBuilder2, e2);
                } catch (Throwable th) {
                    e2 = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e3) {
                        }
                    }
                    throw e2;
                }
            } catch (Throwable th2) {
                e2 = th2;
                inputStream = null;
                if (inputStream != null) {
                    inputStream.close();
                }
                throw e2;
            }
        }
        allMetadata = null;
        HttpUriRequest createRequest = RequestFactory.createRequest(stringBuilder2, this.config.getCredential(), HttpMethod.PUT, allMetadata);
        ((HttpPut) createRequest).setEntity(new StringEntity(new Gson().toJson((Object) uploadPartResultList)));
        HttpResponse execute = this.httpClient.execute(createRequest);
        inputStream = execute.getEntity().getContent();
        try {
            if (execute.getStatusLine().getStatusCode() != 200) {
                throw new GalaxyFDSClientException("Unable to upload object[" + str2 + "/" + str3 + "] to URI :" + stringBuilder2 + ". Fail to complete multipart upload: " + execute.getStatusLine().toString());
            }
            PutObjectResult putObjectResult = (PutObjectResult) new Gson().fromJson(new InputStreamReader(inputStream), PutObjectResult.class);
            if (putObjectResult == null || putObjectResult.getAccessKeyId() == null || putObjectResult.getSignature() == null || putObjectResult.getExpires() == 0) {
                throw new GalaxyFDSClientException("Fail to parse the result of completing multipart upload. bucket name:" + str2 + ", object name:" + str3 + ", upload ID:" + str);
            }
            putObjectResult.setFdsServiceBaseUri(this.config.getBaseUri());
            putObjectResult.setCdnServiceBaseUri(this.config.getCdnBaseUri());
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                }
            }
            return putObjectResult;
        } catch (IOException e5) {
            e2 = e5;
            throw new GalaxyFDSClientException("Fail to complete multipart upload. URI:" + stringBuilder2, e2);
        }
    }

    private HttpClient createHttpClient(FDSClientConfiguration fDSClientConfiguration) {
        HttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, fDSClientConfiguration.getConnectionTimeoutMs());
        HttpConnectionParams.setSoTimeout(basicHttpParams, fDSClientConfiguration.getSocketTimeoutMs());
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, true);
        HttpConnectionParams.setTcpNoDelay(basicHttpParams, true);
        int i = fDSClientConfiguration.getSocketBufferSizeHints()[0];
        int i2 = fDSClientConfiguration.getSocketBufferSizeHints()[1];
        if (i > 0 || i2 > 0) {
            HttpConnectionParams.setSocketBufferSize(basicHttpParams, Math.max(i, i2));
        }
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        if (fDSClientConfiguration.isHttpsEnabled()) {
            SocketFactory socketFactory = SSLSocketFactory.getSocketFactory();
            socketFactory.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            schemeRegistry.register(new Scheme("https", socketFactory, 443));
        }
        return new DefaultHttpClient(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams);
    }

    private InitMultipartUploadResult initMultipartUpload(String str, String str2, long j) {
        String str3 = this.config.getUploadBaseUri() + "/" + str + "/" + (str2 == null ? "" : str2) + "?uploads";
        InputStream inputStream = null;
        try {
            Map hashMap = new HashMap();
            hashMap.put(Consts.ESTIMATED_OBJECT_SIZE, Long.toString(j));
            HttpResponse execute = this.httpClient.execute(RequestFactory.createRequest(str3, this.config.getCredential(), str2 == null ? HttpMethod.POST : HttpMethod.PUT, hashMap));
            inputStream = execute.getEntity().getContent();
            if (execute.getStatusLine().getStatusCode() != 200) {
                throw new GalaxyFDSClientException("Unable to upload object[" + str + "/" + str2 + "] to URI :" + str3 + ". Fail to initiate multipart upload: " + execute.getStatusLine().toString());
            }
            InitMultipartUploadResult initMultipartUploadResult = (InitMultipartUploadResult) new Gson().fromJson(new InputStreamReader(inputStream), InitMultipartUploadResult.class);
            if (initMultipartUploadResult == null || initMultipartUploadResult.getUploadId() == null || initMultipartUploadResult.getObjectName() == null || initMultipartUploadResult.getBucketName() == null) {
                throw new GalaxyFDSClientException("Fail to parse the result of init multipart upload. bucket name:" + str + ", object name:" + str2);
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                }
            }
            return initMultipartUploadResult;
        } catch (Throwable e2) {
            throw new GalaxyFDSClientException("Fail to initiate multipart upload. URI:" + str3, e2);
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                }
            }
        }
    }

    private boolean isGetThumbnail(List<UserParam> list) {
        if (list != null) {
            for (UserParam userParam : list) {
                if (userParam instanceof ThumbParam) {
                    return true;
                }
            }
        }
        return false;
    }

    private UploadPartResult uploadPart(String str, String str2, String str3, int i, ObjectInputStream objectInputStream, long j) {
        InputStream content;
        Exception e;
        int i2;
        String str4 = this.config.getUploadBaseUri() + "/" + str2 + "/" + str3 + "?uploadId=" + str + "&partNumber=" + i;
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) j);
        long j2 = j;
        while (j2 != 0) {
            try {
                int read = objectInputStream.read(bArr, 0, Math.min(bArr.length, (int) j2));
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
                j2 -= (long) read;
            } catch (Throwable e2) {
                Throwable e22;
                throw new GalaxyFDSClientException("Fail to read data from input stream, size:" + j, e22);
            }
        }
        byte[] toByteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException e3) {
        }
        InputStream inputStream = null;
        int i3 = 0;
        while (true) {
            try {
                HttpUriRequest createRequest = RequestFactory.createRequest(str4, this.config.getCredential(), HttpMethod.PUT, null);
                ((HttpPut) createRequest).setEntity(new ByteArrayEntity(toByteArray));
                try {
                    HttpResponse execute = this.httpClient.execute(createRequest);
                    content = execute.getEntity().getContent();
                    try {
                        if (execute.getStatusLine().getStatusCode() == 200) {
                            break;
                        }
                        throw new GalaxyFDSClientException("Unable to upload object[" + str2 + "/" + str3 + "] to URI :" + str4 + ". Fail to upload part " + i + ": " + execute.getStatusLine().toString());
                    } catch (IOException e4) {
                        e22 = e4;
                    }
                } catch (IOException e5) {
                    e22 = e5;
                    content = inputStream;
                    try {
                        throw new GalaxyFDSClientException("Fail to put part. URI:" + str4, e22);
                    } catch (GalaxyFDSClientException e6) {
                        e = e6;
                    }
                }
            } catch (GalaxyFDSClientException e7) {
                e = e7;
                content = inputStream;
                i2 = i3 + 1;
                if (i2 >= this.config.getMaxRetryTimes()) {
                    throw e;
                }
                try {
                    if (!TEST_MODE) {
                        Log.i(LOG_TAG, "Retry the upload of object:" + str3 + " bucket" + ":" + str2 + " upload id:" + str + " part number:" + i + " cause:" + Util.getStackTrace(e));
                    }
                    if (content != null) {
                        try {
                            content.close();
                        } catch (IOException e8) {
                        }
                    }
                    i3 = i2;
                    inputStream = content;
                } catch (Throwable th) {
                    e22 = th;
                }
            } catch (Throwable th2) {
                e22 = th2;
                content = inputStream;
            }
            i3 = i2;
            inputStream = content;
        }
        UploadPartResult uploadPartResult = (UploadPartResult) new Gson().fromJson(new InputStreamReader(content), UploadPartResult.class);
        if (uploadPartResult == null || uploadPartResult.getEtag() == null || uploadPartResult.getPartSize() == 0) {
            throw new GalaxyFDSClientException("Fail to parse the result of uploading part. bucket name:" + str2 + ", object name:" + str3 + ", upload ID:" + str);
        }
        if (content != null) {
            try {
                content.close();
            } catch (IOException e9) {
            }
        }
        return uploadPartResult;
        if (content != null) {
            try {
                content.close();
            } catch (IOException e10) {
            }
        }
        throw e22;
        throw e22;
    }

    public boolean doesObjectExist(String str, String str2) {
        Args.notNull(str, "bucket name");
        Args.notEmpty(str, "bucket name");
        Args.notNull(str2, "object name");
        Args.notEmpty(str2, "object name");
        String str3 = this.config.getBaseUri() + "/" + str + "/" + str2;
        try {
            HttpResponse execute = this.httpClient.execute(RequestFactory.createRequest(str3, this.config.getCredential(), HttpMethod.HEAD, null));
            int statusCode = execute.getStatusLine().getStatusCode();
            if (statusCode == 200) {
                return true;
            }
            if (statusCode == e.j) {
                return false;
            }
            throw new GalaxyFDSClientException("Unable to head object[" + str + "/" + str2 + "] from URI :" + str3 + ". Cause:" + execute.getStatusLine().toString());
        } catch (Throwable e) {
            throw new GalaxyFDSClientException("Unable to head object[" + str + "/" + str2 + "] from URI :" + str3 + " Exception:" + e.getMessage(), e);
        }
    }

    public FDSObject getObject(String str, long j, List<UserParam> list, ProgressListener progressListener) {
        InputStream content;
        Throwable e;
        InputStream inputStream;
        GalaxyFDSClientException galaxyFDSClientException;
        GalaxyFDSClientException galaxyFDSClientException2 = null;
        Args.notNull(str, "URI");
        Args.notNegative(j, "offset in content");
        if (list != null) {
            StringBuilder stringBuilder = new StringBuilder(str);
            for (UserParam userParam : list) {
                if (stringBuilder.indexOf("?") == -1) {
                    stringBuilder.append('?');
                } else {
                    stringBuilder.append('&');
                }
                stringBuilder.append(userParam.toString());
            }
            str = stringBuilder.toString();
        }
        try {
            String path = new URI(str).getPath();
            int indexOf = path.indexOf(47, 1);
            if (indexOf == -1) {
                throw new URISyntaxException(str, "not a valid object URI");
            }
            String substring = path.substring(0, indexOf);
            String substring2 = path.substring(indexOf + 1);
            try {
                Map hashMap = new HashMap();
                if (j > 0 && !isGetThumbnail(list)) {
                    hashMap.put("Range", "bytes=" + j + Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                }
                HttpResponse execute = this.httpClient.execute(RequestFactory.createRequest(str, this.config.getCredential(), HttpMethod.GET, hashMap));
                content = execute.getEntity().getContent();
                try {
                    int statusCode = execute.getStatusLine().getStatusCode();
                    if (statusCode == 200 || statusCode == 206) {
                        FDSObject fDSObject = new FDSObject(substring, substring2);
                        ObjectMetadata parseObjectMetadata = ObjectMetadata.parseObjectMetadata(execute.getAllHeaders());
                        fDSObject.setObjectContent(new ObjectInputStream(content, parseObjectMetadata, progressListener));
                        fDSObject.setObjectMetadata(parseObjectMetadata);
                        if (!(null == null || content == null)) {
                            try {
                                content.close();
                            } catch (IOException e2) {
                            }
                        }
                        return fDSObject;
                    }
                    GalaxyFDSClientException galaxyFDSClientException3 = new GalaxyFDSClientException("Unable to get object[" + substring + "/" + substring2 + "] from URI :" + str + ". Cause:" + execute.getStatusLine().toString());
                    try {
                        throw galaxyFDSClientException3;
                    } catch (IOException e3) {
                        e = e3;
                        galaxyFDSClientException2 = galaxyFDSClientException3;
                        inputStream = content;
                    } catch (Throwable th) {
                        e = th;
                        galaxyFDSClientException2 = galaxyFDSClientException3;
                        if (!(galaxyFDSClientException2 == null || content == null)) {
                            try {
                                content.close();
                            } catch (IOException e4) {
                            }
                        }
                        throw e;
                    }
                } catch (IOException e5) {
                    e = e5;
                    inputStream = content;
                    try {
                        galaxyFDSClientException = new GalaxyFDSClientException("Unable to get object[" + substring + "/" + substring2 + "] from URI :" + str + " Exception:" + e.getMessage(), e);
                        try {
                            throw galaxyFDSClientException;
                        } catch (Throwable th2) {
                            e = th2;
                            galaxyFDSClientException2 = galaxyFDSClientException;
                            content = inputStream;
                        }
                    } catch (Throwable th3) {
                        e = th3;
                        content = inputStream;
                        content.close();
                        throw e;
                    }
                } catch (Throwable th4) {
                    e = th4;
                    content.close();
                    throw e;
                }
            } catch (IOException e6) {
                e = e6;
                inputStream = null;
                galaxyFDSClientException = new GalaxyFDSClientException("Unable to get object[" + substring + "/" + substring2 + "] from URI :" + str + " Exception:" + e.getMessage(), e);
                throw galaxyFDSClientException;
            } catch (Throwable th5) {
                e = th5;
                content = null;
                content.close();
                throw e;
            }
        } catch (Throwable e7) {
            throw new GalaxyFDSClientException("Invalid URI, can't parse bucket nameand object name form it:" + str, e7);
        }
    }

    public FDSObject getObject(String str, String str2) {
        return getObject(str, str2, 0, null);
    }

    public FDSObject getObject(String str, String str2, long j, List<UserParam> list) {
        return getObject(str, str2, j, (List) list, null);
    }

    public FDSObject getObject(String str, String str2, long j, List<UserParam> list, ProgressListener progressListener) {
        Args.notNull(str, "bucket name");
        Args.notEmpty(str, "bucket name");
        Args.notNull(str2, "object name");
        Args.notEmpty(str2, "object name");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.config.getDownloadBaseUri());
        stringBuilder.append("/" + str + "/" + str2);
        return getObject(stringBuilder.toString(), j, (List) list, progressListener);
    }

    @Deprecated
    public FDSObject getObject(String str, String str2, long j, List<UserParam> list, ProgressListener progressListener, boolean z) {
        return getObject(str, str2, j, (List) list, progressListener);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.xiaomi.infra.galaxy.fds.android.model.ObjectMetadata getObject(java.lang.String r11, java.io.File r12, java.util.List<com.xiaomi.infra.galaxy.fds.android.model.UserParam> r13, com.xiaomi.infra.galaxy.fds.android.model.ProgressListener r14) {
        /*
        r10 = this;
        r7 = 0;
        r0 = "Destination file";
        com.xiaomi.infra.galaxy.fds.android.util.Args.notNull(r12, r0);
        r9 = r10.isGetThumbnail(r13);
        r8 = r7;
    L_0x000b:
        if (r8 == 0) goto L_0x0027;
    L_0x000d:
        if (r9 != 0) goto L_0x0027;
    L_0x000f:
        r0 = 1;
        r6 = r0;
    L_0x0011:
        if (r6 == 0) goto L_0x0029;
    L_0x0013:
        r2 = r12.length();	 Catch:{ GalaxyFDSClientException -> 0x002c }
    L_0x0017:
        r0 = r10;
        r1 = r11;
        r4 = r13;
        r5 = r14;
        r0 = r0.getObject(r1, r2, r4, r5);	 Catch:{ GalaxyFDSClientException -> 0x002c }
        com.xiaomi.infra.galaxy.fds.android.util.Util.downloadObjectToFile(r0, r12, r6);	 Catch:{ GalaxyFDSClientException -> 0x002c }
        r0 = r0.getObjectMetadata();	 Catch:{ GalaxyFDSClientException -> 0x002c }
        return r0;
    L_0x0027:
        r6 = r7;
        goto L_0x0011;
    L_0x0029:
        r2 = 0;
        goto L_0x0017;
    L_0x002c:
        r0 = move-exception;
        r1 = r8 + 1;
        r2 = r10.config;
        r2 = r2.getMaxRetryTimes();
        if (r1 < r2) goto L_0x0038;
    L_0x0037:
        throw r0;
    L_0x0038:
        r2 = TEST_MODE;
        if (r2 != 0) goto L_0x0070;
    L_0x003c:
        r2 = "GalaxyFDSClientImpl";
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Retry the download of object:";
        r3 = r3.append(r4);
        r3 = r3.append(r11);
        r4 = " to file: ";
        r3 = r3.append(r4);
        r4 = r12.getAbsolutePath();
        r3 = r3.append(r4);
        r4 = " cause:";
        r3 = r3.append(r4);
        r0 = com.xiaomi.infra.galaxy.fds.android.util.Util.getStackTrace(r0);
        r0 = r3.append(r0);
        r0 = r0.toString();
        android.util.Log.i(r2, r0);
    L_0x0070:
        r8 = r1;
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClientImpl.getObject(java.lang.String, java.io.File, java.util.List, com.xiaomi.infra.galaxy.fds.android.model.ProgressListener):com.xiaomi.infra.galaxy.fds.android.model.ObjectMetadata");
    }

    public ObjectMetadata getObject(String str, String str2, File file) {
        return getObject(str, str2, file, null);
    }

    public ObjectMetadata getObject(String str, String str2, File file, List<UserParam> list) {
        return getObject(str, str2, file, (List) list, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.xiaomi.infra.galaxy.fds.android.model.ObjectMetadata getObject(java.lang.String r11, java.lang.String r12, java.io.File r13, java.util.List<com.xiaomi.infra.galaxy.fds.android.model.UserParam> r14, com.xiaomi.infra.galaxy.fds.android.model.ProgressListener r15) {
        /*
        r10 = this;
        r0 = "Destination file";
        com.xiaomi.infra.galaxy.fds.android.util.Args.notNull(r13, r0);
        r0 = 0;
        r9 = r10.isGetThumbnail(r14);
        r8 = r0;
    L_0x000b:
        if (r8 == 0) goto L_0x0027;
    L_0x000d:
        if (r9 != 0) goto L_0x0027;
    L_0x000f:
        r0 = 1;
    L_0x0010:
        if (r0 == 0) goto L_0x0029;
    L_0x0012:
        r4 = r13.length();	 Catch:{ GalaxyFDSClientException -> 0x002c }
    L_0x0016:
        r1 = r10;
        r2 = r11;
        r3 = r12;
        r6 = r14;
        r7 = r15;
        r1 = r1.getObject(r2, r3, r4, r6, r7);	 Catch:{ GalaxyFDSClientException -> 0x002c }
        com.xiaomi.infra.galaxy.fds.android.util.Util.downloadObjectToFile(r1, r13, r0);	 Catch:{ GalaxyFDSClientException -> 0x002c }
        r0 = r1.getObjectMetadata();	 Catch:{ GalaxyFDSClientException -> 0x002c }
        return r0;
    L_0x0027:
        r0 = 0;
        goto L_0x0010;
    L_0x0029:
        r4 = 0;
        goto L_0x0016;
    L_0x002c:
        r0 = move-exception;
        r1 = r8 + 1;
        r2 = r10.config;
        r2 = r2.getMaxRetryTimes();
        if (r1 < r2) goto L_0x0038;
    L_0x0037:
        throw r0;
    L_0x0038:
        r2 = TEST_MODE;
        if (r2 != 0) goto L_0x0080;
    L_0x003c:
        r2 = "GalaxyFDSClientImpl";
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Retry the download of object:";
        r3 = r3.append(r4);
        r3 = r3.append(r12);
        r4 = " bucket";
        r3 = r3.append(r4);
        r4 = ":";
        r3 = r3.append(r4);
        r3 = r3.append(r11);
        r4 = " to file: ";
        r3 = r3.append(r4);
        r4 = r13.getAbsolutePath();
        r3 = r3.append(r4);
        r4 = " cause:";
        r3 = r3.append(r4);
        r0 = com.xiaomi.infra.galaxy.fds.android.util.Util.getStackTrace(r0);
        r0 = r3.append(r0);
        r0 = r0.toString();
        android.util.Log.i(r2, r0);
    L_0x0080:
        r8 = r1;
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClientImpl.getObject(java.lang.String, java.lang.String, java.io.File, java.util.List, com.xiaomi.infra.galaxy.fds.android.model.ProgressListener):com.xiaomi.infra.galaxy.fds.android.model.ObjectMetadata");
    }

    @Deprecated
    public ObjectMetadata getObject(String str, String str2, File file, List<UserParam> list, ProgressListener progressListener, boolean z) {
        return getObject(str, str2, file, (List) list, progressListener);
    }

    public PutObjectResult putObject(String str, File file) {
        return putObject(str, file, null);
    }

    public PutObjectResult putObject(String str, File file, List<UserParam> list) {
        return putObject(str, file, (List) list, null);
    }

    public PutObjectResult putObject(String str, File file, List<UserParam> list, ProgressListener progressListener) {
        return putObject(str, null, file, (List) list, progressListener);
    }

    public PutObjectResult putObject(String str, InputStream inputStream, ObjectMetadata objectMetadata) {
        return putObject(str, inputStream, objectMetadata, null);
    }

    public PutObjectResult putObject(String str, InputStream inputStream, ObjectMetadata objectMetadata, List<UserParam> list) {
        return putObject(str, inputStream, objectMetadata, (List) list, null);
    }

    public PutObjectResult putObject(String str, InputStream inputStream, ObjectMetadata objectMetadata, List<UserParam> list, ProgressListener progressListener) {
        return putObject(str, null, inputStream, objectMetadata, list, progressListener);
    }

    public PutObjectResult putObject(String str, String str2, File file) {
        return putObject(str, str2, file, null);
    }

    public PutObjectResult putObject(String str, String str2, File file, List<UserParam> list) {
        return putObject(str, str2, file, (List) list, null);
    }

    public PutObjectResult putObject(String str, String str2, File file, List<UserParam> list, ProgressListener progressListener) {
        Args.notNull(file, UriUtil.LOCAL_FILE_SCHEME);
        try {
            InputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            ObjectMetadata objectMetadata = new ObjectMetadata();
            objectMetadata.setContentLength(file.length());
            objectMetadata.setContentType(Util.getMimeType(file));
            objectMetadata.setLastModified(new Date(file.lastModified()));
            return putObject(str, str2, bufferedInputStream, objectMetadata, list, progressListener);
        } catch (Throwable e) {
            throw new GalaxyFDSClientException("Unable to find the file to be uploaded:" + file.getAbsolutePath(), e);
        }
    }

    public PutObjectResult putObject(String str, String str2, InputStream inputStream, ObjectMetadata objectMetadata) {
        return putObject(str, str2, inputStream, objectMetadata, null);
    }

    public PutObjectResult putObject(String str, String str2, InputStream inputStream, ObjectMetadata objectMetadata, List<UserParam> list) {
        return putObject(str, str2, inputStream, objectMetadata, list, null);
    }

    public PutObjectResult putObject(String str, String str2, InputStream inputStream, ObjectMetadata objectMetadata, List<UserParam> list, ProgressListener progressListener) {
        String objectName;
        GalaxyFDSClientException e;
        Args.notNull(str, "bucket name");
        Args.notEmpty(str, "bucket name");
        Args.notNull(inputStream, "input stream");
        Args.notNull(objectMetadata, "metadata");
        long contentLength = objectMetadata.getContentLength();
        Args.notNegative(contentLength, "content length");
        if (objectMetadata.getContentType() == null) {
            objectMetadata.setContentType(Consts.APPLICATION_OCTET_STREAM);
        }
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream, objectMetadata, progressListener);
        try {
            InitMultipartUploadResult initMultipartUpload = initMultipartUpload(str, str2, objectMetadata.getContentLength());
            objectName = initMultipartUpload.getObjectName();
            try {
                String uploadId = initMultipartUpload.getUploadId();
                int uploadPartSize = this.config.getUploadPartSize();
                int i = ((int) ((((long) uploadPartSize) + contentLength) - 1)) / uploadPartSize;
                List arrayList = new ArrayList(i);
                int i2 = 1;
                long j = contentLength;
                while (i2 <= i) {
                    contentLength = Math.min((long) uploadPartSize, j);
                    arrayList.add(uploadPart(uploadId, str, objectName, i2, objectInputStream, contentLength));
                    i2++;
                    j -= contentLength;
                }
                UploadPartResultList uploadPartResultList = new UploadPartResultList();
                uploadPartResultList.setUploadPartResultList(arrayList);
                PutObjectResult completeMultipartUpload = completeMultipartUpload(uploadId, str, objectName, objectMetadata, uploadPartResultList, list);
                try {
                    objectInputStream.close();
                } catch (IOException e2) {
                }
                return completeMultipartUpload;
            } catch (GalaxyFDSClientException e3) {
                e = e3;
                if (null != null) {
                    try {
                        abortMultipartUpload(str, objectName, null);
                    } catch (Throwable th) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e4) {
                        }
                    }
                }
                throw e;
            }
        } catch (GalaxyFDSClientException e5) {
            e = e5;
            objectName = str2;
            if (null != null) {
                abortMultipartUpload(str, objectName, null);
            }
            throw e;
        }
    }
}
