package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.c.f;
import com.google.android.gms.c.g;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.maps.a.e;
import com.google.android.gms.maps.a.k;
import com.google.android.gms.maps.a.v;
import com.google.android.gms.maps.model.j;
import java.util.ArrayList;
import java.util.List;

public class MapView extends FrameLayout {
    private final b a;

    static class a implements k {
        private final ViewGroup a;
        private final e b;
        private View c;

        public a(ViewGroup viewGroup, e eVar) {
            this.b = (e) d.a(eVar);
            this.a = (ViewGroup) d.a(viewGroup);
        }

        public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
        }

        public void a() {
            try {
                this.b.h();
            } catch (RemoteException e) {
                throw new j(e);
            }
        }

        public void a(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
        }

        public void a(Bundle bundle) {
            try {
                this.b.a(bundle);
                this.c = (View) f.a(this.b.f());
                this.a.removeAllViews();
                this.a.addView(this.c);
            } catch (RemoteException e) {
                throw new j(e);
            }
        }

        public void a(final f fVar) {
            try {
                this.b.a(new com.google.android.gms.maps.a.ao.a(this) {
                    final /* synthetic */ a b;

                    public void a(com.google.android.gms.maps.a.b bVar) {
                        fVar.b(new c(bVar));
                    }
                });
            } catch (RemoteException e) {
                throw new j(e);
            }
        }

        public void b() {
            try {
                this.b.b();
            } catch (RemoteException e) {
                throw new j(e);
            }
        }

        public void b(Bundle bundle) {
            try {
                this.b.b(bundle);
            } catch (RemoteException e) {
                throw new j(e);
            }
        }

        public void c() {
            try {
                this.b.c();
            } catch (RemoteException e) {
                throw new j(e);
            }
        }

        public void c(Bundle bundle) {
            try {
                this.b.c(bundle);
            } catch (RemoteException e) {
                throw new j(e);
            }
        }

        public void d() {
            try {
                this.b.i();
            } catch (RemoteException e) {
                throw new j(e);
            }
        }

        public void e() {
            throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
        }

        public void f() {
            try {
                this.b.d();
            } catch (RemoteException e) {
                throw new j(e);
            }
        }

        public void g() {
            try {
                this.b.e();
            } catch (RemoteException e) {
                throw new j(e);
            }
        }

        public void h() {
            try {
                this.b.g();
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
    }

    static class b extends com.google.android.gms.c.b<a> {
        protected g<a> a;
        private final ViewGroup b;
        private final Context c;
        private final GoogleMapOptions d;
        private final List<f> e = new ArrayList();

        b(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
            this.b = viewGroup;
            this.c = context;
            this.d = googleMapOptions;
        }

        protected void a(g<a> gVar) {
            this.a = gVar;
            i();
        }

        public void a(f fVar) {
            if (a() != null) {
                ((a) a()).a(fVar);
            } else {
                this.e.add(fVar);
            }
        }

        public void c(Bundle bundle) {
            if (a() != null) {
                ((a) a()).c(bundle);
            }
        }

        public void i() {
            if (this.a != null && a() == null) {
                try {
                    e.a(this.c);
                    e a = v.a(this.c).a(f.a(this.c), this.d);
                    if (a != null) {
                        this.a.a(new a(this.b, a));
                        for (f a2 : this.e) {
                            ((a) a()).a(a2);
                        }
                        this.e.clear();
                    }
                } catch (RemoteException e) {
                    throw new j(e);
                } catch (c e2) {
                }
            }
        }

        public void j() {
            if (a() != null) {
                ((a) a()).h();
            }
        }
    }

    public MapView(Context context) {
        super(context);
        this.a = new b(this, context, null);
        h();
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new b(this, context, GoogleMapOptions.a(context, attributeSet));
        h();
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new b(this, context, GoogleMapOptions.a(context, attributeSet));
        h();
    }

    public MapView(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.a = new b(this, context, googleMapOptions);
        h();
    }

    private void h() {
        setClickable(true);
    }

    public final void a() {
        this.a.c();
    }

    public final void a(Bundle bundle) {
        this.a.a(bundle);
        if (this.a.a() == null) {
            com.google.android.gms.c.b.b(this);
        }
    }

    public void a(f fVar) {
        d.b("getMapAsync() must be called on the main thread");
        this.a.a(fVar);
    }

    public final void b() {
        this.a.d();
    }

    public final void b(Bundle bundle) {
        this.a.b(bundle);
    }

    public final void c() {
        this.a.b();
    }

    public final void c(Bundle bundle) {
        d.b("onEnterAmbient() must be called on the main thread");
        this.a.c(bundle);
    }

    public final void d() {
        this.a.e();
    }

    public final void e() {
        this.a.g();
    }

    public final void f() {
        this.a.h();
    }

    public final void g() {
        d.b("onExitAmbient() must be called on the main thread");
        this.a.j();
    }
}
