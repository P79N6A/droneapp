package com.google.android.gms.internal;

public final class amk {
    private static amk a;
    private final amg b = new amg();
    private final amh c = new amh();

    static {
        a(new amk());
    }

    private amk() {
    }

    public static amg a() {
        return c().b;
    }

    protected static void a(amk com_google_android_gms_internal_amk) {
        synchronized (amk.class) {
            a = com_google_android_gms_internal_amk;
        }
    }

    public static amh b() {
        return c().c;
    }

    private static amk c() {
        amk com_google_android_gms_internal_amk;
        synchronized (amk.class) {
            com_google_android_gms_internal_amk = a;
        }
        return com_google_android_gms_internal_amk;
    }
}
