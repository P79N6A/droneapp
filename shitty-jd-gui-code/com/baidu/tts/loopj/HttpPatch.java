package com.baidu.tts.loopj;

import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

public final class HttpPatch
  extends HttpEntityEnclosingRequestBase
{
  public static final String METHOD_NAME = "PATCH";
  
  public HttpPatch() {}
  
  public HttpPatch(String paramString)
  {
    setURI(URI.create(paramString));
  }
  
  public HttpPatch(URI paramURI)
  {
    setURI(paramURI);
  }
  
  public String getMethod()
  {
    return "PATCH";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/baidu/tts/loopj/HttpPatch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */