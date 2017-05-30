package com.google.android.gms.games;

import android.content.Intent;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.m;

public interface n {
    public static final String a = "player_search_results";

    public interface a extends k, m {
        j c();
    }

    Intent a(g gVar, Player player);

    i<a> a(g gVar, int i);

    i<a> a(g gVar, int i, boolean z);

    i<a> a(g gVar, String str);

    i<a> a(g gVar, String str, boolean z);

    i<a> a(g gVar, boolean z);

    String a(g gVar);

    i<a> b(g gVar, int i);

    i<a> b(g gVar, int i, boolean z);

    Player b(g gVar);

    Intent c(g gVar);
}
