package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.dm.a;
import org.json.JSONException;

public final class dk {
    public static final dj a = new dj() {
        public dm a(byte[] bArr) {
            if (bArr == null) {
                throw new de("Cannot parse a null byte[]");
            } else if (bArr.length == 0) {
                throw new de("Cannot parse a 0 length byte[]");
            } else {
                try {
                    dv a = dg.a(new String(bArr));
                    if (a != null) {
                        aph.d("The container was successfully parsed from the resource");
                    }
                    return new dm(Status.a, 0, new a(a), dk.b.a(bArr).c());
                } catch (JSONException e) {
                    throw new de("The resource data is corrupted. The container cannot be extracted from the JSON data");
                } catch (de e2) {
                    throw new de("The resource data is invalid. The container cannot be extracted from the JSON data");
                }
            }
        }
    };
    public static final dj b = new dj() {
        public dm a(byte[] bArr) {
            if (bArr == null) {
                throw new de("Cannot parse a null byte[]");
            } else if (bArr.length == 0) {
                throw new de("Cannot parse a 0 length byte[]");
            } else {
                try {
                    dy b = dg.b(new String(bArr));
                    if (b != null) {
                        aph.d("The runtime configuration was successfully parsed from the resource");
                    }
                    return new dm(Status.a, 0, null, b);
                } catch (JSONException e) {
                    throw new de("The resource data is corrupted. The runtime configuration cannot be extracted from the JSON data");
                } catch (de e2) {
                    throw new de("The resource data is invalid. The runtime  configuration cannot be extracted from the JSON data");
                }
            }
        }
    };
}
