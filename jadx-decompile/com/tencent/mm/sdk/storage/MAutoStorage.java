package com.tencent.mm.sdk.storage;

import android.content.ContentValues;
import android.database.Cursor;
import b.b.a;
import com.fimi.soul.entity.User;
import com.tencent.mm.sdk.platformtools.Log;
import com.tencent.mm.sdk.platformtools.Util;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public abstract class MAutoStorage<T extends MAutoDBItem> extends MStorage {
    private ISQLiteDatabase P;
    private final String bL;
    private final String[] columns;

    public MAutoStorage(ISQLiteDatabase iSQLiteDatabase) {
        this.P = iSQLiteDatabase;
        this.bL = Util.isNullOrNil(getPrimaryKey()) ? MAutoDBItem.SYSTEM_ROWID_FIELD : getPrimaryKey();
        this.columns = getColumns();
    }

    private static StringBuilder a(ContentValues contentValues, String... strArr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strArr) {
            stringBuilder.append(str + " = ? AND ");
            if (contentValues.get(str) == null) {
                return null;
            }
        }
        stringBuilder.append(" 1=1");
        return stringBuilder;
    }

    private boolean a(ContentValues contentValues) {
        Cursor query = this.P.query(getTableName(), this.columns, this.bL + " = ?", new String[]{Util.nullAsNil(contentValues.getAsString(this.bL))}, null, null, null);
        boolean checkIOEqual = MAutoDBItem.checkIOEqual(contentValues, query);
        query.close();
        return checkIOEqual;
    }

    private static String[] a(String[] strArr, ContentValues contentValues) {
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr2.length; i++) {
            strArr2[i] = Util.nullAsNil(contentValues.getAsString(strArr[i]));
        }
        return strArr2;
    }

    private void d(String str) {
        Log.d("MicroMsg.SDK.MAutoStorage", getTableName() + ":" + str);
    }

    private void e(String str) {
        Log.e("MicroMsg.SDK.MAutoStorage", getTableName() + ":" + str);
    }

    public static List<String> getCreateSQLs(Field[] fieldArr, String str, String str2, String... strArr) {
        List linkedList = new LinkedList();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CREATE TABLE IF NOT EXISTS " + str + " ( ");
        Map identify = MAutoDBItem.identify(fieldArr, stringBuilder, str2);
        stringBuilder.append(");");
        linkedList.addFirst(stringBuilder.toString());
        if (strArr != null && strArr.length > 0) {
            for (String str3 : strArr) {
                if (str3 != null && str3.length() > 0) {
                    if (identify.get(str3) == null) {
                        Log.e("MicroMsg.SDK.MAutoStorage", "skipped invalid index: " + str3 + ", not found in fields");
                    }
                    linkedList.add("CREATE INDEX IF NOT EXISTS _mindex_" + str + "_" + str3 + "_ ON " + str + "(" + str3 + ");");
                }
            }
        }
        return linkedList;
    }

    public static List<String> getUpdateSQLs(Field[] fieldArr, String str, ISQLiteDatabase iSQLiteDatabase) {
        List<String> linkedList = new LinkedList();
        Map hashMap = new HashMap();
        Cursor rawQuery = iSQLiteDatabase.rawQuery("PRAGMA table_info( " + str + " )", null);
        while (rawQuery.moveToNext()) {
            hashMap.put(rawQuery.getString(rawQuery.getColumnIndex(User.FN_NAME)), rawQuery.getString(rawQuery.getColumnIndex("type")));
        }
        rawQuery.close();
        for (Entry entry : MAutoDBItem.identify(fieldArr, null, null).entrySet()) {
            String str2 = (String) entry.getValue();
            String str3 = (String) entry.getKey();
            if (((str2 == null ? 1 : 0) | (str2.length() <= 0 ? 1 : 0)) == 0) {
                String str4 = (String) hashMap.get(str3);
                if (str4 == null) {
                    linkedList.add("ALTER TABLE " + str + " ADD COLUMN " + str3 + " " + str2 + ";");
                    hashMap.remove(str3);
                } else if (!str4.equalsIgnoreCase(str2)) {
                    Log.e("MicroMsg.SDK.MAutoStorage", "conflicting alter table on column: " + str3 + ", " + str4 + "<o-n>" + str2);
                    hashMap.remove(str3);
                }
            }
        }
        return linkedList;
    }

    public boolean delete(long j) {
        boolean z = true;
        if (this.P.delete(getTableName(), "rowid = ?", new String[]{String.valueOf(j)}) <= 0) {
            z = false;
        }
        if (z) {
            notify();
        }
        return z;
    }

    public boolean delete(T t, String... strArr) {
        boolean z = false;
        ContentValues convertTo = t.convertTo();
        if (convertTo == null || convertTo.size() <= 0) {
            e("delete failed, value.size <= 0");
            return false;
        } else if (strArr == null || strArr.length <= 0) {
            d("delete with primary key");
            if (this.P.delete(getTableName(), this.bL + " = ?", new String[]{Util.nullAsNil(convertTo.getAsString(this.bL))}) > 0) {
                z = true;
            }
            if (!z) {
                return z;
            }
            doNotify();
            return z;
        } else {
            StringBuilder a = a(convertTo, strArr);
            if (a == null) {
                e("delete failed, check keys failed");
                return false;
            } else if (this.P.delete(getTableName(), a.toString(), a(strArr, convertTo)) > 0) {
                doNotify(this.bL);
                return true;
            } else {
                e("delete failed");
                return false;
            }
        }
    }

    public boolean get(long j, T t) {
        Cursor query = this.P.query(getTableName(), this.columns, "rowid = ?", new String[]{String.valueOf(j)}, null, null, null);
        if (query.moveToFirst()) {
            t.convertFrom(query);
            query.close();
            return true;
        }
        query.close();
        return false;
    }

    public boolean get(T t, String... strArr) {
        ContentValues convertTo = t.convertTo();
        if (convertTo == null || convertTo.size() <= 0) {
            e("get failed, value.size <= 0");
            return false;
        } else if (strArr == null || strArr.length <= 0) {
            d("get with primary key");
            r0 = this.P.query(getTableName(), this.columns, this.bL + " = ?", new String[]{Util.nullAsNil(convertTo.getAsString(this.bL))}, null, null, null);
            if (r0.moveToFirst()) {
                t.convertFrom(r0);
                r0.close();
                return true;
            }
            r0.close();
            return false;
        } else {
            StringBuilder a = a(convertTo, strArr);
            if (a == null) {
                e("get failed, check keys failed");
                return false;
            }
            r0 = this.P.query(getTableName(), this.columns, a.toString(), a(strArr, convertTo), null, null, null);
            if (r0.moveToFirst()) {
                t.convertFrom(r0);
                r0.close();
                return true;
            }
            r0.close();
            d("get failed, not found");
            return false;
        }
    }

    public Cursor getAll() {
        return this.P.query(getTableName(), this.columns, null, null, null, null, null);
    }

    public abstract String[] getColumns();

    public int getCount() {
        Cursor rawQuery = rawQuery("select count(*) from " + getTableName(), new String[0]);
        if (rawQuery == null) {
            return 0;
        }
        rawQuery.moveToFirst();
        int i = rawQuery.getInt(0);
        rawQuery.close();
        return i;
    }

    public abstract String getPrimaryKey();

    public abstract String getTableName();

    public boolean insert(T t) {
        ContentValues convertTo = t.convertTo();
        if (convertTo == null || convertTo.size() <= 0) {
            e("insert failed, value.size <= 0");
            return false;
        }
        t.systemRowid = this.P.insert(getTableName(), this.bL, t.convertTo());
        if (t.systemRowid <= 0) {
            e("insert failed");
            return false;
        }
        doNotify(this.bL);
        return true;
    }

    public Cursor rawQuery(String str, String... strArr) {
        return this.P.rawQuery(str, strArr);
    }

    public boolean replace(T t) {
        a.a("replace primaryKey == null", !Util.isNullOrNil(this.bL));
        ContentValues convertTo = t.convertTo();
        if (convertTo != null) {
            if (convertTo.size() == (convertTo.containsKey(MAutoDBItem.SYSTEM_ROWID_FIELD) ? 1 : 0) + t.fields().length) {
                if (a(convertTo)) {
                    d("no need replace , fields no change");
                    return true;
                } else if (this.P.replace(getTableName(), this.bL, convertTo) > 0) {
                    doNotify(this.bL);
                    return true;
                } else {
                    e("replace failed");
                    return false;
                }
            }
        }
        e("replace failed, cv.size() != item.fields().length");
        return false;
    }

    public boolean update(long j, T t) {
        ContentValues convertTo = t.convertTo();
        if (convertTo == null || convertTo.size() <= 0) {
            e("update failed, value.size <= 0");
            return false;
        }
        Cursor query = this.P.query(getTableName(), this.columns, "rowid = ?", new String[]{String.valueOf(j)}, null, null, null);
        if (MAutoDBItem.checkIOEqual(convertTo, query)) {
            query.close();
            d("no need replace , fields no change");
            return true;
        }
        query.close();
        boolean z = this.P.update(getTableName(), convertTo, "rowid = ?", new String[]{String.valueOf(j)}) > 0;
        if (!z) {
            return z;
        }
        doNotify();
        return z;
    }

    public boolean update(T t, String... strArr) {
        boolean z = false;
        ContentValues convertTo = t.convertTo();
        if (convertTo == null || convertTo.size() <= 0) {
            e("update failed, value.size <= 0");
            return false;
        } else if (strArr == null || strArr.length <= 0) {
            d("update with primary key");
            if (a(convertTo)) {
                d("no need replace , fields no change");
                return true;
            }
            if (this.P.update(getTableName(), convertTo, this.bL + " = ?", new String[]{Util.nullAsNil(convertTo.getAsString(this.bL))}) > 0) {
                z = true;
            }
            if (!z) {
                return z;
            }
            doNotify();
            return z;
        } else {
            StringBuilder a = a(convertTo, strArr);
            if (a == null) {
                e("update failed, check keys failed");
                return false;
            } else if (this.P.update(getTableName(), convertTo, a.toString(), a(strArr, convertTo)) > 0) {
                doNotify(this.bL);
                return true;
            } else {
                e("update failed");
                return false;
            }
        }
    }
}
