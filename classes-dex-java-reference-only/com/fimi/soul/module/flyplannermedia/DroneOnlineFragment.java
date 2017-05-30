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
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageButton;
import com.fimi.kernel.b.b.c.a;
import com.fimi.kernel.b.b.c.b;
import com.fimi.kernel.utils.z;
import com.fimi.soul.biz.camera.b.a;
import com.fimi.soul.biz.camera.c.d.a;
import com.fimi.soul.biz.camera.e;
import com.fimi.soul.biz.camera.entity.X11DeviceInfo;
import com.fimi.soul.biz.camera.entity.X11FileInfo;
import com.fimi.soul.biz.camera.entity.X11FileSystem;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.entity.X11RespCmd.NotificationType;
import com.fimi.soul.biz.camera.entity.X11SystemConfig;
import com.fimi.soul.entity.WifiDistanceFile;
import com.fimi.soul.media.player.FermiPlayerUtils;
import com.fimi.soul.utils.j;
import com.fimi.soul.view.f.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DroneOnlineFragment
  extends DroneBaseMediaFragment
  implements c.a, c.b
{
  private static final int k = 153;
  Handler d = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      if (153 == paramAnonymousMessage.what) {
        DroneOnlineFragment.this.m().s().e();
      }
    }
  };
  private int e = 0;
  private int f;
  private a<X11FileInfo> g;
  private List<WifiDistanceFile> h;
  private List<X11FileInfo> i = new ArrayList();
  private X11DeviceInfo j;
  private boolean l = false;
  private boolean m = false;
  private boolean n = false;
  private boolean o = false;
  
  public DroneOnlineFragment()
  {
    a(true);
    this.n = false;
  }
  
  private void a(X11FileInfo paramX11FileInfo, String paramString)
  {
    WifiDistanceFile localWifiDistanceFile = new WifiDistanceFile(paramX11FileInfo.getName());
    localWifiDistanceFile.setLocalThumbnailPath(paramString);
    localWifiDistanceFile.setDateString(paramX11FileInfo.getCreateDate());
    localWifiDistanceFile.setSize(paramX11FileInfo.getSize());
    localWifiDistanceFile.setRealPath(paramX11FileInfo.getRemotePath());
    localWifiDistanceFile.setAbsolutePath(paramX11FileInfo.getAbsolutePath());
    localWifiDistanceFile.setRemoteUrl(paramX11FileInfo.getHttpUrl());
    if (localWifiDistanceFile.getType() == 2) {
      localWifiDistanceFile.setRemoteThmUrl(paramX11FileInfo.getHttpThmUrl());
    }
    b().a(localWifiDistanceFile);
    g(false);
  }
  
  private void b(List<X11FileInfo> paramList)
  {
    if ((paramList != null) && (paramList.size() > this.e))
    {
      if ((paramList != null) && (paramList.size() > 0))
      {
        this.g = new a(paramList);
        this.g.a(new a.a()
        {
          public boolean a(X11FileInfo paramAnonymousX11FileInfo)
          {
            int i = WifiDistanceFile.getFileType(paramAnonymousX11FileInfo.getName());
            DroneOnlineFragment.e(DroneOnlineFragment.this);
            if (i == 1)
            {
              String str = com.fimi.soul.biz.camera.b.a(paramAnonymousX11FileInfo);
              if (!com.fimi.soul.biz.camera.b.b(str)) {
                break label103;
              }
              str = String.format("file://%s", new Object[] { j.a(str) });
              DroneOnlineFragment.a(DroneOnlineFragment.this, paramAnonymousX11FileInfo, str);
              DroneOnlineFragment.f(DroneOnlineFragment.this).b();
            }
            for (;;)
            {
              if (i == 2)
              {
                DroneOnlineFragment.a(DroneOnlineFragment.this, true);
                DroneOnlineFragment.this.m().s().g(paramAnonymousX11FileInfo.getAbsolutePath());
              }
              return true;
              label103:
              DroneOnlineFragment.this.m().s().a(paramAnonymousX11FileInfo.getName(), paramAnonymousX11FileInfo.getAbsolutePath(), paramAnonymousX11FileInfo.getCreateDate(), d.a.a);
            }
          }
        });
        this.g.b();
        d(false);
        g(false);
        return;
      }
      d(true);
      return;
    }
    d(true);
    m().a(true);
  }
  
  private void p()
  {
    l().setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        DroneOnlineFragment.a(DroneOnlineFragment.this);
      }
    });
    k().setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        DroneOnlineFragment.a(DroneOnlineFragment.this, DroneOnlineFragment.this.b().c());
        new f.a(DroneOnlineFragment.this.getActivity()).a(String.format(DroneOnlineFragment.this.getString(2131362177), new Object[] { DroneOnlineFragment.b(DroneOnlineFragment.this).size() + "" })).a(DroneOnlineFragment.this.getActivity().getResources().getColor(2131624046)).b(DroneOnlineFragment.this.getString(2131362121), new DialogInterface.OnClickListener()
        {
          public void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            DroneOnlineFragment.a(DroneOnlineFragment.this, 0);
            DroneOnlineFragment.a(DroneOnlineFragment.this, false);
            if (DroneOnlineFragment.b(DroneOnlineFragment.this).size() == 0) {
              return;
            }
            DroneOnlineFragment.c(DroneOnlineFragment.this).clear();
            paramAnonymous2Int = 0;
            while (paramAnonymous2Int < DroneOnlineFragment.b(DroneOnlineFragment.this).size())
            {
              paramAnonymous2DialogInterface = DroneOnlineFragment.this.m().k().getCurDirFileList().iterator();
              while (paramAnonymous2DialogInterface.hasNext())
              {
                X11FileInfo localX11FileInfo = (X11FileInfo)paramAnonymous2DialogInterface.next();
                if (((WifiDistanceFile)DroneOnlineFragment.b(DroneOnlineFragment.this).get(paramAnonymous2Int)).getName().equals(localX11FileInfo.getName())) {
                  DroneOnlineFragment.c(DroneOnlineFragment.this).add(localX11FileInfo);
                }
              }
              paramAnonymous2Int += 1;
            }
            DroneOnlineFragment.this.m().s().c(((WifiDistanceFile)DroneOnlineFragment.b(DroneOnlineFragment.this).get(DroneOnlineFragment.d(DroneOnlineFragment.this))).getAbsolutePath());
            DroneOnlineFragment.this.h(false);
            DroneOnlineFragment.this.g(true);
          }
        }).a(DroneOnlineFragment.this.getString(2131362051), new DialogInterface.OnClickListener()
        {
          public void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int) {}
        }).a().show();
      }
    });
  }
  
  private void q()
  {
    List localList = b().c();
    com.fimi.kernel.b.b.c localc = com.fimi.kernel.b.b.c.a(getActivity());
    localc.a(this);
    localc.a(this);
    if ((localList != null) && (localList.size() > 0))
    {
      h(false);
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        WifiDistanceFile localWifiDistanceFile = (WifiDistanceFile)localIterator.next();
        String str2 = com.fimi.soul.biz.camera.b.a(localWifiDistanceFile.getName(), localWifiDistanceFile.getDateString());
        String str1 = "";
        if (localWifiDistanceFile.getType() == 2) {
          str1 = localWifiDistanceFile.getDurationString();
        }
        localc.a(localWifiDistanceFile.getRemoteUrl(), str1, localWifiDistanceFile.getSize(), Boolean.valueOf(false), j.b(str2));
      }
    }
    z.a(getActivity(), getActivity().getString(2131362454, new Object[] { Integer.valueOf(localList.size()) }), 1000);
  }
  
  public void a(Intent paramIntent)
  {
    if (paramIntent != null)
    {
      paramIntent = (WifiDistanceFile)paramIntent.getSerializableExtra("wifiDistanceFile");
      if ((paramIntent != null) && (b() != null))
      {
        b().c(paramIntent);
        if (b().getCount() == 0) {
          d(true);
        }
      }
      if (this.e > 0) {
        this.e -= 1;
      }
      a(paramIntent);
    }
  }
  
  void a(GridView paramGridView)
  {
    if (b().d().size() != this.e) {}
    while ((this.g == null) || (!this.g.d())) {
      return;
    }
    this.g.b();
    b().notifyDataSetChanged();
  }
  
  public void a(com.fimi.kernel.b.b.b paramb, int paramInt) {}
  
  public void a(String paramString1, String paramString2)
  {
    if (this.o) {}
    for (;;)
    {
      return;
      try
      {
        if (com.fimi.soul.biz.camera.b.f(paramString2) == b.a.a)
        {
          List localList = m().k().getCurDirFileList();
          if (this.e - 1 < localList.size())
          {
            a((X11FileInfo)localList.get(this.e - 1), String.format("file://%s%s", new Object[] { paramString1, paramString2 }));
            boolean bool = this.g.b();
            if (bool) {}
          }
        }
      }
      catch (Exception paramString1)
      {
        Log.d("Good", paramString1 + "");
      }
    }
  }
  
  public void a(List<com.fimi.kernel.b.b.b> paramList, boolean paramBoolean, com.fimi.kernel.b.b.b paramb) {}
  
  public void a(boolean paramBoolean, X11RespCmd paramX11RespCmd)
  {
    if (("".equalsIgnoreCase(paramX11RespCmd.getErrorMsg())) || (getActivity() != null)) {
      if (paramX11RespCmd.getNotificationType() == X11RespCmd.NotificationType.CardRemoved)
      {
        d(true);
        z.a(getActivity(), getActivity().getString(2131362843));
      }
    }
    label172:
    do
    {
      do
      {
        return;
        if (paramX11RespCmd.getNotificationType() == X11RespCmd.NotificationType.FmLsEnd)
        {
          if (!paramBoolean) {
            break label172;
          }
          b(m().k().getCurDirFileList());
        }
        for (;;)
        {
          switch (paramX11RespCmd.getMsg_id())
          {
          case 8947848: 
          default: 
            return;
          case 257: 
            m().s().d();
            return;
            d(true);
            g(false);
          }
        }
        m().s().f();
        return;
        m().s().e();
        return;
        g(false);
        this.e = 0;
        b(m().k().getCurDirFileList());
        return;
        if (!paramBoolean)
        {
          g(false);
          z.a(getActivity(), getString(2131362119), 2000);
          return;
        }
        m().a(true);
        b().b((WifiDistanceFile)this.h.get(this.f));
        if (this.e > 0) {
          this.e -= 1;
        }
        m().k().getCurDirFileList().remove(this.i.get(this.f));
        if (((WifiDistanceFile)this.h.get(this.f)).getLocalThumbnailPath() != null)
        {
          localObject = new File(((WifiDistanceFile)this.h.get(this.f)).getLocalThumbnailPath().replace("file://", ""));
          if (((File)localObject).exists()) {
            ((File)localObject).delete();
          }
        }
        this.f += 1;
        if (this.f >= this.h.size()) {
          break;
        }
        localObject = (WifiDistanceFile)this.h.get(this.f);
        m().s().c(((WifiDistanceFile)localObject).getAbsolutePath());
      } while ((!this.m) || (this.o));
      localObject = m().k().getCurDirFileList();
    } while ((this.e - 1 < 0) || (this.e - 1 >= ((List)localObject).size()));
    Object localObject = (X11FileInfo)((List)localObject).get(this.e - 1);
    WifiDistanceFile localWifiDistanceFile = new WifiDistanceFile(((X11FileInfo)localObject).getName());
    if (paramBoolean) {}
    for (;;)
    {
      try
      {
        paramX11RespCmd = FermiPlayerUtils.getTimelineString(Long.parseLong(paramX11RespCmd.getDuration()) * 1000L, "mm:ss");
        localWifiDistanceFile.setDurationString(paramX11RespCmd);
      }
      catch (Exception paramX11RespCmd)
      {
        int i1;
        continue;
      }
      localWifiDistanceFile.setDateString(((X11FileInfo)localObject).getCreateDate());
      localWifiDistanceFile.setRemoteUrl(com.fimi.soul.biz.camera.b.a(((X11FileInfo)localObject).getRemotePath()));
      localWifiDistanceFile.setSize(((X11FileInfo)localObject).getSize());
      localWifiDistanceFile.setRealPath(((X11FileInfo)localObject).getRemotePath());
      localWifiDistanceFile.setAbsolutePath(((X11FileInfo)localObject).getAbsolutePath());
      i1 = ((X11FileInfo)localObject).getRemotePath().indexOf(".");
      if ((i1 > 0) && (localWifiDistanceFile.getType() == 2)) {
        localWifiDistanceFile.setRemoteThmUrl(com.fimi.soul.biz.camera.b.a(((X11FileInfo)localObject).getRemotePath().substring(0, i1) + "_THM.MP4"));
      }
      b().a(localWifiDistanceFile);
      this.g.b();
      b().notifyDataSetChanged();
      return;
      g(false);
      z.a(getActivity(), getString(2131362120), z.b);
      a(this.h);
      m().r().c(e.cy);
      if ((b().getCount() < 12) && (this.g != null) && (this.g.d()) && (!this.g.b()) && (b().getCount() == 0)) {
        d(true);
      }
      b().notifyDataSetChanged();
      break;
      paramX11RespCmd = "00:00";
    }
    paramX11RespCmd = m().k().getCurDownloadFile();
    m().s().a(paramX11RespCmd.getName(), paramX11RespCmd.getAbsolutePath(), paramX11RespCmd.getCreateDate(), d.a.a);
  }
  
  public void o()
  {
    h(false);
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    m().c(new com.fimi.kernel.b.c.d()
    {
      public void a(String paramAnonymousString) {}
    });
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    p();
    return paramLayoutInflater;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
  
  public void onPause()
  {
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    this.o = false;
    if ((!this.l) && (m().d()) && (b().getCount() > 0) && (b().getCount() < 12) && (m().k().getCurDirFileList().size() > b().getCount()))
    {
      b().h();
      this.e = 0;
      b(m().k().getCurDirFileList());
    }
    b().notifyDataSetChanged();
  }
  
  public void onStart()
  {
    super.onStart();
    e(true);
    f(false);
  }
  
  public void onStop()
  {
    super.onStop();
    this.l = false;
    this.o = true;
  }
  
  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    d(false);
    if (!m().h())
    {
      z.a(getActivity(), 2131362842, 3000);
      d(true);
      return;
    }
    if ((m().d()) && (b().getCount() <= 0))
    {
      this.l = true;
      g(true);
      d(false);
      if ((!m().c()) && (m().k().getCurDirFileList().size() > 0)) {
        b(m().k().getCurDirFileList());
      }
    }
    for (;;)
    {
      this.j = m().i().getX11DeviceInfo();
      return;
      if ((!this.n) && (m().c()))
      {
        this.d.sendEmptyMessageDelayed(153, 300L);
        m().r().c(e.cz);
        this.n = true;
      }
      else
      {
        g(false);
        d(true);
        continue;
        if (!m().d())
        {
          this.l = true;
          d(true);
        }
        else
        {
          this.l = false;
        }
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/flyplannermedia/DroneOnlineFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */