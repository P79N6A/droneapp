package com.google.android.gms.plus;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class d extends FrameLayout {
    public static final String a = "PlusOneDummyView";

    private interface d {
        Drawable a(int i);

        boolean a();
    }

    private static class a implements d {
        private Context a;

        private a(Context context) {
            this.a = context;
        }

        public Drawable a(int i) {
            return this.a.getResources().getDrawable(17301508);
        }

        public boolean a() {
            return true;
        }
    }

    private static class b implements d {
        private Context a;

        private b(Context context) {
            this.a = context;
        }

        public Drawable a(int i) {
            try {
                String str;
                Resources resources = this.a.createPackageContext("com.google.android.gms", 4).getResources();
                String str2 = "com.google.android.gms";
                switch (i) {
                    case 0:
                        str = "ic_plusone_small";
                        break;
                    case 1:
                        str = "ic_plusone_medium";
                        break;
                    case 2:
                        str = "ic_plusone_tall";
                        break;
                    default:
                        str = "ic_plusone_standard";
                        break;
                }
                return resources.getDrawable(resources.getIdentifier(str, "drawable", str2));
            } catch (NameNotFoundException e) {
                return null;
            }
        }

        public boolean a() {
            try {
                this.a.createPackageContext("com.google.android.gms", 4).getResources();
                return true;
            } catch (NameNotFoundException e) {
                return false;
            }
        }
    }

    private static class c implements d {
        private Context a;

        private c(Context context) {
            this.a = context;
        }

        public Drawable a(int i) {
            String str;
            switch (i) {
                case 0:
                    str = "ic_plusone_small_off_client";
                    break;
                case 1:
                    str = "ic_plusone_medium_off_client";
                    break;
                case 2:
                    str = "ic_plusone_tall_off_client";
                    break;
                default:
                    str = "ic_plusone_standard_off_client";
                    break;
            }
            return this.a.getResources().getDrawable(this.a.getResources().getIdentifier(str, "drawable", this.a.getPackageName()));
        }

        public boolean a() {
            return (this.a.getResources().getIdentifier("ic_plusone_small_off_client", "drawable", this.a.getPackageName()) == 0 || this.a.getResources().getIdentifier("ic_plusone_medium_off_client", "drawable", this.a.getPackageName()) == 0 || this.a.getResources().getIdentifier("ic_plusone_tall_off_client", "drawable", this.a.getPackageName()) == 0 || this.a.getResources().getIdentifier("ic_plusone_standard_off_client", "drawable", this.a.getPackageName()) == 0) ? false : true;
        }
    }

    public d(Context context, int i) {
        super(context);
        View button = new Button(context);
        button.setEnabled(false);
        button.setBackgroundDrawable(a().a(i));
        Point a = a(i);
        addView(button, new LayoutParams(a.x, a.y, 17));
    }

    private Point a(int i) {
        int i2 = 24;
        int i3 = 20;
        Point point = new Point();
        switch (i) {
            case 0:
                i3 = 14;
                break;
            case 1:
                i2 = 32;
                break;
            case 2:
                i2 = 50;
                break;
            default:
                i2 = 38;
                i3 = 24;
                break;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float applyDimension = TypedValue.applyDimension(1, (float) i2, displayMetrics);
        float applyDimension2 = TypedValue.applyDimension(1, (float) i3, displayMetrics);
        point.x = (int) (((double) applyDimension) + 0.5d);
        point.y = (int) (((double) applyDimension2) + 0.5d);
        return point;
    }

    private d a() {
        d bVar = new b(getContext());
        if (!bVar.a()) {
            bVar = new c(getContext());
        }
        return !bVar.a() ? new a(getContext()) : bVar;
    }
}
