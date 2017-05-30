package com.google.android.gms.common.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.util.Log;
import com.google.android.gms.internal.aik;

public abstract class u
  implements DialogInterface.OnClickListener
{
  public static u a(final Activity paramActivity, Intent paramIntent, final int paramInt)
  {
    new u()
    {
      public void a()
      {
        if (u.this != null) {
          paramActivity.startActivityForResult(u.this, paramInt);
        }
      }
    };
  }
  
  public static u a(@NonNull final Fragment paramFragment, Intent paramIntent, final int paramInt)
  {
    new u()
    {
      public void a()
      {
        if (u.this != null) {
          paramFragment.startActivityForResult(u.this, paramInt);
        }
      }
    };
  }
  
  public static u a(@NonNull final aik paramaik, Intent paramIntent, final int paramInt)
  {
    new u()
    {
      @TargetApi(11)
      public void a()
      {
        if (u.this != null) {
          paramaik.startActivityForResult(u.this, paramInt);
        }
      }
    };
  }
  
  public abstract void a();
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    try
    {
      a();
      paramDialogInterface.dismiss();
      return;
    }
    catch (ActivityNotFoundException paramDialogInterface)
    {
      Log.e("DialogRedirect", "Can't redirect to app settings for Google Play services", paramDialogInterface);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/internal/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */