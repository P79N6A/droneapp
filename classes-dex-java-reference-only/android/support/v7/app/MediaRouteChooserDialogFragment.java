package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.media.MediaRouteSelector;

public class MediaRouteChooserDialogFragment
  extends DialogFragment
{
  private final String ARGUMENT_SELECTOR = "selector";
  private MediaRouteChooserDialog mDialog;
  private MediaRouteSelector mSelector;
  
  public MediaRouteChooserDialogFragment()
  {
    setCancelable(true);
  }
  
  private void ensureRouteSelector()
  {
    if (this.mSelector == null)
    {
      Bundle localBundle = getArguments();
      if (localBundle != null) {
        this.mSelector = MediaRouteSelector.fromBundle(localBundle.getBundle("selector"));
      }
      if (this.mSelector == null) {
        this.mSelector = MediaRouteSelector.EMPTY;
      }
    }
  }
  
  public MediaRouteSelector getRouteSelector()
  {
    ensureRouteSelector();
    return this.mSelector;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (this.mDialog != null) {
      this.mDialog.updateLayout();
    }
  }
  
  public MediaRouteChooserDialog onCreateChooserDialog(Context paramContext, Bundle paramBundle)
  {
    return new MediaRouteChooserDialog(paramContext);
  }
  
  public Dialog onCreateDialog(Bundle paramBundle)
  {
    this.mDialog = onCreateChooserDialog(getContext(), paramBundle);
    this.mDialog.setRouteSelector(getRouteSelector());
    return this.mDialog;
  }
  
  public void setRouteSelector(MediaRouteSelector paramMediaRouteSelector)
  {
    if (paramMediaRouteSelector == null) {
      throw new IllegalArgumentException("selector must not be null");
    }
    ensureRouteSelector();
    if (!this.mSelector.equals(paramMediaRouteSelector))
    {
      this.mSelector = paramMediaRouteSelector;
      Bundle localBundle = getArguments();
      Object localObject = localBundle;
      if (localBundle == null) {
        localObject = new Bundle();
      }
      ((Bundle)localObject).putBundle("selector", paramMediaRouteSelector.asBundle());
      setArguments((Bundle)localObject);
      localObject = (MediaRouteChooserDialog)getDialog();
      if (localObject != null) {
        ((MediaRouteChooserDialog)localObject).setRouteSelector(paramMediaRouteSelector);
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/app/MediaRouteChooserDialogFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */