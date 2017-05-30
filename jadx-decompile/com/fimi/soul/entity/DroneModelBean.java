package com.fimi.soul.entity;

import com.fimi.soul.drone.a;
import java.util.Observable;

public class DroneModelBean extends Observable {
    private int ctrlType;
    private int currentFlightModel;
    private a drone;
    private int flightModel;

    public DroneModelBean(a aVar) {
        this.drone = aVar;
    }

    public int getCurrentFlightModel() {
        return this.currentFlightModel;
    }

    public int getFlightModel() {
        return this.flightModel;
    }

    public void setFlightModel(int i, int i2) {
        this.currentFlightModel = this.flightModel;
        this.ctrlType = i2;
        if ((this.flightModel == 7 || this.flightModel == 3) && ((i2 == 2 || i2 == 1) && i == 1 && !this.drone.ac())) {
            setChanged();
            notifyObservers();
        }
        if (this.flightModel == 2 && this.drone.ac() && i == 1) {
            setChanged();
            notifyObservers();
        }
        this.flightModel = i;
    }
}
