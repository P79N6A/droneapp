package com.google.android.gms.games.video;

import android.content.Intent;
import com.google.android.gms.common.api.m;

public interface f {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;

    public interface a extends m {
        boolean b();
    }

    public interface b extends m {
        VideoCapabilities b();
    }

    public interface e extends m {
        a b();
    }

    public interface f extends m {
    }

    public interface g extends m {
    }

    public interface h extends m {
    }

    public interface i extends m {
        String b();
    }

    public interface j extends m {
    }

    public interface c {
        void a(int i);
    }

    public interface d {
        void a(int i);
    }

    com.google.android.gms.common.api.i<b> a(com.google.android.gms.common.api.g gVar);

    com.google.android.gms.common.api.i<a> a(com.google.android.gms.common.api.g gVar, int i);

    void a(com.google.android.gms.common.api.g gVar, c cVar);

    Intent b(com.google.android.gms.common.api.g gVar);

    com.google.android.gms.common.api.i<e> c(com.google.android.gms.common.api.g gVar);

    boolean d(com.google.android.gms.common.api.g gVar);

    void e(com.google.android.gms.common.api.g gVar);
}
