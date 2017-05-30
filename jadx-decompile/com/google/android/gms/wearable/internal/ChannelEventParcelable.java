package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.c.a;

public final class ChannelEventParcelable extends AbstractSafeParcelable {
    public static final Creator<ChannelEventParcelable> CREATOR = new bf();
    final int a;
    final ChannelImpl b;
    final int c;
    final int d;
    final int e;

    ChannelEventParcelable(int i, ChannelImpl channelImpl, int i2, int i3, int i4) {
        this.a = i;
        this.b = channelImpl;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    private static String a(int i) {
        switch (i) {
            case 1:
                return "CHANNEL_OPENED";
            case 2:
                return "CHANNEL_CLOSED";
            case 3:
                return "INPUT_CLOSED";
            case 4:
                return "OUTPUT_CLOSED";
            default:
                return Integer.toString(i);
        }
    }

    private static String b(int i) {
        switch (i) {
            case 0:
                return "CLOSE_REASON_NORMAL";
            case 1:
                return "CLOSE_REASON_DISCONNECTED";
            case 2:
                return "CLOSE_REASON_REMOTE_CLOSE";
            case 3:
                return "CLOSE_REASON_LOCAL_CLOSE";
            default:
                return Integer.toString(i);
        }
    }

    public void a(a aVar) {
        switch (this.c) {
            case 1:
                aVar.a(this.b);
                return;
            case 2:
                aVar.a(this.b, this.d, this.e);
                return;
            case 3:
                aVar.b(this.b, this.d, this.e);
                return;
            case 4:
                aVar.c(this.b, this.d, this.e);
                return;
            default:
                Log.w("ChannelEventParcelable", "Unknown type: " + this.c);
                return;
        }
    }

    public String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(a(this.c));
        String valueOf3 = String.valueOf(b(this.d));
        return new StringBuilder(((String.valueOf(valueOf).length() + 104) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("ChannelEventParcelable[versionCode=").append(i).append(", channel=").append(valueOf).append(", type=").append(valueOf2).append(", closeReason=").append(valueOf3).append(", appErrorCode=").append(this.e).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        bf.a(this, parcel, i);
    }
}
