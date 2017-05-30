package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.l;

public class a extends com.google.android.gms.common.internal.ac.a {
    int a;

    public static Account a(ac acVar) {
        Account account = null;
        if (acVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = acVar.a();
            } catch (RemoteException e) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return account;
    }

    public Account a() {
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.a) {
            if (l.c(null, callingUid)) {
                this.a = callingUid;
            } else {
                throw new SecurityException("Caller is not GooglePlayServices");
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        Account account = null;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return account.equals(account);
    }
}
