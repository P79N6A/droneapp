package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.common.data.DataHolder.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class k<T extends SafeParcelable> extends a<T> {
    private static final String[] b = new String[]{UriUtil.DATA_SCHEME};
    private final Creator<T> c;

    public k(DataHolder dataHolder, Creator<T> creator) {
        super(dataHolder);
        this.c = creator;
    }

    public static <T extends SafeParcelable> void a(a aVar, T t) {
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put(UriUtil.DATA_SCHEME, obtain.marshall());
        aVar.a(contentValues);
        obtain.recycle();
    }

    public static a h() {
        return DataHolder.a(b);
    }

    public /* synthetic */ Object a(int i) {
        return b(i);
    }

    public T b(int i) {
        byte[] f = this.a.f(UriUtil.DATA_SCHEME, i, this.a.a(i));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(f, 0, f.length);
        obtain.setDataPosition(0);
        SafeParcelable safeParcelable = (SafeParcelable) this.c.createFromParcel(obtain);
        obtain.recycle();
        return safeParcelable;
    }
}
