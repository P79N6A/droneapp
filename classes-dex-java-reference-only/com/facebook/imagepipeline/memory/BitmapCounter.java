package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Throwables;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.ResourceReleaser;
import com.facebook.imagepipeline.common.TooManyBitmapsException;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

public class BitmapCounter
{
  @GuardedBy("this")
  private int mCount;
  private final int mMaxCount;
  private final int mMaxSize;
  @GuardedBy("this")
  private long mSize;
  private final ResourceReleaser<Bitmap> mUnpooledBitmapsReleaser;
  
  public BitmapCounter(int paramInt1, int paramInt2)
  {
    if (paramInt1 > 0)
    {
      bool1 = true;
      Preconditions.checkArgument(bool1);
      if (paramInt2 <= 0) {
        break label56;
      }
    }
    label56:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      Preconditions.checkArgument(bool1);
      this.mMaxCount = paramInt1;
      this.mMaxSize = paramInt2;
      this.mUnpooledBitmapsReleaser = new ResourceReleaser()
      {
        public void release(Bitmap paramAnonymousBitmap)
        {
          try
          {
            BitmapCounter.this.decrease(paramAnonymousBitmap);
            return;
          }
          finally
          {
            paramAnonymousBitmap.recycle();
          }
        }
      };
      return;
      bool1 = false;
      break;
    }
  }
  
  public List<CloseableReference<Bitmap>> associateBitmapsWithBitmapCounter(List<Bitmap> paramList)
  {
    int i = 0;
    ArrayList localArrayList;
    try
    {
      if (i < paramList.size())
      {
        Bitmap localBitmap = (Bitmap)paramList.get(i);
        if (Build.VERSION.SDK_INT < 21) {
          Bitmaps.pinBitmap(localBitmap);
        }
        if (!increase(localBitmap)) {
          throw new TooManyBitmapsException();
        }
      }
    }
    catch (Exception localException)
    {
      while (paramList != null)
      {
        paramList = paramList.iterator();
        for (;;)
        {
          if (paramList.hasNext())
          {
            Object localObject = (Bitmap)paramList.next();
            if (i > 0) {
              decrease((Bitmap)localObject);
            }
            ((Bitmap)localObject).recycle();
            i -= 1;
            continue;
            i += 1;
            break;
            localArrayList = new ArrayList();
            localObject = paramList.iterator();
            while (((Iterator)localObject).hasNext()) {
              localArrayList.add(CloseableReference.of((Bitmap)((Iterator)localObject).next(), this.mUnpooledBitmapsReleaser));
            }
          }
        }
      }
      throw Throwables.propagate(localArrayList);
    }
    return localArrayList;
  }
  
  /* Error */
  public void decrease(Bitmap paramBitmap)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 4
    //   3: aload_0
    //   4: monitorenter
    //   5: aload_1
    //   6: invokestatic 120	com/facebook/imageutils/BitmapUtil:getSizeInBytes	(Landroid/graphics/Bitmap;)I
    //   9: istore_2
    //   10: aload_0
    //   11: getfield 122	com/facebook/imagepipeline/memory/BitmapCounter:mCount	I
    //   14: ifle +75 -> 89
    //   17: iconst_1
    //   18: istore_3
    //   19: iload_3
    //   20: ldc 124
    //   22: invokestatic 127	com/facebook/common/internal/Preconditions:checkArgument	(ZLjava/lang/Object;)V
    //   25: iload_2
    //   26: i2l
    //   27: aload_0
    //   28: getfield 129	com/facebook/imagepipeline/memory/BitmapCounter:mSize	J
    //   31: lcmp
    //   32: ifgt +62 -> 94
    //   35: iload 4
    //   37: istore_3
    //   38: iload_3
    //   39: ldc -125
    //   41: iconst_2
    //   42: anewarray 4	java/lang/Object
    //   45: dup
    //   46: iconst_0
    //   47: iload_2
    //   48: invokestatic 137	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   51: aastore
    //   52: dup
    //   53: iconst_1
    //   54: aload_0
    //   55: getfield 129	com/facebook/imagepipeline/memory/BitmapCounter:mSize	J
    //   58: invokestatic 142	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   61: aastore
    //   62: invokestatic 145	com/facebook/common/internal/Preconditions:checkArgument	(ZLjava/lang/String;[Ljava/lang/Object;)V
    //   65: aload_0
    //   66: aload_0
    //   67: getfield 129	com/facebook/imagepipeline/memory/BitmapCounter:mSize	J
    //   70: iload_2
    //   71: i2l
    //   72: lsub
    //   73: putfield 129	com/facebook/imagepipeline/memory/BitmapCounter:mSize	J
    //   76: aload_0
    //   77: aload_0
    //   78: getfield 122	com/facebook/imagepipeline/memory/BitmapCounter:mCount	I
    //   81: iconst_1
    //   82: isub
    //   83: putfield 122	com/facebook/imagepipeline/memory/BitmapCounter:mCount	I
    //   86: aload_0
    //   87: monitorexit
    //   88: return
    //   89: iconst_0
    //   90: istore_3
    //   91: goto -72 -> 19
    //   94: iconst_0
    //   95: istore_3
    //   96: goto -58 -> 38
    //   99: astore_1
    //   100: aload_0
    //   101: monitorexit
    //   102: aload_1
    //   103: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	104	0	this	BitmapCounter
    //   0	104	1	paramBitmap	Bitmap
    //   9	62	2	i	int
    //   18	78	3	bool1	boolean
    //   1	35	4	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   5	17	99	finally
    //   19	35	99	finally
    //   38	86	99	finally
  }
  
  public int getCount()
  {
    try
    {
      int i = this.mCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public ResourceReleaser<Bitmap> getReleaser()
  {
    return this.mUnpooledBitmapsReleaser;
  }
  
  public long getSize()
  {
    try
    {
      long l = this.mSize;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public boolean increase(Bitmap paramBitmap)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic 120	com/facebook/imageutils/BitmapUtil:getSizeInBytes	(Landroid/graphics/Bitmap;)I
    //   6: istore_2
    //   7: aload_0
    //   8: getfield 122	com/facebook/imagepipeline/memory/BitmapCounter:mCount	I
    //   11: aload_0
    //   12: getfield 31	com/facebook/imagepipeline/memory/BitmapCounter:mMaxCount	I
    //   15: if_icmpge +29 -> 44
    //   18: aload_0
    //   19: getfield 129	com/facebook/imagepipeline/memory/BitmapCounter:mSize	J
    //   22: lstore 4
    //   24: iload_2
    //   25: i2l
    //   26: lstore 6
    //   28: aload_0
    //   29: getfield 33	com/facebook/imagepipeline/memory/BitmapCounter:mMaxSize	I
    //   32: istore_3
    //   33: lload 4
    //   35: lload 6
    //   37: ladd
    //   38: iload_3
    //   39: i2l
    //   40: lcmp
    //   41: ifle +11 -> 52
    //   44: iconst_0
    //   45: istore 8
    //   47: aload_0
    //   48: monitorexit
    //   49: iload 8
    //   51: ireturn
    //   52: aload_0
    //   53: aload_0
    //   54: getfield 122	com/facebook/imagepipeline/memory/BitmapCounter:mCount	I
    //   57: iconst_1
    //   58: iadd
    //   59: putfield 122	com/facebook/imagepipeline/memory/BitmapCounter:mCount	I
    //   62: aload_0
    //   63: getfield 129	com/facebook/imagepipeline/memory/BitmapCounter:mSize	J
    //   66: lstore 4
    //   68: aload_0
    //   69: iload_2
    //   70: i2l
    //   71: lload 4
    //   73: ladd
    //   74: putfield 129	com/facebook/imagepipeline/memory/BitmapCounter:mSize	J
    //   77: iconst_1
    //   78: istore 8
    //   80: goto -33 -> 47
    //   83: astore_1
    //   84: aload_0
    //   85: monitorexit
    //   86: aload_1
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	BitmapCounter
    //   0	88	1	paramBitmap	Bitmap
    //   6	64	2	i	int
    //   32	7	3	j	int
    //   22	50	4	l1	long
    //   26	10	6	l2	long
    //   45	34	8	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	24	83	finally
    //   28	33	83	finally
    //   52	77	83	finally
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/imagepipeline/memory/BitmapCounter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */