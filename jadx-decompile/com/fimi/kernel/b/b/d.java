package com.fimi.kernel.b.b;

final class d {
    private int a;
    private long b;
    private long c;
    private long d;
    private String e;

    public d(int i, long j, long j2, long j3, String str) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = str;
    }

    public String a() {
        return this.e;
    }

    public void a(int i) {
        this.a = i;
    }

    public void a(long j) {
        this.b = j;
    }

    public void a(String str) {
        this.e = str;
    }

    public int b() {
        return this.a;
    }

    public void b(long j) {
        this.c = j;
    }

    public long c() {
        return this.b;
    }

    public void c(long j) {
        this.d = j;
    }

    public long d() {
        return this.c;
    }

    public long e() {
        return this.d;
    }

    public String toString() {
        return "DownloadThreadInfo{threadId=" + this.a + ", startPos=" + this.b + ", endPos=" + this.c + ", compeleteSize=" + this.d + ", url='" + this.e + '\'' + '}';
    }
}
