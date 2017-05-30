package com.fimi.soul.module.flyplannermedia;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageButton;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.entity.X11RespCmd.NotificationType;
import com.fimi.soul.entity.WifiDistanceFile;
import com.fimi.soul.utils.j;
import com.fimi.soul.view.f.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DroneLocalFragment
  extends DroneBaseMediaFragment
{
  private com.fimi.kernel.b.b.c d;
  private List<WifiDistanceFile> e;
  private a f = new a();
  private Handler g = new Handler();
  private boolean h = false;
  
  public DroneLocalFragment()
  {
    a(false);
  }
  
  private void p()
  {
    if (!this.h)
    {
      this.h = true;
      new Thread(new Runnable()
      {
        public void run()
        {
          DroneLocalFragment.a(DroneLocalFragment.this, DroneLocalFragment.b(DroneLocalFragment.this));
          DroneLocalFragment.c(DroneLocalFragment.this).sendEmptyMessage(100);
          DroneLocalFragment.a(DroneLocalFragment.this, false);
        }
      }).start();
    }
  }
  
  private List<WifiDistanceFile> q()
  {
    Object localObject3 = new File(j.o());
    ArrayList localArrayList1 = null;
    Object localObject2 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    Object localObject1 = localArrayList1;
    if (localObject3 != null)
    {
      localObject1 = localArrayList1;
      if (((File)localObject3).exists())
      {
        localObject1 = ((File)localObject3).listFiles();
        int i = 0;
        while (i < localObject1.length)
        {
          ((ArrayList)localObject2).add(localObject1[i]);
          i += 1;
        }
        localObject1 = new File(j.n());
        if (localObject1 != null)
        {
          localObject1 = ((File)localObject1).listFiles();
          if (localObject1 != null)
          {
            i = 0;
            while (i < localObject1.length)
            {
              localArrayList2.add(localObject1[i]);
              i += 1;
            }
          }
        }
        Collections.sort((List)localObject2, new b());
        localArrayList1 = new ArrayList();
        localObject3 = ((ArrayList)localObject2).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          File localFile = (File)((Iterator)localObject3).next();
          localObject2 = localFile.getName();
          WifiDistanceFile localWifiDistanceFile = new WifiDistanceFile((String)localObject2);
          localObject1 = String.format("file://%s%s", new Object[] { j.o(), localObject2 });
          localWifiDistanceFile.setLocalThumbnailPath((String)localObject1);
          localWifiDistanceFile.setPath((String)localObject1);
          Object localObject4 = this.d.a(getActivity(), (String)localObject2);
          if (localObject4 != null)
          {
            ((com.fimi.kernel.b.b.b)localObject4).a(this.g);
            this.d.c();
            localWifiDistanceFile.setDownloadTaskInfo((com.fimi.kernel.b.b.b)localObject4);
            localWifiDistanceFile.setRemoteUrl(((com.fimi.kernel.b.b.b)localObject4).m());
            localObject1 = localObject2;
            if (((String)localObject2).contains(".MP4"))
            {
              localObject2 = ((String)localObject2).replace(".MP4", ".jpg");
              localObject1 = localObject2;
              if (((com.fimi.kernel.b.b.b)localObject4).a() != null)
              {
                localWifiDistanceFile.setDurationString(((com.fimi.kernel.b.b.b)localObject4).a());
                localObject1 = localObject2;
              }
            }
            localObject2 = localArrayList2.iterator();
            while (((Iterator)localObject2).hasNext())
            {
              localObject4 = (File)((Iterator)localObject2).next();
              if (((File)localObject4).getName().contains((CharSequence)localObject1)) {
                localWifiDistanceFile.setLocalDownloadCachePath(((File)localObject4).getPath());
              }
            }
          }
          if (localFile.length() > 0L) {
            localArrayList1.add(localWifiDistanceFile);
          }
        }
        localObject1 = localArrayList1;
      }
    }
    return (List<WifiDistanceFile>)localObject1;
  }
  
  public void a(Intent paramIntent)
  {
    String str = paramIntent.getStringExtra("del_file");
    if ((paramIntent != null) && (!"".equals(str)) && (str != null)) {
      b().b(str);
    }
  }
  
  void a(GridView paramGridView) {}
  
  public void a(String paramString1, String paramString2) {}
  
  public void a(boolean paramBoolean, X11RespCmd paramX11RespCmd)
  {
    if (getActivity() != null)
    {
      if (paramX11RespCmd.getNotificationType() == X11RespCmd.NotificationType.StartingVideoRecord) {
        b().notifyDataSetChanged();
      }
      if (paramX11RespCmd.getNotificationType() == X11RespCmd.NotificationType.VideoRecordComplete) {
        b().notifyDataSetChanged();
      }
    }
  }
  
  public void o()
  {
    h(false);
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    this.d = com.fimi.kernel.b.b.c.a(getActivity());
    k().setOnClickListener(new View.OnClickListener()
    {
      public void onClick(final View paramAnonymousView)
      {
        paramAnonymousView = DroneLocalFragment.this.b().d();
        f.a locala = new f.a(DroneLocalFragment.this.getActivity());
        if ((DroneLocalFragment.this.b().c() != null) && (DroneLocalFragment.this.b().c().size() > 0)) {
          locala.a(String.format(DroneLocalFragment.this.getString(2131362177), new Object[] { DroneLocalFragment.this.b().c().size() + "" })).a(DroneLocalFragment.this.getActivity().getResources().getColor(2131624046)).b(DroneLocalFragment.this.getString(2131362121), new DialogInterface.OnClickListener()
          {
            public void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              com.fimi.kernel.c.b().a();
              paramAnonymous2DialogInterface = DroneLocalFragment.this.b().c().iterator();
              while (paramAnonymous2DialogInterface.hasNext())
              {
                Object localObject = (WifiDistanceFile)paramAnonymous2DialogInterface.next();
                if (paramAnonymousView.contains(localObject))
                {
                  File localFile = new File(((WifiDistanceFile)localObject).getPath().replace("file://", ""));
                  if (localFile.exists()) {
                    localFile.delete();
                  }
                  paramAnonymousView.remove(localObject);
                }
                localObject = DroneLocalFragment.a(DroneLocalFragment.this).a(DroneLocalFragment.this.getActivity(), ((WifiDistanceFile)localObject).getRemoteUrl());
                if (localObject != null) {
                  DroneLocalFragment.a(DroneLocalFragment.this).a((com.fimi.kernel.b.b.b)localObject);
                }
              }
              DroneLocalFragment.this.b().a(paramAnonymousView);
              DroneLocalFragment.this.b().g();
              DroneLocalFragment.this.b().notifyDataSetChanged();
              DroneLocalFragment.this.h(false);
              com.fimi.kernel.c.b().c();
              if (paramAnonymousView.size() == 0) {
                DroneLocalFragment.this.d(true);
              }
            }
          }).a(DroneLocalFragment.this.getString(2131362051), new DialogInterface.OnClickListener()
          {
            public void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int) {}
          }).a().show();
        }
      }
    });
    return paramLayoutInflater;
  }
  
  public void onResume()
  {
    super.onResume();
  }
  
  public void onStart()
  {
    super.onStart();
    e(false);
    f(true);
  }
  
  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    g(true);
    d(false);
    p();
  }
  
  class a
    extends Handler
  {
    a() {}
    
    public void handleMessage(Message paramMessage)
    {
      DroneLocalFragment.a(DroneLocalFragment.this, false);
      if (DroneLocalFragment.d(DroneLocalFragment.this) != null)
      {
        DroneLocalFragment.this.b().a(DroneLocalFragment.d(DroneLocalFragment.this));
        DroneLocalFragment.this.g(false);
        if (DroneLocalFragment.d(DroneLocalFragment.this).size() > 0) {
          DroneLocalFragment.this.d(false);
        }
        for (;;)
        {
          DroneLocalFragment.this.b().notifyDataSetChanged();
          return;
          DroneLocalFragment.this.d(true);
        }
      }
      DroneLocalFragment.this.g(false);
      DroneLocalFragment.this.d(true);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/flyplannermedia/DroneLocalFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */