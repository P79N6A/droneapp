package it.a.a;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import javax.net.ssl.SSLSocketFactory;
import org.a.a.f.c.l;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;

public class f {
    private ArrayList a = new ArrayList();
    private Socket b = null;
    private String c = null;
    private u d = null;
    private v e = null;

    public f(Socket socket, String str) {
        this.b = socket;
        this.c = str;
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        this.d = new u(inputStream, str);
        this.e = new v(outputStream, str);
    }

    private String d() {
        String a = this.d.a();
        if (a == null) {
            throw new IOException("FTPConnection closed");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((g) it.next()).b(a);
        }
        return a;
    }

    public void a() {
        try {
            this.b.close();
        } catch (Exception e) {
        }
    }

    public void a(g gVar) {
        this.a.add(gVar);
    }

    public void a(String str) {
        this.e.b(str);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(str);
        }
    }

    public void a(SSLSocketFactory sSLSocketFactory) {
        this.b = sSLSocketFactory.createSocket(this.b, this.b.getInetAddress().getHostName(), this.b.getPort(), true);
        InputStream inputStream = this.b.getInputStream();
        OutputStream outputStream = this.b.getOutputStream();
        this.d = new u(inputStream, this.c);
        this.e = new v(outputStream, this.c);
    }

    public void b(g gVar) {
        this.a.remove(gVar);
    }

    public void b(String str) {
        this.c = str;
        this.d.a(str);
        this.e.a(str);
    }

    public g[] b() {
        int size = this.a.size();
        g[] gVarArr = new g[size];
        for (int i = 0; i < size; i++) {
            gVarArr[i] = (g) this.a.get(i);
        }
        return gVarArr;
    }

    public s c() {
        int i;
        int i2 = 0;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (true) {
            String d = d();
            if (d.trim().length() != 0) {
                String substring = d.startsWith("\n") ? d.substring(1) : d;
                int length = substring.length();
                if (i3 != 0 || length >= 3) {
                    int parseInt;
                    try {
                        parseInt = Integer.parseInt(substring.substring(0, 3));
                    } catch (Exception e) {
                        if (i3 == 0) {
                            throw new o();
                        }
                        parseInt = 0;
                    }
                    if (i3 == 0 || parseInt == 0 || parseInt == i3) {
                        i = i3 == 0 ? parseInt : i3;
                        if (parseInt > 0) {
                            if (length <= 3) {
                                if (length == 3) {
                                    break;
                                }
                                arrayList.add(substring);
                            } else {
                                char charAt = substring.charAt(3);
                                arrayList.add(substring.substring(4, length));
                                if (charAt == l.c) {
                                    break;
                                } else if (charAt == SignatureVisitor.SUPER) {
                                    i3 = i;
                                } else {
                                    throw new o();
                                }
                            }
                        }
                        arrayList.add(substring);
                        i3 = i;
                    } else {
                        throw new o();
                    }
                }
                throw new o();
            }
        }
        int size = arrayList.size();
        String[] strArr = new String[size];
        while (i2 < size) {
            strArr[i2] = (String) arrayList.get(i2);
            i2++;
        }
        return new s(i, strArr);
    }
}
