package com.google.android.gms.nearby.messages;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;

public abstract interface f
{
  @Deprecated
  public abstract i<Status> a(g paramg);
  
  public abstract i<Status> a(g paramg, PendingIntent paramPendingIntent);
  
  public abstract i<Status> a(g paramg, PendingIntent paramPendingIntent, n paramn);
  
  public abstract i<Status> a(g paramg, Message paramMessage);
  
  public abstract i<Status> a(g paramg, Message paramMessage, k paramk);
  
  public abstract i<Status> a(g paramg, e parame);
  
  public abstract i<Status> a(g paramg, e parame, n paramn);
  
  public abstract i<Status> a(g paramg, l paraml);
  
  public abstract void a(Intent paramIntent, e parame);
  
  public abstract i<Status> b(g paramg, PendingIntent paramPendingIntent);
  
  public abstract i<Status> b(g paramg, Message paramMessage);
  
  public abstract i<Status> b(g paramg, e parame);
  
  public abstract i<Status> b(g paramg, l paraml);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/nearby/messages/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */