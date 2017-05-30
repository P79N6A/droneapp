package org.a.a.i.b;

import java.io.InputStream;
import java.io.OutputStream;
import org.a.a.h.g;
import org.apache.http.HttpEntity;

class p$a extends g {
    final /* synthetic */ p b;

    p$a(p pVar, HttpEntity httpEntity) {
        this.b = pVar;
        super(httpEntity);
    }

    public void consumeContent() {
        p.a(this.b, true);
        super.consumeContent();
    }

    public InputStream getContent() {
        p.a(this.b, true);
        return super.getContent();
    }

    public void writeTo(OutputStream outputStream) {
        p.a(this.b, true);
        super.writeTo(outputStream);
    }
}
