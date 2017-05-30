package com.google.android.gms.internal;

import java.io.Reader;
import java.io.StringReader;

public final class oc {
    public nx a(pp ppVar) {
        String valueOf;
        boolean p = ppVar.p();
        ppVar.a(true);
        try {
            nx a = oz.a(ppVar);
            ppVar.a(p);
            return a;
        } catch (Throwable e) {
            valueOf = String.valueOf(ppVar);
            throw new ob(new StringBuilder(String.valueOf(valueOf).length() + 36).append("Failed parsing JSON source: ").append(valueOf).append(" to Json").toString(), e);
        } catch (Throwable e2) {
            valueOf = String.valueOf(ppVar);
            throw new ob(new StringBuilder(String.valueOf(valueOf).length() + 36).append("Failed parsing JSON source: ").append(valueOf).append(" to Json").toString(), e2);
        } catch (Throwable th) {
            ppVar.a(p);
        }
    }

    public nx a(Reader reader) {
        try {
            pp ppVar = new pp(reader);
            nx a = a(ppVar);
            if (a.k() || ppVar.f() == pq.END_DOCUMENT) {
                return a;
            }
            throw new og("Did not consume the entire document.");
        } catch (Throwable e) {
            throw new og(e);
        } catch (Throwable e2) {
            throw new ny(e2);
        } catch (Throwable e22) {
            throw new og(e22);
        }
    }

    public nx a(String str) {
        return a(new StringReader(str));
    }
}
