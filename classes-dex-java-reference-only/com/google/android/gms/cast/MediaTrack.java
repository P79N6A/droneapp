package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.cast.internal.f;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.p;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaTrack
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<MediaTrack> CREATOR = new q();
  public static final int a = 0;
  public static final int b = 1;
  public static final int c = 2;
  public static final int d = 3;
  public static final int e = -1;
  public static final int f = 0;
  public static final int g = 1;
  public static final int h = 2;
  public static final int i = 3;
  public static final int j = 4;
  public static final int k = 5;
  String l;
  private final int m;
  private long n;
  private int o;
  private String p;
  private String q;
  private String r;
  private String s;
  private int t;
  private JSONObject u;
  
  MediaTrack(int paramInt1, long paramLong, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt3, String paramString5)
  {
    this.m = paramInt1;
    this.n = paramLong;
    this.o = paramInt2;
    this.p = paramString1;
    this.q = paramString2;
    this.r = paramString3;
    this.s = paramString4;
    this.t = paramInt3;
    this.l = paramString5;
    if (this.l != null) {
      try
      {
        this.u = new JSONObject(this.l);
        return;
      }
      catch (JSONException paramString1)
      {
        this.u = null;
        this.l = null;
        return;
      }
    }
    this.u = null;
  }
  
  MediaTrack(long paramLong, int paramInt)
  {
    this(1, 0L, 0, null, null, null, null, -1, null);
    this.n = paramLong;
    if ((paramInt <= 0) || (paramInt > 3)) {
      throw new IllegalArgumentException(24 + "invalid type " + paramInt);
    }
    this.o = paramInt;
  }
  
  MediaTrack(JSONObject paramJSONObject)
  {
    this(1, 0L, 0, null, null, null, null, -1, null);
    b(paramJSONObject);
  }
  
  private void b(JSONObject paramJSONObject)
  {
    this.n = paramJSONObject.getLong("trackId");
    String str = paramJSONObject.getString("type");
    if ("TEXT".equals(str))
    {
      this.o = 1;
      this.p = paramJSONObject.optString("trackContentId", null);
      this.q = paramJSONObject.optString("trackContentType", null);
      this.r = paramJSONObject.optString("name", null);
      this.s = paramJSONObject.optString("language", null);
      if (!paramJSONObject.has("subtype")) {
        break label300;
      }
      str = paramJSONObject.getString("subtype");
      if (!"SUBTITLES".equals(str)) {
        break label191;
      }
      this.t = 1;
    }
    for (;;)
    {
      this.u = paramJSONObject.optJSONObject("customData");
      return;
      if ("AUDIO".equals(str))
      {
        this.o = 2;
        break;
      }
      if ("VIDEO".equals(str))
      {
        this.o = 3;
        break;
      }
      paramJSONObject = String.valueOf(str);
      if (paramJSONObject.length() != 0) {}
      for (paramJSONObject = "invalid type: ".concat(paramJSONObject);; paramJSONObject = new String("invalid type: ")) {
        throw new JSONException(paramJSONObject);
      }
      label191:
      if ("CAPTIONS".equals(str))
      {
        this.t = 2;
      }
      else if ("DESCRIPTIONS".equals(str))
      {
        this.t = 3;
      }
      else if ("CHAPTERS".equals(str))
      {
        this.t = 4;
      }
      else if ("METADATA".equals(str))
      {
        this.t = 5;
      }
      else
      {
        paramJSONObject = String.valueOf(str);
        if (paramJSONObject.length() != 0) {}
        for (paramJSONObject = "invalid subtype: ".concat(paramJSONObject);; paramJSONObject = new String("invalid subtype: ")) {
          throw new JSONException(paramJSONObject);
        }
        label300:
        this.t = 0;
      }
    }
  }
  
  int a()
  {
    return this.m;
  }
  
  void a(int paramInt)
  {
    if ((paramInt <= -1) || (paramInt > 5)) {
      throw new IllegalArgumentException(27 + "invalid subtype " + paramInt);
    }
    if ((paramInt != 0) && (this.o != 1)) {
      throw new IllegalArgumentException("subtypes are only valid for text tracks");
    }
    this.t = paramInt;
  }
  
  public void a(String paramString)
  {
    this.p = paramString;
  }
  
  void a(JSONObject paramJSONObject)
  {
    this.u = paramJSONObject;
  }
  
  public long b()
  {
    return this.n;
  }
  
  public void b(String paramString)
  {
    this.q = paramString;
  }
  
  public int c()
  {
    return this.o;
  }
  
  void c(String paramString)
  {
    this.r = paramString;
  }
  
  public String d()
  {
    return this.p;
  }
  
  void d(String paramString)
  {
    this.s = paramString;
  }
  
  public String e()
  {
    return this.q;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = true;
    boolean bool3 = false;
    if (this == paramObject) {
      bool1 = true;
    }
    int i1;
    int i2;
    label51:
    do
    {
      do
      {
        do
        {
          return bool1;
          bool1 = bool3;
        } while (!(paramObject instanceof MediaTrack));
        paramObject = (MediaTrack)paramObject;
        if (this.u != null) {
          break;
        }
        i1 = 1;
        if (((MediaTrack)paramObject).u != null) {
          break label194;
        }
        i2 = 1;
        bool1 = bool3;
      } while (i1 != i2);
      if ((this.u == null) || (((MediaTrack)paramObject).u == null)) {
        break;
      }
      bool1 = bool3;
    } while (!p.a(this.u, ((MediaTrack)paramObject).u));
    if ((this.n == ((MediaTrack)paramObject).n) && (this.o == ((MediaTrack)paramObject).o) && (f.a(this.p, ((MediaTrack)paramObject).p)) && (f.a(this.q, ((MediaTrack)paramObject).q)) && (f.a(this.r, ((MediaTrack)paramObject).r)) && (f.a(this.s, ((MediaTrack)paramObject).s)) && (this.t == ((MediaTrack)paramObject).t)) {}
    for (boolean bool1 = bool2;; bool1 = false)
    {
      return bool1;
      i1 = 0;
      break;
      label194:
      i2 = 0;
      break label51;
    }
  }
  
  public String f()
  {
    return this.r;
  }
  
  public String g()
  {
    return this.s;
  }
  
  public int h()
  {
    return this.t;
  }
  
  public int hashCode()
  {
    return c.a(new Object[] { Long.valueOf(this.n), Integer.valueOf(this.o), this.p, this.q, this.r, this.s, Integer.valueOf(this.t), this.u });
  }
  
  public JSONObject i()
  {
    return this.u;
  }
  
  public JSONObject j()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("trackId", this.n);
      switch (this.o)
      {
      case 1: 
        if (this.p != null) {
          localJSONObject.put("trackContentId", this.p);
        }
        if (this.q != null) {
          localJSONObject.put("trackContentType", this.q);
        }
        if (this.r != null) {
          localJSONObject.put("name", this.r);
        }
        if (!TextUtils.isEmpty(this.s)) {
          localJSONObject.put("language", this.s);
        }
        switch (this.t)
        {
        }
        break;
      }
      for (;;)
      {
        if (this.u == null) {
          break label282;
        }
        localJSONObject.put("customData", this.u);
        return localJSONObject;
        localJSONObject.put("type", "TEXT");
        break;
        localJSONObject.put("type", "AUDIO");
        break;
        localJSONObject.put("type", "VIDEO");
        break;
        localJSONObject.put("subtype", "SUBTITLES");
        continue;
        localJSONObject.put("subtype", "CAPTIONS");
        continue;
        localJSONObject.put("subtype", "DESCRIPTIONS");
        continue;
        localJSONObject.put("subtype", "CHAPTERS");
        continue;
        localJSONObject.put("subtype", "METADATA");
        continue;
        break;
      }
      label282:
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return localJSONObject;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (this.u == null) {}
    for (String str = null;; str = this.u.toString())
    {
      this.l = str;
      q.a(this, paramParcel, paramInt);
      return;
    }
  }
  
  public static class a
  {
    private final MediaTrack a;
    
    public a(long paramLong, int paramInt)
    {
      this.a = new MediaTrack(paramLong, paramInt);
    }
    
    public a a(int paramInt)
    {
      this.a.a(paramInt);
      return this;
    }
    
    public a a(String paramString)
    {
      this.a.a(paramString);
      return this;
    }
    
    public a a(Locale paramLocale)
    {
      this.a.d(f.a(paramLocale));
      return this;
    }
    
    public a a(JSONObject paramJSONObject)
    {
      this.a.a(paramJSONObject);
      return this;
    }
    
    public MediaTrack a()
    {
      return this.a;
    }
    
    public a b(String paramString)
    {
      this.a.b(paramString);
      return this;
    }
    
    public a c(String paramString)
    {
      this.a.c(paramString);
      return this;
    }
    
    public a d(String paramString)
    {
      this.a.d(paramString);
      return this;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/MediaTrack.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */