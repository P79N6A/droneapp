package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.fh;
import com.google.android.gms.internal.hj.a;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class bw extends cr {
    private static final String a = eg.REGEX.toString();
    private static final String b = fh.IGNORE_CASE.toString();

    public bw() {
        super(a);
    }

    protected boolean a(String str, String str2, Map<String, a> map) {
        try {
            return Pattern.compile(str2, cw.e((a) map.get(b)).booleanValue() ? 66 : 64).matcher(str).find();
        } catch (PatternSyntaxException e) {
            return false;
        }
    }
}
