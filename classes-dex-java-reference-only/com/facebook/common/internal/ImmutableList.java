package com.facebook.common.internal;

import java.util.ArrayList;
import java.util.List;

public class ImmutableList<E>
  extends ArrayList<E>
{
  private ImmutableList(List<E> paramList)
  {
    super(paramList);
  }
  
  public static <E> ImmutableList<E> copyOf(List<E> paramList)
  {
    return new ImmutableList(paramList);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/common/internal/ImmutableList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */