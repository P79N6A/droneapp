package com.google.android.gms.wallet;

import android.text.TextUtils;
import com.google.android.gms.common.internal.d;

public final class NotifyTransactionStatusRequest$a {
    final /* synthetic */ NotifyTransactionStatusRequest a;

    private NotifyTransactionStatusRequest$a(NotifyTransactionStatusRequest notifyTransactionStatusRequest) {
        this.a = notifyTransactionStatusRequest;
    }

    public NotifyTransactionStatusRequest$a a(int i) {
        this.a.c = i;
        return this;
    }

    public NotifyTransactionStatusRequest$a a(String str) {
        this.a.b = str;
        return this;
    }

    public NotifyTransactionStatusRequest a() {
        boolean z = true;
        d.b(!TextUtils.isEmpty(this.a.b), "googleTransactionId is required");
        if (this.a.c < 1 || this.a.c > 8) {
            z = false;
        }
        d.b(z, "status is an unrecognized value");
        return this.a;
    }

    public NotifyTransactionStatusRequest$a b(String str) {
        this.a.d = str;
        return this;
    }
}
