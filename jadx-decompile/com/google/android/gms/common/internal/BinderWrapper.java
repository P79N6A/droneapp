package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public final class BinderWrapper implements Parcelable {
    public static final Creator<BinderWrapper> CREATOR = new Creator<BinderWrapper>() {
        public BinderWrapper a(Parcel parcel) {
            return new BinderWrapper(parcel);
        }

        public BinderWrapper[] a(int i) {
            return new BinderWrapper[i];
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return a(i);
        }
    };
    private IBinder a;

    public BinderWrapper() {
        this.a = null;
    }

    public BinderWrapper(IBinder iBinder) {
        this.a = null;
        this.a = iBinder;
    }

    private BinderWrapper(Parcel parcel) {
        this.a = null;
        this.a = parcel.readStrongBinder();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.a);
    }
}
