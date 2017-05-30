package com.fimi.soul.module.setting;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.soul.biz.manager.g;
import com.fimi.soul.biz.manager.u;
import com.fimi.soul.biz.manager.u.b;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.ImageLoadingView;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class e
  extends BaseAdapter
  implements g, u.b
{
  Context a;
  List<f> b;
  u c;
  ListView d;
  boolean e = false;
  boolean f = false;
  c g;
  private long h;
  private a i;
  
  public e(Context paramContext, List<f> paramList, ListView paramListView)
  {
    this.a = paramContext;
    this.b = paramList;
    this.d = paramListView;
    this.c = u.a(this.a);
    this.c.a(this);
    this.c.a(this);
  }
  
  private void a(String paramString, int paramInt)
  {
    if ((this.b != null) && (this.b.size() > 0))
    {
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext())
      {
        f localf = (f)localIterator.next();
        if (localf.c().equals(paramString))
        {
          if (paramInt == 100)
          {
            localf.a(2);
            localf.a(localf.b().replace(".", "&synced."));
            notifyDataSetChanged();
          }
          for (;;)
          {
            localf.b(paramInt);
            break;
            if (paramInt > 0) {
              localf.a(1);
            } else {
              localf.a(0);
            }
          }
        }
      }
    }
  }
  
  public void a(int paramInt)
  {
    f localf1 = (f)this.b.get(paramInt);
    f localf2;
    if (localf1 != null)
    {
      localf2 = (f)this.b.get(paramInt);
      if (localf1.a()) {
        break label53;
      }
    }
    label53:
    for (boolean bool = true;; bool = false)
    {
      localf2.a(bool);
      notifyDataSetChanged();
      return;
    }
  }
  
  public void a(int paramInt, String paramString)
  {
    Object localObject;
    ImageView localImageView;
    if (paramInt > 0)
    {
      localObject = (ImageLoadingView)this.d.findViewWithTag("log_" + paramString);
      if (localObject != null)
      {
        ((ImageLoadingView)localObject).a();
        ((ImageLoadingView)localObject).setSweepAngle(paramInt);
      }
      localObject = (TextView)this.d.findViewWithTag("percent_" + paramString);
      localImageView = (ImageView)this.d.findViewWithTag("load_" + paramString);
      if (localObject != null)
      {
        if ((paramInt >= 100) || (paramInt <= 0)) {
          break label174;
        }
        ((TextView)localObject).setText(String.format("%s | %s%s", new Object[] { this.a.getString(2131362277), Integer.valueOf(paramInt), "%" }));
        localImageView.setImageResource(2130838152);
      }
    }
    for (;;)
    {
      a(paramString, paramInt);
      return;
      label174:
      ((TextView)localObject).setText(String.format("%s", new Object[] { this.a.getString(2131362265) }));
      if (localImageView != null) {
        localImageView.setImageResource(2130838188);
      }
      a(new File(paramString));
    }
  }
  
  public void a(PlaneMsg paramPlaneMsg, String paramString)
  {
    Object localObject;
    if ((paramPlaneMsg != null) && (!paramPlaneMsg.isSuccess()))
    {
      paramPlaneMsg = (ImageLoadingView)this.d.findViewWithTag("log_" + paramString);
      paramPlaneMsg = (TextView)this.d.findViewWithTag("percent_" + paramString);
      localObject = (ImageView)this.d.findViewWithTag("load_" + paramString);
      if (localObject != null) {
        ((ImageView)localObject).setImageResource(2130838151);
      }
      if (paramPlaneMsg != null) {
        paramPlaneMsg.setText(this.a.getString(2131362275));
      }
      this.c.d(new File(paramString));
    }
    if ((this.b == null) || (this.b.size() <= 0)) {}
    do
    {
      return;
      while (!paramPlaneMsg.hasNext()) {
        paramPlaneMsg = this.b.iterator();
      }
      localObject = (f)paramPlaneMsg.next();
    } while ((localObject == null) || (!((f)localObject).c().equals(paramString)));
    ((f)localObject).a(0);
  }
  
  public void a(f paramf)
  {
    if ((paramf != null) && ((paramf.b().endsWith(".sf")) || (paramf.b().endsWith(".txt"))))
    {
      this.c.a(new File(paramf.c()));
      paramf.c(true);
      notifyDataSetChanged();
    }
  }
  
  void a(File paramFile)
  {
    if (paramFile.exists())
    {
      int j = paramFile.getAbsolutePath().lastIndexOf("/");
      paramFile.renameTo(new File(paramFile.getAbsolutePath().substring(0, j + 1) + paramFile.getName().replace(".", "&synced.")));
    }
  }
  
  public void a(List<f> paramList)
  {
    if (paramList != null)
    {
      this.b = paramList;
      notifyDataSetChanged();
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.e = paramBoolean;
    notifyDataSetChanged();
  }
  
  public boolean a()
  {
    return this.e;
  }
  
  public void b(List<f> paramList)
  {
    List localList = this.b;
    if (paramList != null) {
      for (;;)
      {
        try
        {
          if (paramList.size() <= 0) {
            break;
          }
          paramList = paramList.iterator();
          if (!paramList.hasNext()) {
            break;
          }
          f localf1 = (f)paramList.next();
          int j = this.b.size() - 1;
          if (j >= 0)
          {
            f localf2 = (f)this.b.get(j);
            if (localf1.b().equals(localf2.b())) {
              this.b.remove(localf2);
            } else {
              j -= 1;
            }
          }
        }
        finally {}
      }
    }
    notifyDataSetChanged();
  }
  
  public void b(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  public boolean b()
  {
    return this.f;
  }
  
  public void c()
  {
    if (this.c != null)
    {
      this.c.a(null);
      this.c.c();
    }
  }
  
  public void c(boolean paramBoolean)
  {
    this.f = paramBoolean;
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext()) {
      ((f)localIterator.next()).a(paramBoolean);
    }
    notifyDataSetChanged();
  }
  
  public int getCount()
  {
    if (this.b != null) {
      return this.b.size();
    }
    return 0;
  }
  
  public Object getItem(int paramInt)
  {
    if (this.b != null) {
      return (f)this.b.get(paramInt);
    }
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public int getItemViewType(int paramInt)
  {
    if (this.b != null)
    {
      f localf = (f)this.b.get(paramInt);
      if ((localf != null) && (localf.h())) {
        return a.a.ordinal();
      }
    }
    return a.b.ordinal();
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    final Object localObject2;
    label391:
    label415:
    Object localObject1;
    if (getItemViewType(paramInt) == a.b.ordinal())
    {
      String[] arrayOfString;
      if (paramView == null)
      {
        this.g = new c();
        paramView = LinearLayout.inflate(this.a, 2130968680, null);
        this.g.a = ((TextView)paramView.findViewById(2131690167));
        this.g.b = ((TextView)paramView.findViewById(2131690168));
        this.g.c = ((TextView)paramView.findViewById(2131690169));
        this.g.d = ((ImageLoadingView)paramView.findViewById(2131690172));
        this.g.e = ((ImageView)paramView.findViewById(2131690173));
        this.g.h = ((RelativeLayout)paramView.findViewById(2131690170));
        this.g.f = ((ImageView)paramView.findViewById(2131690174));
        this.g.g = ((ImageView)paramView.findViewById(2131690171));
        paramView.setTag(this.g);
        ao.a(this.a.getAssets(), new View[] { this.g.a, this.g.b, this.g.c });
        localObject2 = (f)this.b.get(paramInt);
        this.g.d.setTag("log_" + ((f)localObject2).c());
        this.g.c.setTag("percent_" + ((f)localObject2).c());
        this.g.e.setTag("load_" + ((f)localObject2).c());
        if (!this.e) {
          break label869;
        }
        this.g.h.setVisibility(8);
        if ((((f)localObject2).d() != 0) && (((f)localObject2).d() != 2)) {
          break label855;
        }
        this.g.f.setVisibility(0);
        this.g.c.setVisibility(8);
        this.g.g.setVisibility(8);
        if (localObject2 != null)
        {
          this.g.f.setSelected(((f)localObject2).g);
          this.g.d.setPaintColor(this.a.getResources().getColor(2131624083));
          localObject1 = ((f)localObject2).b();
          paramViewGroup = (ViewGroup)localObject1;
          if (((String)localObject1).contains("-"))
          {
            paramViewGroup = (ViewGroup)localObject1;
            if (((String)localObject1).contains(" "))
            {
              arrayOfString = ((String)localObject1).split(" ");
              paramViewGroup = (ViewGroup)localObject1;
              if (arrayOfString != null)
              {
                paramViewGroup = (ViewGroup)localObject1;
                if (arrayOfString.length > 0)
                {
                  if (!this.a.getResources().getConfiguration().locale.getCountry().equals("CN")) {
                    break label917;
                  }
                  localObject1 = arrayOfString[1].replace('-', ':');
                  label558:
                  paramViewGroup = (ViewGroup)localObject1;
                  if (!((String)localObject1).contains(":"))
                  {
                    paramViewGroup = (ViewGroup)localObject1;
                    if (((String)localObject1).length() > 4) {
                      paramViewGroup = ((String)localObject1).substring(0, 2) + ":" + ((String)localObject1).substring(2, 4) + ":" + ((String)localObject1).substring(4, ((String)localObject1).length());
                    }
                  }
                }
              }
            }
          }
          if (!paramViewGroup.contains(".sf")) {
            break label933;
          }
          localObject1 = paramViewGroup.replaceAll(".sf", "");
          this.g.b.setText(this.a.getString(2131362008));
          paramViewGroup = (ViewGroup)localObject1;
          if (!this.e)
          {
            this.g.g.setVisibility(8);
            paramViewGroup = (ViewGroup)localObject1;
          }
          label706:
          if (paramViewGroup.contains("&synced")) {
            break label1254;
          }
          this.g.e.setImageResource(2130838189);
          this.g.a.setText(String.format("%s", new Object[] { paramViewGroup }));
          if (((f)localObject2).d() != 0) {
            break label1047;
          }
          ((f)localObject2).a(0);
          this.g.d.setSweepAngle(0.0F);
          if (((f)localObject2).h) {
            break label991;
          }
          this.g.c.setText(((f)localObject2).e());
        }
      }
      for (;;)
      {
        this.g.d.setTag(2131689508, localObject2);
        this.g.d.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            if (System.currentTimeMillis() - e.a(e.this) < 1000L)
            {
              return;
              break label407;
            }
            Object localObject;
            label407:
            label449:
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        e.a(e.this, System.currentTimeMillis());
                        paramAnonymousView = (ImageView)e.this.d.findViewWithTag("load_" + localObject2.c());
                      } while ((e.this.c == null) || (localObject2.d() == 2));
                      localObject = (TextView)e.this.d.findViewWithTag("percent_" + localObject2.c());
                      if (localObject2.d() != 1) {
                        break;
                      }
                      e.this.c.b(new File(localObject2.c()));
                      localObject2.a(3);
                      ((TextView)localObject).setText(String.format("%s | %s%s", new Object[] { e.this.a.getString(2131362276), Integer.valueOf(localObject2.g()), "%" }));
                      paramAnonymousView.setImageResource(2130838189);
                    } while (e.this.b == null);
                    paramAnonymousView = e.this.b.iterator();
                  } while (!paramAnonymousView.hasNext());
                  localObject = (f)paramAnonymousView.next();
                  if (!((f)localObject).c().equals(localObject2.c())) {
                    break;
                  }
                  ((f)localObject).a(3);
                  return;
                  if (localObject2.d() != 3) {
                    break label449;
                  }
                  ((TextView)localObject).setText(String.format("%s | %s%s", new Object[] { e.this.a.getString(2131362277), Integer.valueOf(localObject2.g()), "%" }));
                  e.this.c.c(new File(localObject2.c()));
                  localObject2.a(1);
                  paramAnonymousView.setImageResource(2130838152);
                } while (e.this.b == null);
                paramAnonymousView = e.this.b.iterator();
              } while (!paramAnonymousView.hasNext());
              localObject = (f)paramAnonymousView.next();
              if (!((f)localObject).c().equals(localObject2.c())) {
                break;
              }
              ((f)localObject).a(1);
              return;
            } while (localObject2.d() != 0);
            ((TextView)localObject).setText(e.this.a.getResources().getString(2131362906));
            paramAnonymousView = localObject2.e();
            if ((paramAnonymousView != null) && (Double.valueOf(paramAnonymousView.split(" ")[0]).doubleValue() > 0.0D))
            {
              e.this.c.a(new File(localObject2.c()));
              localObject2.c(true);
              return;
            }
            ((TextView)e.this.d.findViewWithTag("percent_" + localObject2.c())).setText(2131362351);
          }
        });
        localObject1 = paramView;
        return (View)localObject1;
        this.g = ((c)paramView.getTag());
        break;
        label855:
        this.g.f.setVisibility(4);
        break label391;
        label869:
        this.g.h.setVisibility(0);
        this.g.f.setVisibility(8);
        this.g.c.setVisibility(0);
        this.g.g.setVisibility(0);
        break label415;
        label917:
        localObject1 = arrayOfString[1].replace('-', ':');
        break label558;
        label933:
        localObject1 = paramViewGroup.replaceAll(".txt", "");
        this.g.b.setText(this.a.getString(2131362903));
        paramViewGroup = (ViewGroup)localObject1;
        if (this.e) {
          break label706;
        }
        this.g.g.setVisibility(0);
        paramViewGroup = (ViewGroup)localObject1;
        break label706;
        label991:
        this.g.c.setText(this.a.getResources().getString(2131362906));
        paramViewGroup = ((f)localObject2).e();
        if ((paramViewGroup != null) && (Double.valueOf(paramViewGroup.split(" ")[0]).doubleValue() > 0.0D))
        {
          continue;
          label1047:
          if (((f)localObject2).d() == 1)
          {
            ((f)localObject2).a(1);
            this.g.e.setImageResource(2130838152);
            this.g.d.a();
            this.g.d.setSweepAngle(((f)localObject2).g());
            this.g.c.setText(String.format("%s | %s%s", new Object[] { this.a.getString(2131362277), Integer.valueOf(((f)localObject2).g()), "%" }));
          }
          else if (((f)localObject2).d() == 3)
          {
            ((f)localObject2).a(3);
            this.g.e.setImageResource(2130838152);
            this.g.d.a();
            this.g.d.setSweepAngle(((f)localObject2).g());
            this.g.c.setText(String.format("%s | %s%s", new Object[] { this.a.getString(2131362276), Integer.valueOf(((f)localObject2).g()), "%" }));
            continue;
            label1254:
            this.g.d.a();
            this.g.d.setSweepAngle(100.0F);
            this.g.e.setImageResource(2130838188);
            this.g.c.setText(this.a.getResources().getString(2131362265));
            paramViewGroup = paramViewGroup.replaceAll("&synced", "");
            this.g.a.setText(paramViewGroup);
            ((f)localObject2).a(2);
          }
        }
      }
    }
    if (paramView == null)
    {
      paramView = LayoutInflater.from(this.a).inflate(2130968668, null);
      paramViewGroup = new b();
      paramViewGroup.a = ((TextView)paramView.findViewById(2131690033));
      paramView.setTag(paramViewGroup);
      ao.a(this.a.getAssets(), new View[] { paramViewGroup.a });
    }
    for (;;)
    {
      localObject2 = ((f)this.b.get(paramInt)).b();
      localObject1 = paramView;
      if (localObject2 == null) {
        break;
      }
      localObject2 = ((String)localObject2).split("-");
      localObject1 = paramView;
      if (localObject2.length < 2) {
        break;
      }
      localObject1 = localObject2[1] + "/" + localObject2[2] + "/" + localObject2[0];
      paramViewGroup.a.setText((CharSequence)localObject1);
      return paramView;
      paramViewGroup = (b)paramView.getTag();
    }
  }
  
  public int getViewTypeCount()
  {
    return 2;
  }
  
  private static enum a
  {
    private a() {}
  }
  
  class b
  {
    TextView a;
    
    b() {}
  }
  
  class c
  {
    TextView a;
    TextView b;
    TextView c;
    ImageLoadingView d;
    ImageView e;
    ImageView f;
    ImageView g;
    RelativeLayout h;
    
    c() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */