package com.fimi.soul.media.player.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.fimi.soul.media.player.IMediaPlayer;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class SurfaceRenderView
  extends SurfaceView
  implements IRenderView
{
  private MeasureHelper mMeasureHelper;
  private SurfaceCallback mSurfaceCallback;
  
  public SurfaceRenderView(Context paramContext)
  {
    super(paramContext);
    initView(paramContext);
  }
  
  public SurfaceRenderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    initView(paramContext);
  }
  
  public SurfaceRenderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    initView(paramContext);
  }
  
  public SurfaceRenderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1);
    initView(paramContext);
  }
  
  private void initView(Context paramContext)
  {
    this.mMeasureHelper = new MeasureHelper(this);
    this.mSurfaceCallback = new SurfaceCallback(this);
    getHolder().addCallback(this.mSurfaceCallback);
    getHolder().setType(0);
  }
  
  public void addRenderCallback(IRenderView.IRenderCallback paramIRenderCallback)
  {
    this.mSurfaceCallback.addRenderCallback(paramIRenderCallback);
  }
  
  public View getView()
  {
    return this;
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(SurfaceRenderView.class.getName());
  }
  
  @TargetApi(14)
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    if (Build.VERSION.SDK_INT >= 14) {
      paramAccessibilityNodeInfo.setClassName(SurfaceRenderView.class.getName());
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    this.mMeasureHelper.doMeasure(paramInt1, paramInt2);
    setMeasuredDimension(this.mMeasureHelper.getMeasuredWidth(), this.mMeasureHelper.getMeasuredHeight());
  }
  
  public void removeRenderCallback(IRenderView.IRenderCallback paramIRenderCallback)
  {
    this.mSurfaceCallback.removeRenderCallback(paramIRenderCallback);
  }
  
  public void setAspectRatio(int paramInt)
  {
    this.mMeasureHelper.setAspectRatio(paramInt);
    requestLayout();
  }
  
  public void setVideoRotation(int paramInt)
  {
    Log.e("", "SurfaceView doesn't support rotation (" + paramInt + ")!\n");
  }
  
  public void setVideoSampleAspectRatio(int paramInt1, int paramInt2)
  {
    if ((paramInt1 > 0) && (paramInt2 > 0))
    {
      this.mMeasureHelper.setVideoSampleAspectRatio(paramInt1, paramInt2);
      requestLayout();
    }
  }
  
  public void setVideoSize(int paramInt1, int paramInt2)
  {
    if ((paramInt1 > 0) && (paramInt2 > 0))
    {
      this.mMeasureHelper.setVideoSize(paramInt1, paramInt2);
      getHolder().setFixedSize(paramInt1, paramInt2);
      requestLayout();
    }
  }
  
  public boolean shouldWaitForResize()
  {
    return true;
  }
  
  private static final class InternalSurfaceHolder
    implements IRenderView.ISurfaceHolder
  {
    private SurfaceHolder mSurfaceHolder;
    private SurfaceRenderView mSurfaceView;
    
    public InternalSurfaceHolder(@NonNull SurfaceRenderView paramSurfaceRenderView, @Nullable SurfaceHolder paramSurfaceHolder)
    {
      this.mSurfaceView = paramSurfaceRenderView;
      this.mSurfaceHolder = paramSurfaceHolder;
    }
    
    public void bindToMediaPlayer(IMediaPlayer paramIMediaPlayer)
    {
      if (paramIMediaPlayer != null) {
        paramIMediaPlayer.setDisplay(this.mSurfaceHolder);
      }
    }
    
    @NonNull
    public IRenderView getRenderView()
    {
      return this.mSurfaceView;
    }
    
    @Nullable
    public SurfaceHolder getSurfaceHolder()
    {
      return this.mSurfaceHolder;
    }
    
    @Nullable
    public SurfaceTexture getSurfaceTexture()
    {
      return null;
    }
    
    @Nullable
    public Surface openSurface()
    {
      if (this.mSurfaceHolder == null) {
        return null;
      }
      return this.mSurfaceHolder.getSurface();
    }
  }
  
  private static final class SurfaceCallback
    implements SurfaceHolder.Callback
  {
    private int mFormat;
    private int mHeight;
    private boolean mIsFormatChanged;
    private Map<IRenderView.IRenderCallback, Object> mRenderCallbackMap = new ConcurrentHashMap();
    private SurfaceHolder mSurfaceHolder;
    private WeakReference<SurfaceRenderView> mWeakSurfaceView;
    private int mWidth;
    
    public SurfaceCallback(@NonNull SurfaceRenderView paramSurfaceRenderView)
    {
      this.mWeakSurfaceView = new WeakReference(paramSurfaceRenderView);
    }
    
    public void addRenderCallback(@NonNull IRenderView.IRenderCallback paramIRenderCallback)
    {
      this.mRenderCallbackMap.put(paramIRenderCallback, paramIRenderCallback);
      Object localObject1 = null;
      Object localObject2 = null;
      if (this.mSurfaceHolder != null)
      {
        localObject1 = localObject2;
        if (0 == 0) {
          localObject1 = new SurfaceRenderView.InternalSurfaceHolder((SurfaceRenderView)this.mWeakSurfaceView.get(), this.mSurfaceHolder);
        }
        paramIRenderCallback.onSurfaceCreated((IRenderView.ISurfaceHolder)localObject1, this.mWidth, this.mHeight);
      }
      if (this.mIsFormatChanged)
      {
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new SurfaceRenderView.InternalSurfaceHolder((SurfaceRenderView)this.mWeakSurfaceView.get(), this.mSurfaceHolder);
        }
        paramIRenderCallback.onSurfaceChanged((IRenderView.ISurfaceHolder)localObject2, this.mFormat, this.mWidth, this.mHeight);
      }
    }
    
    public void removeRenderCallback(@NonNull IRenderView.IRenderCallback paramIRenderCallback)
    {
      this.mRenderCallbackMap.remove(paramIRenderCallback);
    }
    
    public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
    {
      this.mSurfaceHolder = paramSurfaceHolder;
      this.mIsFormatChanged = true;
      this.mFormat = paramInt1;
      this.mWidth = paramInt2;
      this.mHeight = paramInt3;
      paramSurfaceHolder = new SurfaceRenderView.InternalSurfaceHolder((SurfaceRenderView)this.mWeakSurfaceView.get(), this.mSurfaceHolder);
      Iterator localIterator = this.mRenderCallbackMap.keySet().iterator();
      while (localIterator.hasNext()) {
        ((IRenderView.IRenderCallback)localIterator.next()).onSurfaceChanged(paramSurfaceHolder, paramInt1, paramInt2, paramInt3);
      }
    }
    
    public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
    {
      this.mSurfaceHolder = paramSurfaceHolder;
      this.mIsFormatChanged = false;
      this.mFormat = 0;
      this.mWidth = 0;
      this.mHeight = 0;
      paramSurfaceHolder = new SurfaceRenderView.InternalSurfaceHolder((SurfaceRenderView)this.mWeakSurfaceView.get(), this.mSurfaceHolder);
      Iterator localIterator = this.mRenderCallbackMap.keySet().iterator();
      while (localIterator.hasNext()) {
        ((IRenderView.IRenderCallback)localIterator.next()).onSurfaceCreated(paramSurfaceHolder, 0, 0);
      }
    }
    
    public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
    {
      this.mSurfaceHolder = null;
      this.mIsFormatChanged = false;
      this.mFormat = 0;
      this.mWidth = 0;
      this.mHeight = 0;
      paramSurfaceHolder = new SurfaceRenderView.InternalSurfaceHolder((SurfaceRenderView)this.mWeakSurfaceView.get(), this.mSurfaceHolder);
      Iterator localIterator = this.mRenderCallbackMap.keySet().iterator();
      while (localIterator.hasNext()) {
        ((IRenderView.IRenderCallback)localIterator.next()).onSurfaceDestroyed(paramSurfaceHolder);
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/player/widget/SurfaceRenderView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */