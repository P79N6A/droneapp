package com.mob.tools.utils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;

class ReflectHelper$1 implements InvocationHandler {
    final /* synthetic */ HashMap val$proxyHandler;

    ReflectHelper$1(HashMap hashMap) {
        this.val$proxyHandler = hashMap;
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        ReflectHelper$ReflectRunnable reflectHelper$ReflectRunnable = (ReflectHelper$ReflectRunnable) this.val$proxyHandler.get(method.getName());
        if (reflectHelper$ReflectRunnable != null) {
            return reflectHelper$ReflectRunnable.run(objArr);
        }
        throw new NoSuchMethodException();
    }
}
