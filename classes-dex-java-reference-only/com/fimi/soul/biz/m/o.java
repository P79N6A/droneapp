package com.fimi.soul.biz.m;

import android.content.Context;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.Relation;
import com.fimi.soul.entity.User;

public abstract interface o
  extends b
{
  public abstract PlaneMsg a(Relation paramRelation, Context paramContext);
  
  public abstract PlaneMsg a(User paramUser, int paramInt, String paramString, Context paramContext);
  
  public abstract PlaneMsg a(User paramUser, Context paramContext);
  
  public abstract PlaneMsg a(String paramString, int paramInt, Context paramContext);
  
  public abstract PlaneMsg a(String paramString1, String paramString2, Context paramContext);
  
  public abstract PlaneMsg b(Context paramContext);
  
  public abstract PlaneMsg b(User paramUser, Context paramContext);
  
  public abstract PlaneMsg b(String paramString, int paramInt, Context paramContext);
  
  public abstract PlaneMsg b(String paramString1, String paramString2, Context paramContext);
  
  public abstract PlaneMsg c(Context paramContext);
  
  public abstract PlaneMsg c(User paramUser, Context paramContext);
  
  public abstract PlaneMsg c(String paramString, int paramInt, Context paramContext);
  
  public abstract PlaneMsg c(String paramString, Context paramContext);
  
  public abstract PlaneMsg c(String paramString1, String paramString2, Context paramContext);
  
  public abstract PlaneMsg d(User paramUser, Context paramContext);
  
  public abstract PlaneMsg e(User paramUser, Context paramContext);
  
  public abstract PlaneMsg f(User paramUser, Context paramContext);
  
  public abstract PlaneMsg g(User paramUser, Context paramContext);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/m/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */