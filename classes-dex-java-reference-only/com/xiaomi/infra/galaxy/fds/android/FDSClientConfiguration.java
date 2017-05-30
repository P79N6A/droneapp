package com.xiaomi.infra.galaxy.fds.android;

import com.xiaomi.infra.galaxy.fds.android.auth.GalaxyFDSCredential;
import com.xiaomi.infra.galaxy.fds.android.util.Args;

public class FDSClientConfiguration
{
  public static final int DEFAULT_CONNECTION_TIMEOUT_MS = 50000;
  public static final int DEFAULT_MAX_RETRY_TIMES = 3;
  public static final int DEFAULT_SOCKET_TIMEOUT_MS = 50000;
  public static final int DEFAULT_UPLOAD_PART_SIZE = 4096;
  private static final String URI_CDN = "cdn";
  private static final String URI_FDS_SSL_SUFFIX = ".fds-ssl.api.xiaomi.com";
  private static final String URI_FDS_SUFFIX = ".fds.api.xiaomi.com";
  private static final String URI_FILES = "files";
  private static final String URI_HTTPS_PREFIX = "https://";
  private static final String URI_HTTP_PREFIX = "http://";
  private String baseUriForUnitTest = "";
  private int connectionTimeoutMs = 50000;
  private GalaxyFDSCredential credential;
  private boolean enableCdnForDownload = true;
  private boolean enableCdnForUpload = false;
  private boolean enableHttps = true;
  private boolean enableUnitTestMode = false;
  private int maxRetryTimes = 3;
  private String regionName = "";
  private int socketReceiveBufferSizeHint = 0;
  private int socketSendBufferSizeHint = 0;
  private int socketTimeoutMs = 50000;
  private int uploadPartSize = 4096;
  
  private String getBaseUriPrefix(boolean paramBoolean, String paramString)
  {
    if (paramString.isEmpty())
    {
      if (paramBoolean) {
        return "cdn";
      }
      return "files";
    }
    if (paramBoolean) {
      return paramString + "-" + "cdn";
    }
    return paramString + "-" + "files";
  }
  
