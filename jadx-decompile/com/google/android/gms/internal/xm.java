package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;

@aaa
public class xm {
    public List<String> a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        List arrayList = new ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.getString(i));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void a(Context context, String str, abi com_google_android_gms_internal_abi, String str2, boolean z, List<String> list) {
        if (list != null && !list.isEmpty()) {
            String str3 = z ? "1" : "0";
            for (String replaceAll : list) {
                String replaceAll2 = replaceAll2.replaceAll("@gw_adlocid@", str2).replaceAll("@gw_adnetrefresh@", str3).replaceAll("@gw_qdata@", com_google_android_gms_internal_abi.r.h).replaceAll("@gw_sdkver@", str).replaceAll("@gw_sessid@", u.i().a()).replaceAll("@gw_seqnum@", com_google_android_gms_internal_abi.i);
                if (!TextUtils.isEmpty(com_google_android_gms_internal_abi.u)) {
                    replaceAll2 = replaceAll2.replaceAll("@gw_adnetstatus@", com_google_android_gms_internal_abi.u);
                }
                if (com_google_android_gms_internal_abi.o != null) {
                    replaceAll2 = replaceAll2.replaceAll("@gw_adnetid@", com_google_android_gms_internal_abi.o.b).replaceAll("@gw_allocid@", com_google_android_gms_internal_abi.o.d);
                }
                Future future = (Future) new acg(context, str, replaceAll2).e();
            }
        }
    }
}
