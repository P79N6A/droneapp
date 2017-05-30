package com.fimi.soul.entity;

import com.google.android.gms.maps.model.LatLng;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CheckCampssBeann
  implements Serializable
{
  private List<LatLng> listLatlng = new ArrayList();
  
  public List<LatLng> getListLatlng()
  {
    return this.listLatlng;
  }
  
  public void setListLatlng(List<LatLng> paramList)
  {
    this.listLatlng = paramList;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/CheckCampssBeann.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */