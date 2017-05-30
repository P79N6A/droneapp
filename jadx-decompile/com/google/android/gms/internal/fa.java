package com.google.android.gms.internal;

import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenResponse;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;
import com.google.android.gms.wallet.firstparty.GetInstrumentsResponse;
import java.lang.ref.WeakReference;

public class fa extends w<ev> {
    private final Context a;
    private final int e;
    private final String f;
    private final int g;
    private final boolean h;

    private static class a extends com.google.android.gms.internal.ey.a {
        private a() {
        }

        public void a(int i, Bundle bundle) {
        }

        public void a(int i, FullWallet fullWallet, Bundle bundle) {
        }

        public void a(int i, MaskedWallet maskedWallet, Bundle bundle) {
        }

        public void a(int i, boolean z, Bundle bundle) {
        }

        public void a(Status status, Bundle bundle) {
        }

        public void a(Status status, GetBuyFlowInitializationTokenResponse getBuyFlowInitializationTokenResponse, Bundle bundle) {
        }

        public void a(Status status, GetClientTokenResponse getClientTokenResponse, Bundle bundle) {
        }

        public void a(Status status, GetInstrumentsResponse getInstrumentsResponse, Bundle bundle) {
        }

        public void a(Status status, boolean z, Bundle bundle) {
        }

        public void b(int i, boolean z, Bundle bundle) {
        }

        public void b(Status status, Bundle bundle) {
        }
    }

    private static class b extends a {
        private final com.google.android.gms.internal.ahl.b<e> a;

        public b(com.google.android.gms.internal.ahl.b<e> bVar) {
            super();
            this.a = bVar;
        }

        public void a(Status status, boolean z, Bundle bundle) {
            this.a.a(new e(status, z));
        }
    }

    static final class c extends a {
        private final WeakReference<Activity> a;
        private final int b;

        public c(Context context, int i) {
            super();
            this.a = new WeakReference((Activity) context);
            this.b = i;
        }

        public void a(int i, Bundle bundle) {
            d.a(bundle, "Bundle should not be null");
            Activity activity = (Activity) this.a.get();
            if (activity == null) {
                Log.d("WalletClientImpl", "Ignoring onWalletObjectsCreated, Activity has gone");
                return;
            }
            ConnectionResult connectionResult = new ConnectionResult(i, (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT"));
            if (connectionResult.a()) {
                try {
                    connectionResult.a(activity, this.b);
                    return;
                } catch (Throwable e) {
                    Log.w("WalletClientImpl", "Exception starting pending intent", e);
                    return;
                }
            }
            String valueOf = String.valueOf(connectionResult);
            Log.e("WalletClientImpl", new StringBuilder(String.valueOf(valueOf).length() + 75).append("Create Wallet Objects confirmation UI will not be shown connection result: ").append(valueOf).toString());
            Intent intent = new Intent();
            intent.putExtra(com.google.android.gms.wallet.e.e, com.google.android.gms.wallet.e.q);
            PendingIntent createPendingResult = activity.createPendingResult(this.b, intent, 1073741824);
            if (createPendingResult == null) {
                Log.w("WalletClientImpl", "Null pending result returned for onWalletObjectsCreated");
                return;
            }
            try {
                createPendingResult.send(1);
            } catch (Throwable e2) {
                Log.w("WalletClientImpl", "Exception setting pending result", e2);
            }
        }

        public void a(int i, FullWallet fullWallet, Bundle bundle) {
            Activity activity = (Activity) this.a.get();
            if (activity == null) {
                Log.d("WalletClientImpl", "Ignoring onFullWalletLoaded, Activity has gone");
                return;
            }
            PendingIntent pendingIntent = null;
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
            }
            ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
            if (connectionResult.a()) {
                try {
                    connectionResult.a(activity, this.b);
                    return;
                } catch (Throwable e) {
                    Log.w("WalletClientImpl", "Exception starting pending intent", e);
                    return;
                }
            }
            int i2;
            Intent intent = new Intent();
            if (connectionResult.b()) {
                i2 = -1;
                intent.putExtra(com.google.android.gms.wallet.e.d, fullWallet);
            } else {
                i2 = i == 408 ? 0 : 1;
                intent.putExtra(com.google.android.gms.wallet.e.e, i);
            }
            PendingIntent createPendingResult = activity.createPendingResult(this.b, intent, 1073741824);
            if (createPendingResult == null) {
                Log.w("WalletClientImpl", "Null pending result returned for onFullWalletLoaded");
                return;
            }
            try {
                createPendingResult.send(i2);
            } catch (Throwable e2) {
                Log.w("WalletClientImpl", "Exception setting pending result", e2);
            }
        }

        public void a(int i, MaskedWallet maskedWallet, Bundle bundle) {
            Activity activity = (Activity) this.a.get();
            if (activity == null) {
                Log.d("WalletClientImpl", "Ignoring onMaskedWalletLoaded, Activity has gone");
                return;
            }
            PendingIntent pendingIntent = null;
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
            }
            ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
            if (connectionResult.a()) {
                try {
                    connectionResult.a(activity, this.b);
                    return;
                } catch (Throwable e) {
                    Log.w("WalletClientImpl", "Exception starting pending intent", e);
                    return;
                }
            }
            int i2;
            Intent intent = new Intent();
            if (connectionResult.b()) {
                i2 = -1;
                intent.putExtra(com.google.android.gms.wallet.e.c, maskedWallet);
            } else {
                i2 = i == 408 ? 0 : 1;
                intent.putExtra(com.google.android.gms.wallet.e.e, i);
            }
            PendingIntent createPendingResult = activity.createPendingResult(this.b, intent, 1073741824);
            if (createPendingResult == null) {
                Log.w("WalletClientImpl", "Null pending result returned for onMaskedWalletLoaded");
                return;
            }
            try {
                createPendingResult.send(i2);
            } catch (Throwable e2) {
                Log.w("WalletClientImpl", "Exception setting pending result", e2);
            }
        }

        public void a(int i, boolean z, Bundle bundle) {
            Activity activity = (Activity) this.a.get();
            if (activity == null) {
                Log.d("WalletClientImpl", "Ignoring onPreAuthorizationDetermined, Activity has gone");
                return;
            }
            Intent intent = new Intent();
            intent.putExtra(com.google.android.gms.wallet.e.b, z);
            PendingIntent createPendingResult = activity.createPendingResult(this.b, intent, 1073741824);
            if (createPendingResult == null) {
                Log.w("WalletClientImpl", "Null pending result returned for onPreAuthorizationDetermined");
                return;
            }
            try {
                createPendingResult.send(-1);
            } catch (Throwable e) {
                Log.w("WalletClientImpl", "Exception setting pending result", e);
            }
        }

        public void a(Status status, boolean z, Bundle bundle) {
            Activity activity = (Activity) this.a.get();
            if (activity == null) {
                Log.d("WalletClientImpl", "Ignoring onIsReadyToPayDetermined, Activity has gone");
                return;
            }
            Intent intent = new Intent();
            intent.putExtra(com.google.android.gms.wallet.e.h, z);
            PendingIntent createPendingResult = activity.createPendingResult(this.b, intent, 1073741824);
            if (createPendingResult == null) {
                Log.w("WalletClientImpl", "Null pending result returned for onIsReadyToPayDetermined");
                return;
            }
            try {
                createPendingResult.send(-1);
            } catch (Throwable e) {
                Log.w("WalletClientImpl", "Exception setting pending result in onIsReadyToPayDetermined", e);
            }
        }

