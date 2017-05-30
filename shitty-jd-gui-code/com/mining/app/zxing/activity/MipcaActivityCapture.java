package com.mining.app.zxing.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.os.Handler;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.mining.app.zxing.a.c;
import com.mining.app.zxing.b.a;
import com.mining.app.zxing.b.f;
import com.mining.app.zxing.view.ViewfinderView;
import java.io.IOException;
import java.util.Vector;

public class MipcaActivityCapture
  extends Activity
  implements SurfaceHolder.Callback
{
  private static final long h = 200L;
  private a a;
  private ViewfinderView b;
  private boolean c;
  private Vector<BarcodeFormat> d;
  private String e;
  private f f;
  private Button g;
  private final MediaPlayer.OnCompletionListener i = new MediaPlayer.OnCompletionListener()
  {
    public void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
    {
      paramAnonymousMediaPlayer.seekTo(0);
    }
  };
  
  private void a(SurfaceHolder paramSurfaceHolder)
  {
    try
    {
      c.a().a(paramSurfaceHolder);
      if (this.a == null) {
        this.a = new a(this, this.d, this.e);
      }
      return;
    }
    catch (RuntimeException paramSurfaceHolder) {}catch (IOException paramSurfaceHolder) {}
  }
  
  public ViewfinderView a()
  {
    return this.b;
  }
  
  public void a(Result paramResult, Bitmap paramBitmap)
  {
    this.f.a();
    paramResult = paramResult.getText();
    if (paramResult.equals("")) {
      Toast.makeText(this, "Scan failed!", 0).show();
    }
    for (;;)
    {
      finish();
      return;
      paramBitmap = new Intent();
      Bundle localBundle = new Bundle();
      localBundle.putString("result", paramResult);
      paramBitmap.putExtras(localBundle);
      setResult(-1, paramBitmap);
    }
  }
  
  public Handler b()
  {
    return this.a;
  }
  
  public void c()
  {
    this.b.a();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968620);
    c.a(getApplication());
    this.b = ((ViewfinderView)findViewById(2131689811));
    this.g = ((Button)findViewById(2131689813));
    this.c = false;
    this.f = new f(this);
    this.g.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        MipcaActivityCapture.this.finish();
      }
    });
  }
  
  protected void onDestroy()
  {
    this.f.b();
    super.onDestroy();
  }
  
  protected void onPause()
  {
    super.onPause();
    if (this.a != null)
    {
      this.a.a();
      this.a = null;
    }
    c.a().b();
  }
  
  protected void onResume()
  {
    super.onResume();
    SurfaceHolder localSurfaceHolder = ((SurfaceView)findViewById(2131689810)).getHolder();
    if (this.c) {
      a(localSurfaceHolder);
    }
    for (;;)
    {
      this.d = null;
      this.e = null;
      return;
      localSurfaceHolder.addCallback(this);
      localSurfaceHolder.setType(3);
    }
  }
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    if (!this.c)
    {
      this.c = true;
      a(paramSurfaceHolder);
    }
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    this.c = false;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/mining/app/zxing/activity/MipcaActivityCapture.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */