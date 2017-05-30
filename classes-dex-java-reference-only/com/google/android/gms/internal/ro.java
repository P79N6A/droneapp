package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.view.MotionEvent;
import android.view.View;

public class ro
{
  private static final String[] e = { "/aclk", "/pcs/click" };
  private String a = "googleads.g.doubleclick.net";
  private String b = "/pagead/ads";
  private String c = "ad.doubleclick.net";
  private String[] d = { ".doubleclick.net", ".googleadservices.com", ".googlesyndication.com" };
  private oq f;
  
  public ro(oq paramoq)
  {
    this.f = paramoq;
  }
  
  private Uri a(Uri paramUri, Context paramContext, String paramString, boolean paramBoolean, View paramView)
  {
    boolean bool;
    try
    {
      bool = b(paramUri);
      if (bool)
      {
        if (!paramUri.toString().contains("dc_ms=")) {
          break label64;
        }
        throw new rp("Parameter already exists: dc_ms");
      }
    }
    catch (UnsupportedOperationException paramUri)
    {
      throw new rp("Provided Uri is not in a valid state");
    }
    if (paramUri.getQueryParameter("ms") != null) {
      throw new rp("Query parameter already exists: ms");
    }
    label64:
    if (paramBoolean) {}
    for (paramContext = this.f.a(paramContext, paramString, paramView); bool; paramContext = this.f.a(paramContext)) {
      return b(paramUri, "dc_ms", paramContext);
    }
    paramUri = a(paramUri, "ms", paramContext);
    return paramUri;
  }
  
  private Uri a(Uri paramUri, String paramString1, String paramString2)
  {
    String str = paramUri.toString();
    int j = str.indexOf("&adurl");
    int i = j;
    if (j == -1) {
      i = str.indexOf("?adurl");
    }
    if (i != -1) {
      return Uri.parse(str.substring(0, i + 1) + paramString1 + "=" + paramString2 + "&" + str.substring(i + 1));
    }
    return paramUri.buildUpon().appendQueryParameter(paramString1, paramString2).build();
  }
  
  private Uri b(Uri paramUri, String paramString1, String paramString2)
  {
    String str = paramUri.toString();
    int i = str.indexOf(";adurl");
    if (i != -1) {
      return Uri.parse(str.substring(0, i + 1) + paramString1 + "=" + paramString2 + ";" + str.substring(i + 1));
    }
    paramUri = paramUri.getEncodedPath();
    i = str.indexOf(paramUri);
    return Uri.parse(str.substring(0, paramUri.length() + i) + ";" + paramString1 + "=" + paramString2 + ";" + str.substring(paramUri.length() + i));
  }
  
  public Uri a(Uri paramUri, Context paramContext)
  {
    return a(paramUri, paramContext, null, false, null);
  }
  
  public Uri a(Uri paramUri, Context paramContext, View paramView)
  {
    try
    {
      paramUri = a(paramUri, paramContext, paramUri.getQueryParameter("ai"), true, paramView);
      return paramUri;
    }
    catch (UnsupportedOperationException paramUri)
    {
      throw new rp("Provided Uri is not in a valid state");
    }
  }
  
  public oq a()
  {
    return this.f;
  }
  
  public void a(MotionEvent paramMotionEvent)
  {
    this.f.a(paramMotionEvent);
  }
  
  public void a(String paramString)
  {
    this.d = paramString.split(",");
  }
  
  public void a(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public boolean a(Uri paramUri)
  {
    boolean bool2 = false;
    if (paramUri == null) {
      throw new NullPointerException();
    }
    boolean bool1 = bool2;
    try
    {
      if (paramUri.getHost().equals(this.a))
      {
        boolean bool3 = paramUri.getPath().equals(this.b);
        bool1 = bool2;
        if (bool3) {
          bool1 = true;
        }
      }
      return bool1;
    }
    catch (NullPointerException paramUri) {}
    return false;
  }
  
  @Deprecated
  public Uri b(Uri paramUri, Context paramContext)
  {
    return a(paramUri, paramContext, null);
  }
  
  public boolean b(Uri paramUri)
  {
    if (paramUri == null) {
      throw new NullPointerException();
    }
    try
    {
      boolean bool = paramUri.getHost().equals(this.c);
      return bool;
    }
    catch (NullPointerException paramUri) {}
    return false;
  }
  
  public boolean c(Uri paramUri)
  {
    boolean bool2 = false;
    if (paramUri == null) {
      throw new NullPointerException();
    }
    try
    {
      paramUri = paramUri.getHost();
      String[] arrayOfString = this.d;
      int j = arrayOfString.length;
      int i = 0;
      for (;;)
      {
        boolean bool1 = bool2;
        if (i < j)
        {
          bool1 = paramUri.endsWith(arrayOfString[i]);
          if (bool1) {
            bool1 = true;
          }
        }
        else
        {
          return bool1;
        }
        i += 1;
      }
      return false;
    }
    catch (NullPointerException paramUri) {}
  }
  
  public boolean d(Uri paramUri)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    String[] arrayOfString;
    int j;
    int i;
    if (c(paramUri))
    {
      arrayOfString = e;
      j = arrayOfString.length;
      i = 0;
    }
    for (;;)
    {
      bool1 = bool2;
      if (i < j)
      {
        String str = arrayOfString[i];
        if (paramUri.getPath().endsWith(str)) {
          bool1 = true;
        }
      }
      else
      {
        return bool1;
      }
      i += 1;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/ro.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */