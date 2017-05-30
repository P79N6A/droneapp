package com.baidu.tts.p;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import com.baidu.android.common.util.CommonParam;
import com.baidu.tts.h.b.b;
import com.baidu.tts.jni.EmbeddedSynthesizerEngine;
import com.baidu.tts.tools.CommonUtility;
import org.json.JSONException;
import org.json.JSONObject;

public class a
{
  public static String a(Context paramContext)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("System", Build.VERSION.RELEASE);
      localJSONObject.put("SystemVersion", Build.VERSION.SDK + "");
      localJSONObject.put("PhoneModel", Build.MODEL);
      localJSONObject.put("CPU", Build.CPU_ABI);
      localJSONObject.put("NetworkType", CommonUtility.getNetworkInfo(paramContext));
      return localJSONObject.toString();
    }
    catch (JSONException paramContext)
    {
      for (;;)
      {
        paramContext.printStackTrace();
      }
    }
  }
  
  public static String b(Context paramContext)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("Cuid", CommonParam.getCUID(paramContext));
      localJSONObject.put("AppPackageName", paramContext.getPackageName());
      localJSONObject.put("SDKVersion", b.a().j());
      localJSONObject.put("soInfo", EmbeddedSynthesizerEngine.bdTTSGetEngineParam());
      return localJSONObject.toString();
    }
    catch (JSONException paramContext)
    {
      for (;;)
      {
        paramContext.printStackTrace();
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/baidu/tts/p/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */