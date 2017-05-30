package com.fimi.soul.module.droneui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import com.fimi.overseas.soul.R;

public class c {
    public static ProgressDialog a(Context context, int i) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.onWindowFocusChanged(false);
        progressDialog.setCancelable(false);
        progressDialog.setProgressStyle(1);
        progressDialog.setTitle(context.getResources().getString(R.string.updatetitle));
        progressDialog.setMax(i);
        progressDialog.setCancelable(true);
        progressDialog.setCanceledOnTouchOutside(false);
        if (!((Activity) context).isFinishing()) {
            progressDialog.show();
        }
        return progressDialog;
    }

    public static ProgressDialog a(Context context, int i, int i2) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.onWindowFocusChanged(false);
        progressDialog.setCancelable(false);
        progressDialog.setProgressStyle(1);
        progressDialog.setTitle(context.getResources().getString(R.string.updatetitle));
        progressDialog.setMax(i2);
        progressDialog.setCancelable(true);
        progressDialog.setCanceledOnTouchOutside(false);
        if (!((Activity) context).isFinishing()) {
            progressDialog.show();
        }
        return progressDialog;
    }
}
