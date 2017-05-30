package org.a.a.b;

import java.util.Queue;
import org.a.a.a.c;
import org.a.a.o.a;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;

@c
public class d {
    private b a = b.a;
    private AuthScheme b;
    private AuthScope c;
    private Credentials d;
    private Queue<a> e;

    public void a() {
        this.a = b.a;
        this.e = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public void a(Queue<a> queue) {
        a.a(queue, "Queue of auth options");
        this.e = queue;
        this.b = null;
        this.d = null;
    }

    public void a(b bVar) {
        if (bVar == null) {
            bVar = b.a;
        }
        this.a = bVar;
    }

    @Deprecated
    public void a(AuthScheme authScheme) {
        if (authScheme == null) {
            a();
        } else {
            this.b = authScheme;
        }
    }

    public void a(AuthScheme authScheme, Credentials credentials) {
        a.a(authScheme, "Auth scheme");
        a.a(credentials, "Credentials");
        this.b = authScheme;
        this.d = credentials;
        this.e = null;
    }

    @Deprecated
    public void a(AuthScope authScope) {
        this.c = authScope;
    }

    @Deprecated
    public void a(Credentials credentials) {
        this.d = credentials;
    }

    public b b() {
        return this.a;
    }

    public AuthScheme c() {
        return this.b;
    }

    public Credentials d() {
        return this.d;
    }

    public Queue<a> e() {
        return this.e;
    }

    public boolean f() {
        return (this.e == null || this.e.isEmpty()) ? false : true;
    }

    @Deprecated
    public void g() {
        a();
    }

    @Deprecated
    public boolean h() {
        return this.b != null;
    }

    @Deprecated
    public AuthScope i() {
        return this.c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("state:").append(this.a).append(";");
        if (this.b != null) {
            stringBuilder.append("auth scheme:").append(this.b.getSchemeName()).append(";");
        }
        if (this.d != null) {
            stringBuilder.append("credentials present");
        }
        return stringBuilder.toString();
    }
}
