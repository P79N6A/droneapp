package com.google.firebase.appindexing.a;

import android.support.annotation.NonNull;

public final class i extends e<i> {
    i() {
        super("MusicGroup");
    }

    public i a(@NonNull String str) {
        return (i) put("genre", str);
    }

    public i a(@NonNull h... hVarArr) {
        return (i) a("album", (e[]) hVarArr);
    }

    public i a(@NonNull k... kVarArr) {
        return (i) a("track", (e[]) kVarArr);
    }
}
