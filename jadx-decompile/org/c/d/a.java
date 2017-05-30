package org.c.d;

import java.lang.management.ManagementFactory;
import java.util.List;
import org.c.e.c;
import org.c.f.a.j;

public class a implements l {
    private final l a;
    private final boolean b;

    public a(l lVar) {
        this(lVar, ManagementFactory.getRuntimeMXBean().getInputArguments());
    }

    a(l lVar, List<String> list) {
        this.a = lVar;
        this.b = a(list);
    }

    private static boolean a(List<String> list) {
        for (String str : list) {
            if ("-Xdebug".equals(str)) {
                return true;
            }
            if (str.startsWith("-agentlib:jdwp")) {
                return true;
            }
        }
        return false;
    }

    public j a(j jVar, c cVar) {
        return this.b ? jVar : this.a.a(jVar, cVar);
    }

    public boolean a() {
        return this.b;
    }
}
