package com.xiaomi.market.sdk;

import android.os.AsyncTask;

class v extends AsyncTask {
    private v() {
    }

    protected void a(Boolean bool) {
        if (!bool.booleanValue()) {
            t.x();
        }
    }

    protected Boolean b(Void... voidArr) {
        return Boolean.valueOf(m.i(XiaomiUpdateAgent.mContext).a(XiaomiUpdateAgent.aL));
    }

    protected /* synthetic */ Object doInBackground(Object... objArr) {
        return b((Void[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        a((Boolean) obj);
    }
}
