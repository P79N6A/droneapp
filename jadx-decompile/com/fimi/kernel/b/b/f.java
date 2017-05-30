package com.fimi.kernel.b.b;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.fimi.kernel.b.b.b.e;
import java.util.ArrayList;
import java.util.List;

class f {
    private static f a = null;
    private SQLiteDatabase b = null;
    private Context c;

    public interface a {
        void a(b bVar);
    }

    private f(Context context) {
        this.c = context;
        try {
            this.b = new a(context).getWritableDatabase();
        } catch (Exception e) {
            Log.d("ljh", e.getMessage());
        }
    }

    public static f a(Context context) {
        if (context == null) {
            return null;
        }
        if (a == null) {
            a = new f(context);
            a.c = context;
        }
        return a;
    }

    private SQLiteDatabase d() {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = new a(this.c).getWritableDatabase();
        } catch (Exception e) {
            Log.d("Good", e + "");
        }
        return sQLiteDatabase;
    }

    public synchronized b a(Context context, String str, final a aVar) {
        Exception exception;
        Cursor cursor;
        b bVar;
        Throwable th;
        Cursor rawQuery;
        try {
            rawQuery = a.b.rawQuery("select url,local_uri,file_size from download_task where url=?", new String[]{str});
            b bVar2 = null;
            while (rawQuery.moveToNext()) {
                try {
                    bVar2 = b.a(context, rawQuery.getString(0), rawQuery.getLong(2), Boolean.valueOf(false), rawQuery.getString(1), new e(this) {
                        final /* synthetic */ f b;

                        public void a(b bVar) {
                            if (aVar != null) {
                                aVar.a(bVar);
                            }
                        }
                    });
                } catch (Exception e) {
                    exception = e;
                    cursor = rawQuery;
                    bVar = bVar2;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
                bVar = bVar2;
            } else {
                bVar = bVar2;
            }
        } catch (Exception e2) {
            cursor = null;
            Exception exception2 = e2;
            bVar = null;
            exception = exception2;
            try {
                exception.printStackTrace();
                if (cursor != null) {
                    cursor.close();
                }
                return bVar;
            } catch (Throwable th3) {
                th = th3;
                rawQuery = cursor;
                if (rawQuery != null) {
                    rawQuery.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            rawQuery = null;
            if (rawQuery != null) {
                rawQuery.close();
            }
            throw th;
        }
        return bVar;
    }

    public List<String> a() {
        Cursor cursor = null;
        List<String> arrayList = new ArrayList();
        try {
            cursor = a.b.rawQuery("select url from download_info group by url", null);
            while (cursor.moveToNext()) {
                arrayList.add(cursor.getString(0));
            }
            if (cursor != null) {
                cursor.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return arrayList;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(int r5, long r6, java.lang.String r8) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = a;	 Catch:{ Exception -> 0x0035 }
        r0 = r0.b;	 Catch:{ Exception -> 0x0035 }
        r0.beginTransaction();	 Catch:{ Exception -> 0x0035 }
        r0 = "update download_info set compelete_size=? where thread_id=? and url=?";
        r1 = 3;
        r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x0035 }
        r2 = 0;
        r3 = java.lang.Long.valueOf(r6);	 Catch:{ Exception -> 0x0035 }
        r1[r2] = r3;	 Catch:{ Exception -> 0x0035 }
        r2 = 1;
        r3 = java.lang.Integer.valueOf(r5);	 Catch:{ Exception -> 0x0035 }
        r1[r2] = r3;	 Catch:{ Exception -> 0x0035 }
        r2 = 2;
        r1[r2] = r8;	 Catch:{ Exception -> 0x0035 }
        r2 = a;	 Catch:{ Exception -> 0x0035 }
        r2 = r2.b;	 Catch:{ Exception -> 0x0035 }
        r2.execSQL(r0, r1);	 Catch:{ Exception -> 0x0035 }
        r0 = a;	 Catch:{ Exception -> 0x0035 }
        r0 = r0.b;	 Catch:{ Exception -> 0x0035 }
        r0.setTransactionSuccessful();	 Catch:{ Exception -> 0x0035 }
        r0 = a;	 Catch:{ Exception -> 0x0051 }
        r0 = r0.b;	 Catch:{ Exception -> 0x0051 }
        r0.endTransaction();	 Catch:{ Exception -> 0x0051 }
    L_0x0033:
        monitor-exit(r4);
        return;
    L_0x0035:
        r0 = move-exception;
        r0.printStackTrace();	 Catch:{ all -> 0x0043 }
        r0 = a;	 Catch:{ Exception -> 0x0041 }
        r0 = r0.b;	 Catch:{ Exception -> 0x0041 }
        r0.endTransaction();	 Catch:{ Exception -> 0x0041 }
        goto L_0x0033;
    L_0x0041:
        r0 = move-exception;
        goto L_0x0033;
    L_0x0043:
        r0 = move-exception;
        r1 = a;	 Catch:{ Exception -> 0x004f }
        r1 = r1.b;	 Catch:{ Exception -> 0x004f }
        r1.endTransaction();	 Catch:{ Exception -> 0x004f }
    L_0x004b:
        throw r0;	 Catch:{ all -> 0x004c }
    L_0x004c:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
    L_0x004f:
        r1 = move-exception;
        goto L_0x004b;
    L_0x0051:
        r0 = move-exception;
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fimi.kernel.b.b.f.a(int, long, java.lang.String):void");
    }

    public synchronized void a(b bVar) {
        try {
            Object[] objArr = new Object[]{bVar.m(), bVar.h(), Long.valueOf(bVar.i()), bVar.a()};
            a.b.execSQL("insert into download_task(url,local_uri,file_size,dur) values (?,?,?,?)", objArr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void a(List<d> list) {
        try {
            for (d dVar : list) {
                Object[] objArr = new Object[]{Integer.valueOf(dVar.b()), Long.valueOf(dVar.c()), Long.valueOf(dVar.d()), Long.valueOf(dVar.e()), dVar.a()};
                a.b.execSQL("insert into download_info(thread_id,start_pos, end_pos,compelete_size,url) values (?,?,?,?,?)", objArr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return;
    }

    public synchronized boolean a(String str) {
        boolean z = true;
        synchronized (this) {
            int i;
            Cursor cursor = null;
            try {
                cursor = a.b.rawQuery("select count(*)  from download_info where url=?", new String[]{str});
                i = cursor.moveToFirst() ? cursor.getInt(0) : -1;
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (cursor != null) {
                    cursor.close();
                    i = -1;
                } else {
                    i = -1;
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
            }
            if (i <= 0) {
                z = false;
            }
        }
        return z;
    }

    public synchronized b b(String str) {
        b bVar;
        Exception exception;
        Exception exception2;
        Throwable th;
        Cursor rawQuery;
        try {
            rawQuery = a.b.rawQuery("select url,local_uri,dur from download_task where url=?", new String[]{str});
            bVar = null;
            while (rawQuery.moveToNext()) {
                try {
                    b bVar2 = new b(rawQuery.getString(0), rawQuery.getString(1));
                    try {
                        if (rawQuery.getString(2) != null) {
                            bVar2.a(rawQuery.getString(2));
                            bVar = bVar2;
                        } else {
                            bVar = bVar2;
                        }
                    } catch (Exception e) {
                        exception = e;
                        bVar = bVar2;
                        exception2 = exception;
                    }
                } catch (Exception e2) {
                    exception2 = e2;
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
        } catch (Exception e3) {
            rawQuery = null;
            exception = e3;
            bVar = null;
            exception2 = exception;
            try {
                exception2.printStackTrace();
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return bVar;
            } catch (Throwable th2) {
                th = th2;
                if (rawQuery != null) {
                    rawQuery.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            rawQuery = null;
            if (rawQuery != null) {
                rawQuery.close();
            }
            throw th;
        }
        return bVar;
    }

    public synchronized List<b> b() {
        List<b> arrayList;
        Cursor cursor = null;
        synchronized (this) {
            arrayList = new ArrayList();
            try {
                cursor = a.b.rawQuery("select url,local_uri from download_task", null);
                cursor.moveToFirst();
                while (cursor.moveToNext()) {
                    arrayList.add(new b(cursor.getString(0), cursor.getString(1)));
                }
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        return arrayList;
    }

    public synchronized List<d> c(String str) {
        List<d> arrayList;
        Cursor rawQuery;
        Exception e;
        Throwable th;
        arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            rawQuery = a.b.rawQuery("select thread_id, start_pos, end_pos,compelete_size,url from download_info where url=?", new String[]{str});
            while (rawQuery.moveToNext()) {
                try {
                    arrayList.add(new d(rawQuery.getInt(0), rawQuery.getLong(1), rawQuery.getLong(2), rawQuery.getLong(3), rawQuery.getString(4)));
                } catch (Exception e2) {
                    e = e2;
                    cursor = rawQuery;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
        } catch (Exception e3) {
            e = e3;
            try {
                e.printStackTrace();
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            } catch (Throwable th3) {
                th = th3;
                rawQuery = cursor;
                if (rawQuery != null) {
                    rawQuery.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            rawQuery = null;
            if (rawQuery != null) {
                rawQuery.close();
            }
            throw th;
        }
        return arrayList;
    }

    public synchronized void c() {
        try {
            a.b.execSQL("DELETE FROM download_info");
            a.b.execSQL("DELETE FROM download_task");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void d(String str) {
        try {
            a.b.delete("download_info", "url=?", new String[]{str});
            a.b.delete("download_task", "url=?", new String[]{str});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void finalize() {
        this.b.close();
        super.finalize();
    }
}
