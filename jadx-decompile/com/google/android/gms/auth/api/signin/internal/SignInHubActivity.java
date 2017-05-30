package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.Loader;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;

@KeepName
public class SignInHubActivity extends FragmentActivity {
    private j a;
    private SignInConfiguration b;
    private boolean c;
    private int d;
    private Intent e;

    private class a implements LoaderCallbacks<Void> {
        final /* synthetic */ SignInHubActivity a;

        private a(SignInHubActivity signInHubActivity) {
            this.a = signInHubActivity;
        }

        public void a(Loader<Void> loader, Void voidR) {
            this.a.setResult(this.a.d, this.a.e);
            this.a.finish();
        }

        public Loader<Void> onCreateLoader(int i, Bundle bundle) {
            return new zzb(this.a, g.a());
        }

        public /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
            a(loader, (Void) obj);
        }

        public void onLoaderReset(Loader<Void> loader) {
        }
    }

    private void a() {
        getSupportLoaderManager().initLoader(0, null, new a());
    }

    private void a(int i) {
        Parcelable status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
    }

    private void a(int i, Intent intent) {
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra(com.google.android.gms.auth.api.signin.a.a);
            if (signInAccount != null && signInAccount.a() != null) {
                GoogleSignInAccount a = signInAccount.a();
                this.a.b(a, this.b.b());
                intent.removeExtra(com.google.android.gms.auth.api.signin.a.a);
                intent.putExtra("googleSignInAccount", a);
                this.c = true;
                this.d = i;
                this.e = intent;
                a();
                return;
            } else if (intent.hasExtra("errorCode")) {
                a(intent.getIntExtra("errorCode", 8));
                return;
            }
        }
        a(8);
    }

    private void a(Intent intent) {
        intent.setPackage("com.google.android.gms");
        intent.putExtra("config", this.b);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException e) {
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            a(8);
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        setResult(0);
        switch (i) {
            case 40962:
                a(i2, intent);
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = j.a((Context) this);
        Intent intent = getIntent();
        if (!"com.google.android.gms.auth.GOOGLE_SIGN_IN".equals(intent.getAction())) {
            String str = "AuthSignInClient";
            String str2 = "Unknown action: ";
            String valueOf = String.valueOf(intent.getAction());
            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            finish();
        }
        this.b = (SignInConfiguration) intent.getParcelableExtra("config");
        if (this.b == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
        } else if (bundle == null) {
            a(new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN"));
        } else {
            this.c = bundle.getBoolean("signingInGoogleApiClients");
            if (this.c) {
                this.d = bundle.getInt("signInResultCode");
                this.e = (Intent) bundle.getParcelable("signInResultData");
                a();
            }
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.c);
        if (this.c) {
            bundle.putInt("signInResultCode", this.d);
            bundle.putParcelable("signInResultData", this.e);
        }
    }
}
