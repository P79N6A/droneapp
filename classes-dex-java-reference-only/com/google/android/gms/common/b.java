package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.util.s;
import com.google.android.gms.g.f;
import com.google.android.gms.internal.aik;
import com.google.android.gms.internal.ain;
import com.google.android.gms.internal.zzqv;
import com.google.android.gms.internal.zzqv.a;

public class b
  extends j
{
  public static final int a = j.c;
  public static final String b = "com.google.android.gms";
  private static final b e = new b();
  
  public static b a()
  {
    return e;
  }
  
  public int a(Context paramContext)
  {
    return super.a(paramContext);
  }
  
  public Dialog a(Activity paramActivity, int paramInt1, int paramInt2)
  {
    return a(paramActivity, paramInt1, paramInt2, null);
  }
  
  public Dialog a(Activity paramActivity, int paramInt1, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return a(paramActivity, paramInt1, u.a(paramActivity, a(paramActivity, paramInt1, "d"), paramInt2), paramOnCancelListener);
  }
  
  public Dialog a(Activity paramActivity, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    Object localObject = new ProgressBar(paramActivity, null, 16842874);
    ((ProgressBar)localObject).setIndeterminate(true);
    ((ProgressBar)localObject).setVisibility(0);
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramActivity);
    localBuilder.setView((View)localObject);
    localBuilder.setMessage(t.c(paramActivity, 18));
    localBuilder.setTitle(t.a(paramActivity, 18));
    localBuilder.setPositiveButton("", null);
    localObject = localBuilder.create();
    a(paramActivity, (Dialog)localObject, "GooglePlayServicesUpdatingDialog", paramOnCancelListener);
    return (Dialog)localObject;
  }
  
  @TargetApi(14)
  Dialog a(Context paramContext, int paramInt, u paramu, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    Object localObject2 = null;
    if (paramInt == 0) {
      return null;
    }
    int i = paramInt;
    if (com.google.android.gms.common.util.i.a(paramContext))
    {
      i = paramInt;
      if (paramInt == 2) {
        i = 42;
      }
    }
    Object localObject1 = localObject2;
    if (s.d())
    {
      TypedValue localTypedValue = new TypedValue();
      paramContext.getTheme().resolveAttribute(16843529, localTypedValue, true);
      localObject1 = localObject2;
      if ("Theme.Dialog.Alert".equals(paramContext.getResources().getResourceEntryName(localTypedValue.resourceId))) {
        localObject1 = new AlertDialog.Builder(paramContext, 5);
      }
    }
    localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = new AlertDialog.Builder(paramContext);
    }
    ((AlertDialog.Builder)localObject2).setMessage(t.c(paramContext, i));
    if (paramOnCancelListener != null) {
      ((AlertDialog.Builder)localObject2).setOnCancelListener(paramOnCancelListener);
    }
    paramOnCancelListener = t.e(paramContext, i);
    if (paramOnCancelListener != null) {
      ((AlertDialog.Builder)localObject2).setPositiveButton(paramOnCancelListener, paramu);
    }
    paramContext = t.a(paramContext, i);
    if (paramContext != null) {
      ((AlertDialog.Builder)localObject2).setTitle(paramContext);
    }
    return ((AlertDialog.Builder)localObject2).create();
  }
  
  @Nullable
  public PendingIntent a(Context paramContext, int paramInt1, int paramInt2)
  {
    return super.a(paramContext, paramInt1, paramInt2);
  }
  
  @Nullable
  public PendingIntent a(Context paramContext, int paramInt1, int paramInt2, @Nullable String paramString)
  {
    return super.a(paramContext, paramInt1, paramInt2, paramString);
  }
  
  @Nullable
  public Intent a(Context paramContext, int paramInt, @Nullable String paramString)
  {
    return super.a(paramContext, paramInt, paramString);
  }
  
  @MainThread
  public f<Void> a(Activity paramActivity)
  {
    d.b("makeGooglePlayServicesAvailable must be called from the main thread");
    int i = a(paramActivity);
    if (i == 0) {
      return com.google.android.gms.g.i.a(null);
    }
    paramActivity = ain.a(paramActivity);
    paramActivity.a(new ConnectionResult(i, null));
    return paramActivity.g();
  }
  
  @Nullable
  public zzqv a(Context paramContext, zzqv.a parama)
  {
    Object localObject = new IntentFilter("android.intent.action.PACKAGE_ADDED");
    ((IntentFilter)localObject).addDataScheme("package");
    zzqv localzzqv = new zzqv(parama);
    paramContext.registerReceiver(localzzqv, (IntentFilter)localObject);
    localzzqv.a(paramContext);
    localObject = localzzqv;
    if (!a(paramContext, "com.google.android.gms"))
    {
      parama.a();
      localzzqv.a();
      localObject = null;
    }
    return (zzqv)localObject;
  }
  
  @TargetApi(11)
  void a(Activity paramActivity, Dialog paramDialog, String paramString, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    try
    {
      bool = paramActivity instanceof FragmentActivity;
      if (bool)
      {
        paramActivity = ((FragmentActivity)paramActivity).getSupportFragmentManager();
        SupportErrorDialogFragment.a(paramDialog, paramOnCancelListener).show(paramActivity, paramString);
        return;
      }
    }
    catch (NoClassDefFoundError localNoClassDefFoundError)
    {
      for (;;)
      {
        boolean bool = false;
      }
      if (s.a())
      {
        paramActivity = paramActivity.getFragmentManager();
        ErrorDialogFragment.a(paramDialog, paramOnCancelListener).show(paramActivity, paramString);
        return;
      }
      throw new RuntimeException("This Activity does not support Fragments.");
    }
  }
  
  public void a(Context paramContext, int paramInt)
  {
    if (paramInt == 6) {
      Log.e("GoogleApiAvailability", "showErrorNotification(context, errorCode) is called for RESOLUTION_REQUIRED when showErrorNotification(context, result) should be called");
    }
    if (a(paramInt)) {
      e.a(paramInt, paramContext);
    }
  }
  
  public void a(Context paramContext, ConnectionResult paramConnectionResult)
  {
    PendingIntent localPendingIntent = b(paramContext, paramConnectionResult);
    if (localPendingIntent != null) {
      e.a(paramConnectionResult.c(), paramContext, localPendingIntent);
    }
  }
  
  public void a(Context paramContext, ConnectionResult paramConnectionResult, int paramInt)
  {
    PendingIntent localPendingIntent = b(paramContext, paramConnectionResult);
    if (localPendingIntent != null) {
      e.a(paramConnectionResult.c(), paramContext, GoogleApiActivity.a(paramContext, localPendingIntent, paramInt));
    }
  }
  
  public final boolean a(int paramInt)
  {
    return super.a(paramInt);
  }
  
  public boolean a(Activity paramActivity, @NonNull aik paramaik, int paramInt1, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    paramaik = a(paramActivity, paramInt1, u.a(paramaik, a(paramActivity, paramInt1, "d"), paramInt2), paramOnCancelListener);
    if (paramaik == null) {
      return false;
    }
    a(paramActivity, paramaik, "GooglePlayServicesErrorDialog", paramOnCancelListener);
    return true;
  }
  
  @Nullable
  public PendingIntent b(Context paramContext, ConnectionResult paramConnectionResult)
  {
    if (paramConnectionResult.a()) {
      return paramConnectionResult.d();
    }
    int j = paramConnectionResult.c();
    int i = j;
    if (com.google.android.gms.common.util.i.a(paramContext))
    {
      i = j;
      if (j == 2) {
        i = 42;
      }
    }
    return a(paramContext, i, 0);
  }
  
  @Deprecated
  @Nullable
  public Intent b(int paramInt)
  {
    return super.b(paramInt);
  }
  
  @Nullable
  public String b(Context paramContext)
  {
    return super.b(paramContext);
  }
  
  public boolean b(Activity paramActivity, int paramInt1, int paramInt2)
  {
    return b(paramActivity, paramInt1, paramInt2, null);
  }
  
  public boolean b(Activity paramActivity, int paramInt1, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    Dialog localDialog = a(paramActivity, paramInt1, paramInt2, paramOnCancelListener);
    if (localDialog == null) {
      return false;
    }
    a(paramActivity, localDialog, "GooglePlayServicesErrorDialog", paramOnCancelListener);
    return true;
  }
  
  public boolean b(Context paramContext, int paramInt)
  {
    return super.b(paramContext, paramInt);
  }
  
  public int c(Context paramContext)
  {
    return super.c(paramContext);
  }
  
  public final String c(int paramInt)
  {
    return super.c(paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */