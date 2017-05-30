package com.fimi.soul.biz.update;

import android.content.Context;
import com.fimi.kernel.c;
import com.fimi.kernel.utils.f;
import com.fimi.kernel.utils.n;
import com.fimi.kernel.utils.t;
import com.fimi.soul.biz.e.d;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.entity.UpgradeDetInfo;
import com.fimi.soul.entity.UpgradeResultInfo;
import com.fimi.soul.entity.User;
import com.fimi.soul.module.update.a.e;
import com.fimi.soul.module.update.b;
import com.fimi.soul.utils.j;
import com.fimi.soul.utils.q;
import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;

public class l {
    public static final String a = "/fw_upgrade/Camera_Log/";
    public static final String b = "/fw_upgrade/X6_Log/";
    public static final String c = "10010";
    public static final long d = 524288;
    public static final String e = "sp_update_camara_version";
    public static final String f = "sp_update_x6_version";
    private static HashMap<Integer, Integer> g = null;

    public enum a {
        Camera,
        Ap
    }

    public static long a(List<UpdateVersonBean> list) {
        long j = 0;
        for (UpdateVersonBean size : list) {
            j = Long.valueOf(size.getSize()).longValue() + j;
        }
        return j;
    }

    public static UpgradeResultInfo a(Context context) {
        UpgradeResultInfo upgradeResultInfo = new UpgradeResultInfo();
        User b = com.fimi.soul.base.a.b(context);
        if (b != null) {
            upgradeResultInfo.setUserID(b.getUserID());
        }
        Gson gson = new Gson();
        c(gson.toJson(d()));
        upgradeResultInfo.setJsonStr(gson.toJson(d()));
        return upgradeResultInfo;
    }

