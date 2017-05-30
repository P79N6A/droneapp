package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class MessageType extends AbstractSafeParcelable {
    public static final Creator<MessageType> CREATOR = new q();
    final int a;
    public final String b;
    public final String c;

    MessageType(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public MessageType(String str, String str2) {
        this(1, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageType)) {
            return false;
        }
        MessageType messageType = (MessageType) obj;
        return c.a(this.b, messageType.b) && c.a(this.c, messageType.c);
    }

    public int hashCode() {
        return c.a(new Object[]{this.b, this.c});
    }

    public String toString() {
        String str = this.b;
        String str2 = this.c;
        return new StringBuilder((String.valueOf(str).length() + 17) + String.valueOf(str2).length()).append("namespace=").append(str).append(", type=").append(str2).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        q.a(this, parcel, i);
    }
}
