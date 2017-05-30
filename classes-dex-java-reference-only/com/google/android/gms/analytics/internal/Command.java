package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Command
  implements Parcelable
{
  @Deprecated
  public static final Parcelable.Creator<Command> CREATOR = new Parcelable.Creator()
  {
    @Deprecated
    public Command a(Parcel paramAnonymousParcel)
    {
      return new Command(paramAnonymousParcel);
    }
    
    @Deprecated
    public Command[] a(int paramAnonymousInt)
    {
      return new Command[paramAnonymousInt];
    }
  };
  private String a;
  private String b;
  private String c;
  
  @Deprecated
  public Command() {}
  
  @Deprecated
  Command(Parcel paramParcel)
  {
    a(paramParcel);
  }
  
  @Deprecated
  private void a(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
  }
  
  public String a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.c;
  }
  
  @Deprecated
  public int describeContents()
  {
    return 0;
  }
  
  @Deprecated
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/internal/Command.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */