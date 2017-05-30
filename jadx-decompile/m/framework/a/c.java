package m.framework.a;

import java.io.InputStream;
import org.apache.http.entity.InputStreamEntity;

public abstract class c {
    protected abstract InputStream a();

    protected abstract long b();

    public InputStreamEntity c() {
        return new InputStreamEntity(a(), b());
    }
}
