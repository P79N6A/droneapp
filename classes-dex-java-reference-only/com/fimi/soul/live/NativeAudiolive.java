package com.fimi.soul.live;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;

public class NativeAudiolive
  implements Handler.Callback
{
  public static final int FM_LIVE_PUSHING = 43691;
  public static final int FM_LIVE_PUSH_EXIT = 5001217;
  public static final int FM_LIVE_PUSH_FORMAT_ERROR = 5001219;
  public static final int FM_LIVE_PUSH_NET_BLOCKS = 5001221;
  public static final int FM_LIVE_PUSH_OK = 5001223;
  public static final int FM_LIVE_PUSH_RUNNIG = 5001222;
  public static final int FM_LIVE_VIDEO_DISCONNECTED = 5002756;
  public static final int FM_LIVE_VIDEO_EXIT = 5002753;
  public static final int FM_LIVE_VIDEO_FORMAT_ERROR = 5002755;
  public static final int FM_LIVE_VIDEO_SYS_FAILED = 5002754;
  private final int FM_LIVE_AUDIO_BUSY_DEV = 4997378;
  private final int FM_LIVE_AUDIO_EXIT = 4997377;
  private final int FM_LIVE_PUSH_DISCONNECTED = 5001220;
  private final int FM_LIVE_PUSH_SYS_FAILED = 5001218;
  Handler handler = new Handler(this);
  LiveCallBackListener liveCallBackListener;
  
  static
  {
    System.loadLibrary("fmlive");
  }
  
  public void callBack(int paramInt1, int paramInt2, int paramInt3)
  {
    Log.v("FM", "msg=" + Integer.toHexString(paramInt1).toUpperCase());
    Log.v("FM", "arg1=" + paramInt2);
    Log.v("FM", "arg2=" + paramInt3);
    paramInt2 = 0;
    switch (paramInt1)
    {
    }
    for (;;)
    {
      Message localMessage = Message.obtain();
      localMessage.obj = Integer.valueOf(paramInt2);
      localMessage.arg1 = paramInt1;
      this.handler.sendMessage(localMessage);
      return;
      paramInt2 = 2131362421;
      continue;
      paramInt2 = 2131362420;
      continue;
      paramInt2 = 2131362432;
      continue;
      paramInt2 = 2131362434;
      continue;
      paramInt2 = 2131362433;
      continue;
      paramInt2 = 2131362431;
      continue;
      paramInt2 = 2131362424;
      continue;
      paramInt2 = 2131362429;
      continue;
      paramInt2 = 2131362425;
      continue;
      paramInt2 = 2131362423;
      continue;
      paramInt2 = 2131362426;
      continue;
      paramInt2 = 2131362427;
    }
  }
  
  public native int fmLiveGetStatus();
  
  public native int fmLiveStart(String paramString1, String paramString2);
  
  public native int fmLiveStop();
  
  public LiveCallBackListener getLiveCallBackListener()
  {
    return this.liveCallBackListener;
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    if (this.liveCallBackListener != null) {
      this.liveCallBackListener.liveCallResult(paramMessage.arg1, ((Integer)paramMessage.obj).intValue());
    }
    return false;
  }
  
  public boolean isLivePushing()
  {
    return fmLiveGetStatus() == 43691;
  }
  
  public void setLiveCallBackListener(LiveCallBackListener paramLiveCallBackListener)
  {
    this.liveCallBackListener = paramLiveCallBackListener;
  }
  
  public static abstract interface LiveCallBackListener
  {
    public abstract String liveCallResult(int paramInt1, int paramInt2);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/live/NativeAudiolive.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */