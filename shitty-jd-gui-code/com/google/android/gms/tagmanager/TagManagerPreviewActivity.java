package com.google.android.gms.tagmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class TagManagerPreviewActivity
  extends Activity
{
  public void onCreate(Bundle paramBundle)
  {
    Log.v("GoogleTagManager", "TagManagerPreviewActivity created.");
    super.onCreate(paramBundle);
    if (getIntent().getData() == null)
    {
      Log.e("GoogleTagManager", "Activity intent has no data.");
      return;
    }
    l.a(getIntent(), this);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/tagmanager/TagManagerPreviewActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */