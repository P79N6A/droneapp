package com.fimi.soul.module.droneui;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.fimi.kernel.view.b;
import com.fimi.soul.base.BaseDroneFragment;
import com.fimi.soul.biz.camera.e;
import com.fimi.soul.media.player.FermiMediaManager;
import com.fimi.soul.media.player.FermiMediaPlayerType;
import com.fimi.soul.media.player.IFermiMediaPlayer;
import com.fimi.soul.media.player.IFermiMediaPlayer.FermiPlyaerState;
import com.fimi.soul.media.player.IMediaPlayer;
import com.fimi.soul.media.player.OnPlayerStateChangedListener;

public class DroneCameraFragment
  extends BaseDroneFragment
{
  private static final String a = DroneCameraFragment.class.getSimpleName();
  private static final int b = 2;
  private static View e;
  private SurfaceView c;
  private String d = e.d();
  private IFermiMediaPlayer f;
  private boolean g = false;
  
  private void a(View paramView)
  {
    this.c = ((SurfaceView)paramView.findViewById(2131690211));
    e = paramView.findViewById(2131690087);
    e.setVisibility(0);
  }
  
  private void i()
  {
    this.c.setKeepScreenOn(true);
    PreferenceManager.getDefaultSharedPreferences(getActivity());
    this.c.setZOrderMediaOverlay(true);
    this.f = FermiMediaManager.getDefaultManager(getActivity()).createFermiMediaPlayer(FermiMediaPlayerType.FimiMediaPlayer);
    this.f.setSurfaceView(this.c);
    this.f.setAutoPlay(false);
    this.f.setMediaUri(this.d);
    this.f.addOnPlayerStateChangedListener(new OnPlayerStateChangedListener()
    {
      public void OnPlayerStateChanged(IFermiMediaPlayer.FermiPlyaerState paramAnonymousFermiPlyaerState, IFermiMediaPlayer paramAnonymousIFermiMediaPlayer)
      {
        Log.d("Good", "播放器状态-->" + paramAnonymousFermiPlyaerState.toString());
        if (paramAnonymousFermiPlyaerState == IFermiMediaPlayer.FermiPlyaerState.Inited)
        {
          DroneCameraFragment.a(DroneCameraFragment.this, true);
          DroneCameraFragment.this.f();
        }
        if (DroneCameraFragment.a(DroneCameraFragment.this))
        {
          if (paramAnonymousFermiPlyaerState == IFermiMediaPlayer.FermiPlyaerState.Playing) {
            DroneCameraFragment.this.getActivity().runOnUiThread(new Runnable()
            {
              public void run()
              {
                DroneCameraFragment.b(DroneCameraFragment.this).sendEmptyMessageDelayed(2, 500L);
              }
            });
          }
        }
        else {
          return;
        }
        DroneCameraFragment.this.getActivity().runOnUiThread(new Runnable()
        {
          public void run()
          {
            DroneCameraFragment.h().setVisibility(0);
          }
        });
      }
    });
  }
  
  public void a(Message paramMessage)
  {
    a().c();
    if (paramMessage.what == 2) {
      e.setVisibility(8);
    }
  }
  
  public void f()
  {
    if (((FlightActivity)getActivity()).b() != FlightActivity.b.b) {}
    while ((this.f == null) || (this.d == null) || (!this.g)) {
      return;
    }
    try
    {
      this.c.setVisibility(0);
      this.f.prepare();
      this.f.play();
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public void g()
  {
    e.setVisibility(0);
    this.c.setZOrderMediaOverlay(false);
    this.c.setVisibility(8);
    if (this.f.isPlaying()) {
      this.f.stop();
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    paramLayoutInflater = paramLayoutInflater.inflate(2130968685, null);
    getActivity().setVolumeControlStream(3);
    a(paramLayoutInflater);
    i();
    return paramLayoutInflater;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    if (this.f.isPlaying()) {
      this.f.stop();
    }
    if ((this.f instanceof IMediaPlayer)) {
      ((IMediaPlayer)this.f).release();
    }
  }
  
  public void onStart()
  {
    Log.d("Good", "onStart");
    f();
    super.onStart();
  }
  
  public void onStop()
  {
    super.onStop();
    if (this.f.isPlaying()) {
      this.f.stop();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneui/DroneCameraFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */