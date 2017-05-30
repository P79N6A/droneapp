package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInAccount
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new d();
  public static e a = h.d();
  private static Comparator<Scope> n = new Comparator()
  {
    public int a(Scope paramAnonymousScope1, Scope paramAnonymousScope2)
    {
      return paramAnonymousScope1.a().compareTo(paramAnonymousScope2.a());
    }
  };
  final int b;
  List<Scope> c;
  private String d;
  private String e;
  private String f;
  private String g;
  private Uri h;
  private String i;
  private long j;
  private String k;
  private String l;
  private String m;
  
  GoogleSignInAccount(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Uri paramUri, String paramString5, long paramLong, String paramString6, List<Scope> paramList, String paramString7, String paramString8)
  {
    this.b = paramInt;
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramString3;
    this.g = paramString4;
    this.h = paramUri;
    this.i = paramString5;
    this.j = paramLong;
    this.k = paramString6;
    this.c = paramList;
    this.l = paramString7;
    this.m = paramString8;
  }
  
  @Nullable
  public static GoogleSignInAccount a(@Nullable String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    JSONObject localJSONObject = new JSONObject(paramString);
    paramString = localJSONObject.optString("photoUrl", null);
    if (!TextUtils.isEmpty(paramString)) {}
    for (paramString = Uri.parse(paramString);; paramString = null)
    {
      long l1 = Long.parseLong(localJSONObject.getString("expirationTime"));
      HashSet localHashSet = new HashSet();
      JSONArray localJSONArray = localJSONObject.getJSONArray("grantedScopes");
      int i2 = localJSONArray.length();
      int i1 = 0;
      while (i1 < i2)
      {
        localHashSet.add(new Scope(localJSONArray.getString(i1)));
        i1 += 1;
      }
      return a(localJSONObject.optString("id"), localJSONObject.optString("tokenId", null), localJSONObject.optString("email", null), localJSONObject.optString("displayName", null), localJSONObject.optString("givenName", null), localJSONObject.optString("familyName", null), paramString, Long.valueOf(l1), localJSONObject.getString("obfuscatedIdentifier"), localHashSet).b(localJSONObject.optString("serverAuthCode", null));
    }
  }
  
  public static GoogleSignInAccount a(@Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3, @Nullable String paramString4, @Nullable String paramString5, @Nullable String paramString6, @Nullable Uri paramUri, @Nullable Long paramLong, @NonNull String paramString7, @NonNull Set<Scope> paramSet)
  {
    Long localLong = paramLong;
    if (paramLong == null) {
      localLong = Long.valueOf(a.a() / 1000L);
    }
    return new GoogleSignInAccount(3, paramString1, paramString2, paramString3, paramString4, paramUri, null, localLong.longValue(), com.google.android.gms.common.internal.d.a(paramString7), new ArrayList((Collection)com.google.android.gms.common.internal.d.a(paramSet)), paramString5, paramString6);
  }
  
  private JSONObject o()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      if (a() != null) {
        localJSONObject.put("id", a());
      }
      if (b() != null) {
        localJSONObject.put("tokenId", b());
      }
      if (c() != null) {
        localJSONObject.put("email", c());
      }
      if (d() != null) {
        localJSONObject.put("displayName", d());
      }
      if (e() != null) {
        localJSONObject.put("givenName", e());
      }
      if (f() != null) {
        localJSONObject.put("familyName", f());
      }
      if (g() != null) {
        localJSONObject.put("photoUrl", g().toString());
      }
      if (h() != null) {
        localJSONObject.put("serverAuthCode", h());
      }
      localJSONObject.put("expirationTime", this.j);
      localJSONObject.put("obfuscatedIdentifier", k());
      JSONArray localJSONArray = new JSONArray();
      Collections.sort(this.c, n);
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext()) {
        localJSONArray.put(((Scope)localIterator.next()).a());
      }
      localJSONException.put("grantedScopes", localJSONArray);
    }
    catch (JSONException localJSONException)
    {
      throw new RuntimeException(localJSONException);
    }
    return localJSONException;
  }
  
  @Nullable
  public String a()
  {
    return this.d;
  }
  
  public GoogleSignInAccount b(String paramString)
  {
    this.i = paramString;
    return this;
  }
  
  @Nullable
  public String b()
  {
    return this.e;
  }
  
  @Nullable
  public String c()
  {
    return this.f;
  }
  
  @Nullable
  public String d()
  {
    return this.g;
  }
  
  @Nullable
  public String e()
  {
    return this.l;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof GoogleSignInAccount)) {
      return false;
    }
    return ((GoogleSignInAccount)paramObject).m().equals(m());
  }
  
  @Nullable
  public String f()
  {
    return this.m;
  }
  
  @Nullable
  public Uri g()
  {
    return this.h;
  }
  
  @Nullable
  public String h()
  {
    return this.i;
  }
  
  public int hashCode()
  {
    return m().hashCode();
  }
  
  public long i()
  {
    return this.j;
  }
  
  public boolean j()
  {
    return a.a() / 1000L >= this.j - 300L;
  }
  
  @NonNull
  public String k()
  {
    return this.k;
  }
  
  @NonNull
  public Set<Scope> l()
  {
    return new HashSet(this.c);
  }
  
  public String m()
  {
    return o().toString();
  }
  
  public String n()
  {
    JSONObject localJSONObject = o();
    localJSONObject.remove("serverAuthCode");
    return localJSONObject.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    d.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/GoogleSignInAccount.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */