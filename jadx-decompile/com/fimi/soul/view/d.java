package com.fimi.soul.view;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import java.util.List;

public class d extends PopupWindow {
    final Handler a = new Handler();
    Runnable b = new Runnable(this) {
        final /* synthetic */ d a;

        {
            this.a = r1;
        }

        public void run() {
            this.a.f = this.a.f - 1;
            if (this.a.f >= 0) {
                this.a.a.postDelayed(this.a.b, 1000);
            } else if (this.a.isShowing()) {
                this.a.dismiss();
            }
        }
    };
    private LinearLayout c;
    private LayoutParams d = null;
    private Context e;
    private int f = 2;

    public d(Context context, int i, int i2) {
        super(context);
        this.e = context;
        this.d = new LayoutParams(-2, -2);
        this.d.gravity = 17;
        this.d.topMargin = 10;
        this.c = new LinearLayout(context);
        this.c.setOrientation(1);
        this.c.setGravity(1);
        setContentView(this.c);
        setWidth(-2);
        setHeight(i2);
        setBackgroundDrawable(context.getResources().getDrawable(R.drawable.bubble));
        getContentView().setOnFocusChangeListener(new OnFocusChangeListener(this) {
            final /* synthetic */ d a;

            {
                this.a = r1;
            }

            public void onFocusChange(View view, boolean z) {
                if (!z) {
                    this.a.dismiss();
                }
            }
        });
    }

    public void a(List<Integer> list, View view, int i, int i2) {
        if (isShowing()) {
            dismiss();
            return;
        }
        this.c.removeAllViews();
        View view2 = new View(this.e);
        view2.setLayoutParams(new ViewGroup.LayoutParams(1, 30));
        this.c.addView(view2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            View textView = new TextView(this.e);
            textView.setTextColor(-1);
            textView.setSingleLine(true);
            textView.setText(this.e.getResources().getString(((Integer) list.get(i3)).intValue()));
            this.d.topMargin = 5;
            this.c.addView(textView, this.d);
        }
        setHeight((list.size() * ((int) this.e.getResources().getDimension(R.dimen.popuwindows_h))) + 50);
        setFocusable(true);
        showAsDropDown(view, i, i2);
        this.f = 1;
        this.a.postDelayed(this.b, 1000);
    }
}
