package com.fimi.soul.module.login;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cn.sharesdk.facebook.Facebook;
import cn.sharesdk.twitter.Twitter;
import com.fimi.kernel.utils.z;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.manager.x;
import com.fimi.soul.entity.User;
import com.fimi.soul.module.setting.ShowTextActivity;
import com.fimi.soul.module.thirdpartlogin.c;
import com.fimi.soul.service.InitAppService;
import com.fimi.soul.utils.ai;
import com.fimi.soul.utils.aj;
import com.fimi.soul.utils.ao;
import com.xiaomi.account.openauth.XiaomiOAuthResults;
import com.xiaomi.mipush.sdk.MiPushClient;

public class LoginFragment extends Fragment implements OnClickListener {
    private com.fimi.soul.module.thirdpartlogin.c.a A = new com.fimi.soul.module.thirdpartlogin.c.a(this) {
        final /* synthetic */ LoginFragment a;

        {
            this.a = r1;
        }

        public void a(int i, Object obj) {
            this.a.y = false;
            this.a.z = i;
            if (i == 0) {
                this.a.o.setVisibility(4);
                MiPushClient.registerPush(this.a.b, "2882303761517518920", com.fimi.soul.base.a.r);
                this.a.a();
                this.a.b.startService(new Intent(this.a.b, InitAppService.class));
            } else if (i == 1) {
                this.a.o.setVisibility(4);
                z.a(this.a.b, (String) obj, z.c);
            } else {
                this.a.o.setVisibility(4);
            }
        }
    };
    private TextView a;
    private Context b;
    private TextView c;
    private TextView d;
    private Button e;
    private Button f;
    private Button g;
    private Button h;
    private LinearLayout i;
    private TextView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private RelativeLayout n;
    private RelativeLayout o;
    private LayoutTransition p;
    private a q;
    private String r = "http://dev.xiaomi.com";
    private XiaomiOAuthResults s;
    private x t;
    private String u;
    private User v = new User();
    private Boolean w = Boolean.valueOf(false);
    private aj x;
    private boolean y = false;
    private int z = -10;

    public interface a {
        void a();
    }

