package com.fimi.soul.module.update.a;

import com.fimi.kernel.utils.u;
import com.fimi.soul.biz.e.d;
import com.fimi.soul.biz.update.g;
import com.fimi.soul.biz.update.l;
import com.fimi.soul.biz.update.m;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.utils.j;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class a
{
  private static a c = new a();
  c a = new f();
  private Map<Integer, e> b = new HashMap();
  
  public static a a()
  {
    try
    {
      if (c == null) {
        c = new a();
      }
      a locala = c;
      return locala;
    }
    finally {}
  }
  
  public e a(int paramInt)
  {
    if (this.b.containsKey(Integer.valueOf(paramInt))) {
      return (e)this.b.get(Integer.valueOf(paramInt));
    }
    return new e();
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.a.a(paramInt1, paramInt2);
  }
  
  public void a(e parame)
  {
    if (parame == null) {
      return;
    }
    this.b.put(Integer.valueOf(parame.d()), parame);
  }
  
  public void a(List<UpdateVersonBean> paramList1, List<UpdateVersonBean> paramList2)
  {
    int j = 0;
    int i;
    if (j < paramList1.size())
    {
      if (j == 0) {
        paramList2.add(paramList1.get(j));
      }
      i = 0;
      label36:
      if (i >= paramList2.size()) {
        break label171;
      }
      UpdateVersonBean localUpdateVersonBean1 = (UpdateVersonBean)paramList1.get(j);
      UpdateVersonBean localUpdateVersonBean2 = (UpdateVersonBean)paramList2.get(i);
      if (localUpdateVersonBean1.getSysname().equals(localUpdateVersonBean2.getSysname()))
      {
        if (Integer.valueOf(localUpdateVersonBean1.getNewVersion()).intValue() <= Integer.valueOf(localUpdateVersonBean2.getNewVersion()).intValue()) {
          break label166;
        }
        paramList2.set(i, paramList1.get(j));
        i = 1;
      }
    }
    for (;;)
    {
      if (i == 0) {
        paramList2.add(paramList1.get(j));
      }
      j += 1;
      break;
      i += 1;
      break label36;
      return;
      label166:
      i = 1;
      continue;
      label171:
      i = 0;
    }
  }
  
  public Map<Integer, e> b()
  {
    return this.b;
  }
  
  public void b(int paramInt)
  {
    this.a.a((e)this.b.get(Integer.valueOf(paramInt)));
    this.a.d(paramInt);
  }
  
  public void c()
  {
    com.fimi.kernel.c.c().a("sp_firmware_cache", new b());
    this.b.clear();
  }
  
  public List<FirmwareInfo> d()
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject = com.fimi.kernel.c.c.a().b("sp_down_firmware", UpdateVersonBean.class);
    if ((localObject != null) && (((List)localObject).size() > 0))
    {
      Iterator localIterator = ((List)localObject).iterator();
      label135:
      label478:
      label499:
      label802:
      label804:
      label809:
      label814:
      label817:
      while (localIterator.hasNext())
      {
        UpdateVersonBean localUpdateVersonBean = (UpdateVersonBean)localIterator.next();
        int k = Integer.valueOf(localUpdateVersonBean.getNewVersion()).intValue();
        int m = l.c(localUpdateVersonBean.getSysid());
        int n;
        int i;
        int j;
        if (localUpdateVersonBean.getSysid() == 11)
        {
          localObject = new File(j.p() + l.a(localUpdateVersonBean.getFileEncode()));
          if ((d.a().l()) || ((d.a().i()) && ((localUpdateVersonBean.getSysid() == 6) || (localUpdateVersonBean.getSysid() == 9) || (localUpdateVersonBean.getSysid() == 10) || (localUpdateVersonBean.getSysid() == 0) || (localUpdateVersonBean.getSysid() == 3) || (localUpdateVersonBean.getSysid() == 1) || (localUpdateVersonBean.getSysid() == 11) || (localUpdateVersonBean.getSysid() == 4) || (localUpdateVersonBean.getSysid() == 253) || (localUpdateVersonBean.getSysid() == 5))) || ((d.a().j()) && ((localUpdateVersonBean.getSysid() == 12) || (localUpdateVersonBean.getSysid() == 14) || (localUpdateVersonBean.getSysid() == 15) || (localUpdateVersonBean.getSysid() == 17) || (localUpdateVersonBean.getSysid() == 16) || (localUpdateVersonBean.getSysid() == 20) || (localUpdateVersonBean.getSysid() == 18) || (localUpdateVersonBean.getSysid() == 19) || (localUpdateVersonBean.getSysid() == 13))) || (!localUpdateVersonBean.getFileEncode().equals(u.a((File)localObject)))) {
            break label802;
          }
          localObject = (e)c.b().get(Integer.valueOf(m));
          if (localObject == null) {
            continue;
          }
          n = ((e)localObject).b();
          if ((n < 1335) && (n != 1) && (localUpdateVersonBean.getSysid() == 5)) {
            continue;
          }
          if (localUpdateVersonBean.getSysid() == 11)
          {
            localObject = (e)c.b().get(Integer.valueOf(1));
            if ((localObject != null) && (((e)localObject).b() < 1707)) {
              continue;
            }
          }
          if ((k <= n) || (n <= 0)) {
            break label804;
          }
          i = 1;
          if ((!"1".equals(localUpdateVersonBean.getForceSign())) || (k == n)) {
            break label809;
          }
          j = 1;
          if ((!"2".equals(localUpdateVersonBean.getForceSign())) || (k <= n)) {
            break label814;
          }
        }
        for (k = 1;; k = 0)
        {
          if ((i == 0) && (j == 0) && (k == 0)) {
            break label817;
          }
          i = l.b(m);
          j = ((Integer)l.a().get(Integer.valueOf(m))).intValue();
          localObject = new FirmwareInfo(m, m, localUpdateVersonBean.getSysname(), "", "", localUpdateVersonBean.getNewVersion(), 1, i, localUpdateVersonBean.getSysname());
          ((FirmwareInfo)localObject).setFileEncode(localUpdateVersonBean.getFileEncode());
          ((FirmwareInfo)localObject).setUpdcontents(localUpdateVersonBean.getUpdcontents());
          ((FirmwareInfo)localObject).setSource(1);
          ((FirmwareInfo)localObject).setUpdateTime(j);
          ((FirmwareInfo)localObject).setForceSign(localUpdateVersonBean.getForceSign());
          ((FirmwareInfo)localObject).setFileSize(Long.valueOf(localUpdateVersonBean.getSize()).longValue());
          if (n == 1) {
            ((FirmwareInfo)localObject).setVersionError(true);
          }
          localArrayList.add(localObject);
          break;
          if (localUpdateVersonBean.getSysid() == 15)
          {
            localObject = new File(j.p() + l.a(localUpdateVersonBean.getFileEncode(), localUpdateVersonBean.getNewVersion()));
            break label135;
          }
          if (localUpdateVersonBean.getSysid() == 14)
          {
            localObject = new File(j.p() + l.b(localUpdateVersonBean.getFileEncode(), localUpdateVersonBean.getNewVersion()));
            break label135;
          }
          localObject = new File(this.a.c(m));
          break label135;
          break;
          i = 0;
          break label478;
          j = 0;
          break label499;
        }
      }
    }
    Collections.sort(localArrayList, new g());
    return localArrayList;
  }
  
  public List<UpdateVersonBean> e()
  {
    Object localObject = com.fimi.kernel.c.c().b("sp_down_firmware", UpdateVersonBean.class);
    ArrayList localArrayList = new ArrayList();
    b localb = (b)com.fimi.kernel.c.c().a("sp_firmware_cache", b.class);
    if ((localb == null) || (localb.i() == null) || (localb.i().size() == 0)) {
      return localArrayList;
    }
    if ((localObject != null) && (((List)localObject).size() > 0))
    {
      Iterator localIterator = ((List)localObject).iterator();
      label171:
      label450:
      label483:
      label504:
      label691:
      label714:
      label716:
      label721:
      label726:
      label729:
      while (localIterator.hasNext())
      {
        UpdateVersonBean localUpdateVersonBean = (UpdateVersonBean)localIterator.next();
        int m = l.c(localUpdateVersonBean.getSysid());
        int i;
        int k;
        if (localUpdateVersonBean.getSysid() == 11)
        {
          localObject = new File(j.p() + l.a(localUpdateVersonBean.getFileEncode()));
          String str = localUpdateVersonBean.getFileEncode();
          localObject = u.a((File)localObject);
          if ((d.a().l()) || ((d.a().i()) && ((localUpdateVersonBean.getSysid() == 6) || (localUpdateVersonBean.getSysid() == 9) || (localUpdateVersonBean.getSysid() == 10) || (localUpdateVersonBean.getSysid() == 0) || (localUpdateVersonBean.getSysid() == 3) || (localUpdateVersonBean.getSysid() == 1) || (localUpdateVersonBean.getSysid() == 11) || (localUpdateVersonBean.getSysid() == 4) || (localUpdateVersonBean.getSysid() == 253) || (localUpdateVersonBean.getSysid() == 5))) || ((d.a().j()) && ((localUpdateVersonBean.getSysid() == 12) || (localUpdateVersonBean.getSysid() == 14) || (localUpdateVersonBean.getSysid() == 15) || (localUpdateVersonBean.getSysid() == 17) || (localUpdateVersonBean.getSysid() == 16) || (localUpdateVersonBean.getSysid() == 20) || (localUpdateVersonBean.getSysid() == 18) || (localUpdateVersonBean.getSysid() == 19) || (localUpdateVersonBean.getSysid() == 14) || (localUpdateVersonBean.getSysid() == 13))) || (str.equals(localObject))) {
            continue;
          }
          int n = Integer.valueOf(localUpdateVersonBean.getNewVersion()).intValue();
          if (localb.i().get(Integer.valueOf(m)) != null) {
            break label691;
          }
          j = 0;
          if ((j < 1335) && (j != 1) && (localUpdateVersonBean.getSysid() == 5)) {
            break label714;
          }
          if ((n <= j) || (j <= 0)) {
            break label716;
          }
          i = 1;
          if ((!"1".equals(localUpdateVersonBean.getForceSign())) || (n == j)) {
            break label721;
          }
          k = 1;
          if ((!"2".equals(localUpdateVersonBean.getForceSign())) || (n <= j)) {
            break label726;
          }
        }
        for (int j = 1;; j = 0)
        {
          if ((i == 0) && (k == 0) && (j == 0)) {
            break label729;
          }
          localUpdateVersonBean.setSort(l.b(m));
          localArrayList.add(localUpdateVersonBean);
          break;
          if (localUpdateVersonBean.getSysid() == 15)
          {
            localObject = new File(j.p() + l.a(localUpdateVersonBean.getFileEncode(), localUpdateVersonBean.getNewVersion()));
            break label171;
          }
          if (localUpdateVersonBean.getSysid() == 14)
          {
            localObject = new File(j.p() + l.b(localUpdateVersonBean.getFileEncode(), localUpdateVersonBean.getNewVersion()));
            break label171;
          }
          localObject = new File(this.a.c(m));
          break label171;
          j = ((Integer)localb.i().get(Integer.valueOf(m))).intValue();
          break label450;
          break;
          i = 0;
          break label483;
          k = 0;
          break label504;
        }
      }
    }
    if (localArrayList != null) {
      Collections.sort(localArrayList, new m());
    }
    return localArrayList;
  }
  
  public c f()
  {
    return this.a;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/update/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */