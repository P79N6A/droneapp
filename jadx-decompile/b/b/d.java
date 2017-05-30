package b.b;

public class d extends b {
    private static final int a = 20;
    private static final long serialVersionUID = 1;
    private String b;
    private String c;

    public d(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public String a() {
        return this.c;
    }

    public String b() {
        return this.b;
    }

    public String getMessage() {
        return new c(20, this.b, this.c).a(super.getMessage());
    }
}
