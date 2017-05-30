package com.google.android.gms.wallet;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.internal.ez;
import com.google.android.gms.internal.fa;
import com.google.android.gms.internal.fc;
import com.google.android.gms.internal.fd;
import com.google.android.gms.wallet.firstparty.b;
import com.google.android.gms.wallet.wobs.j;

public final class d {
    public static final a<a> a = new a("Wallet.API", f, e);
    public static final c b = new ez();
    public static final j c = new fd();
    public static final b d = new fc();
    private static final g<fa> e = new g();
    private static final a.b<fa, a> f = new 1();

    private d() {
    }

    @Deprecated
    public static void a(com.google.android.gms.common.api.g gVar, int i) {
        b.a(gVar, i);
    }

    @Deprecated
    public static void a(com.google.android.gms.common.api.g gVar, FullWalletRequest fullWalletRequest, int i) {
        b.a(gVar, fullWalletRequest, i);
    }

    @Deprecated
    public static void a(com.google.android.gms.common.api.g gVar, MaskedWalletRequest maskedWalletRequest, int i) {
        b.a(gVar, maskedWalletRequest, i);
    }

    @Deprecated
    public static void a(com.google.android.gms.common.api.g gVar, NotifyTransactionStatusRequest notifyTransactionStatusRequest) {
        b.a(gVar, notifyTransactionStatusRequest);
    }

    @Deprecated
    public static void a(com.google.android.gms.common.api.g gVar, String str, String str2, int i) {
        b.a(gVar, str, str2, i);
    }
}
