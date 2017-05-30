package org.a.a.c.c;

import java.io.IOException;
import org.a.a.d.b;
import org.apache.http.conn.ConnectionReleaseTrigger;

class a$2 implements b {
    final /* synthetic */ ConnectionReleaseTrigger a;
    final /* synthetic */ a b;

    a$2(a aVar, ConnectionReleaseTrigger connectionReleaseTrigger) {
        this.b = aVar;
        this.a = connectionReleaseTrigger;
    }

    public boolean a() {
        try {
            this.a.abortConnection();
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
