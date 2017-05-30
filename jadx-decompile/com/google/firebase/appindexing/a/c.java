package com.google.firebase.appindexing.a;

import android.support.annotation.NonNull;
import java.util.Date;

public final class c extends e<c> {
    c() {
        super("DigitalDocument");
    }

    c(String str) {
        super(str);
    }

    public c a(@NonNull String str) {
        return (c) put("text", str);
    }

    public c a(@NonNull Date date) {
        return (c) put("dateCreated", date.getTime());
    }

    public c a(@NonNull d... dVarArr) {
        return (c) a("hasDigitalDocumentPermission", (e[]) dVarArr);
    }

    public c a(@NonNull l... lVarArr) {
        return (c) a("author", (e[]) lVarArr);
    }

    public c b(@NonNull Date date) {
        return (c) put("dateModified", date.getTime());
    }
}
