package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.aph;
import com.google.android.gms.internal.apl;
import com.google.android.gms.internal.apx;

@DynamiteApi
public class TagManagerApiImpl
  extends ak.a
{
  private apx a;
  
  public void initialize(e parame, aj paramaj, af paramaf)
  {
    this.a = apx.a((Context)f.a(parame), paramaj, paramaf);
    this.a.a();
  }
  
  @Deprecated
  public void preview(Intent paramIntent, e parame)
  {
    aph.b("Deprecated. Please use previewIntent instead.");
  }
  
  public void previewIntent(Intent paramIntent, e parame1, e parame2, aj paramaj, af paramaf)
  {
    parame1 = (Context)f.a(parame1);
    parame2 = (Context)f.a(parame2);
    this.a = apx.a(parame1, paramaj, paramaf);
    new apl(paramIntent, parame1, parame2, this.a).a();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/tagmanager/TagManagerApiImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */