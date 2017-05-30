package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.util.b;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;

public final class h {

    private interface a {
        void a(ArrayList<DataHolder> arrayList, int i);
    }

    class AnonymousClass1 implements a {
        final /* synthetic */ ArrayList a;

        AnonymousClass1(ArrayList arrayList) {
            this.a = arrayList;
        }

        public void a(ArrayList<DataHolder> arrayList, int i) {
            this.a.add(new AppContentActionRef(arrayList, i));
        }
    }

    class AnonymousClass2 implements a {
        final /* synthetic */ ArrayList a;

        AnonymousClass2(ArrayList arrayList) {
            this.a = arrayList;
        }

        public void a(ArrayList<DataHolder> arrayList, int i) {
            this.a.add(new AppContentAnnotationRef(arrayList, i));
        }
    }

    class AnonymousClass3 implements a {
        final /* synthetic */ ArrayList a;

        AnonymousClass3(ArrayList arrayList) {
            this.a = arrayList;
        }

        public void a(ArrayList<DataHolder> arrayList, int i) {
            this.a.add(new AppContentConditionRef(arrayList, i));
        }
    }

    class AnonymousClass4 implements a {
        final /* synthetic */ DataHolder a;
        final /* synthetic */ Bundle b;

        AnonymousClass4(DataHolder dataHolder, Bundle bundle) {
            this.a = dataHolder;
            this.b = bundle;
        }

        public void a(ArrayList<DataHolder> arrayList, int i) {
            AppContentTuple appContentTupleRef = new AppContentTupleRef(this.a, i);
            this.b.putString(appContentTupleRef.c(), appContentTupleRef.d());
        }
    }

    public static ArrayList<AppContentAction> a(DataHolder dataHolder, ArrayList<DataHolder> arrayList, String str, int i) {
        ArrayList<AppContentAction> arrayList2 = new ArrayList();
        DataHolder dataHolder2 = dataHolder;
        String str2 = str;
        a(dataHolder2, 1, str2, "action_id", i, new AnonymousClass1(arrayList2), arrayList);
        return arrayList2;
    }

    private static void a(DataHolder dataHolder, int i, String str, String str2, int i2, a aVar, ArrayList<DataHolder> arrayList) {
        DataHolder dataHolder2 = (DataHolder) arrayList.get(i);
        Object c = dataHolder.c(str, i2, dataHolder.a(i2));
        if (!TextUtils.isEmpty(c)) {
            int g = dataHolder2.g();
            String[] split = c.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            for (int i3 = 0; i3 < g; i3++) {
                CharSequence c2 = dataHolder2.c(str2, i3, dataHolder2.a(i3));
                if (!TextUtils.isEmpty(c2) && b.b(split, c2)) {
                    aVar.a(arrayList, i3);
                }
            }
        }
    }

    public static ArrayList<AppContentAnnotation> b(DataHolder dataHolder, ArrayList<DataHolder> arrayList, String str, int i) {
        ArrayList<AppContentAnnotation> arrayList2 = new ArrayList();
        DataHolder dataHolder2 = dataHolder;
        String str2 = str;
        a(dataHolder2, 2, str2, "annotation_id", i, new AnonymousClass2(arrayList2), arrayList);
        return arrayList2;
    }

    public static ArrayList<AppContentCondition> c(DataHolder dataHolder, ArrayList<DataHolder> arrayList, String str, int i) {
        ArrayList<AppContentCondition> arrayList2 = new ArrayList();
        DataHolder dataHolder2 = dataHolder;
        String str2 = str;
        a(dataHolder2, 4, str2, "condition_id", i, new AnonymousClass3(arrayList2), arrayList);
        return arrayList2;
    }

    public static Bundle d(DataHolder dataHolder, ArrayList<DataHolder> arrayList, String str, int i) {
        Bundle bundle = new Bundle();
        DataHolder dataHolder2 = dataHolder;
        String str2 = str;
        a(dataHolder2, 3, str2, "tuple_id", i, new AnonymousClass4((DataHolder) arrayList.get(3), bundle), arrayList);
        return bundle;
    }
}
