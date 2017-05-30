package com.google.android.gms.clearcut;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.a.b;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import com.google.android.gms.internal.agz;
import com.google.android.gms.internal.aha;
import com.google.android.gms.internal.ahe;
import com.google.android.gms.internal.ri.d;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;

public final class b
{
  public static final a.g<aha> a = new a.g();
  public static final a.b<aha, a.a.b> b = new a.b()
  {
    public aha a(Context paramAnonymousContext, Looper paramAnonymousLooper, s paramAnonymouss, a.a.b paramAnonymousb, g.b paramAnonymousb1, g.c paramAnonymousc)
    {
      return new aha(paramAnonymousContext, paramAnonymousLooper, paramAnonymouss, paramAnonymousb1, paramAnonymousc);
    }
  };
  public static final com.google.android.gms.common.api.a<a.a.b> c = new com.google.android.gms.common.api.a("ClearcutLogger.API", b, a);
  public static final c d = new agz();
  private final Context e;
  private final String f;
  private final int g;
  private String h;
  private int i = -1;
  private String j;
  private String k;
  private final boolean l;
  private int m = 0;
  private final c n;
  private final e o;
  private final a p;
  private d q;
  private final b r;
  
  public b(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean, c paramc, e parame, d paramd, a parama, b paramb)
  {
    Context localContext = paramContext.getApplicationContext();
    if (localContext != null)
    {
      this.e = localContext;
      this.f = paramContext.getPackageName();
      this.g = a(paramContext);
      this.i = paramInt;
      this.h = paramString1;
      this.j = paramString2;
      this.k = paramString3;
      this.l = paramBoolean;
      this.n = paramc;
      this.o = parame;
      if (paramd == null) {
        break label147;
      }
      label93:
      this.q = paramd;
      this.p = parama;
      this.m = 0;
      this.r = paramb;
      if (this.l) {
        if (this.j != null) {
          break label159;
        }
      }
    }
    label147:
    label159:
    for (paramBoolean = true;; paramBoolean = false)
    {
      d.b(paramBoolean, "can't be anonymous with an upload account");
      return;
      localContext = paramContext;
      break;
      paramd = new d();
      break label93;
    }
  }
  
  public b(Context paramContext, String paramString1, String paramString2)
  {
    this(paramContext, -1, paramString1, paramString2, null, false, d, h.d(), null, a.a, new ahe(paramContext));
  }
  
  private int a(Context paramContext)
  {
    try
    {
      int i1 = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionCode;
      return i1;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      Log.wtf("ClearcutLogger", "This can't happen.");
    }
    return 0;
  }
  
  private static int[] d(ArrayList<Integer> paramArrayList)
  {
    if (paramArrayList == null) {
      return null;
    }
    int[] arrayOfInt = new int[paramArrayList.size()];
    paramArrayList = paramArrayList.iterator();
    int i1 = 0;
    while (paramArrayList.hasNext())
    {
      arrayOfInt[i1] = ((Integer)paramArrayList.next()).intValue();
      i1 += 1;
    }
    return arrayOfInt;
  }
  
  private static String[] e(ArrayList<String> paramArrayList)
  {
    if (paramArrayList == null) {
      return null;
    }
    return (String[])paramArrayList.toArray(new String[0]);
  }
  
  private static byte[][] f(ArrayList<byte[]> paramArrayList)
  {
    if (paramArrayList == null) {
      return null;
    }
    return (byte[][])paramArrayList.toArray(new byte[0][]);
  }
  
  public a a(byte[] paramArrayOfByte)
  {
    return new a(paramArrayOfByte, null);
  }
  
  public class a
  {
    private int b = b.a(b.this);
    private String c = b.b(b.this);
    private String d = b.c(b.this);
    private String e = b.d(b.this);
    private int f = b.e(b.this);
    private final b.c g;
    private ArrayList<Integer> h = null;
    private ArrayList<String> i = null;
    private ArrayList<Integer> j = null;
    private ArrayList<byte[]> k = null;
    private boolean l = true;
    private final ri.d m = new ri.d();
    private boolean n = false;
    
    private a(byte[] paramArrayOfByte)
    {
      this(paramArrayOfByte, null);
    }
    
    private a(byte[] paramArrayOfByte, b.c paramc)
    {
      this.m.a = b.f(b.this).a();
      this.m.b = b.f(b.this).b();
      this.m.v = b.h(b.this).a(b.g(b.this));
      this.m.p = b.i(b.this).a(this.m.a);
      if (paramArrayOfByte != null) {
        this.m.k = paramArrayOfByte;
      }
      this.g = paramc;
    }
    
    public LogEventParcelable a()
    {
      return new LogEventParcelable(new PlayLoggerContext(b.k(b.this), b.l(b.this), this.b, this.c, this.d, this.e, b.j(b.this), this.f), this.m, this.g, null, b.a(null), b.b(null), b.a(null), b.c(null), this.l);
    }
    
    public a a(int paramInt)
    {
      this.m.e = paramInt;
      return this;
    }
    
    public i<Status> a(g paramg)
    {
      if (this.n) {
        throw new IllegalStateException("do not reuse LogEventBuilder");
      }
      this.n = true;
      PlayLoggerContext localPlayLoggerContext = a().b;
      if (b.m(b.this).a(localPlayLoggerContext.h, localPlayLoggerContext.d)) {
        return b.n(b.this).a(paramg, a());
      }
      return j.a(Status.a);
    }
    
    public a b(int paramInt)
    {
      this.m.f = paramInt;
      return this;
    }
  }
  
  public static abstract interface b
  {
    public abstract boolean a(String paramString, int paramInt);
  }
  
  public static abstract interface c
  {
    public abstract byte[] a();
  }
  
  public static class d
  {
    public long a(long paramLong)
    {
      return TimeZone.getDefault().getOffset(paramLong) / 1000;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/clearcut/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */