package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;

@KeepName
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Creator<DataHolder> CREATOR = new l();
    private static final a k = new AnonymousClass1(new String[0], null);
    Bundle a;
    int[] b;
    int c;
    boolean d;
    private final int e;
    private final String[] f;
    private final CursorWindow[] g;
    private final int h;
    private final Bundle i;
    private boolean j;

    public static class a {
        private final String[] a;
        private final ArrayList<HashMap<String, Object>> b;
        private final String c;
        private final HashMap<Object, Integer> d;
        private boolean e;
        private String f;

        private a(String[] strArr, String str) {
            this.a = (String[]) d.a((Object) strArr);
            this.b = new ArrayList();
            this.c = str;
            this.d = new HashMap();
            this.e = false;
            this.f = null;
        }

        private int b(HashMap<String, Object> hashMap) {
            if (this.c == null) {
                return -1;
            }
            Object obj = hashMap.get(this.c);
            if (obj == null) {
                return -1;
            }
            Integer num = (Integer) this.d.get(obj);
            if (num != null) {
                return num.intValue();
            }
            this.d.put(obj, Integer.valueOf(this.b.size()));
            return -1;
        }

        public a a(ContentValues contentValues) {
            n.a((Object) contentValues);
            HashMap hashMap = new HashMap(contentValues.size());
            for (Entry entry : contentValues.valueSet()) {
                hashMap.put((String) entry.getKey(), entry.getValue());
            }
            return a(hashMap);
        }

        public a a(HashMap<String, Object> hashMap) {
            n.a((Object) hashMap);
            int b = b((HashMap) hashMap);
            if (b == -1) {
                this.b.add(hashMap);
            } else {
                this.b.remove(b);
                this.b.add(b, hashMap);
            }
            this.e = false;
            return this;
        }

        public DataHolder a(int i) {
            return new DataHolder(this, i, null);
        }
    }

    class AnonymousClass1 extends a {
        AnonymousClass1(String[] strArr, String str) {
            super(strArr, str);
        }

        public a a(ContentValues contentValues) {
            throw new UnsupportedOperationException("Cannot add data to empty builder");
        }

        public a a(HashMap<String, Object> hashMap) {
            throw new UnsupportedOperationException("Cannot add data to empty builder");
        }
    }

    public static class b extends RuntimeException {
        public b(String str) {
            super(str);
        }
    }

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.d = false;
        this.j = true;
        this.e = i;
        this.f = strArr;
        this.g = cursorWindowArr;
        this.h = i2;
        this.i = bundle;
    }

    private DataHolder(a aVar, int i, Bundle bundle) {
        this(aVar.a, a(aVar, -1), i, bundle);
    }

    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i, Bundle bundle) {
        this.d = false;
        this.j = true;
        this.e = 1;
        this.f = (String[]) d.a((Object) strArr);
        this.g = (CursorWindow[]) d.a((Object) cursorWindowArr);
        this.h = i;
        this.i = bundle;
        a();
    }

    public static a a(String[] strArr) {
        return new a(strArr, null);
    }

    public static DataHolder a(int i, Bundle bundle) {
        return new DataHolder(k, i, bundle);
    }

    private void a(String str, int i) {
        if (this.a == null || !this.a.containsKey(str)) {
            String str2 = "No such column: ";
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else if (h()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i < 0 || i >= this.c) {
            throw new CursorIndexOutOfBoundsException(i, this.c);
        }
    }

    private static CursorWindow[] a(a aVar, int i) {
        int i2 = 0;
        if (aVar.a.length == 0) {
            return new CursorWindow[0];
        }
        List b = (i < 0 || i >= aVar.b.size()) ? aVar.b : aVar.b.subList(0, i);
        int size = b.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cursorWindow);
        cursorWindow.setNumColumns(aVar.a.length);
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            try {
                int i5;
                int i6;
                CursorWindow cursorWindow2;
                if (!cursorWindow.allocRow()) {
                    Log.d("DataHolder", "Allocating additional cursor window for large data set (row " + i3 + ")");
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i3);
                    cursorWindow.setNumColumns(aVar.a.length);
                    arrayList.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList.remove(cursorWindow);
                        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
                    }
                }
                Map map = (Map) b.get(i3);
                boolean z = true;
                for (int i7 = 0; i7 < aVar.a.length && z; i7++) {
                    String str = aVar.a[i7];
                    Object obj = map.get(str);
                    if (obj == null) {
                        z = cursorWindow.putNull(i3, i7);
                    } else if (obj instanceof String) {
                        z = cursorWindow.putString((String) obj, i3, i7);
                    } else if (obj instanceof Long) {
                        z = cursorWindow.putLong(((Long) obj).longValue(), i3, i7);
                    } else if (obj instanceof Integer) {
                        z = cursorWindow.putLong((long) ((Integer) obj).intValue(), i3, i7);
                    } else if (obj instanceof Boolean) {
                        z = cursorWindow.putLong(((Boolean) obj).booleanValue() ? 1 : 0, i3, i7);
                    } else if (obj instanceof byte[]) {
                        z = cursorWindow.putBlob((byte[]) obj, i3, i7);
                    } else if (obj instanceof Double) {
                        z = cursorWindow.putDouble(((Double) obj).doubleValue(), i3, i7);
                    } else if (obj instanceof Float) {
                        z = cursorWindow.putDouble((double) ((Float) obj).floatValue(), i3, i7);
                    } else {
                        String valueOf = String.valueOf(obj);
                        throw new IllegalArgumentException(new StringBuilder((String.valueOf(str).length() + 32) + String.valueOf(valueOf).length()).append("Unsupported object for column ").append(str).append(": ").append(valueOf).toString());
                    }
                }
                if (z) {
                    i5 = i3;
                    i6 = 0;
                    cursorWindow2 = cursorWindow;
                } else if (i4 != 0) {
                    throw new b("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                } else {
                    Log.d("DataHolder", "Couldn't populate window data for row " + i3 + " - allocating new window.");
                    cursorWindow.freeLastRow();
                    CursorWindow cursorWindow3 = new CursorWindow(false);
                    cursorWindow3.setStartPosition(i3);
                    cursorWindow3.setNumColumns(aVar.a.length);
                    arrayList.add(cursorWindow3);
                    i5 = i3 - 1;
                    cursorWindow2 = cursorWindow3;
                    i6 = 1;
                }
                i4 = i6;
                cursorWindow = cursorWindow2;
                i3 = i5 + 1;
            } catch (RuntimeException e) {
                RuntimeException runtimeException = e;
                int size2 = arrayList.size();
                while (i2 < size2) {
                    ((CursorWindow) arrayList.get(i2)).close();
                    i2++;
                }
                throw runtimeException;
            }
        }
        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
    }

    public static DataHolder b(int i) {
        return a(i, null);
    }

    public int a(int i) {
        int i2 = 0;
        boolean z = i >= 0 && i < this.c;
        d.a(z);
        while (i2 < this.b.length) {
            if (i < this.b[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == this.b.length ? i2 - 1 : i2;
    }

    public long a(String str, int i, int i2) {
        a(str, i);
        return this.g[i2].getLong(i, this.a.getInt(str));
    }

    public void a() {
        int i;
        int i2 = 0;
        this.a = new Bundle();
        for (i = 0; i < this.f.length; i++) {
            this.a.putInt(this.f[i], i);
        }
        this.b = new int[this.g.length];
        i = 0;
        while (i2 < this.g.length) {
            this.b[i2] = i;
            i += this.g[i2].getNumRows() - (i - this.g[i2].getStartPosition());
            i2++;
        }
        this.c = i;
    }

    public void a(String str, int i, int i2, CharArrayBuffer charArrayBuffer) {
        a(str, i);
        this.g[i2].copyStringToBuffer(i, this.a.getInt(str), charArrayBuffer);
    }

    public boolean a(String str) {
        return this.a.containsKey(str);
    }

    int b() {
        return this.e;
    }

    public int b(String str, int i, int i2) {
        a(str, i);
        return this.g[i2].getInt(i, this.a.getInt(str));
    }

    public String c(String str, int i, int i2) {
        a(str, i);
        return this.g[i2].getString(i, this.a.getInt(str));
    }

    String[] c() {
        return this.f;
    }

    public void close() {
        synchronized (this) {
            if (!this.d) {
                this.d = true;
                for (CursorWindow close : this.g) {
                    close.close();
                }
            }
        }
    }

    public boolean d(String str, int i, int i2) {
        a(str, i);
        return Long.valueOf(this.g[i2].getLong(i, this.a.getInt(str))).longValue() == 1;
    }

    CursorWindow[] d() {
        return this.g;
    }

    public float e(String str, int i, int i2) {
        a(str, i);
        return this.g[i2].getFloat(i, this.a.getInt(str));
    }

    public int e() {
        return this.h;
    }

    public Bundle f() {
        return this.i;
    }

    public byte[] f(String str, int i, int i2) {
        a(str, i);
        return this.g[i2].getBlob(i, this.a.getInt(str));
    }

    protected void finalize() {
        try {
            if (this.j && this.g.length > 0 && !h()) {
                close();
                String valueOf = String.valueOf(toString());
                Log.e("DataBuffer", new StringBuilder(String.valueOf(valueOf).length() + Opcodes.GETSTATIC).append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ").append(valueOf).append(")").toString());
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    public int g() {
        return this.c;
    }

    public Uri g(String str, int i, int i2) {
        String c = c(str, i, i2);
        return c == null ? null : Uri.parse(c);
    }

    public boolean h() {
        boolean z;
        synchronized (this) {
            z = this.d;
        }
        return z;
    }

    public boolean h(String str, int i, int i2) {
        a(str, i);
        return this.g[i2].isNull(i, this.a.getInt(str));
    }

    public void writeToParcel(Parcel parcel, int i) {
        l.a(this, parcel, i);
    }
}
