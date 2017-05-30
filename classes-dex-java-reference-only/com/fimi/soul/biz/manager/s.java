package com.fimi.soul.biz.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.m.e;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.entity.FdsMsg;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.SuggestBean;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class s
  extends j
{
  public ArrayList<Bitmap> g = new ArrayList();
  private Context h;
  
  public s(Context paramContext)
  {
    super(paramContext);
    this.h = paramContext;
  }
  
  public PlaneMsg a(final SuggestBean paramSuggestBean, final k paramk)
  {
    this.f.put(Integer.valueOf(1), paramk);
    f localf = f.a(this.h);
    Log.i("bitmapList size is ", this.g.size() + "");
    final int i;
    Iterator localIterator;
    if ((this.g != null) && (this.g.size() > 0) && (!"0".equals(paramSuggestBean.getUserID())))
    {
      i = this.g.size();
      localIterator = this.g.iterator();
    }
    while (localIterator.hasNext())
    {
      Bitmap localBitmap = (Bitmap)localIterator.next();
      localf.a(localBitmap, new e()
      {
        public void a(long paramAnonymousLong1, long paramAnonymousLong2, String paramAnonymousString) {}
        
        public void a(PlaneMsg paramAnonymousPlaneMsg, File paramAnonymousFile)
        {
          if (paramAnonymousPlaneMsg.isSuccess())
          {
            paramAnonymousPlaneMsg = (FdsMsg)paramAnonymousPlaneMsg.getData();
            paramSuggestBean.getList().add(paramAnonymousPlaneMsg.getUrl());
            if (paramSuggestBean.getList().size() == i) {
              x.b(new j.a(s.this, 1, paramSuggestBean, paramk));
            }
            return;
          }
          Log.i("suguest fds :", "false");
        }
      });
      if ((localBitmap != null) && (localBitmap.isRecycled()))
      {
        localBitmap.recycle();
        continue;
        x.b(new j.a(this, 1, paramSuggestBean, paramk));
      }
    }
    return this.e;
  }
  
  public void a(Bitmap paramBitmap)
  {
    this.g.add(paramBitmap);
  }
  
  public ArrayList<Bitmap> b()
  {
    return this.g;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/manager/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */