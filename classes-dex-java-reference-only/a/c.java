package a;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

public class c
{
  private Uri a;
  private List<a> b;
  private Uri c;
  
  public c(Uri paramUri1, List<a> paramList, Uri paramUri2)
  {
    this.a = paramUri1;
    paramUri1 = paramList;
    if (paramList == null) {
      paramUri1 = Collections.emptyList();
    }
    this.b = paramUri1;
    this.c = paramUri2;
  }
  
  public Uri a()
  {
    return this.a;
  }
  
  public List<a> b()
  {
    return Collections.unmodifiableList(this.b);
  }
  
  public Uri c()
  {
    return this.c;
  }
  
  public static class a
  {
    private final Uri a;
    private final String b;
    private final String c;
    private final String d;
    
    public a(String paramString1, String paramString2, Uri paramUri, String paramString3)
    {
      this.b = paramString1;
      this.c = paramString2;
      this.a = paramUri;
      this.d = paramString3;
    }
    
    public Uri a()
    {
      return this.a;
    }
    
    public String b()
    {
      return this.d;
    }
    
    public String c()
    {
      return this.c;
    }
    
    public String d()
    {
      return this.b;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */