package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import com.google.android.gms.common.internal.d;

public class SupportErrorDialogFragment
  extends DialogFragment
{
  private Dialog a = null;
  private DialogInterface.OnCancelListener b = null;
  
  public static SupportErrorDialogFragment a(Dialog paramDialog)
  {
    return a(paramDialog, null);
  }
  
  public static SupportErrorDialogFragment a(Dialog paramDialog, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    SupportErrorDialogFragment localSupportErrorDialogFragment = new SupportErrorDialogFragment();
    paramDialog = (Dialog)d.a(paramDialog, "Cannot display null dialog");
    paramDialog.setOnCancelListener(null);
    paramDialog.setOnDismissListener(null);
    localSupportErrorDialogFragment.a = paramDialog;
    if (paramOnCancelListener != null) {
      localSupportErrorDialogFragment.b = paramOnCancelListener;
    }
    return localSupportErrorDialogFragment;
  }
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.b != null) {
      this.b.onCancel(paramDialogInterface);
    }
  }
  
  public Dialog onCreateDialog(Bundle paramBundle)
  {
    if (this.a == null) {
      setShowsDialog(false);
    }
    return this.a;
  }
  
  public void show(FragmentManager paramFragmentManager, String paramString)
  {
    super.show(paramFragmentManager, paramString);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/SupportErrorDialogFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */