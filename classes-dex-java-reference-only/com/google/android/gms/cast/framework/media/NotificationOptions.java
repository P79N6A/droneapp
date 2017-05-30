package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.R.dimen;
import com.google.android.gms.R.drawable;
import com.google.android.gms.R.string;
import com.google.android.gms.cast.internal.f;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class NotificationOptions
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<NotificationOptions> CREATOR = new g();
  public static final long a = 10000L;
  public static final long b = 30000L;
  private static final List<String> c = Arrays.asList(new String[] { "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK", "com.google.android.gms.cast.framework.action.STOP_CASTING" });
  private static final int[] d = { 0, 1 };
  private final int A;
  private final int B;
  private final int C;
  private final int D;
  private final int E;
  private final int F;
  private final int G;
  private final int H;
  private final int I;
  private final int J;
  private final int e;
  private final List<String> f;
  private final int[] g;
  private final long h;
  private final String i;
  private final int j;
  private final int k;
  private final int l;
  private final int m;
  private final int n;
  private final int o;
  private final int p;
  private final int q;
  private final int r;
  private final int s;
  private final int t;
  private final int u;
  private final int v;
  private final int w;
  private final int x;
  private final int y;
  private final int z;
  
  public NotificationOptions(int paramInt1, List<String> paramList, int[] paramArrayOfInt, long paramLong, String paramString, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15, int paramInt16, int paramInt17, int paramInt18, int paramInt19, int paramInt20, int paramInt21, int paramInt22, int paramInt23, int paramInt24, int paramInt25, int paramInt26, int paramInt27, int paramInt28)
  {
    this.e = paramInt1;
    if (paramList != null)
    {
      this.f = new ArrayList(paramList);
      if (paramArrayOfInt == null) {
        break label222;
      }
    }
    label222:
    for (this.g = Arrays.copyOf(paramArrayOfInt, paramArrayOfInt.length);; this.g = null)
    {
      this.h = paramLong;
      this.i = paramString;
      this.j = paramInt2;
      this.k = paramInt3;
      this.l = paramInt4;
      this.m = paramInt5;
      this.n = paramInt6;
      this.o = paramInt7;
      this.p = paramInt8;
      this.q = paramInt9;
      this.r = paramInt10;
      this.s = paramInt11;
      this.t = paramInt12;
      this.u = paramInt13;
      this.v = paramInt14;
      this.w = paramInt15;
      this.x = paramInt16;
      this.y = paramInt17;
      this.z = paramInt18;
      this.A = paramInt19;
      this.B = paramInt20;
      this.C = paramInt21;
      this.D = paramInt22;
      this.E = paramInt23;
      this.F = paramInt24;
      this.G = paramInt25;
      this.H = paramInt26;
      this.I = paramInt27;
      this.J = paramInt28;
      return;
      this.f = null;
      break;
    }
  }
  
  public int A()
  {
    return this.E;
  }
  
  public int B()
  {
    return this.F;
  }
  
  public int C()
  {
    return this.G;
  }
  
  public int D()
  {
    return this.H;
  }
  
  public int E()
  {
    return this.I;
  }
  
  public int F()
  {
    return this.J;
  }
  
  int a()
  {
    return this.e;
  }
  
  public List<String> b()
  {
    return this.f;
  }
  
  public int[] c()
  {
    return Arrays.copyOf(this.g, this.g.length);
  }
  
  public long d()
  {
    return this.h;
  }
  
  public String e()
  {
    return this.i;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof NotificationOptions)) {
        return false;
      }
      paramObject = (NotificationOptions)paramObject;
    } while ((f.a(this.f, ((NotificationOptions)paramObject).f)) && (Arrays.equals(this.g, ((NotificationOptions)paramObject).g)) && (this.h == ((NotificationOptions)paramObject).h) && (f.a(this.i, ((NotificationOptions)paramObject).i)));
    return false;
  }
  
  public int f()
  {
    return this.j;
  }
  
  public int g()
  {
    return this.k;
  }
  
  public int h()
  {
    return this.l;
  }
  
  public int hashCode()
  {
    return c.a(new Object[] { this.f, Integer.valueOf(Arrays.hashCode(this.g)), Long.valueOf(this.h), this.i });
  }
  
  public int i()
  {
    return this.m;
  }
  
  public int j()
  {
    return this.n;
  }
  
  public int k()
  {
    return this.o;
  }
  
  public int l()
  {
    return this.p;
  }
  
  public int m()
  {
    return this.q;
  }
  
  public int n()
  {
    return this.r;
  }
  
  public int o()
  {
    return this.s;
  }
  
  public int p()
  {
    return this.t;
  }
  
  public int q()
  {
    return this.u;
  }
  
  public int r()
  {
    return this.v;
  }
  
  public int s()
  {
    return this.w;
  }
  
  public int t()
  {
    return this.x;
  }
  
  public String toString()
  {
    return String.format(Locale.ROOT, "NotificationOptions(actions=%s, compatActionIndices=%s, skipStepMs=%s, targetActivityClassName=%s)", new Object[] { this.f, Arrays.toString(this.g), Long.valueOf(this.h), this.i });
  }
  
  public int u()
  {
    return this.y;
  }
  
  public int v()
  {
    return this.z;
  }
  
  public int w()
  {
    return this.A;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    g.a(this, paramParcel, paramInt);
  }
  
  public int x()
  {
    return this.B;
  }
  
  public int y()
  {
    return this.C;
  }
  
  public int z()
  {
    return this.D;
  }
  
  public static final class a
  {
    private String a;
    private List<String> b = NotificationOptions.G();
    private int[] c = NotificationOptions.H();
    private long d = 10000L;
    
    public a a(long paramLong)
    {
      if (paramLong > 0L) {}
      for (boolean bool = true;; bool = false)
      {
        d.b(bool, "skipStepMs must be positive.");
        this.d = paramLong;
        return this;
      }
    }
    
    public a a(String paramString)
    {
      this.a = paramString;
      return this;
    }
    
    public a a(List<String> paramList, int[] paramArrayOfInt)
    {
      if ((paramList == null) && (paramArrayOfInt != null)) {
        throw new IllegalArgumentException("When setting actions to null, you must also set compatActionIndices to null.");
      }
      if ((paramList != null) && (paramArrayOfInt == null)) {
        throw new IllegalArgumentException("When setting compatActionIndices to null, you must also set actions to null.");
      }
      if ((paramList != null) && (paramArrayOfInt != null))
      {
        int j = paramList.size();
        if (paramArrayOfInt.length > j) {
          throw new IllegalArgumentException(String.format(Locale.ROOT, "Invalid number of compat actions: %d > %d.", new Object[] { Integer.valueOf(paramArrayOfInt.length), Integer.valueOf(j) }));
        }
        int k = paramArrayOfInt.length;
        int i = 0;
        while (i < k)
        {
          int m = paramArrayOfInt[i];
          if ((m < 0) || (m >= j)) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "Index %d in compatActionIndices out of range: [0, %d]", new Object[] { Integer.valueOf(m), Integer.valueOf(j - 1) }));
          }
          i += 1;
        }
        this.b = new ArrayList(paramList);
        this.c = Arrays.copyOf(paramArrayOfInt, paramArrayOfInt.length);
        return this;
      }
      this.b = NotificationOptions.G();
      this.c = NotificationOptions.H();
      return this;
    }
    
    public NotificationOptions a()
    {
      return new NotificationOptions(1, this.b, this.c, this.d, this.a, R.drawable.cast_ic_notification_small_icon, R.drawable.cast_ic_notification_stop_live_stream, R.drawable.cast_ic_notification_pause, R.drawable.cast_ic_notification_play, R.drawable.cast_ic_notification_skip_next, R.drawable.cast_ic_notification_skip_prev, R.drawable.cast_ic_notification_forward, R.drawable.cast_ic_notification_forward10, R.drawable.cast_ic_notification_forward30, R.drawable.cast_ic_notification_rewind, R.drawable.cast_ic_notification_rewind10, R.drawable.cast_ic_notification_rewind30, R.drawable.cast_ic_notification_disconnect, R.dimen.cast_notification_image_size, R.string.cast_casting_to_device, R.string.cast_stop_live_stream, R.string.cast_pause, R.string.cast_play, R.string.cast_skip_next, R.string.cast_skip_prev, R.string.cast_forward, R.string.cast_forward_10, R.string.cast_forward_30, R.string.cast_rewind, R.string.cast_rewind_10, R.string.cast_rewind_30, R.string.cast_disconnect);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/media/NotificationOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */