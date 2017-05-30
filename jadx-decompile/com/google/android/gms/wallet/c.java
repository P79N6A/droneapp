package com.google.android.gms.wallet;

import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;

public interface c {
    @Deprecated
    i<e> a(g gVar);

    i<e> a(g gVar, IsReadyToPayRequest isReadyToPayRequest);

    @Deprecated
    void a(g gVar, int i);

    void a(g gVar, FullWalletRequest fullWalletRequest, int i);

    void a(g gVar, MaskedWalletRequest maskedWalletRequest, int i);

    @Deprecated
    void a(g gVar, NotifyTransactionStatusRequest notifyTransactionStatusRequest);

    void a(g gVar, String str, String str2, int i);

    @Deprecated
    void b(g gVar, int i);
}
