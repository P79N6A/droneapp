package com.google.android.gms.cast.framework;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter;
import android.view.KeyEvent;
import com.google.android.gms.c.e;
import com.google.android.gms.common.util.s;
import com.google.android.gms.internal.afc;
import com.google.android.gms.internal.afd;
import com.google.android.gms.internal.afm;
import com.google.android.gms.internal.zznv;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class c
{
  public static final String a = "com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME";
  private static final com.google.android.gms.cast.internal.m b = new com.google.android.gms.cast.internal.m("CastContext");
  private static a c;
  private static c d;
  private final Context e;
  private final t f;
  private final k g;
  private final q h;
  private final CastOptions i;
  private afm j;
  
  private c(Context paramContext, CastOptions paramCastOptions, List<m> paramList)
  {
    this.e = paramContext.getApplicationContext();
    this.i = paramCastOptions;
    this.j = new afm(MediaRouter.getInstance(this.e));
    paramContext = new HashMap();
    Object localObject2 = new afd(this.e, paramCastOptions, this.j);
    paramContext.put(((afd)localObject2).b(), ((afd)localObject2).d());
    if (paramList != null)
    {
      paramList = paramList.iterator();
      if (paramList.hasNext())
      {
        localObject2 = (m)paramList.next();
        com.google.android.gms.common.internal.d.a(localObject2, "Additional SessionProvider must not be null.");
        String str = com.google.android.gms.common.internal.d.a(((m)localObject2).b(), "Category for SessionProvider must not be null or empty string.");
        if (!paramContext.containsKey(str)) {}
        for (boolean bool = true;; bool = false)
        {
          com.google.android.gms.common.internal.d.b(bool, String.format("SessionProvider for category %s already added", new Object[] { str }));
          paramContext.put(str, ((m)localObject2).d());
          break;
        }
      }
    }
    this.f = afc.a(this.e, paramCastOptions, this.j, paramContext);
    try
    {
      paramContext = this.f.d();
      if (paramContext == null)
      {
        paramContext = null;
        this.h = paramContext;
      }
    }
    catch (RemoteException paramContext)
    {
      try
      {
        for (;;)
        {
          paramContext = this.f.c();
          if (paramContext != null) {
            break;
          }
          paramContext = (Context)localObject1;
          this.g = paramContext;
          return;
          paramContext = paramContext;
          b.a(paramContext, "Unable to call %s on %s.", new Object[] { "getDiscoveryManagerImpl", t.class.getSimpleName() });
          paramContext = null;
        }
        paramContext = new q(paramContext);
      }
      catch (RemoteException paramContext)
      {
        for (;;)
        {
          b.a(paramContext, "Unable to call %s on %s.", new Object[] { "getSessionManagerImpl", t.class.getSimpleName() });
          paramContext = null;
          continue;
          paramContext = new k(paramContext);
        }
      }
    }
  }
  
  public static c a(@NonNull Context paramContext)
  {
    com.google.android.gms.common.internal.d.b("getSharedInstance must be called from the main thread.");
    if (d == null)
    {
      i locali = b(paramContext.getApplicationContext());
      d = new c(paramContext, locali.a(paramContext.getApplicationContext()), locali.b(paramContext.getApplicationContext()));
      if (s.d())
      {
        c = new a(paramContext.getApplicationContext());
        ((Application)paramContext.getApplicationContext()).registerActivityLifecycleCallbacks(c);
      }
    }
    return d;
  }
  
  private boolean a(d paramd, double paramDouble, boolean paramBoolean)
  {
    double d1 = 1.0D;
    if (paramBoolean) {}
    try
    {
      paramDouble = paramd.h() + paramDouble;
      if (paramDouble <= 1.0D) {
        break label54;
      }
      paramDouble = d1;
    }
    catch (IllegalStateException paramd)
    {
      b.e("Unable to call CastSession.setVolume(double).", new Object[] { paramd });
      return true;
    }
    catch (IOException paramd)
    {
      for (;;) {}
    }
    paramd.a(paramDouble);
    return true;
  }
  
  private static i b(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128).metaData.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
      if (paramContext == null) {
        throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      throw new IllegalStateException("Failed to initialize CastContext.", paramContext);
      paramContext = (i)Class.forName(paramContext).newInstance();
      return paramContext;
    }
    catch (ClassNotFoundException paramContext)
    {
      for (;;) {}
    }
    catch (InstantiationException paramContext)
    {
      for (;;) {}
    }
    catch (NullPointerException paramContext)
    {
      for (;;) {}
    }
    catch (IllegalAccessException paramContext)
    {
      for (;;) {}
    }
  }
  
  public CastOptions a()
  {
    com.google.android.gms.common.internal.d.b("getCastOptions must be called from the main thread.");
    return this.i;
  }
  
  public void a(Activity paramActivity)
  {
    com.google.android.gms.common.internal.d.b("onActivityResumed must be called from the main thread.");
    try
    {
      this.f.a(com.google.android.gms.c.f.a(paramActivity));
      return;
    }
    catch (RemoteException paramActivity)
    {
      b.a(paramActivity, "Unable to call %s on %s.", new Object[] { "onActivityResumed", t.class.getSimpleName() });
    }
  }
  
  public void a(@NonNull FragmentActivity paramFragmentActivity, Bundle paramBundle)
  {
    if (!s.d()) {
      zznv.a(paramFragmentActivity, paramBundle);
    }
  }
  
  public void a(a parama)
  {
    com.google.android.gms.common.internal.d.b("addAppVisibilityListener must be called from the main thread.");
    com.google.android.gms.common.internal.d.a(parama);
    try
    {
      this.f.a(new n(parama));
      return;
    }
    catch (RemoteException parama)
    {
      b.a(parama, "Unable to call %s on %s.", new Object[] { "addVisibilityChangeListener", t.class.getSimpleName() });
    }
  }
  
  public void a(f paramf)
  {
    com.google.android.gms.common.internal.d.b("addCastStateListener must be called from the main thread.");
    com.google.android.gms.common.internal.d.a(paramf);
    this.g.a(paramf);
  }
  
  public boolean a(KeyEvent paramKeyEvent)
  {
    com.google.android.gms.common.internal.d.b("onDispatchVolumeKeyEventBeforeJellyBean must be called from the main thread.");
    if (s.e()) {}
    label12:
    d locald;
    double d1;
    boolean bool;
    do
    {
      do
      {
        return false;
        locald = this.g.b();
      } while ((locald == null) || (!locald.o()));
      d1 = a().i();
      if (paramKeyEvent.getAction() == 0) {}
      for (bool = true;; bool = false) {
        switch (paramKeyEvent.getKeyCode())
        {
        default: 
          return false;
        case 24: 
          if (!a(locald, d1, bool)) {
            break label12;
          }
          return true;
        }
      }
    } while (!a(locald, -d1, bool));
    return true;
  }
  
  public k b()
  {
    com.google.android.gms.common.internal.d.b("getSessionManager must be called from the main thread.");
    return this.g;
  }
  
  public void b(Activity paramActivity)
  {
    com.google.android.gms.common.internal.d.b("onActivityPaused must be called from the main thread.");
    try
    {
      this.f.b(com.google.android.gms.c.f.a(paramActivity));
      return;
    }
    catch (RemoteException paramActivity)
    {
      b.a(paramActivity, "Unable to call %s on %s.", new Object[] { "onActivityPaused", t.class.getSimpleName() });
    }
  }
  
  public void b(a parama)
  {
    com.google.android.gms.common.internal.d.b("removeAppVisibilityListener must be called from the main thread.");
    if (parama == null) {
      return;
    }
    try
    {
      this.f.b(new n(parama));
      return;
    }
    catch (RemoteException parama)
    {
      b.a(parama, "Unable to call %s on %s.", new Object[] { "addVisibilityChangeListener", t.class.getSimpleName() });
    }
  }
  
  public void b(f paramf)
  {
    com.google.android.gms.common.internal.d.b("addCastStateListener must be called from the main thread.");
    if (paramf == null) {
      return;
    }
    this.g.b(paramf);
  }
  
  public MediaRouteSelector c()
  {
    com.google.android.gms.common.internal.d.b("getMergedSelector must be called from the main thread.");
    try
    {
      MediaRouteSelector localMediaRouteSelector = MediaRouteSelector.fromBundle(this.f.a());
      return localMediaRouteSelector;
    }
    catch (RemoteException localRemoteException)
    {
      b.a(localRemoteException, "Unable to call %s on %s.", new Object[] { "getMergedSelectorAsBundle", t.class.getSimpleName() });
    }
    return null;
  }
  
  public boolean d()
  {
    com.google.android.gms.common.internal.d.b("isAppVisible must be called from the main thread.");
    try
    {
      boolean bool = this.f.b();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      b.a(localRemoteException, "Unable to call %s on %s.", new Object[] { "isApplicationVisible", t.class.getSimpleName() });
    }
    return false;
  }
  
  public q e()
  {
    com.google.android.gms.common.internal.d.b("getDiscoveryManager must be called from the main thread.");
    return this.h;
  }
  
  public e f()
  {
    try
    {
      e locale = this.f.f();
      return locale;
    }
    catch (RemoteException localRemoteException)
    {
      b.a(localRemoteException, "Unable to call %s on %s.", new Object[] { "getWrappedThis", t.class.getSimpleName() });
    }
    return null;
  }
  
  @TargetApi(14)
  private static class a
    implements Application.ActivityLifecycleCallbacks
  {
    private Context a;
    
    public a(Context paramContext)
    {
      this.a = paramContext.getApplicationContext();
    }
    
    public void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
    
    public void onActivityDestroyed(Activity paramActivity) {}
    
    public void onActivityPaused(Activity paramActivity)
    {
      c.a(this.a).b(paramActivity);
    }
    
    public void onActivityResumed(Activity paramActivity)
    {
      c.a(this.a).a(paramActivity);
    }
    
    public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
    
    public void onActivityStarted(Activity paramActivity) {}
    
    public void onActivityStopped(Activity paramActivity) {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */