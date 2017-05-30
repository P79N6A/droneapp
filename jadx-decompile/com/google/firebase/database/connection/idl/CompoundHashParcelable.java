package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.ho;
import java.util.ArrayList;
import java.util.List;

class CompoundHashParcelable extends AbstractSafeParcelable {
    public static final a CREATOR = new a();
    final int a;
    final List<String> b;
    final List<String> c;

    public CompoundHashParcelable(int i, List<String> list, List<String> list2) {
        this.a = i;
        this.b = list;
        this.c = list2;
    }

    public static hk a(CompoundHashParcelable compoundHashParcelable) {
        List arrayList = new ArrayList(compoundHashParcelable.b.size());
        for (String a : compoundHashParcelable.b) {
            arrayList.add(ho.a(a));
        }
        return new hk(arrayList, compoundHashParcelable.c);
    }

    public static CompoundHashParcelable a(hk hkVar) {
        List<List> a = hkVar.a();
        List arrayList = new ArrayList(a.size());
        for (List a2 : a) {
            arrayList.add(ho.a(a2));
        }
        return new CompoundHashParcelable(1, arrayList, hkVar.b());
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
