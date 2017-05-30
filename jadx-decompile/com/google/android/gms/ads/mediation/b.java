package com.google.android.gms.ads.mediation;

import android.os.Bundle;

public interface b {

    public static class a {
        private int a;

        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putInt("capabilities", this.a);
            return bundle;
        }

        public a a(int i) {
            this.a = i;
            return this;
        }
    }

    void onDestroy();

    void onPause();

    void onResume();
}
