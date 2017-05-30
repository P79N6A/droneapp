package com.fimi.soul.utils;

import android.content.Intent;

public class ac
{
  public static Intent a()
  {
    Intent localIntent = new Intent("android.intent.action.GET_CONTENT");
    localIntent.setType("*/*");
    localIntent.addCategory("android.intent.category.OPENABLE");
    return localIntent;
  }
  
  public static Intent a(String paramString)
  {
    Intent localIntent = new Intent("android.intent.action.GET_CONTENT");
    localIntent.setType(paramString);
    localIntent.addCategory("android.intent.category.OPENABLE");
    return localIntent;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */