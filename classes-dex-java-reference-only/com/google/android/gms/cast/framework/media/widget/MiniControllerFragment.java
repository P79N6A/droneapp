package com.google.android.gms.cast.framework.media.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.v4.app.Fragment;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.R.attr;
import com.google.android.gms.R.color;
import com.google.android.gms.R.drawable;
import com.google.android.gms.R.id;
import com.google.android.gms.R.layout;
import com.google.android.gms.R.string;
import com.google.android.gms.R.style;
import com.google.android.gms.R.styleable;
import com.google.android.gms.cast.framework.media.a.b;
import com.google.android.gms.cast.internal.m;
import com.google.android.gms.common.internal.d;

public class MiniControllerFragment
  extends Fragment
  implements a
{
  private static final m a = new m("MiniControllerFragment");
  private boolean b;
  private int c;
  private int d;
  private int[] e;
  private ImageView[] f = new ImageView[3];
  private int g;
  private b h;
  
  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    boolean bool = true;
    int j = 0;
    if (this.e != null) {
      return;
    }
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.CastMiniController, R.attr.castMiniControllerStyle, R.style.CastMiniController);
    this.b = paramAttributeSet.getBoolean(R.styleable.CastMiniController_castShowImageThumbnail, true);
    this.c = paramAttributeSet.getResourceId(R.styleable.CastMiniController_castTitleTextAppearance, 0);
    this.d = paramAttributeSet.getResourceId(R.styleable.CastMiniController_castSubtitleTextAppearance, 0);
    int i = paramAttributeSet.getResourceId(R.styleable.CastMiniController_castControlButtons, 0);
    if (i != 0)
    {
      paramContext = paramContext.getResources().obtainTypedArray(i);
      if (paramContext.length() == 3) {}
      for (;;)
      {
        d.b(bool);
        this.e = new int[paramContext.length()];
        i = 0;
        while (i < paramContext.length())
        {
          this.e[i] = paramContext.getResourceId(i, 0);
          i += 1;
        }
        bool = false;
      }
      paramContext.recycle();
      if (this.b) {
        this.e[0] = R.id.cast_button_type_empty;
      }
      this.g = 0;
      paramContext = this.e;
      int k = paramContext.length;
      i = j;
      while (i < k)
      {
        if (paramContext[i] != R.id.cast_button_type_empty) {
          this.g += 1;
        }
        i += 1;
      }
    }
    a.d("Unable to read attribute castControlButtons.", new Object[0]);
    this.e = new int[] { R.id.cast_button_type_empty, R.id.cast_button_type_empty, R.id.cast_button_type_empty };
    paramAttributeSet.recycle();
  }
  
  private void a(RelativeLayout paramRelativeLayout, int paramInt1, int paramInt2)
  {
    ImageView localImageView = (ImageView)paramRelativeLayout.findViewById(paramInt1);
    paramInt2 = this.e[paramInt2];
    if (paramInt2 == R.id.cast_button_type_empty) {
      localImageView.setVisibility(4);
    }
    while (paramInt2 == R.id.cast_button_type_custom) {
      return;
    }
    int i;
    int j;
    if (paramInt2 == R.id.cast_button_type_play_pause_toggle)
    {
      i = R.drawable.cast_ic_mini_controller_play;
      j = R.drawable.cast_ic_mini_controller_pause;
      paramInt2 = R.drawable.cast_ic_mini_controller_stop;
      if (this.g != 1) {
        break label403;
      }
      paramInt2 = R.drawable.cast_ic_mini_controller_play_large;
      j = R.drawable.cast_ic_mini_controller_pause_large;
      int k = R.drawable.cast_ic_mini_controller_stop_large;
      i = paramInt2;
      paramInt2 = k;
    }
    label403:
    for (;;)
    {
      Drawable localDrawable1 = getResources().getDrawable(i);
      Drawable localDrawable2 = getResources().getDrawable(j);
      Drawable localDrawable3 = getResources().getDrawable(paramInt2);
      localImageView.setImageDrawable(localDrawable2);
      ProgressBar localProgressBar = c(paramInt1);
      paramRelativeLayout.addView(localProgressBar);
      this.h.a(localImageView, localDrawable1, localDrawable2, localDrawable3, localProgressBar, true);
      return;
      if (paramInt2 == R.id.cast_button_type_skip_previous)
      {
        localImageView.setImageDrawable(d(R.drawable.cast_ic_mini_controller_skip_prev));
        localImageView.setContentDescription(getResources().getString(R.string.cast_skip_prev));
        this.h.b(localImageView, 0);
        return;
      }
      if (paramInt2 == R.id.cast_button_type_skip_next)
      {
        localImageView.setImageDrawable(d(R.drawable.cast_ic_mini_controller_skip_next));
        localImageView.setContentDescription(getResources().getString(R.string.cast_skip_next));
        this.h.a(localImageView, 0);
        return;
      }
      if (paramInt2 == R.id.cast_button_type_rewind_30_seconds)
      {
        localImageView.setImageDrawable(d(R.drawable.cast_ic_mini_controller_rewind30));
        localImageView.setContentDescription(getResources().getString(R.string.cast_rewind_30));
        this.h.b(localImageView, 30000L);
        return;
      }
      if (paramInt2 == R.id.cast_button_type_forward_30_seconds)
      {
        localImageView.setImageDrawable(d(R.drawable.cast_ic_mini_controller_forward30));
        localImageView.setContentDescription(getResources().getString(R.string.cast_forward_30));
        this.h.a(localImageView, 30000L);
        return;
      }
      if (paramInt2 == R.id.cast_button_type_mute_toggle)
      {
        localImageView.setImageDrawable(getResources().getDrawable(R.drawable.cast_ic_mini_controller_mute));
        this.h.a(localImageView);
        return;
      }
      if (paramInt2 != R.id.cast_button_type_closed_caption) {
        break;
      }
      localImageView.setImageDrawable(d(R.drawable.cast_ic_mini_controller_closed_caption));
      this.h.c(localImageView);
      return;
    }
  }
  
  private ProgressBar c(int paramInt)
  {
    ProgressBar localProgressBar = new ProgressBar(getContext());
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams.addRule(8, paramInt);
    localLayoutParams.addRule(6, paramInt);
    localLayoutParams.addRule(5, paramInt);
    localLayoutParams.addRule(7, paramInt);
    localLayoutParams.addRule(15);
    localProgressBar.setLayoutParams(localLayoutParams);
    localProgressBar.setVisibility(8);
    return localProgressBar;
  }
  
  private Drawable d(@DrawableRes int paramInt)
  {
    Drawable localDrawable1 = getResources().getDrawable(paramInt);
    Drawable localDrawable2 = DrawableCompat.wrap(getResources().getDrawable(paramInt).mutate());
    DrawableCompat.setTintMode(localDrawable2, PorterDuff.Mode.MULTIPLY);
    DrawableCompat.setTint(localDrawable2, getResources().getColor(R.color.cast_mini_controller_disabled_button_drawable_tint_color));
    StateListDrawable localStateListDrawable = new StateListDrawable();
    localStateListDrawable.addState(new int[] { 16842910 }, localDrawable1);
    localStateListDrawable.addState(new int[] { -16842910 }, localDrawable2);
    return localStateListDrawable;
  }
  
  public final int a()
  {
    return 3;
  }
  
  public final int a(int paramInt)
  {
    return this.e[paramInt];
  }
  
  public void a(Context paramContext, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    super.onInflate(paramContext, paramAttributeSet, paramBundle);
    a(paramContext, paramAttributeSet);
  }
  
  public final ImageView b(int paramInt)
  {
    return this.f[paramInt];
  }
  
  public b b()
  {
    return this.h;
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.h = new b(getActivity());
    paramLayoutInflater = paramLayoutInflater.inflate(R.layout.cast_mini_controller, paramViewGroup);
    paramLayoutInflater.setVisibility(8);
    this.h.c(paramLayoutInflater, 8);
    paramViewGroup = (RelativeLayout)paramLayoutInflater.findViewById(R.id.container_current);
    paramBundle = (ImageView)paramLayoutInflater.findViewById(R.id.icon_view);
    TextView localTextView1 = (TextView)paramLayoutInflater.findViewById(R.id.title_view);
    if (this.c != 0) {
      localTextView1.setTextAppearance(getActivity(), this.c);
    }
    TextView localTextView2 = (TextView)paramLayoutInflater.findViewById(R.id.subtitle_view);
    if (this.d != 0) {
      localTextView2.setTextAppearance(getActivity(), this.d);
    }
    ProgressBar localProgressBar = (ProgressBar)paramLayoutInflater.findViewById(R.id.progressBar);
    this.h.c(paramViewGroup, 8);
    this.h.a(localTextView1, "com.google.android.gms.cast.metadata.TITLE");
    this.h.a(localTextView2, "com.google.android.gms.cast.metadata.SUBTITLE");
    this.h.a(localProgressBar);
    this.h.b(paramViewGroup);
    if (this.b) {
      this.h.a(paramBundle, -1, R.drawable.cast_album_art_placeholder);
    }
    for (;;)
    {
      this.f[0] = ((ImageView)paramViewGroup.findViewById(R.id.button_0));
      this.f[1] = ((ImageView)paramViewGroup.findViewById(R.id.button_1));
      this.f[2] = ((ImageView)paramViewGroup.findViewById(R.id.button_2));
      a(paramViewGroup, R.id.button_0, 0);
      a(paramViewGroup, R.id.button_1, 1);
      a(paramViewGroup, R.id.button_2, 2);
      return paramLayoutInflater;
      paramBundle.setVisibility(8);
    }
  }
  
  public void onDestroy()
  {
    if (this.h != null)
    {
      this.h.h();
      this.h = null;
    }
    super.onDestroy();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/media/widget/MiniControllerFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */