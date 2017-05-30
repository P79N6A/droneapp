package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.a.a.f.c.l;

public abstract class r {
    public static final r a = a((CharSequence) "\t\n\u000b\f\r     　 ᠎ ").a(a(' ', ' '));
    public static final r b = a((CharSequence) "\t\n\u000b\f\r     　").a(a(' ', ' ')).a(a(' ', ' '));
    public static final r c = a('\u0000', '');
    public static final r d;
    public static final r e = a('\t', l.a).a(a('\u001c', l.c)).a(a(' ')).a(a('᠎')).a(a(' ', ' ')).a(a(' ', '​')).a(a(' ', ' ')).a(a(' ')).a(a('　'));
    public static final r f = new r() {
        public boolean b(char c) {
            return Character.isDigit(c);
        }
    };
    public static final r g = new r() {
        public boolean b(char c) {
            return Character.isLetter(c);
        }
    };
    public static final r h = new r() {
        public boolean b(char c) {
            return Character.isLetterOrDigit(c);
        }
    };
    public static final r i = new r() {
        public boolean b(char c) {
            return Character.isUpperCase(c);
        }
    };
    public static final r j = new r() {
        public boolean b(char c) {
            return Character.isLowerCase(c);
        }
    };
    public static final r k = a('\u0000', '\u001f').a(a('', ''));
    public static final r l = a('\u0000', l.c).a(a('', ' ')).a(a('­')).a(a('؀', '؃')).a(a((CharSequence) "۝܏ ឴឵᠎")).a(a(' ', '‏')).a(a(' ', ' ')).a(a(' ', '⁤')).a(a('⁪', '⁯')).a(a('　')).a(a('?', '')).a(a((CharSequence) "﻿￹￺￻"));
    public static final r m = a('\u0000', 'ӹ').a(a('־')).a(a('א', 'ת')).a(a('׳')).a(a('״')).a(a('؀', 'ۿ')).a(a('ݐ', 'ݿ')).a(a('฀', '๿')).a(a('Ḁ', '₯')).a(a('℀', '℺')).a(a('ﭐ', '﷿')).a(a('ﹰ', '﻿')).a(a('｡', 'ￜ'));
    public static final r n = new r() {
        public r a(r rVar) {
            d.a((Object) rVar);
            return this;
        }

        public boolean b(char c) {
            return true;
        }

        public boolean b(CharSequence charSequence) {
            d.a((Object) charSequence);
            return true;
        }
    };
    public static final r o = new r() {
        public r a(r rVar) {
            return (r) d.a((Object) rVar);
        }

        public boolean b(char c) {
            return false;
        }

        public boolean b(CharSequence charSequence) {
            return charSequence.length() == 0;
        }
    };

    class AnonymousClass3 extends r {
        final /* synthetic */ char p;

        AnonymousClass3(char c) {
            this.p = c;
        }

        public r a(r rVar) {
            return rVar.b(this.p) ? rVar : super.a(rVar);
        }

        public boolean b(char c) {
            return c == this.p;
        }
    }

    class AnonymousClass4 extends r {
        final /* synthetic */ char p;
        final /* synthetic */ char q;

        AnonymousClass4(char c, char c2) {
            this.p = c;
            this.q = c2;
        }

        public boolean b(char c) {
            return c == this.p || c == this.q;
        }
    }

    class AnonymousClass5 extends r {
        final /* synthetic */ char[] p;

        AnonymousClass5(char[] cArr) {
            this.p = cArr;
        }

        public boolean b(char c) {
            return Arrays.binarySearch(this.p, c) >= 0;
        }
    }

    class AnonymousClass6 extends r {
        final /* synthetic */ char p;
        final /* synthetic */ char q;

        AnonymousClass6(char c, char c2) {
            this.p = c;
            this.q = c2;
        }

        public boolean b(char c) {
            return this.p <= c && c <= this.q;
        }
    }

    private static class a extends r {
        List<r> p;

        a(List<r> list) {
            this.p = list;
        }

        public r a(r rVar) {
            List arrayList = new ArrayList(this.p);
            arrayList.add((r) d.a((Object) rVar));
            return new a(arrayList);
        }

        public boolean b(char c) {
            for (r b : this.p) {
                if (b.b(c)) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        r a = a('0', '9');
        r rVar = a;
        for (char c : "٠۰߀०০੦૦୦௦౦೦൦๐໐༠၀႐០᠐᥆᧐᭐᮰᱀᱐꘠꣐꤀꩐０".toCharArray()) {
            rVar = rVar.a(a(c, (char) (c + 9)));
        }
        d = rVar;
    }

    public static r a(char c) {
        return new AnonymousClass3(c);
    }

    public static r a(char c, char c2) {
        d.b(c2 >= c);
        return new AnonymousClass6(c, c2);
    }

    public static r a(CharSequence charSequence) {
        switch (charSequence.length()) {
            case 0:
                return o;
            case 1:
                return a(charSequence.charAt(0));
            case 2:
                return new AnonymousClass4(charSequence.charAt(0), charSequence.charAt(1));
            default:
                char[] toCharArray = charSequence.toString().toCharArray();
                Arrays.sort(toCharArray);
                return new AnonymousClass5(toCharArray);
        }
    }

    public r a(r rVar) {
        return new a(Arrays.asList(new r[]{this, (r) d.a((Object) rVar)}));
    }

    public abstract boolean b(char c);

    public boolean b(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!b(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }
}
