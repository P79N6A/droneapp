package com.fimi.soul.view.titlebar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.app.FragmentActivity;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.fimi.kernel.utils.n;
import com.fimi.kernel.utils.p;
import com.fimi.kernel.view.dialog.SampleDialogFragment;
import com.fimi.overseas.soul.R;
import com.fimi.soul.b.e;
import com.fimi.soul.base.BaseFimiActivity;
import com.fimi.soul.entity.FmMenuItem;
import java.util.List;
import m.framework.ui.widget.asyncview.AsyncImageView;

public class FmTitleBar extends LinearLayout {
    protected LinearLayout a = null;
    protected LinearLayout b = null;
    protected Button c = null;
    protected Button d = null;
    protected ImageView e = null;
    protected ImageView f = null;
    protected SimpleDraweeView g = null;
    protected ImageView h = null;
    protected LinearLayout i = null;
    public int j = 1;
    public LayoutInflater k;
    public int l;
    public LayoutParams m = null;
    public LayoutParams n = null;
    public LayoutParams o = null;
    public LayoutParams p = null;
    public LayoutParams q = null;
    SampleDialogFragment r = null;
    private Activity s;
    private LayoutParams t = null;
    private LayoutParams u = null;
    private PopupWindow v;

    public FmTitleBar(Context context) {
        super(context);
        a(context);
    }

    public FmTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public static SampleDialogFragment a(View view, int i, int i2, int i3, int i4, int i5, int i6) {
        FragmentActivity fragmentActivity = (FragmentActivity) view.getContext();
        SampleDialogFragment a = SampleDialogFragment.a(1, R.style.MyDialog, i5, i6);
        a.a(view);
        FragmentTransaction beginTransaction = fragmentActivity.getFragmentManager().beginTransaction();
        beginTransaction.setCustomAnimations(i, i2, i3, i4);
        a.show(beginTransaction, "showDialog");
        a.setCancelable(true);
        return a;
    }

    public void a() {
        this.i.removeAllViews();
    }

    public void a(int i) {
        this.i.setVisibility(0);
        this.i.addView(this.k.inflate(i, null), this.m);
    }

    public void a(int i, int i2) {
        p.a(this.i);
        p.a(this.e);
        int measuredWidth = this.e.getMeasuredWidth();
        int measuredWidth2 = this.i.getMeasuredWidth();
        this.t.rightMargin = 0;
        this.t.leftMargin = 0;
        if (i == 1 || i == 17) {
            if (measuredWidth == 0 && measuredWidth2 == 0) {
                this.a.setGravity(1);
                return;
            }
            if (i2 == 5) {
                if (measuredWidth2 != 0) {
                    this.c.setPadding((measuredWidth2 / 3) * 2, 0, 0, 0);
                }
                this.c.setGravity(17);
                this.i.setHorizontalGravity(5);
            }
            if (i2 == 17 || i2 == 1) {
                this.a.setGravity(1);
                this.i.setHorizontalGravity(3);
                this.c.setGravity(17);
                measuredWidth -= measuredWidth2;
                if (measuredWidth > 0) {
                    this.t.rightMargin = measuredWidth;
                    return;
                }
                this.t.leftMargin = Math.abs(measuredWidth);
            }
        } else if (i == 3 && i2 == 5) {
            this.a.setGravity(3);
            this.i.setHorizontalGravity(5);
        } else if (i == 5 && i2 == 5) {
            this.a.setGravity(5);
            this.i.setHorizontalGravity(5);
        } else if (i == 3 && i2 == 3) {
            this.a.setGravity(3);
            this.i.setHorizontalGravity(3);
        }
    }

    public void a(int i, int i2, int i3, int i4) {
        this.t.setMargins(i, i2, i3, i4);
    }

    public void a(Context context) {
        this.s = (Activity) context;
        setOrientation(1);
        setId(this.j);
        this.k = LayoutInflater.from(context);
        this.n = new LayoutParams(-1, (int) context.getResources().getDimension(R.dimen.activity_headtop_margin));
        this.m = new LayoutParams(-1, -1);
        this.o = new LayoutParams(-1, -2);
        this.p = new LayoutParams(-2, -1);
        this.q = new LayoutParams(-2, -2);
        this.q.gravity = 16;
        this.t = new LayoutParams(-2, -2, 1.0f);
        this.t.gravity = 16;
        this.u = new LayoutParams(-2, -2);
        this.u.gravity = 16;
        if (VERSION.SDK_INT >= 19) {
            addView(new View(context), this.n);
        }
        this.b = new LinearLayout(context);
        this.b.setOrientation(0);
        this.a = new LinearLayout(context);
        this.a.setOrientation(1);
        this.a.setGravity(16);
        this.a.setPadding(0, 0, 0, 0);
        this.c = new Button(context);
        this.c.setTextColor(Color.rgb(255, 255, 255));
        this.c.setTextSize(16.0f);
        this.c.setPadding(5, 0, 5, 0);
        this.c.setGravity(16);
        this.c.setBackgroundDrawable(null);
        this.c.setSingleLine();
        this.a.addView(this.c, new LayoutParams(-2, -2, 1.0f));
        this.d = new Button(context);
        this.d.setTextColor(Color.rgb(255, 255, 255));
        this.d.setTextSize(15.0f);
        this.d.setPadding(6, 0, 5, 0);
        this.d.setGravity(16);
        this.d.setBackgroundDrawable(null);
        this.d.setSingleLine();
        this.a.addView(this.d, new LayoutParams(-2, 0));
        this.e = new ImageView(context);
        this.e.setVisibility(8);
        this.h = new ImageView(context);
        this.h.setVisibility(8);
        this.f = new ImageView(context);
        this.f.setVisibility(8);
        this.g = new SimpleDraweeView(context);
        this.g.setHierarchy(new GenericDraweeHierarchyBuilder(getResources()).setPlaceholderImage(getResources().getDrawable(R.drawable.defaultavatar)).setFailureImage(getResources().getDrawable(R.drawable.defaultavatar)).setRoundingParams(RoundingParams.asCircle()).build());
        this.g.setVisibility(8);
        this.b.addView(this.e, this.q);
        this.b.addView(this.g, this.q);
        this.b.addView(this.h, this.q);
        this.b.addView(this.f, this.q);
        this.b.addView(this.a, this.t);
        this.i = new LinearLayout(context);
        this.i.setOrientation(0);
        this.i.setGravity(5);
        this.i.setPadding(0, 0, 0, 0);
        this.i.setHorizontalGravity(5);
        this.i.setGravity(16);
        this.i.setVisibility(8);
        this.b.addView(this.i, this.u);
        addView(this.b, this.o);
    }

    public void a(Bitmap bitmap, int i, int i2) {
        this.q.leftMargin = 10;
        this.e.setVisibility(0);
        this.e.setImageBitmap(bitmap);
        this.e.getLayoutParams().height = i;
        this.e.getLayoutParams().width = i2;
    }

    public void a(View view) {
        this.m.rightMargin = 20;
        this.i.setVisibility(0);
        this.i.addView(view, this.m);
    }

    public void a(View view, View view2, boolean z) {
        p.a(view2);
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = (getMeasuredHeight() - view.getMeasuredHeight()) / 2;
        if (view2.getMeasuredWidth() > view.getMeasuredWidth()) {
            measuredWidth = view2.getMeasuredWidth();
        }
        if (z) {
            this.v = new PopupWindow(view2, measuredWidth + 10, -2, true);
        } else {
            this.v = new PopupWindow(view2, -1, -2, true);
        }
        this.v.setFocusable(true);
        this.v.setOutsideTouchable(true);
        this.v.setBackgroundDrawable(new ColorDrawable(AsyncImageView.a));
        this.v.showAsDropDown(view, 0, measuredHeight + 2);
    }

    @SuppressLint({"NewApi"})
    public void a(List<FmMenuItem> list, final OnItemClickListener onItemClickListener) {
        View inflate = this.k.inflate(R.layout.list_pop, null);
        this.r = a(inflate, R.anim.push_up_in, R.anim.push_up_out, R.anim.push_up_in, R.anim.push_up_out, 48, this.l);
        ListView listView = (ListView) inflate.findViewById(R.id.pop_list);
        inflate.findViewById(R.id.title_bar).setBackgroundColor(this.l);
        inflate.findViewById(R.id.close).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ FmTitleBar a;

            {
                this.a = r1;
            }

            @SuppressLint({"NewApi"})
            public void onClick(View view) {
                this.a.r.dismiss();
            }
        });
        listView.setAdapter(new e(this.s, list));
        listView.setOnItemClickListener(new OnItemClickListener(this) {
            final /* synthetic */ FmTitleBar b;

            @SuppressLint({"NewApi"})
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                this.b.r.dismiss();
                onItemClickListener.onItemClick(adapterView, view, i, j);
            }
        });
    }

    public SimpleDraweeView b(int i, int i2) {
        this.q.leftMargin = 15;
        this.q.topMargin = 5;
        this.g.setVisibility(0);
        this.g.getLayoutParams().height = i2;
        this.g.getLayoutParams().width = i;
        return this.g;
    }

    @SuppressLint({"NewApi"})
    public void b() {
        if (this.r != null && this.r.isVisible()) {
            this.r.dismiss();
        }
    }

    public void b(Bitmap bitmap, int i, int i2) {
        this.q.leftMargin = 15;
        this.q.topMargin = 5;
        this.g.setVisibility(0);
        this.g.setImageBitmap(bitmap);
        this.g.getLayoutParams().height = i;
        this.g.getLayoutParams().width = i2;
    }

    public void b(View view) {
        this.q.leftMargin = 10;
        this.b.addView(view, this.q);
    }

    public void c() {
        if (this.v != null) {
            this.v.dismiss();
        }
    }

    public ImageView getLogoView() {
        return this.e;
    }

    public ImageView getLogoView2() {
        return this.f;
    }

    public LinearLayout getRightLayout() {
        return this.i;
    }

    public Button getTitleSmallTextButton() {
        return this.d;
    }

    public Button getTitleTextButton() {
        return this.c;
    }

    public LinearLayout getTitleTextLayout() {
        return this.a;
    }

    public void setChildViewFillParent(boolean z) {
        if (z) {
            this.t = new LayoutParams(-2, -2, 1.0f);
            this.t.gravity = 16;
            this.a.setLayoutParams(this.t);
            this.u = new LayoutParams(-2, -2);
            this.u.gravity = 16;
            this.i.setLayoutParams(this.u);
            return;
        }
        this.t = new LayoutParams(-2, -2);
        this.t.gravity = 16;
        this.a.setLayoutParams(this.t);
        this.u = new LayoutParams(-2, -2, 1.0f);
        this.u.gravity = 16;
        this.i.setLayoutParams(this.u);
    }

    public void setLogo(int i) {
        this.e.setVisibility(0);
        this.e.setBackgroundResource(i);
    }

    public void setLogo(Drawable drawable) {
        this.e.setVisibility(0);
        this.e.setBackgroundDrawable(drawable);
    }

    public void setLogo2(int i) {
        this.f.setVisibility(0);
        this.f.setBackgroundResource(i);
    }

    public void setLogo2(Drawable drawable) {
        this.f.setVisibility(0);
        this.f.setBackgroundDrawable(drawable);
    }

    public void setLogo2OnClickListener(OnClickListener onClickListener) {
        this.f.setOnClickListener(onClickListener);
    }

    public void setLogo3(int i) {
        this.g.setVisibility(0);
        this.g.setBackgroundResource(i);
    }

    public void setLogo3(Drawable drawable) {
        this.g.setVisibility(0);
        this.g.setBackgroundDrawable(drawable);
    }

    public void setLogo3OnClickListener(OnClickListener onClickListener) {
        this.g.setOnClickListener(onClickListener);
    }

    public void setLogoLine(int i) {
        this.h.setVisibility(0);
        this.h.setBackgroundResource(i);
    }

    public void setLogoLine(Drawable drawable) {
        this.h.setVisibility(0);
        this.h.setBackgroundDrawable(drawable);
    }

    public void setLogoOnClickListener(OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
    }

    public void setTitleBarBackground(int i) {
        setBackgroundResource(i);
    }

    public void setTitleBarBackgroundColor(int i) {
        this.l = i;
        setBackgroundColor(i);
        ((BaseFimiActivity) this.s).setStatusBarTintResource(i);
    }

    public void setTitleBarBackgroundDrawable(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setTitleBarLeftBackground(int i) {
        Drawable drawable = getResources().getDrawable(i);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.c.setCompoundDrawables(drawable, null, null, null);
    }

    public void setTitleColor(int i) {
        this.c.setTextColor(i);
    }

    public void setTitleSmallText(int i) {
        this.d.setLayoutParams(new LayoutParams(-2, -2));
        this.d.setText(i);
    }

    public void setTitleSmallText(String str) {
        if (n.b(str)) {
            this.d.setLayoutParams(new LayoutParams(-2, 0));
            this.d.setText("");
            return;
        }
        this.d.setLayoutParams(new LayoutParams(-2, -2));
        this.d.setText(str);
    }

    public void setTitleText(int i) {
        this.c.setText(i);
    }

    public void setTitleText(String str) {
        this.c.setText(str);
    }

    public void setTitleTextBackgroundDrawable(Drawable drawable) {
        this.c.setBackgroundDrawable(drawable);
    }

    public void setTitleTextBackgroundResource(int i) {
        this.c.setBackgroundResource(i);
    }

    public void setTitleTextBold(boolean z) {
        TextPaint paint = this.c.getPaint();
        if (z) {
            paint.setFakeBoldText(true);
        } else {
            paint.setFakeBoldText(false);
        }
    }

    public void setTitleTextDropDown(final View view) {
        if (view != null) {
            setTitleTextOnClickListener(new OnClickListener(this) {
                final /* synthetic */ FmTitleBar b;

                public void onClick(View view) {
                    this.b.a(this.b.c, view, true);
                }
            });
        }
    }

    public void setTitleTextOnClickListener(OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }

    public void setTitleTextSize(int i) {
        this.c.setTextSize((float) i);
    }
}
