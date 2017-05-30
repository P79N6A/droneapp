package com.fimi.soul.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.graphics.Rect;
import com.fimi.overseas.soul.R;
import java.io.InputStream;

public class v {
    public static Bitmap a(Context context, int i, int i2, int i3) {
        Options options = new Options();
        options.inPreferredConfig = Config.RGB_565;
        options.inPurgeable = true;
        options.inInputShareable = true;
        InputStream openRawResource = context.getResources().openRawResource(i);
        Rect rect = new Rect();
        rect.left = 20;
        rect.top = 30;
        rect.right = 10;
        return BitmapFactory.decodeStream(openRawResource, rect, options);
    }

    public static Bitmap a(Bitmap bitmap, float f, float f2) {
        Matrix matrix = new Matrix();
        matrix.postScale(f, f2);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap a(Bitmap bitmap, int i) {
        if (i == 0 || bitmap == null) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate((float) i, (float) (bitmap.getWidth() / 2), (float) (bitmap.getHeight() / 2));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (bitmap != null) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static boolean a(String str, Context context) {
        return ao.a(str, context.getResources().getStringArray(R.array.fileEndingImage)) || ao.a(str, context.getResources().getStringArray(R.array.fileEndingAudio)) || ao.a(str, context.getResources().getStringArray(R.array.fileEndingVideo));
    }

    public static boolean b(String str, Context context) {
        return ao.a(str, context.getResources().getStringArray(R.array.fileEndingImage));
    }

    public static boolean c(String str, Context context) {
        return ao.a(str, context.getResources().getStringArray(R.array.fileEndingVideo));
    }

    public static boolean d(String str, Context context) {
        return ao.a(str, context.getResources().getStringArray(R.array.fileEndingAudio));
    }
}
