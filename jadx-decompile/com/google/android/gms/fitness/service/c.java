package com.google.android.gms.fitness.service;

import com.google.android.gms.common.internal.d;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.y;
import java.util.List;

class c implements a {
    private final y a;

    c(y yVar) {
        this.a = (y) d.a(yVar);
    }

    public void a(DataPoint dataPoint) {
        dataPoint.h();
        this.a.a(dataPoint);
    }

    public void a(List<DataPoint> list) {
        for (DataPoint a : list) {
            a(a);
        }
    }
}
