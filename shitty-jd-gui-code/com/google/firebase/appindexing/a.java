package com.google.firebase.appindexing;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.d;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.ActionImpl.MetadataImpl;
import com.google.firebase.appindexing.internal.k;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract interface a
{
  public static class a
  {
    public static final String a = "ActivateAction";
    public static final String b = "AddAction";
    public static final String c = "BookmarkAction";
    public static final String d = "CommentAction";
    public static final String e = "LikeAction";
    public static final String f = "ListenAction";
    public static final String g = "SendAction";
    public static final String h = "ShareAction";
    public static final String i = "ViewAction";
    public static final String j = "WatchAction";
    public static final String k = "http://schema.org/ActiveActionStatus";
    public static final String l = "http://schema.org/CompletedActionStatus";
    public static final String m = "http://schema.org/FailedActionStatus";
    private final String n;
    private String o;
    private String p;
    private String q;
    private ActionImpl.MetadataImpl r = a.b.a;
    private String s;
    
    public a(String paramString)
    {
      this.n = paramString;
    }
    
    public a a(@NonNull a.b.a parama)
    {
      d.a(parama);
      this.r = parama.a();
      return this;
    }
    
    public a a(@a String paramString)
    {
      d.a(paramString);
      this.s = paramString;
      return this;
    }
    
    public a a(@NonNull String paramString1, @NonNull String paramString2)
    {
      d.a(paramString1);
      k.a(paramString2);
      this.o = paramString1;
      this.p = paramString2;
      return this;
    }
    
    public a a(@NonNull String paramString1, @NonNull String paramString2, @NonNull String paramString3)
    {
      d.a(paramString1);
      k.a(paramString2);
      k.b(paramString3);
      this.o = paramString1;
      this.p = paramString2;
      this.q = paramString3;
      return this;
    }
    
    public a a()
    {
      d.a(this.o, "setObject is required before calling build().");
      d.a(this.p, "setObject is required before calling build().");
      return new ActionImpl(this.n, this.o, this.p, this.q, this.r, this.s);
    }
    
    @Retention(RetentionPolicy.CLASS)
    public static @interface a {}
  }
  
  public static abstract interface b
  {
    public static final ActionImpl.MetadataImpl a = new a().a();
    
    public static class a
    {
      private boolean a = true;
      private boolean b = false;
      
      public a a(boolean paramBoolean)
      {
        this.a = paramBoolean;
        return this;
      }
      
      public ActionImpl.MetadataImpl a()
      {
        return new ActionImpl.MetadataImpl(this.a, null, null, null, false);
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/firebase/appindexing/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */