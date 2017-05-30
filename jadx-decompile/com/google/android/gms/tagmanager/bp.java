package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.fimi.soul.entity.User;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import com.tencent.mm.sdk.platformtools.Util;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class bp implements ad {
    private static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL,'%s' INTEGER NOT NULL);", new Object[]{"gtm_hits", "hit_id", "hit_time", "hit_url", "hit_first_send_time"});
    private final b b;
    private volatile k c;
    private final ae d;
    private final Context e;
    private final String f;
    private long g;
    private e h;
    private final int i;

    class a implements com.google.android.gms.tagmanager.cp.a {
        final /* synthetic */ bp a;

        a(bp bpVar) {
            this.a = bpVar;
        }

        public void a(z zVar) {
            this.a.a(zVar.a());
        }

        public void b(z zVar) {
            this.a.a(zVar.a());
            aw.e("Permanent failure dispatching hitId: " + zVar.a());
        }

        public void c(z zVar) {
            long b = zVar.b();
            if (b == 0) {
                this.a.a(zVar.a(), this.a.h.a());
            } else if (b + 14400000 < this.a.h.a()) {
                this.a.a(zVar.a());
                aw.e("Giving up on failed hitId: " + zVar.a());
            }
        }
    }

    class b extends SQLiteOpenHelper {
        final /* synthetic */ bp a;
        private boolean b;
        private long c = 0;

        b(bp bpVar, Context context, String str) {
            this.a = bpVar;
            super(context, str, null, 1);
        }

        private void a(SQLiteDatabase sQLiteDatabase) {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM gtm_hits WHERE 0", null);
            Set hashSet = new HashSet();
            try {
                String[] columnNames = rawQuery.getColumnNames();
                for (Object add : columnNames) {
                    hashSet.add(add);
                }
                if (!hashSet.remove("hit_id") || !hashSet.remove("hit_url") || !hashSet.remove("hit_time") || !hashSet.remove("hit_first_send_time")) {
                    throw new SQLiteException("Database column missing");
                } else if (!hashSet.isEmpty()) {
                    throw new SQLiteException("Database has extra columns");
                }
            } finally {
                rawQuery.close();
            }
        }

        private boolean a(String str, SQLiteDatabase sQLiteDatabase) {
            Cursor cursor;
            String str2;
            String valueOf;
            Throwable th;
            Cursor cursor2 = null;
            try {
                Cursor query = sQLiteDatabase.query("SQLITE_MASTER", new String[]{User.FN_NAME}, "name=?", new String[]{str}, null, null, null);
                try {
                    boolean moveToFirst = query.moveToFirst();
                    if (query == null) {
                        return moveToFirst;
                    }
                    query.close();
                    return moveToFirst;
                } catch (SQLiteException e) {
                    cursor = query;
                    try {
                        str2 = "Error querying for table ";
                        valueOf = String.valueOf(str);
                        aw.b(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    } catch (Throwable th2) {
                        cursor2 = cursor;
                        th = th2;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor2 = query;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                cursor = null;
                str2 = "Error querying for table ";
                valueOf = String.valueOf(str);
                if (valueOf.length() == 0) {
                }
                aw.b(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            } catch (Throwable th4) {
                th = th4;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        }

        public SQLiteDatabase getWritableDatabase() {
            if (!this.b || this.c + Util.MILLSECONDS_OF_HOUR <= this.a.h.a()) {
                SQLiteDatabase sQLiteDatabase = null;
                this.b = true;
                this.c = this.a.h.a();
                try {
                    sQLiteDatabase = super.getWritableDatabase();
                } catch (SQLiteException e) {
                    this.a.e.getDatabasePath(this.a.f).delete();
                }
                if (sQLiteDatabase == null) {
                    sQLiteDatabase = super.getWritableDatabase();
                }
                this.b = false;
                return sQLiteDatabase;
            }
            throw new SQLiteException("Database creation failed");
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            u.a(sQLiteDatabase.getPath());
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (VERSION.SDK_INT < 15) {
                Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
                try {
                    rawQuery.moveToFirst();
                } finally {
                    rawQuery.close();
                }
            }
            if (a("gtm_hits", sQLiteDatabase)) {
                a(sQLiteDatabase);
            } else {
                sQLiteDatabase.execSQL(bp.a);
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    bp(ae aeVar, Context context) {
        this(aeVar, context, "gtm_urls.db", 2000);
    }

    bp(ae aeVar, Context context, String str, int i) {
        this.e = context.getApplicationContext();
        this.f = str;
        this.d = aeVar;
        this.h = h.d();
        this.b = new b(this, this.e, this.f);
        this.c = new cp(this.e, new a(this));
        this.g = 0;
        this.i = i;
    }

    private SQLiteDatabase a(String str) {
        try {
            return this.b.getWritableDatabase();
        } catch (SQLiteException e) {
            aw.b(str);
            return null;
        }
    }

    private void a(long j) {
        a(new String[]{String.valueOf(j)});
    }

    private void a(long j, long j2) {
        SQLiteDatabase a = a("Error opening database for getNumStoredHits.");
        if (a != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("hit_first_send_time", Long.valueOf(j2));
            try {
                a.update("gtm_hits", contentValues, "hit_id=?", new String[]{String.valueOf(j)});
            } catch (SQLiteException e) {
                aw.b("Error setting HIT_FIRST_DISPATCH_TIME for hitId: " + j);
                a(j);
            }
        }
    }

    private void b(long j, String str) {
        SQLiteDatabase a = a("Error opening database for putHit");
        if (a != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("hit_time", Long.valueOf(j));
            contentValues.put("hit_url", str);
            contentValues.put("hit_first_send_time", Integer.valueOf(0));
            try {
                a.insert("gtm_hits", null, contentValues);
                this.d.a(false);
            } catch (SQLiteException e) {
                aw.b("Error storing hit");
            }
        }
    }

    private void f() {
        int c = (c() - this.i) + 1;
        if (c > 0) {
            List a = a(c);
            aw.e("Store full, deleting " + a.size() + " hits to make room.");
            a((String[]) a.toArray(new String[0]));
        }
    }

    List<String> a(int i) {
        Cursor query;
        SQLiteException e;
        String str;
        String valueOf;
        Throwable th;
        List<String> arrayList = new ArrayList();
        if (i <= 0) {
            aw.b("Invalid maxHits specified. Skipping");
            return arrayList;
        }
        SQLiteDatabase a = a("Error opening database for peekHitIds.");
        if (a == null) {
            return arrayList;
        }
        try {
            query = a.query("gtm_hits", new String[]{"hit_id"}, null, null, null, null, String.format("%s ASC", new Object[]{"hit_id"}), Integer.toString(i));
            try {
                if (query.moveToFirst()) {
                    do {
                        arrayList.add(String.valueOf(query.getLong(0)));
                    } while (query.moveToNext());
                }
                if (query != null) {
                    query.close();
                }
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    str = "Error in peekHits fetching hitIds: ";
                    valueOf = String.valueOf(e.getMessage());
                    aw.b(valueOf.length() == 0 ? str.concat(valueOf) : new String(str));
                    if (query != null) {
                        query.close();
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            query = null;
            str = "Error in peekHits fetching hitIds: ";
            valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() == 0) {
            }
            aw.b(valueOf.length() == 0 ? str.concat(valueOf) : new String(str));
            if (query != null) {
                query.close();
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
        return arrayList;
    }

    public void a() {
        aw.e("GTM Dispatch running...");
        if (this.c.a()) {
            List b = b(40);
            if (b.isEmpty()) {
                aw.e("...nothing to dispatch");
                this.d.a(true);
                return;
            }
            this.c.a(b);
            if (d() > 0) {
                cm.c().a();
            }
        }
    }

    public void a(long j, String str) {
        b();
        f();
        b(j, str);
    }

    void a(String[] strArr) {
        boolean z = true;
        if (strArr != null && strArr.length != 0) {
            SQLiteDatabase a = a("Error opening database for deleteHits.");
            if (a != null) {
                try {
                    a.delete("gtm_hits", String.format("HIT_ID in (%s)", new Object[]{TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, Collections.nCopies(strArr.length, "?"))}), strArr);
                    ae aeVar = this.d;
                    if (c() != 0) {
                        z = false;
                    }
                    aeVar.a(z);
                } catch (SQLiteException e) {
                    aw.b("Error deleting hits");
                }
            }
        }
    }

    int b() {
        boolean z = true;
        long a = this.h.a();
        if (a <= this.g + 86400000) {
            return 0;
        }
        this.g = a;
        SQLiteDatabase a2 = a("Error opening database for deleteStaleHits.");
        if (a2 == null) {
            return 0;
        }
        int delete = a2.delete("gtm_hits", "HIT_TIME < ?", new String[]{Long.toString(this.h.a() - 2592000000L)});
        ae aeVar = this.d;
        if (c() != 0) {
            z = false;
        }
        aeVar.a(z);
        return delete;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.google.android.gms.tagmanager.z> b(int r17) {
        /*
        r16 = this;
        r11 = new java.util.ArrayList;
        r11.<init>();
        r2 = "Error opening database for peekHits";
        r0 = r16;
        r2 = r0.a(r2);
        if (r2 != 0) goto L_0x0011;
    L_0x000f:
        r2 = r11;
    L_0x0010:
        return r2;
    L_0x0011:
        r12 = 0;
        r3 = "gtm_hits";
        r4 = 3;
        r4 = new java.lang.String[r4];	 Catch:{ SQLiteException -> 0x00ca, all -> 0x0172 }
        r5 = 0;
        r6 = "hit_id";
        r4[r5] = r6;	 Catch:{ SQLiteException -> 0x00ca, all -> 0x0172 }
        r5 = 1;
        r6 = "hit_time";
        r4[r5] = r6;	 Catch:{ SQLiteException -> 0x00ca, all -> 0x0172 }
        r5 = 2;
        r6 = "hit_first_send_time";
        r4[r5] = r6;	 Catch:{ SQLiteException -> 0x00ca, all -> 0x0172 }
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r9 = "%s ASC";
        r10 = 1;
        r10 = new java.lang.Object[r10];	 Catch:{ SQLiteException -> 0x00ca, all -> 0x0172 }
        r13 = 0;
        r14 = "hit_id";
        r10[r13] = r14;	 Catch:{ SQLiteException -> 0x00ca, all -> 0x0172 }
        r9 = java.lang.String.format(r9, r10);	 Catch:{ SQLiteException -> 0x00ca, all -> 0x0172 }
        r10 = java.lang.Integer.toString(r17);	 Catch:{ SQLiteException -> 0x00ca, all -> 0x0172 }
        r13 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10);	 Catch:{ SQLiteException -> 0x00ca, all -> 0x0172 }
        r12 = new java.util.ArrayList;	 Catch:{ SQLiteException -> 0x0178, all -> 0x0174 }
        r12.<init>();	 Catch:{ SQLiteException -> 0x0178, all -> 0x0174 }
        r3 = r13.moveToFirst();	 Catch:{ SQLiteException -> 0x017e, all -> 0x0174 }
        if (r3 == 0) goto L_0x0068;
    L_0x004b:
        r3 = new com.google.android.gms.tagmanager.z;	 Catch:{ SQLiteException -> 0x017e, all -> 0x0174 }
        r4 = 0;
        r4 = r13.getLong(r4);	 Catch:{ SQLiteException -> 0x017e, all -> 0x0174 }
        r6 = 1;
        r6 = r13.getLong(r6);	 Catch:{ SQLiteException -> 0x017e, all -> 0x0174 }
        r8 = 2;
        r8 = r13.getLong(r8);	 Catch:{ SQLiteException -> 0x017e, all -> 0x0174 }
        r3.<init>(r4, r6, r8);	 Catch:{ SQLiteException -> 0x017e, all -> 0x0174 }
        r12.add(r3);	 Catch:{ SQLiteException -> 0x017e, all -> 0x0174 }
        r3 = r13.moveToNext();	 Catch:{ SQLiteException -> 0x017e, all -> 0x0174 }
        if (r3 != 0) goto L_0x004b;
    L_0x0068:
        if (r13 == 0) goto L_0x006d;
    L_0x006a:
        r13.close();
    L_0x006d:
        r11 = 0;
        r3 = "gtm_hits";
        r4 = 2;
        r4 = new java.lang.String[r4];	 Catch:{ SQLiteException -> 0x0170 }
        r5 = 0;
        r6 = "hit_id";
        r4[r5] = r6;	 Catch:{ SQLiteException -> 0x0170 }
        r5 = 1;
        r6 = "hit_url";
        r4[r5] = r6;	 Catch:{ SQLiteException -> 0x0170 }
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r9 = "%s ASC";
        r10 = 1;
        r10 = new java.lang.Object[r10];	 Catch:{ SQLiteException -> 0x0170 }
        r14 = 0;
        r15 = "hit_id";
        r10[r14] = r15;	 Catch:{ SQLiteException -> 0x0170 }
        r9 = java.lang.String.format(r9, r10);	 Catch:{ SQLiteException -> 0x0170 }
        r10 = java.lang.Integer.toString(r17);	 Catch:{ SQLiteException -> 0x0170 }
        r3 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10);	 Catch:{ SQLiteException -> 0x0170 }
        r2 = r3.moveToFirst();	 Catch:{ SQLiteException -> 0x0118, all -> 0x016d }
        if (r2 == 0) goto L_0x00c2;
    L_0x009d:
        r4 = r11;
    L_0x009e:
        r0 = r3;
        r0 = (android.database.sqlite.SQLiteCursor) r0;	 Catch:{ SQLiteException -> 0x0118, all -> 0x016d }
        r2 = r0;
        r2 = r2.getWindow();	 Catch:{ SQLiteException -> 0x0118, all -> 0x016d }
        r2 = r2.getNumRows();	 Catch:{ SQLiteException -> 0x0118, all -> 0x016d }
        if (r2 <= 0) goto L_0x00fa;
    L_0x00ac:
        r2 = r12.get(r4);	 Catch:{ SQLiteException -> 0x0118, all -> 0x016d }
        r2 = (com.google.android.gms.tagmanager.z) r2;	 Catch:{ SQLiteException -> 0x0118, all -> 0x016d }
        r5 = 1;
        r5 = r3.getString(r5);	 Catch:{ SQLiteException -> 0x0118, all -> 0x016d }
        r2.a(r5);	 Catch:{ SQLiteException -> 0x0118, all -> 0x016d }
    L_0x00ba:
        r2 = r4 + 1;
        r4 = r3.moveToNext();	 Catch:{ SQLiteException -> 0x0118, all -> 0x016d }
        if (r4 != 0) goto L_0x0184;
    L_0x00c2:
        if (r3 == 0) goto L_0x00c7;
    L_0x00c4:
        r3.close();
    L_0x00c7:
        r2 = r12;
        goto L_0x0010;
    L_0x00ca:
        r2 = move-exception;
        r3 = r2;
        r4 = r12;
        r2 = r11;
    L_0x00ce:
        r5 = "Error in peekHits fetching hitIds: ";
        r3 = r3.getMessage();	 Catch:{ all -> 0x00f2 }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x00f2 }
        r6 = r3.length();	 Catch:{ all -> 0x00f2 }
        if (r6 == 0) goto L_0x00ec;
    L_0x00de:
        r3 = r5.concat(r3);	 Catch:{ all -> 0x00f2 }
    L_0x00e2:
        com.google.android.gms.tagmanager.aw.b(r3);	 Catch:{ all -> 0x00f2 }
        if (r4 == 0) goto L_0x0010;
    L_0x00e7:
        r4.close();
        goto L_0x0010;
    L_0x00ec:
        r3 = new java.lang.String;	 Catch:{ all -> 0x00f2 }
        r3.<init>(r5);	 Catch:{ all -> 0x00f2 }
        goto L_0x00e2;
    L_0x00f2:
        r2 = move-exception;
        r12 = r4;
    L_0x00f4:
        if (r12 == 0) goto L_0x00f9;
    L_0x00f6:
        r12.close();
    L_0x00f9:
        throw r2;
    L_0x00fa:
        r5 = "HitString for hitId %d too large.  Hit will be deleted.";
        r2 = 1;
        r6 = new java.lang.Object[r2];	 Catch:{ SQLiteException -> 0x0118, all -> 0x016d }
        r7 = 0;
        r2 = r12.get(r4);	 Catch:{ SQLiteException -> 0x0118, all -> 0x016d }
        r2 = (com.google.android.gms.tagmanager.z) r2;	 Catch:{ SQLiteException -> 0x0118, all -> 0x016d }
        r8 = r2.a();	 Catch:{ SQLiteException -> 0x0118, all -> 0x016d }
        r2 = java.lang.Long.valueOf(r8);	 Catch:{ SQLiteException -> 0x0118, all -> 0x016d }
        r6[r7] = r2;	 Catch:{ SQLiteException -> 0x0118, all -> 0x016d }
        r2 = java.lang.String.format(r5, r6);	 Catch:{ SQLiteException -> 0x0118, all -> 0x016d }
        com.google.android.gms.tagmanager.aw.b(r2);	 Catch:{ SQLiteException -> 0x0118, all -> 0x016d }
        goto L_0x00ba;
    L_0x0118:
        r2 = move-exception;
        r13 = r3;
    L_0x011a:
        r3 = "Error in peekHits fetching hit url: ";
        r2 = r2.getMessage();	 Catch:{ all -> 0x0161 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x0161 }
        r4 = r2.length();	 Catch:{ all -> 0x0161 }
        if (r4 == 0) goto L_0x015b;
    L_0x012a:
        r2 = r3.concat(r2);	 Catch:{ all -> 0x0161 }
    L_0x012e:
        com.google.android.gms.tagmanager.aw.b(r2);	 Catch:{ all -> 0x0161 }
        r3 = new java.util.ArrayList;	 Catch:{ all -> 0x0161 }
        r3.<init>();	 Catch:{ all -> 0x0161 }
        r4 = 0;
        r5 = r12.iterator();	 Catch:{ all -> 0x0161 }
    L_0x013b:
        r2 = r5.hasNext();	 Catch:{ all -> 0x0161 }
        if (r2 == 0) goto L_0x0153;
    L_0x0141:
        r2 = r5.next();	 Catch:{ all -> 0x0161 }
        r2 = (com.google.android.gms.tagmanager.z) r2;	 Catch:{ all -> 0x0161 }
        r6 = r2.c();	 Catch:{ all -> 0x0161 }
        r6 = android.text.TextUtils.isEmpty(r6);	 Catch:{ all -> 0x0161 }
        if (r6 == 0) goto L_0x0169;
    L_0x0151:
        if (r4 == 0) goto L_0x0168;
    L_0x0153:
        if (r13 == 0) goto L_0x0158;
    L_0x0155:
        r13.close();
    L_0x0158:
        r2 = r3;
        goto L_0x0010;
    L_0x015b:
        r2 = new java.lang.String;	 Catch:{ all -> 0x0161 }
        r2.<init>(r3);	 Catch:{ all -> 0x0161 }
        goto L_0x012e;
    L_0x0161:
        r2 = move-exception;
    L_0x0162:
        if (r13 == 0) goto L_0x0167;
    L_0x0164:
        r13.close();
    L_0x0167:
        throw r2;
    L_0x0168:
        r4 = 1;
    L_0x0169:
        r3.add(r2);	 Catch:{ all -> 0x0161 }
        goto L_0x013b;
    L_0x016d:
        r2 = move-exception;
        r13 = r3;
        goto L_0x0162;
    L_0x0170:
        r2 = move-exception;
        goto L_0x011a;
    L_0x0172:
        r2 = move-exception;
        goto L_0x00f4;
    L_0x0174:
        r2 = move-exception;
        r12 = r13;
        goto L_0x00f4;
    L_0x0178:
        r2 = move-exception;
        r3 = r2;
        r4 = r13;
        r2 = r11;
        goto L_0x00ce;
    L_0x017e:
        r2 = move-exception;
        r3 = r2;
        r4 = r13;
        r2 = r12;
        goto L_0x00ce;
    L_0x0184:
        r4 = r2;
        goto L_0x009e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.bp.b(int):java.util.List<com.google.android.gms.tagmanager.z>");
    }

    int c() {
        Cursor cursor = null;
        int i = 0;
        SQLiteDatabase a = a("Error opening database for getNumStoredHits.");
        if (a != null) {
            try {
                cursor = a.rawQuery("SELECT COUNT(*) from gtm_hits", null);
                if (cursor.moveToFirst()) {
                    i = (int) cursor.getLong(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
            } catch (SQLiteException e) {
                aw.b("Error getting numStoredHits");
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        return i;
    }

    int d() {
        int count;
        Cursor cursor;
        Throwable th;
        Cursor cursor2 = null;
        SQLiteDatabase a = a("Error opening database for getNumStoredHits.");
        if (a == null) {
            return 0;
        }
        try {
            Cursor query = a.query("gtm_hits", new String[]{"hit_id", "hit_first_send_time"}, "hit_first_send_time=0", null, null, null, null);
            try {
                count = query.getCount();
                if (query != null) {
                    query.close();
                }
            } catch (SQLiteException e) {
                cursor = query;
                try {
                    aw.b("Error getting num untried hits");
                    if (cursor == null) {
                        count = 0;
                    } else {
                        cursor.close();
                        count = 0;
                    }
                    return count;
                } catch (Throwable th2) {
                    cursor2 = cursor;
                    th = th2;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor2 = query;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            cursor = null;
            aw.b("Error getting num untried hits");
            if (cursor == null) {
                cursor.close();
                count = 0;
            } else {
                count = 0;
            }
            return count;
        } catch (Throwable th4) {
            th = th4;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        return count;
    }
}
