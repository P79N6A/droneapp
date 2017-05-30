package com.google.android.gms.c;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.gms.c.d.a;

public final class i extends a {
    private Fragment a;

    private i(Fragment fragment) {
        this.a = fragment;
    }

    public static i a(Fragment fragment) {
        return fragment != null ? new i(fragment) : null;
    }

    public e a() {
        return f.a(this.a.getActivity());
    }

    public void a(Intent intent) {
        this.a.startActivity(intent);
    }

    public void a(Intent intent, int i) {
        this.a.startActivityForResult(intent, i);
    }

    public void a(e eVar) {
        this.a.registerForContextMenu((View) f.a(eVar));
    }

    public void a(boolean z) {
        this.a.setHasOptionsMenu(z);
    }

    public Bundle b() {
        return this.a.getArguments();
    }

    public void b(e eVar) {
        this.a.unregisterForContextMenu((View) f.a(eVar));
    }

    public void b(boolean z) {
        this.a.setMenuVisibility(z);
    }

    public int c() {
        return this.a.getId();
    }

    public void c(boolean z) {
        this.a.setRetainInstance(z);
    }

    public d d() {
        return a(this.a.getParentFragment());
    }

    public void d(boolean z) {
        this.a.setUserVisibleHint(z);
    }

    public e e() {
        return f.a(this.a.getResources());
    }

    public boolean f() {
        return this.a.getRetainInstance();
    }

    public String g() {
        return this.a.getTag();
    }

    public d h() {
        return a(this.a.getTargetFragment());
    }

    public int i() {
        return this.a.getTargetRequestCode();
    }

    public boolean j() {
        return this.a.getUserVisibleHint();
    }

    public e k() {
        return f.a(this.a.getView());
    }

    public boolean l() {
        return this.a.isAdded();
    }

    public boolean m() {
        return this.a.isDetached();
    }

    public boolean n() {
        return this.a.isHidden();
    }

    public boolean o() {
        return this.a.isInLayout();
    }

    public boolean p() {
        return this.a.isRemoving();
    }

    public boolean q() {
        return this.a.isResumed();
    }

    public boolean r() {
        return this.a.isVisible();
    }
}
