package com.fimi.soul.biz.camera;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.fimi.kernel.utils.g;
import com.fimi.kernel.utils.u;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.camera.b.f;
import com.fimi.soul.biz.camera.entity.X11ApWifiConfig;
import com.fimi.soul.biz.camera.entity.X11FileInfo;
import com.fimi.soul.biz.camera.entity.X11FileSystem;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.entity.X11RespCmd.NotificationType;
import com.fimi.soul.biz.camera.entity.X11SystemConfig;
import com.fimi.soul.utils.ad;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.j;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class c
  extends a
  implements f
{
  private static final int d = 1024;
  private static final int e = 1025;
  private static final int f = 2048;
  private static final int g = 2049;
  private static final int h = 4096;
  private static int i = -1;
  private static final long x = 1500L;
  private boolean A = true;
  private boolean B = false;
  private boolean C = true;
  private com.fimi.kernel.b.c.d D;
  private long E = 0L;
  private String F = null;
  d a;
  com.fimi.soul.biz.e.d b;
  ExecutorService c = Executors.newSingleThreadExecutor();
  private X11ApWifiConfig j;
  private a k = a.b;
  private X11SystemConfig l;
  private X11FileSystem m;
  private List<com.fimi.soul.biz.camera.b.e<X11RespCmd>> n;
  private com.fimi.soul.biz.camera.b.e<X11RespCmd> o;
  private com.fimi.kernel.b.c.d p;
  private com.fimi.kernel.b.c.a q;
  private DataOutputStream r;
  private com.fimi.soul.biz.camera.b.d s;
  private StringBuilder t = new StringBuilder();
  private c u;
  private d v;
  private com.fimi.kernel.b.b.c w;
  private long y = System.currentTimeMillis();
  private boolean z = false;
  
  public c(com.fimi.soul.biz.camera.b.c paramc)
  {
    a(paramc);
    this.l = new X11SystemConfig();
    this.j = new X11ApWifiConfig();
    this.m = new X11FileSystem();
    new com.fimi.soul.biz.e.b();
    this.b = com.fimi.soul.biz.e.d.a();
    this.n = new ArrayList();
    if (this.p == null)
    {
      this.p = new com.fimi.kernel.b.c.d()
      {
        public void a(String paramAnonymousString)
        {
          c.a(c.this, paramAnonymousString);
        }
      };
      b(this.p);
      a(new Runnable()
      {
        public void run()
        {
          int m = 0;
          int k = 0;
          int n = m;
          int i1 = k;
          for (;;)
          {
            try
            {
              Thread.sleep(1500L);
              n = m;
              i1 = k;
              if (!c.a(c.this)) {
                break;
              }
              n = m;
              i1 = k;
              if (!c.this.b.n()) {
                break label168;
              }
              n = m;
              i1 = k;
              c.a(c.this, c.this.b.m());
              n = m;
              i1 = k;
              if (!c.b(c.this)) {
                break label421;
              }
              j = k + 1;
              i = 0;
              if (i <= 1) {
                break label216;
              }
              m = i;
              k = j;
              n = i;
              i1 = j;
              if (!c.this.d()) {
                break;
              }
              n = i;
              i1 = j;
              c.this.a(-1);
              m = i;
              k = j;
            }
            catch (InterruptedException localInterruptedException)
            {
              localInterruptedException.printStackTrace();
              m = n;
              k = i1;
            }
            break;
            label168:
            n = m;
            i1 = k;
            c.a(c.this, ao.d(e.a));
            n = m;
            i1 = k;
            c.this.b.a(c.b(c.this));
            continue;
            label216:
            n = i;
            i1 = j;
            if ((!c.this.d()) && (j > 1))
            {
              n = i;
              i1 = j;
              if (System.currentTimeMillis() - c.c(c.this) > 7500L)
              {
                n = i;
                i1 = j;
                c.a(c.this, System.currentTimeMillis());
                n = i;
                i1 = j;
                c.this.p();
              }
              n = i;
              i1 = j;
              c.d(c.this).sendEmptyMessageDelayed(2048, 500L);
              m = i;
              k = j;
              break;
            }
            m = i;
            k = j;
            n = i;
            i1 = j;
            if (!c.this.d()) {
              break;
            }
            m = i;
            k = j;
            n = i;
            i1 = j;
            if (!"".equalsIgnoreCase(c.this.i().getDvVersion())) {
              break;
            }
            n = i;
            i1 = j;
            c.this.a = ((d)b.a().d());
            n = i;
            i1 = j;
            c.this.a.r().k();
            m = i;
            k = j;
            break;
            label421:
            int i = m + 1;
            int j = 0;
          }
        }
      });
    }
    if (this.q == null)
    {
      this.q = new com.fimi.kernel.b.c.a()
      {
        public void a(int paramAnonymousInt, byte[] paramAnonymousArrayOfByte)
        {
          c.a(c.this, paramAnonymousInt, paramAnonymousArrayOfByte);
        }
      };
      a(this.q);
    }
  }
  
  private List<X11FileInfo> a(Map<String, String> paramMap)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      X11FileInfo localX11FileInfo = new X11FileInfo();
      localX11FileInfo.setName((String)localObject);
      if (!((String)localObject).toUpperCase().contains("THM"))
      {
        localX11FileInfo.setLocalPath(j.a() + "X1/");
        String str = k().getCurPath();
        localX11FileInfo.setAbsolutePath(str + "/" + (String)localObject);
        localX11FileInfo.setRemotePath(str.substring(str.indexOf("DCIM"), str.length()) + "/" + (String)localObject);
        localObject = ((String)paramMap.get(localObject)).split("\\|");
        localX11FileInfo.setSize(Long.parseLong(localObject[0].replace(" bytes", "").trim()));
        localX11FileInfo.setCreateDate(localObject[1]);
        localArrayList.add(localX11FileInfo);
      }
    }
    Collections.sort(localArrayList, new Comparator()
    {
      public int a(X11FileInfo paramAnonymousX11FileInfo1, X11FileInfo paramAnonymousX11FileInfo2)
      {
        return paramAnonymousX11FileInfo1.getCreateDate().replaceAll("[-\\s:]", "").compareTo(paramAnonymousX11FileInfo2.getCreateDate().replaceAll("[-\\s:]", ""));
      }
    });
    return localArrayList;
  }
  
  private void a(int paramInt, byte[] paramArrayOfByte)
  {
    try
    {
      X11FileInfo localX11FileInfo = k().getCurDownloadFile();
      Log.d("Good", "len:" + paramInt + "  path" + localX11FileInfo.getLocalPath() + " name:" + localX11FileInfo.getName() + "downloading:" + paramInt);
      if (localX11FileInfo != null) {}
      try
      {
        String str = localX11FileInfo.getLocalPath() + localX11FileInfo.getName();
        if (paramInt != -1)
        {
          if (this.r == null)
          {
            this.E = 0L;
            File localFile = new File(localX11FileInfo.getLocalPath());
            if (!localFile.exists()) {
              localFile.mkdirs();
            }
            localFile = new File(str);
            if (localFile.exists()) {
              ao.a(localFile);
            }
            localFile.createNewFile();
            this.r = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(str)));
          }
          this.E += paramInt;
          this.r.write(paramArrayOfByte, 0, paramInt);
          if (this.u != null) {
            this.u.a(localX11FileInfo.getName(), this.E, localX11FileInfo.getSize());
          }
          a(localX11FileInfo);
          this.F = str;
        }
      }
      catch (Exception paramArrayOfByte)
      {
        for (;;)
        {
          Log.d("Good", "ERROR" + paramArrayOfByte);
        }
      }
      return;
    }
    finally {}
  }
  
  private void a(X11RespCmd paramX11RespCmd)
  {
    boolean bool;
    label41:
    Object localObject;
    if (paramX11RespCmd != null)
    {
      this.t.delete(0, this.t.length());
      if (paramX11RespCmd.getRval() >= 0)
      {
        bool = true;
        if (!paramX11RespCmd.isNotification()) {
          break label208;
        }
        b(paramX11RespCmd);
        if (paramX11RespCmd.getNotificationType() != X11RespCmd.NotificationType.PhotoTaken) {
          break label246;
        }
        a(true);
        if (com.fimi.kernel.c.e().b().booleanValue())
        {
          localObject = paramX11RespCmd.getParam().toString();
          if (!"".equalsIgnoreCase((String)localObject))
          {
            this.w = com.fimi.kernel.b.b.c.a(com.fimi.kernel.c.a());
            String str = j.b(((String)localObject).substring(((String)localObject).lastIndexOf("/") + 1, ((String)localObject).length()));
            this.w.a(String.format("http://%s//%s", new Object[] { e.a, ((String)localObject).substring(((String)localObject).indexOf("DCIM"), ((String)localObject).length()) }), "", 0L, Boolean.valueOf(true), str);
          }
        }
        label169:
        if ((this.o != null) && (paramX11RespCmd.getNotificationType() != X11RespCmd.NotificationType.FmLsEnd)) {
          this.o.a(bool, paramX11RespCmd);
        }
      }
    }
    label208:
    label246:
    do
    {
      return;
      c(paramX11RespCmd);
      bool = false;
      break;
      localObject = this.n.iterator();
      while (((Iterator)localObject).hasNext()) {
        ((com.fimi.soul.biz.camera.b.e)((Iterator)localObject).next()).a(bool, paramX11RespCmd);
      }
      break label41;
      if (paramX11RespCmd.getNotificationType() == X11RespCmd.NotificationType.CardInsert)
      {
        g.b(new File(j.n()));
        b(true);
        break label169;
      }
      if (paramX11RespCmd.getNotificationType() == X11RespCmd.NotificationType.CardRemoved)
      {
        g.b(new File(j.n()));
        b(false);
        break label169;
      }
      if (paramX11RespCmd.getNotificationType() == X11RespCmd.NotificationType.FmLsEnd)
      {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.FmLsEnd);
        a(Boolean.valueOf(bool), paramX11RespCmd);
        a(false);
        break label169;
      }
      if ((paramX11RespCmd.getMsg_id() == 4) && (bool))
      {
        if (k().getInfos() == null) {
          break label169;
        }
        k().getInfos().clear();
        break label169;
      }
      if (paramX11RespCmd.getNotificationType() == X11RespCmd.NotificationType.StartingVideoRecord)
      {
        if (this.w == null) {
          this.w = com.fimi.kernel.b.b.c.a(com.fimi.kernel.c.a());
        }
        this.w.d();
        break label169;
      }
      if (paramX11RespCmd.getNotificationType() != X11RespCmd.NotificationType.VideoRecordComplete) {
        break label169;
      }
      if (this.w == null) {
        this.w = com.fimi.kernel.b.b.c.a(com.fimi.kernel.c.a());
      }
      this.w.e();
      break label169;
      paramX11RespCmd = new X11RespCmd();
      paramX11RespCmd.setMsg_id(8947848);
      Log.d("Good", "UNkown");
    } while (this.o == null);
    this.o.a(false, paramX11RespCmd);
  }
  
  private void a(final Boolean paramBoolean, final X11RespCmd paramX11RespCmd)
  {
    ((com.fimi.kernel.b.e.b)com.fimi.kernel.c.a(com.fimi.kernel.b.d.b)).b(e.e(), new com.fimi.kernel.b.e()
    {
      public void a(String paramAnonymousString)
      {
        if ((paramAnonymousString != null) && (!"".equals(paramAnonymousString)))
        {
          paramAnonymousString = paramAnonymousString.split("\n");
          localArrayList = new ArrayList();
          i = 0;
          while (i < paramAnonymousString.length)
          {
            localObject = paramAnonymousString[i].split("\\|");
            if (localObject.length > 3)
            {
              localX11FileInfo = new X11FileInfo();
              str2 = localObject[0].trim();
              str3 = localObject[1].trim();
              str1 = localObject[2].trim();
              localObject = localObject[3].trim();
              localX11FileInfo.setSize(Long.parseLong(str2));
              localX11FileInfo.setName(str1);
              str2 = ao.f(str3);
              if (str2 != null) {
                localX11FileInfo.setCreateDate(str2);
              }
              localX11FileInfo.setLocalPath(j.a() + "X1/");
              localX11FileInfo.setAbsolutePath(e.cw + (String)localObject + str1);
              localX11FileInfo.setRemotePath((String)localObject + str1);
              localArrayList.add(localX11FileInfo);
            }
            i += 1;
          }
          if ((localArrayList != null) && (localArrayList.size() > 0)) {
            c.this.k().setInfos(localArrayList);
          }
          if (c.f(c.this) != null) {
            c.f(c.this).a(paramBoolean.booleanValue(), paramX11RespCmd);
          }
        }
        while (c.f(c.this) == null)
        {
          ArrayList localArrayList;
          int i;
          Object localObject;
          X11FileInfo localX11FileInfo;
          String str2;
          String str3;
          String str1;
          return;
        }
        c.f(c.this).a(false, paramX11RespCmd);
      }
      
      public void b(String paramAnonymousString)
      {
        if (c.f(c.this) != null) {
          c.f(c.this).a(false, paramX11RespCmd);
        }
      }
    });
  }
  
  private void a(String paramString)
  {
    if (paramString.contains("\"msg_id\":1282"))
    {
      new b().executeOnExecutor(this.c, new String[] { paramString });
      return;
    }
    X11RespCmd localX11RespCmd2 = b(paramString);
    X11RespCmd localX11RespCmd1 = localX11RespCmd2;
    if (localX11RespCmd2 == null)
    {
      this.t.append(paramString);
      localX11RespCmd1 = b(this.t.toString());
    }
    a(localX11RespCmd1);
  }
  
  private X11RespCmd b(String paramString)
  {
    try
    {
      X11RespCmd localX11RespCmd1 = (X11RespCmd)ad.a(paramString, new TypeToken() {}.getType());
      return localX11RespCmd1;
    }
    catch (Exception localException1)
    {
      localException1.printStackTrace();
      try
      {
        X11RespCmd localX11RespCmd2 = (X11RespCmd)ad.a(paramString, new TypeToken() {}.getType());
        return localX11RespCmd2;
      }
      catch (Exception localException2)
      {
        localException2.printStackTrace();
        try
        {
          paramString = (X11RespCmd)ad.a(paramString, new TypeToken() {}.getType());
          return paramString;
        }
        catch (Exception paramString)
        {
          paramString.printStackTrace();
        }
      }
    }
    return null;
  }
  
  private void b(X11RespCmd paramX11RespCmd)
  {
    Log.d("Good", "Notification:" + paramX11RespCmd.getType());
    if (paramX11RespCmd.getMsg_id() == 7)
    {
      if ("disconnet_HDMI".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.DisconnectHDMI);
      }
      if ("disconnet_shutdown".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.DisconnectShutDown);
      }
      if ("start_video_record".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.StartingVideoRecord);
      }
      if ("video_record_complete".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.VideoRecordComplete);
      }
      if ("photo_taken".equals(paramX11RespCmd.getType()))
      {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.PhotoTaken);
        q();
      }
      if ("continue_capture_start".equals(paramX11RespCmd.getType()))
      {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.ContinueCaputureStarted);
        this.k = a.d;
      }
      if ("continue_capture_stop".equals(paramX11RespCmd.getType()))
      {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.ContinueCaptureStoped);
        q();
      }
      if ("continue_burst_start".equals(paramX11RespCmd.getType()))
      {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.ContinueCaputureStarted);
        q();
      }
      if ("continue_burst_complete".equals(paramX11RespCmd.getType()))
      {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.ContiuneBurstCompleted);
        q();
      }
      if ("low_batter_warning".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.LowBatteryWarning);
      }
      if ("low_storage_warning".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.LowStorageWarning);
      }
      if ("timelapse_video_status".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.TimeLapseVideoStatus);
      }
      if ("timelapse_photo_status".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.TimeLapsePhotoStatus);
      }
      if ("camera_connect_to_pc".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.CameraConnectToPc);
      }
      if ("log_updated".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.LogUpdated);
      }
      if ("power_mode_change".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.PowerModeChange);
      }
      if ("vf_start".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.VFStarted);
      }
      if ("vf_stop".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.VFStoped);
      }
      if ("auto_file_delete".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.AutoFileDelete);
      }
      if ("STORAGE_RUNOUT".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.StorageRunOut);
      }
      if ("STORAGE_IO_ERROR".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.StorageIOError);
      }
      if ("LOW_SPEED_CARD".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.LowSpeedCard);
      }
      if ("MUXER_INDEX_LIMIT".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.MuxerIndexLimit);
      }
      if ("MUXER_FILE_SIZE_LIMIT".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.MuxerFileSizeLimit);
      }
      if ("CARD_REMOVED".equals(paramX11RespCmd.getType()))
      {
        com.fimi.kernel.c.e().c(true);
        com.fimi.kernel.c.e().d(true);
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.CardRemoved);
      }
      if ("CARD_INSERT".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.CardInsert);
      }
      if ("TAKE_PHOTO_FINISH".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.PhotoFinish);
      }
      if ("NOTIFY_CANNOT_ISSUE_PIV".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.CannotIssuePIV);
      }
      if ("put_file_complete".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.PutFileComplete);
      }
      if ("FM_LS_END".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.FmLsEnd);
      }
      if ("CARD_FILE_SYS_ERROR".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.CARD_FILE_SYS_ERROR);
      }
      if ("CARD_PARAM_ERR".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.CARD_PARAM_ERR);
      }
      if ("CARD_NO_PROPOSE".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.CARD_NO_PROPOSE);
      }
      if ("CARD_NO_PROPOSE_AND_PARAM_ERR".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.CARD_NO_PROPOSE_AND_PARAM_ERR);
      }
      if ("CARD_WRITE_LOW".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.CARD_WRITE_LOW);
      }
      if ("CARD_WRITE_LOW_AND_PARAM_ERR".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.CARD_WRITE_LOW_AND_PARAM_ERR);
      }
      if ("CARD_SETROOT_ERROR".equals(paramX11RespCmd.getType())) {
        paramX11RespCmd.setNotificationType(X11RespCmd.NotificationType.CARD_SETROOT_ERROR);
      }
    }
  }
  
  private void c(X11RespCmd paramX11RespCmd)
  {
    switch (paramX11RespCmd.getRval())
    {
    }
    do
    {
      return;
      i = -1;
      return;
      i().setFreeKBSpace(0L);
      return;
    } while (paramX11RespCmd.getMsg_id() != 5);
    i().setFreeKBSpace(0L);
  }
  
  private void q()
  {
    this.k = a.b;
  }
  
  public void a(int paramInt)
  {
    i = paramInt;
  }
  
  protected void a(Message paramMessage)
  {
    if (paramMessage.what == 1024)
    {
      paramMessage = (X11FileInfo)paramMessage.obj;
      if (this.s != null) {
        this.s.a(paramMessage.getLocalPath(), paramMessage.getName());
      }
    }
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
              return;
              if (paramMessage.what != 1025) {
                break;
              }
              paramMessage = new X11RespCmd();
              paramMessage.setMsg_id(10066328);
              Log.d("Good", "下载失败");
            } while (this.o == null);
            this.o.a(false, paramMessage);
            return;
            if (paramMessage.what != 2048) {
              break;
            }
            paramMessage = new X11RespCmd();
            paramMessage.setMsg_id(10066329);
            Log.d("Good", "相机连接超时");
            if ((this.C) && (this.m.getCurDirFileList() != null)) {
              this.m.getCurDirFileList().clear();
            }
          } while (this.o == null);
          this.o.a(false, paramMessage);
          return;
          if (paramMessage.what != 4096) {
            break;
          }
          paramMessage = new X11RespCmd();
          paramMessage.setMsg_id(25725064);
        } while (this.o == null);
        this.o.a(false, paramMessage);
        return;
      } while (paramMessage.what != 2049);
      paramMessage = new X11RespCmd();
      paramMessage.setMsg_id(7829367);
    } while (this.o == null);
    this.o.a(false, paramMessage);
  }
  
  public void a(com.fimi.kernel.b.c.a parama)
  {
    ((f)b()).a(parama);
  }
  
  @Deprecated
  public void a(com.fimi.kernel.b.c.d paramd)
  {
    ((f)b()).a(paramd);
  }
  
  public void a(com.fimi.soul.biz.camera.b.d paramd)
  {
    this.s = paramd;
  }
  
  public void a(com.fimi.soul.biz.camera.b.e<X11RespCmd> parame)
  {
    this.o = parame;
  }
  
  public void a(a parama)
  {
    this.k = parama;
  }
  
  public void a(c paramc)
  {
    this.u = paramc;
  }
  
  public void a(d paramd)
  {
    this.v = paramd;
  }
  
  protected void a(com.fimi.soul.biz.camera.c.a parama)
  {
    if (parama != null) {
      this.n.add(parama);
    }
  }
  
  public void a(X11ApWifiConfig paramX11ApWifiConfig)
  {
    this.j = paramX11ApWifiConfig;
  }
  
  public void a(X11FileInfo paramX11FileInfo)
  {
    if ((paramX11FileInfo.getSize() != 0L) && (this.E >= paramX11FileInfo.getSize()) && (this.r != null)) {
      Log.d("Good", "下载完毕:" + this.E);
    }
    for (;;)
    {
      try
      {
        this.r.close();
        this.r = null;
        String str2 = paramX11FileInfo.getMd5();
        File localFile = new File(paramX11FileInfo.getLocalPath() + paramX11FileInfo.getName());
        if ((localFile != null) && (localFile.isFile()) && (localFile.exists()))
        {
          str1 = u.a(localFile);
          Message localMessage = new Message();
          if ((str2 != null) && (!str1.equals(str2)))
          {
            localFile.delete();
            localMessage.what = 1025;
            a().sendMessageDelayed(localMessage, 200L);
            this.E = 0L;
            return;
          }
          localMessage.what = 1024;
          localMessage.obj = paramX11FileInfo;
          k().setCurDownloadFile(null);
          continue;
          return;
        }
      }
      catch (IOException paramX11FileInfo)
      {
        paramX11FileInfo.printStackTrace();
      }
      String str1 = "";
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.C = paramBoolean;
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    b().a(paramArrayOfByte);
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    ((f)b()).a(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public void b(com.fimi.kernel.b.c.a parama)
  {
    ((f)b()).b(parama);
  }
  
  @Deprecated
  public void b(com.fimi.kernel.b.c.d paramd)
  {
    ((f)b()).b(paramd);
  }
  
  public void b(boolean paramBoolean)
  {
    this.A = paramBoolean;
  }
  
  public void c(com.fimi.kernel.b.c.d paramd)
  {
    ((f)b()).a(this.D);
    this.D = paramd;
    ((f)b()).b(this.D);
  }
  
  public void c(boolean paramBoolean)
  {
    this.B = paramBoolean;
  }
  
  public boolean c()
  {
    return this.C;
  }
  
  public boolean d()
  {
    return i > 0;
  }
  
  public int e()
  {
    return i;
  }
  
  public a f()
  {
    return this.k;
  }
  
  public boolean g()
  {
    return f() != a.b;
  }
  
  public boolean h()
  {
    return this.A;
  }
  
  public X11SystemConfig i()
  {
    return this.l;
  }
  
  public X11ApWifiConfig j()
  {
    return this.j;
  }
  
  public X11FileSystem k()
  {
    return this.m;
  }
  
  public d l()
  {
    return this.v;
  }
  
  public void m()
  {
    if (b() == null) {}
    while (!(b() instanceof com.fimi.soul.biz.camera.a.b)) {
      return;
    }
    ((com.fimi.soul.biz.camera.a.b)b()).b();
    Log.v("Good", "disConnect");
  }
  
  public boolean n()
  {
    if (b() == null) {}
    while (!(b() instanceof com.fimi.soul.biz.camera.a.b)) {
      return false;
    }
    return ((com.fimi.soul.biz.camera.a.b)b()).c();
  }
  
  public void o()
  {
    x.a(new Runnable()
    {
      public void run()
      {
        if ((c.this.b() instanceof com.fimi.soul.biz.camera.a.b)) {
          ((com.fimi.soul.biz.camera.a.b)c.this.b()).e();
        }
      }
    });
  }
  
  public void p()
  {
    if (b() == null) {}
    while (!(b() instanceof com.fimi.soul.biz.camera.a.b)) {
      return;
    }
    ((com.fimi.soul.biz.camera.a.b)b()).d();
    Log.v("Good", "disConnect");
  }
  
  public static enum a
  {
    private a() {}
  }
  
  class b
    extends AsyncTask<String, Void, X11RespCmd>
  {
    b() {}
    
    protected X11RespCmd a(String... paramVarArgs)
    {
      paramVarArgs = paramVarArgs[0];
      paramVarArgs = c.b(c.this, paramVarArgs);
      Object localObject1;
      if ((paramVarArgs != null) && (paramVarArgs.getMsg_id() == 1282))
      {
        Map localMap = c.e(c.this).getFileList();
        if (paramVarArgs.getListing() != null) {
          try
          {
            Object localObject2 = (List)paramVarArgs.getListing();
            localObject1 = new HashMap();
            localObject2 = ((List)localObject2).iterator();
            while (((Iterator)localObject2).hasNext())
            {
              LinkedTreeMap localLinkedTreeMap = (LinkedTreeMap)((Iterator)localObject2).next();
              Iterator localIterator = localLinkedTreeMap.keySet().iterator();
              while (localIterator.hasNext())
              {
                String str = (String)localIterator.next();
                ((Map)localObject1).put(str, localLinkedTreeMap.get(str));
              }
              continue;
              c.this.a(false);
            }
          }
          catch (Exception localException) {}
        }
      }
      for (;;)
      {
        return paramVarArgs;
        localObject1 = c.a(c.this, (Map)localObject1);
        if (localObject1 != null) {
          localException.put(c.e(c.this).getCurPath(), localObject1);
        }
      }
    }
    
    protected void a(X11RespCmd paramX11RespCmd)
    {
      c.a(c.this, paramX11RespCmd);
    }
  }
  
  public static abstract interface c
  {
    public abstract void a(String paramString, long paramLong1, long paramLong2);
  }
  
  public static abstract interface d
  {
    public abstract void a(c.a parama1, c.a parama2);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/camera/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */