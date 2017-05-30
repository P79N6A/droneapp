package com.baidu.tts.l.a;

import com.baidu.tts.client.model.ModelFileBags;
import com.baidu.tts.database.a;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

public class b implements Callable<ModelFileBags> {
    private Set<String> a;
    private a b;

    public b(a aVar, Set<String> set) {
        this.a = set;
        this.b = aVar;
    }

    public ModelFileBags a() {
        List a = this.b.a(this.a);
        ModelFileBags modelFileBags = new ModelFileBags();
        modelFileBags.setList(a);
        return modelFileBags;
    }

    public /* synthetic */ Object call() {
        return a();
    }
}
