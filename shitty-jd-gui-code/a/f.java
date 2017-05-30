package a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public final class f
{
  static final String a = "al_applink_data";
  static final String b = "extras";
  static final String c = "target_url";
  
  public static Uri a(Context paramContext, Intent paramIntent)
  {
    Object localObject2 = null;
    Object localObject3 = a(paramIntent);
    Object localObject1 = localObject2;
    if (localObject3 != null)
    {
      localObject3 = ((Bundle)localObject3).getString("target_url");
      localObject1 = localObject2;
      if (localObject3 != null)
      {
        k.a(paramContext, "al_nav_in", paramIntent, null);
        localObject1 = Uri.parse((String)localObject3);
      }
    }
    return (Uri)localObject1;
  }
  
  public static Bundle a(Intent paramIntent)
  {
    return paramIntent.getBundleExtra("al_applink_data");
  }
  
  public static Bundle b(Intent paramIntent)
  {
    paramIntent = a(paramIntent);
    if (paramIntent == null) {
      return null;
    }
    return paramIntent.getBundle("extras");
  }
  
  public static Uri c(Intent paramIntent)
  {
    Object localObject = a(paramIntent);
    if (localObject != null)
    {
      localObject = ((Bundle)localObject).getString("target_url");
      if (localObject != null) {
        return Uri.parse((String)localObject);
      }
    }
    return paramIntent.getData();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */