package com.fimi.soul.drone;

import com.fimi.soul.drone.h.a.f;

public class d
{
  public static enum a
  {
    static
    {
      A = new a("RELANDING", 26);
      B = new a("RETAKEUP", 27);
      C = new a("REHOVER", 28);
      D = new a("REPAUSE", 29);
      E = new a("RERECOVERY", 30);
      F = new a("REEXIST", 31);
      G = new a("EXCESE", 32);
      H = new a("ASSINGNOTIFY", 33);
      I = new a("INTERSTNOTIFY", 34);
      J = new a("FAILSAFE", 35);
      K = new a("HEARDDAY", 36);
      L = new a("INFO", 37);
      M = new a("MISSION_UPDATE", 38);
      N = new a("STATE", 39);
      O = new a("HOMEPOINT", 40);
      P = new a("RC_IN", 41);
      Q = new a("FCVERSION2", 42);
      R = new a("RECEIVEFOLLOWME", 43);
      S = new a("EXCUTEING", 44);
      T = new a("EXISTING", 45);
      U = new a("RECEIVERPOINTS", 46);
      V = new a("BACK", 47);
      W = new a("SETSTART", 48);
      X = new a("PauseWaypoint", 49);
      Y = new a("ResumeWaypoint", 50);
      Z = new a("ExitWaypoint", 51);
      aa = new a("Pauseretrast", 52);
      ab = new a("REUPDATEBUTTON", 53);
      ac = new a("SENDHOVERWAYPOINT", 54);
      ad = new a("FCLICK", 55);
      ae = new a("HCLICK", 56);
      af = new a("NOTIFYROUTE", 57);
      ag = new a("Remotecontrol", 58);
      ah = new a("backControl", 59);
      ai = new a("SIMULATORINFO", 60);
      aj = new a("UPDATELINE", 61);
      ak = new a("DROWLINE", 62);
      al = new a("LINETEXTCOLOR", 63);
      am = new a("UPDATELASTMARKER", 64);
      an = new a("CLEARMARK", 65);
      ao = new a("COMPASS", 66);
      ap = new a("COMPASSY1", 67);
      aq = new a("COMPASSY2", 68);
      ar = new a("TTT", 69);
      as = new a("CLEANALLOBJ", 70);
      at = new a("REFRESHPHONEMEDIA", 71);
      au = new a("DELLALLPHONEMEDIA", 72);
      av = new a("UPDATEALLHISTORY", 73);
      aw = new a("DELLALLHISTORY", 74);
      ax = new a("CLEANCACHE", 75);
      ay = new a("HEARDATA", 76);
      az = new a("HINELIST", 77);
      aA = new a("CLOSEPOPUWIN", 78);
      aB = new a("OPENPOPUWIN", 79);
      aC = new a("GIMBAL_POSITION", 80);
      aD = new a("REGIMBAL_ONEKEY", 81);
      aE = new a("NOFLYZONE", 82);
      aF = new a("FRASH_DISTANCE_DIR", 83);
      aG = new a("SHOWLIST", 84);
      aH = new a("OnRecivedCloudCameraCommandInfo", 85);
      aI = new a("RELAY_FRASH_DISTANCE_SET", 86);
      aJ = new a("DRAWLINGUNCHECK", 87);
      aK = new a("DRAHMARKER", 88);
      aL = new a("CONNECTSUCESS", 89);
      aM = new a("CALIREMOTESUSTOMBUTTON", 90);
      aN = new a("RELEASECHAIN", 91);
      aO = new a("CHANGEFLIGHTHEAD", 92);
      aP = new a("NOTIFYPBATTERY", 93);
      aQ = new a("CLOSEDRAWCONTROL", 94);
      aR = new a("OPENDRAWCONTROL", 95);
      aS = new a("ChangeCameraOrMap", 96);
      aT = new a("RETURN_HEIGHT", 97);
      aU = new a("ERROR_CODE", 98);
      aV = new a("DRONEERRORACTIONCODE", 99);
      aW = new a("CHANGELOCATIONBUTTONOUT", 100);
      aX = new a("CHANGELOCATIONBUTTONIN", 101);
      aY = new a("DRONEACTION", 102);
      aZ = new a("RESETRC", 103);
      ba = new a("CaliCompass", 104);
      bb = new a("QuitCaliRemote", 105);
      bc = new a("GimbalCalibration", 106);
      bd = new a("NEW_HAND_OPERATE", 107);
      be = new a("SHOWCAMPASSCALI", 108);
      bf = new a("NEWREMOTEMODEL", 109);
      bg = new a("SHOWHEIGHTVIEW", 110);
      bh = new a("HIDEHEIGHTVALUE", 111);
      bi = new a("CANCALFLYACTION", 112);
      bj = new a("CLEARDATA", 113);
      bk = new a("READWAYPOINT", 114);
      bl = new a("RESHWAYPOINT", 115);
      bm = new a("SHOWINFORWINDOW", 116);
      bn = new a("NOTIDRONEFLOOR", 117);
      bo = new a("NOTIDRONEAIR", 118);
      bp = new a("HIDEINFORWINDOW", 119);
      bq = new a("DISPLAYLIMITCIRCLE", 120);
      br = new a("HIDEDISPLAYCIRCLE", 121);
      bs = new a("READFLYTO", 122);
      bt = new a("NEWFRONEMODEL", 123);
      bu = new a("CLOSEFLYACTIONFRAGMENT", 124);
      bv = new a("SHOWQUITDOUBLEINFRWINDOW", 125);
      bw = new a("CLOSEOUTTIMEPROBAR", 126);
      bx = new a("SHOWOUTTIMEPROBAR", 127);
      by = new a("DELETE_WAYPOINT", 128);
      bz = new a("SHOWPOIOPERA", 129);
    }
    
    private a() {}
  }
  
  public static abstract interface b
  {
    public abstract void onDroneEvent(d.a parama, a parama1);
  }
  
  public static abstract interface c
  {
    public abstract void a(f paramf);
    
    public abstract void a(f paramf, int paramInt1, int paramInt2);
    
    public abstract void b(f paramf);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */