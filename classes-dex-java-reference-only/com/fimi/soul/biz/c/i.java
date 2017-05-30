package com.fimi.soul.biz.c;

import android.content.Context;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import java.util.List;

public class i
{
  public static MarkerOptions a(LatLng paramLatLng, int paramInt)
  {
    return new MarkerOptions().a(paramLatLng).a(j.a(paramInt)).a(true);
  }
  
  public static MarkerOptions a(LatLng paramLatLng, Context paramContext, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    return new MarkerOptions().a(paramLatLng).a(j.a(paramContext, paramInt2, paramInt1, paramBoolean)).a(true);
  }
  
  public static PolylineOptions a(List<LatLng> paramList, int paramInt1, int paramInt2)
  {
    return new PolylineOptions().a(paramList).a(paramInt2).a(paramInt1);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/c/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */