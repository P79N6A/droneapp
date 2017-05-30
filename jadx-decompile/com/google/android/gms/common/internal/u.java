package com.google.android.gms.common.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.util.Log;
import com.google.android.gms.internal.aik;

public abstract class u implements OnClickListener {

    class AnonymousClass1 extends u {
        final /* synthetic */ Intent a;
        final /* synthetic */ Activity b;
        final /* synthetic */ int c;

        AnonymousClass1(Intent intent, Activity activity, int i) {
            this.a = intent;
            this.b = activity;
            this.c = i;
        }

        public void a() {
            if (this.a != null) {
                this.b.startActivityForResult(this.a, this.c);
            }
        }
    }

    class AnonymousClass2 extends u {
        final /* synthetic */ Intent a;
        final /* synthetic */ Fragment b;
        final /* synthetic */ int c;

        AnonymousClass2(Intent intent, Fragment fragment, int i) {
            this.a = intent;
            this.b = fragment;
            this.c = i;
        }

        public void a() {
            if (this.a != null) {
                this.b.startActivityForResult(this.a, this.c);
            }
        }
    }

    class AnonymousClass3 extends u {
        final /* synthetic */ Intent a;
        final /* synthetic */ aik b;
        final /* synthetic */ int c;

        AnonymousClass3(Intent intent, aik com_google_android_gms_internal_aik, int i) {
            this.a = intent;
            this.b = com_google_android_gms_internal_aik;
            this.c = i;
        }

        @TargetApi(11)
        public void a() {
            if (this.a != null) {
                this.b.startActivityForResult(this.a, this.c);
            }
        }
    }

    public static u a(Activity activity, Intent intent, int i) {
        return new AnonymousClass1(intent, activity, i);
    }

    public static u a(@NonNull Fragment fragment, Intent intent, int i) {
        return new AnonymousClass2(intent, fragment, i);
    }

    public static u a(@NonNull aik com_google_android_gms_internal_aik, Intent intent, int i) {
        return new AnonymousClass3(intent, com_google_android_gms_internal_aik, i);
    }

    public abstract void a();

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            a();
            dialogInterface.dismiss();
        } catch (Throwable e) {
            Log.e("DialogRedirect", "Can't redirect to app settings for Google Play services", e);
        }
    }
}
