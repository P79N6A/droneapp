package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.internal.ae;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.ajo;
import com.google.android.gms.internal.ajp;
import java.util.Iterator;
import java.util.Set;

public class m
{
  private static m a;
  private final Context b;
  
  private m(Context paramContext)
  {
    this.b = paramContext.getApplicationContext();
  }
  
  public static m a(Context paramContext)
  {
    d.a(paramContext);
    try
    {
      if (a == null)
      {
        k.a(paramContext);
        a = new m(paramContext);
      }
      return a;
    }
    finally {}
  }
  
  private boolean b(PackageInfo paramPackageInfo, boolean paramBoolean)
  {
    if (paramPackageInfo.signatures.length != 1)
    {
      Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
      return false;
    }
    k.b localb = new k.b(paramPackageInfo.signatures[0].toByteArray());
    if (paramBoolean) {}
    for (paramPackageInfo = k.a();; paramPackageInfo = k.b())
    {
      paramPackageInfo = paramPackageInfo.iterator();
      do
      {
        if (!paramPackageInfo.hasNext()) {
          break;
        }
      } while (!localb.equals((ae)paramPackageInfo.next()));
      return true;
    }
    return false;
  }
  
  k.a a(PackageInfo paramPackageInfo, k.a... paramVarArgs)
  {
    int i = 0;
    if (paramPackageInfo.signatures == null) {
      return null;
    }
    if (paramPackageInfo.signatures.length != 1)
    {
      Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
      return null;
    }
    paramPackageInfo = new k.b(paramPackageInfo.signatures[0].toByteArray());
    while (i < paramVarArgs.length)
    {
      if (paramVarArgs[i].equals(paramPackageInfo)) {
        return paramVarArgs[i];
      }
      i += 1;
    }
    return null;
  }
  
  public boolean a(PackageInfo paramPackageInfo, boolean paramBoolean)
  {
    if ((paramPackageInfo != null) && (paramPackageInfo.signatures != null))
    {
      if (paramBoolean) {}
      for (paramPackageInfo = a(paramPackageInfo, k.d.a); paramPackageInfo != null; paramPackageInfo = a(paramPackageInfo, new k.a[] { k.d.a[0] })) {
        return true;
      }
    }
    return false;
  }
  
  public boolean a(PackageManager paramPackageManager, PackageInfo paramPackageInfo)
  {
    boolean bool1 = false;
    if (paramPackageInfo == null) {}
    boolean bool2;
    do
    {
      do
      {
        return bool1;
        if (l.h(this.b)) {
          return b(paramPackageInfo, true);
        }
        bool2 = b(paramPackageInfo, false);
        bool1 = bool2;
      } while (bool2);
      bool1 = bool2;
    } while (!b(paramPackageInfo, true));
    Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
    return bool2;
  }
  
  public boolean a(PackageManager paramPackageManager, String paramString)
  {
    try
    {
      paramString = ajp.b(this.b).b(paramString, 64);
      return a(paramPackageManager, paramString);
    }
    catch (PackageManager.NameNotFoundException paramPackageManager) {}
    return false;
  }
  
  public boolean b(PackageManager paramPackageManager, PackageInfo paramPackageInfo)
  {
    if (paramPackageInfo == null) {}
    do
    {
      return false;
      if (a(paramPackageInfo, false)) {
        return true;
      }
    } while (!a(paramPackageInfo, true));
    if (l.h(this.b)) {
      return true;
    }
    Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
    return false;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */