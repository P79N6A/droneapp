package com.google.android.gms.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PictureCallback;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.ShutterCallback;
import android.hardware.Camera.Size;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.support.annotation.RequiresPermission;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import java.lang.Thread.State;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;

public class a {
    @SuppressLint({"InlinedApi"})
    public static final int a = 0;
    @SuppressLint({"InlinedApi"})
    public static final int b = 1;
    private Context c;
    private final Object d;
    private Camera e;
    private int f;
    private int g;
    private com.google.android.gms.common.images.a h;
    private float i;
    private int j;
    private int k;
    private boolean l;
    private SurfaceView m;
    private SurfaceTexture n;
    private boolean o;
    private Thread p;
    private e q;
    private Map<byte[], ByteBuffer> r;

    public static class a {
        private final b<?> a;
        private a b = new a();

        public a(Context context, b<?> bVar) {
            if (context == null) {
                throw new IllegalArgumentException("No context supplied.");
            } else if (bVar == null) {
                throw new IllegalArgumentException("No detector supplied.");
            } else {
                this.a = bVar;
                this.b.c = context;
            }
        }

        public a a(float f) {
            if (f <= 0.0f) {
                throw new IllegalArgumentException("Invalid fps: " + f);
            }
            this.b.i = f;
            return this;
        }

        public a a(int i) {
            if (i == 0 || i == 1) {
                this.b.f = i;
                return this;
            }
            throw new IllegalArgumentException("Invalid camera: " + i);
        }

        public a a(int i, int i2) {
            if (i <= 0 || i > 1000000 || i2 <= 0 || i2 > 1000000) {
                throw new IllegalArgumentException("Invalid preview size: " + i + "x" + i2);
            }
            this.b.j = i;
            this.b.k = i2;
            return this;
        }

        public a a(boolean z) {
            this.b.l = z;
            return this;
        }

        public a a() {
            a aVar = this.b;
            a aVar2 = this.b;
            aVar2.getClass();
            aVar.q = new e(aVar2, this.a);
            return this.b;
        }
    }

    public interface b {
        void a(byte[] bArr);
    }

    public interface c {
        void a();
    }

    private class d implements PreviewCallback {
        final /* synthetic */ a a;

        private d(a aVar) {
            this.a = aVar;
        }

        public void onPreviewFrame(byte[] bArr, Camera camera) {
            this.a.q.a(bArr, camera);
        }
    }

    private class e implements Runnable {
        static final /* synthetic */ boolean a = (!a.class.desiredAssertionStatus());
        final /* synthetic */ a b;
        private b<?> c;
        private long d = SystemClock.elapsedRealtime();
        private final Object e = new Object();
        private boolean f = true;
        private long g;
        private int h = 0;
        private ByteBuffer i;

        e(a aVar, b<?> bVar) {
            this.b = aVar;
            this.c = bVar;
        }

        @SuppressLint({"Assert"})
        void a() {
            if (a || this.b.p.getState() == State.TERMINATED) {
                this.c.a();
                this.c = null;
                return;
            }
            throw new AssertionError();
        }

        void a(boolean z) {
            synchronized (this.e) {
                this.f = z;
                this.e.notifyAll();
            }
        }

