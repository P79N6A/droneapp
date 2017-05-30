package com.google.android.gms.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.fimi.soul.entity.User;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import com.tencent.mm.sdk.platformtools.Util;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

class apk implements apc {
    private static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ('%s' TEXT UNIQUE);", new Object[]{"gtm_hit_unique_ids", "hit_unique_id"});
    private static final String b = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT UNIQUE, '%s' TEXT, '%s' TEXT);", new Object[]{"gtm_hits", "hit_id", "hit_time", "hit_url", "hit_first_send_time", "hit_method", "hit_unique_id", "hit_headers", "hit_body"});
    private static final String c = String.format("CREATE TRIGGER IF NOT EXISTS %s DELETE ON %s FOR EACH ROW WHEN OLD.%s NOTNULL BEGIN     INSERT OR IGNORE INTO %s (%s) VALUES (OLD.%s); END;", new Object[]{"save_unique_on_delete", "gtm_hits", "hit_unique_id", "gtm_hit_unique_ids", "hit_unique_id", "hit_unique_id"});
    private static final String d = String.format("CREATE TRIGGER IF NOT EXISTS %s BEFORE INSERT ON %s FOR EACH ROW WHEN NEW.%s NOT NULL BEGIN     SELECT RAISE(ABORT, 'Duplicate unique ID.')     WHERE EXISTS (SELECT 1 FROM %s WHERE %s = NEW.%s); END;", new Object[]{"check_unique_on_insert", "gtm_hits", "hit_unique_id", "gtm_hit_unique_ids", "hit_unique_id", "hit_unique_id"});
    private final b e;
    private volatile aov f;
    private final apd g;
    private final Context h;
    private final String i;
    private long j;
    private e k;
    private final int l;

    class a implements com.google.android.gms.internal.apw.a {
        final /* synthetic */ apk a;

        a(apk com_google_android_gms_internal_apk) {
            this.a = com_google_android_gms_internal_apk;
        }

        public void a(aoy com_google_android_gms_internal_aoy) {
            this.a.a(com_google_android_gms_internal_aoy.a());
        }

        public void b(aoy com_google_android_gms_internal_aoy) {
            this.a.a(com_google_android_gms_internal_aoy.a());
            aph.d("Permanent failure dispatching hitId: " + com_google_android_gms_internal_aoy.a());
        }

        public void c(aoy com_google_android_gms_internal_aoy) {
            long b = com_google_android_gms_internal_aoy.b();
            if (b == 0) {
                this.a.a(com_google_android_gms_internal_aoy.a(), this.a.k.a());
            } else if (b + 14400000 < this.a.k.a()) {
                this.a.a(com_google_android_gms_internal_aoy.a());
                aph.d("Giving up on failed hitId: " + com_google_android_gms_internal_aoy.a());
            }
        }
    }

    class b extends SQLiteOpenHelper {
        final /* synthetic */ apk a;
        private boolean b;
        private long c = 0;

        b(apk com_google_android_gms_internal_apk, Context context, String str) {
            this.a = com_google_android_gms_internal_apk;
            super(context, str, null, 1);
        }

        private void a(SQLiteDatabase sQLiteDatabase, String str, List<String> list) {
            Cursor rawQuery = sQLiteDatabase.rawQuery(new StringBuilder(String.valueOf(str).length() + 22).append("SELECT * FROM ").append(str).append(" WHERE 0").toString(), null);
            Set hashSet = new HashSet();
            try {
                String[] columnNames = rawQuery.getColumnNames();
                for (Object add : columnNames) {
                    hashSet.add(add);
                }
                for (String remove : list) {
                    if (!hashSet.remove(remove)) {
                        throw new SQLiteException(String.format("Database column %s missing in table %s.", new Object[]{(String) r2.next(), str}));
                    }
                }
                if (!hashSet.isEmpty()) {
                    throw new SQLiteException(String.format("Database has extra columns in table %s.", new Object[]{str}));
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
                        aph.b(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
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
                aph.b(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
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
            if (!this.b || this.c + Util.MILLSECONDS_OF_HOUR <= this.a.k.a()) {
                SQLiteDatabase sQLiteDatabase = null;
                this.b = true;
                this.c = this.a.k.a();
                try {
                    sQLiteDatabase = super.getWritableDatabase();
                } catch (SQLiteException e) {
                    this.a.h.getDatabasePath(this.a.i).delete();
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
            aox.a(sQLiteDatabase.getPath());
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
            if (a("gtm_hit_unique_ids", sQLiteDatabase)) {
                String str = "gtm_hit_unique_ids";
                a(sQLiteDatabase, str, Arrays.asList(new String[]{"hit_unique_id"}));
            } else {
                sQLiteDatabase.execSQL(apk.a);
            }
            if (a("gtm_hits", sQLiteDatabase)) {
                str = "gtm_hits";
                a(sQLiteDatabase, str, Arrays.asList(new String[]{"hit_id", "hit_url", "hit_time", "hit_first_send_time", "hit_method", "hit_unique_id", "hit_headers", "hit_body"}));
            } else {
                sQLiteDatabase.execSQL(apk.b);
            }
            sQLiteDatabase.execSQL(apk.c);
            sQLiteDatabase.execSQL(apk.d);
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    apk(apd com_google_android_gms_internal_apd, Context context) {
        this(com_google_android_gms_internal_apd, context, "gtm_urls.db", 2000);
    }

    apk(apd com_google_android_gms_internal_apd, Context context, String str, int i) {
        this.h = context.getApplicationContext();
        this.i = str;
        this.g = com_google_android_gms_internal_apd;
        this.k = h.d();
        this.e = new b(this, this.h, this.i);
        this.f = new apw(this.h, new a(this));
        this.j = 0;
        this.l = i;
    }

    private void a(long j) {
        a(new String[]{String.valueOf(j)});
    }

    private void a(long j, long j2) {
        SQLiteDatabase b = b("Error opening database for getNumStoredHits.");
        if (b != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("hit_first_send_time", Long.valueOf(j2));
            try {
                b.update("gtm_hits", contentValues, "hit_id=?", new String[]{String.valueOf(j)});
            } catch (SQLiteException e) {
                aph.b("Error setting HIT_FIRST_DISPATCH_TIME for hitId: " + j);
                a(j);
            }
        }
    }

    private SQLiteDatabase b(String str) {
        try {
            return this.e.getWritableDatabase();
        } catch (SQLiteException e) {
            aph.b(str);
            return null;
        }
    }

    private void b(long j, String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, String> map, @Nullable String str4) {
        String str5 = null;
        SQLiteDatabase b = b("Error opening database for putHit");
        if (b != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("hit_time", Long.valueOf(j));
            contentValues.put("hit_url", str);
            contentValues.put("hit_first_send_time", Integer.valueOf(0));
            String str6 = "hit_method";
            if (str2 == null) {
                str2 = "GET";
            }
            contentValues.put(str6, str2);
            contentValues.put("hit_unique_id", str3);
            str6 = "hit_headers";
            if (map != null) {
                str5 = new JSONObject(map).toString();
            }
            contentValues.put(str6, str5);
            contentValues.put("hit_body", str4);
            try {
                b.insertOrThrow("gtm_hits", null, contentValues);
                aph.d(new StringBuilder(String.valueOf(str).length() + 19).append("Hit stored (url = ").append(str).append(")").toString());
                this.g.a(false);
            } catch (SQLiteConstraintException e) {
                String str7 = "Hit has already been sent: ";
                str5 = String.valueOf(str);
                aph.d(str5.length() != 0 ? str7.concat(str5) : new String(str7));
            } catch (SQLiteException e2) {
                str5 = String.valueOf(e2);
                aph.b(new StringBuilder(String.valueOf(str5).length() + 18).append("Error storing hit ").append(str5).toString());
            }
        }
    }

    private void i() {
        int c = (c() - this.l) + 1;
        if (c > 0) {
            List a = a(c);
            aph.d("Store full, deleting " + a.size() + " hits to make room.");
            a((String[]) a.toArray(new String[0]));
        }
    }

    int a(String str) {
        Cursor cursor = null;
        int i = 0;
        SQLiteDatabase b = b("Error opening database for getNumRecords.");
        if (b != null) {
            try {
                String str2 = "SELECT COUNT(*) from ";
                String valueOf = String.valueOf(str);
                cursor = b.rawQuery(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), null);
                if (cursor.moveToFirst()) {
                    i = (int) cursor.getLong(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
            } catch (SQLiteException e) {
                aph.b("Error getting numStoredRecords");
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

    List<String> a(int i) {
        Cursor query;
        SQLiteException e;
        String str;
        String valueOf;
        Throwable th;
        List<String> arrayList = new ArrayList();
        if (i <= 0) {
            aph.b("Invalid maxHits specified. Skipping");
            return arrayList;
        }
        SQLiteDatabase b = b("Error opening database for peekHitIds.");
        if (b == null) {
            return arrayList;
        }
        try {
            query = b.query("gtm_hits", new String[]{"hit_id"}, null, null, null, null, String.format("%s ASC", new Object[]{"hit_id"}), Integer.toString(i));
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
                    aph.b(valueOf.length() == 0 ? str.concat(valueOf) : new String(str));
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
            aph.b(valueOf.length() == 0 ? str.concat(valueOf) : new String(str));
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
        aph.d("GTM Dispatch running...");
        if (this.f.a()) {
            List b = b(40);
            if (b.isEmpty()) {
                aph.d("...nothing to dispatch");
                this.g.a(true);
                return;
            }
            this.f.a(b);
            if (d() > 0) {
                apu.b().d();
            }
        }
    }

    public void a(long j, String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, String> map, @Nullable String str4) {
        b();
        i();
        b(j, str, str2, str3, map, str4);
        if (apn.a().b()) {
            aph.d("Sending hits immediately under preview.");
            a();
        }
    }

    void a(String[] strArr) {
        boolean z = true;
        if (strArr != null && strArr.length != 0) {
            SQLiteDatabase b = b("Error opening database for deleteHits.");
            if (b != null) {
                try {
                    b.delete("gtm_hits", String.format("HIT_ID in (%s)", new Object[]{TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, Collections.nCopies(strArr.length, "?"))}), strArr);
                    apd com_google_android_gms_internal_apd = this.g;
                    if (c() != 0) {
                        z = false;
                    }
                    com_google_android_gms_internal_apd.a(z);
                } catch (SQLiteException e) {
                    aph.b("Error deleting hits");
                }
            }
        }
    }

    int b() {
        boolean z = true;
        long a = this.k.a();
        if (a <= this.j + 86400000) {
            return 0;
        }
        this.j = a;
        SQLiteDatabase b = b("Error opening database for deleteStaleHits.");
        if (b == null) {
            return 0;
        }
        int delete = b.delete("gtm_hits", "HIT_TIME < ?", new String[]{Long.toString(this.k.a() - 2592000000L)});
        aph.d("Removed " + delete + " stale hits.");
        apd com_google_android_gms_internal_apd = this.g;
        if (c() != 0) {
            z = false;
        }
        com_google_android_gms_internal_apd.a(z);
        return delete;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.google.android.gms.internal.aoy> b(int r17) {
        /*
        r16 = this;
        r11 = new java.util.ArrayList;
        r11.<init>();
        r2 = "Error opening database for peekHits";
        r0 = r16;
        r2 = r0.b(r2);
        if (r2 != 0) goto L_0x0011;
    L_0x000f:
        r2 = r11;
    L_0x0010:
        return r2;
    L_0x0011:
        r12 = 0;
        r3 = "gtm_hits";
        r4 = 3;
        r4 = new java.lang.String[r4];	 Catch:{ SQLiteException -> 0x0114, all -> 0x01fe }
        r5 = 0;
        r6 = "hit_id";
        r4[r5] = r6;	 Catch:{ SQLiteException -> 0x0114, all -> 0x01fe }
        r5 = 1;
        r6 = "hit_time";
        r4[r5] = r6;	 Catch:{ SQLiteException -> 0x0114, all -> 0x01fe }
        r5 = 2;
        r6 = "hit_first_send_time";
        r4[r5] = r6;	 Catch:{ SQLiteException -> 0x0114, all -> 0x01fe }
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r9 = "%s ASC";
        r10 = 1;
        r10 = new java.lang.Object[r10];	 Catch:{ SQLiteException -> 0x0114, all -> 0x01fe }
        r13 = 0;
        r14 = "hit_id";
        r10[r13] = r14;	 Catch:{ SQLiteException -> 0x0114, all -> 0x01fe }
        r9 = java.lang.String.format(r9, r10);	 Catch:{ SQLiteException -> 0x0114, all -> 0x01fe }
        r10 = java.lang.Integer.toString(r17);	 Catch:{ SQLiteException -> 0x0114, all -> 0x01fe }
        r13 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10);	 Catch:{ SQLiteException -> 0x0114, all -> 0x01fe }
        r12 = new java.util.ArrayList;	 Catch:{ SQLiteException -> 0x0205, all -> 0x0201 }
        r12.<init>();	 Catch:{ SQLiteException -> 0x0205, all -> 0x0201 }
        r3 = r13.moveToFirst();	 Catch:{ SQLiteException -> 0x020b, all -> 0x0201 }
        if (r3 == 0) goto L_0x0068;
    L_0x004b:
        r3 = new com.google.android.gms.internal.aoy;	 Catch:{ SQLiteException -> 0x020b, all -> 0x0201 }
        r4 = 0;
        r4 = r13.getLong(r4);	 Catch:{ SQLiteException -> 0x020b, all -> 0x0201 }
        r6 = 1;
        r6 = r13.getLong(r6);	 Catch:{ SQLiteException -> 0x020b, all -> 0x0201 }
        r8 = 2;
        r8 = r13.getLong(r8);	 Catch:{ SQLiteException -> 0x020b, all -> 0x0201 }
        r3.<init>(r4, r6, r8);	 Catch:{ SQLiteException -> 0x020b, all -> 0x0201 }
        r12.add(r3);	 Catch:{ SQLiteException -> 0x020b, all -> 0x0201 }
        r3 = r13.moveToNext();	 Catch:{ SQLiteException -> 0x020b, all -> 0x0201 }
        if (r3 != 0) goto L_0x004b;
    L_0x0068:
        if (r13 == 0) goto L_0x006d;
    L_0x006a:
        r13.close();
    L_0x006d:
        r11 = 0;
        r3 = "gtm_hits";
        r4 = 5;
        r4 = new java.lang.String[r4];	 Catch:{ SQLiteException -> 0x01fc }
        r5 = 0;
        r6 = "hit_id";
        r4[r5] = r6;	 Catch:{ SQLiteException -> 0x01fc }
        r5 = 1;
        r6 = "hit_url";
        r4[r5] = r6;	 Catch:{ SQLiteException -> 0x01fc }
        r5 = 2;
        r6 = "hit_method";
        r4[r5] = r6;	 Catch:{ SQLiteException -> 0x01fc }
        r5 = 3;
        r6 = "hit_headers";
        r4[r5] = r6;	 Catch:{ SQLiteException -> 0x01fc }
        r5 = 4;
        r6 = "hit_body";
        r4[r5] = r6;	 Catch:{ SQLiteException -> 0x01fc }
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r9 = "%s ASC";
        r10 = 1;
        r10 = new java.lang.Object[r10];	 Catch:{ SQLiteException -> 0x01fc }
        r14 = 0;
        r15 = "hit_id";
        r10[r14] = r15;	 Catch:{ SQLiteException -> 0x01fc }
        r9 = java.lang.String.format(r9, r10);	 Catch:{ SQLiteException -> 0x01fc }
        r10 = java.lang.Integer.toString(r17);	 Catch:{ SQLiteException -> 0x01fc }
        r3 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10);	 Catch:{ SQLiteException -> 0x01fc }
        r2 = r3.moveToFirst();	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        if (r2 == 0) goto L_0x0171;
    L_0x00ac:
        r5 = r11;
    L_0x00ad:
        r0 = r3;
        r0 = (android.database.sqlite.SQLiteCursor) r0;	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r2 = r0;
        r2 = r2.getWindow();	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r2 = r2.getNumRows();	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        if (r2 <= 0) goto L_0x0186;
    L_0x00bb:
        r2 = r12.get(r5);	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r2 = (com.google.android.gms.internal.aoy) r2;	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r4 = 1;
        r4 = r3.getString(r4);	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r2.a(r4);	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r2 = r12.get(r5);	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r2 = (com.google.android.gms.internal.aoy) r2;	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r4 = 2;
        r4 = r3.getString(r4);	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r2.b(r4);	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r2 = r12.get(r5);	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r2 = (com.google.android.gms.internal.aoy) r2;	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r4 = 4;
        r4 = r3.getString(r4);	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r2.c(r4);	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r2 = 0;
        r4 = 3;
        r4 = r3.getString(r4);	 Catch:{ JSONException -> 0x0144 }
        if (r4 == 0) goto L_0x0179;
    L_0x00ed:
        r7 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0144 }
        r7.<init>(r4);	 Catch:{ JSONException -> 0x0144 }
        r8 = r7.names();	 Catch:{ JSONException -> 0x0144 }
        r4 = new java.util.HashMap;	 Catch:{ JSONException -> 0x0144 }
        r4.<init>();	 Catch:{ JSONException -> 0x0144 }
        r2 = 0;
        r6 = r2;
    L_0x00fd:
        r2 = r8.length();	 Catch:{ JSONException -> 0x0144 }
        if (r6 >= r2) goto L_0x017a;
    L_0x0103:
        r9 = r8.getString(r6);	 Catch:{ JSONException -> 0x0144 }
        r2 = r7.opt(r9);	 Catch:{ JSONException -> 0x0144 }
        r2 = (java.lang.String) r2;	 Catch:{ JSONException -> 0x0144 }
        r4.put(r9, r2);	 Catch:{ JSONException -> 0x0144 }
        r2 = r6 + 1;
        r6 = r2;
        goto L_0x00fd;
    L_0x0114:
        r2 = move-exception;
        r3 = r2;
        r4 = r12;
        r2 = r11;
    L_0x0118:
        r5 = "Error in peekHits fetching hitIds: ";
        r3 = r3.getMessage();	 Catch:{ all -> 0x013c }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x013c }
        r6 = r3.length();	 Catch:{ all -> 0x013c }
        if (r6 == 0) goto L_0x0136;
    L_0x0128:
        r3 = r5.concat(r3);	 Catch:{ all -> 0x013c }
    L_0x012c:
        com.google.android.gms.internal.aph.b(r3);	 Catch:{ all -> 0x013c }
        if (r4 == 0) goto L_0x0010;
    L_0x0131:
        r4.close();
        goto L_0x0010;
    L_0x0136:
        r3 = new java.lang.String;	 Catch:{ all -> 0x013c }
        r3.<init>(r5);	 Catch:{ all -> 0x013c }
        goto L_0x012c;
    L_0x013c:
        r2 = move-exception;
        r12 = r4;
    L_0x013e:
        if (r12 == 0) goto L_0x0143;
    L_0x0140:
        r12.close();
    L_0x0143:
        throw r2;
    L_0x0144:
        r2 = move-exception;
        r4 = r2;
        r6 = "Failed to read headers for hitId %d: %s";
        r2 = 2;
        r7 = new java.lang.Object[r2];	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r8 = 0;
        r2 = r12.get(r5);	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r2 = (com.google.android.gms.internal.aoy) r2;	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r10 = r2.a();	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r2 = java.lang.Long.valueOf(r10);	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r7[r8] = r2;	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r2 = 1;
        r4 = r4.getMessage();	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r7[r2] = r4;	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r2 = java.lang.String.format(r6, r7);	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        com.google.android.gms.internal.aph.b(r2);	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r2 = r5;
    L_0x016b:
        r4 = r3.moveToNext();	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        if (r4 != 0) goto L_0x0211;
    L_0x0171:
        if (r3 == 0) goto L_0x0176;
    L_0x0173:
        r3.close();
    L_0x0176:
        r2 = r12;
        goto L_0x0010;
    L_0x0179:
        r4 = r2;
    L_0x017a:
        r2 = r12.get(r5);	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r2 = (com.google.android.gms.internal.aoy) r2;	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r2.a(r4);	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
    L_0x0183:
        r2 = r5 + 1;
        goto L_0x016b;
    L_0x0186:
        r4 = "HitString for hitId %d too large.  Hit will be deleted.";
        r2 = 1;
        r6 = new java.lang.Object[r2];	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r7 = 0;
        r2 = r12.get(r5);	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r2 = (com.google.android.gms.internal.aoy) r2;	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r8 = r2.a();	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r2 = java.lang.Long.valueOf(r8);	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r6[r7] = r2;	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        r2 = java.lang.String.format(r4, r6);	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        com.google.android.gms.internal.aph.b(r2);	 Catch:{ SQLiteException -> 0x01a4, all -> 0x01fa }
        goto L_0x0183;
    L_0x01a4:
        r2 = move-exception;
        r13 = r3;
    L_0x01a6:
        r3 = "Error in peekHits fetching hit url: ";
        r2 = r2.getMessage();	 Catch:{ all -> 0x01ed }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x01ed }
        r4 = r2.length();	 Catch:{ all -> 0x01ed }
        if (r4 == 0) goto L_0x01e7;
    L_0x01b6:
        r2 = r3.concat(r2);	 Catch:{ all -> 0x01ed }
    L_0x01ba:
        com.google.android.gms.internal.aph.b(r2);	 Catch:{ all -> 0x01ed }
        r3 = new java.util.ArrayList;	 Catch:{ all -> 0x01ed }
        r3.<init>();	 Catch:{ all -> 0x01ed }
        r4 = 0;
        r5 = r12.iterator();	 Catch:{ all -> 0x01ed }
    L_0x01c7:
        r2 = r5.hasNext();	 Catch:{ all -> 0x01ed }
        if (r2 == 0) goto L_0x01df;
    L_0x01cd:
        r2 = r5.next();	 Catch:{ all -> 0x01ed }
        r2 = (com.google.android.gms.internal.aoy) r2;	 Catch:{ all -> 0x01ed }
        r6 = r2.c();	 Catch:{ all -> 0x01ed }
        r6 = android.text.TextUtils.isEmpty(r6);	 Catch:{ all -> 0x01ed }
        if (r6 == 0) goto L_0x01f6;
    L_0x01dd:
        if (r4 == 0) goto L_0x01f5;
    L_0x01df:
        if (r13 == 0) goto L_0x01e4;
    L_0x01e1:
        r13.close();
    L_0x01e4:
        r2 = r3;
        goto L_0x0010;
    L_0x01e7:
        r2 = new java.lang.String;	 Catch:{ all -> 0x01ed }
        r2.<init>(r3);	 Catch:{ all -> 0x01ed }
        goto L_0x01ba;
    L_0x01ed:
        r2 = move-exception;
        r3 = r13;
    L_0x01ef:
        if (r3 == 0) goto L_0x01f4;
    L_0x01f1:
        r3.close();
    L_0x01f4:
        throw r2;
    L_0x01f5:
        r4 = 1;
    L_0x01f6:
        r3.add(r2);	 Catch:{ all -> 0x01ed }
        goto L_0x01c7;
    L_0x01fa:
        r2 = move-exception;
        goto L_0x01ef;
    L_0x01fc:
        r2 = move-exception;
        goto L_0x01a6;
    L_0x01fe:
        r2 = move-exception;
        goto L_0x013e;
    L_0x0201:
        r2 = move-exception;
        r12 = r13;
        goto L_0x013e;
    L_0x0205:
        r2 = move-exception;
        r3 = r2;
        r4 = r13;
        r2 = r11;
        goto L_0x0118;
    L_0x020b:
        r2 = move-exception;
        r3 = r2;
        r4 = r13;
        r2 = r12;
        goto L_0x0118;
    L_0x0211:
        r5 = r2;
        goto L_0x00ad;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.apk.b(int):java.util.List<com.google.android.gms.internal.aoy>");
    }

    int c() {
        return a("gtm_hits");
    }

    int d() {
        int count;
        Cursor cursor;
        Throwable th;
        Cursor cursor2 = null;
        SQLiteDatabase b = b("Error opening database for getNumStoredHits.");
        if (b == null) {
            return 0;
        }
        try {
            Cursor query = b.query("gtm_hits", new String[]{"hit_id", "hit_first_send_time"}, "hit_first_send_time=0", null, null, null, null);
            try {
                count = query.getCount();
                if (query != null) {
                    query.close();
                }
            } catch (SQLiteException e) {
                cursor = query;
                try {
                    aph.b("Error getting num untried hits");
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
            aph.b("Error getting num untried hits");
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
