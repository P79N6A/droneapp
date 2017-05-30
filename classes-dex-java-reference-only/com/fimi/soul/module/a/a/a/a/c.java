package com.fimi.soul.module.a.a.a.a;

import android.content.Context;
import com.fimi.soul.module.a.a.a.i;
import com.fimi.soul.module.a.a.a.j;
import com.mob.tools.utils.R;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class c
  extends j
{
  private static final int k = 1280;
  private static final int l = 160;
  private static final int m = 1;
  private static final int n = 76;
  private static final int o = 20;
  
  public c(i parami, ArrayList<Object> paramArrayList)
  {
    super(parami, paramArrayList);
  }
  
  protected void a(Context paramContext, ArrayList<Object> paramArrayList)
  {
    int i = 1;
    int j = R.getScreenWidth(paramContext);
    float f = j / 1280.0F;
    this.g = (j / (int)(160.0F * f));
    this.h = ((int)(1.0F * f));
    if (this.h < 1) {}
    for (;;)
    {
      this.h = i;
      this.j = ((int)(76.0F * f));
      this.i = ((int)(20.0F * f));
      this.d = ((int)(52.0F * f));
      this.f = ((j - this.h * 3) / (this.g - 1));
      this.e = (this.f + this.h);
      return;
      i = this.h;
    }
  }
  
  protected void a(ArrayList<Object> paramArrayList)
  {
    int i1 = paramArrayList.size();
    int j;
    int i;
    if (i1 < this.g)
    {
      j = i1 / this.g;
      i = j;
      if (i1 % this.g != 0) {
        i = j + 1;
      }
    }
    for (this.c = ((Object[][])Array.newInstance(Object.class, new int[] { 1, i * this.g }));; this.c = ((Object[][])Array.newInstance(Object.class, new int[] { i, this.g })))
    {
      i = 0;
      while (i < i1)
      {
        j = i / this.g;
        this.c[j][(i - j * this.g)] = paramArrayList.get(i);
        i += 1;
      }
      j = i1 / this.g;
      i = j;
      if (i1 % this.g != 0) {
        i = j + 1;
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/a/a/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */