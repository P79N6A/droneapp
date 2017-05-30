package com.baidu.tts.l;

import android.content.Context;
import com.baidu.tts.client.model.BasicHandler;
import com.baidu.tts.client.model.Conditions;
import com.baidu.tts.client.model.DownloadHandler;
import com.baidu.tts.client.model.LibEngineParams;
import com.baidu.tts.client.model.ModelBags;
import com.baidu.tts.client.model.ModelFileBags;
import com.baidu.tts.d.b;
import com.baidu.tts.database.d;
import com.baidu.tts.f.g;
import com.baidu.tts.l.a.h;
import com.baidu.tts.tools.DataTool;
import com.baidu.tts.tools.MD5;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class a {
    private Context a;
    private com.baidu.tts.database.a b;
    private d c;
    private h d;
    private com.baidu.tts.d.d e;

    public a(Context context) {
        this.a = context;
        g();
    }

    private void g() {
        this.b = new com.baidu.tts.database.a(this);
        this.c = new d(this);
        this.d = new h(this);
        this.e = new com.baidu.tts.d.d();
        this.e.a(this);
        this.e.a();
    }

    public int a(int i, int i2) {
        return this.c.a(i, i2);
    }

    public BasicHandler<ModelBags> a(Conditions conditions) {
        return this.d.a(conditions);
    }

    public BasicHandler<ModelBags> a(Conditions conditions, boolean z) {
        return this.d.a(conditions, z);
    }

    public BasicHandler<ModelFileBags> a(Set<String> set) {
        return this.d.a((Set) set);
    }

    public DownloadHandler a(b bVar) {
        return this.e.a(bVar);
    }

    public LibEngineParams a() {
        return this.d.a();
    }

    public String a(String str, String str2) {
        return this.b.a(str, str2);
    }

    public void a(String str, String str2, String str3) {
        this.c.a(str, str2, str3);
    }

    public boolean a(String str) {
        Map d = this.b.d(str);
        if (DataTool.isMapEmpty(d)) {
            return false;
        }
        String str2 = (String) d.get(g.ABS_PATH.b());
        String str3 = (String) d.get(g.LENGTH.b());
        String str4 = (String) d.get(g.MD5.b());
        File file = new File(str2);
        return file.exists() ? file.length() != Long.parseLong(str3) ? false : MD5.getInstance().getBigFileMd5(file).equalsIgnoreCase(str4) : false;
    }

    public BasicHandler<ModelBags> b() {
        return this.d.b();
    }

    public BasicHandler<ModelFileBags> b(Set<String> set) {
        return this.d.b(set);
    }

    public boolean b(String str) {
        Map e = this.b.e(str);
        if (DataTool.isMapEmpty(e)) {
            return false;
        }
        return a((String) e.get(g.TEXT_DATA_ID.b())) && a((String) e.get(g.SPEECH_DATA_ID.b()));
    }

    public void c() {
        this.e.b();
    }

    public void c(String str) {
        this.c.a(str);
    }

    public Context d() {
        return this.a;
    }

    public com.baidu.tts.database.a e() {
        return this.b;
    }

    public Map<String, ArrayList> f() {
        return this.c.a();
    }
}
