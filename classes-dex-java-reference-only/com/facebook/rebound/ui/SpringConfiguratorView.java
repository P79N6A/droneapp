package com.facebook.rebound.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Spinner;
import android.widget.TableLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.rebound.OrigamiValueConverter;
import com.facebook.rebound.Spring;
import com.facebook.rebound.SpringConfig;
import com.facebook.rebound.SpringConfigRegistry;
import com.facebook.rebound.SpringListener;
import com.facebook.rebound.SpringSystem;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SpringConfiguratorView
  extends FrameLayout
{
  private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.#");
  private static final float MAX_FRICTION = 50.0F;
  private static final int MAX_SEEKBAR_VAL = 100000;
  private static final float MAX_TENSION = 200.0F;
  private static final float MIN_FRICTION = 0.0F;
  private static final float MIN_TENSION = 0.0F;
  private TextView mFrictionLabel;
  private SeekBar mFrictionSeekBar;
  private final float mRevealPx;
  private final Spring mRevealerSpring;
  private SpringConfig mSelectedSpringConfig;
  private final List<SpringConfig> mSpringConfigs = new ArrayList();
  private Spinner mSpringSelectorSpinner;
  private final float mStashPx;
  private TextView mTensionLabel;
  private SeekBar mTensionSeekBar;
  private final int mTextColor = Color.argb(255, 225, 225, 225);
  private final SpinnerAdapter spinnerAdapter;
  private final SpringConfigRegistry springConfigRegistry;
  
  public SpringConfiguratorView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SpringConfiguratorView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  @TargetApi(11)
  public SpringConfiguratorView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramAttributeSet = SpringSystem.create();
    this.springConfigRegistry = SpringConfigRegistry.getInstance();
    this.spinnerAdapter = new SpinnerAdapter(paramContext);
    Resources localResources = getResources();
    this.mRevealPx = Util.dpToPx(40.0F, localResources);
    this.mStashPx = Util.dpToPx(280.0F, localResources);
    this.mRevealerSpring = paramAttributeSet.createSpring();
    paramAttributeSet = new RevealerSpringListener(null);
    this.mRevealerSpring.setCurrentValue(1.0D).setEndValue(1.0D).addListener(paramAttributeSet);
    addView(generateHierarchy(paramContext));
    paramContext = new SeekbarListener(null);
    this.mTensionSeekBar.setMax(100000);
    this.mTensionSeekBar.setOnSeekBarChangeListener(paramContext);
    this.mFrictionSeekBar.setMax(100000);
    this.mFrictionSeekBar.setOnSeekBarChangeListener(paramContext);
    this.mSpringSelectorSpinner.setAdapter(this.spinnerAdapter);
    this.mSpringSelectorSpinner.setOnItemSelectedListener(new SpringSelectedListener(null));
    refreshSpringConfigurations();
    setTranslationY(this.mStashPx);
  }
  
  private View generateHierarchy(Context paramContext)
  {
    Object localObject1 = getResources();
    int i = Util.dpToPx(5.0F, (Resources)localObject1);
    int j = Util.dpToPx(10.0F, (Resources)localObject1);
    int k = Util.dpToPx(20.0F, (Resources)localObject1);
    Object localObject2 = new TableLayout.LayoutParams(0, -2, 1.0F);
    ((TableLayout.LayoutParams)localObject2).setMargins(0, 0, i, 0);
    FrameLayout localFrameLayout = new FrameLayout(paramContext);
    localFrameLayout.setLayoutParams(Util.createLayoutParams(-1, Util.dpToPx(300.0F, (Resources)localObject1)));
    Object localObject4 = new FrameLayout(paramContext);
    Object localObject3 = Util.createMatchParams();
    ((FrameLayout.LayoutParams)localObject3).setMargins(0, k, 0, 0);
    ((FrameLayout)localObject4).setLayoutParams((ViewGroup.LayoutParams)localObject3);
    ((FrameLayout)localObject4).setBackgroundColor(Color.argb(100, 0, 0, 0));
    localFrameLayout.addView((View)localObject4);
    this.mSpringSelectorSpinner = new Spinner(paramContext, 0);
    localObject3 = Util.createMatchWrapParams();
    ((FrameLayout.LayoutParams)localObject3).gravity = 48;
    ((FrameLayout.LayoutParams)localObject3).setMargins(j, j, j, 0);
    this.mSpringSelectorSpinner.setLayoutParams((ViewGroup.LayoutParams)localObject3);
    ((FrameLayout)localObject4).addView(this.mSpringSelectorSpinner);
    localObject3 = new LinearLayout(paramContext);
    FrameLayout.LayoutParams localLayoutParams = Util.createMatchWrapParams();
    localLayoutParams.setMargins(0, 0, 0, Util.dpToPx(80.0F, (Resources)localObject1));
    localLayoutParams.gravity = 80;
    ((LinearLayout)localObject3).setLayoutParams(localLayoutParams);
    ((LinearLayout)localObject3).setOrientation(1);
    ((FrameLayout)localObject4).addView((View)localObject3);
    localObject4 = new LinearLayout(paramContext);
    localLayoutParams = Util.createMatchWrapParams();
    localLayoutParams.setMargins(j, j, j, k);
    ((LinearLayout)localObject4).setPadding(j, j, j, j);
    ((LinearLayout)localObject4).setLayoutParams(localLayoutParams);
    ((LinearLayout)localObject4).setOrientation(0);
    ((LinearLayout)localObject3).addView((View)localObject4);
    this.mTensionSeekBar = new SeekBar(paramContext);
    this.mTensionSeekBar.setLayoutParams((ViewGroup.LayoutParams)localObject2);
    ((LinearLayout)localObject4).addView(this.mTensionSeekBar);
    this.mTensionLabel = new TextView(getContext());
    this.mTensionLabel.setTextColor(this.mTextColor);
    localLayoutParams = Util.createLayoutParams(Util.dpToPx(50.0F, (Resources)localObject1), -1);
    this.mTensionLabel.setGravity(19);
    this.mTensionLabel.setLayoutParams(localLayoutParams);
    this.mTensionLabel.setMaxLines(1);
    ((LinearLayout)localObject4).addView(this.mTensionLabel);
    localObject4 = new LinearLayout(paramContext);
    localLayoutParams = Util.createMatchWrapParams();
    localLayoutParams.setMargins(j, j, j, k);
    ((LinearLayout)localObject4).setPadding(j, j, j, j);
    ((LinearLayout)localObject4).setLayoutParams(localLayoutParams);
    ((LinearLayout)localObject4).setOrientation(0);
    ((LinearLayout)localObject3).addView((View)localObject4);
    this.mFrictionSeekBar = new SeekBar(paramContext);
    this.mFrictionSeekBar.setLayoutParams((ViewGroup.LayoutParams)localObject2);
    ((LinearLayout)localObject4).addView(this.mFrictionSeekBar);
    this.mFrictionLabel = new TextView(getContext());
    this.mFrictionLabel.setTextColor(this.mTextColor);
    localObject2 = Util.createLayoutParams(Util.dpToPx(50.0F, (Resources)localObject1), -1);
    this.mFrictionLabel.setGravity(19);
    this.mFrictionLabel.setLayoutParams((ViewGroup.LayoutParams)localObject2);
    this.mFrictionLabel.setMaxLines(1);
    ((LinearLayout)localObject4).addView(this.mFrictionLabel);
    paramContext = new View(paramContext);
    localObject1 = Util.createLayoutParams(Util.dpToPx(60.0F, (Resources)localObject1), Util.dpToPx(40.0F, (Resources)localObject1));
    ((FrameLayout.LayoutParams)localObject1).gravity = 49;
    paramContext.setLayoutParams((ViewGroup.LayoutParams)localObject1);
    paramContext.setOnTouchListener(new OnNubTouchListener(null));
    paramContext.setBackgroundColor(Color.argb(255, 0, 164, 209));
    localFrameLayout.addView(paramContext);
    return localFrameLayout;
  }
  
  private void togglePosition()
  {
    double d1 = 1.0D;
    double d2 = this.mRevealerSpring.getEndValue();
    Spring localSpring = this.mRevealerSpring;
    if (d2 == 1.0D) {
      d1 = 0.0D;
    }
    localSpring.setEndValue(d1);
  }
  
  private void updateSeekBarsForSpringConfig(SpringConfig paramSpringConfig)
  {
    int i = Math.round(((float)OrigamiValueConverter.origamiValueFromTension(paramSpringConfig.tension) - 0.0F) * 100000.0F / 200.0F);
    int j = Math.round(((float)OrigamiValueConverter.origamiValueFromFriction(paramSpringConfig.friction) - 0.0F) * 100000.0F / 50.0F);
    this.mTensionSeekBar.setProgress(i);
    this.mFrictionSeekBar.setProgress(j);
  }
  
  public void destroy()
  {
    ViewGroup localViewGroup = (ViewGroup)getParent();
    if (localViewGroup != null) {
      localViewGroup.removeView(this);
    }
    this.mRevealerSpring.destroy();
  }
  
  public void refreshSpringConfigurations()
  {
    Map localMap = this.springConfigRegistry.getAllSpringConfig();
    this.spinnerAdapter.clear();
    this.mSpringConfigs.clear();
    Iterator localIterator = localMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (localEntry.getKey() != SpringConfig.defaultConfig)
      {
        this.mSpringConfigs.add(localEntry.getKey());
        this.spinnerAdapter.add((String)localEntry.getValue());
      }
    }
    this.mSpringConfigs.add(SpringConfig.defaultConfig);
    this.spinnerAdapter.add((String)localMap.get(SpringConfig.defaultConfig));
    this.spinnerAdapter.notifyDataSetChanged();
    if (this.mSpringConfigs.size() > 0) {
      this.mSpringSelectorSpinner.setSelection(0);
    }
  }
  
  private class OnNubTouchListener
    implements View.OnTouchListener
  {
    private OnNubTouchListener() {}
    
    public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
    {
      if (paramMotionEvent.getAction() == 0) {
        SpringConfiguratorView.this.togglePosition();
      }
      return true;
    }
  }
  
  private class RevealerSpringListener
    implements SpringListener
  {
    private RevealerSpringListener() {}
    
    public void onSpringActivate(Spring paramSpring) {}
    
    public void onSpringAtRest(Spring paramSpring) {}
    
    public void onSpringEndStateChange(Spring paramSpring) {}
    
    public void onSpringUpdate(Spring paramSpring)
    {
      float f1 = (float)paramSpring.getCurrentValue();
      float f2 = SpringConfiguratorView.this.mRevealPx;
      float f3 = SpringConfiguratorView.this.mStashPx;
      SpringConfiguratorView.this.setTranslationY(f1 * (f3 - f2) + f2);
    }
  }
  
  private class SeekbarListener
    implements SeekBar.OnSeekBarChangeListener
  {
    private SeekbarListener() {}
    
    public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
    {
      float f;
      if (paramSeekBar == SpringConfiguratorView.this.mTensionSeekBar)
      {
        f = 200.0F * paramInt / 100000.0F + 0.0F;
        SpringConfiguratorView.this.mSelectedSpringConfig.tension = OrigamiValueConverter.tensionFromOrigamiValue(f);
        String str = SpringConfiguratorView.DECIMAL_FORMAT.format(f);
        SpringConfiguratorView.this.mTensionLabel.setText("T:" + str);
      }
      if (paramSeekBar == SpringConfiguratorView.this.mFrictionSeekBar)
      {
        f = paramInt * 50.0F / 100000.0F + 0.0F;
        SpringConfiguratorView.this.mSelectedSpringConfig.friction = OrigamiValueConverter.frictionFromOrigamiValue(f);
        paramSeekBar = SpringConfiguratorView.DECIMAL_FORMAT.format(f);
        SpringConfiguratorView.this.mFrictionLabel.setText("F:" + paramSeekBar);
      }
    }
    
    public void onStartTrackingTouch(SeekBar paramSeekBar) {}
    
    public void onStopTrackingTouch(SeekBar paramSeekBar) {}
  }
  
  private class SpinnerAdapter
    extends BaseAdapter
  {
    private final Context mContext;
    private final List<String> mStrings;
    
    public SpinnerAdapter(Context paramContext)
    {
      this.mContext = paramContext;
      this.mStrings = new ArrayList();
    }
    
    public void add(String paramString)
    {
      this.mStrings.add(paramString);
      notifyDataSetChanged();
    }
    
    public void clear()
    {
      this.mStrings.clear();
      notifyDataSetChanged();
    }
    
    public int getCount()
    {
      return this.mStrings.size();
    }
    
    public Object getItem(int paramInt)
    {
      return this.mStrings.get(paramInt);
    }
    
    public long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      if (paramView == null)
      {
        paramView = new TextView(this.mContext);
        paramView.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
        int i = Util.dpToPx(12.0F, SpringConfiguratorView.this.getResources());
        paramView.setPadding(i, i, i, i);
        paramView.setTextColor(SpringConfiguratorView.this.mTextColor);
      }
      for (;;)
      {
        paramView.setText((CharSequence)this.mStrings.get(paramInt));
        return paramView;
        paramView = (TextView)paramView;
      }
    }
  }
  
  private class SpringSelectedListener
    implements AdapterView.OnItemSelectedListener
  {
    private SpringSelectedListener() {}
    
    public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
    {
      SpringConfiguratorView.access$402(SpringConfiguratorView.this, (SpringConfig)SpringConfiguratorView.this.mSpringConfigs.get(paramInt));
      SpringConfiguratorView.this.updateSeekBarsForSpringConfig(SpringConfiguratorView.this.mSelectedSpringConfig);
    }
    
    public void onNothingSelected(AdapterView<?> paramAdapterView) {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/rebound/ui/SpringConfiguratorView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */