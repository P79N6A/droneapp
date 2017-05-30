package com.fimi.soul.module.droneTrack.b;

import com.fimi.soul.biz.j.f;
import com.fimi.soul.drone.h.a.b;
import com.fimi.soul.drone.h.a.e;
import com.fimi.soul.drone.h.q;
import com.fimi.soul.entity.DroneModelType;
import com.fimi.soul.entity.ErrorMode;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class a
{
  private static a a;
  private static Map<Integer, f> b = new Hashtable();
  
  public static a a()
  {
    if (a == null) {
      a = new a();
    }
    return a;
  }
  
  public static Map<Integer, f> b()
  {
    return b;
  }
  
  public ErrorMode a(com.fimi.soul.module.droneTrack.a.a parama)
  {
    q localq = parama.b();
    if (localq == null) {
      return null;
    }
    boolean bool1 = parama.j();
    boolean bool2 = parama.m();
    boolean bool3 = parama.n();
    ErrorMode localErrorMode = new ErrorMode();
    localErrorMode.setIsMiddleFault(bool3);
    label77:
    label100:
    label428:
    label480:
    label516:
    label550:
    label576:
    label602:
    label628:
    label662:
    label785:
    label832:
    label949:
    label975:
    label1200:
    label1208:
    label1230:
    label1256:
    int i;
    if (bool2) {
      if (bool1)
      {
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362767));
        a(bool1, false, 2131362406);
        if (bool3)
        {
          if (!bool1) {
            break label1805;
          }
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362768));
        }
        if (((parama.a().c() == 4) || (parama.a().a() == 12)) && (!bool1)) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362395));
        }
        if (((localq.ak()) || (parama.a().c() == 5) || (parama.a().a() == 8)) && (!bool1)) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362390));
        }
        if ((parama.a().c() == 6) && (!bool1)) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362391));
        }
        if ((parama.a().c() == 9) && (!bool1)) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362394));
        }
        if (((parama.a().c() == 17) || (parama.a().a() == 4)) && (!bool1)) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362388));
        }
        if (((localq.aj()) || (parama.a().c() == 21) || (parama.a().a() == 14)) && (!bool1)) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362393));
        }
        if ((parama.a().c() == 11) && (!bool1)) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362389));
        }
        localErrorMode.setIsCompassFault(localq.I());
        if ((!localq.f()) || (parama.a().g().isLightStream())) {
          break label1850;
        }
        if (!bool1) {
          break label1823;
        }
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362733));
        a(true, false, 2131362733);
        if ((!localq.g()) && ((parama.c() == null) || (parama.c().f() != 3))) {
          break label1905;
        }
        if (!bool1) {
          break label1878;
        }
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362764));
        a(true, false, 2131362764);
        if ((parama.c() != null) && (parama.c().f() == 1))
        {
          if (!bool1) {
            break label1926;
          }
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362763));
        }
        if ((localq.h()) || (localq.i()))
        {
          if (!bool1) {
            break label1944;
          }
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362755));
        }
        if (localq.j())
        {
          if (!bool1) {
            break label1962;
          }
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362758));
        }
        if (localq.k())
        {
          if (!bool1) {
            break label1980;
          }
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362759));
        }
        if (localq.l())
        {
          if (!bool1) {
            break label1998;
          }
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362731));
        }
        if (!localq.m()) {
          break label2043;
        }
        if (!bool1) {
          break label2016;
        }
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362724));
        a(true, false, 2131362724);
        if ((localq.n()) && (!bool1)) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362365));
        }
        if (((localq.o()) || (parama.a().c() == 22) || (parama.a().a() == 15)) && (!bool1)) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362403));
        }
        if ((!localq.p()) || (!parama.a().g().isLightStream())) {
          break label2082;
        }
        if (!bool1) {
          break label2064;
        }
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362745));
        a(true, false, 2131362745);
        if ((!localq.q()) || (!parama.a().g().isLightStream())) {
          break label2115;
        }
        if (!bool1) {
          break label2097;
        }
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362748));
        a(false, false, 2131362748);
        if (((localq.r()) || (parama.a().c() == 12) || (parama.a().a() == 6)) && (!bool1)) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362387));
        }
        if ((localq.x()) && (!bool1)) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362366));
        }
        if ((parama.a().c() != 13) && (parama.a().a() != 1)) {
          break label2148;
        }
        if (bool1) {
          break label2130;
        }
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362392));
        if (localq.I())
        {
          if (!bool1) {
            break label2209;
          }
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362732));
        }
        if ((localq.J()) && (!bool1)) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362379));
        }
        if ((localq.K()) && (!bool1)) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362385));
        }
        if ((localq.L()) && (!bool1)) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362381));
        }
        if (((localq.M()) || (parama.a().c() == 2) || (parama.a().a() == 7)) && (!bool1)) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362377));
        }
        if ((parama.a().c() == 19) || (parama.a().a() == 10)) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362802));
        }
        if ((!localq.P()) && (parama.a().c() != 3) && (parama.a().a() != 5)) {
          break label2271;
        }
        if (!bool1) {
          break label2244;
        }
        if (parama.a().e() != 9) {
          break label2227;
        }
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362760));
        a(true, false, 2131362737);
        a(new int[] { 2131362730, 2131362367, 2131362740 });
        if (!localq.Q()) {
          break label2481;
        }
        if (!bool1) {
          break label2456;
        }
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362743));
        if (!bool1) {
          break label2474;
        }
        i = 2131362743;
        label1263:
        a(false, false, i);
        if (!localq.ae()) {
          break label2536;
        }
        if (bool1) {
          break label2509;
        }
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362728));
        a(false, false, 2131362728);
        label1304:
        if (!localq.af()) {
          break label2557;
        }
        if (bool1)
        {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362741));
          a(false, false, 2131362741);
        }
        label1338:
        if (!localq.ag()) {
          break label2572;
        }
        if (bool1)
        {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362742));
          a(false, false, 2131362742);
        }
        label1372:
        if (((!localq.ah()) || (bool1)) || ((localq.ai()) && (!bool1))) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362368));
        }
        if (!localq.v()) {
          break label2587;
        }
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362384));
        a(false, false, 2131362384);
        label1440:
        if (!localq.R()) {
          break label2602;
        }
        if (!bool1)
        {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362408));
          a(false, false, 2131362408);
        }
        label1474:
        if (localq.z())
        {
          if (!bool1) {
            break label2617;
          }
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362756));
        }
        label1500:
        if (localq.w())
        {
          if (!bool1) {
            break label2635;
          }
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362757));
        }
        label1526:
        if (bool1)
        {
          if (!localq.T()) {
            break label2653;
          }
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362794));
          a(false, false, 2131362793);
        }
        label1560:
        if (!parama.a().g().isGps())
        {
          if (localq.U())
          {
            if (!bool1) {
              break label2668;
            }
            localErrorMode.getLightErrorList().add(Integer.valueOf(2131362772));
          }
          label1599:
          if (localq.V())
          {
            if (!bool1) {
              break label2686;
            }
            localErrorMode.getLightErrorList().add(Integer.valueOf(2131362038));
          }
          label1626:
          if (localq.W())
          {
            if (!bool1) {
              break label2704;
            }
            localErrorMode.getLightErrorList().add(Integer.valueOf(2131362336));
          }
          label1653:
          if ((localq.al()) && (!bool1)) {
            localErrorMode.getLightErrorList().add(Integer.valueOf(2131362775));
          }
          if (localq.X())
          {
            if (!bool1) {
              break label2722;
            }
            localErrorMode.getLightErrorList().add(Integer.valueOf(2131362183));
          }
        }
        label1707:
        if ((!bool1) && (localq.y())) {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362803));
        }
        if (localq.am())
        {
          if (!bool1) {
            break label2740;
          }
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362362));
          a(false, false, 2131362362);
        }
      }
    }
    for (;;)
    {
      return localErrorMode;
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362406));
      break;
      a(new int[] { 2131362406 });
      break label77;
      label1805:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362407));
      break label100;
      label1823:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362375));
      a(false, false, 2131362375);
      break label428;
      label1850:
      if (bool1) {}
      for (i = 2131362733;; i = 2131362375)
      {
        a(new int[] { i });
        break;
      }
      label1878:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362405));
      a(false, false, 2131362405);
      break label480;
      label1905:
      a(new int[] { 2131362764, 2131362405 });
      break label480;
      label1926:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362404));
      break label516;
      label1944:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362371));
      break label550;
      label1962:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362378));
      break label576;
      label1980:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362380));
      break label602;
      label1998:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362369));
      break label628;
      label2016:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362364));
      a(false, false, 2131362364);
      break label662;
      label2043:
      a(new int[] { 2131362724, 2131362364 });
      break label662;
      label2064:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362396));
      break label785;
      label2082:
      a(new int[] { 2131362745 });
      break label785;
      label2097:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362397));
      break label832;
      label2115:
      a(new int[] { 2131362748 });
      break label832;
      label2130:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362744));
      break label949;
      label2148:
      if ((!localq.H()) || (parama.a().g().isLightStream())) {
        break label949;
      }
      if (bool1)
      {
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362736));
        break label949;
      }
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362376));
      break label949;
      label2209:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362372));
      break label975;
      label2227:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362737));
      break label1200;
      label2244:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362382));
      a(false, false, 2131362382);
      break label1208;
      label2271:
      if (localq.N())
      {
        a(new int[] { 2131362737, 2131362382, 2131362740 });
        if (bool1)
        {
          localErrorMode.getLightErrorList().add(Integer.valueOf(2131362730));
          a(true, false, 2131362730);
          break label1230;
        }
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362367));
        a(false, false, 2131362367);
        break label1230;
      }
      if (localq.O())
      {
        a(new int[] { 2131362737, 2131362382, 2131362730, 2131362367 });
        if (!bool1) {
          break label1230;
        }
        localErrorMode.getLightErrorList().add(Integer.valueOf(2131362740));
        a(true, false, 2131362740);
        break label1230;
      }
      a(new int[] { 2131362730, 2131362740, 2131362367, 2131362760, 2131362737 });
      break label1230;
      label2456:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362386));
      break label1256;
      label2474:
      i = 2131362386;
      break label1263;
      label2481:
      if (bool1) {}
      for (i = 2131362743;; i = 2131362386)
      {
        a(new int[] { i });
        break;
      }
      label2509:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362729));
      a(true, false, 2131362729);
      break label1304;
      label2536:
      a(new int[] { 2131362729, 2131362728 });
      break label1304;
      label2557:
      a(new int[] { 2131362741 });
      break label1338;
      label2572:
      a(new int[] { 2131362742 });
      break label1372;
      label2587:
      a(new int[] { 2131362384 });
      break label1440;
      label2602:
      a(new int[] { 2131362408 });
      break label1474;
      label2617:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362401));
      break label1500;
      label2635:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362402));
      break label1526;
      label2653:
      a(new int[] { 2131362793 });
      break label1560;
      label2668:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362771));
      break label1599;
      label2686:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362037));
      break label1626;
      label2704:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362335));
      break label1653;
      label2722:
      localErrorMode.getLightErrorList().add(Integer.valueOf(2131362182));
      break label1707;
      label2740:
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
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneTrack/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */