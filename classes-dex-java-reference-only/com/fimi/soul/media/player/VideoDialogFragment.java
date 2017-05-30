package com.fimi.soul.media.player;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import com.fimi.kernel.c;
import com.fimi.kernel.c.a;

@SuppressLint({"ValidFragment"})
public class VideoDialogFragment
  extends DialogFragment
{
  private static final String SP_KEY_FRAGMENT_LOADING_AGAIN = "SP_KEY_FRAGMENT_LOADING_AGAIN_VideoDialogFragment";
  private static final String SP_KEY_FRAGMENT_ORIGIN_ORIENTATION = "SP_KEY_FRAGMENT_ORIGIN_ORIENTATION_VideoDialogFragment";
  private static final String SP_KEY_FRAGMENT_POSITION = "SP_KEY_FRAGMENT_POSITION_VideoDialogFragment";
  private static final String SP_KEY_PLAYER_ADDR = "SP_KEY_PLAYER_ADDR_VideoDialogFragment";
  private int currentPosition = 0;
  private boolean isPortait = false;
  private boolean loadingAgain = false;
  a manager = null;
  private IFermiMediaPlayer player;
  private String url = "";
  
  private void changeScreenOrientation()
  {
    this.player.pause();
    this.currentPosition = this.player.getPosition();
    Log.d("Good", this.currentPosition + "");
    if (this.currentPosition < 2000) {}
    for (this.currentPosition = 0;; this.currentPosition -= 2000)
    {
      this.manager.a("SP_KEY_FRAGMENT_POSITION_VideoDialogFragment", this.currentPosition);
      if (this.isPortait) {
        getActivity().setRequestedOrientation(0);
      }
      return;
    }
  }
  
  public static VideoDialogFragment newInstance(String paramString)
  {
    VideoDialogFragment localVideoDialogFragment = new VideoDialogFragment();
    localVideoDialogFragment.url = paramString;
    c.c().a("SP_KEY_PLAYER_ADDR_VideoDialogFragment", paramString);
    return localVideoDialogFragment;
  }
  
  public void dismissDialog()
  {
    this.player.stop();
    if (this.manager.d("SP_KEY_FRAGMENT_ORIGIN_ORIENTATION_VideoDialogFragment") != this.isPortait)
    {
      if (!this.manager.d("SP_KEY_FRAGMENT_ORIGIN_ORIENTATION_VideoDialogFragment")) {
        break label86;
      }
      getActivity().setRequestedOrientation(1);
    }
    for (;;)
    {
      this.currentPosition = 0;
      this.manager.a("SP_KEY_FRAGMENT_POSITION_VideoDialogFragment", this.currentPosition);
      this.manager.a("SP_KEY_FRAGMENT_LOADING_AGAIN_VideoDialogFragment", false);
      dismiss();
      return;
      label86:
      getActivity().setRequestedOrientation(0);
    }
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
    if (getResources().getConfiguration().orientation == 1) {}
    for (boolean bool = true;; bool = false)
    {
      this.isPortait = bool;
      this.currentPosition = this.manager.b("SP_KEY_FRAGMENT_POSITION_VideoDialogFragment");
      this.loadingAgain = this.manager.d("SP_KEY_FRAGMENT_LOADING_AGAIN_VideoDialogFragment");
      if (!this.loadingAgain)
      {
        this.manager.a("SP_KEY_FRAGMENT_ORIGIN_ORIENTATION_VideoDialogFragment", this.isPortait);
        this.manager.a("SP_KEY_FRAGMENT_LOADING_AGAIN_VideoDialogFragment", true);
      }
      return;
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    if (this.isPortait) {}
    for (int i = 2130968724;; i = 2130968725)
    {
      getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
      this.player.setAutoPlay(true);
      this.player.setPlayPosition(this.currentPosition);
      this.url = this.manager.a("SP_KEY_PLAYER_ADDR_VideoDialogFragment");
      paramLayoutInflater = FermiPlayerViewBuilder.Builder(getActivity(), i).setFermiMediaPlayer(this.player).setOnClickFullscreenListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          VideoDialogFragment.this.changeScreenOrientation();
        }
      }).setOnClickCloseListenner(new FermiPlayerViewBuilder.OnClickCloseListener()
      {
        public void onClose(View paramAnonymousView)
        {
          VideoDialogFragment.this.player.stop();
          VideoDialogFragment.this.dismissDialog();
        }
      }).setOnDoubleTapListener(new FermiPlayerViewBuilder.OnDoubleTapListener()
      {
        public void onDoubleTap(MotionEvent paramAnonymousMotionEvent)
        {
          VideoDialogFragment.this.changeScreenOrientation();
        }
      }).create();
      this.player.setMediaUri(this.url);
      this.player.prepare();
      return paramLayoutInflater;
    }
  }
  
  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.player.play();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/player/VideoDialogFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */