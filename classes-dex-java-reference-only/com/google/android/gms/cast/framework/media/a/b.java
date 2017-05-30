package com.google.android.gms.cast.framework.media.a;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.google.android.gms.R.string;
import com.google.android.gms.cast.framework.d;
import com.google.android.gms.cast.framework.j;
import com.google.android.gms.cast.framework.k;
import com.google.android.gms.cast.framework.l;
import com.google.android.gms.cast.framework.media.c.a;
import com.google.android.gms.internal.afs;
import com.google.android.gms.internal.aft;
import com.google.android.gms.internal.afu;
import com.google.android.gms.internal.afv;
import com.google.android.gms.internal.afx;
import com.google.android.gms.internal.afy;
import com.google.android.gms.internal.afz;
import com.google.android.gms.internal.aga;
import com.google.android.gms.internal.agb;
import com.google.android.gms.internal.agc;
import com.google.android.gms.internal.agd;
import com.google.android.gms.internal.age;
import com.google.android.gms.internal.agf;
import com.google.android.gms.internal.agg;
import com.google.android.gms.internal.agi;
import com.google.android.gms.internal.agj;
import com.google.android.gms.internal.agk;
import com.google.android.gms.internal.agl;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class b
  implements l<d>, c.a
{
  private final Activity a;
  private final k b;
  private final Map<View, a> c = new HashMap();
  private final Set<agj> d = new HashSet();
  private c.a e;
  private com.google.android.gms.cast.framework.media.c f;
  
  public b(Activity paramActivity)
  {
    this.a = paramActivity;
    this.b = com.google.android.gms.cast.framework.c.a(paramActivity).b();
    this.b.a(this, d.class);
    c(this.b.b());
  }
  
  private void b(View paramView, a parama)
  {
    this.c.put(paramView, parama);
    if (f())
    {
      parama.a(this.b.b());
      j();
    }
  }
  
  private void c(j paramj)
  {
    if ((f()) || (!(paramj instanceof d)) || (!paramj.o())) {}
    do
    {
      return;
      paramj = (d)paramj;
      this.f = paramj.a();
    } while (this.f == null);
    this.f.a(this);
    Iterator localIterator = this.c.values().iterator();
    while (localIterator.hasNext()) {
      ((a)localIterator.next()).a(paramj);
    }
    j();
  }
  
  private void i()
  {
    if (!f()) {
      return;
    }
    Iterator localIterator = this.c.values().iterator();
    while (localIterator.hasNext()) {
      ((a)localIterator.next()).b();
    }
    this.f.b(this);
    this.f = null;
  }
  
  private void j()
  {
    Iterator localIterator = this.c.values().iterator();
    while (localIterator.hasNext()) {
      ((a)localIterator.next()).c();
    }
  }
  
  public void a()
  {
    j();
    if (this.e != null) {
      this.e.a();
    }
  }
  
  public void a(View paramView)
  {
    b(paramView, new afx(paramView));
  }
  
  public void a(View paramView, int paramInt)
  {
    b(paramView, new agf(paramView, paramInt));
  }
  
  public void a(View paramView, long paramLong)
  {
    b(paramView, new age(paramView, paramLong));
  }
  
  public void a(View paramView, a parama)
  {
    b(paramView, parama);
  }
  
  public void a(ImageView paramImageView)
  {
    b(paramImageView, new aga(paramImageView, this.a));
  }
  
  public void a(ImageView paramImageView, int paramInt1, @DrawableRes int paramInt2)
  {
    b(paramImageView, new afu(paramImageView, this.a, paramInt1, paramInt2));
  }
  
  public void a(ImageView paramImageView, int paramInt, View paramView)
  {
    b(paramImageView, new afu(paramImageView, this.a, paramInt, paramView));
  }
  
  public void a(@NonNull ImageView paramImageView, @NonNull Drawable paramDrawable1, @NonNull Drawable paramDrawable2, Drawable paramDrawable3, View paramView, boolean paramBoolean)
  {
    b(paramImageView, new agb(paramImageView, this.a, paramDrawable1, paramDrawable2, paramDrawable3, paramView, paramBoolean));
  }
  
  public void a(ProgressBar paramProgressBar)
  {
    a(paramProgressBar, 1000L);
  }
  
  public void a(ProgressBar paramProgressBar, long paramLong)
  {
    b(paramProgressBar, new agc(paramProgressBar, paramLong));
  }
  
  public void a(SeekBar paramSeekBar)
  {
    a(paramSeekBar, 1000L);
  }
  
  public void a(SeekBar paramSeekBar, long paramLong)
  {
    b(paramSeekBar, new agd(paramSeekBar, paramLong, new SeekBar.OnSeekBarChangeListener()
    {
      public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        if (paramAnonymousBoolean)
        {
          paramAnonymousSeekBar = b.a(b.this).iterator();
          while (paramAnonymousSeekBar.hasNext()) {
            ((agj)paramAnonymousSeekBar.next()).a(paramAnonymousInt);
          }
        }
      }
      
      public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
        paramAnonymousSeekBar = b.a(b.this).iterator();
        while (paramAnonymousSeekBar.hasNext()) {
          ((agj)paramAnonymousSeekBar.next()).a(false);
        }
      }
      
      public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
        paramAnonymousSeekBar = b.a(b.this).iterator();
        while (paramAnonymousSeekBar.hasNext()) {
          ((agj)paramAnonymousSeekBar.next()).a(true);
        }
      }
    }));
  }
  
  public void a(TextView paramTextView)
  {
    b(paramTextView, new agi(paramTextView, this.a.getString(R.string.cast_invalid_stream_duration_text), null));
  }
  
  public void a(TextView paramTextView, View paramView)
  {
    b(paramTextView, new agi(paramTextView, this.a.getString(R.string.cast_invalid_stream_duration_text), paramView));
  }
  
  public void a(TextView paramTextView, String paramString)
  {
    a(paramTextView, Collections.singletonList(paramString));
  }
  
  public void a(TextView paramTextView, List<String> paramList)
  {
    b(paramTextView, new afz(paramTextView, paramList));
  }
  
  public void a(TextView paramTextView, boolean paramBoolean)
  {
    a(paramTextView, paramBoolean, 1000L);
  }
  
  public void a(TextView paramTextView, boolean paramBoolean, long paramLong)
  {
    agj localagj = new agj(paramTextView, paramLong, this.a.getString(R.string.cast_invalid_stream_position_text));
    if (paramBoolean) {
      this.d.add(localagj);
    }
    b(paramTextView, localagj);
  }
  
  public void a(d paramd) {}
  
  public void a(d paramd, int paramInt)
  {
    i();
  }
  
  public void a(d paramd, String paramString)
  {
    c(paramd);
  }
  
  public void a(d paramd, boolean paramBoolean)
  {
    c(paramd);
  }
  
  public void a(c.a parama)
  {
    this.e = parama;
  }
  
  public void b()
  {
    j();
    if (this.e != null) {
      this.e.b();
    }
  }
  
  public void b(View paramView)
  {
    b(paramView, new afv(paramView, this.a));
  }
  
  public void b(View paramView, int paramInt)
  {
    b(paramView, new agg(paramView, paramInt));
  }
  
  public void b(View paramView, long paramLong)
  {
    a(paramView, -paramLong);
  }
  
  public void b(ImageView paramImageView, int paramInt1, @DrawableRes int paramInt2)
  {
    b(paramImageView, new aft(paramImageView, this.a, paramInt1, paramInt2));
  }
  
  public void b(TextView paramTextView, String paramString)
  {
    b(paramTextView, Collections.singletonList(paramString));
  }
  
  public void b(TextView paramTextView, List<String> paramList)
  {
    b(paramTextView, new afy(paramTextView, paramList));
  }
  
  public void b(d paramd) {}
  
  public void b(d paramd, int paramInt)
  {
    i();
  }
  
  public void b(d paramd, String paramString) {}
  
  public void c()
  {
    j();
    if (this.e != null) {
      this.e.c();
    }
  }
  
  public void c(View paramView)
  {
    b(paramView, new afs(paramView, this.a));
  }
  
  public void c(View paramView, int paramInt)
  {
    b(paramView, new agl(paramView, paramInt));
  }
  
  public void c(d paramd, int paramInt)
  {
    i();
  }
  
  public void d()
  {
    j();
    if (this.e != null) {
      this.e.d();
    }
  }
  
  public void d(View paramView, int paramInt)
  {
    b(paramView, new agk(paramView, paramInt));
  }
  
  public void d(d paramd, int paramInt) {}
  
  public void e()
  {
    Iterator localIterator = this.c.values().iterator();
    while (localIterator.hasNext()) {
      ((a)localIterator.next()).d();
    }
    if (this.e != null) {
      this.e.e();
    }
  }
  
  public boolean f()
  {
    return this.f != null;
  }
  
  public com.google.android.gms.cast.framework.media.c g()
  {
    return this.f;
  }
  
  public void h()
  {
    i();
    this.c.clear();
    this.b.b(this, d.class);
    this.e = null;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/media/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */