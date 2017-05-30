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
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

class du implements c {
    private static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' STRING NOT NULL, '%s' BLOB NOT NULL, '%s' INTEGER NOT NULL);", new Object[]{"datalayer", "ID", "key", "value", "expires"});
    private final Executor b;
    private final Context c;
    private a d;
    private e e;
    private int f;

    class a extends SQLiteOpenHelper {
        final /* synthetic */ du a;

        a(du duVar, Context context, String str) {
            this.a = duVar;
            super(context, str, null, 1);
        }

        private void a(SQLiteDatabase sQLiteDatabase) {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM datalayer WHERE 0", null);
            Set hashSet = new HashSet();
            try {
                String[] columnNames = rawQuery.getColumnNames();
                for (Object add : columnNames) {
                    hashSet.add(add);
                }
                if (!hashSet.remove("key") || !hashSet.remove("value") || !hashSet.remove("ID") || !hashSet.remove("expires")) {
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
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabase = super.getWritableDatabase();
            } catch (SQLiteException e) {
                this.a.c.getDatabasePath("google_tagmanager.db").delete();
            }
            return sQLiteDatabase == null ? super.getWritableDatabase() : sQLiteDatabase;
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
            if (a("datalayer", sQLiteDatabase)) {
                a(sQLiteDatabase);
            } else {
                sQLiteDatabase.execSQL(du.a);
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    private static class b {
        final String a;
        final byte[] b;

        b(String str, byte[] bArr) {
            this.a = str;
            this.b = bArr;
        }

        public String toString() {
            String str = this.a;
            return new StringBuilder(String.valueOf(str).length() + 54).append("KeyAndSerialized: key = ").append(str).append(" serialized hash = ").append(Arrays.hashCode(this.b)).toString();
        }
    }

    public du(Context context) {
        this(context, h.d(), "google_tagmanager.db", 2000, Executors.newSingleThreadExecutor());
    }

    du(Context context, e eVar, String str, int i, Executor executor) {
        this.c = context;
        this.e = eVar;
        this.f = i;
        this.b = executor;
        this.d = new a(this, this.c, str);
    }

    private Object a(byte[] bArr) {
        ObjectInputStream objectInputStream;
        Object readObject;
        Throwable th;
        ObjectInputStream objectInputStream2 = null;
        InputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                readObject = objectInputStream.readObject();
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e) {
                    }
                }
                byteArrayInputStream.close();
            } catch (IOException e2) {
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e3) {
                    }
                }
                byteArrayInputStream.close();
                return readObject;
            } catch (ClassNotFoundException e4) {
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e5) {
                    }
                }
                byteArrayInputStream.close();
                return readObject;
            } catch (Throwable th2) {
                th = th2;
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e6) {
                        throw th;
                    }
                }
                byteArrayInputStream.close();
                throw th;
            }
        } catch (IOException e7) {
            objectInputStream = objectInputStream2;
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            byteArrayInputStream.close();
            return readObject;
        } catch (ClassNotFoundException e8) {
            objectInputStream = objectInputStream2;
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            byteArrayInputStream.close();
            return readObject;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            objectInputStream = objectInputStream2;
            th = th4;
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            byteArrayInputStream.close();
            throw th;
        }
        return readObject;
    }

    private List<a> a(List<b> list) {
        List<a> arrayList = new ArrayList();
        for (b bVar : list) {
            arrayList.add(new a(bVar.a, a(bVar.b)));
        }
        return arrayList;
    }

    private void a(int i) {
        int d = (d() - this.f) + i;
        if (d > 0) {
            List b = b(d);
            aw.c("DataLayer store full, deleting " + b.size() + " entries to make room.");
            a((String[]) b.toArray(new String[0]));
        }
    }

    private void a(long j) {
        SQLiteDatabase c = c("Error opening database for deleteOlderThan.");
        if (c != null) {
            try {
                aw.e("Deleted " + c.delete("datalayer", "expires <= ?", new String[]{Long.toString(j)}) + " expired items");
            } catch (SQLiteException e) {
                aw.b("Error deleting old entries.");
            }
        }
    }

    private void a(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            SQLiteDatabase c = c("Error opening database for deleteEntries.");
            if (c != null) {
                try {
                    c.delete("datalayer", String.format("%s in (%s)", new Object[]{"ID", TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, Collections.nCopies(strArr.length, "?"))}), strArr);
                } catch (SQLiteException e) {
                    String str = "Error deleting entries ";
                    String valueOf = String.valueOf(Arrays.toString(strArr));
                    aw.b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                }
            }
        }
    }

    private byte[] a(Object obj) {
        ObjectOutputStream objectOutputStream;
        Throwable th;
        byte[] bArr = null;
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeObject(obj);
                bArr = byteArrayOutputStream.toByteArray();
                if (objectOutputStream != null) {
                    try {
                        objectOutputStream.close();
                    } catch (IOException e) {
                    }
                }
                byteArrayOutputStream.close();
            } catch (IOException e2) {
                if (objectOutputStream != null) {
                    try {
                        objectOutputStream.close();
                    } catch (IOException e3) {
                    }
                }
                byteArrayOutputStream.close();
                return bArr;
            } catch (Throwable th2) {
                th = th2;
                if (objectOutputStream != null) {
                    try {
                        objectOutputStream.close();
                    } catch (IOException e4) {
                        throw th;
                    }
                }
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (IOException e5) {
            objectOutputStream = bArr;
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
            byteArrayOutputStream.close();
            return bArr;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            objectOutputStream = bArr;
            th = th4;
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
            byteArrayOutputStream.close();
            throw th;
        }
        return bArr;
    }

    private List<a> b() {
        try {
            a(this.e.a());
            List<a> a = a(c());
            return a;
        } finally {
            e();
        }
    }

    private List<String> b(int i) {
        Cursor query;
        SQLiteException e;
        String str;
        String valueOf;
        Throwable th;
        List<String> arrayList = new ArrayList();
        if (i <= 0) {
            aw.b("Invalid maxEntries specified. Skipping.");
            return arrayList;
        }
        SQLiteDatabase c = c("Error opening database for peekEntryIds.");
        if (c == null) {
            return arrayList;
        }
        try {
            query = c.query("datalayer", new String[]{"ID"}, null, null, null, null, String.format("%s ASC", new Object[]{"ID"}), Integer.toString(i));
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
                    str = "Error in peekEntries fetching entryIds: ";
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
            str = "Error in peekEntries fetching entryIds: ";
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

    private List<b> b(List<a> list) {
        List<b> arrayList = new ArrayList();
        for (a aVar : list) {
            arrayList.add(new b(aVar.a, a(aVar.b)));
        }
        return arrayList;
    }

    private void b(String str) {
        SQLiteDatabase c = c("Error opening database for clearKeysWithPrefix.");
        if (c != null) {
            try {
                aw.e("Cleared " + c.delete("datalayer", "key = ? OR key LIKE ?", new String[]{str, String.valueOf(str).concat(".%")}) + " items");
            } catch (SQLiteException e) {
                String valueOf = String.valueOf(e);
                aw.b(new StringBuilder((String.valueOf(str).length() + 44) + String.valueOf(valueOf).length()).append("Error deleting entries with key prefix: ").append(str).append(" (").append(valueOf).append(").").toString());
            } finally {
                e();
            }
        }
    }

    private synchronized void b(List<b> list, long j) {
        try {
            long a = this.e.a();
            a(a);
            a(list.size());
            c(list, a + j);
            e();
        } catch (Throwable th) {
            e();
        }
    }

    private SQLiteDatabase c(String str) {
        try {
            return this.d.getWritableDatabase();
        } catch (SQLiteException e) {
            aw.b(str);
            return null;
        }
    }

    private List<b> c() {
        SQLiteDatabase c = c("Error opening database for loadSerialized.");
        List<b> arrayList = new ArrayList();
        if (c == null) {
            return arrayList;
        }
        Cursor query = c.query("datalayer", new String[]{"key", "value"}, null, null, null, null, "ID", null);
        while (query.moveToNext()) {
            try {
                arrayList.add(new b(query.getString(0), query.getBlob(1)));
            } finally {
                query.close();
            }
        }
        return arrayList;
    }

    private void c(List<b> list, long j) {
        SQLiteDatabase c = c("Error opening database for writeEntryToDatabase.");
        if (c != null) {
            for (b bVar : list) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("expires", Long.valueOf(j));
                contentValues.put("key", bVar.a);
                contentValues.put("value", bVar.b);
                c.insert("datalayer", null, contentValues);
            }
        }
    }

    private int d() {
        Cursor cursor = null;
        int i = 0;
        SQLiteDatabase c = c("Error opening database for getNumStoredEntries.");
        if (c != null) {
            try {
                cursor = c.rawQuery("SELECT COUNT(*) from datalayer", null);
                if (cursor.moveToFirst()) {
                    i = (int) cursor.getLong(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
            } catch (SQLiteException e) {
                aw.b("Error getting numStoredEntries");
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

    private void e() {
        try {
            this.d.close();
        } catch (SQLiteException e) {
        }
    }

    public void a(final com.google.android.gms.tagmanager.e.c.a aVar) {
        this.b.execute(new Runnable(this) {
            final /* synthetic */ du b;

            public void run() {
                aVar.a(this.b.b());
            }
        });
    }

    public void a(final String str) {
        this.b.execute(new Runnable(this) {
            final /* synthetic */ du b;

            public void run() {
                this.b.b(str);
            }
        });
    }

    public void a(List<a> list, final long j) {
        final List b = b((List) list);
        this.b.execute(new Runnable(this) {
            final /* synthetic */ du c;

            public void run() {
                this.c.b(b, j);
            }
        });
    }
}
