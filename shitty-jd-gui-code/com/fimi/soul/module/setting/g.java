package com.fimi.soul.module.setting;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.fimi.soul.utils.ao;
import java.util.Iterator;
import java.util.List;

public class g
  extends BaseAdapter
{
  List<h> a;
  Context b;
  ListView c;
  a d;
  private boolean e = false;
  private boolean f = false;
  
  public g(Context paramContext, List<h> paramList)
  {
    this.b = paramContext;
    this.a = paramList;
  }
  
  public void a(int paramInt)
  {
    if (this.a != null)
    {
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext()) {
        ((h)localIterator.next()).a(false);
      }
      ((h)this.a.get(paramInt)).a(true);
    }
    notifyDataSetChanged();
  }
  
  public void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  public void b(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  public int getCount()
  {
    if (this.a != null) {
      return this.a.size();
    }
    return 0;
  }
  
  public Object getItem(int paramInt)
  {
    if (this.a != null) {
      return (h)this.a.get(paramInt);
    }
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    this.c = ((ListView)paramViewGroup);
    if (paramView == null)
    {
      this.d = new a();
      paramView = LinearLayout.inflate(this.b, 2130968780, null);
      this.d.b = ((ImageView)paramView.findViewById(2131690537));
      this.d.a = ((TextView)paramView.findViewById(2131690538));
      paramView.setLayoutParams(new AbsListView.LayoutParams(-1, (int)this.b.getResources().getDimension(2131296501)));
      paramView.setTag(this.d);
      ao.a(this.b.getAssets(), new View[] { this.d.a });
      this.d.a.setText(((h)this.a.get(paramInt)).a());
      if (!((h)this.a.get(paramInt)).b()) {
        break label236;
      }
      this.d.b.setVisibility(0);
      this.d.a.setSelected(true);
      label191:
      if (!this.f) {
        break label261;
      }
      this.d.a.setTextColor(this.b.getResources().getColor(2131624225));
    }
    label236:
    label261:
    do
    {
      return paramView;
      this.d = ((a)paramView.getTag());
      break;
      this.d.b.setVisibility(4);
      this.d.a.setSelected(false);
      break label191;
      if ((paramInt != 2) && (this.e))
      {
        this.d.a.setTextColor(this.b.getResources().getColor(2131624225));
        return paramView;
      }
    } while ((this.e) || (paramInt != 2));
    this.d.a.setTextColor(this.b.getResources().getColor(2131624225));
    return paramView;
  }
  
  class a
  {
    TextView a;
    ImageView b;
    
    a() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */