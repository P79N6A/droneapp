package com.google.ads;

import com.google.android.gms.ads.c;

@Deprecated
public final class a {
    public static final String a = "0.0.0";
    public static final String b = "Ads";
    public static final String c = c.i;

    public enum a {
        INVALID_REQUEST("Invalid Ad request."),
        NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
        NETWORK_ERROR("A network error occurred."),
        INTERNAL_ERROR("There was an internal error.");
        
        private final String e;

        private a(String str) {
            this.e = str;
        }

        public String toString() {
            return this.e;
        }
    }

    public enum b {
        UNKNOWN,
        MALE,
        FEMALE
    }

    private a() {
    }
}
