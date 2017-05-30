package com.google.android.gms.b;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.internal.d;
import java.util.ArrayList;

public class e
{
  final Bundle q;
  
  e(Bundle paramBundle)
  {
    this.q = paramBundle;
  }
  
  public Bundle a()
  {
    return this.q;
  }
  
  public static class a
  {
    final Bundle a = new Bundle();
    
    public a b(Uri paramUri)
    {
      d.a(paramUri);
      b("url", paramUri.toString());
      return this;
    }
    
    public a b(String paramString, e parame)
    {
      d.a(paramString);
      if (parame != null) {
        this.a.putParcelable(paramString, parame.q);
      }
      return this;
    }
    
    public a b(String paramString1, String paramString2)
    {
      d.a(paramString1);
      if (paramString2 != null) {
        this.a.putString(paramString1, paramString2);
      }
      return this;
    }
    
    public a b(String paramString, boolean paramBoolean)
    {
      d.a(paramString);
      this.a.putBoolean(paramString, paramBoolean);
      return this;
    }
    
    public a b(String paramString, e[] paramArrayOfe)
    {
      d.a(paramString);
      if (paramArrayOfe != null)
      {
        ArrayList localArrayList = new ArrayList();
        int j = paramArrayOfe.length;
        int i = 0;
        while (i < j)
        {
          e locale = paramArrayOfe[i];
          if (locale != null) {
            localArrayList.add(locale.q);
          }
          i += 1;
        }
        this.a.putParcelableArray(paramString, (Parcelable[])localArrayList.toArray(new Bundle[localArrayList.size()]));
      }
      return this;
    }
    
    public a b(String paramString, String[] paramArrayOfString)
    {
      d.a(paramString);
      if (paramArrayOfString != null) {
        this.a.putStringArray(paramString, paramArrayOfString);
      }
      return this;
    }
    
    public e b()
    {
      return new e(this.a);
    }
    
    public a c(String paramString)
    {
      d.a(paramString);
      b("name", paramString);
      return this;
    }
    
    public a d(String paramString)
    {
      if (paramString != null) {
        b("id", paramString);
      }
      return this;
    }
    
    public a e(String paramString)
    {
      b("type", paramString);
      return this;
    }
    
    public a f(String paramString)
    {
      b("description", paramString);
      return this;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */