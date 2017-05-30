package com.google.android.gms.b;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import java.util.List;

public abstract interface d
{
  @Deprecated
  public abstract a a(g paramg, a parama);
  
  @Deprecated
  public abstract i<Status> a(g paramg, Activity paramActivity, Intent paramIntent);
  
  @Deprecated
  public abstract i<Status> a(g paramg, Activity paramActivity, Intent paramIntent, String paramString, Uri paramUri, List<b> paramList);
  
  @Deprecated
  public abstract i<Status> a(g paramg, Activity paramActivity, Uri paramUri);
  
  @Deprecated
  public abstract i<Status> a(g paramg, Activity paramActivity, Uri paramUri1, String paramString, Uri paramUri2, List<b> paramList);
  
  public abstract i<Status> b(g paramg, a parama);
  
  public abstract i<Status> c(g paramg, a parama);
  
  @Deprecated
  public static abstract interface a
  {
    public abstract i<Status> a();
    
    public abstract i<Status> a(g paramg);
  }
  
  @Deprecated
  public static final class b
  {
    public final Uri a;
    public final Uri b;
    public final int c;
    
    public b(Uri paramUri1, Uri paramUri2, View paramView)
    {
      this.a = paramUri1;
      this.b = paramUri2;
      this.c = paramView.getId();
    }
    
    public b(Uri paramUri, View paramView)
    {
      this(paramUri, null, paramView);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */