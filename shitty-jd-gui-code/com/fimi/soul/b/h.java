package com.fimi.soul.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.utils.ao;
import java.util.List;

public class h
  extends BaseAdapter
{
  List<UpdateVersonBean> a = null;
  private Context b;
  
  public h(Context paramContext, List<UpdateVersonBean> paramList)
  {
    this.b = paramContext;
    this.a = paramList;
  }
  
  public int getCount()
  {
    return this.a.size();
  }
  
  public Object getItem(int paramInt)
  {
    return this.a.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView;
    if (paramView == null)
    {
      paramView = new a();
      localView = LayoutInflater.from(this.b).inflate(2130968727, null);
      paramView.a = ((TextView)localView.findViewById(2131690392));
      paramView.b = ((TextView)localView.findViewById(2131690393));
      paramView.c = localView.findViewById(2131690394);
      ao.a(this.b.getAssets(), new View[] { paramView.a });
      ao.a(this.b.getAssets(), new View[] { paramView.b });
      paramView.b.setTag(Integer.valueOf(paramInt));
      localView.setTag(paramView);
      paramViewGroup = paramView;
    }
    for (;;)
    {
      paramViewGroup.a.setText("" + (paramInt + 1));
      paramViewGroup.b.setText(((UpdateVersonBean)this.a.get(paramInt)).getSysname() + ":" + ((UpdateVersonBean)this.a.get(paramInt)).getUpdcontents());
      return localView;
      paramViewGroup = (a)paramView.getTag();
      localView = paramView;
    }
  }
  
  public boolean isEnabled(int paramInt)
  {
    return false;
  }
  
  class a
  {
    TextView a;
    TextView b;
    View c;
    
    a() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */