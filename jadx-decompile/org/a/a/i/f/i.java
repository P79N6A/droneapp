package org.a.a.i.f;

import java.io.InterruptedIOException;
import org.a.a.a.b;

@b
public class i extends InterruptedIOException {
    private static final long serialVersionUID = 4973849966012490112L;

    public i(String str) {
        super(str);
    }

    public i(String str, Throwable th) {
        super(str);
        if (th != null) {
            initCause(th);
        }
    }
}
