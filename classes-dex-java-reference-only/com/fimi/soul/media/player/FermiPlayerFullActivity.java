package com.fimi.soul.media.player;

import android.os.Bundle;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.biz.camera.e;
import com.fimi.soul.media.player.widget.FimiVideoView;

public class FermiPlayerFullActivity
  extends BaseActivity
{
  public static final String SP_KEY_PLAYER_ADDR = "SP_KEY_PLAYER_ADDR_VideoDialogFragment";
  private FimiVideoView player;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968628);
    this.player = ((FimiVideoView)findViewById(2131689845));
    this.player.setDecodeType(0);
    this.player.setVideoPath(e.d());
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
  
  public void onResume()
  {
    super.onResume();
    this.player.start();
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
  }
  
  public void onStop()
  {
    super.onStop();
    if (this.player != null) {
      this.player.release(true);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/player/FermiPlayerFullActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */