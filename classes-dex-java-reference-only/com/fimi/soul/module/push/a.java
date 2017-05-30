package com.fimi.soul.module.push;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.soul.entity.HistoryPushMessage;
import com.fimi.soul.utils.ao;
import java.util.List;

public class a
  extends BaseAdapter
{
  private Context a;
  private List<HistoryPushMessage> b;
  
  public a(Context paramContext, List<HistoryPushMessage> paramList)
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
    return Integer.valueOf(paramInt);
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
      paramView = new a(null);
      localView = paramView.a(paramViewGroup);
      localView.setTag(paramView);
      paramViewGroup = paramView;
    }
    for (;;)
    {
      localView.getLayoutParams().height = ((int)this.a.getResources().getDimension(2131296502));
      paramViewGroup.d.setLayoutParams(localView.getLayoutParams());
      paramViewGroup.e.setVisibility(0);
      paramViewGroup.a.setText(((HistoryPushMessage)this.b.get(paramInt)).getTitle());
      paramViewGroup.b.setText(((HistoryPushMessage)this.b.get(paramInt)).getPayload());
      paramViewGroup.c.setText(((HistoryPushMessage)this.b.get(paramInt)).getTime());
      return localView;
      paramViewGroup = (a)paramView.getTag();
      localView = paramView;
    }
  }
  
  private class a
  {
    TextView a;
    TextView b;
    TextView c;
    RelativeLayout d;
    ImageView e;
    
    private a() {}
    
    public View a(ViewGroup paramViewGroup)
    {
      paramViewGroup = LayoutInflater.from(a.a(a.this)).inflate(2130968637, paramViewGroup, false);
      this.a = ((TextView)paramViewGroup.findViewById(2131689895));
      this.b = ((TextView)paramViewGroup.findViewById(2131689898));
      this.c = ((TextView)paramViewGroup.findViewById(2131689897));
      this.e = ((ImageView)paramViewGroup.findViewById(2131689896));
      this.d = ((RelativeLayout)paramViewGroup.findViewById(2131689894));
      ao.a(a.a(a.this).getAssets(), new View[] { this.a, this.b, this.c });
      return paramViewGroup;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/push/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */