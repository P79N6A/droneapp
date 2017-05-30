package org.b;

public class n extends a {
    private final Appendable b;

    public n() {
        this(new StringBuilder());
    }

    public n(Appendable appendable) {
        this.b = appendable;
    }

    public static String b(m mVar) {
        return new n().a(mVar).toString();
    }

    public static String c(m mVar) {
        return b(mVar);
    }

    protected void a(char c) {
        try {
            this.b.append(c);
        } catch (Throwable e) {
            throw new RuntimeException("Could not write description", e);
        }
    }

    protected void b(String str) {
        try {
            this.b.append(str);
        } catch (Throwable e) {
            throw new RuntimeException("Could not write description", e);
        }
    }

    public String toString() {
        return this.b.toString();
    }
}
