package com.fimi.soul.module.setting.GimalCalibration;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.d.b;
import com.fimi.kernel.view.percent.PercentRelativeLayout.LayoutParams;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.utils.ao;

public class ResultCalibrationActivity
  extends BaseActivity
  implements View.OnClickListener
{
  public static final int a = 0;
  public static final int b = 1;
  public static final String c = "calibration_result";
  public static final String d = "calibration_result_reson";
  private TextView e;
  private Button f;
  private Button g;
  private Button h;
  private Button i;
  private ImageView j;
  private TextView k;
  private TextView l;
  private int m;
  
  private void a()
  {
    Object localObject = getIntent();
    if (localObject != null)
    {
      int n = ((Intent)localObject).getIntExtra("calibration_result", 0);
      localObject = ((Intent)localObject).getStringExtra("calibration_result_reson");
      if (n == 1)
      {
        this.k.setText(2131362022);
        b.b(this).a(getString(2131362012));
        if (localObject != null) {
          this.l.setText((CharSequence)localObject);
        }
        localObject = (PercentRelativeLayout.LayoutParams)this.j.getLayoutParams();
        ((PercentRelativeLayout.LayoutParams)localObject).setMargins(0, (int)(this.m * 0.12592F), 0, 0);
        this.j.setLayoutParams((ViewGroup.LayoutParams)localObject);
        this.j.setImageResource(2130838146);
        c();
      }
    }
    else
    {
      return;
    }
    this.k.setText(getString(2131362031));
    b.b(this).a(getString(2131362031));
    if (localObject != null) {
      this.l.setText("");
    }
    localObject = (PercentRelativeLayout.LayoutParams)this.j.getLayoutParams();
    ((PercentRelativeLayout.LayoutParams)localObject).setMargins(0, (int)(this.m * 0.1111F), 0, 0);
    this.j.setLayoutParams((ViewGroup.LayoutParams)localObject);
    this.j.setImageResource(2130838148);
    d();
  }
  
  private void b()
  {
    this.j = ((ImageView)findViewById(2131689956));
    this.e = ((TextView)findViewById(2131689748).findViewById(2131690327));
    this.e.setText(2131362299);
    this.f = ((Button)findViewById(2131689748).findViewById(2131690535));
    this.f.setOnClickListener(this);
    this.g = ((Button)findViewById(2131689504));
    this.g.setOnClickListener(this);
    this.h = ((Button)findViewById(2131689959));
    this.h.setOnClickListener(this);
    this.i = ((Button)findViewById(2131689960));
    this.i.setOnClickListener(this);
    this.k = ((TextView)findViewById(2131689957));
    this.l = ((TextView)findViewById(2131689958));
    a(this.g, 128);
    a(this.h, 230);
    ao.a(getAssets(), new View[] { this.e, this.f, this.g, this.h, this.i, this.k, this.l });
  }
  
  private void c()
  {
    this.g.setVisibility(0);
    this.h.setVisibility(0);
    this.i.setVisibility(8);
  }
  
  private void d()
  {
    this.g.setVisibility(8);
    this.h.setVisibility(8);
    this.i.setVisibility(0);
  }
  
  public void a(Button paramButton, int paramInt)
  {
    paramButton.setTextColor(paramButton.getTextColors().withAlpha(paramInt));
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131689959: 
      startActivity(new Intent(this, GimalCalibrationActivity.class));
      finish();
      return;
    case 2131689504: 
      finish();
      return;
    case 2131689960: 
      finish();
      return;
    }
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    getWindow().setFlags(128, 128);
    super.onCreate(paramBundle);
    setContentView(2130968651);
    paramBundle = new DisplayMetrics();
    getWindowManager().getDefaultDisplay().getMetrics(paramBundle);
    this.m = paramBundle.heightPixels;
    b();
    a();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/GimalCalibration/ResultCalibrationActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */