package com.google.android.gms.fitness.data;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

public class DataSource extends AbstractSafeParcelable {
    public static final Creator<DataSource> CREATOR = new n();
    public static final String a = "vnd.google.fitness.data_source";
    public static final int b = 0;
    public static final int c = 1;
    private static final int[] d = new int[0];
    private final int e;
    private final DataType f;
    private final String g;
    private final int h;
    private final Device i;
    private final Application j;
    private final String k;
    private final int[] l;
    private final String m;

    public static final class a {
        private DataType a;
        private int b = -1;
        private String c;
        private Device d;
        private Application e;
        private String f = "";

        public a a(int i) {
            this.b = i;
            return this;
        }

        public a a(Context context) {
            return b(context.getPackageName());
        }

        public a a(DataType dataType) {
            this.a = dataType;
            return this;
        }

        public a a(Device device) {
            this.d = device;
            return this;
        }

        public a a(String str) {
            this.c = str;
            return this;
        }

        public DataSource a() {
            boolean z = true;
            d.a(this.a != null, "Must set data type");
            if (this.b < 0) {
                z = false;
            }
            d.a(z, "Must set data source type");
            return new DataSource();
        }

        public a b(String str) {
            this.e = Application.a(str);
            return this;
        }

        public a c(String str) {
            d.b(str != null, "Must specify a valid stream name");
            this.f = str;
            return this;
        }
    }

    DataSource(int i, DataType dataType, String str, int i2, Device device, Application application, String str2, int[] iArr) {
        this.e = i;
        this.f = dataType;
        this.h = i2;
        this.g = str;
        this.i = device;
        this.j = application;
        this.k = str2;
        this.m = l();
        if (iArr == null) {
            iArr = d;
        }
        this.l = iArr;
    }

    private DataSource(a aVar) {
        this.e = 3;
        this.f = aVar.a;
        this.h = aVar.b;
        this.g = aVar.c;
        this.i = aVar.d;
        this.j = aVar.e;
        this.k = aVar.f;
        this.m = l();
        this.l = null;
    }

    public static DataSource a(Intent intent) {
        return intent == null ? null : (DataSource) c.a(intent, a, CREATOR);
    }

    public static String a(int i) {
        switch (i) {
            case 0:
                return "r";
            case 1:
                return "d";
            case 2:
                return "c";
            case 3:
                return "v";
            default:
                throw new IllegalArgumentException("invalid type value" + i);
        }
    }

    private boolean a(DataSource dataSource) {
        return this.m.equals(dataSource.m);
    }

    public static String b(int i) {
        switch (i) {
            case 1:
                return "blood_pressure_esh2002";
            case 2:
                return "blood_pressure_esh2010";
            case 3:
                return "blood_pressure_aami";
            case 4:
                return "blood_pressure_bhs_a_a";
            case 5:
                return "blood_pressure_bhs_a_b";
            case 6:
                return "blood_pressure_bhs_b_a";
            case 7:
                return "blood_pressure_bhs_b_b";
            case 8:
                return "blood_glucose_iso151972003";
            case 9:
                return "blood_glucose_iso151972013";
            default:
                throw new IllegalArgumentException("invalid data quality standard value " + i);
        }
    }

    private String l() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(m());
        stringBuilder.append(":").append(this.f.a());
        if (this.j != null) {
            stringBuilder.append(":").append(this.j.a());
        }
        if (this.i != null) {
            stringBuilder.append(":").append(this.i.g());
        }
        if (this.k != null) {
            stringBuilder.append(":").append(this.k);
        }
        return stringBuilder.toString();
    }

    private String m() {
        switch (this.h) {
            case 0:
                return "raw";
            case 1:
                return "derived";
            case 2:
                return "cleaned";
            case 3:
                return "converted";
            default:
                throw new IllegalArgumentException("invalid type value");
        }
    }

    public DataType a() {
        return this.f;
    }

    public int b() {
        return this.h;
    }

    public String c() {
        return this.g;
    }

    public String d() {
        return this.j == null ? null : this.j.a();
    }

    public Application e() {
        return this.j;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DataSource) && a((DataSource) obj));
    }

    public Device f() {
        return this.i;
    }

    public String g() {
        return this.k;
    }

    public int[] h() {
        return this.l;
    }

    public int hashCode() {
        return this.m.hashCode();
    }

    public String i() {
        return this.m;
    }

    public String j() {
        String str;
        String str2;
        String valueOf;
        String valueOf2 = String.valueOf(a(this.h));
        String valueOf3 = String.valueOf(this.f.c());
        if (this.j == null) {
            str = "";
        } else if (this.j.equals(Application.a)) {
            str = ":gms";
        } else {
            str2 = ":";
            str = String.valueOf(this.j.a());
            str = str.length() != 0 ? str2.concat(str) : new String(str2);
        }
        if (this.i != null) {
            str2 = String.valueOf(this.i.b());
            valueOf = String.valueOf(this.i.d());
            str2 = new StringBuilder((String.valueOf(str2).length() + 2) + String.valueOf(valueOf).length()).append(":").append(str2).append(":").append(valueOf).toString();
        } else {
            str2 = "";
        }
        if (this.k != null) {
            String str3 = ":";
            valueOf = String.valueOf(this.k);
            valueOf = valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3);
        } else {
            valueOf = "";
        }
        return new StringBuilder(((((String.valueOf(valueOf2).length() + 1) + String.valueOf(valueOf3).length()) + String.valueOf(str).length()) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()).append(valueOf2).append(":").append(valueOf3).append(str).append(str2).append(valueOf).toString();
    }

    int k() {
        return this.e;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("DataSource{");
        stringBuilder.append(m());
        if (this.g != null) {
            stringBuilder.append(":").append(this.g);
        }
        if (this.j != null) {
            stringBuilder.append(":").append(this.j);
        }
        if (this.i != null) {
            stringBuilder.append(":").append(this.i);
        }
        if (this.k != null) {
            stringBuilder.append(":").append(this.k);
        }
        stringBuilder.append(":").append(this.f);
        return stringBuilder.append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        n.a(this, parcel, i);
    }
}
