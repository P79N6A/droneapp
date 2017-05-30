package com.fimi.soul.module.setting.GimalCalibration;

import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.d.b;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.kernel.view.progress.ProgressView;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.drone.h.q;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.f;

public class GimalCalibrationActivity
  extends BaseActivity
  implements View.OnClickListener, GimalCaliIngFragment.a, a.a
{
  TextView a;
  TextView b;
  Button c;
  Button d;
  ProgressView e;
  a f;
  private ImageView g;
  private GimalCaliIngFragment h;
  private FragmentManager i;
  private PercentRelativeLayout j;
  private boolean k;
  
  private void a(TextView paramTextView, int paramInt1, Button paramButton, int paramInt2, ImageView paramImageView, int paramInt3)
  {
    paramImageView.setImageResource(paramInt3);
    if (!paramTextView.getText().toString().equals(getString(paramInt1))) {
      paramTextView.setText(paramInt1);
    }
    paramButton.setEnabled(false);
    a(paramButton, paramInt2);
  }
  
  private void e()
  {
    this.g = ((ImageView)findViewById(2131689750));
    this.a = ((TextView)findViewById(2131689749));
    this.c = ((Button)findViewById(2131689751));
    this.c.setOnClickListener(this);
    this.c.setEnabled(false);
    this.b = ((TextView)findViewById(2131689748).findViewById(2131690327));
    this.b.setText(2131362305);
    this.d = ((Button)findViewById(2131689748).findViewById(2131690535));
    this.d.setOnClickListener(this);
    this.e = ((ProgressView)findViewById(2131689752));
    this.e.setMaxCount(a.a);
    ao.a(getAssets(), new View[] { this.a, this.c, this.b });
    this.f = new a(this, this.drone);
    f();
  }
  
  @TargetApi(23)
  private void f()
  {
    if (!this.drone.T().a())
    {
      a(this.a, 2131362019, this.c, 75, this.g, 2130837959);
      return;
    }
    if (!this.drone.U())
    {
      a(this.a, 2131362030, this.c, 75, this.g, 2130837959);
      return;
    }
    if ((this.drone.U()) && (this.drone.ac()))
    {
      a(this.a, 2131362023, this.c, 75, this.g, 2130837959);
      return;
    }
    if (this.drone.ad().aj())
    {
      a(this.a, 2131362014, this.c, 75, this.g, 2130837959);
      return;
    }
    if (this.drone.ad().u())
    {
      a(this.a, 2131362143, this.c, 75, this.g, 2130838220);
      return;
    }
    if (this.drone.ad().Z())
    {
      a(this.a, 2131362300, this.c, 75, this.g, 2130837959);
      return;
    }
    if (this.drone.ad().t())
    {
      a(this.a, 2131362301, this.c, 75, this.g, 2130837959);
      return;
    }
    if (this.drone.ad().M())
    {
      a(this.a, 2131362087, this.c, 75, this.g, 2130838222);
      return;
    }
    if (!this.c.isEnabled()) {
      b.b(this).a(getResources().getString(2131362621));
    }
    this.a.setText(getString(2131362297));
    this.c.setEnabled(true);
    a(this.c, 230);
    this.g.setImageResource(2130838230);
  }
  
  private SpannableString g()
  {
    String str = getString(2131362297);
    SpannableString localSpannableString = new SpannableString(str);
    localSpannableString.setSpan(new ForegroundColorSpan(getResources().getColor(2131624079)), 0, 11, 33);
    localSpannableString.setSpan(new ForegroundColorSpan(getResources().getColor(2131624291)), 11, 15, 33);
    localSpannableString.setSpan(new ForegroundColorSpan(getResources().getColor(2131624079)), 16, str.length(), 33);
    return localSpannableString;
  }
  
  public void a()
  {
    if ((this.h != null) && (this.h.isVisible()))
    {
      com.fimi.soul.view.f.a locala = new com.fimi.soul.view.f.a(this);
      locala.a(getString(2131362360));
      locala.b(getString(2131362051), new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          paramAnonymousDialogInterface.dismiss();
        }
      }).a(getString(2131362175), new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          paramAnonymousDialogInterface.dismiss();
          GimalCalibrationActivity.this.f.d();
          GimalCalibrationActivity.this.finish();
        }
      }).a().show();
    }
  }
  
  public void a(int paramInt)
  {
    if (this.h != null) {
      this.h.a(paramInt);
    }
    if (!this.k)
    {
      this.k = true;
      b.b(this).a(getString(2131361926));
    }
  }
  
  public void a(TextView paramTextView, int paramInt)
  {
    paramTextView.setTextColor(paramTextView.getTextColors().withAlpha(paramInt));
  }
  
  public void a(Class paramClass, int paramInt, String paramString)
  {
    paramClass = new Intent(this, paramClass);
    paramClass.putExtra("calibration_result", paramInt);
    paramClass.putExtra("calibration_result_reson", paramString);
    startActivity(paramClass);
    finish();
    overridePendingTransition(17432576, 17432577);
  }
  
  public void a(String paramString)
  {
    a(ResultCalibrationActivity.class, 1, paramString);
  }
  
  public void b()
  {
    if ((this.h != null) && (!this.h.isVisible()))
    {
      this.i.beginTransaction().show(this.h).commitAllowingStateLoss();
      this.j.setVisibility(8);
    }
  }
  
  public void b(int paramInt)
  {
    a(this.a, paramInt, this.c, 75, this.g, 2130837959);
  }
  
  public void c()
  {
    a(ResultCalibrationActivity.class, 0, getString(2131361925));
  }
  
  public void d()
  {
    f();
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.c) {
      this.f.a();
    }
    if (paramView == this.d) {
      finish();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    getWindow().setFlags(128, 128);
    super.onCreate(paramBundle);
    setContentView(2130968612);
    this.j = ((PercentRelativeLayout)findViewById(2131689747));
    this.i = getSupportFragmentManager();
    this.h = ((GimalCaliIngFragment)this.i.findFragmentById(2131689746));
    if (this.h == null) {
      this.h = new GimalCaliIngFragment();
    }
    if (!this.h.isAdded()) {
      this.i.beginTransaction().add(2131689746, this.h).hide(this.h).commitAllowingStateLoss();
    }
    for (;;)
    {
      e();
      this.k = false;
      return;
      this.i.beginTransaction().hide(this.h).commitAllowingStateLoss();
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.f.g();
    this.f.f();
    if (this.f != null) {
      this.f = null;
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (this.h != null) && (this.h.isVisible()))
    {
      a();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onStart()
  {
    super.onStart();
    this.f.e();
  }
  
  protected void onStop()
  {
    super.onStop();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/GimalCalibration/GimalCalibrationActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */