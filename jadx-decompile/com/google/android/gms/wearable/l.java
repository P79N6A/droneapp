package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.fe;
import com.google.android.gms.internal.fe.a;
import com.google.android.gms.internal.ff;
import com.google.android.gms.internal.rc;
import java.util.ArrayList;
import java.util.List;

public class l {
    private final Uri a;
    private final k b;

    private l(h hVar) {
        this.a = hVar.c();
        this.b = b((h) hVar.a());
    }

    public static l a(h hVar) {
        if (hVar != null) {
            return new l(hVar);
        }
        throw new IllegalStateException("provided dataItem is null");
    }

    private k b(h hVar) {
        Throwable e;
        if (hVar.d() == null && hVar.e().size() > 0) {
            throw new IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
        } else if (hVar.d() == null) {
            return new k();
        } else {
            try {
                List arrayList = new ArrayList();
                int size = hVar.e().size();
                for (int i = 0; i < size; i++) {
                    i iVar = (i) hVar.e().get(Integer.toString(i));
                    if (iVar == null) {
                        String valueOf = String.valueOf(hVar);
                        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 64).append("Cannot find DataItemAsset referenced in data at ").append(i).append(" for ").append(valueOf).toString());
                    }
                    arrayList.add(Asset.a(iVar.c()));
                }
                return fe.a(new a(ff.a(hVar.d()), arrayList));
            } catch (rc e2) {
                e = e2;
            } catch (NullPointerException e3) {
                e = e3;
            }
        }
        valueOf = String.valueOf(hVar.c());
        String valueOf2 = String.valueOf(Base64.encodeToString(hVar.d(), 0));
        Log.w("DataItem", new StringBuilder((String.valueOf(valueOf).length() + 50) + String.valueOf(valueOf2).length()).append("Unable to parse datamap from dataItem. uri=").append(valueOf).append(", data=").append(valueOf2).toString());
        valueOf2 = String.valueOf(hVar.c());
        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf2).length() + 44).append("Unable to parse datamap from dataItem.  uri=").append(valueOf2).toString(), e);
    }

    public Uri a() {
        return this.a;
    }

    public k b() {
        return this.b;
    }
}
