package com.google.android.gms.identity.intents;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class UserAddressRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<UserAddressRequest> CREATOR = new c();
    List<CountrySpecification> a;
    private final int b;

    public final class a {
        final /* synthetic */ UserAddressRequest a;

        private a(UserAddressRequest userAddressRequest) {
            this.a = userAddressRequest;
        }

        public a a(CountrySpecification countrySpecification) {
            if (this.a.a == null) {
                this.a.a = new ArrayList();
            }
            this.a.a.add(countrySpecification);
            return this;
        }

        public a a(Collection<CountrySpecification> collection) {
            if (this.a.a == null) {
                this.a.a = new ArrayList();
            }
            this.a.a.addAll(collection);
            return this;
        }

        public UserAddressRequest a() {
            if (this.a.a != null) {
                this.a.a = Collections.unmodifiableList(this.a.a);
            }
            return this.a;
        }
    }

    UserAddressRequest() {
        this.b = 1;
    }

    UserAddressRequest(int i, List<CountrySpecification> list) {
        this.b = i;
        this.a = list;
    }

    public static a a() {
        UserAddressRequest userAddressRequest = new UserAddressRequest();
        userAddressRequest.getClass();
        return new a();
    }

    public int b() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
