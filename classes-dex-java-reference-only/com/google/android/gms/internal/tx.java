package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import com.google.android.gms.common.internal.d;
import java.util.List;

@aaa
public class tx
{
  private final Context a;
  
  public tx(Context paramContext)
  {
    d.a(paramContext, "Context can not be null");
    this.a = paramContext;
  }
  
  public static boolean e()
  {
    return "mounted".equals(Environment.getExternalStorageState());
  }
  
  public boolean a()
  {
    Intent localIntent = new Intent("android.intent.action.DIAL");
    localIntent.setData(Uri.parse("tel:"));
    return a(localIntent);
  }
  
  public boolean a(Intent paramIntent)
  {
    boolean bool = false;
    d.a(paramIntent, "Intent can not be null");
    if (!this.a.getPackageManager().queryIntentActivities(paramIntent, 0).isEmpty()) {
      bool = true;
    }
    return bool;
  }
  
  public boolean b()
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(Uri.parse("sms:"));
    return a(localIntent);
  }
  
  public boolean c()
  {
    return (e()) && (this.a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0);
  }
  
  public boolean d()
  {
    return true;
  }
  
  @TargetApi(14)
  public boolean f()
  {
    Intent localIntent = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event");
    return (Build.VERSION.SDK_INT >= 14) && (a(localIntent));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/tx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */