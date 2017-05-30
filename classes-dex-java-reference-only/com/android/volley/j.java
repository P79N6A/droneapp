package com.android.volley;

import java.io.Serializable;
import java.util.Collections;
import java.util.Map;

public class j
  implements Serializable
{
  private static final long serialVersionUID = -20150728102000L;
  public final int a;
  public final byte[] b;
  public final Map<String, String> c;
  public final boolean d;
  public final long e;
  
  public j(int paramInt, byte[] paramArrayOfByte, Map<String, String> paramMap, boolean paramBoolean)
  {
    this(paramInt, paramArrayOfByte, paramMap, paramBoolean, 0L);
  }
  
  public j(int paramInt, byte[] paramArrayOfByte, Map<String, String> paramMap, boolean paramBoolean, long paramLong)
  {
    this.a = paramInt;
    this.b = paramArrayOfByte;
    this.c = paramMap;
    this.d = paramBoolean;
    this.e = paramLong;
  }
  
  public j(byte[] paramArrayOfByte)
  {
    this(200, paramArrayOfByte, Collections.emptyMap(), false, 0L);
  }
  
  public j(byte[] paramArrayOfByte, Map<String, String> paramMap)
  {
    this(200, paramArrayOfByte, paramMap, false, 0L);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/android/volley/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */