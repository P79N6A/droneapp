package com.fimi.soul.view;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.fimi.kernel.view.dialog.a;
import com.fimi.kernel.view.dialog.c;
import com.fimi.soul.utils.ao;

public class b
  implements c
{
  private b c;
  private c d;
  private a e;
  
  public Dialog a(Context paramContext, int paramInt, String paramString1, String paramString2, a parama)
  {
    return a(paramContext, paramString1, paramString2, parama);
  }
  
  public Dialog a(Context paramContext, String paramString1, int paramInt, String paramString2, String paramString3, a parama)
  {
    return a(paramContext, paramString1, null, paramInt, paramString2, paramString3, parama);
  }
  
  public Dialog a(Context paramContext, String paramString1, String paramString2, int paramInt, String paramString3, String paramString4, a parama)
  {
    if (this.c == null) {
      this.c = new b(paramContext, paramString1, paramString2, paramInt, paramString3, paramString4, parama);
    }
    if (!this.c.isShowing()) {
      this.c.show();
    }
    return this.c;
  }
  
  public Dialog a(Context paramContext, String paramString1, String paramString2, final a parama)
  {
    paramString1 = new AlertDialog.Builder(paramContext).setTitle(paramString1).setMessage(paramString2).setNegativeButton(paramContext.getString(2131362092), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        if (parama != null) {
          parama.a(-1);
        }
      }
    });
    if (parama != null) {
      paramString1.setPositiveButton(paramContext.getString(2131362051), new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          if (parama != null) {
            parama.a(-2);
          }
        }
      });
    }
    return paramString1.show();
  }
  
  public Dialog a(Context paramContext, String paramString1, String paramString2, String paramString3, Boolean paramBoolean, String paramString4, a parama)
  {
    if (this.e == null) {
      this.e = new a(paramContext, paramString1, paramString2, paramString3, paramBoolean, paramString4, parama);
    }
    if (!this.e.isShowing()) {
      this.e.show();
    }
    return this.e;
  }
  
  public Dialog b(Context paramContext, String paramString1, String paramString2, a parama)
  {
    if (this.d == null) {
      this.d = new c(paramContext, paramString1, paramString2, parama);
    }
    if (!this.d.isShowing()) {
      this.d.show();
    }
    return this.d;
  }
  
  class a
    extends AlertDialog
  {
    Context a;
    String b;
    a c;
    int d;
    String e;
    String f;
    Boolean g;
    String h;
    
    protected a(Context paramContext, String paramString1, String paramString2, String paramString3, Boolean paramBoolean, String paramString4, a parama)
    {
      super();
      this.a = paramContext;
      this.b = paramString1;
      this.c = parama;
      this.e = paramString2;
      this.f = paramString3;
      this.g = paramBoolean;
      this.h = paramString4;
    }
    
    protected void onCreate(Bundle paramBundle)
    {
      super.onCreate(paramBundle);
      setContentView(2130968664);
      paramBundle = (Button)findViewById(2131690015);
      Button localButton = (Button)findViewById(2131690016);
      TextView localTextView1 = (TextView)findViewById(2131690017);
      localTextView1.setText(this.h);
      final CheckBox localCheckBox = (CheckBox)findViewById(2131689643);
      localCheckBox.setChecked(this.g.booleanValue());
      TextView localTextView2 = (TextView)findViewById(2131689998);
      localTextView2.setText(this.b);
      paramBundle.setText(this.e);
      localButton.setText(this.f);
      ao.a(this.a.getAssets(), new View[] { localButton, paramBundle, localTextView1, localTextView2 });
      localTextView2.setTextColor(-872415232);
      localTextView2.getPaint().setFakeBoldText(true);
      paramBundle.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          if (b.a.this.c != null)
          {
            b.a.this.c.a(-2, Boolean.valueOf(localCheckBox.isChecked()));
            b.a.this.dismiss();
          }
        }
      });
      localButton.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          if (b.a.this.c != null)
          {
            b.a.this.c.a(-1, Boolean.valueOf(localCheckBox.isChecked()));
            b.a.this.dismiss();
          }
        }
      });
    }
  }
  
  class b
    extends AlertDialog
  {
    Context a;
    String b;
    String c;
    a d;
    int e;
    String f;
    String g;
    
    protected b(Context paramContext, String paramString1, String paramString2, int paramInt, String paramString3, String paramString4, a parama)
    {
      super();
      this.a = paramContext;
      this.b = paramString1;
      this.c = paramString2;
      this.d = parama;
      this.f = paramString3;
      this.e = paramInt;
      this.g = paramString4;
    }
    
    protected void onCreate(Bundle paramBundle)
    {
      super.onCreate(paramBundle);
      setContentView(2130968662);
      paramBundle = (Button)findViewById(2131690015);
      Button localButton = (Button)findViewById(2131690016);
      TextView localTextView1 = (TextView)findViewById(2131689998);
      TextView localTextView2 = (TextView)findViewById(2131690013);
      if (this.c == null) {
        localTextView2.setVisibility(8);
      }
      localTextView2.setText(this.c);
      localTextView1.setText(this.b);
      localButton.setTextColor(this.e);
      paramBundle.setText(this.f);
      localButton.setText(this.g);
      ao.a(this.a.getAssets(), new View[] { localButton, paramBundle, localTextView1, localTextView2 });
      localTextView1.setTextColor(-872415232);
      localTextView1.getPaint().setFakeBoldText(true);
      paramBundle.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          if (b.b.this.d != null)
          {
            b.b.this.dismiss();
            b.b.this.d.a(-2);
          }
        }
      });
      localButton.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          if (b.b.this.d != null)
          {
            b.b.this.dismiss();
            b.b.this.d.a(-1);
          }
        }
      });
    }
  }
  
  class c
    extends AlertDialog
  {
    Context a;
    String b;
    String c;
    a d;
    
    protected c(Context paramContext, String paramString1, String paramString2, a parama)
    {
      super();
      this.a = paramContext;
      this.b = paramString1;
      this.c = paramString2;
      this.d = parama;
    }
    
    protected void onCreate(Bundle paramBundle)
    {
      super.onCreate(paramBundle);
      setContentView(2130968666);
      paramBundle = (TextView)findViewById(2131690020);
      Button localButton = (Button)findViewById(2131690021);
      localButton.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          b.c.this.dismiss();
          b.c.this.d.a(-1);
        }
      });
      TextView localTextView = (TextView)findViewById(2131689998);
      localTextView.setText(this.b);
      paramBundle.setText(this.c);
      ao.a(this.a.getAssets(), new View[] { localTextView, localButton, paramBundle });
      localTextView.setTextColor(-872415232);
      localTextView.getPaint().setFakeBoldText(true);
      paramBundle.getPaint().setFakeBoldText(true);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */