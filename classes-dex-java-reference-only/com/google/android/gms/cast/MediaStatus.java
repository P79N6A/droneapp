package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import com.google.android.gms.cast.internal.f;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaStatus
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<MediaStatus> CREATOR = new p();
  public static final long a = 1L;
  public static final long b = 2L;
  public static final long c = 4L;
  public static final long d = 8L;
  public static final long e = 16L;
  public static final long f = 32L;
  public static final int g = 0;
  public static final int h = 1;
  public static final int i = 2;
  public static final int j = 3;
  public static final int k = 4;
  public static final int l = 0;
  public static final int m = 1;
  public static final int n = 2;
  public static final int o = 3;
  public static final int p = 4;
  public static final int q = 0;
  public static final int r = 1;
  public static final int s = 2;
  public static final int t = 3;
  private long A;
  private int B;
  private double C;
  private int D;
  private int E;
  private long F;
  private double G;
  private boolean H;
  private long[] I;
  private int J;
  private int K;
  private JSONObject L;
  private boolean M;
  private final SparseArray<Integer> N = new SparseArray();
  long u;
  String v;
  int w;
  final ArrayList<MediaQueueItem> x = new ArrayList();
  private final int y;
  private MediaInfo z;
  
  MediaStatus(int paramInt1, MediaInfo paramMediaInfo, long paramLong1, int paramInt2, double paramDouble1, int paramInt3, int paramInt4, long paramLong2, long paramLong3, double paramDouble2, boolean paramBoolean1, long[] paramArrayOfLong, int paramInt5, int paramInt6, String paramString, int paramInt7, List<MediaQueueItem> paramList, boolean paramBoolean2)
  {
    this.y = paramInt1;
    this.z = paramMediaInfo;
    this.A = paramLong1;
    this.B = paramInt2;
    this.C = paramDouble1;
    this.D = paramInt3;
    this.E = paramInt4;
    this.F = paramLong2;
    this.u = paramLong3;
    this.G = paramDouble2;
    this.H = paramBoolean1;
    this.I = paramArrayOfLong;
    this.J = paramInt5;
    this.K = paramInt6;
    this.v = paramString;
    if (this.v != null) {}
    for (;;)
    {
      try
      {
        this.L = new JSONObject(this.v);
        this.w = paramInt7;
        if ((paramList != null) && (!paramList.isEmpty())) {
          a((MediaQueueItem[])paramList.toArray(new MediaQueueItem[paramList.size()]));
        }
        this.M = paramBoolean2;
        return;
      }
      catch (JSONException paramMediaInfo)
      {
        this.L = null;
        this.v = null;
        continue;
      }
      this.L = null;
    }
  }
  
  public MediaStatus(JSONObject paramJSONObject)
  {
    this(1, null, 0L, 0, 0.0D, 0, 0, 0L, 0L, 0.0D, false, null, 0, 0, null, 0, null, false);
    a(paramJSONObject, 0);
  }
  
  private void a(MediaQueueItem[] paramArrayOfMediaQueueItem)
  {
    this.x.clear();
    this.N.clear();
    int i1 = 0;
    while (i1 < paramArrayOfMediaQueueItem.length)
    {
      MediaQueueItem localMediaQueueItem = paramArrayOfMediaQueueItem[i1];
      this.x.add(localMediaQueueItem);
      this.N.put(localMediaQueueItem.c(), Integer.valueOf(i1));
      i1 += 1;
    }
  }
  
  private boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = true;
    if (paramInt1 != 1) {
      bool = false;
    }
    do
    {
      do
      {
        return bool;
        switch (paramInt2)
        {
        default: 
          return true;
        }
      } while (paramInt3 == 0);
      return false;
    } while (paramInt4 != 2);
    return false;
  }
  
  private boolean a(MediaStatus paramMediaStatus)
  {
    return (this.L == null) || (paramMediaStatus.L == null) || (com.google.android.gms.common.util.p.a(this.L, paramMediaStatus.L));
  }
  
  private void s()
  {
    this.w = 0;
    this.x.clear();
    this.N.clear();
  }
  
  int a()
  {
    return this.y;
  }
  
  public int a(JSONObject paramJSONObject, int paramInt)
  {
    int i6 = 2;
    int i5 = 1;
    long l1 = paramJSONObject.getLong("mediaSessionId");
    if (l1 != this.A) {
      this.A = l1;
    }
    for (int i2 = 1;; i2 = 0)
    {
      int i3 = i2;
      Object localObject;
      int i1;
      if (paramJSONObject.has("playerState"))
      {
        localObject = paramJSONObject.getString("playerState");
        if (!((String)localObject).equals("IDLE")) {
          break label461;
        }
        i1 = 1;
      }
      for (;;)
      {
        int i4 = i2;
        if (i1 != this.D)
        {
          this.D = i1;
          i4 = i2 | 0x2;
        }
        i3 = i4;
        if (i1 == 1)
        {
          i3 = i4;
          if (paramJSONObject.has("idleReason"))
          {
            localObject = paramJSONObject.getString("idleReason");
            if (!((String)localObject).equals("CANCELLED")) {
              break label512;
            }
            i1 = i6;
          }
        }
        for (;;)
        {
          label137:
          i3 = i4;
          if (i1 != this.E)
          {
            this.E = i1;
            i3 = i4 | 0x2;
          }
          i1 = i3;
          double d1;
          if (paramJSONObject.has("playbackRate"))
          {
            d1 = paramJSONObject.getDouble("playbackRate");
            i1 = i3;
            if (this.C != d1)
            {
              this.C = d1;
              i1 = i3 | 0x2;
            }
          }
          i3 = i1;
          if (paramJSONObject.has("currentTime"))
          {
            i3 = i1;
            if ((paramInt & 0x2) == 0)
            {
              l1 = f.a(paramJSONObject.getDouble("currentTime"));
              i3 = i1;
              if (l1 != this.F)
              {
                this.F = l1;
                i3 = i1 | 0x2;
              }
            }
          }
          i2 = i3;
          if (paramJSONObject.has("supportedMediaCommands"))
          {
            l1 = paramJSONObject.getLong("supportedMediaCommands");
            i2 = i3;
            if (l1 != this.u)
            {
              this.u = l1;
              i2 = i3 | 0x2;
            }
          }
          i1 = i2;
          if (paramJSONObject.has("volume"))
          {
            i1 = i2;
            if ((paramInt & 0x1) == 0)
            {
              localObject = paramJSONObject.getJSONObject("volume");
              d1 = ((JSONObject)localObject).getDouble("level");
              paramInt = i2;
              if (d1 != this.G)
              {
                this.G = d1;
                paramInt = i2 | 0x2;
              }
              boolean bool = ((JSONObject)localObject).getBoolean("muted");
              i1 = paramInt;
              if (bool != this.H)
              {
                this.H = bool;
                i1 = paramInt | 0x2;
              }
            }
          }
          if (paramJSONObject.has("activeTrackIds"))
          {
            JSONArray localJSONArray = paramJSONObject.getJSONArray("activeTrackIds");
            i3 = localJSONArray.length();
            localObject = new long[i3];
            paramInt = 0;
            for (;;)
            {
              if (paramInt < i3)
              {
                localObject[paramInt] = localJSONArray.getLong(paramInt);
                paramInt += 1;
                continue;
                label461:
                if (((String)localObject).equals("PLAYING"))
                {
                  i1 = 2;
                  break;
                }
                if (((String)localObject).equals("PAUSED"))
                {
                  i1 = 3;
                  break;
                }
                if (!((String)localObject).equals("BUFFERING")) {
                  break label997;
                }
                i1 = 4;
                break;
                label512:
                if (((String)localObject).equals("INTERRUPTED"))
                {
                  i1 = 3;
                  break label137;
                }
                if (((String)localObject).equals("FINISHED"))
                {
                  i1 = 1;
                  break label137;
                }
                if (!((String)localObject).equals("ERROR")) {
                  break label991;
                }
                i1 = 4;
                break label137;
              }
            }
            if (this.I == null) {
              paramInt = i5;
            }
          }
          for (;;)
          {
            if (paramInt != 0) {
              this.I = ((long[])localObject);
            }
            i2 = paramInt;
            for (;;)
            {
              label586:
              paramInt = i1;
              if (i2 != 0)
              {
                this.I = ((long[])localObject);
                paramInt = i1 | 0x2;
              }
              i1 = paramInt;
              if (paramJSONObject.has("customData"))
              {
                this.L = paramJSONObject.getJSONObject("customData");
                this.v = null;
                i1 = paramInt | 0x2;
              }
              paramInt = i1;
              if (paramJSONObject.has("media"))
              {
                localObject = paramJSONObject.getJSONObject("media");
                this.z = new MediaInfo((JSONObject)localObject);
                i1 |= 0x2;
                paramInt = i1;
                if (((JSONObject)localObject).has("metadata")) {
                  paramInt = i1 | 0x4;
                }
              }
              i1 = paramInt;
              if (paramJSONObject.has("currentItemId"))
              {
                i2 = paramJSONObject.getInt("currentItemId");
                i1 = paramInt;
                if (this.B != i2)
                {
                  this.B = i2;
                  i1 = paramInt | 0x2;
                }
              }
              paramInt = paramJSONObject.optInt("preloadedItemId", 0);
              i2 = i1;
              if (this.K != paramInt)
              {
                this.K = paramInt;
                i2 = i1 | 0x10;
              }
              i1 = paramJSONObject.optInt("loadingItemId", 0);
              paramInt = i2;
              if (this.J != i1)
              {
                this.J = i1;
                paramInt = i2 | 0x2;
              }
              if (this.z == null)
              {
                i1 = -1;
                label820:
                if (a(this.D, this.E, this.J, i1)) {
                  break label940;
                }
                i1 = paramInt;
                if (a(paramJSONObject)) {
                  i1 = paramInt | 0x8;
                }
              }
              label940:
              do
              {
                return i1;
                paramInt = i5;
                if (this.I.length != i3) {
                  break;
                }
                i2 = 0;
                for (;;)
                {
                  if (i2 >= i3) {
                    break label986;
                  }
                  paramInt = i5;
                  if (this.I[i2] != localObject[i2]) {
                    break;
                  }
                  i2 += 1;
                }
                if (this.I == null) {
                  break label977;
                }
                i2 = 1;
                localObject = null;
                break label586;
                i1 = this.z.c();
                break label820;
                this.B = 0;
                this.J = 0;
                this.K = 0;
                i1 = paramInt;
              } while (this.x.isEmpty());
              s();
              return paramInt | 0x8;
              label977:
              localObject = null;
              i2 = 0;
            }
            label986:
            paramInt = 0;
          }
          label991:
          i1 = 0;
        }
        label997:
        i1 = 0;
      }
    }
  }
  
  public MediaQueueItem a(int paramInt)
  {
    return c(paramInt);
  }
  
  public void a(boolean paramBoolean)
  {
    this.M = paramBoolean;
  }
  
  public boolean a(long paramLong)
  {
    return (this.u & paramLong) != 0L;
  }
  
  boolean a(JSONObject paramJSONObject)
  {
    int i2 = 2;
    boolean bool2 = true;
    Object localObject;
    int i1;
    if (paramJSONObject.has("repeatMode"))
    {
      int i3 = this.w;
      localObject = paramJSONObject.getString("repeatMode");
      i1 = -1;
      switch (((String)localObject).hashCode())
      {
      default: 
        switch (i1)
        {
        default: 
          i2 = i3;
        case 2: 
          label115:
          if (this.w != i2) {
            this.w = i2;
          }
          break;
        }
        break;
      }
    }
    for (boolean bool1 = true;; bool1 = false)
    {
      if (paramJSONObject.has("items"))
      {
        paramJSONObject = paramJSONObject.getJSONArray("items");
        i2 = paramJSONObject.length();
        localObject = new SparseArray();
        i1 = 0;
        for (;;)
        {
          if (i1 < i2)
          {
            ((SparseArray)localObject).put(i1, Integer.valueOf(paramJSONObject.getJSONObject(i1).getInt("itemId")));
            i1 += 1;
            continue;
            if (!((String)localObject).equals("REPEAT_OFF")) {
              break;
            }
            i1 = 0;
            break;
            if (!((String)localObject).equals("REPEAT_ALL")) {
              break;
            }
            i1 = 1;
            break;
            if (!((String)localObject).equals("REPEAT_SINGLE")) {
              break;
            }
            i1 = 2;
            break;
            if (!((String)localObject).equals("REPEAT_ALL_AND_SHUFFLE")) {
              break;
            }
            i1 = 3;
            break;
            i2 = 0;
            break label115;
            i2 = 1;
            break label115;
            i2 = 3;
            break label115;
          }
        }
        MediaQueueItem[] arrayOfMediaQueueItem = new MediaQueueItem[i2];
        i1 = 0;
        Integer localInteger;
        JSONObject localJSONObject;
        boolean bool3;
        if (i1 < i2)
        {
          localInteger = (Integer)((SparseArray)localObject).get(i1);
          localJSONObject = paramJSONObject.getJSONObject(i1);
          MediaQueueItem localMediaQueueItem = c(localInteger.intValue());
          if (localMediaQueueItem != null)
          {
            bool3 = localMediaQueueItem.a(localJSONObject);
            arrayOfMediaQueueItem[i1] = localMediaQueueItem;
            if (i1 == e(localInteger.intValue()).intValue()) {
              break label456;
            }
            bool1 = true;
          }
        }
        for (;;)
        {
          i1 += 1;
          break;
          if (localInteger.intValue() == this.B)
          {
            arrayOfMediaQueueItem[i1] = new MediaQueueItem.a(this.z).b();
            arrayOfMediaQueueItem[i1].a(localJSONObject);
            bool1 = true;
          }
          else
          {
            arrayOfMediaQueueItem[i1] = new MediaQueueItem(localJSONObject);
            bool1 = true;
            continue;
            if (this.x.size() != i2) {
              bool1 = bool2;
            }
            for (;;)
            {
              a(arrayOfMediaQueueItem);
              return bool1;
            }
            label456:
            bool1 |= bool3;
          }
        }
      }
      return bool1;
    }
  }
  
  public long b()
  {
    return this.A;
  }
  
  public MediaQueueItem b(int paramInt)
  {
    return d(paramInt);
  }
  
  public int c()
  {
    return this.D;
  }
  
  public MediaQueueItem c(int paramInt)
  {
    Integer localInteger = (Integer)this.N.get(paramInt);
    if (localInteger == null) {
      return null;
    }
    return (MediaQueueItem)this.x.get(localInteger.intValue());
  }
  
  public int d()
  {
    return this.E;
  }
  
  public MediaQueueItem d(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.x.size())) {
      return null;
    }
    return (MediaQueueItem)this.x.get(paramInt);
  }
  
  public double e()
  {
    return this.C;
  }
  
  public Integer e(int paramInt)
  {
    return (Integer)this.N.get(paramInt);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    label51:
    label56:
    do
    {
      return true;
      if (!(paramObject instanceof MediaStatus)) {
        return false;
      }
      paramObject = (MediaStatus)paramObject;
      int i1;
      if (this.L == null)
      {
        i1 = 1;
        if (((MediaStatus)paramObject).L != null) {
          break label51;
        }
      }
      for (int i2 = 1;; i2 = 0)
      {
        if (i1 == i2) {
          break label56;
        }
        return false;
        i1 = 0;
        break;
      }
    } while ((this.A == ((MediaStatus)paramObject).A) && (this.B == ((MediaStatus)paramObject).B) && (this.C == ((MediaStatus)paramObject).C) && (this.D == ((MediaStatus)paramObject).D) && (this.E == ((MediaStatus)paramObject).E) && (this.F == ((MediaStatus)paramObject).F) && (this.G == ((MediaStatus)paramObject).G) && (this.H == ((MediaStatus)paramObject).H) && (this.J == ((MediaStatus)paramObject).J) && (this.K == ((MediaStatus)paramObject).K) && (this.w == ((MediaStatus)paramObject).w) && (Arrays.equals(this.I, ((MediaStatus)paramObject).I)) && (f.a(Long.valueOf(this.u), Long.valueOf(((MediaStatus)paramObject).u))) && (f.a(this.x, ((MediaStatus)paramObject).x)) && (f.a(this.z, ((MediaStatus)paramObject).z)) && (a((MediaStatus)paramObject)) && (this.M == ((MediaStatus)paramObject).r()));
    return false;
  }
  
  public MediaInfo f()
  {
    return this.z;
  }
  
  public long g()
  {
    return this.F;
  }
  
  public double h()
  {
    return this.G;
  }
  
  public int hashCode()
  {
    return c.a(new Object[] { this.z, Long.valueOf(this.A), Integer.valueOf(this.B), Double.valueOf(this.C), Integer.valueOf(this.D), Integer.valueOf(this.E), Long.valueOf(this.F), Long.valueOf(this.u), Double.valueOf(this.G), Boolean.valueOf(this.H), Integer.valueOf(Arrays.hashCode(this.I)), Integer.valueOf(this.J), Integer.valueOf(this.K), this.L, Integer.valueOf(this.w), this.x, Boolean.valueOf(this.M) });
  }
  
  public boolean i()
  {
    return this.H;
  }
  
  public long[] j()
  {
    return this.I;
  }
  
  public JSONObject k()
  {
    return this.L;
  }
  
  public int l()
  {
    return this.B;
  }
  
  public int m()
  {
    return this.J;
  }
  
  public int n()
  {
    return this.K;
  }
  
  public int o()
  {
    return this.w;
  }
  
  public List<MediaQueueItem> p()
  {
    return this.x;
  }
  
  public int q()
  {
    return this.x.size();
  }
  
  public boolean r()
  {
    return this.M;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (this.L == null) {}
    for (String str = null;; str = this.L.toString())
    {
      this.v = str;
      p.a(this, paramParcel, paramInt);
      return;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/MediaStatus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */