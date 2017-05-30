package com.facebook.binaryresource;

import java.io.InputStream;

public abstract interface BinaryResource
{
  public abstract InputStream openStream();
  
  public abstract byte[] read();
  
  public abstract long size();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/binaryresource/BinaryResource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */