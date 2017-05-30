package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.e;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<BitmapTeleporter> CREATOR = new h();
    final int a;
    ParcelFileDescriptor b;
    final int c;
    private Bitmap d;
    private boolean e;
    private File f;

    BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.a = i;
        this.b = parcelFileDescriptor;
        this.c = i2;
        this.d = null;
        this.e = false;
    }

    public BitmapTeleporter(Bitmap bitmap) {
        this.a = 1;
        this.b = null;
        this.c = 0;
        this.d = bitmap;
        this.e = true;
    }

    private void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (Throwable e) {
            Log.w("BitmapTeleporter", "Could not close stream", e);
        }
    }

    private FileOutputStream c() {
        if (this.f == null) {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
        try {
            File createTempFile = File.createTempFile("teleporter", ".tmp", this.f);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                this.b = ParcelFileDescriptor.open(createTempFile, e.a_);
                createTempFile.delete();
                return fileOutputStream;
            } catch (FileNotFoundException e) {
                throw new IllegalStateException("Temporary file is somehow already deleted");
            }
        } catch (Throwable e2) {
            throw new IllegalStateException("Could not create temporary file", e2);
        }
    }

    public Bitmap a() {
        if (!this.e) {
            Closeable dataInputStream = new DataInputStream(new AutoCloseInputStream(this.b));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                int readInt = dataInputStream.readInt();
                int readInt2 = dataInputStream.readInt();
                Config valueOf = Config.valueOf(dataInputStream.readUTF());
                dataInputStream.read(bArr);
                a(dataInputStream);
                Buffer wrap = ByteBuffer.wrap(bArr);
                Bitmap createBitmap = Bitmap.createBitmap(readInt, readInt2, valueOf);
                createBitmap.copyPixelsFromBuffer(wrap);
                this.d = createBitmap;
                this.e = true;
            } catch (Throwable e) {
                throw new IllegalStateException("Could not read from parcel file descriptor", e);
            } catch (Throwable th) {
                a(dataInputStream);
            }
        }
        return this.d;
    }

    public void a(File file) {
        if (file == null) {
            throw new NullPointerException("Cannot set null temp directory");
        }
        this.f = file;
    }

    public void b() {
        if (!this.e) {
            try {
                this.b.close();
            } catch (Throwable e) {
                Log.w("BitmapTeleporter", "Could not close PFD", e);
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.b == null) {
            Bitmap bitmap = this.d;
            Buffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            Closeable dataOutputStream = new DataOutputStream(c());
            try {
                dataOutputStream.writeInt(array.length);
                dataOutputStream.writeInt(bitmap.getWidth());
                dataOutputStream.writeInt(bitmap.getHeight());
                dataOutputStream.writeUTF(bitmap.getConfig().toString());
                dataOutputStream.write(array);
                a(dataOutputStream);
            } catch (Throwable e) {
                throw new IllegalStateException("Could not write into unlinked file", e);
            } catch (Throwable th) {
                a(dataOutputStream);
            }
        }
        h.a(this, parcel, i | 1);
        this.b = null;
    }
}
