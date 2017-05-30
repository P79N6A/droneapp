package com.fimi.soul.utils;

public class z {
    static final double a = 3.141592653589793d;
    static final double b = 6378245.0d;
    static final double c = 0.006693421622965943d;

    static double a(double d, double d2, double d3, double d4) {
        double cos = (double) (((float) (d - d3)) * ((float) Math.cos((double) ((float) (Math.abs(d2) * 0.0174532925d)))));
        double d5 = (double) ((float) (d2 - d4));
        return Math.sqrt((((d5 * 1.0E7d) * (1.0E7d * d5)) + ((cos * 1.0E7d) * (1.0E7d * cos))) * 1.2392029762268066d);
    }

    public static af a(double d, double d2) {
        af afVar = new af();
        double d3 = d(d2 - 105.0d, d - 35.0d);
        double e = e(d2 - 105.0d, d - 35.0d);
        double d4 = (d / 180.0d) * a;
        double sin = Math.sin(d4);
        sin = 1.0d - (sin * (c * sin));
        double sqrt = Math.sqrt(sin);
        d3 = (d3 * 180.0d) / ((6335552.717000426d / (sin * sqrt)) * a);
        e = ((e * 180.0d) / ((Math.cos(d4) * (b / sqrt)) * a)) + d2;
        afVar.a(d3 + d);
        afVar.b(e);
        return afVar;
    }

    public static af a(double d, double d2, double d3) {
        af afVar = new af();
        afVar = new af();
        af afVar2 = new af();
        afVar.a(d2);
        afVar.b(d3);
        af b = b(afVar.a(), afVar.b());
        afVar = a(b.a(), b.b());
        while (true) {
            double b2 = d3 - afVar.b();
            double a = d2 - afVar.a();
            afVar2.b(b2 + b.b());
            afVar2.a(a + b.a());
            b.b(afVar2.b());
            b.a(afVar2.a());
            af a2 = a(b.a(), b.b());
            if (d >= a(d3, d2, a2.b(), a2.a())) {
                return afVar2;
            }
            afVar = a2;
        }
    }

    public static void a(double d, double d2, double[] dArr) {
        if (c(d, d2)) {
            dArr[0] = d;
            dArr[1] = d2;
            return;
        }
        double d3 = d(d2 - 105.0d, d - 35.0d);
        double e = e(d2 - 105.0d, d - 35.0d);
        double d4 = (d / 180.0d) * a;
        double sin = Math.sin(d4);
        sin = 1.0d - (sin * (c * sin));
        double sqrt = Math.sqrt(sin);
        d3 = (d3 * 180.0d) / ((6335552.717000426d / (sin * sqrt)) * a);
        e = (e * 180.0d) / ((Math.cos(d4) * (b / sqrt)) * a);
        dArr[0] = d3 + d;
        dArr[1] = e + d2;
    }

    public static af b(double d, double d2) {
        af afVar = new af();
        double d3 = d(d2 - 105.0d, d - 35.0d);
        double e = e(d2 - 105.0d, d - 35.0d);
        double d4 = (d / 180.0d) * a;
        double sin = Math.sin(d4);
        sin = 1.0d - (sin * (c * sin));
        double sqrt = Math.sqrt(sin);
        d3 = (d3 * 180.0d) / ((6335552.717000426d / (sin * sqrt)) * a);
        e = d2 - ((e * 180.0d) / ((Math.cos(d4) * (b / sqrt)) * a));
        afVar.a(d - d3);
        afVar.b(e);
        return afVar;
    }

    private static boolean c(double d, double d2) {
        return d2 < 72.004d || d2 > 137.8347d || d < 0.8293d || d > 55.8271d;
    }

    private static double d(double d, double d2) {
        return (((((((-100.0d + (2.0d * d)) + (3.0d * d2)) + ((0.2d * d2) * d2)) + ((0.1d * d) * d2)) + (0.2d * Math.sqrt(Math.abs(d)))) + ((((20.0d * Math.sin((6.0d * d) * a)) + (20.0d * Math.sin((2.0d * d) * a))) * 2.0d) / 3.0d)) + ((((20.0d * Math.sin(a * d2)) + (40.0d * Math.sin((d2 / 3.0d) * a))) * 2.0d) / 3.0d)) + ((((160.0d * Math.sin((d2 / 12.0d) * a)) + (320.0d * Math.sin((a * d2) / 30.0d))) * 2.0d) / 3.0d);
    }

    private static double e(double d, double d2) {
        return (((((((300.0d + d) + (2.0d * d2)) + ((0.1d * d) * d)) + ((0.1d * d) * d2)) + (0.1d * Math.sqrt(Math.abs(d)))) + ((((20.0d * Math.sin((6.0d * d) * a)) + (20.0d * Math.sin((2.0d * d) * a))) * 2.0d) / 3.0d)) + ((((20.0d * Math.sin(a * d)) + (40.0d * Math.sin((d / 3.0d) * a))) * 2.0d) / 3.0d)) + ((((150.0d * Math.sin((d / 12.0d) * a)) + (300.0d * Math.sin((d / 30.0d) * a))) * 2.0d) / 3.0d);
    }
}
