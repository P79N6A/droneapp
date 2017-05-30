package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

@aaa
public class abj
{
  private final abl a;
  private final LinkedList<a> b;
  private final Object c = new Object();
  private final String d;
  private final String e;
  private long f = -1L;
  private long g = -1L;
  private boolean h = false;
  private long i = -1L;
  private long j = 0L;
  private long k = -1L;
  private long l = -1L;
  
  public abj(abl paramabl, String paramString1, String paramString2)
  {
    this.a = paramabl;
    this.d = paramString1;
    this.e = paramString2;
    this.b = new LinkedList();
  }
  
  public abj(String paramString1, String paramString2)
  {
    this(u.i(), paramString1, paramString2);
  }
  
  public void a()
  {
    synchronized (this.c)
    {
      if ((this.l != -1L) && (this.g == -1L))
      {
        this.g = SystemClock.elapsedRealtime();
        this.a.a(this);
      }
      this.a.d().c();
      return;
    }
  }
  
  public void a(long paramLong)
  {
    synchronized (this.c)
    {
      this.l = paramLong;
      if (this.l != -1L) {
        this.a.a(this);
      }
      return;
    }
  }
  
  public void a(AdRequestParcel paramAdRequestParcel)
  {
    synchronized (this.c)
    {
      this.k = SystemClock.elapsedRealtime();
      this.a.d().a(paramAdRequestParcel, this.k);
      return;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    synchronized (this.c)
    {
      if (this.l != -1L)
      {
        this.i = SystemClock.elapsedRealtime();
        if (!paramBoolean)
        {
          this.g = this.i;
          this.a.a(this);
        }
      }
      return;
    }
  }
  
  public void b()
  {
    synchronized (this.c)
    {
      if (this.l != -1L)
      {
        a locala = new a();
        locala.c();
        this.b.add(locala);
        this.j += 1L;
        this.a.d().b();
        this.a.a(this);
      }
      return;
    }
  }
  
  public void b(long paramLong)
  {
    synchronized (this.c)
    {
      if (this.l != -1L)
      {
        this.f = paramLong;
        this.a.a(this);
      }
      return;
    }
  }
  
  public void b(boolean paramBoolean)
  {
    synchronized (this.c)
    {
      if (this.l != -1L)
      {
        this.h = paramBoolean;
        this.a.a(this);
      }
      return;
    }
  }
  
  public void c()
  {
    synchronized (this.c)
    {
      if ((this.l != -1L) && (!this.b.isEmpty()))
      {
        a locala = (a)this.b.getLast();
        if (locala.a() == -1L)
        {
          locala.b();
          this.a.a(this);
        }
      }
      return;
    }
  }
  
  public Bundle d()
  {
    ArrayList localArrayList;
    synchronized (this.c)
    {
      Bundle localBundle1 = new Bundle();
      localBundle1.putString("seq_num", this.d);
      localBundle1.putString("slotid", this.e);
      localBundle1.putBoolean("ismediation", this.h);
      localBundle1.putLong("treq", this.k);
      localBundle1.putLong("tresponse", this.l);
      localBundle1.putLong("timp", this.g);
      localBundle1.putLong("tload", this.i);
      localBundle1.putLong("pcc", this.j);
      localBundle1.putLong("tfetch", this.f);
      localArrayList = new ArrayList();
      Iterator localIterator = this.b.iterator();
      if (localIterator.hasNext()) {
        localArrayList.add(((a)localIterator.next()).d());
      }
    }
    localBundle2.putParcelableArrayList("tclick", localArrayList);
    return localBundle2;
  }
  
  @aaa
  private static final class a
  {
    private long a = -1L;
    private long b = -1L;
    
    public long a()
    {
      return this.b;
    }
    
    public void b()
    {
      this.b = SystemClock.elapsedRealtime();
    }
    
    public void c()
    {
      this.a = SystemClock.elapsedRealtime();
    }
    
    public Bundle d()
    {
      Bundle localBundle = new Bundle();
      localBundle.putLong("topen", this.a);
      localBundle.putLong("tclose", this.b);
      return localBundle;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/abj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */