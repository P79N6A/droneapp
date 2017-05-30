package com.google.android.gms.contextmanager.fence.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.awareness.fence.FenceState;
import com.google.android.gms.internal.sw;

public class FenceStateImpl extends FenceState {
    public static final Creator<FenceStateImpl> CREATOR = new i();
    private final int d;
    private final int e;
    private final long f;
    private final String g;
    private final int h;

    FenceStateImpl(int i, int i2, long j, String str, int i3) {
        this.d = i;
        this.e = i2;
        this.f = j;
        this.g = str;
        this.h = i3;
    }

    public FenceStateImpl(int i, long j, String str, int i2) {
        this(1, i, j, str, i2);
    }

    public static int a(int i, String str) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                sw.a(str, "Invalid fence evaluation state: " + i);
                return 0;
        }
    }

    public static FenceState b(Intent intent) {
        return new FenceStateImpl(a(intent.getIntExtra("context_fence_current_state", 0), "FenceState"), intent.getLongExtra("context_fence_last_updated_time", 0), intent.getStringExtra("context_fence_key"), a(intent.getIntExtra("context_fence_previous_state", 0), "FenceState"));
    }

    public int a() {
        return this.e;
    }

    public int b() {
        return this.h;
    }

    public long c() {
        return this.f;
    }

    public String d() {
        return this.g;
    }

    int e() {
        return this.d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.a(this, parcel, i);
    }
}
