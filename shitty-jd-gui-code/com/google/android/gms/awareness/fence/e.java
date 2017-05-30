package com.google.android.gms.awareness.fence;

import android.app.PendingIntent;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation;
import java.util.ArrayList;

public abstract interface e
{
  public static class a
  {
    private final ArrayList<UpdateFenceOperation> a = new ArrayList();
    
    public a a(PendingIntent paramPendingIntent)
    {
      d.a(paramPendingIntent);
      this.a.add(UpdateFenceOperation.a(paramPendingIntent));
      return this;
    }
    
    public a a(String paramString)
    {
      d.a(paramString);
      this.a.add(UpdateFenceOperation.a(paramString));
      return this;
    }
    
    public a a(String paramString, AwarenessFence paramAwarenessFence, PendingIntent paramPendingIntent)
    {
      d.a(paramString);
      d.a(paramAwarenessFence);
      d.a(paramPendingIntent);
      this.a.add(UpdateFenceOperation.a(paramString, (ContextFenceStub)paramAwarenessFence, paramPendingIntent));
      return this;
    }
    
    public e a()
    {
      return new FenceUpdateRequestImpl(this.a);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/awareness/fence/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */