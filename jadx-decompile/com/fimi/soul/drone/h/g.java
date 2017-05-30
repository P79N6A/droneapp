package com.fimi.soul.drone.h;

import com.fimi.soul.drone.c.a.d;
import com.fimi.soul.module.droneui.DroneMap;

public class g extends a {
    private com.fimi.soul.drone.h.i.b a = com.fimi.soul.drone.h.i.b.Set;
    private a b = a.NormalReady;
    private b c = b.NormalReady;
    private c d = c.NoWarining;
    private byte e;
    private byte f;
    private byte g;
    private byte h;

    public enum a {
        NormalReady,
        PhotoShoting,
        VideoRecording,
        Error,
        Formating,
        NoSDCard,
        FullSDCard,
        OUTSDCard,
        WIFIINIT,
        CAMERASTART,
        SAVEPHOTO,
        LOW_SPEED_CARD,
        UPDATEPRO,
        UPDATEFAILE,
        CardNoPropose,
        CardNoProposeAndParamerr,
        CardWriteLow,
        CardWriteLowAndParamerr,
        CardSetroot,
        CardFileSysError,
        CardParametersError,
        MachineException
    }

    public enum b {
        NormalReady,
        Formating,
        NoSDCard,
        Error
    }

    public enum c {
        NoWarining,
        FullSDCard
    }

    private com.fimi.soul.drone.h.i.b a(byte b) {
        return b == (byte) 1 ? com.fimi.soul.drone.h.i.b.Set : b == (byte) 2 ? com.fimi.soul.drone.h.i.b.Get : this.a;
    }

    private b b(byte b) {
        return b == (byte) 1 ? b.NormalReady : b == (byte) 2 ? b.Formating : b == (byte) 3 ? b.NoSDCard : b.Error;
    }

    private c c(byte b) {
        return b == (byte) 1 ? c.FullSDCard : c.NoWarining;
    }

    public void a(d dVar) {
        dVar.c();
        byte d = dVar.d();
        this.e = d;
        this.f = dVar.d();
        this.g = dVar.d();
        this.h = dVar.d();
        byte b = (byte) (d & 3);
        d = (byte) ((d >>> 2) & 3);
        a(d);
        d = (byte) ((d >>> 2) & 3);
        b(d);
        c((byte) ((d >>> 2) & 3));
    }

    public void a(a aVar) {
        this.b = aVar;
    }

    public void a(b bVar) {
        this.c = bVar;
    }

    public void a(c cVar) {
        this.d = cVar;
    }

    public void a(com.fimi.soul.drone.h.i.b bVar) {
        this.a = bVar;
    }

    public int b() {
        return this.e & 255;
    }

    public com.fimi.soul.drone.h.i.b c() {
        return this.a;
    }

    public long d() {
        long j = 0;
        if (this.e == (byte) 1) {
            j = (long) (this.f & ((this.g * 16) + 255));
        }
        return this.e == (byte) 2 ? (long) (((((this.f * 60) * 60) * 1000) + ((this.g * 60) * 1000)) + (this.h * 1000)) : j;
    }

    public int e() {
        return this.f;
    }

    public a f() {
        return this.e == (byte) 0 ? a.NormalReady : this.e == (byte) 1 ? a.PhotoShoting : this.e == (byte) 2 ? a.VideoRecording : this.e == (byte) 3 ? a.MachineException : this.e == (byte) 16 ? a.Formating : this.e == (byte) 17 ? a.CardNoPropose : this.e == (byte) 18 ? a.CardNoProposeAndParamerr : this.e == (byte) 19 ? a.CardWriteLow : this.e == (byte) 20 ? a.CardWriteLowAndParamerr : this.e == (byte) 21 ? a.CardSetroot : this.e == (byte) 32 ? a.NoSDCard : this.e == (byte) 48 ? a.CardParametersError : this.e == (byte) 64 ? a.FullSDCard : this.e == DroneMap.m ? a.OUTSDCard : this.e == (byte) 81 ? a.CAMERASTART : this.e == DroneMap.n ? a.WIFIINIT : this.e == (byte) 83 ? a.SAVEPHOTO : this.e == (byte) 84 ? a.LOW_SPEED_CARD : this.e == com.fimi.soul.module.setting.newhand.c.f ? a.CardFileSysError : (this.e & 255) == 255 ? a.UPDATEPRO : (this.e & 255) == 254 ? a.UPDATEFAILE : a.Error;
    }

    public b g() {
        return this.c;
    }

    public c h() {
        return this.d;
    }

    public String toString() {
        return "CloudCameraStatusVariable{cameraMode=" + this.a + ", cameraStatus=" + this.b + ", sdCardStatus=" + this.c + ", waringStatus=" + this.d + ", status = " + this.e + ", time = " + d() + '}';
    }
}
