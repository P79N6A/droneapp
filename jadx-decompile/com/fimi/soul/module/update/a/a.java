package com.fimi.soul.module.update.a;

import com.fimi.kernel.c;
import com.fimi.kernel.utils.u;
import com.fimi.soul.biz.e.d;
import com.fimi.soul.biz.update.g;
import com.fimi.soul.biz.update.l;
import com.fimi.soul.biz.update.m;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.module.update.b;
import com.fimi.soul.service.InitAppService;
import com.fimi.soul.utils.j;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a {
    private static a c = new a();
    c a = new f();
    private Map<Integer, e> b = new HashMap();

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (c == null) {
                c = new a();
            }
            aVar = c;
        }
        return aVar;
    }

    public e a(int i) {
        return this.b.containsKey(Integer.valueOf(i)) ? (e) this.b.get(Integer.valueOf(i)) : new e();
    }

    public void a(int i, int i2) {
        this.a.a(i, i2);
    }

    public void a(e eVar) {
        if (eVar != null) {
            this.b.put(Integer.valueOf(eVar.d()), eVar);
        }
    }

    public void a(List<UpdateVersonBean> list, List<UpdateVersonBean> list2) {
        for (int i = 0; i < list.size(); i++) {
            Object obj;
            if (i == 0) {
                list2.add(list.get(i));
            }
            int i2 = 0;
            while (i2 < list2.size()) {
                UpdateVersonBean updateVersonBean = (UpdateVersonBean) list.get(i);
                UpdateVersonBean updateVersonBean2 = (UpdateVersonBean) list2.get(i2);
                if (updateVersonBean.getSysname().equals(updateVersonBean2.getSysname())) {
                    if (Integer.valueOf(updateVersonBean.getNewVersion()).intValue() > Integer.valueOf(updateVersonBean2.getNewVersion()).intValue()) {
                        list2.set(i2, list.get(i));
                        obj = 1;
                    } else {
                        int i3 = 1;
                    }
                    if (obj == null) {
                        list2.add(list.get(i));
                    }
                } else {
                    i2++;
                }
            }
            obj = null;
            if (obj == null) {
                list2.add(list.get(i));
            }
        }
    }

    public Map<Integer, e> b() {
        return this.b;
    }

    public void b(int i) {
        this.a.a((e) this.b.get(Integer.valueOf(i)));
        this.a.d(i);
    }

    public void c() {
        c.c().a(b.w, new b());
        this.b.clear();
    }

    public List<FirmwareInfo> d() {
        List<FirmwareInfo> arrayList = new ArrayList();
        List<UpdateVersonBean> b = com.fimi.kernel.c.c.a().b(InitAppService.a, UpdateVersonBean.class);
        if (b != null && b.size() > 0) {
            for (UpdateVersonBean updateVersonBean : b) {
                int intValue = Integer.valueOf(updateVersonBean.getNewVersion()).intValue();
                int c = l.c(updateVersonBean.getSysid());
                File file = updateVersonBean.getSysid() == 11 ? new File(j.p() + l.a(updateVersonBean.getFileEncode())) : updateVersonBean.getSysid() == 15 ? new File(j.p() + l.a(updateVersonBean.getFileEncode(), updateVersonBean.getNewVersion())) : updateVersonBean.getSysid() == 14 ? new File(j.p() + l.b(updateVersonBean.getFileEncode(), updateVersonBean.getNewVersion())) : new File(this.a.c(c));
                if (!(d.a().l() || (d.a().i() && (updateVersonBean.getSysid() == 6 || updateVersonBean.getSysid() == 9 || updateVersonBean.getSysid() == 10 || updateVersonBean.getSysid() == 0 || updateVersonBean.getSysid() == 3 || updateVersonBean.getSysid() == 1 || updateVersonBean.getSysid() == 11 || updateVersonBean.getSysid() == 4 || updateVersonBean.getSysid() == 253 || updateVersonBean.getSysid() == 5)))) {
                    if (!(d.a().j() && (updateVersonBean.getSysid() == 12 || updateVersonBean.getSysid() == 14 || updateVersonBean.getSysid() == 15 || updateVersonBean.getSysid() == 17 || updateVersonBean.getSysid() == 16 || updateVersonBean.getSysid() == 20 || updateVersonBean.getSysid() == 18 || updateVersonBean.getSysid() == 19 || updateVersonBean.getSysid() == 13)) && updateVersonBean.getFileEncode().equals(u.a(r0))) {
                        e eVar = (e) c.b().get(Integer.valueOf(c));
                        if (eVar != null) {
                            int b2 = eVar.b();
                            if (b2 >= 1335 || b2 == 1 || updateVersonBean.getSysid() != 5) {
                                if (updateVersonBean.getSysid() == 11) {
                                    eVar = (e) c.b().get(Integer.valueOf(1));
                                    if (eVar != null && eVar.b() < 1707) {
                                    }
                                }
                                Object obj = (intValue <= b2 || b2 <= 0) ? null : 1;
                                Object obj2 = (!"1".equals(updateVersonBean.getForceSign()) || intValue == b2) ? null : 1;
                                Object obj3 = (!"2".equals(updateVersonBean.getForceSign()) || intValue <= b2) ? null : 1;
                                if (obj != null || obj2 != null || obj3 != null) {
                                    int b3 = l.b(c);
                                    int intValue2 = ((Integer) l.a().get(Integer.valueOf(c))).intValue();
                                    FirmwareInfo firmwareInfo = new FirmwareInfo(c, c, updateVersonBean.getSysname(), "", "", updateVersonBean.getNewVersion(), 1, b3, updateVersonBean.getSysname());
                                    firmwareInfo.setFileEncode(updateVersonBean.getFileEncode());
                                    firmwareInfo.setUpdcontents(updateVersonBean.getUpdcontents());
                                    firmwareInfo.setSource(1);
                                    firmwareInfo.setUpdateTime(intValue2);
                                    firmwareInfo.setForceSign(updateVersonBean.getForceSign());
                                    firmwareInfo.setFileSize(Long.valueOf(updateVersonBean.getSize()).longValue());
                                    if (b2 == 1) {
                                        firmwareInfo.setVersionError(true);
                                    }
                                    arrayList.add(firmwareInfo);
                                }
                            }
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList, new g());
        return arrayList;
    }

    public List<UpdateVersonBean> e() {
        List<UpdateVersonBean> b = c.c().b(InitAppService.a, UpdateVersonBean.class);
        List<UpdateVersonBean> arrayList = new ArrayList();
        b bVar = (b) c.c().a(b.w, b.class);
        if (bVar == null || bVar.i() == null || bVar.i().size() == 0) {
            return arrayList;
        }
        if (b != null && b.size() > 0) {
            for (UpdateVersonBean updateVersonBean : b) {
                int c = l.c(updateVersonBean.getSysid());
                File file = updateVersonBean.getSysid() == 11 ? new File(j.p() + l.a(updateVersonBean.getFileEncode())) : updateVersonBean.getSysid() == 15 ? new File(j.p() + l.a(updateVersonBean.getFileEncode(), updateVersonBean.getNewVersion())) : updateVersonBean.getSysid() == 14 ? new File(j.p() + l.b(updateVersonBean.getFileEncode(), updateVersonBean.getNewVersion())) : new File(this.a.c(c));
                String fileEncode = updateVersonBean.getFileEncode();
                String a = u.a(file);
                if (!(d.a().l() || (d.a().i() && (updateVersonBean.getSysid() == 6 || updateVersonBean.getSysid() == 9 || updateVersonBean.getSysid() == 10 || updateVersonBean.getSysid() == 0 || updateVersonBean.getSysid() == 3 || updateVersonBean.getSysid() == 1 || updateVersonBean.getSysid() == 11 || updateVersonBean.getSysid() == 4 || updateVersonBean.getSysid() == 253 || updateVersonBean.getSysid() == 5)))) {
                    if (!((d.a().j() && (updateVersonBean.getSysid() == 12 || updateVersonBean.getSysid() == 14 || updateVersonBean.getSysid() == 15 || updateVersonBean.getSysid() == 17 || updateVersonBean.getSysid() == 16 || updateVersonBean.getSysid() == 20 || updateVersonBean.getSysid() == 18 || updateVersonBean.getSysid() == 19 || updateVersonBean.getSysid() == 14 || updateVersonBean.getSysid() == 13)) || fileEncode.equals(a))) {
                        int intValue = Integer.valueOf(updateVersonBean.getNewVersion()).intValue();
                        int intValue2 = bVar.i().get(Integer.valueOf(c)) == null ? 0 : ((Integer) bVar.i().get(Integer.valueOf(c))).intValue();
                        if (intValue2 >= 1335 || intValue2 == 1 || updateVersonBean.getSysid() != 5) {
                            Object obj = (intValue <= intValue2 || intValue2 <= 0) ? null : 1;
                            Object obj2 = (!"1".equals(updateVersonBean.getForceSign()) || intValue == intValue2) ? null : 1;
                            Object obj3 = (!"2".equals(updateVersonBean.getForceSign()) || intValue <= intValue2) ? null : 1;
                            if (obj != null || obj2 != null || obj3 != null) {
                                updateVersonBean.setSort(l.b(c));
                                arrayList.add(updateVersonBean);
                            }
                        }
                    }
                }
            }
        }
        if (arrayList != null) {
            Collections.sort(arrayList, new m());
        }
        return arrayList;
    }

    public c f() {
        return this.a;
    }
}
