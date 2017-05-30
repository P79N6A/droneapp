package com.google.android.gms.safetynet;

import android.content.Context;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import java.util.List;

public interface c {

    public interface a extends m {
        String b();
    }

    public interface c extends m {
    }

    public interface b extends m {
        String b();

        List<a> c();
    }

    public interface d extends m {
    }

    i<d> a(g gVar);

    i<b> a(g gVar, String str, int... iArr);

    i<b> a(g gVar, List<Integer> list, String str);

    i<a> a(g gVar, byte[] bArr);

    boolean a(Context context);

    boolean a(String str, int... iArr);

    i<c> b(g gVar);
}
