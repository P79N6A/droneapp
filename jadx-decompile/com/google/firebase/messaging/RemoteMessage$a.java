package com.google.firebase.messaging;

import android.os.Bundle;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.google.firebase.iid.FirebaseInstanceId;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.util.Map;
import java.util.Map.Entry;

public class RemoteMessage$a {
    private final Bundle a = new Bundle();
    private final Map<String, String> b = new ArrayMap();

    public RemoteMessage$a(String str) {
        if (TextUtils.isEmpty(str)) {
            String str2 = "Invalid to: ";
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        this.a.putString("google.to", str);
    }

    public RemoteMessage$a a(int i) {
        this.a.putString("google.ttl", String.valueOf(i));
        return this;
    }

    public RemoteMessage$a a(String str) {
        this.a.putString("google.message_id", str);
        return this;
    }

    public RemoteMessage$a a(String str, String str2) {
        this.b.put(str, str2);
        return this;
    }

    public RemoteMessage$a a(Map<String, String> map) {
        this.b.clear();
        this.b.putAll(map);
        return this;
    }

    public RemoteMessage a() {
        Bundle bundle = new Bundle();
        for (Entry entry : this.b.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        bundle.putAll(this.a);
        String f = FirebaseInstanceId.a().f();
        if (f != null) {
            this.a.putString("from", f);
        } else {
            this.a.remove("from");
        }
        return new RemoteMessage(bundle);
    }

    public RemoteMessage$a b() {
        this.b.clear();
        return this;
    }

    public RemoteMessage$a b(String str) {
        this.a.putString(PushMessageHelper.MESSAGE_TYPE, str);
        return this;
    }

    public RemoteMessage$a c(String str) {
        this.a.putString("collapse_key", str);
        return this;
    }
}
