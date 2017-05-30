package com.google.firebase.c;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.wallet.e;
import com.google.firebase.c;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class g extends c {
    public static final int a = -13000;
    public static final int b = -13010;
    public static final int c = -13011;
    public static final int d = -13012;
    public static final int e = -13013;
    public static final int f = -13020;
    public static final int g = -13021;
    public static final int h = -13030;
    public static final int i = -13031;
    public static final int j = -13040;
    static IOException k = new IOException("The operation was canceled.");
    static final /* synthetic */ boolean l = (!g.class.desiredAssertionStatus());
    private final int m;
    private final int n;
    private String o;
    private Throwable p;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    g(int i, Throwable th, int i2) {
        this.o = a(i);
        this.p = th;
        this.m = i;
        this.n = i2;
        String str = this.o;
        String valueOf = String.valueOf(Integer.toString(this.m));
        String valueOf2 = String.valueOf(Integer.toString(this.n));
        Log.e("StorageException", new StringBuilder(((String.valueOf(str).length() + 52) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append("StorageException has occurred.\n").append(str).append("\n Code: ").append(valueOf).append(" HttpResult: ").append(valueOf2).toString());
        if (this.p != null) {
            Log.e("StorageException", this.p.getMessage(), this.p);
        }
    }

    g(Status status) {
        this(b(status), null, 0);
    }

    g(@Nullable Throwable th, int i) {
        this(b(th, i), th, i);
    }

    @NonNull
    public static g a(@NonNull Status status) {
        d.a((Object) status);
        d.b(!status.f());
        return new g(status);
    }

    @NonNull
    public static g a(@NonNull Throwable th) {
        g a = a(th, 0);
        if (l || a != null) {
            return a;
        }
        throw new AssertionError();
    }

    @Nullable
    public static g a(@Nullable Throwable th, int i) {
        return th instanceof g ? (g) th : (b(i) && th == null) ? null : new g(th, i);
    }

    static String a(int i) {
        switch (i) {
            case j /*-13040*/:
                return "The operation was cancelled.";
            case i /*-13031*/:
                return "Object has a checksum which does not match. Please retry the operation.";
            case h /*-13030*/:
                return "The operation retry limit has been exceeded.";
            case g /*-13021*/:
                return "User does not have permission to access this object.";
            case f /*-13020*/:
                return "User is not authenticated, please authenticate using Firebase Authentication and try again.";
            case e /*-13013*/:
                return "Quota for bucket exceeded, please view quota on www.firebase.google.com/storage.";
            case d /*-13012*/:
                return "Project does not exist.";
            case c /*-13011*/:
                return "Bucket does not exist.";
            case b /*-13010*/:
                return "Object does not exist at location.";
            case a /*-13000*/:
                return "An unknown error occurred, please check the HTTP result code and inner exception for server response.";
            default:
                return "An unknown error occurred, please check the HTTP result code and inner exception for server response.";
        }
    }

    private static int b(Status status) {
        return status.g() ? j : status == Status.d ? h : a;
    }

    private static int b(@Nullable Throwable th, int i) {
        if (th == k) {
            return j;
        }
        switch (i) {
            case -2:
                return h;
            case 401:
                return f;
            case 403:
                return g;
            case e.j /*404*/:
                return b;
            default:
                return a;
        }
    }

    private static boolean b(int i) {
        return i == 0 || (i >= 200 && i < 300);
    }

    public int a() {
        return this.m;
    }

    public int b() {
        return this.n;
    }

    public boolean c() {
        return a() == h;
    }

    public Throwable getCause() {
        return this.p == this ? null : this.p;
    }

    public String getMessage() {
        return this.o;
    }
}
