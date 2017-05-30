package com.fimi.soul.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class w {
    private Context a;

    public w(Context context) {
        this.a = context;
    }

    public Toast a(int i) {
        View inflate = LayoutInflater.from(this.a).inflate(i, null);
        Toast toast = new Toast(this.a);
        toast.setGravity(53, 12, 40);
        toast.setDuration(1);
        toast.setView(inflate);
        return toast;
    }

    public Toast a(String str) {
        return Toast.makeText(this.a, str, 0);
    }

    public Toast a(String str, Drawable drawable) {
        Toast makeText = Toast.makeText(this.a, str, 1);
        makeText.setGravity(17, 0, 0);
        LinearLayout linearLayout = (LinearLayout) makeText.getView();
        View imageView = new ImageView(this.a);
        imageView.setBackgroundDrawable(drawable);
        linearLayout.addView(imageView, 0);
        return makeText;
    }
}
