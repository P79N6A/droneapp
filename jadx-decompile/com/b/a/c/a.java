package com.b.a.c;

import java.io.File;

public final class a {
    private a() {
    }

    public static File a(String str, com.b.a.a.a.a aVar) {
        File a = aVar.a(str);
        return (a == null || !a.exists()) ? null : a;
    }

    public static boolean b(String str, com.b.a.a.a.a aVar) {
        File a = aVar.a(str);
        return a != null && a.exists() && a.delete();
    }
}
