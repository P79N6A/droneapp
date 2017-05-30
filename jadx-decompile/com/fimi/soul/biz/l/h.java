package com.fimi.soul.biz.l;

import android.util.Log;
import com.facebook.common.util.UriUtil;
import com.google.gson.Gson;
import com.xiaomi.infra.galaxy.fds.android.auth.GalaxyFDSCredential;
import com.xiaomi.infra.galaxy.fds.android.exception.GalaxyFDSClientException;
import com.xiaomi.infra.galaxy.fds.android.model.HttpMethod;
import com.xiaomi.infra.galaxy.fds.android.model.InitMultipartUploadResult;
import com.xiaomi.infra.galaxy.fds.android.model.ObjectMetadata;
import com.xiaomi.infra.galaxy.fds.android.model.ProgressListener;
import com.xiaomi.infra.galaxy.fds.android.model.PutObjectResult;
import com.xiaomi.infra.galaxy.fds.android.model.UploadPartResult;
import com.xiaomi.infra.galaxy.fds.android.model.UploadPartResultList;
import com.xiaomi.infra.galaxy.fds.android.model.UserParam;
import com.xiaomi.infra.galaxy.fds.android.util.Args;
import com.xiaomi.infra.galaxy.fds.android.util.Consts;
import com.xiaomi.infra.galaxy.fds.android.util.RequestFactory;
import com.xiaomi.infra.galaxy.fds.android.util.Util;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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

public class h {
    String a = null;
    String b;
    String c;
    List<UserParam> d;
    BufferedInputStream e;
    ByteArrayOutputStream f;
    ObjectMetadata g;
    ProgressListener h;
    f i = null;
    public File j;
    int k = 0;
    ArrayList l;
    private final d m;
    private final HttpClient n;
    private long o;
    private boolean p = false;
    private int q = 1;
    private int r = 0;
    private long s;

    public h(d dVar) {
        this.m = dVar;
        this.n = a(this.m);
        this.i = new f();
    }

    @Deprecated
    public h(String str, GalaxyFDSCredential galaxyFDSCredential, d dVar) {
        this.m = dVar;
        this.m.a(galaxyFDSCredential);
        this.n = a(this.m);
        this.i = new f();
    }

