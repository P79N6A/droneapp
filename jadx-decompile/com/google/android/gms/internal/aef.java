package com.google.android.gms.internal;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.fimi.soul.entity.User;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.RegisterSectionInfo.a;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.internal.amm.b;
import com.google.android.gms.internal.amm.c;
import com.google.android.gms.internal.amm.d;
import java.util.ArrayList;
import java.util.List;

public class aef {
    public static DocumentSection a(String str, c cVar) {
        return new DocumentSection(rd.a((rd) cVar), new a(str).a(true).b(str).a("blob").a());
    }

    public static UsageInfo a(com.google.android.gms.b.a aVar, long j, String str, int i) {
        int i2;
        boolean z = false;
        Bundle bundle = new Bundle();
        bundle.putAll(aVar.a());
        Bundle bundle2 = bundle.getBundle("object");
        Uri parse = bundle2.containsKey("id") ? Uri.parse(bundle2.getString("id")) : null;
        String string = bundle2.getString(User.FN_NAME);
        String string2 = bundle2.getString("type");
        Intent a = aeh.a(str, Uri.parse(bundle2.getString("url")));
        DocumentContents.a a2 = UsageInfo.a(a, string, parse, string2, null);
        if (bundle.containsKey(".private:ssbContext")) {
            a2.a(DocumentSection.a(bundle.getByteArray(".private:ssbContext")));
            bundle.remove(".private:ssbContext");
        }
        if (bundle.containsKey(".private:accountName")) {
            a2.a(new Account(bundle.getString(".private:accountName"), "com.google"));
            bundle.remove(".private:accountName");
        }
        if (bundle.containsKey(".private:isContextOnly") && bundle.getBoolean(".private:isContextOnly")) {
            i2 = 4;
            bundle.remove(".private:isContextOnly");
        } else {
            i2 = 0;
        }
        if (bundle.containsKey(".private:isDeviceOnly")) {
            z = bundle.getBoolean(".private:isDeviceOnly", false);
            bundle.remove(".private:isDeviceOnly");
        }
        a2.a(a(".private:action", a(bundle)));
        return new UsageInfo.a().a(UsageInfo.a(str, a)).a(j).a(i2).a(a2.a()).a(z).b(i).a();
    }

    private static b a(String str, Bundle bundle) {
        b bVar = new b();
        bVar.a = str;
        bVar.b = new d();
        bVar.b.e = a(bundle);
        return bVar;
    }

    private static b a(String str, String str2) {
        b bVar = new b();
        bVar.a = str;
        bVar.b = new d();
        bVar.b.b = str2;
        return bVar;
    }

    private static b a(String str, boolean z) {
        b bVar = new b();
        bVar.a = str;
        bVar.b = new d();
        bVar.b.a = z;
        return bVar;
    }

    public static c a(Bundle bundle) {
        List arrayList = new ArrayList();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof String) {
                arrayList.add(a(str, (String) obj));
            } else if (obj instanceof Bundle) {
                arrayList.add(a(str, (Bundle) obj));
            } else if (obj instanceof String[]) {
                for (String str2 : (String[]) obj) {
                    if (str2 != null) {
                        arrayList.add(a(str, str2));
                    }
                }
            } else if (obj instanceof Bundle[]) {
                for (Bundle bundle2 : (Bundle[]) obj) {
                    if (bundle2 != null) {
                        arrayList.add(a(str, bundle2));
                    }
                }
            } else if (obj instanceof Boolean) {
                arrayList.add(a(str, ((Boolean) obj).booleanValue()));
            } else {
                String valueOf = String.valueOf(obj);
                Log.e("SearchIndex", new StringBuilder(String.valueOf(valueOf).length() + 19).append("Unsupported value: ").append(valueOf).toString());
            }
        }
        c cVar = new c();
        if (bundle.containsKey("type")) {
            cVar.a = bundle.getString("type");
        }
        cVar.b = (b[]) arrayList.toArray(new b[arrayList.size()]);
        return cVar;
    }
}
