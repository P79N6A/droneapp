package com.fimi.soul.biz.l;

import android.content.Context;
import com.fimi.soul.entity.FdsMsg;
import com.fimi.soul.entity.PlaneMsg;
import com.xiaomi.infra.galaxy.fds.android.FDSClientConfiguration;
import com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClient;
import com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClientImpl;
import com.xiaomi.infra.galaxy.fds.android.auth.OAuthCredential;
import com.xiaomi.infra.galaxy.fds.android.exception.GalaxyFDSClientException;
import com.xiaomi.infra.galaxy.fds.android.model.ExpiresParam;
import com.xiaomi.infra.galaxy.fds.android.model.FDSObject;
import com.xiaomi.infra.galaxy.fds.android.model.ObjectMetadata;
import com.xiaomi.infra.galaxy.fds.android.model.ProgressListener;
import com.xiaomi.infra.galaxy.fds.android.model.PutObjectResult;
import com.xiaomi.infra.galaxy.fds.android.model.UserParam;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class g {
    private Context a;
    private GalaxyFDSClient b;
    private String c;
    private String d;
    private List<UserParam> e;
    private a f;

    public interface a {
        void a(h hVar);
    }

    public g(Context context) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.e = new ArrayList();
        this.a = context;
    }

    public PlaneMsg a() {
        boolean z;
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            this.c = com.fimi.soul.biz.g.a.c(this.a, 0);
            this.d = com.fimi.soul.biz.g.a.b(this.a, 0);
            FDSClientConfiguration withFdsServiceBaseUri = new FDSClientConfiguration().withCredential(new OAuthCredential(com.fimi.soul.base.a.n, "2882303761517518920", "2882303761517518920", this.c, com.fimi.soul.base.a.y, this.d, com.fimi.soul.base.a.p)).withFdsServiceBaseUri(com.fimi.soul.base.a.n);
            withFdsServiceBaseUri.setRegionName("awsusor0");
            withFdsServiceBaseUri.setUploadPartSize(5242880);
            this.b = new GalaxyFDSClientImpl(withFdsServiceBaseUri);
            this.e.add(new ExpiresParam(System.currentTimeMillis() + 3153600000000L));
            z = true;
        } catch (GalaxyFDSClientException e) {
            e.printStackTrace();
            planeMsg.setErrorMessage(e.getMessage());
            z = false;
        }
        planeMsg.setSuccess(z);
        return planeMsg;
    }

    public PlaneMsg a(File file) {
        boolean z = false;
        FdsMsg fdsMsg = new FdsMsg();
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            if (this.b == null) {
                a();
            }
            if (this.b != null) {
                PutObjectResult putObject = this.b.putObject(com.fimi.soul.base.a.o, file, this.e);
                fdsMsg.setBucketName(com.fimi.soul.base.a.o);
                fdsMsg.setObjectName(putObject.getObjectName());
                fdsMsg.setUrl(putObject.getAbsolutePresignedUri());
                z = true;
            }
        } catch (GalaxyFDSClientException e) {
            e.printStackTrace();
            planeMsg.setErrorMessage(e.getMessage());
        }
        planeMsg.setSuccess(z);
        planeMsg.setData(fdsMsg);
        return planeMsg;
    }

    public PlaneMsg a(File file, ProgressListener progressListener) {
        boolean z = false;
        FdsMsg fdsMsg = new FdsMsg();
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            if (this.b == null) {
                a();
            }
            if (this.b != null) {
                PutObjectResult putObject = this.b.putObject(com.fimi.soul.base.a.o, file, this.e, progressListener);
                fdsMsg.setBucketName(com.fimi.soul.base.a.o);
                fdsMsg.setObjectName(putObject.getObjectName());
                fdsMsg.setUrl(putObject.getAbsolutePresignedUri());
                z = true;
            }
        } catch (GalaxyFDSClientException e) {
            e.printStackTrace();
            planeMsg.setErrorMessage(e.getMessage());
        }
        planeMsg.setSuccess(z);
        planeMsg.setData(fdsMsg);
        return planeMsg;
    }

    public PlaneMsg a(InputStream inputStream, ObjectMetadata objectMetadata) {
        PlaneMsg planeMsg = new PlaneMsg();
        FdsMsg fdsMsg = new FdsMsg();
        boolean z = false;
        try {
            if (this.b == null) {
                a();
            }
            if (this.b != null) {
                PutObjectResult putObject = this.b.putObject(com.fimi.soul.base.a.o, inputStream, objectMetadata, this.e);
                fdsMsg.setBucketName(com.fimi.soul.base.a.o);
                fdsMsg.setObjectName(putObject.getObjectName());
                fdsMsg.setUrl(putObject.getAbsolutePresignedUri());
                z = true;
            }
        } catch (GalaxyFDSClientException e) {
            e.printStackTrace();
            planeMsg.setErrorMessage(e.getMessage());
        }
        planeMsg.setSuccess(z);
        planeMsg.setData(fdsMsg);
        return planeMsg;
    }

    public PlaneMsg a(InputStream inputStream, ObjectMetadata objectMetadata, ProgressListener progressListener) {
        boolean z;
        PlaneMsg planeMsg = new PlaneMsg();
        FdsMsg fdsMsg = new FdsMsg();
        try {
            if (this.b == null) {
                a();
            }
            if (this.b != null) {
                PutObjectResult putObject = this.b.putObject(com.fimi.soul.base.a.o, inputStream, objectMetadata, this.e, progressListener);
                fdsMsg.setBucketName(com.fimi.soul.base.a.o);
                fdsMsg.setObjectName(putObject.getObjectName());
                fdsMsg.setUrl(putObject.getAbsolutePresignedUri());
                z = true;
                planeMsg.setSuccess(z);
                planeMsg.setData(fdsMsg);
                return planeMsg;
            }
        } catch (GalaxyFDSClientException e) {
            e.printStackTrace();
            planeMsg.setErrorMessage(e.getMessage());
        }
        z = false;
        planeMsg.setSuccess(z);
        planeMsg.setData(fdsMsg);
        return planeMsg;
    }

    public File a(String str) {
        try {
            if (this.b == null) {
                a();
            }
            this.b.getObject(com.fimi.soul.base.a.o, str, null);
        } catch (GalaxyFDSClientException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void a(a aVar) {
        this.f = aVar;
    }

    public PlaneMsg b(File file, ProgressListener progressListener) {
        FdsMsg fdsMsg = new FdsMsg();
        PlaneMsg planeMsg = new PlaneMsg();
        this.c = com.fimi.soul.biz.g.a.c(this.a, 0);
        this.d = com.fimi.soul.biz.g.a.b(this.a, 0);
        try {
            d b = new d().b(new OAuthCredential(com.fimi.soul.base.a.n, "2882303761517518920", "2882303761517518920", this.c, com.fimi.soul.base.a.y, this.d, com.fimi.soul.base.a.p)).b(com.fimi.soul.base.a.n);
            b.g(5242880);
            b.e("awsusor0");
            this.e.add(new ExpiresParam(System.currentTimeMillis() + 3153600000000L));
            h hVar = new h(b);
            if (this.f != null) {
                this.f.a(hVar);
            }
            hVar.a(com.fimi.soul.base.a.o, file, this.e, progressListener);
            fdsMsg.setBucketName(com.fimi.soul.base.a.o);
            f b2 = hVar.b();
            if (b2 != null) {
                fdsMsg.setObjectName(b2.c());
                fdsMsg.setUrl(b2.d());
                planeMsg.setSuccess(b2.a());
            }
        } catch (GalaxyFDSClientException e) {
            e.printStackTrace();
            planeMsg.setErrorMessage(e.getMessage());
            planeMsg.setSuccess(false);
        }
        planeMsg.setData(fdsMsg);
        planeMsg.setFile(file);
        return planeMsg;
    }

    public InputStream b(String str) {
        FDSObject object;
        try {
            if (this.b == null) {
                a();
            }
            object = this.b.getObject(com.fimi.soul.base.a.o, str);
        } catch (GalaxyFDSClientException e) {
            e.printStackTrace();
            object = null;
        }
        return object != null ? object.getObjectContent() : null;
    }
}
