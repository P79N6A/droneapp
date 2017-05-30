package com.google.android.gms.gass.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.p.c;
import com.google.android.gms.gass.internal.e.a;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;

public class b extends p<e> {
    public b(Context context, Looper looper, com.google.android.gms.common.internal.p.b bVar, c cVar) {
        super(context, looper, Opcodes.INEG, bVar, cVar, null);
    }

    protected e a(IBinder iBinder) {
        return a.a(iBinder);
    }

    protected String a() {
        return "com.google.android.gms.gass.START";
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    public e h() {
        return (e) super.G();
    }
}
