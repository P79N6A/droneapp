package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.p$a;
import com.google.android.gms.wearable.p$b;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.FutureTask;

final class aq {

    static abstract class b<T> extends a {
        private com.google.android.gms.internal.ahl.b<T> a;

        public b(com.google.android.gms.internal.ahl.b<T> bVar) {
            this.a = bVar;
        }

        public void a(T t) {
            com.google.android.gms.internal.ahl.b bVar = this.a;
            if (bVar != null) {
                bVar.a(t);
                this.a = null;
            }
        }
    }

    static final class a extends b<com.google.android.gms.wearable.a.a> {
        public a(com.google.android.gms.internal.ahl.b<com.google.android.gms.wearable.a.a> bVar) {
            super(bVar);
        }

        public void a(AddLocalCapabilityResponse addLocalCapabilityResponse) {
            a(new com.google.android.gms.wearable.internal.bb.a(am.a(addLocalCapabilityResponse.b)));
        }
    }

    static final class c extends b<Status> {
        public c(com.google.android.gms.internal.ahl.b<Status> bVar) {
            super(bVar);
        }

        public void a(CloseChannelResponse closeChannelResponse) {
            a(new Status(closeChannelResponse.b));
        }
    }

    static final class d extends b<Status> {
        public d(com.google.android.gms.internal.ahl.b<Status> bVar) {
            super(bVar);
        }

        public void b(CloseChannelResponse closeChannelResponse) {
            a(new Status(closeChannelResponse.b));
        }
    }

    static final class e extends b<com.google.android.gms.wearable.e.c> {
        public e(com.google.android.gms.internal.ahl.b<com.google.android.gms.wearable.e.c> bVar) {
            super(bVar);
        }

        public void a(DeleteDataItemsResponse deleteDataItemsResponse) {
            a(new com.google.android.gms.wearable.internal.bp.b(am.a(deleteDataItemsResponse.b), deleteDataItemsResponse.c));
        }
    }

    static final class f extends b<com.google.android.gms.wearable.a.d> {
        public f(com.google.android.gms.internal.ahl.b<com.google.android.gms.wearable.a.d> bVar) {
            super(bVar);
        }

        public void a(GetAllCapabilitiesResponse getAllCapabilitiesResponse) {
            a(new com.google.android.gms.wearable.internal.bb.d(am.a(getAllCapabilitiesResponse.b), aq.b(getAllCapabilitiesResponse.c)));
        }
    }

    static final class g extends b<com.google.android.gms.wearable.a.e> {
        public g(com.google.android.gms.internal.ahl.b<com.google.android.gms.wearable.a.e> bVar) {
            super(bVar);
        }

        public void a(GetCapabilityResponse getCapabilityResponse) {
            a(new com.google.android.gms.wearable.internal.bb.e(am.a(getCapabilityResponse.b), new com.google.android.gms.wearable.internal.bb.c(getCapabilityResponse.c)));
        }
    }

    static final class h extends b<com.google.android.gms.wearable.Channel.a> {
        private final bl a;

        public h(com.google.android.gms.internal.ahl.b<com.google.android.gms.wearable.Channel.a> bVar, bl blVar) {
            super(bVar);
            this.a = (bl) com.google.android.gms.common.internal.d.a(blVar);
        }

        public void a(GetChannelInputStreamResponse getChannelInputStreamResponse) {
            InputStream inputStream = null;
            if (getChannelInputStreamResponse.c != null) {
                inputStream = new bh(new AutoCloseInputStream(getChannelInputStreamResponse.c));
                this.a.a(inputStream.a());
            }
            a(new a(new Status(getChannelInputStreamResponse.b), inputStream));
        }
    }

    static final class i extends b<com.google.android.gms.wearable.Channel.b> {
        private final bl a;

        public i(com.google.android.gms.internal.ahl.b<com.google.android.gms.wearable.Channel.b> bVar, bl blVar) {
            super(bVar);
            this.a = (bl) com.google.android.gms.common.internal.d.a(blVar);
        }

        public void a(GetChannelOutputStreamResponse getChannelOutputStreamResponse) {
            OutputStream outputStream = null;
            if (getChannelOutputStreamResponse.c != null) {
                outputStream = new bi(new AutoCloseOutputStream(getChannelOutputStreamResponse.c));
                this.a.a(outputStream.a());
            }
            a(new b(new Status(getChannelOutputStreamResponse.b), outputStream));
        }
    }

    static final class j extends b<p$a> {
        public j(com.google.android.gms.internal.ahl.b<p$a> bVar) {
            super(bVar);
        }

        public void a(GetConnectedNodesResponse getConnectedNodesResponse) {
            List arrayList = new ArrayList();
            arrayList.addAll(getConnectedNodesResponse.c);
            a(new com.google.android.gms.wearable.internal.ad.a(am.a(getConnectedNodesResponse.b), arrayList));
        }
    }

    static final class k extends b<com.google.android.gms.wearable.e.a> {
        public k(com.google.android.gms.internal.ahl.b<com.google.android.gms.wearable.e.a> bVar) {
            super(bVar);
        }

        public void a(GetDataItemResponse getDataItemResponse) {
            a(new com.google.android.gms.wearable.internal.bp.a(am.a(getDataItemResponse.b), getDataItemResponse.c));
        }
    }

    static final class l extends b<com.google.android.gms.wearable.j> {
        public l(com.google.android.gms.internal.ahl.b<com.google.android.gms.wearable.j> bVar) {
            super(bVar);
        }

        public void a(DataHolder dataHolder) {
            a(new com.google.android.gms.wearable.j(dataHolder));
        }
    }

    static final class m extends b<com.google.android.gms.wearable.e.e> {
        public m(com.google.android.gms.internal.ahl.b<com.google.android.gms.wearable.e.e> bVar) {
            super(bVar);
        }

        public void a(GetFdForAssetResponse getFdForAssetResponse) {
            a(new com.google.android.gms.wearable.internal.bp.c(am.a(getFdForAssetResponse.b), getFdForAssetResponse.c));
        }
    }

    static final class n extends b<p$b> {
        public n(com.google.android.gms.internal.ahl.b<p$b> bVar) {
            super(bVar);
        }

        public void a(GetLocalNodeResponse getLocalNodeResponse) {
            a(new com.google.android.gms.wearable.internal.ad.b(am.a(getLocalNodeResponse.b), getLocalNodeResponse.c));
        }
    }

    static final class o extends a {
        o() {
        }

        public void a(Status status) {
        }
    }

    static final class p extends b<com.google.android.gms.wearable.c.c> {
        public p(com.google.android.gms.internal.ahl.b<com.google.android.gms.wearable.c.c> bVar) {
            super(bVar);
        }

        public void a(OpenChannelResponse openChannelResponse) {
            a(new a(am.a(openChannelResponse.b), openChannelResponse.c));
        }
    }

    static final class q extends b<com.google.android.gms.wearable.e.a> {
        private final List<FutureTask<Boolean>> a;

        q(com.google.android.gms.internal.ahl.b<com.google.android.gms.wearable.e.a> bVar, List<FutureTask<Boolean>> list) {
            super(bVar);
            this.a = list;
        }

        public void a(PutDataResponse putDataResponse) {
            a(new com.google.android.gms.wearable.internal.bp.a(am.a(putDataResponse.b), putDataResponse.c));
            if (putDataResponse.b != 0) {
                for (FutureTask cancel : this.a) {
                    cancel.cancel(true);
                }
            }
        }
    }

    static final class r extends b<Status> {
        public r(com.google.android.gms.internal.ahl.b<Status> bVar) {
            super(bVar);
        }

        public void a(ChannelSendFileResponse channelSendFileResponse) {
            a(new Status(channelSendFileResponse.b));
        }
    }

    static final class s extends b<com.google.android.gms.wearable.a.g> {
        public s(com.google.android.gms.internal.ahl.b<com.google.android.gms.wearable.a.g> bVar) {
            super(bVar);
        }

        public void a(RemoveLocalCapabilityResponse removeLocalCapabilityResponse) {
            a(new com.google.android.gms.wearable.internal.bb.a(am.a(removeLocalCapabilityResponse.b)));
        }
    }

    static final class t extends b<com.google.android.gms.wearable.m.c> {
        public t(com.google.android.gms.internal.ahl.b<com.google.android.gms.wearable.m.c> bVar) {
            super(bVar);
        }

        public void a(SendMessageResponse sendMessageResponse) {
            a(new com.google.android.gms.wearable.internal.aa.b(am.a(sendMessageResponse.b), sendMessageResponse.c));
        }
    }

    static final class u extends b<Status> {
        public u(com.google.android.gms.internal.ahl.b<Status> bVar) {
            super(bVar);
        }

        public void a(ChannelReceiveFileResponse channelReceiveFileResponse) {
            a(new Status(channelReceiveFileResponse.b));
        }
    }

    private static Map<String, com.google.android.gms.wearable.b> b(List<CapabilityInfoParcelable> list) {
        Map hashMap = new HashMap(list.size() * 2);
        for (CapabilityInfoParcelable capabilityInfoParcelable : list) {
            hashMap.put(capabilityInfoParcelable.a(), new com.google.android.gms.wearable.internal.bb.c(capabilityInfoParcelable));
        }
        return hashMap;
    }
}
