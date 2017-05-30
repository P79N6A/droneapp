package it.a.a;

import java.net.Socket;

class c extends l {
    private final b a;

    c(b bVar) {
        this.a = bVar;
    }

    public Socket a() {
        Socket a = super.a();
        if (b.a(this.a)) {
            try {
                a = b.a(this.a, a, a.getInetAddress().getHostName(), a.getPort());
            } catch (Throwable e) {
                a.close();
            } catch (Throwable th) {
            }
        }
        return a;
        throw new j(e);
    }
}
