package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.awareness.state.BeaconState;
import com.google.android.gms.awareness.state.BeaconState.TypeFilter;
import com.google.android.gms.awareness.state.BeaconState.a;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.px;
import com.google.android.gms.internal.rc;
import com.google.android.gms.internal.rd;
import com.google.android.gms.internal.sw;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class BeaconStateImpl extends AbstractSafeParcelable implements BeaconState {
    public static final Creator<BeaconStateImpl> CREATOR = new b();
    private final int a;
    private final ArrayList<BeaconInfoImpl> b;

    public static final class BeaconInfoImpl extends AbstractSafeParcelable implements a {
        public static final Creator<BeaconInfoImpl> CREATOR = new a();
        private final int a;
        private final String b;
        private final String c;
        private final byte[] d;

        BeaconInfoImpl(int i, String str, String str2, byte[] bArr) {
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = bArr;
        }

        public String a() {
            return this.b;
        }

        public String b() {
            return this.c;
        }

        public byte[] c() {
            return this.d;
        }

        int d() {
            return this.a;
        }

        public String toString() {
            String str = this.d == null ? "<null>" : new String(this.d);
            String str2 = this.b;
            String str3 = this.c;
            return new StringBuilder(((String.valueOf(str2).length() + 6) + String.valueOf(str3).length()) + String.valueOf(str).length()).append("(").append(str2).append(", ").append(str3).append(", ").append(str).append(")").toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            a.a(this, parcel, i);
        }
    }

    public static class TypeFilterImpl extends TypeFilter {
        public static final Creator<TypeFilterImpl> CREATOR = new n();
        private final int a;
        private final px.a b;

        TypeFilterImpl(int i, byte[] bArr) {
            this.a = i;
            px.a aVar = null;
            try {
                aVar = px.a.a(bArr);
            } catch (rc e) {
                sw.b("BeaconStateImpl", "Could not deserialize BeaconFence.BeaconTypeFilter");
            }
            this.b = aVar;
        }

        public TypeFilterImpl(String str, String str2) {
            this.a = 1;
            this.b = new px.a();
            this.b.a = d.a(str);
            this.b.b = d.a(str2);
        }

        public TypeFilterImpl(String str, String str2, byte[] bArr) {
            this.a = 1;
            this.b = new px.a();
            this.b.a = d.a(str);
            this.b.b = d.a(str2);
            this.b.c = (byte[]) d.a((Object) bArr);
        }

        public String a() {
            return this.b == null ? null : this.b.a;
        }

        public String b() {
            return this.b == null ? null : this.b.b;
        }

        public byte[] c() {
            return (this.b == null || this.b.c == null || this.b.c.length == 0) ? null : this.b.c;
        }

        public px.a d() {
            return this.b;
        }

        int e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TypeFilterImpl)) {
                return false;
            }
            TypeFilterImpl typeFilterImpl = (TypeFilterImpl) obj;
            return TextUtils.equals(a(), typeFilterImpl.a()) && TextUtils.equals(b(), typeFilterImpl.b()) && Arrays.equals(c(), typeFilterImpl.c());
        }

        byte[] f() {
            return rd.a(this.b);
        }

        public int hashCode() {
            int i = 0;
            Object[] objArr = new Object[3];
            objArr[0] = a();
            objArr[1] = b();
            if (c() != null) {
                i = Arrays.hashCode(c());
            }
            objArr[2] = Integer.valueOf(i);
            return c.a(objArr);
        }

        public String toString() {
            String valueOf = String.valueOf(a());
            String valueOf2 = String.valueOf(b());
            String str = c() == null ? "null" : new String(c());
            return new StringBuilder(((String.valueOf(valueOf).length() + 4) + String.valueOf(valueOf2).length()) + String.valueOf(str).length()).append("(").append(valueOf).append(Constants.ACCEPT_TIME_SEPARATOR_SP).append(valueOf2).append(Constants.ACCEPT_TIME_SEPARATOR_SP).append(str).append(")").toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            n.a(this, parcel, i);
        }
    }

    BeaconStateImpl(int i, ArrayList<BeaconInfoImpl> arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public List<a> a() {
        return this.b;
    }

    int b() {
        return this.a;
    }

    ArrayList<BeaconInfoImpl> c() {
        return this.b;
    }

    public String toString() {
        if (this.b == null || this.b.isEmpty()) {
            return "BeaconState: empty";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BeaconState: ");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            stringBuilder.append((a) it.next());
        }
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
