package com.fimi.kernel.view;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;
import com.fimi.kernel.R;
import com.fimi.kernel.c;
import com.fimi.kernel.d;
import com.fimi.kernel.view.dialog.b;
import java.util.Calendar;

class a implements b {
    private b a;
    private ProgressDialog b;

    private Activity d() {
        return c.d();
    }

    public void a() {
        b("");
    }

    public void a(int i) {
        Toast.makeText(d(), d().getResources().getString(i), 0).show();
    }

    public void a(int i, int i2) {
        if (this.b != null) {
            this.b.setMax(i2);
            this.b.setProgress(i);
        }
    }

    public void a(OnDateSetListener onDateSetListener, Calendar calendar) {
        new DatePickerDialog(d(), onDateSetListener, calendar.get(1), calendar.get(2), calendar.get(5)).show();
    }

    public void a(OnTimeSetListener onTimeSetListener, Calendar calendar) {
        new TimePickerDialog(d(), onTimeSetListener, calendar.get(11), calendar.get(12), true).show();
    }

    public void a(String str) {
        Toast.makeText(d(), str, 0).show();
    }

    public void a(String str, OnClickListener onClickListener) {
        new Builder(d()).setTitle(c(R.string.message)).setMessage(str).setPositiveButton(c(R.string.confirm), onClickListener).show();
    }

    public Dialog b() {
        return this.b != null ? this.b : this.a != null ? this.a : null;
    }

    public void b(int i) {
        if (this.b != null) {
            this.b.setMax(100);
            this.b.setProgress(i);
        }
    }

    public void b(String str) {
        if (d() != null) {
            this.a = new b(d());
            this.a.setProgressStyle(0);
            this.a.a(str);
            this.a.setTitle(str);
            this.a.show();
        }
    }

    public void b(String str, OnClickListener onClickListener) {
        new Builder(d()).setTitle(c(R.string.message)).setMessage(str).setPositiveButton(c(R.string.confirm), onClickListener).setNegativeButton(c(R.string.cancel), onClickListener).show();
    }

    public CharSequence c(int i) {
        return d().getResources().getText(i);
    }

    public void c() {
        if (this.b != null) {
            this.b.dismiss();
        }
        if (this.a != null) {
            this.a.dismiss();
        }
    }

    public void c(String str) {
        this.b = new ProgressDialog(d());
        this.b.setProgressStyle(1);
        this.b.setMessage(str);
        this.b.setMax(d.a);
        this.b.setCancelable(false);
        this.b.show();
    }
}
