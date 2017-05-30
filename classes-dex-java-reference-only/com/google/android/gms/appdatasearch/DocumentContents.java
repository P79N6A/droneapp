package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class DocumentContents
  extends AbstractSafeParcelable
{
  public static final b CREATOR = new b();
  final int a;
  final DocumentSection[] b;
  public final String c;
  public final boolean d;
  public final Account e;
  
  DocumentContents(int paramInt, DocumentSection[] paramArrayOfDocumentSection, String paramString, boolean paramBoolean, Account paramAccount)
  {
    this.a = paramInt;
    this.b = paramArrayOfDocumentSection;
    this.c = paramString;
    this.d = paramBoolean;
    this.e = paramAccount;
  }
  
  DocumentContents(String paramString, boolean paramBoolean, Account paramAccount, DocumentSection... paramVarArgs)
  {
    this(1, paramVarArgs, paramString, paramBoolean, paramAccount);
    if (paramVarArgs != null)
    {
      paramString = new BitSet(h.a());
      int i = 0;
      while (i < paramVarArgs.length)
      {
        int j = paramVarArgs[i].e;
        if (j != -1)
        {
          if (paramString.get(j))
          {
            paramString = String.valueOf(h.a(j));
            if (paramString.length() != 0) {}
            for (paramString = "Duplicate global search section type ".concat(paramString);; paramString = new String("Duplicate global search section type ")) {
              throw new IllegalArgumentException(paramString);
            }
          }
          paramString.set(j);
        }
        i += 1;
      }
    }
  }
  
  public DocumentSection[] a()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((paramObject instanceof DocumentContents))
    {
      paramObject = (DocumentContents)paramObject;
      bool1 = bool2;
      if (c.a(this.c, ((DocumentContents)paramObject).c))
      {
        bool1 = bool2;
        if (c.a(Boolean.valueOf(this.d), Boolean.valueOf(((DocumentContents)paramObject).d)))
        {
          bool1 = bool2;
          if (c.a(this.e, ((DocumentContents)paramObject).e))
          {
            bool1 = bool2;
            if (Arrays.equals(a(), ((DocumentContents)paramObject).a())) {
              bool1 = true;
            }
          }
        }
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    return c.a(new Object[] { this.c, Boolean.valueOf(this.d), this.e, Integer.valueOf(Arrays.hashCode(this.b)) });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b localb = CREATOR;
    b.a(this, paramParcel, paramInt);
  }
  
  public static class a
  {
    private List<DocumentSection> a;
    private String b;
    private boolean c;
    private Account d;
    
    public a a(Account paramAccount)
    {
      this.d = paramAccount;
      return this;
    }
    
    public a a(DocumentSection paramDocumentSection)
    {
      if ((this.a == null) && (paramDocumentSection != null)) {
        this.a = new ArrayList();
      }
      if (paramDocumentSection != null) {
        this.a.add(paramDocumentSection);
      }
      return this;
    }
    
    public a a(String paramString)
    {
      this.b = paramString;
      return this;
    }
    
    public a a(boolean paramBoolean)
    {
      this.c = paramBoolean;
      return this;
    }
    
    public DocumentContents a()
    {
      String str = this.b;
      boolean bool = this.c;
      Account localAccount = this.d;
      if (this.a != null) {}
      for (DocumentSection[] arrayOfDocumentSection = (DocumentSection[])this.a.toArray(new DocumentSection[this.a.size()]);; arrayOfDocumentSection = null) {
        return new DocumentContents(str, bool, localAccount, arrayOfDocumentSection);
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/appdatasearch/DocumentContents.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */