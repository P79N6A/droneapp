package com.google.android.gms.b;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.d;

public final class a
  extends e
{
  public static final String a = "http://schema.org/ActivateAction";
  public static final String b = "http://schema.org/AddAction";
  public static final String c = "http://schema.org/BookmarkAction";
  public static final String d = "http://schema.org/CommunicateAction";
  public static final String e = "http://schema.org/FilmAction";
  public static final String f = "http://schema.org/LikeAction";
  public static final String g = "http://schema.org/ListenAction";
  public static final String h = "http://schema.org/PhotographAction";
  public static final String i = "http://schema.org/ReserveAction";
  public static final String j = "http://schema.org/SearchAction";
  public static final String k = "http://schema.org/ViewAction";
  public static final String l = "http://schema.org/WantAction";
  public static final String m = "http://schema.org/WatchAction";
  public static final String n = "http://schema.org/ActiveActionStatus";
  public static final String o = "http://schema.org/CompletedActionStatus";
  public static final String p = "http://schema.org/FailedActionStatus";
  
  private a(Bundle paramBundle)
  {
    super(paramBundle);
  }
  
  public static a a(String paramString1, String paramString2, Uri paramUri)
  {
    return a(paramString1, paramString2, null, paramUri);
  }
  
  public static a a(String paramString1, String paramString2, Uri paramUri1, Uri paramUri2)
  {
    a locala = new a(paramString1);
    paramString2 = new e.a().c(paramString2);
    if (paramUri1 == null) {}
    for (paramString1 = null;; paramString1 = paramUri1.toString()) {
      return (a)locala.a(paramString2.d(paramString1).b(paramUri2).b()).b();
    }
  }
  
  public static final class a
    extends e.a
  {
    public a(String paramString)
    {
      d.a(paramString);
      super.b("type", paramString);
    }
    
    public a a(Uri paramUri)
    {
      if (paramUri != null) {
        super.b("url", paramUri.toString());
      }
      return this;
    }
    
    public a a(e parame)
    {
      d.a(parame);
      return (a)super.b("object", parame);
    }
    
    public a a(String paramString)
    {
      return (a)super.b("name", paramString);
    }
    
    public a a(String paramString, e parame)
    {
      return (a)super.b(paramString, parame);
    }
    
    public a a(String paramString1, String paramString2)
    {
      return (a)super.b(paramString1, paramString2);
    }
    
    public a a(String paramString, boolean paramBoolean)
    {
      return (a)super.b(paramString, paramBoolean);
    }
    
    public a a(String paramString, e[] paramArrayOfe)
    {
      return (a)super.b(paramString, paramArrayOfe);
    }
    
    public a a(String paramString, String[] paramArrayOfString)
    {
      return (a)super.b(paramString, paramArrayOfString);
    }
    
    public a a()
    {
      d.a(this.a.get("object"), "setObject is required before calling build().");
      d.a(this.a.get("type"), "setType is required before calling build().");
      Bundle localBundle = (Bundle)this.a.getParcelable("object");
      d.a(localBundle.get("name"), "Must call setObject() with a valid name. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
      d.a(localBundle.get("url"), "Must call setObject() with a valid app URI. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
      return new a(this.a, null);
    }
    
    public a b(String paramString)
    {
      d.a(paramString);
      return (a)super.b("actionStatus", paramString);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */