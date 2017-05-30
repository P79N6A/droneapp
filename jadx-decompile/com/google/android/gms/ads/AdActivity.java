package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.yq;

public class AdActivity extends Activity {
    public static final String a = "com.google.android.gms.ads.AdActivity";
    public static final String b = "AdActivity";
    private yq c;

    private void a() {
        if (this.c != null) {
            try {
                this.c.l();
            } catch (Throwable e) {
                b.d("Could not forward setContentViewSet to ad overlay:", e);
            }
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        try {
            this.c.a(i, i2, intent);
        } catch (Throwable e) {
            b.d("Could not forward onActivityResult to ad overlay:", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        boolean z = true;
        try {
            if (this.c != null) {
                z = this.c.e();
            }
        } catch (Throwable e) {
            b.d("Could not forward onBackPressed to ad overlay:", e);
        }
        if (z) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.c.a(f.a((Object) configuration));
        } catch (Throwable e) {
            b.d("Failed to wrap configuration.", e);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = ac.b().b((Activity) this);
        if (this.c == null) {
            b.d("Could not create ad overlay.");
            finish();
            return;
        }
        try {
            this.c.a(bundle);
        } catch (Throwable e) {
            b.d("Could not forward onCreate to ad overlay:", e);
            finish();
        }
    }

    protected void onDestroy() {
        try {
            if (this.c != null) {
                this.c.k();
            }
        } catch (Throwable e) {
            b.d("Could not forward onDestroy to ad overlay:", e);
        }
        super.onDestroy();
    }

    protected void onPause() {
        try {
            if (this.c != null) {
                this.c.i();
            }
        } catch (Throwable e) {
            b.d("Could not forward onPause to ad overlay:", e);
            finish();
        }
        super.onPause();
    }

    protected void onRestart() {
        super.onRestart();
        try {
            if (this.c != null) {
                this.c.f();
            }
        } catch (Throwable e) {
            b.d("Could not forward onRestart to ad overlay:", e);
            finish();
        }
    }

    protected void onResume() {
        super.onResume();
        try {
            if (this.c != null) {
                this.c.h();
            }
        } catch (Throwable e) {
            b.d("Could not forward onResume to ad overlay:", e);
            finish();
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.c != null) {
                this.c.b(bundle);
            }
        } catch (Throwable e) {
            b.d("Could not forward onSaveInstanceState to ad overlay:", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    protected void onStart() {
        super.onStart();
        try {
            if (this.c != null) {
                this.c.g();
            }
        } catch (Throwable e) {
            b.d("Could not forward onStart to ad overlay:", e);
            finish();
        }
    }

    protected void onStop() {
        try {
            if (this.c != null) {
                this.c.j();
            }
        } catch (Throwable e) {
            b.d("Could not forward onStop to ad overlay:", e);
            finish();
        }
        super.onStop();
    }

    public void setContentView(int i) {
        super.setContentView(i);
        a();
    }

    public void setContentView(View view) {
        super.setContentView(view);
        a();
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }
}
