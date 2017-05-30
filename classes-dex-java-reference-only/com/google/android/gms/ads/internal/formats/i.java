package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

public abstract interface i
{
  public abstract void a();
  
  public abstract void a(MotionEvent paramMotionEvent);
  
  public abstract void a(View paramView);
  
  public abstract void a(View paramView, String paramString, JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3);
  
  public abstract void a(View paramView, Map<String, WeakReference<View>> paramMap);
  
  public abstract void a(View paramView, Map<String, WeakReference<View>> paramMap, JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3);
  
  public abstract void b(View paramView);
  
  public abstract View e();
  
  public abstract Context f();
  
  public static abstract interface a
  {
    public abstract void a(i parami);
    
    public abstract String k();
    
    public abstract String l();
    
    public abstract a m();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/formats/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */