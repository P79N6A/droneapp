package com.google.firebase.iid;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;

public class d {
    private static final Object a = new Object();
    private final f b;

    d(f fVar) {
        this.b = fVar;
    }

    @Nullable
    String a() {
        String str = null;
        synchronized (a) {
            String string = this.b.a().getString("topic_operaion_queue", null);
            if (string != null) {
                String[] split = string.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                if (split.length > 1 && !TextUtils.isEmpty(split[1])) {
                    str = split[1];
                }
            }
        }
        return str;
    }

    void a(String str) {
        synchronized (a) {
            String string = this.b.a().getString("topic_operaion_queue", "");
            String valueOf = String.valueOf(Constants.ACCEPT_TIME_SEPARATOR_SP);
            this.b.a().edit().putString("topic_operaion_queue", new StringBuilder(((String.valueOf(string).length() + 0) + String.valueOf(valueOf).length()) + String.valueOf(str).length()).append(string).append(valueOf).append(str).toString()).apply();
        }
    }

    boolean b(String str) {
        boolean z;
        synchronized (a) {
            String string = this.b.a().getString("topic_operaion_queue", "");
            String valueOf = String.valueOf(Constants.ACCEPT_TIME_SEPARATOR_SP);
            String valueOf2 = String.valueOf(str);
            if (string.startsWith(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf))) {
                valueOf = String.valueOf(Constants.ACCEPT_TIME_SEPARATOR_SP);
                valueOf2 = String.valueOf(str);
                this.b.a().edit().putString("topic_operaion_queue", string.substring((valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).length())).apply();
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}
