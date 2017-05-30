package com.fimi.soul.view.titlebar;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow;
import com.fimi.kernel.utils.p;
import m.framework.ui.widget.asyncview.AsyncImageView;

public class FmBottomBar extends LinearLayout {
    public int a = 2;
    public LayoutInflater b;
    public int c = 320;
    private Activity d;
    private PopupWindow e;
    private WindowManager f = null;

    public FmBottomBar(Context context) {
        super(context);
        a(context);
    }

    public FmBottomBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    private void a(View view, View view2, boolean z) {
        p.a(view2);
        int measuredWidth = view.getMeasuredWidth();
        if (view2.getMeasuredWidth() > view.getMeasuredWidth()) {
            measuredWidth = view2.getMeasuredWidth();
        }
        int measuredHeight = getMeasuredHeight();
        if (z) {
            this.e = new PopupWindow(view2, measuredWidth, -2, true);
        } else {
            this.e = new PopupWindow(view2, -1, -2, true);
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int left = iArr[0] - view.getLeft();
        measuredWidth = left + measuredWidth >= this.c ? (this.c - measuredWidth) - 2 : left;
        this.e.setFocusable(true);
        this.e.setOutsideTouchable(true);
        this.e.setBackgroundDrawable(new ColorDrawable(AsyncImageView.a));
        this.e.showAtLocation(view, 83, measuredWidth, measuredHeight + 2);
    }

    public void a(Context context) {
        this.d = (Activity) context;
        setOrientation(0);
        setId(this.a);
        setPadding(0, 0, 0, 0);
        this.b = LayoutInflater.from(context);
        this.f = this.d.getWindowManager();
        this.c = this.f.getDefaultDisplay().getWidth();
    }

    public void a(final View view, final View view2) {
        if (view != null && view2 != null) {
            view.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ FmBottomBar c;

                public void onClick(View view) {
                    this.c.a(view, view2, true);
                }
            });
        }
    }

    public void setBottomBarBackground(int i) {
        setBackgroundResource(i);
    }

    public void setBottomBarBackgroundColor(int i) {
        setBackgroundColor(i);
    }

    public void setBottomBarBackgroundDrawable(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBottomView(int i) {
        setBottomView(this.b.inflate(i, null));
    }

    public void setBottomView(View view) {
        removeAllViews();
        addView(view, new LayoutParams(-1, -2));
    }
}
