package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class GetRecentContextCall {

    public static class Request extends AbstractSafeParcelable {
        public static final f CREATOR = new f();
        final int a;
        public final Account b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final String f;

        public Request() {
            this(null, false, false, false, null);
        }

        Request(int i, Account account, boolean z, boolean z2, boolean z3, String str) {
            this.a = i;
            this.b = account;
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.f = str;
        }

        public Request(Account account, boolean z, boolean z2, boolean z3, String str) {
            this(1, account, z, z2, z3, str);
        }

        public void writeToParcel(Parcel parcel, int i) {
            f fVar = CREATOR;
            f.a(this, parcel, i);
        }
    }

    public static class Response extends AbstractSafeParcelable implements m {
        public static final g CREATOR = new g();
        public Status a;
        public List<UsageInfo> b;
        @Deprecated
        public String[] c;
        final int d;

        public Response() {
            this.d = 1;
        }

        Response(int i, Status status, List<UsageInfo> list, String[] strArr) {
            this.d = i;
            this.a = status;
            this.b = list;
            this.c = strArr;
        }

        public Status a() {
            return this.a;
        }

        public void writeToParcel(Parcel parcel, int i) {
            g gVar = CREATOR;
            g.a(this, parcel, i);
        }
    }
}
