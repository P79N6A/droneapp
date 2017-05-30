package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

public final class Cart extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<Cart> CREATOR = new g();
    String a;
    String b;
    ArrayList<LineItem> c;
    private final int d;

    public final class a {
        final /* synthetic */ Cart a;

        private a(Cart cart) {
            this.a = cart;
        }

        public a a(LineItem lineItem) {
            this.a.c.add(lineItem);
            return this;
        }

        public a a(String str) {
            this.a.a = str;
            return this;
        }

        public a a(List<LineItem> list) {
            this.a.c.clear();
            this.a.c.addAll(list);
            return this;
        }

        public Cart a() {
            return this.a;
        }

        public a b(String str) {
            this.a.b = str;
            return this;
        }
    }

    Cart() {
        this.d = 1;
        this.c = new ArrayList();
    }

    Cart(int i, String str, String str2, ArrayList<LineItem> arrayList) {
        this.d = i;
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public static a a() {
        Cart cart = new Cart();
        cart.getClass();
        return new a();
    }

    public int b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }

    public ArrayList<LineItem> e() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i);
    }
}
