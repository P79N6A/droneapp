package com.google.android.gms.games.video;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.j;

public final class VideoRef extends j implements Video {
    VideoRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public /* synthetic */ Object a() {
        return h();
    }

    public int c() {
        return c("duration");
    }

    public String d() {
        return e("filepath");
    }

    public int describeContents() {
        return 0;
    }

    public long e() {
        return b("filesize");
    }

    public long f() {
        return b("start_time");
    }

    public String g() {
        return e("package");
    }

    public Video h() {
        return new VideoEntity(this);
    }

    public String toString() {
        return VideoEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((VideoEntity) ((Video) a())).writeToParcel(parcel, i);
    }
}
