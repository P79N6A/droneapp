package com.google.firebase.appindexing;

import android.support.annotation.NonNull;

public class e extends c {
    public e() {
        super("Too many Indexables provided. Try splitting them in batches.");
    }

    public e(@NonNull String str) {
        super(str);
    }

    public e(@NonNull String str, Throwable th) {
        super(str, th);
    }
}