  private String getBaseUriSuffix(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramBoolean1) && (paramBoolean2)) {
      return ".fds-ssl.api.xiaomi.com";
    }
    return ".fds.api.xiaomi.com";
  }
  
  String buildBaseUri(boolean paramBoolean)
  {
    if (this.enableUnitTestMode) {
      return this.baseUriForUnitTest;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    if (this.enableHttps) {}
    for (String str = "https://";; str = "http://")
    {
      localStringBuilder.append(str);
      localStringBuilder.append(getBaseUriPrefix(paramBoolean, this.regionName));
      localStringBuilder.append(getBaseUriSuffix(paramBoolean, this.enableHttps));
      return localStringBuilder.toString();
    }
  }
  
  public void enableCdnForDownload(boolean paramBoolean)
  {
    this.enableCdnForDownload = paramBoolean;
  }
  
  public void enableCdnForUpload(boolean paramBoolean)
  {
    this.enableCdnForUpload = paramBoolean;
  }
  
  public void enableHttps(boolean paramBoolean)
  {
    this.enableHttps = paramBoolean;
  }
  
  void enableUnitTestMode(boolean paramBoolean)
  {
    this.enableUnitTestMode = paramBoolean;
  }
  
  String getBaseUri()
  {
    return buildBaseUri(false);
  }
  
  String getBaseUriForUnitTest()
  {
    return this.baseUriForUnitTest;
  }
  
  String getCdnBaseUri()
  {
    return buildBaseUri(true);
  }
  
  @Deprecated
  public String getCdnServiceBaseUri()
  {
    return getCdnBaseUri();
  }
  
  public int getConnectionTimeoutMs()
  {
    return this.connectionTimeoutMs;
  }
  
  public GalaxyFDSCredential getCredential()
  {
    return this.credential;
  }
  
  String getDownloadBaseUri()
  {
    return buildBaseUri(this.enableCdnForDownload);
  }
  
  @Deprecated
  public String getFdsServiceBaseUri()
  {
    return getBaseUri();
  }
  
  public int getMaxRetryTimes()
  {
    return this.maxRetryTimes;
  }
  
  public String getRegionName()
  {
    return this.regionName;
  }
  
  public int[] getSocketBufferSizeHints()
  {
    return new int[] { this.socketSendBufferSizeHint, this.socketReceiveBufferSizeHint };
  }
  
  public int getSocketTimeoutMs()
  {
    return this.socketTimeoutMs;
  }
  
  String getUploadBaseUri()
  {
    return buildBaseUri(this.enableCdnForUpload);
  }
  
  public int getUploadPartSize()
  {
    return this.uploadPartSize;
  }
  
  public boolean isCdnEnabledForDownload()
  {
    return this.enableCdnForDownload;
  }
  
  public boolean isCdnEnabledForUpload()
  {
    return this.enableCdnForUpload;
  }
  
  boolean isEnabledUnitTestMode()
  {
    return this.enableUnitTestMode;
  }
  
  public boolean isHttpsEnabled()
  {
    return this.enableHttps;
  }
  
  void setBaseUriForUnitTest(String paramString)
  {
    this.baseUriForUnitTest = paramString;
  }
  
  @Deprecated
  public void setCdnServiceBaseUri(String paramString) {}
  
  public void setConnectionTimeoutMs(int paramInt)
  {
    this.connectionTimeoutMs = paramInt;
  }
  
  public void setCredential(GalaxyFDSCredential paramGalaxyFDSCredential)
  {
    Args.notNull(paramGalaxyFDSCredential, "credential");
    this.credential = paramGalaxyFDSCredential;
  }
  
  @Deprecated
  public void setFdsServiceBaseUri(String paramString) {}
  
  public void setMaxRetryTimes(int paramInt)
  {
    Args.notNegative(paramInt, "max retry times");
    this.maxRetryTimes = paramInt;
  }
  
  public void setRegionName(String paramString)
  {
    this.regionName = paramString;
  }
  
  public void setSocketBufferSizeHints(int paramInt1, int paramInt2)
  {
    this.socketSendBufferSizeHint = paramInt1;
    this.socketReceiveBufferSizeHint = paramInt2;
  }
  
  public void setSocketTimeoutMs(int paramInt)
  {
    this.socketTimeoutMs = paramInt;
  }
  
  public void setUploadPartSize(int paramInt)
  {
    Args.positive(paramInt, "upload part size");
    this.uploadPartSize = paramInt;
  }
  
  FDSClientConfiguration withBaseUriForUnitTest(String paramString)
  {
    setBaseUriForUnitTest(paramString);
    return this;
  }
  
  public FDSClientConfiguration withCdnForDownload(boolean paramBoolean)
  {
    enableCdnForDownload(paramBoolean);
    return this;
  }
  
  public FDSClientConfiguration withCdnForUpload(boolean paramBoolean)
  {
    enableCdnForUpload(paramBoolean);
    return this;
  }
  
  @Deprecated
  public FDSClientConfiguration withCdnServiceBaseUri(String paramString)
  {
    return this;
  }
  
  public FDSClientConfiguration withConnectionTimeoutMs(int paramInt)
  {
    setConnectionTimeoutMs(paramInt);
    return this;
  }
  
  public FDSClientConfiguration withCredential(GalaxyFDSCredential paramGalaxyFDSCredential)
  {
    setCredential(paramGalaxyFDSCredential);
    return this;
  }
  
  @Deprecated
  public FDSClientConfiguration withFdsServiceBaseUri(String paramString)
  {
    return this;
  }
  
  public FDSClientConfiguration withHttps(boolean paramBoolean)
  {
    enableHttps(paramBoolean);
    return this;
  }
  
  public FDSClientConfiguration withMaxRetryTimes(int paramInt)
  {
    setMaxRetryTimes(paramInt);
    return this;
  }
  
  public FDSClientConfiguration withRegionName(String paramString)
  {
    setRegionName(paramString);
    return this;
  }
  
  public FDSClientConfiguration withSocketBufferSizeHints(int paramInt1, int paramInt2)
  {
    setSocketBufferSizeHints(paramInt1, paramInt2);
    return this;
  }
  
  public FDSClientConfiguration withSocketTimeoutMs(int paramInt)
  {
    setSocketTimeoutMs(paramInt);
    return this;
  }
  
  FDSClientConfiguration withUnitTestMode(boolean paramBoolean)
  {
    enableUnitTestMode(paramBoolean);
    return this;
  }
  
  public FDSClientConfiguration withUploadPartSize(int paramInt)
  {
    setUploadPartSize(paramInt);
    return this;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/xiaomi/infra/galaxy/fds/android/FDSClientConfiguration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */