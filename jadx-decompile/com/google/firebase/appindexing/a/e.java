package com.google.firebase.appindexing.a;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import com.fimi.soul.entity.User;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.d;
import com.google.firebase.appindexing.g.b;
import com.google.firebase.appindexing.g.b.a;
import com.google.firebase.appindexing.internal.Thing;
import com.google.firebase.appindexing.internal.Thing.Metadata;
import com.google.firebase.appindexing.internal.g;
import java.util.Arrays;

public abstract class e<T extends e<?>> {
    final Bundle d = new Bundle();
    final String e;
    Metadata f;
    String g;

    protected e(@NonNull String str) {
        d.a(str);
        d.a(str);
        this.e = str;
    }

    private T a() {
        return this;
    }

    private T a(@NonNull String str, @NonNull Thing... thingArr) {
        d.a(str);
        d.a(thingArr);
        if (thingArr.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < thingArr.length; i2++) {
                thingArr[i] = thingArr[i2];
                if (thingArr[i2] == null) {
                    g.a("Thing at " + i2 + " is null and is ignored by put method.");
                } else {
                    i++;
                }
            }
            if (i > 0) {
                this.d.putParcelableArray(str, (Parcelable[]) a((Thing[]) Arrays.copyOfRange(thingArr, 0, i)));
            }
        } else {
            g.a("Thing array is empty and is ignored by put method.");
        }
        return a();
    }

    private static long[] a(long[] jArr) {
        if (jArr.length < 100) {
            return jArr;
        }
        g.a("Input Array of elements is too big, cutting off.");
        return Arrays.copyOf(jArr, 100);
    }

    private static <S> S[] a(S[] sArr) {
        if (sArr.length < 100) {
            return sArr;
        }
        g.a("Input Array of elements is too big, cutting off.");
        return Arrays.copyOf(sArr, 100);
    }

    private static boolean[] a(boolean[] zArr) {
        if (zArr.length < 100) {
            return zArr;
        }
        g.a("Input Array of elements is too big, cutting off.");
        return Arrays.copyOf(zArr, 100);
    }

    protected <S extends e> T a(@NonNull String str, @NonNull S... sArr) {
        d.a(str);
        d.a(sArr);
        if (sArr.length > 0) {
            Thing[] thingArr = new Thing[sArr.length];
            for (int i = 0; i < sArr.length; i++) {
                if (sArr[i] == null) {
                    g.a("Builder at " + i + " is null and is ignored by put method.");
                } else {
                    thingArr[i] = (Thing) sArr[i].build();
                }
            }
            if (thingArr.length > 0) {
                a(str, thingArr);
            }
        } else {
            g.a("Builder array is empty and is ignored by put method.");
        }
        return a();
    }

    @KeepName
    public final com.google.firebase.appindexing.g build() {
        return new Thing(new Bundle(this.d), this.f == null ? b.a : this.f, this.g, this.e);
    }

    @KeepName
    public T put(@NonNull String str, @NonNull long... jArr) {
        d.a(str);
        d.a(jArr);
        if (jArr.length > 0) {
            this.d.putLongArray(str, a(jArr));
        } else {
            g.a("Long array is empty and is ignored by put method.");
        }
        return a();
    }

    @KeepName
    public T put(@NonNull String str, @NonNull com.google.firebase.appindexing.g... gVarArr) {
        d.a(str);
        d.a(gVarArr);
        Thing[] thingArr = new Thing[gVarArr.length];
        int i = 0;
        while (i < gVarArr.length) {
            if (gVarArr[i] == null || (gVarArr[i] instanceof Thing)) {
                thingArr[i] = (Thing) gVarArr[i];
                i++;
            } else {
                throw new com.google.firebase.appindexing.d("Invalid Indexable encountered. Use Indexable.Builder or convenience methods under Indexables to create the Indexable.");
            }
        }
        a(str, thingArr);
        return a();
    }

    @KeepName
    public T put(@NonNull String str, @NonNull String... strArr) {
        d.a(str);
        d.a(strArr);
        if (strArr.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < Math.min(strArr.length, 100); i2++) {
                strArr[i] = strArr[i2];
                if (strArr[i2] == null) {
                    g.a("String at " + i2 + " is null and is ignored by put method.");
                } else {
                    if (strArr[i].length() > 20000) {
                        g.a("String at " + i2 + " is too long, truncating string.");
                        strArr[i] = strArr[i].substring(0, 20000);
                    }
                    i++;
                }
            }
            if (i > 0) {
                this.d.putStringArray(str, (String[]) a((String[]) Arrays.copyOfRange(strArr, 0, i)));
            }
        } else {
            g.a("String array is empty and is ignored by put method.");
        }
        return a();
    }

    @KeepName
    public T put(@NonNull String str, @NonNull boolean... zArr) {
        d.a(str);
        d.a(zArr);
        if (zArr.length > 0) {
            this.d.putBooleanArray(str, a(zArr));
        } else {
            g.a("Boolean array is empty and is ignored by put method.");
        }
        return a();
    }

    @KeepName
    public final T setDescription(@NonNull String str) {
        d.a(str);
        return put("description", str);
    }

    @KeepName
    public final T setImage(@NonNull String str) {
        d.a(str);
        return put("image", str);
    }

    @KeepName
    public T setMetadata(@NonNull a aVar) {
        d.a(this.f == null, "setMetadata may only be called once");
        d.a(aVar);
        this.f = aVar.a();
        return a();
    }

    @KeepName
    public final T setName(@NonNull String str) {
        d.a(str);
        return put(User.FN_NAME, str);
    }

    @KeepName
    public final T setSameAs(@NonNull String str) {
        d.a(str);
        return put("sameAs", str);
    }

    @KeepName
    public final T setUrl(@NonNull String str) {
        d.a(str);
        this.g = str;
        return a();
    }
}
