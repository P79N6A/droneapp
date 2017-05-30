package it.a.a;

public class m extends Exception {
    private static final long serialVersionUID = 1;
    private int a;
    private String b;

    public m(int i) {
        this.a = i;
    }

    public m(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public m(s sVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String[] c = sVar.c();
        for (int i = 0; i < c.length; i++) {
            if (i > 0) {
                stringBuffer.append(System.getProperty("line.separator"));
            }
            stringBuffer.append(c[i]);
        }
        this.a = sVar.a();
        this.b = stringBuffer.toString();
    }

    public int a() {
        return this.a;
    }

    public String getMessage() {
        return this.b;
    }

    public String toString() {
        return new StringBuffer().append(getClass().getName()).append(" [code=").append(this.a).append(", message= ").append(this.b).append("]").toString();
    }
}
