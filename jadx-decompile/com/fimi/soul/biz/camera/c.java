package com.fimi.soul.biz.camera;

import android.os.AsyncTask;
import android.os.Message;
import android.util.Log;
import com.fimi.kernel.utils.g;
import com.fimi.kernel.utils.u;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.camera.b.e;
import com.fimi.soul.biz.camera.b.f;
import com.fimi.soul.biz.camera.entity.X11ApWifiConfig;
import com.fimi.soul.biz.camera.entity.X11FileInfo;
import com.fimi.soul.biz.camera.entity.X11FileSystem;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.entity.X11RespCmd.NotificationType;
import com.fimi.soul.biz.camera.entity.X11SystemConfig;
import com.fimi.soul.utils.ad;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.j;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class c extends a implements f {
    private static final int d = 1024;
    private static final int e = 1025;
    private static final int f = 2048;
    private static final int g = 2049;
    private static final int h = 4096;
    private static int i = -1;
    private static final long x = 1500;
    private boolean A = true;
    private boolean B = false;
    private boolean C = true;
    private com.fimi.kernel.b.c.d D;
    private long E = 0;
    private String F = null;
    d a;
    com.fimi.soul.biz.e.d b;
    ExecutorService c = Executors.newSingleThreadExecutor();
    private X11ApWifiConfig j;
    private a k = a.Normal;
    private X11SystemConfig l;
    private X11FileSystem m;
    private List<e<X11RespCmd>> n;
    private e<X11RespCmd> o;
    private com.fimi.kernel.b.c.d p;
    private com.fimi.kernel.b.c.a q;
    private DataOutputStream r;
    private com.fimi.soul.biz.camera.b.d s;
    private StringBuilder t = new StringBuilder();
    private c u;
    private d v;
    private com.fimi.kernel.b.b.c w;
    private long y = System.currentTimeMillis();
    private boolean z = false;

    public enum a {
        IDLE,
        Normal,
        Recoding,
        ContinueCapturing,
        PhotoShoting
    }

    class b extends AsyncTask<String, Void, X11RespCmd> {
        final /* synthetic */ c a;

        b(c cVar) {
            this.a = cVar;
        }

        protected X11RespCmd a(String... strArr) {
            X11RespCmd b = this.a.b(strArr[0]);
            if (b != null && b.getMsg_id() == e.S) {
                Map fileList = this.a.m.getFileList();
                if (b.getListing() != null) {
                    try {
                        List<LinkedTreeMap> list = (List) b.getListing();
                        Map hashMap = new HashMap();
                        for (LinkedTreeMap linkedTreeMap : list) {
                            for (String str : linkedTreeMap.keySet()) {
                                hashMap.put(str, linkedTreeMap.get(str));
                            }
                        }
                        List a = this.a.a(hashMap);
                        if (a != null) {
                            fileList.put(this.a.m.getCurPath(), a);
                        }
                    } catch (Exception e) {
                    }
                    this.a.a(false);
                }
            }
            return b;
        }

        protected void a(X11RespCmd x11RespCmd) {
            this.a.a(x11RespCmd);
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return a((String[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            a((X11RespCmd) obj);
        }
    }

    public interface c {
        void a(String str, long j, long j2);
    }

    public interface d {
        void a(a aVar, a aVar2);
    }

    public c(com.fimi.soul.biz.camera.b.c cVar) {
        a(cVar);
        this.l = new X11SystemConfig();
        this.j = new X11ApWifiConfig();
        this.m = new X11FileSystem();
        com.fimi.soul.biz.e.b bVar = new com.fimi.soul.biz.e.b();
        this.b = com.fimi.soul.biz.e.d.a();
        this.n = new ArrayList();
        if (this.p == null) {
            this.p = new com.fimi.kernel.b.c.d(this) {
                final /* synthetic */ c a;

                {
                    this.a = r1;
                }

                public void a(String str) {
                    this.a.a(str);
                }
            };
            b(this.p);
            a(new Runnable(this) {
                final /* synthetic */ c a;

                {
                    this.a = r1;
                }

                public void run() {
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        try {
                            Thread.sleep(c.x);
                            if (this.a.B) {
                                if (this.a.b.n()) {
                                    this.a.z = this.a.b.m();
                                } else {
                                    this.a.z = ao.d(e.a);
                                    this.a.b.a(this.a.z);
                                }
                                if (this.a.z) {
                                    i2++;
                                    i = 0;
                                } else {
                                    i++;
                                    i2 = 0;
                                }
                                if (i > 1) {
                                    if (this.a.d()) {
                                        this.a.a(-1);
                                    }
                                } else if (!this.a.d() && r2 > 1) {
                                    if (System.currentTimeMillis() - this.a.y > 7500) {
                                        this.a.y = System.currentTimeMillis();
                                        this.a.p();
                                    }
                                    this.a.a().sendEmptyMessageDelayed(2048, 500);
                                } else if (this.a.d()) {
                                    if ("".equalsIgnoreCase(this.a.i().getDvVersion())) {
                                        this.a.a = (d) b.a().d();
                                        this.a.a.r().k();
                                    }
                                }
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }
        if (this.q == null) {
            this.q = new com.fimi.kernel.b.c.a(this) {
                final /* synthetic */ c a;

                {
                    this.a = r1;
                }

                public void a(int i, byte[] bArr) {
                    this.a.a(i, bArr);
                }
            };
            a(this.q);
        }
    }

    private List<X11FileInfo> a(Map<String, String> map) {
        List<X11FileInfo> arrayList = new ArrayList();
        for (String str : map.keySet()) {
            X11FileInfo x11FileInfo = new X11FileInfo();
            x11FileInfo.setName(str);
            if (!str.toUpperCase().contains("THM")) {
                x11FileInfo.setLocalPath(j.a() + "X1/");
                String curPath = k().getCurPath();
                x11FileInfo.setAbsolutePath(curPath + "/" + str);
                x11FileInfo.setRemotePath(curPath.substring(curPath.indexOf("DCIM"), curPath.length()) + "/" + str);
                String[] split = ((String) map.get(str)).split("\\|");
                x11FileInfo.setSize(Long.parseLong(split[0].replace(" bytes", "").trim()));
                x11FileInfo.setCreateDate(split[1]);
                arrayList.add(x11FileInfo);
            }
        }
        Collections.sort(arrayList, new Comparator<X11FileInfo>(this) {
            final /* synthetic */ c a;

            {
                this.a = r1;
            }

            public int a(X11FileInfo x11FileInfo, X11FileInfo x11FileInfo2) {
                return x11FileInfo.getCreateDate().replaceAll("[-\\s:]", "").compareTo(x11FileInfo2.getCreateDate().replaceAll("[-\\s:]", ""));
            }

            public /* synthetic */ int compare(Object obj, Object obj2) {
                return a((X11FileInfo) obj, (X11FileInfo) obj2);
            }
        });
        return arrayList;
    }

    private synchronized void a(int i, byte[] bArr) {
        X11FileInfo curDownloadFile = k().getCurDownloadFile();
        Log.d("Good", "len:" + i + "  path" + curDownloadFile.getLocalPath() + " name:" + curDownloadFile.getName() + "downloading:" + i);
        if (curDownloadFile != null) {
            try {
                String str = curDownloadFile.getLocalPath() + curDownloadFile.getName();
                if (i != -1) {
                    if (this.r == null) {
                        this.E = 0;
                        File file = new File(curDownloadFile.getLocalPath());
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        file = new File(str);
                        if (file.exists()) {
                            ao.a(file);
                        }
                        file.createNewFile();
                        this.r = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(str)));
                    }
                    this.E += (long) i;
                    this.r.write(bArr, 0, i);
                    if (this.u != null) {
                        this.u.a(curDownloadFile.getName(), this.E, curDownloadFile.getSize());
                    }
                    a(curDownloadFile);
                    this.F = str;
                }
            } catch (Exception e) {
                Log.d("Good", "ERROR" + e);
            }
        }
    }

    private void a(X11RespCmd x11RespCmd) {
        if (x11RespCmd != null) {
            boolean z;
            this.t.delete(0, this.t.length());
            if (x11RespCmd.getRval() >= 0) {
                z = true;
            } else {
                c(x11RespCmd);
                z = false;
            }
            if (x11RespCmd.isNotification()) {
                b(x11RespCmd);
            } else {
                for (e a : this.n) {
                    a.a(z, x11RespCmd);
                }
            }
            if (x11RespCmd.getNotificationType() == NotificationType.PhotoTaken) {
                a(true);
                if (com.fimi.kernel.c.e().b().booleanValue()) {
                    String obj = x11RespCmd.getParam().toString();
                    if (!"".equalsIgnoreCase(obj)) {
                        this.w = com.fimi.kernel.b.b.c.a(com.fimi.kernel.c.a());
                        String b = j.b(obj.substring(obj.lastIndexOf("/") + 1, obj.length()));
                        this.w.a(String.format("http://%s//%s", new Object[]{e.a, obj.substring(obj.indexOf("DCIM"), obj.length())}), "", 0, Boolean.valueOf(true), b);
                    }
                }
            } else if (x11RespCmd.getNotificationType() == NotificationType.CardInsert) {
                g.b(new File(j.n()));
                b(true);
            } else if (x11RespCmd.getNotificationType() == NotificationType.CardRemoved) {
                g.b(new File(j.n()));
                b(false);
            } else if (x11RespCmd.getNotificationType() == NotificationType.FmLsEnd) {
                x11RespCmd.setNotificationType(NotificationType.FmLsEnd);
                a(Boolean.valueOf(z), x11RespCmd);
                a(false);
            } else if (x11RespCmd.getMsg_id() == 4 && z) {
                if (k().getInfos() != null) {
                    k().getInfos().clear();
                }
            } else if (x11RespCmd.getNotificationType() == NotificationType.StartingVideoRecord) {
                if (this.w == null) {
                    this.w = com.fimi.kernel.b.b.c.a(com.fimi.kernel.c.a());
                }
                this.w.d();
            } else if (x11RespCmd.getNotificationType() == NotificationType.VideoRecordComplete) {
                if (this.w == null) {
                    this.w = com.fimi.kernel.b.b.c.a(com.fimi.kernel.c.a());
                }
                this.w.e();
            }
            if (this.o != null && x11RespCmd.getNotificationType() != NotificationType.FmLsEnd) {
                this.o.a(z, x11RespCmd);
                return;
            }
            return;
        }
        X11RespCmd x11RespCmd2 = new X11RespCmd();
        x11RespCmd2.setMsg_id(e.aj);
        Log.d("Good", "UNkown");
        if (this.o != null) {
            this.o.a(false, x11RespCmd2);
        }
    }

    private void a(final Boolean bool, final X11RespCmd x11RespCmd) {
        ((com.fimi.kernel.b.e.b) com.fimi.kernel.c.a(com.fimi.kernel.b.d.Volley)).b(e.e(), new com.fimi.kernel.b.e<String>(this) {
            final /* synthetic */ c c;

            public void a(String str) {
                if (str != null && !"".equals(str)) {
                    String[] split = str.split("\n");
                    List arrayList = new ArrayList();
                    for (String split2 : split) {
                        String split22;
                        String[] split3 = split22.split("\\|");
                        if (split3.length > 3) {
                            X11FileInfo x11FileInfo = new X11FileInfo();
                            String trim = split3[0].trim();
                            String trim2 = split3[1].trim();
                            String trim3 = split3[2].trim();
                            split22 = split3[3].trim();
                            x11FileInfo.setSize(Long.parseLong(trim));
                            x11FileInfo.setName(trim3);
                            trim = ao.f(trim2);
                            if (trim != null) {
                                x11FileInfo.setCreateDate(trim);
                            }
                            x11FileInfo.setLocalPath(j.a() + "X1/");
                            x11FileInfo.setAbsolutePath(e.cw + split22 + trim3);
                            x11FileInfo.setRemotePath(split22 + trim3);
                            arrayList.add(x11FileInfo);
                        }
                    }
                    if (arrayList != null && arrayList.size() > 0) {
                        this.c.k().setInfos(arrayList);
                    }
                    if (this.c.o != null) {
                        this.c.o.a(bool.booleanValue(), x11RespCmd);
                    }
                } else if (this.c.o != null) {
                    this.c.o.a(false, x11RespCmd);
                }
            }

            public void b(String str) {
                if (this.c.o != null) {
                    this.c.o.a(false, x11RespCmd);
                }
            }
        });
    }

    private void a(String str) {
        if (str.contains("\"msg_id\":1282")) {
            new b(this).executeOnExecutor(this.c, new String[]{str});
            return;
        }
        X11RespCmd b = b(str);
        if (b == null) {
            this.t.append(str);
            b = b(this.t.toString());
        }
        a(b);
    }

    private X11RespCmd b(String str) {
        try {
            return (X11RespCmd) ad.a(str, new TypeToken<X11RespCmd<String>>(this) {
                final /* synthetic */ c a;

                {
                    this.a = r1;
                }
            }.getType());
        } catch (Exception e) {
            e.printStackTrace();
            try {
                return (X11RespCmd) ad.a(str, new TypeToken<X11RespCmd<List<String>>>(this) {
                    final /* synthetic */ c a;

                    {
                        this.a = r1;
                    }
                }.getType());
            } catch (Exception e2) {
                e2.printStackTrace();
                try {
                    return (X11RespCmd) ad.a(str, new TypeToken<X11RespCmd<Object>>(this) {
                        final /* synthetic */ c a;

                        {
                            this.a = r1;
                        }
                    }.getType());
                } catch (Exception e22) {
                    e22.printStackTrace();
                    return null;
                }
            }
        }
    }

    private void b(X11RespCmd x11RespCmd) {
        Log.d("Good", "Notification:" + x11RespCmd.getType());
        if (x11RespCmd.getMsg_id() == 7) {
            if (e.am.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.DisconnectHDMI);
            }
            if (e.an.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.DisconnectShutDown);
            }
            if (e.ao.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.StartingVideoRecord);
            }
            if (e.ap.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.VideoRecordComplete);
            }
            if (e.aq.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.PhotoTaken);
                q();
            }
            if (e.ar.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.ContinueCaputureStarted);
                this.k = a.ContinueCapturing;
            }
            if (e.as.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.ContinueCaptureStoped);
                q();
            }
            if (e.at.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.ContinueCaputureStarted);
                q();
            }
            if (e.au.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.ContiuneBurstCompleted);
                q();
            }
            if (e.aw.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.LowBatteryWarning);
            }
            if (e.av.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.LowStorageWarning);
            }
            if (e.ax.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.TimeLapseVideoStatus);
            }
            if (e.ay.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.TimeLapsePhotoStatus);
            }
            if (e.az.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.CameraConnectToPc);
            }
            if (e.aA.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.LogUpdated);
            }
            if (e.aB.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.PowerModeChange);
            }
            if (e.aC.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.VFStarted);
            }
            if (e.aD.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.VFStoped);
            }
            if (e.aE.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.AutoFileDelete);
            }
            if (e.aF.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.StorageRunOut);
            }
            if (e.aG.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.StorageIOError);
            }
            if (e.aH.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.LowSpeedCard);
            }
            if (e.aI.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.MuxerIndexLimit);
            }
            if (e.aJ.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.MuxerFileSizeLimit);
            }
            if (e.aK.equals(x11RespCmd.getType())) {
                com.fimi.kernel.c.e().c(true);
                com.fimi.kernel.c.e().d(true);
                x11RespCmd.setNotificationType(NotificationType.CardRemoved);
            }
            if (e.aL.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.CardInsert);
            }
            if (e.aN.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.PhotoFinish);
            }
            if (e.aM.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.CannotIssuePIV);
            }
            if (e.aY.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.PutFileComplete);
            }
            if (e.bc.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.FmLsEnd);
            }
            if (e.aO.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.CARD_FILE_SYS_ERROR);
            }
            if (e.aP.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.CARD_PARAM_ERR);
            }
            if (e.aQ.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.CARD_NO_PROPOSE);
            }
            if (e.aR.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.CARD_NO_PROPOSE_AND_PARAM_ERR);
            }
            if (e.aS.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.CARD_WRITE_LOW);
            }
            if (e.aT.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.CARD_WRITE_LOW_AND_PARAM_ERR);
            }
            if (e.aU.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(NotificationType.CARD_SETROOT_ERROR);
            }
        }
    }

    private void c(X11RespCmd x11RespCmd) {
        switch (x11RespCmd.getRval()) {
            case e.bo /*-17*/:
                i().setFreeKBSpace(0);
                return;
            case -4:
            case -3:
                i = -1;
                return;
            case -1:
                if (x11RespCmd.getMsg_id() == 5) {
                    i().setFreeKBSpace(0);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private void q() {
        this.k = a.Normal;
    }

    public void a(int i) {
        i = i;
    }

    protected void a(Message message) {
        if (message.what == 1024) {
            X11FileInfo x11FileInfo = (X11FileInfo) message.obj;
            if (this.s != null) {
                this.s.a(x11FileInfo.getLocalPath(), x11FileInfo.getName());
            }
        } else if (message.what == 1025) {
            r0 = new X11RespCmd();
            r0.setMsg_id(e.al);
            Log.d("Good", "下载失败");
            if (this.o != null) {
                this.o.a(false, r0);
            }
        } else if (message.what == 2048) {
            r0 = new X11RespCmd();
            r0.setMsg_id(e.ah);
            Log.d("Good", "相机连接超时");
            if (this.C && this.m.getCurDirFileList() != null) {
                this.m.getCurDirFileList().clear();
            }
            if (this.o != null) {
                this.o.a(false, r0);
            }
        } else if (message.what == 4096) {
            r0 = new X11RespCmd();
            r0.setMsg_id(e.ak);
            if (this.o != null) {
                this.o.a(false, r0);
            }
        } else if (message.what == g) {
            r0 = new X11RespCmd();
            r0.setMsg_id(e.ai);
            if (this.o != null) {
                this.o.a(false, r0);
            }
        }
    }

    public void a(com.fimi.kernel.b.c.a aVar) {
        ((f) b()).a(aVar);
    }

    @Deprecated
    public void a(com.fimi.kernel.b.c.d dVar) {
        ((f) b()).a(dVar);
    }

    public void a(com.fimi.soul.biz.camera.b.d dVar) {
        this.s = dVar;
    }

    public void a(e<X11RespCmd> eVar) {
        this.o = eVar;
    }

    public void a(a aVar) {
        this.k = aVar;
    }

    public void a(c cVar) {
        this.u = cVar;
    }

    public void a(d dVar) {
        this.v = dVar;
    }

    protected void a(com.fimi.soul.biz.camera.c.a aVar) {
        if (aVar != null) {
            this.n.add(aVar);
        }
    }

    public void a(X11ApWifiConfig x11ApWifiConfig) {
        this.j = x11ApWifiConfig;
    }

    public void a(X11FileInfo x11FileInfo) {
        if (x11FileInfo.getSize() != 0 && this.E >= x11FileInfo.getSize() && this.r != null) {
            Log.d("Good", "下载完毕:" + this.E);
            try {
                this.r.close();
                this.r = null;
                String md5 = x11FileInfo.getMd5();
                File file = new File(x11FileInfo.getLocalPath() + x11FileInfo.getName());
                String a = (file != null && file.isFile() && file.exists()) ? u.a(file) : "";
                Message message = new Message();
                if (md5 == null || a.equals(md5)) {
                    message.what = 1024;
                    message.obj = x11FileInfo;
                    k().setCurDownloadFile(null);
                } else {
                    file.delete();
                    message.what = 1025;
                }
                a().sendMessageDelayed(message, 200);
                this.E = 0;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void a(boolean z) {
        this.C = z;
    }

    public void a(byte[] bArr) {
        b().a(bArr);
    }

    public void a(byte[] bArr, int i, int i2) {
        ((f) b()).a(bArr, i, i2);
    }

    public void b(com.fimi.kernel.b.c.a aVar) {
        ((f) b()).b(aVar);
    }

    @Deprecated
    public void b(com.fimi.kernel.b.c.d dVar) {
        ((f) b()).b(dVar);
    }

    public void b(boolean z) {
        this.A = z;
    }

    public void c(com.fimi.kernel.b.c.d dVar) {
        ((f) b()).a(this.D);
        this.D = dVar;
        ((f) b()).b(this.D);
    }

    public void c(boolean z) {
        this.B = z;
    }

    public boolean c() {
        return this.C;
    }

    public boolean d() {
        return i > 0;
    }

    public int e() {
        return i;
    }

    public a f() {
        return this.k;
    }

    public boolean g() {
        return f() != a.Normal;
    }

    public boolean h() {
        return this.A;
    }

    public X11SystemConfig i() {
        return this.l;
    }

    public X11ApWifiConfig j() {
        return this.j;
    }

    public X11FileSystem k() {
        return this.m;
    }

    public d l() {
        return this.v;
    }

    public void m() {
        if (b() != null && (b() instanceof com.fimi.soul.biz.camera.a.b)) {
            ((com.fimi.soul.biz.camera.a.b) b()).b();
            Log.v("Good", "disConnect");
        }
    }

    public boolean n() {
        return (b() != null && (b() instanceof com.fimi.soul.biz.camera.a.b)) ? ((com.fimi.soul.biz.camera.a.b) b()).c() : false;
    }

    public void o() {
        x.a(new Runnable(this) {
            final /* synthetic */ c a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.b() instanceof com.fimi.soul.biz.camera.a.b) {
                    ((com.fimi.soul.biz.camera.a.b) this.a.b()).e();
                }
            }
        });
    }

    public void p() {
        if (b() != null && (b() instanceof com.fimi.soul.biz.camera.a.b)) {
            ((com.fimi.soul.biz.camera.a.b) b()).d();
            Log.v("Good", "disConnect");
        }
    }
}
