package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class MediaRouteControllerDialogFragment
  extends DialogFragment
{
  private MediaRouteControllerDialog mDialog;
  
  public MediaRouteControllerDialogFragment()
  {
    setCancelable(true);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (this.mDialog != null) {
      this.mDialog.updateLayout();
    }
  }
  
  public MediaRouteControllerDialog onCreateControllerDialog(Context paramContext, Bundle paramBundle)
  {
    return new MediaRouteControllerDialog(paramContext);
  }
  
  public Dialog onCreateDialog(Bundle paramBundle)
  {
    this.mDialog = onCreateControllerDialog(getContext(), paramBundle);
    return this.mDialog;
  }
  
  public void onStop()
  {
    super.onStop();
    if (this.mDialog != null) {
      this.mDialog.clearGroupListAnimation(false);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/app/MediaRouteControllerDialogFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */