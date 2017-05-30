package com.google.android.gms.location;

import com.google.android.gms.common.api.Status;

@Deprecated
public final class p {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 1000;
    public static final int d = 1001;
    public static final int e = 1002;

    private p() {
    }

    public static int a(int i) {
        return (i < 0 || i > 1) ? (1000 > i || i > 1002) ? 1 : i : i;
    }

    public static Status b(int i) {
        switch (i) {
            case 1:
                i = 13;
                break;
        }
        return new Status(i);
    }
}
