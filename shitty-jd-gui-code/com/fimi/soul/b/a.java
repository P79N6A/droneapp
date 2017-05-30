package com.fimi.soul.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.fimi.kernel.utils.t;
import com.fimi.soul.entity.Describehistor;
import com.fimi.soul.utils.x;
import java.util.List;

public class a
  extends BaseAdapter
{
  SharedPreferences a;
  private Context b;
  private List<Describehistor> c;
  
  public a(Context paramContext)
  {
    this.b = paramContext;
    this.a = paramContext.getSharedPreferences("imagehead", 0);
  }
  
  public void a()
  {
    notifyDataSetChanged();
  }
  
  public void a(List<Describehistor> paramList)
  {
    this.c = paramList;
    notifyDataSetChanged();
  }
  
  public int getCount()
  {
    if (this.c == null) {
      return 0;
    }
    return this.c.size();
  }
  
  public Object getItem(int paramInt)
  {
    if (this.c == null) {
      return null;
    }
    return (Describehistor)this.c.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Describehistor localDescribehistor = (Describehistor)this.c.get(paramInt);
    if ((this.a != null) && (localDescribehistor.getUserID().equals(this.a.getString("name", "")))) {
      localDescribehistor.setUserImgUrl(this.a.getString(localDescribehistor.getUserID(), ""));
    }
    View localView;
    if (paramView == null)
    {
      localView = LayoutInflater.from(this.b).inflate(2130968659, null);
      paramView = new a();
      paramView.b = ((TextView)localView.findViewById(2131690004));
      paramView.a = ((TextView)localView.findViewById(2131690002));
      paramView.c = ((TextView)localView.findViewById(2131690005));
      paramView.d = ((SimpleDraweeView)localView.findViewById(2131690001));
      localView.setTag(paramView);
      paramViewGroup = paramView;
    }
    for (;;)
    {
      paramViewGroup.b.setText(localDescribehistor.getName());
      paramViewGroup.a.setText(paramInt + 1 + "");
      paramViewGroup.c.setText(t.a(localDescribehistor.getSumTime() / 60.0D, 2) + "Hrs");
      x.a(paramViewGroup.d, localDescribehistor.getUserImgUrl());
      return localView;
      paramViewGroup = (a)paramView.getTag();
      localView = paramView;
    }
  }
  
  class a
  {
    TextView a;
    TextView b;
    TextView c;
    SimpleDraweeView d;
    
    a() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */