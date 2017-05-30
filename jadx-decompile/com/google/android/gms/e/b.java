package com.google.android.gms.e;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;

public interface b {

    public interface a extends m {
        Intent b();
    }

    i<a> a(g gVar, Uri uri);

    i<a> b(g gVar, Uri uri);
}
