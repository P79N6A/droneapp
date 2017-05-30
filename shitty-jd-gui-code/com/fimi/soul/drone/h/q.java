package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.e;
import com.fimi.soul.utils.ao;

public class q
  extends e
{
  private int b;
  private int c;
  private int d = 0;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int[] j = { 2131362668, 2131362670, 2131362664, 2131362665, 2131362658, 2131362669, 2131362661, 2131362662, 2131362663, 2131362674, 2131362656, 2131362657, 2131362672, 2131362671, 2131362666, 2131362667 };
  private int[] k = { 2131362212, 2131362207, 2131362198, 2131362215, 2131362213, 2131362211, 2131362201, 2131362216, 2131362219, 2131362225, 2131362197, 2131362196, 2131362199, 2131362203, 2131362214, 2131362224, 2131362208, 2131362223, 2131362220, 2131362221, 2131362209, 2131362200, 2131362222, 2131362218, 2131362217, 2131362210, 2131362204 };
  
  public q() {}
  
  public q(a parama)
  {
    super(parama);
  }
  
  private int c(int paramInt)
  {
    int m = 0;
    while (m < 32)
    {
      if (ao.a(paramInt, m) > 0) {
        return m;
      }
      m += 1;
    }
    return -1;
  }
  
  @Deprecated
  public boolean A()
  {
    return ao.a(this.b, Math.abs(this.d - 21)) > 0;
  }
  
  public boolean B()
  {
    return ao.a(this.b, Math.abs(this.d - 22)) > 0;
  }
  
  public boolean C()
  {
    return ao.a(this.b, Math.abs(this.d - 23)) > 0;
  }
  
  public boolean D()
  {
    return ao.a(this.b, Math.abs(this.d - 24)) > 0;
  }
  
  public boolean E()
  {
    return ao.a(this.b, Math.abs(this.d - 25)) > 0;
  }
  
  public boolean F()
  {
    return ao.a(this.b, Math.abs(this.d - 26)) > 0;
  }
  
  public boolean G()
  {
    return ao.a(this.b, Math.abs(this.d - 27)) > 0;
  }
  
  public boolean H()
  {
    return ao.a(this.c, Math.abs(this.d + 0)) > 0;
  }
  
  public boolean I()
  {
    return ao.a(this.c, Math.abs(this.d - 1)) > 0;
  }
  
  public boolean J()
  {
    return ao.a(this.c, Math.abs(this.d - 2)) > 0;
  }
  
  public boolean K()
  {
    return ao.a(this.c, Math.abs(this.d - 3)) > 0;
  }
  
  public boolean L()
  {
    return ao.a(this.c, Math.abs(this.d - 4)) > 0;
  }
  
  public boolean M()
  {
    return ao.a(this.c, Math.abs(this.d - 5)) > 0;
  }
  
  public boolean N()
  {
    return ao.a(this.c, Math.abs(this.d - 6)) > 0;
  }
  
  public boolean O()
  {
    return ao.a(this.c, Math.abs(this.d - 7)) > 0;
  }
  
  public boolean P()
  {
    return ao.a(this.c, Math.abs(this.d - 8)) > 0;
  }
  
  public boolean Q()
  {
    return ao.a(this.c, Math.abs(this.d - 9)) > 0;
  }
  
  public boolean R()
  {
    return ao.a(this.c, Math.abs(this.d - 10)) > 0;
  }
  
  public boolean S()
  {
    return ao.a(this.c, Math.abs(this.d - 11)) > 0;
  }
  
  public boolean T()
  {
    return ao.a(this.c, Math.abs(this.d - 12)) > 0;
  }
  
  public boolean U()
  {
    return ao.a(this.c, Math.abs(this.d - 13)) > 0;
  }
  
  public boolean V()
  {
    return ao.a(this.c, Math.abs(this.d - 14)) > 0;
  }
  
  public boolean W()
  {
    return ao.a(this.c, Math.abs(this.d - 15)) > 0;
  }
  
  public boolean X()
  {
    return ao.a(this.c, Math.abs(this.d - 16)) > 0;
  }
  
  public boolean Y()
  {
    return ao.a(this.c, Math.abs(this.d - 17)) > 0;
  }
  
  public boolean Z()
  {
    return ao.a(this.c, Math.abs(this.d - 18)) > 0;
  }
  
  public int a()
  {
    return this.i;
  }
  
  public void a(int paramInt)
  {
    this.e = paramInt;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.g = c(paramInt1);
    this.h = c(paramInt2);
    this.i = this.g;
    if ((this.g >= 0) || (this.h >= 0))
    {
      this.e = 2131362673;
      if ((this.g >= 0) && (this.g < this.j.length)) {
        this.f = this.j[this.g];
      }
      if (this.g >= 0) {
        this.i = this.g;
      }
      if ((this.h >= 0) && (this.h < this.k.length)) {
        this.f = this.k[this.h];
      }
      if (this.h >= 0) {
        this.i = this.h;
      }
    }
    if (this.a != null) {
      this.a.a(d.a.aU);
    }
  }
  
  public boolean aa()
  {
    return ao.a(this.c, Math.abs(this.d - 19)) > 0;
  }
  
  public boolean ab()
  {
    return ao.a(this.c, Math.abs(this.d - 20)) > 0;
  }
  
  public boolean ac()
  {
    return ao.a(this.c, Math.abs(this.d - 21)) > 0;
  }
  
  public boolean ad()
  {
    return ao.a(this.c, Math.abs(this.d - 22)) > 0;
  }
  
  public boolean ae()
  {
    return ao.a(this.c, Math.abs(this.d - 23)) > 0;
  }
  
  public boolean af()
  {
    return ao.a(this.c, Math.abs(this.d - 24)) > 0;
  }
  
  public boolean ag()
  {
    return ao.a(this.c, Math.abs(this.d - 25)) > 0;
  }
  
  public boolean ah()
  {
    return ao.a(this.c, Math.abs(this.d - 26)) > 0;
  }
  
  public boolean ai()
  {
    return ao.a(this.c, Math.abs(this.d - 27)) > 0;
  }
  
  public boolean aj()
  {
    return ao.a(this.c, Math.abs(this.d - 28)) > 0;
  }
  
  public boolean ak()
  {
    return ao.a(this.c, Math.abs(this.d - 29)) > 0;
  }
  
  public boolean al()
  {
    return ao.a(this.c, Math.abs(this.d - 30)) > 0;
  }
  
  public boolean am()
  {
    return ao.a(this.c, Math.abs(this.d - 31)) > 0;
  }
  
  public int b()
  {
    return this.g;
  }
  
  public void b(int paramInt)
  {
    this.f = paramInt;
  }
  
  public int c()
  {
    return this.h;
  }
  
  public int d()
  {
    return this.e;
  }
  
  public int e()
  {
    return this.f;
  }
  
  public boolean f()
  {
    return ao.a(this.b, Math.abs(this.d + 0)) > 0;
  }
  
  public boolean g()
  {
    return ao.a(this.b, Math.abs(this.d - 1)) > 0;
  }
  
  public boolean h()
  {
    return ao.a(this.b, Math.abs(this.d - 2)) > 0;
  }
  
  public boolean i()
  {
    return ao.a(this.b, Math.abs(this.d - 3)) > 0;
  }
  
  public boolean j()
  {
    return ao.a(this.b, Math.abs(this.d - 4)) > 0;
  }
  
  public boolean k()
  {
    return ao.a(this.b, Math.abs(this.d - 5)) > 0;
  }
  
  public boolean l()
  {
    return ao.a(this.b, Math.abs(this.d - 6)) > 0;
  }
  
  public boolean m()
  {
    return ao.a(this.b, Math.abs(this.d - 7)) > 0;
  }
  
  public boolean n()
  {
    return ao.a(this.b, Math.abs(this.d - 8)) > 0;
  }
  
  public boolean o()
  {
    return ao.a(this.b, Math.abs(this.d - 9)) > 0;
  }
  
  public boolean p()
  {
    return ao.a(this.b, Math.abs(this.d - 10)) > 0;
  }
  
  public boolean q()
  {
    return ao.a(this.b, Math.abs(this.d - 11)) > 0;
  }
  
  public boolean r()
  {
    return ao.a(this.b, Math.abs(this.d - 12)) > 0;
  }
  
  public boolean s()
  {
    return ao.a(this.b, Math.abs(this.d - 13)) > 0;
  }
  
  public boolean t()
  {
    return ao.a(this.b, Math.abs(this.d - 14)) > 0;
  }
  
  public String toString()
  {
    return "selftErrorIndex=" + this.g + "faultErrorIndex=" + this.h + " GPS模块损坏 =" + f() + " 处于禁飞区=" + g() + " 罗盘1损坏=" + h() + " 罗盘2损坏=" + i() + " 加速度计损坏=" + j() + " 陀螺损坏=" + k() + " 气压计损坏=" + l() + " 电池损坏=" + m() + " 电池非法=" + n() + " 未知故障=" + o() + " 光流损坏=" + p() + " 未挂光流=" + q() + " 未挂云台=" + u() + " GPS无信号=" + H() + " 罗盘待校准=" + I() + " 加速度计待校准=" + J() + " 水平校准=" + K() + " 陀螺带校准=" + L() + " 地面姿态偏移=" + M() + " 低于返航电量=" + O() + " 低电告警=" + P() + " 温度过高=" + Q() + " 单节电池电压异常=" + R() + " 危险低电告警，可能导致电池损坏或坠机=" + S() + " 纹理质量=" + X() + " 云台故障=" + Y() + " 过热=" + Z() + " 自检失败=" + aa() + " 电机堵转=" + ab() + " 重心错误=" + ac() + " AHRS不可用=" + ad() + " 电池寿命不足=" + ae() + " faultError =" + Integer.toBinaryString(this.c) + " selfError=" + Integer.toBinaryString(this.b);
  }
  
  public boolean u()
  {
    return ao.a(this.b, Math.abs(this.d - 15)) > 0;
  }
  
  public boolean v()
  {
    return ao.a(this.b, Math.abs(this.d - 16)) > 0;
  }
  
  public boolean w()
  {
    return ao.a(this.b, Math.abs(this.d - 17)) > 0;
  }
  
  public boolean x()
  {
    return ao.a(this.b, Math.abs(this.d - 18)) > 0;
  }
  
  public boolean y()
  {
    return ao.a(this.b, Math.abs(this.d - 19)) > 0;
  }
  
  public boolean z()
  {
    return ao.a(this.b, Math.abs(this.d - 20)) > 0;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/h/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */