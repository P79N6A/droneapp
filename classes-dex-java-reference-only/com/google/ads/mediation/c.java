package com.google.ads.mediation;

import android.location.Location;
import com.google.ads.a.b;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

@Deprecated
public class c
{
  private final Date a;
  private final a.b b;
  private final Set<String> c;
  private final boolean d;
  private final Location e;
  
  public c(Date paramDate, a.b paramb, Set<String> paramSet, boolean paramBoolean, Location paramLocation)
  {
    this.a = paramDate;
    this.b = paramb;
    this.c = paramSet;
    this.d = paramBoolean;
    this.e = paramLocation;
  }
  
  public Integer a()
  {
    if (this.a != null)
    {
      Calendar localCalendar1 = Calendar.getInstance();
      Calendar localCalendar2 = Calendar.getInstance();
      localCalendar1.setTime(this.a);
      Integer localInteger2 = Integer.valueOf(localCalendar2.get(1) - localCalendar1.get(1));
      Integer localInteger1;
      if (localCalendar2.get(2) >= localCalendar1.get(2))
      {
        localInteger1 = localInteger2;
        if (localCalendar2.get(2) == localCalendar1.get(2))
        {
          localInteger1 = localInteger2;
          if (localCalendar2.get(5) >= localCalendar1.get(5)) {}
        }
      }
      else
      {
        localInteger1 = Integer.valueOf(localInteger2.intValue() - 1);
      }
      return localInteger1;
    }
    return null;
  }
  
  public Date b()
  {
    return this.a;
  }
  
  public a.b c()
  {
    return this.b;
  }
  
  public Set<String> d()
  {
    return this.c;
  }
  
  public Location e()
  {
    return this.e;
  }
  
  public boolean f()
  {
    return this.d;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/ads/mediation/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */