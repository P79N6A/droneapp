package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.json.JSONArray;

public class o extends g<String> {
    public o(String str, int i) {
        super(str, Collections.singleton(str), Collections.emptySet(), i);
    }

    public static Collection<String> a(String str) {
        if (str == null) {
            return null;
        }
        Collection arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(str);
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    protected void a(Bundle bundle, Collection<String> collection) {
        bundle.putStringArrayList(a(), new ArrayList(collection));
    }

    protected Collection<String> b(Bundle bundle) {
        return bundle.getStringArrayList(a());
    }

    protected /* synthetic */ Object c(Bundle bundle) {
        return b(bundle);
    }

    protected /* synthetic */ Object c(DataHolder dataHolder, int i, int i2) {
        return e_(dataHolder, i, i2);
    }

    protected Collection<String> e_(DataHolder dataHolder, int i, int i2) {
        try {
            return a(dataHolder.c(a(), i, i2));
        } catch (Throwable e) {
            throw new IllegalStateException("DataHolder supplied invalid JSON", e);
        }
    }
}
