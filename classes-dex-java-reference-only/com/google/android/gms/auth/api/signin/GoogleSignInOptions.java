package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a.a.d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInOptions
  extends AbstractSafeParcelable
  implements a.a.d, ReflectedParcelable
{
  public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new e();
  public static final Scope a = new Scope("profile");
  public static final Scope b = new Scope("email");
  public static final Scope c = new Scope("openid");
  public static final GoogleSignInOptions d = new a().a().c().d();
  private static Comparator<Scope> m = new Comparator()
  {
    public int a(Scope paramAnonymousScope1, Scope paramAnonymousScope2)
    {
      return paramAnonymousScope1.a().compareTo(paramAnonymousScope2.a());
    }
  };
  final int e;
  private final ArrayList<Scope> f;
  private Account g;
  private boolean h;
  private final boolean i;
  private final boolean j;
  private String k;
  private String l;
  
  GoogleSignInOptions(int paramInt, ArrayList<Scope> paramArrayList, Account paramAccount, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString1, String paramString2)
  {
    this.e = paramInt;
    this.f = paramArrayList;
    this.g = paramAccount;
    this.h = paramBoolean1;
    this.i = paramBoolean2;
    this.j = paramBoolean3;
    this.k = paramString1;
    this.l = paramString2;
  }
  
  private GoogleSignInOptions(Set<Scope> paramSet, Account paramAccount, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString1, String paramString2)
  {
    this(2, new ArrayList(paramSet), paramAccount, paramBoolean1, paramBoolean2, paramBoolean3, paramString1, paramString2);
  }
  
  @Nullable
  public static GoogleSignInOptions a(@Nullable String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    JSONObject localJSONObject = new JSONObject(paramString);
    HashSet localHashSet = new HashSet();
    paramString = localJSONObject.getJSONArray("scopes");
    int i1 = paramString.length();
    int n = 0;
    while (n < i1)
    {
      localHashSet.add(new Scope(paramString.getString(n)));
      n += 1;
    }
    paramString = localJSONObject.optString("accountName", null);
    if (!TextUtils.isEmpty(paramString)) {}
    for (paramString = new Account(paramString, "com.google");; paramString = null) {
      return new GoogleSignInOptions(localHashSet, paramString, localJSONObject.getBoolean("idTokenRequested"), localJSONObject.getBoolean("serverAuthRequested"), localJSONObject.getBoolean("forceCodeForRefreshToken"), localJSONObject.optString("serverClientId", null), localJSONObject.optString("hostedDomain", null));
    }
  }
  
  private JSONObject j()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      JSONArray localJSONArray = new JSONArray();
      Collections.sort(this.f, m);
      Iterator localIterator = this.f.iterator();
      while (localIterator.hasNext()) {
        localJSONArray.put(((Scope)localIterator.next()).a());
      }
      localJSONException.put("scopes", localJSONArray);
    }
    catch (JSONException localJSONException)
    {
      throw new RuntimeException(localJSONException);
    }
    if (this.g != null) {
      localJSONException.put("accountName", this.g.name);
    }
    localJSONException.put("idTokenRequested", this.h);
    localJSONException.put("forceCodeForRefreshToken", this.j);
    localJSONException.put("serverAuthRequested", this.i);
    if (!TextUtils.isEmpty(this.k)) {
      localJSONException.put("serverClientId", this.k);
    }
    if (!TextUtils.isEmpty(this.l)) {
      localJSONException.put("hostedDomain", this.l);
    }
    return localJSONException;
  }
  
  public ArrayList<Scope> a()
  {
    return new ArrayList(this.f);
  }
  
  public Scope[] b()
  {
    return (Scope[])this.f.toArray(new Scope[this.f.size()]);
  }
  
  public Account c()
  {
    return this.g;
  }
  
  public boolean d()
  {
    return this.h;
  }
  
  public boolean e()
  {
    return this.i;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    for (;;)
    {
      return false;
      try
      {
        paramObject = (GoogleSignInOptions)paramObject;
        if ((this.f.size() != ((GoogleSignInOptions)paramObject).a().size()) || (!this.f.containsAll(((GoogleSignInOptions)paramObject).a()))) {
          continue;
        }
        if (this.g == null)
        {
          if (((GoogleSignInOptions)paramObject).c() != null) {
            continue;
          }
          label56:
          if (!TextUtils.isEmpty(this.k)) {
            break label128;
          }
          if (!TextUtils.isEmpty(((GoogleSignInOptions)paramObject).g())) {
            continue;
          }
        }
        while ((this.j == ((GoogleSignInOptions)paramObject).f()) && (this.h == ((GoogleSignInOptions)paramObject).d()) && (this.i == ((GoogleSignInOptions)paramObject).e()))
        {
          return true;
          if (!this.g.equals(((GoogleSignInOptions)paramObject).c())) {
            break;
          }
          break label56;
          label128:
          boolean bool = this.k.equals(((GoogleSignInOptions)paramObject).g());
          if (!bool) {
            break;
          }
        }
        return false;
      }
      catch (ClassCastException paramObject) {}
    }
  }
  
  public boolean f()
  {
    return this.j;
  }
  
  public String g()
  {
    return this.k;
  }
  
  public String h()
  {
    return this.l;
  }
  
  public int hashCode()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.f.iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(((Scope)localIterator.next()).a());
    }
    Collections.sort(localArrayList);
    return new com.google.android.gms.auth.api.signin.internal.d().a(localArrayList).a(this.g).a(this.k).a(this.j).a(this.h).a(this.i).a();
  }
  
  public String i()
  {
    return j().toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    e.a(this, paramParcel, paramInt);
  }
  
  public static final class a
  {
    private Set<Scope> a = new HashSet();
    private boolean b;
    private boolean c;
    private boolean d;
    private String e;
    private Account f;
    private String g;
    
    public a() {}
    
    public a(@NonNull GoogleSignInOptions paramGoogleSignInOptions)
    {
      com.google.android.gms.common.internal.d.a(paramGoogleSignInOptions);
      this.a = new HashSet(GoogleSignInOptions.a(paramGoogleSignInOptions));
      this.b = GoogleSignInOptions.b(paramGoogleSignInOptions);
      this.c = GoogleSignInOptions.c(paramGoogleSignInOptions);
      this.d = GoogleSignInOptions.d(paramGoogleSignInOptions);
      this.e = GoogleSignInOptions.e(paramGoogleSignInOptions);
      this.f = GoogleSignInOptions.f(paramGoogleSignInOptions);
      this.g = GoogleSignInOptions.g(paramGoogleSignInOptions);
    }
    
    private String e(String paramString)
    {
      com.google.android.gms.common.internal.d.a(paramString);
      if ((this.e == null) || (this.e.equals(paramString))) {}
      for (boolean bool = true;; bool = false)
      {
        com.google.android.gms.common.internal.d.b(bool, "two different server client ids provided");
        return paramString;
      }
    }
    
    public a a()
    {
      this.a.add(GoogleSignInOptions.c);
      return this;
    }
    
    public a a(Scope paramScope, Scope... paramVarArgs)
    {
      this.a.add(paramScope);
      this.a.addAll(Arrays.asList(paramVarArgs));
      return this;
    }
    
    public a a(String paramString)
    {
      this.d = true;
      this.e = e(paramString);
      return this;
    }
    
    public a a(String paramString, boolean paramBoolean)
    {
      this.b = true;
      this.e = e(paramString);
      this.c = paramBoolean;
      return this;
    }
    
    public a b()
    {
      this.a.add(GoogleSignInOptions.b);
      return this;
    }
    
    public a b(String paramString)
    {
      return a(paramString, false);
    }
    
    public a c()
    {
      this.a.add(GoogleSignInOptions.a);
      return this;
    }
    
    public a c(String paramString)
    {
      this.f = new Account(com.google.android.gms.common.internal.d.a(paramString), "com.google");
      return this;
    }
    
    public a d(String paramString)
    {
      this.g = com.google.android.gms.common.internal.d.a(paramString);
      return this;
    }
    
    public GoogleSignInOptions d()
    {
      if ((this.d) && ((this.f == null) || (!this.a.isEmpty()))) {
        a();
      }
      return new GoogleSignInOptions(this.a, this.f, this.d, this.b, this.c, this.e, this.g, null);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/GoogleSignInOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */