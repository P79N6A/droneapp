package com.baidu.tts.d.b;

import com.baidu.tts.client.model.DownloadHandler;

public class a {
    private static volatile a a = null;
    private e b = e.a();
    private com.baidu.tts.database.a c;

    private a() {
    }

    public static a a() {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a();
                }
            }
        }
        return a;
    }

    public b a(String str) {
        return this.b.c(str);
    }

    public void a(DownloadHandler downloadHandler) {
        this.b.a(downloadHandler);
    }

    public void a(com.baidu.tts.database.a aVar) {
        this.c = aVar;
    }

    public void a(String str, String str2) {
        this.b.a(str, str2);
    }

    public d b(String str) {
        return this.b.a(str);
    }

    public com.baidu.tts.database.a b() {
        return this.c;
    }

    public c c(String str) {
        return this.b.b(str);
    }

    public void c() {
        this.b.b();
    }

    public long d(String str) {
        return this.b.e(str);
    }

    public int e(String str) {
        return this.b.f(str);
    }
}
