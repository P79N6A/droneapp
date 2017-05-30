package com.baidu.tts.l.a;

import com.baidu.tts.client.model.BasicHandler;
import com.baidu.tts.client.model.Conditions;
import com.baidu.tts.client.model.LibEngineParams;
import com.baidu.tts.client.model.ModelBags;
import com.baidu.tts.client.model.ModelFileBags;
import com.baidu.tts.jni.EmbeddedSynthesizerEngine;
import com.baidu.tts.l.a;
import java.util.Set;
import java.util.concurrent.FutureTask;

public class h {
    private a a;

    public h(a aVar) {
        this.a = aVar;
    }

    public BasicHandler<ModelBags> a(Conditions conditions) {
        BasicHandler<ModelBags> basicHandler = new BasicHandler(new FutureTask(new g(conditions)));
        basicHandler.start();
        return basicHandler;
    }

    public BasicHandler<ModelBags> a(Conditions conditions, boolean z) {
        BasicHandler<ModelBags> basicHandler = new BasicHandler(new FutureTask(new c(this.a.e(), conditions, this.a, z)));
        basicHandler.start();
        return basicHandler;
    }

    public BasicHandler<ModelFileBags> a(Set<String> set) {
        BasicHandler<ModelFileBags> basicHandler = new BasicHandler(new FutureTask(new f(set)));
        basicHandler.start();
        return basicHandler;
    }

    public LibEngineParams a() {
        return new LibEngineParams(EmbeddedSynthesizerEngine.bdTTSGetEngineParam());
    }

    public BasicHandler<ModelBags> b() {
        BasicHandler<ModelBags> basicHandler = new BasicHandler(new FutureTask(new e()));
        basicHandler.start();
        return basicHandler;
    }

    public BasicHandler<ModelFileBags> b(Set<String> set) {
        BasicHandler<ModelFileBags> basicHandler = new BasicHandler(new FutureTask(new b(this.a.e(), set)));
        basicHandler.start();
        return basicHandler;
    }
}
