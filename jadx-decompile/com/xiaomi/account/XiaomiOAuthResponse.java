package com.xiaomi.account;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.xiaomi.account.IXiaomiAuthResponse.Stub;

public class XiaomiOAuthResponse implements Parcelable {
    public static final Creator<XiaomiOAuthResponse> CREATOR = new 1();
    private static final String TAG = XiaomiOAuthResponse.class.getName();
    private IXiaomiAuthResponse mResponse;

    public XiaomiOAuthResponse(Parcel parcel) {
        this.mResponse = Stub.asInterface(parcel.readStrongBinder());
    }

    public XiaomiOAuthResponse(IXiaomiAuthResponse iXiaomiAuthResponse) {
        this.mResponse = iXiaomiAuthResponse;
    }

    public static void setIXiaomiAuthResponseCancel(IXiaomiAuthResponse iXiaomiAuthResponse) {
        if (iXiaomiAuthResponse != null) {
            try {
                iXiaomiAuthResponse.onCancel();
            } catch (Throwable e) {
                Log.e(TAG, "RuntimeException", e);
            } catch (Throwable e2) {
                Log.e(TAG, "RemoteException", e2);
            }
        }
    }

    public static void setIXiaomiAuthResponseResult(IXiaomiAuthResponse iXiaomiAuthResponse, Bundle bundle) {
        if (iXiaomiAuthResponse != null && bundle != null) {
            try {
                iXiaomiAuthResponse.onResult(bundle);
            } catch (Throwable e) {
                Log.e(TAG, "RemoteException", e);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("extra_error_code", -1);
                bundle2.putString("extra_error_description", e.getMessage());
                try {
                    iXiaomiAuthResponse.onResult(bundle2);
                } catch (Throwable e2) {
                    Log.e(TAG, "RuntimeException", e2);
                } catch (Throwable e22) {
                    Log.e(TAG, "RemoteException", e22);
                }
            } catch (Throwable e222) {
                Log.e(TAG, "RemoteException", e222);
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void onCancel() {
        setIXiaomiAuthResponseCancel(this.mResponse);
    }

    public void onError(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("extra_error_code", i);
        bundle.putString("extra_error_description", str);
        setIXiaomiAuthResponseResult(this.mResponse, bundle);
    }

    public void onResult(Bundle bundle) {
        setIXiaomiAuthResponseResult(this.mResponse, bundle);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.mResponse.asBinder());
    }
}
