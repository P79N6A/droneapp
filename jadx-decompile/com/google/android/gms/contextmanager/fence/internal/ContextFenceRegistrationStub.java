package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ContextFenceRegistrationStub extends AbstractSafeParcelable {
    public static final Creator<ContextFenceRegistrationStub> CREATOR = new f();
    private final int a;
    private final String b;
    private ContextFenceStub c;

    ContextFenceRegistrationStub(int i, String str, ContextFenceStub contextFenceStub) {
        this.a = i;
        this.b = str;
        this.c = contextFenceStub;
    }

    public ContextFenceRegistrationStub(String str, ContextFenceStub contextFenceStub) {
        this(1, d.a(str), (ContextFenceStub) d.a(contextFenceStub));
    }

    public static ContextFenceRegistrationStub a(String str, ContextFenceStub contextFenceStub) {
        return new ContextFenceRegistrationStub(str, contextFenceStub);
    }

    int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public ContextFenceStub c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContextFenceRegistrationStub)) {
            return false;
        }
        return TextUtils.equals(b(), ((ContextFenceRegistrationStub) obj).b());
    }

    public int hashCode() {
        return c.a(new Object[]{this.b});
    }

    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel, i);
    }
}
