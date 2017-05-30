package com.baidu.tts.l.a;

import com.baidu.tts.client.model.Conditions;
import com.baidu.tts.client.model.ModelBags;
import com.baidu.tts.client.model.ModelInfo;
import com.baidu.tts.database.a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public class c implements Callable<ModelBags> {
    private Conditions a;
    private a b;
    private com.baidu.tts.l.a c;
    private boolean d;

    public c(a aVar, Conditions conditions, com.baidu.tts.l.a aVar2, boolean z) {
        this.a = conditions;
        this.b = aVar;
        this.c = aVar2;
        this.d = z;
    }

    public ModelBags a() {
        List a = this.b.a(this.a);
        ModelBags modelBags = new ModelBags();
        modelBags.setList(a);
        if (modelBags != null && this.d) {
            Iterator it = modelBags.getModelInfos().iterator();
            while (it.hasNext()) {
                if (!this.c.b(((ModelInfo) it.next()).getServerId())) {
                    it.remove();
                }
            }
        }
        return modelBags;
    }

    public /* synthetic */ Object call() {
        return a();
    }
}
