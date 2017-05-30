package it.a.a;

public class s {
    private int a = 0;
    private String[] b;

    s(int i, String[] strArr) {
        this.a = i;
        this.b = strArr;
    }

    public int a() {
        return this.a;
    }

    public boolean b() {
        int i = this.a - 200;
        return i >= 0 && i < 100;
    }

    public String[] c() {
        return this.b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getClass().getName());
        stringBuffer.append(" [code=");
        stringBuffer.append(this.a);
        stringBuffer.append(", message=");
        for (int i = 0; i < this.b.length; i++) {
            if (i > 0) {
                stringBuffer.append(" ");
            }
            stringBuffer.append(this.b[i]);
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
