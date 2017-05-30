package com.google.android.gms.fitness;

import android.content.Intent;
import android.os.Build.VERSION;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a.a.b;
import com.google.android.gms.internal.ako;
import com.google.android.gms.internal.akp;
import com.google.android.gms.internal.akq;
import com.google.android.gms.internal.akr;
import com.google.android.gms.internal.aks;
import com.google.android.gms.internal.akt;
import com.google.android.gms.internal.aku;
import com.google.android.gms.internal.akv;
import com.google.android.gms.internal.als;
import com.google.android.gms.internal.alt;
import com.google.android.gms.internal.alu;
import com.google.android.gms.internal.alv;
import com.google.android.gms.internal.alw;
import com.google.android.gms.internal.alx;
import com.google.android.gms.internal.aly;
import com.google.android.gms.internal.alz;
import com.google.android.gms.internal.ama;
import com.google.android.gms.internal.amc;
import java.util.concurrent.TimeUnit;

public class c
{
  public static final String A = "vnd.google.fitness.VIEW";
  public static final String B = "vnd.google.fitness.VIEW_GOAL";
  public static final String C = "vnd.google.fitness.start_time";
  public static final String D = "vnd.google.fitness.end_time";
  @Deprecated
  public static final Void a = null;
  public static final com.google.android.gms.common.api.a<a.a.b> b = aku.e;
  public static final h c = new alz();
  public static final com.google.android.gms.common.api.a<a.a.b> d = akt.e;
  public static final g e = new aly();
  public static final com.google.android.gms.common.api.a<a.a.b> f = akv.e;
  public static final i g = new ama();
  public static final com.google.android.gms.common.api.a<a.a.b> h = akr.e;
  public static final f i = new alw();
  public static final com.google.android.gms.common.api.a<a.a.b> j = akq.e;
  public static final k k = new alv();
  public static final com.google.android.gms.common.api.a<a.a.b> l = akp.e;
  public static final b m = new alu();
  public static final com.google.android.gms.common.api.a<a.a.b> n = ako.e;
  public static final a o = a();
  public static final com.google.android.gms.common.api.a<a.a.b> p = aks.e;
  public static final als q = new alx();
  public static final Scope r = new Scope("https://www.googleapis.com/auth/fitness.activity.read");
  public static final Scope s = new Scope("https://www.googleapis.com/auth/fitness.activity.write");
  public static final Scope t = new Scope("https://www.googleapis.com/auth/fitness.location.read");
  public static final Scope u = new Scope("https://www.googleapis.com/auth/fitness.location.write");
  public static final Scope v = new Scope("https://www.googleapis.com/auth/fitness.body.read");
  public static final Scope w = new Scope("https://www.googleapis.com/auth/fitness.body.write");
  public static final Scope x = new Scope("https://www.googleapis.com/auth/fitness.nutrition.read");
  public static final Scope y = new Scope("https://www.googleapis.com/auth/fitness.nutrition.write");
  public static final String z = "vnd.google.fitness.TRACK";
  
  public static long a(Intent paramIntent, TimeUnit paramTimeUnit)
  {
    long l1 = paramIntent.getLongExtra("vnd.google.fitness.start_time", -1L);
    if (l1 == -1L) {
      return -1L;
    }
    return paramTimeUnit.convert(l1, TimeUnit.MILLISECONDS);
  }
  
  private static a a()
  {
    if (Build.VERSION.SDK_INT >= 18) {
      return new alt();
    }
    return new amc();
  }
  
  public static long b(Intent paramIntent, TimeUnit paramTimeUnit)
  {
    long l1 = paramIntent.getLongExtra("vnd.google.fitness.end_time", -1L);
    if (l1 == -1L) {
      return -1L;
    }
    return paramTimeUnit.convert(l1, TimeUnit.MILLISECONDS);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/fitness/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */