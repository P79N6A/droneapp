package b.b;

public class b extends AssertionError {
    private static final long serialVersionUID = 1;

    public b(String str) {
        super(a(str));
    }

    private static String a(String str) {
        return str == null ? "" : str;
    }
}
