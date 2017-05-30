package com.google.android.gms.internal;

import android.annotation.SuppressLint;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.internal.ahl.b;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.c;
import com.google.android.gms.wallet.d$b;
import com.google.android.gms.wallet.d$c;

@SuppressLint({"MissingRemoteException"})
public class ez implements c {
    public i<e> a(g gVar) {
        return gVar.a(new d$b<e>(this, gVar) {
            final /* synthetic */ ez a;

            protected e a(Status status) {
                return new e(status, false);
            }

            protected void a(fa faVar) {
                faVar.a(IsReadyToPayRequest.c().a(), (b) this);
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<e> a(g gVar, final IsReadyToPayRequest isReadyToPayRequest) {
        return gVar.a(new d$b<e>(this, gVar) {
            final /* synthetic */ ez b;

            protected e a(Status status) {
                return new e(status, false);
            }

            protected void a(fa faVar) {
                faVar.a(isReadyToPayRequest, (b) this);
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public void a(g gVar, final int i) {
        gVar.a(new d$c(this, gVar) {
            final /* synthetic */ ez b;

            protected void a(fa faVar) {
                faVar.c(i);
                b(Status.a);
            }
        });
    }

    public void a(g gVar, final FullWalletRequest fullWalletRequest, final int i) {
        gVar.a(new d$c(this, gVar) {
            final /* synthetic */ ez c;

            protected void a(fa faVar) {
                faVar.a(fullWalletRequest, i);
                b(Status.a);
            }
        });
    }

    public void a(g gVar, final MaskedWalletRequest maskedWalletRequest, final int i) {
        gVar.a(new d$c(this, gVar) {
            final /* synthetic */ ez c;

            protected void a(fa faVar) {
                faVar.a(maskedWalletRequest, i);
                b(Status.a);
            }
        });
    }

    public void a(g gVar, final NotifyTransactionStatusRequest notifyTransactionStatusRequest) {
        gVar.a(new d$c(this, gVar) {
            final /* synthetic */ ez b;

            protected void a(fa faVar) {
                faVar.a(notifyTransactionStatusRequest);
                b(Status.a);
            }
        });
    }

    public void a(g gVar, String str, String str2, int i) {
        final String str3 = str;
        final String str4 = str2;
        final int i2 = i;
        gVar.a(new d$c(this, gVar) {
            final /* synthetic */ ez d;

            protected void a(fa faVar) {
                faVar.a(str3, str4, i2);
                b(Status.a);
            }
        });
    }

    public void b(g gVar, final int i) {
        gVar.a(new d$c(this, gVar) {
            final /* synthetic */ ez b;

            protected void a(fa faVar) {
                faVar.d(i);
                b(Status.a);
            }
        });
    }
}
