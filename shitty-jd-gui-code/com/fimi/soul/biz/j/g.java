package com.fimi.soul.biz.j;

import android.app.Activity;
import com.fimi.kernel.c;
import com.fimi.soul.biz.e.d;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.droneconnection.connection.f.a;
import com.fimi.soul.drone.h.a.e;
import com.fimi.soul.drone.h.ac;
import com.fimi.soul.drone.h.ad;
import com.fimi.soul.drone.h.ao;
import com.fimi.soul.drone.h.q;
import com.fimi.soul.entity.DroneModelType;
import com.fimi.soul.entity.ErrorMode;
import com.fimi.soul.utils.ap;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class g
{
  private static g a;
  private static Map<Integer, f> b = new Hashtable();
  
  public static g a()
  {
    if (a == null) {
      a = new g();
    }
    return a;
  }
  
  public static Map<Integer, f> b()
  {
    return b;
  }
  
  public ErrorMode a(a parama)
  {
    q localq = parama.ad();
    boolean bool3 = parama.ac();
    boolean bool2;
    if (d.a().k()) {
      bool2 = parama.g().m();
    }
    ErrorMode localErrorMode;
    for (boolean bool1 = parama.g().n();; bool1 = parama.K().h())
    {
      localErrorMode = new ErrorMode();
      if (parama.T().a()) {
        break;
      }
      return localErrorMode;
      bool2 = parama.K().g();
    }
    localErrorMode.setIsMiddleFault(bool1);
    if (bool2) {
      if (bool3)
      {
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362767));
        a(bool3, false, 2131362406);
        label121:
        if (bool1)
        {
          if (!bool3) {
            break label186;
          }
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362768));
        }
      }
    }
    for (;;)
    {
      if (parama.U()) {
        break label203;
      }
      return localErrorMode;
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362406));
      break;
      a(new int[] { 2131362406 });
      break label121;
      label186:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362407));
    }
    label203:
    if (((parama.aj().c() == 4) || (parama.aj().a() == 12)) && (!bool3)) {
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362395));
    }
    if (((localq.ak()) || (parama.aj().c() == 5) || (parama.aj().a() == 8)) && (!bool3)) {
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362390));
    }
    if ((parama.aj().c() == 6) && (!bool3)) {
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362391));
    }
    if ((parama.aj().c() == 9) && (!bool3)) {
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362394));
    }
    if (((parama.aj().c() == 17) || (parama.aj().a() == 4)) && (!bool3)) {
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362388));
    }
    if (((localq.aj()) || (parama.aj().c() == 21) || (parama.aj().a() == 14)) && (!bool3)) {
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362393));
    }
    if ((parama.aj().c() == 11) && (!bool3)) {
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362389));
    }
    localErrorMode.setIsCompassFault(localq.I());
    label592:
    label629:
    label664:
    label691:
    label718:
    label745:
    label780:
    label906:
    label954:
    label1040:
    label1109:
    label1136:
    label1386:
    label1408:
    label1435:
    int i;
    if ((localq.f()) && (!parama.aj().g().isLightStream())) {
      if (bool3)
      {
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362733));
        a(true, false, 2131362733);
        if ((!localq.g()) && ((parama.h() == null) || (parama.h().f() != 3))) {
          break label2208;
        }
        if (!bool3) {
          break label2181;
        }
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362764));
        a(true, false, 2131362764);
        if ((parama.h() != null) && (parama.h().f() == 1))
        {
          if (!bool3) {
            break label2229;
          }
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362763));
        }
        if ((localq.h()) || (localq.i()))
        {
          if (!bool3) {
            break label2247;
          }
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362755));
        }
        if (localq.j())
        {
          if (!bool3) {
            break label2265;
          }
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362758));
        }
        if (localq.k())
        {
          if (!bool3) {
            break label2283;
          }
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362759));
        }
        if (localq.l())
        {
          if (!bool3) {
            break label2301;
          }
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362731));
        }
        if (!localq.m()) {
          break label2346;
        }
        if (!bool3) {
          break label2319;
        }
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362724));
        a(true, false, 2131362724);
        if ((localq.n()) && (!bool3)) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362365));
        }
        if (((localq.o()) || (parama.aj().c() == 22) || (parama.aj().a() == 15)) && (!bool3)) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362403));
        }
        if ((!localq.p()) || (!parama.aj().g().isLightStream())) {
          break label2385;
        }
        if (!bool3) {
          break label2367;
        }
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362745));
        a(true, false, 2131362745);
        if ((!localq.q()) || (!parama.aj().g().isLightStream())) {
          break label2418;
        }
        if (!bool3) {
          break label2400;
        }
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362748));
        a(false, false, 2131362748);
        if (((localq.r()) || (parama.aj().c() == 12) || (parama.aj().a() == 6)) && (!bool3)) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362387));
        }
        if ((localq.s()) && (!bool3))
        {
          if (parama.an() != 4) {
            break label2433;
          }
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362409));
        }
        if ((localq.x()) && (!bool3)) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362366));
        }
        if ((parama.aj().c() != 13) && (parama.aj().a() != 1)) {
          break label2469;
        }
        if (bool3) {
          break label2451;
        }
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362392));
        if (localq.I())
        {
          if (!bool3) {
            break label2531;
          }
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362732));
        }
        if ((localq.J()) && (!bool3)) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362379));
        }
        if ((localq.K()) && (!bool3)) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362385));
        }
        if ((localq.L()) && (!bool3)) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362381));
        }
        if (((localq.M()) || (parama.aj().c() == 2) || (parama.aj().a() == 7)) && (!bool3)) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362377));
        }
        if ((parama.aj().c() == 19) || (parama.aj().a() == 10)) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362802));
        }
        if ((!localq.P()) && (parama.aj().c() != 3) && (parama.aj().a() != 5)) {
          break label2642;
        }
        if (!bool3) {
          break label2615;
        }
        if ((parama.aj().e() != 7) && (parama.aj().e() != 8)) {
          break label2549;
        }
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362761));
        a(true, false, 2131362761);
        a(new int[] { 2131362730, 2131362367, 2131362740 });
        if (!localq.Q()) {
          break label2874;
        }
        if (!bool3) {
          break label2849;
        }
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362743));
        if (!bool3) {
          break label2867;
        }
        i = 2131362743;
        label1443:
        a(false, false, i);
        if (!localq.ae()) {
          break label2930;
        }
        if (bool3) {
          break label2903;
        }
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362728));
        a(false, false, 2131362728);
        label1485:
        if (!localq.af()) {
          break label2951;
        }
        if (bool3)
        {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362741));
          a(false, false, 2131362741);
        }
        label1520:
        if (!localq.ag()) {
          break label2966;
        }
        if (bool3)
        {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362742));
          a(false, false, 2131362742);
        }
        label1557:
        if (((!localq.ah()) || (bool3)) || ((localq.ai()) && (!bool3))) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362368));
        }
        if (!localq.v()) {
          break label2982;
        }
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362384));
        a(false, false, 2131362384);
        label1630:
        if (!localq.R()) {
          break label2998;
        }
        if (!bool3)
        {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362408));
          a(false, false, 2131362408);
        }
        label1667:
        if (localq.z())
        {
          if (!bool3) {
            break label3014;
          }
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362756));
        }
        label1695:
        if (localq.w())
        {
          if (!bool3) {
            break label3032;
          }
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362757));
        }
        label1723:
        if ((localq.D()) && (!bool3)) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362676));
        }
        if (!localq.E()) {
          break label3077;
        }
        if (bool3) {
          break label3050;
        }
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362399));
        label1779:
        if (!localq.F()) {
          break label3111;
        }
        if (!bool3) {
          break label3093;
        }
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362751));
        a(true, false, 2131362751);
        label1816:
        if ((localq.G()) && (!bool3)) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362370));
        }
        if (bool3)
        {
          if (!localq.T()) {
            break label3127;
          }
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362794));
          a(false, false, 2131362793);
        }
        label1881:
        if (((parama.aj().g().isEnforcementAtti()) || (parama.aj().g().isLightStream())) && (parama.al().a()))
        {
          if (localq.U())
          {
            if (!bool3) {
              break label3143;
            }
            localErrorMode.getLightErrorList().add(Integer.valueOf(2131362772));
          }
          label1945:
          if (localq.V())
          {
            if (!bool3) {
              break label3161;
            }
            localErrorMode.getLightErrorList().add(Integer.valueOf(2131362038));
          }
          label1973:
          if (localq.W())
          {
            if (!bool3) {
              break label3179;
            }
            localErrorMode.getLightErrorList().add(Integer.valueOf(2131362336));
          }
          label2001:
          if ((localq.al()) && (!bool3)) {
            localErrorMode.getLightErrorList().add(Integer.valueOf(2131362775));
          }
          if (localq.X())
          {
            if (!bool3) {
              break label3197;
            }
            localErrorMode.getLightErrorList().add(Integer.valueOf(2131362183));
          }
        }
        label2057:
        if ((!bool3) && (localq.y())) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362803));
        }
        if (localq.am())
        {
          if (!bool3) {
            break label3215;
          }
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362362));
          a(false, false, 2131362362);
        }
      }
    }
    for (;;)
    {
      return localErrorMode;
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362375));
      a(false, false, 2131362375);
      break;
      if (bool3) {}
      for (i = 2131362733;; i = 2131362375)
      {
        a(new int[] { i });
        break;
      }
      label2181:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362405));
      a(false, false, 2131362405);
      break label592;
      label2208:
      a(new int[] { 2131362764, 2131362405 });
      break label592;
      label2229:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362404));
      break label629;
      label2247:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362371));
      break label664;
      label2265:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362378));
      break label691;
      label2283:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362380));
      break label718;
      label2301:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362369));
      break label745;
      label2319:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362364));
      a(false, false, 2131362364);
      break label780;
      label2346:
      a(new int[] { 2131362724, 2131362364 });
      break label780;
      label2367:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362396));
      break label906;
      label2385:
      a(new int[] { 2131362745 });
      break label906;
      label2400:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362397));
      break label954;
      label2418:
      a(new int[] { 2131362748 });
      break label954;
      label2433:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362383));
      break label1040;
      label2451:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362744));
      break label1109;
      label2469:
      if ((!localq.H()) || (parama.aj().g().isLightStream())) {
        break label1109;
      }
      if (bool3)
      {
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362736));
        break label1109;
      }
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362376));
      break label1109;
      label2531:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362372));
      break label1136;
      label2549:
      if (parama.aj().e() == 9)
      {
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362760));
        a(true, false, 2131362760);
        break label1386;
      }
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362737));
      a(true, false, 2131362737);
      break label1386;
      label2615:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362382));
      a(false, false, 2131362382);
      break label1386;
      label2642:
      if (localq.N())
      {
        a(new int[] { 2131362737, 2131362382, 2131362740, 2131362761 });
        if (bool3)
        {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362730));
          a(true, false, 2131362730);
          break label1408;
        }
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362367));
        a(false, false, 2131362367);
        break label1408;
      }
      if (localq.O())
      {
        a(new int[] { 2131362737, 2131362382, 2131362730, 2131362367, 2131362761 });
        if (!bool3) {
          break label1408;
        }
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362740));
        a(true, false, 2131362740);
        break label1408;
      }
      a(new int[] { 2131362730, 2131362740, 2131362367, 2131362760, 2131362737, 2131362761 });
      break label1408;
      label2849:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362386));
      break label1435;
      label2867:
      i = 2131362386;
      break label1443;
      label2874:
      if (bool3) {}
      for (i = 2131362743;; i = 2131362386)
      {
        a(new int[] { i });
        break;
      }
      label2903:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362729));
      a(true, false, 2131362729);
      break label1485;
      label2930:
      a(new int[] { 2131362729, 2131362728 });
      break label1485;
      label2951:
      a(new int[] { 2131362741 });
      break label1520;
      label2966:
      a(new int[] { 2131362742 });
      break label1557;
      label2982:
      a(new int[] { 2131362384 });
      break label1630;
      label2998:
      a(new int[] { 2131362408 });
      break label1667;
      label3014:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362401));
      break label1695;
      label3032:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362402));
      break label1723;
      label3050:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362752));
      a(true, false, 2131362752);
      break label1779;
      label3077:
      a(new int[] { 2131362752 });
      break label1779;
      label3093:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362398));
      break label1816;
      label3111:
      a(new int[] { 2131362751 });
      break label1816;
      label3127:
      a(new int[] { 2131362793 });
      break label1881;
      label3143:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362771));
      break label1945;
      label3161:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362037));
      break label1973;
      label3179:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362335));
      break label2001;
      label3197:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362182));
      break label2057;
      label3215:
      a(new int[] { 2131362362 });
    }
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    if (!b.containsKey(Integer.valueOf(paramInt))) {
      b.put(Integer.valueOf(paramInt), new f(paramBoolean1, paramBoolean2, paramInt));
    }
  }
  
  public void a(int... paramVarArgs)
  {
    int j = paramVarArgs.length;
    int i = 0;
    while (i < j)
    {
      int k = paramVarArgs[i];
      if (b.containsKey(Integer.valueOf(k))) {
        b.remove(Integer.valueOf(k));
      }
      i += 1;
    }
  }
  
  public void c()
  {
    a(new int[] { 2131362760, 2131362740 });
  }
  
  public void d()
  {
    if (b().size() > 0)
    {
      Iterator localIterator = b().keySet().iterator();
      while (localIterator.hasNext())
      {
        Integer localInteger = (Integer)localIterator.next();
        f localf = (f)b().get(localInteger);
        if ((localf != null) && (!localf.c()))
        {
          com.fimi.kernel.d.b.b(c.d()).a(c.d().getString(localf.a()));
          ((f)b().get(localInteger)).b(true);
          if (((f)b().get(localInteger)).b()) {
            ap.a(c.d(), 2000L);
          }
        }
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/j/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */