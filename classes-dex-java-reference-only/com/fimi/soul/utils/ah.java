package com.fimi.soul.utils;

import android.annotation.SuppressLint;
import java.util.LinkedList;

public class ah
{
  private LinkedList a = new LinkedList();
  private int b = 10;
  
  @SuppressLint({"NewApi"})
  public Object a()
  {
    return this.a.peekFirst();
  }
  
  public void a(int paramInt)
  {
    this.b = paramInt;
  }
  
  public void a(Object paramObject)
  {
    if (this.b <= 0) {
      this.a.removeFirst();
    }
    this.a.addLast(paramObject);
    this.b -= 1;
  }
  
  public void a(LinkedList paramLinkedList)
  {
    this.a = paramLinkedList;
  }
  
  public void b()
  {
    this.a.removeFirst();
  }
  
  public int c()
  {
    return this.a.size();
  }
  
  public LinkedList d()
  {
    return this.a;
  }
  
  public int e()
  {
    return this.b;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */