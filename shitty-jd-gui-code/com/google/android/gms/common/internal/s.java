package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g.a;
import com.google.android.gms.internal.aom;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class s
{
  private final Account a;
  private final Set<Scope> b;
  private final Set<Scope> c;
  private final Map<a<?>, a> d;
  private final int e;
  private final View f;
  private final String g;
  private final String h;
  private final aom i;
  private Integer j;
  
  public s(Account paramAccount, Set<Scope> paramSet, Map<a<?>, a> paramMap, int paramInt, View paramView, String paramString1, String paramString2, aom paramaom)
  {
    this.a = paramAccount;
    if (paramSet == null) {}
    for (paramAccount = Collections.EMPTY_SET;; paramAccount = Collections.unmodifiableSet(paramSet))
    {
      this.b = paramAccount;
      paramAccount = paramMap;
      if (paramMap == null) {
        paramAccount = Collections.EMPTY_MAP;
      }
      this.d = paramAccount;
      this.f = paramView;
      this.e = paramInt;
      this.g = paramString1;
      this.h = paramString2;
      this.i = paramaom;
      paramAccount = new HashSet(this.b);
      paramSet = this.d.values().iterator();
      while (paramSet.hasNext()) {
        paramAccount.addAll(((a)paramSet.next()).a);
      }
    }
    this.c = Collections.unmodifiableSet(paramAccount);
  }
  
  public static s a(Context paramContext)
  {
    return new g.a(paramContext).b();
  }
  
  @Deprecated
  public String a()
  {
    if (this.a != null) {
      return this.a.name;
    }
    return null;
  }
  
  public Set<Scope> a(a<?> parama)
  {
    parama = (a)this.d.get(parama);
    if ((parama == null) || (parama.a.isEmpty())) {
      return this.b;
    }
    HashSet localHashSet = new HashSet(this.b);
    localHashSet.addAll(parama.a);
    return localHashSet;
  }
  
  public void a(Integer paramInteger)
  {
    this.j = paramInteger;
  }
  
  public Account b()
  {
    return this.a;
  }
  
  public Account c()
  {
    if (this.a != null) {
      return this.a;
    }
    return new Account("<<default account>>", "com.google");
  }
  
  public int d()
  {
    return this.e;
  }
  
  public Set<Scope> e()
  {
    return this.b;
  }
  
  public Set<Scope> f()
  {
    return this.c;
  }
  
  public Map<a<?>, a> g()
  {
    return this.d;
  }
  
  public String h()
  {
    return this.g;
  }
  
  public String i()
  {
    return this.h;
  }
  
  public View j()
  {
    return this.f;
  }
  
  public aom k()
  {
    return this.i;
  }
  
  public Integer l()
  {
    return this.j;
  }
  
  public static final class a
  {
    public final Set<Scope> a;
    public final boolean b;
    
    public a(Set<Scope> paramSet, boolean paramBoolean)
    {
      d.a(paramSet);
      this.a = Collections.unmodifiableSet(paramSet);
      this.b = paramBoolean;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/internal/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */