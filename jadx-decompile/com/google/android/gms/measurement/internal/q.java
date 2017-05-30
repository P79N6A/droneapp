package com.google.android.gms.measurement.internal;

import a.k;
import android.annotation.TargetApi;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import android.support.annotation.WorkerThread;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.common.util.UriUtil;
import com.fimi.soul.entity.User;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.amu;
import com.google.android.gms.internal.amw.e;
import com.google.android.gms.internal.amw.f;
import com.google.android.gms.internal.qv;
import com.google.android.gms.internal.qw;
import com.tencent.mm.sdk.storage.MAutoDBItem;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;

class q extends b {
    private static final Map<String, String> a = new ArrayMap(17);
    private static final Map<String, String> b = new ArrayMap(1);
    private static final Map<String, String> c = new ArrayMap(1);
    private final c d = new c(this, q(), B());
    private final i e = new i(p());

    interface b {
        void a(e eVar);

        boolean a(long j, com.google.android.gms.internal.amw.b bVar);
    }

    public static class a {
        long a;
        long b;
        long c;
        long d;
        long e;
    }

    private class c extends SQLiteOpenHelper {
        final /* synthetic */ q a;

        c(q qVar, Context context, String str) {
            this.a = qVar;
            super(context, str, null, 1);
        }

        @WorkerThread
        private void a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, Map<String, String> map) {
            if (!a(sQLiteDatabase, str)) {
                sQLiteDatabase.execSQL(str2);
            }
            try {
                a(sQLiteDatabase, str, str3, map);
            } catch (SQLiteException e) {
                this.a.w().f().a("Failed to verify columns on table that was just created", str);
                throw e;
            }
        }

        @WorkerThread
        private void a(SQLiteDatabase sQLiteDatabase, String str, String str2, Map<String, String> map) {
            Iterable b = b(sQLiteDatabase, str);
            String[] split = str2.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            int length = split.length;
            int i = 0;
            while (i < length) {
                String str3 = split[i];
                if (b.remove(str3)) {
                    i++;
                } else {
                    throw new SQLiteException(new StringBuilder((String.valueOf(str).length() + 35) + String.valueOf(str3).length()).append("Table ").append(str).append(" is missing required column: ").append(str3).toString());
                }
            }
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    if (!b.remove(entry.getKey())) {
                        sQLiteDatabase.execSQL((String) entry.getValue());
                    }
                }
            }
            if (!b.isEmpty()) {
                this.a.w().z().a("Table has extra columns. table, columns", str, TextUtils.join(", ", b));
            }
        }

        @WorkerThread
        private boolean a(SQLiteDatabase sQLiteDatabase, String str) {
            Cursor query;
            Object e;
            Throwable th;
            Cursor cursor = null;
            try {
                SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                query = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{User.FN_NAME}, "name=?", new String[]{str}, null, null, null);
                try {
                    boolean moveToFirst = query.moveToFirst();
                    if (query == null) {
                        return moveToFirst;
                    }
                    query.close();
                    return moveToFirst;
                } catch (SQLiteException e2) {
                    e = e2;
                    try {
                        this.a.w().z().a("Error querying for table", str, e);
                        if (query != null) {
                            query.close();
                        }
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
            } catch (SQLiteException e3) {
                e = e3;
                query = null;
                this.a.w().z().a("Error querying for table", str, e);
                if (query != null) {
                    query.close();
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }

        @WorkerThread
        private Set<String> b(SQLiteDatabase sQLiteDatabase, String str) {
            Set<String> hashSet = new HashSet();
            Cursor rawQuery = sQLiteDatabase.rawQuery(new StringBuilder(String.valueOf(str).length() + 22).append("SELECT * FROM ").append(str).append(" LIMIT 0").toString(), null);
            try {
                Collections.addAll(hashSet, rawQuery.getColumnNames());
                return hashSet;
            } finally {
                rawQuery.close();
            }
        }

        @WorkerThread
        public SQLiteDatabase getWritableDatabase() {
            if (this.a.e.a(this.a.y().G())) {
                SQLiteDatabase writableDatabase;
                try {
                    writableDatabase = super.getWritableDatabase();
                } catch (SQLiteException e) {
                    this.a.e.a();
                    this.a.w().f().a("Opening the database failed, dropping and recreating it");
                    String B = this.a.B();
                    if (!this.a.q().getDatabasePath(B).delete()) {
                        this.a.w().f().a("Failed to delete corrupted db file", B);
                    }
                    try {
                        writableDatabase = super.getWritableDatabase();
                        this.a.e.b();
                    } catch (SQLiteException e2) {
                        this.a.w().f().a("Failed to open freshly created database", e2);
                        throw e2;
                    }
                }
                return writableDatabase;
            }
            throw new SQLiteException("Database open failed");
        }

        @WorkerThread
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            if (VERSION.SDK_INT >= 9) {
                File file = new File(sQLiteDatabase.getPath());
                if (!file.setReadable(false, false)) {
                    this.a.w().z().a("Failed to turn off database read permission");
                }
                if (!file.setWritable(false, false)) {
                    this.a.w().z().a("Failed to turn off database write permission");
                }
                if (!file.setReadable(true, true)) {
                    this.a.w().z().a("Failed to turn on database read permission for owner");
                }
                if (!file.setWritable(true, true)) {
                    this.a.w().z().a("Failed to turn on database write permission for owner");
                }
            }
        }

        @WorkerThread
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (VERSION.SDK_INT < 15) {
                Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
                try {
                    rawQuery.moveToFirst();
                } finally {
                    rawQuery.close();
                }
            }
            a(sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", null);
            a(sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", null);
            a(sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", q.a);
            a(sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", q.c);
            a(sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
            a(sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", q.b);
            a(sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", null);
            a(sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", null);
            a(sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
            a(sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", null);
        }

        @WorkerThread
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    static {
        a.put(Constants.EXTRA_KEY_APP_VERSION, "ALTER TABLE apps ADD COLUMN app_version TEXT;");
        a.put("app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;");
        a.put("gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;");
        a.put("dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;");
        a.put("measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;");
        a.put("last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;");
        a.put("day", "ALTER TABLE apps ADD COLUMN day INTEGER;");
        a.put("daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;");
        a.put("daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;");
        a.put("daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;");
        a.put("remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;");
        a.put("config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;");
        a.put("failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;");
        a.put("app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;");
        a.put("firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;");
        a.put("daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;");
        a.put("daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;");
        b.put("realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;");
        c.put("has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;");
    }

    q(aj ajVar) {
        super(ajVar);
    }

    private boolean N() {
        return q().getDatabasePath(B()).exists();
    }

    @WorkerThread
    @TargetApi(11)
    static int a(Cursor cursor, int i) {
        if (VERSION.SDK_INT >= 11) {
            return cursor.getType(i);
        }
        CursorWindow window = ((SQLiteCursor) cursor).getWindow();
        int position = cursor.getPosition();
        return window.isNull(position, i) ? 0 : window.isLong(position, i) ? 1 : window.isFloat(position, i) ? 2 : window.isString(position, i) ? 3 : window.isBlob(position, i) ? 4 : -1;
    }

    @WorkerThread
    private long a(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = A().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            w().f().a("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    @WorkerThread
    private long a(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            cursor = A().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
            } else if (cursor != null) {
                cursor.close();
            }
            return j;
        } catch (SQLiteException e) {
            w().f().a("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    @WorkerThread
    private void a(String str, com.google.android.gms.internal.amu.a aVar) {
        Object obj = null;
        c();
        j();
        d.a(str);
        d.a(aVar);
        d.a(aVar.c);
        d.a(aVar.b);
        if (aVar.a == null) {
            w().z().a("Audience with no ID");
            return;
        }
        int intValue = aVar.a.intValue();
        for (com.google.android.gms.internal.amu.b bVar : aVar.c) {
            if (bVar.a == null) {
                w().z().a("Event filter with no ID. Audience definition ignored. appId, audienceId", str, aVar.a);
                return;
            }
        }
        for (amu.e eVar : aVar.b) {
            if (eVar.a == null) {
                w().z().a("Property filter with no ID. Audience definition ignored. appId, audienceId", str, aVar.a);
                return;
            }
        }
        Object obj2 = 1;
        for (com.google.android.gms.internal.amu.b a : aVar.c) {
            if (!a(str, intValue, a)) {
                obj2 = null;
                break;
            }
        }
        if (obj2 != null) {
            for (amu.e a2 : aVar.b) {
                if (!a(str, intValue, a2)) {
                    break;
                }
            }
        }
        obj = obj2;
        if (obj == null) {
            b(str, intValue);
        }
    }

    @WorkerThread
    private boolean a(String str, int i, com.google.android.gms.internal.amu.b bVar) {
        c();
        j();
        d.a(str);
        d.a(bVar);
        if (TextUtils.isEmpty(bVar.b)) {
            w().z().a("Event filter had no event name. Audience definition ignored. audienceId, filterId", Integer.valueOf(i), String.valueOf(bVar.a));
            return false;
        }
        try {
            byte[] bArr = new byte[bVar.g()];
            qw a = qw.a(bArr);
            bVar.a(a);
            a.b();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("filter_id", bVar.a);
            contentValues.put(k.b, bVar.b);
            contentValues.put(UriUtil.DATA_SCHEME, bArr);
            try {
                if (A().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                    w().f().a("Failed to insert event filter (got -1)");
                }
                return true;
            } catch (SQLiteException e) {
                w().f().a("Error storing event filter", e);
                return false;
            }
        } catch (IOException e2) {
            w().f().a("Configuration loss. Failed to serialize event filter", e2);
            return false;
        }
    }

    @WorkerThread
    private boolean a(String str, int i, amu.e eVar) {
        c();
        j();
        d.a(str);
        d.a(eVar);
        if (TextUtils.isEmpty(eVar.b)) {
            w().z().a("Property filter had no property name. Audience definition ignored. audienceId, filterId", Integer.valueOf(i), String.valueOf(eVar.a));
            return false;
        }
        try {
            byte[] bArr = new byte[eVar.g()];
            qw a = qw.a(bArr);
            eVar.a(a);
            a.b();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("filter_id", eVar.a);
            contentValues.put("property_name", eVar.b);
            contentValues.put(UriUtil.DATA_SCHEME, bArr);
            try {
                if (A().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                    return true;
                }
                w().f().a("Failed to insert property filter (got -1)");
                return false;
            } catch (SQLiteException e) {
                w().f().a("Error storing property filter", e);
                return false;
            }
        } catch (IOException e2) {
            w().f().a("Configuration loss. Failed to serialize property filter", e2);
            return false;
        }
    }

    @WorkerThread
    SQLiteDatabase A() {
        j();
        try {
            return this.d.getWritableDatabase();
        } catch (SQLiteException e) {
            w().z().a("Error opening database", e);
            throw e;
        }
    }

    String B() {
        if (!y().N()) {
            return y().K();
        }
        if (y().O()) {
            return y().K();
        }
        w().A().a("Using secondary database");
        return y().L();
    }

    @WorkerThread
    public String C() {
        Object e;
        Throwable th;
        String str = null;
        Cursor rawQuery;
        try {
            rawQuery = A().rawQuery("select app_id from queue where app_id not in (select app_id from apps where measurement_enabled=0) order by has_realtime desc, rowid asc limit 1;", null);
            try {
                if (rawQuery.moveToFirst()) {
                    str = rawQuery.getString(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                } else if (rawQuery != null) {
                    rawQuery.close();
                }
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    w().f().a("Database error getting next bundle app id", e);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return str;
                } catch (Throwable th2) {
                    th = th2;
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            rawQuery = null;
            w().f().a("Database error getting next bundle app id", e);
            if (rawQuery != null) {
                rawQuery.close();
            }
            return str;
        } catch (Throwable th3) {
            rawQuery = null;
            th = th3;
            if (rawQuery != null) {
                rawQuery.close();
            }
            throw th;
        }
        return str;
    }

    public boolean D() {
        return a("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    @WorkerThread
    void E() {
        j();
        c();
        if (N()) {
            long a = x().f.a();
            long b = p().b();
            if (Math.abs(b - a) > y().T()) {
                x().f.a(b);
                F();
            }
        }
    }

    @WorkerThread
    void F() {
        j();
        c();
        if (N()) {
            int delete = A().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(p().a()), String.valueOf(y().S())});
            if (delete > 0) {
                w().E().a("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
            }
        }
    }

    @WorkerThread
    public long G() {
        return a("select max(bundle_end_timestamp) from queue", null, 0);
    }

    @WorkerThread
    public long H() {
        return a("select max(timestamp) from raw_events", null, 0);
    }

    public boolean I() {
        return a("select count(1) > 0 from raw_events", null) != 0;
    }

    public boolean J() {
        return a("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    public long a(e eVar) {
        j();
        c();
        d.a(eVar);
        d.a(eVar.o);
        try {
            byte[] bArr = new byte[eVar.g()];
            qw a = qw.a(bArr);
            eVar.a(a);
            a.b();
            long d = s().d(bArr);
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", eVar.o);
            contentValues.put("metadata_fingerprint", Long.valueOf(d));
            contentValues.put("metadata", bArr);
            try {
                A().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
                return d;
            } catch (SQLiteException e) {
                w().f().a("Error storing raw event metadata", e);
                throw e;
            }
        } catch (IOException e2) {
            w().f().a("Data loss. Failed to serialize event metadata", e2);
            throw e2;
        }
    }

    @WorkerThread
    public a a(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Object e;
        Throwable th;
        d.a(str);
        j();
        c();
        String[] strArr = new String[]{str};
        a aVar = new a();
        Cursor query;
        try {
            SQLiteDatabase A = A();
            query = A.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    if (query.getLong(0) == j) {
                        aVar.b = query.getLong(1);
                        aVar.a = query.getLong(2);
                        aVar.c = query.getLong(3);
                        aVar.d = query.getLong(4);
                        aVar.e = query.getLong(5);
                    }
                    if (z) {
                        aVar.b++;
                    }
                    if (z2) {
                        aVar.a++;
                    }
                    if (z3) {
                        aVar.c++;
                    }
                    if (z4) {
                        aVar.d++;
                    }
                    if (z5) {
                        aVar.e++;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(aVar.a));
                    contentValues.put("daily_events_count", Long.valueOf(aVar.b));
                    contentValues.put("daily_conversions_count", Long.valueOf(aVar.c));
                    contentValues.put("daily_error_events_count", Long.valueOf(aVar.d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(aVar.e));
                    A.update("apps", contentValues, "app_id=?", strArr);
                    if (query != null) {
                        query.close();
                    }
                    return aVar;
                }
                w().z().a("Not updating daily counts, app is not known", str);
                if (query != null) {
                    query.close();
                }
                return aVar;
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    w().f().a("Error updating daily counts", e);
                    if (query != null) {
                        query.close();
                    }
                    return aVar;
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
            w().f().a("Error updating daily counts", e);
            if (query != null) {
                query.close();
            }
            return aVar;
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public u a(String str, String str2) {
        Object e;
        Cursor cursor;
        Throwable th;
        Cursor cursor2 = null;
        d.a(str);
        d.a(str2);
        j();
        c();
        try {
            Cursor query = A().query("events", new String[]{"lifetime_count", "current_bundle_count", "last_fire_timestamp"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    u uVar = new u(str, str2, query.getLong(0), query.getLong(1), query.getLong(2));
                    if (query.moveToNext()) {
                        w().f().a("Got multiple records for event aggregates, expected one");
                    }
                    if (query == null) {
                        return uVar;
                    }
                    query.close();
                    return uVar;
                }
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (SQLiteException e2) {
                e = e2;
                cursor = query;
                try {
                    w().f().a("Error querying events", str, str2, e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
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
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
            w().f().a("Error querying events", str, str2, e);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public List<l> a(String str) {
        Object e;
        Cursor cursor;
        Throwable th;
        Cursor cursor2 = null;
        d.a(str);
        j();
        c();
        List<l> arrayList = new ArrayList();
        try {
            Cursor query = A().query("user_attributes", new String[]{User.FN_NAME, "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, MAutoDBItem.SYSTEM_ROWID_FIELD, String.valueOf(y().F()));
            try {
                if (query.moveToFirst()) {
                    do {
                        String string = query.getString(0);
                        long j = query.getLong(1);
                        Object b = b(query, 2);
                        if (b == null) {
                            w().f().a("Read invalid user property value, ignoring it");
                        } else {
                            arrayList.add(new l(str, string, j, b));
                        }
                    } while (query.moveToNext());
                    if (query != null) {
                        query.close();
                    }
                    return arrayList;
                }
                if (query != null) {
                    query.close();
                }
                return arrayList;
            } catch (SQLiteException e2) {
                e = e2;
                cursor = query;
            } catch (Throwable th2) {
                th = th2;
                cursor2 = query;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
            try {
                w().f().a("Error querying user properties", str, e);
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public List<Pair<e, Long>> a(String str, int i, int i2) {
        Object e;
        Cursor cursor;
        Throwable th;
        boolean z = true;
        j();
        c();
        d.b(i > 0);
        if (i2 <= 0) {
            z = false;
        }
        d.b(z);
        d.a(str);
        Cursor query;
        List<Pair<e, Long>> emptyList;
        try {
            query = A().query("queue", new String[]{MAutoDBItem.SYSTEM_ROWID_FIELD, UriUtil.DATA_SCHEME}, "app_id=?", new String[]{str}, null, null, MAutoDBItem.SYSTEM_ROWID_FIELD, String.valueOf(i));
            try {
                if (query.moveToFirst()) {
                    List<Pair<e, Long>> arrayList = new ArrayList();
                    int i3 = 0;
                    while (true) {
                        long j = query.getLong(0);
                        int length;
                        try {
                            byte[] b = s().b(query.getBlob(1));
                            if (!arrayList.isEmpty() && b.length + i3 > i2) {
                                break;
                            }
                            qv a = qv.a(b);
                            e eVar = new e();
                            try {
                                e eVar2 = (e) eVar.b(a);
                                length = b.length + i3;
                                arrayList.add(Pair.create(eVar, Long.valueOf(j)));
                            } catch (IOException e2) {
                                w().f().a("Failed to merge queued bundle", str, e2);
                                length = i3;
                            }
                            if (!query.moveToNext() || length > i2) {
                                break;
                            }
                            i3 = length;
                        } catch (IOException e22) {
                            w().f().a("Failed to unzip queued bundle", str, e22);
                            length = i3;
                        }
                    }
                    if (query != null) {
                        query.close();
                    }
                    return arrayList;
                }
                emptyList = Collections.emptyList();
                if (query == null) {
                    return emptyList;
                }
                query.close();
                return emptyList;
            } catch (SQLiteException e3) {
                e = e3;
                cursor = query;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (SQLiteException e4) {
            e = e4;
            cursor = null;
            try {
                w().f().a("Error querying bundles", str, e);
                emptyList = Collections.emptyList();
                if (cursor == null) {
                    return emptyList;
                }
                cursor.close();
                return emptyList;
            } catch (Throwable th3) {
                th = th3;
                query = cursor;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public void a(long j) {
        j();
        c();
        if (A().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) != 1) {
            w().f().a("Deleted fewer rows from queue than expected");
        }
    }

    @WorkerThread
    void a(ContentValues contentValues, String str, Object obj) {
        d.a(str);
        d.a(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    @WorkerThread
    public void a(e eVar, boolean z) {
        j();
        c();
        d.a(eVar);
        d.a(eVar.o);
        d.a(eVar.f);
        E();
        long a = p().a();
        if (eVar.f.longValue() < a - y().S() || eVar.f.longValue() > y().S() + a) {
            w().z().a("Storing bundle outside of the max uploading time span. now, timestamp", Long.valueOf(a), eVar.f);
        }
        try {
            byte[] bArr = new byte[eVar.g()];
            qw a2 = qw.a(bArr);
            eVar.a(a2);
            a2.b();
            bArr = s().a(bArr);
            w().E().a("Saving bundle, size", Integer.valueOf(bArr.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", eVar.o);
            contentValues.put("bundle_end_timestamp", eVar.f);
            contentValues.put(UriUtil.DATA_SCHEME, bArr);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            try {
                if (A().insert("queue", null, contentValues) == -1) {
                    w().f().a("Failed to insert bundle (got -1)");
                }
            } catch (SQLiteException e) {
                w().f().a("Error storing bundle", e);
            }
        } catch (IOException e2) {
            w().f().a("Data loss. Failed to serialize bundle", e2);
        }
    }

    @WorkerThread
    public void a(a aVar) {
        d.a(aVar);
        j();
        c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", aVar.b());
        contentValues.put("app_instance_id", aVar.c());
        contentValues.put("gmp_app_id", aVar.d());
        contentValues.put("resettable_device_id_hash", aVar.e());
        contentValues.put("last_bundle_index", Long.valueOf(aVar.o()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(aVar.g()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(aVar.h()));
        contentValues.put(Constants.EXTRA_KEY_APP_VERSION, aVar.i());
        contentValues.put("app_store", aVar.k());
        contentValues.put("gmp_version", Long.valueOf(aVar.l()));
        contentValues.put("dev_cert_hash", Long.valueOf(aVar.m()));
        contentValues.put("measurement_enabled", Boolean.valueOf(aVar.n()));
        contentValues.put("day", Long.valueOf(aVar.s()));
        contentValues.put("daily_public_events_count", Long.valueOf(aVar.t()));
        contentValues.put("daily_events_count", Long.valueOf(aVar.u()));
        contentValues.put("daily_conversions_count", Long.valueOf(aVar.v()));
        contentValues.put("config_fetched_time", Long.valueOf(aVar.p()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(aVar.q()));
        contentValues.put("app_version_int", Long.valueOf(aVar.j()));
        contentValues.put("firebase_instance_id", aVar.f());
        contentValues.put("daily_error_events_count", Long.valueOf(aVar.x()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(aVar.w()));
        try {
            if (A().insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                w().f().a("Failed to insert/update app (got -1)");
            }
        } catch (SQLiteException e) {
            w().f().a("Error storing app", e);
        }
    }

    public void a(t tVar, long j, boolean z) {
        int i = 0;
        j();
        c();
        d.a(tVar);
        d.a(tVar.a);
        com.google.android.gms.internal.amw.b bVar = new com.google.android.gms.internal.amw.b();
        bVar.d = Long.valueOf(tVar.e);
        bVar.a = new com.google.android.gms.internal.amw.c[tVar.f.a()];
        Iterator it = tVar.f.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            com.google.android.gms.internal.amw.c cVar = new com.google.android.gms.internal.amw.c();
            int i3 = i2 + 1;
            bVar.a[i2] = cVar;
            cVar.a = str;
            s().a(cVar, tVar.f.a(str));
            i2 = i3;
        }
        try {
            byte[] bArr = new byte[bVar.g()];
            qw a = qw.a(bArr);
            bVar.a(a);
            a.b();
            w().E().a("Saving event, name, data size", tVar.b, Integer.valueOf(bArr.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", tVar.a);
            contentValues.put(User.FN_NAME, tVar.b);
            contentValues.put("timestamp", Long.valueOf(tVar.d));
            contentValues.put("metadata_fingerprint", Long.valueOf(j));
            contentValues.put(UriUtil.DATA_SCHEME, bArr);
            str = "realtime";
            if (z) {
                i = 1;
            }
            contentValues.put(str, Integer.valueOf(i));
            try {
                if (A().insert("raw_events", null, contentValues) == -1) {
                    w().f().a("Failed to insert raw event (got -1)");
                }
            } catch (SQLiteException e) {
                w().f().a("Error storing raw event", e);
            }
        } catch (IOException e2) {
            w().f().a("Data loss. Failed to serialize event params/data", e2);
        }
    }

    @WorkerThread
    public void a(u uVar) {
        d.a(uVar);
        j();
        c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", uVar.a);
        contentValues.put(User.FN_NAME, uVar.b);
        contentValues.put("lifetime_count", Long.valueOf(uVar.c));
        contentValues.put("current_bundle_count", Long.valueOf(uVar.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(uVar.e));
        try {
            if (A().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                w().f().a("Failed to insert/update event aggregates (got -1)");
            }
        } catch (SQLiteException e) {
            w().f().a("Error storing event aggregates", e);
        }
    }

    @WorkerThread
    public void a(String str, int i) {
        d.a(str);
        j();
        c();
        try {
            A().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str, str, String.valueOf(i)});
        } catch (SQLiteException e) {
            w().f().a("Error pruning currencies", str, e);
        }
    }

    void a(String str, int i, f fVar) {
        c();
        j();
        d.a(str);
        d.a(fVar);
        try {
            byte[] bArr = new byte[fVar.g()];
            qw a = qw.a(bArr);
            fVar.a(a);
            a.b();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("current_results", bArr);
            try {
                if (A().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                    w().f().a("Failed to insert filter results (got -1)");
                }
            } catch (SQLiteException e) {
                w().f().a("Error storing filter results", e);
            }
        } catch (IOException e2) {
            w().f().a("Configuration loss. Failed to serialize filter results", e2);
        }
    }

    @WorkerThread
    protected void a(String str, long j) {
        d.a(str);
        j();
        c();
        if (j <= 0) {
            w().f().a("Nonpositive first open count received, ignoring");
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("first_open_count", Long.valueOf(j));
        try {
            if (A().insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                w().f().a("Failed to insert/replace first open count (got -1)");
            }
        } catch (SQLiteException e) {
            w().f().a("Error inserting/replacing first open count", e);
        }
    }

    public void a(String str, long j, b bVar) {
        Cursor cursor;
        Object e;
        Throwable th;
        Cursor cursor2 = null;
        d.a(bVar);
        j();
        c();
        try {
            Object string;
            String str2;
            SQLiteDatabase A = A();
            String string2;
            if (TextUtils.isEmpty(str)) {
                cursor2 = A.rawQuery("select app_id, metadata_fingerprint from raw_events where app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", new String[]{String.valueOf(j)});
                if (cursor2.moveToFirst()) {
                    string = cursor2.getString(0);
                    string2 = cursor2.getString(1);
                    cursor2.close();
                    str2 = string2;
                    cursor = cursor2;
                } else if (cursor2 != null) {
                    cursor2.close();
                    return;
                } else {
                    return;
                }
            }
            cursor2 = A.rawQuery("select metadata_fingerprint from raw_events where app_id = ? order by rowid limit 1;", new String[]{str});
            if (cursor2.moveToFirst()) {
                string2 = cursor2.getString(0);
                cursor2.close();
                str2 = string2;
                cursor = cursor2;
            } else if (cursor2 != null) {
                cursor2.close();
                return;
            } else {
                return;
            }
            try {
                cursor = A.query("raw_events_metadata", new String[]{"metadata"}, "app_id=? and metadata_fingerprint=?", new String[]{string, str2}, null, null, MAutoDBItem.SYSTEM_ROWID_FIELD, "2");
                if (cursor.moveToFirst()) {
                    qv a = qv.a(cursor.getBlob(0));
                    e eVar = new e();
                    try {
                        e eVar2 = (e) eVar.b(a);
                        if (cursor.moveToNext()) {
                            w().z().a("Get multiple raw event metadata records, expected one");
                        }
                        cursor.close();
                        bVar.a(eVar);
                        cursor2 = A.query("raw_events", new String[]{MAutoDBItem.SYSTEM_ROWID_FIELD, User.FN_NAME, "timestamp", UriUtil.DATA_SCHEME}, "app_id=? and metadata_fingerprint=?", new String[]{string, str2}, null, null, MAutoDBItem.SYSTEM_ROWID_FIELD, null);
                        if (cursor2.moveToFirst()) {
                            do {
                                long j2 = cursor2.getLong(0);
                                qv a2 = qv.a(cursor2.getBlob(3));
                                com.google.android.gms.internal.amw.b bVar2 = new com.google.android.gms.internal.amw.b();
                                try {
                                    com.google.android.gms.internal.amw.b bVar3 = (com.google.android.gms.internal.amw.b) bVar2.b(a2);
                                    bVar2.b = cursor2.getString(1);
                                    bVar2.c = Long.valueOf(cursor2.getLong(2));
                                    if (!bVar.a(j2, bVar2)) {
                                        if (cursor2 != null) {
                                            cursor2.close();
                                            return;
                                        }
                                        return;
                                    }
                                } catch (IOException e2) {
                                    try {
                                        w().f().a("Data loss. Failed to merge raw event", string, e2);
                                    } catch (SQLiteException e3) {
                                        e = e3;
                                    }
                                }
                            } while (cursor2.moveToNext());
                            if (cursor2 != null) {
                                cursor2.close();
                                return;
                            }
                            return;
                        }
                        w().z().a("Raw event data disappeared while in transaction");
                        if (cursor2 != null) {
                            cursor2.close();
                            return;
                        }
                        return;
                    } catch (IOException e22) {
                        w().f().a("Data loss. Failed to merge raw event metadata", string, e22);
                        if (cursor != null) {
                            cursor.close();
                            return;
                        }
                        return;
                    }
                }
                w().f().a("Raw event metadata record is missing");
                if (cursor != null) {
                    cursor.close();
                }
            } catch (SQLiteException e4) {
                e = e4;
                cursor2 = cursor;
                try {
                    w().f().a("Data loss. Error selecting raw event", e);
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursor2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e32) {
            e = e32;
        } catch (Throwable th4) {
            th = th4;
            cursor = cursor2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public void a(String str, byte[] bArr) {
        d.a(str);
        j();
        c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        try {
            if (((long) A().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                w().f().a("Failed to update remote config (got 0)");
            }
        } catch (SQLiteException e) {
            w().f().a("Error storing remote config", e);
        }
    }

    @WorkerThread
    void a(String str, com.google.android.gms.internal.amu.a[] aVarArr) {
        int i = 0;
        c();
        j();
        d.a(str);
        d.a(aVarArr);
        SQLiteDatabase A = A();
        A.beginTransaction();
        try {
            e(str);
            for (com.google.android.gms.internal.amu.a a : aVarArr) {
                a(str, a);
            }
            List arrayList = new ArrayList();
            int length = aVarArr.length;
            while (i < length) {
                arrayList.add(aVarArr[i].a);
                i++;
            }
            a(str, arrayList);
            A.setTransactionSuccessful();
        } finally {
            A.endTransaction();
        }
    }

    public void a(List<Long> list) {
        d.a(list);
        j();
        c();
        StringBuilder stringBuilder = new StringBuilder("rowid in (");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                stringBuilder.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            stringBuilder.append(((Long) list.get(i)).longValue());
        }
        stringBuilder.append(")");
        int delete = A().delete("raw_events", stringBuilder.toString(), null);
        if (delete != list.size()) {
            w().f().a("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list.size()));
        }
    }

    @WorkerThread
    public boolean a(l lVar) {
        d.a(lVar);
        j();
        c();
        if (c(lVar.a, lVar.b) == null) {
            if (m.a(lVar.b)) {
                if (a("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{lVar.a}) >= ((long) y().E())) {
                    return false;
                }
            }
            if (a("select count(1) from user_attributes where app_id=?", new String[]{lVar.a}) >= ((long) y().F())) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", lVar.a);
        contentValues.put(User.FN_NAME, lVar.b);
        contentValues.put("set_timestamp", Long.valueOf(lVar.c));
        a(contentValues, "value", lVar.d);
        try {
            if (A().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                w().f().a("Failed to insert/update user property (got -1)");
            }
        } catch (SQLiteException e) {
            w().f().a("Error storing user property", e);
        }
        return true;
    }

    boolean a(String str, List<Integer> list) {
        d.a(str);
        c();
        j();
        SQLiteDatabase A = A();
        try {
            if (a("select count(1) from audience_filter_values where app_id=?", new String[]{str}) <= ((long) y().f(str))) {
                return false;
            }
            Iterable arrayList = new ArrayList();
            if (list != null) {
                for (int i = 0; i < list.size(); i++) {
                    Integer num = (Integer) list.get(i);
                    if (num == null || !(num instanceof Integer)) {
                        return false;
                    }
                    arrayList.add(Integer.toString(num.intValue()));
                }
            }
            String valueOf = String.valueOf(TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, arrayList));
            valueOf = new StringBuilder(String.valueOf(valueOf).length() + 2).append("(").append(valueOf).append(")").toString();
            return A.delete("audience_filter_values", new StringBuilder(String.valueOf(valueOf).length() + Opcodes.F2L).append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ").append(valueOf).append(" order by rowid desc limit -1 offset ?)").toString(), new String[]{str, Integer.toString(r5)}) > 0;
        } catch (SQLiteException e) {
            w().f().a("Database error querying filters", e);
            return false;
        }
    }

    @WorkerThread
    public a b(String str) {
        Cursor query;
        Object e;
        Throwable th;
        d.a(str);
        j();
        c();
        try {
            query = A().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", Constants.EXTRA_KEY_APP_VERSION, "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    a aVar = new a(this.n, str);
                    aVar.a(query.getString(0));
                    aVar.b(query.getString(1));
                    aVar.c(query.getString(2));
                    aVar.f(query.getLong(3));
                    aVar.a(query.getLong(4));
                    aVar.b(query.getLong(5));
                    aVar.e(query.getString(6));
                    aVar.f(query.getString(7));
                    aVar.d(query.getLong(8));
                    aVar.e(query.getLong(9));
                    aVar.a((query.isNull(10) ? 1 : query.getInt(10)) != 0);
                    aVar.i(query.getLong(11));
                    aVar.j(query.getLong(12));
                    aVar.k(query.getLong(13));
                    aVar.l(query.getLong(14));
                    aVar.g(query.getLong(15));
                    aVar.h(query.getLong(16));
                    aVar.c(query.isNull(17) ? -2147483648L : (long) query.getInt(17));
                    aVar.d(query.getString(18));
                    aVar.n(query.getLong(19));
                    aVar.m(query.getLong(20));
                    aVar.a();
                    if (query.moveToNext()) {
                        w().f().a("Got multiple records for app, expected one");
                    }
                    if (query == null) {
                        return aVar;
                    }
                    query.close();
                    return aVar;
                }
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    w().f().a("Error querying app", str, e);
                    if (query != null) {
                        query.close();
                    }
                    return null;
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
            w().f().a("Error querying app", str, e);
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    @WorkerThread
    Object b(Cursor cursor, int i) {
        int a = a(cursor, i);
        switch (a) {
            case 0:
                w().f().a("Loaded invalid null value from database");
                return null;
            case 1:
                return Long.valueOf(cursor.getLong(i));
            case 2:
                return Double.valueOf(cursor.getDouble(i));
            case 3:
                return cursor.getString(i);
            case 4:
                w().f().a("Loaded invalid blob type value, ignoring it");
                return null;
            default:
                w().f().a("Loaded invalid unknown value type, ignoring it", Integer.valueOf(a));
                return null;
        }
    }

    public String b(long j) {
        Object e;
        Throwable th;
        String str = null;
        j();
        c();
        Cursor rawQuery;
        try {
            rawQuery = A().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(j)});
            try {
                if (rawQuery.moveToFirst()) {
                    str = rawQuery.getString(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                } else {
                    w().E().a("No expired configs for apps with pending events");
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                }
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    w().f().a("Error selecting expired configs", e);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return str;
                } catch (Throwable th2) {
                    th = th2;
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            rawQuery = str;
            w().f().a("Error selecting expired configs", e);
            if (rawQuery != null) {
                rawQuery.close();
            }
            return str;
        } catch (Throwable th3) {
            rawQuery = str;
            th = th3;
            if (rawQuery != null) {
                rawQuery.close();
            }
            throw th;
        }
        return str;
    }

    @WorkerThread
    void b(String str, int i) {
        c();
        j();
        d.a(str);
        SQLiteDatabase A = A();
        A.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i)});
        A.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i)});
    }

    @WorkerThread
    public void b(String str, String str2) {
        d.a(str);
        d.a(str2);
        j();
        c();
        try {
            w().E().a("Deleted user attribute rows:", Integer.valueOf(A().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2})));
        } catch (SQLiteException e) {
            w().f().a("Error deleting user attribute", str, str2, e);
        }
    }

    public long c(String str) {
        d.a(str);
        j();
        c();
        try {
            SQLiteDatabase A = A();
            String valueOf = String.valueOf(y().j(str));
            return (long) A.delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, valueOf});
        } catch (SQLiteException e) {
            w().f().a("Error deleting over the limit events", e);
            return 0;
        }
    }

    @WorkerThread
    public l c(String str, String str2) {
        Object e;
        Cursor cursor;
        Throwable th;
        Cursor cursor2 = null;
        d.a(str);
        d.a(str2);
        j();
        c();
        try {
            Cursor query = A().query("user_attributes", new String[]{"set_timestamp", "value"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    l lVar = new l(str, str2, query.getLong(0), b(query, 1));
                    if (query.moveToNext()) {
                        w().f().a("Got multiple records for user property, expected one");
                    }
                    if (query == null) {
                        return lVar;
                    }
                    query.close();
                    return lVar;
                }
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (SQLiteException e2) {
                e = e2;
                cursor = query;
                try {
                    w().f().a("Error querying user property", str, str2, e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
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
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
            w().f().a("Error querying user property", str, str2, e);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    Map<Integer, List<com.google.android.gms.internal.amu.b>> d(String str, String str2) {
        Object e;
        Throwable th;
        c();
        j();
        d.a(str);
        d.a(str2);
        Map<Integer, List<com.google.android.gms.internal.amu.b>> arrayMap = new ArrayMap();
        Cursor query;
        try {
            query = A().query("event_filters", new String[]{"audience_id", UriUtil.DATA_SCHEME}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
            if (query.moveToFirst()) {
                do {
                    try {
                        qv a = qv.a(query.getBlob(1));
                        com.google.android.gms.internal.amu.b bVar = new com.google.android.gms.internal.amu.b();
                        try {
                            com.google.android.gms.internal.amu.b bVar2 = (com.google.android.gms.internal.amu.b) bVar.b(a);
                            int i = query.getInt(0);
                            List list = (List) arrayMap.get(Integer.valueOf(i));
                            if (list == null) {
                                list = new ArrayList();
                                arrayMap.put(Integer.valueOf(i), list);
                            }
                            list.add(bVar);
                        } catch (IOException e2) {
                            w().f().a("Failed to merge filter", str, e2);
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return arrayMap;
            }
            Map<Integer, List<com.google.android.gms.internal.amu.b>> emptyMap = Collections.emptyMap();
            if (query == null) {
                return emptyMap;
            }
            query.close();
            return emptyMap;
        } catch (SQLiteException e4) {
            e = e4;
            query = null;
            try {
                w().f().a("Database error querying filters", e);
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public byte[] d(String str) {
        Object e;
        Throwable th;
        d.a(str);
        j();
        c();
        Cursor query;
        try {
            query = A().query("apps", new String[]{"remote_config"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    byte[] blob = query.getBlob(0);
                    if (query.moveToNext()) {
                        w().f().a("Got multiple records for app config, expected one");
                    }
                    if (query == null) {
                        return blob;
                    }
                    query.close();
                    return blob;
                }
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    w().f().a("Error querying remote config", str, e);
                    if (query != null) {
                        query.close();
                    }
                    return null;
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
            w().f().a("Error querying remote config", str, e);
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    Map<Integer, List<amu.e>> e(String str, String str2) {
        Object e;
        Throwable th;
        c();
        j();
        d.a(str);
        d.a(str2);
        Map<Integer, List<amu.e>> arrayMap = new ArrayMap();
        Cursor query;
        try {
            query = A().query("property_filters", new String[]{"audience_id", UriUtil.DATA_SCHEME}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
            if (query.moveToFirst()) {
                do {
                    try {
                        qv a = qv.a(query.getBlob(1));
                        amu.e eVar = new amu.e();
                        try {
                            amu.e eVar2 = (amu.e) eVar.b(a);
                            int i = query.getInt(0);
                            List list = (List) arrayMap.get(Integer.valueOf(i));
                            if (list == null) {
                                list = new ArrayList();
                                arrayMap.put(Integer.valueOf(i), list);
                            }
                            list.add(eVar);
                        } catch (IOException e2) {
                            w().f().a("Failed to merge filter", str, e2);
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return arrayMap;
            }
            Map<Integer, List<amu.e>> emptyMap = Collections.emptyMap();
            if (query == null) {
                return emptyMap;
            }
            query.close();
            return emptyMap;
        } catch (SQLiteException e4) {
            e = e4;
            query = null;
            try {
                w().f().a("Database error querying filters", e);
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    protected void e() {
    }

    @WorkerThread
    void e(String str) {
        c();
        j();
        d.a(str);
        SQLiteDatabase A = A();
        A.delete("property_filters", "app_id=?", new String[]{str});
        A.delete("event_filters", "app_id=?", new String[]{str});
    }

    Map<Integer, f> f(String str) {
        Object e;
        Cursor cursor;
        Throwable th;
        c();
        j();
        d.a(str);
        Cursor query;
        try {
            query = A().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    Map<Integer, f> arrayMap = new ArrayMap();
                    do {
                        int i = query.getInt(0);
                        qv a = qv.a(query.getBlob(1));
                        f fVar = new f();
                        try {
                            f fVar2 = (f) fVar.b(a);
                            arrayMap.put(Integer.valueOf(i), fVar);
                        } catch (IOException e2) {
                            w().f().a("Failed to merge filter results. appId, audienceId, error", str, Integer.valueOf(i), e2);
                        }
                    } while (query.moveToNext());
                    if (query != null) {
                        query.close();
                    }
                    return arrayMap;
                }
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (SQLiteException e3) {
                e = e3;
                cursor = query;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (SQLiteException e4) {
            e = e4;
            cursor = null;
            try {
                w().f().a("Database error querying filter results", e);
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                query = cursor;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public void f() {
        c();
        A().beginTransaction();
    }

    @WorkerThread
    public void g() {
        c();
        A().setTransactionSuccessful();
    }

    @WorkerThread
    void g(String str) {
        c();
        j();
        d.a(str);
        try {
            SQLiteDatabase A = A();
            String[] strArr = new String[]{str};
            int delete = A.delete("audience_filter_values", "app_id=?", strArr) + (((((((A.delete("events", "app_id=?", strArr) + 0) + A.delete("user_attributes", "app_id=?", strArr)) + A.delete("apps", "app_id=?", strArr)) + A.delete("raw_events", "app_id=?", strArr)) + A.delete("raw_events_metadata", "app_id=?", strArr)) + A.delete("event_filters", "app_id=?", strArr)) + A.delete("property_filters", "app_id=?", strArr));
            if (delete > 0) {
                w().E().a("Deleted application data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            w().f().a("Error deleting application data. appId, error", str, e);
        }
    }

    @WorkerThread
    public long h(String str) {
        d.a(str);
        j();
        c();
        SQLiteDatabase A = A();
        A.beginTransaction();
        try {
            long a = a("select first_open_count from app2 where app_id=?", new String[]{str}, 0);
            a(str, 1 + a);
            A.setTransactionSuccessful();
            return a;
        } finally {
            A.endTransaction();
        }
    }

    public void i(String str) {
        try {
            A().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{str, str});
        } catch (SQLiteException e) {
            w().f().a("Failed to remove unused event metadata", e);
        }
    }

    public long j(String str) {
        d.a(str);
        return a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    @WorkerThread
    public void z() {
        c();
        A().endTransaction();
    }
}
