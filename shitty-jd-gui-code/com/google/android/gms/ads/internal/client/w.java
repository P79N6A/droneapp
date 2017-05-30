package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.internal.aaa;
import java.util.ArrayList;
import java.util.List;

@aaa
public final class w
{
  private long a;
  private Bundle b;
  private int c;
  private List<String> d;
  private boolean e;
  private int f;
  private boolean g;
  private String h;
  private SearchAdRequestParcel i;
  private Location j;
  private String k;
  private Bundle l;
  private Bundle m;
  private List<String> n;
  private String o;
  private String p;
  private boolean q;
  
  public w()
  {
    this.a = -1L;
    this.b = new Bundle();
    this.c = -1;
    this.d = new ArrayList();
    this.e = false;
    this.f = -1;
    this.g = false;
    this.h = null;
    this.i = null;
    this.j = null;
    this.k = null;
    this.l = new Bundle();
    this.m = new Bundle();
    this.n = new ArrayList();
    this.o = null;
    this.p = null;
    this.q = false;
  }
  
  public w(AdRequestParcel paramAdRequestParcel)
  {
    this.a = paramAdRequestParcel.b;
    this.b = paramAdRequestParcel.c;
    this.c = paramAdRequestParcel.d;
    this.d = paramAdRequestParcel.e;
    this.e = paramAdRequestParcel.f;
    this.f = paramAdRequestParcel.g;
    this.g = paramAdRequestParcel.h;
    this.h = paramAdRequestParcel.i;
    this.i = paramAdRequestParcel.j;
    this.j = paramAdRequestParcel.k;
    this.k = paramAdRequestParcel.l;
    this.l = paramAdRequestParcel.m;
    this.m = paramAdRequestParcel.n;
    this.n = paramAdRequestParcel.o;
    this.o = paramAdRequestParcel.p;
    this.p = paramAdRequestParcel.q;
  }
  
  public AdRequestParcel a()
  {
    return new AdRequestParcel(7, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, false);
  }
  
  public w a(@Nullable Location paramLocation)
  {
    this.j = paramLocation;
    return this;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/client/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */