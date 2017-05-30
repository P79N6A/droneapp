package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ParcelableCollaborator extends AbstractSafeParcelable {
    public static final Creator<ParcelableCollaborator> CREATOR = new q();
    final int a;
    final boolean b;
    final boolean c;
    final String d;
    final String e;
    final String f;
    final String g;
    final String h;

    ParcelableCollaborator(int i, boolean z, boolean z2, String str, String str2, String str3, String str4, String str5) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParcelableCollaborator)) {
            return false;
        }
        return this.d.equals(((ParcelableCollaborator) obj).d);
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        boolean z = this.b;
        boolean z2 = this.c;
        String str = this.d;
        String str2 = this.e;
        String str3 = this.f;
        String str4 = this.g;
        String str5 = this.h;
        return new StringBuilder(((((String.valueOf(str).length() + 98) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()) + String.valueOf(str5).length()).append("Collaborator [isMe=").append(z).append(", isAnonymous=").append(z2).append(", sessionId=").append(str).append(", userId=").append(str2).append(", displayName=").append(str3).append(", color=").append(str4).append(", photoUrl=").append(str5).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        q.a(this, parcel, i);
    }
}
