package com.google.android.gms.c;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

public final class i
  extends d.a
{
  private Fragment a;
  
  private i(Fragment paramFragment)
  {
    this.a = paramFragment;
  }
  
  public static i a(Fragment paramFragment)
  {
    if (paramFragment != null) {
      return new i(paramFragment);
    }
    return null;
  }
  
  public e a()
  {
    return f.a(this.a.getActivity());
  }
  
  public void a(Intent paramIntent)
  {
    this.a.startActivity(paramIntent);
  }
  
  public void a(Intent paramIntent, int paramInt)
  {
    this.a.startActivityForResult(paramIntent, paramInt);
  }
  
  public void a(e parame)
  {
    parame = (View)f.a(parame);
    this.a.registerForContextMenu(parame);
  }
  
  public void a(boolean paramBoolean)
  {
    this.a.setHasOptionsMenu(paramBoolean);
  }
  
  public Bundle b()
  {
    return this.a.getArguments();
  }
  
  public void b(e parame)
  {
    parame = (View)f.a(parame);
    this.a.unregisterForContextMenu(parame);
  }
  
  public void b(boolean paramBoolean)
  {
    this.a.setMenuVisibility(paramBoolean);
  }
  
  public int c()
  {
    return this.a.getId();
  }
  
  public void c(boolean paramBoolean)
  {
    this.a.setRetainInstance(paramBoolean);
  }
  
  public d d()
  {
    return a(this.a.getParentFragment());
  }
  
  public void d(boolean paramBoolean)
  {
    this.a.setUserVisibleHint(paramBoolean);
  }
  
  public e e()
  {
    return f.a(this.a.getResources());
  }
  
  public boolean f()
  {
    return this.a.getRetainInstance();
  }
  
  public String g()
  {
    return this.a.getTag();
  }
  
  public d h()
  {
    return a(this.a.getTargetFragment());
  }
  
  public int i()
  {
    return this.a.getTargetRequestCode();
  }
  
  public boolean j()
  {
    return this.a.getUserVisibleHint();
  }
  
  public e k()
  {
    return f.a(this.a.getView());
  }
  
  public boolean l()
  {
    return this.a.isAdded();
  }
  
  public boolean m()
  {
    return this.a.isDetached();
  }
  
  public boolean n()
  {
    return this.a.isHidden();
  }
  
  public boolean o()
  {
    return this.a.isInLayout();
  }
  
  public boolean p()
  {
    return this.a.isRemoving();
  }
  
  public boolean q()
  {
    return this.a.isResumed();
  }
  
  public boolean r()
  {
    return this.a.isVisible();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/c/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */