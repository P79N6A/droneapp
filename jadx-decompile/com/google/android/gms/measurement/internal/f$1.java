package com.google.android.gms.measurement.internal;

class f$1 implements Runnable {
    final /* synthetic */ aj a;
    final /* synthetic */ int b;
    final /* synthetic */ ab c;
    final /* synthetic */ f d;

    f$1(f fVar, aj ajVar, int i, ab abVar) {
        this.d = fVar;
        this.a = ajVar;
        this.b = i;
        this.c = abVar;
    }

    public void run() {
        this.a.K();
        this.a.I();
        f.b(this.d).post(new Runnable(this) {
            final /* synthetic */ f$1 a;

            {
                this.a = r1;
            }

            public void run() {
                if (!f.a(this.a.d).a(this.a.b)) {
                    return;
                }
                if (this.a.a.d().N()) {
                    this.a.c.E().a("Device PackageMeasurementService processed last upload request");
                } else {
                    this.a.c.E().a("Local AppMeasurementService processed last upload request");
                }
            }
        });
    }
}
