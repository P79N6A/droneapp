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
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;

@aaa
class v
  implements SensorEventListener
{
  private final SensorManager a;
  private final Object b;
  private final Display c;
  private final float[] d;
  private final float[] e;
  private float[] f;
  private Handler g;
  private a h;
  
  v(Context paramContext)
  {
    this.a = ((SensorManager)paramContext.getSystemService("sensor"));
    this.c = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    this.d = new float[9];
    this.e = new float[9];
    this.b = new Object();
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    float f1 = this.e[paramInt1];
    this.e[paramInt1] = this.e[paramInt2];
    this.e[paramInt2] = f1;
  }
  
  int a()
  {
    return this.c.getRotation();
  }
  
  void a(a parama)
  {
    this.h = parama;
  }
  
  void a(float[] arg1)
  {
    if ((???[0] == 0.0F) && (???[1] == 0.0F) && (???[2] == 0.0F)) {}
    for (;;)
    {
      return;
      synchronized (this.b)
      {
        if (this.f == null) {
          this.f = new float[9];
        }
        SensorManager.getRotationMatrixFromVector(this.d, ???);
        switch (a())
        {
        default: 
          System.arraycopy(this.d, 0, this.e, 0, 9);
          label103:
          a(1, 3);
          a(2, 6);
          a(5, 7);
        }
      }
      synchronized (this.b)
      {
        System.arraycopy(this.e, 0, this.f, 0, 9);
        if (this.h == null) {
          continue;
        }
        this.h.a();
        return;
        ??? = finally;
        throw ???;
        SensorManager.remapCoordinateSystem(this.d, 2, 129, this.e);
        break label103;
        SensorManager.remapCoordinateSystem(this.d, 129, 130, this.e);
        break label103;
        SensorManager.remapCoordinateSystem(this.d, 130, 1, this.e);
      }
    }
  }
  
  void b()
  {
    if (this.g != null) {}
    Sensor localSensor;
    do
    {
      return;
      localSensor = this.a.getDefaultSensor(11);
      if (localSensor == null)
      {
        abr.b("No Sensor of TYPE_ROTATION_VECTOR");
        return;
      }
      HandlerThread localHandlerThread = new HandlerThread("OrientationMonitor");
      localHandlerThread.start();
      this.g = new Handler(localHandlerThread.getLooper());
    } while (this.a.registerListener(this, localSensor, 0, this.g));
    abr.b("SensorManager.registerListener failed.");
    c();
  }
  
  boolean b(float[] paramArrayOfFloat)
  {
    synchronized (this.b)
    {
      if (this.f == null) {
        return false;
      }
      System.arraycopy(this.f, 0, paramArrayOfFloat, 0, this.f.length);
      return true;
    }
  }
  
  void c()
  {
    if (this.g == null) {
      return;
    }
    this.a.unregisterListener(this);
    this.g.post(new Runnable()
    {
      public void run()
      {
        Looper.myLooper().quit();
      }
    });
    this.g = null;
  }
  
  public void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
  
  public void onSensorChanged(SensorEvent paramSensorEvent)
  {
    a(paramSensorEvent.values);
  }
  
  static abstract interface a
  {
    public abstract void a();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */