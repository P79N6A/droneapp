package com.fimi.soul.biz.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.g;
import com.google.android.gms.maps.model.a;
import com.google.android.gms.maps.model.b;
import java.util.ArrayList;

public class j {
    private static a a;

    public static Bitmap a(View view, Context context) {
        if (view == null) {
            return null;
        }
        view.measure(MeasureSpec.makeMeasureSpec(g.a(context, 28.0f), 1073741824), MeasureSpec.makeMeasureSpec(g.a(context, 48.0f), 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public static a a(int i) {
        a = b.a(i);
        return a;
    }

    public static a a(Context context, int i, int i2, boolean z) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.action_markericon, null);
        TextView textView = (TextView) inflate.findViewById(R.id.point_heightValue);
        textView.setText(i2 + "m");
        if (z) {
            textView.setTextColor(context.getResources().getColor(R.color.onmarker_color));
        } else {
            textView.setTextColor(context.getResources().getColor(R.color.mystyle_markerinfo));
        }
        ao.b(context.getAssets(), textView);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.markerIcon);
        if (i != 0) {
            imageView.setBackgroundResource(i);
        }
        return b.a(a(inflate, context));
    }

    public static ArrayList<a> a(Context context, int i, boolean z, int i2, int i3) {
        ArrayList<a> arrayList = new ArrayList();
        arrayList.add(b(context, i2, i, z));
        arrayList.add(b(context, i3, i, z));
        return arrayList;
    }

    public static a b(Context context, int i, int i2, boolean z) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.action_markericon_animation, null);
        TextView textView = (TextView) inflate.findViewById(R.id.point_heightValue);
        textView.setText(i2 + "m");
        if (z) {
            textView.setTextColor(context.getResources().getColor(R.color.onmarker_color));
        } else {
            textView.setTextColor(context.getResources().getColor(R.color.mystyle_markerinfo));
        }
        ao.b(context.getAssets(), textView);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.markerIcon);
        if (i != 0) {
            imageView.setBackgroundResource(i);
        }
        return b.a(a(inflate, context));
    }
}
