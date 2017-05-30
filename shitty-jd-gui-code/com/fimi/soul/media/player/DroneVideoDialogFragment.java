package com.fimi.soul.media.player;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.fimi.kernel.c;
import com.fimi.kernel.c.a;

@SuppressLint({"ValidFragment"})
public class DroneVideoDialogFragment
  extends DialogFragment
  implements FermiPlayerViewBuilder.OnDisappearButtonListener
{
  private static final String SP_KEY_FRAGMENT_POSITION = "SP_KEY_FRAGMENT_POSITION_VideoDialogFragment";
  private static final String SP_KEY_PLAYER_ADDR = "SP_KEY_PLAYER_ADDR_VideoDialogFragment";
  private View bottomView;
  private int currentPosition = 0;
  a manager = null;
  private IFermiMediaPlayer player;
  private View topView;
  private String url = "";
  
  public static DroneVideoDialogFragment newInstance(String paramString)
  {
    DroneVideoDialogFragment localDroneVideoDialogFragment = new DroneVideoDialogFragment();
    localDroneVideoDialogFragment.url = paramString;
    c.c().a("SP_KEY_PLAYER_ADDR_VideoDialogFragment", paramString);
    return localDroneVideoDialogFragment;
  }
  
  public void dismissDialog()
  {
    this.player.stop();
    this.currentPosition = 0;
    this.manager.a("SP_KEY_FRAGMENT_POSITION_VideoDialogFragment", this.currentPosition);
    dismiss();
  }
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    dismissDialog();
    super.onCancel(paramDialogInterface);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.manager = c.c();
    setStyle(2131427437, 16973831);
    this.currentPosition = this.manager.b("SP_KEY_FRAGMENT_POSITION_VideoDialogFragment");
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
    this.player = FermiMediaManager.getDefaultManager(getActivity()).createFermiMediaPlayer(FermiMediaPlayerType.SystemMediaPlayer);
    this.player.setAutoPlay(true);
    this.player.setPlayPosition(this.currentPosition);
    this.url = this.manager.a("SP_KEY_PLAYER_ADDR_VideoDialogFragment");
    paramLayoutInflater = FermiPlayerViewBuilder.Builder(getActivity(), 2130968723).setFermiMediaPlayer(this.player).setOnClickCloseListenner(new FermiPlayerViewBuilder.OnClickCloseListener()
    {
      public void onClose(View paramAnonymousView)
      {
        DroneVideoDialogFragment.this.player.stop();
        DroneVideoDialogFragment.this.dismissDialog();
      }
    }).setOnDisappearButtonListener(this).create();
    this.topView = paramLayoutInflater.findViewById(2131689848);
    this.bottomView = paramLayoutInflater.findViewById(2131690355);
    this.player.setMediaUri(this.url);
    this.player.prepare();
    return paramLayoutInflater;
  }
  
  public void onDisappearButton(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.topView.setVisibility(8);
      this.bottomView.setVisibility(8);
      return;
    }
    this.topView.setVisibility(0);
    this.bottomView.setVisibility(0);
  }
  
  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.player.play();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/player/DroneVideoDialogFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */