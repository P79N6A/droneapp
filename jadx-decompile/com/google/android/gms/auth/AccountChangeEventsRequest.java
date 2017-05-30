package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Creator<AccountChangeEventsRequest> CREATOR = new g();
    final int a;
    int b;
    @Deprecated
    String c;
    Account d;

    public AccountChangeEventsRequest() {
        this.a = 1;
    }

    AccountChangeEventsRequest(int i, int i2, String str, Account account) {
        this.a = i;
        this.b = i2;
        this.c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.d = account;
        } else {
            this.d = new Account(str, "com.google");
        }
    }

    public AccountChangeEventsRequest a(int i) {
        this.b = i;
        return this;
    }

    public AccountChangeEventsRequest a(Account account) {
        this.d = account;
        return this;
    }

    @Deprecated
    public AccountChangeEventsRequest a(String str) {
        this.c = str;
        return this;
    }

    @Deprecated
    public String a() {
        return this.c;
    }

    public Account b() {
        return this.d;
    }

    public int c() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i);
    }
}
