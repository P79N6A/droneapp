package com.fimi.soul.biz.m;

import android.content.Context;
import com.fimi.soul.entity.BroadcastComment;
import com.fimi.soul.entity.BroadcastMode;
import com.fimi.soul.entity.PlaneMsg;

public abstract interface c
  extends b
{
  public abstract PlaneMsg a(Context paramContext, int paramInt);
  
  public abstract PlaneMsg a(Context paramContext, BroadcastComment paramBroadcastComment);
  
  public abstract PlaneMsg a(Context paramContext, String paramString, int paramInt);
  
  public abstract PlaneMsg a(Context paramContext, String paramString1, String paramString2);
  
  public abstract PlaneMsg a(BroadcastMode paramBroadcastMode, Context paramContext);
  
  public abstract PlaneMsg b(Context paramContext, int paramInt);
  
  public abstract PlaneMsg b(Context paramContext, String paramString, int paramInt);
  
  public abstract PlaneMsg b(Context paramContext, String paramString1, String paramString2);
  
  public abstract PlaneMsg b(BroadcastMode paramBroadcastMode, Context paramContext);
  
  public abstract PlaneMsg c(Context paramContext, String paramString, int paramInt);
  
  public abstract PlaneMsg c(BroadcastMode paramBroadcastMode, Context paramContext);
  
  public abstract PlaneMsg c(String paramString, Context paramContext);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/m/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */