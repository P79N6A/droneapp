package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class r
{
  public static final r a = a("\t\n\013\f\r     　 ᠎ ").a(a(' ', ' '));
  public static final r b = a("\t\n\013\f\r     　").a(a(' ', ' ')).a(a(' ', ' '));
  public static final r c = a('\000', '');
  public static final r d;
  public static final r e = a('\t', '\r').a(a('\034', ' ')).a(a(' ')).a(a('᠎')).a(a(' ', ' ')).a(a(' ', '​')).a(a(' ', ' ')).a(a(' ')).a(a('　'));
  public static final r f = new r()
  {
    public boolean b(char paramAnonymousChar)
    {
      return Character.isDigit(paramAnonymousChar);
    }
  };
  public static final r g = new r()
  {
    public boolean b(char paramAnonymousChar)
    {
      return Character.isLetter(paramAnonymousChar);
    }
  };
  public static final r h = new r()
  {
    public boolean b(char paramAnonymousChar)
    {
      return Character.isLetterOrDigit(paramAnonymousChar);
    }
  };
  public static final r i = new r()
  {
    public boolean b(char paramAnonymousChar)
    {
      return Character.isUpperCase(paramAnonymousChar);
    }
  };
  public static final r j = new r()
  {
    public boolean b(char paramAnonymousChar)
    {
      return Character.isLowerCase(paramAnonymousChar);
    }
  };
  public static final r k = a('\000', '\037').a(a('', ''));
  public static final r l = a('\000', ' ').a(a('', ' ')).a(a('­')).a(a('؀', '؃')).a(a("۝܏ ឴឵᠎")).a(a(' ', '‏')).a(a(' ', ' ')).a(a(' ', '⁤')).a(a('⁪', '⁯')).a(a('　')).a(a(55296, 63743)).a(a("﻿￹￺￻"));
  public static final r m = a('\000', 'ӹ').a(a('־')).a(a('א', 'ת')).a(a('׳')).a(a('״')).a(a('؀', 'ۿ')).a(a('ݐ', 'ݿ')).a(a('฀', '๿')).a(a('Ḁ', '₯')).a(a('℀', '℺')).a(a(64336, 65023)).a(a(65136, 65279)).a(a(65377, 65500));
  public static final r n = new r()
  {
    public r a(r paramAnonymousr)
    {
      d.a(paramAnonymousr);
      return this;
    }
    
    public boolean b(char paramAnonymousChar)
    {
      return true;
    }
    
    public boolean b(CharSequence paramAnonymousCharSequence)
    {
      d.a(paramAnonymousCharSequence);
      return true;
    }
  };
  public static final r o = new r()
  {
    public r a(r paramAnonymousr)
    {
      return (r)d.a(paramAnonymousr);
    }
    
    public boolean b(char paramAnonymousChar)
    {
      return false;
    }
    
    public boolean b(CharSequence paramAnonymousCharSequence)
    {
      return paramAnonymousCharSequence.length() == 0;
    }
  };
  
  static
  {
    r localr = a('0', '9');
    char[] arrayOfChar = "٠۰߀०০੦૦୦௦౦೦൦๐໐༠၀႐០᠐᥆᧐᭐᮰᱀᱐꘠꣐꤀꩐０".toCharArray();
    int i2 = arrayOfChar.length;
    int i1 = 0;
    while (i1 < i2)
    {
      char c1 = arrayOfChar[i1];
      localr = localr.a(a(c1, (char)(c1 + '\t')));
      i1 += 1;
    }
    d = localr;
  }
  
  public static r a(char paramChar)
  {
    new r()
    {
      public r a(r paramAnonymousr)
      {
        if (paramAnonymousr.b(this.p)) {
          return paramAnonymousr;
        }
        return super.a(paramAnonymousr);
      }
      
      public boolean b(char paramAnonymousChar)
      {
        return paramAnonymousChar == this.p;
      }
    };
  }
  
  public static r a(char paramChar1, final char paramChar2)
  {
    if (paramChar2 >= paramChar1) {}
    for (boolean bool = true;; bool = false)
    {
      d.b(bool);
      new r()
      {
        public boolean b(char paramAnonymousChar)
        {
          return (this.p <= paramAnonymousChar) && (paramAnonymousChar <= paramChar2);
        }
      };
    }
  }
  
  public static r a(CharSequence paramCharSequence)
  {
    switch (paramCharSequence.length())
    {
    default: 
      paramCharSequence = paramCharSequence.toString().toCharArray();
      Arrays.sort(paramCharSequence);
      new r()
      {
        public boolean b(char paramAnonymousChar)
        {
          return Arrays.binarySearch(r.this, paramAnonymousChar) >= 0;
        }
      };
    case 0: 
      return o;
    case 1: 
      return a(paramCharSequence.charAt(0));
    }
    new r()
    {
      public boolean b(char paramAnonymousChar)
      {
        return (paramAnonymousChar == this.p) || (paramAnonymousChar == this.q);
      }
    };
  }
  
  public r a(r paramr)
  {
    return new a(Arrays.asList(new r[] { this, (r)d.a(paramr) }));
  }
  
  public abstract boolean b(char paramChar);
  
  public boolean b(CharSequence paramCharSequence)
  {
    int i1 = paramCharSequence.length() - 1;
    while (i1 >= 0)
    {
      if (!b(paramCharSequence.charAt(i1))) {
        return false;
      }
      i1 -= 1;
    }
    return true;
  }
  
  private static class a
    extends r
  {
    List<r> p;
    
    a(List<r> paramList)
    {
      this.p = paramList;
    }
    
    public r a(r paramr)
    {
      ArrayList localArrayList = new ArrayList(this.p);
      localArrayList.add((r)d.a(paramr));
      return new a(localArrayList);
    }
    
    public boolean b(char paramChar)
    {
      Iterator localIterator = this.p.iterator();
      while (localIterator.hasNext()) {
        if (((r)localIterator.next()).b(paramChar)) {
          return true;
        }
      }
      return false;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/internal/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */