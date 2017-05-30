package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public final class PasswordSpecification extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final i CREATOR = new i();
    public static final PasswordSpecification a = new a().a(12, 16).a("abcdefghijkmnopqrstxyzABCDEFGHJKLMNPQRSTXY3456789").a("abcdefghijkmnopqrstxyz", 1).a("ABCDEFGHJKLMNPQRSTXY", 1).a("3456789", 1).a();
    public static final PasswordSpecification b = new a().a(12, 16).a("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890").a("abcdefghijklmnopqrstuvwxyz", 1).a("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 1).a("1234567890", 1).a();
    final int c;
    final String d;
    final List<String> e;
    final List<Integer> f;
    final int g;
    final int h;
    private final int[] i = a();
    private final Random j = new SecureRandom();

    public static class a {
        private final TreeSet<Character> a = new TreeSet();
        private final List<String> b = new ArrayList();
        private final List<Integer> c = new ArrayList();
        private int d = 12;
        private int e = 16;

        private TreeSet<Character> a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                throw new b(String.valueOf(str2).concat(" cannot be null or empty"));
            }
            TreeSet<Character> treeSet = new TreeSet();
            for (char c : str.toCharArray()) {
                if (PasswordSpecification.b(c, 32, 126)) {
                    throw new b(String.valueOf(str2).concat(" must only contain ASCII printable characters"));
                }
                treeSet.add(Character.valueOf(c));
            }
            return treeSet;
        }

        private void b() {
            int i = 0;
            for (Integer intValue : this.c) {
                i = intValue.intValue() + i;
            }
            if (i > this.e) {
                throw new b("required character count cannot be greater than the max password size");
            }
        }

        private void c() {
            boolean[] zArr = new boolean[95];
            for (String toCharArray : this.b) {
                for (char c : toCharArray.toCharArray()) {
                    if (zArr[c - 32]) {
                        throw new b("character " + c + " occurs in more than one required character set");
                    }
                    zArr[c - 32] = true;
                }
            }
        }

        public a a(int i, int i2) {
            if (i < 1) {
                throw new b("minimumSize must be at least 1");
            } else if (i > i2) {
                throw new b("maximumSize must be greater than or equal to minimumSize");
            } else {
                this.d = i;
                this.e = i2;
                return this;
            }
        }

        public a a(@NonNull String str) {
            this.a.addAll(a(str, "allowedChars"));
            return this;
        }

        public a a(@NonNull String str, int i) {
            if (i < 1) {
                throw new b("count must be at least 1");
            }
            this.b.add(PasswordSpecification.b(a(str, "requiredChars")));
            this.c.add(Integer.valueOf(i));
            return this;
        }

        public PasswordSpecification a() {
            if (this.a.isEmpty()) {
                throw new b("no allowed characters specified");
            }
            b();
            c();
            return new PasswordSpecification(1, PasswordSpecification.b(this.a), this.b, this.c, this.d, this.e);
        }
    }

    public static class b extends Error {
        public b(String str) {
            super(str);
        }
    }

    PasswordSpecification(int i, String str, List<String> list, List<Integer> list2, int i2, int i3) {
        this.c = i;
        this.d = str;
        this.e = Collections.unmodifiableList(list);
        this.f = Collections.unmodifiableList(list2);
        this.g = i2;
        this.h = i3;
    }

    private int a(char c) {
        return c - 32;
    }

    private int[] a() {
        int[] iArr = new int[95];
        Arrays.fill(iArr, -1);
        int i = 0;
        for (String toCharArray : this.e) {
            for (char a : toCharArray.toCharArray()) {
                iArr[a(a)] = i;
            }
            i++;
        }
        return iArr;
    }

    private static String b(Collection<Character> collection) {
        char[] cArr = new char[collection.size()];
        int i = 0;
        for (Character charValue : collection) {
            int i2 = i + 1;
            cArr[i] = charValue.charValue();
            i = i2;
        }
        return new String(cArr);
    }

    private static boolean b(int i, int i2, int i3) {
        return i < i2 || i > i3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.a(this, parcel, i);
    }
}
