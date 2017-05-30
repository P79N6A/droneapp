package com.fimi.soul.module.a.a.a.b;

import android.content.Context;
import com.fimi.soul.module.a.a.a.i;
import com.fimi.soul.module.a.a.a.j;
import com.mob.tools.utils.R;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class c
  extends j
{
  private static final int k = 720;
  private static final int l = 1;
  private static final int m = 76;
  private static final int n = 20;
  private static final int o = 12;
  private static final int p = 4;
  
  public c(i parami, ArrayList<Object> paramArrayList)
  {
    super(parami, paramArrayList);
  }
  
  protected void a(Context paramContext, ArrayList<Object> paramArrayList)
  {
    int i = 1;
    int j = R.getScreenWidth(paramContext);
    this.g = 4;
    float f = j / 720.0F;
    this.h = ((int)(1.0F * f));
    if (this.h < 1) {}
    for (;;)
    {
      this.h = i;
      this.j = ((int)(76.0F * f));
      this.i = ((int)(20.0F * f));
      this.d = ((int)(52.0F * f));
      this.f = ((j - this.h * 3) / 4);
      if (paramArrayList.size() > this.g) {
        break;
      }
      this.e = (this.f + this.h);
      return;
      i = this.h;
    }
    if (paramArrayList.size() <= 12 - this.g)
    {
      this.e = ((this.f + this.h) * 2);
      return;
    }
    this.e = ((this.f + this.h) * 3);
  }
  
  protected void a(ArrayList<Object> paramArrayList)
  {
    int i1 = paramArrayList.size();
    int j;
    int i;
    if (i1 < 12)
    {
      j = i1 / this.g;
      i = j;
      if (i1 % this.g != 0) {
        i = j + 1;
      }
    }
    for (this.c = ((Object[][])Array.newInstance(Object.class, new int[] { 1, i * this.g }));; this.c = ((Object[][])Array.newInstance(Object.class, new int[] { i, 12 })))
    {
      i = 0;
      while (i < i1)
      {
        j = i / 12;
        this.c[j][(i - j * 12)] = paramArrayList.get(i);
        i += 1;
      }
      j = i1 / 12;
      i = j;
      if (i1 % 12 != 0) {
        i = j + 1;
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/a/a/a/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */