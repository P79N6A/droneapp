package com.google.android.gms.wallet;

import com.google.android.gms.wallet.d.a;
import java.util.Locale;

public final class d$a$a {
    private int a = 3;
    private int b = 0;
    private boolean c = true;

    @Deprecated
    public d$a$a a() {
        this.c = false;
        return this;
    }

    public d$a$a a(int i) {
        if (i == 0 || i == 2 || i == 1 || i == 3) {
            this.a = i;
            return this;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", new Object[]{Integer.valueOf(i)}));
    }

    public d$a$a b(int i) {
        if (i == 0 || i == 1) {
            this.b = i;
            return this;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Invalid theme value %d", new Object[]{Integer.valueOf(i)}));
    }

    public a b() {
        return new a(this, null);
    }
}
