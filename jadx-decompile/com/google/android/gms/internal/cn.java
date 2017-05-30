package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.common.internal.d;

public class cn implements aqe {
    private Context a;
    private DisplayMetrics b = new DisplayMetrics();

    public cn(Context context) {
        this.a = context;
    }

    public ea<?> a_(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        if (eaVarArr.length != 0) {
            z = false;
        }
        d.b(z);
        ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay().getMetrics(this.b);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b.widthPixels);
        stringBuilder.append("x");
        stringBuilder.append(this.b.heightPixels);
        return new ej(stringBuilder.toString());
    }
}
