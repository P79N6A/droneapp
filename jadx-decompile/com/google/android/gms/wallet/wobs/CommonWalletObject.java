package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.b;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

@KeepName
public class CommonWalletObject extends AbstractSafeParcelable {
    public static final Creator<CommonWalletObject> CREATOR = new a();
    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    int i;
    ArrayList<WalletObjectMessage> j;
    TimeInterval k;
    ArrayList<LatLng> l;
    String m;
    String n;
    ArrayList<LabelValueRow> o;
    boolean p;
    ArrayList<UriData> q;
    ArrayList<TextModuleData> r;
    ArrayList<UriData> s;
    private final int t;

    public final class a {
        final /* synthetic */ CommonWalletObject a;

        private a(CommonWalletObject commonWalletObject) {
            this.a = commonWalletObject;
        }

        public a a(String str) {
            this.a.a = str;
            return this;
        }

        public CommonWalletObject a() {
            return this.a;
        }
    }

    CommonWalletObject() {
        this.t = 1;
        this.j = b.a();
        this.l = b.a();
        this.o = b.a();
        this.q = b.a();
        this.r = b.a();
        this.s = b.a();
    }

    CommonWalletObject(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, ArrayList<WalletObjectMessage> arrayList, TimeInterval timeInterval, ArrayList<LatLng> arrayList2, String str9, String str10, ArrayList<LabelValueRow> arrayList3, boolean z, ArrayList<UriData> arrayList4, ArrayList<TextModuleData> arrayList5, ArrayList<UriData> arrayList6) {
        this.t = i;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = i2;
        this.j = arrayList;
        this.k = timeInterval;
        this.l = arrayList2;
        this.m = str9;
        this.n = str10;
        this.o = arrayList3;
        this.p = z;
        this.q = arrayList4;
        this.r = arrayList5;
        this.s = arrayList6;
    }

    public static a a() {
        CommonWalletObject commonWalletObject = new CommonWalletObject();
        commonWalletObject.getClass();
        return new a();
    }

    public int b() {
        return this.t;
    }

    public String c() {
        return this.a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
