package com.google.android.gms.config.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class b {
    static AppMeasurement a(Context context) {
        try {
            return AppMeasurement.getInstance(context);
        } catch (NoClassDefFoundError e) {
            return null;
        }
    }

    public static List<AnalyticsUserProperty> b(Context context) {
        AppMeasurement a = a(context);
        if (a != null) {
            Map b;
            try {
                b = a.b(false);
            } catch (Throwable e) {
                if (Log.isLoggable("FRCAnalytics", 3)) {
                    Log.d("FRCAnalytics", "Unable to get user properties.", e);
                }
                b = null;
            }
            if (b == null) {
                return null;
            }
            List<AnalyticsUserProperty> arrayList = new ArrayList();
            for (Entry entry : b.entrySet()) {
                if (entry.getValue() != null) {
                    arrayList.add(new AnalyticsUserProperty((String) entry.getKey(), entry.getValue().toString()));
                }
            }
            return arrayList;
        } else if (!Log.isLoggable("FRCAnalytics", 3)) {
            return null;
        } else {
            Log.d("FRCAnalytics", "Unable to get user properties: analytics library is missing.");
            return null;
        }
    }
}
