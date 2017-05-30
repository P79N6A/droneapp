package com.fimi.soul.biz.j;

import java.util.Observable;

public class a
  extends Observable
{
  private boolean a;
  
  public void a(boolean paramBoolean)
  {
    if (!this.a) {}
    for (boolean bool = true;; bool = false)
    {
      if (bool == paramBoolean)
      {
        setChanged();
        notifyObservers();
      }
      this.a = paramBoolean;
      return;
    }
  }
  
  public boolean a()
  {
    return this.a;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/j/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */