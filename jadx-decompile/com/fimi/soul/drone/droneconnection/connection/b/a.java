package com.fimi.soul.drone.droneconnection.connection.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.fimi.soul.drone.g.c;

public class a extends com.fimi.soul.drone.droneconnection.connection.a {
    private final b h;

    public a(Context context) {
        super(context);
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        this.h = new b(this) {
            final /* synthetic */ a h;

            protected int a() {
                return Integer.parseInt(defaultSharedPreferences.getString(c.i, c.k));
            }

            protected String b() {
                return defaultSharedPreferences.getString(c.j, c.b());
            }
        };
    }

    protected int a(byte[] bArr) {
        return this.h.b(bArr);
    }

    protected void a() {
        this.h.e();
    }

    protected void b() {
        this.h.d();
    }

    protected void d(byte[] bArr) {
        this.h.d(bArr);
    }

    public int j() {
        return this.h.j();
    }
}
