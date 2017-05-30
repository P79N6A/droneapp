package com.fimi.soul.biz.camera.c;

import android.util.Log;
import com.fimi.kernel.utils.f;
import com.fimi.kernel.utils.u;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.camera.b;
import com.fimi.soul.biz.camera.c;
import com.fimi.soul.biz.camera.e;
import com.fimi.soul.biz.camera.entity.BaseX11Cmd;
import com.fimi.soul.biz.camera.entity.X11FileInfo;
import com.fimi.soul.biz.camera.entity.X11FileSystem;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.update.i;
import com.fimi.soul.biz.update.l;
import com.fimi.soul.utils.j;
import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

public class d extends a {
    private static final String c = j.n();
    private i a;
    private boolean b;

    public enum a {
        Thumb,
        IDR,
        FullView
    }

    public d(c cVar) {
        super(cVar);
    }

    private void a(X11FileSystem x11FileSystem, X11RespCmd x11RespCmd) {
        X11FileInfo curDownloadFile = x11FileSystem.getCurDownloadFile();
        if (curDownloadFile != null) {
            curDownloadFile.setMd5(x11RespCmd.getMd5sum());
            curDownloadFile.setSize(x11RespCmd.getSize());
            a().a(curDownloadFile);
        }
    }

    private void h() {
        X11FileInfo curUploadFile = a().k().getCurUploadFile();
        Log.d("Good", "发送文件" + curUploadFile);
        if (curUploadFile != null) {
            File file = new File(curUploadFile.getLocalPath());
            long length = file.length();
            this.b = false;
            Log.d("Good", "文件大小" + length);
            if (file.exists()) {
                long j = 0;
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    byte[] bArr = new byte[2560];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            Log.d("Good", "发送完毕,总长度为:" + j);
                            a().k().setCurDownloadFile(null);
                            fileInputStream.close();
                            return;
                        } else if (!this.b) {
                            a(bArr, 0, read);
                            j += (long) read;
                            Log.d("Good", "已发送" + j);
                            if (this.a != null) {
                                this.a.a(j >= length, j, length, 0);
                            }
                        }
                    }
                } catch (Exception e) {
                    Log.d("Good", e.toString());
                    e.printStackTrace();
                }
            }
        }
    }

    public void a(X11FileInfo x11FileInfo) {
        a().k().setCurDownloadFile(x11FileInfo);
        a((int) e.V, x11FileInfo.getName());
    }

    public void a(i iVar) {
        this.a = iVar;
    }

    public void a(String str) {
        a((int) e.T, str);
    }

    public void a(String str, int i) {
        BaseX11Cmd b = b(e.X, str, null);
        b.setSent_size((long) i);
        a(b);
    }

    public void a(String str, a aVar) {
        X11FileInfo x11FileInfo = new X11FileInfo();
        a(str, null, f.a(new Date(), f.e), aVar);
    }

    public void a(String str, String str2, String str3, a aVar) {
        String str4 = null;
        switch (aVar) {
            case Thumb:
                str4 = "thumb";
                break;
            case FullView:
                str4 = "fullview";
                break;
            case IDR:
                str4 = "idr";
                break;
        }
        X11FileInfo x11FileInfo = new X11FileInfo();
        x11FileInfo.setName(str);
        x11FileInfo.setCreateDate(str3);
        x11FileInfo.setAbsolutePath(str2);
        a(1025, str2, str4);
        x11FileInfo.setName(b.a(x11FileInfo));
        x11FileInfo.setLocalPath(c);
        x11FileInfo.setRemotePath(a().k().getCurPath());
        a().k().setCurDownloadFile(x11FileInfo);
    }

    public void a(boolean z) {
        this.b = z;
    }

    public void a(boolean z, X11RespCmd x11RespCmd) {
        super.a(z, x11RespCmd);
        if (z) {
            X11FileSystem k = a().k();
            switch (x11RespCmd.getMsg_id()) {
                case 1025:
                    a(k, x11RespCmd);
                    return;
                case e.T /*1283*/:
                case e.U /*1284*/:
                    k.setCurPath(x11RespCmd.getPwd());
                    return;
                case e.V /*1285*/:
                    a(k, x11RespCmd);
                    return;
                case e.W /*1286*/:
                    l.c("CMD_PUT_FILE:1286");
                    Log.i("msg=", "进入");
                    x.a(new Runnable(this) {
                        final /* synthetic */ d a;

                        {
                            this.a = r1;
                        }

                        public void run() {
                            this.a.h();
                        }
                    });
                    return;
                default:
                    return;
            }
        }
    }

    public void b() {
        a((int) e.U);
    }

    public void b(String str) {
        a((int) e.S, String.format("%s -D -S", new Object[]{str}));
    }

    public void b(String str, int i) {
        a(1027, str, i + "");
    }

    public void c() {
        a("..");
    }

    public void c(String str) {
        a((int) e.R, str);
    }

    public void d() {
        a(e.cv);
    }

    public void d(String str) {
        a(8, str);
    }

    public void e() {
        a(254);
    }

    public void e(String str) {
        X11FileInfo x11FileInfo = new X11FileInfo();
        x11FileInfo.setRemotePath(a().k().getCurPath());
        if (x11FileInfo.getLocalPath() == null) {
            x11FileInfo.setLocalPath(c);
        }
        x11FileInfo.setName(str);
        a(x11FileInfo);
    }

    public void f() {
        String curPath = a().k().getCurPath();
        if (curPath == null) {
            curPath = "";
        }
        b(curPath);
    }

    public void f(String str) {
        a((int) e.X, str);
    }

    public void g(String str) {
        a(1026, str);
    }

    public boolean g() {
        return this.b;
    }

    public void h(String str) {
        BaseX11Cmd b = b(e.W, e.cx + "" + str.substring(str.lastIndexOf("/") + 1), null);
        File file = new File(str);
        String a = u.a(file);
        long length = file.length();
        b.setMd5sum(a);
        b.setSize(length);
        X11FileInfo x11FileInfo = new X11FileInfo();
        x11FileInfo.setLocalPath(str);
        x11FileInfo.setName(file.getName());
        a().k().setCurUploadFile(x11FileInfo);
        a(b);
    }
}
