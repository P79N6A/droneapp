package com.fimi.soul.receiver;

import android.content.Context;
import com.fimi.kernel.d.b;
import com.fimi.kernel.utils.x;

public class SpeekSignReceiver
  extends NetworkStateReceiver
{
  public void a(final NetworkStateReceiver.a parama, Context paramContext)
  {
    if ((parama == NetworkStateReceiver.a.a) || (parama == NetworkStateReceiver.a.b))
    {
      parama = b.a(paramContext);
      if (!parama.d()) {
        x.b(new Runnable()
        {
          public void run()
          {
            parama.a();
          }
        });
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/receiver/SpeekSignReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */