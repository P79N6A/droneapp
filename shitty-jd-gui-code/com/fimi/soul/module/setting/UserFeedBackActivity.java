package com.fimi.soul.module.setting;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.utils.z;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.a;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.SuggestBean;
import com.fimi.soul.entity.User;
import com.fimi.soul.module.login.LoginActivity;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.titlebar.FmTitleBar;
import java.io.File;
import java.io.IOException;

public class UserFeedBackActivity
  extends BaseActivity
  implements View.OnClickListener
{
  private final String A = "3";
  private final String B = "4";
  private String C = "1";
  private CompoundButton.OnCheckedChangeListener D = new CompoundButton.OnCheckedChangeListener()
  {
    public void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
    {
      if (paramAnonymousBoolean) {
        switch (paramAnonymousCompoundButton.getId())
        {
        }
      }
      for (;;)
      {
        UserFeedBackActivity.a(UserFeedBackActivity.this, paramAnonymousCompoundButton.getTag().toString());
        return;
        UserFeedBackActivity.a(UserFeedBackActivity.this).setChecked(false);
        UserFeedBackActivity.b(UserFeedBackActivity.this).setChecked(false);
        UserFeedBackActivity.c(UserFeedBackActivity.this).setChecked(false);
        paramAnonymousCompoundButton.setTag("1");
        continue;
        UserFeedBackActivity.d(UserFeedBackActivity.this).setChecked(false);
        UserFeedBackActivity.b(UserFeedBackActivity.this).setChecked(false);
        UserFeedBackActivity.c(UserFeedBackActivity.this).setChecked(false);
        paramAnonymousCompoundButton.setTag("2");
        continue;
        UserFeedBackActivity.d(UserFeedBackActivity.this).setChecked(false);
        UserFeedBackActivity.a(UserFeedBackActivity.this).setChecked(false);
        UserFeedBackActivity.c(UserFeedBackActivity.this).setChecked(false);
        paramAnonymousCompoundButton.setTag("3");
        continue;
        UserFeedBackActivity.d(UserFeedBackActivity.this).setChecked(false);
        UserFeedBackActivity.a(UserFeedBackActivity.this).setChecked(false);
        UserFeedBackActivity.b(UserFeedBackActivity.this).setChecked(false);
        paramAnonymousCompoundButton.setTag("4");
      }
    }
  };
  private ImageView a = null;
  private ImageView b = null;
  private Bitmap c = null;
  private Bitmap d = null;
  private Button e;
  private Button f;
  private FmTitleBar g;
  private InputMethodManager h;
  private CheckBox i;
  private CheckBox j;
  private CheckBox k;
  private CheckBox l;
  private TextView m;
  private TextView n;
  private TextView o;
  private TextView p;
  private EditText q;
  private EditText r;
  private TextView s;
  private TextView t;
  private TextView u;
  private TextView v;
  private ProgressDialog w = null;
  private SuggestBean x = new SuggestBean();
  private final String y = "1";
  private final String z = "2";
  
  private void a(int paramInt1, int paramInt2)
  {
    z.a(this, paramInt1, paramInt2);
  }
  
  private void b()
  {
    this.e = ((Button)findViewById(2131689874));
    this.e.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        UserFeedBackActivity.this.finish();
      }
    });
  }
  
  private void c()
  {
    this.s = ((TextView)findViewById(2131689877));
    this.t = ((TextView)findViewById(2131689886));
    this.u = ((TextView)findViewById(2131689888));
    this.v = ((TextView)findViewById(2131689891));
    this.i = ((CheckBox)findViewById(2131689878));
    this.j = ((CheckBox)findViewById(2131689880));
    this.k = ((CheckBox)findViewById(2131689882));
    this.l = ((CheckBox)findViewById(2131689884));
    this.i.setChecked(true);
    this.i.setOnCheckedChangeListener(this.D);
    this.j.setOnCheckedChangeListener(this.D);
    this.k.setOnCheckedChangeListener(this.D);
    this.l.setOnCheckedChangeListener(this.D);
    this.m = ((TextView)findViewById(2131689879));
    this.n = ((TextView)findViewById(2131689881));
    this.p = ((TextView)findViewById(2131689885));
    this.o = ((TextView)findViewById(2131689883));
    this.q = ((EditText)findViewById(2131689887));
    this.r = ((EditText)findViewById(2131689892));
    this.a = ((ImageView)findViewById(2131689889));
    this.b = ((ImageView)findViewById(2131689890));
    this.f = ((Button)findViewById(2131689893));
    this.b.setVisibility(4);
    this.b.setOnClickListener(this);
    this.a.setOnClickListener(this);
    this.f.setOnClickListener(this);
  }
  
  private boolean d()
  {
    boolean bool = true;
    if (!this.preferencesUtil.a().contains("isfirstloading"))
    {
      Intent localIntent = new Intent(this, LoginActivity.class);
      localIntent.putExtra("login", true);
      startActivity(localIntent);
      finish();
      bool = false;
    }
    return bool;
  }
  
  public void a()
  {
    Log.v("Method:", "doTrans");
    try
    {
      if (TextUtils.isEmpty(this.q.getText()))
      {
        a(2131362580, 1000);
        return;
      }
      if (this.q.getText().length() < 5)
      {
        a(2131362247, 1000);
        return;
      }
      if (this.q.getText().length() >= 1000)
      {
        a(2131362240, 1000);
        return;
      }
      this.x.setModel(this.C);
      this.w = ProgressDialog.show(this, null, getString(2131362081));
      com.fimi.soul.biz.manager.s locals = new com.fimi.soul.biz.manager.s(this);
      if ((this.c != null) && (!this.c.isRecycled())) {
        locals.a(this.c);
      }
      this.x.setUserID(a.b(this).getUserID());
      this.x.setContact(this.r.getText().toString());
      this.x.setContent(this.q.getText().toString());
      locals.a(this.x, new k()
      {
        public void a(PlaneMsg paramAnonymousPlaneMsg, File paramAnonymousFile)
        {
          if ((paramAnonymousPlaneMsg != null) && (paramAnonymousPlaneMsg.isSuccess()))
          {
            UserFeedBackActivity.a(UserFeedBackActivity.this, 2131362241, 1000);
            UserFeedBackActivity.this.finish();
          }
          for (;;)
          {
            UserFeedBackActivity.e(UserFeedBackActivity.this).dismiss();
            return;
            UserFeedBackActivity.a(UserFeedBackActivity.this, 2131362239, 1000);
          }
        }
      });
      return;
    }
    catch (Exception localException) {}
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 != -1) {}
    for (;;)
    {
      return;
      if ((this.d != null) && (!this.d.isRecycled()))
      {
        this.d.recycle();
        this.d = null;
      }
      getContentResolver();
      try
      {
        this.d = com.fimi.kernel.utils.s.a(this, paramIntent.getData(), getResources().getInteger(2131755016));
        if (this.d == null) {
          continue;
        }
        if (paramInt1 == 0)
        {
          this.a.setImageBitmap(this.d);
          this.c = this.d;
          this.b.setVisibility(0);
        }
        this.d = null;
        return;
      }
      catch (IOException paramIntent)
      {
        for (;;)
        {
          paramIntent.getStackTrace();
        }
      }
    }
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    case 2131689891: 
    case 2131689892: 
    default: 
      return;
    case 2131689890: 
      this.a.setImageBitmap(null);
      this.b.setVisibility(4);
      return;
    case 2131689889: 
      paramView = new Intent("android.intent.action.GET_CONTENT");
      paramView.setType("image/*");
      startActivityForResult(paramView, 0);
      return;
    }
    if (ao.b(this))
    {
      a();
      return;
    }
    a(2131362440, 2000);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968636);
    b();
    c();
    ao.a(getAssets(), new View[] { this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.f, this.s, this.t, this.u, this.v });
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/UserFeedBackActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */