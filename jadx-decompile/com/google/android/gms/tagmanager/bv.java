package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.fh;
import com.google.android.gms.internal.hj.a;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class bv extends t {
    private static final String a = eg.REGEX_GROUP.toString();
    private static final String b = fh.ARG0.toString();
    private static final String c = fh.ARG1.toString();
    private static final String d = fh.IGNORE_CASE.toString();
    private static final String e = fh.GROUP.toString();

    public bv() {
        super(a, b, c);
    }

    public a a(Map<String, a> map) {
        a aVar = (a) map.get(b);
        a aVar2 = (a) map.get(c);
        if (aVar == null || aVar == cw.g() || aVar2 == null || aVar2 == cw.g()) {
            return cw.g();
        }
        int i = 64;
        if (cw.e((a) map.get(d)).booleanValue()) {
            i = 66;
        }
        a aVar3 = (a) map.get(e);
        int intValue;
        if (aVar3 != null) {
            Long c = cw.c(aVar3);
            if (c == cw.b()) {
                return cw.g();
            }
            intValue = c.intValue();
            if (intValue < 0) {
                return cw.g();
            }
        }
        intValue = 1;
        try {
            CharSequence a = cw.a(aVar);
            Object obj = null;
            Matcher matcher = Pattern.compile(cw.a(aVar2), i).matcher(a);
            if (matcher.find() && matcher.groupCount() >= intValue) {
                obj = matcher.group(intValue);
            }
            return obj == null ? cw.g() : cw.f(obj);
        } catch (PatternSyntaxException e) {
            return cw.g();
        }
    }

    public boolean a() {
        return true;
    }
}
