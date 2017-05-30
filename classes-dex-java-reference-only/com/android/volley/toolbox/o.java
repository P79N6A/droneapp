package com.android.volley.toolbox;

import com.android.volley.j;
import com.android.volley.n;
import com.android.volley.p;
import com.android.volley.p.a;
import com.android.volley.p.b;
import com.android.volley.v;
import java.io.UnsupportedEncodingException;

public abstract class o<T>
  extends n<T>
{
  protected static final String a = "utf-8";
  private static final String b = String.format("application/json; charset=%s", new Object[] { "utf-8" });
  private p.b<T> c;
  private final String d;
  
  public o(int paramInt, String paramString1, String paramString2, p.b<T> paramb, p.a parama)
  {
    super(paramInt, paramString1, parama);
    this.c = paramb;
    this.d = paramString2;
  }
  
  public o(String paramString1, String paramString2, p.b<T> paramb, p.a parama)
  {
    this(-1, paramString1, paramString2, paramb, parama);
  }
  
  protected abstract p<T> a(j paramj);
  
  protected void b(T paramT)
  {
    if (this.c != null) {
      this.c.a(paramT);
    }
  }
  
  protected void e()
  {
    super.e();
    this.c = null;
  }
  
  public String q()
  {
    return u();
  }
  
  public byte[] r()
  {
    return v();
  }
  
  public String u()
  {
    return b;
  }
  
  public byte[] v()
  {
    try
    {
      if (this.d == null) {
        return null;
      }
      byte[] arrayOfByte = this.d.getBytes("utf-8");
      return arrayOfByte;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      v.d("Unsupported Encoding while trying to get the bytes of %s using %s", new Object[] { this.d, "utf-8" });
    }
    return null;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/android/volley/toolbox/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */