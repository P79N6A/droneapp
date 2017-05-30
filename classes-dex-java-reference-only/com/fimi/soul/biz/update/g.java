package com.fimi.soul.biz.update;

import com.fimi.soul.entity.FirmwareInfo;
import java.util.Comparator;

public class g
  implements Comparator
{
  public int compare(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (FirmwareInfo)paramObject1;
    paramObject2 = (FirmwareInfo)paramObject2;
    if (((FirmwareInfo)paramObject1).getSort() > ((FirmwareInfo)paramObject2).getSort()) {
      return 1;
    }
    return -1;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/update/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */