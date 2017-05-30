package com.google.android.gms.internal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import com.google.android.gms.cast.framework.c;

public class zznv extends Fragment {
    public static void a(@NonNull FragmentActivity fragmentActivity, Bundle bundle) {
        if (bundle == null) {
            Fragment com_google_android_gms_internal_zznv = new zznv();
            FragmentTransaction beginTransaction = fragmentActivity.getSupportFragmentManager().beginTransaction();
            beginTransaction.add(com_google_android_gms_internal_zznv, fragmentActivity.toString());
            beginTransaction.commit();
        }
    }

    public void onPause() {
        super.onPause();
        c.a(getContext()).b(getActivity());
    }

    public void onResume() {
        super.onResume();
        c.a(getContext()).a(getActivity());
    }
}
