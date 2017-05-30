package org.a.a.i.b;

import com.google.android.gms.appinvite.PreviewActivity;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.a.a.a.c;
import org.a.a.c.c.b;
import org.a.a.o.d;
import org.apache.http.HttpResponse;

@c
class i implements InvocationHandler {
    private final HttpResponse a;

    i(HttpResponse httpResponse) {
        this.a = httpResponse;
    }

    public static b a(HttpResponse httpResponse) {
        return (b) Proxy.newProxyInstance(i.class.getClassLoader(), new Class[]{b.class}, new i(httpResponse));
    }

    public void a() {
        d.b(this.a.getEntity());
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        if (method.getName().equals(PreviewActivity.o)) {
            a();
            return null;
        }
        try {
            return method.invoke(this.a, objArr);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                throw cause;
            }
            throw e;
        }
    }
}
