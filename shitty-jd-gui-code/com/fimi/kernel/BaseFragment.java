package com.fimi.kernel;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fimi.kernel.c.a;
import com.fimi.kernel.utils.x;
import com.fimi.kernel.view.b;

public abstract class BaseFragment
  extends Fragment
{
  private Handler a;
  
  public b a()
  {
    return c.b();
  }
  
  public void a(Message paramMessage) {}
  
  public void a(Runnable paramRunnable)
  {
    x.a(paramRunnable);
  }
  
  public a b()
  {
    return c.c();
  }
  
  protected Handler c()
  {
    return this.a;
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    this.a = new a();
    return super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
  }
  
  class a
    extends Handler
  {
    a() {}
    
    public void handleMessage(Message paramMessage)
    {
      BaseFragment.this.a(paramMessage);
      super.handleMessage(paramMessage);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/BaseFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */