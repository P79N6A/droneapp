package com.baidu.tts.aop.ttslistener;

import android.text.TextUtils;
import com.baidu.tts.aop.AInterceptor;
import com.baidu.tts.aop.AInterceptorHandler;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.m.h;
import java.lang.reflect.Method;

public class ProgressCorrectInterceptor extends AInterceptor {
    protected Object a(Object obj, Method method, Object[] objArr) {
        h hVar = (h) objArr[0];
        if (hVar != null) {
            Object b = hVar.e().b();
            if (!TextUtils.isEmpty(b)) {
                int length = b.length();
                int c = hVar.c();
                int i = c > length ? c - length : 0;
                LoggerProxy.d("ProgressCorrectInterceptor", "prefixLength=" + length + "--progress=" + c);
                hVar = (h) hVar.A();
                hVar.c(i);
                objArr[0] = hVar;
            }
        }
        return AInterceptorHandler.DEFAULT;
    }

    protected void a() {
        this.a.add("onSynthesizeDataArrived");
        this.a.add("onPlayProgressUpdate");
    }
}
