package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentFilter;
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
import com.google.android.gms.common.util.i;
import com.google.android.gms.common.util.s;
import com.google.android.gms.g.f;
import com.google.android.gms.internal.aik;
import com.google.android.gms.internal.ain;
import com.google.android.gms.internal.zzqv;
import com.google.android.gms.internal.zzqv.a;

public class b extends j {
    public static final int a = j.c;
    public static final String b = "com.google.android.gms";
    private static final b e = new b();

    b() {
    }

    public static b a() {
        return e;
    }

    public int a(Context context) {
        return super.a(context);
    }

    public Dialog a(Activity activity, int i, int i2) {
        return a(activity, i, i2, null);
    }

    public Dialog a(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        return a((Context) activity, i, u.a(activity, a((Context) activity, i, "d"), i2), onCancelListener);
    }

    public Dialog a(Activity activity, OnCancelListener onCancelListener) {
        View progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        Builder builder = new Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(t.c(activity, 18));
        builder.setTitle(t.a((Context) activity, 18));
        builder.setPositiveButton("", null);
        Dialog create = builder.create();
        a(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    @TargetApi(14)
    Dialog a(Context context, int i, u uVar, OnCancelListener onCancelListener) {
        Builder builder = null;
        if (i == 0) {
            return null;
        }
        if (i.a(context) && i == 2) {
            i = 42;
        }
        if (s.d()) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16843529, typedValue, true);
            if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
                builder = new Builder(context, 5);
            }
        }
        if (builder == null) {
            builder = new Builder(context);
        }
        builder.setMessage(t.c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        CharSequence e = t.e(context, i);
        if (e != null) {
            builder.setPositiveButton(e, uVar);
        }
        e = t.a(context, i);
        if (e != null) {
            builder.setTitle(e);
        }
        return builder.create();
    }

    @Nullable
    public PendingIntent a(Context context, int i, int i2) {
        return super.a(context, i, i2);
    }

    @Nullable
    public PendingIntent a(Context context, int i, int i2, @Nullable String str) {
        return super.a(context, i, i2, str);
    }

    @Nullable
    public Intent a(Context context, int i, @Nullable String str) {
        return super.a(context, i, str);
    }

    @MainThread
    public f<Void> a(Activity activity) {
        d.b("makeGooglePlayServicesAvailable must be called from the main thread");
        int a = a((Context) activity);
        if (a == 0) {
            return com.google.android.gms.g.i.a(null);
        }
        ain a2 = ain.a(activity);
        a2.a(new ConnectionResult(a, null));
        return a2.g();
    }

    @Nullable
    public zzqv a(Context context, a aVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        BroadcastReceiver com_google_android_gms_internal_zzqv = new zzqv(aVar);
        context.registerReceiver(com_google_android_gms_internal_zzqv, intentFilter);
        com_google_android_gms_internal_zzqv.a(context);
        if (a(context, "com.google.android.gms")) {
            return com_google_android_gms_internal_zzqv;
        }
        aVar.a();
        com_google_android_gms_internal_zzqv.a();
        return null;
    }

    @TargetApi(11)
    void a(Activity activity, Dialog dialog, String str, OnCancelListener onCancelListener) {
        boolean z;
        try {
            z = activity instanceof FragmentActivity;
        } catch (NoClassDefFoundError e) {
            z = false;
        }
        if (z) {
            SupportErrorDialogFragment.a(dialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), str);
        } else if (s.a()) {
            ErrorDialogFragment.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
        } else {
            throw new RuntimeException("This Activity does not support Fragments.");
        }
    }

    public void a(Context context, int i) {
        if (i == 6) {
            Log.e("GoogleApiAvailability", "showErrorNotification(context, errorCode) is called for RESOLUTION_REQUIRED when showErrorNotification(context, result) should be called");
        }
        if (a(i)) {
            e.a(i, context);
        }
    }

    public void a(Context context, ConnectionResult connectionResult) {
        PendingIntent b = b(context, connectionResult);
        if (b != null) {
            e.a(connectionResult.c(), context, b);
        }
    }

    public void a(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent b = b(context, connectionResult);
        if (b != null) {
            e.a(connectionResult.c(), context, GoogleApiActivity.a(context, b, i));
        }
    }

    public final boolean a(int i) {
        return super.a(i);
    }

    public boolean a(Activity activity, @NonNull aik com_google_android_gms_internal_aik, int i, int i2, OnCancelListener onCancelListener) {
        Dialog a = a((Context) activity, i, u.a(com_google_android_gms_internal_aik, a((Context) activity, i, "d"), i2), onCancelListener);
        if (a == null) {
            return false;
        }
        a(activity, a, e.a, onCancelListener);
        return true;
    }

    @Nullable
    public PendingIntent b(Context context, ConnectionResult connectionResult) {
        if (connectionResult.a()) {
            return connectionResult.d();
        }
        int c = connectionResult.c();
        if (i.a(context) && c == 2) {
            c = 42;
        }
        return a(context, c, 0);
    }

    @Nullable
    @Deprecated
    public Intent b(int i) {
        return super.b(i);
    }

    @Nullable
    public String b(Context context) {
        return super.b(context);
    }

    public boolean b(Activity activity, int i, int i2) {
        return b(activity, i, i2, null);
    }

    public boolean b(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        Dialog a = a(activity, i, i2, onCancelListener);
        if (a == null) {
            return false;
        }
        a(activity, a, e.a, onCancelListener);
        return true;
    }

    public boolean b(Context context, int i) {
        return super.b(context, i);
    }

    public int c(Context context) {
        return super.c(context);
    }

    public final String c(int i) {
        return super.c(i);
    }
}
