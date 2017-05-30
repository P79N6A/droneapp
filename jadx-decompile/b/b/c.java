package b.b;

public class c {
    private static final String a = "...";
    private static final String b = "]";
    private static final String c = "[";
    private int d;
    private String e;
    private String f;
    private int g;
    private int h;

    public c(int i, String str, String str2) {
        this.d = i;
        this.e = str;
        this.f = str2;
    }

    private void a() {
        this.g = 0;
        int min = Math.min(this.e.length(), this.f.length());
        while (this.g < min && this.e.charAt(this.g) == this.f.charAt(this.g)) {
            this.g++;
        }
    }

    private String b(String str) {
        String str2 = c + str.substring(this.g, (str.length() - this.h) + 1) + b;
        if (this.g > 0) {
            str2 = c() + str2;
        }
        return this.h > 0 ? str2 + d() : str2;
    }

    private void b() {
        int length = this.e.length() - 1;
        int length2 = this.f.length() - 1;
        while (length2 >= this.g && length >= this.g && this.e.charAt(length) == this.f.charAt(length2)) {
            length2--;
            length--;
        }
        this.h = this.e.length() - length;
    }

    private String c() {
        return (this.g > this.d ? a : "") + this.e.substring(Math.max(0, this.g - this.d), this.g);
    }

    private String d() {
        return this.e.substring((this.e.length() - this.h) + 1, Math.min(((this.e.length() - this.h) + 1) + this.d, this.e.length())) + ((this.e.length() - this.h) + 1 < this.e.length() - this.d ? a : "");
    }

    private boolean e() {
        return this.e.equals(this.f);
    }

    public String a(String str) {
        if (this.e == null || this.f == null || e()) {
            return a.f(str, this.e, this.f);
        }
        a();
        b();
        return a.f(str, b(this.e), b(this.f));
    }
}
