package com.google.android.gms.games.internal.a;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.c$a;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.f;
import com.google.android.gms.games.request.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class l implements g {

    private static abstract class d extends c$a<com.google.android.gms.games.request.g.d> {
        private d(com.google.android.gms.common.api.g gVar) {
            super(gVar);
        }

        public com.google.android.gms.games.request.g.d a(final Status status) {
            return new com.google.android.gms.games.request.g.d(this) {
                final /* synthetic */ d b;

                public int a(String str) {
                    String str2 = "Unknown request ID ";
                    String valueOf = String.valueOf(str);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }

                public Status a() {
                    return status;
                }

                public void b() {
                }

                public Set<String> c() {
                    return null;
                }
            };
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    private static abstract class b extends c$a<com.google.android.gms.games.request.g.b> {
        private b(com.google.android.gms.common.api.g gVar) {
            super(gVar);
        }

        public com.google.android.gms.games.request.g.b a(final Status status) {
            return new com.google.android.gms.games.request.g.b(this) {
                final /* synthetic */ b b;

                public Status a() {
                    return status;
                }

                public com.google.android.gms.games.request.a a(int i) {
                    return new com.google.android.gms.games.request.a(DataHolder.b(status.i()));
                }

                public void b() {
                }
            };
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    private static abstract class c extends c$a<com.google.android.gms.games.request.g.c> {
        public com.google.android.gms.games.request.g.c a(final Status status) {
            return new com.google.android.gms.games.request.g.c(this) {
                final /* synthetic */ c b;

                public Status a() {
                    return status;
                }
            };
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    class AnonymousClass4 extends c {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.a((com.google.android.gms.internal.ahl.b) this, null, null, 0, null, 0);
        }
    }

    class AnonymousClass5 extends c {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.a((com.google.android.gms.internal.ahl.b) this, null, null, 0, null, 0);
        }
    }

    class AnonymousClass6 extends d {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.a((com.google.android.gms.internal.ahl.b) this, null, null, null);
        }
    }

    class AnonymousClass7 extends b {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.a((com.google.android.gms.internal.ahl.b) this, null, null, 0, 0, 0);
        }
    }

    private static abstract class a extends c$a<com.google.android.gms.games.request.g.a> {
        public com.google.android.gms.games.request.g.a a(final Status status) {
            return new com.google.android.gms.games.request.g.a(this) {
                final /* synthetic */ a b;

                public Status a() {
                    return status;
                }

                public void b() {
                }
            };
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    class AnonymousClass8 extends a {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.g(this, null, 0);
        }
    }

    public Intent a(com.google.android.gms.common.api.g gVar, int i, byte[] bArr, int i2, Bitmap bitmap, String str) {
        return com.google.android.gms.games.c.a(gVar).a(i, bArr, i2, bitmap, str);
    }

    public i<com.google.android.gms.games.request.g.b> a(com.google.android.gms.common.api.g gVar, int i, int i2, int i3) {
        final int i4 = i;
        final int i5 = i2;
        final int i6 = i3;
        return gVar.a(new b(this, gVar) {
            final /* synthetic */ l d;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.a((com.google.android.gms.internal.ahl.b) this, i4, i5, i6);
            }
        });
    }

    public i<com.google.android.gms.games.request.g.d> a(com.google.android.gms.common.api.g gVar, String str) {
        List arrayList = new ArrayList();
        arrayList.add(str);
        return a(gVar, arrayList);
    }

    public i<com.google.android.gms.games.request.g.d> a(com.google.android.gms.common.api.g gVar, List<String> list) {
        final String[] strArr = list == null ? null : (String[]) list.toArray(new String[list.size()]);
        return gVar.b(new d(this, gVar) {
            final /* synthetic */ l b;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.b((com.google.android.gms.internal.ahl.b) this, strArr);
            }
        });
    }

    public ArrayList<GameRequest> a(Intent intent) {
        return intent == null ? new ArrayList() : a(intent.getExtras());
    }

    public ArrayList<GameRequest> a(Bundle bundle) {
        if (bundle == null || !bundle.containsKey(g.j)) {
            return new ArrayList();
        }
        ArrayList arrayList = (ArrayList) bundle.get(g.j);
        ArrayList<GameRequest> arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add((GameRequest) arrayList.get(i));
        }
        return arrayList2;
    }

    public void a(com.google.android.gms.common.api.g gVar) {
        com.google.android.gms.games.internal.d a = com.google.android.gms.games.c.a(gVar, false);
        if (a != null) {
            a.r();
        }
    }

    public void a(com.google.android.gms.common.api.g gVar, f fVar) {
        com.google.android.gms.games.internal.d a = com.google.android.gms.games.c.a(gVar, false);
        if (a != null) {
            a.d(gVar.a(fVar));
        }
    }

    public Intent b(com.google.android.gms.common.api.g gVar) {
        return com.google.android.gms.games.c.a(gVar).O();
    }

    public i<com.google.android.gms.games.request.g.d> b(com.google.android.gms.common.api.g gVar, String str) {
        List arrayList = new ArrayList();
        arrayList.add(str);
        return b(gVar, arrayList);
    }

    public i<com.google.android.gms.games.request.g.d> b(com.google.android.gms.common.api.g gVar, List<String> list) {
        final String[] strArr = list == null ? null : (String[]) list.toArray(new String[list.size()]);
        return gVar.b(new d(this, gVar) {
            final /* synthetic */ l b;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.c((com.google.android.gms.internal.ahl.b) this, strArr);
            }
        });
    }

    public int c(com.google.android.gms.common.api.g gVar) {
        return com.google.android.gms.games.c.a(gVar).P();
    }

    public int d(com.google.android.gms.common.api.g gVar) {
        return com.google.android.gms.games.c.a(gVar).Q();
    }
}
