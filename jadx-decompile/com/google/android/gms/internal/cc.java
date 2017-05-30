package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class cc extends aqg {
    private String a(String str, int i, Set<Character> set) {
        switch (i) {
            case 1:
                try {
                    return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
                } catch (UnsupportedEncodingException e) {
                    return str;
                }
            case 2:
                String replace = str.replace("\\", "\\\\");
                String str2 = replace;
                for (Character ch : set) {
                    CharSequence ch2 = ch.toString();
                    String str3 = "\\";
                    replace = String.valueOf(ch2);
                    str2 = str2.replace(ch2, replace.length() != 0 ? str3.concat(replace) : new String(str3));
                }
                return str2;
            default:
                return str;
        }
    }

    private void a(StringBuilder stringBuilder, String str, int i, Set<Character> set) {
        stringBuilder.append(a(str, i, set));
    }

    private void a(Set<Character> set, String str) {
        for (int i = 0; i < str.length(); i++) {
            set.add(Character.valueOf(str.charAt(i)));
        }
    }

    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        int i = 2;
        int i2 = 1;
        d.b(eaVarArr != null);
        d.b(eaVarArr.length >= 1);
        ea eaVar = eaVarArr[0];
        ea eaVar2 = eaVarArr.length > 1 ? eaVarArr[1] : ee.e;
        String str = "";
        if (eaVarArr.length > 2) {
            str = eaVarArr[2] == ee.e ? "" : aqf.d(eaVarArr[2]);
        }
        String str2 = "=";
        if (eaVarArr.length > 3) {
            str2 = eaVarArr[3] == ee.e ? "=" : aqf.d(eaVarArr[3]);
        }
        Set set = null;
        if (eaVar2 != ee.e) {
            d.b(eaVar2 instanceof ej);
            if ("url".equals(eaVar2.b())) {
                i = 1;
            } else if (!"backslash".equals(eaVar2.b())) {
                return new ej("");
            } else {
                Set hashSet = new HashSet();
                a(hashSet, str);
                a(hashSet, str2);
                hashSet.remove(Character.valueOf(l.f));
                set = hashSet;
            }
        } else {
            i = 0;
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (eaVar instanceof ef) {
            for (ea eaVar3 : (List) ((ef) eaVar3).b()) {
                if (i2 == 0) {
                    stringBuilder.append(str);
                }
                a(stringBuilder, aqf.d(eaVar3), i, set);
                i2 = 0;
            }
        } else if (eaVar3 instanceof eh) {
            Map map = (Map) ((eh) eaVar3).b();
            int i3 = 1;
            for (String str3 : map.keySet()) {
                if (i3 == 0) {
                    stringBuilder.append(str);
                }
                String d = aqf.d((ea) map.get(str3));
                a(stringBuilder, str3, i, set);
                stringBuilder.append(str2);
                a(stringBuilder, d, i, set);
                i3 = 0;
            }
        } else {
            a(stringBuilder, aqf.d(eaVar3), i, set);
        }
        return new ej(stringBuilder.toString());
    }
}
