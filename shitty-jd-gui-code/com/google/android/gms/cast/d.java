package com.google.android.gms.cast;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.Display;
import com.google.android.gms.cast.internal.h;
import com.google.android.gms.cast.internal.l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.a.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.agu;
import com.google.android.gms.internal.agv;
import com.google.android.gms.internal.amf;
import java.lang.annotation.Annotation;

public final class d
{
  public static final int a = 1;
  public static final int b = 2;
  public static final int c = 3;
  public static final a<a> d = new a("CastRemoteDisplay.API", f, l.b);
  public static final e e = new agu(d);
  private static final a.b<agv, a> f = new a.b()
  {
    public agv a(Context paramAnonymousContext, Looper paramAnonymousLooper, s paramAnonymouss, d.a paramAnonymousa, g.b paramAnonymousb, g.c paramAnonymousc)
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("configuration", paramAnonymousa.c);
      return new agv(paramAnonymousContext, paramAnonymousLooper, paramAnonymouss, paramAnonymousa.a, localBundle, paramAnonymousa.b, paramAnonymousb, paramAnonymousc);
    }
  };
  
  public static final boolean a(Context paramContext)
  {
    h.a(paramContext);
    return ((Boolean)h.a.c()).booleanValue();
  }
  
  public static final class a
    implements a.a.a
  {
    final CastDevice a;
    final d.b b;
    final int c;
    
    private a(a parama)
    {
      this.a = parama.a;
      this.b = parama.b;
      this.c = parama.c;
    }
    
    public static final class a
    {
      CastDevice a;
      d.b b;
      int c;
      
      public a(CastDevice paramCastDevice, d.b paramb)
      {
        com.google.android.gms.common.internal.d.a(paramCastDevice, "CastDevice parameter cannot be null");
        this.a = paramCastDevice;
        this.b = paramb;
        this.c = 2;
      }
      
      public a a(@d.d int paramInt)
      {
        this.c = paramInt;
        return this;
      }
      
      public d.a a()
      {
        return new d.a(this, null);
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(Status paramStatus);
  }
  
  public static abstract interface c
    extends m
  {
    public abstract Display b();
  }
  
  public static @interface d {}
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */