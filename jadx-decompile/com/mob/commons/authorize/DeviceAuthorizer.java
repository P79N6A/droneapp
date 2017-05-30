package com.mob.commons.authorize;

import android.content.Context;
import com.mob.commons.MobProduct;
import com.mob.commons.a;
import com.mob.commons.b;

public final class DeviceAuthorizer {
    public static synchronized String authorize(Context context, MobProduct mobProduct) {
        String a;
        synchronized (DeviceAuthorizer.class) {
            b.a(context).a(mobProduct);
            a aVar = new a();
            a = (mobProduct == null || !a.f(context)) ? aVar.a(context) : aVar.a(context, mobProduct);
        }
        return a;
    }

    public static String authorize(Context context, final MobProduct mobProduct) {
        return authorize(context, new MobProduct() {
            public String getProductAppkey() {
                return mobProduct.getProductAppkey();
            }

            public String getProductTag() {
                return mobProduct.getProductTag();
            }

            public int getSdkver() {
                return mobProduct.getSdkver();
            }
        });
    }
}
