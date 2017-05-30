package com.fimi.soul.view.titlebar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.app.FragmentActivity;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.fimi.kernel.utils.n;
import com.fimi.kernel.utils.p;
import com.fimi.kernel.view.dialog.SampleDialogFragment;
import com.fimi.soul.b.e;
import com.fimi.soul.base.BaseFimiActivity;
import com.fimi.soul.entity.FmMenuItem;
import java.util.List;

public class FmTitleBar
  extends LinearLayout
{
  protected LinearLayout a = null;
  protected LinearLayout b = null;
  protected Button c = null;
  protected Button d = null;
  protected ImageView e = null;
  protected ImageView f = null;
  protected SimpleDraweeView g = null;
  protected ImageView h = null;
  protected LinearLayout i = null;
  public int j = 1;
  public LayoutInflater k;
  public int l;
  public LinearLayout.LayoutParams m = null;
  public LinearLayout.LayoutParams n = null;
  public LinearLayout.LayoutParams o = null;
  public LinearLayout.LayoutParams p = null;
  public LinearLayout.LayoutParams q = null;
  SampleDialogFragment r = null;
  private Activity s;
  private LinearLayout.LayoutParams t = null;
  private LinearLayout.LayoutParams u = null;
  private PopupWindow v;
  
  public FmTitleBar(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public FmTitleBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public static SampleDialogFragment a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    FragmentActivity localFragmentActivity = (FragmentActivity)paramView.getContext();
    SampleDialogFragment localSampleDialogFragment = SampleDialogFragment.a(1, 2131427411, paramInt5, paramInt6);
    localSampleDialogFragment.a(paramView);
    paramView = localFragmentActivity.getFragmentManager().beginTransaction();
    paramView.setCustomAnimations(paramInt1, paramInt2, paramInt3, paramInt4);
    localSampleDialogFragment.show(paramView, "showDialog");
    localSampleDialogFragment.setCancelable(true);
    return localSampleDialogFragment;
  }
  
  public void a()
  {
    this.i.removeAllViews();
  }
  
  public void a(int paramInt)
  {
    this.i.setVisibility(0);
    this.i.addView(this.k.inflate(paramInt, null), this.m);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    p.a(this.i);
    p.a(this.e);
    int i1 = this.e.getMeasuredWidth();
    int i2 = this.i.getMeasuredWidth();
    this.t.rightMargin = 0;
    this.t.leftMargin = 0;
    if ((paramInt1 == 1) || (paramInt1 == 17)) {
      if ((i1 == 0) && (i2 == 0)) {
        this.a.setGravity(1);
      }
    }
    label157:
    label176:
    do
    {
      return;
      if (paramInt2 == 5) {
        if (i2 != 0) {
          break label157;
        }
      }
      for (;;)
      {
        this.c.setGravity(17);
        this.i.setHorizontalGravity(5);
        if ((paramInt2 != 17) && (paramInt2 != 1)) {
          break;
        }
        this.a.setGravity(1);
        this.i.setHorizontalGravity(3);
        this.c.setGravity(17);
        paramInt1 = i1 - i2;
        if (paramInt1 <= 0) {
          break label176;
        }
        this.t.rightMargin = paramInt1;
        return;
        this.c.setPadding(i2 / 3 * 2, 0, 0, 0);
      }
      this.t.leftMargin = Math.abs(paramInt1);
      return;
      if ((paramInt1 == 3) && (paramInt2 == 5))
      {
        this.a.setGravity(3);
        this.i.setHorizontalGravity(5);
        return;
      }
      if ((paramInt1 == 5) && (paramInt2 == 5))
      {
        this.a.setGravity(5);
        this.i.setHorizontalGravity(5);
        return;
      }
    } while ((paramInt1 != 3) || (paramInt2 != 3));
    this.a.setGravity(3);
    this.i.setHorizontalGravity(3);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.t.setMargins(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void a(Context paramContext)
  {
    this.s = ((Activity)paramContext);
    setOrientation(1);
    setId(this.j);
    this.k = LayoutInflater.from(paramContext);
    this.n = new LinearLayout.LayoutParams(-1, (int)paramContext.getResources().getDimension(2131296356));
    this.m = new LinearLayout.LayoutParams(-1, -1);
    this.o = new LinearLayout.LayoutParams(-1, -2);
    this.p = new LinearLayout.LayoutParams(-2, -1);
    this.q = new LinearLayout.LayoutParams(-2, -2);
    this.q.gravity = 16;
    this.t = new LinearLayout.LayoutParams(-2, -2, 1.0F);
    this.t.gravity = 16;
    this.u = new LinearLayout.LayoutParams(-2, -2);
    this.u.gravity = 16;
    if (Build.VERSION.SDK_INT >= 19) {
      addView(new View(paramContext), this.n);
    }
    this.b = new LinearLayout(paramContext);
    this.b.setOrientation(0);
    this.a = new LinearLayout(paramContext);
    this.a.setOrientation(1);
    this.a.setGravity(16);
    this.a.setPadding(0, 0, 0, 0);
    this.c = new Button(paramContext);
    this.c.setTextColor(Color.rgb(255, 255, 255));
    this.c.setTextSize(16.0F);
    this.c.setPadding(5, 0, 5, 0);
    this.c.setGravity(16);
    this.c.setBackgroundDrawable(null);
    this.c.setSingleLine();
    this.a.addView(this.c, new LinearLayout.LayoutParams(-2, -2, 1.0F));
    this.d = new Button(paramContext);
    this.d.setTextColor(Color.rgb(255, 255, 255));
    this.d.setTextSize(15.0F);
    this.d.setPadding(6, 0, 5, 0);
    this.d.setGravity(16);
    this.d.setBackgroundDrawable(null);
    this.d.setSingleLine();
    this.a.addView(this.d, new LinearLayout.LayoutParams(-2, 0));
    this.e = new ImageView(paramContext);
    this.e.setVisibility(8);
    this.h = new ImageView(paramContext);
    this.h.setVisibility(8);
    this.f = new ImageView(paramContext);
    this.f.setVisibility(8);
    this.g = new SimpleDraweeView(paramContext);
    GenericDraweeHierarchy localGenericDraweeHierarchy = new GenericDraweeHierarchyBuilder(getResources()).setPlaceholderImage(getResources().getDrawable(2130837868)).setFailureImage(getResources().getDrawable(2130837868)).setRoundingParams(RoundingParams.asCircle()).build();
    this.g.setHierarchy(localGenericDraweeHierarchy);
    this.g.setVisibility(8);
    this.b.addView(this.e, this.q);
    this.b.addView(this.g, this.q);
    this.b.addView(this.h, this.q);
    this.b.addView(this.f, this.q);
    this.b.addView(this.a, this.t);
    this.i = new LinearLayout(paramContext);
    this.i.setOrientation(0);
    this.i.setGravity(5);
    this.i.setPadding(0, 0, 0, 0);
    this.i.setHorizontalGravity(5);
    this.i.setGravity(16);
    this.i.setVisibility(8);
    this.b.addView(this.i, this.u);
    addView(this.b, this.o);
  }
  
  public void a(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    this.q.leftMargin = 10;
    this.e.setVisibility(0);
    this.e.setImageBitmap(paramBitmap);
    this.e.getLayoutParams().height = paramInt1;
    this.e.getLayoutParams().width = paramInt2;
  }
  
  public void a(View paramView)
  {
    this.m.rightMargin = 20;
    this.i.setVisibility(0);
    this.i.addView(paramView, this.m);
  }
  
  public void a(View paramView1, View paramView2, boolean paramBoolean)
  {
    p.a(paramView2);
    int i1 = paramView1.getMeasuredWidth();
    int i2 = (getMeasuredHeight() - paramView1.getMeasuredHeight()) / 2;
    if (paramView2.getMeasuredWidth() > paramView1.getMeasuredWidth()) {
      i1 = paramView2.getMeasuredWidth();
    }
    if (paramBoolean) {}
    for (this.v = new PopupWindow(paramView2, i1 + 10, -2, true);; this.v = new PopupWindow(paramView2, -1, -2, true))
    {
      this.v.setFocusable(true);
      this.v.setOutsideTouchable(true);
      this.v.setBackgroundDrawable(new ColorDrawable(17170445));
      this.v.showAsDropDown(paramView1, 0, i2 + 2);
      return;
    }
  }
  
  @SuppressLint({"NewApi"})
  public void a(List<FmMenuItem> paramList, final AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    View localView = this.k.inflate(2130968728, null);
    this.r = a(localView, 2131034125, 2131034126, 2131034125, 2131034126, 48, this.l);
    ListView localListView = (ListView)localView.findViewById(2131690397);
    localView.findViewById(2131690395).setBackgroundColor(this.l);
    localView.findViewById(2131690396).setOnClickListener(new View.OnClickListener()
    {
      @SuppressLint({"NewApi"})
      public void onClick(View paramAnonymousView)
      {
        FmTitleBar.this.r.dismiss();
      }
    });
    localListView.setAdapter(new e(this.s, paramList));
    localListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      @SuppressLint({"NewApi"})
      public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        FmTitleBar.this.r.dismiss();
        paramOnItemClickListener.onItemClick(paramAnonymousAdapterView, paramAnonymousView, paramAnonymousInt, paramAnonymousLong);
      }
    });
  }
  
  public SimpleDraweeView b(int paramInt1, int paramInt2)
  {
    this.q.leftMargin = 15;
    this.q.topMargin = 5;
    this.g.setVisibility(0);
    this.g.getLayoutParams().height = paramInt2;
    this.g.getLayoutParams().width = paramInt1;
    return this.g;
  }
  
  @SuppressLint({"NewApi"})
  public void b()
  {
    if ((this.r != null) && (this.r.isVisible())) {
      this.r.dismiss();
    }
  }
  
  public void b(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    this.q.leftMargin = 15;
    this.q.topMargin = 5;
    this.g.setVisibility(0);
    this.g.setImageBitmap(paramBitmap);
    this.g.getLayoutParams().height = paramInt1;
    this.g.getLayoutParams().width = paramInt2;
  }
  
  public void b(View paramView)
  {
    this.q.leftMargin = 10;
    this.b.addView(paramView, this.q);
  }
  
  public void c()
  {
    if (this.v != null) {
      this.v.dismiss();
    }
  }
  
  public ImageView getLogoView()
  {
    return this.e;
  }
  
  public ImageView getLogoView2()
  {
    return this.f;
  }
  
  public LinearLayout getRightLayout()
  {
    return this.i;
  }
  
  public Button getTitleSmallTextButton()
  {
    return this.d;
  }
  
  public Button getTitleTextButton()
  {
    return this.c;
  }
  
  public LinearLayout getTitleTextLayout()
  {
    return this.a;
  }
  
  public void setChildViewFillParent(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.t = new LinearLayout.LayoutParams(-2, -2, 1.0F);
      this.t.gravity = 16;
      this.a.setLayoutParams(this.t);
      this.u = new LinearLayout.LayoutParams(-2, -2);
      this.u.gravity = 16;
      this.i.setLayoutParams(this.u);
      return;
    }
    this.t = new LinearLayout.LayoutParams(-2, -2);
    this.t.gravity = 16;
    this.a.setLayoutParams(this.t);
    this.u = new LinearLayout.LayoutParams(-2, -2, 1.0F);
    this.u.gravity = 16;
    this.i.setLayoutParams(this.u);
  }
  
  public void setLogo(int paramInt)
  {
    this.e.setVisibility(0);
    this.e.setBackgroundResource(paramInt);
  }
  
  public void setLogo(Drawable paramDrawable)
  {
    this.e.setVisibility(0);
    this.e.setBackgroundDrawable(paramDrawable);
  }
  
  public void setLogo2(int paramInt)
  {
    this.f.setVisibility(0);
    this.f.setBackgroundResource(paramInt);
  }
  
  public void setLogo2(Drawable paramDrawable)
  {
    this.f.setVisibility(0);
    this.f.setBackgroundDrawable(paramDrawable);
  }
  
  public void setLogo2OnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.f.setOnClickListener(paramOnClickListener);
  }
  
  public void setLogo3(int paramInt)
  {
    this.g.setVisibility(0);
    this.g.setBackgroundResource(paramInt);
  }
  
  public void setLogo3(Drawable paramDrawable)
  {
    this.g.setVisibility(0);
    this.g.setBackgroundDrawable(paramDrawable);
  }
  
  public void setLogo3OnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.g.setOnClickListener(paramOnClickListener);
  }
  
  public void setLogoLine(int paramInt)
  {
    this.h.setVisibility(0);
    this.h.setBackgroundResource(paramInt);
  }
  
  public void setLogoLine(Drawable paramDrawable)
  {
    this.h.setVisibility(0);
    this.h.setBackgroundDrawable(paramDrawable);
  }
  
  public void setLogoOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.e.setOnClickListener(paramOnClickListener);
  }
  
  public void setTitleBarBackground(int paramInt)
  {
    setBackgroundResource(paramInt);
  }
  
  public void setTitleBarBackgroundColor(int paramInt)
  {
    this.l = paramInt;
    setBackgroundColor(paramInt);
    ((BaseFimiActivity)this.s).setStatusBarTintResource(paramInt);
  }
  
  public void setTitleBarBackgroundDrawable(Drawable paramDrawable)
  {
    setBackgroundDrawable(paramDrawable);
  }
  
  public void setTitleBarLeftBackground(int paramInt)
  {
    Drawable localDrawable = getResources().getDrawable(paramInt);
    localDrawable.setBounds(0, 0, localDrawable.getMinimumWidth(), localDrawable.getMinimumHeight());
    this.c.setCompoundDrawables(localDrawable, null, null, null);
  }
  
  public void setTitleColor(int paramInt)
  {
    this.c.setTextColor(paramInt);
  }
  
  public void setTitleSmallText(int paramInt)
  {
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
    this.d.setLayoutParams(localLayoutParams);
    this.d.setText(paramInt);
  }
  
  public void setTitleSmallText(String paramString)
  {
    if (n.b(paramString))
    {
      paramString = new LinearLayout.LayoutParams(-2, 0);
      this.d.setLayoutParams(paramString);
      this.d.setText("");
      return;
    }
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
    this.d.setLayoutParams(localLayoutParams);
    this.d.setText(paramString);
  }
  
  public void setTitleText(int paramInt)
  {
    this.c.setText(paramInt);
  }
  
  public void setTitleText(String paramString)
  {
    this.c.setText(paramString);
  }
  
  public void setTitleTextBackgroundDrawable(Drawable paramDrawable)
  {
    this.c.setBackgroundDrawable(paramDrawable);
  }
  
  public void setTitleTextBackgroundResource(int paramInt)
  {
    this.c.setBackgroundResource(paramInt);
  }
  
  public void setTitleTextBold(boolean paramBoolean)
  {
    TextPaint localTextPaint = this.c.getPaint();
    if (paramBoolean)
    {
      localTextPaint.setFakeBoldText(true);
      return;
    }
    localTextPaint.setFakeBoldText(false);
  }
  
  public void setTitleTextDropDown(final View paramView)
  {
    if (paramView == null) {
      return;
    }
    setTitleTextOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        FmTitleBar.this.a(FmTitleBar.this.c, paramView, true);
      }
    });
  }
  
  public void setTitleTextOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.c.setOnClickListener(paramOnClickListener);
  }
  
  public void setTitleTextSize(int paramInt)
  {
    this.c.setTextSize(paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/titlebar/FmTitleBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */