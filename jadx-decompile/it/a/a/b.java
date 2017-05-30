package it.a.a;

import com.fimi.kernel.utils.f;
import com.xiaomi.mipush.sdk.Constants;
import it.a.a.a.d;
import it.a.a.c.c;
import it.a.a.c.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetAddress;
import java.net.Socket;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;
import javax.net.ssl.SSLSocketFactory;

public class b {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    private static final int j = 65536;
    private static final DateFormat k = new SimpleDateFormat(f.e);
    private static final Pattern l = Pattern.compile("\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3}");
    private static final Pattern m = Pattern.compile("\"/.*\"");
    private boolean A = true;
    private int B = 0;
    private int C = 0;
    private long D = 0;
    private a E;
    private long F;
    private boolean G = false;
    private String H = null;
    private boolean I = false;
    private boolean J = false;
    private boolean K = false;
    private boolean L = false;
    private boolean M = false;
    private boolean N = false;
    private boolean O = false;
    private InputStream P = null;
    private OutputStream Q = null;
    private boolean R = false;
    private boolean S = false;
    private Object T = new Object();
    private Object U = new Object();
    private f V = null;
    private h n = new d();
    private SSLSocketFactory o = ((SSLSocketFactory) SSLSocketFactory.getDefault());
    private ArrayList p = new ArrayList();
    private ArrayList q = new ArrayList();
    private t r = it.a.a.b.a.a();
    private r s = null;
    private String t = null;
    private int u = 0;
    private int v = 0;
    private String w;
    private String x;
    private boolean y = false;
    private boolean z = false;

    private class a extends Thread {
        private final b a;

        private a(b bVar) {
            this.a = bVar;
        }

        a(b bVar, c cVar) {
            this(bVar);
        }

        public void run() {
            synchronized (b.d(this.a)) {
                if (b.e(this.a) <= 0 && b.f(this.a) > 0) {
                    b.a(this.a, System.currentTimeMillis() + b.f(this.a));
                }
                while (!Thread.interrupted() && b.f(this.a) > 0) {
                    long e = b.e(this.a) - System.currentTimeMillis();
                    if (e > 0) {
                        try {
                            b.d(this.a).wait(e);
                        } catch (InterruptedException e2) {
                        }
                    }
                    if (System.currentTimeMillis() >= b.e(this.a)) {
                        try {
                            this.a.x();
                        } catch (Throwable th) {
                        }
                    }
                }
            }
        }
    }

    public b() {
        a(new e());
        a(new it.a.a.c.a());
        a(new it.a.a.c.b());
        a(new it.a.a.c.d());
        a(new c());
    }

    private void E() {
        synchronized (this.T) {
            this.J = false;
            this.G = false;
            this.K = false;
            this.L = false;
            this.N = false;
            this.V.a("FEAT");
            s c = this.V.c();
            if (c.a() == e.v) {
                String[] c2 = c.c();
                for (int i = 1; i < c2.length - 1; i++) {
                    String toUpperCase = c2[i].trim().toUpperCase();
                    if ("REST STREAM".equalsIgnoreCase(toUpperCase)) {
                        this.G = true;
                    } else if ("UTF8".equalsIgnoreCase(toUpperCase)) {
                        this.J = true;
                        this.V.b("UTF-8");
                    } else if ("MLSD".equalsIgnoreCase(toUpperCase)) {
                        this.K = true;
                    } else if ("MODE Z".equalsIgnoreCase(toUpperCase) || toUpperCase.startsWith("MODE Z ")) {
                        this.L = true;
                    }
                }
            }
            if (this.J) {
                this.V.a("OPTS UTF8 ON");
                this.V.c();
            }
            if (this.v == 1 || this.v == 2) {
                this.V.a("PBSZ 0");
                this.V.c();
                this.V.a("PROT P");
                if (this.V.c().b()) {
                    this.N = true;
                }
            }
        }
    }

    private i F() {
        s c;
        if (this.L && this.I) {
            if (!this.M) {
                this.V.a("MODE Z");
                c = this.V.c();
                O();
                if (c.b()) {
                    this.M = true;
                }
            }
        } else if (this.M) {
            this.V.a("MODE S");
            c = this.V.c();
            O();
            if (c.b()) {
                this.M = false;
            }
        }
        return this.A ? H() : G();
    }

    private i G() {
        i cVar = new c(this);
        int c = cVar.c();
        int i = c >>> 8;
        c &= 255;
        int[] J = J();
        this.V.a(new StringBuffer().append("PORT ").append(J[0]).append(Constants.ACCEPT_TIME_SEPARATOR_SP).append(J[1]).append(Constants.ACCEPT_TIME_SEPARATOR_SP).append(J[2]).append(Constants.ACCEPT_TIME_SEPARATOR_SP).append(J[3]).append(Constants.ACCEPT_TIME_SEPARATOR_SP).append(i).append(Constants.ACCEPT_TIME_SEPARATOR_SP).append(c).toString());
        s c2 = this.V.c();
        O();
        if (c2.b()) {
            return cVar;
        }
        cVar.b();
        try {
            cVar.a().close();
        } catch (Throwable th) {
        }
        throw new m(c2);
    }

    private i H() {
        this.V.a("PASV");
        s c = this.V.c();
        O();
        if (c.b()) {
            int i;
            String substring;
            String[] c2 = c.c();
            for (i = 0; i < c2.length; i++) {
                Matcher matcher = l.matcher(c2[i]);
                if (matcher.find()) {
                    substring = c2[i].substring(matcher.start(), matcher.end());
                    break;
                }
            }
            substring = null;
            if (substring == null) {
                throw new o();
            }
            StringTokenizer stringTokenizer = new StringTokenizer(substring, Constants.ACCEPT_TIME_SEPARATOR_SP);
            i = Integer.parseInt(stringTokenizer.nextToken());
            int parseInt = Integer.parseInt(stringTokenizer.nextToken());
            int parseInt2 = Integer.parseInt(stringTokenizer.nextToken());
            int parseInt3 = Integer.parseInt(stringTokenizer.nextToken());
            int parseInt4 = Integer.parseInt(stringTokenizer.nextToken());
            return new d(this, new StringBuffer().append(i).append(".").append(parseInt).append(".").append(parseInt2).append(".").append(parseInt3).toString(), Integer.parseInt(stringTokenizer.nextToken()) | (parseInt4 << 8));
        }
        throw new m(c);
    }

    private String I() {
        return this.H != null ? this.H : this.J ? "UTF-8" : System.getProperty("file.encoding");
    }

    private int[] J() {
        int[] K = K();
        return K == null ? L() : K;
    }

