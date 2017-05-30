package com.google.android.gms.ads.internal.cache;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
import java.io.InputStream;

@aaa
public class CacheEntryParcel extends AbstractSafeParcelable {
    public static final b CREATOR = new b();
    public final int a;
    @Nullable
    private ParcelFileDescriptor b;

    public CacheEntryParcel() {
        this(1, null);
    }

    CacheEntryParcel(int i, @Nullable ParcelFileDescriptor parcelFileDescriptor) {
        this.a = i;
        this.b = parcelFileDescriptor;
    }

    public synchronized boolean a() {
        return this.b != null;
    }

    @Nullable
    public synchronized InputStream b() {
        InputStream inputStream = null;
        synchronized (this) {
            if (this.b != null) {
                inputStream = new AutoCloseInputStream(this.b);
                this.b = null;
            }
        }
        return inputStream;
    }

    synchronized ParcelFileDescriptor c() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
