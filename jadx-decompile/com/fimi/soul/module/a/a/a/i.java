package com.fimi.soul.module.a.a.a;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import cn.sharesdk.framework.CustomPlatform;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.Platform.ShareParams;
import cn.sharesdk.framework.ShareSDK;
import com.fimi.soul.module.a.a;
import com.fimi.soul.module.a.c;
import com.fimi.soul.module.a.e;
import com.mob.tools.gui.MobViewPager;
import com.mob.tools.gui.ViewPagerAdapter;
import com.mob.tools.utils.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public abstract class i extends c {
    private a a;
    private Runnable b;
    private Animation c;
    private Animation d;
    private LinearLayout e;
    private boolean f;

    public i(e eVar) {
        super(eVar);
        this.a = (a) R.forceCast(eVar);
    }

    private void j() {
        this.c = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        this.c.setDuration(300);
        this.d = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        this.d.setDuration(300);
    }

    protected abstract j a(ArrayList<Object> arrayList);

    public final void a(final View view, final a aVar) {
        this.b = new Runnable(this) {
            final /* synthetic */ i c;

            public void run() {
                aVar.c.onClick(view);
            }
        };
        finish();
    }

    public final void d(final Platform platform) {
        this.b = new Runnable(this) {
            final /* synthetic */ i b;

            public void run() {
                boolean a = this.b.c();
                boolean z = platform instanceof CustomPlatform;
                boolean a2 = this.b.c(platform);
                if (a || z || a2) {
                    this.b.a(platform);
                    return;
                }
                ShareParams c = this.b.b(platform);
                if (c != null) {
                    ShareSDK.logDemoEvent(3, null);
                    if (this.b.g() != null) {
                        this.b.g().a(platform, c);
                    }
                    this.b.a.a(this.b.activity, platform, c);
                }
            }
        };
        finish();
    }

    protected ArrayList<Object> i() {
        int i = 0;
        ArrayList<Object> arrayList = new ArrayList();
        Platform[] platformList = ShareSDK.getPlatformList();
        if (platformList == null) {
            platformList = new Platform[0];
        }
        HashMap e = e();
        if (e == null) {
            e = new HashMap();
        }
        int length = platformList.length;
        while (i < length) {
            Platform platform = platformList[i];
            if (!e.containsKey(platform.getName())) {
                arrayList.add(platform);
            }
            i++;
        }
        Collection d = d();
        if (d != null && d.size() > 0) {
            arrayList.addAll(d);
        }
        return arrayList;
    }

    public void onCreate() {
        this.activity.getWindow().setBackgroundDrawable(new ColorDrawable(1275068416));
        j();
        View linearLayout = new LinearLayout(this.activity);
        linearLayout.setOrientation(1);
        this.activity.setContentView(linearLayout);
        View textView = new TextView(this.activity);
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        textView.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ i a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.finish();
            }
        });
        linearLayout.addView(textView, layoutParams);
        this.e = new LinearLayout(this.activity);
        this.e.setOrientation(1);
        LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        this.e.setAnimation(this.c);
        linearLayout.addView(this.e, layoutParams2);
        linearLayout = new MobViewPager(this.activity);
        ViewPagerAdapter a = a(i());
        this.e.addView(linearLayout, new LinearLayout.LayoutParams(-1, a.b()));
        f fVar = new f(this.activity);
        this.e.addView(fVar, new LinearLayout.LayoutParams(-1, a.a()));
        fVar.setScreenCount(a.getCount());
        fVar.a(0, 0);
        a.a(fVar);
        linearLayout.setAdapter(a);
    }

    public boolean onFinish() {
        if (this.f) {
            this.f = false;
            return false;
        }
        this.d.setAnimationListener(new AnimationListener(this) {
            final /* synthetic */ i a;

            {
                this.a = r1;
            }

            public void onAnimationEnd(Animation animation) {
                if (this.a.b == null) {
                    ShareSDK.logDemoEvent(2, null);
                } else {
                    this.a.b.run();
                    this.a.b = null;
                }
                this.a.f = true;
                this.a.finish();
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        });
        this.e.clearAnimation();
        this.e.setAnimation(this.d);
        this.e.setVisibility(8);
        return true;
    }
}