    private int[] K() {
        Object obj = null;
        int[] iArr = null;
        String property = System.getProperty(p.b);
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ".");
            if (stringTokenizer.countTokens() == 4) {
                int[] iArr2 = new int[4];
                int i = 0;
                while (i < 4) {
                    try {
                        iArr2[i] = Integer.parseInt(stringTokenizer.nextToken());
                    } catch (NumberFormatException e) {
                        iArr2[i] = -1;
                    }
                    if (iArr2[i] < 0 || iArr2[i] > 255) {
                        break;
                    }
                    i++;
                }
                int i2 = 1;
                if (obj != null) {
                    iArr = iArr2;
                }
            }
            if (obj == null) {
                System.err.println(new StringBuffer().append("WARNING: invalid value \"").append(property).append("\" for the ").append(p.b).append(" system property. The value should ").append("be in the x.x.x.x form.").toString());
            }
        }
        return iArr;
    }

    private int[] L() {
        byte[] address = InetAddress.getLocalHost().getAddress();
        int i = address[0] & 255;
        int i2 = address[1] & 255;
        int i3 = address[2] & 255;
        int i4 = address[3] & 255;
        return new int[]{i, i2, i3, i4};
    }

    private void M() {
        if (this.D > 0) {
            this.E = new a(this, null);
            this.E.start();
        }
    }

    private void N() {
        if (this.E != null) {
            this.E.interrupt();
            this.E = null;
        }
    }

    private void O() {
        if (this.E != null) {
            this.F = System.currentTimeMillis() + this.D;
        }
    }

    static long a(b bVar, long j) {
        bVar.F = j;
        return j;
    }

    static Socket a(b bVar, Socket socket, String str, int i) {
        return bVar.a(socket, str, i);
    }

    private Socket a(Socket socket, String str, int i) {
        return this.o.createSocket(socket, str, i, true);
    }

    static boolean a(b bVar) {
        return bVar.N;
    }

    static h b(b bVar) {
        return bVar.n;
    }

    static String c(b bVar) {
        return bVar.t;
    }

    static Object d(b bVar) {
        return bVar.T;
    }

    static long e(b bVar) {
        return bVar.F;
    }

    static long f(b bVar) {
        return bVar.D;
    }

    private int m(String str) {
        int lastIndexOf = str.lastIndexOf(46) + 1;
        int length = str.length();
        if (lastIndexOf <= 0 || lastIndexOf >= length - 1) {
            return 2;
        }
        return this.r.a(str.substring(lastIndexOf, length).toLowerCase()) ? 1 : 2;
    }

    public String[] A() {
        String[] c;
        synchronized (this.T) {
            if (!this.y) {
                throw new IllegalStateException("Client not connected");
            } else if (this.z) {
                this.V.a("HELP");
                s c2 = this.V.c();
                O();
                if (c2.b()) {
                    c = c2.c();
                } else {
                    throw new m(c2);
                }
            } else {
                throw new IllegalStateException("Client not authenticated");
            }
        }
        return c;
    }

    public String[] B() {
        String[] c;
        synchronized (this.T) {
            if (!this.y) {
                throw new IllegalStateException("Client not connected");
            } else if (this.z) {
                this.V.a("STAT");
                s c2 = this.V.c();
                O();
                if (c2.b()) {
                    c = c2.c();
                } else {
                    throw new m(c2);
                }
            } else {
                throw new IllegalStateException("Client not authenticated");
            }
        }
        return c;
    }

    public n[] C() {
        return l(null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String[] D() {
        /*
        r11 = this;
        r10 = 226; // 0xe2 float:3.17E-43 double:1.117E-321;
        r9 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r8 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r1 = 0;
        r3 = 0;
        r4 = r11.T;
        monitor-enter(r4);
        r0 = r11.y;	 Catch:{ all -> 0x0017 }
        if (r0 != 0) goto L_0x001a;
    L_0x000f:
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0017 }
        r1 = "Client not connected";
        r0.<init>(r1);	 Catch:{ all -> 0x0017 }
        throw r0;	 Catch:{ all -> 0x0017 }
    L_0x0017:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0017 }
        throw r0;
    L_0x001a:
        r0 = r11.z;	 Catch:{ all -> 0x0017 }
        if (r0 != 0) goto L_0x0026;
    L_0x001e:
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0017 }
        r1 = "Client not authenticated";
        r0.<init>(r1);	 Catch:{ all -> 0x0017 }
        throw r0;	 Catch:{ all -> 0x0017 }
    L_0x0026:
        r0 = r11.V;	 Catch:{ all -> 0x0017 }
        r2 = "TYPE A";
        r0.a(r2);	 Catch:{ all -> 0x0017 }
        r0 = r11.V;	 Catch:{ all -> 0x0017 }
        r0 = r0.c();	 Catch:{ all -> 0x0017 }
        r11.O();	 Catch:{ all -> 0x0017 }
        r2 = r0.b();	 Catch:{ all -> 0x0017 }
        if (r2 != 0) goto L_0x0042;
    L_0x003c:
        r1 = new it.a.a.m;	 Catch:{ all -> 0x0017 }
        r1.<init>(r0);	 Catch:{ all -> 0x0017 }
        throw r1;	 Catch:{ all -> 0x0017 }
    L_0x0042:
        r5 = new java.util.ArrayList;	 Catch:{ all -> 0x0017 }
        r5.<init>();	 Catch:{ all -> 0x0017 }
        r0 = r11.F();	 Catch:{ all -> 0x0017 }
        r2 = r11.V;	 Catch:{ all -> 0x0017 }
        r6 = "NLST";
        r2.a(r6);	 Catch:{ all -> 0x0017 }
        r6 = r0.a();	 Catch:{ all -> 0x00d8 }
        r0.b();	 Catch:{ all -> 0x00dd }
        r2 = r11.U;	 Catch:{ all -> 0x00dd }
        monitor-enter(r2);	 Catch:{ all -> 0x00dd }
        r0 = 1;
        r11.O = r0;	 Catch:{ all -> 0x00e0 }
        r0 = 0;
        r11.R = r0;	 Catch:{ all -> 0x00e0 }
        r0 = 0;
        r11.S = r0;	 Catch:{ all -> 0x00e0 }
        monitor-exit(r2);	 Catch:{ all -> 0x00e0 }
        r0 = r6.getInputStream();	 Catch:{ IOException -> 0x018a }
        r11.P = r0;	 Catch:{ IOException -> 0x018a }
        r0 = r11.M;	 Catch:{ IOException -> 0x018a }
        if (r0 == 0) goto L_0x0079;
    L_0x0070:
        r0 = new java.util.zip.InflaterInputStream;	 Catch:{ IOException -> 0x018a }
        r2 = r11.P;	 Catch:{ IOException -> 0x018a }
        r0.<init>(r2);	 Catch:{ IOException -> 0x018a }
        r11.P = r0;	 Catch:{ IOException -> 0x018a }
    L_0x0079:
        r2 = new it.a.a.u;	 Catch:{ IOException -> 0x018a }
        r0 = r11.P;	 Catch:{ IOException -> 0x018a }
        r7 = r11.I();	 Catch:{ IOException -> 0x018a }
        r2.<init>(r0, r7);	 Catch:{ IOException -> 0x018a }
    L_0x0084:
        r0 = r2.a();	 Catch:{ IOException -> 0x0094, all -> 0x0186 }
        if (r0 == 0) goto L_0x0137;
    L_0x008a:
        r1 = r0.length();	 Catch:{ IOException -> 0x0094, all -> 0x0186 }
        if (r1 <= 0) goto L_0x0084;
    L_0x0090:
        r5.add(r0);	 Catch:{ IOException -> 0x0094, all -> 0x0186 }
        goto L_0x0084;
    L_0x0094:
        r0 = move-exception;
        r1 = r2;
    L_0x0096:
        r2 = r11.U;	 Catch:{ all -> 0x00a6 }
        monitor-enter(r2);	 Catch:{ all -> 0x00a6 }
        r5 = r11.R;	 Catch:{ all -> 0x00a3 }
        if (r5 == 0) goto L_0x00e3;
    L_0x009d:
        r0 = new it.a.a.a;	 Catch:{ all -> 0x00a3 }
        r0.<init>();	 Catch:{ all -> 0x00a3 }
        throw r0;	 Catch:{ all -> 0x00a3 }
    L_0x00a3:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x00a3 }
        throw r0;	 Catch:{ all -> 0x00a6 }
    L_0x00a6:
        r0 = move-exception;
    L_0x00a7:
        if (r1 == 0) goto L_0x00ac;
    L_0x00a9:
        r1.close();	 Catch:{ Throwable -> 0x012d }
    L_0x00ac:
        r6.close();	 Catch:{ Throwable -> 0x0130 }
    L_0x00af:
        r1 = 0;
        r11.P = r1;	 Catch:{ all -> 0x00dd }
        r2 = r11.U;	 Catch:{ all -> 0x00dd }
        monitor-enter(r2);	 Catch:{ all -> 0x00dd }
        r1 = r11.R;	 Catch:{ all -> 0x0133 }
        r3 = 0;
        r11.O = r3;	 Catch:{ all -> 0x0184 }
        r3 = 0;
        r11.R = r3;	 Catch:{ all -> 0x0184 }
        monitor-exit(r2);	 Catch:{ all -> 0x0184 }
        throw r0;	 Catch:{ all -> 0x00bf }
    L_0x00bf:
        r0 = move-exception;
    L_0x00c0:
        r2 = r11.V;	 Catch:{ all -> 0x0017 }
        r2 = r2.c();	 Catch:{ all -> 0x0017 }
        r3 = r2.a();	 Catch:{ all -> 0x0017 }
        if (r3 == r9) goto L_0x0119;
    L_0x00cc:
        r3 = r2.a();	 Catch:{ all -> 0x0017 }
        if (r3 == r8) goto L_0x0119;
    L_0x00d2:
        r0 = new it.a.a.m;	 Catch:{ all -> 0x0017 }
        r0.<init>(r2);	 Catch:{ all -> 0x0017 }
        throw r0;	 Catch:{ all -> 0x0017 }
    L_0x00d8:
        r1 = move-exception;
        r0.b();	 Catch:{ all -> 0x00dd }
        throw r1;	 Catch:{ all -> 0x00dd }
    L_0x00dd:
        r0 = move-exception;
        r1 = r3;
        goto L_0x00c0;
    L_0x00e0:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x00e0 }
        throw r0;	 Catch:{ all -> 0x00dd }
    L_0x00e3:
        r5 = new it.a.a.j;	 Catch:{ all -> 0x00a3 }
        r7 = "I/O error in data transfer";
        r5.<init>(r7, r0);	 Catch:{ all -> 0x00a3 }
        throw r5;	 Catch:{ all -> 0x00a3 }
    L_0x00eb:
        r1 = r11.S;	 Catch:{ all -> 0x0017 }
        if (r1 == 0) goto L_0x00f7;
    L_0x00ef:
        r1 = r11.V;	 Catch:{ all -> 0x0017 }
        r1.c();	 Catch:{ all -> 0x0017 }
        r1 = 0;
        r11.S = r1;	 Catch:{ all -> 0x0017 }
    L_0x00f7:
        throw r0;	 Catch:{ all -> 0x0017 }
    L_0x00f8:
        r0 = r11.S;	 Catch:{ all -> 0x0017 }
        if (r0 == 0) goto L_0x0104;
    L_0x00fc:
        r0 = r11.V;	 Catch:{ all -> 0x0017 }
        r0.c();	 Catch:{ all -> 0x0017 }
        r0 = 0;
        r11.S = r0;	 Catch:{ all -> 0x0017 }
    L_0x0104:
        r1 = r5.size();	 Catch:{ all -> 0x0017 }
        r2 = new java.lang.String[r1];	 Catch:{ all -> 0x0017 }
    L_0x010a:
        if (r3 >= r1) goto L_0x0117;
    L_0x010c:
        r0 = r5.get(r3);	 Catch:{ all -> 0x0017 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0017 }
        r2[r3] = r0;	 Catch:{ all -> 0x0017 }
        r3 = r3 + 1;
        goto L_0x010a;
    L_0x0117:
        monitor-exit(r4);	 Catch:{ all -> 0x0017 }
        return r2;
    L_0x0119:
        r2 = r11.V;	 Catch:{ all -> 0x0017 }
        r2 = r2.c();	 Catch:{ all -> 0x0017 }
        if (r1 != 0) goto L_0x00eb;
    L_0x0121:
        r1 = r2.a();	 Catch:{ all -> 0x0017 }
        if (r1 == r10) goto L_0x00eb;
    L_0x0127:
        r0 = new it.a.a.m;	 Catch:{ all -> 0x0017 }
        r0.<init>(r2);	 Catch:{ all -> 0x0017 }
        throw r0;	 Catch:{ all -> 0x0017 }
    L_0x012d:
        r1 = move-exception;
        goto L_0x00ac;
    L_0x0130:
        r1 = move-exception;
        goto L_0x00af;
    L_0x0133:
        r0 = move-exception;
        r1 = r3;
    L_0x0135:
        monitor-exit(r2);	 Catch:{ all -> 0x0184 }
        throw r0;	 Catch:{ all -> 0x00bf }
    L_0x0137:
        if (r2 == 0) goto L_0x013c;
    L_0x0139:
        r2.close();	 Catch:{ Throwable -> 0x0166 }
    L_0x013c:
        r6.close();	 Catch:{ Throwable -> 0x0168 }
    L_0x013f:
        r0 = 0;
        r11.P = r0;	 Catch:{ all -> 0x00dd }
        r2 = r11.U;	 Catch:{ all -> 0x00dd }
        monitor-enter(r2);	 Catch:{ all -> 0x00dd }
        r1 = r11.R;	 Catch:{ all -> 0x016a }
        r0 = 0;
        r11.O = r0;	 Catch:{ all -> 0x0182 }
        r0 = 0;
        r11.R = r0;	 Catch:{ all -> 0x0182 }
        monitor-exit(r2);	 Catch:{ all -> 0x0182 }
        r0 = r11.V;	 Catch:{ all -> 0x0017 }
        r0 = r0.c();	 Catch:{ all -> 0x0017 }
        r2 = r0.a();	 Catch:{ all -> 0x0017 }
        if (r2 == r9) goto L_0x016e;
    L_0x015a:
        r2 = r0.a();	 Catch:{ all -> 0x0017 }
        if (r2 == r8) goto L_0x016e;
    L_0x0160:
        r1 = new it.a.a.m;	 Catch:{ all -> 0x0017 }
        r1.<init>(r0);	 Catch:{ all -> 0x0017 }
        throw r1;	 Catch:{ all -> 0x0017 }
    L_0x0166:
        r0 = move-exception;
        goto L_0x013c;
    L_0x0168:
        r0 = move-exception;
        goto L_0x013f;
    L_0x016a:
        r0 = move-exception;
        r1 = r3;
    L_0x016c:
        monitor-exit(r2);	 Catch:{ all -> 0x0182 }
        throw r0;	 Catch:{ all -> 0x00bf }
    L_0x016e:
        r0 = r11.V;	 Catch:{ all -> 0x0017 }
        r0 = r0.c();	 Catch:{ all -> 0x0017 }
        if (r1 != 0) goto L_0x00f8;
    L_0x0176:
        r1 = r0.a();	 Catch:{ all -> 0x0017 }
        if (r1 == r10) goto L_0x00f8;
    L_0x017c:
        r1 = new it.a.a.m;	 Catch:{ all -> 0x0017 }
        r1.<init>(r0);	 Catch:{ all -> 0x0017 }
        throw r1;	 Catch:{ all -> 0x0017 }
    L_0x0182:
        r0 = move-exception;
        goto L_0x016c;
    L_0x0184:
        r0 = move-exception;
        goto L_0x0135;
    L_0x0186:
        r0 = move-exception;
        r1 = r2;
        goto L_0x00a7;
    L_0x018a:
        r0 = move-exception;
        goto L_0x0096;
        */
        throw new UnsupportedOperationException("Method not decompiled: it.a.a.b.D():java.lang.String[]");
    }

    public h a() {
        h hVar;
        synchronized (this.T) {
            hVar = this.n;
        }
        return hVar;
    }

    public void a(int i) {
        if (i == 0 || i == 1 || i == 2) {
            synchronized (this.T) {
                if (this.y) {
                    throw new IllegalStateException("The security level of the connection can't be changed while the client is connected");
                }
                this.v = i;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid security");
    }

    public void a(long j) {
        synchronized (this.T) {
            if (this.y && this.z) {
                N();
            }
            long j2 = this.D;
            this.D = j;
            if (!(j2 == 0 || j == 0 || this.F <= 0)) {
                this.F -= j2 - j;
            }
            if (this.y && this.z) {
                M();
            }
        }
    }

    public void a(g gVar) {
        synchronized (this.T) {
            this.p.add(gVar);
            if (this.V != null) {
                this.V.a(gVar);
            }
        }
    }

    public void a(h hVar) {
        synchronized (this.T) {
            this.n = hVar;
        }
    }

    public void a(r rVar) {
        synchronized (this.T) {
            this.q.add(rVar);
        }
    }

    public void a(t tVar) {
        synchronized (this.T) {
            this.r = tVar;
        }
    }

    public void a(File file) {
        a(file, 0, null);
    }

    public void a(File file, long j) {
        a(file, j, null);
    }

    public void a(File file, long j, k kVar) {
        if (file.exists()) {
            try {
                InputStream fileInputStream = new FileInputStream(file);
                try {
                    a(file.getName(), fileInputStream, j, j, kVar);
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                            return;
                        } catch (Throwable th) {
                            return;
                        }
                    }
                    return;
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IOException e2) {
                    throw e2;
                } catch (o e3) {
                    throw e3;
                } catch (m e4) {
                    throw e4;
                } catch (j e5) {
                    throw e5;
                } catch (a e6) {
                    throw e6;
                } catch (Throwable th2) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                        }
                    }
                }
            } catch (Throwable e7) {
                throw new j(e7);
            }
        }
        throw new FileNotFoundException(file.getAbsolutePath());
    }

    public void a(File file, k kVar) {
        a(file, 0, kVar);
    }

    public void a(String str) {
        synchronized (this.T) {
            this.H = str;
            if (this.y) {
                try {
                    this.V.b(I());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void a(String str, File file) {
        a(str, file, 0, null);
    }

    public void a(String str, File file, long j) {
        a(str, file, j, null);
    }

    public void a(String str, File file, long j, k kVar) {
        try {
            OutputStream fileOutputStream = new FileOutputStream(file, j > 0);
            try {
                a(str, fileOutputStream, j, kVar);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th) {
                    }
                }
            } catch (IllegalStateException e) {
                throw e;
            } catch (IOException e2) {
                throw e2;
            } catch (o e3) {
                throw e3;
            } catch (m e4) {
                throw e4;
            } catch (j e5) {
                throw e5;
            } catch (a e6) {
                throw e6;
            } catch (Throwable th2) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                    }
                }
            }
        } catch (Throwable e7) {
            throw new j(e7);
        }
    }

    public void a(String str, File file, k kVar) {
        a(str, file, 0, kVar);
    }

    public void a(String str, InputStream inputStream, long j, long j2, k kVar) {
        synchronized (this.T) {
            if (!this.y) {
                throw new IllegalStateException("Client not connected");
            } else if (this.z) {
                int i = this.B;
                if (i == 0) {
                    i = m(str);
                }
                if (i == 1) {
                    this.V.a("TYPE A");
                } else if (i == 2) {
                    this.V.a("TYPE I");
                }
                s c = this.V.c();
                O();
                if (c.b()) {
                    i F = F();
                    if (this.G || j > 0) {
                        try {
                            this.V.a(new StringBuffer().append("REST ").append(j).toString());
                            c = this.V.c();
                            O();
                            if (c.a() != e.s && (!(c.a() == e.b || c.a() == e.c) || j > 0)) {
                                throw new m(c);
                            }
                        } catch (Throwable th) {
                            F.b();
                        }
                    }
                    boolean z = false;
                    this.V.a(new StringBuffer().append("STOR ").append(str).toString());
                    try {
                        Socket a = F.a();
                        F.b();
                        synchronized (this.U) {
                            this.O = true;
                            this.R = false;
                            this.S = false;
                        }
                        try {
                            inputStream.skip(j2);
                            this.Q = a.getOutputStream();
                            if (this.M) {
                                this.Q = new DeflaterOutputStream(this.Q);
                            }
                            if (kVar != null) {
                                kVar.d();
                            }
                            if (i == 1) {
                                Reader inputStreamReader = new InputStreamReader(inputStream);
                                Writer outputStreamWriter = new OutputStreamWriter(this.Q, I());
                                char[] cArr = new char[65536];
                                while (true) {
                                    int read = inputStreamReader.read(cArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    outputStreamWriter.write(cArr, 0, read);
                                    outputStreamWriter.flush();
                                    if (kVar != null) {
                                        kVar.a(read);
                                    }
                                }
                            } else if (i == 2) {
                                byte[] bArr = new byte[65536];
                                while (true) {
                                    int read2 = inputStream.read(bArr);
                                    if (read2 == -1) {
                                        break;
                                    }
                                    this.Q.write(bArr, 0, read2);
                                    this.Q.flush();
                                    if (kVar != null) {
                                        kVar.a(read2);
                                    }
                                }
                            }
                            if (this.Q != null) {
                                try {
                                    this.Q.close();
                                } catch (Throwable th2) {
                                }
                            }
                            try {
                                a.close();
                            } catch (Throwable th3) {
                            }
                            this.Q = null;
                            synchronized (this.U) {
                                z = this.R;
                                this.O = false;
                                this.R = false;
                            }
                            s c2 = this.V.c();
                            O();
                            if (c2.a() == 150 || c2.a() == 125) {
                                c2 = this.V.c();
                                if (z || c2.a() == e.D) {
                                    if (this.S) {
                                        this.V.c();
                                        this.S = false;
                                    }
                                    if (kVar != null) {
                                        kVar.b();
                                    }
                                } else {
                                    throw new m(c2);
                                }
                            }
                            throw new m(c2);
                        } catch (Throwable e) {
                            synchronized (this.U) {
                                if (this.R) {
                                    if (kVar != null) {
                                        kVar.a();
                                    }
                                    throw new a();
                                }
                                if (kVar != null) {
                                    kVar.c();
                                }
                                throw new j("I/O error in data transfer", e);
                            }
                        } catch (Throwable th4) {
                            if (this.Q != null) {
                                this.Q.close();
                            }
                            a.close();
                            this.Q = null;
                            synchronized (this.U) {
                                z = this.R;
                                this.O = false;
                                this.R = false;
                            }
                        }
                    } catch (Throwable th5) {
                    }
                } else {
                    throw new m(c);
                }
            } else {
                throw new IllegalStateException("Client not authenticated");
            }
        }
    }

    public void a(String str, InputStream inputStream, long j, k kVar) {
        synchronized (this.T) {
            if (!this.y) {
                throw new IllegalStateException("Client not connected");
            } else if (this.z) {
                int i = this.B;
                if (i == 0) {
                    i = m(str);
                }
                if (i == 1) {
                    this.V.a("TYPE A");
                } else if (i == 2) {
                    this.V.a("TYPE I");
                }
                s c = this.V.c();
                O();
                if (c.b()) {
                    boolean z = false;
                    i F = F();
                    this.V.a(new StringBuffer().append("APPE ").append(str).toString());
                    try {
                        Socket a = F.a();
                        F.b();
                        synchronized (this.U) {
                            this.O = true;
                            this.R = false;
                            this.S = false;
                        }
                        try {
                            inputStream.skip(j);
                            this.Q = a.getOutputStream();
                            if (this.M) {
                                this.Q = new DeflaterOutputStream(this.Q);
                            }
                            if (kVar != null) {
                                kVar.d();
                            }
                            if (i == 1) {
                                Reader inputStreamReader = new InputStreamReader(inputStream);
                                Writer outputStreamWriter = new OutputStreamWriter(this.Q, I());
                                char[] cArr = new char[65536];
                                while (true) {
                                    int read = inputStreamReader.read(cArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    outputStreamWriter.write(cArr, 0, read);
                                    outputStreamWriter.flush();
                                    if (kVar != null) {
                                        kVar.a(read);
                                    }
                                }
                            } else if (i == 2) {
                                byte[] bArr = new byte[65536];
                                while (true) {
                                    int read2 = inputStream.read(bArr);
                                    if (read2 == -1) {
                                        break;
                                    }
                                    this.Q.write(bArr, 0, read2);
                                    this.Q.flush();
                                    if (kVar != null) {
                                        kVar.a(read2);
                                    }
                                }
                            }
                            if (this.Q != null) {
                                try {
                                    this.Q.close();
                                } catch (Throwable th) {
                                }
                            }
                            try {
                                a.close();
                            } catch (Throwable th2) {
                            }
                            this.Q = null;
                            synchronized (this.U) {
                                z = this.R;
                                this.O = false;
                                this.R = false;
                            }
                            s c2 = this.V.c();
                            O();
                            if (c2.a() == 150 || c2.a() == 125) {
                                c2 = this.V.c();
                                if (z || c2.a() == e.D) {
                                    if (this.S) {
                                        this.V.c();
                                        this.S = false;
                                    }
                                    if (kVar != null) {
                                        kVar.b();
                                    }
                                } else {
                                    throw new m(c2);
                                }
                            }
                            throw new m(c2);
                        } catch (Throwable e) {
                            synchronized (this.U) {
                                if (this.R) {
                                    if (kVar != null) {
                                        kVar.a();
                                    }
                                    throw new a();
                                }
                                if (kVar != null) {
                                    kVar.c();
                                }
                                throw new j("I/O error in data transfer", e);
                            }
                        } catch (Throwable th3) {
                            if (this.Q != null) {
                                this.Q.close();
                            }
                            a.close();
                            this.Q = null;
                            synchronized (this.U) {
                                z = this.R;
                                this.O = false;
                                this.R = false;
                            }
                        }
                    } catch (Throwable th4) {
                    }
                } else {
                    throw new m(c);
                }
            } else {
                throw new IllegalStateException("Client not authenticated");
            }
        }
    }

    public void a(String str, OutputStream outputStream, long j, k kVar) {
        synchronized (this.T) {
            if (!this.y) {
                throw new IllegalStateException("Client not connected");
            } else if (this.z) {
                int i = this.B;
                if (i == 0) {
                    i = m(str);
                }
                if (i == 1) {
                    this.V.a("TYPE A");
                } else if (i == 2) {
                    this.V.a("TYPE I");
                }
                s c = this.V.c();
                O();
                if (c.b()) {
                    i F = F();
                    if (this.G || j > 0) {
                        try {
                            this.V.a(new StringBuffer().append("REST ").append(j).toString());
                            c = this.V.c();
                            O();
                            if (c.a() != e.s && (!(c.a() == e.b || c.a() == e.c) || j > 0)) {
                                throw new m(c);
                            }
                        } catch (Throwable th) {
                            F.b();
                        }
                    }
                    boolean z = false;
                    this.V.a(new StringBuffer().append("RETR ").append(str).toString());
                    try {
                        Socket a = F.a();
                        F.b();
                        synchronized (this.U) {
                            this.O = true;
                            this.R = false;
                            this.S = false;
                        }
                        try {
                            this.P = a.getInputStream();
                            if (this.M) {
                                this.P = new InflaterInputStream(this.P);
                            }
                            if (kVar != null) {
                                kVar.d();
                            }
                            if (i == 1) {
                                Reader inputStreamReader = new InputStreamReader(this.P, I());
                                Writer outputStreamWriter = new OutputStreamWriter(outputStream);
                                char[] cArr = new char[65536];
                                while (true) {
                                    int read = inputStreamReader.read(cArr, 0, cArr.length);
                                    if (read == -1) {
                                        break;
                                    }
                                    outputStreamWriter.write(cArr, 0, read);
                                    outputStreamWriter.flush();
                                    if (kVar != null) {
                                        kVar.a(read);
                                    }
                                }
                            } else if (i == 2) {
                                byte[] bArr = new byte[65536];
                                while (true) {
                                    int read2 = this.P.read(bArr, 0, bArr.length);
                                    if (read2 == -1) {
                                        break;
                                    }
                                    outputStream.write(bArr, 0, read2);
                                    if (kVar != null) {
                                        kVar.a(read2);
                                    }
                                }
                            }
                            if (this.P != null) {
                                try {
                                    this.P.close();
                                } catch (Throwable th2) {
                                }
                            }
                            try {
                                a.close();
                            } catch (Throwable th3) {
                            }
                            this.P = null;
                            synchronized (this.U) {
                                z = this.R;
                                this.O = false;
                                this.R = false;
                            }
                            s c2 = this.V.c();
                            O();
                            if (c2.a() == 150 || c2.a() == 125) {
                                c2 = this.V.c();
                                if (z || c2.a() == e.D) {
                                    if (this.S) {
                                        this.V.c();
                                        this.S = false;
                                    }
                                    if (kVar != null) {
                                        kVar.b();
                                    }
                                } else {
                                    throw new m(c2);
                                }
                            }
                            throw new m(c2);
                        } catch (Throwable e) {
                            synchronized (this.U) {
                                if (this.R) {
                                    if (kVar != null) {
                                        kVar.a();
                                    }
                                    throw new a();
                                }
                                if (kVar != null) {
                                    kVar.c();
                                }
                                throw new j("I/O error in data transfer", e);
                            }
                        } catch (Throwable th4) {
                            if (this.P != null) {
                                this.P.close();
                            }
                            a.close();
                            this.P = null;
                            synchronized (this.U) {
                                z = this.R;
                                this.O = false;
                                this.R = false;
                            }
                        }
                    } catch (Throwable th5) {
                    }
                } else {
                    throw new m(c);
                }
            } else {
                throw new IllegalStateException("Client not authenticated");
            }
        }
    }

    public void a(String str, String str2) {
        a(str, str2, null);
    }

    public void a(String str, String str2, String str3) {
        Object obj = null;
        synchronized (this.T) {
            if (this.y) {
                s c;
                Object obj2;
                if (this.v == 2) {
                    this.V.a("AUTH TLS");
                    if (this.V.c().b()) {
                        this.V.a(this.o);
                    } else {
                        this.V.a("AUTH SSL");
                        c = this.V.c();
                        if (c.b()) {
                            this.V.a(this.o);
                        } else {
                            throw new m(c.a(), "SECURITY_FTPES cannot be applied: the server refused both AUTH TLS and AUTH SSL commands");
                        }
                    }
                }
                this.z = false;
                this.V.a(new StringBuffer().append("USER ").append(str).toString());
                c = this.V.c();
                switch (c.a()) {
                    case e.F /*230*/:
                        obj2 = null;
                        break;
                    case e.q /*331*/:
                        int i = 1;
                        break;
                    default:
                        throw new m(c);
                }
                if (obj2 != null) {
                    if (str2 == null) {
                        throw new m((int) e.q);
                    }
                    this.V.a(new StringBuffer().append("PASS ").append(str2).toString());
                    c = this.V.c();
                    switch (c.a()) {
                        case e.F /*230*/:
                            break;
                        case e.r /*332*/:
                            obj = 1;
                            break;
                        default:
                            throw new m(c);
                    }
                }
                if (obj != null) {
                    if (str3 == null) {
                        throw new m((int) e.r);
                    }
                    this.V.a(new StringBuffer().append("ACCT ").append(str3).toString());
                    s c2 = this.V.c();
                    switch (c2.a()) {
                        case e.F /*230*/:
                            break;
                        default:
                            throw new m(c2);
                    }
                }
                this.z = true;
                this.w = str;
                this.x = str2;
            } else {
                throw new IllegalStateException("Client not connected");
            }
        }
        E();
        M();
    }

    public void a(SSLSocketFactory sSLSocketFactory) {
        synchronized (this.T) {
            this.o = sSLSocketFactory;
        }
    }

    public void a(boolean z) {
        synchronized (this.T) {
            this.A = z;
        }
    }

    public String[] a(String str, int i) {
        String[] c;
        Socket socket = null;
        synchronized (this.T) {
            if (this.y) {
                throw new IllegalStateException(new StringBuffer().append("Client already connected to ").append(str).append(" on port ").append(i).toString());
            }
            try {
                socket = this.n.c(str, i);
                if (this.v == 1) {
                    socket = a(socket, str, i);
                }
                this.V = new f(socket, I());
                Iterator it = this.p.iterator();
                while (it.hasNext()) {
                    this.V.a((g) it.next());
                }
                s c2 = this.V.c();
                if (c2.b()) {
                    this.y = true;
                    this.z = false;
                    this.s = null;
                    this.t = str;
                    this.u = i;
                    this.w = null;
                    this.x = null;
                    this.J = false;
                    this.G = false;
                    this.K = false;
                    this.L = false;
                    this.N = false;
                    c = c2.c();
                    if (!(this.y || socket == null)) {
                        try {
                            socket.close();
                        } catch (Throwable th) {
                        }
                    }
                } else {
                    throw new m(c2);
                }
            } catch (IOException e) {
                throw e;
            } catch (Throwable th2) {
                if (!(this.y || socket == null)) {
                    try {
                        socket.close();
                    } catch (Throwable th3) {
                    }
                }
            }
        }
        return c;
    }

    public SSLSocketFactory b() {
        SSLSocketFactory sSLSocketFactory;
        synchronized (this.T) {
            sSLSocketFactory = this.o;
        }
        return sSLSocketFactory;
    }

    public void b(int i) {
        if (i == 0 || i == 2 || i == 1) {
            synchronized (this.T) {
                this.B = i;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid type");
    }

    public void b(g gVar) {
        synchronized (this.T) {
            this.p.remove(gVar);
            if (this.V != null) {
                this.V.b(gVar);
            }
        }
    }

    public void b(r rVar) {
        synchronized (this.T) {
            this.q.remove(rVar);
        }
    }

    public void b(File file) {
        b(file, null);
    }

    public void b(File file, k kVar) {
        if (file.exists()) {
            try {
                InputStream fileInputStream = new FileInputStream(file);
                try {
                    a(file.getName(), fileInputStream, 0, kVar);
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                            return;
                        } catch (Throwable th) {
                            return;
                        }
                    }
                    return;
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IOException e2) {
                    throw e2;
                } catch (o e3) {
                    throw e3;
                } catch (m e4) {
                    throw e4;
                } catch (j e5) {
                    throw e5;
                } catch (a e6) {
                    throw e6;
                } catch (Throwable th2) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                        }
                    }
                }
            } catch (Throwable e7) {
                throw new j(e7);
            }
        }
        throw new FileNotFoundException(file.getAbsolutePath());
    }

    public void b(String str, String str2) {
        synchronized (this.T) {
            if (!this.y) {
                throw new IllegalStateException("Client not connected");
            } else if (this.z) {
                this.V.a(new StringBuffer().append("RNFR ").append(str).toString());
                s c = this.V.c();
                O();
                if (c.a() != e.s) {
                    throw new m(c);
                }
                this.V.a(new StringBuffer().append("RNTO ").append(str2).toString());
                c = this.V.c();
                O();
                if (c.b()) {
                } else {
                    throw new m(c);
                }
            } else {
                throw new IllegalStateException("Client not authenticated");
            }
        }
    }

    public void b(boolean z) {
        this.I = z;
    }

    public String[] b(String str) {
        return a(str, this.v == 1 ? 990 : 21);
    }

    public int c() {
        return this.v;
    }

    public s c(String str) {
        s c;
        synchronized (this.T) {
            if (this.y) {
                this.V.a(str);
                O();
                c = this.V.c();
            } else {
                throw new IllegalStateException("Client not connected");
            }
        }
        return c;
    }

    public void c(int i) {
        if (this.B == 0 || this.B == 1 || this.B == 2) {
            synchronized (this.T) {
                this.C = i;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid MLSD policy");
    }

    public void c(boolean z) {
        synchronized (this.T) {
            if (this.y) {
                if (this.z) {
                    N();
                }
                if (z) {
                    this.V.a("QUIT");
                    s c = this.V.c();
                    if (!c.b()) {
                        throw new m(c);
                    }
                }
                this.V.a();
                this.V = null;
                this.y = false;
            } else {
                throw new IllegalStateException("Client not connected");
            }
        }
    }

    public int d() {
        int i;
        synchronized (this.T) {
            i = this.B;
        }
        return i;
    }

    public s d(String str) {
        s c;
        synchronized (this.T) {
            if (this.y) {
                this.V.a(new StringBuffer().append("SITE ").append(str).toString());
                O();
                c = this.V.c();
            } else {
                throw new IllegalStateException("Client not connected");
            }
        }
        return c;
    }

    public void d(boolean z) {
        synchronized (this.U) {
            if (this.O && !this.R) {
                if (z) {
                    this.V.a("ABOR");
                    O();
                    this.S = true;
                }
                if (this.P != null) {
                    try {
                        this.P.close();
                    } catch (Throwable th) {
                    }
                }
                if (this.Q != null) {
                    try {
                        this.Q.close();
                    } catch (Throwable th2) {
                    }
                }
                this.R = true;
            }
        }
    }

    public int e() {
        int i;
        synchronized (this.T) {
            i = this.C;
        }
        return i;
    }

    public void e(String str) {
        synchronized (this.T) {
            if (!this.y) {
                throw new IllegalStateException("Client not connected");
            } else if (this.z) {
                this.V.a(new StringBuffer().append("ACCT ").append(str).toString());
                s c = this.V.c();
                O();
                if (c.b()) {
                } else {
                    throw new m(c);
                }
            } else {
                throw new IllegalStateException("Client not authenticated");
            }
        }
    }

    public String f() {
        String str;
        synchronized (this.T) {
            str = this.H;
        }
        return str;
    }

    public void f(String str) {
        synchronized (this.T) {
            if (!this.y) {
                throw new IllegalStateException("Client not connected");
            } else if (this.z) {
                this.V.a(new StringBuffer().append("CWD ").append(str).toString());
                s c = this.V.c();
                O();
                if (c.b()) {
                } else {
                    throw new m(c);
                }
            } else {
                throw new IllegalStateException("Client not authenticated");
            }
        }
    }

    public Date g(String str) {
        Date parse;
        synchronized (this.T) {
            if (!this.y) {
                throw new IllegalStateException("Client not connected");
            } else if (this.z) {
                this.V.a(new StringBuffer().append("MDTM ").append(str).toString());
                s c = this.V.c();
                O();
                if (c.b()) {
                    String[] c2 = c.c();
                    if (c2.length != 1) {
                        throw new o();
                    }
                    try {
                        parse = k.parse(c2[0]);
                    } catch (ParseException e) {
                        throw new o();
                    }
                }
                throw new m(c);
            } else {
                throw new IllegalStateException("Client not authenticated");
            }
        }
        return parse;
    }

    public boolean g() {
        boolean z;
        synchronized (this.T) {
            z = this.G;
        }
        return z;
    }

    public long h(String str) {
        long parseLong;
        synchronized (this.T) {
            if (!this.y) {
                throw new IllegalStateException("Client not connected");
            } else if (this.z) {
                this.V.a("TYPE I");
                s c = this.V.c();
                O();
                if (c.b()) {
                    this.V.a(new StringBuffer().append("SIZE ").append(str).toString());
                    c = this.V.c();
                    O();
                    if (c.b()) {
                        String[] c2 = c.c();
                        if (c2.length != 1) {
                            throw new o();
                        }
                        try {
                            parseLong = Long.parseLong(c2[0]);
                        } catch (Throwable th) {
                            o oVar = new o();
                        }
                    } else {
                        throw new m(c);
                    }
                }
                throw new m(c);
            } else {
                throw new IllegalStateException("Client not authenticated");
            }
        }
        return parseLong;
    }

    public boolean h() {
        return this.L;
    }

    public void i(String str) {
        synchronized (this.T) {
            if (!this.y) {
                throw new IllegalStateException("Client not connected");
            } else if (this.z) {
                this.V.a(new StringBuffer().append("DELE ").append(str).toString());
                s c = this.V.c();
                O();
                if (c.b()) {
                } else {
                    throw new m(c);
                }
            } else {
                throw new IllegalStateException("Client not authenticated");
            }
        }
    }

    public boolean i() {
        return this.I;
    }

    public t j() {
        t tVar;
        synchronized (this.T) {
            tVar = this.r;
        }
        return tVar;
    }

    public void j(String str) {
        synchronized (this.T) {
            if (!this.y) {
                throw new IllegalStateException("Client not connected");
            } else if (this.z) {
                this.V.a(new StringBuffer().append("RMD ").append(str).toString());
                s c = this.V.c();
                O();
                if (c.b()) {
                } else {
                    throw new m(c);
                }
            } else {
                throw new IllegalStateException("Client not authenticated");
            }
        }
    }

    public void k(String str) {
        synchronized (this.T) {
            if (!this.y) {
                throw new IllegalStateException("Client not connected");
            } else if (this.z) {
                this.V.a(new StringBuffer().append("MKD ").append(str).toString());
                s c = this.V.c();
                O();
                if (c.b()) {
                } else {
                    throw new m(c);
                }
            } else {
                throw new IllegalStateException("Client not authenticated");
            }
        }
    }

    public boolean k() {
        boolean z;
        synchronized (this.T) {
            z = this.z;
        }
        return z;
    }

    public boolean l() {
        boolean z;
        synchronized (this.T) {
            z = this.y;
        }
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public it.a.a.n[] l(java.lang.String r12) {
        /*
        r11 = this;
        r10 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r9 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r0 = 1;
        r1 = 0;
        r3 = 0;
        r5 = r11.T;
        monitor-enter(r5);
        r2 = r11.y;	 Catch:{ all -> 0x0016 }
        if (r2 != 0) goto L_0x0019;
    L_0x000e:
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0016 }
        r1 = "Client not connected";
        r0.<init>(r1);	 Catch:{ all -> 0x0016 }
        throw r0;	 Catch:{ all -> 0x0016 }
    L_0x0016:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0016 }
        throw r0;
    L_0x0019:
        r2 = r11.z;	 Catch:{ all -> 0x0016 }
        if (r2 != 0) goto L_0x0025;
    L_0x001d:
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0016 }
        r1 = "Client not authenticated";
        r0.<init>(r1);	 Catch:{ all -> 0x0016 }
        throw r0;	 Catch:{ all -> 0x0016 }
    L_0x0025:
        r2 = r11.V;	 Catch:{ all -> 0x0016 }
        r4 = "TYPE A";
        r2.a(r4);	 Catch:{ all -> 0x0016 }
        r2 = r11.V;	 Catch:{ all -> 0x0016 }
        r2 = r2.c();	 Catch:{ all -> 0x0016 }
        r11.O();	 Catch:{ all -> 0x0016 }
        r4 = r2.b();	 Catch:{ all -> 0x0016 }
        if (r4 != 0) goto L_0x0041;
    L_0x003b:
        r0 = new it.a.a.m;	 Catch:{ all -> 0x0016 }
        r0.<init>(r2);	 Catch:{ all -> 0x0016 }
        throw r0;	 Catch:{ all -> 0x0016 }
    L_0x0041:
        r2 = r11.F();	 Catch:{ all -> 0x0016 }
        r4 = r11.C;	 Catch:{ all -> 0x0016 }
        if (r4 != 0) goto L_0x0102;
    L_0x0049:
        r0 = r11.K;	 Catch:{ all -> 0x0016 }
        r4 = r0;
    L_0x004c:
        if (r4 == 0) goto L_0x010c;
    L_0x004e:
        r0 = "MLSD";
    L_0x0050:
        if (r12 == 0) goto L_0x006f;
    L_0x0052:
        r6 = r12.length();	 Catch:{ all -> 0x0016 }
        if (r6 <= 0) goto L_0x006f;
    L_0x0058:
        r6 = new java.lang.StringBuffer;	 Catch:{ all -> 0x0016 }
        r6.<init>();	 Catch:{ all -> 0x0016 }
        r0 = r6.append(r0);	 Catch:{ all -> 0x0016 }
        r6 = " ";
        r0 = r0.append(r6);	 Catch:{ all -> 0x0016 }
        r0 = r0.append(r12);	 Catch:{ all -> 0x0016 }
        r0 = r0.toString();	 Catch:{ all -> 0x0016 }
    L_0x006f:
        r6 = new java.util.ArrayList;	 Catch:{ all -> 0x0016 }
        r6.<init>();	 Catch:{ all -> 0x0016 }
        r7 = r11.V;	 Catch:{ all -> 0x0016 }
        r7.a(r0);	 Catch:{ all -> 0x0016 }
        r7 = r2.a();	 Catch:{ all -> 0x0110 }
        r2.b();	 Catch:{ all -> 0x0115 }
        r2 = r11.U;	 Catch:{ all -> 0x0115 }
        monitor-enter(r2);	 Catch:{ all -> 0x0115 }
        r0 = 1;
        r11.O = r0;	 Catch:{ all -> 0x0118 }
        r0 = 0;
        r11.R = r0;	 Catch:{ all -> 0x0118 }
        r0 = 0;
        r11.S = r0;	 Catch:{ all -> 0x0118 }
        monitor-exit(r2);	 Catch:{ all -> 0x0118 }
        r0 = r7.getInputStream();	 Catch:{ IOException -> 0x0212 }
        r11.P = r0;	 Catch:{ IOException -> 0x0212 }
        r0 = r11.M;	 Catch:{ IOException -> 0x0212 }
        if (r0 == 0) goto L_0x00a0;
    L_0x0097:
        r0 = new java.util.zip.InflaterInputStream;	 Catch:{ IOException -> 0x0212 }
        r2 = r11.P;	 Catch:{ IOException -> 0x0212 }
        r0.<init>(r2);	 Catch:{ IOException -> 0x0212 }
        r11.P = r0;	 Catch:{ IOException -> 0x0212 }
    L_0x00a0:
        r2 = new it.a.a.u;	 Catch:{ IOException -> 0x0212 }
        r8 = r11.P;	 Catch:{ IOException -> 0x0212 }
        if (r4 == 0) goto L_0x011b;
    L_0x00a6:
        r0 = "UTF-8";
    L_0x00a8:
        r2.<init>(r8, r0);	 Catch:{ IOException -> 0x0212 }
    L_0x00ab:
        r0 = r2.a();	 Catch:{ IOException -> 0x00bb, all -> 0x020e }
        if (r0 == 0) goto L_0x01b7;
    L_0x00b1:
        r8 = r0.length();	 Catch:{ IOException -> 0x00bb, all -> 0x020e }
        if (r8 <= 0) goto L_0x00ab;
    L_0x00b7:
        r6.add(r0);	 Catch:{ IOException -> 0x00bb, all -> 0x020e }
        goto L_0x00ab;
    L_0x00bb:
        r0 = move-exception;
        r1 = r2;
    L_0x00bd:
        r2 = r11.U;	 Catch:{ all -> 0x00cd }
        monitor-enter(r2);	 Catch:{ all -> 0x00cd }
        r4 = r11.R;	 Catch:{ all -> 0x00ca }
        if (r4 == 0) goto L_0x0120;
    L_0x00c4:
        r0 = new it.a.a.a;	 Catch:{ all -> 0x00ca }
        r0.<init>();	 Catch:{ all -> 0x00ca }
        throw r0;	 Catch:{ all -> 0x00ca }
    L_0x00ca:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x00ca }
        throw r0;	 Catch:{ all -> 0x00cd }
    L_0x00cd:
        r0 = move-exception;
    L_0x00ce:
        if (r1 == 0) goto L_0x00d3;
    L_0x00d0:
        r1.close();	 Catch:{ Throwable -> 0x01ad }
    L_0x00d3:
        r7.close();	 Catch:{ Throwable -> 0x01b0 }
    L_0x00d6:
        r1 = 0;
        r11.P = r1;	 Catch:{ all -> 0x0115 }
        r2 = r11.U;	 Catch:{ all -> 0x0115 }
        monitor-enter(r2);	 Catch:{ all -> 0x0115 }
        r1 = r11.R;	 Catch:{ all -> 0x01b3 }
        r3 = 0;
        r11.O = r3;	 Catch:{ all -> 0x020c }
        r3 = 0;
        r11.R = r3;	 Catch:{ all -> 0x020c }
        monitor-exit(r2);	 Catch:{ all -> 0x020c }
        throw r0;	 Catch:{ all -> 0x00e6 }
    L_0x00e6:
        r0 = move-exception;
    L_0x00e7:
        r2 = r11.V;	 Catch:{ all -> 0x0016 }
        r2 = r2.c();	 Catch:{ all -> 0x0016 }
        r11.O();	 Catch:{ all -> 0x0016 }
        r3 = r2.a();	 Catch:{ all -> 0x0016 }
        if (r3 == r10) goto L_0x0197;
    L_0x00f6:
        r3 = r2.a();	 Catch:{ all -> 0x0016 }
        if (r3 == r9) goto L_0x0197;
    L_0x00fc:
        r0 = new it.a.a.m;	 Catch:{ all -> 0x0016 }
        r0.<init>(r2);	 Catch:{ all -> 0x0016 }
        throw r0;	 Catch:{ all -> 0x0016 }
    L_0x0102:
        r4 = r11.C;	 Catch:{ all -> 0x0016 }
        if (r4 != r0) goto L_0x0109;
    L_0x0106:
        r4 = r0;
        goto L_0x004c;
    L_0x0109:
        r4 = r3;
        goto L_0x004c;
    L_0x010c:
        r0 = "LIST";
        goto L_0x0050;
    L_0x0110:
        r0 = move-exception;
        r2.b();	 Catch:{ all -> 0x0115 }
        throw r0;	 Catch:{ all -> 0x0115 }
    L_0x0115:
        r0 = move-exception;
        r1 = r3;
        goto L_0x00e7;
    L_0x0118:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0118 }
        throw r0;	 Catch:{ all -> 0x0115 }
    L_0x011b:
        r0 = r11.I();	 Catch:{ IOException -> 0x0212 }
        goto L_0x00a8;
    L_0x0120:
        r4 = new it.a.a.j;	 Catch:{ all -> 0x00ca }
        r6 = "I/O error in data transfer";
        r4.<init>(r6, r0);	 Catch:{ all -> 0x00ca }
        throw r4;	 Catch:{ all -> 0x00ca }
    L_0x0128:
        r1 = r11.S;	 Catch:{ all -> 0x0016 }
        if (r1 == 0) goto L_0x0134;
    L_0x012c:
        r1 = r11.V;	 Catch:{ all -> 0x0016 }
        r1.c();	 Catch:{ all -> 0x0016 }
        r1 = 0;
        r11.S = r1;	 Catch:{ all -> 0x0016 }
    L_0x0134:
        throw r0;	 Catch:{ all -> 0x0016 }
    L_0x0135:
        r0 = r11.S;	 Catch:{ all -> 0x0016 }
        if (r0 == 0) goto L_0x0141;
    L_0x0139:
        r0 = r11.V;	 Catch:{ all -> 0x0016 }
        r0.c();	 Catch:{ all -> 0x0016 }
        r0 = 0;
        r11.S = r0;	 Catch:{ all -> 0x0016 }
    L_0x0141:
        r2 = r6.size();	 Catch:{ all -> 0x0016 }
        r7 = new java.lang.String[r2];	 Catch:{ all -> 0x0016 }
    L_0x0147:
        if (r3 >= r2) goto L_0x0154;
    L_0x0149:
        r0 = r6.get(r3);	 Catch:{ all -> 0x0016 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0016 }
        r7[r3] = r0;	 Catch:{ all -> 0x0016 }
        r3 = r3 + 1;
        goto L_0x0147;
    L_0x0154:
        if (r4 == 0) goto L_0x0167;
    L_0x0156:
        r0 = new it.a.a.c.c;	 Catch:{ all -> 0x0016 }
        r0.<init>();	 Catch:{ all -> 0x0016 }
        r1 = r0.a(r7);	 Catch:{ all -> 0x0016 }
    L_0x015f:
        if (r1 != 0) goto L_0x0195;
    L_0x0161:
        r0 = new it.a.a.q;	 Catch:{ all -> 0x0016 }
        r0.<init>();	 Catch:{ all -> 0x0016 }
        throw r0;	 Catch:{ all -> 0x0016 }
    L_0x0167:
        r0 = r11.s;	 Catch:{ all -> 0x0016 }
        if (r0 == 0) goto L_0x0171;
    L_0x016b:
        r0 = r11.s;	 Catch:{ q -> 0x0190 }
        r1 = r0.a(r7);	 Catch:{ q -> 0x0190 }
    L_0x0171:
        if (r1 != 0) goto L_0x015f;
    L_0x0173:
        r0 = r11.q;	 Catch:{ all -> 0x0016 }
        r2 = r0.iterator();	 Catch:{ all -> 0x0016 }
    L_0x0179:
        r0 = r2.hasNext();	 Catch:{ all -> 0x0016 }
        if (r0 == 0) goto L_0x015f;
    L_0x017f:
        r0 = r2.next();	 Catch:{ all -> 0x0016 }
        r0 = (it.a.a.r) r0;	 Catch:{ all -> 0x0016 }
        r1 = r0.a(r7);	 Catch:{ q -> 0x018c }
        r11.s = r0;	 Catch:{ q -> 0x018c }
        goto L_0x015f;
    L_0x018c:
        r0 = move-exception;
        r0 = r1;
        r1 = r0;
        goto L_0x0179;
    L_0x0190:
        r0 = move-exception;
        r0 = 0;
        r11.s = r0;	 Catch:{ all -> 0x0016 }
        goto L_0x0171;
    L_0x0195:
        monitor-exit(r5);	 Catch:{ all -> 0x0016 }
        return r1;
    L_0x0197:
        r2 = r11.V;	 Catch:{ all -> 0x0016 }
        r2 = r2.c();	 Catch:{ all -> 0x0016 }
        if (r1 != 0) goto L_0x0128;
    L_0x019f:
        r1 = r2.a();	 Catch:{ all -> 0x0016 }
        r3 = 226; // 0xe2 float:3.17E-43 double:1.117E-321;
        if (r1 == r3) goto L_0x0128;
    L_0x01a7:
        r0 = new it.a.a.m;	 Catch:{ all -> 0x0016 }
        r0.<init>(r2);	 Catch:{ all -> 0x0016 }
        throw r0;	 Catch:{ all -> 0x0016 }
    L_0x01ad:
        r1 = move-exception;
        goto L_0x00d3;
    L_0x01b0:
        r1 = move-exception;
        goto L_0x00d6;
    L_0x01b3:
        r0 = move-exception;
        r1 = r3;
    L_0x01b5:
        monitor-exit(r2);	 Catch:{ all -> 0x020c }
        throw r0;	 Catch:{ all -> 0x00e6 }
    L_0x01b7:
        if (r2 == 0) goto L_0x01bc;
    L_0x01b9:
        r2.close();	 Catch:{ Throwable -> 0x01e9 }
    L_0x01bc:
        r7.close();	 Catch:{ Throwable -> 0x01eb }
    L_0x01bf:
        r0 = 0;
        r11.P = r0;	 Catch:{ all -> 0x0115 }
        r7 = r11.U;	 Catch:{ all -> 0x0115 }
        monitor-enter(r7);	 Catch:{ all -> 0x0115 }
        r2 = r11.R;	 Catch:{ all -> 0x01ed }
        r0 = 0;
        r11.O = r0;	 Catch:{ all -> 0x0209 }
        r0 = 0;
        r11.R = r0;	 Catch:{ all -> 0x0209 }
        monitor-exit(r7);	 Catch:{ all -> 0x0209 }
        r0 = r11.V;	 Catch:{ all -> 0x0016 }
        r0 = r0.c();	 Catch:{ all -> 0x0016 }
        r11.O();	 Catch:{ all -> 0x0016 }
        r7 = r0.a();	 Catch:{ all -> 0x0016 }
        if (r7 == r10) goto L_0x01f1;
    L_0x01dd:
        r7 = r0.a();	 Catch:{ all -> 0x0016 }
        if (r7 == r9) goto L_0x01f1;
    L_0x01e3:
        r1 = new it.a.a.m;	 Catch:{ all -> 0x0016 }
        r1.<init>(r0);	 Catch:{ all -> 0x0016 }
        throw r1;	 Catch:{ all -> 0x0016 }
    L_0x01e9:
        r0 = move-exception;
        goto L_0x01bc;
    L_0x01eb:
        r0 = move-exception;
        goto L_0x01bf;
    L_0x01ed:
        r0 = move-exception;
        r1 = r3;
    L_0x01ef:
        monitor-exit(r7);	 Catch:{ all -> 0x0207 }
        throw r0;	 Catch:{ all -> 0x00e6 }
    L_0x01f1:
        r0 = r11.V;	 Catch:{ all -> 0x0016 }
        r0 = r0.c();	 Catch:{ all -> 0x0016 }
        if (r2 != 0) goto L_0x0135;
    L_0x01f9:
        r2 = r0.a();	 Catch:{ all -> 0x0016 }
        r7 = 226; // 0xe2 float:3.17E-43 double:1.117E-321;
        if (r2 == r7) goto L_0x0135;
    L_0x0201:
        r1 = new it.a.a.m;	 Catch:{ all -> 0x0016 }
        r1.<init>(r0);	 Catch:{ all -> 0x0016 }
        throw r1;	 Catch:{ all -> 0x0016 }
    L_0x0207:
        r0 = move-exception;
        goto L_0x01ef;
    L_0x0209:
        r0 = move-exception;
        r1 = r2;
        goto L_0x01ef;
    L_0x020c:
        r0 = move-exception;
        goto L_0x01b5;
    L_0x020e:
        r0 = move-exception;
        r1 = r2;
        goto L_0x00ce;
    L_0x0212:
        r0 = move-exception;
        goto L_0x00bd;
        */
        throw new UnsupportedOperationException("Method not decompiled: it.a.a.b.l(java.lang.String):it.a.a.n[]");
    }

    public boolean m() {
        boolean z;
        synchronized (this.T) {
            z = this.A;
        }
        return z;
    }

    public String n() {
        String str;
        synchronized (this.T) {
            str = this.t;
        }
        return str;
    }

    public int o() {
        int i;
        synchronized (this.T) {
            i = this.u;
        }
        return i;
    }

    public String p() {
        String str;
        synchronized (this.T) {
            str = this.x;
        }
        return str;
    }

    public String q() {
        String str;
        synchronized (this.T) {
            str = this.w;
        }
        return str;
    }

    public long r() {
        long j;
        synchronized (this.T) {
            j = this.D;
        }
        return j;
    }

    public g[] s() {
        g[] gVarArr;
        synchronized (this.T) {
            int size = this.p.size();
            gVarArr = new g[size];
            for (int i = 0; i < size; i++) {
                gVarArr[i] = (g) this.p.get(i);
            }
        }
        return gVarArr;
    }

    public r[] t() {
        r[] rVarArr;
        synchronized (this.T) {
            int size = this.q.size();
            rVarArr = new r[size];
            for (int i = 0; i < size; i++) {
                rVarArr[i] = (r) this.q.get(i);
            }
        }
        return rVarArr;
    }

    public String toString() {
        String stringBuffer;
        int i = 0;
        synchronized (this.T) {
            int i2;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(getClass().getName());
            stringBuffer2.append(" [connected=");
            stringBuffer2.append(this.y);
            if (this.y) {
                stringBuffer2.append(", host=");
                stringBuffer2.append(this.t);
                stringBuffer2.append(", port=");
                stringBuffer2.append(this.u);
            }
            stringBuffer2.append(", connector=");
            stringBuffer2.append(this.n);
            stringBuffer2.append(", security=");
            switch (this.v) {
                case 0:
                    stringBuffer2.append("SECURITY_FTP");
                    break;
                case 1:
                    stringBuffer2.append("SECURITY_FTPS");
                    break;
                case 2:
                    stringBuffer2.append("SECURITY_FTPES");
                    break;
            }
            stringBuffer2.append(", authenticated=");
            stringBuffer2.append(this.z);
            if (this.z) {
                stringBuffer2.append(", username=");
                stringBuffer2.append(this.w);
                stringBuffer2.append(", password=");
                StringBuffer stringBuffer3 = new StringBuffer();
                for (i2 = 0; i2 < this.x.length(); i2++) {
                    stringBuffer3.append('*');
                }
                stringBuffer2.append(stringBuffer3);
                stringBuffer2.append(", restSupported=");
                stringBuffer2.append(this.G);
                stringBuffer2.append(", utf8supported=");
                stringBuffer2.append(this.J);
                stringBuffer2.append(", mlsdSupported=");
                stringBuffer2.append(this.K);
                stringBuffer2.append(", mode=modezSupported");
                stringBuffer2.append(this.L);
                stringBuffer2.append(", mode=modezEnabled");
                stringBuffer2.append(this.M);
            }
            stringBuffer2.append(", transfer mode=");
            stringBuffer2.append(this.A ? "passive" : "active");
            stringBuffer2.append(", transfer type=");
            switch (this.B) {
                case 0:
                    stringBuffer2.append("TYPE_AUTO");
                    break;
                case 1:
                    stringBuffer2.append("TYPE_TEXTUAL");
                    break;
                case 2:
                    stringBuffer2.append("TYPE_BINARY");
                    break;
            }
            stringBuffer2.append(", textualExtensionRecognizer=");
            stringBuffer2.append(this.r);
            r[] t = t();
            if (t.length > 0) {
                stringBuffer2.append(", listParsers=");
                for (i2 = 0; i2 < t.length; i2++) {
                    if (i2 > 0) {
                        stringBuffer2.append(", ");
                    }
                    stringBuffer2.append(t[i2]);
                }
            }
            g[] s = s();
            if (s.length > 0) {
                stringBuffer2.append(", communicationListeners=");
                while (i < s.length) {
                    if (i > 0) {
                        stringBuffer2.append(", ");
                    }
                    stringBuffer2.append(s[i]);
                    i++;
                }
            }
            stringBuffer2.append(", autoNoopTimeout=");
            stringBuffer2.append(this.D);
            stringBuffer2.append("]");
            stringBuffer = stringBuffer2.toString();
        }
        return stringBuffer;
    }

    public void u() {
        this.n.b();
    }

    public void v() {
        if (this.V != null) {
            this.V.a();
            this.V = null;
        }
        this.y = false;
        N();
    }

    public void w() {
        synchronized (this.T) {
            if (!this.y) {
                throw new IllegalStateException("Client not connected");
            } else if (this.z) {
                this.V.a("REIN");
                s c = this.V.c();
                if (c.b()) {
                    N();
                    this.z = false;
                    this.w = null;
                    this.x = null;
                } else {
                    throw new m(c);
                }
            } else {
                throw new IllegalStateException("Client not authenticated");
            }
        }
    }

    public void x() {
        synchronized (this.T) {
            if (!this.y) {
                throw new IllegalStateException("Client not connected");
            } else if (this.z) {
                try {
                    this.V.a("NOOP");
                    s c = this.V.c();
                    if (c.b()) {
                    } else {
                        throw new m(c);
                    }
                } finally {
                    O();
                }
            } else {
                throw new IllegalStateException("Client not authenticated");
            }
        }
    }

    public String y() {
        String substring;
        synchronized (this.T) {
            if (!this.y) {
                throw new IllegalStateException("Client not connected");
            } else if (this.z) {
                this.V.a("PWD");
                s c = this.V.c();
                O();
                if (c.b()) {
                    String[] c2 = c.c();
                    if (c2.length != 1) {
                        throw new o();
                    }
                    Matcher matcher = m.matcher(c2[0]);
                    if (matcher.find()) {
                        substring = c2[0].substring(matcher.start() + 1, matcher.end() - 1);
                    } else {
                        throw new o();
                    }
                }
                throw new m(c);
            } else {
                throw new IllegalStateException("Client not authenticated");
            }
        }
        return substring;
    }

    public void z() {
        synchronized (this.T) {
            if (!this.y) {
                throw new IllegalStateException("Client not connected");
            } else if (this.z) {
                this.V.a("CDUP");
                s c = this.V.c();
                O();
                if (c.b()) {
                } else {
                    throw new m(c);
                }
            } else {
                throw new IllegalStateException("Client not authenticated");
            }
        }
    }
}
