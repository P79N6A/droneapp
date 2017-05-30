package com.fimi.soul.biz.camera.c;

import com.fimi.kernel.utils.n;
import com.fimi.soul.biz.camera.e;
import com.fimi.soul.biz.camera.entity.X11DeviceInfo;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.entity.X11SystemConfig;
import com.fimi.soul.biz.camera.entity.X11SystemConfigOption;
import com.google.gson.internal.LinkedTreeMap;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class c
  extends a
{
  int a = 0;
  long b;
  private String c;
  private c d = c.a;
  private a e = a.a;
  private String f;
  private String g;
  
  public c(com.fimi.soul.biz.camera.c paramc)
  {
    super(paramc);
  }
  
  private void a(Map<String, String> paramMap, X11SystemConfig paramX11SystemConfig)
  {
    paramX11SystemConfig.setCameraTimeLock((String)paramMap.get("camera_clock"));
    paramX11SystemConfig.setVideoStandard((String)paramMap.get("video_standard"));
    paramX11SystemConfig.setAppStatus((String)paramMap.get("app_status"));
    paramX11SystemConfig.setStreamOutType((String)paramMap.get("stream_out_type"));
    paramX11SystemConfig.setSaveLowResolution(e((String)paramMap.get("save_low_resolution_clip")));
    paramX11SystemConfig.setVideoResolution((String)paramMap.get("video_resolution"));
    paramX11SystemConfig.setVideoQuality((String)paramMap.get("video_quality"));
    paramX11SystemConfig.setTimelapseVideo(e((String)paramMap.get("timelapse_video")));
    paramX11SystemConfig.setCaptureMode((String)paramMap.get("capture_mode"));
    paramX11SystemConfig.setPhotoSize((String)paramMap.get("photo_size"));
    paramX11SystemConfig.setPhotoStamp((String)paramMap.get("photo_stamp"));
    paramX11SystemConfig.setPhotoQuality((String)paramMap.get("photo_quality"));
    paramX11SystemConfig.setTimelapsePhoto(e((String)paramMap.get("timelapse_photo")));
    paramX11SystemConfig.setVideoStamp((String)paramMap.get("video_stamp"));
    paramX11SystemConfig.setVideoSrt((String)paramMap.get("video_srt"));
    paramX11SystemConfig.setVideoLoopBack((String)paramMap.get("video_loop_back"));
    paramX11SystemConfig.setVideoMode((String)paramMap.get("video_mode"));
    paramX11SystemConfig.setSDState((String)paramMap.get("sd_status"));
    paramX11SystemConfig.setImage_format((String)paramMap.get("photo_format"));
    paramX11SystemConfig.setRavl(Integer.parseInt((String)paramMap.get("ravl")));
    paramX11SystemConfig.setCur_time(Long.parseLong((String)paramMap.get("cur_time")));
  }
  
  private boolean e(String paramString)
  {
    return "on".equals(paramString);
  }
  
  public void a(a parama)
  {
    this.e = parama;
    switch (1.d[parama.ordinal()])
    {
    default: 
      parama = null;
    }
    for (;;)
    {
      a(6, null, parama);
      return;
      parama = "total";
      continue;
      parama = "photo";
      continue;
      parama = "video";
    }
  }
  
  public void a(b paramb)
  {
    Object localObject = null;
    switch (1.a[paramb.ordinal()])
    {
    default: 
      paramb = (b)localObject;
    }
    for (;;)
    {
      a(12, paramb);
      return;
      paramb = "cam_stb";
      continue;
      paramb = "cam_off";
    }
  }
  
  public void a(c paramc)
  {
    this.d = paramc;
    switch (1.c[paramc.ordinal()])
    {
    default: 
      paramc = null;
    }
    for (;;)
    {
      a(15, null, paramc);
      return;
      paramc = "max";
      continue;
      paramc = "current";
      continue;
      paramc = "status";
    }
  }
  
  public void a(d paramd, int paramInt)
  {
    Object localObject = null;
    switch (1.b[paramd.ordinal()])
    {
    default: 
      paramd = (d)localObject;
    }
    for (;;)
    {
      a(14, paramInt + "", paramd);
      return;
      paramd = "jump";
      continue;
      paramd = "fast";
      continue;
      paramd = "normal";
      continue;
      paramd = "slow";
    }
  }
  
  public void a(String paramString)
  {
    a(9, paramString);
  }
  
  public void a(String paramString1, String paramString2)
  {
    this.f = paramString1;
    this.g = paramString2;
    a(2, paramString2, paramString1);
  }
  
  public void a(boolean paramBoolean, X11RespCmd paramX11RespCmd)
  {
    super.a(paramBoolean, paramX11RespCmd);
    Object localObject1;
    if (paramBoolean) {
      localObject1 = a().i();
    }
    switch (paramX11RespCmd.getMsg_id())
    {
    default: 
    case 13: 
    case 11: 
    case 15: 
    case 3: 
    case 9: 
    case 19: 
    case 5: 
    case 6: 
    case 18: 
    case 2: 
      long l;
      do
      {
        for (;;)
        {
          return;
          ((X11SystemConfig)localObject1).setBatteryLevel(Integer.parseInt(paramX11RespCmd.getParam().toString()));
          ((X11SystemConfig)localObject1).setPowerSourceType(paramX11RespCmd.getType());
          return;
          localObject1 = ((X11SystemConfig)localObject1).getX11DeviceInfo();
          ((X11DeviceInfo)localObject1).setBrand(paramX11RespCmd.getBrand());
          ((X11DeviceInfo)localObject1).setApiVersion(paramX11RespCmd.getApi_ver());
          ((X11DeviceInfo)localObject1).setModel(paramX11RespCmd.getModel());
          ((X11DeviceInfo)localObject1).setFirmwareVersion(paramX11RespCmd.getFw_ver());
          ((X11DeviceInfo)localObject1).setAppType(paramX11RespCmd.getApp_type());
          ((X11DeviceInfo)localObject1).setLogo(paramX11RespCmd.getLogo());
          ((X11DeviceInfo)localObject1).setChip(paramX11RespCmd.getChip());
          ((X11DeviceInfo)localObject1).setHttp(paramX11RespCmd.getHttp());
          k();
          return;
          i = Integer.parseInt(paramX11RespCmd.getParam().toString());
          switch (1.c[this.d.ordinal()])
          {
          default: 
            return;
          case 1: 
            ((X11SystemConfig)localObject1).setMaxZoomInfo(i);
            return;
          }
          ((X11SystemConfig)localObject1).setCurrentZoomInfo(i);
          return;
          if (paramX11RespCmd.getParam() != null) {}
          Object localObject2;
          Object localObject3;
          try
          {
            localObject2 = (List)paramX11RespCmd.getParam();
            paramX11RespCmd = new HashMap();
            localObject2 = ((List)localObject2).iterator();
            while (((Iterator)localObject2).hasNext())
            {
              localObject3 = (LinkedTreeMap)((Iterator)localObject2).next();
              Iterator localIterator = ((LinkedTreeMap)localObject3).keySet().iterator();
              while (localIterator.hasNext())
              {
                String str = (String)localIterator.next();
                paramX11RespCmd.put(str, ((LinkedTreeMap)localObject3).get(str));
              }
            }
            a(paramX11RespCmd, (X11SystemConfig)localObject1);
            if ("record".contains(((X11SystemConfig)localObject1).getAppStatus())) {
              a().a(com.fimi.soul.biz.camera.c.a.c);
            }
            if ("photo".contains(((X11SystemConfig)localObject1).getAppStatus())) {
              a().a(com.fimi.soul.biz.camera.c.a.d);
            }
            if ("idle".contains(((X11SystemConfig)localObject1).getAppStatus())) {
              a().a(com.fimi.soul.biz.camera.c.a.a);
            }
            if (!"vf".contains(((X11SystemConfig)localObject1).getAppStatus())) {
              continue;
            }
            a().a(com.fimi.soul.biz.camera.c.a.b);
            return;
          }
          catch (Exception paramX11RespCmd) {}
          if (paramX11RespCmd.getParam() != null)
          {
            localObject2 = paramX11RespCmd.getParam().toString();
            localObject3 = new X11SystemConfigOption();
            ((X11SystemConfigOption)localObject3).setType((String)localObject2);
            ((X11SystemConfigOption)localObject3).setPermission(paramX11RespCmd.getPermission());
            ((X11SystemConfigOption)localObject3).setOptions(paramX11RespCmd.getOptions());
            ((X11SystemConfig)localObject1).getSystemConfigOptions().put(localObject2, localObject3);
            return;
            paramX11RespCmd = paramX11RespCmd.getParam().toString().split(",");
            i = Integer.parseInt(paramX11RespCmd[0]);
            int j = Integer.parseInt(paramX11RespCmd[1]);
            ((X11SystemConfig)localObject1).setRemainVideoRecordMinutes(i);
            ((X11SystemConfig)localObject1).setRemainPhotoTakeNumbers(j);
            return;
            try
            {
              l = Long.parseLong(paramX11RespCmd.getParam().toString());
              if (e.cy.equals(this.c)) {
                ((X11SystemConfig)localObject1).setFreeKBSpace(l);
              }
              if (e.cz.equals(this.c))
              {
                ((X11SystemConfig)localObject1).setTotalKBSpace(l);
                c(e.cy);
                return;
              }
            }
            catch (Exception paramX11RespCmd)
            {
              return;
            }
          }
        }
        int i = Integer.parseInt(paramX11RespCmd.getParam().toString());
        switch (1.d[this.e.ordinal()])
        {
        default: 
          return;
        case 1: 
          ((X11SystemConfig)localObject1).setTotalFileNumbers(i);
          return;
        case 2: 
          ((X11SystemConfig)localObject1).setPhotoFileNumbers(i);
          return;
        }
        ((X11SystemConfig)localObject1).setVideoFileNumbers(i);
        return;
        ((X11SystemConfig)localObject1).setDvVersion(n.n(paramX11RespCmd.getParam().toString()) + "");
        e();
        return;
        if ("capture_mode".equals(this.f)) {
          ((X11SystemConfig)localObject1).setCaptureMode(this.g);
        }
        l = ((X11SystemConfig)localObject1).getCur_time();
      } while (((((X11SystemConfig)localObject1).getRavl() == 0) && (Math.abs(l - this.b) <= 5000L)) || (this.a >= 3));
      m();
      this.a += 1;
      return;
    }
    this.a = 0;
    m();
    return;
  }
  
  public void b()
  {
    a(3);
  }
  
  public void b(int paramInt)
  {
    a(16, paramInt + "");
  }
  
  public void b(String paramString)
  {
    a(4, paramString);
  }
  
  public void c()
  {
    a(4, "D:");
  }
  
  public void c(String paramString)
  {
    this.c = paramString;
    a(5, null, paramString);
  }
  
  public void d()
  {
    a(11);
  }
  
  public void d(String paramString)
  {
    a(261, paramString, "TCP");
  }
  
  public void e()
  {
    a(259, "none_force");
  }
  
  public void f()
  {
    a(260);
  }
  
  public void g()
  {
    a(2, "live", "dv_mode");
  }
  
  public void h()
  {
    a(2, "record", "dv_mode");
  }
  
  public void i() {}
  
  public void j()
  {
    a(17);
  }
  
  public void k()
  {
    a(18);
  }
  
  public void l()
  {
    a(19);
  }
  
  public void m()
  {
    String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    this.b = new Date().getTime();
    a("camera_clock", str);
  }
  
  public static enum a
  {
    private a() {}
  }
  
  public static enum b
  {
    private b() {}
  }
  
  public static enum c
  {
    private c() {}
  }
  
  public static enum d
  {
    private d() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/camera/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */