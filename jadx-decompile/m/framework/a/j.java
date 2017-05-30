package m.framework.a;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class j extends c {
    private StringBuilder a = new StringBuilder();

    protected InputStream a() {
        return new ByteArrayInputStream(this.a.toString().getBytes("utf-8"));
    }

    public j a(String str) {
        this.a.append(str);
        return this;
    }

    protected long b() {
        return (long) this.a.toString().getBytes("utf-8").length;
    }

    public String toString() {
        return this.a.toString();
    }
}
