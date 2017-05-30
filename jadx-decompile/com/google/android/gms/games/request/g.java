package com.google.android.gms.games.request;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public interface g {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 0;
    public static final int i = 1;
    public static final String j = "requests";
    public static final int k = -1;
    public static final int l = 8;

    public interface a extends k, m {
    }

    public interface b extends k, m {
        a a(int i);
    }

    public interface c extends m {
    }

    public interface d extends k, m {
        int a(String str);

        Set<String> c();
    }

    Intent a(com.google.android.gms.common.api.g gVar, int i, byte[] bArr, int i2, Bitmap bitmap, String str);

    i<b> a(com.google.android.gms.common.api.g gVar, int i, int i2, int i3);

    i<d> a(com.google.android.gms.common.api.g gVar, String str);

    i<d> a(com.google.android.gms.common.api.g gVar, List<String> list);

    ArrayList<GameRequest> a(Intent intent);

    ArrayList<GameRequest> a(Bundle bundle);

    void a(com.google.android.gms.common.api.g gVar);

    void a(com.google.android.gms.common.api.g gVar, f fVar);

    Intent b(com.google.android.gms.common.api.g gVar);

    i<d> b(com.google.android.gms.common.api.g gVar, String str);

    i<d> b(com.google.android.gms.common.api.g gVar, List<String> list);

    int c(com.google.android.gms.common.api.g gVar);

    int d(com.google.android.gms.common.api.g gVar);
}
