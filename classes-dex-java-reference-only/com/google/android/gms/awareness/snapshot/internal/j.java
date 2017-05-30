package com.google.android.gms.awareness.snapshot.internal;

import android.location.Location;
import com.google.android.gms.awareness.snapshot.c;
import com.google.android.gms.awareness.state.BeaconState;
import com.google.android.gms.awareness.state.BeaconState.TypeFilter;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.k;
import com.google.android.gms.contextmanager.internal.c.b;
import com.google.android.gms.internal.su;
import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class j
  implements com.google.android.gms.awareness.e
{
  private i<com.google.android.gms.awareness.snapshot.a> a(com.google.android.gms.common.api.g paramg, ArrayList<BeaconStateImpl.TypeFilterImpl> paramArrayList)
  {
    new su(paramg.a(a(paramg, 10003, paramArrayList)))
    {
      protected com.google.android.gms.awareness.snapshot.a a(final m paramAnonymousm)
      {
        new com.google.android.gms.awareness.snapshot.a()
        {
          public Status a()
          {
            return paramAnonymousm.a();
          }
          
          public BeaconState b()
          {
            if (paramAnonymousm.b() == null) {
              return null;
            }
            return paramAnonymousm.b().b();
          }
        };
      }
    };
  }
  
  private static c.b a(com.google.android.gms.common.api.g paramg, final int paramInt)
  {
    new c.b(paramg)
    {
      protected void a(com.google.android.gms.contextmanager.internal.d paramAnonymousd)
      {
        paramAnonymousd.a(this, new SnapshotRequest(paramInt, null));
      }
    };
  }
  
  private static c.b a(com.google.android.gms.common.api.g paramg, final int paramInt, final ArrayList<BeaconStateImpl.TypeFilterImpl> paramArrayList)
  {
    new c.b(paramg)
    {
      protected void a(com.google.android.gms.contextmanager.internal.d paramAnonymousd)
      {
        paramAnonymousd.a(this, new SnapshotRequest(paramInt, paramArrayList));
      }
    };
  }
  
  private static ArrayList<BeaconStateImpl.TypeFilterImpl> a(Collection<BeaconState.TypeFilter> paramCollection)
  {
    com.google.android.gms.common.internal.d.a(paramCollection, "beaconTypes cannot be null");
    if (paramCollection.size() > 0) {}
    ArrayList localArrayList;
    for (boolean bool = true;; bool = false)
    {
      com.google.android.gms.common.internal.d.b(bool, "beaconTypes must not be empty");
      localArrayList = new ArrayList();
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext()) {
        localArrayList.add((BeaconStateImpl.TypeFilterImpl)paramCollection.next());
      }
    }
    return localArrayList;
  }
  
  private static ArrayList<BeaconStateImpl.TypeFilterImpl> a(BeaconState.TypeFilter... paramVarArgs)
  {
    int i = 0;
    com.google.android.gms.common.internal.d.a(paramVarArgs, "beaconTypes cannot be null");
    if (paramVarArgs.length > 0) {}
    ArrayList localArrayList;
    for (boolean bool = true;; bool = false)
    {
      com.google.android.gms.common.internal.d.b(bool, "beaconTypes must not be empty");
      localArrayList = new ArrayList();
      int j = paramVarArgs.length;
      while (i < j)
      {
        localArrayList.add((BeaconStateImpl.TypeFilterImpl)paramVarArgs[i]);
        i += 1;
      }
    }
    return localArrayList;
  }
  
  public i<com.google.android.gms.awareness.snapshot.b> a(com.google.android.gms.common.api.g paramg)
  {
    new su(paramg.a(a(paramg, 10002)))
    {
      protected com.google.android.gms.awareness.snapshot.b a(final m paramAnonymousm)
      {
        new com.google.android.gms.awareness.snapshot.b()
        {
          public Status a()
          {
            return paramAnonymousm.a();
          }
          
          public ActivityRecognitionResult b()
          {
            if (paramAnonymousm.b() == null) {
              return null;
            }
            return paramAnonymousm.b().a();
          }
        };
      }
    };
  }
  
  public i<com.google.android.gms.awareness.snapshot.a> a(com.google.android.gms.common.api.g paramg, Collection<BeaconState.TypeFilter> paramCollection)
  {
    return a(paramg, a(paramCollection));
  }
  
  public i<com.google.android.gms.awareness.snapshot.a> a(com.google.android.gms.common.api.g paramg, BeaconState.TypeFilter... paramVarArgs)
  {
    return a(paramg, a(paramVarArgs));
  }
  
  public i<c> b(com.google.android.gms.common.api.g paramg)
  {
    new su(paramg.a(a(paramg, 10004)))
    {
      protected c a(final m paramAnonymousm)
      {
        new c()
        {
          public Status a()
          {
            return paramAnonymousm.a();
          }
          
          public com.google.android.gms.awareness.state.a b()
          {
            if (paramAnonymousm.b() == null) {
              return null;
            }
            return paramAnonymousm.b().c();
          }
        };
      }
    };
  }
  
  public i<com.google.android.gms.awareness.snapshot.d> c(com.google.android.gms.common.api.g paramg)
  {
    new su(paramg.a(a(paramg, 10005)))
    {
      protected com.google.android.gms.awareness.snapshot.d a(final m paramAnonymousm)
      {
        new com.google.android.gms.awareness.snapshot.d()
        {
          public Status a()
          {
            return paramAnonymousm.a();
          }
          
          public Location b()
          {
            if (paramAnonymousm.b() == null) {
              return null;
            }
            return paramAnonymousm.b().d();
          }
        };
      }
    };
  }
  
  public i<com.google.android.gms.awareness.snapshot.e> d(com.google.android.gms.common.api.g paramg)
  {
    new su(paramg.a(a(paramg, 10006)))
    {
      protected com.google.android.gms.awareness.snapshot.e a(final m paramAnonymousm)
      {
        new com.google.android.gms.awareness.snapshot.e()
        {
          private boolean c = false;
          private List<com.google.android.gms.location.places.g> d = null;
          
          public Status a()
          {
            return paramAnonymousm.a();
          }
          
          public List<com.google.android.gms.location.places.g> b()
          {
            List localList = null;
            if (this.c) {
              localObject1 = this.d;
            }
            DataHolder localDataHolder;
            do
            {
              do
              {
                return (List<com.google.android.gms.location.places.g>)localObject1;
                this.c = true;
                localObject1 = localList;
              } while (paramAnonymousm.b() == null);
              localDataHolder = paramAnonymousm.b().f();
              localObject1 = localList;
            } while (localDataHolder == null);
            Object localObject1 = new f(localDataHolder);
            try
            {
              int i = ((f)localObject1).c();
              if (i <= 0) {
                return null;
              }
              this.d = ((PlacesData)((k)localObject1).a(0)).a();
              localList = this.d;
              return localList;
            }
            finally
            {
              ((f)localObject1).b();
            }
          }
        };
      }
    };
  }
  
  public i<com.google.android.gms.awareness.snapshot.f> e(com.google.android.gms.common.api.g paramg)
  {
    new su(paramg.a(a(paramg, 10007)))
    {
      protected com.google.android.gms.awareness.snapshot.f a(final m paramAnonymousm)
      {
        new com.google.android.gms.awareness.snapshot.f()
        {
          public Status a()
          {
            return paramAnonymousm.a();
          }
          
          public com.google.android.gms.awareness.state.b b()
          {
            if (paramAnonymousm.b() == null) {
              return null;
            }
            return paramAnonymousm.b().i();
          }
        };
      }
    };
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/awareness/snapshot/internal/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */