package com.fimi.soul.biz.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.l.g;
import com.fimi.soul.biz.l.h;
import com.fimi.soul.biz.m.e;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.entity.FdsMsg;
import com.fimi.soul.entity.PlaneMsg;
import com.xiaomi.infra.galaxy.fds.android.model.ObjectMetadata;
import com.xiaomi.infra.galaxy.fds.android.model.ProgressListener;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class f implements Callback, com.fimi.soul.biz.l.g.a {
    private static f a = null;
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 3;
    private static final int f = 4;
    private static final int g = 5;
    private List<h> h = new CopyOnWriteArrayList();
    private g i;
    private Handler j;
    private HashMap<Integer, k> k;
    private Context l = null;

    class a extends ProgressListener implements Runnable {
        ObjectMetadata a;
        int b;
        final /* synthetic */ f c;
        private InputStream d;
        private File e;

        public a(f fVar, int i, InputStream inputStream, File file, ObjectMetadata objectMetadata) {
            this.c = fVar;
            this.b = i;
            this.d = inputStream;
            this.e = file;
            this.a = objectMetadata;
        }

        public void onProgress(long j, long j2) {
            FdsMsg fdsMsg = new FdsMsg();
            fdsMsg.setTotal(j2);
            fdsMsg.setTransferred(j);
            if (this.e != null) {
                fdsMsg.setFilePath(this.e.getAbsolutePath());
            }
            Message obtainMessage = this.c.j.obtainMessage();
            obtainMessage.what = this.b;
            obtainMessage.obj = fdsMsg;
            Bundle bundle = new Bundle();
            if (this.e != null) {
                bundle.putString("file_path", this.e.getAbsolutePath());
            }
            obtainMessage.setData(bundle);
            this.c.j.sendMessage(obtainMessage);
        }

        public void run() {
            Object a;
            Message obtainMessage = this.c.j.obtainMessage();
            if (this.b == 0) {
                a = this.c.i.a(this.e);
            } else if (this.b == 1) {
                a = this.c.i.a(this.d, this.a);
            } else if (this.b == 2) {
                a = this.c.i.a();
            } else if (this.b == 3) {
                a = this.c.i.a(this.d, this.a, this);
            } else if (this.b == 4) {
                a = this.c.i.b(this.e, this);
            } else {
                if (this.b == 5 && this.c.h != null && this.c.h.size() > 0) {
                    for (h hVar : this.c.h) {
                        if (hVar.j.getName().equals(this.e.getName())) {
                            FdsMsg fdsMsg = new FdsMsg();
                            PlaneMsg planeMsg = new PlaneMsg();
                            com.fimi.soul.biz.l.f e = hVar.e();
                            PlaneMsg planeMsg2;
                            if (e != null) {
                                fdsMsg.setBucketName(com.fimi.soul.base.a.o);
                                fdsMsg.setObjectName(e.c());
                                fdsMsg.setUrl(e.d());
                                planeMsg.setSuccess(true);
                                planeMsg.setData(fdsMsg);
                                planeMsg.setFile(this.e);
                                planeMsg2 = planeMsg;
                            } else {
                                planeMsg.setSuccess(false);
                                planeMsg2 = planeMsg;
                            }
                        }
                    }
                }
                a = null;
            }
            obtainMessage.what = this.b;
            obtainMessage.obj = a;
            this.c.j.sendMessage(obtainMessage);
        }
    }

    public f(Context context) {
        this.i = new g(context);
        this.j = new Handler(context.getMainLooper(), this);
        this.l = context;
        this.k = new HashMap();
        this.i.a((com.fimi.soul.biz.l.g.a) this);
    }

    public static f a(Context context) {
        if (a == null) {
            a = new f(context);
        }
        return a;
    }

    public void a() {
        if (this.h != null && this.h.size() > 0) {
            for (h d : this.h) {
                d.d();
            }
            this.h.clear();
        }
    }

    public void a(Bitmap bitmap, e eVar) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(CompressFormat.JPEG, 100, byteArrayOutputStream);
        InputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.setContentLength((long) byteArrayOutputStream.toByteArray().length);
        a(byteArrayInputStream, objectMetadata, eVar);
    }

    public void a(Bitmap bitmap, k kVar) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(CompressFormat.JPEG, 100, byteArrayOutputStream);
        InputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.setContentLength((long) byteArrayOutputStream.toByteArray().length);
        a(byteArrayInputStream, objectMetadata, kVar);
    }

    public void a(h hVar) {
        this.h.add(hVar);
    }

    public void a(k kVar) {
        this.k.put(Integer.valueOf(2), kVar);
        x.b(new a(this, 2, null, null, null));
    }

    public void a(File file) {
        if (this.h != null && this.h.size() > 0) {
            for (h hVar : this.h) {
                if (hVar.j.getName().equals(file.getName())) {
                    hVar.c();
                    return;
                }
            }
        }
    }

    public void a(File file, e eVar) {
        this.k.put(Integer.valueOf(4), eVar);
        x.b(new a(this, 4, null, file, null));
    }

    public void a(File file, k kVar) {
        this.k.put(Integer.valueOf(0), kVar);
        x.b(new a(this, 0, null, file, null));
    }

    public void a(InputStream inputStream, ObjectMetadata objectMetadata, e eVar) {
        this.k.put(Integer.valueOf(3), eVar);
        x.b(new a(this, 3, inputStream, null, objectMetadata));
    }

    public void a(InputStream inputStream, ObjectMetadata objectMetadata, k kVar) {
        this.k.put(Integer.valueOf(1), kVar);
        x.b(new a(this, 1, inputStream, null, objectMetadata));
    }

    public void b(File file) {
        if (this.h != null && this.h.size() > 0) {
            for (h hVar : this.h) {
                if (hVar.j.getName().equals(file.getName())) {
                    hVar.d();
                    this.h.remove(hVar);
                    return;
                }
            }
        }
    }

    public void b(File file, k kVar) {
        this.k.put(Integer.valueOf(5), kVar);
        x.b(new a(this, 5, null, file, null));
    }

    public boolean handleMessage(Message message) {
        if (message.obj != null && (message.obj instanceof PlaneMsg)) {
            ((k) this.k.get(Integer.valueOf(message.what))).a((PlaneMsg) message.obj, ((PlaneMsg) message.obj).getFile());
        } else if (message.obj != null && (message.obj instanceof FdsMsg)) {
            ((e) this.k.get(Integer.valueOf(message.what))).a(((FdsMsg) message.obj).getTransferred(), ((FdsMsg) message.obj).getTotal(), ((FdsMsg) message.obj).getFilePath());
        }
        return false;
    }
}
