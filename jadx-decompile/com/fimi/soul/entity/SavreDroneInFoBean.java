package com.fimi.soul.entity;

import com.fimi.soul.drone.c.a.c;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

public class SavreDroneInFoBean implements Serializable {
    private ConcurrentHashMap<String, c> hashMap = new ConcurrentHashMap();

    public ConcurrentHashMap<String, c> getHashMap() {
        return this.hashMap;
    }
}
