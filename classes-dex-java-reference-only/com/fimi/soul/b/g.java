package com.fimi.soul.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.soul.entity.UpgradeResultDetail;
import java.util.List;

public class g
  extends BaseAdapter
{
  private Context a;
  private List<UpgradeResultDetail> b;
  
  public g(Context paramContext, List<UpgradeResultDetail> paramList)
  {
    this.a = paramContext;
    this.b = paramList;
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
      paramView = LayoutInflater.from(this.a).inflate(2130968729, null);
      paramViewGroup.a = ((TextView)paramView.findViewById(2131690209));
      paramViewGroup.b = ((TextView)paramView.findViewById(2131690393));
      paramViewGroup.c = paramView.findViewById(2131690394);
      paramViewGroup.d = ((ImageView)paramView.findViewById(2131690398));
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      paramViewGroup.b.setText(((UpgradeResultDetail)this.b.get(paramInt)).getDetail());
      paramViewGroup.d.setImageResource(((UpgradeResultDetail)this.b.get(paramInt)).getImg());
      return paramView;
      paramViewGroup = (a)paramView.getTag();
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
    ImageView d;
    
    a() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */