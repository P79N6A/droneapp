package com.google.android.gms.common.internal;

import java.util.Iterator;

public class ak
{
  private final String a;
  
  private ak(String paramString)
  {
    this.a = paramString;
  }
  
  public static ak a(String paramString)
  {
    return new ak(paramString);
  }
  
  CharSequence a(Object paramObject)
  {
    if ((paramObject instanceof CharSequence)) {
      return (CharSequence)paramObject;
    }
    return paramObject.toString();
  }
  
  public final String a(Iterable<?> paramIterable)
  {
    return a(new StringBuilder(), paramIterable).toString();
  }
  
  public final StringBuilder a(StringBuilder paramStringBuilder, Iterable<?> paramIterable)
  {
    paramIterable = paramIterable.iterator();
    if (paramIterable.hasNext())
    {
      paramStringBuilder.append(a(paramIterable.next()));
      while (paramIterable.hasNext())
      {
        paramStringBuilder.append(this.a);
        paramStringBuilder.append(a(paramIterable.next()));
      }
    }
    return paramStringBuilder;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/internal/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */