package com.fimi.soul.module.a.a.a;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.Platform.ShareParams;
import cn.sharesdk.framework.ShareSDK;
import com.fimi.soul.module.a.c;
import com.fimi.soul.module.a.e;
import com.mob.tools.gui.AsyncImageView;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.R;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.a.a.f.c.l;

public class b extends c implements TextWatcher, OnClickListener, Runnable {
    protected Platform a;
    protected ShareParams b;
    protected LinearLayout c;
    protected RelativeLayout d;
    protected ScrollView e;
    protected EditText f;
    protected TextView g;
    protected TextView h;
    protected RelativeLayout i;
    protected AsyncImageView j;
    protected l k;
    protected LinearLayout l;
    protected TextView m;
    protected TextView n;
    protected Bitmap o;
    protected int p;
    private e q;

    public b(e eVar) {
        super(eVar);
        this.q = eVar;
    }

    private String a(HashMap<String, Object> hashMap) {
        if (hashMap == null || !hashMap.containsKey("selected")) {
            return null;
        }
        ArrayList arrayList = (ArrayList) hashMap.get("selected");
        if ("FacebookMessenger".equals(((Platform) hashMap.get(Constants.PARAM_PLATFORM)).getName())) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuilder.append('@').append((String) it.next()).append(l.c);
        }
        return stringBuilder.toString();
    }

    private void a(Bitmap bitmap) {
        h hVar = new h(this.q);
        hVar.a(bitmap);
        hVar.show(this.activity, null);
    }

    private void i() {
        ShareSDK.logDemoEvent(5, this.a);
        finish();
    }

    private void j() {
        int stringRes = R.getStringRes(this.activity, "ssdk_oks_sharing");
        if (stringRes > 0) {
            Toast.makeText(this.activity, stringRes, 0).show();
        }
        if (h()) {
            this.a.SSOSetting(true);
        }
        this.a.setPlatformActionListener(f());
        this.a.share(this.b);
        finish();
    }

    private void k() {
        this.b.setImageArray(null);
        this.b.setImageData(null);
        this.b.setImagePath(null);
        this.b.setImageUrl(null);
    }

    private void l() {
        e bVar = this.activity.getResources().getConfiguration().orientation == 1 ? new com.fimi.soul.module.a.a.a.b.b(this.q) : new com.fimi.soul.module.a.a.a.a.b(this.q);
        bVar.d(this.a);
        bVar.showForResult(this.a.getContext(), null, this);
    }

    public void a(ShareParams shareParams) {
        this.b = shareParams;
    }

    protected boolean a(String str) {
        return "SinaWeibo".equals(str) || "TencentWeibo".equals(str) || "Facebook".equals(str) || "Twitter".equals(str);
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void d(Platform platform) {
        this.a = platform;
    }

    public void onClick(View view) {
        if (view.equals(this.g)) {
            i();
        } else if (view.equals(this.h)) {
            this.b.setText(this.f.getText().toString().trim());
            j();
        } else if (view.equals(this.j)) {
            a(this.o);
        } else if (view.equals(this.k)) {
            this.p = 0;
            this.i.setVisibility(8);
            this.c.measure(0, 0);
            onTextChanged(this.f.getText(), 0, 0, 0);
            k();
        } else if (view.equals(this.m)) {
            l();
        }
    }

    public void onCreate() {
        this.activity.getWindow().setBackgroundDrawable(new ColorDrawable(-789517));
    }

    public void onPause() {
        DeviceHelper.getInstance(this.activity).hideSoftInput(getContentView());
        super.onPause();
    }

    public void onResult(HashMap<String, Object> hashMap) {
        CharSequence a = a((HashMap) hashMap);
        if (!TextUtils.isEmpty(a)) {
            this.f.append(a);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.n.setText(String.valueOf(charSequence.length()));
        if (this.p == 0) {
            this.p = (this.c.getHeight() - this.d.getHeight()) - this.l.getHeight();
        }
        if (this.p > 0) {
            this.e.post(this);
        }
    }

    public void run() {
        int height = this.e.getChildAt(0).getHeight();
        LayoutParams layoutParams = (LayoutParams) R.forceCast(this.e.getLayoutParams());
        if (height > this.p && layoutParams.height != this.p) {
            layoutParams.height = this.p;
            this.e.setLayoutParams(layoutParams);
        } else if (height < this.p && layoutParams.height == this.p) {
            layoutParams.height = -2;
            this.e.setLayoutParams(layoutParams);
        }
    }

    public void setActivity(Activity activity) {
        super.setActivity(activity);
        if (a()) {
            System.err.println("Theme classic does not support dialog mode!");
        }
        activity.getWindow().setSoftInputMode(37);
    }
}
