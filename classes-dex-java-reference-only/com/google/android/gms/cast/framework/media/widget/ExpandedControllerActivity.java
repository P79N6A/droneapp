package com.google.android.gms.cast.framework.media.widget;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.gms.R.color;
import com.google.android.gms.R.drawable;
import com.google.android.gms.R.id;
import com.google.android.gms.R.layout;
import com.google.android.gms.R.string;
import com.google.android.gms.R.style;
import com.google.android.gms.R.styleable;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.k;
import com.google.android.gms.cast.framework.l;
import com.google.android.gms.cast.framework.media.a.b;
import com.google.android.gms.cast.framework.media.c.a;
import com.google.android.gms.common.util.s;
import com.google.android.gms.internal.afr;
import com.google.android.gms.internal.afw;

public abstract class ExpandedControllerActivity
  extends AppCompatActivity
  implements a
{
  private final l<com.google.android.gms.cast.framework.d> a = new b(null);
  private final c.a b = new a(null);
  private int c;
  private TextView d;
  private SeekBar e;
  private afr f;
  private int[] g;
  private ImageView[] h = new ImageView[4];
  private View i;
  private b j;
  private k k;
  
  private afr a(RelativeLayout paramRelativeLayout)
  {
    afr localafr = new afr(this);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams.addRule(0, R.id.end_text);
    localLayoutParams.addRule(1, R.id.start_text);
    localLayoutParams.addRule(6, R.id.seek_bar);
    localLayoutParams.addRule(7, R.id.seek_bar);
    localLayoutParams.addRule(5, R.id.seek_bar);
    localLayoutParams.addRule(8, R.id.seek_bar);
    localafr.setLayoutParams(localLayoutParams);
    localafr.setPadding(this.e.getPaddingLeft(), this.e.getPaddingTop(), this.e.getPaddingRight(), this.e.getPaddingBottom());
    localafr.setContentDescription(getResources().getString(R.string.cast_seek_bar));
    localafr.setBackgroundColor(0);
    paramRelativeLayout.addView(localafr);
    return localafr;
  }
  
  private void a(Toolbar paramToolbar)
  {
    setSupportActionBar(paramToolbar);
    if (getSupportActionBar() != null)
    {
      getSupportActionBar().setDisplayHomeAsUpEnabled(true);
      getSupportActionBar().setHomeAsUpIndicator(R.drawable.quantum_ic_keyboard_arrow_down_white_36);
    }
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, b paramb)
  {
    paramView = (ImageView)paramView.findViewById(paramInt1);
    if (paramInt2 == R.id.cast_button_type_empty) {
      paramView.setVisibility(4);
    }
    do
    {
      do
      {
        return;
      } while (paramInt2 == R.id.cast_button_type_custom);
      if (paramInt2 == R.id.cast_button_type_play_pause_toggle)
      {
        a(paramView, paramb);
        return;
      }
      if (paramInt2 == R.id.cast_button_type_skip_previous)
      {
        b(paramView, paramb);
        return;
      }
      if (paramInt2 == R.id.cast_button_type_skip_next)
      {
        c(paramView, paramb);
        return;
      }
      if (paramInt2 == R.id.cast_button_type_rewind_30_seconds)
      {
        d(paramView, paramb);
        return;
      }
      if (paramInt2 == R.id.cast_button_type_forward_30_seconds)
      {
        e(paramView, paramb);
        return;
      }
      if (paramInt2 == R.id.cast_button_type_mute_toggle)
      {
        f(paramView, paramb);
        return;
      }
    } while (paramInt2 != R.id.cast_button_type_closed_caption);
    g(paramView, paramb);
  }
  
  private void a(View paramView, b paramb)
  {
    paramb.a((ImageView)paramView.findViewById(R.id.background_image_view), -1, paramView.findViewById(R.id.background_place_holder_image_view));
    this.d = ((TextView)paramView.findViewById(R.id.status_text));
    paramb.a((ProgressBar)paramView.findViewById(R.id.loading_indicator));
    TextView localTextView1 = (TextView)paramView.findViewById(R.id.start_text);
    TextView localTextView2 = (TextView)paramView.findViewById(R.id.end_text);
    ImageView localImageView = (ImageView)paramView.findViewById(R.id.live_stream_indicator);
    this.e = ((SeekBar)paramView.findViewById(R.id.seek_bar));
    g();
    SeekBar localSeekBar = (SeekBar)paramView.findViewById(R.id.live_stream_seek_bar);
    paramb.a(localTextView1, true);
    paramb.a(localTextView2, localImageView);
    paramb.a(this.e);
    paramb.a(localSeekBar, new afw(localSeekBar, this.e));
    this.h[0] = ((ImageView)paramView.findViewById(R.id.button_0));
    this.h[1] = ((ImageView)paramView.findViewById(R.id.button_1));
    this.h[2] = ((ImageView)paramView.findViewById(R.id.button_2));
    this.h[3] = ((ImageView)paramView.findViewById(R.id.button_3));
    a(paramView, R.id.button_0, this.g[0], paramb);
    a(paramView, R.id.button_1, this.g[1], paramb);
    a(paramView, R.id.button_play_pause_toggle, R.id.cast_button_type_play_pause_toggle, paramb);
    a(paramView, R.id.button_2, this.g[2], paramb);
    a(paramView, R.id.button_3, this.g[3], paramb);
    this.i = findViewById(R.id.ad_container);
    this.f = a((RelativeLayout)paramView.findViewById(R.id.seek_bar_controls));
  }
  
  private void a(ImageView paramImageView, b paramb)
  {
    paramImageView.setBackgroundResource(this.c);
    Drawable localDrawable1 = getResources().getDrawable(R.drawable.cast_ic_expanded_controller_pause);
    Drawable localDrawable2 = getResources().getDrawable(R.drawable.cast_ic_expanded_controller_play);
    Drawable localDrawable3 = getResources().getDrawable(R.drawable.cast_ic_expanded_controller_stop);
    paramImageView.setImageDrawable(localDrawable2);
    paramb.a(paramImageView, localDrawable2, localDrawable1, localDrawable3, null, false);
  }
  
  private void b(ImageView paramImageView, b paramb)
  {
    paramImageView.setBackgroundResource(this.c);
    paramImageView.setImageDrawable(getResources().getDrawable(R.drawable.cast_ic_expanded_controller_skip_previous));
    paramImageView.setContentDescription(getResources().getString(R.string.cast_skip_prev));
    paramb.b(paramImageView, 0);
  }
  
  private void c(ImageView paramImageView, b paramb)
  {
    paramImageView.setBackgroundResource(this.c);
    paramImageView.setImageDrawable(getResources().getDrawable(R.drawable.cast_ic_expanded_controller_skip_next));
    paramImageView.setContentDescription(getResources().getString(R.string.cast_skip_next));
    paramb.a(paramImageView, 0);
  }
  
  private void d(ImageView paramImageView, b paramb)
  {
    paramImageView.setBackgroundResource(this.c);
    paramImageView.setImageDrawable(getResources().getDrawable(R.drawable.cast_ic_expanded_controller_rewind30));
    paramImageView.setContentDescription(getResources().getString(R.string.cast_rewind_30));
    paramb.b(paramImageView, 30000L);
  }
  
  private int e()
  {
    TypedArray localTypedArray = obtainStyledAttributes(new int[] { android.support.v7.appcompat.R.attr.selectableItemBackgroundBorderless });
    int m = localTypedArray.getResourceId(0, 0);
    localTypedArray.recycle();
    return m;
  }
  
  private void e(ImageView paramImageView, b paramb)
  {
    paramImageView.setBackgroundResource(this.c);
    paramImageView.setImageDrawable(getResources().getDrawable(R.drawable.cast_ic_expanded_controller_forward30));
    paramImageView.setContentDescription(getResources().getString(R.string.cast_forward_30));
    paramb.a(paramImageView, 30000L);
  }
  
  private void f(ImageView paramImageView, b paramb)
  {
    paramImageView.setBackgroundResource(this.c);
    paramImageView.setImageDrawable(getResources().getDrawable(R.drawable.cast_ic_expanded_controller_mute));
    paramb.a(paramImageView);
  }
  
  private int[] f()
  {
    boolean bool = true;
    TypedArray localTypedArray = obtainStyledAttributes(null, R.styleable.CastExpandedController, com.google.android.gms.R.attr.castExpandedControllerStyle, R.style.CastExpandedController);
    int m = localTypedArray.getResourceId(R.styleable.CastExpandedController_castControlButtons, 0);
    if (m != 0)
    {
      localTypedArray = getResources().obtainTypedArray(m);
      if (localTypedArray.length() == 4) {}
      int[] arrayOfInt;
      for (;;)
      {
        com.google.android.gms.common.internal.d.b(bool);
        arrayOfInt = new int[localTypedArray.length()];
        m = 0;
        while (m < localTypedArray.length())
        {
          arrayOfInt[m] = localTypedArray.getResourceId(m, 0);
          m += 1;
        }
        bool = false;
      }
      localTypedArray.recycle();
      return arrayOfInt;
    }
    localTypedArray.recycle();
    return new int[] { R.id.cast_button_type_empty, R.id.cast_button_type_empty, R.id.cast_button_type_empty, R.id.cast_button_type_empty };
  }
  
  @TargetApi(21)
  private void g()
  {
    if (s.k())
    {
      this.e.setProgressBackgroundTintMode(PorterDuff.Mode.MULTIPLY);
      this.e.setProgressBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.cast_expanded_controller_seek_bar_progress_background_tint_color)));
      this.e.setSplitTrack(false);
    }
  }
  
  private void g(ImageView paramImageView, b paramb)
  {
    paramImageView.setBackgroundResource(this.c);
    paramImageView.setImageDrawable(getResources().getDrawable(R.drawable.cast_ic_expanded_controller_closed_caption));
    paramb.c(paramImageView);
  }
  
  @TargetApi(19)
  private void h()
  {
    if (!s.a()) {}
    do
    {
      return;
      int n = getWindow().getDecorView().getSystemUiVisibility();
      int m = n;
      if (s.d()) {
        m = n ^ 0x2;
      }
      n = m;
      if (s.e()) {
        n = m ^ 0x4;
      }
      m = n;
      if (s.h()) {
        m = n ^ 0x1000;
      }
      getWindow().getDecorView().setSystemUiVisibility(m);
    } while (!s.g());
    setImmersive(true);
  }
  
  private com.google.android.gms.cast.framework.media.c i()
  {
    com.google.android.gms.cast.framework.d locald = this.k.b();
    if ((locald != null) && (locald.o())) {
      return locald.a();
    }
    return null;
  }
  
  private void j()
  {
    Object localObject = i();
    if ((localObject != null) && (((com.google.android.gms.cast.framework.media.c)localObject).t()))
    {
      localObject = ((com.google.android.gms.cast.framework.media.c)localObject).h();
      if (localObject != null)
      {
        localObject = ((MediaInfo)localObject).e();
        if (localObject != null)
        {
          ActionBar localActionBar = getSupportActionBar();
          if (localActionBar != null) {
            localActionBar.setTitle(((MediaMetadata)localObject).b("com.google.android.gms.cast.metadata.TITLE"));
          }
        }
      }
    }
  }
  
  private void k()
  {
    Object localObject = this.k.b();
    if (localObject != null)
    {
      localObject = ((com.google.android.gms.cast.framework.d)localObject).b();
      if (localObject != null)
      {
        localObject = ((CastDevice)localObject).e();
        if (!TextUtils.isEmpty((CharSequence)localObject))
        {
          this.d.setText(getResources().getString(R.string.cast_casting_to_device, new Object[] { localObject }));
          return;
        }
      }
    }
    this.d.setText("");
  }
  
  private void l()
  {
    Object localObject2 = null;
    com.google.android.gms.cast.framework.media.c localc = i();
    int m;
    if (localc == null)
    {
      localObject1 = null;
      if ((localObject1 == null) || (!((MediaStatus)localObject1).r())) {
        break label95;
      }
      m = 1;
      label28:
      if (m == 0) {
        break label100;
      }
      this.e.setEnabled(false);
      this.i.setVisibility(0);
      label48:
      if (localc != null) {
        break label120;
      }
    }
    label95:
    label100:
    label120:
    for (Object localObject1 = localObject2;; localObject1 = localc.h())
    {
      if (localObject1 != null)
      {
        this.f.a(this.e.getMax());
        this.f.a(((MediaInfo)localObject1).j(), -1);
      }
      return;
      localObject1 = localc.g();
      break;
      m = 0;
      break label28;
      this.e.setEnabled(true);
      this.i.setVisibility(8);
      break label48;
    }
  }
  
  public final int a()
  {
    return 4;
  }
  
  public final int a(int paramInt)
  {
    return this.g[paramInt];
  }
  
  public final ImageView b(int paramInt)
  {
    return this.h[paramInt];
  }
  
  public b b()
  {
    return this.j;
  }
  
  public TextView c()
  {
    return this.d;
  }
  
  public SeekBar d()
  {
    return this.e;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.google.android.gms.cast.framework.c.a(this).a(this, paramBundle);
    this.k = com.google.android.gms.cast.framework.c.a(this).b();
    if (this.k.b() == null) {
      finish();
    }
    this.j = new b(this);
    this.j.a(this.b);
    setContentView(R.layout.cast_expanded_controller_activity);
    this.c = e();
    this.g = f();
    a(findViewById(R.id.expanded_controller_layout), this.j);
    a((Toolbar)findViewById(R.id.toolbar));
    k();
    j();
  }
  
  protected void onDestroy()
  {
    if (this.j != null)
    {
      this.j.a(null);
      this.j.h();
    }
    super.onDestroy();
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 16908332) {
      finish();
    }
    return true;
  }
  
  protected void onPause()
  {
    com.google.android.gms.cast.framework.c.a(this).b().b(this.a, com.google.android.gms.cast.framework.d.class);
    super.onPause();
  }
  
  protected void onResume()
  {
    com.google.android.gms.cast.framework.c.a(this).b().a(this.a, com.google.android.gms.cast.framework.d.class);
    com.google.android.gms.cast.framework.d locald = com.google.android.gms.cast.framework.c.a(this).b().b();
    if ((locald == null) || ((!locald.o()) && (!locald.p()))) {
      finish();
    }
    super.onResume();
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    if (paramBoolean) {
      h();
    }
  }
  
  private class a
    implements c.a
  {
    private a() {}
    
    public void a()
    {
      com.google.android.gms.cast.framework.media.c localc = ExpandedControllerActivity.a(ExpandedControllerActivity.this);
      if ((localc == null) || (!localc.t()))
      {
        ExpandedControllerActivity.this.finish();
        return;
      }
      ExpandedControllerActivity.b(ExpandedControllerActivity.this);
      ExpandedControllerActivity.c(ExpandedControllerActivity.this);
    }
    
    public void b()
    {
      ExpandedControllerActivity.d(ExpandedControllerActivity.this);
    }
    
    public void c() {}
    
    public void d() {}
    
    public void e()
    {
      ExpandedControllerActivity.e(ExpandedControllerActivity.this).setText(ExpandedControllerActivity.this.getResources().getString(R.string.cast_expanded_controller_loading));
    }
  }
  
  private class b
    implements l<com.google.android.gms.cast.framework.d>
  {
    private b() {}
    
    public void a(com.google.android.gms.cast.framework.d paramd) {}
    
    public void a(com.google.android.gms.cast.framework.d paramd, int paramInt)
    {
      ExpandedControllerActivity.this.finish();
    }
    
    public void a(com.google.android.gms.cast.framework.d paramd, String paramString) {}
    
    public void a(com.google.android.gms.cast.framework.d paramd, boolean paramBoolean) {}
    
    public void b(com.google.android.gms.cast.framework.d paramd) {}
    
    public void b(com.google.android.gms.cast.framework.d paramd, int paramInt) {}
    
    public void b(com.google.android.gms.cast.framework.d paramd, String paramString) {}
    
    public void c(com.google.android.gms.cast.framework.d paramd, int paramInt) {}
    
    public void d(com.google.android.gms.cast.framework.d paramd, int paramInt) {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */