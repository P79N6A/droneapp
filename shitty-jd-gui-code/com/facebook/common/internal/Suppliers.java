package com.facebook.common.internal;

public class Suppliers
{
  public static <T> Supplier<T> of(T paramT)
  {
    new Supplier()
    {
      public T get()
      {
        return (T)this.val$instance;
      }
    };
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/common/internal/Suppliers.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */