package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.R.string;

public class j
{
  private final Resources a;
  private final String b;
  
  public j(Context paramContext)
  {
    d.a(paramContext);
    this.a = paramContext.getResources();
    this.b = this.a.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
  }
  
  public String a(String paramString)
  {
    int i = this.a.getIdentifier(paramString, "string", this.b);
    if (i == 0) {
      return null;
    }
    return this.a.getString(i);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/internal/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */