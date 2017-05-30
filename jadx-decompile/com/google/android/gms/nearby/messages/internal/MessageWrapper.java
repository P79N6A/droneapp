package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.Message;

public class MessageWrapper extends AbstractSafeParcelable {
    public static final r CREATOR = new r();
    final int a;
    public final Message b;

    MessageWrapper(int i, Message message) {
        this.a = i;
        this.b = (Message) d.a(message);
    }

    public static final MessageWrapper a(Message message) {
        return new MessageWrapper(1, message);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageWrapper)) {
            return false;
        }
        return c.a(this.b, ((MessageWrapper) obj).b);
    }

    public int hashCode() {
        return c.a(new Object[]{this.b});
    }

    public String toString() {
        String valueOf = String.valueOf(this.b.toString());
        return new StringBuilder(String.valueOf(valueOf).length() + 24).append("MessageWrapper{message=").append(valueOf).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        r rVar = CREATOR;
        r.a(this, parcel, i);
    }
}
