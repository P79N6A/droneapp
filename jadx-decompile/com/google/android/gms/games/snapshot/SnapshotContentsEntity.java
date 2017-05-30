package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.o;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.internal.h;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

public final class SnapshotContentsEntity extends AbstractSafeParcelable implements SnapshotContents {
    public static final a CREATOR = new a();
    private static final Object a = new Object();
    private final int b;
    private Contents c;

    SnapshotContentsEntity(int i, Contents contents) {
        this.b = i;
        this.c = contents;
    }

    public SnapshotContentsEntity(Contents contents) {
        this(1, contents);
    }

    private boolean a(int i, byte[] bArr, int i2, int i3, boolean z) {
        d.a(!d(), "Must provide a previously opened SnapshotContents");
        synchronized (a) {
            OutputStream fileOutputStream = new FileOutputStream(this.c.a().getFileDescriptor());
            OutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            try {
                FileChannel channel = fileOutputStream.getChannel();
                channel.position((long) i);
                bufferedOutputStream.write(bArr, i2, i3);
                if (z) {
                    channel.truncate((long) bArr.length);
                }
                bufferedOutputStream.flush();
            } catch (Throwable e) {
                h.a("SnapshotContentsEntity", "Failed to write snapshot data", e);
                return false;
            }
        }
        return true;
    }

    public ParcelFileDescriptor a() {
        d.a(!d(), "Cannot mutate closed contents!");
        return this.c.a();
    }

    public boolean a(int i, byte[] bArr, int i2, int i3) {
        return a(i, bArr, i2, bArr.length, false);
    }

    public boolean a(byte[] bArr) {
        return a(0, bArr, 0, bArr.length, true);
    }

    public Contents b() {
        return this.c;
    }

    public void c() {
        this.c = null;
    }

    public boolean d() {
        return this.c == null;
    }

    public byte[] e() {
        byte[] a;
        boolean z = false;
        if (!d()) {
            z = true;
        }
        d.a(z, "Must provide a previously opened Snapshot");
        synchronized (a) {
            InputStream fileInputStream = new FileInputStream(this.c.a().getFileDescriptor());
            InputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            try {
                fileInputStream.getChannel().position(0);
                a = o.a(bufferedInputStream, false);
                fileInputStream.getChannel().position(0);
            } catch (Throwable e) {
                h.b("SnapshotContentsEntity", "Failed to read snapshot data", e);
                throw e;
            }
        }
        return a;
    }

    public int f() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
