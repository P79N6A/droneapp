package com.fimi.soul.biz.camera.entity;

import com.fimi.soul.biz.camera.c.c;
import com.fimi.soul.biz.camera.d;

public class X11StorageTask
  extends X11Task
{
  public X11StorageTask(d paramd)
  {
    super(paramd);
  }
  
  protected void doNext()
  {
    getContext().r().c(getCurrentKey());
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/camera/entity/X11StorageTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */