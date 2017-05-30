package com.fimi.soul.a.a;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

public class a
  implements SensorEventListener
{
  boolean a = true;
  private Context b;
  private SensorManager c;
  private Sensor d;
  private Sensor e;
  private float f;
  private a g;
  
  public a(Context paramContext)
  {
    this.b = paramContext;
  }
  
  public void a()
  {
    this.c = ((SensorManager)this.b.getSystemService("sensor"));
    if (this.c != null)
    {
      this.e = this.c.getDefaultSensor(3);
      this.d = this.c.getDefaultSensor(4);
    }
    if ((this.e != null) || (this.d != null))
    {
      this.c.registerListener(this, this.e, 2);
      SensorManager localSensorManager1 = this.c;
      Sensor localSensor = this.d;
      SensorManager localSensorManager2 = this.c;
      localSensorManager1.registerListener(this, localSensor, 2);
    }
  }
  
  public void a(a parama)
  {
    this.g = parama;
  }
  
  public void b()
  {
    if (this.c != null) {
      this.c.unregisterListener(this);
    }
  }
  
  public void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
  
  public void onSensorChanged(SensorEvent paramSensorEvent)
  {
    if ((paramSensorEvent.sensor.getType() == 4) && (Math.abs(paramSensorEvent.values[2]) > 0.1D)) {
      this.a = true;
    }
    if ((paramSensorEvent.sensor.getType() == 3) && (this.a))
    {
      this.a = false;
      float f1 = paramSensorEvent.values[0];
      if (Math.abs(f1 - this.f) > 1.5D)
      {
        this.g.a(f1);
        this.f = f1;
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(float paramFloat);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */