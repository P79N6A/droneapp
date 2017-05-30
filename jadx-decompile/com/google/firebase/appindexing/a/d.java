package com.google.firebase.appindexing.a;

import android.support.annotation.NonNull;

public final class d extends e<d> {
    public static final String a = "ReadPermission";
    public static final String b = "WritePermission";
    public static final String c = "CommentPermission";

    d() {
        super("DigitalDocumentPermission");
    }

    public d a(@NonNull String str) {
        return (d) put("permissionType", str);
    }

    public d a(@NonNull l... lVarArr) {
        return (d) a("grantee", (e[]) lVarArr);
    }
}
