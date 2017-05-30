package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.Relation;
import java.util.ArrayList;

public class WriteBatchImpl extends AbstractSafeParcelable {
    public static final Creator<WriteBatchImpl> CREATOR = new s();
    private final int a;
    private final boolean b;
    private ArrayList<ContextData> c;
    private ArrayList<Relation> d;
    private ArrayList<Relation> e;

    public WriteBatchImpl() {
        this(false);
    }

    WriteBatchImpl(int i, boolean z, ArrayList<ContextData> arrayList, ArrayList<Relation> arrayList2, ArrayList<Relation> arrayList3) {
        this.a = i;
        this.b = z;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
    }

    public WriteBatchImpl(boolean z) {
        this.a = 1;
        this.b = z;
    }

    int a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    public ArrayList<ContextData> c() {
        return this.c;
    }

    public ArrayList<Relation> d() {
        return this.d;
    }

    public ArrayList<Relation> e() {
        return this.e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        s.a(this, parcel, i);
    }
}
