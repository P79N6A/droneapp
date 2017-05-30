package com.fimi.soul.utils;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public class m {
    public static final String A = "";
    public static final String B = "critical";
    public static final String C = "over load";
    public static final String D = "outlier";
    public static final String E = "frozen";
    public static final String F = "unattached";
    public static final String G = "tempe error";
    public static final String H = "";
    public static final String I = "critical";
    public static final String J = "over load";
    public static final String K = "outlier";
    public static final String L = "frozen";
    public static final String M = "unattached";
    public static final String N = "tempe error";
    public static final String O = "";
    public static final String P = "critical";
    public static final String Q = "over load";
    public static final String R = "outlier";
    public static final String S = "frozen";
    public static final String T = "unattached";
    public static final String U = "distraction";
    public static final String V = "";
    public static final String W = "critical";
    public static final String X = "bad signal";
    public static final String Y = "outlier";
    public static final String Z = "frozen";
    public static final String a = "";
    public static final String aA = "unattached";
    public static final String aB = "stall";
    public static final String aC = "overheat";
    public static final String aD = "overspeed";
    public static final String aE = "overcurrent";
    public static final String aF = "";
    public static final String aG = "critical";
    public static final String aH = "unattached";
    public static final String aI = "critical";
    public static final String aJ = "";
    public static final String aK = "";
    public static final String aL = "";
    public static final String aM = "";
    public static final String aN = "critical";
    public static final String aO = "unattached";
    public static final String aP = "critical";
    public static final String aQ = "";
    public static final String aR = "";
    public static final String aS = "";
    public static final String aT = "";
    public static final String aU = "critical";
    public static final String aV = "unattached";
    public static final String aW = "";
    public static final String aX = "";
    public static final String aY = "";
    public static final String aZ = "";
    public static final String aa = "unattached";
    public static final String ab = "distraction";
    public static final String ac = "";
    public static final String ad = "critical";
    public static final String ae = "over load";
    public static final String af = "outlier";
    public static final String ag = "frozen";
    public static final String ah = "unattached";
    public static final String ai = "distraction";
    public static final String aj = "";
    public static final String ak = "critical";
    public static final String al = "unauthorized";
    public static final String am = "Comm error";
    public static final String an = "tempe error";
    public static final String ao = "overcurrent";
    public static final String ap = "low battery level";
    public static final String aq = "low battery level";
    public static final String ar = "";
    public static final String as = "critical";
    public static final String at = "unattached";
    public static final String au = "full";
    public static final String av = "read error";
    public static final String aw = "write error";
    public static final String ax = "";
    public static final String ay = "";
    public static final String az = "critical";
    public static final int b = 0;
    public static final String bA = "";
    public static final String bB = "";
    public static final String bC = "";
    public static final String bD = "";
    private static m bF = null;
    public static final String ba = "";
    public static final String bb = "critical";
    public static final String bc = "unattached";
    public static final String bd = "";
    public static final String be = "";
    public static final String bf = "";
    public static final String bg = "";
    public static final String bh = "";
    public static final String bi = "critical";
    public static final String bj = "bad accel";
    public static final String bk = "euler error";
    public static final String bl = "diverge";
    public static final String bm = "Un calied";
    public static final String bn = "";
    public static final String bo = "";
    public static final String bp = "critical";
    public static final String bq = "close to";
    public static final String br = "entered";
    public static final String bs = "";
    public static final String bt = "";
    public static final String bu = "";
    public static final String bv = "";
    public static final String bw = "critical";
    public static final String bx = "Attitute limit";
    public static final String by = "Attitute limit";
    public static final String bz = "speed limit";
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final String f = "1";
    public static final String g = "2";
    public static final String h = "3";
    public static final String i = "4";
    public static final String j = "5";
    public static final String k = "6";
    public static final String l = "7";
    public static final String m = "8";
    public static final String n = "9";
    public static final String o = "10";
    public static final String p = "11";
    public static final String q = "12";
    public static final String r = "13";
    public static final String s = "32";
    public static final String t = "33";
    public static final String u = "34";
    public static final String v = "over load";
    public static final String w = "outlier";
    public static final String x = "frozen";
    public static final String y = "unattached";
    public static final String z = "tempe error";
    private Map<String, String[]> bE = new HashMap();

    private m() {
        c();
    }

    public static m a() {
        if (bF == null) {
            bF = new m();
        }
        return bF;
    }

    private void c() {
        if (this.bE == null || this.bE.size() == 0) {
            this.bE.put("1", new String[]{"over load;2", "outlier;2", "frozen;2", "unattached;0", "tempe error;2", ";", "critical;0"});
            this.bE.put("2", new String[]{"over load;2", "outlier;2", "frozen;2", "unattached;0", "tempe error;2", ";", "critical;0"});
            this.bE.put("3", new String[]{"over load;2", "outlier;2", "frozen;2", "unattached;0", "tempe error;2", ";", "critical;0"});
            this.bE.put("4", new String[]{"over load;2", "outlier;2", "frozen;2", "unattached;0", "distraction;2", ";", "critical;0"});
            this.bE.put("5", new String[]{"bad signal;2", "outlier;2", "frozen;2", "unattached;0", "distraction;2", ";", "critical;0"});
            this.bE.put("6", new String[]{"over load;2", "outlier;2", "frozen;2", "unattached;0", "distraction;2", "distraction;2", ";", "critical;0"});
            this.bE.put(l, new String[]{"unauthorized;3", "Comm error;3", "tempe error;3", "overcurrent;3", "low battery level;1", "low battery level;0", "critical;0"});
            this.bE.put(m, new String[]{"unattached;3", "full;3", "read error;3", "write error;3", ";", ";", "critical;3"});
            this.bE.put(n, new String[]{"unattached;0", "stall;0", "overheat;0", "overspeed;2", "overcurrent;2", ";", "critical;0"});
            this.bE.put("10", new String[]{"unattached;2", "critical;2", ";", ";", ";", ";", ";", "critical;2"});
            this.bE.put("12", new String[]{"unattached;3", ";", ";", ";", ";", ";", "critical;3"});
            this.bE.put("13", new String[]{"unattached;3", ";", ";", ";", ";", ";", "critical;3"});
            this.bE.put(s, new String[]{"bad accel;3", "euler error;3", "diverge;2", "Un calied;3", ";3", ";3", "critical;3"});
            this.bE.put(t, new String[]{"close to;2", "entered;3", ";3", ";3", ";3", ";3", "critical;3"});
            this.bE.put(u, new String[]{"Attitute limit;2", "Attitute limit;2", "speed limit;2", ";", ";", ";", ";"});
        }
    }

    public String a(int i, int i2, Context context) {
        String str = "";
        if (i2 != 0) {
            String[] a = a(String.valueOf(i2));
            if (a != null && a.length > 0) {
                for (int i3 = 0; i3 < 7; i3++) {
                    if (((1 << i3) & i) > 0) {
                        str = str + a[i3] + "#";
                    }
                }
            }
        }
        return str;
    }

    public boolean a(int i, int i2) {
        return ((1 << (i2 + -1)) & i) > 0;
    }

    public String[] a(String str) {
        return (str == null || str.equals("") || !this.bE.containsKey(str)) ? null : (String[]) this.bE.get(str);
    }

    public Map<String, String[]> b() {
        return this.bE;
    }
}
