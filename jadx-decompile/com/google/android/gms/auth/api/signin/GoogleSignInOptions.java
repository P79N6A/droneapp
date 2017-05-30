package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a.a.d;
import com.google.android.gms.common.f;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class GoogleSignInOptions extends AbstractSafeParcelable implements d, ReflectedParcelable {
    public static final Creator<GoogleSignInOptions> CREATOR = new e();
    public static final Scope a = new Scope(f.a);
    public static final Scope b = new Scope(f.b);
    public static final Scope c = new Scope("openid");
    public static final GoogleSignInOptions d = new a().a().c().d();
    private static Comparator<Scope> m = new Comparator<Scope>() {
        public int a(Scope scope, Scope scope2) {
            return scope.a().compareTo(scope2.a());
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return a((Scope) obj, (Scope) obj2);
        }
    };
    final int e;
    private final ArrayList<Scope> f;
    private Account g;
    private boolean h;
    private final boolean i;
    private final boolean j;
    private String k;
    private String l;

    public static final class a {
        private Set<Scope> a = new HashSet();
        private boolean b;
        private boolean c;
        private boolean d;
        private String e;
        private Account f;
        private String g;

        public a(@NonNull GoogleSignInOptions googleSignInOptions) {
            com.google.android.gms.common.internal.d.a((Object) googleSignInOptions);
            this.a = new HashSet(googleSignInOptions.f);
            this.b = googleSignInOptions.i;
            this.c = googleSignInOptions.j;
            this.d = googleSignInOptions.h;
            this.e = googleSignInOptions.k;
            this.f = googleSignInOptions.g;
            this.g = googleSignInOptions.l;
        }

        private String e(String str) {
            com.google.android.gms.common.internal.d.a(str);
            boolean z = this.e == null || this.e.equals(str);
            com.google.android.gms.common.internal.d.b(z, "two different server client ids provided");
            return str;
        }

        public a a() {
            this.a.add(GoogleSignInOptions.c);
            return this;
        }

        public a a(Scope scope, Scope... scopeArr) {
            this.a.add(scope);
            this.a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public a a(String str) {
            this.d = true;
            this.e = e(str);
            return this;
        }

        public a a(String str, boolean z) {
            this.b = true;
            this.e = e(str);
            this.c = z;
            return this;
        }

        public a b() {
            this.a.add(GoogleSignInOptions.b);
            return this;
        }

        public a b(String str) {
            return a(str, false);
        }

        public a c() {
            this.a.add(GoogleSignInOptions.a);
            return this;
        }

        public a c(String str) {
            this.f = new Account(com.google.android.gms.common.internal.d.a(str), "com.google");
            return this;
        }

        public a d(String str) {
            this.g = com.google.android.gms.common.internal.d.a(str);
            return this;
        }

        public GoogleSignInOptions d() {
            if (this.d && (this.f == null || !this.a.isEmpty())) {
                a();
            }
            return new GoogleSignInOptions(this.a, this.f, this.d, this.b, this.c, this.e, this.g);
        }
    }

    GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2) {
        this.e = i;
        this.f = arrayList;
        this.g = account;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = str;
        this.l = str2;
    }

    private GoogleSignInOptions(Set<Scope> set, Account account, boolean z, boolean z2, boolean z3, String str, String str2) {
        this(2, new ArrayList(set), account, z, z2, z3, str, str2);
    }

    @Nullable
    public static GoogleSignInOptions a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        Set hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        Object optString = jSONObject.optString("accountName", null);
        return new GoogleSignInOptions(hashSet, !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null));
    }

    private JSONObject j() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f, m);
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).a());
            }
            jSONObject.put("scopes", jSONArray);
            if (this.g != null) {
                jSONObject.put("accountName", this.g.name);
            }
            jSONObject.put("idTokenRequested", this.h);
            jSONObject.put("forceCodeForRefreshToken", this.j);
            jSONObject.put("serverAuthRequested", this.i);
            if (!TextUtils.isEmpty(this.k)) {
                jSONObject.put("serverClientId", this.k);
            }
            if (!TextUtils.isEmpty(this.l)) {
                jSONObject.put("hostedDomain", this.l);
            }
            return jSONObject;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Scope> a() {
        return new ArrayList(this.f);
    }

    public Scope[] b() {
        return (Scope[]) this.f.toArray(new Scope[this.f.size()]);
    }

    public Account c() {
        return this.g;
    }

    public boolean d() {
        return this.h;
    }

    public boolean e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.f.size() != googleSignInOptions.a().size() || !this.f.containsAll(googleSignInOptions.a())) {
                return false;
            }
            if (this.g == null) {
                if (googleSignInOptions.c() != null) {
                    return false;
                }
            } else if (!this.g.equals(googleSignInOptions.c())) {
                return false;
            }
            if (TextUtils.isEmpty(this.k)) {
                if (!TextUtils.isEmpty(googleSignInOptions.g())) {
                    return false;
                }
            } else if (!this.k.equals(googleSignInOptions.g())) {
                return false;
            }
            return this.j == googleSignInOptions.f() && this.h == googleSignInOptions.d() && this.i == googleSignInOptions.e();
        } catch (ClassCastException e) {
            return false;
        }
    }

    public boolean f() {
        return this.j;
    }

    public String g() {
        return this.k;
    }

    public String h() {
        return this.l;
    }

    public int hashCode() {
        Object arrayList = new ArrayList();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            arrayList.add(((Scope) it.next()).a());
        }
        Collections.sort(arrayList);
        return new com.google.android.gms.auth.api.signin.internal.d().a(arrayList).a(this.g).a(this.k).a(this.j).a(this.h).a(this.i).a();
    }

    public String i() {
        return j().toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        e.a(this, parcel, i);
    }
}
