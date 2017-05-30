package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.Loader;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;

@KeepName
public class SignInHubActivity
  extends FragmentActivity
{
  private j a;
  private SignInConfiguration b;
  private boolean c;
  private int d;
  private Intent e;
  
  private void a()
  {
    getSupportLoaderManager().initLoader(0, null, new a(null));
  }
  
  private void a(int paramInt)
  {
    Status localStatus = new Status(paramInt);
    Intent localIntent = new Intent();
    localIntent.putExtra("googleSignInStatus", localStatus);
    setResult(0, localIntent);
    finish();
  }
  
  private void a(int paramInt, Intent paramIntent)
  {
    if (paramIntent != null)
    {
      Object localObject = (SignInAccount)paramIntent.getParcelableExtra("signInAccount");
      if ((localObject != null) && (((SignInAccount)localObject).a() != null))
      {
        localObject = ((SignInAccount)localObject).a();
        this.a.b((GoogleSignInAccount)localObject, this.b.b());
        paramIntent.removeExtra("signInAccount");
        paramIntent.putExtra("googleSignInAccount", (Parcelable)localObject);
        this.c = true;
        this.d = paramInt;
        this.e = paramIntent;
        a();
        return;
      }
      if (paramIntent.hasExtra("errorCode"))
      {
        a(paramIntent.getIntExtra("errorCode", 8));
        return;
      }
    }
    a(8);
  }
  
  private void a(Intent paramIntent)
  {
    paramIntent.setPackage("com.google.android.gms");
    paramIntent.putExtra("config", this.b);
    try
    {
      startActivityForResult(paramIntent, 40962);
      return;
    }
    catch (ActivityNotFoundException paramIntent)
    {
      Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
      a(8);
    }
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    return true;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    setResult(0);
    switch (paramInt1)
    {
    default: 
      return;
    }
    a(paramInt2, paramIntent);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = j.a(this);
    Intent localIntent = getIntent();
    String str;
    if (!"com.google.android.gms.auth.GOOGLE_SIGN_IN".equals(localIntent.getAction()))
    {
      str = String.valueOf(localIntent.getAction());
      if (str.length() != 0)
      {
        str = "Unknown action: ".concat(str);
        Log.e("AuthSignInClient", str);
        finish();
      }
    }
    else
    {
      this.b = ((SignInConfiguration)localIntent.getParcelableExtra("config"));
      if (this.b != null) {
        break label114;
      }
      Log.e("AuthSignInClient", "Activity started with invalid configuration.");
      setResult(0);
      finish();
    }
    label114:
    do
    {
      return;
      str = new String("Unknown action: ");
      break;
      if (paramBundle == null)
      {
        a(new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN"));
        return;
      }
      this.c = paramBundle.getBoolean("signingInGoogleApiClients");
    } while (!this.c);
    this.d = paramBundle.getInt("signInResultCode");
    this.e = ((Intent)paramBundle.getParcelable("signInResultData"));
    a();
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putBoolean("signingInGoogleApiClients", this.c);
    if (this.c)
    {
      paramBundle.putInt("signInResultCode", this.d);
      paramBundle.putParcelable("signInResultData", this.e);
    }
  }
  
  private class a
    implements LoaderManager.LoaderCallbacks<Void>
  {
    private a() {}
    
    public void a(Loader<Void> paramLoader, Void paramVoid)
    {
      SignInHubActivity.this.setResult(SignInHubActivity.a(SignInHubActivity.this), SignInHubActivity.b(SignInHubActivity.this));
      SignInHubActivity.this.finish();
    }
    
    public Loader<Void> onCreateLoader(int paramInt, Bundle paramBundle)
    {
      return new zzb(SignInHubActivity.this, g.a());
    }
    
    public void onLoaderReset(Loader<Void> paramLoader) {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/SignInHubActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */