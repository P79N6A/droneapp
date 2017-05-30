package com.fimi.soul.biz.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.l.g;
import com.fimi.soul.biz.l.g.a;
import com.fimi.soul.biz.l.h;
import com.fimi.soul.biz.m.e;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.entity.FdsMsg;
import com.fimi.soul.entity.PlaneMsg;
import com.xiaomi.infra.galaxy.fds.android.model.ObjectMetadata;
import com.xiaomi.infra.galaxy.fds.android.model.ProgressListener;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class f
  implements Handler.Callback, g.a
{
  private static f a = null;
  private static final int b = 0;
  private static final int c = 1;
  private static final int d = 2;
  private static final int e = 3;
  private static final int f = 4;
  private static final int g = 5;
  private List<h> h = new CopyOnWriteArrayList();
  private g i;
  private Handler j;
  private HashMap<Integer, k> k;
  private Context l = null;
  
  public f(Context paramContext)
  {
    this.i = new g(paramContext);
    this.j = new Handler(paramContext.getMainLooper(), this);
    this.l = paramContext;
    this.k = new HashMap();
    this.i.a(this);
  }
  
  public static f a(Context paramContext)
  {
    if (a == null) {
      a = new f(paramContext);
    }
    return a;
  }
  
  public void a()
  {
    if ((this.h != null) && (this.h.size() > 0))
    {
      Iterator localIterator = this.h.iterator();
      while (localIterator.hasNext()) {
        ((h)localIterator.next()).d();
      }
      this.h.clear();
    }
  }
  
  public void a(Bitmap paramBitmap, e parame)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.JPEG, 100, localByteArrayOutputStream);
    paramBitmap = new ByteArrayInputStream(localByteArrayOutputStream.toByteArray());
    ObjectMetadata localObjectMetadata = new ObjectMetadata();
    localObjectMetadata.setContentLength(localByteArrayOutputStream.toByteArray().length);
    a(paramBitmap, localObjectMetadata, parame);
  }
  
  public void a(Bitmap paramBitmap, k paramk)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.JPEG, 100, localByteArrayOutputStream);
    paramBitmap = new ByteArrayInputStream(localByteArrayOutputStream.toByteArray());
    ObjectMetadata localObjectMetadata = new ObjectMetadata();
    localObjectMetadata.setContentLength(localByteArrayOutputStream.toByteArray().length);
    a(paramBitmap, localObjectMetadata, paramk);
  }
  
  public void a(h paramh)
  {
    this.h.add(paramh);
  }
  
  public void a(k paramk)
  {
    this.k.put(Integer.valueOf(2), paramk);
    x.b(new a(2, null, null, null));
  }
  
  public void a(File paramFile)
  {
    if ((this.h != null) && (this.h.size() > 0))
    {
      Iterator localIterator = this.h.iterator();
      while (localIterator.hasNext())
      {
        h localh = (h)localIterator.next();
        if (localh.j.getName().equals(paramFile.getName())) {
          localh.c();
        }
      }
    }
  }
  
  public void a(File paramFile, e parame)
  {
    this.k.put(Integer.valueOf(4), parame);
    x.b(new a(4, null, paramFile, null));
  }
  
  public void a(File paramFile, k paramk)
  {
    this.k.put(Integer.valueOf(0), paramk);
    x.b(new a(0, null, paramFile, null));
  }
  
  public void a(InputStream paramInputStream, ObjectMetadata paramObjectMetadata, e parame)
  {
    this.k.put(Integer.valueOf(3), parame);
    x.b(new a(3, paramInputStream, null, paramObjectMetadata));
  }
  
  public void a(InputStream paramInputStream, ObjectMetadata paramObjectMetadata, k paramk)
  {
    this.k.put(Integer.valueOf(1), paramk);
    x.b(new a(1, paramInputStream, null, paramObjectMetadata));
  }
  
  public void b(File paramFile)
  {
    if ((this.h != null) && (this.h.size() > 0))
    {
      Iterator localIterator = this.h.iterator();
      while (localIterator.hasNext())
      {
        h localh = (h)localIterator.next();
        if (localh.j.getName().equals(paramFile.getName()))
        {
          localh.d();
          this.h.remove(localh);
        }
      }
    }
  }
  
  public void b(File paramFile, k paramk)
  {
    this.k.put(Integer.valueOf(5), paramk);
    x.b(new a(5, null, paramFile, null));
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    if ((paramMessage.obj != null) && ((paramMessage.obj instanceof PlaneMsg))) {
      ((k)this.k.get(Integer.valueOf(paramMessage.what))).a((PlaneMsg)paramMessage.obj, ((PlaneMsg)paramMessage.obj).getFile());
    }
    for (;;)
    {
      return false;
      if ((paramMessage.obj != null) && ((paramMessage.obj instanceof FdsMsg))) {
        ((e)this.k.get(Integer.valueOf(paramMessage.what))).a(((FdsMsg)paramMessage.obj).getTransferred(), ((FdsMsg)paramMessage.obj).getTotal(), ((FdsMsg)paramMessage.obj).getFilePath());
      }
    }
  }
  
  class a
    extends ProgressListener
    implements Runnable
  {
    ObjectMetadata a;
    int b;
    private InputStream d;
    private File e;
    
    public a(int paramInt, InputStream paramInputStream, File paramFile, ObjectMetadata paramObjectMetadata)
    {
      this.b = paramInt;
      this.d = paramInputStream;
      this.e = paramFile;
      this.a = paramObjectMetadata;
    }
    
    public void onProgress(long paramLong1, long paramLong2)
    {
      Object localObject = new FdsMsg();
      ((FdsMsg)localObject).setTotal(paramLong2);
      ((FdsMsg)localObject).setTransferred(paramLong1);
      if (this.e != null) {
        ((FdsMsg)localObject).setFilePath(this.e.getAbsolutePath());
      }
      Message localMessage = f.a(f.this).obtainMessage();
      localMessage.what = this.b;
      localMessage.obj = localObject;
      localObject = new Bundle();
      if (this.e != null) {
        ((Bundle)localObject).putString("file_path", this.e.getAbsolutePath());
      }
      localMessage.setData((Bundle)localObject);
      f.a(f.this).sendMessage(localMessage);
    }
    
    public void run()
    {
      Message localMessage = f.a(f.this).obtainMessage();
      Object localObject1;
      if (this.b == 0) {
        localObject1 = f.b(f.this).a(this.e);
      }
      for (;;)
      {
        localMessage.what = this.b;
        localMessage.obj = localObject1;
        f.a(f.this).sendMessage(localMessage);
        return;
        if (this.b == 1)
        {
          localObject1 = f.b(f.this).a(this.d, this.a);
        }
        else if (this.b == 2)
        {
          localObject1 = f.b(f.this).a();
        }
        else if (this.b == 3)
        {
          localObject1 = f.b(f.this).a(this.d, this.a, this);
        }
        else if (this.b == 4)
        {
          localObject1 = f.b(f.this).b(this.e, this);
        }
        else
        {
          if ((this.b == 5) && (f.c(f.this) != null) && (f.c(f.this).size() > 0))
          {
            localObject1 = f.c(f.this).iterator();
            for (;;)
            {
              if (((Iterator)localObject1).hasNext())
              {
                Object localObject2 = (h)((Iterator)localObject1).next();
                if (((h)localObject2).j.getName().equals(this.e.getName()))
                {
                  FdsMsg localFdsMsg = new FdsMsg();
                  localObject1 = new PlaneMsg();
                  localObject2 = ((h)localObject2).e();
                  if (localObject2 != null)
                  {
                    localFdsMsg.setBucketName("bucket-app-us");
                    localFdsMsg.setObjectName(((com.fimi.soul.biz.l.f)localObject2).c());
                    localFdsMsg.setUrl(((com.fimi.soul.biz.l.f)localObject2).d());
                    ((PlaneMsg)localObject1).setSuccess(true);
                    ((PlaneMsg)localObject1).setData(localFdsMsg);
                    ((PlaneMsg)localObject1).setFile(this.e);
                    break;
                  }
                  ((PlaneMsg)localObject1).setSuccess(false);
                  break;
                }
              }
            }
          }
          localObject1 = null;
        }
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/manager/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */