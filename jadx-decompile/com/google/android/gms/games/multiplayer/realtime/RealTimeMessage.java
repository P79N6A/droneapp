package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.d;

public final class RealTimeMessage implements Parcelable {
    public static final Creator<RealTimeMessage> CREATOR = new Creator<RealTimeMessage>() {
        public RealTimeMessage a(Parcel parcel) {
            return new RealTimeMessage(parcel);
        }

        public RealTimeMessage[] a(int i) {
            return new RealTimeMessage[i];
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return a(i);
        }
    };
    public static final int a = 0;
    public static final int b = 1;
    private final String c;
    private final byte[] d;
    private final int e;

    private RealTimeMessage(Parcel parcel) {
        this(parcel.readString(), parcel.createByteArray(), parcel.readInt());
    }

    public RealTimeMessage(String str, byte[] bArr, int i) {
        this.c = (String) d.a(str);
        this.d = (byte[]) ((byte[]) d.a(bArr)).clone();
        this.e = i;
    }

    public String a() {
        return this.c;
    }

    public byte[] b() {
        return this.d;
    }

    public boolean c() {
        return this.e == 1;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeByteArray(this.d);
        parcel.writeInt(this.e);
    }
}
