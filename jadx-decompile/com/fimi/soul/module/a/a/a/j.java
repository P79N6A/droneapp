package com.fimi.soul.module.a.a.a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import cn.sharesdk.framework.Platform;
import com.fimi.soul.module.a.a;
import com.mob.tools.gui.ViewPagerAdapter;
import com.mob.tools.utils.R;
import java.util.ArrayList;

public abstract class j extends ViewPagerAdapter implements OnClickListener {
    protected static final int a = 1000;
    public static final int b = 52;
    protected Object[][] c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected int h;
    protected int i;
    protected int j;
    private i k;
    private f l;
    private long m;

    public j(i iVar, ArrayList<Object> arrayList) {
        this.k = iVar;
        if (arrayList != null && !arrayList.isEmpty()) {
            a(iVar.getContext(), (ArrayList) arrayList);
            a((ArrayList) arrayList);
        }
    }

    private View a(Context context) {
        int i;
        int i2 = 0;
        View linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(-855310);
        int i3 = this.e / this.f;
        Object obj = new LinearLayout[(this.g * i3)];
        linearLayout.setTag(obj);
        int bitmapRes = R.getBitmapRes(context, "ssdk_oks_classic_platform_cell_back");
        for (int i4 = 0; i4 < i3; i4++) {
            View linearLayout2 = new LinearLayout(context);
            linearLayout.addView(linearLayout2, new LayoutParams(-1, this.f));
            for (i = 0; i < this.g; i++) {
                obj[(this.g * i4) + i] = new LinearLayout(context);
                obj[(this.g * i4) + i].setBackgroundResource(bitmapRes);
                obj[(this.g * i4) + i].setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LayoutParams(-1, this.f);
                layoutParams.weight = 1.0f;
                linearLayout2.addView(obj[(this.g * i4) + i], layoutParams);
                if (i < this.g - 1) {
                    linearLayout2.addView(new View(context), new LayoutParams(this.h, -1));
                }
            }
            linearLayout.addView(new View(context), new LayoutParams(-1, this.h));
        }
        i = obj.length;
        while (i2 < i) {
            LinearLayout linearLayout3 = obj[i2];
            View imageView = new ImageView(context);
            imageView.setScaleType(ScaleType.CENTER_INSIDE);
            ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-1, this.j);
            layoutParams2.topMargin = this.i;
            linearLayout3.addView(imageView, layoutParams2);
            imageView = new TextView(context);
            imageView.setTextColor(-10197916);
            imageView.setTextSize(2, 14.0f);
            imageView.setGravity(17);
            layoutParams2 = new LayoutParams(-1, -2);
            layoutParams2.weight = 1.0f;
            linearLayout3.addView(imageView, layoutParams2);
            i2++;
        }
        return linearLayout;
    }

    private void a(LinearLayout[] linearLayoutArr, Object[] objArr) {
        int bitmapRes = R.getBitmapRes(this.k.getContext(), "ssdk_oks_classic_platform_cell_back");
        int bitmapRes2 = R.getBitmapRes(this.k.getContext(), "ssdk_oks_classic_platfrom_cell_back_nor");
        for (int i = 0; i < objArr.length; i++) {
            ImageView imageView = (ImageView) R.forceCast(linearLayoutArr[i].getChildAt(0));
            TextView textView = (TextView) R.forceCast(linearLayoutArr[i].getChildAt(1));
            if (objArr[i] == null) {
                imageView.setVisibility(4);
                textView.setVisibility(4);
                linearLayoutArr[i].setBackgroundResource(bitmapRes2);
                linearLayoutArr[i].setOnClickListener(null);
            } else {
                imageView.setVisibility(0);
                textView.setVisibility(0);
                linearLayoutArr[i].setBackgroundResource(bitmapRes);
                linearLayoutArr[i].setOnClickListener(this);
                linearLayoutArr[i].setTag(objArr[i]);
                if (objArr[i] instanceof a) {
                    a aVar = (a) R.forceCast(objArr[i]);
                    if (aVar.b != null) {
                        imageView.setImageBitmap(aVar.b);
                    } else {
                        imageView.setImageBitmap(null);
                    }
                    if (aVar.a != null) {
                        textView.setText(aVar.a);
                    } else {
                        textView.setText("");
                    }
                } else {
                    String toLowerCase = ((Platform) R.forceCast(objArr[i])).getName().toLowerCase();
                    int bitmapRes3 = R.getBitmapRes(imageView.getContext(), "ssdk_oks_classic_" + toLowerCase);
                    if (bitmapRes3 > 0) {
                        imageView.setImageResource(bitmapRes3);
                    } else {
                        imageView.setImageBitmap(null);
                    }
                    int stringRes = R.getStringRes(textView.getContext(), "ssdk_" + toLowerCase);
                    if (stringRes > 0) {
                        textView.setText(stringRes);
                    } else {
                        textView.setText("");
                    }
                }
            }
        }
    }

    public int a() {
        return this.d;
    }

    protected abstract void a(Context context, ArrayList<Object> arrayList);

    public void a(f fVar) {
        this.l = fVar;
    }

    protected abstract void a(ArrayList<Object> arrayList);

    public int b() {
        return this.e;
    }

    public int getCount() {
        return this.c == null ? 0 : this.c.length;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = a(viewGroup.getContext());
        }
        a((LinearLayout[]) R.forceCast(((LinearLayout) R.forceCast(view)).getTag()), this.c[i]);
        return view;
    }

    public void onClick(View view) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.m >= 1000) {
            this.m = currentTimeMillis;
            if (view.getTag() instanceof a) {
                this.k.a(view, (a) R.forceCast(view.getTag()));
                return;
            }
            this.k.d((Platform) R.forceCast(view.getTag()));
        }
    }

    public void onScreenChange(int i, int i2) {
        if (this.l != null) {
            this.l.setScreenCount(getCount());
            this.l.a(i, i2);
        }
    }
}