    private InitMultipartUploadResult a(String str, String str2, long j) {
        String str3 = this.m.r() + "/" + str + "/" + (str2 == null ? "" : str2) + "?uploads";
        InputStream inputStream = null;
        try {
            Map hashMap = new HashMap();
            hashMap.put(Consts.ESTIMATED_OBJECT_SIZE, Long.toString(j));
            HttpResponse execute = this.n.execute(RequestFactory.createRequest(str3, this.m.f(), str2 == null ? HttpMethod.POST : HttpMethod.PUT, hashMap));
            inputStream = execute.getEntity().getContent();
            if (execute.getStatusLine().getStatusCode() != 200) {
                throw new GalaxyFDSClientException("Unable to upload object[" + str + "/" + str2 + "] to URI :" + str3 + ". Fail to initiate multipart upload: " + execute.getStatusLine().toString());
            }
            InitMultipartUploadResult initMultipartUploadResult = (InitMultipartUploadResult) new Gson().fromJson(new InputStreamReader(inputStream), InitMultipartUploadResult.class);
            this.c = initMultipartUploadResult.getObjectName();
            if (initMultipartUploadResult == null || initMultipartUploadResult.getUploadId() == null || initMultipartUploadResult.getObjectName() == null || initMultipartUploadResult.getBucketName() == null) {
                throw new GalaxyFDSClientException("Fail to parse the result of init multipart upload. bucket name:" + str + ", object name:" + str2);
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                }
            }
            this.a = initMultipartUploadResult.getUploadId();
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

    private PutObjectResult a(String str, String str2, String str3, ObjectMetadata objectMetadata, UploadPartResultList uploadPartResultList, List<UserParam> list) {
        Map allMetadata;
        Throwable e;
        InputStream inputStream;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.m.r() + "/" + str2 + "/" + str3 + "?uploadId=" + str);
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
            } catch (IOException e2) {
                e = e2;
                inputStream = null;
                try {
                    this.i.a(false);
                    throw new GalaxyFDSClientException("Fail to complete multipart upload. URI:" + stringBuilder2, e);
                } catch (Throwable th) {
                    e = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e3) {
                        }
                    }
                    throw e;
                }
            } catch (Throwable th2) {
                e = th2;
                inputStream = null;
                if (inputStream != null) {
                    inputStream.close();
                }
                throw e;
            }
        }
        allMetadata = null;
        HttpUriRequest createRequest = RequestFactory.createRequest(stringBuilder2, this.m.f(), HttpMethod.PUT, allMetadata);
        ((HttpPut) createRequest).setEntity(new StringEntity(new Gson().toJson((Object) uploadPartResultList)));
        HttpResponse execute = this.n.execute(createRequest);
        inputStream = execute.getEntity().getContent();
        try {
            if (execute.getStatusLine().getStatusCode() != 200) {
                throw new GalaxyFDSClientException("Unable to upload object[" + str2 + "/" + str3 + "] to URI :" + stringBuilder2 + ". Fail to complete multipart upload: " + execute.getStatusLine().toString());
            }
            PutObjectResult putObjectResult = (PutObjectResult) new Gson().fromJson(new InputStreamReader(inputStream), PutObjectResult.class);
            if (putObjectResult == null || putObjectResult.getAccessKeyId() == null || putObjectResult.getSignature() == null || putObjectResult.getExpires() == 0) {
                throw new GalaxyFDSClientException("Fail to parse the result of completing multipart upload. bucket name:" + str2 + ", object name:" + str3 + ", upload ID:" + str);
            }
            putObjectResult.setFdsServiceBaseUri(this.m.o());
            putObjectResult.setCdnServiceBaseUri(this.m.p());
            this.i.b(putObjectResult.getObjectName());
            this.i.c(putObjectResult.getAbsolutePresignedUri());
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                }
            }
            return putObjectResult;
        } catch (IOException e5) {
            e = e5;
            this.i.a(false);
            throw new GalaxyFDSClientException("Fail to complete multipart upload. URI:" + stringBuilder2, e);
        }
    }

    private UploadPartResult a(String str, String str2, String str3, int i, byte[] bArr) {
        InputStream inputStream;
        String str4 = this.m.r() + "/" + str2 + "/" + str3 + "?uploadId=" + str + "&partNumber=" + i;
        InputStream inputStream2 = null;
        while (true) {
            if (!this.p) {
                try {
                    HttpUriRequest createRequest = RequestFactory.createRequest(str4, this.m.f(), HttpMethod.PUT, (Map) null);
                    ((HttpPut) createRequest).setEntity(new ByteArrayEntity(bArr));
                    HttpResponse execute = this.n.execute(createRequest);
                    inputStream2 = execute.getEntity().getContent();
                    if (execute.getStatusLine().getStatusCode() == 200) {
                        break;
                    }
                    throw new GalaxyFDSClientException("Unable to upload object[" + str2 + "/" + str3 + "] to URI :" + str4 + ". Fail to upload part " + i + ": " + execute.getStatusLine().toString());
                } catch (Throwable e) {
                    throw new GalaxyFDSClientException("Fail to put part. URI:" + str4, e);
                } catch (GalaxyFDSClientException e2) {
                    inputStream = inputStream2;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e3) {
                        }
                    }
                    inputStream2 = inputStream;
                } catch (Throwable th) {
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e4) {
                        }
                    }
                }
            }
        }
        UploadPartResult uploadPartResult = (UploadPartResult) new Gson().fromJson(new InputStreamReader(inputStream2), UploadPartResult.class);
        if (uploadPartResult == null || uploadPartResult.getEtag() == null || uploadPartResult.getPartSize() == 0) {
            throw new GalaxyFDSClientException("Fail to parse the result of uploading part. bucket name:" + str2 + ", object name:" + str3 + ", upload ID:" + str);
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException e5) {
            }
        }
        return uploadPartResult;
    }

    private HttpClient a(d dVar) {
        HttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, dVar.c());
        HttpConnectionParams.setSoTimeout(basicHttpParams, dVar.b());
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, true);
        HttpConnectionParams.setTcpNoDelay(basicHttpParams, true);
        int i = dVar.d()[0];
        int i2 = dVar.d()[1];
        if (i > 0 || i2 > 0) {
            HttpConnectionParams.setSocketBufferSize(basicHttpParams, Math.max(i, i2));
        }
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme(UriUtil.HTTP_SCHEME, PlainSocketFactory.getSocketFactory(), 80));
        if (dVar.j()) {
            SocketFactory socketFactory = SSLSocketFactory.getSocketFactory();
            socketFactory.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            schemeRegistry.register(new Scheme(UriUtil.HTTPS_SCHEME, socketFactory, 443));
        }
        return new DefaultHttpClient(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams);
    }

    private void a(String str, String str2, String str3) {
        InputStream inputStream = null;
        String str4 = this.m.r() + "/" + str + "/" + str2 + "?uploadId=" + str3;
        try {
            HttpResponse execute = this.n.execute(RequestFactory.createRequest(str4, this.m.f(), HttpMethod.DELETE, (Map) null));
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
            this.i.a(false);
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

    public int a() {
        return this.q;
    }

    public void a(int i) {
        this.q = i;
    }

    public void a(String str, File file, List<UserParam> list, ProgressListener progressListener) {
        Args.notNull(file, UriUtil.LOCAL_FILE_SCHEME);
        this.b = str;
        this.j = file;
        this.h = progressListener;
        this.d = list;
        try {
            this.e = new BufferedInputStream(new FileInputStream(file));
            this.o = file.length();
            this.g = new ObjectMetadata();
            this.g.setContentLength(file.length());
            this.g.setContentType(Util.getMimeType(file));
            this.g.setLastModified(new Date(file.lastModified()));
            a(str, this.c, this.g.getContentLength());
        } catch (Throwable e) {
            throw new GalaxyFDSClientException("Unable to find the file to be uploaded:" + file.getAbsolutePath(), e);
        }
    }

    public f b() {
        int e = this.m.e();
        UploadPartResultList uploadPartResultList = new UploadPartResultList();
        try {
            if (this.s > 0) {
                this.e.skip(this.o - this.s);
            } else {
                this.s = this.o;
                this.r = (int) (this.s % ((long) e) == 0 ? this.s / ((long) e) : (this.s / ((long) e)) + 1);
                this.l = new ArrayList(this.r);
            }
            int i = (int) (this.s % ((long) e) == 0 ? this.s / ((long) e) : (this.s / ((long) e)) + 1);
            for (int i2 = this.q; i2 <= this.r; i2++) {
                long min = Math.min((long) e, this.s);
                this.f = new ByteArrayOutputStream((int) min);
                byte[] bArr = new byte[1048576];
                while (!this.p) {
                    int min2 = Math.min(bArr.length, (int) min);
                    if (min <= 0) {
                        break;
                    }
                    min2 = this.e.read(bArr, 0, min2);
                    if (min2 == -1) {
                        break;
                    }
                    this.f.write(bArr, 0, min2);
                    min -= (long) min2;
                    this.s -= (long) min2;
                    this.k = min2 + this.k;
                    this.h.onProgress((long) this.k, this.o);
                    Log.i("ljh", "finish percent : " + (((long) (this.k * 100)) / this.o));
                    Thread.sleep(500);
                }
                UploadPartResult a = a(this.a, this.b, this.c, i2, this.f.toByteArray());
                if (a != null) {
                    this.l.add(a);
                }
                this.q = i2 + 1;
            }
            uploadPartResultList.setUploadPartResultList(this.l);
            a(this.a, this.b, this.c, this.g, uploadPartResultList, this.d);
            this.i.a(true);
        } catch (GalaxyFDSClientException e2) {
            try {
                a(this.b, this.c, this.a);
            } catch (GalaxyFDSClientException e3) {
                e3.printStackTrace();
                this.i.a(false);
            }
        } catch (FileNotFoundException e4) {
            e4.printStackTrace();
            this.i.a(false);
        } catch (IOException e5) {
            e5.printStackTrace();
            this.i.a(false);
        } catch (InterruptedException e6) {
            e6.printStackTrace();
        }
        return this.i;
    }

    public void c() {
        this.p = true;
    }

    public void d() {
        Thread.interrupted();
        this.q = 0;
        this.s = 0;
    }

    public f e() {
        this.p = false;
        return b();
    }
}