        void a(byte[] bArr, Camera camera) {
            synchronized (this.e) {
                if (this.i != null) {
                    camera.addCallbackBuffer(this.i.array());
                    this.i = null;
                }
                if (this.b.r.containsKey(bArr)) {
                    this.g = SystemClock.elapsedRealtime() - this.d;
                    this.h++;
                    this.i = (ByteBuffer) this.b.r.get(bArr);
                    this.e.notifyAll();
                    return;
                }
                Log.d("CameraSource", "Skipping frame. Could not find ByteBuffer associated with the image data from the camera.");
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        @android.annotation.SuppressLint({"InlinedApi"})
        public void run() {
            /*
            r6 = this;
        L_0x0000:
            r1 = r6.e;
            monitor-enter(r1);
        L_0x0003:
            r0 = r6.f;	 Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x001b;
        L_0x0007:
            r0 = r6.i;	 Catch:{ all -> 0x0021 }
            if (r0 != 0) goto L_0x001b;
        L_0x000b:
            r0 = r6.e;	 Catch:{ InterruptedException -> 0x0011 }
            r0.wait();	 Catch:{ InterruptedException -> 0x0011 }
            goto L_0x0003;
        L_0x0011:
            r0 = move-exception;
            r2 = "CameraSource";
            r3 = "Frame processing loop terminated.";
            android.util.Log.d(r2, r3, r0);	 Catch:{ all -> 0x0021 }
            monitor-exit(r1);	 Catch:{ all -> 0x0021 }
        L_0x001a:
            return;
        L_0x001b:
            r0 = r6.f;	 Catch:{ all -> 0x0021 }
            if (r0 != 0) goto L_0x0024;
        L_0x001f:
            monitor-exit(r1);	 Catch:{ all -> 0x0021 }
            goto L_0x001a;
        L_0x0021:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x0021 }
            throw r0;
        L_0x0024:
            r0 = new com.google.android.gms.vision.d$a;	 Catch:{ all -> 0x0021 }
            r0.<init>();	 Catch:{ all -> 0x0021 }
            r2 = r6.i;	 Catch:{ all -> 0x0021 }
            r3 = r6.b;	 Catch:{ all -> 0x0021 }
            r3 = r3.h;	 Catch:{ all -> 0x0021 }
            r3 = r3.a();	 Catch:{ all -> 0x0021 }
            r4 = r6.b;	 Catch:{ all -> 0x0021 }
            r4 = r4.h;	 Catch:{ all -> 0x0021 }
            r4 = r4.b();	 Catch:{ all -> 0x0021 }
            r5 = 17;
            r0 = r0.a(r2, r3, r4, r5);	 Catch:{ all -> 0x0021 }
            r2 = r6.h;	 Catch:{ all -> 0x0021 }
            r0 = r0.a(r2);	 Catch:{ all -> 0x0021 }
            r2 = r6.g;	 Catch:{ all -> 0x0021 }
            r0 = r0.a(r2);	 Catch:{ all -> 0x0021 }
            r2 = r6.b;	 Catch:{ all -> 0x0021 }
            r2 = r2.g;	 Catch:{ all -> 0x0021 }
            r0 = r0.b(r2);	 Catch:{ all -> 0x0021 }
            r0 = r0.a();	 Catch:{ all -> 0x0021 }
            r2 = r6.i;	 Catch:{ all -> 0x0021 }
            r3 = 0;
            r6.i = r3;	 Catch:{ all -> 0x0021 }
            monitor-exit(r1);	 Catch:{ all -> 0x0021 }
            r1 = r6.c;	 Catch:{ Throwable -> 0x0078 }
            r1.b(r0);	 Catch:{ Throwable -> 0x0078 }
            r0 = r6.b;
            r0 = r0.e;
            r1 = r2.array();
            r0.addCallbackBuffer(r1);
            goto L_0x0000;
        L_0x0078:
            r0 = move-exception;
            r1 = "CameraSource";
            r3 = "Exception thrown from receiver.";
            android.util.Log.e(r1, r3, r0);	 Catch:{ all -> 0x008f }
            r0 = r6.b;
            r0 = r0.e;
            r1 = r2.array();
            r0.addCallbackBuffer(r1);
            goto L_0x0000;
        L_0x008f:
            r0 = move-exception;
            r1 = r6.b;
            r1 = r1.e;
            r2 = r2.array();
            r1.addCallbackBuffer(r2);
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.vision.a.e.run():void");
        }
    }

    private class f implements PictureCallback {
        final /* synthetic */ a a;
        private b b;

        private f(a aVar) {
            this.a = aVar;
        }

        public void onPictureTaken(byte[] bArr, Camera camera) {
            if (this.b != null) {
                this.b.a(bArr);
            }
            synchronized (this.a.d) {
                if (this.a.e != null) {
                    this.a.e.startPreview();
                }
            }
        }
    }

    private class g implements ShutterCallback {
        final /* synthetic */ a a;
        private c b;

        private g(a aVar) {
            this.a = aVar;
        }

        public void onShutter() {
            if (this.b != null) {
                this.b.a();
            }
        }
    }

    static class h {
        private com.google.android.gms.common.images.a a;
        private com.google.android.gms.common.images.a b;

        public h(Size size, Size size2) {
            this.a = new com.google.android.gms.common.images.a(size.width, size.height);
            if (size2 != null) {
                this.b = new com.google.android.gms.common.images.a(size2.width, size2.height);
            }
        }

        public com.google.android.gms.common.images.a a() {
            return this.a;
        }

        public com.google.android.gms.common.images.a b() {
            return this.b;
        }
    }

    private a() {
        this.d = new Object();
        this.f = 0;
        this.i = com.google.android.gms.maps.model.b.b;
        this.j = 1024;
        this.k = 768;
        this.l = false;
        this.r = new HashMap();
    }

    private static int a(int i) {
        CameraInfo cameraInfo = new CameraInfo();
        for (int i2 = 0; i2 < Camera.getNumberOfCameras(); i2++) {
            Camera.getCameraInfo(i2, cameraInfo);
            if (cameraInfo.facing == i) {
                return i2;
            }
        }
        return -1;
    }

    static h a(Camera camera, int i, int i2) {
        h hVar = null;
        int i3 = Integer.MAX_VALUE;
        for (h hVar2 : a(camera)) {
            h hVar3;
            int i4;
            com.google.android.gms.common.images.a a = hVar2.a();
            int abs = Math.abs(a.b() - i2) + Math.abs(a.a() - i);
            if (abs < i3) {
                int i5 = abs;
                hVar3 = hVar2;
                i4 = i5;
            } else {
                i4 = i3;
                hVar3 = hVar;
            }
            i3 = i4;
            hVar = hVar3;
        }
        return hVar;
    }

    static List<h> a(Camera camera) {
        Parameters parameters = camera.getParameters();
        List<Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        List<Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        List<h> arrayList = new ArrayList();
        for (Size size : supportedPreviewSizes) {
            float f = ((float) size.width) / ((float) size.height);
            for (Size size2 : supportedPictureSizes) {
                if (Math.abs(f - (((float) size2.width) / ((float) size2.height))) < 0.01f) {
                    arrayList.add(new h(size, size2));
                    break;
                }
            }
        }
        if (arrayList.size() == 0) {
            Log.w("CameraSource", "No preview sizes have a corresponding same-aspect-ratio picture size");
            for (Size size3 : supportedPreviewSizes) {
                arrayList.add(new h(size3, null));
            }
        }
        return arrayList;
    }

    private void a(Camera camera, Parameters parameters, int i) {
        int i2;
        int rotation = ((WindowManager) this.c.getSystemService("window")).getDefaultDisplay().getRotation();
        switch (rotation) {
            case 0:
                rotation = 0;
                break;
            case 1:
                rotation = 90;
                break;
            case 2:
                rotation = Opcodes.GETFIELD;
                break;
            case 3:
                rotation = 270;
                break;
            default:
                Log.e("CameraSource", "Bad rotation value: " + rotation);
                rotation = 0;
                break;
        }
        CameraInfo cameraInfo = new CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        if (cameraInfo.facing == 1) {
            i2 = (rotation + cameraInfo.orientation) % 360;
            rotation = (360 - i2) % 360;
        } else {
            rotation = ((cameraInfo.orientation - rotation) + 360) % 360;
            i2 = rotation;
        }
        this.g = i2 / 90;
        camera.setDisplayOrientation(rotation);
        parameters.setRotation(i2);
    }

    @SuppressLint({"InlinedApi"})
    private byte[] a(com.google.android.gms.common.images.a aVar) {
        Object obj = new byte[(((int) Math.ceil(((double) ((long) (ImageFormat.getBitsPerPixel(17) * (aVar.b() * aVar.a())))) / 8.0d)) + 1)];
        ByteBuffer wrap = ByteBuffer.wrap(obj);
        if (wrap.hasArray() && wrap.array() == obj) {
            this.r.put(obj, wrap);
            return obj;
        }
        throw new IllegalStateException("Failed to create valid buffer for camera source.");
    }

    @SuppressLint({"InlinedApi"})
    static int[] a(Camera camera, float f) {
        int i = (int) (1000.0f * f);
        int[] iArr = null;
        int i2 = Integer.MAX_VALUE;
        for (int[] iArr2 : camera.getParameters().getSupportedPreviewFpsRange()) {
            int[] iArr3;
            int i3;
            int abs = Math.abs(i - iArr2[0]) + Math.abs(i - iArr2[1]);
            if (abs < i2) {
                int i4 = abs;
                iArr3 = iArr2;
                i3 = i4;
            } else {
                i3 = i2;
                iArr3 = iArr;
            }
            i2 = i3;
            iArr = iArr3;
        }
        return iArr;
    }

    @SuppressLint({"InlinedApi"})
    private Camera f() {
        int a = a(this.f);
        if (a == -1) {
            throw new RuntimeException("Could not find requested camera.");
        }
        Camera open = Camera.open(a);
        h a2 = a(open, this.j, this.k);
        if (a2 == null) {
            throw new RuntimeException("Could not find suitable preview size.");
        }
        com.google.android.gms.common.images.a b = a2.b();
        this.h = a2.a();
        int[] a3 = a(open, this.i);
        if (a3 == null) {
            throw new RuntimeException("Could not find suitable preview frames per second range.");
        }
        Parameters parameters = open.getParameters();
        if (b != null) {
            parameters.setPictureSize(b.a(), b.b());
        }
        parameters.setPreviewSize(this.h.a(), this.h.b());
        parameters.setPreviewFpsRange(a3[0], a3[1]);
        parameters.setPreviewFormat(17);
        a(open, parameters, a);
        if (this.l) {
            if (parameters.getSupportedFocusModes().contains("continuous-video")) {
                parameters.setFocusMode("continuous-video");
            } else {
                Log.i("CameraSource", "Camera auto focus is not supported on this device.");
            }
        }
        open.setParameters(parameters);
        open.setPreviewCallbackWithBuffer(new d());
        open.addCallbackBuffer(a(this.h));
        open.addCallbackBuffer(a(this.h));
        open.addCallbackBuffer(a(this.h));
        open.addCallbackBuffer(a(this.h));
        return open;
    }

    @RequiresPermission("android.permission.CAMERA")
    public a a(SurfaceHolder surfaceHolder) {
        synchronized (this.d) {
            if (this.e != null) {
            } else {
                this.e = f();
                this.e.setPreviewDisplay(surfaceHolder);
                this.e.startPreview();
                this.p = new Thread(this.q);
                this.q.a(true);
                this.p.start();
                this.o = false;
            }
        }
        return this;
    }

    public void a() {
        synchronized (this.d) {
            c();
            this.q.a();
        }
    }

    public void a(c cVar, b bVar) {
        synchronized (this.d) {
            if (this.e != null) {
                ShutterCallback gVar = new g();
                gVar.b = cVar;
                PictureCallback fVar = new f();
                fVar.b = bVar;
                this.e.takePicture(gVar, null, null, fVar);
            }
        }
    }

    @RequiresPermission("android.permission.CAMERA")
    public a b() {
        synchronized (this.d) {
            if (this.e != null) {
            } else {
                this.e = f();
                if (VERSION.SDK_INT >= 11) {
                    this.n = new SurfaceTexture(100);
                    this.e.setPreviewTexture(this.n);
                    this.o = true;
                } else {
                    this.m = new SurfaceView(this.c);
                    this.e.setPreviewDisplay(this.m.getHolder());
                    this.o = false;
                }
                this.e.startPreview();
                this.p = new Thread(this.q);
                this.q.a(true);
                this.p.start();
            }
        }
        return this;
    }

    public void c() {
        synchronized (this.d) {
            this.q.a(false);
            if (this.p != null) {
                try {
                    this.p.join();
                } catch (InterruptedException e) {
                    Log.d("CameraSource", "Frame processing thread interrupted on release.");
                }
                this.p = null;
            }
            if (this.e != null) {
                this.e.stopPreview();
                this.e.setPreviewCallbackWithBuffer(null);
                try {
                    if (this.o) {
                        this.e.setPreviewTexture(null);
                    } else {
                        this.e.setPreviewDisplay(null);
                    }
                } catch (Exception e2) {
                    String valueOf = String.valueOf(e2);
                    Log.e("CameraSource", new StringBuilder(String.valueOf(valueOf).length() + 32).append("Failed to clear camera preview: ").append(valueOf).toString());
                }
                this.e.release();
                this.e = null;
            }
            this.r.clear();
        }
    }

    public com.google.android.gms.common.images.a d() {
        return this.h;
    }

    public int e() {
        return this.f;
    }
}
