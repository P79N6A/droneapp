package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.a;
import com.google.android.gms.nearby.messages.Message;
import java.util.Set;

public class Update extends AbstractSafeParcelable {
    public static final Creator<Update> CREATOR = new b();
    final int a;
    final int b;
    public final Message c;
    @Nullable
    public final DistanceImpl d;
    @Nullable
    public final BleSignalImpl e;

    Update(int i, int i2, Message message, @Nullable DistanceImpl distanceImpl, @Nullable BleSignalImpl bleSignalImpl) {
        boolean z = true;
        this.a = i;
        this.b = i2;
        if (a(1) && a(2)) {
            z = false;
        }
        d.a(z, "Update cannot represent both FOUND and LOST.");
        this.c = message;
        this.d = distanceImpl;
        this.e = bleSignalImpl;
    }

    private Set<String> a() {
        Set<String> aVar = new a();
        if (a(1)) {
            aVar.add("FOUND");
        }
        if (a(2)) {
            aVar.add("LOST");
        }
        if (a(4)) {
            aVar.add("DISTANCE");
        }
        if (a(8)) {
            aVar.add("BLE_SIGNAL");
        }
        return aVar;
    }

    public boolean a(int i) {
        return (this.b & i) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Update)) {
            return false;
        }
        Update update = (Update) obj;
        return this.b == update.b && c.a(this.c, update.c) && c.a(this.d, update.d) && c.a(this.e, update.e);
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.b), this.c, this.d, this.e});
    }

    public String toString() {
        String valueOf = String.valueOf(a());
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        return new StringBuilder((((String.valueOf(valueOf).length() + 47) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append("Update{types=").append(valueOf).append(", message=").append(valueOf2).append(", distance=").append(valueOf3).append(", bleSignal=").append(valueOf4).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
