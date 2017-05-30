package org.c.a.e;

class g$1 extends g {
    final /* synthetic */ Object a;
    final /* synthetic */ String b;

    g$1(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public Object a() {
        return this.a;
    }

    public String b() {
        String str;
        if (this.a == null) {
            str = "null";
        } else {
            try {
                str = String.format("\"%s\"", new Object[]{this.a});
            } catch (Throwable th) {
                str = String.format("[toString() threw %s: %s]", new Object[]{th.getClass().getSimpleName(), th.getMessage()});
            }
        }
        return String.format("%s <from %s>", new Object[]{str, this.b});
    }

    public String toString() {
        return String.format("[%s]", new Object[]{this.a});
    }
}
