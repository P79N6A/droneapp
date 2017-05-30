package com.facebook.imagepipeline.memory;

import java.io.InputStream;

public abstract interface PooledByteBufferFactory
{
  public abstract PooledByteBuffer newByteBuffer(int paramInt);
  
  public abstract PooledByteBuffer newByteBuffer(InputStream paramInputStream);
  
  public abstract PooledByteBuffer newByteBuffer(InputStream paramInputStream, int paramInt);
  
  public abstract PooledByteBuffer newByteBuffer(byte[] paramArrayOfByte);
  
  public abstract PooledByteBufferOutputStream newOutputStream();
  
  public abstract PooledByteBufferOutputStream newOutputStream(int paramInt);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/imagepipeline/memory/PooledByteBufferFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */