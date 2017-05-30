package com.fimi.kernel.b.e;

import com.android.volley.d;
import com.android.volley.o;
import com.android.volley.p.a;
import com.android.volley.p.b;
import com.android.volley.toolbox.n;
import com.android.volley.toolbox.s;
import com.android.volley.u;
import com.fimi.kernel.b.e;
import java.util.Map;
import org.json.JSONObject;

public class b
  implements com.fimi.kernel.b.a
{
  o a = null;
  
  private void a(int paramInt, String paramString, final e<String> parame)
  {
    paramString = new s(paramInt, paramString, new p.b()new p.a
    {
      public void a(String paramAnonymousString)
      {
        if (parame != null) {
          parame.a(paramAnonymousString);
        }
      }
    }, new p.a()
    {
      public void a(u paramAnonymousu)
      {
        parame.b(paramAnonymousu.getMessage());
      }
    });
    paramString.a(new d(3000, 1, 1.0F));
    this.a.a(paramString);
  }
  
  private <T> void a(int paramInt, String paramString, Map<String, String> paramMap, e<T> parame, Class<?> paramClass)
  {
    paramString = new a(paramInt, paramString, paramMap, parame, paramClass);
    this.a.a(paramString);
  }
  
  private void a(int paramInt, String paramString, JSONObject paramJSONObject, final e<JSONObject> parame)
  {
    paramString = new n(paramInt, paramString, paramJSONObject, new p.b()
    {
      public void a(JSONObject paramAnonymousJSONObject)
      {
        if (parame != null) {
          parame.a(paramAnonymousJSONObject);
        }
      }
    }, null);
    this.a.a(paramString);
  }
  
  public void a(String paramString, e<String> parame)
  {
    a(0, paramString, parame);
  }
  
  public <T> void a(String paramString, e<T> parame, Class<?> paramClass)
  {
    a(0, paramString, null, parame, paramClass);
  }
  
  public void a(String paramString, final Map<String, String> paramMap, final e<String> parame)
  {
    paramString = new s(1, paramString, new p.b()new p.a
    {
      public void a(String paramAnonymousString)
      {
        if (parame != null) {
          parame.a(paramAnonymousString);
        }
      }
    }, new p.a()
    {
      public void a(u paramAnonymousu)
      {
        parame.b(paramAnonymousu.getMessage());
      }
    })
    {
      protected Map<String, String> s()
      {
        return paramMap;
      }
    };
    this.a.a(paramString);
  }
  
  public <T> void a(String paramString, Map<String, String> paramMap, e<T> parame, Class<?> paramClass)
  {
    a(1, paramString, paramMap, parame, paramClass);
  }
  
  public void a(String paramString, JSONObject paramJSONObject, e<JSONObject> parame)
  {
    a(1, paramString, paramJSONObject, parame);
  }
  
  public void b(String paramString, e<String> parame)
  {
    a(1, paramString, parame);
  }
  
  public <T> void b(String paramString, e<T> parame, Class<?> paramClass)
  {
    a(1, paramString, null, parame, paramClass);
  }
  
  public void b(String paramString, JSONObject paramJSONObject, e<JSONObject> parame)
  {
    a(0, paramString, paramJSONObject, parame);
  }
  
  public void c(String paramString, e<JSONObject> parame)
  {
    a(1, paramString, null, parame);
  }
  
  public void d(String paramString, e<JSONObject> parame)
  {
    a(0, paramString, null, parame);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/b/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */