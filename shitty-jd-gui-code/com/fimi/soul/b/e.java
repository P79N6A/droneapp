package com.fimi.soul.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.fimi.soul.entity.FmMenuItem;
import java.util.List;

public class e
  extends BaseAdapter
{
  private Context a;
  private List<FmMenuItem> b;
  private int c;
  
  public e(Context paramContext, List<FmMenuItem> paramList)
  {
    this.a = paramContext;
    this.b = paramList;
    this.c = 2130968709;
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
      paramView = LayoutInflater.from(this.a).inflate(this.c, null);
      paramViewGroup = new a();
      paramViewGroup.a = ((TextView)paramView.findViewById(2131690321));
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      FmMenuItem localFmMenuItem = (FmMenuItem)this.b.get(paramInt);
      paramViewGroup.a.setText(localFmMenuItem.getText());
      paramView.setId(localFmMenuItem.getId());
      return paramView;
      paramViewGroup = (a)paramView.getTag();
    }
  }
  
  static class a
  {
    TextView a;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */