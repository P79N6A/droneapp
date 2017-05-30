package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

@aaa
abstract class acw
{
  private final WeakReference<View> a;
  
  public acw(View paramView)
  {
    this.a = new WeakReference(paramView);
  }
  
  public final void a()
  {
    ViewTreeObserver localViewTreeObserver = c();
    if (localViewTreeObserver != null) {
      a(localViewTreeObserver);
    }
  }
  
  protected abstract void a(ViewTreeObserver paramViewTreeObserver);
  
  public final void b()
  {
    ViewTreeObserver localViewTreeObserver = c();
    if (localViewTreeObserver != null) {
      b(localViewTreeObserver);
    }
  }
  
  protected abstract void b(ViewTreeObserver paramViewTreeObserver);
  
  protected ViewTreeObserver c()
  {
    Object localObject = (View)this.a.get();
    if (localObject == null) {
      localObject = null;
    }
    ViewTreeObserver localViewTreeObserver;
    do
    {
      return (ViewTreeObserver)localObject;
      localViewTreeObserver = ((View)localObject).getViewTreeObserver();
      if (localViewTreeObserver == null) {
        break;
      }
      localObject = localViewTreeObserver;
    } while (localViewTreeObserver.isAlive());
    return null;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/acw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */