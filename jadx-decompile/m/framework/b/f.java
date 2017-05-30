package m.framework.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.text.TextUtils;
import com.baidu.tts.loopj.RequestParams;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.Locale;

public class f {
    private static float a;

    public static int a(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int a(Context context, int i) {
        if (a <= 0.0f) {
            a = context.getResources().getDisplayMetrics().density;
        }
        return (int) ((((float) i) * a) + 0.5f);
    }

    public static Bitmap a(File file, int i) {
        InputStream fileInputStream = new FileInputStream(file);
        Bitmap a = a(fileInputStream, i);
        fileInputStream.close();
        return a;
    }

    public static Bitmap a(InputStream inputStream) {
        return a(inputStream, 1);
    }

    private static Bitmap a(InputStream inputStream, int i) {
        Options options = new Options();
        options.inPreferredConfig = Config.RGB_565;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    public static Bitmap a(String str, int i) {
        return a(new File(str), i);
    }

    public static String a(Context context, String str) {
        String stringBuilder = new StringBuilder(String.valueOf(context.getFilesDir().getAbsolutePath())).append("/mFramework/cache/").toString();
        b bVar = new b(context);
        if (bVar.u()) {
            stringBuilder = bVar.v() + "/mFramework/" + bVar.o() + "/cache/";
        }
        if (!TextUtils.isEmpty(str)) {
            stringBuilder = new StringBuilder(String.valueOf(stringBuilder)).append(str).append("/").toString();
        }
        File file = new File(stringBuilder);
        if (!file.exists()) {
            file.mkdir();
        }
        return stringBuilder;
    }

    public static boolean a(String str) {
        return str == null || str.trim().length() <= 0 || "null".equals(str.trim().toLowerCase(Locale.getDefault()));
    }

    public static int b(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static Bitmap b(String str) {
        return a(str, 1);
    }

    public static String c(String str) {
        Throwable th;
        String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(str);
        if (contentTypeFor != null && contentTypeFor.length() > 0) {
            return contentTypeFor;
        }
        String toLowerCase = str.toLowerCase(Locale.getDefault());
        if (toLowerCase.endsWith("jpg") || toLowerCase.endsWith("jepg")) {
            return "image/jpeg";
        }
        if (toLowerCase.endsWith("png")) {
            return "image/png";
        }
        if (toLowerCase.endsWith("gif")) {
            return "image/gif";
        }
        try {
            InputStream fileInputStream = new FileInputStream(str);
            toLowerCase = URLConnection.guessContentTypeFromStream(fileInputStream);
            try {
                fileInputStream.close();
                contentTypeFor = toLowerCase;
            } catch (Throwable th2) {
                th = th2;
                th.printStackTrace();
                contentTypeFor = toLowerCase;
                if (contentTypeFor != null) {
                }
            }
        } catch (Throwable th3) {
            Throwable th4 = th3;
            toLowerCase = contentTypeFor;
            th = th4;
            th.printStackTrace();
            contentTypeFor = toLowerCase;
            if (contentTypeFor != null) {
            }
        }
        return (contentTypeFor != null || contentTypeFor.length() <= 0) ? RequestParams.APPLICATION_OCTET_STREAM : contentTypeFor;
    }
}
