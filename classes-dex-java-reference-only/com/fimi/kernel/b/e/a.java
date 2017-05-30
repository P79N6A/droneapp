package com.fimi.kernel.b.e;

import com.android.volley.j;
import com.android.volley.n;
import com.android.volley.p;
import com.android.volley.toolbox.h;
import com.fimi.kernel.b.e;
import com.google.gson.Gson;
import java.io.UnsupportedEncodingException;
import java.util.Map;

class a<T>
  extends n<T>
{
  private Map<String, String> a;
  private e<T> b;
  private Class<?> c;
  private Gson d = new Gson();
  
  public a(int paramInt, String paramString, Map<String, String> paramMap, e<T> parame, Class<?> paramClass)
  {
    super(paramInt, paramString, null);
    this.b = parame;
    this.a = paramMap;
    this.c = paramClass;
  }
  
  protected p<T> a(j paramj)
  {
    try
    {
      String str = new String(paramj.b, h.a(paramj.c));
      paramj = p.a(this.d.fromJson(str, this.c), h.a(paramj));
      return paramj;
    }
    catch (UnsupportedEncodingException paramj)
    {
      paramj.printStackTrace();
    }
    return null;
  }
  
  protected void b(T paramT)
  {
    if (this.b != null) {
      this.b.a(paramT);
    }
  }
  
  protected Map<String, String> s()
  {
    return this.a;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/b/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */