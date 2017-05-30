package com.fimi.soul.view;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.fimi.kernel.b.d.c;
import com.fimi.kernel.utils.p;
import com.fimi.kernel.utils.z;
import com.fimi.soul.biz.modifyRealyWiFiConfigure.ModifyRelayWiFi;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.utils.ao;
import org.json.JSONObject;

public class i
  extends Dialog
{
  public i(Context paramContext)
  {
    super(paramContext);
  }
  
  public i(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
  }
  
  public i(Context paramContext, boolean paramBoolean, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    super(paramContext, paramBoolean, paramOnCancelListener);
  }
  
  public static class a
    implements com.fimi.kernel.b.c.d, d.b
  {
    i a;
    private Context b;
    private String c;
    private String d;
    private DialogInterface.OnClickListener e;
    private DialogInterface.OnClickListener f;
    private EditText g;
    private EditText h;
    private TextView i;
    private String j;
    private String k;
    private a l;
    
    public a(Context paramContext, a parama)
    {
      this.b = paramContext;
      this.l = parama;
      parama.a(this);
      com.fimi.soul.biz.e.d.a().o().b(this);
    }
    
    public a a(String paramString1, DialogInterface.OnClickListener paramOnClickListener1, String paramString2, DialogInterface.OnClickListener paramOnClickListener2)
    {
      this.c = paramString1;
      this.d = paramString2;
      this.e = paramOnClickListener1;
      this.f = paramOnClickListener2;
      return this;
    }
    
    public String a()
    {
      if (this.g != null) {
        return this.g.getText().toString();
      }
      return null;
    }
    
    public void a(String paramString)
    {
      try
      {
        if (paramString.contains("command")) {
          if ("0".equals(((JSONObject)new JSONObject(paramString).get("command")).getString("result")))
          {
            if ((this.a != null) && (this.a.isShowing()) && (this.b != null))
            {
              this.a.dismiss();
              z.a(this.b, 2131362613, 3000);
              Object localObject = ModifyRelayWiFi.getInstance();
              paramString = ((ModifyRelayWiFi)localObject).getSsid();
              localObject = ((ModifyRelayWiFi)localObject).getPassword();
              if (paramString != null) {
                com.fimi.soul.biz.e.d.a().e(paramString);
              }
              if (localObject != null) {
                com.fimi.soul.biz.e.d.a().d((String)localObject);
              }
            }
          }
          else if ((this.a != null) && (this.i != null))
          {
            this.i.setText(2131362612);
            return;
          }
        }
      }
      catch (Exception paramString)
      {
        paramString.printStackTrace();
      }
    }
    
    public String b()
    {
      if (this.h != null) {
        return this.h.getText().toString();
      }
      return null;
    }
    
    public void b(String paramString)
    {
      if (this.i != null) {
        this.i.setText(paramString);
      }
    }
    
    public a c(String paramString)
    {
      this.j = paramString;
      return this;
    }
    
    public i c()
    {
      Object localObject1 = (LayoutInflater)this.b.getSystemService("layout_inflater");
      this.a = new i(this.b, 2131427408);
      localObject1 = ((LayoutInflater)localObject1).inflate(2130968776, null);
      Object localObject2 = (TextView)((View)localObject1).findViewById(2131690522);
      this.g = ((EditText)((View)localObject1).findViewById(2131690523));
      this.g.clearFocus();
      if (this.j != null) {
        this.g.setText(this.j);
      }
      this.h = ((EditText)((View)localObject1).findViewById(2131690524));
      this.h.clearFocus();
      if (this.k != null) {
        this.h.setText(this.k);
      }
      this.i = ((TextView)((View)localObject1).findViewById(2131690525));
      Button localButton1 = (Button)((View)localObject1).findViewById(2131690015);
      Button localButton2 = (Button)((View)localObject1).findViewById(2131690016);
      if (this.c != null) {
        localButton1.setText(this.c);
      }
      if (this.d != null) {
        localButton2.setText(this.d);
      }
      if (this.e != null) {
        localButton1.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            i.a.a(i.a.this).onClick(i.a.this.a, -2);
          }
        });
      }
      if (this.f != null) {
        localButton2.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            i.a.b(i.a.this).onClick(i.a.this.a, -1);
          }
        });
      }
      ao.a(this.b.getAssets(), new View[] { localObject2, this.g, this.h, localButton1, localButton2, this.i });
      this.a.setContentView((View)localObject1);
      localObject1 = this.a.getWindow();
      localObject2 = ((Window)localObject1).getAttributes();
      if (p.b(this.b) > p.a(this.b)) {}
      for (float f1 = p.b(this.b);; f1 = p.a(this.b))
      {
        ((WindowManager.LayoutParams)localObject2).width = ((int)(f1 * 1032.0F / 1920.0F));
        ((Window)localObject1).setAttributes((WindowManager.LayoutParams)localObject2);
        this.a.getWindow().getDecorView().setBackgroundColor(0);
        this.a.setOnDismissListener(new DialogInterface.OnDismissListener()
        {
          public void onDismiss(DialogInterface paramAnonymousDialogInterface)
          {
            if (i.a.c(i.a.this) != null) {
              i.a.c(i.a.this).b(i.a.this);
            }
          }
        });
        return this.a;
      }
    }
    
    public a d(String paramString)
    {
      this.k = paramString;
      return this;
    }
    
    public void onDroneEvent(d.a parama, a parama1)
    {
      if ((parama == d.a.as) && (this.a != null) && (this.a.isShowing()) && (parama1 != null)) {
        b(parama1.d.getString(2131362104));
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */