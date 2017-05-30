package com.google.android.gms.games.quest;

import android.content.Intent;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.m;

public interface f {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 101;
    public static final int f = 5;
    public static final int g = 102;
    public static final int h = 6;
    public static final int i = 103;
    public static final int[] j = new int[]{1, 2, 3, 4, 101, 5, 102, 6, 103};
    public static final int k = 0;
    public static final int l = 1;
    public static final String m = "quest";

    public interface a extends m {
        Quest c();
    }

    public interface b extends m {
        Milestone c();

        Quest d();
    }

    public interface c extends k, m {
        c c();
    }

    Intent a(g gVar, String str);

    Intent a(g gVar, int[] iArr);

    i<b> a(g gVar, String str, String str2);

    i<c> a(g gVar, boolean z, String... strArr);

    i<c> a(g gVar, int[] iArr, int i, boolean z);

    void a(g gVar);

    void a(g gVar, e eVar);

    i<a> b(g gVar, String str);

    void c(g gVar, String str);
}
