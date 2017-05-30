package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.lang.reflect.Field;

public abstract class DowngradeableSafeParcel
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  private static final Object a = new Object();
  private static ClassLoader b = null;
  private static Integer c = null;
  private boolean d = false;
  
  private static boolean a(Class<?> paramClass)
  {
    try
    {
      boolean bool = "SAFE_PARCELABLE_NULL_STRING".equals(paramClass.getField("NULL").get(null));
      return bool;
    }
    catch (IllegalAccessException paramClass)
    {
      return false;
    }
    catch (NoSuchFieldException paramClass) {}
    return false;
  }
  
  protected static boolean a_(String paramString)
  {
    ClassLoader localClassLoader = k_();
    if (localClassLoader == null) {
      return true;
    }
    try
    {
      boolean bool = a(localClassLoader.loadClass(paramString));
      return bool;
    }
    catch (Exception paramString) {}
    return false;
  }
  
  protected static ClassLoader k_()
  {
    synchronized (a)
    {
      return null;
    }
  }
  
  protected static Integer l_()
  {
    synchronized (a)
    {
      return null;
    }
  }
  
  protected boolean m_()
  {
    return false;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/internal/DowngradeableSafeParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */