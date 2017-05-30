package com.baidu.tts.aop;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public abstract class AInterceptor implements IInterceptor {
    protected List<String> a = new ArrayList();

    public AInterceptor() {
        a();
    }

    private boolean a(String str) {
        return this.a.contains(str);
    }

    protected abstract Object a(Object obj, Method method, Object[] objArr);

    protected abstract void a();

    public Object after(Object obj, Method method, Object[] objArr, Object obj2) {
        return AInterceptorHandler.DEFAULT;
    }

    public Object before(Object obj, Method method, Object[] objArr) {
        return a(method.getName()) ? a(obj, method, objArr) : AInterceptorHandler.DEFAULT;
    }
}
