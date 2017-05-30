package com.google.android.gms.maps;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.c.f;
import com.google.android.gms.c.g;
import com.google.android.gms.common.c;
import com.google.android.gms.maps.a.d;
import com.google.android.gms.maps.a.k;
import com.google.android.gms.maps.a.u;
import com.google.android.gms.maps.a.v;
import com.google.android.gms.maps.model.j;
import java.util.ArrayList;
import java.util.List;

@TargetApi(11)
public class MapFragment extends Fragment {
    private final b a = new b(this);

    static class a implements k {
        private final Fragment a;
        private final d b;

        public a(Fragment fragment, d dVar) {
            this.b = (d) com.google.android.gms.common.internal.d.a(dVar);
            this.a = (Fragment) com.google.android.gms.common.internal.d.a(fragment);
        }

        public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                return (View) f.a(this.b.a(f.a(layoutInflater), f.a(viewGroup), bundle));
            } catch (RemoteException e) {
                throw new j(e);
            }
        }

        public void a() {
            try {
                this.b.i();
            } catch (RemoteException e) {
                throw new j(e);
            }
        }

        public void a(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                this.b.a(f.a(activity), (GoogleMapOptions) bundle.getParcelable("MapOptions"), bundle2);
            } catch (RemoteException e) {
                throw new j(e);
            }
        }

        public void a(Bundle bundle) {
            if (bundle == null) {
                try {
                    bundle = new Bundle();
                } catch (RemoteException e) {
                    throw new j(e);
                }
            }
            Bundle arguments = this.a.getArguments();
            if (arguments != null && arguments.containsKey("MapOptions")) {
                u.a(bundle, "MapOptions", arguments.getParcelable("MapOptions"));
            }
            this.b.a(bundle);
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
                this.b.j();
            } catch (RemoteException e) {
                throw new j(e);
            }
        }

        public void e() {
            try {
                this.b.d();
            } catch (RemoteException e) {
                throw new j(e);
            }
        }

        public void f() {
            try {
                this.b.e();
            } catch (RemoteException e) {
                throw new j(e);
            }
        }

        public void g() {
            try {
                this.b.f();
            } catch (RemoteException e) {
                throw new j(e);
            }
        }

        public void h() {
            try {
                this.b.h();
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
    }

    static class b extends com.google.android.gms.c.b<a> {
        protected g<a> a;
        private final Fragment b;
        private Activity c;
        private final List<f> d = new ArrayList();

        b(Fragment fragment) {
            this.b = fragment;
        }

        private void a(Activity activity) {
            this.c = activity;
            i();
        }

        protected void a(g<a> gVar) {
            this.a = gVar;
            i();
        }

        public void a(f fVar) {
            if (a() != null) {
                ((a) a()).a(fVar);
            } else {
                this.d.add(fVar);
            }
        }

        public void c(Bundle bundle) {
            if (a() != null) {
                ((a) a()).c(bundle);
            }
        }

        public void i() {
            if (this.c != null && this.a != null && a() == null) {
                try {
                    e.a(this.c);
                    d b = v.a(this.c).b(f.a(this.c));
                    if (b != null) {
                        this.a.a(new a(this.b, b));
                        for (f a : this.d) {
                            ((a) a()).a(a);
                        }
                        this.d.clear();
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

    public static MapFragment a() {
        return new MapFragment();
    }

    public static MapFragment a(GoogleMapOptions googleMapOptions) {
        MapFragment mapFragment = new MapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        mapFragment.setArguments(bundle);
        return mapFragment;
    }

    public final void a(Bundle bundle) {
        com.google.android.gms.common.internal.d.b("onEnterAmbient must be called on the main thread.");
        this.a.c(bundle);
    }

    public void a(f fVar) {
        com.google.android.gms.common.internal.d.b("getMapAsync must be called on the main thread.");
        this.a.a(fVar);
    }

    public final void b() {
        com.google.android.gms.common.internal.d.b("onExitAmbient must be called on the main thread.");
        this.a.j();
    }

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.a.a(activity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.a(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = this.a.a(layoutInflater, viewGroup, bundle);
        a.setClickable(true);
        return a;
    }

    public void onDestroy() {
        this.a.g();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.a.f();
        super.onDestroyView();
    }

    @SuppressLint({"NewApi"})
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        this.a.a(activity);
        Parcelable a = GoogleMapOptions.a(activity, attributeSet);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("MapOptions", a);
        this.a.a(activity, bundle2, bundle);
    }

    public void onLowMemory() {
        this.a.h();
        super.onLowMemory();
    }

    public void onPause() {
        this.a.d();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.a.c();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.a.b(bundle);
    }

    public void onStart() {
        super.onStart();
        this.a.b();
    }

    public void onStop() {
        this.a.e();
        super.onStop();
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
