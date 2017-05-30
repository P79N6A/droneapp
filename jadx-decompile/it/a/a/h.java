package it.a.a;

import android.support.v4.view.accessibility.AccessibilityEventCompat;
import java.net.InetSocketAddress;
import java.net.Socket;

public abstract class h {
    protected int a;
    protected int b;
    protected int c;
    private boolean d;
    private Socket e;

    protected h() {
        this(false);
    }

    protected h(boolean z) {
        this.a = 10;
        this.b = 10;
        this.c = 10;
        String property = System.getProperty(p.d);
        if ("true".equalsIgnoreCase(property) || "yes".equalsIgnoreCase(property) || "1".equals(property)) {
            this.d = true;
        } else if ("false".equalsIgnoreCase(property) || "no".equalsIgnoreCase(property) || "0".equals(property)) {
            this.d = false;
        } else {
            this.d = z;
        }
    }

    protected Socket a(String str, int i) {
        try {
            this.e = new Socket();
            this.e.setKeepAlive(true);
            this.e.setSoTimeout(this.b * 1000);
            this.e.setSoLinger(true, this.c);
            this.e.connect(new InetSocketAddress(str, i), this.a * 1000);
            Socket socket = this.e;
            return socket;
        } finally {
            this.e = null;
        }
    }

    public void a(int i) {
        this.a = i;
    }

    public void a(boolean z) {
        this.d = z;
    }

    boolean a() {
        return this.d;
    }

    protected Socket b(String str, int i) {
        Socket socket = new Socket();
        socket.setSoTimeout(this.b * 1000);
        socket.setSoLinger(true, this.c);
        socket.setReceiveBufferSize(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
        socket.setSendBufferSize(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
        socket.connect(new InetSocketAddress(str, i), this.a * 1000);
        return socket;
    }

    public void b() {
        if (this.e != null) {
            try {
                this.e.close();
            } catch (Throwable th) {
            }
        }
    }

    public void b(int i) {
        this.b = i;
    }

    public abstract Socket c(String str, int i);

    public void c(int i) {
        this.c = i;
    }

    public abstract Socket d(String str, int i);
}
