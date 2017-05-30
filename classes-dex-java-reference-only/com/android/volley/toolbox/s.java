package com.android.volley.toolbox;

import com.android.volley.j;
import com.android.volley.n;
import com.android.volley.p;
import com.android.volley.p.a;
import com.android.volley.p.b;
import java.io.UnsupportedEncodingException;

public class s
  extends n<String>
{
  private p.b<String> a;
  
  public s(int paramInt, String paramString, p.b<String> paramb, p.a parama)
  {
    super(paramInt, paramString, parama);
    this.a = paramb;
  }
  
  public s(String paramString, p.b<String> paramb, p.a parama)
  {
    this(0, paramString, paramb, parama);
  }
  
  protected p<String> a(j paramj)
  {
    try
    {
      String str1 = new String(paramj.b, h.a(paramj.c));
      return p.a(str1, h.a(paramj));
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        String str2 = new String(paramj.b);
      }
    }
  }
  
  protected void d(String paramString)
  {
    if (this.a != null) {
      this.a.a(paramString);
    }
  }
  
  protected void e()
  {
    super.e();
    this.a = null;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/android/volley/toolbox/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */