package com.baidu.tts.aop.tts;

import com.baidu.tts.aop.AInterceptor;
import com.baidu.tts.aop.AInterceptorHandler;
import com.baidu.tts.aop.ttslistener.TtsListener;
import com.baidu.tts.aop.ttslistener.TtsListenerFactory;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import java.lang.reflect.Method;

public class CallbackInterceptor extends AInterceptor {
    protected Object a(Object obj, Method method, Object[] objArr) {
        LoggerProxy.d("CallbackInterceptor", "method=" + method.getName());
        objArr[0] = (TtsListener) new TtsListenerFactory((TtsListener) objArr[0]).makeProxy();
        return AInterceptorHandler.DEFAULT;
    }

    protected void a() {
        this.a.add("setTtsListener");
    }
}
