package com.b.a.b.d;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
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

public class a
  implements b
{
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
  
  public a(Context paramContext)
  {
    this(paramContext, 5000, 20000);
  }
  
  public a(Context paramContext, int paramInt1, int paramInt2)
  {
    this.g = paramContext.getApplicationContext();
    this.h = paramInt1;
    this.i = paramInt2;
  }
  
  @TargetApi(8)
  private InputStream a(String paramString)
  {
    if (Build.VERSION.SDK_INT >= 8)
    {
      paramString = ThumbnailUtils.createVideoThumbnail(paramString, 2);
      if (paramString != null)
      {
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        paramString.compress(Bitmap.CompressFormat.PNG, 0, localByteArrayOutputStream);
        return new ByteArrayInputStream(localByteArrayOutputStream.toByteArray());
      }
    }
    return null;
  }
  
  private boolean b(Uri paramUri)
  {
    paramUri = this.g.getContentResolver().getType(paramUri);
    return (paramUri != null) && (paramUri.startsWith("video/"));
  }
  
  private boolean b(String paramString)
  {
    paramString = MimeTypeMap.getFileExtensionFromUrl(paramString);
    paramString = MimeTypeMap.getSingleton().getMimeTypeFromExtension(paramString);
    return (paramString != null) && (paramString.startsWith("video/"));
  }
  
  @TargetApi(14)
  protected InputStream a(Uri paramUri)
  {
    ContentResolver localContentResolver = this.g.getContentResolver();
    if (Build.VERSION.SDK_INT >= 14) {
      return ContactsContract.Contacts.openContactPhotoInputStream(localContentResolver, paramUri, true);
    }
    return ContactsContract.Contacts.openContactPhotoInputStream(localContentResolver, paramUri);
  }
  
  public InputStream a(String paramString, Object paramObject)
  {
    switch (1.a[b.a.a(paramString).ordinal()])
    {
    default: 
      return h(paramString, paramObject);
    case 1: 
    case 2: 
      return b(paramString, paramObject);
    case 3: 
      return d(paramString, paramObject);
    case 4: 
      return e(paramString, paramObject);
    case 5: 
      return f(paramString, paramObject);
    }
    return g(paramString, paramObject);
  }
  
  protected boolean a(HttpURLConnection paramHttpURLConnection)
  {
    return paramHttpURLConnection.getResponseCode() == 200;
  }
  
  protected InputStream b(String paramString, Object paramObject)
  {
    paramString = c(paramString, paramObject);
    int k = 0;
    while ((paramString.getResponseCode() / 100 == 3) && (k < 5))
    {
      paramString = c(paramString.getHeaderField("Location"), paramObject);
      k += 1;
    }
    try
    {
      paramObject = paramString.getInputStream();
      if (!a(paramString))
      {
        c.a((Closeable)paramObject);
        throw new IOException("Image request failed with response code " + paramString.getResponseCode());
      }
    }
    catch (IOException paramObject)
    {
      c.a(paramString.getErrorStream());
      throw ((Throwable)paramObject);
    }
    return new com.b.a.b.a.a(new BufferedInputStream((InputStream)paramObject, 32768), paramString.getContentLength());
  }
  
  protected HttpURLConnection c(String paramString, Object paramObject)
  {
    paramString = (HttpURLConnection)new URL(Uri.encode(paramString, "@#&=*+-_.,:!?()/~'%")).openConnection();
    paramString.setConnectTimeout(this.h);
    paramString.setReadTimeout(this.i);
    return paramString;
  }
  
  protected InputStream d(String paramString, Object paramObject)
  {
    paramObject = b.a.c.c(paramString);
    if (b(paramString)) {
      return a((String)paramObject);
    }
    return new com.b.a.b.a.a(new BufferedInputStream(new FileInputStream((String)paramObject), 32768), (int)new File((String)paramObject).length());
  }
  
  protected InputStream e(String paramString, Object paramObject)
  {
    paramObject = this.g.getContentResolver();
    Uri localUri = Uri.parse(paramString);
    if (b(localUri))
    {
      paramString = MediaStore.Video.Thumbnails.getThumbnail((ContentResolver)paramObject, Long.valueOf(localUri.getLastPathSegment()).longValue(), 1, null);
      if (paramString != null)
      {
        paramObject = new ByteArrayOutputStream();
        paramString.compress(Bitmap.CompressFormat.PNG, 0, (OutputStream)paramObject);
        return new ByteArrayInputStream(((ByteArrayOutputStream)paramObject).toByteArray());
      }
    }
    else if (paramString.startsWith("content://com.android.contacts/"))
    {
      return a(localUri);
    }
    return ((ContentResolver)paramObject).openInputStream(localUri);
  }
  
  protected InputStream f(String paramString, Object paramObject)
  {
    paramString = b.a.e.c(paramString);
    return this.g.getAssets().open(paramString);
  }
  
  protected InputStream g(String paramString, Object paramObject)
  {
    int k = Integer.parseInt(b.a.f.c(paramString));
    return this.g.getResources().openRawResource(k);
  }
  
  protected InputStream h(String paramString, Object paramObject)
  {
    throw new UnsupportedOperationException(String.format("UIL doesn't support scheme(protocol) by default [%s]. You should implement this support yourself (BaseImageDownloader.getStreamFromOtherSource(...))", new Object[] { paramString }));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/b/a/b/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */