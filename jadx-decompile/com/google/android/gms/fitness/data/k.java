package com.google.android.gms.fitness.data;

import com.google.android.gms.internal.aki;

class k implements aki<DataType> {
    public static final k a = new k();

    private k() {
    }

    private Field d(DataType dataType, int i) {
        return (Field) dataType.b().get(i);
    }

    public /* synthetic */ int a(Object obj) {
        return b((DataType) obj);
    }

    public /* synthetic */ int a(Object obj, int i) {
        return c((DataType) obj, i);
    }

    public String a(DataType dataType) {
        return dataType.a();
    }

    public String a(DataType dataType, int i) {
        return d(dataType, i).a();
    }

    public boolean a(String str) {
        return p.a(str) != null;
    }

    public int b(DataType dataType) {
        return dataType.b().size();
    }

    public /* synthetic */ String b(Object obj) {
        return a((DataType) obj);
    }

    public boolean b(DataType dataType, int i) {
        return Boolean.TRUE.equals(d(dataType, i).c());
    }

    public /* synthetic */ boolean b(Object obj, int i) {
        return b((DataType) obj, i);
    }

    public int c(DataType dataType, int i) {
        return d(dataType, i).b();
    }

    public /* synthetic */ String c(Object obj, int i) {
        return a((DataType) obj, i);
    }
}
