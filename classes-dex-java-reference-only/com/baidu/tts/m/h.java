package com.baidu.tts.m;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.f.e;

public class h
  extends com.baidu.tts.n.a<h>
{
  private e a;
  private int b;
  private int c;
  private String d;
  private int e;
  private int f;
  private byte[] g;
  private com.baidu.tts.f.a h;
  private i i;
  private TtsError j;
  
  public static h a(i parami, TtsError paramTtsError)
  {
    parami = b(parami);
    parami.a(paramTtsError);
    return parami;
  }
  
  public static h b(TtsError paramTtsError)
  {
    h localh = new h();
    localh.a(paramTtsError);
    return localh;
  }
  
  public static h b(i parami)
  {
    h localh = new h();
    localh.a(parami);
    return localh;
  }
  
  public int a()
  {
    return this.c;
  }
  
  public void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  public void a(TtsError paramTtsError)
  {
    this.j = paramTtsError;
  }
  
  public void a(com.baidu.tts.f.a parama)
  {
    this.h = parama;
  }
  
  public void a(e parame)
  {
    this.a = parame;
  }
  
  public void a(i parami)
  {
    this.i = parami;
  }
  
  public void a(String paramString)
  {
    this.d = paramString;
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.g = paramArrayOfByte;
  }
  
  public int b()
  {
    return this.e;
  }
  
  public void b(int paramInt)
  {
    this.e = paramInt;
  }
  
  public int c()
  {
    return this.f;
  }
  
  public void c(int paramInt)
  {
    this.f = paramInt;
  }
  
  public void d(int paramInt)
  {
    this.b = paramInt;
  }
  
  public byte[] d()
  {
    return this.g;
  }
  
  public i e()
  {
    return this.i;
  }
  
  public TtsError f()
  {
    return this.j;
  }
  
  public e g()
  {
    return this.a;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/baidu/tts/m/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */