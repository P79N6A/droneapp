package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abk;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.acr;
import com.google.android.gms.internal.acr.c;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.vt;
import com.google.android.gms.internal.wx;
import com.google.android.gms.internal.wy;
import java.util.Map;
import org.json.JSONObject;

@aaa
public class g {
    public final vt a = new vt(this) {
        final /* synthetic */ g a;

        {
            this.a = r1;
        }

        public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
            com_google_android_gms_internal_acy.b("/appSettingsFetched", this);
            synchronized (this.a.b) {
                if (map != null) {
                    if ("true".equalsIgnoreCase((String) map.get("isSuccessful"))) {
                        u.i().a(this.a.c, (String) map.get("appSettingsJson"));
                    }
                }
            }
        }
    };
    private final Object b = new Object();
    private Context c;

    private static boolean a(@Nullable abk com_google_android_gms_internal_abk) {
        if (com_google_android_gms_internal_abk == null) {
            return true;
        }
        boolean z = (((u.k().a() - com_google_android_gms_internal_abk.a()) > ((Long) uf.cf.c()).longValue() ? 1 : ((u.k().a() - com_google_android_gms_internal_abk.a()) == ((Long) uf.cf.c()).longValue() ? 0 : -1)) > 0) || !com_google_android_gms_internal_abk.b();
        return z;
    }

    public void a(Context context, VersionInfoParcel versionInfoParcel, boolean z, @Nullable abk com_google_android_gms_internal_abk, String str, @Nullable String str2) {
        if (!a(com_google_android_gms_internal_abk)) {
            return;
        }
        if (context == null) {
            b.d("Context not provided to fetch application settings");
        } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            b.d("App settings could not be fetched. Required parameters missing");
        } else {
            this.c = context;
            final wx a = u.e().a(context, versionInfoParcel);
            final String str3 = str;
            final String str4 = str2;
            final boolean z2 = z;
            final Context context2 = context;
            abv.a.post(new Runnable(this) {
                final /* synthetic */ g f;

                public void run() {
                    a.a().a(new c<wy>(this) {
                        final /* synthetic */ AnonymousClass2 a;

                        {
                            this.a = r1;
                        }

                        public void a(wy wyVar) {
                            wyVar.a("/appSettingsFetched", this.a.f.a);
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (!TextUtils.isEmpty(str3)) {
                                    jSONObject.put("app_id", str3);
                                } else if (!TextUtils.isEmpty(str4)) {
                                    jSONObject.put("ad_unit_id", str4);
                                }
                                jSONObject.put("is_init", z2);
                                jSONObject.put("pn", context2.getPackageName());
                                wyVar.a("AFMA_fetchAppSettings", jSONObject);
                            } catch (Throwable e) {
                                wyVar.b("/appSettingsFetched", this.a.f.a);
                                b.b("Error requesting application settings", e);
                            }
                        }

                        public /* synthetic */ void a(Object obj) {
                            a((wy) obj);
                        }
                    }, new acr.b());
                }
            });
        }
    }
}
