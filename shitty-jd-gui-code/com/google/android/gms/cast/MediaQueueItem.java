package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.internal.f;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.p;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MediaQueueItem
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<MediaQueueItem> CREATOR = new o();
  public static final int a = 0;
  public static final double b = Double.POSITIVE_INFINITY;
  String c;
  private final int d;
  private MediaInfo e;
  private int f;
  private boolean g;
  private double h;
  private double i;
  private double j;
  private long[] k;
  private JSONObject l;
  
  MediaQueueItem(int paramInt1, MediaInfo paramMediaInfo, int paramInt2, boolean paramBoolean, double paramDouble1, double paramDouble2, double paramDouble3, long[] paramArrayOfLong, String paramString)
  {
    this.d = paramInt1;
    this.e = paramMediaInfo;
    this.f = paramInt2;
    this.g = paramBoolean;
    this.h = paramDouble1;
    this.i = paramDouble2;
    this.j = paramDouble3;
    this.k = paramArrayOfLong;
    this.c = paramString;
    if (this.c != null) {
      try
      {
        this.l = new JSONObject(this.c);
        return;
      }
      catch (JSONException paramMediaInfo)
      {
        this.l = null;
        this.c = null;
        return;
      }
    }
    this.l = null;
  }
  
  private MediaQueueItem(MediaInfo paramMediaInfo)
  {
    this(1, paramMediaInfo, 0, true, 0.0D, Double.POSITIVE_INFINITY, 0.0D, null, null);
    if (paramMediaInfo == null) {
      throw new IllegalArgumentException("media cannot be null.");
    }
  }
  
  private MediaQueueItem(MediaQueueItem paramMediaQueueItem)
  {
    this(1, paramMediaQueueItem.b(), paramMediaQueueItem.c(), paramMediaQueueItem.d(), paramMediaQueueItem.e(), paramMediaQueueItem.f(), paramMediaQueueItem.g(), paramMediaQueueItem.h(), null);
    if (this.e == null) {
      throw new IllegalArgumentException("media cannot be null.");
    }
    this.l = paramMediaQueueItem.i();
  }
  
  MediaQueueItem(JSONObject paramJSONObject)
  {
    this(1, null, 0, true, 0.0D, Double.POSITIVE_INFINITY, 0.0D, null, null);
    a(paramJSONObject);
  }
  
  int a()
  {
    return this.d;
  }
  
  void a(double paramDouble)
  {
    if ((Double.isNaN(paramDouble)) || (paramDouble < 0.0D)) {
      throw new IllegalArgumentException("startTime cannot be negative or NaN.");
    }
    this.h = paramDouble;
  }
  
  void a(int paramInt)
  {
    this.f = paramInt;
  }
  
  void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  void a(long[] paramArrayOfLong)
  {
    this.k = paramArrayOfLong;
  }
  
  public boolean a(JSONObject paramJSONObject)
  {
    if (paramJSONObject.has("media")) {
      this.e = new MediaInfo(paramJSONObject.getJSONObject("media"));
    }
    for (boolean bool2 = true;; bool2 = false)
    {
      boolean bool1 = bool2;
      int m;
      if (paramJSONObject.has("itemId"))
      {
        m = paramJSONObject.getInt("itemId");
        bool1 = bool2;
        if (this.f != m)
        {
          this.f = m;
          bool1 = true;
        }
      }
      bool2 = bool1;
      if (paramJSONObject.has("autoplay"))
      {
        boolean bool3 = paramJSONObject.getBoolean("autoplay");
        bool2 = bool1;
        if (this.g != bool3)
        {
          this.g = bool3;
          bool2 = true;
        }
      }
      bool1 = bool2;
      double d1;
      if (paramJSONObject.has("startTime"))
      {
        d1 = paramJSONObject.getDouble("startTime");
        bool1 = bool2;
        if (Math.abs(d1 - this.h) > 1.0E-7D)
        {
          this.h = d1;
          bool1 = true;
        }
      }
      bool2 = bool1;
      if (paramJSONObject.has("playbackDuration"))
      {
        d1 = paramJSONObject.getDouble("playbackDuration");
        bool2 = bool1;
        if (Math.abs(d1 - this.i) > 1.0E-7D)
        {
          this.i = d1;
          bool2 = true;
        }
      }
      bool1 = bool2;
      if (paramJSONObject.has("preloadTime"))
      {
        d1 = paramJSONObject.getDouble("preloadTime");
        bool1 = bool2;
        if (Math.abs(d1 - this.j) > 1.0E-7D)
        {
          this.j = d1;
          bool1 = true;
        }
      }
      int n;
      long[] arrayOfLong;
      if (paramJSONObject.has("activeTrackIds"))
      {
        JSONArray localJSONArray = paramJSONObject.getJSONArray("activeTrackIds");
        n = localJSONArray.length();
        arrayOfLong = new long[n];
        m = 0;
        while (m < n)
        {
          arrayOfLong[m] = localJSONArray.getLong(m);
          m += 1;
        }
        if (this.k == null) {
          m = 1;
        }
      }
      for (;;)
      {
        if (m != 0)
        {
          this.k = arrayOfLong;
          bool1 = true;
        }
        if (paramJSONObject.has("customData"))
        {
          this.l = paramJSONObject.getJSONObject("customData");
          return true;
          if (this.k.length != n)
          {
            m = 1;
          }
          else
          {
            m = 0;
            for (;;)
            {
              if (m >= n) {
                break label425;
              }
              if (this.k[m] != arrayOfLong[m])
              {
                m = 1;
                break;
              }
              m += 1;
            }
          }
        }
        else
        {
          return bool1;
          label425:
          m = 0;
          continue;
          m = 0;
          arrayOfLong = null;
        }
      }
    }
  }
  
  public MediaInfo b()
  {
    return this.e;
  }
  
  void b(double paramDouble)
  {
    if (Double.isNaN(paramDouble)) {
      throw new IllegalArgumentException("playbackDuration cannot be NaN.");
    }
    this.i = paramDouble;
  }
  
  void b(JSONObject paramJSONObject)
  {
    this.l = paramJSONObject;
  }
  
  public int c()
  {
    return this.f;
  }
  
  void c(double paramDouble)
  {
    if ((Double.isNaN(paramDouble)) || (paramDouble < 0.0D)) {
      throw new IllegalArgumentException("preloadTime cannot be negative or NaN.");
    }
    this.j = paramDouble;
  }
  
  public boolean d()
  {
    return this.g;
  }
  
  public double e()
  {
    return this.h;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = true;
    boolean bool3 = false;
    if (this == paramObject) {
      bool1 = true;
    }
    int m;
    int n;
    label51:
    do
    {
      do
      {
        do
        {
          return bool1;
          bool1 = bool3;
        } while (!(paramObject instanceof MediaQueueItem));
        paramObject = (MediaQueueItem)paramObject;
        if (this.l != null) {
          break;
        }
        m = 1;
        if (((MediaQueueItem)paramObject).l != null) {
          break label190;
        }
        n = 1;
        bool1 = bool3;
      } while (m != n);
      if ((this.l == null) || (((MediaQueueItem)paramObject).l == null)) {
        break;
      }
      bool1 = bool3;
    } while (!p.a(this.l, ((MediaQueueItem)paramObject).l));
    if ((f.a(this.e, ((MediaQueueItem)paramObject).e)) && (this.f == ((MediaQueueItem)paramObject).f) && (this.g == ((MediaQueueItem)paramObject).g) && (this.h == ((MediaQueueItem)paramObject).h) && (this.i == ((MediaQueueItem)paramObject).i) && (this.j == ((MediaQueueItem)paramObject).j) && (Arrays.equals(this.k, ((MediaQueueItem)paramObject).k))) {}
    for (boolean bool1 = bool2;; bool1 = false)
    {
      return bool1;
      m = 0;
      break;
      label190:
      n = 0;
      break label51;
    }
  }
  
  public double f()
  {
    return this.i;
  }
  
  public double g()
  {
    return this.j;
  }
  
  public long[] h()
  {
    return this.k;
  }
  
  public int hashCode()
  {
    return c.a(new Object[] { this.e, Integer.valueOf(this.f), Boolean.valueOf(this.g), Double.valueOf(this.h), Double.valueOf(this.i), Double.valueOf(this.j), Integer.valueOf(Arrays.hashCode(this.k)), String.valueOf(this.l) });
  }
  
  public JSONObject i()
  {
    return this.l;
  }
  
  void j()
  {
    if (this.e == null) {
      throw new IllegalArgumentException("media cannot be null.");
    }
    if ((Double.isNaN(this.h)) || (this.h < 0.0D)) {
      throw new IllegalArgumentException("startTime cannot be negative or NaN.");
    }
    if (Double.isNaN(this.i)) {
      throw new IllegalArgumentException("playbackDuration cannot be NaN.");
    }
    if ((Double.isNaN(this.j)) || (this.j < 0.0D)) {
      throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
    }
  }
  
  public JSONObject k()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("media", this.e.l());
      if (this.f != 0) {
        localJSONObject.put("itemId", this.f);
      }
      localJSONObject.put("autoplay", this.g);
      localJSONObject.put("startTime", this.h);
      if (this.i != Double.POSITIVE_INFINITY) {
        localJSONObject.put("playbackDuration", this.i);
      }
      localJSONObject.put("preloadTime", this.j);
      if (this.k != null)
      {
        JSONArray localJSONArray = new JSONArray();
        long[] arrayOfLong = this.k;
        int n = arrayOfLong.length;
        int m = 0;
        while (m < n)
        {
          localJSONArray.put(arrayOfLong[m]);
          m += 1;
        }
        localJSONObject.put("activeTrackIds", localJSONArray);
      }
      if (this.l != null) {
        localJSONObject.put("customData", this.l);
      }
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return localJSONObject;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (this.l == null) {}
    for (String str = null;; str = this.l.toString())
    {
      this.c = str;
      o.a(this, paramParcel, paramInt);
      return;
    }
  }
  
  public static class a
  {
    private final MediaQueueItem a;
    
    public a(MediaInfo paramMediaInfo)
    {
      this.a = new MediaQueueItem(paramMediaInfo, null);
    }
    
    public a(MediaQueueItem paramMediaQueueItem)
    {
      this.a = new MediaQueueItem(paramMediaQueueItem, null);
    }
    
    public a(JSONObject paramJSONObject)
    {
      this.a = new MediaQueueItem(paramJSONObject);
    }
    
    public a a()
    {
      this.a.a(0);
      return this;
    }
    
    public a a(double paramDouble)
    {
      this.a.a(paramDouble);
      return this;
    }
    
    public a a(JSONObject paramJSONObject)
    {
      this.a.b(paramJSONObject);
      return this;
    }
    
    public a a(boolean paramBoolean)
    {
      this.a.a(paramBoolean);
      return this;
    }
    
    public a a(long[] paramArrayOfLong)
    {
      this.a.a(paramArrayOfLong);
      return this;
    }
    
    public a b(double paramDouble)
    {
      this.a.b(paramDouble);
      return this;
    }
    
    public MediaQueueItem b()
    {
      this.a.j();
      return this.a;
    }
    
    public a c(double paramDouble)
    {
      this.a.c(paramDouble);
      return this;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/MediaQueueItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */