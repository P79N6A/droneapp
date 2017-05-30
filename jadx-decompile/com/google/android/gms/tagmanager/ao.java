package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.fh;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class ao extends t {
    private static final String a = eg.JOINER.toString();
    private static final String b = fh.ARG0.toString();
    private static final String c = fh.ITEM_SEPARATOR.toString();
    private static final String d = fh.KEY_VALUE_SEPARATOR.toString();
    private static final String e = fh.ESCAPE.toString();

    private enum a {
        NONE,
        URL,
        BACKSLASH
    }

    public ao() {
        super(a, b);
    }

    private String a(String str, a aVar, Set<Character> set) {
        switch (aVar) {
            case URL:
                try {
                    return da.a(str);
                } catch (Throwable e) {
                    aw.a("Joiner: unsupported encoding", e);
                    return str;
                }
            case BACKSLASH:
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

    private void a(StringBuilder stringBuilder, String str, a aVar, Set<Character> set) {
        stringBuilder.append(a(str, aVar, set));
    }

    private void a(Set<Character> set, String str) {
        for (int i = 0; i < str.length(); i++) {
            set.add(Character.valueOf(str.charAt(i)));
        }
    }

    public com.google.android.gms.internal.hj.a a(Map<String, com.google.android.gms.internal.hj.a> map) {
        com.google.android.gms.internal.hj.a aVar = (com.google.android.gms.internal.hj.a) map.get(b);
        if (aVar == null) {
            return cw.g();
        }
        a aVar2;
        com.google.android.gms.internal.hj.a aVar3 = (com.google.android.gms.internal.hj.a) map.get(c);
        String a = aVar3 != null ? cw.a(aVar3) : "";
        aVar3 = (com.google.android.gms.internal.hj.a) map.get(d);
        String a2 = aVar3 != null ? cw.a(aVar3) : "=";
        a aVar4 = a.NONE;
        aVar3 = (com.google.android.gms.internal.hj.a) map.get(e);
        Set set;
        if (aVar3 != null) {
            String a3 = cw.a(aVar3);
            if ("url".equals(a3)) {
                aVar2 = a.URL;
                set = null;
            } else if ("backslash".equals(a3)) {
                aVar2 = a.BACKSLASH;
                set = new HashSet();
                a(set, a);
                a(set, a2);
                set.remove(Character.valueOf(l.f));
            } else {
                a = "Joiner: unsupported escape type: ";
                String valueOf = String.valueOf(a3);
                aw.a(valueOf.length() != 0 ? a.concat(valueOf) : new String(a));
                return cw.g();
            }
        }
        set = null;
        aVar2 = aVar4;
        StringBuilder stringBuilder = new StringBuilder();
        switch (aVar.a) {
            case 2:
                Object obj = 1;
                com.google.android.gms.internal.hj.a[] aVarArr = aVar.c;
                int length = aVarArr.length;
                int i = 0;
                while (i < length) {
                    com.google.android.gms.internal.hj.a aVar5 = aVarArr[i];
                    if (obj == null) {
                        stringBuilder.append(a);
                    }
                    a(stringBuilder, cw.a(aVar5), aVar2, set);
                    i++;
                    obj = null;
                }
                break;
            case 3:
                for (int i2 = 0; i2 < aVar.d.length; i2++) {
                    if (i2 > 0) {
                        stringBuilder.append(a);
                    }
                    String a4 = cw.a(aVar.d[i2]);
                    String a5 = cw.a(aVar.e[i2]);
                    a(stringBuilder, a4, aVar2, set);
                    stringBuilder.append(a2);
                    a(stringBuilder, a5, aVar2, set);
                }
                break;
            default:
                a(stringBuilder, cw.a(aVar), aVar2, set);
                break;
        }
        return cw.f(stringBuilder.toString());
    }

    public boolean a() {
        return true;
    }
}
