package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collection;

public final class MaskedWalletRequest
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<MaskedWalletRequest> CREATOR = new r();
  String a;
  boolean b;
  boolean c;
  boolean d;
  String e;
  String f;
  String g;
  Cart h;
  boolean i;
  boolean j;
  CountrySpecification[] k;
  boolean l;
  boolean m;
  ArrayList<com.google.android.gms.identity.intents.model.CountrySpecification> n;
  PaymentMethodTokenizationParameters o;
  ArrayList<Integer> p;
  String q;
  private final int r;
  
  MaskedWalletRequest()
  {
    this.r = 3;
    this.l = true;
    this.m = true;
  }
  
  MaskedWalletRequest(int paramInt, String paramString1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString2, String paramString3, String paramString4, Cart paramCart, boolean paramBoolean4, boolean paramBoolean5, CountrySpecification[] paramArrayOfCountrySpecification, boolean paramBoolean6, boolean paramBoolean7, ArrayList<com.google.android.gms.identity.intents.model.CountrySpecification> paramArrayList, PaymentMethodTokenizationParameters paramPaymentMethodTokenizationParameters, ArrayList<Integer> paramArrayList1, String paramString5)
  {
    this.r = paramInt;
    this.a = paramString1;
    this.b = paramBoolean1;
    this.c = paramBoolean2;
    this.d = paramBoolean3;
    this.e = paramString2;
    this.f = paramString3;
    this.g = paramString4;
    this.h = paramCart;
    this.i = paramBoolean4;
    this.j = paramBoolean5;
    this.k = paramArrayOfCountrySpecification;
    this.l = paramBoolean6;
    this.m = paramBoolean7;
    this.n = paramArrayList;
    this.o = paramPaymentMethodTokenizationParameters;
    this.p = paramArrayList1;
    this.q = paramString5;
  }
  
  public static a a()
  {
    MaskedWalletRequest localMaskedWalletRequest = new MaskedWalletRequest();
    localMaskedWalletRequest.getClass();
    return new a(null);
  }
  
  public int b()
  {
    return this.r;
  }
  
  public String c()
  {
    return this.a;
  }
  
  public boolean d()
  {
    return this.b;
  }
  
  public boolean e()
  {
    return this.c;
  }
  
  @Deprecated
  public boolean f()
  {
    return this.d;
  }
  
  public String g()
  {
    return this.e;
  }
  
  public String h()
  {
    return this.f;
  }
  
  public String i()
  {
    return this.g;
  }
  
  public Cart j()
  {
    return this.h;
  }
  
  @Deprecated
  public boolean k()
  {
    return this.j;
  }
  
  public CountrySpecification[] l()
  {
    return this.k;
  }
  
  public boolean m()
  {
    return this.l;
  }
  
  public boolean n()
  {
    return this.m;
  }
  
  public ArrayList<com.google.android.gms.identity.intents.model.CountrySpecification> o()
  {
    return this.n;
  }
  
  public PaymentMethodTokenizationParameters p()
  {
    return this.o;
  }
  
  public ArrayList<Integer> q()
  {
    return this.p;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    r.a(this, paramParcel, paramInt);
  }
  
  public final class a
  {
    private a() {}
    
    public a a(int paramInt)
    {
      if (MaskedWalletRequest.this.p == null) {
        MaskedWalletRequest.this.p = new ArrayList();
      }
      MaskedWalletRequest.this.p.add(Integer.valueOf(paramInt));
      return this;
    }
    
    public a a(com.google.android.gms.identity.intents.model.CountrySpecification paramCountrySpecification)
    {
      if (MaskedWalletRequest.this.n == null) {
        MaskedWalletRequest.this.n = new ArrayList();
      }
      MaskedWalletRequest.this.n.add(paramCountrySpecification);
      return this;
    }
    
    public a a(Cart paramCart)
    {
      MaskedWalletRequest.this.h = paramCart;
      return this;
    }
    
    public a a(PaymentMethodTokenizationParameters paramPaymentMethodTokenizationParameters)
    {
      MaskedWalletRequest.this.o = paramPaymentMethodTokenizationParameters;
      return this;
    }
    
    public a a(String paramString)
    {
      MaskedWalletRequest.this.a = paramString;
      return this;
    }
    
    public a a(Collection<com.google.android.gms.identity.intents.model.CountrySpecification> paramCollection)
    {
      if (paramCollection != null)
      {
        if (MaskedWalletRequest.this.n == null) {
          MaskedWalletRequest.this.n = new ArrayList();
        }
        MaskedWalletRequest.this.n.addAll(paramCollection);
      }
      return this;
    }
    
    public a a(boolean paramBoolean)
    {
      MaskedWalletRequest.this.b = paramBoolean;
      return this;
    }
    
    public MaskedWalletRequest a()
    {
      return MaskedWalletRequest.this;
    }
    
    public a b(String paramString)
    {
      MaskedWalletRequest.this.e = paramString;
      return this;
    }
    
    public a b(Collection<Integer> paramCollection)
    {
      if (paramCollection != null)
      {
        if (MaskedWalletRequest.this.p == null) {
          MaskedWalletRequest.this.p = new ArrayList();
        }
        MaskedWalletRequest.this.p.addAll(paramCollection);
      }
      return this;
    }
    
    public a b(boolean paramBoolean)
    {
      MaskedWalletRequest.this.c = paramBoolean;
      return this;
    }
    
    public a c(String paramString)
    {
      MaskedWalletRequest.this.f = paramString;
      return this;
    }
    
    @Deprecated
    public a c(boolean paramBoolean)
    {
      MaskedWalletRequest.this.d = paramBoolean;
      return this;
    }
    
    public a d(String paramString)
    {
      MaskedWalletRequest.this.g = paramString;
      return this;
    }
    
    @Deprecated
    public a d(boolean paramBoolean)
    {
      MaskedWalletRequest.this.j = paramBoolean;
      return this;
    }
    
    public a e(boolean paramBoolean)
    {
      MaskedWalletRequest.this.l = paramBoolean;
      return this;
    }
    
    public a f(boolean paramBoolean)
    {
      MaskedWalletRequest.this.m = paramBoolean;
      return this;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/wallet/MaskedWalletRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */