package com.b.a.b.f;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.b.a.b.d;

public class c
  implements AbsListView.OnScrollListener
{
  private d a;
  private final boolean b;
  private final boolean c;
  private final AbsListView.OnScrollListener d;
  
  public c(d paramd, boolean paramBoolean1, boolean paramBoolean2)
  {
    this(paramd, paramBoolean1, paramBoolean2, null);
  }
  
  public c(d paramd, boolean paramBoolean1, boolean paramBoolean2, AbsListView.OnScrollListener paramOnScrollListener)
  {
    this.a = paramd;
    this.b = paramBoolean1;
    this.c = paramBoolean2;
    this.d = paramOnScrollListener;
  }
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.d != null) {
      this.d.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    }
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      if (this.d != null) {
        this.d.onScrollStateChanged(paramAbsListView, paramInt);
      }
      return;
      this.a.j();
      continue;
      if (this.b)
      {
        this.a.i();
        continue;
        if (this.c) {
          this.a.i();
        }
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/b/a/b/f/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */