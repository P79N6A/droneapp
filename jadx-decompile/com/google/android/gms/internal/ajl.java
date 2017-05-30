package com.google.android.gms.internal;

import android.os.Build.VERSION;
import android.util.Log;
import com.google.android.gms.common.internal.ab;
import com.xiaomi.mipush.sdk.Constants;

public class ajl {
    private final String a;
    private final String b;
    private final ab c;
    private final int d;

    private ajl(String str, String str2) {
        this.b = str2;
        this.a = str;
        this.c = new ab(str);
        this.d = a();
    }

    public ajl(String str, String... strArr) {
        this(str, a(strArr));
    }

    private int a() {
        int i;
        if (VERSION.SDK_INT == 23) {
            String str = "log.tag.";
            String valueOf = String.valueOf(this.a);
            str = System.getProperty(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            if (str != null) {
                Object obj = -1;
                switch (str.hashCode()) {
                    case -880503115:
                        if (str.equals("SUPPRESS")) {
                            i = 6;
                            break;
                        }
                        break;
                    case 2251950:
                        if (str.equals("INFO")) {
                            i = 2;
                            break;
                        }
                        break;
                    case 2656902:
                        if (str.equals("WARN")) {
                            i = 3;
                            break;
                        }
                        break;
                    case 64921139:
                        if (str.equals("DEBUG")) {
                            obj = 1;
                            break;
                        }
                        break;
                    case 66247144:
                        if (str.equals("ERROR")) {
                            i = 4;
                            break;
                        }
                        break;
                    case 1069090146:
                        if (str.equals("VERBOSE")) {
                            obj = null;
                            break;
                        }
                        break;
                    case 1940088646:
                        if (str.equals("ASSERT")) {
                            i = 5;
                            break;
                        }
                        break;
                }
                switch (obj) {
                    case null:
                        return 2;
                    case 1:
                        return 3;
                    case 2:
                        return 4;
                    case 3:
                        return 5;
                    case 4:
                        return 6;
                    case 5:
                        return 7;
                    case 6:
                        return Integer.MAX_VALUE;
                    default:
                        return 4;
                }
            }
        }
        i = 2;
        while (7 >= i && !Log.isLoggable(this.a, i)) {
            i++;
        }
        return i;
    }

    private static String a(String... strArr) {
        if (strArr.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        for (String str : strArr) {
            if (stringBuilder.length() > 1) {
                stringBuilder.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            stringBuilder.append(str);
        }
        stringBuilder.append(']').append(l.c);
        return stringBuilder.toString();
    }

    public void a(String str, Object... objArr) {
        if (a(2)) {
            Log.v(this.a, d(str, objArr));
        }
    }

    public boolean a(int i) {
        return this.d <= i;
    }

    public void b(String str, Object... objArr) {
        Log.i(this.a, d(str, objArr));
    }

    public void c(String str, Object... objArr) {
        Log.w(this.a, d(str, objArr));
    }

    protected String d(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(str, objArr);
        }
        return this.b.concat(str);
    }
}
