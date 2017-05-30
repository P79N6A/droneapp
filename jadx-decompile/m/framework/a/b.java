package m.framework.a;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class b extends c {
    private File a;

    protected InputStream a() {
        return new FileInputStream(this.a);
    }

    public void a(File file) {
        this.a = file;
    }

    public void a(String str) {
        this.a = new File(str);
    }

    protected long b() {
        return this.a.length();
    }

    public String toString() {
        return this.a.toString();
    }
}
