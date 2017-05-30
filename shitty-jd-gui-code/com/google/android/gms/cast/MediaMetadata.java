package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.agt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class MediaMetadata
  extends AbstractSafeParcelable
{
  public static final String A = "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE";
  private static final String[] B = { null, "String", "int", "double", "ISO-8601 date String" };
  private static final a C = new a().a("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4).a("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4).a("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4).a("com.google.android.gms.cast.metadata.TITLE", "title", 1).a("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1).a("com.google.android.gms.cast.metadata.ARTIST", "artist", 1).a("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1).a("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1).a("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1).a("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2).a("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2).a("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2).a("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2).a("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1).a("com.google.android.gms.cast.metadata.STUDIO", "studio", 1).a("com.google.android.gms.cast.metadata.WIDTH", "width", 2).a("com.google.android.gms.cast.metadata.HEIGHT", "height", 2).a("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1).a("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3).a("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);
  public static final Parcelable.Creator<MediaMetadata> CREATOR = new n();
  public static final int a = 0;
  public static final int b = 1;
  public static final int c = 2;
  public static final int d = 3;
  public static final int e = 4;
  public static final int f = 100;
  public static final String h = "com.google.android.gms.cast.metadata.CREATION_DATE";
  public static final String i = "com.google.android.gms.cast.metadata.RELEASE_DATE";
  public static final String j = "com.google.android.gms.cast.metadata.BROADCAST_DATE";
  public static final String k = "com.google.android.gms.cast.metadata.TITLE";
  public static final String l = "com.google.android.gms.cast.metadata.SUBTITLE";
  public static final String m = "com.google.android.gms.cast.metadata.ARTIST";
  public static final String n = "com.google.android.gms.cast.metadata.ALBUM_ARTIST";
  public static final String o = "com.google.android.gms.cast.metadata.ALBUM_TITLE";
  public static final String p = "com.google.android.gms.cast.metadata.COMPOSER";
  public static final String q = "com.google.android.gms.cast.metadata.DISC_NUMBER";
  public static final String r = "com.google.android.gms.cast.metadata.TRACK_NUMBER";
  public static final String s = "com.google.android.gms.cast.metadata.SEASON_NUMBER";
  public static final String t = "com.google.android.gms.cast.metadata.EPISODE_NUMBER";
  public static final String u = "com.google.android.gms.cast.metadata.SERIES_TITLE";
  public static final String v = "com.google.android.gms.cast.metadata.STUDIO";
  public static final String w = "com.google.android.gms.cast.metadata.WIDTH";
  public static final String x = "com.google.android.gms.cast.metadata.HEIGHT";
  public static final String y = "com.google.android.gms.cast.metadata.LOCATION_NAME";
  public static final String z = "com.google.android.gms.cast.metadata.LOCATION_LATITUDE";
  private final int D;
  private final List<WebImage> E;
  private int F;
  final Bundle g;
  
  public MediaMetadata()
  {
    this(0);
  }
  
  public MediaMetadata(int paramInt)
  {
    this(1, new ArrayList(), new Bundle(), paramInt);
  }
  
  MediaMetadata(int paramInt1, List<WebImage> paramList, Bundle paramBundle, int paramInt2)
  {
    this.D = paramInt1;
    this.E = paramList;
    this.g = paramBundle;
    this.F = paramInt2;
  }
  
  private void a(JSONObject paramJSONObject, String... paramVarArgs)
  {
    try
    {
      int i2 = paramVarArgs.length;
      int i1 = 0;
      String str;
      if (i1 < i2)
      {
        str = paramVarArgs[i1];
        if (!this.g.containsKey(str)) {}
      }
      else
      {
        switch (C.c(str))
        {
        case 1: 
        case 4: 
          paramJSONObject.put(C.a(str), this.g.getString(str));
          break;
        case 2: 
          paramJSONObject.put(C.a(str), this.g.getInt(str));
          break;
        case 3: 
          paramJSONObject.put(C.a(str), this.g.getDouble(str));
          break;
          paramVarArgs = this.g.keySet().iterator();
          while (paramVarArgs.hasNext())
          {
            str = (String)paramVarArgs.next();
            if (!str.startsWith("com.google."))
            {
              Object localObject = this.g.get(str);
              if ((localObject instanceof String)) {
                paramJSONObject.put(str, localObject);
              } else if ((localObject instanceof Integer)) {
                paramJSONObject.put(str, localObject);
              } else if ((localObject instanceof Double)) {
                paramJSONObject.put(str, localObject);
              }
            }
          }
        }
      }
      for (;;)
      {
        i1 += 1;
        break;
      }
      return;
    }
    catch (JSONException paramJSONObject) {}
  }
  
  private boolean a(Bundle paramBundle1, Bundle paramBundle2)
  {
    if (paramBundle1.size() != paramBundle2.size()) {
      return false;
    }
    Iterator localIterator = paramBundle1.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject1 = paramBundle1.get(str);
      Object localObject2 = paramBundle2.get(str);
      if (((localObject1 instanceof Bundle)) && ((localObject2 instanceof Bundle)) && (!a((Bundle)localObject1, (Bundle)localObject2))) {
        return false;
      }
      if (localObject1 == null)
      {
        if ((localObject2 != null) || (!paramBundle2.containsKey(str))) {
          return false;
        }
      }
      else if (!localObject1.equals(localObject2)) {
        return false;
      }
    }
    return true;
  }
  
  private void b(String paramString, int paramInt)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("null and empty keys are not allowed");
    }
    int i1 = C.c(paramString);
    if ((i1 != paramInt) && (i1 != 0))
    {
      String str = String.valueOf(B[paramInt]);
      throw new IllegalArgumentException(String.valueOf(paramString).length() + 21 + String.valueOf(str).length() + "Value for " + paramString + " must be a " + str);
    }
  }
  
  private void b(JSONObject paramJSONObject, String... paramVarArgs)
  {
    paramVarArgs = new HashSet(Arrays.asList(paramVarArgs));
    try
    {
      Iterator localIterator = paramJSONObject.keys();
      while (localIterator.hasNext())
      {
        Object localObject1 = (String)localIterator.next();
        if (!"metadataType".equals(localObject1))
        {
          Object localObject2 = C.b((String)localObject1);
          if (localObject2 != null)
          {
            boolean bool = paramVarArgs.contains(localObject2);
            if (!bool) {}
          }
          else
          {
            try
            {
              localObject1 = paramJSONObject.get((String)localObject1);
              if (localObject1 != null) {
                switch (C.c((String)localObject2))
                {
                case 1: 
                  if ((localObject1 instanceof String)) {
                    this.g.putString((String)localObject2, (String)localObject1);
                  }
                  break;
                case 4: 
                  if (((localObject1 instanceof String)) && (agt.a((String)localObject1) != null)) {
                    this.g.putString((String)localObject2, (String)localObject1);
                  }
                  break;
                case 2: 
                  if ((localObject1 instanceof Integer)) {
                    this.g.putInt((String)localObject2, ((Integer)localObject1).intValue());
                  }
                  break;
                case 3: 
                  if ((localObject1 instanceof Double))
                  {
                    this.g.putDouble((String)localObject2, ((Double)localObject1).doubleValue());
                    continue;
                    localObject2 = paramJSONObject.get((String)localObject1);
                    if ((localObject2 instanceof String)) {
                      this.g.putString((String)localObject1, (String)localObject2);
                    } else if ((localObject2 instanceof Integer)) {
                      this.g.putInt((String)localObject1, ((Integer)localObject2).intValue());
                    } else if ((localObject2 instanceof Double)) {
                      this.g.putDouble((String)localObject1, ((Double)localObject2).doubleValue());
                    }
                  }
                  break;
                }
              }
            }
            catch (JSONException localJSONException) {}
          }
        }
      }
      return;
    }
    catch (JSONException paramJSONObject) {}
  }
  
  int a()
  {
    return this.D;
  }
  
  public void a(WebImage paramWebImage)
  {
    this.E.add(paramWebImage);
  }
  
  public void a(String paramString, double paramDouble)
  {
    b(paramString, 3);
    this.g.putDouble(paramString, paramDouble);
  }
  
  public void a(String paramString, int paramInt)
  {
    b(paramString, 2);
    this.g.putInt(paramString, paramInt);
  }
  
  public void a(String paramString1, String paramString2)
  {
    b(paramString1, 1);
    this.g.putString(paramString1, paramString2);
  }
  
  public void a(String paramString, Calendar paramCalendar)
  {
    b(paramString, 4);
    this.g.putString(paramString, agt.a(paramCalendar));
  }
  
  public void a(JSONObject paramJSONObject)
  {
    c();
    this.F = 0;
    try
    {
      this.F = paramJSONObject.getInt("metadataType");
      agt.a(this.E, paramJSONObject);
      switch (this.F)
      {
      default: 
        b(paramJSONObject, new String[0]);
        return;
      case 0: 
        b(paramJSONObject, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE" });
        return;
      case 1: 
        b(paramJSONObject, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE" });
        return;
      case 2: 
        b(paramJSONObject, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE" });
        return;
      case 3: 
        b(paramJSONObject, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE" });
        return;
      }
      b(paramJSONObject, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE" });
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
  }
  
  public boolean a(String paramString)
  {
    return this.g.containsKey(paramString);
  }
  
  public int b()
  {
    return this.F;
  }
  
  public String b(String paramString)
  {
    b(paramString, 1);
    return this.g.getString(paramString);
  }
  
  public int c(String paramString)
  {
    b(paramString, 2);
    return this.g.getInt(paramString);
  }
  
  public void c()
  {
    this.g.clear();
    this.E.clear();
  }
  
  public double d(String paramString)
  {
    b(paramString, 3);
    return this.g.getDouble(paramString);
  }
  
  public Set<String> d()
  {
    return this.g.keySet();
  }
  
  public Calendar e(String paramString)
  {
    b(paramString, 4);
    paramString = this.g.getString(paramString);
    if (paramString != null) {
      return agt.a(paramString);
    }
    return null;
  }
  
  public JSONObject e()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("metadataType", this.F);
      agt.a(localJSONObject, this.E);
      switch (this.F)
      {
      default: 
        a(localJSONObject, new String[0]);
        return localJSONObject;
      case 0: 
        a(localJSONObject, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE" });
        return localJSONObject;
      case 1: 
        a(localJSONObject, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE" });
        return localJSONObject;
      case 2: 
        a(localJSONObject, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE" });
        return localJSONObject;
      case 3: 
        a(localJSONObject, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE" });
        return localJSONObject;
      }
      a(localJSONObject, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE" });
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof MediaMetadata)) {
        return false;
      }
      paramObject = (MediaMetadata)paramObject;
    } while ((a(this.g, ((MediaMetadata)paramObject).g)) && (this.E.equals(((MediaMetadata)paramObject).E)));
    return false;
  }
  
  public String f(String paramString)
  {
    b(paramString, 4);
    return this.g.getString(paramString);
  }
  
  public List<WebImage> f()
  {
    return this.E;
  }
  
  public boolean g()
  {
    return (this.E != null) && (!this.E.isEmpty());
  }
  
  public void h()
  {
    this.E.clear();
  }
  
  public int hashCode()
  {
    Iterator localIterator = this.g.keySet().iterator();
    String str;
    for (int i1 = 17; localIterator.hasNext(); i1 = this.g.get(str).hashCode() + i1 * 31) {
      str = (String)localIterator.next();
    }
    return i1 * 31 + this.E.hashCode();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    n.a(this, paramParcel, paramInt);
  }
  
  private static class a
  {
    private final Map<String, String> a = new HashMap();
    private final Map<String, String> b = new HashMap();
    private final Map<String, Integer> c = new HashMap();
    
    public a a(String paramString1, String paramString2, int paramInt)
    {
      this.a.put(paramString1, paramString2);
      this.b.put(paramString2, paramString1);
      this.c.put(paramString1, Integer.valueOf(paramInt));
      return this;
    }
    
    public String a(String paramString)
    {
      return (String)this.a.get(paramString);
    }
    
    public String b(String paramString)
    {
      return (String)this.b.get(paramString);
    }
    
    public int c(String paramString)
    {
      paramString = (Integer)this.c.get(paramString);
      if (paramString != null) {
        return paramString.intValue();
      }
      return 0;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/MediaMetadata.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */