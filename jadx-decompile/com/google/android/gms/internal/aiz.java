package com.google.android.gms.internal;

import android.os.Binder;

public abstract class aiz<T> {
    private static final Object c = new Object();
    private static a d = null;
    private static int e = 0;
    private static String f = "com.google.android.providers.gsf.permission.READ_GSERVICES";
    protected final String a;
    protected final T b;
    private T g = null;

    class AnonymousClass1 extends aiz<Boolean> {
        AnonymousClass1(String str, Boolean bool) {
            super(str, bool);
        }

        protected /* synthetic */ Object a(String str) {
            return b(str);
        }

        protected Boolean b(String str) {
            return null.a(this.a, (Boolean) this.b);
        }
    }

    class AnonymousClass2 extends aiz<Long> {
        AnonymousClass2(String str, Long l) {
            super(str, l);
        }

        protected /* synthetic */ Object a(String str) {
            return b(str);
        }

        protected Long b(String str) {
            return null.a(this.a, (Long) this.b);
        }
    }

    class AnonymousClass3 extends aiz<Integer> {
        AnonymousClass3(String str, Integer num) {
            super(str, num);
        }

        protected /* synthetic */ Object a(String str) {
            return b(str);
        }

        protected Integer b(String str) {
            return null.a(this.a, (Integer) this.b);
        }
    }

    class AnonymousClass4 extends aiz<Float> {
        AnonymousClass4(String str, Float f) {
            super(str, f);
        }

        protected /* synthetic */ Object a(String str) {
            return b(str);
        }

        protected Float b(String str) {
            return null.a(this.a, (Float) this.b);
        }
    }

    class AnonymousClass5 extends aiz<String> {
        AnonymousClass5(String str, String str2) {
            super(str, str2);
        }

        protected /* synthetic */ Object a(String str) {
            return b(str);
        }

        protected String b(String str) {
            return null.a(this.a, (String) this.b);
        }
    }

    private interface a {
        Boolean a(String str, Boolean bool);

        Float a(String str, Float f);

        Integer a(String str, Integer num);

        Long a(String str, Long l);

        String a(String str, String str2);
    }

    protected aiz(String str, T t) {
        this.a = str;
        this.b = t;
    }

    public static aiz<Float> a(String str, Float f) {
        return new AnonymousClass4(str, f);
    }

    public static aiz<Integer> a(String str, Integer num) {
        return new AnonymousClass3(str, num);
    }

    public static aiz<Long> a(String str, Long l) {
        return new AnonymousClass2(str, l);
    }

    public static aiz<String> a(String str, String str2) {
        return new AnonymousClass5(str, str2);
    }

    public static aiz<Boolean> a(String str, boolean z) {
        return new AnonymousClass1(str, Boolean.valueOf(z));
    }

    public final T a() {
        T a;
        long clearCallingIdentity;
        try {
            a = a(this.a);
        } catch (SecurityException e) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            a = a(this.a);
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
        return a;
    }

    protected abstract T a(String str);
}
