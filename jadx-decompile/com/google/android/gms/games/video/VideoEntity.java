package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class VideoEntity extends AbstractSafeParcelable implements Video {
    public static final Creator<VideoEntity> CREATOR = new e();
    private final int a;
    private final int b;
    private final String c;
    private final long d;
    private final long e;
    private final String f;

    VideoEntity(int i, int i2, String str, long j, long j2, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = j;
        this.e = j2;
        this.f = str2;
    }

    public VideoEntity(Video video) {
        this.a = 1;
        this.b = video.c();
        this.c = video.d();
        this.d = video.e();
        this.e = video.f();
        this.f = video.g();
        n.a(this.c);
        n.a(this.f);
    }

    static int a(Video video) {
        return c.a(new Object[]{Integer.valueOf(video.c()), video.d(), Long.valueOf(video.e()), Long.valueOf(video.f()), video.g()});
    }

    static boolean a(Video video, Object obj) {
        if (!(obj instanceof Video)) {
            return false;
        }
        if (video == obj) {
            return true;
        }
        Video video2 = (Video) obj;
        return c.a(Integer.valueOf(video2.c()), Integer.valueOf(video.c())) && c.a(video2.d(), video.d()) && c.a(Long.valueOf(video2.e()), Long.valueOf(video.e())) && c.a(Long.valueOf(video2.f()), Long.valueOf(video.f())) && c.a(video2.g(), video.g());
    }

    static String b(Video video) {
        return c.a(video).a("Duration", Integer.valueOf(video.c())).a("File path", video.d()).a("File size", Long.valueOf(video.e())).a("Start time", Long.valueOf(video.f())).a("Package name", video.g()).toString();
    }

    public /* synthetic */ Object a() {
        return i();
    }

    public boolean b() {
        return true;
    }

    public int c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public long e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    public long f() {
        return this.e;
    }

    public String g() {
        return this.f;
    }

    public int h() {
        return this.a;
    }

    public int hashCode() {
        return a(this);
    }

    public Video i() {
        return this;
    }

    public String toString() {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        e.a(this, parcel, i);
    }
}
