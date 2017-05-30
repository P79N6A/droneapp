package org.a.a.o;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.apache.http.util.VersionInfo;

public class g {
    public static final String a = "UNAVAILABLE";
    public static final String b = "version.properties";
    public static final String c = "info.module";
    public static final String d = "info.release";
    public static final String e = "info.timestamp";
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;

    protected g(String str, String str2, String str3, String str4, String str5) {
        a.a((Object) str, "Package identifier");
        this.f = str;
        if (str2 == null) {
            str2 = a;
        }
        this.g = str2;
        if (str3 == null) {
            str3 = a;
        }
        this.h = str3;
        if (str4 == null) {
            str4 = a;
        }
        this.i = str4;
        if (str5 == null) {
            str5 = a;
        }
        this.j = str5;
    }

    public static String a(String str, String str2, Class<?> cls) {
        g a = a(str2, cls.getClassLoader());
        return str + "/" + (a != null ? a.c() : a) + " (Java 1.5 minimum; Java/" + System.getProperty("java.version") + ")";
    }

    public static g a(String str, ClassLoader classLoader) {
        Map properties;
        a.a((Object) str, "Package identifier");
        if (classLoader == null) {
            classLoader = Thread.currentThread().getContextClassLoader();
        }
        InputStream resourceAsStream;
        try {
            resourceAsStream = classLoader.getResourceAsStream(str.replace('.', '/') + "/" + b);
            if (resourceAsStream != null) {
                properties = new Properties();
                properties.load(resourceAsStream);
                try {
                    resourceAsStream.close();
                } catch (IOException e) {
                }
            } else {
                properties = null;
            }
        } catch (IOException e2) {
            properties = null;
        } catch (Throwable th) {
            resourceAsStream.close();
        }
        return properties != null ? a(str, properties, classLoader) : null;
    }

    protected static g a(String str, Map<?, ?> map, ClassLoader classLoader) {
        String str2;
        String str3;
        String str4;
        String str5 = null;
        a.a((Object) str, "Package identifier");
        if (map != null) {
            String str6 = (String) map.get(c);
            String str7 = (str6 == null || str6.length() >= 1) ? str6 : null;
            str6 = (String) map.get(d);
            str2 = (str6 == null || (str6.length() >= 1 && !str6.equals("${pom.version}"))) ? str6 : null;
            str6 = (String) map.get(e);
            if (str6 == null || (str6.length() >= 1 && !str6.equals("${mvn.timestamp}"))) {
                str3 = str6;
                str4 = str2;
                str2 = str7;
            } else {
                str3 = null;
                str4 = str2;
                str2 = str7;
            }
        } else {
            str3 = null;
            str4 = null;
            str2 = null;
        }
        if (classLoader != null) {
            str5 = classLoader.toString();
        }
        return new g(str, str2, str4, str3, str5);
    }

    public static VersionInfo[] a(String[] strArr, ClassLoader classLoader) {
        a.a((Object) strArr, "Package identifier array");
        List arrayList = new ArrayList(strArr.length);
        for (String a : strArr) {
            g a2 = a(a, classLoader);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return (VersionInfo[]) arrayList.toArray(new VersionInfo[arrayList.size()]);
    }

    public final String a() {
        return this.f;
    }

    public final String b() {
        return this.g;
    }

    public final String c() {
        return this.h;
    }

    public final String d() {
        return this.i;
    }

    public final String e() {
        return this.j;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(((((this.f.length() + 20) + this.g.length()) + this.h.length()) + this.i.length()) + this.j.length());
        stringBuilder.append("VersionInfo(").append(this.f).append(':').append(this.g);
        if (!a.equals(this.h)) {
            stringBuilder.append(':').append(this.h);
        }
        if (!a.equals(this.i)) {
            stringBuilder.append(':').append(this.i);
        }
        stringBuilder.append(')');
        if (!a.equals(this.j)) {
            stringBuilder.append('@').append(this.j);
        }
        return stringBuilder.toString();
    }
}
