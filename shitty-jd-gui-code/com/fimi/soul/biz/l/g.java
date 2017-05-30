package com.fimi.soul.biz.l;

import android.content.Context;
import com.fimi.soul.biz.g.a;
import com.fimi.soul.entity.FdsMsg;
import com.fimi.soul.entity.PlaneMsg;
import com.xiaomi.infra.galaxy.fds.android.FDSClientConfiguration;
import com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClient;
import com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClientImpl;
import com.xiaomi.infra.galaxy.fds.android.auth.GalaxyFDSCredential;
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
import java.util.List;

public class g
{
  private Context a;
  private GalaxyFDSClient b;
  private String c = null;
  private String d = null;
  private List<UserParam> e = null;
  private a f;
  
  public g(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public PlaneMsg a()
  {
    localPlaneMsg = new PlaneMsg();
    try
    {
      this.c = a.c(this.a, 0);
      this.d = a.b(this.a, 0);
      Object localObject = new OAuthCredential("https://awsusor0.fds.api.xiaomi.com", "2882303761517518920", "2882303761517518920", this.c, "XiaoMi", this.d, "HmacSHA1");
      localObject = new FDSClientConfiguration().withCredential((GalaxyFDSCredential)localObject).withFdsServiceBaseUri("https://awsusor0.fds.api.xiaomi.com");
      ((FDSClientConfiguration)localObject).setRegionName("awsusor0");
      ((FDSClientConfiguration)localObject).setUploadPartSize(5242880);
      this.b = new GalaxyFDSClientImpl((FDSClientConfiguration)localObject);
      localObject = new ExpiresParam(System.currentTimeMillis() + 3153600000000L);
      this.e.add(localObject);
      bool = true;
    }
    catch (GalaxyFDSClientException localGalaxyFDSClientException)
    {
      for (;;)
      {
        localGalaxyFDSClientException.printStackTrace();
        localPlaneMsg.setErrorMessage(localGalaxyFDSClientException.getMessage());
        boolean bool = false;
      }
    }
    localPlaneMsg.setSuccess(bool);
    return localPlaneMsg;
  }
  
  public PlaneMsg a(File paramFile)
  {
    bool2 = false;
    FdsMsg localFdsMsg = new FdsMsg();
    localPlaneMsg = new PlaneMsg();
    try
    {
      if (this.b == null) {
        a();
      }
      bool1 = bool2;
      if (this.b != null)
      {
        paramFile = this.b.putObject("bucket-app-us", paramFile, this.e);
        localFdsMsg.setBucketName("bucket-app-us");
        localFdsMsg.setObjectName(paramFile.getObjectName());
        localFdsMsg.setUrl(paramFile.getAbsolutePresignedUri());
        bool1 = true;
      }
    }
    catch (GalaxyFDSClientException paramFile)
    {
      for (;;)
      {
        paramFile.printStackTrace();
        localPlaneMsg.setErrorMessage(paramFile.getMessage());
        boolean bool1 = bool2;
      }
    }
    localPlaneMsg.setSuccess(bool1);
    localPlaneMsg.setData(localFdsMsg);
    return localPlaneMsg;
  }
  
  public PlaneMsg a(File paramFile, ProgressListener paramProgressListener)
  {
    bool2 = false;
    FdsMsg localFdsMsg = new FdsMsg();
    localPlaneMsg = new PlaneMsg();
    try
    {
      if (this.b == null) {
        a();
      }
      bool1 = bool2;
      if (this.b != null)
      {
        paramFile = this.b.putObject("bucket-app-us", paramFile, this.e, paramProgressListener);
        localFdsMsg.setBucketName("bucket-app-us");
        localFdsMsg.setObjectName(paramFile.getObjectName());
        localFdsMsg.setUrl(paramFile.getAbsolutePresignedUri());
        bool1 = true;
      }
    }
    catch (GalaxyFDSClientException paramFile)
    {
      for (;;)
      {
        paramFile.printStackTrace();
        localPlaneMsg.setErrorMessage(paramFile.getMessage());
        boolean bool1 = bool2;
      }
    }
    localPlaneMsg.setSuccess(bool1);
    localPlaneMsg.setData(localFdsMsg);
    return localPlaneMsg;
  }
  
  public PlaneMsg a(InputStream paramInputStream, ObjectMetadata paramObjectMetadata)
  {
    localPlaneMsg = new PlaneMsg();
    FdsMsg localFdsMsg = new FdsMsg();
    bool2 = false;
    try
    {
      if (this.b == null) {
        a();
      }
      bool1 = bool2;
      if (this.b != null)
      {
        paramInputStream = this.b.putObject("bucket-app-us", paramInputStream, paramObjectMetadata, this.e);
        localFdsMsg.setBucketName("bucket-app-us");
        localFdsMsg.setObjectName(paramInputStream.getObjectName());
        localFdsMsg.setUrl(paramInputStream.getAbsolutePresignedUri());
        bool1 = true;
      }
    }
    catch (GalaxyFDSClientException paramInputStream)
    {
      for (;;)
      {
        paramInputStream.printStackTrace();
        localPlaneMsg.setErrorMessage(paramInputStream.getMessage());
        boolean bool1 = bool2;
      }
    }
    localPlaneMsg.setSuccess(bool1);
    localPlaneMsg.setData(localFdsMsg);
    return localPlaneMsg;
  }
  
  public PlaneMsg a(InputStream paramInputStream, ObjectMetadata paramObjectMetadata, ProgressListener paramProgressListener)
  {
    localPlaneMsg = new PlaneMsg();
    FdsMsg localFdsMsg = new FdsMsg();
    try
    {
      if (this.b == null) {
        a();
      }
      if (this.b == null) {
        break label115;
      }
      paramInputStream = this.b.putObject("bucket-app-us", paramInputStream, paramObjectMetadata, this.e, paramProgressListener);
      localFdsMsg.setBucketName("bucket-app-us");
      localFdsMsg.setObjectName(paramInputStream.getObjectName());
      localFdsMsg.setUrl(paramInputStream.getAbsolutePresignedUri());
      bool = true;
    }
    catch (GalaxyFDSClientException paramInputStream)
    {
      for (;;)
      {
        paramInputStream.printStackTrace();
        localPlaneMsg.setErrorMessage(paramInputStream.getMessage());
        boolean bool = false;
      }
    }
    localPlaneMsg.setSuccess(bool);
    localPlaneMsg.setData(localFdsMsg);
    return localPlaneMsg;
  }
  
  public File a(String paramString)
  {
    try
    {
      if (this.b == null) {
        a();
      }
      this.b.getObject("bucket-app-us", paramString, null);
      return null;
    }
    catch (GalaxyFDSClientException paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  public void a(a parama)
  {
    this.f = parama;
  }
  
  public PlaneMsg b(File paramFile, ProgressListener paramProgressListener)
  {
    FdsMsg localFdsMsg = new FdsMsg();
    localPlaneMsg = new PlaneMsg();
    this.c = a.c(this.a, 0);
    this.d = a.b(this.a, 0);
    try
    {
      Object localObject = new OAuthCredential("https://awsusor0.fds.api.xiaomi.com", "2882303761517518920", "2882303761517518920", this.c, "XiaoMi", this.d, "HmacSHA1");
      localObject = new d().b((GalaxyFDSCredential)localObject).b("https://awsusor0.fds.api.xiaomi.com");
      ((d)localObject).g(5242880);
      ((d)localObject).e("awsusor0");
      ExpiresParam localExpiresParam = new ExpiresParam(System.currentTimeMillis() + 3153600000000L);
      this.e.add(localExpiresParam);
      localObject = new h((d)localObject);
      if (this.f != null) {
        this.f.a((h)localObject);
      }
      ((h)localObject).a("bucket-app-us", paramFile, this.e, paramProgressListener);
      localFdsMsg.setBucketName("bucket-app-us");
      paramProgressListener = ((h)localObject).b();
      if (paramProgressListener != null)
      {
        localFdsMsg.setObjectName(paramProgressListener.c());
        localFdsMsg.setUrl(paramProgressListener.d());
        localPlaneMsg.setSuccess(paramProgressListener.a());
      }
    }
    catch (GalaxyFDSClientException paramProgressListener)
    {
      for (;;)
      {
        paramProgressListener.printStackTrace();
        localPlaneMsg.setErrorMessage(paramProgressListener.getMessage());
        localPlaneMsg.setSuccess(false);
      }
    }
    localPlaneMsg.setData(localFdsMsg);
    localPlaneMsg.setFile(paramFile);
    return localPlaneMsg;
  }
  
  public InputStream b(String paramString)
  {
    InputStream localInputStream = null;
    try
    {
      if (this.b == null) {
        a();
      }
      paramString = this.b.getObject("bucket-app-us", paramString);
    }
    catch (GalaxyFDSClientException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
        paramString = null;
      }
    }
    if (paramString != null) {
      localInputStream = paramString.getObjectContent();
    }
    return localInputStream;
  }
  
  public static abstract interface a
  {
    public abstract void a(h paramh);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/l/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */