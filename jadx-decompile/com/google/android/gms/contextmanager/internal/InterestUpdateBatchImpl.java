package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.contextmanager.interest.InterestRecordStub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;

public class InterestUpdateBatchImpl extends AbstractSafeParcelable {
    public static final Creator<InterestUpdateBatchImpl> CREATOR = new j();
    private final int a;
    private final ArrayList<Operation> b;

    public static class Operation extends AbstractSafeParcelable {
        public static final Creator<Operation> CREATOR = new k();
        private final int a;
        private final int b;
        private final InterestRecordStub c;
        private final String d;

        Operation(int i, int i2, InterestRecordStub interestRecordStub, String str) {
            this.a = i;
            this.b = i2;
            this.c = interestRecordStub;
            this.d = str;
        }

        int a() {
            return this.a;
        }

        InterestRecordStub b() {
            return this.c;
        }

        String c() {
            return this.d;
        }

        public int d() {
            return this.b;
        }

        public void writeToParcel(Parcel parcel, int i) {
            k.a(this, parcel, i);
        }
    }

    public InterestUpdateBatchImpl() {
        this.a = 1;
        this.b = new ArrayList();
    }

    InterestUpdateBatchImpl(int i, ArrayList<Operation> arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    int a() {
        return this.a;
    }

    public ArrayList<Operation> b() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        j.a(this, parcel, i);
    }
}
