package com.fimi.kernel.a;

public class g {
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public String f;

    public g(String str) {
        if (str != null) {
            String[] split = str.split("[\\s]+");
            if (split.length == 9) {
                this.d = split[0];
                this.a = split[1];
                this.c = split[2];
                this.e = Integer.parseInt(split[4]);
                this.b = split[8];
                if (a()) {
                    this.f = this.a;
                }
            }
        }
    }

    public boolean a() {
        return "zygote".equals(this.b);
    }

    public boolean b() {
        return this.c.equals(this.f) && this.d.startsWith("app_");
    }

    public String toString() {
        String str = ";";
        str = "";
        return "PsRow ( " + super.toString() + ";" + "pid = " + this.a + ";" + "cmd = " + this.b + ";" + "ppid = " + this.c + ";" + "user = " + this.d + ";" + "mem = " + this.e + " )";
    }
}
