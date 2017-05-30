package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.cast.internal.f;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaInfo
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<MediaInfo> CREATOR = new m();
  public static final int a = 0;
  public static final int b = 1;
  public static final int c = 2;
  public static final int d = -1;
  public static final long e = -1L;
  String f;
  private final int g;
  private final String h;
  private int i;
  private String j;
  private MediaMetadata k;
  private long l;
  private List<MediaTrack> m;
  private TextTrackStyle n;
  private List<AdBreakInfo> o;
  private JSONObject p;
  
  MediaInfo(int paramInt1, String paramString1, int paramInt2, String paramString2, MediaMetadata paramMediaMetadata, long paramLong, List<MediaTrack> paramList, TextTrackStyle paramTextTrackStyle, String paramString3, List<AdBreakInfo> paramList1)
  {
    this.g = paramInt1;
    this.h = paramString1;
    this.i = paramInt2;
    this.j = paramString2;
    this.k = paramMediaMetadata;
    this.l = paramLong;
    this.m = paramList;
    this.n = paramTextTrackStyle;
    this.f = paramString3;
    if (this.f != null) {}
    for (;;)
    {
      try
      {
        this.p = new JSONObject(this.f);
        this.o = paramList1;
        return;
      }
      catch (JSONException paramString1)
      {
        this.p = null;
        this.f = null;
        continue;
      }
      this.p = null;
    }
  }
  
  MediaInfo(String paramString)
  {
    this(1, paramString, -1, null, null, -1L, null, null, null, null);
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("content ID cannot be null or empty");
    }
  }
  
  MediaInfo(JSONObject paramJSONObject)
  {
    this(1, paramJSONObject.getString("contentId"), -1, null, null, -1L, null, null, null, null);
    Object localObject1 = paramJSONObject.getString("streamType");
    if ("NONE".equals(localObject1)) {
      this.i = 0;
    }
    Object localObject2;
    for (;;)
    {
      this.j = paramJSONObject.getString("contentType");
      if (paramJSONObject.has("metadata"))
      {
        localObject1 = paramJSONObject.getJSONObject("metadata");
        this.k = new MediaMetadata(((JSONObject)localObject1).getInt("metadataType"));
        this.k.a((JSONObject)localObject1);
      }
      this.l = -1L;
      if ((paramJSONObject.has("duration")) && (!paramJSONObject.isNull("duration")))
      {
        double d1 = paramJSONObject.optDouble("duration", 0.0D);
        if ((!Double.isNaN(d1)) && (!Double.isInfinite(d1))) {
          this.l = f.a(d1);
        }
      }
      if (!paramJSONObject.has("tracks")) {
        break;
      }
      this.m = new ArrayList();
      localObject1 = paramJSONObject.getJSONArray("tracks");
      int i1 = 0;
      while (i1 < ((JSONArray)localObject1).length())
      {
        localObject2 = new MediaTrack(((JSONArray)localObject1).getJSONObject(i1));
        this.m.add(localObject2);
        i1 += 1;
      }
      if ("BUFFERED".equals(localObject1)) {
        this.i = 1;
      } else if ("LIVE".equals(localObject1)) {
        this.i = 2;
      } else {
        this.i = -1;
      }
    }
    this.m = null;
    if (paramJSONObject.has("textTrackStyle"))
    {
      localObject1 = paramJSONObject.getJSONObject("textTrackStyle");
      localObject2 = new TextTrackStyle();
      ((TextTrackStyle)localObject2).b((JSONObject)localObject1);
    }
    for (this.n = ((TextTrackStyle)localObject2);; this.n = null)
    {
      this.p = paramJSONObject.optJSONObject("customData");
      return;
    }
  }
  
  int a()
  {
    return this.g;
  }
  
  void a(int paramInt)
  {
    if ((paramInt < -1) || (paramInt > 2)) {
      throw new IllegalArgumentException("invalid stream type");
    }
    this.i = paramInt;
  }
  
  void a(long paramLong)
  {
    if ((paramLong < 0L) && (paramLong != -1L)) {
      throw new IllegalArgumentException("Invalid stream duration");
    }
    this.l = paramLong;
  }
  
  void a(MediaMetadata paramMediaMetadata)
  {
    this.k = paramMediaMetadata;
  }
  
  public void a(TextTrackStyle paramTextTrackStyle)
  {
    this.n = paramTextTrackStyle;
  }
  
  void a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("content type cannot be null or empty");
    }
    this.j = paramString;
  }
  
  void a(List<MediaTrack> paramList)
  {
    this.m = paramList;
  }
  
  void a(JSONObject paramJSONObject)
  {
    this.p = paramJSONObject;
  }
  
  public String b()
  {
    return this.h;
  }
  
  public void b(List<AdBreakInfo> paramList)
  {
    this.o = paramList;
  }
  
  public int c()
  {
    return this.i;
  }
  
  public String d()
  {
    return this.j;
  }
  
  public MediaMetadata e()
  {
    return this.k;
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
        } while (!(paramObject instanceof MediaInfo));
        paramObject = (MediaInfo)paramObject;
        if (this.p != null) {
          break;
        }
        i1 = 1;
        if (((MediaInfo)paramObject).p != null) {
          break label169;
        }
        i2 = 1;
        bool1 = bool3;
      } while (i1 != i2);
      if ((this.p == null) || (((MediaInfo)paramObject).p == null)) {
        break;
      }
      bool1 = bool3;
    } while (!p.a(this.p, ((MediaInfo)paramObject).p));
    if ((f.a(this.h, ((MediaInfo)paramObject).h)) && (this.i == ((MediaInfo)paramObject).i) && (f.a(this.j, ((MediaInfo)paramObject).j)) && (f.a(this.k, ((MediaInfo)paramObject).k)) && (this.l == ((MediaInfo)paramObject).l)) {}
    for (boolean bool1 = bool2;; bool1 = false)
    {
      return bool1;
      i1 = 0;
      break;
      label169:
      i2 = 0;
      break label51;
    }
  }
  
  public long f()
  {
    return this.l;
  }
  
  public List<MediaTrack> g()
  {
    return this.m;
  }
  
  public TextTrackStyle h()
  {
    return this.n;
  }
  
  public int hashCode()
  {
    return c.a(new Object[] { this.h, Integer.valueOf(this.i), this.j, this.k, Long.valueOf(this.l), String.valueOf(this.p) });
  }
  
  public JSONObject i()
  {
    return this.p;
  }
  
  public List<AdBreakInfo> j()
  {
    return this.o;
  }
  
  void k()
  {
    if (TextUtils.isEmpty(this.h)) {
      throw new IllegalArgumentException("content ID cannot be null or empty");
    }
    if (TextUtils.isEmpty(this.j)) {
      throw new IllegalArgumentException("content type cannot be null or empty");
    }
    if (this.i == -1) {
      throw new IllegalArgumentException("a valid stream type must be specified");
    }
  }
  
  public JSONObject l()
  {
    JSONObject localJSONObject = new JSONObject();
    for (;;)
    {
      try
      {
        localJSONObject.put("contentId", this.h);
        switch (this.i)
        {
        default: 
          localJSONObject.put("streamType", localObject);
          if (this.j != null) {
            localJSONObject.put("contentType", this.j);
          }
          if (this.k != null) {
            localJSONObject.put("metadata", this.k.e());
          }
          if (this.l <= -1L)
          {
            localJSONObject.put("duration", JSONObject.NULL);
            if (this.m == null) {
              continue;
            }
            localObject = new JSONArray();
            Iterator localIterator = this.m.iterator();
            if (localIterator.hasNext())
            {
              ((JSONArray)localObject).put(((MediaTrack)localIterator.next()).j());
              continue;
            }
          }
          else
          {
            localJSONObject.put("duration", f.a(this.l));
            continue;
          }
          localJSONObject.put("tracks", localObject);
          if (this.n != null) {
            localJSONObject.put("textTrackStyle", this.n.n());
          }
          if (this.p == null) {
            break label239;
          }
          localJSONObject.put("customData", this.p);
          return localJSONObject;
        }
      }
      catch (JSONException localJSONException) {}
      Object localObject = "NONE";
      continue;
      label239:
      return localJSONObject;
      String str = "BUFFERED";
      continue;
      str = "LIVE";
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (this.p == null) {}
    for (String str = null;; str = this.p.toString())
    {
      this.f = str;
      m.a(this, paramParcel, paramInt);
      return;
    }
  }
  
  public static class a
  {
    private final MediaInfo a;
    
    public a(String paramString)
    {
      if (TextUtils.isEmpty(paramString)) {
        throw new IllegalArgumentException("Content ID cannot be empty");
      }
      this.a = new MediaInfo(paramString);
    }
    
    public a a(int paramInt)
    {
      this.a.a(paramInt);
      return this;
    }
    
    public a a(long paramLong)
    {
      this.a.a(paramLong);
      return this;
    }
    
    public a a(MediaMetadata paramMediaMetadata)
    {
      this.a.a(paramMediaMetadata);
      return this;
    }
    
    public a a(TextTrackStyle paramTextTrackStyle)
    {
      this.a.a(paramTextTrackStyle);
      return this;
    }
    
    public a a(String paramString)
    {
      this.a.a(paramString);
      return this;
    }
    
    public a a(List<MediaTrack> paramList)
    {
      this.a.a(paramList);
      return this;
    }
    
    public a a(JSONObject paramJSONObject)
    {
      this.a.a(paramJSONObject);
      return this;
    }
    
    public MediaInfo a()
    {
      this.a.k();
      return this.a;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/MediaInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */