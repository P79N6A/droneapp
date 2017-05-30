package it.a.a;

import java.util.Date;

public class n {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    private String d = null;
    private String e = null;
    private Date f = null;
    private long g = -1;
    private int h;

    public Date a() {
        return this.f;
    }

    public void a(int i) {
        this.h = i;
    }

    public void a(long j) {
        this.g = j;
    }

    public void a(String str) {
        this.d = str;
    }

    public void a(Date date) {
        this.f = date;
    }

    public String b() {
        return this.d;
    }

    public void b(String str) {
        this.e = str;
    }

    public int c() {
        return this.h;
    }

    public long d() {
        return this.g;
    }

    public String e() {
        return this.e;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getClass().getName());
        stringBuffer.append(" [name=");
        stringBuffer.append(this.d);
        stringBuffer.append(", type=");
        if (this.h == 0) {
            stringBuffer.append("FILE");
        } else if (this.h == 1) {
            stringBuffer.append("DIRECTORY");
        } else if (this.h == 2) {
            stringBuffer.append("LINK");
            stringBuffer.append(", link=");
            stringBuffer.append(this.e);
        } else {
            stringBuffer.append("UNKNOWN");
        }
        stringBuffer.append(", size=");
        stringBuffer.append(this.g);
        stringBuffer.append(", modifiedDate=");
        stringBuffer.append(this.f);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
