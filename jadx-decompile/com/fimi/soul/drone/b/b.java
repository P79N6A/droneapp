package com.fimi.soul.drone.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v4.view.ViewCompat;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.utils.ao;

public class b {
    private static final int a = 6;

    public static Bitmap a(int i, String str, Context context) {
        return a(context, (int) R.drawable.ic_wp_map, i, str);
    }

    public static Bitmap a(int i, String str, String str2, Context context) {
        return a(context, i, str, str2);
    }

    private static Bitmap a(Context context, int i, int i2, String str) {
        Resources resources = context.getResources();
        float f = resources.getDisplayMetrics().density;
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, i);
        Config config = decodeResource.getConfig();
        if (config == null) {
            config = Config.ARGB_8888;
        }
        Bitmap copy = decodeResource.copy(config, true);
        Paint paint = new Paint();
        paint.setColorFilter(new LightingColorFilter(0, i2));
        Canvas canvas = new Canvas(copy);
        canvas.drawBitmap(copy, 0.0f, 0.0f, paint);
        paint = new Paint(1);
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint.setTextSize((float) ((int) (f * 15.0f)));
        paint.setShadowLayer(1.0f, 0.0f, 1.0f, -1);
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(str, (float) ((copy.getWidth() - rect.width()) / 2), (float) (((rect.height() + copy.getHeight()) * 5) / 12), paint);
        return copy;
    }

    private static Bitmap a(Context context, int i, String str, String str2) {
        Rect rect;
        Resources resources = context.getResources();
        float f = resources.getDisplayMetrics().density;
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, i);
        Config config = decodeResource.getConfig();
        if (config == null) {
            config = Config.ARGB_8888;
        }
        decodeResource = decodeResource.copy(config, true);
        Paint paint = new Paint();
        Canvas canvas = new Canvas(decodeResource);
        canvas.drawBitmap(decodeResource, 0.0f, 0.0f, paint);
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setTextSize((float) ((int) (11.0f * f)));
        paint2.setFakeBoldText(true);
        paint2.setShadowLayer(1.0f, 0.0f, 1.0f, ViewCompat.MEASURED_STATE_MASK);
        Rect rect2 = new Rect();
        paint2.getTextBounds(str, 0, str.length(), rect2);
        rect2.offsetTo(-6, rect2.height() / 2);
        if (str2 != null) {
            rect = new Rect();
            rect.offsetTo(0, rect2.bottom);
        } else {
            rect = new Rect(0, 0, 0, 0);
        }
        Rect rect3 = new Rect(rect2);
        rect3.union(rect);
        rect3.offsetTo((decodeResource.getWidth() - rect3.width()) / 2, (rect2.top + ((decodeResource.getHeight() - rect3.height()) / 2)) - rect2.height());
        rect3.set(rect3.left - 6, rect3.top - 6, rect3.right + 6, rect3.bottom + 6);
        canvas.drawText(str, (float) ((decodeResource.getWidth() - rect2.width()) / 2), (float) ((((decodeResource.getHeight() - (rect.height() + rect2.height())) / 2) + rect2.top) + 5), paint2);
        return decodeResource;
    }

    public static Bitmap b(int i, String str, String str2, Context context) {
        return b(context, i, str, str2);
    }

    private static Bitmap b(Context context, int i, String str, String str2) {
        Rect rect;
        Resources resources = context.getResources();
        float f = resources.getDisplayMetrics().density;
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, i);
        Config config = decodeResource.getConfig();
        if (config == null) {
            config = Config.ARGB_8888;
        }
        decodeResource = decodeResource.copy(config, true);
        Paint paint = new Paint();
        Canvas canvas = new Canvas(decodeResource);
        canvas.drawBitmap(decodeResource, 0.0f, 0.0f, paint);
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setAlpha(204);
        paint2.setAntiAlias(true);
        paint2.setTextSize((float) ((int) (((double) f) * 11.2d)));
        TextView textView = new TextView(context);
        textView.setText(str);
        ao.a(context.getAssets(), textView);
        Rect rect2 = new Rect();
        paint2.getTextBounds(textView.getText().toString(), 0, str.length(), rect2);
        rect2.offsetTo(-6, rect2.height() / 2);
        if (str2 != null) {
            rect = new Rect();
            rect.offsetTo(0, rect2.bottom);
        } else {
            rect = new Rect(0, 0, 0, 0);
        }
        Rect rect3 = new Rect(rect2);
        rect3.union(rect);
        rect3.offsetTo((decodeResource.getWidth() - rect3.width()) / 2, (rect2.top + ((decodeResource.getHeight() - rect3.height()) / 2)) - rect2.height());
        rect3.set(rect3.left - 6, rect3.top - 6, rect3.right + 6, rect3.bottom + 6);
        canvas.drawText(str, (float) ((decodeResource.getWidth() - rect2.width()) / 2), (float) (((((decodeResource.getHeight() - (rect.height() + rect2.height())) / 2) + rect2.top) / 2) + 5), paint2);
        return decodeResource;
    }
}
