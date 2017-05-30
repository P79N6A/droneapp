package org.c;

public class i extends AssertionError {
    private static final int a = 20;
    private static final long serialVersionUID = 1;
    private String b;
    private String c;

    private static class a {
        private static final String a = "...";
        private static final String b = "]";
        private static final String c = "[";
        private final int d;
        private final String e;
        private final String f;

        private class a {
            final /* synthetic */ a a;
            private final String b;
            private final String c;

            private a(a aVar) {
                this.a = aVar;
                this.b = aVar.a();
                this.c = aVar.b(this.b);
            }

            private String a(String str) {
                return a.c + str.substring(this.b.length(), str.length() - this.c.length()) + a.b;
            }

            public String a() {
                return a(this.a.e);
            }

            public String b() {
                return a(this.a.f);
            }

            public String c() {
                return this.b.length() <= this.a.d ? this.b : a.a + this.b.substring(this.b.length() - this.a.d);
            }

            public String d() {
                return this.c.length() <= this.a.d ? this.c : this.c.substring(0, this.a.d) + a.a;
            }
        }

        public a(int i, String str, String str2) {
            this.d = i;
            this.e = str;
            this.f = str2;
        }

        private String a() {
            int min = Math.min(this.e.length(), this.f.length());
            for (int i = 0; i < min; i++) {
                if (this.e.charAt(i) != this.f.charAt(i)) {
                    return this.e.substring(0, i);
                }
            }
            return this.e.substring(0, min);
        }

        private String b(String str) {
            int i = 0;
            int min = Math.min(this.e.length() - str.length(), this.f.length() - str.length()) - 1;
            while (i <= min && this.e.charAt((this.e.length() - 1) - i) == this.f.charAt((this.f.length() - 1) - i)) {
                i++;
            }
            return this.e.substring(this.e.length() - i);
        }

        public String a(String str) {
            if (this.e == null || this.f == null || this.e.equals(this.f)) {
                return c.e(str, this.e, this.f);
            }
            a aVar = new a();
            String c = aVar.c();
            String d = aVar.d();
            return c.e(str, c + aVar.a() + d, c + aVar.b() + d);
        }
    }

    public i(String str, String str2, String str3) {
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
        return new a(20, this.b, this.c).a(super.getMessage());
    }
}
