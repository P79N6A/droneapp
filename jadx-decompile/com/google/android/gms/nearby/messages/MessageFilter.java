package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.devices.NearbyDeviceFilter;
import com.google.android.gms.nearby.messages.internal.MessageType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class MessageFilter extends AbstractSafeParcelable {
    public static final Creator<MessageFilter> CREATOR = new p();
    public static final MessageFilter a = new a().a().b();
    final int b;
    private final List<MessageType> c;
    private final List<NearbyDeviceFilter> d;
    private final boolean e;

    public static final class a {
        private final List<MessageType> a = new ArrayList();
        private final List<NearbyDeviceFilter> b = new ArrayList();
        private boolean c;

        private a c(String str, String str2) {
            this.a.add(new MessageType(str, str2));
            return this;
        }

        public a a() {
            this.c = true;
            return this;
        }

        public a a(MessageFilter messageFilter) {
            this.a.addAll(messageFilter.a());
            this.b.addAll(messageFilter.c());
            this.c |= messageFilter.b();
            return this;
        }

        public a a(String str, String str2) {
            boolean z = (str == null || str.isEmpty() || str.contains("*")) ? false : true;
            d.b(z, "namespace(%s) cannot be null, empty or contain (*).", new Object[]{str});
            z = (str2 == null || str2.contains("*")) ? false : true;
            d.b(z, "type(%s) cannot be null or contain (*).", new Object[]{str2});
            return c(str, str2);
        }

        public a a(UUID uuid, @Nullable Short sh, @Nullable Short sh2) {
            c(Message.c, Message.e);
            this.b.add(NearbyDeviceFilter.a(uuid, sh, sh2));
            return this;
        }

        public a b(String str, @Nullable String str2) {
            c(Message.c, Message.d);
            this.b.add(NearbyDeviceFilter.a(str, str2));
            return this;
        }

        public MessageFilter b() {
            boolean z = this.c || !this.a.isEmpty();
            d.a(z, "At least one of the include methods must be called.");
            return new MessageFilter(this.a, this.b, this.c);
        }
    }

    MessageFilter(int i, List<MessageType> list, List<NearbyDeviceFilter> list2, boolean z) {
        List emptyList;
        this.b = i;
        this.c = Collections.unmodifiableList((List) d.a(list));
        this.e = z;
        if (list2 == null) {
            emptyList = Collections.emptyList();
        }
        this.d = Collections.unmodifiableList(emptyList);
    }

    private MessageFilter(List<MessageType> list, List<NearbyDeviceFilter> list2, boolean z) {
        this(1, (List) list, (List) list2, z);
    }

    List<MessageType> a() {
        return this.c;
    }

    boolean b() {
        return this.e;
    }

    List<NearbyDeviceFilter> c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageFilter)) {
            return false;
        }
        MessageFilter messageFilter = (MessageFilter) obj;
        return this.e == messageFilter.e && c.a(this.c, messageFilter.c) && c.a(this.d, messageFilter.d);
    }

    public int hashCode() {
        return c.a(new Object[]{this.c, this.d, Boolean.valueOf(this.e)});
    }

    public String toString() {
        boolean z = this.e;
        String valueOf = String.valueOf(this.c);
        return new StringBuilder(String.valueOf(valueOf).length() + 53).append("MessageFilter{includeAllMyTypes=").append(z).append(", messageTypes=").append(valueOf).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        p.a(this, parcel, i);
    }
}
