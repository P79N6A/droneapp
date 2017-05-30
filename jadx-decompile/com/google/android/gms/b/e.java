package com.google.android.gms.b;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.fimi.soul.entity.User;
import com.google.android.gms.common.internal.d;
import java.util.ArrayList;

public class e {
    final Bundle q;

    public static class a {
        final Bundle a = new Bundle();

        public a b(Uri uri) {
            d.a((Object) uri);
            b("url", uri.toString());
            return this;
        }

        public a b(String str, e eVar) {
            d.a((Object) str);
            if (eVar != null) {
                this.a.putParcelable(str, eVar.q);
            }
            return this;
        }

        public a b(String str, String str2) {
            d.a((Object) str);
            if (str2 != null) {
                this.a.putString(str, str2);
            }
            return this;
        }

        public a b(String str, boolean z) {
            d.a((Object) str);
            this.a.putBoolean(str, z);
            return this;
        }

        public a b(String str, e[] eVarArr) {
            d.a((Object) str);
            if (eVarArr != null) {
                ArrayList arrayList = new ArrayList();
                for (e eVar : eVarArr) {
                    if (eVar != null) {
                        arrayList.add(eVar.q);
                    }
                }
                this.a.putParcelableArray(str, (Parcelable[]) arrayList.toArray(new Bundle[arrayList.size()]));
            }
            return this;
        }

        public a b(String str, String[] strArr) {
            d.a((Object) str);
            if (strArr != null) {
                this.a.putStringArray(str, strArr);
            }
            return this;
        }

        public e b() {
            return new e(this.a);
        }

        public a c(String str) {
            d.a((Object) str);
            b(User.FN_NAME, str);
            return this;
        }

        public a d(String str) {
            if (str != null) {
                b("id", str);
            }
            return this;
        }

        public a e(String str) {
            b("type", str);
            return this;
        }

        public a f(String str) {
            b("description", str);
            return this;
        }
    }

    e(Bundle bundle) {
        this.q = bundle;
    }

    public Bundle a() {
        return this.q;
    }
}
