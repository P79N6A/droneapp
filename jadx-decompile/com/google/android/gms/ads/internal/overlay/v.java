package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.aaa;

@aaa
class v implements SensorEventListener {
    private final SensorManager a;
    private final Object b = new Object();
    private final Display c;
    private final float[] d = new float[9];
    private final float[] e = new float[9];
    private float[] f;
    private Handler g;
    private a h;

    interface a {
        void a();
    }

    v(Context context) {
        this.a = (SensorManager) context.getSystemService("sensor");
        this.c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    private void a(int i, int i2) {
        float f = this.e[i];
        this.e[i] = this.e[i2];
        this.e[i2] = f;
    }

    int a() {
        return this.c.getRotation();
    }

    void a(a aVar) {
        this.h = aVar;
    }

    void a(float[] fArr) {
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.b) {
                if (this.f == null) {
                    this.f = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.d, fArr);
            switch (a()) {
                case 1:
                    SensorManager.remapCoordinateSystem(this.d, 2, 129, this.e);
                    break;
                case 2:
                    SensorManager.remapCoordinateSystem(this.d, 129, 130, this.e);
                    break;
                case 3:
                    SensorManager.remapCoordinateSystem(this.d, 130, 1, this.e);
                    break;
                default:
                    System.arraycopy(this.d, 0, this.e, 0, 9);
                    break;
            }
            a(1, 3);
            a(2, 6);
            a(5, 7);
            synchronized (this.b) {
                System.arraycopy(this.e, 0, this.f, 0, 9);
            }
            if (this.h != null) {
                this.h.a();
            }
        }
    }

    void b() {
        if (this.g == null) {
            Sensor defaultSensor = this.a.getDefaultSensor(11);
            if (defaultSensor == null) {
                b.b("No Sensor of TYPE_ROTATION_VECTOR");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
            handlerThread.start();
            this.g = new Handler(handlerThread.getLooper());
            if (!this.a.registerListener(this, defaultSensor, 0, this.g)) {
                b.b("SensorManager.registerListener failed.");
                c();
            }
        }
    }

    boolean b(float[] fArr) {
        boolean z = false;
        synchronized (this.b) {
            if (this.f == null) {
            } else {
                System.arraycopy(this.f, 0, fArr, 0, this.f.length);
                z = true;
            }
        }
        return z;
    }

    void c() {
        if (this.g != null) {
            this.a.unregisterListener(this);
            this.g.post(new Runnable(this) {
                final /* synthetic */ v a;

                {
                    this.a = r1;
                }

                public void run() {
                    Looper.myLooper().quit();
                }
            });
            this.g = null;
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        a(sensorEvent.values);
    }
}
