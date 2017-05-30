package com.fimi.soul.module.setting;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.fimi.kernel.utils.x;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.biz.j.h;
import com.fimi.soul.module.droneTrack.PlayBackDroneTrackActivity;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.j;
import com.fimi.soul.view.f.a;
import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class FlyLogsActivity
  extends BaseActivity
  implements View.OnClickListener
{
  public static final int p = 10;
  ImageView a;
  TextView b;
  TextView c;
  TextView d;
  TextView e;
  Button f;
  Button g;
  ListView h;
  ArrayList<f> i = new ArrayList();
  List<f> j = new ArrayList();
  RelativeLayout k;
  RelativeLayout l;
  LinearLayout m;
  ImageButton n;
  ImageButton o;
  private e q;
  private Handler r = new h(this);
  private ArrayList<f> s;
  private HashMap<String, List<f>> t = new HashMap();
  
  private void a(ArrayList<f> paramArrayList)
  {
    Object localObject = null;
    int i1 = 0;
    if (i1 < paramArrayList.size())
    {
      f localf = (f)paramArrayList.get(i1);
      String[] arrayOfString = localf.b().split(" ");
      String str = " ";
      if (arrayOfString.length > 0) {
        str = arrayOfString[0];
      }
      if (str.equals(localObject)) {
        break label114;
      }
      localObject = new f();
      ((f)localObject).a(str);
      ((f)localObject).a(0);
      ((f)localObject).b(localf.c());
      ((f)localObject).b(0);
      ((f)localObject).b(true);
      paramArrayList.add(i1, localObject);
      localObject = str;
    }
    label114:
    for (;;)
    {
      i1 += 1;
      break;
      return;
    }
  }
  
  private void d()
  {
    this.q = new e(this, this.i, this.h);
    this.h.setAdapter(this.q);
    this.h.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        paramAnonymousAdapterView = (f)paramAnonymousAdapterView.getItemAtPosition(paramAnonymousInt);
        if ((paramAnonymousAdapterView != null) && (paramAnonymousAdapterView.h())) {
          return true;
        }
        FlyLogsActivity.a(FlyLogsActivity.this).a(true);
        FlyLogsActivity.this.k.setVisibility(0);
        FlyLogsActivity.this.l.setVisibility(4);
        FlyLogsActivity.this.m.setVisibility(0);
        return false;
      }
    });
    this.h.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      @SuppressLint({"StringFormatMatches"})
      public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        paramAnonymousAdapterView = (f)paramAnonymousAdapterView.getItemAtPosition(paramAnonymousInt);
        if ((paramAnonymousAdapterView != null) && (paramAnonymousAdapterView.h())) {}
        label248:
        do
        {
          do
          {
            return;
            if (FlyLogsActivity.a(FlyLogsActivity.this).a())
            {
              paramAnonymousAdapterView = (f)FlyLogsActivity.a(FlyLogsActivity.this).getItem(paramAnonymousInt);
              if (!paramAnonymousAdapterView.g) {
                FlyLogsActivity.this.j.add(paramAnonymousAdapterView);
              }
              for (;;)
              {
                FlyLogsActivity.a(FlyLogsActivity.this).a(paramAnonymousInt);
                FlyLogsActivity.this.c.setText(String.format(FlyLogsActivity.this.getResources().getString(2131362324, new Object[] { Integer.valueOf(FlyLogsActivity.this.j.size()) }), new Object[0]));
                if (FlyLogsActivity.a(FlyLogsActivity.this).getCount() != FlyLogsActivity.this.j.size()) {
                  break;
                }
                FlyLogsActivity.this.f.setText(2131362863);
                return;
                int i = FlyLogsActivity.this.j.size() - 1;
                for (;;)
                {
                  if (i < 0) {
                    break label248;
                  }
                  paramAnonymousView = (f)FlyLogsActivity.this.j.get(i);
                  if (paramAnonymousAdapterView.c().equals(paramAnonymousView.c()))
                  {
                    FlyLogsActivity.this.j.remove(i);
                    break;
                  }
                  i -= 1;
                }
              }
              FlyLogsActivity.this.f.setText(2131362655);
              return;
            }
          } while (paramAnonymousAdapterView.b().contains(".sf"));
          paramAnonymousAdapterView = new Intent(FlyLogsActivity.this, PlayBackDroneTrackActivity.class);
          paramAnonymousView = (f)FlyLogsActivity.a(FlyLogsActivity.this).getItem(paramAnonymousInt);
        } while ((paramAnonymousView == null) || (paramAnonymousView.c() == null));
        paramAnonymousAdapterView.putExtra("path", paramAnonymousView.c());
        FlyLogsActivity.this.startActivity(paramAnonymousAdapterView);
      }
    });
  }
  
  public e a()
  {
    return this.q;
  }
  
  ArrayList<f> a(String paramString, ArrayList<f> paramArrayList)
  {
    if ((paramString == null) || ("".equals(paramString))) {
      paramString = new File(j.n());
    }
    while ((paramString != null) && (paramString.exists()))
    {
      File[] arrayOfFile = paramString.listFiles();
      int i2 = arrayOfFile.length;
      int i1 = 0;
      for (;;)
      {
        if (i1 < i2)
        {
          paramString = arrayOfFile[i1];
          if (paramString.isDirectory())
          {
            a(paramString.getAbsolutePath(), paramArrayList);
            i1 += 1;
            continue;
            paramString = new File(paramString);
            break;
          }
          f localf = new f();
          localf.a(paramString.getName());
          localf.a(0);
          localf.b(paramString.getAbsolutePath());
          localf.b(0);
          for (;;)
          {
            try
            {
              Object localObject = new FileInputStream(new File(localf.c()));
              l1 = ((FileInputStream)localObject).getChannel().size() / 1024L;
              if (l1 <= 0L) {
                break;
              }
              if (l1 <= 1024L) {
                continue;
              }
              localf.c(String.format("%s %s", new Object[] { new DecimalFormat("######0.00").format(l1 / 1024.0D), "M" }));
              ((FileInputStream)localObject).close();
              SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
              localObject = paramString.getName().replace(".txt", "").replace("&synced", "").replace(".sf", "");
              String[] arrayOfString = ((String)localObject).split(" ");
              paramString = (String)localObject;
              if (arrayOfString != null)
              {
                paramString = (String)localObject;
                if (arrayOfString.length > 0)
                {
                  localObject = arrayOfString[1].replace('-', ':');
                  paramString = (String)localObject;
                  if (!((String)localObject).contains(":"))
                  {
                    paramString = (String)localObject;
                    if (((String)localObject).length() > 4) {
                      paramString = ((String)localObject).substring(0, 2) + ":" + ((String)localObject).substring(2, 4) + ":" + ((String)localObject).substring(4, ((String)localObject).length());
                    }
                  }
                  paramString = arrayOfString[0] + " " + paramString;
                }
              }
              localf.a(localSimpleDateFormat.parse(paramString).getTime());
            }
            catch (ParseException paramString)
            {
              long l1;
              paramString.printStackTrace();
              continue;
            }
            catch (Exception paramString)
            {
              paramString.printStackTrace();
              continue;
            }
            paramArrayList.add(localf);
            break;
            localf.c(String.format("%d %s", new Object[] { Integer.valueOf((int)l1), "K" }));
          }
        }
      }
    }
    return paramArrayList;
  }
  
  public ArrayList<f> b()
  {
    return this.s;
  }
  
  public ArrayList<f> c()
  {
    return this.i;
  }
  
  @SuppressLint({"StringFormatMatches"})
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131689874: 
      finish();
      return;
    case 2131690180: 
      if (this.q.b())
      {
        this.j.clear();
        this.q.c(false);
        this.f.setText(2131362655);
      }
      do
      {
        this.c.setText(String.format(getResources().getString(2131362324, new Object[] { Integer.valueOf(this.j.size()) }), new Object[0]));
        return;
        this.f.setText(2131362863);
        this.q.c(true);
        this.j.clear();
      } while ((this.i == null) || (this.i.size() <= 0));
      paramView = this.i.iterator();
      while (paramView.hasNext())
      {
        f localf = (f)paramView.next();
        this.j.add(localf);
      }
    case 2131690178: 
      this.k.setVisibility(8);
      this.l.setVisibility(0);
      this.m.setVisibility(8);
      this.q.a(false);
      this.q.c(false);
      this.q.notifyDataSetChanged();
      this.j.clear();
      return;
    case 2131690183: 
      if ((this.j == null) || (this.j.size() <= 0))
      {
        Toast.makeText(this, getString(2131362445), 1).show();
        return;
      }
      new f.a(this).a(getString(2131362178)).c(17).b(getString(2131362121), new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          if ((FlyLogsActivity.this.j != null) && (FlyLogsActivity.this.j.size() > 0))
          {
            paramAnonymousInt = FlyLogsActivity.this.j.size() - 1;
            while (paramAnonymousInt >= 0)
            {
              paramAnonymousDialogInterface = new File(((f)FlyLogsActivity.this.j.get(paramAnonymousInt)).c());
              if (paramAnonymousDialogInterface.exists()) {
                paramAnonymousDialogInterface.delete();
              }
              Object localObject = paramAnonymousDialogInterface.getParentFile();
              if ((localObject != null) && (((File)localObject).isDirectory()) && (((File)localObject).listFiles().length == 0))
              {
                localObject = new f();
                ((f)localObject).a(paramAnonymousDialogInterface.getName().split(" ")[0]);
                ((f)localObject).a(0);
                ((f)localObject).b(paramAnonymousDialogInterface.getPath());
                ((f)localObject).b(0);
                ((f)localObject).b(true);
                FlyLogsActivity.this.j.add(localObject);
              }
              paramAnonymousInt -= 1;
            }
            FlyLogsActivity.a(FlyLogsActivity.this).b(FlyLogsActivity.this.j);
          }
          FlyLogsActivity.a(FlyLogsActivity.this).a(false);
          FlyLogsActivity.this.l.setVisibility(0);
          FlyLogsActivity.this.m.setVisibility(8);
          FlyLogsActivity.this.k.setVisibility(8);
          FlyLogsActivity.a(FlyLogsActivity.this).c(false);
          FlyLogsActivity.this.j.clear();
        }
      }).a(getString(2131362051), new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          FlyLogsActivity.this.k.setVisibility(0);
          FlyLogsActivity.this.m.setVisibility(0);
          FlyLogsActivity.this.l.setVisibility(4);
        }
      }).a(getResources().getColor(2131624046)).a().show();
      return;
    }
    if ((this.j == null) || (this.j.size() <= 0))
    {
      Toast.makeText(this, getString(2131362446), 1).show();
      return;
    }
    new f.a(this).a(getString(2131362179)).c(17).b(getString(2131362274), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        if ((FlyLogsActivity.this.j != null) && (FlyLogsActivity.this.j.size() > 0))
        {
          paramAnonymousDialogInterface = FlyLogsActivity.this.j.iterator();
          while (paramAnonymousDialogInterface.hasNext())
          {
            f localf = (f)paramAnonymousDialogInterface.next();
            if (localf.d() == 0) {
              FlyLogsActivity.a(FlyLogsActivity.this).a(localf);
            }
          }
        }
        FlyLogsActivity.a(FlyLogsActivity.this).a(false);
        FlyLogsActivity.this.l.setVisibility(0);
        FlyLogsActivity.this.m.setVisibility(8);
        FlyLogsActivity.this.k.setVisibility(8);
        FlyLogsActivity.a(FlyLogsActivity.this).c(false);
        FlyLogsActivity.this.j.clear();
      }
    }).a(getString(2131362051), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        FlyLogsActivity.this.k.setVisibility(0);
        FlyLogsActivity.this.m.setVisibility(0);
        FlyLogsActivity.this.l.setVisibility(4);
      }
    }).a(getResources().getColor(2131624046)).a().show();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968681);
    this.a = ((ImageView)findViewById(2131689874));
    this.a.setOnClickListener(this);
    this.b = ((TextView)findViewById(2131690176));
    this.h = ((ListView)findViewById(2131690182));
    this.h.setOverScrollMode(2);
    this.c = ((TextView)findViewById(2131690179));
    this.f = ((Button)findViewById(2131690180));
    this.g = ((Button)findViewById(2131690178));
    this.f.setOnClickListener(this);
    this.g.setOnClickListener(this);
    this.n = ((ImageButton)findViewById(2131690183));
    this.n.setOnClickListener(this);
    this.o = ((ImageButton)findViewById(2131690185));
    this.o.setOnClickListener(this);
    this.e = ((TextView)findViewById(2131690186));
    this.d = ((TextView)findViewById(2131690184));
    this.k = ((RelativeLayout)findViewById(2131690177));
    this.l = ((RelativeLayout)findViewById(2131690175));
    this.m = ((LinearLayout)findViewById(2131689851));
    ao.a(getAssets(), getWindow().getDecorView());
    ao.a(getAssets(), new View[] { this.b, this.c, this.d, this.e });
    getWindow().addFlags(128);
    d();
  }
  
  protected void onResume()
  {
    super.onResume();
  }
  
  protected void onStart()
  {
    super.onStart();
    this.i.clear();
    this.s = ((ArrayList)this.i.clone());
    x.b(new Runnable()
    {
      public void run()
      {
        FlyLogsActivity.a(FlyLogsActivity.this, FlyLogsActivity.this.a(j.m(), FlyLogsActivity.b(FlyLogsActivity.this)));
        Collections.sort(FlyLogsActivity.b(FlyLogsActivity.this), new FlyLogsActivity.a(FlyLogsActivity.this));
        FlyLogsActivity.b(FlyLogsActivity.this, FlyLogsActivity.b(FlyLogsActivity.this));
        FlyLogsActivity.c(FlyLogsActivity.this).sendEmptyMessage(10);
      }
    });
  }
  
  protected void onStop()
  {
    super.onStop();
  }
  
  class a
    implements Comparator<f>
  {
    a() {}
    
    public int a(f paramf1, f paramf2)
    {
      if (paramf2.f() > paramf1.f()) {
        return 1;
      }
      if (paramf1.f() == paramf2.f()) {
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/FlyLogsActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */