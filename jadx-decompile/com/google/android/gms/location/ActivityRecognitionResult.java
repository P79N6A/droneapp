package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.Collections;
import java.util.List;

public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final c CREATOR = new c();
    List<DetectedActivity> a;
    long b;
    long c;
    int d;
    Bundle e;
    private final int f;

    public ActivityRecognitionResult(int i, List<DetectedActivity> list, long j, long j2, int i2, Bundle bundle) {
        this.f = i;
        this.a = list;
        this.b = j;
        this.c = j2;
        this.d = i2;
        this.e = bundle;
    }

    public ActivityRecognitionResult(DetectedActivity detectedActivity, long j, long j2) {
        this(detectedActivity, j, j2, 0, null);
    }

    public ActivityRecognitionResult(DetectedActivity detectedActivity, long j, long j2, int i, Bundle bundle) {
        this(Collections.singletonList(detectedActivity), j, j2, i, bundle);
    }

    public ActivityRecognitionResult(List<DetectedActivity> list, long j, long j2) {
        this((List) list, j, j2, 0, null);
    }

    public ActivityRecognitionResult(List<DetectedActivity> list, long j, long j2, int i, Bundle bundle) {
        boolean z = true;
        boolean z2 = list != null && list.size() > 0;
        d.b(z2, "Must have at least 1 detected activity");
        if (j <= 0 || j2 <= 0) {
            z = false;
        }
        d.b(z, "Must set times");
        this.f = 2;
        this.a = list;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = bundle;
    }

    public static boolean a(Intent intent) {
        if (intent == null) {
            return false;
        }
        if (e(intent)) {
            return true;
        }
        List d = d(intent);
        return (d == null || d.isEmpty()) ? false : true;
    }

    private static boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return true;
        }
        if ((bundle == null && bundle2 != null) || (bundle != null && bundle2 == null)) {
            return false;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            if (bundle.get(str) == null) {
                if (bundle2.get(str) != null) {
                    return false;
                }
            } else if (bundle.get(str) instanceof Bundle) {
                if (!a(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else if (!bundle.get(str).equals(bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public static ActivityRecognitionResult b(Intent intent) {
        ActivityRecognitionResult f = f(intent);
        if (f != null) {
            return f;
        }
        List d = d(intent);
        return (d == null || d.isEmpty()) ? null : (ActivityRecognitionResult) d.get(d.size() - 1);
    }

    public static boolean c(Intent intent) {
        return intent == null ? false : intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST");
    }

    @Nullable
    public static List<ActivityRecognitionResult> d(Intent intent) {
        return !c(intent) ? null : c.b(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST", CREATOR);
    }

    private static boolean e(Intent intent) {
        return intent == null ? false : intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
    }

    private static ActivityRecognitionResult f(Intent intent) {
        if (!a(intent)) {
            return null;
        }
        Object obj = intent.getExtras().get("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
        return obj instanceof byte[] ? (ActivityRecognitionResult) c.a((byte[]) obj, CREATOR) : obj instanceof ActivityRecognitionResult ? (ActivityRecognitionResult) obj : null;
    }

    public int a(int i) {
        for (DetectedActivity detectedActivity : this.a) {
            if (detectedActivity.a() == i) {
                return detectedActivity.b();
            }
        }
        return 0;
    }

    public DetectedActivity a() {
        return (DetectedActivity) this.a.get(0);
    }

    public List<DetectedActivity> b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    public long d() {
        return this.c;
    }

    public int e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
        return this.b == activityRecognitionResult.b && this.c == activityRecognitionResult.c && this.d == activityRecognitionResult.d && com.google.android.gms.common.internal.c.a(this.a, activityRecognitionResult.a) && a(this.e, activityRecognitionResult.e);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.c.a(new Object[]{Long.valueOf(this.b), Long.valueOf(this.c), Integer.valueOf(this.d), this.a, this.e});
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        return new StringBuilder(String.valueOf(valueOf).length() + 124).append("ActivityRecognitionResult [probableActivities=").append(valueOf).append(", timeMillis=").append(j).append(", elapsedRealtimeMillis=").append(this.c).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
