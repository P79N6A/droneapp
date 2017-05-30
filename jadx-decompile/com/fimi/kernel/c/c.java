package com.fimi.kernel.c;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.JavaType;

public class c implements a {
    public static final ObjectMapper a = new ObjectMapper();
    private static c b = null;
    private static final String e = "BeautifulKernel_SPStoreManager";
    private Gson c = new Gson();
    private SharedPreferences d = com.fimi.kernel.c.a().getSharedPreferences(e, 0);

    private c() {
    }

    public static synchronized c a() {
        c cVar;
        synchronized (c.class) {
            if (b == null) {
                b = new c();
            }
            cVar = b;
        }
        return cVar;
    }

    public <T> T a(String str, Class<?> cls) {
        T t = null;
        try {
            String string = this.d.getString(str, null);
            if (string != null) {
                t = this.c.fromJson(string, (Class) cls);
            }
        } catch (Exception e) {
        }
        return t;
    }

    public String a(String str) {
        return this.d.getString(str, null);
    }

    public void a(String str, int i) {
        Editor edit = this.d.edit();
        edit.putInt(str, i);
        edit.commit();
    }

    public void a(String str, long j) {
        Editor edit = this.d.edit();
        edit.putLong(str, j);
        edit.commit();
    }

    public void a(String str, Object obj) {
        Editor edit = this.d.edit();
        edit.putString(str, this.c.toJson(obj, obj.getClass()));
        edit.commit();
    }

    public void a(String str, String str2) {
        Editor edit = this.d.edit();
        edit.putString(str, str2);
        edit.commit();
    }

    public <T> void a(String str, List<T> list) {
        Editor edit = this.d.edit();
        edit.putString(str, this.c.toJson((Object) list));
        edit.commit();
    }

    public void a(String str, boolean z) {
        Editor edit = this.d.edit();
        edit.putBoolean(str, z);
        edit.commit();
    }

    public int b(String str) {
        return this.d.getInt(str, 0);
    }

    public List b(String str, Class<?> cls) {
        JavaType constructCollectionType = a.getTypeFactory().constructCollectionType(ArrayList.class, (Class) cls);
        try {
            String string = this.d.getString(str, null);
            if (string != null) {
                return (List) a.readValue(string, constructCollectionType);
            }
        } catch (Exception e) {
        }
        return null;
    }

    public long c(String str) {
        return this.d.getLong(str, 0);
    }

    public boolean d(String str) {
        return this.d.getBoolean(str, false);
    }
}
