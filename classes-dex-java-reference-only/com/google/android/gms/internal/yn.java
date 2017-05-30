package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

@aaa
public class yn
{
  private final acy a;
  private final String b;
  
  public yn(acy paramacy)
  {
    this(paramacy, "");
  }
  
  public yn(acy paramacy, String paramString)
  {
    this.a = paramacy;
    this.b = paramString;
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject().put("x", paramInt1).put("y", paramInt2).put("width", paramInt3).put("height", paramInt4);
      this.a.b("onSizeChanged", localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      abr.b("Error occured while dispatching size change.", localJSONException);
    }
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject().put("width", paramInt1).put("height", paramInt2).put("maxSizeWidth", paramInt3).put("maxSizeHeight", paramInt4).put("density", paramFloat).put("rotation", paramInt5);
      this.a.b("onScreenInfoChanged", localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      abr.b("Error occured while obtaining screen information.", localJSONException);
    }
  }
  
  public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject().put("x", paramInt1).put("y", paramInt2).put("width", paramInt3).put("height", paramInt4);
      this.a.b("onDefaultPositionReceived", localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      abr.b("Error occured while dispatching default position.", localJSONException);
    }
  }
  
  public void b(String paramString)
  {
    try
    {
      paramString = new JSONObject().put("message", paramString).put("action", this.b);
      this.a.b("onError", paramString);
      return;
    }
    catch (JSONException paramString)
    {
      abr.b("Error occurred while dispatching error event.", paramString);
    }
  }
  
  public void c(String paramString)
  {
    try
    {
      paramString = new JSONObject().put("js", paramString);
      this.a.b("onReadyEventReceived", paramString);
      return;
    }
    catch (JSONException paramString)
    {
      abr.b("Error occured while dispatching ready Event.", paramString);
    }
  }
  
  public void d(String paramString)
  {
    try
    {
      paramString = new JSONObject().put("state", paramString);
      this.a.b("onStateChanged", paramString);
      return;
    }
    catch (JSONException paramString)
    {
      abr.b("Error occured while dispatching state change.", paramString);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/yn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */