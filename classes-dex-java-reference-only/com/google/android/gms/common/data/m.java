package com.google.android.gms.common.data;

import java.util.ArrayList;

public abstract class m<T>
  extends a<T>
{
  private boolean b = false;
  private ArrayList<Integer> c;
  
  protected m(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  private void a()
  {
    for (;;)
    {
      int i;
      String str2;
      try
      {
        if (this.b) {
          break label204;
        }
        int j = this.a.g();
        this.c = new ArrayList();
        if (j <= 0) {
          break label199;
        }
        this.c.add(Integer.valueOf(0));
        String str3 = h();
        i = this.a.a(0);
        String str1 = this.a.c(str3, 0, i);
        i = 1;
        if (i >= j) {
          break label199;
        }
        int k = this.a.a(i);
        str2 = this.a.c(str3, i, k);
        if (str2 == null) {
          throw new NullPointerException(String.valueOf(str3).length() + 78 + "Missing value for markerColumn: " + str3 + ", at row: " + i + ", for window: " + k);
        }
      }
      finally {}
      if (!str2.equals(localObject1))
      {
        this.c.add(Integer.valueOf(i));
        Object localObject2 = str2;
        break label207;
        label199:
        this.b = true;
        label204:
        return;
      }
      label207:
      i += 1;
    }
  }
  
  public final T a(int paramInt)
  {
    a();
    return (T)a(b(paramInt), c(paramInt));
  }
  
  protected abstract T a(int paramInt1, int paramInt2);
  
  int b(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.c.size())) {
      throw new IllegalArgumentException(53 + "Position " + paramInt + " is out of bounds for this buffer");
    }
    return ((Integer)this.c.get(paramInt)).intValue();
  }
  
  public int c()
  {
    a();
    return this.c.size();
  }
  
  protected int c(int paramInt)
  {
    int j;
    if ((paramInt < 0) || (paramInt == this.c.size()))
    {
      j = 0;
      return j;
    }
    if (paramInt == this.c.size() - 1) {}
    for (int i = this.a.g() - ((Integer)this.c.get(paramInt)).intValue();; i = ((Integer)this.c.get(paramInt + 1)).intValue() - ((Integer)this.c.get(paramInt)).intValue())
    {
      j = i;
      if (i != 1) {
        break;
      }
      paramInt = b(paramInt);
      int k = this.a.a(paramInt);
      String str = i();
      j = i;
      if (str == null) {
        break;
      }
      j = i;
      if (this.a.c(str, paramInt, k) != null) {
        break;
      }
      return 0;
    }
  }
  
  protected abstract String h();
  
  protected String i()
  {
    return null;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/data/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */