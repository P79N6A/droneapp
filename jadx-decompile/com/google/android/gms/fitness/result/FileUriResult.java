package com.google.android.gms.fitness.result;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class FileUriResult extends AbstractSafeParcelable implements m {
    public static final Creator<FileUriResult> CREATOR = new h();
    private final int a;
    private final Uri b;
    private final Status c;

    FileUriResult(int i, Uri uri, Status status) {
        this.a = i;
        this.b = uri;
        this.c = status;
    }

    private boolean a(FileUriResult fileUriResult) {
        return this.c.equals(fileUriResult.c) && c.a(this.b, fileUriResult.b);
    }

    public Status a() {
        return this.c;
    }

    public Uri b() {
        return this.b;
    }

    int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FileUriResult) && a((FileUriResult) obj));
    }

    public int hashCode() {
        return c.a(new Object[]{this.c, this.b});
    }

    public String toString() {
        return c.a(this).a("status", this.c).a("uri", this.b).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel, i);
    }
}