    private void a() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.a, "translationX", new float[]{this.a.getTranslationX(), 1000.0f});
        ofFloat.setDuration(500);
        ofFloat.start();
        ofFloat = ObjectAnimator.ofFloat(this.d, "translationX", new float[]{this.d.getTranslationX(), 1000.0f});
        ofFloat.setStartDelay(100);
        ofFloat.setDuration(500);
        ofFloat.start();
        ofFloat = ObjectAnimator.ofFloat(this.e, "translationX", new float[]{this.d.getTranslationX(), 1000.0f});
        ofFloat.setStartDelay(200);
        ofFloat.setDuration(500);
        ofFloat.start();
        ofFloat = ObjectAnimator.ofFloat(this.i, "translationX", new float[]{this.d.getTranslationX(), 1000.0f});
        ofFloat.setStartDelay(200);
        ofFloat.setDuration(500);
        ofFloat.start();
        ofFloat = ObjectAnimator.ofFloat(this.f, "translationX", new float[]{this.d.getTranslationX(), 1000.0f});
        ofFloat.setStartDelay(300);
        ofFloat.setDuration(500);
        ofFloat.start();
        Animator ofFloat2 = ObjectAnimator.ofFloat(this.j, "translationX", new float[]{this.d.getTranslationX(), 1000.0f});
        Animator ofFloat3 = ObjectAnimator.ofFloat(this.k, "translationX", new float[]{this.d.getTranslationX(), 1000.0f});
        Animator ofFloat4 = ObjectAnimator.ofFloat(this.m, "translationX", new float[]{this.d.getTranslationX(), 1000.0f});
        Animator ofFloat5 = ObjectAnimator.ofFloat(this.l, "translationX", new float[]{this.d.getTranslationX(), 1000.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat2).with(ofFloat5).with(ofFloat3).with(ofFloat4);
        animatorSet.setStartDelay(400);
        animatorSet.setDuration(500);
        animatorSet.start();
        ofFloat = ObjectAnimator.ofFloat(this.c, "translationX", new float[]{this.d.getTranslationX(), 1000.0f});
        ofFloat.setStartDelay(500);
        ofFloat.setDuration(500);
        ofFloat.start();
        this.q.a();
    }

    public void facebookLogin() {
        if (!this.y) {
            this.y = false;
            if (com.fimi.soul.module.c.a.a(this.b)) {
                this.o.setVisibility(0);
            }
            c.a().a(Facebook.NAME, this.A);
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.q = (a) activity;
        this.b = activity;
    }

    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.agreementshengming_tv:
                intent = new Intent(getActivity(), ShowTextActivity.class);
                intent.putExtra(ShowTextActivity.c, com.fimi.soul.base.a.h);
                intent.putExtra(ShowTextActivity.a, R.string.agreement_shengming);
                intent.putExtra(ShowTextActivity.b, "file:///android_asset/statement.html");
                startActivity(intent);
                return;
            case R.id.register_bt:
                if (ao.b(this.b)) {
                    this.b.startActivity(new Intent(this.b, RegisterActivity.class));
                    return;
                }
                z.a(this.b, (int) R.string.login_result_net, 1000);
                return;
            case R.id.login_bt:
                if (ao.b(this.b)) {
                    this.o.setVisibility(0);
                    this.x.a(this.b, new com.fimi.soul.utils.aj.a(this) {
                        final /* synthetic */ LoginFragment a;

                        {
                            this.a = r1;
                        }

                        public void a() {
                            this.a.o.setVisibility(4);
                            MiPushClient.registerPush(this.a.b, "2882303761517518920", com.fimi.soul.base.a.r);
                            this.a.a();
                            this.a.b.startService(new Intent(this.a.b, InitAppService.class));
                        }

                        public void a(String str) {
                            this.a.o.setVisibility(4);
                            z.a(this.a.b, str, z.c);
                        }

                        public void b() {
                            this.a.o.setVisibility(4);
                        }
                    });
                    return;
                }
                z.a(this.b, (int) R.string.login_result_net, 1000);
                return;
            case R.id.btn_facebook_login:
                facebookLogin();
                return;
            case R.id.btn_twitter_login:
                twitterLogin();
                return;
            case R.id.agreementprivacy_tv:
                intent = new Intent(getActivity(), ShowTextActivity.class);
                intent.putExtra(ShowTextActivity.c, com.fimi.soul.base.a.i);
                intent.putExtra(ShowTextActivity.a, R.string.agreement_privacy);
                intent.putExtra(ShowTextActivity.b, "file:///android_asset/privacy.html");
                startActivity(intent);
                return;
            case R.id.nologin_tv:
                if (!this.w.booleanValue()) {
                    this.w = Boolean.valueOf(true);
                    a();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_login, viewGroup, false);
        this.c = (TextView) inflate.findViewById(R.id.nologin_tv);
        this.c.setOnClickListener(this);
        this.a = (TextView) inflate.findViewById(R.id.welcom_tv);
        this.e = (Button) inflate.findViewById(R.id.login_bt);
        this.f = (Button) inflate.findViewById(R.id.register_bt);
        this.d = (TextView) inflate.findViewById(R.id.miaircraft_tv);
        this.d = (TextView) inflate.findViewById(R.id.miaircraft_tv);
        this.e = (Button) inflate.findViewById(R.id.login_bt);
        this.e.setOnClickListener(this);
        this.i = (LinearLayout) inflate.findViewById(R.id.ll_trilateral_login);
        this.g = (Button) inflate.findViewById(R.id.btn_facebook_login);
        this.g.setOnClickListener(this);
        this.h = (Button) inflate.findViewById(R.id.btn_twitter_login);
        this.h.setOnClickListener(this);
        this.m = (TextView) inflate.findViewById(R.id.agreement_tv);
        this.f = (Button) inflate.findViewById(R.id.register_bt);
        this.f.setOnClickListener(this);
        this.j = (TextView) inflate.findViewById(R.id.agreementprivacy_tv);
        this.j.getPaint().setFlags(8);
        this.j.getPaint().setAntiAlias(true);
        this.j.setOnClickListener(this);
        this.k = (TextView) inflate.findViewById(R.id.agreementshengming_tv);
        this.k.getPaint().setFlags(8);
        this.k.getPaint().setAntiAlias(true);
        this.k.setOnClickListener(this);
        this.l = (TextView) inflate.findViewById(R.id.loginmillet_tv);
        this.n = (RelativeLayout) inflate.findViewById(R.id.login_rl);
        this.o = (RelativeLayout) inflate.findViewById(R.id.login_progress_rl);
        this.t = x.a(this.b);
        ao.a(this.b.getAssets(), this.c, this.a, this.e, this.f, this.d, this.j, this.m, this.k, this.l, this.g, this.h);
        this.x = new ai();
        if (getActivity() != null) {
            c.a().a(getActivity());
        }
        return inflate;
    }

    public void twitterLogin() {
        if (!this.y) {
            this.y = false;
            if (com.fimi.soul.module.c.a.a(this.b)) {
                this.o.setVisibility(0);
            }
            c.a().a(Twitter.NAME, this.A);
        }
    }
}
