package com.fimi.soul.utils;

import android.content.res.AssetManager;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class b {
    public static float a(float f, String str) {
        double d = 0.0d;
        if (str.equalsIgnoreCase("m")) {
            d = ((double) f) * 3.2808399d;
        } else if (str.equalsIgnoreCase("ft")) {
            d = ((double) f) * 0.3048d;
        } else if (str.equalsIgnoreCase("mph")) {
            d = ((double) f) * 2.236936d;
        }
        return new BigDecimal(d).setScale(1, 4).floatValue();
    }

    public static String a(double d, String str) {
        double d2 = 0.0d;
        if (str.equalsIgnoreCase("m")) {
            d2 = 3.2808399d * d;
        } else if (str.equalsIgnoreCase("ft")) {
            d2 = 0.3048d * d;
        } else if (str.equalsIgnoreCase("mph")) {
            d2 = 2.236936d * d;
        }
        return new DecimalFormat("###.00").format(d2);
    }

    public static boolean a(AssetManager assetManager, String str, String str2) {
        for (String equals : assetManager.list(str)) {
            if (equals.equals(str2)) {
                return true;
            }
        }
        return false;
    }
}
