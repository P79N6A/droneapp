package a;

import java.util.ArrayList;
import java.util.List;

public class a
  extends Exception
{
  private static final long serialVersionUID = 1L;
  private Throwable[] a;
  
  public a(String paramString, Throwable[] paramArrayOfThrowable) {}
  
  @Deprecated
  public a(List<Exception> paramList)
  {
    this("There were multiple errors.", (Throwable[])paramList.toArray(new Exception[paramList.size()]));
  }
  
  @Deprecated
  public List<Exception> a()
  {
    ArrayList localArrayList = new ArrayList();
    if (this.a == null) {
      return localArrayList;
    }
    Throwable[] arrayOfThrowable = this.a;
    int j = arrayOfThrowable.length;
    int i = 0;
    if (i < j)
    {
      Throwable localThrowable = arrayOfThrowable[i];
      if ((localThrowable instanceof Exception)) {
        localArrayList.add((Exception)localThrowable);
      }
      for (;;)
      {
        i += 1;
        break;
        localArrayList.add(new Exception(localThrowable));
      }
    }
    return localArrayList;
  }
  
  public Throwable[] b()
  {
    return this.a;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */