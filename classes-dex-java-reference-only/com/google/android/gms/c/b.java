package com.google.android.gms.c;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.t;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class b<T extends a>
{
  private T a;
  private Bundle b;
  private LinkedList<a> c;
  private final g<T> d = new g()
  {
    public void a(T paramAnonymousT)
    {
      b.a(b.this, paramAnonymousT);
      paramAnonymousT = b.a(b.this).iterator();
      while (paramAnonymousT.hasNext()) {
        ((b.a)paramAnonymousT.next()).a(b.b(b.this));
      }
      b.a(b.this).clear();
      b.a(b.this, null);
    }
  };
  
  private void a(int paramInt)
  {
    while ((!this.c.isEmpty()) && (((a)this.c.getLast()).a() >= paramInt)) {
      this.c.removeLast();
    }
  }
  
  private void a(Bundle paramBundle, a parama)
  {
    if (this.a != null)
    {
      parama.a(this.a);
      return;
    }
    if (this.c == null) {
      this.c = new LinkedList();
    }
    this.c.add(parama);
    if (paramBundle != null)
    {
      if (this.b != null) {
        break label76;
      }
      this.b = ((Bundle)paramBundle.clone());
    }
    for (;;)
    {
      a(this.d);
      return;
      label76:
      this.b.putAll(paramBundle);
    }
  }
  
  public static void b(FrameLayout paramFrameLayout)
  {
    Context localContext = paramFrameLayout.getContext();
    final int i = e.a(localContext);
    String str2 = t.c(localContext, i);
    String str1 = t.e(localContext, i);
    LinearLayout localLinearLayout = new LinearLayout(paramFrameLayout.getContext());
    localLinearLayout.setOrientation(1);
    localLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    paramFrameLayout.addView(localLinearLayout);
    paramFrameLayout = new TextView(paramFrameLayout.getContext());
    paramFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    paramFrameLayout.setText(str2);
    localLinearLayout.addView(paramFrameLayout);
    if (str1 != null)
    {
      paramFrameLayout = new Button(localContext);
      paramFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
      paramFrameLayout.setText(str1);
      localLinearLayout.addView(paramFrameLayout);
      paramFrameLayout.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          b.this.startActivity(e.b(i));
        }
      });
    }
  }
  
  public View a(final LayoutInflater paramLayoutInflater, final ViewGroup paramViewGroup, final Bundle paramBundle)
  {
    final FrameLayout localFrameLayout = new FrameLayout(paramLayoutInflater.getContext());
    a(paramBundle, new a()
    {
      public int a()
      {
        return 2;
      }
      
      public void a(a paramAnonymousa)
      {
        localFrameLayout.removeAllViews();
        localFrameLayout.addView(b.b(b.this).a(paramLayoutInflater, paramViewGroup, paramBundle));
      }
    });
    if (this.a == null) {
      a(localFrameLayout);
    }
    return localFrameLayout;
  }
  
  public T a()
  {
    return this.a;
  }
  
  public void a(final Activity paramActivity, final Bundle paramBundle1, final Bundle paramBundle2)
  {
    a(paramBundle2, new a()
    {
      public int a()
      {
        return 0;
      }
      
      public void a(a paramAnonymousa)
      {
        b.b(b.this).a(paramActivity, paramBundle1, paramBundle2);
      }
    });
  }
  
  public void a(final Bundle paramBundle)
  {
    a(paramBundle, new a()
    {
      public int a()
      {
        return 1;
      }
      
      public void a(a paramAnonymousa)
      {
        b.b(b.this).a(paramBundle);
      }
    });
  }
  
  protected void a(FrameLayout paramFrameLayout)
  {
    b(paramFrameLayout);
  }
  
  protected abstract void a(g<T> paramg);
  
  public void b()
  {
    a(null, new a()
    {
      public int a()
      {
        return 4;
      }
      
      public void a(a paramAnonymousa)
      {
        b.b(b.this).a();
      }
    });
  }
  
  public void b(Bundle paramBundle)
  {
    if (this.a != null) {
      this.a.b(paramBundle);
    }
    while (this.b == null) {
      return;
    }
    paramBundle.putAll(this.b);
  }
  
  public void c()
  {
    a(null, new a()
    {
      public int a()
      {
        return 5;
      }
      
      public void a(a paramAnonymousa)
      {
        b.b(b.this).b();
      }
    });
  }
  
  public void d()
  {
    if (this.a != null)
    {
      this.a.c();
      return;
    }
    a(5);
  }
  
  public void e()
  {
    if (this.a != null)
    {
      this.a.d();
      return;
    }
    a(4);
  }
  
  public void f()
  {
    if (this.a != null)
    {
      this.a.e();
      return;
    }
    a(2);
  }
  
  public void g()
  {
    if (this.a != null)
    {
      this.a.f();
      return;
    }
    a(1);
  }
  
  public void h()
  {
    if (this.a != null) {
      this.a.g();
    }
  }
  
  private static abstract interface a
  {
    public abstract int a();
    
    public abstract void a(a parama);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */