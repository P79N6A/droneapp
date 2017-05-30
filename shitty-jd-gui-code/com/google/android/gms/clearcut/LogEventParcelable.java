package com.google.android.gms.clearcut;

import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ri.d;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.Arrays;

public class LogEventParcelable
  extends AbstractSafeParcelable
{
  public static final d CREATOR = new d();
  public final int a;
  public PlayLoggerContext b;
  public byte[] c;
  public int[] d;
  public String[] e;
  public int[] f;
  public byte[][] g;
  public boolean h;
  public final ri.d i;
  public final b.c j;
  public final b.c k;
  
  LogEventParcelable(int paramInt, PlayLoggerContext paramPlayLoggerContext, byte[] paramArrayOfByte, int[] paramArrayOfInt1, String[] paramArrayOfString, int[] paramArrayOfInt2, byte[][] paramArrayOfByte1, boolean paramBoolean)
  {
    this.a = paramInt;
    this.b = paramPlayLoggerContext;
    this.c = paramArrayOfByte;
    this.d = paramArrayOfInt1;
    this.e = paramArrayOfString;
    this.i = null;
    this.j = null;
    this.k = null;
    this.f = paramArrayOfInt2;
    this.g = paramArrayOfByte1;
    this.h = paramBoolean;
  }
  
  public LogEventParcelable(PlayLoggerContext paramPlayLoggerContext, ri.d paramd, b.c paramc1, b.c paramc2, int[] paramArrayOfInt1, String[] paramArrayOfString, int[] paramArrayOfInt2, byte[][] paramArrayOfByte, boolean paramBoolean)
  {
    this.a = 1;
    this.b = paramPlayLoggerContext;
    this.i = paramd;
    this.j = paramc1;
    this.k = paramc2;
    this.d = paramArrayOfInt1;
    this.e = paramArrayOfString;
    this.f = paramArrayOfInt2;
    this.g = paramArrayOfByte;
    this.h = paramBoolean;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof LogEventParcelable)) {
        break;
      }
      paramObject = (LogEventParcelable)paramObject;
    } while ((this.a == ((LogEventParcelable)paramObject).a) && (c.a(this.b, ((LogEventParcelable)paramObject).b)) && (Arrays.equals(this.c, ((LogEventParcelable)paramObject).c)) && (Arrays.equals(this.d, ((LogEventParcelable)paramObject).d)) && (Arrays.equals(this.e, ((LogEventParcelable)paramObject).e)) && (c.a(this.i, ((LogEventParcelable)paramObject).i)) && (c.a(this.j, ((LogEventParcelable)paramObject).j)) && (c.a(this.k, ((LogEventParcelable)paramObject).k)) && (Arrays.equals(this.f, ((LogEventParcelable)paramObject).f)) && (Arrays.deepEquals(this.g, ((LogEventParcelable)paramObject).g)) && (this.h == ((LogEventParcelable)paramObject).h));
    return false;
    return false;
  }
  
  public int hashCode()
  {
    return c.a(new Object[] { Integer.valueOf(this.a), this.b, this.c, this.d, this.e, this.i, this.j, this.k, this.f, this.g, Boolean.valueOf(this.h) });
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("LogEventParcelable[").append(this.a).append(", ").append(this.b).append(", ").append("LogEventBytes: ");
    if (this.c == null) {}
    for (String str = null;; str = new String(this.c)) {
      return str + ", " + "TestCodes: " + Arrays.toString(this.d) + ", " + "MendelPackages: " + Arrays.toString(this.e) + ", " + "LogEvent: " + this.i + ", " + "ExtensionProducer: " + this.j + ", " + "VeProducer: " + this.k + ", " + "ExperimentIDs: " + Arrays.toString(this.f) + ", " + "ExperimentTokens: " + Arrays.toString(this.g) + ", " + "AddPhenotypeExperimentTokens: " + this.h + "]";
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    d.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/clearcut/LogEventParcelable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */