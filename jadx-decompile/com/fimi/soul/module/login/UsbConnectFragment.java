package com.fimi.soul.module.login;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.kernel.utils.z;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.a.b;

public class UsbConnectFragment extends Fragment implements Callback, OnClickListener {
    WifiManager a;
    private TextView b;
    private TextView c;
    private RelativeLayout d;
    private RelativeLayout e;
    private RelativeLayout f;
    private RelativeLayout g;
    private RelativeLayout h;
    private Context i;
    private Button j;
    private Button k;
    private Button l;
    private a m;
    private Handler n;
    private com.fimi.soul.drone.a o;
    private int p = 100;

    public interface a {
        void b();

        void c();
    }

    private void a() {
        b bVar = new b(getActivity());
        bVar.a(getString(R.string.good), new DialogInterface.OnClickListener(this) {
            final /* synthetic */ UsbConnectFragment a;

            {
                this.a = r1;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                if (com.fimi.soul.biz.a.a.a().b() == 1) {
                    if (this.a.getActivity() == null || VERSION.SDK_INT >= 24 || !ao.i(this.a.getActivity()).booleanValue()) {
                        Intent intent = new Intent();
                        intent.setClassName("com.android.settings", "com.android.settings.TetherSettings");
                        if (this.a.getActivity() != null) {
                            this.a.startActivityForResult(intent, 0);
                            return;
                        }
                        return;
                    }
                    this.a.b();
                    this.a.m.b();
                } else if (this.a.o.T().a()) {
                    this.a.n.sendMessageDelayed(Message.obtain(), 300);
                } else {
                    if (!this.a.a.isWifiEnabled()) {
                        this.a.a.setWifiEnabled(true);
                    }
                    this.a.startActivityForResult(new Intent("android.settings.WIFI_SETTINGS"), this.a.p);
                }
            }
        });
        bVar.a().show();
    }

    private void a(View view) {
        TextView textView = (TextView) view.findViewById(R.id.declare_one_tv);
        TextView textView2 = (TextView) view.findViewById(R.id.declare_two_tv);
        TextView textView3 = (TextView) view.findViewById(R.id.declare_three_tv);
        TextView textView4 = (TextView) view.findViewById(R.id.declare_four_tv);
        TextView textView5 = (TextView) view.findViewById(R.id.declare_two_child_tv);
        TextView textView6 = (TextView) view.findViewById(R.id.declare_three_child_tv);
        ao.a(this.i.getAssets(), textView, textView2, textView3, textView4, textView5, textView6, this.j, this.k, this.b);
    }

    private void b() {
        Animator ofFloat = ObjectAnimator.ofFloat(this.b, "translationX", new float[]{0.0f, 1000.0f});
        Animator ofFloat2 = ObjectAnimator.ofFloat(this.d, "translationX", new float[]{0.0f, 1000.0f});
        Animator ofFloat3 = ObjectAnimator.ofFloat(this.e, "translationX", new float[]{0.0f, 1000.0f});
        Animator ofFloat4 = ObjectAnimator.ofFloat(this.f, "translationX", new float[]{0.0f, 1000.0f});
        Animator ofFloat5 = ObjectAnimator.ofFloat(this.g, "translationX", new float[]{0.0f, 1000.0f});
        Animator ofFloat6 = ObjectAnimator.ofFloat(this.h, "translationX", new float[]{0.0f, 1000.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat6).with(ofFloat5).with(ofFloat4).with(ofFloat2).with(ofFloat3).with(ofFloat);
        animatorSet.setDuration(500);
        animatorSet.start();
    }

    private void b(View view) {
        this.j = (Button) view.findViewById(R.id.next_bt);
        this.j.setOnClickListener(this);
        this.k = (Button) view.findViewById(R.id.noconnect_bt);
        this.k.setOnClickListener(this);
        this.d = (RelativeLayout) view.findViewById(R.id.usbconnect_one_rl);
        this.e = (RelativeLayout) view.findViewById(R.id.usbconnect_two_rl);
        this.f = (RelativeLayout) view.findViewById(R.id.usbconnect_three_rl);
        this.g = (RelativeLayout) view.findViewById(R.id.usbconnect_four_rl);
        this.h = (RelativeLayout) view.findViewById(R.id.usbconnect_button_rl);
        this.b = (TextView) view.findViewById(R.id.connectplane_tv);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.b, "translationX", new float[]{800.0f, 0.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.d, "translationX", new float[]{800.0f, 0.0f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.e, "translationX", new float[]{800.0f, 0.0f});
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f, "translationX", new float[]{800.0f, 0.0f});
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.g, "translationX", new float[]{800.0f, 0.0f});
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.h, "translationX", new float[]{800.0f, 0.0f});
        this.l = (Button) view.findViewById(R.id.next_bt);
        this.l.setOnClickListener(this);
        ofFloat.setStartDelay(0);
        ofFloat2.setStartDelay(70);
        ofFloat3.setStartDelay(140);
        ofFloat4.setStartDelay(210);
        ofFloat5.setStartDelay(280);
        ofFloat6.setStartDelay(350);
        ofFloat.setDuration(250);
        ofFloat2.setDuration(250);
        ofFloat3.setDuration(250);
        ofFloat4.setDuration(250);
        ofFloat5.setDuration(250);
        ofFloat6.setDuration(250);
        ofFloat.addListener(new AnimatorListenerAdapter(this) {
            final /* synthetic */ UsbConnectFragment a;

            {
                this.a = r1;
            }

            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                this.a.b.setVisibility(0);
            }
        });
        ofFloat2.addListener(new AnimatorListenerAdapter(this) {
            final /* synthetic */ UsbConnectFragment a;

            {
                this.a = r1;
            }

            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                this.a.d.setVisibility(0);
            }
        });
        ofFloat3.addListener(new AnimatorListenerAdapter(this) {
            final /* synthetic */ UsbConnectFragment a;

            {
                this.a = r1;
            }

            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                this.a.e.setVisibility(0);
            }
        });
        ofFloat4.addListener(new AnimatorListenerAdapter(this) {
            final /* synthetic */ UsbConnectFragment a;

            {
                this.a = r1;
            }

            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                this.a.f.setVisibility(0);
            }
        });
        ofFloat5.addListener(new AnimatorListenerAdapter(this) {
            final /* synthetic */ UsbConnectFragment a;

            {
                this.a = r1;
            }

            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                this.a.g.setVisibility(0);
            }
        });
        ofFloat6.addListener(new AnimatorListenerAdapter(this) {
            final /* synthetic */ UsbConnectFragment a;

            {
                this.a = r1;
            }

            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                this.a.h.setVisibility(0);
            }
        });
        if (getArguments() == null || !getArguments().getBoolean("isEnterLoginFragment", false)) {
            this.b.setVisibility(0);
            this.d.setVisibility(0);
            this.e.setVisibility(0);
            this.f.setVisibility(0);
            this.g.setVisibility(0);
            this.h.setVisibility(0);
            return;
        }
        ofFloat.start();
        ofFloat2.start();
        ofFloat3.start();
        ofFloat4.start();
        ofFloat5.start();
        ofFloat6.start();
    }

    public boolean handleMessage(Message message) {
        b();
        this.m.b();
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            if (VERSION.SDK_INT >= 24) {
                this.n.sendMessageDelayed(Message.obtain(), 300);
            } else if (ao.i(this.i).booleanValue()) {
                this.n.sendMessageDelayed(Message.obtain(), 300);
            }
        } else if (i != this.p) {
        } else {
            if (ao.c(getActivity().getApplicationContext())) {
                this.n.sendMessageDelayed(Message.obtain(), 300);
            } else {
                z.a(getActivity(), (int) R.string.connectRcWifi, 3000);
            }
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.i = activity;
        this.m = (a) activity;
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.noconnect_bt:
                if (this.m != null) {
                    this.m.c();
                    return;
                }
                return;
            case R.id.next_bt:
                if (this.o == null || !(this.o.T().a() || this.o.U())) {
                    a();
                    return;
                } else {
                    this.n.sendMessageDelayed(Message.obtain(), 300);
                    return;
                }
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = (WifiManager) getActivity().getSystemService("wifi");
        this.o = ((DroidPlannerApp) getActivity().getApplication()).a;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_usbconnect, viewGroup, false);
        b(inflate);
        a(inflate);
        this.n = new Handler(this);
        return inflate;
    }

    public void onResume() {
        super.onResume();
    }
}
