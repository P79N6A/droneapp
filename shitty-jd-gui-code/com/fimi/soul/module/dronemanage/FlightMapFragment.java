package com.fimi.soul.module.dronemanage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.fimi.kernel.utils.t;
import com.fimi.kernel.utils.v;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.c.h;
import com.fimi.soul.biz.c.n;
import com.fimi.soul.biz.d.a.a;
import com.fimi.soul.biz.manager.MyLocationManager;
import com.fimi.soul.biz.manager.x;
import com.fimi.soul.drone.c.a.a.l;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.droneconnection.connection.f.a;
import com.fimi.soul.drone.h.ba;
import com.fimi.soul.drone.h.o;
import com.fimi.soul.entity.DroneModelType;
import com.fimi.soul.entity.DynamicDYZ_Entity;
import com.fimi.soul.entity.FlyActionBean;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.module.droneFragment.FlyActionSettingFragment;
import com.fimi.soul.module.droneui.DroneMap;
import com.fimi.soul.utils.ae;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.y;
import com.fimi.soul.view.MapWrapperLayout;
import com.fimi.soul.view.titlebar.TouchableMap;
import com.fimi.soul.view.titlebar.TouchableMap.a;
import com.google.android.gms.maps.c.b;
import com.google.android.gms.maps.c.c;
import com.google.android.gms.maps.c.k;
import com.google.android.gms.maps.c.n;
import com.google.android.gms.maps.c.o;
import com.google.android.gms.maps.c.p;
import com.google.android.gms.maps.c.q;
import com.google.android.gms.maps.c.r;
import com.google.android.gms.maps.f;
import com.google.android.gms.maps.j;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.g;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FlightMapFragment
  extends DroneMap
  implements TouchableMap.a, c.b, c.c, c.k, c.n, c.o, c.p, c.q, c.r, f
{
  private com.fimi.soul.module.droneFragment.e A;
  private com.fimi.soul.module.droneFragment.e B;
  private com.fimi.soul.module.droneFragment.e C;
  private boolean D = false;
  private View E;
  private Button F;
  private Button G;
  private View H;
  private float I;
  private float J;
  private a K;
  private SharedPreferences L;
  private h M;
  private com.fimi.soul.biz.c.c N;
  private TouchableMap O;
  private double P;
  private com.fimi.soul.module.droneFragment.d Q;
  private List<com.google.android.gms.maps.model.c> R;
  private final int S = 16;
  private LatLng T;
  private final int U = 1;
  private b V = b.a;
  private int W = 1;
  boolean a = false;
  SharedPreferences.Editor b;
  Point c;
  boolean d = true;
  com.google.android.gms.maps.model.c e;
  com.google.android.gms.maps.model.c f;
  List<DynamicDYZ_Entity> g = new ArrayList();
  List<DynamicDYZ_Entity> h = new ArrayList();
  protected Handler i = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      com.fimi.soul.drone.c.a.a.k localk = new com.fimi.soul.drone.c.a.a.k();
      switch (paramAnonymousMessage.what)
      {
      }
      do
      {
        return;
        localk.c(false);
        FlightMapFragment.this.k.T().a(localk.a());
        return;
        localk.c(true);
        if (FlightMapFragment.this.g != null)
        {
          paramAnonymousMessage = FlightMapFragment.this.g.iterator();
          while (paramAnonymousMessage.hasNext())
          {
            DynamicDYZ_Entity localDynamicDYZ_Entity = (DynamicDYZ_Entity)paramAnonymousMessage.next();
            if (localDynamicDYZ_Entity != null)
            {
              LatLng localLatLng = new LatLng(localDynamicDYZ_Entity.getLatitude(), localDynamicDYZ_Entity.getLogitude());
              y.c(FlightMapFragment.b(FlightMapFragment.this), localLatLng).a();
              FlightMapFragment.this.h.add(localDynamicDYZ_Entity);
            }
          }
        }
      } while ((FlightMapFragment.this.h == null) || (FlightMapFragment.this.h.size() <= 0));
      paramAnonymousMessage = ((DynamicDYZ_Entity)FlightMapFragment.this.h.get(0)).getEncryptKey();
      localk.b(t.a(paramAnonymousMessage.substring(6, paramAnonymousMessage.length() - 4)));
      if (!com.fimi.soul.biz.e.d.a().k()) {
        localk.a(false);
      }
      for (;;)
      {
        FlightMapFragment.this.k.T().a(localk.a());
        FlightMapFragment.a(FlightMapFragment.this, FlightMapFragment.b.c);
        return;
        localk.a((byte)26);
        localk.a(true);
        localk.b(true);
        localk.a(FlightMapFragment.a(FlightMapFragment.c(FlightMapFragment.this)));
      }
    }
  };
  private com.fimi.soul.biz.k.a s;
  private n t;
  private LatLng u;
  private com.google.android.gms.maps.model.c v;
  private boolean w;
  private FragmentManager x;
  private View y;
  private Button z;
  
  public static int a(byte[] paramArrayOfByte)
  {
    return (paramArrayOfByte[1] & 0xFF) << 8 | paramArrayOfByte[0] & 0xFF;
  }
  
  private void a(ba paramba) {}
  
  private void a(LatLng paramLatLng, int paramInt1, int paramInt2)
  {
    int j = this.L.getInt("Amptype", 1);
    if (paramInt2 == 3) {
      if (this.f != null)
      {
        this.f.a(paramLatLng);
        if (paramInt1 != this.f.d()) {
          this.f.a(paramInt1 + 100);
        }
        if ((this.e == null) || (!this.R.contains(this.e))) {
          break label263;
        }
        this.e.a(paramLatLng);
        if (paramInt1 != this.e.d()) {
          this.e.a(paramInt1);
        }
      }
    }
    for (;;)
    {
      if (!this.R.contains(this.e)) {
        this.R.add(this.e);
      }
      return;
      com.google.android.gms.maps.c localc = this.j;
      CircleOptions localCircleOptions = new CircleOptions().a(paramLatLng).a(paramInt1 + 100).a(Color.argb(127, 0, 0, 0)).a(2.0F);
      if (1 == j) {}
      for (paramInt2 = Color.argb(204, 198, 200, 203);; paramInt2 = Color.argb(204, 101, 104, 106))
      {
        this.f = localc.a(localCircleOptions.b(paramInt2));
        break;
      }
      if (this.f == null) {
        break;
      }
      this.f.a();
      this.f = null;
      break;
      label263:
      this.e = this.j.a(new CircleOptions().a(paramLatLng).a(paramInt1).a(Color.argb(127, 255, 54, 0)).a(2.0F).b(Color.argb(51, 255, 54, 0)).b(100.0F));
    }
  }
  
  private void a(String paramString)
  {
    if (paramString != null)
    {
      paramString = t.a(paramString);
      this.k.T().a(paramString);
    }
  }
  
  public static byte[] a(int paramInt)
  {
    return new byte[] { (byte)(paramInt >> 24 & 0xFF), (byte)(paramInt >> 16 & 0xFF), (byte)(paramInt >> 8 & 0xFF), (byte)(paramInt & 0xFF) };
  }
  
  private String b(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
    {
      int m = paramArrayOfByte.length;
      int j = 0;
      int k = 0;
      while (j < m)
      {
        k += (paramArrayOfByte[j] & 0xFF);
        j += 1;
      }
      return t.a(a(k, false));
    }
    return "";
  }
  
  private void c(LatLng paramLatLng)
  {
    if (this.v == null)
    {
      this.v = this.j.a(new CircleOptions().a(paramLatLng).a(500.0D).a(5.0F).a(getResources().getColor(2131624063)));
      return;
    }
    this.v.a(paramLatLng);
    this.v.a(true);
  }
  
  private void f() {}
  
  private void g()
  {
    this.E = LayoutInflater.from(getActivity()).inflate(2130968741, null);
    this.F = ((Button)this.E.findViewById(2131690431));
    this.G = ((Button)this.E.findViewById(2131690432));
    this.C = new com.fimi.soul.module.droneFragment.e(this.F, getResources().getDrawable(2130837667), getResources().getDrawable(2130837668))
    {
      protected void a(View paramAnonymousView, g paramAnonymousg)
      {
        com.fimi.soul.biz.c.d.k().m();
        FlightMapFragment.this.k.a(d.a.bj);
      }
    };
    this.B = new com.fimi.soul.module.droneFragment.e(this.F, getResources().getDrawable(2130837667), getResources().getDrawable(2130837668))
    {
      protected void a(View paramAnonymousView, g paramAnonymousg)
      {
        h localh = h.a(FlightMapFragment.this.getActivity());
        paramAnonymousView = null;
        if ((paramAnonymousg.o() instanceof FlyActionBean)) {
          paramAnonymousView = (FlyActionBean)paramAnonymousg.o();
        }
        if (paramAnonymousView != null) {}
        switch (paramAnonymousView.getModelType())
        {
        default: 
          return;
        case 2: 
          localh.a(2);
          FlightMapFragment.this.k.a(d.a.u);
          return;
        case 1: 
          localh.a(1);
          FlightMapFragment.this.k.a(d.a.r);
          return;
        }
        localh.a(3);
        FlightMapFragment.this.k.a(d.a.w);
      }
    };
    this.F.setOnTouchListener(this.C);
    this.G.setOnTouchListener(this.B);
  }
  
  private void h()
  {
    this.y = LayoutInflater.from(getActivity()).inflate(2130968742, null);
    this.z = ((Button)this.y.findViewById(2131690434));
    this.A = new com.fimi.soul.module.droneFragment.e(this.z, getResources().getDrawable(2130837669), getResources().getDrawable(2130837670))
    {
      protected void a(View paramAnonymousView, g paramAnonymousg)
      {
        if (FlightMapFragment.a(FlightMapFragment.this).getText().toString().equals(FlightMapFragment.this.getString(2131362123))) {
          FlightMapFragment.this.k.a(d.a.by);
        }
      }
    };
    this.z.setOnTouchListener(this.A);
  }
  
  private void i()
  {
    if (this.j != null)
    {
      this.j.a(this);
      this.j.a(this);
      this.j.a(this);
      this.j.a(this.L.getInt("Amptype", 1));
      this.j.a(false);
      this.j.a(this);
      this.j.a(this);
      this.j.a(this);
      this.j.m().a(false);
    }
  }
  
  private void j()
  {
    if (this.v != null) {
      this.v.a(false);
    }
  }
  
  private void k()
  {
    x.a(getActivity()).b(new com.fimi.soul.biz.m.k()
    {
      public void a(PlaneMsg paramAnonymousPlaneMsg, File paramAnonymousFile)
      {
        if (paramAnonymousPlaneMsg.isSuccess()) {
          paramAnonymousPlaneMsg = paramAnonymousPlaneMsg.getData().toString();
        }
        try
        {
          paramAnonymousPlaneMsg = new JSONArray(paramAnonymousPlaneMsg);
          if ((paramAnonymousPlaneMsg != null) && (paramAnonymousPlaneMsg.length() > 0))
          {
            int i = 0;
            while (i < paramAnonymousPlaneMsg.length())
            {
              paramAnonymousFile = (DynamicDYZ_Entity)ae.b(DynamicDYZ_Entity.class, paramAnonymousPlaneMsg.getJSONObject(i).toString());
              FlightMapFragment.this.g.add(paramAnonymousFile);
              i += 1;
            }
            FlightMapFragment.this.i.sendEmptyMessage(1);
          }
          return;
        }
        catch (JSONException paramAnonymousPlaneMsg)
        {
          paramAnonymousPlaneMsg.printStackTrace();
          return;
        }
        catch (JsonMappingException paramAnonymousPlaneMsg)
        {
          paramAnonymousPlaneMsg.printStackTrace();
          return;
        }
        catch (JsonParseException paramAnonymousPlaneMsg)
        {
          paramAnonymousPlaneMsg.printStackTrace();
          return;
        }
        catch (IOException paramAnonymousPlaneMsg)
        {
          paramAnonymousPlaneMsg.printStackTrace();
        }
      }
    });
  }
  
  private void l()
  {
    if ((this.W >= this.h.size()) || (this.W < 0)) {
      return;
    }
    Object localObject2 = (DynamicDYZ_Entity)this.h.get(this.W - 1);
    if (!com.fimi.soul.biz.e.d.a().k())
    {
      localObject1 = new l();
      localObject2 = ((DynamicDYZ_Entity)localObject2).getEncryptValue();
      ((l)localObject1).b(t.a(((String)localObject2).substring(6, ((String)localObject2).length() - 4)));
      this.k.T().a(((l)localObject1).a());
      this.V = b.d;
      return;
    }
    Object localObject1 = new com.fimi.soul.drone.c.a.a.k();
    ((com.fimi.soul.drone.c.a.a.k)localObject1).a((byte)36);
    ((com.fimi.soul.drone.c.a.a.k)localObject1).c(true);
    localObject2 = ((DynamicDYZ_Entity)localObject2).getEncryptValue();
    localObject2 = t.a(((String)localObject2).substring(6, ((String)localObject2).length() - 4));
    if (!com.fimi.soul.biz.e.d.a().k()) {
      ((com.fimi.soul.drone.c.a.a.k)localObject1).a(false);
    }
    for (;;)
    {
      ((com.fimi.soul.drone.c.a.a.k)localObject1).b((byte[])localObject2);
      this.k.T().a(((com.fimi.soul.drone.c.a.a.k)localObject1).a());
      break;
      ((com.fimi.soul.drone.c.a.a.k)localObject1).a(true);
      ((com.fimi.soul.drone.c.a.a.k)localObject1).b(false);
      ((com.fimi.soul.drone.c.a.a.k)localObject1).a(a(this.W));
    }
  }
  
  private void m()
  {
    com.fimi.soul.drone.c.a.a.k localk = new com.fimi.soul.drone.c.a.a.k();
    localk.c(false);
    localk.g((byte)1);
    localk.e((byte)1);
    this.k.T().a(localk.a());
    this.s.a(this.h);
    this.V = b.e;
  }
  
  public View a(g paramg)
  {
    if ((paramg.o() instanceof FlyActionBean))
    {
      Object localObject = (FlyActionBean)paramg.o();
      if (localObject != null)
      {
        if (((FlyActionBean)localObject).getStyleInfo() == 2)
        {
          if (!((FlyActionBean)localObject).isCanExcute()) {
            a(this.G, 75);
          }
          for (;;)
          {
            this.B.a(paramg);
            this.C.a(paramg);
            localObject = this.k.aq();
            if (localObject != null) {
              ((MapWrapperLayout)localObject).a(paramg, this.E);
            }
            ao.a(getActivity().getAssets(), new View[] { this.F, this.G });
            return this.E;
            a(this.G, 255);
          }
        }
        this.z.setText(paramg.e());
        this.A.a(paramg);
        localObject = this.k.aq();
        if (localObject != null) {
          ((MapWrapperLayout)localObject).a(paramg, this.y);
        }
        ao.a(getActivity().getAssets(), new View[] { this.z });
        return this.y;
      }
    }
    return null;
  }
  
  public void a()
  {
    if (this.j.a().b >= 7.0F)
    {
      this.s.a();
      k();
    }
  }
  
  public void a(float paramFloat, boolean paramBoolean, View... paramVarArgs)
  {
    int j = 0;
    while (j < paramVarArgs.length)
    {
      View localView = paramVarArgs[j];
      if (localView.getAlpha() != paramFloat) {
        localView.setAlpha(paramFloat);
      }
      if (localView.isEnabled() != paramBoolean) {
        paramVarArgs[j].setEnabled(paramBoolean);
      }
      j += 1;
    }
  }
  
  public void a(MotionEvent paramMotionEvent)
  {
    com.fimi.soul.biz.d.a locala = com.fimi.soul.biz.d.a.a();
    if (locala.c() == a.a.c) {
      switch (paramMotionEvent.getAction() & 0xFF)
      {
      }
    }
    do
    {
      return;
      this.I = paramMotionEvent.getX();
      this.J = paramMotionEvent.getY();
      this.a = true;
      locala.a(false);
      return;
      this.a = false;
      return;
      locala.a(true);
    } while ((!this.a) || ((Math.abs(paramMotionEvent.getX() - this.I) <= 30.0F) && (Math.abs(paramMotionEvent.getY() - this.J) <= 30.0F)));
    locala.a(a.a.b);
  }
  
  public void a(Button paramButton, int paramInt)
  {
    paramButton.setTextColor(paramButton.getTextColors().withAlpha(paramInt));
    if (paramInt == 255)
    {
      paramButton.setEnabled(true);
      return;
    }
    paramButton.setEnabled(false);
  }
  
  public void a(com.fimi.soul.drone.h.a.b paramb)
  {
    LatLng localLatLng = new LatLng(paramb.j(), paramb.k());
    int j = paramb.g();
    if (this.j != null) {
      a(localLatLng, j * 10, paramb.i());
    }
  }
  
  public void a(FlyActionBean paramFlyActionBean)
  {
    this.N.b();
  }
  
  public void a(CameraPosition paramCameraPosition)
  {
    if ((this.M.a().get() == 3) && (this.k.U())) {
      this.k.a(d.a.bB);
    }
    if ((paramCameraPosition != null) && (paramCameraPosition.b >= 7.0F)) {
      this.s.a();
    }
  }
  
  public void a(LatLng paramLatLng)
  {
    if ((l == 6) || (l == 4) || (l == 5)) {}
    do
    {
      FlyActionSettingFragment localFlyActionSettingFragment;
      do
      {
        return;
        this.k.a(d.a.bp);
        localFlyActionSettingFragment = (FlyActionSettingFragment)this.x.findFragmentById(2131689827);
      } while (((localFlyActionSettingFragment != null) && (!localFlyActionSettingFragment.isVisible())) || (!this.M.b()));
      if (this.M.a().get() == 1)
      {
        this.N.a(paramLatLng, 2130838167);
        return;
      }
      if (this.M.a().get() == 2)
      {
        this.N.a(paramLatLng, 2130838198);
        return;
      }
    } while (this.M.a().get() != 3);
    this.N.a(paramLatLng, 2130838198);
  }
  
  public void a(List<ba> paramList) {}
  
  public byte[] a(int paramInt, boolean paramBoolean)
  {
    byte[] arrayOfByte = new byte[2];
    if (paramBoolean)
    {
      k = arrayOfByte.length - 1;
      j = paramInt;
      paramInt = k;
      while (paramInt >= 0)
      {
        arrayOfByte[paramInt] = ((byte)(j & 0xFF));
        j >>= 8;
        paramInt -= 1;
      }
    }
    int k = 0;
    int j = paramInt;
    paramInt = k;
    while (paramInt < arrayOfByte.length)
    {
      arrayOfByte[paramInt] = ((byte)(j & 0xFF));
      j >>= 8;
      paramInt += 1;
    }
    return arrayOfByte;
  }
  
  public View b(g paramg)
  {
    return null;
  }
  
  public void b()
  {
    if (this.j != null) {
      this.j.a(this.L.getInt("Amptype", 1));
    }
  }
  
  public void b(com.google.android.gms.maps.c paramc)
  {
    if (paramc != null)
    {
      this.j = paramc;
      this.k.a(this.j);
      if (this.s == null) {
        this.s = new com.fimi.soul.biz.k.a(getActivity().getApplicationContext(), this.j);
      }
      if (this.N != null) {
        break label206;
      }
      this.N = new com.fimi.soul.biz.c.c(this.k, this.j, getActivity().getApplicationContext(), this.x);
    }
    for (;;)
    {
      if (this.t == null) {
        this.t = new n(this.k);
      }
      i();
      if (this.Q != null) {
        this.Q.a(paramc);
      }
      h();
      g();
      f();
      if ((MyLocationManager.a(getActivity()).c() == null) && (!this.k.U()) && (this.j != null))
      {
        this.k.f(true);
        this.j.a(com.google.android.gms.maps.b.a(new LatLng(32.76593D, 102.523984D), 4.0F));
      }
      return;
      label206:
      this.N.d();
    }
  }
  
  public void b(LatLng paramLatLng) {}
  
  public void c(g paramg) {}
  
  public boolean d(g paramg)
  {
    if (this.k.aj().g().judgeNoAction()) {
      this.N.a(paramg);
    }
    return true;
  }
  
  public void e(g paramg)
  {
    h(paramg);
  }
  
  public void f(g paramg)
  {
    if (((this.P >= 500.0D) || (this.w)) && (this.u != null)) {
      paramg.a(this.u);
    }
    if (paramg.j())
    {
      paramg.i();
      paramg.a("");
    }
    this.k.a(d.a.bC);
  }
  
  public void g(g paramg) {}
  
  public void h(g paramg)
  {
    LatLng localLatLng = paramg.c();
    Object localObject = com.fimi.soul.biz.k.b.a().b().iterator();
    while (((Iterator)localObject).hasNext())
    {
      com.google.android.gms.maps.model.c localc = (com.google.android.gms.maps.model.c)((Iterator)localObject).next();
      if ((localc != null) && (y.c(localc.c(), localLatLng).a() < localc.d()))
      {
        this.w = true;
        com.fimi.kernel.utils.z.a(this.k.d, 2131362280, 3000);
      }
    }
    label238:
    do
    {
      return;
      this.w = false;
      this.P = y.c(localLatLng, new LatLng(this.k.v().b(), this.k.v().c())).a();
      if ((this.M.a().get() == 1) || (this.M.a().get() == 2))
      {
        if (!com.fimi.kernel.c.e().m()) {
          break label238;
        }
        paramg.a(getString(2131362152) + t.a(this.P) + getString(2131362285));
      }
      for (;;)
      {
        paramg.h();
        if (this.P < 500.0D) {
          break;
        }
        com.fimi.kernel.utils.z.a(getActivity(), 2131362909, 1000);
        return;
        paramg.a(getString(2131362152) + t.a(this.P, 1) + getString(2131362458));
      }
      this.u = localLatLng;
      localObject = null;
      if ((paramg.o() instanceof FlyActionBean)) {
        localObject = (FlyActionBean)paramg.o();
      }
    } while (localObject == null);
    ((FlyActionBean)localObject).setLatLng(localLatLng);
    a((FlyActionBean)localObject);
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    try
    {
      this.K = ((a)getActivity());
      this.Q = ((com.fimi.soul.module.droneFragment.d)getActivity());
      return;
    }
    catch (Exception paramActivity)
    {
      paramActivity.printStackTrace();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (this.t == null)
    {
      if (this.k == null) {
        this.k = ((DroidPlannerApp)getActivity().getApplication()).a;
      }
      this.t = new n(this.k);
    }
    this.M = h.a(getActivity().getApplicationContext());
    this.R = com.fimi.soul.biz.k.b.a().b();
    this.x = getActivity().getSupportFragmentManager();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    this.O = new TouchableMap(getActivity());
    this.O.addView(paramLayoutInflater);
    this.O.setNonConsumingTouchListener(this);
    this.L = PreferenceManager.getDefaultSharedPreferences(getActivity());
    this.b = this.L.edit();
    return this.O;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    if (this.s != null) {
      this.s.b();
    }
    Iterator localIterator = this.R.iterator();
    while (localIterator.hasNext())
    {
      com.google.android.gms.maps.model.c localc = (com.google.android.gms.maps.model.c)localIterator.next();
      if (localc != null) {
        localc.a();
      }
    }
    this.t.a();
    if (this.Q != null) {
      this.Q = null;
    }
  }
  
  public void onDetach()
  {
    super.onDetach();
  }
  
  public void onDroneEvent(d.a parama, com.fimi.soul.drone.a parama1)
  {
    int k = 0;
    super.onDroneEvent(parama, parama1);
    switch (6.b[parama.ordinal()])
    {
    }
    int j;
    do
    {
      int m;
      int n;
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
                do
                {
                  do
                  {
                    do
                    {
                      return;
                      if ((!parama1.U()) && (!this.D))
                      {
                        parama1.V();
                        this.D = true;
                      }
                    } while (!parama1.U());
                    this.D = false;
                    return;
                    parama = parama1.h();
                  } while ((parama.f() == 4) || (parama.f() == 5) || (parama.f() == 6));
                  a(parama);
                  return;
                  parama = parama1.v();
                  c(new LatLng(parama.b(), parama.c()));
                  return;
                  j();
                  return;
                } while (this.V == b.e);
                parama = parama1.d();
              } while (parama == null);
              j = parama.e();
              m = parama.f();
              n = parama.g();
            } while (m == 1);
            switch (6.a[this.V.ordinal()])
            {
            default: 
              return;
            case 1: 
              this.g.clear();
              this.h.clear();
            }
          } while ((j != 1) || (m != 0) || (n != 0));
          this.T = new LatLng(parama1.u().e(), parama1.u().d());
          k();
          return;
        } while (n != 0);
        l();
        return;
      } while ((n != 0) || (m == 1));
      parama = parama.d();
      j = k;
      if (parama != null)
      {
        j = k;
        if (parama.length > 0) {
          j = a(parama);
        }
      }
      if (this.W == this.h.size())
      {
        m();
        return;
      }
    } while (this.W != j);
    l();
    this.W += 1;
  }
  
  public void onPause()
  {
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
  }
  
  public void onStart()
  {
    super.onStart();
  }
  
  public void onStop()
  {
    super.onStop();
  }
  
  public static abstract interface a
  {
    public abstract void a(List<ba> paramList);
  }
  
  private static enum b
  {
    private b() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/dronemanage/FlightMapFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */