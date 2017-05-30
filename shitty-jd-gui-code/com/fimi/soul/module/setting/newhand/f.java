package com.fimi.soul.module.setting.newhand;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;

public class f
{
  View a;
  ListView b;
  ArrayList<String> c;
  PopupWindow d;
  g e;
  TextView f;
  a g;
  AdapterView.OnItemClickListener h = new AdapterView.OnItemClickListener()
  {
    public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
    {
      f.this.g.a(paramAnonymousInt);
      if (f.this.d != null)
      {
        f.this.d.dismiss();
        f.this.d = null;
      }
    }
  };
  
  public void a(TextView paramTextView, Context paramContext, int paramInt, a parama)
  {
    this.f = paramTextView;
    this.g = parama;
    this.a = LayoutInflater.from(paramContext).inflate(2130968730, null);
    this.b = ((ListView)this.a.findViewById(2131690399));
    this.c = new ArrayList();
    this.c.add(paramContext.getString(2131362475));
    this.c.add(paramContext.getString(2131362520));
    this.e = new g(paramContext, this.c);
    this.e.a(paramInt);
    this.b.setAdapter(this.e);
    this.d = new PopupWindow(this.a, -2, -2);
    this.d.setBackgroundDrawable(paramContext.getResources().getDrawable(2130838434));
    this.d.setFocusable(true);
    paramContext = new int[2];
    paramTextView.getLocationOnScreen(paramContext);
    this.d.showAtLocation(paramTextView, 0, paramContext[0], paramContext[1]);
    this.b.setOnItemClickListener(this.h);
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/newhand/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */