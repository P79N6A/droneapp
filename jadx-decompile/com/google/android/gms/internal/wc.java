package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@aaa
public class wc implements vt {
    private final Object a = new Object();
    private final Map<String, a> b = new HashMap();

    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("result");
        synchronized (this.a) {
            a aVar = (a) this.b.remove(str);
            if (aVar == null) {
                str2 = "Received result for unexpected method invocation: ";
                str = String.valueOf(str);
                b.d(str.length() != 0 ? str2.concat(str) : new String(str2));
            } else if (!TextUtils.isEmpty(str2)) {
                aVar.a(str3);
            } else if (str4 == null) {
                aVar.a("No result.");
            } else {
                try {
                    aVar.a(new JSONObject(str4));
                } catch (JSONException e) {
                    aVar.a(e.getMessage());
                }
            }
        }
    }
}
