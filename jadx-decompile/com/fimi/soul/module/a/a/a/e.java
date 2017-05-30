package com.fimi.soul.module.a.a.a;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import cn.sharesdk.framework.Platform;
import com.fimi.soul.module.a.a.a.c.b;
import com.fimi.soul.module.a.c;
import com.mob.tools.gui.PullToRequestView;
import com.mob.tools.utils.R;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class e extends c implements OnClickListener, OnItemClickListener {
    private static final int a = 40;
    private Platform b;
    private LinearLayout c;
    private RelativeLayout d;
    private TextView e;
    private TextView f;
    private c g;
    private int h = -1;
    private int i = 0;

    public e(com.fimi.soul.module.a.e eVar) {
        super(eVar);
    }

    private void a(RelativeLayout relativeLayout, float f) {
        this.e = new TextView(this.activity);
        this.e.setTextColor(-12895429);
        this.e.setTextSize(2, 18.0f);
        this.e.setGravity(17);
        int stringRes = R.getStringRes(this.activity, "ssdk_oks_cancel");
        if (stringRes > 0) {
            this.e.setText(stringRes);
        }
        stringRes = (int) (40.0f * f);
        this.e.setPadding(stringRes, 0, stringRes, 0);
        relativeLayout.addView(this.e, new LayoutParams(-2, -1));
        this.e.setOnClickListener(this);
        View textView = new TextView(this.activity);
        textView.setTextColor(-12895429);
        textView.setTextSize(2, 22.0f);
        textView.setGravity(17);
        int stringRes2 = R.getStringRes(this.activity, "ssdk_oks_contacts");
        if (stringRes2 > 0) {
            textView.setText(stringRes2);
        }
        ViewGroup.LayoutParams layoutParams = new LayoutParams(-2, -1);
        layoutParams.addRule(13);
        relativeLayout.addView(textView, layoutParams);
        this.f = new TextView(this.activity);
        this.f.setTextColor(-37615);
        this.f.setTextSize(2, 18.0f);
        this.f.setGravity(17);
        int stringRes3 = R.getStringRes(this.activity, "ssdk_oks_confirm");
        if (stringRes3 > 0) {
            this.f.setText(stringRes3);
        }
        this.f.setPadding(stringRes, 0, stringRes, 0);
        ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-2, -1);
        layoutParams2.addRule(11);
        relativeLayout.addView(this.f, layoutParams2);
        this.f.setOnClickListener(this);
    }

    private void k() {
        int stringRes = R.getStringRes(this.activity, "ssdk_oks_confirm");
        Object obj = "Confirm";
        if (stringRes > 0) {
            obj = getContext().getResources().getString(stringRes);
        }
        if (this.i == 0) {
            this.f.setText(obj);
        } else if (this.i > 0) {
            this.f.setText(obj + "(" + this.i + ")");
        }
    }

    public void d(Platform platform) {
        this.b = platform;
    }

    protected abstract float i();

    protected abstract int j();

    public void onClick(View view) {
        if (view.equals(this.e)) {
            finish();
            return;
        }
        ArrayList arrayList = new ArrayList();
        int count = this.g.getCount();
        for (int i = 0; i < count; i++) {
            if (this.g.a(i).a) {
                arrayList.add(this.g.a(i).f);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("selected", arrayList);
        hashMap.put(Constants.PARAM_PLATFORM, this.b);
        setResult(hashMap);
        finish();
    }

    public void onCreate() {
        this.activity.getWindow().setBackgroundDrawable(new ColorDrawable(-789517));
        this.c = new LinearLayout(this.activity);
        this.c.setOrientation(1);
        this.activity.setContentView(this.c);
        this.d = new RelativeLayout(this.activity);
        float i = i();
        this.c.addView(this.d, new LinearLayout.LayoutParams(-1, (int) (((float) j()) * i)));
        a(this.d, i);
        View view = new View(this.activity);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) (i < 1.0f ? 1.0f : i));
        view.setBackgroundColor(-2434599);
        this.c.addView(view, layoutParams);
        View frameLayout = new FrameLayout(getContext());
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.weight = 1.0f;
        frameLayout.setLayoutParams(layoutParams2);
        this.c.addView(frameLayout);
        View pullToRequestView = new PullToRequestView(getContext());
        pullToRequestView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(pullToRequestView);
        this.g = new c(this, pullToRequestView);
        this.g.a(this.b);
        this.g.a(i);
        this.g.a((OnItemClickListener) this);
        pullToRequestView.setAdapter(this.g);
        pullToRequestView.performPullingDown(true);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        boolean z = false;
        if ("FacebookMessenger".equals(this.b.getName())) {
            if (this.h >= 0) {
                this.g.a(this.h).a = false;
            }
            this.h = i;
        }
        b a = this.g.a(i);
        if (!a.a) {
            z = true;
        }
        a.a = z;
        if (a.a) {
            this.i++;
        } else {
            this.i--;
        }
        k();
        this.g.notifyDataSetChanged();
    }
}
