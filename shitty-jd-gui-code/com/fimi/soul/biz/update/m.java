package com.fimi.soul.biz.update;

import com.fimi.soul.entity.UpdateVersonBean;
import java.util.Comparator;

public class m
  implements Comparator
{
  public int compare(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (UpdateVersonBean)paramObject1;
    paramObject2 = (UpdateVersonBean)paramObject2;
    if (((UpdateVersonBean)paramObject1).getSort() > ((UpdateVersonBean)paramObject2).getSort()) {
      return 1;
    }
    return -1;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/update/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */