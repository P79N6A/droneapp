package com.fimi.soul.utils;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.media.ExifInterface;
import android.media.ThumbnailUtils;
import android.support.v4.view.ViewCompat;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;

public class e {
    public static int a(Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        if (i3 <= i2 && i4 <= i) {
            return 1;
        }
        int round = Math.round(((float) i3) / ((float) i2));
        i3 = Math.round(((float) i4) / ((float) i));
        return round < i3 ? round : i3;
    }

    public static Bitmap a(int i, Bitmap... bitmapArr) {
        if (i <= 0 || bitmapArr == null || bitmapArr.length == 0) {
            throw new IllegalArgumentException("Wrong parameters: columns must > 0 and bitmaps.length must > 0.");
        }
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        for (Bitmap bitmap : bitmapArr) {
            Bitmap bitmap2;
            if (i5 <= bitmap2.getWidth()) {
                i5 = bitmap2.getWidth();
            }
            if (i4 <= bitmap2.getHeight()) {
                i4 = bitmap2.getHeight();
            }
        }
        if (i >= bitmapArr.length) {
            i2 = 1;
            i = bitmapArr.length;
        } else {
            i2 = bitmapArr.length % i == 0 ? bitmapArr.length / i : (bitmapArr.length / i) + 1;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i * i5, i2 * i4, Config.RGB_565);
        int i6 = 0;
        while (i6 < i2) {
            bitmap2 = createBitmap;
            for (i3 = 0; i3 < i; i3++) {
                int i7 = (i6 * i) + i3;
                if (i7 >= bitmapArr.length) {
                    break;
                }
                bitmap2 = a(bitmap2, bitmapArr[i7], new PointF((float) (i3 * i5), (float) (i6 * i4)));
            }
            i6++;
            createBitmap = bitmap2;
        }
        return createBitmap;
    }

    public static Bitmap a(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.preScale(1.0f, -1.0f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, height / 2, width, height / 2, matrix, false);
        Bitmap createBitmap2 = Bitmap.createBitmap(width, (height / 2) + height, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, null);
        float f = 0.0f;
        canvas.drawRect(f, (float) height, (float) width, (float) (height + 4), new Paint());
        canvas.drawBitmap(createBitmap, 0.0f, (float) (height + 4), null);
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(0.0f, (float) bitmap.getHeight(), 0.0f, (float) (createBitmap2.getHeight() + 4), 1895825407, ViewCompat.MEASURED_SIZE_MASK, TileMode.CLAMP));
        paint.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
        canvas.drawRect(0.0f, (float) height, (float) width, (float) (createBitmap2.getHeight() + 4), paint);
        return createBitmap2;
    }

    public static Bitmap a(Bitmap bitmap, float f) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, width, height);
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    public static Bitmap a(Bitmap bitmap, Bitmap bitmap2, PointF pointF) {
        if (bitmap == null || bitmap2 == null || pointF == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_4444);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, null);
        canvas.drawBitmap(bitmap2, pointF.x, pointF.y, null);
        canvas.save(31);
        canvas.restore();
        return createBitmap;
    }

    public static Bitmap a(String str) {
        Bitmap bitmap = null;
        try {
            byte[] decode = Base64.decode(str, 0);
            bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bitmap;
    }

    public static Bitmap a(String str, int i, int i2) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int ceil = (int) Math.ceil((double) (((float) options.outWidth) / ((float) i)));
        int ceil2 = (int) Math.ceil((double) (((float) options.outHeight) / ((float) i2)));
        if (ceil > 1 && ceil2 > 1) {
            if (ceil > ceil2) {
                options.inSampleSize = ceil;
            } else {
                options.inSampleSize = ceil2;
            }
        }
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public static Bitmap a(byte[] bArr) {
        return bArr.length != 0 ? BitmapFactory.decodeByteArray(bArr, 0, bArr.length) : null;
    }

    public static String a(Bitmap bitmap, int i) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(CompressFormat.PNG, i, byteArrayOutputStream);
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }

    public static String a(String str, int i, int i2, int i3) {
        try {
            Bitmap a = a(str, i, i2);
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            a.compress(CompressFormat.PNG, i3, byteArrayOutputStream);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean a(Bitmap bitmap, File file) {
        OutputStream fileOutputStream;
        Exception e;
        Throwable th;
        boolean z = false;
        byte[] b = b(bitmap, 100);
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(b);
                fileOutputStream.flush();
                z = true;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (Exception e3) {
                e = e3;
                try {
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e22) {
                            e22.printStackTrace();
                        }
                    }
                    return z;
                } catch (Throwable th2) {
                    th = th2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e222) {
                            e222.printStackTrace();
                        }
                    }
                    throw th;
                }
            }
        } catch (Exception e4) {
            e = e4;
            fileOutputStream = null;
            e.printStackTrace();
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            return z;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            throw th;
        }
        return z;
    }

    public static Bitmap b(String str, int i, int i2) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = a(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public static String b(String str) {
        try {
            Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(str, 1);
            if (createVideoThumbnail != null) {
                return a(Bitmap.createBitmap(createVideoThumbnail, 0, 0, 80, 80), 20);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
        return "";
    }

    public static byte[] b(Bitmap bitmap, int i) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream((bitmap.getWidth() * bitmap.getHeight()) * 4);
        try {
            bitmap.compress(CompressFormat.PNG, i, byteArrayOutputStream);
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            return null;
        }
    }

    public static void c(String str) {
        int d = d(str);
        if (d != 0) {
            Options options = new Options();
            options.inSampleSize = 1;
            options.inDither = false;
            options.inPurgeable = true;
            options.inInputShareable = true;
            options.inTempStorage = new byte[32768];
            options.inPreferredConfig = Config.RGB_565;
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            Matrix matrix = new Matrix();
            matrix.postRotate((float) d);
            decodeFile = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
            try {
                decodeFile.compress(CompressFormat.JPEG, 100, new FileOutputStream(new File(str)));
                if (decodeFile != null) {
                    decodeFile.recycle();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public static int d(String str) {
        try {
            switch (new ExifInterface(str).getAttributeInt("Orientation", 1)) {
                case 3:
                    return Opcodes.GETFIELD;
                case 6:
                    return 90;
                case 8:
                    return 270;
                default:
                    return 0;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static boolean f(String str) {
        File file = new File(str);
        return (file.isFile() && file.exists()) ? file.delete() : false;
    }

    public boolean e(String str) {
        if (!str.endsWith(File.separator)) {
            str = str + File.separator;
        }
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        boolean z = true;
        for (int i = 0; i < listFiles.length; i++) {
            if (!listFiles[i].isFile()) {
                z = e(listFiles[i].getAbsolutePath());
                if (!z) {
                    break;
                }
            } else {
                z = f(listFiles[i].getAbsolutePath());
                if (!z) {
                    break;
                }
            }
        }
        return z ? file.delete() : false;
    }
}
