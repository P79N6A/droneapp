package cn.sharesdk.wechat.utils;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler.Callback;
import android.os.Message;
import android.text.TextUtils;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.Platform.ShareParams;
import cn.sharesdk.framework.PlatformActionListener;
import com.mob.tools.log.NLog;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.R;
import com.mob.tools.utils.UIHandler;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.FileNameMap;
import java.net.URLConnection;
import java.util.HashMap;

public class WechatHelper
{
  private static boolean a = false;
  private static WechatHelper b;
  private h c = new h();
  private i d;
  
  private Bitmap a(Bitmap paramBitmap, double paramDouble)
  {
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    paramDouble = Math.sqrt(paramDouble);
    return Bitmap.createScaledBitmap(paramBitmap, (int)(i / paramDouble), (int)(j / paramDouble), true);
  }
  
  public static WechatHelper a()
  {
    if (b == null) {
      b = new WechatHelper();
    }
    return b;
  }
  
  private void a(Context paramContext, String paramString1, String paramString2, Bitmap paramBitmap, int paramInt, i parami)
  {
    WXImageObject localWXImageObject = new WXImageObject();
    Object localObject = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)localObject);
    ((ByteArrayOutputStream)localObject).flush();
    ((ByteArrayOutputStream)localObject).close();
    localWXImageObject.imageData = ((ByteArrayOutputStream)localObject).toByteArray();
    localObject = new WXMediaMessage();
    ((WXMediaMessage)localObject).title = paramString1;
    ((WXMediaMessage)localObject).mediaObject = localWXImageObject;
    ((WXMediaMessage)localObject).description = paramString2;
    ((WXMediaMessage)localObject).thumbData = a(paramContext, paramBitmap);
    a((WXMediaMessage)localObject, "img", paramInt, parami);
  }
  
  private void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt, i parami)
  {
    WXImageObject localWXImageObject = new WXImageObject();
    if (paramString3.startsWith("/data/")) {
      localWXImageObject.imageData = a(paramString3);
    }
    for (;;)
    {
      WXMediaMessage localWXMediaMessage = new WXMediaMessage();
      localWXMediaMessage.title = paramString1;
      localWXMediaMessage.mediaObject = localWXImageObject;
      localWXMediaMessage.description = paramString2;
      localWXMediaMessage.thumbData = b(paramContext, paramString3);
      a(localWXMediaMessage, "img", paramInt, parami);
      return;
      localWXImageObject.imagePath = paramString3;
    }
  }
  
  private void a(Context paramContext, String paramString1, String paramString2, String paramString3, Bitmap paramBitmap, int paramInt, i parami)
  {
    WXVideoObject localWXVideoObject = new WXVideoObject();
    localWXVideoObject.videoUrl = paramString3;
    paramString3 = new WXMediaMessage();
    paramString3.title = paramString1;
    paramString3.description = paramString2;
    paramString3.mediaObject = localWXVideoObject;
    paramString3.thumbData = a(paramContext, paramBitmap);
    a(paramString3, "video", paramInt, parami);
  }
  
  private void a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, i parami)
  {
    WXVideoObject localWXVideoObject = new WXVideoObject();
    localWXVideoObject.videoUrl = paramString3;
    paramString3 = new WXMediaMessage();
    paramString3.title = paramString1;
    paramString3.description = paramString2;
    paramString3.mediaObject = localWXVideoObject;
    paramString3.thumbData = b(paramContext, paramString4);
    a(paramString3, "video", paramInt, parami);
  }
  
  private void a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, Bitmap paramBitmap, int paramInt, i parami)
  {
    WXMusicObject localWXMusicObject = new WXMusicObject();
    localWXMusicObject.musicUrl = paramString4;
    localWXMusicObject.musicDataUrl = paramString3;
    paramString3 = new WXMediaMessage();
    paramString3.title = paramString1;
    paramString3.description = paramString2;
    paramString3.mediaObject = localWXMusicObject;
    paramString3.thumbData = a(paramContext, paramBitmap);
    a(paramString3, "music", paramInt, parami);
  }
  
  private void a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt, i parami)
  {
    WXMusicObject localWXMusicObject = new WXMusicObject();
    localWXMusicObject.musicUrl = paramString4;
    localWXMusicObject.musicDataUrl = paramString3;
    paramString3 = new WXMediaMessage();
    paramString3.title = paramString1;
    paramString3.description = paramString2;
    paramString3.mediaObject = localWXMusicObject;
    paramString3.thumbData = b(paramContext, paramString5);
    a(paramString3, "music", paramInt, parami);
  }
  
  private void a(WXMediaMessage paramWXMediaMessage, String paramString, int paramInt, i parami)
  {
    Object localObject1 = DeviceHelper.getInstance(parami.b().getContext());
    String str = ((DeviceHelper)localObject1).getPackageName() + ".wxapi.WXEntryActivity";
    try
    {
      localObject1 = Class.forName(str);
      if ((localObject1 != null) && (!WechatHandlerActivity.class.isAssignableFrom((Class)localObject1)))
      {
        localObject1 = str + " does not extend from " + WechatHandlerActivity.class.getName();
        if (a) {
          throw new Throwable((String)localObject1);
        }
      }
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        cn.sharesdk.framework.utils.d.a().d(localThrowable);
        localObject2 = null;
      }
      new Throwable((String)localObject2).printStackTrace();
      Object localObject2 = new d();
      ((d)localObject2).c = (paramString + System.currentTimeMillis());
      ((d)localObject2).a = paramWXMediaMessage;
      ((d)localObject2).b = paramInt;
      this.d = parami;
      this.c.a((j)localObject2);
    }
  }
  
  private void a(String paramString1, String paramString2, int paramInt, i parami)
  {
    WXTextObject localWXTextObject = new WXTextObject();
    localWXTextObject.text = paramString2;
    WXMediaMessage localWXMediaMessage = new WXMediaMessage();
    localWXMediaMessage.title = paramString1;
    localWXMediaMessage.mediaObject = localWXTextObject;
    localWXMediaMessage.description = paramString2;
    a(localWXMediaMessage, "text", paramInt, parami);
  }
  
  private byte[] a(Context paramContext, Bitmap paramBitmap)
  {
    if (paramBitmap == null) {
      throw new RuntimeException("checkArgs fail, thumbData is null");
    }
    if (paramBitmap.isRecycled()) {
      throw new RuntimeException("checkArgs fail, thumbData is recycled");
    }
    return a(paramContext, paramBitmap, Bitmap.CompressFormat.PNG);
  }
  
  private byte[] a(Context paramContext, Bitmap paramBitmap, Bitmap.CompressFormat paramCompressFormat)
  {
    if (paramBitmap == null) {
      throw new RuntimeException("checkArgs fail, thumbData is null");
    }
    if (paramBitmap.isRecycled()) {
      throw new RuntimeException("checkArgs fail, thumbData is recycled");
    }
    paramContext = new ByteArrayOutputStream();
    paramBitmap.compress(paramCompressFormat, 100, paramContext);
    paramContext.flush();
    paramContext.close();
    paramContext = paramContext.toByteArray();
    for (int i = paramContext.length; i > 32768; i = paramContext.length)
    {
      paramBitmap = a(paramBitmap, i / 32768.0D);
      paramContext = new ByteArrayOutputStream();
      paramBitmap.compress(paramCompressFormat, 100, paramContext);
      paramContext.flush();
      paramContext.close();
      paramContext = paramContext.toByteArray();
    }
    return paramContext;
  }
  
  private byte[] a(String paramString)
  {
    try
    {
      paramString = new FileInputStream(paramString);
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      byte[] arrayOfByte = new byte['Ѐ'];
      for (int i = paramString.read(arrayOfByte); i > 0; i = paramString.read(arrayOfByte)) {
        localByteArrayOutputStream.write(arrayOfByte, 0, i);
      }
      localByteArrayOutputStream.flush();
      paramString.close();
      localByteArrayOutputStream.close();
      paramString = localByteArrayOutputStream.toByteArray();
      return paramString;
    }
    catch (Throwable paramString)
    {
      cn.sharesdk.framework.utils.d.a().d(paramString);
    }
    return null;
  }
  
  private void b(Context paramContext, String paramString1, String paramString2, Bitmap paramBitmap, int paramInt, i parami)
  {
    WXEmojiObject localWXEmojiObject = new WXEmojiObject();
    paramContext = a(paramContext, paramBitmap);
    localWXEmojiObject.emojiData = paramContext;
    paramBitmap = new WXMediaMessage();
    paramBitmap.title = paramString1;
    paramBitmap.mediaObject = localWXEmojiObject;
    paramBitmap.description = paramString2;
    paramBitmap.thumbData = paramContext;
    a(paramBitmap, "emoji", paramInt, parami);
  }
  
  private void b(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt, i parami)
  {
    WXEmojiObject localWXEmojiObject = new WXEmojiObject();
    localWXEmojiObject.emojiPath = paramString3;
    WXMediaMessage localWXMediaMessage = new WXMediaMessage();
    localWXMediaMessage.title = paramString1;
    localWXMediaMessage.mediaObject = localWXEmojiObject;
    localWXMediaMessage.description = paramString2;
    localWXMediaMessage.thumbData = b(paramContext, paramString3);
    a(localWXMediaMessage, "emoji", paramInt, parami);
  }
  
  private void b(Context paramContext, String paramString1, String paramString2, String paramString3, Bitmap paramBitmap, int paramInt, i parami)
  {
    WXWebpageObject localWXWebpageObject = new WXWebpageObject();
    localWXWebpageObject.webpageUrl = paramString3;
    paramString3 = new WXMediaMessage();
    paramString3.title = paramString1;
    paramString3.description = paramString2;
    paramString3.mediaObject = localWXWebpageObject;
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      paramString3.thumbData = a(paramContext, paramBitmap);
      if (paramString3.thumbData == null) {
        throw new RuntimeException("checkArgs fail, thumbData is null");
      }
      if (paramString3.thumbData.length > 32768) {
        throw new RuntimeException("checkArgs fail, thumbData is too large: " + paramString3.thumbData.length + " > " + 32768);
      }
    }
    a(paramString3, "webpage", paramInt, parami);
  }
  
  private void b(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, i parami)
  {
    WXWebpageObject localWXWebpageObject = new WXWebpageObject();
    localWXWebpageObject.webpageUrl = paramString3;
    paramString3 = new WXMediaMessage();
    paramString3.title = paramString1;
    paramString3.description = paramString2;
    paramString3.mediaObject = localWXWebpageObject;
    if ((paramString4 != null) && (new File(paramString4).exists()))
    {
      paramString3.thumbData = b(paramContext, paramString4);
      if (paramString3.thumbData == null) {
        throw new RuntimeException("checkArgs fail, thumbData is null");
      }
      if (paramString3.thumbData.length > 32768) {
        throw new RuntimeException("checkArgs fail, thumbData is too large: " + paramString3.thumbData.length + " > " + 32768);
      }
    }
    a(paramString3, "webpage", paramInt, parami);
  }
  
  private void b(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, Bitmap paramBitmap, int paramInt, i parami)
  {
    WXAppExtendObject localWXAppExtendObject = new WXAppExtendObject();
    localWXAppExtendObject.filePath = paramString3;
    localWXAppExtendObject.extInfo = paramString4;
    paramString3 = new WXMediaMessage();
    paramString3.title = paramString1;
    paramString3.description = paramString2;
    paramString3.mediaObject = localWXAppExtendObject;
    paramString3.thumbData = a(paramContext, paramBitmap);
    a(paramString3, "appdata", paramInt, parami);
  }
  
  private void b(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt, i parami)
  {
    WXAppExtendObject localWXAppExtendObject = new WXAppExtendObject();
    localWXAppExtendObject.filePath = paramString3;
    localWXAppExtendObject.extInfo = paramString4;
    paramString3 = new WXMediaMessage();
    paramString3.title = paramString1;
    paramString3.description = paramString2;
    paramString3.mediaObject = localWXAppExtendObject;
    paramString3.thumbData = b(paramContext, paramString5);
    a(paramString3, "appdata", paramInt, parami);
  }
  
  private byte[] b(Context paramContext, String paramString)
  {
    if (!new File(paramString).exists()) {
      throw new FileNotFoundException();
    }
    Bitmap.CompressFormat localCompressFormat = BitmapHelper.getBmpFormat(paramString);
    return a(paramContext, BitmapHelper.getBitmap(paramString), localCompressFormat);
  }
  
  private void c(Context paramContext, String paramString1, String paramString2, String paramString3, Bitmap paramBitmap, int paramInt, i parami)
  {
    WXFileObject localWXFileObject = new WXFileObject();
    localWXFileObject.filePath = paramString3;
    paramString3 = new WXMediaMessage();
    paramString3.title = paramString1;
    paramString3.description = paramString2;
    paramString3.mediaObject = localWXFileObject;
    paramString3.thumbData = a(paramContext, paramBitmap);
    a(paramString3, "filedata", paramInt, parami);
  }
  
  private void c(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, i parami)
  {
    WXFileObject localWXFileObject = new WXFileObject();
    localWXFileObject.filePath = paramString3;
    paramString3 = new WXMediaMessage();
    paramString3.title = paramString1;
    paramString3.description = paramString2;
    paramString3.mediaObject = localWXFileObject;
    paramString3.thumbData = b(paramContext, paramString4);
    a(paramString3, "filedata", paramInt, parami);
  }
  
  public void a(i parami)
  {
    this.d = parami;
    parami = new a();
    parami.a = "snsapi_userinfo";
    parami.b = "sharesdk_wechat_auth";
    this.c.a(parami);
  }
  
  public void a(final i parami, Platform.ShareParams paramShareParams, final PlatformActionListener paramPlatformActionListener)
  {
    final Platform localPlatform = parami.b();
    final Object localObject1 = paramShareParams.getImagePath();
    final Object localObject2 = paramShareParams.getImageUrl();
    if (!TextUtils.isEmpty((CharSequence)localObject1))
    {
      parami = (i)localObject1;
      if (new File((String)localObject1).exists()) {}
    }
    else
    {
      parami = paramShareParams.getImageData();
      if ((parami == null) || (parami.isRecycled())) {
        break label493;
      }
      localObject1 = new File(R.getCachePath(localPlatform.getContext(), "images"), System.currentTimeMillis() + ".png");
      localObject2 = new FileOutputStream((File)localObject1);
      parami.compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)localObject2);
      ((FileOutputStream)localObject2).flush();
      ((FileOutputStream)localObject2).close();
      parami = ((File)localObject1).getAbsolutePath();
    }
    Intent localIntent = new Intent("android.intent.action.SEND");
    localObject1 = paramShareParams.getText();
    if (!TextUtils.isEmpty((CharSequence)localObject1))
    {
      localObject1 = localPlatform.getShortLintk((String)localObject1, false);
      localIntent.putExtra("android.intent.extra.TEXT", (String)localObject1);
      localIntent.putExtra("Kdescription", (String)localObject1);
    }
    if (!TextUtils.isEmpty(parami))
    {
      localObject1 = new File(parami);
      if (((File)localObject1).exists())
      {
        if (!parami.startsWith("/data/")) {
          break label579;
        }
        localObject2 = new File(R.getCachePath(localPlatform.getContext(), "images"), System.currentTimeMillis() + ((File)localObject1).getName());
        String str = ((File)localObject2).getAbsolutePath();
        ((File)localObject2).createNewFile();
        if (!R.copyFile(parami, str)) {
          break label579;
        }
        localObject1 = localObject2;
      }
    }
    label333:
    label371:
    label493:
    label547:
    label554:
    label579:
    for (;;)
    {
      if (Build.VERSION.SDK_INT >= 24)
      {
        localIntent.putExtra("android.intent.extra.STREAM", R.pathToContentUri(localPlatform.getContext(), ((File)localObject1).getAbsolutePath()));
        localObject1 = URLConnection.getFileNameMap().getContentTypeFor(parami);
        if (localObject1 != null)
        {
          parami = (i)localObject1;
          if (((String)localObject1).length() > 0) {}
        }
        else
        {
          parami = "image/*";
        }
        localIntent.setType(parami);
        if (((Integer)paramShareParams.get("scene", Integer.class)).intValue() != 1) {
          break label547;
        }
      }
      for (parami = "com.tencent.mm.ui.tools.ShareToTimeLineUI";; parami = "com.tencent.mm.ui.tools.ShareImgUI")
      {
        localIntent.setClassName("com.tencent.mm", parami);
        localIntent.addFlags(268435456);
        localPlatform.getContext().startActivity(localIntent);
        parami = DeviceHelper.getInstance(localPlatform.getContext());
        localObject1 = localPlatform.getContext().getPackageName();
        localObject2 = new HashMap();
        ((HashMap)localObject2).put("ShareParams", paramShareParams);
        if (!TextUtils.isEmpty(parami.getTopTaskPackageName())) {
          break label554;
        }
        if ((paramPlatformActionListener != null) && (paramPlatformActionListener != null)) {
          paramPlatformActionListener.onComplete(localPlatform, 9, (HashMap)localObject2);
        }
        return;
        parami = (i)localObject1;
        if (TextUtils.isEmpty((CharSequence)localObject2)) {
          break;
        }
        parami = BitmapHelper.downloadBitmap(localPlatform.getContext(), (String)localObject2);
        break;
        localIntent.putExtra("android.intent.extra.STREAM", Uri.fromFile((File)localObject1));
        break label333;
        localIntent.setType("text/plain");
        break label371;
      }
      UIHandler.sendEmptyMessageDelayed(0, 2000L, new Handler.Callback()
      {
        int a = 0;
        
        public boolean handleMessage(Message paramAnonymousMessage)
        {
          paramAnonymousMessage = parami.getTopTaskPackageName();
          if (!localObject1.equals(paramAnonymousMessage)) {
            if (paramPlatformActionListener != null) {
              paramPlatformActionListener.onComplete(localPlatform, 9, localObject2);
            }
          }
          for (;;)
          {
            return true;
            if (this.a < 5)
            {
              this.a += 1;
              UIHandler.sendEmptyMessageDelayed(0, 500L, this);
            }
          }
        }
      });
      return;
    }
  }
  
  public boolean a(Context paramContext, String paramString)
  {
    return this.c.a(paramContext, paramString);
  }
  
  public boolean a(WechatHandlerActivity paramWechatHandlerActivity)
  {
    return this.c.a(paramWechatHandlerActivity, this.d);
  }
  
  public void b(i parami)
  {
    Platform localPlatform = parami.b();
    Object localObject1 = parami.a();
    Object localObject2 = parami.c();
    int i = ((Platform.ShareParams)localObject1).getShareType();
    String str1 = ((Platform.ShareParams)localObject1).getTitle();
    String str2 = ((Platform.ShareParams)localObject1).getText();
    int j = ((Platform.ShareParams)localObject1).getScence();
    String str3 = ((Platform.ShareParams)localObject1).getImagePath();
    String str4 = ((Platform.ShareParams)localObject1).getImageUrl();
    Bitmap localBitmap = ((Platform.ShareParams)localObject1).getImageData();
    String str5 = ((Platform.ShareParams)localObject1).getMusicUrl();
    String str6 = ((Platform.ShareParams)localObject1).getUrl();
    String str7 = ((Platform.ShareParams)localObject1).getFilePath();
    String str8 = ((Platform.ShareParams)localObject1).getExtInfo();
    localObject1 = localPlatform.getContext();
    switch (i)
    {
    case 3: 
    default: 
      if (localObject2 != null) {
        ((PlatformActionListener)localObject2).onError(localPlatform, 9, new IllegalArgumentException("shareType = " + i));
      }
      return;
    case 1: 
      a(str1, str2, j, parami);
      return;
    case 2: 
      if ((str3 != null) && (str3.length() > 0))
      {
        a((Context)localObject1, str1, str2, str3, j, parami);
        return;
      }
      if ((localBitmap != null) && (!localBitmap.isRecycled()))
      {
        a((Context)localObject1, str1, str2, localBitmap, j, parami);
        return;
      }
      if ((str4 != null) && (str4.length() > 0))
      {
        a((Context)localObject1, str1, str2, BitmapHelper.downloadBitmap(localPlatform.getContext(), str4), j, parami);
        return;
      }
      a((Context)localObject1, str1, str2, "", j, parami);
      return;
    case 5: 
      str5 = localPlatform.getShortLintk(str5 + " " + str6, false);
      localObject2 = str5.split(" ")[0];
      str5 = str5.split(" ")[1];
      if ((str3 != null) && (str3.length() > 0))
      {
        a((Context)localObject1, str1, str2, (String)localObject2, str5, str3, j, parami);
        return;
      }
      if ((localBitmap != null) && (!localBitmap.isRecycled()))
      {
        a((Context)localObject1, str1, str2, (String)localObject2, str5, localBitmap, j, parami);
        return;
      }
      if ((str4 != null) && (str4.length() > 0))
      {
        a((Context)localObject1, str1, str2, (String)localObject2, str5, BitmapHelper.downloadBitmap(localPlatform.getContext(), str4), j, parami);
        return;
      }
      a((Context)localObject1, str1, str2, (String)localObject2, str5, "", j, parami);
      return;
    case 6: 
      localObject2 = localPlatform.getShortLintk(str6, false);
      if ((str3 != null) && (str3.length() > 0))
      {
        a((Context)localObject1, str1, str2, (String)localObject2, str3, j, parami);
        return;
      }
      if ((localBitmap != null) && (!localBitmap.isRecycled()))
      {
        a((Context)localObject1, str1, str2, (String)localObject2, localBitmap, j, parami);
        return;
      }
      if ((str4 != null) && (str4.length() > 0))
      {
        a((Context)localObject1, str1, str2, (String)localObject2, BitmapHelper.downloadBitmap(localPlatform.getContext(), str4), j, parami);
        return;
      }
      a((Context)localObject1, str1, str2, (String)localObject2, "", j, parami);
      return;
    case 4: 
      localObject2 = localPlatform.getShortLintk(str6, false);
      if ((str3 != null) && (str3.length() > 0))
      {
        b((Context)localObject1, str1, str2, (String)localObject2, str3, j, parami);
        return;
      }
      if ((localBitmap != null) && (!localBitmap.isRecycled()))
      {
        b((Context)localObject1, str1, str2, (String)localObject2, localBitmap, j, parami);
        return;
      }
      if ((str4 != null) && (str4.length() > 0))
      {
        b((Context)localObject1, str1, str2, (String)localObject2, BitmapHelper.downloadBitmap(localPlatform.getContext(), str4), j, parami);
        return;
      }
      b((Context)localObject1, str1, str2, (String)localObject2, "", j, parami);
      return;
    case 7: 
      if (j == 1) {
        throw new Throwable("WechatMoments does not support SAHRE_APP");
      }
      if (j == 2) {
        throw new Throwable("WechatFavorite does not support SAHRE_APP");
      }
      if ((str3 != null) && (str3.length() > 0))
      {
        b((Context)localObject1, str1, str2, str7, str8, str3, j, parami);
        return;
      }
      if ((localBitmap != null) && (!localBitmap.isRecycled()))
      {
        b((Context)localObject1, str1, str2, str7, str8, localBitmap, j, parami);
        return;
      }
      if ((str4 != null) && (str4.length() > 0))
      {
        b((Context)localObject1, str1, str2, str7, str8, BitmapHelper.downloadBitmap(localPlatform.getContext(), str4), j, parami);
        return;
      }
      b((Context)localObject1, str1, str2, str7, str8, "", j, parami);
      return;
    case 8: 
      if (j == 1) {
        throw new Throwable("WechatMoments does not support SHARE_FILE");
      }
      if ((str3 != null) && (str3.length() > 0))
      {
        c((Context)localObject1, str1, str2, str7, str3, j, parami);
        return;
      }
      if ((localBitmap != null) && (!localBitmap.isRecycled()))
      {
        c((Context)localObject1, str1, str2, str7, localBitmap, j, parami);
        return;
      }
      if ((str4 != null) && (str4.length() > 0))
      {
        c((Context)localObject1, str1, str2, str7, BitmapHelper.downloadBitmap(localPlatform.getContext(), str4), j, parami);
        return;
      }
      c((Context)localObject1, str1, str2, str7, "", j, parami);
      return;
    }
    if (j == 1) {
      throw new Throwable("WechatMoments does not support SHARE_EMOJI");
    }
    if (j == 2) {
      throw new Throwable("WechatFavorite does not support SHARE_EMOJI");
    }
    if ((str3 != null) && (str3.length() > 0))
    {
      b((Context)localObject1, str1, str2, str3, j, parami);
      return;
    }
    if ((str4 != null) && (str4.length() > 0))
    {
      b((Context)localObject1, str1, str2, new NetworkHelper().downloadCache(localPlatform.getContext(), str4, "images", true, null), j, parami);
      return;
    }
    if ((localBitmap != null) && (!localBitmap.isRecycled()))
    {
      b((Context)localObject1, str1, str2, localBitmap, j, parami);
      return;
    }
    b((Context)localObject1, str1, str2, "", j, parami);
  }
  
  public boolean b()
  {
    return this.c.a();
  }
  
  public boolean c()
  {
    return this.c.b();
  }
  
  public boolean d()
  {
    return this.c.c();
  }
  
  public static class ShareParams
    extends Platform.ShareParams
  {
    @Deprecated
    public String extInfo;
    @Deprecated
    public String filePath;
    @Deprecated
    public Bitmap imageData;
    @Deprecated
    public String imageUrl;
    @Deprecated
    public String musicUrl;
    @Deprecated
    protected int scene;
    @Deprecated
    public int shareType;
    @Deprecated
    public String title;
    @Deprecated
    public String url;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/cn/sharesdk/wechat/utils/WechatHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */