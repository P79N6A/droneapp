package com.fimi.soul.module.a.a.a.b;

import android.content.Context;
import com.fimi.soul.module.a.a.a.i;
import com.fimi.soul.module.a.a.a.j;
import com.mob.tools.utils.R;
import com.tencent.open.yyb.TitleBar;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class c extends j {
    private static final int k = 720;
    private static final int l = 1;
    private static final int m = 76;
    private static final int n = 20;
    private static final int o = 12;
    private static final int p = 4;

    public c(i iVar, ArrayList<Object> arrayList) {
        super(iVar, arrayList);
    }

    protected void a(Context context, ArrayList<Object> arrayList) {
        int i = 1;
        int screenWidth = R.getScreenWidth(context);
        this.g = 4;
        float f = ((float) screenWidth) / 720.0f;
        this.h = (int) (1.0f * f);
        if (this.h >= 1) {
            i = this.h;
        }
        this.h = i;
        this.j = (int) (76.0f * f);
        this.i = (int) (TitleBar.BACKBTN_LEFT_MARGIN * f);
        this.d = (int) (52.0f * f);
        this.f = (screenWidth - (this.h * 3)) / 4;
        if (arrayList.size() <= this.g) {
            this.e = this.f + this.h;
        } else if (arrayList.size() <= 12 - this.g) {
            this.e = (this.f + this.h) * 2;
        } else {
            this.e = (this.f + this.h) * 3;
        }
    }

    protected void a(ArrayList<Object> arrayList) {
        int i;
        int size = arrayList.size();
        if (size < 12) {
            i = size / this.g;
            if (size % this.g != 0) {
                i++;
            }
            this.c = (Object[][]) Array.newInstance(Object.class, new int[]{1, i * this.g});
        } else {
            i = size / 12;
            if (size % 12 != 0) {
                i++;
            }
            this.c = (Object[][]) Array.newInstance(Object.class, new int[]{i, 12});
        }
        for (i = 0; i < size; i++) {
            int i2 = i / 12;
            this.c[i2][i - (i2 * 12)] = arrayList.get(i);
        }
    }
}
