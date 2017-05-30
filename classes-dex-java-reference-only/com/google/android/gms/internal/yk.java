package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.R.string;
import com.google.android.gms.ads.internal.u;
import java.util.Map;

@aaa
public class yk
  extends yn
{
  private final Map<String, String> a;
  private final Context b;
  
  public yk(acy paramacy, Map<String, String> paramMap)
  {
    super(paramacy, "storePicture");
    this.a = paramMap;
    this.b = paramacy.f();
  }
  
  DownloadManager.Request a(String paramString1, String paramString2)
  {
    paramString1 = new DownloadManager.Request(Uri.parse(paramString1));
    paramString1.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, paramString2);
    u.g().a(paramString1);
    return paramString1;
  }
  
  String a(String paramString)
  {
    return Uri.parse(paramString).getLastPathSegment();
  }
  
  public void a()
  {
    if (this.b == null)
    {
      b("Activity context is not available");
      return;
    }
    if (!u.e().e(this.b).c())
    {
      b("Feature is not supported by the device.");
      return;
    }
    String str2 = (String)this.a.get("iurl");
    if (TextUtils.isEmpty(str2))
    {
      b("Image url cannot be empty.");
      return;
    }
    if (!URLUtil.isValidUrl(str2))
    {
      str1 = String.valueOf(str2);
      if (str1.length() != 0) {}
      for (str1 = "Invalid image url: ".concat(str1);; str1 = new String("Invalid image url: "))
      {
        b(str1);
        return;
      }
    }
    String str3 = a(str2);
    if (!u.e().c(str3))
    {
      str1 = String.valueOf(str3);
      if (str1.length() != 0) {}
      for (str1 = "Image type not recognized: ".concat(str1);; str1 = new String("Image type not recognized: "))
      {
        b(str1);
        return;
      }
    }
    Resources localResources = u.i().q();
    AlertDialog.Builder localBuilder = u.e().d(this.b);
    if (localResources != null)
    {
      str1 = localResources.getString(R.string.store_picture_title);
      localBuilder.setTitle(str1);
      if (localResources == null) {
        break label300;
      }
      str1 = localResources.getString(R.string.store_picture_message);
      label221:
      localBuilder.setMessage(str1);
      if (localResources == null) {
        break label306;
      }
      str1 = localResources.getString(R.string.accept);
      label241:
      localBuilder.setPositiveButton(str1, new yk.1(this, str2, str3));
      if (localResources == null) {
        break label312;
      }
    }
    label300:
    label306:
    label312:
    for (String str1 = localResources.getString(R.string.decline);; str1 = "Decline")
    {
      localBuilder.setNegativeButton(str1, new yk.2(this));
      localBuilder.create().show();
      return;
      str1 = "Save image";
      break;
      str1 = "Allow Ad to store image in Picture gallery?";
      break label221;
      str1 = "Accept";
      break label241;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/yk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */