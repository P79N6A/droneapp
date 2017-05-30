package com.fimi.soul.view.myhorizontalseebar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class SeekBar
  extends AbsSeekBar
{
  private a n;
  
  public SeekBar(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SeekBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842875);
  }
  
  public SeekBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  void a()
  {
    super.a();
    if (this.n != null) {
      this.n.a(this);
    }
  }
  
  void a(float paramFloat, boolean paramBoolean)
  {
    super.a(paramFloat, paramBoolean);
    if (this.n != null) {
      this.n.a(this, getProgress(), paramBoolean);
    }
  }
  
  void b()
  {
    super.b();
    if (this.n != null) {
      this.n.b(this);
    }
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(SeekBar.class.getName());
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName(SeekBar.class.getName());
  }
  
  public void setOnSeekBarChangeListener(a parama)
  {
    this.n = parama;
  }
  
  public static abstract interface a
  {
    public abstract void a(SeekBar paramSeekBar);
    
    public abstract void a(SeekBar paramSeekBar, int paramInt, boolean paramBoolean);
    
    public abstract void b(SeekBar paramSeekBar);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/myhorizontalseebar/SeekBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */