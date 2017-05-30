package com.google.android.gms.awareness.state;

import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl.TypeFilterImpl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public interface BeaconState {

    public interface a {
        String a();

        String b();

        byte[] c();
    }

    public static abstract class TypeFilter extends AbstractSafeParcelable {
        protected TypeFilter() {
        }

        public static TypeFilter a(String str, String str2) {
            return new TypeFilterImpl(str, str2);
        }

        public static TypeFilter a(String str, String str2, byte[] bArr) {
            return new TypeFilterImpl(str, str2, bArr);
        }
    }

    List<a> a();
}
