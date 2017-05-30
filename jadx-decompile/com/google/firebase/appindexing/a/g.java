package com.google.firebase.appindexing.a;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.d;
import java.util.Date;

public final class g extends e<g> {
    g() {
        super("Message");
    }

    g(String str) {
        super(str);
    }

    public g a(@NonNull l lVar) {
        return (g) a("sender", lVar);
    }

    public g a(@NonNull String str) {
        return (g) put("text", str);
    }

    public g a(@NonNull Date date) {
        d.a(date);
        return (g) put("dateSent", date.getTime());
    }

    public g a(@NonNull b... bVarArr) {
        return (g) a("isPartOf", (e[]) bVarArr);
    }

    public g a(@NonNull c... cVarArr) {
        return (g) a("messageAttachment", (e[]) cVarArr);
    }

    public g a(@NonNull l... lVarArr) {
        return (g) a("recipient", (e[]) lVarArr);
    }

    public g b(@NonNull Date date) {
        d.a(date);
        return (g) put("dateReceived", date.getTime());
    }

    public g c(@NonNull Date date) {
        d.a(date);
        return (g) put("dateRead", date.getTime());
    }
}
