package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.hp;
import com.google.android.gms.internal.kt.a;
import java.util.List;

public class ConnectionConfig extends AbstractSafeParcelable {
    public static final b CREATOR = new b();
    final int a;
    final HostInfoParcelable b;
    final int c;
    final List<String> d;
    final boolean e;
    final String f;
    final String g;

    public ConnectionConfig(int i, HostInfoParcelable hostInfoParcelable, int i2, List<String> list, boolean z, String str, String str2) {
        this.a = i;
        this.b = hostInfoParcelable;
        this.c = i2;
        this.d = list;
        this.e = z;
        this.f = str;
        this.g = str2;
    }

    public ConnectionConfig(hp hpVar, a aVar, List<String> list, boolean z, String str, String str2) {
        int i;
        switch (aVar) {
            case DEBUG:
                i = 1;
                break;
            case INFO:
                i = 2;
                break;
            case WARN:
                i = 3;
                break;
            case ERROR:
                i = 4;
                break;
            default:
                i = 0;
                break;
        }
        this.a = 1;
        this.b = HostInfoParcelable.a(hpVar);
        this.c = i;
        this.d = list;
        this.e = z;
        this.f = str;
        this.g = str2;
    }

    public a a() {
        switch (this.c) {
            case 0:
                return a.NONE;
            case 1:
                return a.DEBUG;
            case 2:
                return a.INFO;
            case 3:
                return a.WARN;
            case 4:
                return a.ERROR;
            default:
                return a.NONE;
        }
    }

    public List<String> b() {
        return this.d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
