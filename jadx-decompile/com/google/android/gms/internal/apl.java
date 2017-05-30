package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.google.android.gms.R;

public class apl {
    private final Context a;
    private final Context b;
    private final Intent c;
    private final apx d;

    public apl(Intent intent, Context context, Context context2, apx com_google_android_gms_internal_apx) {
        this.a = context;
        this.b = context2;
        this.c = intent;
        this.d = com_google_android_gms_internal_apx;
    }

    private void a(String str, String str2, String str3) {
        AlertDialog create = new Builder(this.a).create();
        create.setTitle(str);
        create.setMessage(str2);
        create.setButton(-1, str3, new OnClickListener(this) {
            final /* synthetic */ apl a;

            {
                this.a = r1;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                String packageName = this.a.a.getPackageName();
                Intent launchIntentForPackage = this.a.a.getPackageManager().getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage != null) {
                    String str = "Invoke the launch activity for package name: ";
                    packageName = String.valueOf(packageName);
                    aph.c(packageName.length() != 0 ? str.concat(packageName) : new String(str));
                    this.a.a.startActivity(launchIntentForPackage);
                    return;
                }
                String str2 = "No launch activity found for package name: ";
                packageName = String.valueOf(packageName);
                aph.b(packageName.length() != 0 ? str2.concat(packageName) : new String(str2));
            }
        });
        create.show();
    }

    public void a() {
        try {
            this.d.a(this.c.getData());
            a(this.b.getResources().getString(R.string.tagmanager_preview_dialog_title), this.b.getResources().getString(R.string.tagmanager_preview_dialog_message), this.b.getResources().getString(R.string.tagmanager_preview_dialog_button));
        } catch (Exception e) {
            String str = "Calling preview threw an exception: ";
            String valueOf = String.valueOf(e.getMessage());
            aph.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }
}
