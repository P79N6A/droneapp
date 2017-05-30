package com.google.android.gms.internal;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.safetynet.AttestationData;
import com.google.android.gms.safetynet.HarmfulAppsData;
import com.google.android.gms.safetynet.SafeBrowsingData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class anx implements com.google.android.gms.safetynet.c {
    protected static SparseArray<aoc> a;
    protected static long b;
    private static final String c = anx.class.getSimpleName();

    static abstract class b extends anu<com.google.android.gms.safetynet.c.a> {
        protected anv c = new ant(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public void a(Status status, AttestationData attestationData) {
                this.a.b(new a(status, attestationData));
            }
        };

        public b(com.google.android.gms.common.api.g gVar) {
            super(gVar);
        }

        protected com.google.android.gms.safetynet.c.a a(Status status) {
            return new a(status, null);
        }

        protected /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    static abstract class e extends anu<com.google.android.gms.safetynet.c.b> {
        protected anv e = new ant(this) {
            final /* synthetic */ e a;

            {
                this.a = r1;
            }

            public void a(Status status, SafeBrowsingData safeBrowsingData) {
                DataHolder b = safeBrowsingData.b();
                if (b != null) {
                    try {
                        int g = b.g();
                        if (g != 0) {
                            if (anx.a != null) {
                                anx.a.clear();
                            }
                            anx.a = new SparseArray();
                            for (int i = 0; i < g; i++) {
                                aoc com_google_android_gms_internal_aoc = new aoc(b, i);
                                anx.a.put(com_google_android_gms_internal_aoc.a(), com_google_android_gms_internal_aoc);
                            }
                            anx.b = SystemClock.elapsedRealtime();
                        }
                        if (!b.h()) {
                            b.close();
                        }
                    } catch (Throwable th) {
                        if (!b.h()) {
                            b.close();
                        }
                    }
                }
                this.a.b(new g(status, safeBrowsingData));
            }
        };

        public e(com.google.android.gms.common.api.g gVar) {
            super(gVar);
        }

        protected com.google.android.gms.safetynet.c.b a(Status status) {
            return new g(status, null);
        }

        protected /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    static abstract class c extends anu<com.google.android.gms.safetynet.c.d> {
        protected anv b = new ant(this) {
            final /* synthetic */ c a;

            {
                this.a = r1;
            }

            public void a(Status status, boolean z) {
                this.a.b(new h(status, z));
            }
        };

        public c(com.google.android.gms.common.api.g gVar) {
            super(gVar);
        }

        protected com.google.android.gms.safetynet.c.d a(Status status) {
            return new h(status, false);
        }

        protected /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    static abstract class d extends anu<com.google.android.gms.safetynet.c.c> {
        protected final anv b = new ant(this) {
            final /* synthetic */ d a;

            {
                this.a = r1;
            }

            public void a(Status status, List<HarmfulAppsData> list) {
                this.a.b(new f(status, list));
            }
        };

        public d(com.google.android.gms.common.api.g gVar) {
            super(gVar);
        }

        protected com.google.android.gms.safetynet.c.c a(Status status) {
            return new f(status, new ArrayList());
        }

        protected /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    static class a implements com.google.android.gms.safetynet.c.a {
        private final Status a;
        private final AttestationData b;

        public a(Status status, AttestationData attestationData) {
            this.a = status;
            this.b = attestationData;
        }

        public Status a() {
            return this.a;
        }

        public String b() {
            return this.b == null ? null : this.b.a();
        }
    }

    static class f implements com.google.android.gms.safetynet.c.c {
        private final Status a;
        private final List<HarmfulAppsData> b;

        public f(Status status, List<HarmfulAppsData> list) {
            this.a = status;
            this.b = list;
        }

        public Status a() {
            return this.a;
        }
    }

    static class g implements com.google.android.gms.safetynet.c.b {
        private Status a;
        private final SafeBrowsingData b;
        private String c = null;

        public g(Status status, SafeBrowsingData safeBrowsingData) {
            this.a = status;
            this.b = safeBrowsingData;
            if (this.b != null) {
                this.c = this.b.a();
            } else if (this.a.f()) {
                this.a = new Status(8);
            }
        }

        public Status a() {
            return this.a;
        }

        public String b() {
            return this.c;
        }

        public List<com.google.android.gms.safetynet.a> c() {
            List<com.google.android.gms.safetynet.a> arrayList = new ArrayList();
            if (this.c == null) {
                return arrayList;
            }
            try {
                JSONArray jSONArray = new JSONObject(this.c).getJSONArray("matches");
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        arrayList.add(new com.google.android.gms.safetynet.a(Integer.parseInt(jSONArray.getJSONObject(i).getString("threat_type"))));
                    } catch (JSONException e) {
                    } catch (NumberFormatException e2) {
                    }
                }
                return arrayList;
            } catch (JSONException e3) {
                return arrayList;
            }
        }
    }

    static class h implements com.google.android.gms.safetynet.c.d {
        private final Status a;
        private final boolean b;

        public h(Status status, boolean z) {
            this.a = status;
            this.b = z;
        }

        public Status a() {
            return this.a;
        }
    }

    public i<com.google.android.gms.safetynet.c.d> a(com.google.android.gms.common.api.g gVar) {
        return gVar.a(new c(this, gVar) {
            final /* synthetic */ anx a;

            protected void a(any com_google_android_gms_internal_any) {
                com_google_android_gms_internal_any.a(this.b);
            }
        });
    }

    public i<com.google.android.gms.safetynet.c.b> a(com.google.android.gms.common.api.g gVar, final String str, final int... iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException("Null threatTypes in lookupUri");
        } else if (!TextUtils.isEmpty(str)) {
            return gVar.a(new e(this, gVar) {
                final /* synthetic */ anx c;

                protected void a(any com_google_android_gms_internal_any) {
                    List arrayList = new ArrayList();
                    for (int valueOf : iArr) {
                        arrayList.add(Integer.valueOf(valueOf));
                    }
                    com_google_android_gms_internal_any.a(this.e, arrayList, 1, str, null);
                }
            });
        } else {
            throw new IllegalArgumentException("Null or empty uri in lookupUri");
        }
    }

    public i<com.google.android.gms.safetynet.c.b> a(com.google.android.gms.common.api.g gVar, List<Integer> list, String str) {
        return a(gVar, list, str, null);
    }

    public i<com.google.android.gms.safetynet.c.b> a(com.google.android.gms.common.api.g gVar, List<Integer> list, String str, String str2) {
        if (list == null) {
            throw new IllegalArgumentException("Null threatTypes in lookupUri");
        } else if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Null or empty uri in lookupUri");
        } else {
            final List<Integer> list2 = list;
            final String str3 = str;
            final String str4 = str2;
            return gVar.a(new e(this, gVar) {
                final /* synthetic */ anx d;

                protected void a(any com_google_android_gms_internal_any) {
                    com_google_android_gms_internal_any.a(this.e, list2, 2, str3, str4);
                }
            });
        }
    }

    public i<com.google.android.gms.safetynet.c.a> a(com.google.android.gms.common.api.g gVar, final byte[] bArr) {
        return gVar.a(new b(this, gVar) {
            final /* synthetic */ anx b;

            protected void a(any com_google_android_gms_internal_any) {
                com_google_android_gms_internal_any.a(this.c, bArr);
            }
        });
    }

    public boolean a(Context context) {
        return new aoe(context).a();
    }

    public boolean a(String str, int... iArr) {
        if (iArr == null) {
            throw new IllegalArgumentException("Null threatTypes in lookupUri");
        } else if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Null or empty uri in lookupUri");
        } else if (a == null || b == 0 || SystemClock.elapsedRealtime() - b >= 1200000) {
            return true;
        } else {
            if (a == null || a.size() == 0) {
                return true;
            }
            List<aoa> b = new aod(str).b();
            if (b == null || b.isEmpty()) {
                return true;
            }
            for (aoa com_google_android_gms_internal_aoa : b) {
                for (int i : iArr) {
                    aoc com_google_android_gms_internal_aoc = (aoc) a.get(i);
                    if (com_google_android_gms_internal_aoc == null) {
                        return true;
                    }
                    if (com_google_android_gms_internal_aoc.a(com_google_android_gms_internal_aoa.a(4).a())) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public i<com.google.android.gms.safetynet.c.c> b(com.google.android.gms.common.api.g gVar) {
        return gVar.a(new d(this, gVar) {
            final /* synthetic */ anx a;

            protected void a(any com_google_android_gms_internal_any) {
                com_google_android_gms_internal_any.b(this.b);
            }
        });
    }
}
