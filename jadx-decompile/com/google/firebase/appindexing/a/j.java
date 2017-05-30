package com.google.firebase.appindexing.a;

import android.support.annotation.NonNull;

public class j extends e<j> {
    j() {
        super("MusicPlaylist");
    }

    public j a(int i) {
        return (j) put("numTracks", (long) i);
    }

    public j a(@NonNull k... kVarArr) {
        return (j) a("track", (e[]) kVarArr);
    }
}
