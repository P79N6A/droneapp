package com.google.android.gms.games.multiplayer.turnbased;

import android.content.Intent;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.m;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import java.util.List;

public interface g {

    public interface a extends m {
        String b();
    }

    public interface b extends m {
        TurnBasedMatch c();
    }

    public interface c extends m {
        TurnBasedMatch c();
    }

    public interface d extends m {
        TurnBasedMatch c();
    }

    public interface e extends k, m {
        a c();
    }

    public interface f extends m {
        TurnBasedMatch c();
    }

    Intent a(com.google.android.gms.common.api.g gVar);

    Intent a(com.google.android.gms.common.api.g gVar, int i, int i2);

    Intent a(com.google.android.gms.common.api.g gVar, int i, int i2, boolean z);

    i<e> a(com.google.android.gms.common.api.g gVar, int i, int[] iArr);

    i<b> a(com.google.android.gms.common.api.g gVar, d dVar);

    i<b> a(com.google.android.gms.common.api.g gVar, String str);

    i<c> a(com.google.android.gms.common.api.g gVar, String str, String str2);

    i<f> a(com.google.android.gms.common.api.g gVar, String str, byte[] bArr, String str2);

    i<f> a(com.google.android.gms.common.api.g gVar, String str, byte[] bArr, String str2, List<ParticipantResult> list);

    i<f> a(com.google.android.gms.common.api.g gVar, String str, byte[] bArr, String str2, ParticipantResult... participantResultArr);

    i<f> a(com.google.android.gms.common.api.g gVar, String str, byte[] bArr, List<ParticipantResult> list);

    i<f> a(com.google.android.gms.common.api.g gVar, String str, byte[] bArr, ParticipantResult... participantResultArr);

    i<e> a(com.google.android.gms.common.api.g gVar, int[] iArr);

    void a(com.google.android.gms.common.api.g gVar, b bVar);

    i<b> b(com.google.android.gms.common.api.g gVar, String str);

    void b(com.google.android.gms.common.api.g gVar);

    int c(com.google.android.gms.common.api.g gVar);

    void c(com.google.android.gms.common.api.g gVar, String str);

    void d(com.google.android.gms.common.api.g gVar, String str);

    i<f> e(com.google.android.gms.common.api.g gVar, String str);

    i<c> f(com.google.android.gms.common.api.g gVar, String str);

    i<a> g(com.google.android.gms.common.api.g gVar, String str);

    void h(com.google.android.gms.common.api.g gVar, String str);

    i<d> i(com.google.android.gms.common.api.g gVar, String str);
}
