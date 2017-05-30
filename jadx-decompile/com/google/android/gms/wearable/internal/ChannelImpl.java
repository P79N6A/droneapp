package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ail;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ChannelImpl extends AbstractSafeParcelable implements Channel {
    public static final Creator<ChannelImpl> CREATOR = new bg();
    final int a;
    private final String b;
    private final String c;
    private final String d;

    class AnonymousClass7 implements a<com.google.android.gms.wearable.c.a> {
        final /* synthetic */ String a;
        final /* synthetic */ IntentFilter[] b;

        AnonymousClass7(String str, IntentFilter[] intentFilterArr) {
            this.a = str;
            this.b = intentFilterArr;
        }

        public void a(ar arVar, com.google.android.gms.internal.ahl.b<Status> bVar, com.google.android.gms.wearable.c.a aVar, ail<com.google.android.gms.wearable.c.a> com_google_android_gms_internal_ail_com_google_android_gms_wearable_c_a) {
            arVar.a((com.google.android.gms.internal.ahl.b) bVar, aVar, (ail) com_google_android_gms_internal_ail_com_google_android_gms_wearable_c_a, this.a, this.b);
        }
    }

    static final class a implements com.google.android.gms.wearable.Channel.a {
        private final Status a;
        private final InputStream b;

        a(Status status, InputStream inputStream) {
            this.a = (Status) d.a(status);
            this.b = inputStream;
        }

        public Status a() {
            return this.a;
        }

        public void b() {
            if (this.b != null) {
                try {
                    this.b.close();
                } catch (IOException e) {
                }
            }
        }

        public InputStream c() {
            return this.b;
        }
    }

    static final class b implements com.google.android.gms.wearable.Channel.b {
        private final Status a;
        private final OutputStream b;

        b(Status status, OutputStream outputStream) {
            this.a = (Status) d.a(status);
            this.b = outputStream;
        }

        public Status a() {
            return this.a;
        }

        public void b() {
            if (this.b != null) {
                try {
                    this.b.close();
                } catch (IOException e) {
                }
            }
        }

        public OutputStream c() {
            return this.b;
        }
    }

    ChannelImpl(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = (String) d.a(str);
        this.c = (String) d.a(str2);
        this.d = (String) d.a(str3);
    }

    private static a<com.google.android.gms.wearable.c.a> a(String str, IntentFilter[] intentFilterArr) {
        return new AnonymousClass7(str, intentFilterArr);
    }

    public i<Status> a(g gVar) {
        return gVar.a(new ba<Status>(this, gVar) {
            final /* synthetic */ ChannelImpl a;

            protected Status a(Status status) {
                return status;
            }

            protected void a(ar arVar) {
                arVar.c(this, this.a.b);
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<Status> a(g gVar, final int i) {
        return gVar.a(new ba<Status>(this, gVar) {
            final /* synthetic */ ChannelImpl b;

            protected Status a(Status status) {
                return status;
            }

            protected void a(ar arVar) {
                arVar.b((com.google.android.gms.internal.ahl.b) this, this.b.b, i);
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<Status> a(g gVar, Uri uri) {
        return a(gVar, uri, 0, -1);
    }

    public i<Status> a(g gVar, Uri uri, long j, long j2) {
        d.a(gVar, "client is null");
        d.a(this.b, "token is null");
        d.a(uri, "uri is null");
        d.b(j >= 0, "startOffset is negative: %s", new Object[]{Long.valueOf(j)});
        boolean z = j2 >= 0 || j2 == -1;
        d.b(z, "invalid length: %s", new Object[]{Long.valueOf(j2)});
        final Uri uri2 = uri;
        final long j3 = j;
        final long j4 = j2;
        return gVar.a(new ba<Status>(this, gVar) {
            final /* synthetic */ ChannelImpl d;

            public Status a(Status status) {
                return status;
            }

            protected void a(ar arVar) {
                arVar.a((com.google.android.gms.internal.ahl.b) this, this.d.b, uri2, j3, j4);
            }

            public /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<Status> a(g gVar, final Uri uri, final boolean z) {
        d.a(gVar, "client is null");
        d.a(uri, "uri is null");
        return gVar.a(new ba<Status>(this, gVar) {
            final /* synthetic */ ChannelImpl c;

            public Status a(Status status) {
                return status;
            }

            protected void a(ar arVar) {
                arVar.a((com.google.android.gms.internal.ahl.b) this, this.c.b, uri, z);
            }

            public /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<Status> a(g gVar, com.google.android.gms.wearable.c.a aVar) {
        return ab.a(gVar, a(this.b, new IntentFilter[]{ap.a(c.a)}), aVar);
    }

    public String a() {
        return this.c;
    }

    public i<com.google.android.gms.wearable.Channel.a> b(g gVar) {
        return gVar.a(new ba<com.google.android.gms.wearable.Channel.a>(this, gVar) {
            final /* synthetic */ ChannelImpl a;

            public com.google.android.gms.wearable.Channel.a a(Status status) {
                return new a(status, null);
            }

            protected void a(ar arVar) {
                arVar.d(this, this.a.b);
            }

            public /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<Status> b(g gVar, com.google.android.gms.wearable.c.a aVar) {
        d.a(gVar, "client is null");
        d.a(aVar, "listener is null");
        return gVar.a(new b(gVar, aVar, this.b));
    }

    public String b() {
        return this.d;
    }

    public i<com.google.android.gms.wearable.Channel.b> c(g gVar) {
        return gVar.a(new ba<com.google.android.gms.wearable.Channel.b>(this, gVar) {
            final /* synthetic */ ChannelImpl a;

            public com.google.android.gms.wearable.Channel.b a(Status status) {
                return new b(status, null);
            }

            protected void a(ar arVar) {
                arVar.e(this, this.a.b);
            }

            public /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChannelImpl)) {
            return false;
        }
        ChannelImpl channelImpl = (ChannelImpl) obj;
        return this.b.equals(channelImpl.b) && com.google.android.gms.common.internal.c.a(channelImpl.c, this.c) && com.google.android.gms.common.internal.c.a(channelImpl.d, this.d) && channelImpl.a == this.a;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        int i = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        return new StringBuilder(((String.valueOf(str).length() + 66) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append("ChannelImpl{versionCode=").append(i).append(", token='").append(str).append("'").append(", nodeId='").append(str2).append("'").append(", path='").append(str3).append("'").append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        bg.a(this, parcel, i);
    }
}
