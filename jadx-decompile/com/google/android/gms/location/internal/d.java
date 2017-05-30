package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.e;
import com.google.android.gms.location.k;
import com.google.android.gms.location.l;
import com.google.android.gms.location.n;

public class d implements e {

    private static abstract class a extends com.google.android.gms.location.n.a<Status> {
        public a(g gVar) {
            super(gVar);
        }

        public Status a(Status status) {
            return status;
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    private static class b extends com.google.android.gms.location.internal.g.a {
        private final com.google.android.gms.internal.ahl.b<Status> a;

        public b(com.google.android.gms.internal.ahl.b<Status> bVar) {
            this.a = bVar;
        }

        public void a(FusedLocationProviderResult fusedLocationProviderResult) {
            this.a.a(fusedLocationProviderResult.a());
        }
    }

    public Location a(g gVar) {
        try {
            return n.a(gVar).h();
        } catch (Exception e) {
            return null;
        }
    }

    public i<Status> a(g gVar, final PendingIntent pendingIntent) {
        return gVar.b(new a(this, gVar) {
            final /* synthetic */ d b;

            protected void a(l lVar) {
                lVar.a(pendingIntent, new b(this));
            }
        });
    }

    public i<Status> a(g gVar, final Location location) {
        return gVar.b(new a(this, gVar) {
            final /* synthetic */ d b;

            protected void a(l lVar) {
                lVar.a(location);
                b(Status.a);
            }
        });
    }

    public i<Status> a(g gVar, final LocationRequest locationRequest, final PendingIntent pendingIntent) {
        return gVar.b(new a(this, gVar) {
            final /* synthetic */ d c;

            protected void a(l lVar) {
                lVar.a(locationRequest, pendingIntent, new b(this));
            }
        });
    }

    public i<Status> a(g gVar, LocationRequest locationRequest, k kVar, Looper looper) {
        final LocationRequest locationRequest2 = locationRequest;
        final k kVar2 = kVar;
        final Looper looper2 = looper;
        return gVar.b(new a(this, gVar) {
            final /* synthetic */ d d;

            protected void a(l lVar) {
                lVar.a(LocationRequestInternal.a(locationRequest2), kVar2, looper2, new b(this));
            }
        });
    }

    public i<Status> a(g gVar, final LocationRequest locationRequest, final l lVar) {
        return gVar.b(new a(this, gVar) {
            final /* synthetic */ d c;

            protected void a(l lVar) {
                lVar.a(locationRequest, lVar, null, new b(this));
            }
        });
    }

    public i<Status> a(g gVar, LocationRequest locationRequest, l lVar, Looper looper) {
        final LocationRequest locationRequest2 = locationRequest;
        final l lVar2 = lVar;
        final Looper looper2 = looper;
        return gVar.b(new a(this, gVar) {
            final /* synthetic */ d d;

            protected void a(l lVar) {
                lVar.a(locationRequest2, lVar2, looper2, new b(this));
            }
        });
    }

    public i<Status> a(g gVar, final k kVar) {
        return gVar.b(new a(this, gVar) {
            final /* synthetic */ d b;

            protected void a(l lVar) {
                lVar.a(kVar, new b(this));
            }
        });
    }

    public i<Status> a(g gVar, final l lVar) {
        return gVar.b(new a(this, gVar) {
            final /* synthetic */ d b;

            protected void a(l lVar) {
                lVar.a(lVar, new b(this));
            }
        });
    }

    public i<Status> a(g gVar, final boolean z) {
        return gVar.b(new a(this, gVar) {
            final /* synthetic */ d b;

            protected void a(l lVar) {
                lVar.a(z);
                b(Status.a);
            }
        });
    }

    public LocationAvailability b(g gVar) {
        try {
            return n.a(gVar).i();
        } catch (Exception e) {
            return null;
        }
    }

    public i<Status> c(g gVar) {
        return gVar.b(new a(this, gVar) {
            final /* synthetic */ d a;

            protected void a(l lVar) {
                lVar.a(new b(this));
            }
        });
    }
}
