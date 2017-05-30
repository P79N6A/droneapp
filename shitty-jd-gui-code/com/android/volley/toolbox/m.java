package com.android.volley.toolbox;

import com.android.volley.j;
import com.android.volley.l;
import com.android.volley.p;
import com.android.volley.p.a;
import com.android.volley.p.b;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class m
  extends o<JSONArray>
{
  public m(int paramInt, String paramString, p.b<JSONArray> paramb, p.a parama)
  {
    super(paramInt, paramString, null, paramb, parama);
  }
  
  public m(int paramInt, String paramString1, String paramString2, p.b<JSONArray> paramb, p.a parama)
  {
    super(paramInt, paramString1, paramString2, paramb, parama);
  }
  
  public m(int paramInt, String paramString, JSONArray paramJSONArray, p.b<JSONArray> paramb, p.a parama) {}
  
  public m(int paramInt, String paramString, JSONObject paramJSONObject, p.b<JSONArray> paramb, p.a parama) {}
  
  public m(String paramString, p.b<JSONArray> paramb, p.a parama)
  {
    super(0, paramString, null, paramb, parama);
  }
  
  public m(String paramString, JSONArray paramJSONArray, p.b<JSONArray> paramb, p.a parama) {}
  
  public m(String paramString, JSONObject paramJSONObject, p.b<JSONArray> paramb, p.a parama) {}
  
  protected p<JSONArray> a(j paramj)
  {
    try
    {
      paramj = p.a(new JSONArray(new String(paramj.b, h.a(paramj.c, "utf-8"))), h.a(paramj));
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


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/android/volley/toolbox/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */