package com.android.volley;

import android.content.Intent;

public class a extends u {
    private Intent b;

    public a(Intent intent) {
        this.b = intent;
    }

    public a(j jVar) {
        super(jVar);
    }

    public a(String str) {
        super(str);
    }

    public a(String str, Exception exception) {
        super(str, exception);
    }

    public Intent a() {
        return this.b;
    }

    public String getMessage() {
        return this.b != null ? "User needs to (re)enter credentials." : super.getMessage();
    }
}
