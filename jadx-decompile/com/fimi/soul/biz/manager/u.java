package com.fimi.soul.biz.manager;

import android.content.Context;
import android.util.Log;
import com.fimi.kernel.c;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.m.e;
import com.fimi.soul.entity.FdsMsg;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.utils.NetUtil;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.j;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;
import org.json.JSONObject;

public class u {
    private static u d;
    g a;
    b b;
    private Context c;
    private LinkedList<File> e = new LinkedList();
    private com.fimi.soul.drone.e.a f;

    class a implements e {
        final /* synthetic */ u a;

        a(u uVar) {
            this.a = uVar;
        }

        public void a(long j, long j2, String str) {
            if (this.a.a != null && j2 / 100 != 0) {
                this.a.a.a((int) (j / (j2 / 100)), str);
            }
        }

        public void a(PlaneMsg planeMsg, File file) {
            FdsMsg fdsMsg = (FdsMsg) planeMsg.getData();
            if (this.a.f == null) {
                this.a.f = (com.fimi.soul.drone.e.a) c.c().a("0", com.fimi.soul.drone.e.a.class);
            }
            if (com.fimi.soul.base.a.b(this.a.c).getUserID() != null) {
                if (planeMsg.isSuccess()) {
                    this.a.a(fdsMsg, file, this.a.f);
                }
                if (this.a.b != null) {
                    this.a.b.a(planeMsg, file.getPath());
                }
            }
        }
    }

    public interface b {
        void a(PlaneMsg planeMsg, String str);
    }

    public u(Context context) {
        this.c = context;
    }

    public static u a(Context context) {
        if (d == null) {
            d = new u(context);
        }
        return d;
    }

    private void a(FdsMsg fdsMsg, final File file, com.fimi.soul.drone.e.a aVar) {
        final List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "uploadFlyLog"));
        arrayList.add(new BasicNameValuePair("userID", com.fimi.soul.base.a.b(this.c).getUserID() != null ? com.fimi.soul.base.a.b(this.c).getUserID() : "000"));
        arrayList.add(new BasicNameValuePair("planeSsid", com.fimi.soul.module.update.a.a.a().a(0).i()));
        arrayList.add(new BasicNameValuePair("binVersion", com.fimi.soul.module.update.a.a.a().a(0).b() + ""));
        arrayList.add(new BasicNameValuePair("fileFdsUrl", fdsMsg.getUrl()));
        arrayList.add(new BasicNameValuePair("currentTime", ao.b(System.currentTimeMillis())));
        String name = file.getParentFile().getName();
        if (name.equals("NoFly")) {
            arrayList.add(new BasicNameValuePair("isInSky", "1"));
        } else if (name.equals("AirFly")) {
            arrayList.add(new BasicNameValuePair("isInSky", "0"));
        } else {
            arrayList.add(new BasicNameValuePair("isInSky", "0"));
        }
        arrayList.add(new BasicNameValuePair("appType", "0"));
        if (file.getName().endsWith(".sf")) {
            arrayList.add(new BasicNameValuePair("flyLogType", "2"));
        } else {
            arrayList.add(new BasicNameValuePair("flyLogType", "0"));
        }
        String[] split = file.getName().substring(0, file.getName().lastIndexOf(".")).split(" ");
        if (split != null && split.length > 0) {
            arrayList.add(new BasicNameValuePair("createFlieTime", split[0] + " " + split[1].replace(SignatureVisitor.SUPER, ':')));
        }
        x.b(new Runnable(this) {
            final /* synthetic */ u c;

            public void run() {
                String b = NetUtil.b(com.fimi.soul.base.a.j, arrayList, this.c.c);
                PlaneMsg planeMsg = new PlaneMsg();
                planeMsg.setFile(file);
                try {
                    if (!"true".equals(new JSONObject(b).getString("success"))) {
                        return;
                    }
                    if (this.c.b != null) {
                        planeMsg.setSuccess(true);
                        this.c.b.a(planeMsg, file.getPath());
                        return;
                    }
                    planeMsg.setSuccess(false);
                    this.c.b.a(planeMsg, file.getPath());
                } catch (Exception e) {
                    Log.e("good", e.toString());
                    planeMsg.setSuccess(false);
                    this.c.b.a(planeMsg, file.getPath());
                }
            }
        });
    }

    public void a() {
        int i = 0;
        try {
            File file;
            File file2 = new File(j.a() + "/fw_upgrade/FMLink_Up_Log/");
            file2.mkdirs();
            if (file2.exists()) {
                for (File file3 : file2.listFiles()) {
                    if (file3 != null) {
                        file = new File(file2, file3.getName());
                        if (file != null && file.exists()) {
                            file.delete();
                        }
                    }
                }
                file2.delete();
            }
            file2 = new File(j.a() + "/fw_upgrade/FMLink_Down_Log/");
            file2.mkdirs();
            if (file2.exists()) {
                for (File file32 : file2.listFiles()) {
                    if (file32 != null) {
                        file = new File(file2, file32.getName());
                        if (file != null && file.exists()) {
                            file.delete();
                        }
                    }
                }
                file2.delete();
            }
            File file4 = new File(ao.o(this.c));
            if (file4.exists()) {
                file4.delete();
            }
            file4 = new File(j.a() + "/" + "SAVEDRONEINFO/");
            file4.mkdirs();
            if (file4.exists()) {
                File[] listFiles = file4.listFiles();
                int length = listFiles.length;
                while (i < length) {
                    File file5 = listFiles[i];
                    if (file5 != null && file5.exists()) {
                        file5.delete();
                    }
                    i++;
                }
                file4.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a(g gVar) {
        this.a = gVar;
    }

    public void a(b bVar) {
        this.b = bVar;
    }

    public void a(File file) {
        f.a(this.c).a(file, new a(this));
    }

    public void b() {
        this.e.clear();
        this.f = (com.fimi.soul.drone.e.a) c.c().a("0", com.fimi.soul.drone.e.a.class);
        if (this.f != null) {
            this.f.d() + "" + this.f.e() + "" + this.f.g();
        }
        File file = new File(j.a() + "/" + "SAVEDRONEINFO/");
        file.mkdirs();
        if (file.exists() && ao.c(this.c)) {
            for (File file2 : file.listFiles()) {
                if (file2 != null) {
                    File file3 = new File(file, file2.getName());
                    if (file3 != null && file3.exists()) {
                        file3.delete();
                    }
                }
            }
            file.delete();
        }
    }

    public void b(File file) {
        f.a(this.c).a(file);
    }

    public void c() {
        f.a(this.c).a();
    }

    public void c(File file) {
        f.a(this.c).b(file, new a(this));
    }

    public b d() {
        return this.b;
    }

    public void d(File file) {
        f.a(this.c).b(file);
    }
}
