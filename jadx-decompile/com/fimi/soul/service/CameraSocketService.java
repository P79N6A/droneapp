package com.fimi.soul.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager.MulticastLock;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.j;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Stack;

public class CameraSocketService extends Service {
    public static final int a = 26112;
    public static final int b = 1200;
    public static final int c = 32;
    public static final int d = 1001;
    public static final int e = 2001;
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 2;
    public static final int i = 3;
    public static final int j = 4;
    public static final int k = 5;
    public static final int l = 7;
    public static final int m = 8;
    public static final String n = "/uDiskFile.txt";
    private static final int s = 3000;
    private static Stack<Thread> y = new Stack();
    private DataInputStream A = null;
    private DataOutputStream B = null;
    private ServerSocket C = null;
    private Handler D = new Handler();
    private b E = b.CAMERA;
    private h F = null;
    private MulticastLock G;
    private BroadcastReceiver H = new BroadcastReceiver(this) {
        final /* synthetic */ CameraSocketService a;

        {
            this.a = r1;
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && ao.b(context)) {
                this.a.v = false;
            }
        }
    };
    private final byte[] I = new byte[]{(byte) 0, (byte) 102, (byte) 0, (byte) 0, (byte) -47, (byte) 7, (byte) 2, (byte) 0, (byte) 65, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    private final byte[] J = new byte[65];
    private final byte[] K = new byte[]{(byte) 0, (byte) 102, (byte) 1, (byte) 0, (byte) -47, (byte) 7, (byte) 2, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    private final byte[] L = new byte[]{(byte) 0, (byte) 102, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    private final byte[] M = new byte[]{(byte) 0, (byte) 102, (byte) 1, (byte) 0, (byte) 32, (byte) 0, (byte) 32, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    private final byte[] N = new byte[]{(byte) 0, (byte) 102, (byte) 0, (byte) 0, (byte) -47, (byte) 7, (byte) 7, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    public c o = new c(this);
    private MulticastSocket p;
    private String q = "224.0.0.1";
    private InetAddress r;
    private String t = null;
    private boolean u = false;
    private boolean v = false;
    private boolean w = false;
    private String x = null;
    private Socket z = null;

    public class a implements Runnable {
        final /* synthetic */ CameraSocketService a;

        public a(CameraSocketService cameraSocketService) {
            this.a = cameraSocketService;
        }

        public void run() {
            while (true) {
                com.fimi.soul.base.a.a("AcceptRunnable", CameraSocketService.class);
                Socket accept = this.a.C.accept();
                if (this.a.A != null) {
                    this.a.A.close();
                    this.a.A = null;
                }
                if (this.a.B != null) {
                    this.a.B.close();
                    this.a.B = null;
                }
                if (this.a.z != null) {
                    this.a.z.close();
                    this.a.z = null;
                }
                this.a.w = true;
                Thread thread = new Thread(new d(this.a, accept));
                thread.start();
                CameraSocketService.y.add(thread);
                this.a.x = accept.getInetAddress().getHostAddress();
                com.fimi.soul.base.a.a("initClientSocket=Connected=ServerIp=" + this.a.x, CameraSocketService.class);
                while (this.a.z == null && this.a.x != null) {
                    try {
                        Thread.sleep(500);
                        this.a.z = new Socket(this.a.x, com.fimi.soul.utils.c.b);
                        com.fimi.soul.base.a.a("create Server Socket=" + this.a.z, CameraSocketService.class);
                        if (this.a.z != null) {
                            this.a.A = new DataInputStream(this.a.z.getInputStream());
                            this.a.B = new DataOutputStream(this.a.z.getOutputStream());
                            this.a.v = true;
                            Thread thread2 = new Thread(new f(this.a));
                            thread2.start();
                            CameraSocketService.y.add(thread2);
                            this.a.a(0, this.a.v, this.a.x);
                            break;
                        }
                    } catch (UnknownHostException e) {
                        e.printStackTrace();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    } catch (InterruptedException e3) {
                        e3.printStackTrace();
                    }
                }
                try {
                    if (this.a.z != null) {
                        this.a.a(this.a.z);
                    }
                } catch (IOException e22) {
                    e22.printStackTrace();
                }
            }
        }
    }

    public enum b {
        U_DISK,
        CAMERA
    }

    public class c extends Binder {
        final /* synthetic */ CameraSocketService a;

        public c(CameraSocketService cameraSocketService) {
            this.a = cameraSocketService;
        }

        public CameraSocketService a() {
            return this.a;
        }
    }

    public class d implements Runnable {
        final /* synthetic */ CameraSocketService a;
        private DataInputStream b = null;

        public d(CameraSocketService cameraSocketService, Socket socket) {
            this.a = cameraSocketService;
            try {
                this.b = new DataInputStream(socket.getInputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void run() {
            byte[] bArr = new byte[4096];
            while (true) {
                try {
                    int read = this.b.read(bArr);
                    if (read != -1) {
                        String str = new String(bArr, 0, read, "UTF-8");
                        if (str != null) {
                            this.a.a(3, true, str);
                        }
                    } else {
                        return;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
    }

    public class e implements Runnable {
        final /* synthetic */ CameraSocketService a;

        public e(CameraSocketService cameraSocketService) {
            this.a = cameraSocketService;
        }

        public void run() {
            com.fimi.soul.utils.c.a(this.a.L);
            byte[] bArr = new byte[28];
            byte[] bytes = ao.f(this.a).getBytes();
            for (int i = 0; i < bytes.length; i++) {
                bArr[i] = bytes[i];
            }
            bArr[20] = (byte) 5;
            bArr[21] = (byte) -26;
            bArr[22] = (byte) 0;
            bArr[23] = (byte) 0;
            bArr[24] = (byte) 1;
            bArr[25] = (byte) 0;
            bArr[26] = (byte) 0;
            bArr[27] = (byte) 0;
            com.fimi.soul.utils.c.a(bArr);
            try {
                Thread.sleep(3000);
                if (!this.a.g()) {
                    this.a.a(7, this.a.v, "refuse connect");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public class f implements Runnable {
        final /* synthetic */ CameraSocketService a;

        public f(CameraSocketService cameraSocketService) {
            this.a = cameraSocketService;
        }

        public void run() {
            while (this.a.v) {
                try {
                    Thread.sleep(NotificationOptions.a);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (!this.a.u) {
                    this.a.v = false;
                    com.fimi.soul.utils.c.a(this.a.B, this.a.M);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                    if (!this.a.v) {
                        this.a.a(7, true, "HEARTBEATBROADCAST disConnect....");
                        this.a.e();
                    }
                }
            }
        }
    }

    public class g implements Runnable {
        final /* synthetic */ CameraSocketService a;

        public g(CameraSocketService cameraSocketService) {
            this.a = cameraSocketService;
        }

        public void run() {
            byte[] bArr = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 1024);
            while (true) {
                try {
                    this.a.G.acquire();
                    this.a.p.receive(datagramPacket);
                    this.a.a(-1, true, new String(bArr, 0, datagramPacket.getLength()) + datagramPacket.getAddress().getHostAddress());
                    this.a.G.release();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public interface h {
        void a(int i, boolean z, String str);
    }

    private void a(DataInputStream dataInputStream) {
        boolean z = false;
        byte[] bArr = new byte[68];
        try {
            if (dataInputStream.read(bArr) != -1) {
                long b = (long) com.fimi.soul.utils.c.b(bArr, 64);
                if (b > 0) {
                    File file = new File(j.j());
                    if (!file.exists()) {
                        file.mkdir();
                    }
                    String str = j.l() + this.t;
                    if (n.equalsIgnoreCase(this.t)) {
                        str = j.j() + this.t;
                    } else {
                        z = true;
                    }
                    try {
                        com.fimi.soul.utils.c.a(this.B, this.K);
                        this.u = true;
                        com.fimi.soul.utils.c.a(str, b, dataInputStream, this, z);
                        this.u = false;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    private void a(Socket socket) {
        int i = 0;
        byte[] bArr = new byte[1024];
        int i2 = 0;
        int i3 = 0;
        while (this.A != null && this.A.read(bArr) != -1) {
            this.v = true;
            if (a == com.fimi.soul.utils.c.a(bArr, 0)) {
                i = com.fimi.soul.utils.c.a(bArr, 2);
                i3 = com.fimi.soul.utils.c.a(bArr, 4);
                i2 = com.fimi.soul.utils.c.a(bArr, 6);
                com.fimi.soul.base.a.a("mCurMsgType =" + i3, getClass());
            }
            if (i3 == b) {
                a(this.A);
            } else if (i3 == 2001) {
                continue;
            } else if (i3 == 1001) {
                if (i != 1) {
                    try {
                        a(2, false, null);
                    } catch (IOException e) {
                        e.printStackTrace();
                        if (socket != null) {
                            try {
                                socket.close();
                                return;
                            } catch (IOException e2) {
                                e2.printStackTrace();
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th) {
                        if (socket != null) {
                            try {
                                socket.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                    }
                } else if (i2 == 7) {
                    this.v = false;
                    break;
                } else if (i2 == 2) {
                    a(2, true, this.t);
                    this.t = null;
                } else {
                    continue;
                }
            } else if (i3 == 32) {
                a(i3, true, "connected");
            }
        }
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e22) {
                e22.printStackTrace();
            }
        }
    }

    private void i() {
        try {
            this.p = new MulticastSocket(com.fimi.soul.utils.c.a);
            this.r = InetAddress.getByName(this.q);
            this.p.joinGroup(this.r);
            Thread thread = new Thread(new g(this));
            thread.start();
            y.add(thread);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(this.H, intentFilter);
    }

    private void k() {
        if (!this.w) {
            try {
                this.C = new ServerSocket(com.fimi.soul.utils.c.b);
                new Thread(new a(this)).start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        com.fimi.soul.base.a.a("startSocketServer " + this.w, CameraSocketService.class);
    }

    private void l() {
        com.fimi.soul.utils.c.a(this.B, this.N);
    }

    public void a() {
        if (this.v) {
            this.t = n;
            com.fimi.soul.utils.c.a(this.B, this.I);
            this.J[0] = (byte) 0;
            com.fimi.soul.utils.c.a(this.B, this.J);
            this.E = b.U_DISK;
            return;
        }
        a(7, this.v, "disConnect..");
    }

    public void a(final int i, final boolean z, final String str) {
        this.D.post(new Runnable(this) {
            final /* synthetic */ CameraSocketService d;

            public void run() {
                if (this.d.F != null) {
                    this.d.F.a(i, z, str);
                }
            }
        });
    }

    public void a(h hVar) {
        this.F = hVar;
        this.F.a(8, g(), "chanager state");
    }

    public void a(String str, String str2) {
        int i = 0;
        if (this.E == b.CAMERA) {
            a(5, this.v, "error mode..");
        } else if (this.v) {
            this.t = str;
            com.fimi.soul.utils.c.a(this.B, this.I);
            byte[] bArr = new byte[65];
            bArr[0] = (byte) 2;
            byte[] bytes = str2.getBytes();
            while (i < bytes.length) {
                if (i + 1 < bArr.length) {
                    bArr[i + 1] = bytes[i];
                }
                i++;
            }
            com.fimi.soul.utils.c.a(this.B, bArr);
        } else {
            a(7, this.v, "disConnect..");
        }
    }

    public void b() {
        if (this.v && this.E != b.CAMERA) {
            com.fimi.soul.utils.c.a(this.B, this.I);
            this.J[0] = (byte) 1;
            com.fimi.soul.utils.c.a(this.B, this.J);
            this.E = b.CAMERA;
        }
        if (!this.v) {
            a(7, this.v, "disConnect..");
        } else if (this.E == b.CAMERA) {
            a(0, this.v, "Connected..");
        }
    }

    public b c() {
        return this.E;
    }

    public void d() {
        int i = 0;
        com.fimi.soul.base.a.a("stopSocketServer", CameraSocketService.class);
        if (this.w && this.C != null) {
            try {
                this.w = false;
                if (!(this.z == null || this.z.isClosed())) {
                    this.z.close();
                    this.z = null;
                }
                if (this.B != null) {
                    this.B.close();
                    this.B = null;
                }
                this.C.close();
                this.C = null;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        int size = y.size();
        while (i < size) {
            if (!(y.get(i) == null || ((Thread) y.get(i)).isInterrupted())) {
                ((Thread) y.get(i)).interrupt();
            }
            i++;
        }
        y.clear();
        if (g()) {
            l();
        }
    }

    public void e() {
        Thread thread = new Thread(new e(this));
        thread.start();
        y.add(thread);
    }

    public String f() {
        return this.x;
    }

    public boolean g() {
        return this.v;
    }

    public IBinder onBind(Intent intent) {
        return this.o;
    }

    public void onCreate() {
        super.onCreate();
        com.fimi.soul.base.a.a("onCreate", CameraSocketService.class);
        this.G = ((WifiManager) getSystemService("wifi")).createMulticastLock("multicastLock");
        k();
        i();
        j();
    }

    public void onDestroy() {
        super.onDestroy();
        d();
        unregisterReceiver(this.H);
    }
}
