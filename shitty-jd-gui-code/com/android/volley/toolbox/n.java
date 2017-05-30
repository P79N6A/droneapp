package com.android.volley.toolbox;

import com.android.volley.j;
import com.android.volley.l;
import com.android.volley.p;
import com.android.volley.p.a;
import com.android.volley.p.b;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

public class n
  extends o<JSONObject>
{
  public n(int paramInt, String paramString, p.b<JSONObject> paramb, p.a parama)
  {
    super(paramInt, paramString, null, paramb, parama);
  }
  
  public n(int paramInt, String paramString1, String paramString2, p.b<JSONObject> paramb, p.a parama)
  {
    super(paramInt, paramString1, paramString2, paramb, parama);
  }
  
  public n(int paramInt, String paramString, JSONObject paramJSONObject, p.b<JSONObject> paramb, p.a parama) {}
  
  public n(String paramString, p.b<JSONObject> paramb, p.a parama)
  {
    super(0, paramString, null, paramb, parama);
  }
  
  public n(String paramString, JSONObject paramJSONObject, p.b<JSONObject> paramb, p.a parama) {}
  
  protected p<JSONObject> a(j paramj)
  {
    try
    {
      paramj = p.a(new JSONObject(new String(paramj.b, h.a(paramj.c, "utf-8"))), h.a(paramj));
      return paramj;
    }
    catch (UnsupportedEncodingException paramj)
    {
      return p.a(new l(paramj));
    }
    catch (JSONException paramj) {}
    return p.a(new l(paramj));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/android/volley/toolbox/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */