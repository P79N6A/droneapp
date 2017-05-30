package com.fimi.soul.module.a.a.a.a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import cn.sharesdk.framework.Platform.ShareParams;
import com.fimi.soul.module.a.a.a.b;
import com.fimi.soul.module.a.a.a.l;
import com.fimi.soul.module.a.e;
import com.mob.tools.gui.AsyncImageView;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.R;
import java.io.File;

public class a
  extends b
  implements TextWatcher, View.OnClickListener, Runnable
{
  private static final int q = 720;
  private static final int r = 75;
  private static final int s = 40;
  private static final int t = 70;
  private static final int u = 280;
  private static final int v = 60;
  
  public a(e parame)
  {
    super(parame);
  }
  
  private void a(LinearLayout paramLinearLayout, float paramFloat)
  {
    Object localObject = new LinearLayout(this.activity);
    ((LinearLayout)localObject).setPadding(0, 0, 0, 5);
    ((LinearLayout)localObject).setBackgroundColor(-1);
    paramLinearLayout.addView((View)localObject, new LinearLayout.LayoutParams(-1, (int)(75.0F * paramFloat)));
    int i = (int)(40.0F * paramFloat);
    this.n = new TextView(this.activity);
    this.n.setTextColor(-12895429);
    this.n.setTextSize(2, 18.0F);
    this.n.setGravity(85);
    onTextChanged(this.f.getText(), 0, 0, 0);
    this.n.setPadding(i, 0, i, 0);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -1);
    localLayoutParams.weight = 1.0F;
    ((LinearLayout)localObject).addView(this.n, localLayoutParams);
    localObject = new View(this.activity);
    ((View)localObject).setBackgroundColor(-3355444);
    if (paramFloat > 1.0F) {}
    for (i = (int)paramFloat;; i = 1)
    {
      paramLinearLayout.addView((View)localObject, new LinearLayout.LayoutParams(-1, i));
      return;
    }
  }
  
  private void a(RelativeLayout paramRelativeLayout, float paramFloat)
  {
    this.g = new TextView(this.activity);
    this.g.setTextColor(-12895429);
    this.g.setTextSize(2, 18.0F);
    this.g.setGravity(17);
    int i = R.getStringRes(this.activity, "ssdk_oks_cancel");
    if (i > 0) {
      this.g.setText(i);
    }
    i = (int)(40.0F * paramFloat);
    this.g.setPadding(i, 0, i, 0);
    Object localObject = new RelativeLayout.LayoutParams(-2, -1);
    paramRelativeLayout.addView(this.g, (ViewGroup.LayoutParams)localObject);
    this.g.setOnClickListener(this);
    localObject = new TextView(this.activity);
    ((TextView)localObject).setTextColor(-12895429);
    ((TextView)localObject).setTextSize(2, 22.0F);
    ((TextView)localObject).setGravity(17);
    int j = R.getStringRes(this.activity, "ssdk_oks_multi_share");
    if (j > 0) {
      ((TextView)localObject).setText(j);
    }
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -1);
    localLayoutParams.addRule(13);
    paramRelativeLayout.addView((View)localObject, localLayoutParams);
    this.h = new TextView(this.activity);
    this.h.setTextColor(-37615);
    this.h.setTextSize(2, 18.0F);
    this.h.setGravity(17);
    j = R.getStringRes(this.activity, "ssdk_oks_share");
    if (j > 0) {
      this.h.setText(j);
    }
    this.h.setPadding(i, 0, i, 0);
    localObject = new RelativeLayout.LayoutParams(-2, -1);
    ((RelativeLayout.LayoutParams)localObject).addRule(11);
    paramRelativeLayout.addView(this.h, (ViewGroup.LayoutParams)localObject);
    this.h.setOnClickListener(this);
  }
  
  private void a(AsyncImageView paramAsyncImageView)
  {
    String str1 = this.b.getImageUrl();
    String str2 = this.b.getImagePath();
    String[] arrayOfString = this.b.getImageArray();
    Object localObject3 = null;
    this.i.setVisibility(0);
    Object localObject1 = localObject3;
    if (!TextUtils.isEmpty(str2))
    {
      localObject1 = localObject3;
      if (!new File(str2).exists()) {}
    }
    try
    {
      localObject1 = BitmapHelper.getBitmap(str2);
      if (localObject1 != null)
      {
        this.o = ((Bitmap)localObject1);
        paramAsyncImageView.setBitmap((Bitmap)localObject1);
        localObject3 = localObject1;
        if (localObject3 == null) {
          break label176;
        }
        this.o = ((Bitmap)localObject3);
        paramAsyncImageView.setBitmap((Bitmap)localObject3);
      }
    }
    catch (Throwable localThrowable1)
    {
      Object localObject4;
      for (;;)
      {
        localThrowable1.printStackTrace();
        Object localObject2 = localObject3;
        continue;
        localObject3 = localObject2;
        if (arrayOfString != null)
        {
          localObject3 = localObject2;
          if (arrayOfString.length > 0)
          {
            localObject3 = localObject2;
            if (!TextUtils.isEmpty(arrayOfString[0]))
            {
              localObject3 = localObject2;
              if (new File(arrayOfString[0]).exists()) {
                try
                {
                  localObject3 = BitmapHelper.getBitmap(str2);
                }
                catch (Throwable localThrowable2)
                {
                  localThrowable2.printStackTrace();
                  localObject4 = localObject2;
                }
              }
            }
          }
        }
      }
      label176:
      if ((localObject4 == null) && (!TextUtils.isEmpty(str1)))
      {
        paramAsyncImageView.execute(str1, 0);
        return;
      }
      this.i.setVisibility(8);
    }
  }
  
  private void b(LinearLayout paramLinearLayout, float paramFloat)
  {
    if (paramFloat > 1.0F) {}
    for (int i = (int)paramFloat;; i = 1)
    {
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, i);
      View localView = new View(this.activity);
      localView.setBackgroundColor(687865856);
      paramLinearLayout.addView(localView, localLayoutParams);
      localView = new View(this.activity);
      localView.setBackgroundColor(335544320);
      paramLinearLayout.addView(localView, localLayoutParams);
      localView = new View(this.activity);
      localView.setBackgroundColor(117440512);
      paramLinearLayout.addView(localView, localLayoutParams);
      return;
    }
  }
  
  private void b(RelativeLayout paramRelativeLayout, float paramFloat)
  {
    this.e = new ScrollView(this.activity);
    paramRelativeLayout.addView(this.e, new RelativeLayout.LayoutParams(-1, -2));
    paramRelativeLayout = new LinearLayout(this.activity);
    paramRelativeLayout.setOrientation(0);
    this.e.addView(paramRelativeLayout, new FrameLayout.LayoutParams(-1, -2));
    this.f = new EditText(this.activity);
    int i = (int)(40.0F * paramFloat);
    this.f.setPadding(i, i, i, i);
    this.f.setBackgroundDrawable(null);
    this.f.setTextColor(-12895429);
    this.f.setTextSize(2, 21.0F);
    this.f.setText(this.b.getText());
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, -2);
    localLayoutParams.weight = 1.0F;
    paramRelativeLayout.addView(this.f, localLayoutParams);
    this.f.addTextChangedListener(this);
    this.i = new RelativeLayout(this.activity);
    this.i.setBackgroundColor(-13553359);
    int j = (int)(280.0F * paramFloat);
    int k = (int)(60.0F * paramFloat);
    localLayoutParams = new LinearLayout.LayoutParams(j, j);
    localLayoutParams.topMargin = i;
    localLayoutParams.bottomMargin = i;
    localLayoutParams.rightMargin = i;
    paramRelativeLayout.addView(this.i, localLayoutParams);
    this.j = new AsyncImageView(this.activity)
    {
      public void onImageGot(String paramAnonymousString, Bitmap paramAnonymousBitmap)
      {
        a.a(a.this, paramAnonymousBitmap);
        super.onImageGot(paramAnonymousString, paramAnonymousBitmap);
      }
    };
    this.j.setScaleToCropCenter(true);
    paramRelativeLayout = new RelativeLayout.LayoutParams(j, j);
    this.i.addView(this.j, paramRelativeLayout);
    this.j.setOnClickListener(this);
    a(this.j);
    this.k = new l(this.activity);
    this.k.setRatio(paramFloat);
    paramRelativeLayout = new RelativeLayout.LayoutParams(k, k);
    paramRelativeLayout.addRule(10);
    paramRelativeLayout.addRule(11);
    this.i.addView(this.k, paramRelativeLayout);
    this.k.setOnClickListener(this);
  }
  
  public void onCreate()
  {
    super.onCreate();
    float f = R.getScreenHeight(this.activity) / 720.0F;
    this.p = 0;
    this.c = new LinearLayout(this.activity);
    this.c.setOrientation(1);
    this.activity.setContentView(this.c);
    this.d = new RelativeLayout(this.activity);
    this.d.setBackgroundColor(-1644052);
    Object localObject1 = new LinearLayout.LayoutParams(-1, (int)(70.0F * f));
    this.c.addView(this.d, (ViewGroup.LayoutParams)localObject1);
    a(this.d, f);
    localObject1 = new RelativeLayout(this.activity);
    ((RelativeLayout)localObject1).setBackgroundColor(-1);
    Object localObject2 = new LinearLayout.LayoutParams(-1, -2);
    this.c.addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
    b((RelativeLayout)localObject1, f);
    localObject2 = new LinearLayout(this.activity);
    ((LinearLayout)localObject2).setOrientation(1);
    ((RelativeLayout)localObject1).addView((View)localObject2, new RelativeLayout.LayoutParams(-1, -2));
    b((LinearLayout)localObject2, f);
    this.l = new LinearLayout(this.activity);
    this.l.setOrientation(1);
    localObject1 = new LinearLayout.LayoutParams(-1, -2);
    this.c.addView(this.l, (ViewGroup.LayoutParams)localObject1);
    a(this.l, f);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/a/a/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */