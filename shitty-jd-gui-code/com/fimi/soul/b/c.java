package com.fimi.soul.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import java.util.HashMap;
import java.util.List;

public class c
  extends BaseExpandableListAdapter
{
  HashMap<String, List<String>> a;
  List<String> b;
  Context c;
  
  public c(Context paramContext, HashMap<String, List<String>> paramHashMap, List<String> paramList)
  {
    this.c = paramContext;
    this.a = paramHashMap;
    this.b = paramList;
  }
  
  public void a(HashMap<String, List<String>> paramHashMap, List<String> paramList)
  {
    this.a = paramHashMap;
    this.b = paramList;
    notifyDataSetChanged();
  }
  
  public Object getChild(int paramInt1, int paramInt2)
  {
    if (this.a == null) {
      return null;
    }
    return (String)((List)this.a.get(this.b.get(paramInt1))).get(paramInt2);
  }
  
  public long getChildId(int paramInt1, int paramInt2)
  {
    return paramInt2;
  }
  
  public View getChildView(int paramInt1, int paramInt2, boolean paramBoolean, View paramView, ViewGroup paramViewGroup)
  {
    View localView;
    if (paramView == null)
    {
      localView = LayoutInflater.from(this.c).inflate(2130968675, null);
      paramView = new a();
      paramView.a = ((TextView)localView.findViewById(2131690137));
      localView.setTag(paramView);
      paramViewGroup = paramView;
    }
    for (;;)
    {
      paramViewGroup.a.setText((CharSequence)((List)this.a.get(this.b.get(paramInt1))).get(paramInt2));
      return localView;
      paramViewGroup = (a)paramView.getTag();
      localView = paramView;
    }
  }
  
  public int getChildrenCount(int paramInt)
  {
    if (this.a == null) {
      return 0;
    }
    return ((List)this.a.get(this.b.get(paramInt))).size();
  }
  
  public Object getGroup(int paramInt)
  {
    return this.b.get(paramInt);
  }
  
  public int getGroupCount()
  {
    return this.b.size();
  }
  
  public long getGroupId(int paramInt)
  {
    return paramInt;
  }
  
  public View getGroupView(int paramInt, boolean paramBoolean, View paramView, ViewGroup paramViewGroup)
  {
    paramView = LayoutInflater.from(this.c).inflate(2130968676, null);
    ((TextView)paramView.findViewById(2131690138)).setText((CharSequence)this.b.get(paramInt));
    return paramView;
  }
  
  public boolean hasStableIds()
  {
    return false;
  }
  
  public boolean isChildSelectable(int paramInt1, int paramInt2)
  {
    return false;
  }
  
  class a
  {
    public TextView a;
    
    a() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */