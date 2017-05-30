package org.c.g;

import java.util.Collections;
import java.util.List;
import org.c.f.a.k;

public class d implements e {
    private static final List<Exception> a = Collections.emptyList();

    public List<Exception> a(k kVar) {
        return kVar.g() ? a : Collections.singletonList(new Exception("The class " + kVar.e() + " is not public."));
    }
}