        public void b(int i, boolean z, Bundle bundle) {
            Activity activity = (Activity) this.a.get();
            if (activity == null) {
                Log.d("WalletClientImpl", "Ignoring onIsNewUserDetermined, Activity has gone");
                return;
            }
            Intent intent = new Intent();
            intent.putExtra(com.google.android.gms.wallet.e.g, z);
            PendingIntent createPendingResult = activity.createPendingResult(this.b, intent, 1073741824);
            if (createPendingResult == null) {
                Log.w("WalletClientImpl", "Null pending result returned for onIsNewUserDetermined");
                return;
            }
            try {
                createPendingResult.send(-1);
            } catch (Throwable e) {
                Log.w("WalletClientImpl", "Exception setting pending result", e);
            }
        }
    }

    public fa(Context context, Looper looper, s sVar, com.google.android.gms.common.api.g.b bVar, com.google.android.gms.common.api.g.c cVar, int i, int i2, boolean z) {
        super(context, looper, 4, sVar, bVar, cVar);
        this.a = context;
        this.e = i;
        this.f = sVar.a();
        this.g = i2;
        this.h = z;
    }

    public static Bundle a(int i, String str, String str2, int i2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", i);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", z);
        bundle.putString("androidPackageName", str);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str2, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", i2);
        return bundle;
    }

    private Bundle h() {
        return a(this.e, this.a.getPackageName(), this.f, this.g, this.h);
    }

    public boolean H() {
        return true;
    }

    protected ev a(IBinder iBinder) {
        return com.google.android.gms.internal.ev.a.a(iBinder);
    }

    protected String a() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    public void a(FullWalletRequest fullWalletRequest, int i) {
        ey cVar = new c(this.a, i);
        try {
            ((ev) G()).a(fullWalletRequest, h(), cVar);
        } catch (Throwable e) {
            Log.e("WalletClientImpl", "RemoteException getting full wallet", e);
            cVar.a(8, null, Bundle.EMPTY);
        }
    }

    public void a(IsReadyToPayRequest isReadyToPayRequest, com.google.android.gms.internal.ahl.b<e> bVar) {
        ey bVar2 = new b(bVar);
        try {
            ((ev) G()).a(isReadyToPayRequest, h(), bVar2);
        } catch (Throwable e) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
            bVar2.a(Status.c, false, Bundle.EMPTY);
        }
    }

    public void a(MaskedWalletRequest maskedWalletRequest, int i) {
        Bundle h = h();
        ey cVar = new c(this.a, i);
        try {
            ((ev) G()).a(maskedWalletRequest, h, cVar);
        } catch (Throwable e) {
            Log.e("WalletClientImpl", "RemoteException getting masked wallet", e);
            cVar.a(8, null, Bundle.EMPTY);
        }
    }

    public void a(NotifyTransactionStatusRequest notifyTransactionStatusRequest) {
        try {
            ((ev) G()).a(notifyTransactionStatusRequest, h());
        } catch (RemoteException e) {
        }
    }

    public void a(String str, String str2, int i) {
        Bundle h = h();
        Object cVar = new c(this.a, i);
        try {
            ((ev) G()).a(str, str2, h, cVar);
        } catch (Throwable e) {
            Log.e("WalletClientImpl", "RemoteException changing masked wallet", e);
            cVar.a(8, null, Bundle.EMPTY);
        }
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    public void c(int i) {
        Bundle h = h();
        ey cVar = new c(this.a, i);
        try {
            ((ev) G()).a(h, cVar);
        } catch (Throwable e) {
            Log.e("WalletClientImpl", "RemoteException during checkForPreAuthorization", e);
            cVar.a(8, false, Bundle.EMPTY);
        }
    }

    public void d(int i) {
        Bundle h = h();
        Object cVar = new c(this.a, i);
        try {
            ((ev) G()).b(h, cVar);
        } catch (Throwable e) {
            Log.e("WalletClientImpl", "RemoteException during isNewUser", e);
            cVar.b(8, false, Bundle.EMPTY);
        }
    }
}
