package com.fimi.soul.module.a.a.a;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.Platform.ShareParams;
import cn.sharesdk.framework.ShareSDK;
import com.fimi.soul.module.a.c;
import com.mob.tools.gui.AsyncImageView;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.R;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class b
  extends c
  implements TextWatcher, View.OnClickListener, Runnable
{
  protected Platform a;
  protected Platform.ShareParams b;
  protected LinearLayout c;
  protected RelativeLayout d;
  protected ScrollView e;
  protected EditText f;
  protected TextView g;
  protected TextView h;
  protected RelativeLayout i;
  protected AsyncImageView j;
  protected l k;
  protected LinearLayout l;
  protected TextView m;
  protected TextView n;
  protected Bitmap o;
  protected int p;
  private com.fimi.soul.module.a.e q;
  
  public b(com.fimi.soul.module.a.e parame)
  {
    super(parame);
    this.q = parame;
  }
  
  private String a(HashMap<String, Object> paramHashMap)
  {
    if ((paramHashMap != null) && (paramHashMap.containsKey("selected")))
    {
      Object localObject = (ArrayList)paramHashMap.get("selected");
      if ("FacebookMessenger".equals(((Platform)paramHashMap.get("platform")).getName())) {
        return null;
      }
      paramHashMap = new StringBuilder();
      localObject = ((ArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        paramHashMap.append('@').append(str).append(' ');
      }
      return paramHashMap.toString();
    }
    return null;
  }
  
  private void a(Bitmap paramBitmap)
  {
    h localh = new h(this.q);
    localh.a(paramBitmap);
    localh.show(this.activity, null);
  }
  
  private void i()
  {
    ShareSDK.logDemoEvent(5, this.a);
    finish();
  }
  
  private void j()
  {
    int i1 = R.getStringRes(this.activity, "ssdk_oks_sharing");
    if (i1 > 0) {
      Toast.makeText(this.activity, i1, 0).show();
    }
    if (h()) {
      this.a.SSOSetting(true);
    }
    this.a.setPlatformActionListener(f());
    this.a.share(this.b);
    finish();
  }
  
  private void k()
  {
    this.b.setImageArray(null);
    this.b.setImageData(null);
    this.b.setImagePath(null);
    this.b.setImageUrl(null);
  }
  
  private void l()
  {
    if (this.activity.getResources().getConfiguration().orientation == 1) {}
    for (Object localObject = new com.fimi.soul.module.a.a.a.b.b(this.q);; localObject = new com.fimi.soul.module.a.a.a.a.b(this.q))
    {
      ((e)localObject).d(this.a);
      ((e)localObject).showForResult(this.a.getContext(), null, this);
      return;
    }
  }
  
  public void a(Platform.ShareParams paramShareParams)
  {
    this.b = paramShareParams;
  }
  
  protected boolean a(String paramString)
  {
    return ("SinaWeibo".equals(paramString)) || ("TencentWeibo".equals(paramString)) || ("Facebook".equals(paramString)) || ("Twitter".equals(paramString));
  }
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void d(Platform paramPlatform)
  {
    this.a = paramPlatform;
  }
  
  public void onClick(View paramView)
  {
    if (paramView.equals(this.g)) {
      i();
    }
    do
    {
      return;
      if (paramView.equals(this.h))
      {
        this.b.setText(this.f.getText().toString().trim());
        j();
        return;
      }
      if (paramView.equals(this.j))
      {
        a(this.o);
        return;
      }
      if (paramView.equals(this.k))
      {
        this.p = 0;
        this.i.setVisibility(8);
        this.c.measure(0, 0);
        onTextChanged(this.f.getText(), 0, 0, 0);
        k();
        return;
      }
    } while (!paramView.equals(this.m));
    l();
  }
  
  public void onCreate()
  {
    this.activity.getWindow().setBackgroundDrawable(new ColorDrawable(-789517));
  }
  
  public void onPause()
  {
    DeviceHelper.getInstance(this.activity).hideSoftInput(getContentView());
    super.onPause();
  }
  
  public void onResult(HashMap<String, Object> paramHashMap)
  {
    paramHashMap = a(paramHashMap);
    if (!TextUtils.isEmpty(paramHashMap)) {
      this.f.append(paramHashMap);
    }
  }
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    this.n.setText(String.valueOf(paramCharSequence.length()));
    if (this.p == 0) {
      this.p = (this.c.getHeight() - this.d.getHeight() - this.l.getHeight());
    }
    if (this.p > 0) {
      this.e.post(this);
    }
  }
  
  public void run()
  {
    int i1 = this.e.getChildAt(0).getHeight();
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)R.forceCast(this.e.getLayoutParams());
    if ((i1 > this.p) && (localLayoutParams.height != this.p))
    {
      localLayoutParams.height = this.p;
      this.e.setLayoutParams(localLayoutParams);
    }
    while ((i1 >= this.p) || (localLayoutParams.height != this.p)) {
      return;
    }
    localLayoutParams.height = -2;
    this.e.setLayoutParams(localLayoutParams);
  }
  
  public void setActivity(Activity paramActivity)
  {
    super.setActivity(paramActivity);
    if (a()) {
      System.err.println("Theme classic does not support dialog mode!");
    }
    paramActivity.getWindow().setSoftInputMode(37);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/a/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */