package com.fimi.soul.module.droneTrack;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.drone.h.ag;
import com.fimi.soul.drone.h.z;
import com.fimi.soul.module.droneFragment.d;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.c.b;
import com.google.android.gms.maps.f;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.g;
import com.google.android.gms.maps.model.i;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class PalyBackMapFragment extends SupportMapFragment implements d, b, f {
    protected c a;
    private SharedPreferences b;
    private d c;
    private g d;
    private g e;
    private i f;
    private boolean g = true;
    private List<com.google.android.gms.maps.model.c> h = new CopyOnWriteArrayList();
    private com.google.android.gms.maps.model.c i;
    private com.google.android.gms.maps.model.c j;

    private g a(LatLng latLng) {
        return this.a == null ? null : this.a.a(new MarkerOptions().a(com.google.android.gms.maps.model.b.a(R.drawable.icon_fly_handpiece_location)).a(latLng));
    }

    private synchronized String a(double d) {
        return String.format("%.8f", new Object[]{Double.valueOf(d)});
    }

    private void a(LatLng latLng, int i, int i2) {
        int i3 = this.b.getInt(com.fimi.soul.drone.g.c.s, 1);
        if (i2 == 3) {
            if (this.j != null) {
                this.j.a(latLng);
                if (((double) i) != this.j.d()) {
                    this.j.a((double) (i + 100));
                }
            } else if (this.a != null) {
                this.j = this.a.a(new CircleOptions().a(latLng).a((double) (i + 100)).a(Color.argb(127, 0, 0, 0)).a(2.0f).b(1 == i3 ? Color.argb(204, 198, 200, 203) : Color.argb(204, 101, 104, 106)));
            }
        } else if (this.j != null) {
            this.j.a();
            this.j = null;
        }
        if (this.i != null && this.h.contains(this.i)) {
            this.i.a(latLng);
            if (((double) i) != this.i.d()) {
                this.i.a((double) i);
            }
        } else if (this.a != null) {
            this.i = this.a.a(new CircleOptions().a(latLng).a((double) i).a(Color.argb(127, 255, 54, 0)).a(2.0f).b(Color.argb(51, 255, 54, 0)).b(100.0f));
        }
        if (!this.h.contains(this.i)) {
            this.h.add(this.i);
        }
    }

    private i b(List<LatLng> list) {
        if (this.a == null) {
            return null;
        }
        return this.a.a(new PolylineOptions().a(list).a(Color.rgb(255, 42, 92)).a(com.fimi.soul.view.photodraweeview.c.a));
    }

    private void f() {
        this.a.a(this.b.getInt(com.fimi.soul.drone.g.c.bK, 1));
        if (this.c != null) {
            this.c.a(this.a.g());
        }
        this.a.a(false);
        this.a.m().a(false);
        this.a.a((b) this);
    }

    private synchronized float g() {
        float f = 0.0f;
        synchronized (this) {
            try {
                if (this.a != null) {
                    CameraPosition a = this.a.a();
                    if (a != null) {
                        f = a.d;
                    }
                }
            } catch (Exception e) {
            }
        }
        return f;
    }

    public int a() {
        int i = 2;
        if (this.b.getInt(com.fimi.soul.drone.g.c.bK, 1) == 1) {
            this.b.edit().putInt(com.fimi.soul.drone.g.c.bK, 2).commit();
        } else {
            this.b.edit().putInt(com.fimi.soul.drone.g.c.bK, 1).commit();
            i = 1;
        }
        if (this.a != null) {
            this.a.a(i);
        }
        return i;
    }

    public View a(g gVar) {
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.play_back_inforwindow, null);
        ((TextView) inflate.findViewById(R.id.drone_location)).setText(gVar.e());
        return inflate;
    }

    public void a(float f) {
        if (this.e != null) {
            float g = g();
            if (f < 0.0f) {
                f += 360.0f;
            }
            this.e.b(g + f);
        }
    }

    public void a(com.fimi.soul.drone.h.a.b bVar) {
        a(new LatLng((double) bVar.j(), (double) bVar.k()), bVar.g() * 10, bVar.i());
    }

    public void a(ag agVar) {
        LatLng latLng = new LatLng(agVar.e(), agVar.d());
        List c = com.fimi.soul.module.droneTrack.a.b.a().c();
        if (!c.contains(latLng)) {
            c.add(latLng);
        }
        if (this.e == null) {
            this.e = a(latLng);
            if (this.e != null) {
                this.e.a(0.5f, 0.5f);
            }
        } else {
            this.e.a(latLng);
        }
        if (this.e != null) {
            String a = a(latLng.a);
            this.e.a(a + "，" + a(latLng.b));
            this.e.h();
        }
        a(c);
    }

    public void a(z zVar) {
        LatLng latLng = new LatLng(zVar.b(), zVar.c());
        if (this.d != null) {
            this.d.a(latLng);
        } else if (this.a != null) {
            this.d = this.a.a(new MarkerOptions().a(com.google.android.gms.maps.model.b.a(R.drawable.home_point)).a(latLng));
        }
    }

    public void a(c cVar) {
    }

    public void a(LatLng latLng, List<LatLng> list) {
        if (latLng != null && list != null) {
            if (this.e != null) {
                this.e.a(latLng);
            } else {
                this.e = a(latLng);
                this.e.a(0.5f, 0.5f);
            }
            if (this.e != null) {
                String a = a(latLng.a);
                this.e.a(a + "，" + a(latLng.b));
                this.e.h();
            }
            a((List) list);
        }
    }

    public void a(List<LatLng> list) {
        if (list != null) {
            if (this.f == null) {
                this.f = b((List) list);
            } else {
                this.f.a(list);
            }
            if (this.g && this.a != null) {
                a(false);
                this.a.a(com.google.android.gms.maps.b.a((LatLng) list.get(0), 18.0f));
            }
        }
    }

    public void a(boolean z) {
        this.g = z;
    }

    public View b(g gVar) {
        return null;
    }

    public void b() {
        if (this.d != null) {
            this.d.a();
            this.d = null;
        }
        if (this.e != null) {
            this.e.a();
            this.e = null;
        }
        if (this.f != null) {
            this.f.a();
            this.f = null;
        }
    }

    public void b(c cVar) {
        if (cVar != null) {
            this.a = cVar;
            f();
        }
    }

    public boolean c() {
        return this.g;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.c = (d) activity;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b = PreferenceManager.getDefaultSharedPreferences(getActivity());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        a((f) this);
        return onCreateView;
    }

    public void onDestroy() {
        if (this.c != null) {
            this.c = null;
        }
        if (this.d != null) {
            this.d.a();
            this.d = null;
        }
        if (this.e != null) {
            this.e.a();
            this.e = null;
        }
        if (this.f != null) {
            this.f.a();
            this.f = null;
        }
        if (this.i != null) {
            this.i.a();
            this.i = null;
        }
        if (this.j != null) {
            this.j.a();
            this.j = null;
        }
        this.h.clear();
        super.onDestroy();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }
}
