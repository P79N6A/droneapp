package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.ail;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.e;
import com.google.android.gms.wearable.h;
import com.google.android.gms.wearable.j;
import java.io.IOException;
import java.io.InputStream;

public final class bp implements e {

    class AnonymousClass8 implements a<com.google.android.gms.wearable.e.b> {
        final /* synthetic */ IntentFilter[] a;

        AnonymousClass8(IntentFilter[] intentFilterArr) {
            this.a = intentFilterArr;
        }

        public void a(ar arVar, com.google.android.gms.internal.ahl.b<Status> bVar, com.google.android.gms.wearable.e.b bVar2, ail<com.google.android.gms.wearable.e.b> com_google_android_gms_internal_ail_com_google_android_gms_wearable_e_b) {
            arVar.a((com.google.android.gms.internal.ahl.b) bVar, bVar2, (ail) com_google_android_gms_internal_ail_com_google_android_gms_wearable_e_b, this.a);
        }
    }

    public static class a implements com.google.android.gms.wearable.e.a {
        private final Status a;
        private final h b;

        public a(Status status, h hVar) {
            this.a = status;
            this.b = hVar;
        }

        public Status a() {
            return this.a;
        }

        public h b() {
            return this.b;
        }
    }

    public static class b implements com.google.android.gms.wearable.e.c {
        private final Status a;
        private final int b;

        public b(Status status, int i) {
            this.a = status;
            this.b = i;
        }

        public Status a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }
    }

    public static class c implements e.e {
        private final Status a;
        private volatile ParcelFileDescriptor b;
        private volatile InputStream c;
        private volatile boolean d = false;

        public c(Status status, ParcelFileDescriptor parcelFileDescriptor) {
            this.a = status;
            this.b = parcelFileDescriptor;
        }

        public Status a() {
            return this.a;
        }

        public void b() {
            if (this.b != null) {
                if (this.d) {
                    throw new IllegalStateException("releasing an already released result.");
                }
                try {
                    if (this.c != null) {
                        this.c.close();
                    } else {
                        this.b.close();
                    }
                    this.d = true;
                    this.b = null;
                    this.c = null;
                } catch (IOException e) {
                }
            }
        }

        public ParcelFileDescriptor c() {
            if (!this.d) {
                return this.b;
            }
            throw new IllegalStateException("Cannot access the file descriptor after release().");
        }

        public InputStream d() {
            if (this.d) {
                throw new IllegalStateException("Cannot access the input stream after release().");
            } else if (this.b == null) {
                return null;
            } else {
                if (this.c == null) {
                    this.c = new AutoCloseInputStream(this.b);
                }
                return this.c;
            }
        }
    }

    private i<Status> a(g gVar, com.google.android.gms.wearable.e.b bVar, IntentFilter[] intentFilterArr) {
        return ab.a(gVar, a(intentFilterArr), bVar);
    }

    private static a<com.google.android.gms.wearable.e.b> a(IntentFilter[] intentFilterArr) {
        return new AnonymousClass8(intentFilterArr);
    }

    private void a(Asset asset) {
        if (asset == null) {
            throw new IllegalArgumentException("asset is null");
        } else if (asset.b() == null) {
            throw new IllegalArgumentException("invalid asset");
        } else if (asset.a() != null) {
            throw new IllegalArgumentException("invalid asset");
        }
    }

    public i<j> a(g gVar) {
        return gVar.a(new ba<j>(this, gVar) {
            final /* synthetic */ bp a;

            protected j a(Status status) {
                return new j(DataHolder.b(status.i()));
            }

            protected void a(ar arVar) {
                arVar.a((com.google.android.gms.internal.ahl.b) this);
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<com.google.android.gms.wearable.e.a> a(g gVar, final Uri uri) {
        return gVar.a(new ba<com.google.android.gms.wearable.e.a>(this, gVar) {
            final /* synthetic */ bp b;

            protected com.google.android.gms.wearable.e.a a(Status status) {
                return new a(status, null);
            }

            protected void a(ar arVar) {
                arVar.a((com.google.android.gms.internal.ahl.b) this, uri);
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<j> a(g gVar, final Uri uri, final int i) {
        boolean z = false;
        d.b(uri != null, "uri must not be null");
        if (i == 0 || i == 1) {
            z = true;
        }
        d.b(z, "invalid filter type");
        return gVar.a(new ba<j>(this, gVar) {
            final /* synthetic */ bp c;

            protected j a(Status status) {
                return new j(DataHolder.b(status.i()));
            }

            protected void a(ar arVar) {
                arVar.a((com.google.android.gms.internal.ahl.b) this, uri, i);
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<e.e> a(g gVar, final Asset asset) {
        a(asset);
        return gVar.a(new ba<e.e>(this, gVar) {
            final /* synthetic */ bp b;

            protected e.e a(Status status) {
                return new c(status, null);
            }

            protected void a(ar arVar) {
                arVar.a((com.google.android.gms.internal.ahl.b) this, asset);
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<com.google.android.gms.wearable.e.a> a(g gVar, final PutDataRequest putDataRequest) {
        return gVar.a(new ba<com.google.android.gms.wearable.e.a>(this, gVar) {
            final /* synthetic */ bp b;

            public com.google.android.gms.wearable.e.a a(Status status) {
                return new a(status, null);
            }

            protected void a(ar arVar) {
                arVar.a((com.google.android.gms.internal.ahl.b) this, putDataRequest);
            }

            public /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<Status> a(g gVar, com.google.android.gms.wearable.e.b bVar) {
        return a(gVar, bVar, new IntentFilter[]{ap.a(e.a)});
    }

    public i<Status> a(g gVar, com.google.android.gms.wearable.e.b bVar, Uri uri, int i) {
        d.b(uri != null, "uri must not be null");
        boolean z = i == 0 || i == 1;
        d.b(z, "invalid filter type");
        return a(gVar, bVar, new IntentFilter[]{ap.a(e.a, uri, i)});
    }

    public i<e.e> a(g gVar, final com.google.android.gms.wearable.i iVar) {
        return gVar.a(new ba<e.e>(this, gVar) {
            final /* synthetic */ bp b;

            protected e.e a(Status status) {
                return new c(status, null);
            }

            protected void a(ar arVar) {
                arVar.a((com.google.android.gms.internal.ahl.b) this, iVar);
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<j> b(g gVar, Uri uri) {
        return a(gVar, uri, 0);
    }

    public i<com.google.android.gms.wearable.e.c> b(g gVar, final Uri uri, final int i) {
        boolean z = false;
        d.b(uri != null, "uri must not be null");
        if (i == 0 || i == 1) {
            z = true;
        }
        d.b(z, "invalid filter type");
        return gVar.a(new ba<com.google.android.gms.wearable.e.c>(this, gVar) {
            final /* synthetic */ bp c;

            protected com.google.android.gms.wearable.e.c a(Status status) {
                return new b(status, 0);
            }

            protected void a(ar arVar) {
                arVar.b((com.google.android.gms.internal.ahl.b) this, uri, i);
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<Status> b(g gVar, final com.google.android.gms.wearable.e.b bVar) {
        return gVar.a(new ba<Status>(this, gVar) {
            final /* synthetic */ bp b;

            public Status a(Status status) {
                return status;
            }

            protected void a(ar arVar) {
                arVar.a((com.google.android.gms.internal.ahl.b) this, bVar);
            }

            public /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<com.google.android.gms.wearable.e.c> c(g gVar, Uri uri) {
        return b(gVar, uri, 0);
    }
}