    public static File a(a aVar) {
        File file = null;
        if (aVar == a.Camera) {
            file = new File(j.a() + a);
        }
        if (aVar == a.Ap) {
            file = new File(j.a() + b);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, f.a(new Date(), f.b) + ".txt");
        try {
            if (file2.exists() && file2.length() > d) {
                file2.delete();
            }
            if (!file2.exists()) {
                file2.createNewFile();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file2;
    }

    public static String a(int i) {
        return String.valueOf(i <= 60 ? 1 : (int) Math.ceil(((double) i) / 60.0d));
    }

    private static String a(com.fimi.soul.drone.e.a aVar) {
        return "" + aVar.d() + aVar.e() + aVar.g() + aVar.f();
    }

    public static String a(String str) {
        return b.F + str + ".bin";
    }

    public static String a(String str, String str2) {
        return b.G + str2 + "_" + str + ".bin";
    }

    public static HashMap<Integer, Integer> a() {
        if (g == null || g.isEmpty()) {
            g = new HashMap();
            g.put(Integer.valueOf(0), Integer.valueOf(210));
            g.put(Integer.valueOf(1), Integer.valueOf(20));
            g.put(Integer.valueOf(9), Integer.valueOf(120));
            g.put(Integer.valueOf(10), Integer.valueOf(40));
            g.put(Integer.valueOf(3), Integer.valueOf(Opcodes.GETFIELD));
            g.put(Integer.valueOf(6), Integer.valueOf(50));
            g.put(Integer.valueOf(4), Integer.valueOf(150));
            g.put(Integer.valueOf(11), Integer.valueOf(60));
            g.put(Integer.valueOf(15), Integer.valueOf(60));
            g.put(Integer.valueOf(14), Integer.valueOf(60));
            g.put(Integer.valueOf(13), Integer.valueOf(600));
            g.put(Integer.valueOf(253), Integer.valueOf(600));
            g.put(Integer.valueOf(5), Integer.valueOf(60));
        }
        return g;
    }

    public static void a(File file, String str) {
        IOException e;
        Throwable th;
        RandomAccessFile randomAccessFile;
        try {
            randomAccessFile = new RandomAccessFile(file.getAbsoluteFile(), "rw");
            try {
                randomAccessFile.seek(randomAccessFile.length());
                randomAccessFile.writeBytes("\n" + q.a() + "    " + new String(str.getBytes("ISO-8859-1"), "UTF-8"));
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (IOException e3) {
                e2 = e3;
                try {
                    e2.printStackTrace();
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e22) {
                            e22.printStackTrace();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            }
        } catch (IOException e5) {
            e22 = e5;
            randomAccessFile = null;
            e22.printStackTrace();
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            throw th;
        }
    }

    public static int b(int i) {
        switch (i) {
            case 0:
                return 8;
            case 1:
                return 11;
            case 3:
                return 3;
            case 4:
            case 13:
                return 1;
            case 5:
                return 9;
            case 6:
                return 4;
            case 9:
                return 5;
            case 10:
                return 6;
            case 11:
                return 12;
            case 14:
                return 10;
            case 15:
                return 13;
            case 253:
                return 7;
            default:
                return -1;
        }
    }

    public static long b(List<FirmwareInfo> list) {
        long j = 0;
        for (FirmwareInfo fileSize : list) {
            j = fileSize.getFileSize() + j;
        }
        return j;
    }

    public static String b() {
        List e = com.fimi.soul.module.update.a.a.a().e();
        return (e == null || e.size() <= 0) ? null : String.valueOf(t.a((((double) a(e)) / 1024.0d) / 1024.0d, 2));
    }

    public static String b(String str, String str2) {
        return b.H + str2 + "_" + str + ".bin";
    }

    public static void b(String str) {
        a(a(a.Ap), str);
    }

    public static int c(int i) {
        return i == 17 ? 0 : i == 16 ? 1 : i == 12 ? 3 : i == 18 ? 10 : i == 19 ? 9 : i == 20 ? 6 : i == 23 ? 5 : i;
    }

    public static String c() {
        List d = com.fimi.soul.module.update.a.a.a().d();
        return (d == null || d.size() <= 0) ? null : String.valueOf(t.a((((double) b(d)) / 1024.0d) / 1024.0d, 2));
    }

    public static void c(String str) {
        a(a(a.Camera), str);
    }

    public static UpgradeDetInfo d() {
        UpgradeDetInfo upgradeDetInfo = new UpgradeDetInfo();
        com.fimi.soul.module.update.a.a a = com.fimi.soul.module.update.a.a.a();
        if (a != null) {
            e a2 = a.a(0);
            upgradeDetInfo.setFcHwVersion(a2.c());
            upgradeDetInfo.setFcID(a2.i());
            upgradeDetInfo.setFcSwVersion(a2.b() + "");
            a2 = a.a(1);
            upgradeDetInfo.setRcHwVersion(a2.c());
            upgradeDetInfo.setRcSwVersion(a2.b() + "");
            upgradeDetInfo.setRcID(a2.i());
            a2 = a.a(10);
            upgradeDetInfo.setNoFlyHwVersion(a2.c());
            upgradeDetInfo.setNoFlySwVersion(a2.b() + "");
            upgradeDetInfo.setNoFlyID(a2.i());
            a2 = a.a(3);
            upgradeDetInfo.setGcHwVersion(a2.c());
            upgradeDetInfo.setGcSwVersion(a2.b() + "");
            upgradeDetInfo.setGcID(a2.i());
            a2 = a.a(9);
            upgradeDetInfo.setX2HwVersion(a2.c());
            upgradeDetInfo.setX2SwVersion(a2.b() + "");
            upgradeDetInfo.setX2ID(a2.i());
            a2 = a.a(6);
            upgradeDetInfo.setServoHwVersion(a2.c());
            upgradeDetInfo.setServoSwVersion(a2.b() + "");
            upgradeDetInfo.setServoID(a2.i());
            a2 = a.a(4);
            upgradeDetInfo.setX1HwVersion(a2.c());
            upgradeDetInfo.setX1SwVersion(a2.b() + "");
            upgradeDetInfo.setX1ID(a2.i());
            e a3 = a.a(4);
            upgradeDetInfo.setX6HwVersion(a3.c());
            upgradeDetInfo.setX6SwVersion(a3.b() + "");
            upgradeDetInfo.setX6ID(a3.i());
        }
        return upgradeDetInfo;
    }

    public static void d(String str) {
        c.c().a(f, str);
    }

    public static boolean d(int i) {
        return i == 199 || i == 201 || i == 202 || i == 203 || i == 204 || i == 106 || i == 193;
    }

    public static void e() {
        d(null);
        e(null);
    }

    public static void e(String str) {
        c.c().a(e, str);
    }

    public static String f() {
        String a = c.c().a(UpdateVersonBean.SP_CAMERA_VERSION);
        return a != null ? String.valueOf(n.n(a)) : "";
    }

    public static String g() {
        String d = d.a().d();
        int i = -1;
        if (d != null) {
            i = Integer.valueOf(n.n(d)).intValue();
        }
        return String.valueOf(i);
    }
}
