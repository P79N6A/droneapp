package a;

public class i<T>
{
  private T a;
  
  public i() {}
  
  public i(T paramT)
  {
    this.a = paramT;
  }
  
  public T a()
  {
    return (T)this.a;
  }
  
  public void a(T paramT)
  {
    this.a = paramT;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */