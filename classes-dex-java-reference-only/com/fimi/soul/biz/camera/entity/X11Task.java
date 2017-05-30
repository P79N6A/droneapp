package com.fimi.soul.biz.camera.entity;

import com.fimi.soul.biz.camera.d;

public abstract class X11Task
{
  private d context;
  private String currentKey;
  private int index = 0;
  private String[] optionKeys;
  
  public X11Task(d paramd)
  {
    this.context = paramd;
  }
  
  protected abstract void doNext();
  
  protected d getContext()
  {
    return this.context;
  }
  
  public String getCurrentKey()
  {
    return this.currentKey;
  }
  
  public int getIndex()
  {
    return this.index;
  }
  
  public String[] getOptionKeys()
  {
    return this.optionKeys;
  }
  
  public boolean isNext()
  {
    return (this.optionKeys != null) && (this.index < this.optionKeys.length);
  }
  
  public boolean next()
  {
    if (isNext())
    {
      this.currentKey = this.optionKeys[this.index];
      this.index += 1;
      doNext();
      return true;
    }
    return false;
  }
  
  public void setCurrentKey(String paramString)
  {
    this.currentKey = paramString;
  }
  
  public void setIndex(int paramInt)
  {
    this.index = paramInt;
  }
  
  public void setOptionKeys(String[] paramArrayOfString)
  {
    this.optionKeys = paramArrayOfString;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/camera/entity/X11Task.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */