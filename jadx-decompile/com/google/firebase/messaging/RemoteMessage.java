package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.util.Map;

public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Creator<RemoteMessage> CREATOR = new e();
    final int a;
    Bundle b;
    private Map<String, String> c;
    private b d;

    RemoteMessage(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    RemoteMessage(Bundle bundle) {
        this(1, bundle);
    }

    public String a() {
        return this.b.getString("from");
    }

    void a(Intent intent) {
        intent.putExtras(this.b);
    }

    public String b() {
        return this.b.getString("google.to");
    }

    public Map<String, String> c() {
        if (this.c == null) {
            this.c = new ArrayMap();
            for (String str : this.b.keySet()) {
                Object obj = this.b.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!(str.startsWith("google.") || str.startsWith("gcm.") || str.equals("from") || str.equals(PushMessageHelper.MESSAGE_TYPE) || str.equals("collapse_key"))) {
                        this.c.put(str, str2);
                    }
                }
            }
        }
        return this.c;
    }

    public String d() {
        return this.b.getString("collapse_key");
    }

    public String e() {
        String string = this.b.getString("google.message_id");
        return string == null ? this.b.getString("message_id") : string;
    }

    public String f() {
        return this.b.getString(PushMessageHelper.MESSAGE_TYPE);
    }

    public long g() {
        return this.b.getLong("google.sent_time");
    }

    public int h() {
        Object obj = this.b.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException e) {
                String valueOf = String.valueOf(obj);
                Log.w("FirebaseMessaging", new StringBuilder(String.valueOf(valueOf).length() + 13).append("Invalid TTL: ").append(valueOf).toString());
            }
        }
        return 0;
    }

    public b i() {
        if (this.d == null && c.a(this.b)) {
            this.d = new b(this.b, null);
        }
        return this.d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        e.a(this, parcel, i);
    }
}
