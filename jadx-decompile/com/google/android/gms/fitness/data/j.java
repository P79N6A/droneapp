package com.google.android.gms.fitness.data;

import com.google.android.gms.internal.akg;
import com.google.android.gms.internal.aki;
import java.util.concurrent.TimeUnit;

class j implements akg<DataPoint, DataType> {
    public static final j a = new j();

    private j() {
    }

    public /* synthetic */ double a(Object obj, int i) {
        return c((DataPoint) obj, i);
    }

    public long a(DataPoint dataPoint, TimeUnit timeUnit) {
        return dataPoint.c(timeUnit) - dataPoint.b(timeUnit);
    }

    public aki<DataType> a() {
        return k.a;
    }

    public /* synthetic */ Object a(Object obj) {
        return b((DataPoint) obj);
    }

    public String a(DataPoint dataPoint) {
        return dataPoint.b().a();
    }

    public boolean a(DataPoint dataPoint, int i) {
        return dataPoint.a(i).a();
    }

    public int b(DataPoint dataPoint, int i) {
        return dataPoint.a(i).c();
    }

    public /* synthetic */ int b(Object obj, int i) {
        return b((DataPoint) obj, i);
    }

    public DataType b(DataPoint dataPoint) {
        return dataPoint.b();
    }

    public /* synthetic */ String b(Object obj) {
        return a((DataPoint) obj);
    }

    public double c(DataPoint dataPoint, int i) {
        return (double) dataPoint.a(i).d();
    }

    public /* synthetic */ boolean c(Object obj, int i) {
        return a((DataPoint) obj, i);
    }
}
