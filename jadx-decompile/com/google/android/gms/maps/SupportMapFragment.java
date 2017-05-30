package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.d;

public class SupportMapFragment extends Fragment {
    private final b a = new b(this);

    public static SupportMapFragment a(GoogleMapOptions googleMapOptions) {
        SupportMapFragment supportMapFragment = new SupportMapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        supportMapFragment.setArguments(bundle);
        return supportMapFragment;
    }

    public static SupportMapFragment d() {
        return new SupportMapFragment();
    }

    public final void a(Bundle bundle) {
        d.b("onEnterAmbient must be called on the main thread.");
        this.a.c(bundle);
    }

    public void a(f fVar) {
        d.b("getMapAsync must be called on the main thread.");
        this.a.a(fVar);
    }

    public final void e() {
        d.b("onExitAmbient must be called on the main thread.");
        this.a.j();
    }

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
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

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        b.a(this.a, activity);
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
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
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
