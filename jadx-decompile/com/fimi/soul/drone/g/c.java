package com.fimi.soul.drone.g;

public class c {
    public static final int A = 6;
    public static final int B = 7;
    public static final int C = 8;
    public static final int D = 9;
    public static final int E = 10;
    public static final int F = 11;
    public static final int G = 12;
    public static final int H = 13;
    public static final int I = 14;
    public static final int J = 15;
    public static final int K = 16;
    public static final int L = 17;
    public static final int M = 18;
    public static final int N = 19;
    public static final int O = 20;
    public static final int P = 4;
    public static final int Q = 8;
    public static final int R = 13;
    public static final int S = 80;
    public static final int T = 30;
    public static final int U = 5;
    public static final int V = 60;
    public static final int W = 30;
    public static final String X = "dronename";
    public static final String Y = "homename";
    public static final String Z = "checkcampass";
    public static final String a = "pref_bluetooth_device_address";
    public static final int aA = 10;
    public static final int aB = 11;
    public static final int aC = 12;
    public static final int aD = 13;
    public static final int aE = 14;
    public static final int aF = 15;
    public static final int aG = 16;
    public static final int aH = 17;
    public static final int aI = 18;
    public static final int aJ = 19;
    public static final int aK = 20;
    public static final int aL = 21;
    public static final int aM = 22;
    public static final int aN = 23;
    public static final int aO = 24;
    public static final int aP = 25;
    public static final int aQ = 26;
    public static final int aR = 27;
    public static final int aS = 28;
    public static final int aT = 29;
    public static final int aU = 4;
    public static final int aV = 5;
    public static final int aW = 33;
    public static final int aX = 34;
    public static final int aY = 35;
    public static final int aZ = 30;
    public static final int aa = 0;
    public static final int ab = 1;
    public static final int ac = 2;
    public static final int ad = 3;
    public static final int ae = 4;
    public static final int af = 5;
    public static final int ag = 6;
    public static final int ah = 7;
    public static final int ai = 8;
    public static final int aj = 9;
    public static final int ak = 10;
    public static final int al = 11;
    public static final int am = 12;
    public static final int an = 13;
    public static final int ao = 14;
    public static final int ap = 15;
    public static final int aq = 0;
    public static final int ar = 1;
    public static final int as = 2;
    public static final int at = 3;
    public static final int au = 4;
    public static final int av = 5;
    public static final int aw = 6;
    public static final int ax = 7;
    public static final int ay = 8;
    public static final int az = 9;
    public static final String b = "pref_connection_type";
    public static final int bA = 2;
    public static final String bB = "CacheDroneContrlType";
    public static final String bC = "REMEBERACTIONTIP";
    public static final String bD = "REMEBERACTIONTIPFlYTO";
    public static final String bE = "REMEBERACTIONTIPPOI";
    public static final String bF = "REMEBERACTIONTAKEPHOTO";
    public static final String bG = "DRONELATITUDE";
    public static final String bH = "DRONELONGITUDE";
    public static final String bI = "F11B-A";
    public static final String bJ = "F11B-C";
    public static final String bK = "DroneMapType";
    public static final int bL = 1894;
    public static final String bM = "Show_9_Grid";
    public static final String bN = "Map_Code_Correction";
    private static final String bO = c.class.getPackage().getName();
    public static final int ba = 31;
    public static final int bb = 32;
    public static final int bc = 36;
    public static final int bd = 0;
    public static final int be = 1;
    public static final int bf = 2;
    public static final int bg = 3;
    public static final int bh = 4;
    public static final int bi = 5;
    public static final int bj = 1;
    public static final int bk = 2;
    public static final int bl = 1;
    public static final int bm = 2;
    public static final int bn = 3;
    public static final String bo = "action_model_type";
    public static final int bp = 0;
    public static final int bq = 1;
    public static final int br = 2;
    public static final int bs = 3;
    public static final int bt = 4;
    public static final int bu = 5;
    public static final int bv = 6;
    public static final int bw = 85;
    public static final int bx = 170;
    public static final int by = 51;
    public static final int bz = 1;
    public static final String c = com.fimi.soul.drone.droneconnection.connection.g.a.USB.name();
    public static final String d = com.fimi.soul.drone.droneconnection.connection.g.a.TCP.name();
    public static final String e = "pref_ui";
    public static final String f = "pref_ui_language_english";
    public static final boolean g = false;
    public static final String h = "pref_drone_settings";
    public static final String i = "pref_connection_port";
    public static final String j = "pref_connection_serviceip";
    public static final String k = "1234";
    public static String l = "192.168.42.100";
    public static final long m = 80;
    public static final int n = 300;
    public static final int o = 20;
    public static final int p = 100;
    public static final int q = 10;
    public static final String r = "flyinfo";
    public static final String s = "Amptype";
    public static a t = a.REMOTESEND;
    public static final int u = 0;
    public static final int v = 1;
    public static final int w = 2;
    public static final int x = 3;
    public static final int y = 4;
    public static final int z = 5;

    public enum a {
        PHONESEND,
        REMOTESEND
    }

    private c() {
    }

    public static a a() {
        return t;
    }

    public static void a(a aVar) {
        t = aVar;
    }

    public static String b() {
        if (com.fimi.soul.biz.a.a.a().b() == 1) {
            l = "192.168.42.100";
        } else {
            l = "192.168.100.1";
        }
        return l;
    }
}
