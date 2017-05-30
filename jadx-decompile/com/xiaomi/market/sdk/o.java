package com.xiaomi.market.sdk;

import android.app.DownloadManager.Request;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.widget.Toast;
import java.io.File;

class o implements Runnable {
    final /* synthetic */ n aS;

    o(n nVar) {
        this.aS = nVar;
    }

    public void run() {
        if (!s.f(true)) {
            Toast.makeText(m.a(this.aS.aR), s.b(m.a(this.aS.aR).getPackageName(), "string", "xiaomi_external_storage_unavailable"), 0).show();
        } else if (m.b(this.aS.aR) != null) {
            Uri parse = Uri.parse(TextUtils.isEmpty(m.c(this.aS.aR).bo) ? c.c(m.c(this.aS.aR).bi, m.c(this.aS.aR).bl) : c.c(m.c(this.aS.aR).bi, m.c(this.aS.aR).bo));
            File file = new File(new StringBuilder(String.valueOf(m.a(this.aS.aR).getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath())).append("/updates").toString());
            if (!(file == null || file.exists())) {
                file.mkdirs();
            }
            m.a(this.aS.aR, new File(file.getAbsolutePath() + "/" + m.d(this.aS.aR).packageName + m.c(this.aS.aR).versionCode));
            if (m.e(this.aS.aR).exists()) {
                m.e(this.aS.aR).delete();
            }
            Uri parse2 = Uri.parse("file://" + m.e(this.aS.aR).getAbsolutePath());
            Request request = new Request(parse);
            request.setMimeType("application/apk-ota");
            request.setTitle(m.d(this.aS.aR).aT);
            request.setDestinationUri(parse2);
            m.a(this.aS.aR, m.b(this.aS.aR).enqueue(request));
            ContentValues contentValues = new ContentValues();
            contentValues.put(l.PACKAGE_NAME, m.d(this.aS.aR).packageName);
            contentValues.put(l.aF, Long.valueOf(m.f(this.aS.aR)));
            contentValues.put(l.aw, Integer.valueOf(m.c(this.aS.aR).versionCode));
            contentValues.put(l.ay, m.c(this.aS.aR).bl);
            contentValues.put(l.az, m.c(this.aS.aR).bm);
            contentValues.put(l.aB, m.c(this.aS.aR).bo);
            contentValues.put(l.aC, m.c(this.aS.aR).bp);
            contentValues.put(l.aG, m.e(this.aS.aR).getAbsolutePath());
            r.j(m.a(this.aS.aR)).a(contentValues);
        }
    }
}
