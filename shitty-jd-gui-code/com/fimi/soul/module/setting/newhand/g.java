package com.fimi.soul.module.setting.newhand;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.fimi.soul.utils.ao;
import java.util.ArrayList;

public class g
  extends BaseAdapter
{
  private Context a;
  private ArrayList<String> b;
  private LayoutInflater c;
  private int d;
  
  public g(Context paramContext, ArrayList<String> paramArrayList)
  {
    this.a = paramContext;
    this.b = paramArrayList;
    this.c = LayoutInflater.from(this.a);
  }
  
  public void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public int getCount()
  {
    return this.b.size();
  }
  
  public Object getItem(int paramInt)
  {
    return this.b.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramViewGroup = new a();
      paramView = this.c.inflate(2130968710, null);
      paramView.setTag(paramViewGroup);
      paramViewGroup.a = ((TextView)paramView.findViewById(2131690322));
      if (paramInt != this.d) {
        break label121;
      }
      paramViewGroup.a.setTextColor(this.a.getResources().getColor(2131624005));
    }
    for (;;)
    {
      paramViewGroup.a.setText((CharSequence)this.b.get(paramInt));
      ao.a(this.a.getAssets(), new View[] { paramViewGroup.a });
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label121:
      paramViewGroup.a.setTextColor(this.a.getResources().getColor(17170443));
    }
  }
  
  class a
  {
    TextView a;
    
    a() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/newhand/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */