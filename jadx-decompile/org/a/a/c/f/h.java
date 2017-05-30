package org.a.a.c.f;

import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.a.a.a.c;
import org.a.a.b;
import org.a.a.f.d.a;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

@c
public class h {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private int g;
    private String h;
    private String i;
    private String j;
    private List<NameValuePair> k;
    private String l;
    private String m;
    private String n;

    public h() {
        this.g = -1;
    }

    public h(String str) {
        a(new URI(str));
    }

    public h(URI uri) {
        a(uri);
    }

    private List<NameValuePair> a(String str, Charset charset) {
        return (str == null || str.length() <= 0) ? null : j.a(str, charset);
    }

    private void a(URI uri) {
        this.a = uri.getScheme();
        this.b = uri.getRawSchemeSpecificPart();
        this.c = uri.getRawAuthority();
        this.f = uri.getHost();
        this.g = uri.getPort();
        this.e = uri.getRawUserInfo();
        this.d = uri.getUserInfo();
        this.i = uri.getRawPath();
        this.h = uri.getPath();
        this.j = uri.getRawQuery();
        this.k = a(uri.getRawQuery(), b.e);
        this.n = uri.getRawFragment();
        this.m = uri.getFragment();
    }

    private String c(List<NameValuePair> list) {
        return j.a(list, b.e);
    }

    private String h(String str) {
        return j.b(str, b.e);
    }

    private String i(String str) {
        return j.d(str, b.e);
    }

    private String j(String str) {
        return j.c(str, b.e);
    }

    private static String k(String str) {
        if (str == null) {
            return null;
        }
        int i = 0;
        while (i < str.length() && str.charAt(i) == '/') {
            i++;
        }
        return i > 1 ? str.substring(i - 1) : str;
    }

    private String m() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.a != null) {
            stringBuilder.append(this.a).append(':');
        }
        if (this.b != null) {
            stringBuilder.append(this.b);
        } else {
            if (this.c != null) {
                stringBuilder.append("//").append(this.c);
            } else if (this.f != null) {
                stringBuilder.append("//");
                if (this.e != null) {
                    stringBuilder.append(this.e).append("@");
                } else if (this.d != null) {
                    stringBuilder.append(h(this.d)).append("@");
                }
                if (a.e(this.f)) {
                    stringBuilder.append("[").append(this.f).append("]");
                } else {
                    stringBuilder.append(this.f);
                }
                if (this.g >= 0) {
                    stringBuilder.append(":").append(this.g);
                }
            }
            if (this.i != null) {
                stringBuilder.append(k(this.i));
            } else if (this.h != null) {
                stringBuilder.append(i(k(this.h)));
            }
            if (this.j != null) {
                stringBuilder.append("?").append(this.j);
            } else if (this.k != null) {
                stringBuilder.append("?").append(c(this.k));
            } else if (this.l != null) {
                stringBuilder.append("?").append(j(this.l));
            }
        }
        if (this.n != null) {
            stringBuilder.append("#").append(this.n);
        } else if (this.m != null) {
            stringBuilder.append("#").append(j(this.m));
        }
        return stringBuilder.toString();
    }

    public URI a() {
        return new URI(m());
    }

    public h a(int i) {
        if (i < 0) {
            i = -1;
        }
        this.g = i;
        this.b = null;
        this.c = null;
        return this;
    }

    public h a(String str) {
        this.a = str;
        return this;
    }

    public h a(String str, String str2) {
        return b(str + ':' + str2);
    }

    public h a(List<NameValuePair> list) {
        if (this.k == null) {
            this.k = new ArrayList();
        } else {
            this.k.clear();
        }
        this.k.addAll(list);
        this.j = null;
        this.b = null;
        this.l = null;
        return this;
    }

    public h a(NameValuePair... nameValuePairArr) {
        if (this.k == null) {
            this.k = new ArrayList();
        } else {
            this.k.clear();
        }
        for (Object add : nameValuePairArr) {
            this.k.add(add);
        }
        this.j = null;
        this.b = null;
        this.l = null;
        return this;
    }

    public h b() {
        this.k = null;
        this.l = null;
        this.j = null;
        this.b = null;
        return this;
    }

    public h b(String str) {
        this.d = str;
        this.b = null;
        this.c = null;
        this.e = null;
        return this;
    }

    public h b(String str, String str2) {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        this.k.add(new BasicNameValuePair(str, str2));
        this.j = null;
        this.b = null;
        this.l = null;
        return this;
    }

    public h b(List<NameValuePair> list) {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        this.k.addAll(list);
        this.j = null;
        this.b = null;
        this.l = null;
        return this;
    }

    public h c() {
        this.k = null;
        this.j = null;
        this.b = null;
        return this;
    }

    public h c(String str) {
        this.f = str;
        this.b = null;
        this.c = null;
        return this;
    }

    public h c(String str, String str2) {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        if (!this.k.isEmpty()) {
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                if (((NameValuePair) it.next()).getName().equals(str)) {
                    it.remove();
                }
            }
        }
        this.k.add(new BasicNameValuePair(str, str2));
        this.j = null;
        this.b = null;
        this.l = null;
        return this;
    }

    public h d(String str) {
        this.h = str;
        this.b = null;
        this.i = null;
        return this;
    }

    public boolean d() {
        return this.a != null;
    }

    @Deprecated
    public h e(String str) {
        this.k = a(str, b.e);
        this.l = null;
        this.j = null;
        this.b = null;
        return this;
    }

    public boolean e() {
        return this.h == null;
    }

    public String f() {
        return this.a;
    }

    public h f(String str) {
        this.l = str;
        this.j = null;
        this.b = null;
        this.k = null;
        return this;
    }

    public String g() {
        return this.d;
    }

    public h g(String str) {
        this.m = str;
        this.n = null;
        return this;
    }

    public String h() {
        return this.f;
    }

    public int i() {
        return this.g;
    }

    public String j() {
        return this.h;
    }

    public List<NameValuePair> k() {
        return this.k != null ? new ArrayList(this.k) : new ArrayList();
    }

    public String l() {
        return this.m;
    }

    public String toString() {
        return m();
    }
}
