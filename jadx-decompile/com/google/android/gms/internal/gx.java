package com.google.android.gms.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.firebase.database.d;
import com.tencent.mm.sdk.storage.MAutoDBItem;
import com.xiaomi.mipush.sdk.Constants;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class gx implements jq {
    static final /* synthetic */ boolean a = (!gx.class.desiredAssertionStatus());
    private static final Charset b = Charset.forName("UTF-8");
    private final SQLiteDatabase c;
    private final ks d;
    private boolean e;
    private long f = 0;

    private static class a extends SQLiteOpenHelper {
        static final /* synthetic */ boolean a = (!gx.class.desiredAssertionStatus());

        public a(Context context, String str) {
            super(context, str, null, 2);
        }

        private void a(SQLiteDatabase sQLiteDatabase, String str) {
            String str2 = "DROP TABLE IF EXISTS ";
            String valueOf = String.valueOf(str);
            sQLiteDatabase.execSQL(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
            sQLiteDatabase.execSQL("CREATE TABLE writes (id INTEGER, path TEXT, type TEXT, part INTEGER, node BLOB, UNIQUE (id, part));");
            sQLiteDatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
            sQLiteDatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (!a && i2 != 2) {
                throw new AssertionError("Why is onUpgrade() called with a different version?");
            } else if (i <= 1) {
                a(sQLiteDatabase, "serverCache");
                sQLiteDatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
                a(sQLiteDatabase, "complete");
                sQLiteDatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
                sQLiteDatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
            } else {
                throw new AssertionError("We don't handle upgrading to " + i2);
            }
        }
    }

    public gx(Context context, ic icVar, String str) {
        try {
            String encode = URLEncoder.encode(str, "utf-8");
            this.d = icVar.a("Persistence");
            this.c = a(context, encode);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private int a(ij ijVar, List<String> list, int i) {
        int i2 = i + 1;
        String c = c(ijVar);
        if (((String) list.get(i)).startsWith(c)) {
            while (i2 < list.size() && ((String) list.get(i2)).equals(a(ijVar, i2 - i))) {
                i2++;
            }
            if (i2 < list.size()) {
                String str = (String) list.get(i2);
                String valueOf = String.valueOf(c);
                c = String.valueOf(".part-");
                if (str.startsWith(c.length() != 0 ? valueOf.concat(c) : new String(valueOf))) {
                    throw new IllegalStateException("Run did not finish with all parts");
                }
            }
            return i2 - i;
        }
        throw new IllegalStateException("Extracting split nodes needs to start with path prefix");
    }

    private int a(String str, ij ijVar) {
        String a = a(c(ijVar));
        return this.c.delete(str, "path >= ? AND path < ?", new String[]{r1, a});
    }

    private Cursor a(ij ijVar, String[] strArr) {
        String c = c(ijVar);
        String a = a(c);
        String[] strArr2 = new String[(ijVar.i() + 3)];
        String valueOf = String.valueOf(b(ijVar, strArr2));
        String valueOf2 = String.valueOf(" OR (path > ? AND path < ?)");
        valueOf2 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        strArr2[ijVar.i() + 1] = c;
        strArr2[ijVar.i() + 2] = a;
        return this.c.query("serverCache", strArr, valueOf2, strArr2, null, null, "path");
    }

    private SQLiteDatabase a(Context context, String str) {
        try {
            SQLiteDatabase writableDatabase = new a(context, str).getWritableDatabase();
            writableDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", null).close();
            writableDatabase.beginTransaction();
            writableDatabase.endTransaction();
            return writableDatabase;
        } catch (Throwable e) {
            if (e instanceof SQLiteDatabaseLockedException) {
                throw new d("Failed to gain exclusive lock to Firebase Database's offline persistence. This generally means you are using Firebase Database from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing FirebaseDatabase in your Application class. If you are intentionally using Firebase Database from multiple processes, you can only enable offline persistence (i.e. call setPersistenceEnabled(true)) in one of them.", e);
            }
            throw e;
        }
    }

    private lh a(byte[] bArr) {
        try {
            return li.a(mb.b(new String(bArr, b)));
        } catch (Throwable e) {
            Throwable th = e;
            String str = "Could not deserialize node: ";
            String valueOf = String.valueOf(new String(bArr, b));
            throw new RuntimeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
        }
    }

    private String a(ij ijVar, int i) {
        String valueOf = String.valueOf(c(ijVar));
        String valueOf2 = String.valueOf(String.format(".part-%04d", new Object[]{Integer.valueOf(i)}));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private static String a(String str) {
        if (a || str.endsWith("/")) {
            String valueOf = String.valueOf(str.substring(0, str.length() - 1));
            return new StringBuilder(String.valueOf(valueOf).length() + 1).append(valueOf).append('0').toString();
        }
        throw new AssertionError("Path keys must end with a '/'");
    }

    private String a(Collection<Long> collection) {
        StringBuilder stringBuilder = new StringBuilder();
        Object obj = 1;
        for (Long longValue : collection) {
            long longValue2 = longValue.longValue();
            if (obj == null) {
                stringBuilder.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            stringBuilder.append(longValue2);
            obj = null;
        }
        return stringBuilder.toString();
    }

    private static List<byte[]> a(byte[] bArr, int i) {
        int length = ((bArr.length - 1) / i) + 1;
        List<byte[]> arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            int min = Math.min(i, bArr.length - (i2 * i));
            Object obj = new byte[min];
            System.arraycopy(bArr, i2 * i, obj, 0, min);
            arrayList.add(obj);
        }
        return arrayList;
    }

    private void a(ij ijVar, long j, String str, byte[] bArr) {
        h();
        this.c.delete("writes", "id = ?", new String[]{String.valueOf(j)});
        if (bArr.length >= AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) {
            List a = a(bArr, (int) AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START);
            for (int i = 0; i < a.size(); i++) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", Long.valueOf(j));
                contentValues.put("path", c(ijVar));
                contentValues.put("type", str);
                contentValues.put("part", Integer.valueOf(i));
                contentValues.put("node", (byte[]) a.get(i));
                this.c.insertWithOnConflict("writes", null, contentValues, 5);
            }
            return;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("id", Long.valueOf(j));
        contentValues2.put("path", c(ijVar));
        contentValues2.put("type", str);
        contentValues2.put("part", null);
        contentValues2.put("node", bArr);
        this.c.insertWithOnConflict("writes", null, contentValues2, 5);
    }

    private void a(ij ijVar, ij ijVar2, ju<Long> juVar, final ju<Long> juVar2, jr jrVar, List<mh<ij, lh>> list) {
        if (juVar.b() != null) {
            if (((Integer) jrVar.a(Integer.valueOf(0), new com.google.android.gms.internal.ju.a<Void, Integer>(this) {
                final /* synthetic */ gx b;

                public Integer a(ij ijVar, Void voidR, Integer num) {
                    return Integer.valueOf(juVar2.e(ijVar) == null ? num.intValue() + 1 : num.intValue());
                }
            })).intValue() > 0) {
                ij a = ijVar.a(ijVar2);
                if (this.d.a()) {
                    this.d.a(String.format("Need to rewrite %d nodes below path %s", new Object[]{Integer.valueOf(r0), a}), new Object[0]);
                }
                final lh b = b(a);
                final ju<Long> juVar3 = juVar2;
                final List<mh<ij, lh>> list2 = list;
                final ij ijVar3 = ijVar2;
                jrVar.a(null, new com.google.android.gms.internal.ju.a<Void, Void>(this) {
                    final /* synthetic */ gx e;

                    public Void a(ij ijVar, Void voidR, Void voidR2) {
                        if (juVar3.e(ijVar) == null) {
                            list2.add(new mh(ijVar3.a(ijVar), b.a(ijVar)));
                        }
                        return null;
                    }
                });
                return;
            }
            return;
        }
        Iterator it = juVar.c().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            kv kvVar = (kv) entry.getKey();
            jr a2 = jrVar.a((kv) entry.getKey());
            a(ijVar, ijVar2.a(kvVar), (ju) entry.getValue(), juVar2.a(kvVar), a2, list);
        }
    }

    private void a(ij ijVar, lh lhVar, boolean z) {
        int i;
        int i2;
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            i = 0;
            i2 = 0;
            for (lg lgVar : lhVar) {
                i2 += a("serverCache", ijVar.a(lgVar.c()));
                i = c(ijVar.a(lgVar.c()), lgVar.d()) + i;
            }
        } else {
            i2 = a("serverCache", ijVar);
            i = c(ijVar, lhVar);
        }
        currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
        if (this.d.a()) {
            this.d.a(String.format("Persisted a total of %d rows and deleted %d rows for a set at %s in %dms", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), ijVar.toString(), Long.valueOf(currentTimeMillis)}), new Object[0]);
        }
    }

    private byte[] a(Object obj) {
        try {
            return mb.a(obj).getBytes(b);
        } catch (Throwable e) {
            throw new RuntimeException("Could not serialize leaf node", e);
        }
    }

    private byte[] a(List<byte[]> list) {
        int i = 0;
        for (byte[] length : list) {
            i = length.length + i;
        }
        Object obj = new byte[i];
        i = 0;
        for (byte[] length2 : list) {
            System.arraycopy(length2, 0, obj, i, length2.length);
            i = length2.length + i;
        }
        return obj;
    }

    private lh b(ij ijVar) {
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        Cursor a = a(ijVar, new String[]{"path", "value"});
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        long currentTimeMillis3 = System.currentTimeMillis();
        while (a.moveToNext()) {
            try {
                arrayList.add(a.getString(0));
                arrayList2.add(a.getBlob(1));
            } finally {
                a.close();
            }
        }
        long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
        long currentTimeMillis5 = System.currentTimeMillis();
        lh j = la.j();
        Object obj = null;
        Map hashMap = new HashMap();
        int i = 0;
        while (i < arrayList2.size()) {
            int a2;
            ij ijVar2;
            lh a3;
            Object obj2;
            lh lhVar;
            if (((String) arrayList.get(i)).endsWith(".part-0000")) {
                String str = (String) arrayList.get(i);
                ij ijVar3 = new ij(str.substring(0, str.length() - ".part-0000".length()));
                a2 = a(ijVar3, arrayList, i);
                if (this.d.a()) {
                    this.d.a("Loading split node with " + a2 + " parts.", new Object[0]);
                }
                byte[] a4 = a(arrayList2.subList(i, i + a2));
                a2 = (i + a2) - 1;
                ijVar2 = ijVar3;
                a3 = a(a4);
            } else {
                lh a5 = a((byte[]) arrayList2.get(i));
                ij ijVar4 = new ij((String) arrayList.get(i));
                a3 = a5;
                a2 = i;
                ijVar2 = ijVar4;
            }
            if (ijVar2.g() != null && ijVar2.g().f()) {
                hashMap.put(ijVar2, a3);
                obj2 = obj;
                lhVar = j;
            } else if (ijVar2.b(ijVar)) {
                mk.a(obj == null, "Descendants of path must come after ancestors.");
                Object obj3 = obj;
                lhVar = a3.a(ij.a(ijVar2, ijVar));
                obj2 = obj3;
            } else if (ijVar.b(ijVar2)) {
                obj2 = 1;
                lhVar = j.a(ij.a(ijVar, ijVar2), a3);
            } else {
                throw new IllegalStateException(String.format("Loading an unrelated row with path %s for %s", new Object[]{ijVar2, ijVar}));
            }
            i = a2 + 1;
            j = lhVar;
            obj = obj2;
        }
        for (Entry entry : hashMap.entrySet()) {
            j = j.a(ij.a(ijVar, (ij) entry.getKey()), (lh) entry.getValue());
        }
        long currentTimeMillis6 = System.currentTimeMillis() - currentTimeMillis5;
        long currentTimeMillis7 = System.currentTimeMillis() - currentTimeMillis;
        if (this.d.a()) {
            this.d.a(String.format("Loaded a total of %d rows for a total of %d nodes at %s in %dms (Query: %dms, Loading: %dms, Serializing: %dms)", new Object[]{Integer.valueOf(arrayList2.size()), Integer.valueOf(mf.b(j)), ijVar, Long.valueOf(currentTimeMillis7), Long.valueOf(currentTimeMillis2), Long.valueOf(currentTimeMillis4), Long.valueOf(currentTimeMillis6)}), new Object[0]);
        }
        return j;
    }

    private static String b(ij ijVar, String[] strArr) {
        if (a || strArr.length >= ijVar.i() + 1) {
            int i = 0;
            StringBuilder stringBuilder = new StringBuilder("(");
            while (!ijVar.h()) {
                stringBuilder.append("path");
                stringBuilder.append(" = ? OR ");
                strArr[i] = c(ijVar);
                ijVar = ijVar.f();
                i++;
            }
            stringBuilder.append("path");
            stringBuilder.append(" = ?)");
            strArr[i] = c(ij.a());
            return stringBuilder.toString();
        }
        throw new AssertionError();
    }

    private int c(ij ijVar, lh lhVar) {
        long a = mf.a(lhVar);
        if (!(lhVar instanceof kw) || a <= FimiMediaMeta.AV_CH_TOP_FRONT_RIGHT) {
            d(ijVar, lhVar);
            return 1;
        }
        if (this.d.a()) {
            this.d.a(String.format("Node estimated serialized size at path %s of %d bytes exceeds limit of %d bytes. Splitting up.", new Object[]{ijVar, Long.valueOf(a), Integer.valueOf(16384)}), new Object[0]);
        }
        int i = 0;
        for (lg lgVar : lhVar) {
            i = c(ijVar.a(lgVar.c()), lgVar.d()) + i;
        }
        if (!lhVar.f().b()) {
            d(ijVar.a(kv.c()), lhVar.f());
            i++;
        }
        d(ijVar, la.j());
        return i + 1;
    }

    private static String c(ij ijVar) {
        return ijVar.h() ? "/" : String.valueOf(ijVar.toString()).concat("/");
    }

    private void d(ij ijVar, lh lhVar) {
        byte[] a = a(lhVar.a(true));
        if (a.length >= AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) {
            List a2 = a(a, (int) AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START);
            if (this.d.a()) {
                this.d.a("Saving huge leaf node with " + a2.size() + " parts.", new Object[0]);
            }
            for (int i = 0; i < a2.size(); i++) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("path", a(ijVar, i));
                contentValues.put("value", (byte[]) a2.get(i));
                this.c.insertWithOnConflict("serverCache", null, contentValues, 5);
            }
            return;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("path", c(ijVar));
        contentValues2.put("value", a);
        this.c.insertWithOnConflict("serverCache", null, contentValues2, 5);
    }

    private void h() {
        mk.a(this.e, "Transaction expected to already be in progress.");
    }

    public lh a(ij ijVar) {
        return b(ijVar);
    }

    public List<iy> a() {
        String[] strArr = new String[]{"id", "path", "type", "part", "node"};
        long currentTimeMillis = System.currentTimeMillis();
        Cursor query = this.c.query("writes", strArr, null, null, null, null, "id, part");
        List<iy> arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                byte[] blob;
                Object iyVar;
                long j = query.getLong(0);
                ij ijVar = new ij(query.getString(1));
                String string = query.getString(2);
                if (query.isNull(3)) {
                    blob = query.getBlob(4);
                } else {
                    List arrayList2 = new ArrayList();
                    do {
                        arrayList2.add(query.getBlob(4));
                        if (!query.moveToNext()) {
                            break;
                        }
                    } while (query.getLong(0) == j);
                    query.moveToPrevious();
                    blob = a(arrayList2);
                }
                Object b = mb.b(new String(blob, b));
                if ("o".equals(string)) {
                    iyVar = new iy(j, ijVar, li.a(b), true);
                } else if ("m".equals(string)) {
                    iyVar = new iy(j, ijVar, ia.a((Map) b));
                } else {
                    String str = "Got invalid write type: ";
                    String valueOf = String.valueOf(string);
                    throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                }
                arrayList.add(iyVar);
            } catch (Throwable e) {
                throw new RuntimeException("Failed to load writes", e);
            } catch (Throwable th) {
                query.close();
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.d.a()) {
            this.d.a(String.format("Loaded %d writes in %dms", new Object[]{Integer.valueOf(arrayList.size()), Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
        query.close();
        return arrayList;
    }

    public Set<kv> a(Set<Long> set) {
        String[] strArr = new String[]{"key"};
        long currentTimeMillis = System.currentTimeMillis();
        String valueOf = String.valueOf("id IN (");
        String valueOf2 = String.valueOf(a((Collection) set));
        Cursor query = this.c.query(true, "trackedKeys", strArr, new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append(valueOf2).append(")").toString(), null, null, null, null, null);
        Set<kv> hashSet = new HashSet();
        while (query.moveToNext()) {
            try {
                hashSet.add(kv.a(query.getString(0)));
            } catch (Throwable th) {
                query.close();
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.d.a()) {
            this.d.a(String.format("Loaded %d tracked queries keys for tracked queries %s in %dms", new Object[]{Integer.valueOf(hashSet.size()), set.toString(), Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
        query.close();
        return hashSet;
    }

    public void a(long j) {
        h();
        long currentTimeMillis = System.currentTimeMillis();
        int delete = this.c.delete("writes", "id = ?", new String[]{String.valueOf(j)});
        currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
        if (this.d.a()) {
            this.d.a(String.format("Deleted %d write(s) with writeId %d in %dms", new Object[]{Integer.valueOf(delete), Long.valueOf(j), Long.valueOf(currentTimeMillis)}), new Object[0]);
        }
    }

    public void a(long j, Set<kv> set) {
        h();
        long currentTimeMillis = System.currentTimeMillis();
        String valueOf = String.valueOf(j);
        this.c.delete("trackedKeys", "id = ?", new String[]{valueOf});
        for (kv kvVar : set) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j));
            contentValues.put("key", kvVar.e());
            this.c.insertWithOnConflict("trackedKeys", null, contentValues, 5);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.d.a()) {
            this.d.a(String.format("Set %d tracked query keys for tracked query %d in %dms", new Object[]{Integer.valueOf(set.size()), Long.valueOf(j), Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public void a(long j, Set<kv> set, Set<kv> set2) {
        h();
        long currentTimeMillis = System.currentTimeMillis();
        String str = "id = ? AND key = ?";
        String valueOf = String.valueOf(j);
        for (kv kvVar : set2) {
            this.c.delete("trackedKeys", str, new String[]{valueOf, kvVar.e()});
        }
        for (kv kvVar2 : set) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j));
            contentValues.put("key", kvVar2.e());
            this.c.insertWithOnConflict("trackedKeys", null, contentValues, 5);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.d.a()) {
            this.d.a(String.format("Updated tracked query keys (%d added, %d removed) for tracked query id %d in %dms", new Object[]{Integer.valueOf(set.size()), Integer.valueOf(set2.size()), Long.valueOf(j), Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public void a(ij ijVar, ia iaVar) {
        h();
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = iaVar.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            i += a("serverCache", ijVar.a((ij) entry.getKey()));
            i2 = c(ijVar.a((ij) entry.getKey()), (lh) entry.getValue()) + i2;
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.d.a()) {
            this.d.a(String.format("Persisted a total of %d rows and deleted %d rows for a merge at %s in %dms", new Object[]{Integer.valueOf(i2), Integer.valueOf(i), ijVar.toString(), Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public void a(ij ijVar, ia iaVar, long j) {
        h();
        long currentTimeMillis = System.currentTimeMillis();
        ij ijVar2 = ijVar;
        long j2 = j;
        a(ijVar2, j2, "m", a(iaVar.a(true)));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.d.a()) {
            this.d.a(String.format("Persisted user merge in %dms", new Object[]{Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public void a(ij ijVar, jr jrVar) {
        if (jrVar.a()) {
            h();
            long currentTimeMillis = System.currentTimeMillis();
            Cursor a = a(ijVar, new String[]{MAutoDBItem.SYSTEM_ROWID_FIELD, "path"});
            ju juVar = new ju(null);
            ju juVar2 = new ju(null);
            while (a.moveToNext()) {
                long j = a.getLong(0);
                ij ijVar2 = new ij(a.getString(1));
                ks ksVar;
                String valueOf;
                String valueOf2;
                if (ijVar.b(ijVar2)) {
                    ij a2 = ij.a(ijVar, ijVar2);
                    if (jrVar.a(a2)) {
                        juVar = juVar.a(a2, Long.valueOf(j));
                    } else if (jrVar.b(a2)) {
                        juVar2 = juVar2.a(a2, Long.valueOf(j));
                    } else {
                        ksVar = this.d;
                        valueOf = String.valueOf(ijVar);
                        valueOf2 = String.valueOf(ijVar2);
                        ksVar.a(new StringBuilder((String.valueOf(valueOf).length() + 88) + String.valueOf(valueOf2).length()).append("We are pruning at ").append(valueOf).append(" and have data at ").append(valueOf2).append(" that isn't marked for pruning or keeping. Ignoring.").toString());
                    }
                } else {
                    ksVar = this.d;
                    valueOf = String.valueOf(ijVar);
                    valueOf2 = String.valueOf(ijVar2);
                    ksVar.a(new StringBuilder((String.valueOf(valueOf).length() + 67) + String.valueOf(valueOf2).length()).append("We are pruning at ").append(valueOf).append(" but we have data stored higher up at ").append(valueOf2).append(". Ignoring.").toString());
                }
            }
            int i = 0;
            int i2 = 0;
            if (!juVar.d()) {
                List<mh> arrayList = new ArrayList();
                a(ijVar, ij.a(), juVar, juVar2, jrVar, arrayList);
                Collection e = juVar.e();
                String valueOf3 = String.valueOf(a(e));
                this.c.delete("serverCache", new StringBuilder(String.valueOf(valueOf3).length() + 11).append("rowid IN (").append(valueOf3).append(")").toString(), null);
                for (mh mhVar : arrayList) {
                    c(ijVar.a((ij) mhVar.a()), (lh) mhVar.b());
                }
                i = e.size();
                i2 = arrayList.size();
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (this.d.a()) {
                this.d.a(String.format("Pruned %d rows with %d nodes resaved in %dms", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(currentTimeMillis2)}), new Object[0]);
            }
        }
    }

    public void a(ij ijVar, lh lhVar) {
        h();
        a(ijVar, lhVar, false);
    }

    public void a(ij ijVar, lh lhVar, long j) {
        h();
        long currentTimeMillis = System.currentTimeMillis();
        ij ijVar2 = ijVar;
        long j2 = j;
        a(ijVar2, j2, "o", a(lhVar.a(true)));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.d.a()) {
            this.d.a(String.format("Persisted user overwrite in %dms", new Object[]{Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public void a(js jsVar) {
        h();
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Long.valueOf(jsVar.a));
        contentValues.put("path", c(jsVar.b.a()));
        contentValues.put("queryParams", jsVar.b.b().p());
        contentValues.put("lastUse", Long.valueOf(jsVar.c));
        contentValues.put("complete", Boolean.valueOf(jsVar.d));
        contentValues.put("active", Boolean.valueOf(jsVar.e));
        this.c.insertWithOnConflict("trackedQueries", null, contentValues, 5);
        currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
        if (this.d.a()) {
            this.d.a(String.format("Saved new tracked query in %dms", new Object[]{Long.valueOf(currentTimeMillis)}), new Object[0]);
        }
    }

    public long b() {
        long j = null;
        Cursor rawQuery = this.c.rawQuery(String.format("SELECT sum(length(%s) + length(%s)) FROM %s", new Object[]{"value", "path", "serverCache"}), null);
        try {
            if (rawQuery.moveToFirst()) {
                j = rawQuery.getLong(0);
                return j;
            }
            throw new IllegalStateException("Couldn't read database result!");
        } finally {
            rawQuery.close();
        }
    }

    public void b(long j) {
        h();
        String valueOf = String.valueOf(j);
        this.c.delete("trackedQueries", "id = ?", new String[]{valueOf});
        this.c.delete("trackedKeys", "id = ?", new String[]{valueOf});
    }

    public void b(ij ijVar, lh lhVar) {
        h();
        a(ijVar, lhVar, true);
    }

    public List<js> c() {
        String[] strArr = new String[]{"id", "path", "queryParams", "lastUse", "complete", "active"};
        long currentTimeMillis = System.currentTimeMillis();
        Cursor query = this.c.query("trackedQueries", strArr, null, null, null, null, "id");
        List<js> arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                arrayList.add(new js(query.getLong(0), kg.a(new ij(query.getString(1)), mb.a(query.getString(2))), query.getLong(3), query.getInt(4) != 0, query.getInt(5) != 0));
            } catch (Throwable e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                query.close();
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.d.a()) {
            this.d.a(String.format("Loaded %d tracked queries in %dms", new Object[]{Integer.valueOf(arrayList.size()), Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
        query.close();
        return arrayList;
    }

    public void c(long j) {
        h();
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("active", Boolean.valueOf(false));
        contentValues.put("lastUse", Long.valueOf(j));
        this.c.updateWithOnConflict("trackedQueries", contentValues, "active = 1", new String[0], 5);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.d.a()) {
            this.d.a(String.format("Reset active tracked queries in %dms", new Object[]{Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public Set<kv> d(long j) {
        return a(Collections.singleton(Long.valueOf(j)));
    }

    public void d() {
        h();
        long currentTimeMillis = System.currentTimeMillis();
        int delete = this.c.delete("writes", null, null);
        currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
        if (this.d.a()) {
            this.d.a(String.format("Deleted %d (all) write(s) in %dms", new Object[]{Integer.valueOf(delete), Long.valueOf(currentTimeMillis)}), new Object[0]);
        }
    }

    public void e() {
        mk.a(!this.e, "runInTransaction called when an existing transaction is already in progress.");
        if (this.d.a()) {
            this.d.a("Starting transaction.", new Object[0]);
        }
        this.c.beginTransaction();
        this.e = true;
        this.f = System.currentTimeMillis();
    }

    public void f() {
        this.c.endTransaction();
        this.e = false;
        long currentTimeMillis = System.currentTimeMillis() - this.f;
        if (this.d.a()) {
            this.d.a(String.format("Transaction completed. Elapsed: %dms", new Object[]{Long.valueOf(currentTimeMillis)}), new Object[0]);
        }
    }

    public void g() {
        this.c.setTransactionSuccessful();
    }
}
