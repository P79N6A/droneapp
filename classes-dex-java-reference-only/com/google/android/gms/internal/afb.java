package com.google.android.gms.internal;

public enum afb
{
  private final String aa;
  
  private afb(String paramString)
  {
    this.aa = paramString;
  }
  
  public static final afb a(String paramString)
  {
    Object localObject = null;
    afb[] arrayOfafb = values();
    int i2 = arrayOfafb.length;
    int i1 = 0;
    if (i1 < i2)
    {
      afb localafb = arrayOfafb[i1];
      if (!localafb.aa.equals(paramString)) {
        break label48;
      }
      localObject = localafb;
    }
    label48:
    for (;;)
    {
      i1 += 1;
      break;
      return (afb)localObject;
    }
  }
  
  public static boolean a(afb paramafb)
  {
    return (i.equals(paramafb)) || (r.equals(paramafb)) || (u.equals(paramafb)) || (m.equals(paramafb)) || (x.equals(paramafb)) || (b.equals(paramafb)) || (C.equals(paramafb)) || (D.equals(paramafb)) || (E.equals(paramafb)) || (F.equals(paramafb)) || (G.equals(paramafb)) || (H.equals(paramafb)) || (I.equals(paramafb)) || (B.equals(paramafb));
  }
  
  public static boolean b(afb paramafb)
  {
    return (f.equals(paramafb)) || (g.equals(paramafb));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/afb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */