package com.fimi.kernel.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v4.view.ViewCompat;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import com.tencent.mm.sdk.platformtools.LocaleUtil;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import m.framework.ui.widget.asyncview.AsyncImageView;

public class s {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 2048;
    public static final int e = 2048;

    private static float a(int i, int i2, int i3, int i4) {
        float f = ((float) i3) / ((float) i);
        float f2 = ((float) i4) / ((float) i2);
        return f > f2 ? f : f2;
    }

    private static int a(double d) {
        int highestOneBit = Integer.highestOneBit((int) Math.floor(d));
        return highestOneBit == 0 ? 1 : highestOneBit;
    }

    private static int a(int i) {
        return (int) (((((double) ((i >> 8) & 255)) * 0.59d) + (0.3d * ((double) ((i >> 16) & 255)))) + (((double) (i & 255)) * 0.11d));
    }

    public static int a(Bitmap bitmap, CompressFormat compressFormat) {
        ByteArrayOutputStream byteArrayOutputStream;
        Exception e;
        Throwable th;
        int i = 0;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bitmap.compress(compressFormat, 100, byteArrayOutputStream);
                i = byteArrayOutputStream.toByteArray().length;
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (Exception e3) {
                e2 = e3;
                try {
                    e2.printStackTrace();
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception e22) {
                            e22.printStackTrace();
                        }
                    }
                    return i;
                } catch (Throwable th2) {
                    th = th2;
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception e222) {
                            e222.printStackTrace();
                        }
                    }
                    throw th;
                }
            }
        } catch (Exception e4) {
            e222 = e4;
            byteArrayOutputStream = null;
            e222.printStackTrace();
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            return i;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            throw th;
        }
        return i;
    }

    public static int a(String str, String str2) {
        int i = 0;
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != str2.charAt(i2)) {
                i++;
            }
        }
        return i;
    }

    public static Bitmap a(Context context, Bitmap bitmap, int i) {
        int width = bitmap.getWidth() > bitmap.getHeight() ? bitmap.getWidth() : bitmap.getHeight();
        return a(bitmap, (float) (width > i ? ((double) width) / ((double) i) : 1.0d));
    }

    public static Bitmap a(Context context, Uri uri, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        InputStream openInputStream = contentResolver.openInputStream(uri);
        Options options = new Options();
        options.inJustDecodeBounds = true;
        options.inDither = true;
        options.inPreferredConfig = Config.ARGB_8888;
        BitmapFactory.decodeStream(openInputStream, null, options);
        openInputStream.close();
        if (options.outWidth == -1 || options.outHeight == -1) {
            return null;
        }
        int i2 = options.outHeight > options.outWidth ? options.outHeight : options.outWidth;
        double d = i2 > i ? ((double) i2) / ((double) i) : 1.0d;
        Options options2 = new Options();
        options2.inSampleSize = a(d);
        options2.inDither = true;
        options2.inPreferredConfig = Config.ARGB_8888;
        openInputStream = contentResolver.openInputStream(uri);
        Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, options2);
        openInputStream.close();
        return a(decodeStream, i, i);
    }

    public static Bitmap a(Context context, String str, int i) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        options.inDither = true;
        options.inPreferredConfig = Config.ARGB_8888;
        BitmapFactory.decodeFile(str, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            return null;
        }
        int i2 = options.outHeight > options.outWidth ? options.outHeight : options.outWidth;
        double d = i2 > i ? ((double) i2) / ((double) i) : 1.0d;
        Options options2 = new Options();
        options2.inSampleSize = a(d);
        options2.inDither = true;
        options2.inPreferredConfig = Config.ARGB_8888;
        return a(BitmapFactory.decodeFile(str, options2), i, i);
    }

    public static Bitmap a(Bitmap bitmap, float f) {
        if (!h(bitmap)) {
            return null;
        }
        if (f == 1.0f) {
            return bitmap;
        }
        Bitmap createBitmap;
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Matrix matrix = new Matrix();
            matrix.postScale(f, f);
            createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
            if (createBitmap != bitmap) {
                bitmap.recycle();
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (bitmap != null) {
                bitmap.recycle();
                createBitmap = null;
            } else {
                createBitmap = null;
            }
        } catch (Throwable th) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        return createBitmap;
    }

    public static Bitmap a(Bitmap bitmap, int i, int i2) {
        if (!h(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] c = c(width, height, i, i2);
        int i3 = c[0];
        int i4 = c[1];
        Bitmap a = a(bitmap, b(width, height, i3, i4));
        return (a.getWidth() > i3 || a.getHeight() > i4) ? b(a, i3, i4) : a;
    }

    public static Bitmap a(Drawable drawable) {
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Config.ARGB_8888 : Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static Bitmap a(ImageView imageView) {
        Bitmap createBitmap;
        Exception e;
        try {
            createBitmap = Bitmap.createBitmap(imageView.getDrawingCache());
            try {
                imageView.setDrawingCacheEnabled(false);
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                return createBitmap;
            }
        } catch (Exception e3) {
            Exception exception = e3;
            createBitmap = null;
            e = exception;
            e.printStackTrace();
            return createBitmap;
        }
        return createBitmap;
    }

    public static Bitmap a(File file) {
        Bitmap bitmap = null;
        try {
            bitmap = BitmapFactory.decodeFile(file.getPath());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bitmap;
    }

    public static Bitmap a(File file, int i, int i2) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getPath(), options);
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        int[] c = c(i3, i4, i, i2);
        float a = a(i3, i4, c[0], c[1]);
        if (a != 0.0f) {
            i3 = (int) (((float) i3) * a);
            i4 = (int) (((float) i4) * a);
        }
        options.inPreferredConfig = Config.RGB_565;
        options.inPurgeable = true;
        options.inInputShareable = true;
        if (((double) a) < 0.25d) {
            options.inSampleSize = 2;
        } else if (((double) a) < 0.125d) {
            options.inSampleSize = 4;
        } else {
            options.inSampleSize = 1;
        }
        options.outWidth = i3;
        options.outHeight = i4;
        options.inJustDecodeBounds = false;
        options.inDither = false;
        return a(BitmapFactory.decodeFile(file.getPath(), options), a);
    }

    public static Bitmap a(String str, int i, int i2, int i3) {
        InputStream inputStream;
        Exception e;
        Throwable th;
        Bitmap bitmap = null;
        try {
            URLConnection openConnection = new URL(str).openConnection();
            openConnection.setDoInput(true);
            openConnection.connect();
            inputStream = openConnection.getInputStream();
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, null);
                bitmap = i == 0 ? b(decodeStream, i2, i3) : i == 1 ? a(decodeStream, i2, i3) : decodeStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (Exception e3) {
                e2 = e3;
                try {
                    k.a(s.class, "" + e2.getMessage());
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e22) {
                            e22.printStackTrace();
                        }
                    }
                    return bitmap;
                } catch (Throwable th2) {
                    th = th2;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e222) {
                            e222.printStackTrace();
                        }
                    }
                    throw th;
                }
            }
        } catch (Exception e4) {
            e222 = e4;
            inputStream = bitmap;
            k.a(s.class, "" + e222.getMessage());
            if (inputStream != null) {
                inputStream.close();
            }
            return bitmap;
        } catch (Throwable th3) {
            inputStream = bitmap;
            th = th3;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
        return bitmap;
    }

    public static Bitmap a(byte[] bArr) {
        Bitmap bitmap = null;
        try {
            if (bArr.length != 0) {
                bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bitmap;
    }

    public static Drawable a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Drawable bitmapDrawable;
        try {
            bitmapDrawable = new BitmapDrawable(bitmap);
        } catch (Exception e) {
            e.printStackTrace();
            bitmapDrawable = null;
        }
        return bitmapDrawable;
    }

    public static Drawable a(View view) {
        try {
            Bitmap b = b(view);
            if (b != null) {
                return new BitmapDrawable(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String a(Context context, String str) {
        long j = 0;
        File file = new File(str);
        if (file.isFile() && file.exists()) {
            try {
                j = (long) MediaPlayer.create(context, Uri.fromFile(file)).getDuration();
            } catch (Exception e) {
            }
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        simpleDateFormat.applyPattern("mm:ss");
        return simpleDateFormat.format(new Date(j));
    }

    public static void a(Bitmap[] bitmapArr) {
        if (bitmapArr != null) {
            try {
                for (Bitmap bitmap : bitmapArr) {
                    if (!(bitmap == null || bitmap.isRecycled())) {
                        k.a(s.class, "Bitmap释放" + bitmap.toString());
                        bitmap.recycle();
                    }
                }
            } catch (Exception e) {
            }
        }
    }

    public static void a(String[] strArr) {
    }

    private static boolean a(int i, int i2) {
        if (i > 0 && i2 > 0) {
            return true;
        }
        k.c(s.class, "请求Bitmap的宽高参数必须大于0");
        return false;
    }

    public static byte[] a(Bitmap bitmap, CompressFormat compressFormat, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] toByteArray;
        Exception e;
        Throwable th;
        Exception exception;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bitmap.compress(compressFormat, 100, byteArrayOutputStream);
                toByteArray = byteArrayOutputStream.toByteArray();
                if (z) {
                    try {
                        bitmap.recycle();
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            e.printStackTrace();
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Exception e3) {
                                    e3.printStackTrace();
                                }
                            }
                            return toByteArray;
                        } catch (Throwable th2) {
                            th = th2;
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Exception e32) {
                                    e32.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    }
                }
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception e322) {
                        e322.printStackTrace();
                    }
                }
            } catch (Exception e4) {
                exception = e4;
                toByteArray = null;
                e322 = exception;
                e322.printStackTrace();
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                return toByteArray;
            }
        } catch (Exception e42) {
            byteArrayOutputStream = null;
            exception = e42;
            toByteArray = null;
            e322 = exception;
            e322.printStackTrace();
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            return toByteArray;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            throw th;
        }
        return toByteArray;
    }

    public static byte[] a(View view, CompressFormat compressFormat) {
        byte[] bArr = null;
        try {
            bArr = a(b(view), compressFormat, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bArr;
    }

    private static float b(int i, int i2, int i3, int i4) {
        float f = ((float) i3) / ((float) i);
        float f2 = ((float) i4) / ((float) i2);
        return f > f2 ? f2 : f;
    }

    public static Bitmap b(Bitmap bitmap, float f) {
        try {
            Matrix matrix = new Matrix();
            matrix.setRotate(f % 360.0f);
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Bitmap b(Bitmap bitmap, int i, int i2) {
        int i3 = 0;
        Bitmap bitmap2 = null;
        if (h(bitmap) && a(i, i2)) {
            try {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                if (width > i) {
                    width = (width - i) / 2;
                } else {
                    i = width;
                    width = 0;
                }
                if (height > i2) {
                    i3 = (height - i2) / 2;
                } else {
                    i2 = height;
                }
                bitmap2 = Bitmap.createBitmap(bitmap, width, i3, i, i2);
                if (bitmap2 != bitmap) {
                    bitmap.recycle();
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (bitmap != null) {
                    bitmap.recycle();
                }
            } catch (Throwable th) {
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
        }
        return bitmap2;
    }

    public static Bitmap b(View view) {
        Bitmap bitmap = null;
        if (view != null) {
            try {
                view.setDrawingCacheEnabled(true);
                view.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0));
                view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                view.buildDrawingCache();
                bitmap = view.getDrawingCache();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return bitmap;
    }

    public static Bitmap b(File file, int i, int i2) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getPath(), options);
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        int[] c = c(i3, i4, i, i2);
        int i5 = c[0];
        int i6 = c[1];
        float a = a(i3, i4, i5, i6);
        if (a != 1.0f) {
            i3 = (int) (((float) i3) * a);
            i4 = (int) (((float) i4) * a);
        }
        options.inPreferredConfig = Config.RGB_565;
        options.inPurgeable = true;
        options.inInputShareable = true;
        if (((double) a) < 0.25d) {
            options.inSampleSize = 2;
        } else if (((double) a) < 0.125d) {
            options.inSampleSize = 4;
        } else {
            options.inSampleSize = 1;
        }
        options.outHeight = i4;
        options.outWidth = i3;
        options.inJustDecodeBounds = false;
        options.inDither = false;
        Bitmap decodeFile = BitmapFactory.decodeFile(file.getPath(), options);
        return decodeFile != null ? b(decodeFile, i5, i6) : null;
    }

    public static TransitionDrawable b(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        TransitionDrawable transitionDrawable;
        try {
            transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(AsyncImageView.a), new BitmapDrawable(bitmap)});
        } catch (Exception e) {
            e.printStackTrace();
            transitionDrawable = null;
        }
        return transitionDrawable;
    }

    public static TransitionDrawable b(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        TransitionDrawable transitionDrawable;
        try {
            transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(AsyncImageView.a), drawable});
        } catch (Exception e) {
            e.printStackTrace();
            transitionDrawable = null;
        }
        return transitionDrawable;
    }

    public static float[] b(File file) {
        float[] fArr = new float[2];
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getPath(), options);
        fArr[0] = (float) options.outWidth;
        fArr[1] = (float) options.outHeight;
        return fArr;
    }

    public static Bitmap c(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= height) {
            f = (float) width;
            f2 = (float) width;
            f3 = (float) width;
            f4 = (float) width;
            f5 = (float) (width / 2);
            height = width;
            f6 = 0.0f;
        } else {
            f5 = (float) (height / 2);
            f6 = (float) ((width - height) / 2);
            f2 = ((float) width) - f6;
            f = (float) height;
            f3 = (float) height;
            f4 = (float) height;
            width = height;
        }
        Bitmap createBitmap = Bitmap.createBitmap(height, width, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect((int) f6, (int) null, (int) f2, (int) f);
        Rect rect2 = new Rect((int) null, (int) null, (int) f3, (int) f4);
        RectF rectF = new RectF(rect2);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, f5, f5, paint);
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect2, paint);
        return createBitmap;
    }

    public static Bitmap c(Bitmap bitmap, float f) {
        try {
            int width;
            int height;
            Matrix matrix = new Matrix();
            if ((f / 90.0f) % 2.0f != 0.0f) {
                width = bitmap.getWidth();
                height = bitmap.getHeight();
            } else {
                width = bitmap.getHeight();
                height = bitmap.getWidth();
            }
            width /= 2;
            height /= 2;
            matrix.preTranslate((float) (-width), (float) (-height));
            matrix.postRotate(f);
            matrix.postTranslate((float) width, (float) height);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static int[] c(int i, int i2, int i3, int i4) {
        int i5 = 2048;
        int[] iArr = new int[2];
        int i6 = i3 <= 0 ? i : i3;
        int i7 = i4 <= 0 ? i2 : i4;
        if (i6 > 2048) {
            i7 = (int) (((float) i7) * (((float) 2048) / ((float) i)));
            i6 = 2048;
        }
        if (i7 > 2048) {
            i7 = (int) ((((float) 2048) / ((float) i2)) * ((float) i6));
        } else {
            i5 = i7;
            i7 = i6;
        }
        iArr[0] = i7;
        iArr[1] = i5;
        return iArr;
    }

    public static Bitmap d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Matrix matrix = new Matrix();
            matrix.preScale(1.0f, -1.0f);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, height / 2, width, height / 2, matrix, false);
            Bitmap createBitmap2 = Bitmap.createBitmap(width, (height / 2) + height, Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap2);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, null);
            canvas.drawRect(0.0f, (float) height, (float) width, (float) (height + 1), new Paint());
            canvas.drawBitmap(createBitmap, 0.0f, (float) (height + 1), null);
            Paint paint = new Paint();
            paint.setShader(new LinearGradient(0.0f, (float) bitmap.getHeight(), 0.0f, (float) (createBitmap2.getHeight() + 1), 1895825407, ViewCompat.MEASURED_SIZE_MASK, TileMode.CLAMP));
            paint.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
            canvas.drawRect(0.0f, (float) height, (float) width, (float) (createBitmap2.getHeight() + 1), paint);
            return createBitmap2;
        } catch (Exception e) {
            e.printStackTrace();
            return bitmap;
        }
    }

    public static void e(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    k.a(s.class, "Bitmap释放" + bitmap.toString());
                    bitmap.recycle();
                }
            } catch (Exception e) {
            }
        }
    }

    public static String f(Bitmap bitmap) {
        int i;
        int i2;
        int i3 = 0;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 8, 8, false);
        int width = createScaledBitmap.getWidth();
        int height = createScaledBitmap.getHeight();
        Log.i(LocaleUtil.THAI, "将图片缩小到8x8的尺寸:" + width + "*" + height);
        int[] iArr = new int[(width * height)];
        for (i = 0; i < width; i++) {
            for (i2 = 0; i2 < height; i2++) {
                iArr[(i * height) + i2] = a(createScaledBitmap.getPixel(i, i2));
            }
        }
        e(createScaledBitmap);
        i = l.b(iArr);
        int[] iArr2 = new int[(width * height)];
        for (i2 = 0; i2 < iArr2.length; i2++) {
            if (iArr[i2] >= i) {
                iArr2[i2] = 1;
            } else {
                iArr2[i2] = 0;
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (i3 < iArr2.length) {
            stringBuffer.append(l.a((((iArr2[i3] * ((int) Math.pow(2.0d, 3.0d))) + (iArr2[i3 + 1] * ((int) Math.pow(2.0d, 2.0d)))) + (iArr2[i3 + 2] * ((int) Math.pow(2.0d, 1.0d)))) + iArr2[i3 + 2]));
            i3 += 4;
        }
        return stringBuffer.toString();
    }

    public static int[] g(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[64];
        for (int i = 0; i < width; i++) {
            for (int i2 = 0; i2 < height; i2++) {
                int pixel = bitmap.getPixel(i, i2);
                int i3 = (pixel >> 24) & 255;
                i3 = (pixel >> 16) & 255;
                int i4 = (pixel >> 8) & 255;
                pixel &= 255;
                int i5 = i3 >= 192 ? 3 : i3 >= 128 ? 2 : i3 >= 64 ? 1 : i3 >= 0 ? 0 : 0;
                i3 = i4 >= 192 ? 3 : i4 >= 128 ? 2 : i4 >= 64 ? 1 : i4 >= 0 ? 0 : 0;
                pixel = pixel >= 192 ? 3 : pixel >= 128 ? 2 : pixel >= 64 ? 1 : pixel >= 0 ? 0 : 0;
                pixel += (i3 * 4) + (i5 * 16);
                iArr[pixel] = iArr[pixel] + 1;
            }
        }
        return iArr;
    }

    private static boolean h(Bitmap bitmap) {
        if (bitmap == null) {
            k.c(s.class, "原图Bitmap为空了");
            return false;
        } else if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
            return true;
        } else {
            k.c(s.class, "原图Bitmap大小为0");
            return false;
        }
    }
}
