package com.google.android.gms.awareness.snapshot.internal;

import android.location.Location;
import com.google.android.gms.awareness.e;
import com.google.android.gms.awareness.snapshot.a;
import com.google.android.gms.awareness.snapshot.c;
import com.google.android.gms.awareness.snapshot.f;
import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl.TypeFilterImpl;
import com.google.android.gms.awareness.state.BeaconState;
import com.google.android.gms.awareness.state.BeaconState.TypeFilter;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.k;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.contextmanager.internal.c.b;
import com.google.android.gms.contextmanager.internal.d;
import com.google.android.gms.internal.su;
import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class j implements e {

    class AnonymousClass7 extends b {
        final /* synthetic */ int a;

        AnonymousClass7(g gVar, int i) {
            this.a = i;
            super(gVar);
        }

        protected void a(d dVar) {
            dVar.a(this, new SnapshotRequest(this.a, null));
        }
    }

    class AnonymousClass8 extends b {
        final /* synthetic */ int a;
        final /* synthetic */ ArrayList b;

        AnonymousClass8(g gVar, int i, ArrayList arrayList) {
            this.a = i;
            this.b = arrayList;
            super(gVar);
        }

        protected void a(d dVar) {
            dVar.a(this, new SnapshotRequest(this.a, this.b));
        }
    }

    private i<a> a(g gVar, ArrayList<TypeFilterImpl> arrayList) {
        return new su<a, m>(this, gVar.a(a(gVar, com.google.android.gms.games.d.c, arrayList))) {
            final /* synthetic */ j a;

            protected a a(final m mVar) {
                return new a(this) {
                    final /* synthetic */ AnonymousClass6 b;

                    public Status a() {
                        return mVar.a();
                    }

                    public BeaconState b() {
                        return mVar.b() == null ? null : mVar.b().b();
                    }
                };
            }

            protected /* synthetic */ m a(m mVar) {
                return a((m) mVar);
            }
        };
    }

    private static b a(g gVar, int i) {
        return new AnonymousClass7(gVar, i);
    }

    private static b a(g gVar, int i, ArrayList<TypeFilterImpl> arrayList) {
        return new AnonymousClass8(gVar, i, arrayList);
    }

    private static ArrayList<TypeFilterImpl> a(Collection<TypeFilter> collection) {
        com.google.android.gms.common.internal.d.a((Object) collection, (Object) "beaconTypes cannot be null");
        com.google.android.gms.common.internal.d.b(collection.size() > 0, "beaconTypes must not be empty");
        ArrayList<TypeFilterImpl> arrayList = new ArrayList();
        for (TypeFilter typeFilter : collection) {
            arrayList.add((TypeFilterImpl) typeFilter);
        }
        return arrayList;
    }

    private static ArrayList<TypeFilterImpl> a(TypeFilter... typeFilterArr) {
        int i = 0;
        com.google.android.gms.common.internal.d.a((Object) typeFilterArr, (Object) "beaconTypes cannot be null");
        com.google.android.gms.common.internal.d.b(typeFilterArr.length > 0, "beaconTypes must not be empty");
        ArrayList<TypeFilterImpl> arrayList = new ArrayList();
        int length = typeFilterArr.length;
        while (i < length) {
            arrayList.add((TypeFilterImpl) typeFilterArr[i]);
            i++;
        }
        return arrayList;
    }

    public i<com.google.android.gms.awareness.snapshot.b> a(g gVar) {
        return new su<com.google.android.gms.awareness.snapshot.b, m>(this, gVar.a(a(gVar, (int) com.google.android.gms.games.d.b))) {
            final /* synthetic */ j a;

            protected com.google.android.gms.awareness.snapshot.b a(final m mVar) {
                return new com.google.android.gms.awareness.snapshot.b(this) {
                    final /* synthetic */ AnonymousClass1 b;

                    public Status a() {
                        return mVar.a();
                    }

                    public ActivityRecognitionResult b() {
                        return mVar.b() == null ? null : mVar.b().a();
                    }
                };
            }
        };
    }

    public i<a> a(g gVar, Collection<TypeFilter> collection) {
        return a(gVar, a((Collection) collection));
    }

    public i<a> a(g gVar, TypeFilter... typeFilterArr) {
        return a(gVar, a(typeFilterArr));
    }

    public i<c> b(g gVar) {
        return new su<c, m>(this, gVar.a(a(gVar, (int) com.google.android.gms.games.d.d))) {
            final /* synthetic */ j a;

            protected c a(final m mVar) {
                return new c(this) {
                    final /* synthetic */ AnonymousClass2 b;

                    public Status a() {
                        return mVar.a();
                    }

                    public com.google.android.gms.awareness.state.a b() {
                        return mVar.b() == null ? null : mVar.b().c();
                    }
                };
            }

            protected /* synthetic */ m a(m mVar) {
                return a((m) mVar);
            }
        };
    }

    public i<com.google.android.gms.awareness.snapshot.d> c(g gVar) {
        return new su<com.google.android.gms.awareness.snapshot.d, m>(this, gVar.a(a(gVar, (int) com.google.android.gms.games.d.e))) {
            final /* synthetic */ j a;

            protected com.google.android.gms.awareness.snapshot.d a(final m mVar) {
                return new com.google.android.gms.awareness.snapshot.d(this) {
                    final /* synthetic */ AnonymousClass3 b;

                    public Status a() {
                        return mVar.a();
                    }

                    public Location b() {
                        return mVar.b() == null ? null : mVar.b().d();
                    }
                };
            }

            protected /* synthetic */ m a(m mVar) {
                return a((m) mVar);
            }
        };
    }

    public i<com.google.android.gms.awareness.snapshot.e> d(g gVar) {
        return new su<com.google.android.gms.awareness.snapshot.e, m>(this, gVar.a(a(gVar, (int) com.google.android.gms.games.d.f))) {
            final /* synthetic */ j a;

            protected com.google.android.gms.awareness.snapshot.e a(final m mVar) {
                return new com.google.android.gms.awareness.snapshot.e(this) {
                    final /* synthetic */ AnonymousClass4 b;
                    private boolean c = false;
                    private List<com.google.android.gms.location.places.g> d = null;

                    public Status a() {
                        return mVar.a();
                    }

                    public List<com.google.android.gms.location.places.g> b() {
                        if (this.c) {
                            return this.d;
                        }
                        this.c = true;
                        if (mVar.b() == null) {
                            return null;
                        }
                        DataHolder f = mVar.b().f();
                        if (f == null) {
                            return null;
                        }
                        k fVar = new f(f);
                        try {
                            if (fVar.c() <= 0) {
                                return null;
                            }
                            this.d = ((PlacesData) ((SafeParcelable) fVar.a(0))).a();
                            List<com.google.android.gms.location.places.g> list = this.d;
                            fVar.b();
                            return list;
                        } finally {
                            fVar.b();
                        }
                    }
                };
            }

            protected /* synthetic */ m a(m mVar) {
                return a((m) mVar);
            }
        };
    }

    public i<f> e(g gVar) {
        return new su<f, m>(this, gVar.a(a(gVar, (int) com.google.android.gms.games.d.g))) {
            final /* synthetic */ j a;

            protected f a(final m mVar) {
                return new f(this) {
                    final /* synthetic */ AnonymousClass5 b;

                    public Status a() {
                        return mVar.a();
                    }

                    public com.google.android.gms.awareness.state.b b() {
                        return mVar.b() == null ? null : mVar.b().i();
                    }
                };
            }

            protected /* synthetic */ m a(m mVar) {
                return a((m) mVar);
            }
        };
    }
}
