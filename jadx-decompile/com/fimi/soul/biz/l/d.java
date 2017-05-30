package com.fimi.soul.biz.l;

import com.xiaomi.infra.galaxy.fds.android.auth.GalaxyFDSCredential;
import com.xiaomi.infra.galaxy.fds.android.util.Args;
import com.xiaomi.mipush.sdk.Constants;

public class d {
    public static final int a = 50000;
    public static final int b = 3;
    public static final int c = 4096;
    public static final int d = 50000;
    private static final String e = "http://";
    private static final String f = "https://";
    private static final String g = "files";
    private static final String h = "cdn";
    private static final String i = ".fds.api.xiaomi.com";
    private static final String j = ".fds-ssl.api.xiaomi.com";
    private int k = 50000;
    private int l = 50000;
    private int m = 0;
    private int n = 0;
    private int o = 3;
    private int p = 4096;
    private GalaxyFDSCredential q;
    private String r = "";
    private boolean s = true;
    private boolean t = false;
    private boolean u = true;
    private boolean v = false;
    private String w = "";

    public int a() {
        return this.o;
    }

    public String a(boolean z, String str) {
        return str.isEmpty() ? z ? h : "files" : z ? str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + h : str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + "files";
    }

    public String a(boolean z, boolean z2) {
        return (z && z2) ? j : i;
    }

    public void a(int i) {
        Args.notNegative(i, "max retry times");
        this.o = i;
    }

    public void a(int i, int i2) {
        this.m = i;
        this.n = i2;
    }

    public void a(GalaxyFDSCredential galaxyFDSCredential) {
        Args.notNull(galaxyFDSCredential, "credential");
        this.q = galaxyFDSCredential;
    }

    @Deprecated
    public void a(String str) {
    }

    public void a(boolean z) {
        this.s = z;
    }

    public int b() {
        return this.k;
    }

    public d b(int i) {
        a(i);
        return this;
    }

    public d b(int i, int i2) {
        a(i, i2);
        return this;
    }

    public d b(GalaxyFDSCredential galaxyFDSCredential) {
        a(galaxyFDSCredential);
        return this;
    }

    @Deprecated
    public d b(String str) {
        return this;
    }

    public d b(boolean z) {
        a(z);
        return this;
    }

    public int c() {
        return this.l;
    }

    public void c(int i) {
        this.k = i;
    }

    @Deprecated
    public void c(String str) {
    }

    public void c(boolean z) {
        this.t = z;
    }

    public d d(int i) {
        c(i);
        return this;
    }

    @Deprecated
    public d d(String str) {
        return this;
    }

    public d d(boolean z) {
        c(z);
        return this;
    }

    public int[] d() {
        return new int[]{this.m, this.n};
    }

    public int e() {
        return this.p;
    }

    public void e(int i) {
        this.l = i;
    }

    public void e(String str) {
        this.r = str;
    }

    public void e(boolean z) {
        this.u = z;
    }

    public d f(int i) {
        e(i);
        return this;
    }

    public d f(String str) {
        e(str);
        return this;
    }

    public d f(boolean z) {
        e(z);
        return this;
    }

    public GalaxyFDSCredential f() {
        return this.q;
    }

    @Deprecated
    public String g() {
        return o();
    }

    public void g(int i) {
        Args.positive(i, "upload part size");
        this.p = i;
    }

    void g(String str) {
        this.w = str;
    }

    void g(boolean z) {
        this.v = z;
    }

    public d h(int i) {
        g(i);
        return this;
    }

    d h(String str) {
        g(str);
        return this;
    }

    d h(boolean z) {
        g(z);
        return this;
    }

    @Deprecated
    public String h() {
        return p();
    }

    public String i() {
        return this.r;
    }

    String i(boolean z) {
        if (this.v) {
            return this.w;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.s ? f : e);
        stringBuilder.append(a(z, this.r));
        stringBuilder.append(a(z, this.s));
        return stringBuilder.toString();
    }

    public boolean j() {
        return this.s;
    }

    public boolean k() {
        return this.t;
    }

    public boolean l() {
        return this.u;
    }

    boolean m() {
        return this.v;
    }

    String n() {
        return this.w;
    }

    String o() {
        return i(false);
    }

    String p() {
        return i(true);
    }

    String q() {
        return i(this.u);
    }

    String r() {
        return i(this.t);
    }
}
