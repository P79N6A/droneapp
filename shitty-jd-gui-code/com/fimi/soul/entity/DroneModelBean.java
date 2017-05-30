package com.fimi.soul.entity;

import com.fimi.soul.drone.a;
import java.util.Observable;

public class DroneModelBean
  extends Observable
{
  private int ctrlType;
  private int currentFlightModel;
  private a drone;
  private int flightModel;
  
  public DroneModelBean(a parama)
  {
    this.drone = parama;
  }
  
  public int getCurrentFlightModel()
  {
    return this.currentFlightModel;
  }
  
  public int getFlightModel()
  {
    return this.flightModel;
  }
  
  public void setFlightModel(int paramInt1, int paramInt2)
  {
    this.currentFlightModel = this.flightModel;
    this.ctrlType = paramInt2;
    if (((this.flightModel == 7) || (this.flightModel == 3)) && ((paramInt2 == 2) || (paramInt2 == 1)) && (paramInt1 == 1) && (!this.drone.ac()))
    {
      setChanged();
      notifyObservers();
    }
    if ((this.flightModel == 2) && (this.drone.ac()) && (paramInt1 == 1))
    {
      setChanged();
      notifyObservers();
    }
    this.flightModel = paramInt1;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/DroneModelBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */