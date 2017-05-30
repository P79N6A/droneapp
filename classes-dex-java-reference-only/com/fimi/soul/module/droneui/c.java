package com.fimi.soul.module.droneui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;

public class c
{
  public static ProgressDialog a(Context paramContext, int paramInt)
  {
    ProgressDialog localProgressDialog = new ProgressDialog(paramContext);
    localProgressDialog.onWindowFocusChanged(false);
    localProgressDialog.setCancelable(false);
    localProgressDialog.setProgressStyle(1);
    localProgressDialog.setTitle(paramContext.getResources().getString(2131362876));
    localProgressDialog.setMax(paramInt);
    localProgressDialog.setCancelable(true);
    localProgressDialog.setCanceledOnTouchOutside(false);
    if (!((Activity)paramContext).isFinishing()) {
      localProgressDialog.show();
    }
    return localProgressDialog;
  }
  
  public static ProgressDialog a(Context paramContext, int paramInt1, int paramInt2)
  {
    ProgressDialog localProgressDialog = new ProgressDialog(paramContext);
    localProgressDialog.onWindowFocusChanged(false);
    localProgressDialog.setCancelable(false);
    localProgressDialog.setProgressStyle(1);
    localProgressDialog.setTitle(paramContext.getResources().getString(2131362876));
    localProgressDialog.setMax(paramInt2);
    localProgressDialog.setCancelable(true);
    localProgressDialog.setCanceledOnTouchOutside(false);
    if (!((Activity)paramContext).isFinishing()) {
      localProgressDialog.show();
    }
    return localProgressDialog;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */