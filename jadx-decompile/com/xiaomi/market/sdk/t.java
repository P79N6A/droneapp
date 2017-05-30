package com.xiaomi.market.sdk;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

class t extends AsyncTask {
    private t() {
    }

    private w a(JSONObject jSONObject) {
        if (jSONObject == null) {
            Log.e("MarketUpdateAgent", "update info json obj null");
            return null;
        }
        if (s.DEBUG) {
            Log.d("MarketUpdateAgent", "updateInfo : " + jSONObject.toString());
        }
        w wVar = new w();
        try {
            wVar.bi = jSONObject.getString(j.HOST);
            wVar.bk = jSONObject.getInt(j.at);
            wVar.bj = jSONObject.getInt("source");
            wVar.updateLog = jSONObject.getString(j.av);
            wVar.versionCode = jSONObject.getInt("versionCode");
            wVar.versionName = jSONObject.getString(j.ax);
            wVar.bl = jSONObject.getString(j.ay);
            wVar.bm = jSONObject.getString("apkHash");
            wVar.bn = jSONObject.getLong(j.aA);
            if (XiaomiUpdateAgent.bg) {
                wVar.bo = jSONObject.getString(j.aB);
                wVar.bp = jSONObject.getString(j.aC);
                wVar.bq = jSONObject.getLong(j.aD);
            }
            return wVar;
        } catch (JSONException e) {
            Log.e("MarketUpdateAgent", "get update info failed : " + e.toString());
            Log.e("MarketUpdateAgent", "original content : " + jSONObject.toString());
            return null;
        }
    }

    private String w() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(j.ah, a.b + "*" + a.c);
            jSONObject.put(j.ai, a.d);
            jSONObject.put(j.aj, a.e);
            jSONObject.put(j.ak, a.f);
            jSONObject.put(j.al, a.g);
            jSONObject.put(j.am, a.h);
            jSONObject.put(j.an, a.i);
            jSONObject.put(j.ao, a.j);
            jSONObject.put("sdk", a.k);
            jSONObject.put("version", a.l);
            jSONObject.put("release", a.RELEASE);
            jSONObject.put(j.as, b.a(a.m));
            return jSONObject.toString();
        } catch (JSONException e) {
            return "";
        }
    }

    private static void x() {
        if ((XiaomiUpdateAgent.mContext instanceof Activity) && ((Activity) XiaomiUpdateAgent.mContext).isFinishing()) {
            Log.e("MarketUpdateAgent", "activity not running!");
            return;
        }
        CharSequence string;
        Builder title = new Builder(XiaomiUpdateAgent.mContext).setTitle(XiaomiUpdateAgent.mContext.getString(s.b(XiaomiUpdateAgent.mContext.getPackageName(), "string", "xiaomi_update_dialog_title"), new Object[]{XiaomiUpdateAgent.aL.aT}));
        if (TextUtils.isEmpty(XiaomiUpdateAgent.aK.bo)) {
            string = XiaomiUpdateAgent.mContext.getString(s.b(XiaomiUpdateAgent.mContext.getPackageName(), "string", "xiaomi_update_dialog_message"), new Object[]{XiaomiUpdateAgent.aK.versionName, s.a(XiaomiUpdateAgent.aK.bn, XiaomiUpdateAgent.mContext)});
        } else {
            string = XiaomiUpdateAgent.mContext.getString(s.b(XiaomiUpdateAgent.mContext.getPackageName(), "string", "xiaomi_update_dialog_message_diff"), new Object[]{XiaomiUpdateAgent.aK.versionName, s.a(XiaomiUpdateAgent.aK.bq, XiaomiUpdateAgent.mContext)});
        }
        title.setMessage(string).setNegativeButton(17039360, null).setPositiveButton(17039370, new u()).show();
    }

    protected Integer a(Void... voidArr) {
        if (!s.m(XiaomiUpdateAgent.mContext)) {
            return Integer.valueOf(3);
        }
        if (!s.n(XiaomiUpdateAgent.mContext) && XiaomiUpdateAgent.bf) {
            return Integer.valueOf(2);
        }
        a.a(XiaomiUpdateAgent.mContext);
        XiaomiUpdateAgent.aL = XiaomiUpdateAgent.p(XiaomiUpdateAgent.mContext);
        if (XiaomiUpdateAgent.aL == null) {
            return Integer.valueOf(5);
        }
        c cVar = new c(j.V);
        cVar.getClass();
        h hVar = new h(cVar);
        hVar.d(j.ag, w());
        hVar.d(j.W, XiaomiUpdateAgent.aL.packageName);
        hVar.d("versionCode", new StringBuilder(String.valueOf(XiaomiUpdateAgent.aL.versionCode)).toString());
        hVar.d("apkHash", XiaomiUpdateAgent.aL.aV);
        hVar.d("signature", XiaomiUpdateAgent.aL.aU);
        hVar.d(j.aa, a.n);
        hVar.d("sdk", String.valueOf(a.k));
        hVar.d(j.ac, a.l);
        hVar.d(j.ad, a.LANGUAGE);
        hVar.d(j.ae, a.COUNTRY);
        hVar.d(j.af, "0");
        if (g.OK == cVar.h()) {
            XiaomiUpdateAgent.aK = a(cVar.e());
            if (XiaomiUpdateAgent.aK != null) {
                Log.i("MarketUpdateAgent", XiaomiUpdateAgent.aK.toString());
                return Integer.valueOf(XiaomiUpdateAgent.aK.bk == 0 ? 0 : 1);
            }
        }
        return Integer.valueOf(4);
    }

    protected void a(Integer num) {
        if (XiaomiUpdateAgent.be) {
            switch (num.intValue()) {
                case 0:
                    new v().execute(new Void[0]);
                    return;
                default:
                    return;
            }
        }
        UpdateResponse updateResponse = new UpdateResponse();
        if (num.intValue() == 0) {
            updateResponse.updateLog = XiaomiUpdateAgent.aK.updateLog;
            updateResponse.versionCode = XiaomiUpdateAgent.aK.versionCode;
            updateResponse.versionName = XiaomiUpdateAgent.aK.versionName;
            updateResponse.path = c.c(XiaomiUpdateAgent.aK.bi, XiaomiUpdateAgent.aK.bl);
        }
        if (XiaomiUpdateAgent.bh != null) {
            XiaomiUpdateAgent.bh.onUpdateReturned(num.intValue(), updateResponse);
        }
    }

    protected /* synthetic */ Object doInBackground(Object... objArr) {
        return a((Void[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        a((Integer) obj);
    }

    protected void onPreExecute() {
        Log.d("MarketUpdateAgent", "start to check update");
        if (!XiaomiUpdateAgent.bg) {
            XiaomiUpdateAgent.bg = Patcher.o();
        }
    }
}
