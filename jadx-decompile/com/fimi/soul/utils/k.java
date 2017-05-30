package com.fimi.soul.utils;

public class k {
    private static double a(double d) {
        return (3.141592653589793d * d) / 180.0d;
    }

    public static double a(double d, double d2, double d3, double d4) {
        return (d == d3 && d2 == d4) ? 0.0d : a(d, d2, d3, d4, 'K');
    }

    public static double a(double d, double d2, double d3, double d4, char c) {
        double b = (b(Math.acos((Math.cos(a(d2 - d4)) * (Math.cos(a(d)) * Math.cos(a(d3)))) + (Math.sin(a(d)) * Math.sin(a(d3))))) * 60.0d) * 1.1515d;
        return c == 'K' ? b * 1.609344d : c == 'N' ? b * 0.8684d : b;
    }

    private static double b(double d) {
        return (180.0d * d) / 3.141592653589793d;
    }
}
