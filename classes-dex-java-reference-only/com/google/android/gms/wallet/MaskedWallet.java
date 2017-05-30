package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

public final class MaskedWallet
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<MaskedWallet> CREATOR = new q();
  String a;
  String b;
  String[] c;
  String d;
  Address e;
  Address f;
  LoyaltyWalletObject[] g;
  OfferWalletObject[] h;
  UserAddress i;
  UserAddress j;
  InstrumentInfo[] k;
  private final int l;
  
  private MaskedWallet()
  {
    this.l = 2;
  }
  
  MaskedWallet(int paramInt, String paramString1, String paramString2, String[] paramArrayOfString, String paramString3, Address paramAddress1, Address paramAddress2, LoyaltyWalletObject[] paramArrayOfLoyaltyWalletObject, OfferWalletObject[] paramArrayOfOfferWalletObject, UserAddress paramUserAddress1, UserAddress paramUserAddress2, InstrumentInfo[] paramArrayOfInstrumentInfo)
  {
    this.l = paramInt;
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramArrayOfString;
    this.d = paramString3;
    this.e = paramAddress1;
    this.f = paramAddress2;
    this.g = paramArrayOfLoyaltyWalletObject;
    this.h = paramArrayOfOfferWalletObject;
    this.i = paramUserAddress1;
    this.j = paramUserAddress2;
    this.k = paramArrayOfInstrumentInfo;
  }
  
  public static a a()
  {
    MaskedWallet localMaskedWallet = new MaskedWallet();
    localMaskedWallet.getClass();
    return new a(null);
  }
  
  public static a a(MaskedWallet paramMaskedWallet)
  {
    d.a(paramMaskedWallet);
    return a().a(paramMaskedWallet.c()).b(paramMaskedWallet.d()).a(paramMaskedWallet.e()).a(paramMaskedWallet.f()).c(paramMaskedWallet.g()).a(paramMaskedWallet.h()).a(paramMaskedWallet.i()).a(paramMaskedWallet.j()).b(paramMaskedWallet.k());
  }
  
  public int b()
  {
    return this.l;
  }
  
  public String c()
  {
    return this.a;
  }
  
  public String d()
  {
    return this.b;
  }
  
  public String[] e()
  {
    return this.c;
  }
  
  public InstrumentInfo[] f()
  {
    return this.k;
  }
  
  public String g()
  {
    return this.d;
  }
  
  @Deprecated
  public LoyaltyWalletObject[] h()
  {
    return this.g;
  }
  
  @Deprecated
  public OfferWalletObject[] i()
  {
    return this.h;
  }
  
  public UserAddress j()
  {
    return this.i;
  }
  
  public UserAddress k()
  {
    return this.j;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    q.a(this, paramParcel, paramInt);
  }
  
  public final class a
  {
    private a() {}
    
    public a a(UserAddress paramUserAddress)
    {
      MaskedWallet.this.i = paramUserAddress;
      return this;
    }
    
    public a a(String paramString)
    {
      MaskedWallet.this.a = paramString;
      return this;
    }
    
    public a a(InstrumentInfo[] paramArrayOfInstrumentInfo)
    {
      MaskedWallet.this.k = paramArrayOfInstrumentInfo;
      return this;
    }
    
    @Deprecated
    public a a(LoyaltyWalletObject[] paramArrayOfLoyaltyWalletObject)
    {
      MaskedWallet.this.g = paramArrayOfLoyaltyWalletObject;
      return this;
    }
    
    @Deprecated
    public a a(OfferWalletObject[] paramArrayOfOfferWalletObject)
    {
      MaskedWallet.this.h = paramArrayOfOfferWalletObject;
      return this;
    }
    
    public a a(String[] paramArrayOfString)
    {
      MaskedWallet.this.c = paramArrayOfString;
      return this;
    }
    
    public MaskedWallet a()
    {
      return MaskedWallet.this;
    }
    
    public a b(UserAddress paramUserAddress)
    {
      MaskedWallet.this.j = paramUserAddress;
      return this;
    }
    
    public a b(String paramString)
    {
      MaskedWallet.this.b = paramString;
      return this;
    }
    
    public a c(String paramString)
    {
      MaskedWallet.this.d = paramString;
      return this;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/wallet/MaskedWallet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */