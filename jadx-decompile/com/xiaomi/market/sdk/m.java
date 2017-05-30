package com.xiaomi.market.sdk;

import android.app.DownloadManager;
import android.app.DownloadManager.Query;
import android.content.Context;
import android.database.Cursor;
import android.os.HandlerThread;
import com.fimi.kernel.a;
import java.io.File;

public class m {
    public static m aJ;
    private w aK;
    private q aL;
    private long aM = -1;
    private File aN;
    private DownloadManager aO;
    private HandlerThread aP;
    private n aQ;
    private Context mContext;

    private m(Context context) {
        this.mContext = context;
        this.aO = (DownloadManager) this.mContext.getSystemService(a.a);
        this.aP = new HandlerThread("Worker Thread");
        this.aP.start();
        this.aQ = new n(this, this.aP.getLooper());
    }

    public static m i(Context context) {
        if (aJ == null) {
            aJ = new m(context);
        }
        return aJ;
    }

    public void a(long j) {
        if (this.aM <= 0 || this.aM == j) {
            this.aQ.m();
        }
    }

    public void a(q qVar, w wVar) {
        if (wVar != null && qVar != null) {
            this.aK = wVar;
            this.aL = qVar;
            this.aQ.l();
        }
    }

    public boolean a(q qVar) {
        long j;
        Cursor query;
        int i;
        Cursor query2 = r.j(this.mContext).query(l.aE, l.aI, "package_name=?", new String[]{qVar.packageName}, null, null, null);
        if (query2 != null) {
            try {
                if (query2.moveToFirst()) {
                    j = query2.getLong(query2.getColumnIndex(l.aF));
                    if (j != -1) {
                        if (query2 != null) {
                            query2.close();
                        }
                        return false;
                    }
                    if (query2 != null) {
                        query2.close();
                    }
                    Query query3 = new Query();
                    query3.setFilterById(new long[]{j});
                    query = this.aO.query(query3);
                    i = -1;
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                i = query.getInt(query.getColumnIndexOrThrow("status"));
                            }
                        } catch (Throwable th) {
                            if (query != null) {
                                query.close();
                            }
                        }
                    }
                    if (i != 4 || i == 1 || i == 2) {
                        if (query != null) {
                            query.close();
                        }
                        return true;
                    }
                    if (query != null) {
                        query.close();
                    }
                    return false;
                }
            } catch (Throwable th2) {
                if (query2 != null) {
                    query2.close();
                }
            }
        }
        j = -1;
        if (j != -1) {
            if (query2 != null) {
                query2.close();
            }
            Query query32 = new Query();
            query32.setFilterById(new long[]{j});
            query = this.aO.query(query32);
            i = -1;
            if (query != null) {
                if (query.moveToFirst()) {
                    i = query.getInt(query.getColumnIndexOrThrow("status"));
                }
            }
            if (i != 4) {
            }
            if (query != null) {
                query.close();
            }
            return true;
        }
        if (query2 != null) {
            query2.close();
        }
        return false;
    }
}
