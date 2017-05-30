package com.baidu.tts.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.baidu.tts.client.model.Conditions;
import com.baidu.tts.client.model.ModelBags;
import com.baidu.tts.client.model.ModelFileBags;
import com.baidu.tts.f.g;
import com.baidu.tts.tools.DataTool;
import com.baidu.tts.tools.SqlTool;
import com.baidu.tts.tools.StringTool;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class a {
    private com.baidu.tts.l.a a;
    private b b;
    private ReadWriteLock c = new ReentrantReadWriteLock();
    private Lock d = this.c.writeLock();
    private Lock e = this.c.readLock();

    public a(com.baidu.tts.l.a aVar) {
        this.a = aVar;
        this.b = new b(this.a.d());
    }

    private SQLiteDatabase a() {
        return this.b.getWritableDatabase();
    }

    private SQLiteDatabase b() {
        return this.b.getReadableDatabase();
    }

    public int a(String str) {
        int a;
        this.d.lock();
        SQLiteDatabase a2;
        try {
            a2 = a();
            a = SpeechModelTable.a(a2, str);
            a2.close();
            this.d.unlock();
        } catch (Exception e) {
            a = -1;
            a2.close();
            this.d.unlock();
        } catch (Throwable th) {
            this.d.unlock();
        }
        return a;
    }

    public String a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder("select b.absPath from speechModel a left join modelFile b on a.");
        stringBuilder.append(str);
        stringBuilder.append("=b.id where a.id=?");
        Map a = a(stringBuilder.toString(), new String[]{str2});
        return a != null ? (String) a.get(g.ABS_PATH.b()) : null;
    }

    public List<Map<String, String>> a(Conditions conditions) {
        String str = null;
        String[] strArr = null;
        if (!StringTool.isEmpty(conditions.getVersion())) {
            str = "version_min <= ? and version_max >= ?";
            strArr = new String[]{conditions.getVersion(), conditions.getVersion()};
        }
        String[] domainArray = conditions.getDomainArray();
        String[] languageArray = conditions.getLanguageArray();
        String[] qualityArray = conditions.getQualityArray();
        String[] genderArray = conditions.getGenderArray();
        String[] speakerArray = conditions.getSpeakerArray();
        String[] modelIdsArray = conditions.getModelIdsArray();
        String buildInCondition = SqlTool.buildInCondition("domain", domainArray);
        String buildInCondition2 = SqlTool.buildInCondition("language", languageArray);
        String buildInCondition3 = SqlTool.buildInCondition("quality", qualityArray);
        String buildInCondition4 = SqlTool.buildInCondition("gender", genderArray);
        String buildInCondition5 = SqlTool.buildInCondition("speaker", speakerArray);
        String buildInCondition6 = SqlTool.buildInCondition("id", modelIdsArray);
        str = SqlTool.buildConditions("and", str, buildInCondition, buildInCondition2, buildInCondition3, buildInCondition4, buildInCondition5, buildInCondition6);
        if (StringTool.isEmpty(str)) {
            return null;
        }
        return b("select * from speechModel where " + str, DataTool.connect(strArr, domainArray, languageArray, qualityArray, genderArray, speakerArray, modelIdsArray));
    }

    public List<Map<String, String>> a(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return null;
        }
        String[] fromSetToArray = DataTool.fromSetToArray(set);
        return b("select * from modelFile where " + SqlTool.buildInCondition("id", fromSetToArray), fromSetToArray);
    }

    public Map<String, String> a(String str, String[] strArr) {
        Map<String, String> map;
        Exception exception;
        this.e.lock();
        SQLiteDatabase b;
        try {
            b = b();
            try {
                Cursor rawQuery = b.rawQuery(str, strArr);
                if (rawQuery != null) {
                    Map<String, String> hashMap;
                    if (rawQuery.moveToFirst()) {
                        hashMap = new HashMap();
                        try {
                            String[] columnNames = rawQuery.getColumnNames();
                            int length = columnNames.length;
                            for (int i = 0; i < length; i++) {
                                hashMap.put(columnNames[i], rawQuery.getString(rawQuery.getColumnIndex(columnNames[i])));
                            }
                        } catch (Exception e) {
                            Exception exception2 = e;
                            map = hashMap;
                            exception = exception2;
                            exception.printStackTrace();
                            if (b != null) {
                                b.close();
                            }
                            this.e.unlock();
                            return map;
                        }
                    }
                    hashMap = null;
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    map = hashMap;
                } else {
                    map = null;
                }
                if (b != null) {
                    b.close();
                }
            } catch (Exception e2) {
                exception = e2;
                map = null;
                exception.printStackTrace();
                if (b != null) {
                    b.close();
                }
                this.e.unlock();
                return map;
            }
            this.e.unlock();
            return map;
        } catch (Throwable th) {
            this.e.unlock();
        }
    }

    public void a(ModelBags modelBags) {
        this.d.lock();
        try {
            SpeechModelTable.a(a(), modelBags);
        } finally {
            this.d.unlock();
        }
    }

    public void a(ModelFileBags modelFileBags) {
        this.d.lock();
        try {
            ModelFileTable.a(a(), modelFileBags);
        } finally {
            this.d.unlock();
        }
    }

    public void a(String str, int i) {
        this.d.lock();
        SQLiteDatabase a;
        try {
            String str2 = "replace into fsFileInfo (absPath,state) values (?, ?)";
            String valueOf = String.valueOf(i);
            String[] strArr = new String[]{str, valueOf};
            a = a();
            a.execSQL(str2, strArr);
            a.close();
            this.d.unlock();
        } catch (Throwable th) {
            this.d.unlock();
        }
    }

    public int b(String str) {
        SQLiteDatabase a;
        int a2;
        this.d.lock();
        try {
            a = a();
            a2 = ModelFileTable.a(a, str);
            a.close();
            this.d.unlock();
        } catch (Exception e) {
            a2 = -1;
            a.close();
            this.d.unlock();
        } catch (Throwable th) {
            this.d.unlock();
        }
        return a2;
    }

    public java.util.List<java.util.Map<java.lang.String, java.lang.String>> b(java.lang.String r10, java.lang.String[] r11) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.baidu.tts.database.a.b(java.lang.String, java.lang.String[]):java.util.List<java.util.Map<java.lang.String, java.lang.String>>. bs: [B:17:0x004a, B:23:0x0056]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
        /*
        r9 = this;
        r2 = 0;
        r0 = r9.e;
        r0.lock();
        r0 = new java.util.ArrayList;	 Catch:{ Exception -> 0x0053 }
        r0.<init>();	 Catch:{ Exception -> 0x0053 }
        r2 = r9.b();	 Catch:{ Exception -> 0x006d }
        r3 = r2.rawQuery(r10, r11);	 Catch:{ Exception -> 0x006d }
        if (r3 == 0) goto L_0x0048;	 Catch:{ Exception -> 0x006d }
    L_0x0015:
        r1 = r3.moveToFirst();	 Catch:{ Exception -> 0x006d }
        if (r1 == 0) goto L_0x0043;	 Catch:{ Exception -> 0x006d }
    L_0x001b:
        r4 = r3.getColumnNames();	 Catch:{ Exception -> 0x006d }
    L_0x001f:
        r5 = new java.util.HashMap;	 Catch:{ Exception -> 0x006d }
        r5.<init>();	 Catch:{ Exception -> 0x006d }
        r6 = r4.length;	 Catch:{ Exception -> 0x006d }
        r1 = 0;	 Catch:{ Exception -> 0x006d }
    L_0x0026:
        if (r1 >= r6) goto L_0x003a;	 Catch:{ Exception -> 0x006d }
    L_0x0028:
        r7 = r4[r1];	 Catch:{ Exception -> 0x006d }
        r8 = r4[r1];	 Catch:{ Exception -> 0x006d }
        r8 = r3.getColumnIndex(r8);	 Catch:{ Exception -> 0x006d }
        r8 = r3.getString(r8);	 Catch:{ Exception -> 0x006d }
        r5.put(r7, r8);	 Catch:{ Exception -> 0x006d }
        r1 = r1 + 1;	 Catch:{ Exception -> 0x006d }
        goto L_0x0026;	 Catch:{ Exception -> 0x006d }
    L_0x003a:
        r0.add(r5);	 Catch:{ Exception -> 0x006d }
        r1 = r3.moveToNext();	 Catch:{ Exception -> 0x006d }
        if (r1 != 0) goto L_0x001f;	 Catch:{ Exception -> 0x006d }
    L_0x0043:
        if (r3 == 0) goto L_0x0048;	 Catch:{ Exception -> 0x006d }
    L_0x0045:
        r3.close();	 Catch:{ Exception -> 0x006d }
    L_0x0048:
        if (r2 == 0) goto L_0x004d;
    L_0x004a:
        r2.close();	 Catch:{ all -> 0x005f }
    L_0x004d:
        r1 = r9.e;
        r1.unlock();
        return r0;
    L_0x0053:
        r0 = move-exception;
        r1 = r0;
        r0 = r2;
    L_0x0056:
        r1.printStackTrace();	 Catch:{ all -> 0x0066 }
        if (r2 == 0) goto L_0x004d;
    L_0x005b:
        r2.close();	 Catch:{ all -> 0x005f }
        goto L_0x004d;
    L_0x005f:
        r0 = move-exception;
        r1 = r9.e;
        r1.unlock();
        throw r0;
    L_0x0066:
        r0 = move-exception;
        if (r2 == 0) goto L_0x006c;
    L_0x0069:
        r2.close();	 Catch:{ all -> 0x005f }
    L_0x006c:
        throw r0;	 Catch:{ all -> 0x005f }
    L_0x006d:
        r1 = move-exception;
        goto L_0x0056;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.tts.database.a.b(java.lang.String, java.lang.String[]):java.util.List<java.util.Map<java.lang.String, java.lang.String>>");
    }

    public Map<String, String> c(String str) {
        return a("select * from fsFileInfo where absPath=?", new String[]{str});
    }

    public Map<String, String> d(String str) {
        return a("select * from modelFile where id=?", new String[]{str});
    }

    public Map<String, String> e(String str) {
        return a("select * from speechModel where id=?", new String[]{str});
    }
}
