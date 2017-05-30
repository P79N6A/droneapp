package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.maps.a.g;
import com.google.android.gms.maps.a.h;
import com.google.android.gms.maps.model.j;

public class SupportStreetViewPanoramaFragment extends Fragment {
    private final b a = new b(this);
    private i b;

    public static SupportStreetViewPanoramaFragment a() {
        return new SupportStreetViewPanoramaFragment();
    }

    public static SupportStreetViewPanoramaFragment a(StreetViewPanoramaOptions streetViewPanoramaOptions) {
        SupportStreetViewPanoramaFragment supportStreetViewPanoramaFragment = new SupportStreetViewPanoramaFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("StreetViewPanoramaOptions", streetViewPanoramaOptions);
        supportStreetViewPanoramaFragment.setArguments(bundle);
        return supportStreetViewPanoramaFragment;
    }

    public void a(g gVar) {
        d.b("getStreetViewPanoramaAsync() must be called on the main thread");
        this.a.a(gVar);
    }

    protected h b() {
        this.a.i();
        return this.a.a() == null ? null : ((a) this.a.a()).h();
    }

    @Deprecated
    public final i c() {
        h b = b();
        if (b == null) {
            return null;
        }
        try {
            g a = b.a();
            if (a == null) {
                return null;
            }
            if (this.b == null || this.b.a().asBinder() != a.asBinder()) {
                this.b = new i(a);
            }
            return this.b;
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportStreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        b.a(this.a, activity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.a(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.a.a(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        this.a.g();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.a.f();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        b.a(this.a, activity);
        this.a.a(activity, new Bundle(), bundle);
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
            bundle.setClassLoader(SupportStreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.a.b(bundle);
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
