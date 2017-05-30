package com.xiaomi.market.sdk;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.drive.e;
import java.io.File;

class p implements Runnable {
    final /* synthetic */ n aS;

    p(n nVar) {
        this.aS = nVar;
    }

    public void run() {
        Throwable th;
        if (m.d(this.aS.aR) == null || m.c(this.aS.aR) == null || m.e(this.aS.aR) == null) {
            m.a(this.aS.aR, XiaomiUpdateAgent.p(m.a(this.aS.aR)));
            if (m.d(this.aS.aR) != null) {
                Cursor query;
                try {
                    query = r.j(m.a(this.aS.aR)).query(l.aE, l.aI, "package_name=?", new String[]{m.d(this.aS.aR).packageName}, null, null, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                m.a(this.aS.aR, query.getLong(query.getColumnIndex(l.aF)));
                                w wVar = new w();
                                wVar.versionCode = query.getInt(query.getColumnIndex(l.aw));
                                wVar.bl = query.getString(query.getColumnIndex(l.ay));
                                wVar.bm = query.getString(query.getColumnIndex(l.az));
                                wVar.bo = query.getString(query.getColumnIndex(l.aB));
                                wVar.bp = query.getString(query.getColumnIndex(l.aC));
                                m.a(this.aS.aR, wVar);
                                Object string = query.getString(query.getColumnIndex(l.aG));
                                if (!TextUtils.isEmpty(string)) {
                                    m.a(this.aS.aR, new File(string));
                                    if (query != null) {
                                        query.close();
                                    }
                                } else if (query != null) {
                                    query.close();
                                    return;
                                } else {
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (query != null) {
                                query.close();
                            }
                            throw th;
                        }
                    }
                    if (query != null) {
                        query.close();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    query = null;
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            }
            return;
        }
        String a = !TextUtils.isEmpty(m.c(this.aS.aR).bo) ? this.aS.e(m.e(this.aS.aR).getAbsolutePath(), m.c(this.aS.aR).bp) : m.e(this.aS.aR).getAbsolutePath();
        if (TextUtils.isEmpty(m.c(this.aS.aR).bm) || TextUtils.isEmpty(a) || TextUtils.equals(b.a(new File(a)), m.c(this.aS.aR).bm)) {
            Uri parse = Uri.parse("file://" + a);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(parse, "application/vnd.android.package-archive");
            intent.setFlags(e.a_);
            m.a(this.aS.aR).startActivity(intent);
        }
    }
}
