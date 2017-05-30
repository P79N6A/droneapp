package com.xiaomi.infra.galaxy.fds.android.auth;

import com.xiaomi.infra.galaxy.fds.android.util.Args;
import org.apache.http.client.methods.HttpRequestBase;

public class SSOCredential
  implements GalaxyFDSCredential
{
  private final String APP_ID = "appId";
  private final String HEADER_VALUE = "SSO";
  private final String SERVICE_TOKEN_PARAM = "serviceToken";
  private final String appId;
  private final String serviceToken;
  
  @Deprecated
  public SSOCredential(String paramString)
  {
    Args.notNull(paramString, "Service token");
    Args.notEmpty(paramString, "Service token");
    this.serviceToken = paramString;
    this.appId = null;
  }
  
  public SSOCredential(String paramString1, String paramString2)
  {
    Args.notNull(paramString1, "Service token");
    Args.notEmpty(paramString1, "Service token");
    Args.notNull(paramString2, "App id");
    Args.notEmpty(paramString2, "App id");
    this.serviceToken = paramString1;
    this.appId = paramString2;
  }
  
  public void addHeader(HttpRequestBase paramHttpRequestBase)
  {
    paramHttpRequestBase.addHeader("Authorization", "SSO");
  }
  
  public String addParam(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramString);
    if (paramString.indexOf('?') == -1) {
      localStringBuilder.append('?');
    }
    for (;;)
    {
      localStringBuilder.append("serviceToken");
      localStringBuilder.append('=');
      localStringBuilder.append(this.serviceToken);
      if (this.appId != null)
      {
        localStringBuilder.append('&');
        localStringBuilder.append("appId");
        localStringBuilder.append('=');
        localStringBuilder.append(this.appId);
      }
      return localStringBuilder.toString();
      localStringBuilder.append('&');
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/xiaomi/infra/galaxy/fds/android/auth/SSOCredential.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */