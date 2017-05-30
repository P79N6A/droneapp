package com.google.android.gms.games.internal;

import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.common.util.k;

public abstract class GamesDowngradeableSafeParcel extends DowngradeableSafeParcel {
    protected static boolean b(Integer num) {
        return num == null ? false : k.a(num.intValue());
    }
}
