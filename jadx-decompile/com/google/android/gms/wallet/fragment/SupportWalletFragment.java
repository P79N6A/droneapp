package com.google.android.gms.wallet.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.R;
import com.google.android.gms.c.f;
import com.google.android.gms.c.g;
import com.google.android.gms.c.i;
import com.google.android.gms.common.e;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.fb;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

public final class SupportWalletFragment extends Fragment {
    private c a;
    private boolean b = false;
    private final i c = i.a(this);
    private final d d = new d();
    private b e = new b(this);
    private final Fragment f = this;
    private WalletFragmentOptions g;
    private WalletFragmentInitParams h;
    private MaskedWalletRequest i;
    private MaskedWallet j;
    private Boolean k;

    public interface a {
        void a(SupportWalletFragment supportWalletFragment, int i, int i2, Bundle bundle);
    }

    static class b extends com.google.android.gms.internal.eu.a {
        private a a;
        private final SupportWalletFragment b;

        b(SupportWalletFragment supportWalletFragment) {
            this.b = supportWalletFragment;
        }

        public void a(int i, int i2, Bundle bundle) {
            if (this.a != null) {
                this.a.a(this.b, i, i2, bundle);
            }
        }

        public void a(a aVar) {
            this.a = aVar;
        }
    }

    private static class c implements com.google.android.gms.c.a {
        private final et a;

        private c(et etVar) {
            this.a = etVar;
        }

        private void a(int i, int i2, Intent intent) {
            try {
                this.a.a(i, i2, intent);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        private void a(MaskedWallet maskedWallet) {
            try {
                this.a.a(maskedWallet);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        private void a(MaskedWalletRequest maskedWalletRequest) {
            try {
                this.a.a(maskedWalletRequest);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        private void a(WalletFragmentInitParams walletFragmentInitParams) {
            try {
                this.a.a(walletFragmentInitParams);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        private void a(boolean z) {
            try {
                this.a.a(z);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        private int h() {
            try {
                return this.a.e();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                return (View) f.a(this.a.a(f.a(layoutInflater), f.a(viewGroup), bundle));
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void a() {
            try {
                this.a.a();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void a(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                this.a.a(f.a(activity), (WalletFragmentOptions) bundle.getParcelable("extraWalletFragmentOptions"), bundle2);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void a(Bundle bundle) {
            try {
                this.a.a(bundle);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void b() {
            try {
                this.a.b();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void b(Bundle bundle) {
            try {
                this.a.b(bundle);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void c() {
            try {
                this.a.c();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void d() {
            try {
                this.a.d();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void e() {
        }

        public void f() {
        }

        public void g() {
        }
    }

    private class d extends com.google.android.gms.c.b<c> implements OnClickListener {
        final /* synthetic */ SupportWalletFragment a;

        private d(SupportWalletFragment supportWalletFragment) {
            this.a = supportWalletFragment;
        }

        protected void a(FrameLayout frameLayout) {
            int i = -1;
            int i2 = -2;
            View button = new Button(this.a.f.getActivity());
            button.setText(R.string.wallet_buy_button_place_holder);
            if (this.a.g != null) {
                WalletFragmentStyle d = this.a.g.d();
                if (d != null) {
                    DisplayMetrics displayMetrics = this.a.f.getResources().getDisplayMetrics();
                    i = d.a("buyButtonWidth", displayMetrics, -1);
                    i2 = d.a("buyButtonHeight", displayMetrics, -2);
                }
            }
            button.setLayoutParams(new LayoutParams(i, i2));
            button.setOnClickListener(this);
            frameLayout.addView(button);
        }

        protected void a(g<c> gVar) {
            Activity activity = this.a.f.getActivity();
            if (this.a.a == null && this.a.b && activity != null) {
                try {
                    this.a.a = new c(fb.a(activity, this.a.c, this.a.g, this.a.e));
                    this.a.g = null;
                    gVar.a(this.a.a);
                    if (this.a.h != null) {
                        this.a.a.a(this.a.h);
                        this.a.h = null;
                    }
                    if (this.a.i != null) {
                        this.a.a.a(this.a.i);
                        this.a.i = null;
                    }
                    if (this.a.j != null) {
                        this.a.a.a(this.a.j);
                        this.a.j = null;
                    }
                    if (this.a.k != null) {
                        this.a.a.a(this.a.k.booleanValue());
                        this.a.k = null;
                    }
                } catch (com.google.android.gms.common.c e) {
                }
            }
        }

        public void onClick(View view) {
            Context activity = this.a.f.getActivity();
            e.b(e.a(activity), activity, -1);
        }
    }

    public static SupportWalletFragment a(WalletFragmentOptions walletFragmentOptions) {
        SupportWalletFragment supportWalletFragment = new SupportWalletFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extraWalletFragmentOptions", walletFragmentOptions);
        supportWalletFragment.f.setArguments(bundle);
        return supportWalletFragment;
    }

    public int a() {
        return this.a != null ? this.a.h() : 0;
    }

    public void a(MaskedWallet maskedWallet) {
        if (this.a != null) {
            this.a.a(maskedWallet);
            this.j = null;
            return;
        }
        this.j = maskedWallet;
    }

    public void a(MaskedWalletRequest maskedWalletRequest) {
        if (this.a != null) {
            this.a.a(maskedWalletRequest);
            this.i = null;
            return;
        }
        this.i = maskedWalletRequest;
    }

    public void a(a aVar) {
        this.e.a(aVar);
    }

    public void a(WalletFragmentInitParams walletFragmentInitParams) {
        if (this.a != null) {
            this.a.a(walletFragmentInitParams);
            this.h = null;
        } else if (this.h == null) {
            this.h = walletFragmentInitParams;
            if (this.i != null) {
                Log.w("SupportWalletFragment", "updateMaskedWalletRequest() was called before initialize()");
            }
            if (this.j != null) {
                Log.w("SupportWalletFragment", "updateMaskedWallet() was called before initialize()");
            }
        } else {
            Log.w("SupportWalletFragment", "initialize(WalletFragmentInitParams) was called more than once. Ignoring.");
        }
    }

    public void a(boolean z) {
        if (this.a != null) {
            this.a.a(z);
            this.k = null;
            return;
        }
        this.k = Boolean.valueOf(z);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.a != null) {
            this.a.a(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            bundle.setClassLoader(WalletFragmentOptions.class.getClassLoader());
            WalletFragmentInitParams walletFragmentInitParams = (WalletFragmentInitParams) bundle.getParcelable("walletFragmentInitParams");
            if (walletFragmentInitParams != null) {
                if (this.h != null) {
                    Log.w("SupportWalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
                }
                this.h = walletFragmentInitParams;
            }
            if (this.i == null) {
                this.i = (MaskedWalletRequest) bundle.getParcelable("maskedWalletRequest");
            }
            if (this.j == null) {
                this.j = (MaskedWallet) bundle.getParcelable("maskedWallet");
            }
            if (bundle.containsKey("walletFragmentOptions")) {
                this.g = (WalletFragmentOptions) bundle.getParcelable("walletFragmentOptions");
            }
            if (bundle.containsKey("enabled")) {
                this.k = Boolean.valueOf(bundle.getBoolean("enabled"));
            }
        } else if (this.f.getArguments() != null) {
            WalletFragmentOptions walletFragmentOptions = (WalletFragmentOptions) this.f.getArguments().getParcelable("extraWalletFragmentOptions");
            if (walletFragmentOptions != null) {
                walletFragmentOptions.a(this.f.getActivity());
                this.g = walletFragmentOptions;
            }
        }
        this.b = true;
        this.d.a(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.d.a(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        this.b = false;
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        if (this.g == null) {
            this.g = WalletFragmentOptions.a((Context) activity, attributeSet);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("attrKeyWalletFragmentOptions", this.g);
        this.d.a(activity, bundle2, bundle);
    }

    public void onPause() {
        super.onPause();
        this.d.d();
    }

    public void onResume() {
        super.onResume();
        this.d.c();
        FragmentManager supportFragmentManager = this.f.getActivity().getSupportFragmentManager();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(e.a);
        if (findFragmentByTag != null) {
            supportFragmentManager.beginTransaction().remove(findFragmentByTag).commit();
            e.b(e.a(this.f.getActivity()), this.f.getActivity(), -1);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.setClassLoader(WalletFragmentOptions.class.getClassLoader());
        this.d.b(bundle);
        if (this.h != null) {
            bundle.putParcelable("walletFragmentInitParams", this.h);
            this.h = null;
        }
        if (this.i != null) {
            bundle.putParcelable("maskedWalletRequest", this.i);
            this.i = null;
        }
        if (this.j != null) {
            bundle.putParcelable("maskedWallet", this.j);
            this.j = null;
        }
        if (this.g != null) {
            bundle.putParcelable("walletFragmentOptions", this.g);
            this.g = null;
        }
        if (this.k != null) {
            bundle.putBoolean("enabled", this.k.booleanValue());
            this.k = null;
        }
    }

    public void onStart() {
        super.onStart();
        this.d.b();
    }

    public void onStop() {
        super.onStop();
        this.d.e();
    }
}
