package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.o;
import com.google.android.gms.internal.aaa;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

@aaa
public final class LargeParcelTeleporter extends AbstractSafeParcelable {
    public static final Creator<LargeParcelTeleporter> CREATOR = new m();
    final int a;
    ParcelFileDescriptor b;
    private Parcelable c;
    private boolean d;

    LargeParcelTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = i;
        this.b = parcelFileDescriptor;
        this.c = null;
        this.d = true;
    }

    public LargeParcelTeleporter(SafeParcelable safeParcelable) {
        this.a = 1;
        this.b = null;
        this.c = safeParcelable;
        this.d = false;
    }

    protected <T> ParcelFileDescriptor a(final byte[] bArr) {
        Throwable e;
        ParcelFileDescriptor parcelFileDescriptor = null;
        final Closeable autoCloseOutputStream;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new AutoCloseOutputStream(createPipe[1]);
            try {
                new Thread(new Runnable(this) {
                    final /* synthetic */ LargeParcelTeleporter c;

                    public void run() {
                        Closeable dataOutputStream;
                        Throwable e;
                        try {
                            dataOutputStream = new DataOutputStream(autoCloseOutputStream);
                            try {
                                dataOutputStream.writeInt(bArr.length);
                                dataOutputStream.write(bArr);
                                o.a(dataOutputStream);
                            } catch (IOException e2) {
                                e = e2;
                                try {
                                    b.b("Error transporting the ad response", e);
                                    u.i().a(e, "LargeParcelTeleporter.pipeData.1");
                                    if (dataOutputStream != null) {
                                        o.a(autoCloseOutputStream);
                                    } else {
                                        o.a(dataOutputStream);
                                    }
                                } catch (Throwable th) {
                                    e = th;
                                    if (dataOutputStream != null) {
                                        o.a(autoCloseOutputStream);
                                    } else {
                                        o.a(dataOutputStream);
                                    }
                                    throw e;
                                }
                            }
                        } catch (IOException e3) {
                            e = e3;
                            dataOutputStream = null;
                            b.b("Error transporting the ad response", e);
                            u.i().a(e, "LargeParcelTeleporter.pipeData.1");
                            if (dataOutputStream != null) {
                                o.a(dataOutputStream);
                            } else {
                                o.a(autoCloseOutputStream);
                            }
                        } catch (Throwable th2) {
                            e = th2;
                            dataOutputStream = null;
                            if (dataOutputStream != null) {
                                o.a(dataOutputStream);
                            } else {
                                o.a(autoCloseOutputStream);
                            }
                            throw e;
                        }
                    }
                }).start();
                return createPipe[0];
            } catch (IOException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            e = e3;
            autoCloseOutputStream = parcelFileDescriptor;
            b.b("Error transporting the ad response", e);
            u.i().a(e, "LargeParcelTeleporter.pipeData.2");
            o.a(autoCloseOutputStream);
            return parcelFileDescriptor;
        }
    }

    public <T extends SafeParcelable> T a(Creator<T> creator) {
        if (this.d) {
            if (this.b == null) {
                b.b("File descriptor is empty, returning null.");
                return null;
            }
            Closeable dataInputStream = new DataInputStream(new AutoCloseInputStream(this.b));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr, 0, bArr.length);
                o.a(dataInputStream);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, bArr.length);
                    obtain.setDataPosition(0);
                    this.c = (SafeParcelable) creator.createFromParcel(obtain);
                    this.d = false;
                } finally {
                    obtain.recycle();
                }
            } catch (Throwable e) {
                throw new IllegalStateException("Could not read from parcel file descriptor", e);
            } catch (Throwable th) {
                o.a(dataInputStream);
            }
        }
        return (SafeParcelable) this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.b == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.c.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                this.b = a(marshall);
            } finally {
                obtain.recycle();
            }
        }
        m.a(this, parcel, i);
    }
}
