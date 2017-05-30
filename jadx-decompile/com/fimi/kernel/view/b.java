package com.fimi.kernel.view;

import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.content.DialogInterface.OnClickListener;
import java.util.Calendar;

public interface b {
    void a();

    void a(int i);

    void a(int i, int i2);

    void a(OnDateSetListener onDateSetListener, Calendar calendar);

    void a(OnTimeSetListener onTimeSetListener, Calendar calendar);

    void a(String str);

    void a(String str, OnClickListener onClickListener);

    Dialog b();

    void b(int i);

    void b(String str);

    void b(String str, OnClickListener onClickListener);

    CharSequence c(int i);

    void c();

    void c(String str);
}
