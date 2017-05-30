package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.ads.purchase.InAppPurchaseActivity;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abl;
import org.json.JSONException;
import org.json.JSONObject;

@aaa
public class i {
    public int a(Intent intent) {
        if (intent == null) {
            return 5;
        }
        Object obj = intent.getExtras().get("RESPONSE_CODE");
        if (obj == null) {
            b.d("Intent with no response code, assuming OK (known issue)");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            if (obj instanceof Long) {
                return (int) ((Long) obj).longValue();
            }
            String str = "Unexpected type for intent response code. ";
            String valueOf = String.valueOf(obj.getClass().getName());
            b.d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return 5;
        }
    }

    public int a(Bundle bundle) {
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            b.d("Bundle with null response code, assuming OK (known issue)");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            if (obj instanceof Long) {
                return (int) ((Long) obj).longValue();
            }
            String str = "Unexpected type for intent response code. ";
            String valueOf = String.valueOf(obj.getClass().getName());
            b.d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return 5;
        }
    }

    public String a(String str) {
        String str2 = null;
        if (str != null) {
            try {
                str2 = new JSONObject(str).getString("developerPayload");
            } catch (JSONException e) {
                b.d("Fail to parse purchase data");
            }
        }
        return str2;
    }

    public void a(final Context context) {
        ServiceConnection anonymousClass1 = new ServiceConnection(this) {
            final /* synthetic */ i b;

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                boolean z = false;
                b bVar = new b(context.getApplicationContext(), false);
                bVar.a(iBinder);
                int a = bVar.a(3, context.getPackageName(), "inapp");
                abl i = u.i();
                if (a == 0) {
                    z = true;
                }
                i.d(z);
                context.unbindService(this);
                bVar.a();
            }

            public void onServiceDisconnected(ComponentName componentName) {
            }
        };
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        context.bindService(intent, anonymousClass1, 1);
    }

    public void a(Context context, boolean z, GInAppPurchaseManagerInfoParcel gInAppPurchaseManagerInfoParcel) {
        Intent intent = new Intent();
        intent.setClassName(context, InAppPurchaseActivity.a);
        intent.putExtra("com.google.android.gms.ads.internal.purchase.useClientJar", z);
        GInAppPurchaseManagerInfoParcel.a(intent, gInAppPurchaseManagerInfoParcel);
        u.e().a(context, intent);
    }

    public String b(Intent intent) {
        return intent == null ? null : intent.getStringExtra("INAPP_PURCHASE_DATA");
    }

    public String b(String str) {
        String str2 = null;
        if (str != null) {
            try {
                str2 = new JSONObject(str).getString("purchaseToken");
            } catch (JSONException e) {
                b.d("Fail to parse purchase data");
            }
        }
        return str2;
    }

    public String c(Intent intent) {
        return intent == null ? null : intent.getStringExtra("INAPP_DATA_SIGNATURE");
    }
}
