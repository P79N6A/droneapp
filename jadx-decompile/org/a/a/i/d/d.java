package org.a.a.i.d;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.a.a.a.c;
import org.a.a.o.a;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.SetCookie;

@c
public class d implements Serializable, Cloneable, ClientCookie, SetCookie {
    private static final long serialVersionUID = -3869795591041535538L;
    private final String a;
    private Map<String, String> b = new HashMap();
    private String c;
    private String d;
    private String e;
    private Date f;
    private String g;
    private boolean h;
    private int i;

    public d(String str, String str2) {
        a.a((Object) str, "Name");
        this.a = str;
        this.c = str2;
    }

    public void a(String str, String str2) {
        this.b.put(str, str2);
    }

    public Object clone() {
        d dVar = (d) super.clone();
        dVar.b = new HashMap(this.b);
        return dVar;
    }

    public boolean containsAttribute(String str) {
        return this.b.get(str) != null;
    }

    public String getAttribute(String str) {
        return (String) this.b.get(str);
    }

    public String getComment() {
        return this.d;
    }

    public String getCommentURL() {
        return null;
    }

    public String getDomain() {
        return this.e;
    }

    public Date getExpiryDate() {
        return this.f;
    }

    public String getName() {
        return this.a;
    }

    public String getPath() {
        return this.g;
    }

    public int[] getPorts() {
        return null;
    }

    public String getValue() {
        return this.c;
    }

    public int getVersion() {
        return this.i;
    }

    public boolean isExpired(Date date) {
        a.a((Object) date, "Date");
        return this.f != null && this.f.getTime() <= date.getTime();
    }

    public boolean isPersistent() {
        return this.f != null;
    }

    public boolean isSecure() {
        return this.h;
    }

    public void setComment(String str) {
        this.d = str;
    }

    public void setDomain(String str) {
        if (str != null) {
            this.e = str.toLowerCase(Locale.ENGLISH);
        } else {
            this.e = null;
        }
    }

    public void setExpiryDate(Date date) {
        this.f = date;
    }

    public void setPath(String str) {
        this.g = str;
    }

    public void setSecure(boolean z) {
        this.h = z;
    }

    public void setValue(String str) {
        this.c = str;
    }

    public void setVersion(int i) {
        this.i = i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[version: ");
        stringBuilder.append(Integer.toString(this.i));
        stringBuilder.append("]");
        stringBuilder.append("[name: ");
        stringBuilder.append(this.a);
        stringBuilder.append("]");
        stringBuilder.append("[value: ");
        stringBuilder.append(this.c);
        stringBuilder.append("]");
        stringBuilder.append("[domain: ");
        stringBuilder.append(this.e);
        stringBuilder.append("]");
        stringBuilder.append("[path: ");
        stringBuilder.append(this.g);
        stringBuilder.append("]");
        stringBuilder.append("[expiry: ");
        stringBuilder.append(this.f);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
