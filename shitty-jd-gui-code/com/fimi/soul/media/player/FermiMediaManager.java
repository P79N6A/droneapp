package com.fimi.soul.media.player;

import android.app.Dialog;
import android.app.FragmentManager;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

public final class FermiMediaManager
{
  public static final String FERMI_PLAYER_TEMP_VARIABLE = "FERMI_PLAYER_TEMP_VARIABLE";
  private static FermiMediaManager fermiMediaManager;
  private Context context;
  private Dialog dialog;
  private DroneVideoDialogFragment droneFragment;
  private VideoDialogFragment fragment;
  private IFermiMediaPlayer player = null;
  
  private Context getContext()
  {
    return this.context;
  }
  
  public static FermiMediaManager getDefaultManager(Context paramContext)
  {
    try
    {
      if (fermiMediaManager == null) {
        fermiMediaManager = new FermiMediaManager();
      }
      fermiMediaManager.context = paramContext;
      paramContext = fermiMediaManager;
      return paramContext;
    }
    finally {}
  }
  
  public IFermiMediaPlayer createFermiMediaPlayer(FermiMediaPlayerType paramFermiMediaPlayerType)
  {
    switch (paramFermiMediaPlayerType)
    {
    default: 
      return null;
    }
    return new FermiSystemMediaPlayer(getContext());
  }
  
  public void dismissPopVideoView()
  {
    if (this.fragment != null)
    {
      this.fragment.dismissDialog();
      this.fragment = null;
    }
    if (this.dialog != null)
    {
      this.dialog.dismiss();
      this.dialog = null;
    }
  }
  
  public void showFullScreenPopVideoView(FragmentManager paramFragmentManager, String paramString)
  {
    this.droneFragment = DroneVideoDialogFragment.newInstance(paramString);
    this.droneFragment.show(paramFragmentManager, paramString);
  }
  
  public void showPopVideoView(FragmentManager paramFragmentManager, String paramString)
  {
    this.fragment = VideoDialogFragment.newInstance(paramString);
    this.fragment.show(paramFragmentManager, "VIDEO_DIALOG_FRAGMENT");
  }
  
  public void showPopVideoView(String paramString)
  {
    final FermiPlayerDialog localFermiPlayerDialog = new FermiPlayerDialog(getContext(), 2131427437);
    final IFermiMediaPlayer localIFermiMediaPlayer = createFermiMediaPlayer(FermiMediaPlayerType.SystemMediaPlayer);
    localIFermiMediaPlayer.setAutoPlay(true);
    localFermiPlayerDialog.setContentView(FermiPlayerViewBuilder.Builder(getContext(), 2130968724).setFermiMediaPlayer(localIFermiMediaPlayer).setOnClickCloseListenner(new FermiPlayerViewBuilder.OnClickCloseListener()
    {
      public void onClose(View paramAnonymousView)
      {
        localIFermiMediaPlayer.stop();
        localFermiPlayerDialog.dismiss();
      }
    }).setOnDoubleTapListener(new FermiPlayerViewBuilder.OnDoubleTapListener()
    {
      public void onDoubleTap(MotionEvent paramAnonymousMotionEvent) {}
    }).create());
    if (paramString != null) {
      localIFermiMediaPlayer.setMediaUri(paramString);
    }
    localFermiPlayerDialog.show();
  }
  
  public void showPopVideoViewWithNoSeekBar(String paramString)
  {
    this.dialog = new FermiPlayerDialog(getContext(), 2131427437);
    final IFermiMediaPlayer localIFermiMediaPlayer = createFermiMediaPlayer(FermiMediaPlayerType.SystemMediaPlayer);
    localIFermiMediaPlayer.setAutoPlay(true);
    View localView = FermiPlayerViewBuilder.Builder(getContext(), 2130968724).setFermiMediaPlayer(localIFermiMediaPlayer).setOnClickCloseListenner(new FermiPlayerViewBuilder.OnClickCloseListener()
    {
      public void onClose(View paramAnonymousView)
      {
        localIFermiMediaPlayer.stop();
        FermiMediaManager.this.dialog.dismiss();
      }
    }).setOnDoubleTapListener(new FermiPlayerViewBuilder.OnDoubleTapListener()
    {
      public void onDoubleTap(MotionEvent paramAnonymousMotionEvent) {}
    }).create();
    this.dialog.setContentView(localView);
    if (paramString != null) {
      localIFermiMediaPlayer.setMediaUri(paramString);
    }
    this.dialog.show();
    localIFermiMediaPlayer.play();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/player/FermiMediaManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */