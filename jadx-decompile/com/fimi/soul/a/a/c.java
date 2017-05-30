package com.fimi.soul.a.a;

import android.app.Activity;
import android.preference.PreferenceManager;
import android.view.WindowManager;

public class c {
    public int a;
    private Activity b;

    public c(Activity activity) {
        this.b = activity;
    }

    private void c() {
        this.b.setRequestedOrientation(this.a);
    }

    private void d() {
        int rotation = ((WindowManager) this.b.getSystemService("window")).getDefaultDisplay().getRotation();
        int i = this.b.getResources().getConfiguration().orientation;
        i = (((rotation == 0 || rotation == 2) && i == 2) || ((rotation == 1 || rotation == 3) && i == 1)) ? 1 : 0;
        if (i == 0) {
            switch (rotation) {
                case 0:
                    this.a = 1;
                    break;
                case 1:
                    this.a = 0;
                    break;
                case 2:
                    this.a = 9;
                    break;
                case 3:
                    this.a = 8;
                    break;
                default:
                    break;
            }
        }
        switch (rotation) {
            case 0:
                this.a = 0;
                break;
            case 1:
                this.a = 9;
                break;
            case 2:
                this.a = 8;
                break;
            case 3:
                this.a = 1;
                break;
        }
        c();
    }

    private boolean e() {
        return PreferenceManager.getDefaultSharedPreferences(this.b.getApplicationContext()).getBoolean("pref_lock_screen_orientation", false);
    }

    public void a() {
        if (e()) {
            d();
        }
    }

    public void b() {
        if (this.a != -1) {
            this.a = -1;
            c();
        }
    }
}
