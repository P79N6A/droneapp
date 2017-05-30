package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public final class PasswordSpecification
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final i CREATOR = new i();
  public static final PasswordSpecification a = new a().a(12, 16).a("abcdefghijkmnopqrstxyzABCDEFGHJKLMNPQRSTXY3456789").a("abcdefghijkmnopqrstxyz", 1).a("ABCDEFGHJKLMNPQRSTXY", 1).a("3456789", 1).a();
  public static final PasswordSpecification b = new a().a(12, 16).a("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890").a("abcdefghijklmnopqrstuvwxyz", 1).a("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 1).a("1234567890", 1).a();
  final int c;
  final String d;
  final List<String> e;
  final List<Integer> f;
  final int g;
  final int h;
  private final int[] i;
  private final Random j;
  
  PasswordSpecification(int paramInt1, String paramString, List<String> paramList, List<Integer> paramList1, int paramInt2, int paramInt3)
  {
    this.c = paramInt1;
    this.d = paramString;
    this.e = Collections.unmodifiableList(paramList);
    this.f = Collections.unmodifiableList(paramList1);
    this.g = paramInt2;
    this.h = paramInt3;
    this.i = a();
    this.j = new SecureRandom();
  }
  
  private int a(char paramChar)
  {
    return paramChar - ' ';
  }
  
  private int[] a()
  {
    int[] arrayOfInt = new int[95];
    Arrays.fill(arrayOfInt, -1);
    Iterator localIterator = this.e.iterator();
    int k = 0;
    while (localIterator.hasNext())
    {
      char[] arrayOfChar = ((String)localIterator.next()).toCharArray();
      int n = arrayOfChar.length;
      int m = 0;
      while (m < n)
      {
        arrayOfInt[a(arrayOfChar[m])] = k;
        m += 1;
      }
      k += 1;
    }
    return arrayOfInt;
  }
  
  private static String b(Collection<Character> paramCollection)
  {
    char[] arrayOfChar = new char[paramCollection.size()];
    paramCollection = paramCollection.iterator();
    int k = 0;
    while (paramCollection.hasNext())
    {
      arrayOfChar[k] = ((Character)paramCollection.next()).charValue();
      k += 1;
    }
    return new String(arrayOfChar);
  }
  
  private static boolean b(int paramInt1, int paramInt2, int paramInt3)
  {
    return (paramInt1 < paramInt2) || (paramInt1 > paramInt3);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    i.a(this, paramParcel, paramInt);
  }
  
  public static class a
  {
    private final TreeSet<Character> a = new TreeSet();
    private final List<String> b = new ArrayList();
    private final List<Integer> c = new ArrayList();
    private int d = 12;
    private int e = 16;
    
    private TreeSet<Character> a(String paramString1, String paramString2)
    {
      if (TextUtils.isEmpty(paramString1)) {
        throw new PasswordSpecification.b(String.valueOf(paramString2).concat(" cannot be null or empty"));
      }
      TreeSet localTreeSet = new TreeSet();
      paramString1 = paramString1.toCharArray();
      int j = paramString1.length;
      int i = 0;
      while (i < j)
      {
        char c1 = paramString1[i];
        if (PasswordSpecification.a(c1, 32, 126)) {
          throw new PasswordSpecification.b(String.valueOf(paramString2).concat(" must only contain ASCII printable characters"));
        }
        localTreeSet.add(Character.valueOf(c1));
        i += 1;
      }
      return localTreeSet;
    }
    
    private void b()
    {
      Iterator localIterator = this.c.iterator();
      for (int i = 0; localIterator.hasNext(); i = ((Integer)localIterator.next()).intValue() + i) {}
      if (i > this.e) {
        throw new PasswordSpecification.b("required character count cannot be greater than the max password size");
      }
    }
    
    private void c()
    {
      boolean[] arrayOfBoolean = new boolean[95];
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext())
      {
        char[] arrayOfChar = ((String)localIterator.next()).toCharArray();
        int j = arrayOfChar.length;
        int i = 0;
        while (i < j)
        {
          char c1 = arrayOfChar[i];
          if (arrayOfBoolean[(c1 - ' ')] != 0) {
            throw new PasswordSpecification.b(58 + "character " + c1 + " occurs in more than one required character set");
          }
          arrayOfBoolean[(c1 - ' ')] = true;
          i += 1;
        }
      }
    }
    
    public a a(int paramInt1, int paramInt2)
    {
      if (paramInt1 < 1) {
        throw new PasswordSpecification.b("minimumSize must be at least 1");
      }
      if (paramInt1 > paramInt2) {
        throw new PasswordSpecification.b("maximumSize must be greater than or equal to minimumSize");
      }
      this.d = paramInt1;
      this.e = paramInt2;
      return this;
    }
    
    public a a(@NonNull String paramString)
    {
      this.a.addAll(a(paramString, "allowedChars"));
      return this;
    }
    
    public a a(@NonNull String paramString, int paramInt)
    {
      if (paramInt < 1) {
        throw new PasswordSpecification.b("count must be at least 1");
      }
      paramString = a(paramString, "requiredChars");
      this.b.add(PasswordSpecification.a(paramString));
      this.c.add(Integer.valueOf(paramInt));
      return this;
    }
    
    public PasswordSpecification a()
    {
      if (this.a.isEmpty()) {
        throw new PasswordSpecification.b("no allowed characters specified");
      }
      b();
      c();
      return new PasswordSpecification(1, PasswordSpecification.a(this.a), this.b, this.c, this.d, this.e);
    }
  }
  
  public static class b
    extends Error
  {
    public b(String paramString)
    {
      super();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/PasswordSpecification.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */