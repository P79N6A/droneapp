package com.fimi.soul.module.a.a.a.a;

import android.content.Context;
import com.fimi.soul.module.a.a.a.i;
import com.fimi.soul.module.a.a.a.j;
import com.mob.tools.utils.R;
import com.tencent.open.yyb.TitleBar;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class c extends j {
    private static final int k = 1280;
    private static final int l = 160;
    private static final int m = 1;
    private static final int n = 76;
    private static final int o = 20;

    public c(i iVar, ArrayList<Object> arrayList) {
        super(iVar, arrayList);
    }

    protected void a(Context context, ArrayList<Object> arrayList) {
        int i = 1;
        int screenWidth = R.getScreenWidth(context);
        float f = ((float) screenWidth) / 1280.0f;
        this.g = screenWidth / ((int) (160.0f * f));
        this.h = (int) (1.0f * f);
        if (this.h >= 1) {
            i = this.h;
        }
        this.h = i;
        this.j = (int) (76.0f * f);
        this.i = (int) (TitleBar.BACKBTN_LEFT_MARGIN * f);
        this.d = (int) (52.0f * f);
        this.f = (screenWidth - (this.h * 3)) / (this.g - 1);
        this.e = this.f + this.h;
    }

    protected void a(ArrayList<Object> arrayList) {
        int i;
        int size = arrayList.size();
        if (size < this.g) {
            i = size / this.g;
            if (size % this.g != 0) {
                i++;
            }
            this.c = (Object[][]) Array.newInstance(Object.class, new int[]{1, i * this.g});
        } else {
            i = size / this.g;
            if (size % this.g != 0) {
                i++;
            }
            this.c = (Object[][]) Array.newInstance(Object.class, new int[]{i, this.g});
        }
        for (i = 0; i < size; i++) {
            int i2 = i / this.g;
            this.c[i2][i - (i2 * this.g)] = arrayList.get(i);
        }
    }
}
