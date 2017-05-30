package a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public final class f {
    static final String a = "al_applink_data";
    static final String b = "extras";
    static final String c = "target_url";

    public static Uri a(Context context, Intent intent) {
        Bundle a = a(intent);
        if (a == null) {
            return null;
        }
        String string = a.getString(c);
        if (string == null) {
            return null;
        }
        k.a(context, k.e, intent, null);
        return Uri.parse(string);
    }

    public static Bundle a(Intent intent) {
        return intent.getBundleExtra(a);
    }

    public static Bundle b(Intent intent) {
        Bundle a = a(intent);
        return a == null ? null : a.getBundle(b);
    }

    public static Uri c(Intent intent) {
        Bundle a = a(intent);
        if (a != null) {
            String string = a.getString(c);
            if (string != null) {
                return Uri.parse(string);
            }
        }
        return intent.getData();
    }
}
