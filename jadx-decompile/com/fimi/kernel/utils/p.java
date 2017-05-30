package com.fimi.kernel.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.fimi.kernel.a;

public class p {
    public static final int a = Integer.MIN_VALUE;

    public static float a(int i, float f, DisplayMetrics displayMetrics) {
        switch (i) {
            case 0:
                return f;
            case 1:
                return f * displayMetrics.density;
            case 2:
                return f * displayMetrics.scaledDensity;
            case 3:
                return (displayMetrics.xdpi * f) * 0.013888889f;
            case 4:
                return f * displayMetrics.xdpi;
            case 5:
                return (displayMetrics.xdpi * f) * 0.03937008f;
            default:
                return 0.0f;
        }
    }

    public static float a(Context context, float f) {
        return a(1, f, c.d(context));
    }

    public static int a(int i, int i2, float f) {
        if (f == 0.0f) {
            return 0;
        }
        float f2 = 1.0f;
        try {
            f2 = Math.min(((float) i) / 720.0f, ((float) i2) / 1280.0f);
        } catch (Exception e) {
        }
        return Math.round((f2 * f) + 0.5f);
    }

    public static int a(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static void a(Context context, int i) {
        View findViewById = ((Activity) context).findViewById(i);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) findViewById;
        }
    }

    public static void a(Context context, Paint paint, float f) {
        paint.setTextSize((float) f(context, f));
    }

    public static void a(Context context, TextPaint textPaint, float f) {
        textPaint.setTextSize((float) f(context, f));
    }

    public static void a(View view) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i = layoutParams.height;
        view.measure(childMeasureSpec, i > 0 ? MeasureSpec.makeMeasureSpec(i, 1073741824) : MeasureSpec.makeMeasureSpec(0, 0));
    }

    public static void a(View view, int i) {
        View findViewById = view.findViewById(i);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) findViewById;
        }
    }

    public static void a(View view, int i, int i2) {
        int e = e(view.getContext(), (float) i);
        int e2 = e(view.getContext(), (float) i2);
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            if (i != Integer.MIN_VALUE) {
                layoutParams.width = e;
            }
            if (i2 != Integer.MIN_VALUE) {
                layoutParams.height = e2;
            }
            view.setLayoutParams(layoutParams);
        }
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        view.setPadding(e(view.getContext(), (float) i), e(view.getContext(), (float) i2), e(view.getContext(), (float) i3), e(view.getContext(), (float) i4));
    }

    public static void a(AbsListView absListView, int i, int i2) {
        int b = b(absListView, i, i2);
        LayoutParams layoutParams = absListView.getLayoutParams();
        layoutParams.height = b;
        ((MarginLayoutParams) layoutParams).setMargins(0, 0, 0, 0);
        absListView.setLayoutParams(layoutParams);
    }

    public static void a(TextView textView, float f) {
        textView.setTextSize((float) f(textView.getContext(), f));
    }

    public static float b(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return (float) displayMetrics.heightPixels;
    }

    public static float b(Context context, float f) {
        return f / c.d(context).density;
    }

    public static int b(View view) {
        a(view);
        return view.getMeasuredWidth();
    }

    public static int b(AbsListView absListView, int i, int i2) {
        int i3 = 0;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        absListView.measure(makeMeasureSpec, makeMeasureSpec2);
        ListAdapter listAdapter = (ListAdapter) absListView.getAdapter();
        if (listAdapter == null) {
            return 0;
        }
        int count = listAdapter.getCount();
        int i4;
        if (absListView instanceof ListView) {
            i4 = 0;
            while (i3 < count) {
                View view = listAdapter.getView(i3, null, absListView);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i4 += view.getMeasuredHeight();
                i3++;
            }
            if (count != 0) {
                i2 = i4 + (((ListView) absListView).getDividerHeight() * (count - 1));
            }
        } else if (absListView instanceof GridView) {
            i4 = count % i;
            if (i4 > 0) {
                i4 = 1;
            }
            if (listAdapter.getCount() != 0) {
                View view2 = listAdapter.getView(0, null, absListView);
                view2.measure(makeMeasureSpec, makeMeasureSpec2);
                i4 += count / i;
                i2 = (view2.getMeasuredHeight() * i4) + ((i4 - 1) * i2);
            }
        } else {
            i2 = 0;
        }
        return i2;
    }

    public static void b(View view, int i, int i2, int i3, int i4) {
        int e = e(view.getContext(), (float) i);
        int e2 = e(view.getContext(), (float) i2);
        int e3 = e(view.getContext(), (float) i3);
        int e4 = e(view.getContext(), (float) i4);
        if (view.getLayoutParams() instanceof MarginLayoutParams) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams != null) {
                if (i != Integer.MIN_VALUE) {
                    marginLayoutParams.leftMargin = e;
                }
                if (i3 != Integer.MIN_VALUE) {
                    marginLayoutParams.rightMargin = e3;
                }
                if (i2 != Integer.MIN_VALUE) {
                    marginLayoutParams.topMargin = e2;
                }
                if (i4 != Integer.MIN_VALUE) {
                    marginLayoutParams.bottomMargin = e4;
                }
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public static void b(TextView textView, float f) {
        textView.setTextSize(0, (float) f(textView.getContext(), f));
    }

    public static float c(Context context, float f) {
        return a(2, f, c.d(context));
    }

    public static int c(View view) {
        a(view);
        return view.getMeasuredHeight();
    }

    public static float d(Context context, float f) {
        return f / c.d(context).scaledDensity;
    }

    public static void d(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public static int e(Context context, float f) {
        DisplayMetrics d = c.d(context);
        if (d.scaledDensity > 2.0f) {
            if (d.widthPixels > a.e) {
                f *= 1.3f - (1.0f / d.scaledDensity);
            } else if (d.widthPixels < a.e) {
                f *= 1.0f - (1.0f / d.scaledDensity);
            }
        }
        return a(d.widthPixels, d.heightPixels, f);
    }

    @SuppressLint({"NewApi"})
    public static void e(View view) {
        int i = Integer.MIN_VALUE;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            b(textView, textView.getTextSize());
        }
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            int i2 = (layoutParams.width == -2 || layoutParams.width == -1) ? Integer.MIN_VALUE : layoutParams.width;
            if (!(layoutParams.height == -2 || layoutParams.height == -1)) {
                i = layoutParams.height;
            }
            a(view, i2, i);
            a(view, view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        }
        if (view.getLayoutParams() instanceof MarginLayoutParams) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams != null) {
                b(view, marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
        }
        if (VERSION.SDK_INT >= 16) {
            i2 = e(view.getContext(), (float) view.getMinimumWidth());
            i = e(view.getContext(), (float) view.getMinimumHeight());
            view.setMinimumWidth(i2);
            view.setMinimumHeight(i);
        }
    }

    public static int f(Context context, float f) {
        DisplayMetrics d = c.d(context);
        if (d.scaledDensity > 2.0f) {
        }
        return a(d.widthPixels, d.heightPixels, f);
    }
}
