package com.fimi.soul.a.a;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

public class a implements SensorEventListener {
    boolean a = true;
    private Context b;
    private SensorManager c;
    private Sensor d;
    private Sensor e;
    private float f;
    private a g;

    public interface a {
        void a(float f);
    }

    public a(Context context) {
        this.b = context;
    }

    public void a() {
        this.c = (SensorManager) this.b.getSystemService("sensor");
        if (this.c != null) {
            this.e = this.c.getDefaultSensor(3);
            this.d = this.c.getDefaultSensor(4);
        }
        if (this.e != null || this.d != null) {
            this.c.registerListener(this, this.e, 2);
            SensorManager sensorManager = this.c;
            Sensor sensor = this.d;
            SensorManager sensorManager2 = this.c;
            sensorManager.registerListener(this, sensor, 2);
        }
    }

    public void a(a aVar) {
        this.g = aVar;
    }

    public void b() {
        if (this.c != null) {
            this.c.unregisterListener(this);
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 4 && ((double) Math.abs(sensorEvent.values[2])) > 0.1d) {
            this.a = true;
        }
        if (sensorEvent.sensor.getType() == 3 && this.a) {
            this.a = false;
            float f = sensorEvent.values[0];
            if (((double) Math.abs(f - this.f)) > 1.5d) {
                this.g.a(f);
                this.f = f;
            }
        }
    }
}
