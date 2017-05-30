package com.fimi.soul.module.a.a.a;

import android.graphics.drawable.ColorDrawable;
import android.os.Handler.Callback;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import com.mob.tools.gui.PullToRequestListAdapter;
import com.mob.tools.gui.PullToRequestView;
import com.mob.tools.utils.UIHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class c
  extends PullToRequestListAdapter
  implements PlatformActionListener
{
  private e a;
  private boolean b;
  private Platform c;
  private final int d = 15;
  private int e;
  private ArrayList<b> f;
  private HashMap<String, Boolean> g;
  private g h;
  private float i;
  
  public c(e parame, PullToRequestView paramPullToRequestView)
  {
    super(paramPullToRequestView);
    this.a = parame;
    this.e = -1;
    this.b = true;
    this.g = new HashMap();
    this.f = new ArrayList();
    getListView().setDivider(new ColorDrawable(-1381654));
  }
  
  private a a(String paramString, HashMap<String, Object> paramHashMap, HashMap<String, Boolean> paramHashMap1)
  {
    boolean bool2 = false;
    if ((paramHashMap == null) || (paramHashMap.size() <= 0)) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    Object localObject1;
    Object localObject2;
    Object localObject3;
    boolean bool1;
    if ("SinaWeibo".equals(paramString))
    {
      paramString = ((ArrayList)paramHashMap.get("users")).iterator();
      while (paramString.hasNext())
      {
        localObject1 = (HashMap)paramString.next();
        localObject2 = String.valueOf(((HashMap)localObject1).get("id"));
        if (!paramHashMap1.containsKey(localObject2))
        {
          localObject3 = new b();
          ((b)localObject3).d = ((String)localObject2);
          ((b)localObject3).b = String.valueOf(((HashMap)localObject1).get("name"));
          ((b)localObject3).c = String.valueOf(((HashMap)localObject1).get("description"));
          ((b)localObject3).e = String.valueOf(((HashMap)localObject1).get("profile_image_url"));
          ((b)localObject3).f = ((b)localObject3).b;
          paramHashMap1.put(((b)localObject3).d, Boolean.valueOf(true));
          localArrayList.add(localObject3);
        }
      }
      if (((Integer)paramHashMap.get("total_number")).intValue() > paramHashMap1.size()) {
        bool1 = true;
      }
    }
    do
    {
      for (;;)
      {
        paramString = new a(null);
        paramString.a = localArrayList;
        paramString.b = bool1;
        return paramString;
        bool1 = false;
        continue;
        if ("TencentWeibo".equals(paramString))
        {
          if (((Integer)paramHashMap.get("hasnext")).intValue() == 0) {}
          for (bool1 = true;; bool1 = false)
          {
            paramString = ((ArrayList)paramHashMap.get("info")).iterator();
            while (paramString.hasNext())
            {
              paramHashMap = (HashMap)paramString.next();
              localObject2 = String.valueOf(paramHashMap.get("name"));
              if (!paramHashMap1.containsKey(localObject2))
              {
                localObject1 = new b();
                ((b)localObject1).b = String.valueOf(paramHashMap.get("nick"));
                ((b)localObject1).d = ((String)localObject2);
                ((b)localObject1).f = ((String)localObject2);
                localObject2 = ((ArrayList)paramHashMap.get("tweet")).iterator();
                if (((Iterator)localObject2).hasNext()) {
                  ((b)localObject1).c = String.valueOf(((HashMap)((Iterator)localObject2).next()).get("text"));
                }
                ((b)localObject1).e = (String.valueOf(paramHashMap.get("head")) + "/100");
                paramHashMap1.put(((b)localObject1).d, Boolean.valueOf(true));
                localArrayList.add(localObject1);
              }
            }
          }
        }
        else
        {
          if (!"Facebook".equals(paramString)) {
            break;
          }
          paramString = ((ArrayList)paramHashMap.get("data")).iterator();
          while (paramString.hasNext())
          {
            localObject2 = (HashMap)paramString.next();
            localObject3 = String.valueOf(((HashMap)localObject2).get("id"));
            if (!paramHashMap1.containsKey(localObject3))
            {
              localObject1 = new b();
              ((b)localObject1).d = ((String)localObject3);
              ((b)localObject1).f = ("[" + (String)localObject3 + "]");
              ((b)localObject1).b = String.valueOf(((HashMap)localObject2).get("name"));
              localObject2 = (HashMap)((HashMap)localObject2).get("picture");
              if (localObject2 != null) {
                ((b)localObject1).e = String.valueOf(((HashMap)((HashMap)localObject2).get("data")).get("url"));
              }
              paramHashMap1.put(((b)localObject1).d, Boolean.valueOf(true));
              localArrayList.add(localObject1);
            }
          }
          bool1 = ((HashMap)paramHashMap.get("paging")).containsKey("next");
        }
      }
      bool1 = bool2;
    } while (!"Twitter".equals(paramString));
    paramString = ((ArrayList)paramHashMap.get("users")).iterator();
    for (;;)
    {
      bool1 = bool2;
      if (!paramString.hasNext()) {
        break;
      }
      paramHashMap = (HashMap)paramString.next();
      localObject1 = String.valueOf(paramHashMap.get("screen_name"));
      if (!paramHashMap1.containsKey(localObject1))
      {
        localObject2 = new b();
        ((b)localObject2).d = ((String)localObject1);
        ((b)localObject2).f = ((String)localObject1);
        ((b)localObject2).b = String.valueOf(paramHashMap.get("name"));
        ((b)localObject2).c = String.valueOf(paramHashMap.get("description"));
        ((b)localObject2).e = String.valueOf(paramHashMap.get("profile_image_url"));
        paramHashMap1.put(((b)localObject2).d, Boolean.valueOf(true));
        localArrayList.add(localObject2);
      }
    }
  }
  
  private void a()
  {
    if (this.b) {
      this.c.listFriend(15, this.e + 1, null);
    }
  }
  
  public b a(int paramInt)
  {
    return (b)this.f.get(paramInt);
  }
  
  public void a(float paramFloat)
  {
    this.i = paramFloat;
    ListView localListView = getListView();
    float f1 = paramFloat;
    if (paramFloat < 1.0F) {
      f1 = 1.0F;
    }
    localListView.setDividerHeight((int)f1);
  }
  
  public void a(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    getListView().setOnItemClickListener(paramOnItemClickListener);
  }
  
  public void a(Platform paramPlatform)
  {
    this.c = paramPlatform;
    paramPlatform.setPlatformActionListener(this);
  }
  
  public int getCount()
  {
    if (this.f == null) {
      return 0;
    }
    return this.f.size();
  }
  
  public View getFooterView()
  {
    LinearLayout localLinearLayout = new LinearLayout(getContext());
    localLinearLayout.setMinimumHeight(10);
    return localLinearLayout;
  }
  
  public View getHeaderView()
  {
    if (this.h == null) {
      this.h = new g(getContext());
    }
    return this.h;
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {
      paramView = new d(paramViewGroup.getContext(), this.i);
    }
    for (;;)
    {
      ((d)paramView).a(a(paramInt), isFling());
      if (paramInt == getCount() - 1) {
        a();
      }
      return paramView;
    }
  }
  
  public void onCancel(Platform paramPlatform, int paramInt)
  {
    UIHandler.sendEmptyMessage(0, new Handler.Callback()
    {
      public boolean handleMessage(Message paramAnonymousMessage)
      {
        c.c(c.this).finish();
        return false;
      }
    });
  }
  
  public void onComplete(final Platform paramPlatform, int paramInt, HashMap<String, Object> paramHashMap)
  {
    paramPlatform = a(this.c.getName(), paramHashMap, this.g);
    if (paramPlatform == null) {
      UIHandler.sendEmptyMessage(0, new Handler.Callback()
      {
        public boolean handleMessage(Message paramAnonymousMessage)
        {
          c.this.notifyDataSetChanged();
          return false;
        }
      });
    }
    do
    {
      return;
      this.b = paramPlatform.b;
    } while ((paramPlatform.a == null) || (paramPlatform.a.size() <= 0));
    this.e += 1;
    paramHashMap = new Message();
    paramHashMap.what = 1;
    paramHashMap.obj = paramPlatform.a;
    UIHandler.sendMessage(paramHashMap, new Handler.Callback()
    {
      public boolean handleMessage(Message paramAnonymousMessage)
      {
        if (c.a(c.this) <= 0) {
          c.b(c.this).clear();
        }
        c.b(c.this).addAll(paramPlatform.a);
        c.this.notifyDataSetChanged();
        return false;
      }
    });
  }
  
  public void onError(Platform paramPlatform, int paramInt, Throwable paramThrowable)
  {
    paramThrowable.printStackTrace();
  }
  
  public void onPullDown(int paramInt)
  {
    this.h.a(paramInt);
  }
  
  public void onRefresh()
  {
    this.h.a();
    this.e = -1;
    this.b = true;
    this.g.clear();
    a();
  }
  
  public void onReversed()
  {
    this.h.b();
  }
  
  private static class a
  {
    public ArrayList<c.b> a;
    public boolean b = false;
  }
  
  public static class b
  {
    public boolean a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/a/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */