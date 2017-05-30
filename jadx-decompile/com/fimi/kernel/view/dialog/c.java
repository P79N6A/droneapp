package com.fimi.kernel.view.dialog;

import android.app.Dialog;
import android.content.Context;

public interface c {
    public static final int a = -1;
    public static final int b = -2;

    Dialog a(Context context, int i, String str, String str2, a aVar);

    Dialog a(Context context, String str, int i, String str2, String str3, a aVar);

    Dialog a(Context context, String str, String str2, a aVar);

    Dialog a(Context context, String str, String str2, String str3, Boolean bool, String str4, a aVar);

    Dialog b(Context context, String str, String str2, a aVar);
}
