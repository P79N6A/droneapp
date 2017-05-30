package com.xiaomi.account.openauth;

import android.app.Activity;
import android.content.Intent;
import android.os.BadParcelableException;
import android.util.Log;

class ParcelableAttackGuardian
{
  private static final String TAG = ParcelableAttackGuardian.class.getSimpleName();
  
  public boolean safeCheck(Activity paramActivity)
  {
    if ((paramActivity == null) || (paramActivity.getIntent() == null)) {}
    do
    {
      return true;
      Intent localIntent = new Intent(paramActivity.getIntent());
      try
      {
        unparcelIntent(localIntent);
        return true;
      }
      catch (BadParcelableException localBadParcelableException)
      {
        Log.w(TAG, "fail checking ParcelableAttack for Activity " + paramActivity.getClass().getName());
        return false;
      }
      catch (RuntimeException localRuntimeException) {}
    } while (!(localRuntimeException.getCause() instanceof ClassNotFoundException));
    Log.w(TAG, "fail checking SerializableAttack for Activity " + paramActivity.getClass().getName());
    return false;
  }
  
  void unparcelIntent(Intent paramIntent)
  {
    paramIntent.getStringExtra("");
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/xiaomi/account/openauth/ParcelableAttackGuardian.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */