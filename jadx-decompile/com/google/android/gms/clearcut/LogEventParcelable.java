package com.google.android.gms.clearcut;

import android.os.Parcel;
import com.google.android.gms.clearcut.b.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ri.d;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.Arrays;

public class LogEventParcelable extends AbstractSafeParcelable {
    public static final d CREATOR = new d();
    public final int a;
    public PlayLoggerContext b;
    public byte[] c;
    public int[] d;
    public String[] e;
    public int[] f;
    public byte[][] g;
    public boolean h;
    public final d i;
    public final c j;
    public final c k;

    LogEventParcelable(int i, PlayLoggerContext playLoggerContext, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z) {
        this.a = i;
        this.b = playLoggerContext;
        this.c = bArr;
        this.d = iArr;
        this.e = strArr;
        this.i = null;
        this.j = null;
        this.k = null;
        this.f = iArr2;
        this.g = bArr2;
        this.h = z;
    }

    public LogEventParcelable(PlayLoggerContext playLoggerContext, d dVar, c cVar, c cVar2, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr, boolean z) {
        this.a = 1;
        this.b = playLoggerContext;
        this.i = dVar;
        this.j = cVar;
        this.k = cVar2;
        this.d = iArr;
        this.e = strArr;
        this.f = iArr2;
        this.g = bArr;
        this.h = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogEventParcelable)) {
            return false;
        }
        LogEventParcelable logEventParcelable = (LogEventParcelable) obj;
        return this.a == logEventParcelable.a && com.google.android.gms.common.internal.c.a(this.b, logEventParcelable.b) && Arrays.equals(this.c, logEventParcelable.c) && Arrays.equals(this.d, logEventParcelable.d) && Arrays.equals(this.e, logEventParcelable.e) && com.google.android.gms.common.internal.c.a(this.i, logEventParcelable.i) && com.google.android.gms.common.internal.c.a(this.j, logEventParcelable.j) && com.google.android.gms.common.internal.c.a(this.k, logEventParcelable.k) && Arrays.equals(this.f, logEventParcelable.f) && Arrays.deepEquals(this.g, logEventParcelable.g) && this.h == logEventParcelable.h;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.c.a(Integer.valueOf(this.a), this.b, this.c, this.d, this.e, this.i, this.j, this.k, this.f, this.g, Boolean.valueOf(this.h));
    }

    public String toString() {
        return "LogEventParcelable[" + this.a + ", " + this.b + ", " + "LogEventBytes: " + (this.c == null ? null : new String(this.c)) + ", " + "TestCodes: " + Arrays.toString(this.d) + ", " + "MendelPackages: " + Arrays.toString(this.e) + ", " + "LogEvent: " + this.i + ", " + "ExtensionProducer: " + this.j + ", " + "VeProducer: " + this.k + ", " + "ExperimentIDs: " + Arrays.toString(this.f) + ", " + "ExperimentTokens: " + Arrays.toString(this.g) + ", " + "AddPhenotypeExperimentTokens: " + this.h + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
