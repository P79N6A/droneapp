package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Command implements Parcelable {
    @Deprecated
    public static final Creator<Command> CREATOR = new Creator<Command>() {
        @Deprecated
        public Command a(Parcel parcel) {
            return new Command(parcel);
        }

        @Deprecated
        public Command[] a(int i) {
            return new Command[i];
        }

        @Deprecated
        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Deprecated
        public /* synthetic */ Object[] newArray(int i) {
            return a(i);
        }
    };
    private String a;
    private String b;
    private String c;

    @Deprecated
    Command(Parcel parcel) {
        a(parcel);
    }

    @Deprecated
    private void a(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.c;
    }

    @Deprecated
    public int describeContents() {
        return 0;
    }

    @Deprecated
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
