package com.fimi.soul.media.player.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.fimi.soul.media.player.IMediaPlayer;
import com.fimi.soul.media.player.ISurfaceTextureHolder;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@TargetApi(14)
public class TextureRenderView
  extends TextureView
  implements IRenderView
{
  private MeasureHelper mMeasureHelper;
  private SurfaceCallback mSurfaceCallback;
  
  public TextureRenderView(Context paramContext)
  {
    super(paramContext);
    initView(paramContext);
  }
  
  public TextureRenderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    initView(paramContext);
  }
  
  public TextureRenderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    initView(paramContext);
  }
  
  public TextureRenderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1);
    initView(paramContext);
  }
  
  private void initView(Context paramContext)
  {
    this.mMeasureHelper = new MeasureHelper(this);
    this.mSurfaceCallback = new SurfaceCallback(this);
    setSurfaceTextureListener(this.mSurfaceCallback);
  }
  
  public void addRenderCallback(IRenderView.IRenderCallback paramIRenderCallback)
  {
    this.mSurfaceCallback.addRenderCallback(paramIRenderCallback);
  }
  
  public IRenderView.ISurfaceHolder getSurfaceHolder()
  {
    return new InternalSurfaceHolder(this, this.mSurfaceCallback.mSurfaceTexture);
  }
  
  public View getView()
  {
    return this;
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(TextureRenderView.class.getName());
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName(TextureRenderView.class.getName());
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
    this.mMeasureHelper.setVideoRotation(paramInt);
    setRotation(paramInt);
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
      requestLayout();
    }
  }
  
  public boolean shouldWaitForResize()
  {
    return false;
  }
  
  private static final class InternalSurfaceHolder
    implements IRenderView.ISurfaceHolder
  {
    private SurfaceTexture mSurfaceTexture;
    private TextureRenderView mTextureView;
    
    public InternalSurfaceHolder(@NonNull TextureRenderView paramTextureRenderView, @Nullable SurfaceTexture paramSurfaceTexture)
    {
      this.mTextureView = paramTextureRenderView;
      this.mSurfaceTexture = paramSurfaceTexture;
    }
    
    @TargetApi(16)
    public void bindToMediaPlayer(IMediaPlayer paramIMediaPlayer)
    {
      if (paramIMediaPlayer == null) {
        return;
      }
      if ((Build.VERSION.SDK_INT >= 16) && ((paramIMediaPlayer instanceof ISurfaceTextureHolder)))
      {
        paramIMediaPlayer = (ISurfaceTextureHolder)paramIMediaPlayer;
        this.mTextureView.mSurfaceCallback.setOwnSurfaceTecture(false);
        SurfaceTexture localSurfaceTexture = paramIMediaPlayer.getSurfaceTexture();
        if (localSurfaceTexture != null)
        {
          this.mTextureView.setSurfaceTexture(localSurfaceTexture);
          return;
        }
        paramIMediaPlayer.setSurfaceTexture(this.mSurfaceTexture);
        return;
      }
      paramIMediaPlayer.setSurface(openSurface());
    }
    
    @NonNull
    public IRenderView getRenderView()
    {
      return this.mTextureView;
    }
    
    @Nullable
    public SurfaceHolder getSurfaceHolder()
    {
      return null;
    }
    
    @Nullable
    public SurfaceTexture getSurfaceTexture()
    {
      return this.mSurfaceTexture;
    }
    
    @Nullable
    public Surface openSurface()
    {
      if (this.mSurfaceTexture == null) {
        return null;
      }
      return new Surface(this.mSurfaceTexture);
    }
  }
  
  private static final class SurfaceCallback
    implements TextureView.SurfaceTextureListener
  {
    private int mHeight;
    private boolean mIsFormatChanged;
    private boolean mOwnSurfaceTecture = true;
    private Map<IRenderView.IRenderCallback, Object> mRenderCallbackMap = new ConcurrentHashMap();
    private SurfaceTexture mSurfaceTexture;
    private WeakReference<TextureRenderView> mWeakRenderView;
    private int mWidth;
    
    public SurfaceCallback(@NonNull TextureRenderView paramTextureRenderView)
    {
      this.mWeakRenderView = new WeakReference(paramTextureRenderView);
    }
    
    public void addRenderCallback(@NonNull IRenderView.IRenderCallback paramIRenderCallback)
    {
      this.mRenderCallbackMap.put(paramIRenderCallback, paramIRenderCallback);
      Object localObject1 = null;
      Object localObject2 = null;
      if (this.mSurfaceTexture != null)
      {
        localObject1 = localObject2;
        if (0 == 0) {
          localObject1 = new TextureRenderView.InternalSurfaceHolder((TextureRenderView)this.mWeakRenderView.get(), this.mSurfaceTexture);
        }
        paramIRenderCallback.onSurfaceCreated((IRenderView.ISurfaceHolder)localObject1, this.mWidth, this.mHeight);
      }
      if (this.mIsFormatChanged)
      {
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new TextureRenderView.InternalSurfaceHolder((TextureRenderView)this.mWeakRenderView.get(), this.mSurfaceTexture);
        }
        paramIRenderCallback.onSurfaceChanged((IRenderView.ISurfaceHolder)localObject2, 0, this.mWidth, this.mHeight);
      }
    }
    
    public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
    {
      this.mSurfaceTexture = paramSurfaceTexture;
      this.mIsFormatChanged = false;
      this.mWidth = 0;
      this.mHeight = 0;
      paramSurfaceTexture = new TextureRenderView.InternalSurfaceHolder((TextureRenderView)this.mWeakRenderView.get(), paramSurfaceTexture);
      Iterator localIterator = this.mRenderCallbackMap.keySet().iterator();
      while (localIterator.hasNext()) {
        ((IRenderView.IRenderCallback)localIterator.next()).onSurfaceCreated(paramSurfaceTexture, 0, 0);
      }
    }
    
    public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
    {
      this.mSurfaceTexture = paramSurfaceTexture;
      this.mIsFormatChanged = false;
      this.mWidth = 0;
      this.mHeight = 0;
      paramSurfaceTexture = new TextureRenderView.InternalSurfaceHolder((TextureRenderView)this.mWeakRenderView.get(), paramSurfaceTexture);
      Iterator localIterator = this.mRenderCallbackMap.keySet().iterator();
      while (localIterator.hasNext()) {
        ((IRenderView.IRenderCallback)localIterator.next()).onSurfaceDestroyed(paramSurfaceTexture);
      }
      return this.mOwnSurfaceTecture;
    }
    
    public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
    {
      this.mSurfaceTexture = paramSurfaceTexture;
      this.mIsFormatChanged = true;
      this.mWidth = paramInt1;
      this.mHeight = paramInt2;
      paramSurfaceTexture = new TextureRenderView.InternalSurfaceHolder((TextureRenderView)this.mWeakRenderView.get(), paramSurfaceTexture);
      Iterator localIterator = this.mRenderCallbackMap.keySet().iterator();
      while (localIterator.hasNext()) {
        ((IRenderView.IRenderCallback)localIterator.next()).onSurfaceChanged(paramSurfaceTexture, 0, paramInt1, paramInt2);
      }
    }
    
    public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture) {}
    
    public void removeRenderCallback(@NonNull IRenderView.IRenderCallback paramIRenderCallback)
    {
      this.mRenderCallbackMap.remove(paramIRenderCallback);
    }
    
    public void setOwnSurfaceTecture(boolean paramBoolean)
    {
      this.mOwnSurfaceTecture = paramBoolean;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/player/widget/TextureRenderView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */