package com.xiaomi.market.sdk;

import android.text.TextUtils;
import java.io.File;

public class q {
    public String aT = "";
    public String aU = "";
    public String aV = "";
    public boolean aW = false;
    public String packageName = "";
    public String sourceDir = "";
    public int versionCode = 0;
    public String versionName = "";

    private q() {
    }

    public static q h(String str) {
        q qVar = new q();
        qVar.packageName = str;
        return qVar;
    }

    public String n() {
        return TextUtils.isEmpty(this.sourceDir) ? null : TextUtils.isEmpty(this.aV) ? b.a(new File(this.sourceDir)) : this.aV;
    }
}
