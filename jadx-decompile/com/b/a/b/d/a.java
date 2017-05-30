package com.b.a.b.d;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.ContactsContract.Contacts;
import android.provider.MediaStore.Video.Thumbnails;
import android.webkit.MimeTypeMap;
import com.b.a.c.c;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.a.a.e;

public class a implements b {
    public static final int a = 5000;
    public static final int b = 20000;
    protected static final int c = 32768;
    protected static final String d = "@#&=*+-_.,:!?()/~'%";
    protected static final int e = 5;
    protected static final String f = "content://com.android.contacts/";
    private static final String j = "UIL doesn't support scheme(protocol) by default [%s]. You should implement this support yourself (BaseImageDownloader.getStreamFromOtherSource(...))";
    protected final Context g;
    protected final int h;
    protected final int i;

    public a(Context context) {
        this(context, 5000, 20000);
    }

    public a(Context context, int i, int i2) {
        this.g = context.getApplicationContext();
        this.h = i;
        this.i = i2;
    }

    @TargetApi(8)
    private InputStream a(String str) {
        if (VERSION.SDK_INT >= 8) {
            Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(str, 2);
            if (createVideoThumbnail != null) {
                OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createVideoThumbnail.compress(CompressFormat.PNG, 0, byteArrayOutputStream);
                return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            }
        }
        return null;
    }

    private boolean b(Uri uri) {
        String type = this.g.getContentResolver().getType(uri);
        return type != null && type.startsWith("video/");
    }

    private boolean b(String str) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
        return mimeTypeFromExtension != null && mimeTypeFromExtension.startsWith("video/");
    }

    @TargetApi(14)
    protected InputStream a(Uri uri) {
        ContentResolver contentResolver = this.g.getContentResolver();
        return VERSION.SDK_INT >= 14 ? Contacts.openContactPhotoInputStream(contentResolver, uri, true) : Contacts.openContactPhotoInputStream(contentResolver, uri);
    }

    public InputStream a(String str, Object obj) {
        switch (com.b.a.b.d.b.a.a(str)) {
            case HTTP:
            case HTTPS:
                return b(str, obj);
            case FILE:
                return d(str, obj);
            case CONTENT:
                return e(str, obj);
            case ASSETS:
                return f(str, obj);
            case DRAWABLE:
                return g(str, obj);
            default:
                return h(str, obj);
        }
    }

    protected boolean a(HttpURLConnection httpURLConnection) {
        return httpURLConnection.getResponseCode() == 200;
    }

    protected InputStream b(String str, Object obj) {
        HttpURLConnection c = c(str, obj);
        int i = 0;
        while (c.getResponseCode() / 100 == 3 && i < 5) {
            c = c(c.getHeaderField(e.H), obj);
            i++;
        }
        try {
            Closeable inputStream = c.getInputStream();
            if (a(c)) {
                return new com.b.a.b.a.a(new BufferedInputStream(inputStream, 32768), c.getContentLength());
            }
            c.a(inputStream);
            throw new IOException("Image request failed with response code " + c.getResponseCode());
        } catch (IOException e) {
            c.a(c.getErrorStream());
            throw e;
        }
    }

    protected HttpURLConnection c(String str, Object obj) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(Uri.encode(str, d)).openConnection();
        httpURLConnection.setConnectTimeout(this.h);
        httpURLConnection.setReadTimeout(this.i);
        return httpURLConnection;
    }

    protected InputStream d(String str, Object obj) {
        String c = com.b.a.b.d.b.a.FILE.c(str);
        return b(str) ? a(c) : new com.b.a.b.a.a(new BufferedInputStream(new FileInputStream(c), 32768), (int) new File(c).length());
    }

    protected InputStream e(String str, Object obj) {
        ContentResolver contentResolver = this.g.getContentResolver();
        Uri parse = Uri.parse(str);
        if (b(parse)) {
            Bitmap thumbnail = Thumbnails.getThumbnail(contentResolver, Long.valueOf(parse.getLastPathSegment()).longValue(), 1, null);
            if (thumbnail != null) {
                OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                thumbnail.compress(CompressFormat.PNG, 0, byteArrayOutputStream);
                return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            }
        } else if (str.startsWith(f)) {
            return a(parse);
        }
        return contentResolver.openInputStream(parse);
    }

    protected InputStream f(String str, Object obj) {
        return this.g.getAssets().open(com.b.a.b.d.b.a.ASSETS.c(str));
    }

    protected InputStream g(String str, Object obj) {
        return this.g.getResources().openRawResource(Integer.parseInt(com.b.a.b.d.b.a.DRAWABLE.c(str)));
    }

    protected InputStream h(String str, Object obj) {
        throw new UnsupportedOperationException(String.format(j, new Object[]{str}));
    }
}
