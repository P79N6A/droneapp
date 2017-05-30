package com.xiaomi.account;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.util.Log;

public class XiaomiOAuthResponse
  implements Parcelable
{
  public static final Parcelable.Creator<XiaomiOAuthResponse> CREATOR = new XiaomiOAuthResponse.1();
  private static final String TAG = XiaomiOAuthResponse.class.getName();
  private IXiaomiAuthResponse mResponse;
  
  public XiaomiOAuthResponse(Parcel paramParcel)
  {
    this.mResponse = IXiaomiAuthResponse.Stub.asInterface(paramParcel.readStrongBinder());
  }
  
  public XiaomiOAuthResponse(IXiaomiAuthResponse paramIXiaomiAuthResponse)
  {
    this.mResponse = paramIXiaomiAuthResponse;
  }
  
  public static void setIXiaomiAuthResponseCancel(IXiaomiAuthResponse paramIXiaomiAuthResponse)
  {
    if (paramIXiaomiAuthResponse == null) {
      return;
    }
    try
    {
      paramIXiaomiAuthResponse.onCancel();
      return;
    }
    catch (RuntimeException paramIXiaomiAuthResponse)
    {
      Log.e(TAG, "RuntimeException", paramIXiaomiAuthResponse);
      return;
    }
    catch (RemoteException paramIXiaomiAuthResponse)
    {
      Log.e(TAG, "RemoteException", paramIXiaomiAuthResponse);
    }
  }
  
  public static void setIXiaomiAuthResponseResult(IXiaomiAuthResponse paramIXiaomiAuthResponse, Bundle paramBundle)
  {
    if ((paramIXiaomiAuthResponse == null) || (paramBundle == null)) {
      return;
    }
    try
    {
      paramIXiaomiAuthResponse.onResult(paramBundle);
      return;
    }
    catch (RuntimeException paramBundle)
    {
      Log.e(TAG, "RemoteException", paramBundle);
      Bundle localBundle = new Bundle();
      localBundle.putInt("extra_error_code", -1);
      localBundle.putString("extra_error_description", paramBundle.getMessage());
      try
      {
        paramIXiaomiAuthResponse.onResult(localBundle);
        return;
      }
      catch (RuntimeException paramIXiaomiAuthResponse)
      {
        Log.e(TAG, "RuntimeException", paramIXiaomiAuthResponse);
        return;
      }
      catch (RemoteException paramIXiaomiAuthResponse)
      {
        Log.e(TAG, "RemoteException", paramIXiaomiAuthResponse);
        return;
      }
    }
    catch (RemoteException paramIXiaomiAuthResponse)
    {
      Log.e(TAG, "RemoteException", paramIXiaomiAuthResponse);
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void onCancel()
  {
    setIXiaomiAuthResponseCancel(this.mResponse);
  }
  
  public void onError(int paramInt, String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("extra_error_code", paramInt);
    localBundle.putString("extra_error_description", paramString);
    setIXiaomiAuthResponseResult(this.mResponse, localBundle);
  }
  
  public void onResult(Bundle paramBundle)
  {
    setIXiaomiAuthResponseResult(this.mResponse, paramBundle);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeStrongBinder(this.mResponse.asBinder());
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/xiaomi/account/XiaomiOAuthResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */