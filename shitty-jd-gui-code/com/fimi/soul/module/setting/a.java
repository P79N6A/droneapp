package com.fimi.soul.module.setting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.fimi.kernel.view.button.SwitchButton;
import com.fimi.kernel.view.button.SwitchButton.a;
import com.fimi.soul.biz.camera.b.e;
import com.fimi.soul.biz.camera.d;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import java.util.HashMap;
import java.util.Map;

public abstract class a
  implements e<X11RespCmd>
{
  private View a;
  private ViewGroup b;
  private Context c;
  private Map<String, View> d = new HashMap();
  private LayoutInflater e;
  private d f;
  
  public a(Context paramContext)
  {
    a(paramContext);
    this.e = LayoutInflater.from(paramContext);
    this.a = this.e.inflate(2130968722, null);
    this.b = ((ViewGroup)this.a.findViewById(2131690350));
  }
  
  private Button a(View paramView, String paramString1, String paramString2, View.OnClickListener paramOnClickListener)
  {
    ((TextView)paramView.findViewById(2131690327)).setText(paramString1);
    paramString1 = (Button)paramView.findViewById(2131690324);
    paramString1.setOnClickListener(paramOnClickListener);
    paramString1.setText(paramString2);
    e().addView(paramView);
    return paramString1;
  }
  
  private void a(View paramView, String paramString)
  {
    ((TextView)paramView.findViewById(2131690327)).setText(paramString);
  }
  
  protected LayoutInflater a()
  {
    return this.e;
  }
  
  protected Button a(int paramInt, String paramString, View.OnClickListener paramOnClickListener)
  {
    return a(f().getText(paramInt).toString(), paramString, paramOnClickListener);
  }
  
  protected Button a(String paramString)
  {
    return a(paramString, null);
  }
  
  protected Button a(String paramString, View.OnClickListener paramOnClickListener)
  {
    View localView = this.e.inflate(2130968712, null);
    Button localButton = (Button)localView.findViewById(2131690324);
    localButton.setText(paramString);
    localButton.setOnClickListener(paramOnClickListener);
    e().addView(localView);
    return localButton;
  }
  
  protected Button a(String paramString1, String paramString2, View.OnClickListener paramOnClickListener)
  {
    return a(a().inflate(2130968716, null), paramString1, paramString2, paramOnClickListener);
  }
  
  protected SwitchButton a(String paramString, boolean paramBoolean, SwitchButton.a parama)
  {
    View localView = a().inflate(2130968717, null);
    ((TextView)localView.findViewById(2131690327)).setText(paramString);
    paramString = (SwitchButton)localView.findViewById(2131690329);
    paramString.setSwitchState(paramBoolean);
    paramString.setOnSwitchListener(parama);
    e().addView(localView);
    return paramString;
  }
  
  protected a a(String paramString1, String paramString2)
  {
    View localView = this.e.inflate(2130968713, null);
    a locala = new a();
    Button localButton = (Button)localView.findViewById(2131690325);
    localButton.setText(paramString1);
    paramString1 = (Button)localView.findViewById(2131690326);
    paramString1.setText(paramString2);
    locala.a(localButton);
    locala.b(paramString1);
    e().addView(localView);
    return locala;
  }
  
  protected void a(Context paramContext)
  {
    this.c = paramContext;
  }
  
  protected void a(LayoutInflater paramLayoutInflater)
  {
    this.e = paramLayoutInflater;
  }
  
  protected void a(ViewGroup paramViewGroup)
  {
    this.b = paramViewGroup;
  }
  
  public void a(d paramd)
  {
    this.f = paramd;
  }
  
  protected View b()
  {
    return this.a;
  }
  
  protected Button b(String paramString1, String paramString2, View.OnClickListener paramOnClickListener)
  {
    return a(a().inflate(2130968715, null), paramString1, paramString2, paramOnClickListener);
  }
  
  protected EditText b(String paramString1, String paramString2)
  {
    View localView = a().inflate(2130968714, null);
    a(localView, paramString1);
    paramString1 = (EditText)localView.findViewById(2131690328);
    paramString1.setText(paramString2);
    e().addView(localView);
    return paramString1;
  }
  
  public abstract View c();
  
  protected TextView c(String paramString1, String paramString2)
  {
    View localView = a().inflate(2130968718, null);
    a(localView, paramString1);
    paramString1 = (TextView)localView.findViewById(2131690330);
    paramString1.setText(paramString2);
    e().addView(localView);
    return paramString1;
  }
  
  public d d()
  {
    return this.f;
  }
  
  public ViewGroup e()
  {
    return this.b;
  }
  
  protected Context f()
  {
    return this.c;
  }
  
  public class a
  {
    private Button b;
    private Button c;
    
    public a() {}
    
    public Button a()
    {
      return this.b;
    }
    
    public void a(Button paramButton)
    {
      this.b = paramButton;
    }
    
    public Button b()
    {
      return this.c;
    }
    
    public void b(Button paramButton)
    {
      this.c = paramButton;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */