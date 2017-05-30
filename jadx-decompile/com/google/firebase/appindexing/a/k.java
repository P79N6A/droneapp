package com.google.firebase.appindexing.a;

import android.support.annotation.NonNull;

public final class k extends e<k> {
    k() {
        super("MusicRecording");
    }

    public k a(int i) {
        return (k) put("duration", (long) i);
    }

    public k a(@NonNull h hVar) {
        return (k) a("inAlbum", hVar);
    }

    public k a(@NonNull i iVar) {
        return (k) a("byArtist", iVar);
    }

    public k a(@NonNull j... jVarArr) {
        return (k) a("inPlaylist", (e[]) jVarArr);
    }
}
