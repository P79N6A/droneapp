package it.a.a.b;

import it.a.a.t;
import java.util.ArrayList;

public class b
  implements t
{
  private ArrayList a = new ArrayList();
  
  public b() {}
  
  public b(ArrayList paramArrayList)
  {
    int j = paramArrayList.size();
    int i = 0;
    while (i < j)
    {
      Object localObject = paramArrayList.get(i);
      if ((localObject instanceof String)) {
        b((String)localObject);
      }
      i += 1;
    }
  }
  
  public b(String[] paramArrayOfString)
  {
    int i = 0;
    while (i < paramArrayOfString.length)
    {
      b(paramArrayOfString[i]);
      i += 1;
    }
  }
  
  public boolean a(String paramString)
  {
    synchronized (this.a)
    {
      boolean bool = this.a.contains(paramString);
      return bool;
    }
  }
  
  public void b(String paramString)
  {
    synchronized (this.a)
    {
      paramString = paramString.toLowerCase();
      this.a.add(paramString);
      return;
    }
  }
  
  public String[] b()
  {
    synchronized (this.a)
    {
      int j = this.a.size();
      String[] arrayOfString = new String[j];
      int i = 0;
      while (i < j)
      {
        arrayOfString[i] = ((String)this.a.get(i));
        i += 1;
      }
      return arrayOfString;
    }
  }
  
  public void c(String paramString)
  {
    synchronized (this.a)
    {
      paramString = paramString.toLowerCase();
      this.a.remove(paramString);
      return;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/it/a/a/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */