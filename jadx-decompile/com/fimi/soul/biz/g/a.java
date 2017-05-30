package com.fimi.soul.biz.g;

import android.content.Context;
import com.fimi.kernel.utils.v;
import com.tencent.mm.sdk.plugin.MMPluginProviderConstants.OAuth;

public class a {
    public static String a(Context context, int i) {
        return d(context, i).f("macAlgorithm");
    }

    public static void a(Context context, int i, String str) {
        d(context, i).a("macAlgorithm", str);
    }

    public static String b(Context context, int i) {
        return d(context, i).f("mackey");
    }

    public static void b(Context context, int i, String str) {
        d(context, i).a("mackey", str);
    }

    public static String c(Context context, int i) {
        return d(context, i).f(OAuth.ACCESS_TOKEN);
    }

    public static void c(Context context, int i, String str) {
        d(context, i).a(OAuth.ACCESS_TOKEN, str);
    }

    private static v d(Context context, int i) {
        return v.a(context);
    }
}
