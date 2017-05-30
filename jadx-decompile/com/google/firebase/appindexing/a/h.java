package com.google.firebase.appindexing.a;

import android.support.annotation.NonNull;

public final class h extends e<h> {
    h() {
        super("MusicAlbum");
    }

    public h a(int i) {
        return (h) put("numTracks", (long) i);
    }

    public h a(@NonNull i iVar) {
        return (h) a("byArtist", iVar);
    }

    public h a(@NonNull k... kVarArr) {
        return (h) a("track", (e[]) kVarArr);
    }
}
