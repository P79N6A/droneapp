package m.framework.a;

public class d<T> {
    public final String a;
    public final T b;

    public d(String str, T t) {
        this.a = str;
        this.b = t;
    }

    public String toString() {
        return this.a + " = " + this.b;
    }
}
