package it.a.a;

public class j extends Exception {
    private static final long serialVersionUID = 1;

    public j(String str) {
        super(str);
    }

    public j(String str, Throwable th) {
        super(str, th);
    }

    public j(Throwable th) {
        super(th);
    }
}
