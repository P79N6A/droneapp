package com.fimi.soul.view;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;

public class j extends PopupWindow {
    public j(Context context) {
        super(context);
    }

    public j(View view) {
        super(view);
    }

    public j(View view, int i, int i2) {
        super(view, i, i2, true);
    }

    public void a(View view) {
        int[] iArr = new int[2];
        r1 = new int[2];
        view.getLocationOnScreen(iArr);
        r1[0] = iArr[0];
        r1[1] = iArr[1];
        super.showAtLocation(view, 51, r1[0], r1[1] - (getHeight() / 2));
    }
}
