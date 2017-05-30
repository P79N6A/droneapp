package com.google.android.gms.drive.events;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.o;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.by;
import com.google.android.gms.drive.internal.q.a;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.n;
import com.google.android.gms.internal.ajw;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class CompletionEvent extends AbstractSafeParcelable implements ResourceEvent {
    public static final Creator<CompletionEvent> CREATOR = new g();
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    final int e;
    final DriveId f;
    final String g;
    final ParcelFileDescriptor h;
    final ParcelFileDescriptor i;
    final MetadataBundle j;
    final List<String> k;
    final int l;
    final IBinder m;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;

    CompletionEvent(int i, DriveId driveId, String str, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2, MetadataBundle metadataBundle, List<String> list, int i2, IBinder iBinder) {
        this.e = i;
        this.f = driveId;
        this.g = str;
        this.h = parcelFileDescriptor;
        this.i = parcelFileDescriptor2;
        this.j = metadataBundle;
        this.k = list;
        this.l = i2;
        this.m = iBinder;
    }

    private void a(boolean z) {
        k();
        this.p = true;
        o.a(this.h);
        o.a(this.i);
        if (this.j != null && this.j.b(ajw.F)) {
            ((BitmapTeleporter) this.j.a(ajw.F)).b();
        }
        if (this.m == null) {
            String str = "CompletionEvent";
            String str2 = "No callback on ";
            String valueOf = String.valueOf(z ? "snooze" : "dismiss");
            by.c(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return;
        }
        try {
            a.a(this.m).a(z);
        } catch (RemoteException e) {
            RemoteException remoteException = e;
            str2 = "CompletionEvent";
            valueOf = z ? "snooze" : "dismiss";
            str = String.valueOf(remoteException);
            by.c(str2, new StringBuilder((String.valueOf(valueOf).length() + 21) + String.valueOf(str).length()).append("RemoteException on ").append(valueOf).append(": ").append(str).toString());
        }
    }

    private void k() {
        if (this.p) {
            throw new IllegalStateException("Event has already been dismissed or snoozed.");
        }
    }

    public int a() {
        return 2;
    }

    public DriveId b() {
        k();
        return this.f;
    }

    public String c() {
        k();
        return this.g;
    }

    public InputStream d() {
        k();
        if (this.h == null) {
            return null;
        }
        if (this.n) {
            throw new IllegalStateException("getBaseInputStream() can only be called once per CompletionEvent instance.");
        }
        this.n = true;
        return new FileInputStream(this.h.getFileDescriptor());
    }

    public InputStream e() {
        k();
        if (this.i == null) {
            return null;
        }
        if (this.o) {
            throw new IllegalStateException("getModifiedInputStream() can only be called once per CompletionEvent instance.");
        }
        this.o = true;
        return new FileInputStream(this.i.getFileDescriptor());
    }

    public n f() {
        k();
        return this.j != null ? new n(this.j) : null;
    }

    public List<String> g() {
        k();
        return new ArrayList(this.k);
    }

    public int h() {
        k();
        return this.l;
    }

    public void i() {
        a(false);
    }

    public void j() {
        a(true);
    }

    public String toString() {
        String str;
        if (this.k == null) {
            str = "<null>";
        } else {
            str = String.valueOf(TextUtils.join("','", this.k));
            str = new StringBuilder(String.valueOf(str).length() + 2).append("'").append(str).append("'").toString();
        }
        return String.format(Locale.US, "CompletionEvent [id=%s, status=%s, trackingTag=%s]", new Object[]{this.f, Integer.valueOf(this.l), str});
    }

    public void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i | 1);
    }
}
