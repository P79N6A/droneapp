package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.awareness.fence.FenceQueryRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FenceQueryRequestImpl extends FenceQueryRequest {
    public static final Creator<FenceQueryRequestImpl> CREATOR = new h();
    private final int a;
    private final QueryFenceOperation b;

    public static class QueryFenceOperation extends AbstractSafeParcelable {
        public static final Creator<QueryFenceOperation> CREATOR = new o();
        private final int a;
        private final int b;
        private final List<String> c;

        QueryFenceOperation(int i, int i2, List<String> list) {
            this.a = i;
            this.b = i2;
            this.c = list;
        }

        private QueryFenceOperation(int i, List<String> list) {
            this(1, i, list);
        }

        public static QueryFenceOperation a(int i, List<String> list) {
            return new QueryFenceOperation(i, list);
        }

        public int a() {
            return this.b;
        }

        public List<String> b() {
            return this.c;
        }

        int c() {
            return this.a;
        }

        public void writeToParcel(Parcel parcel, int i) {
            o.a(this, parcel, i);
        }
    }

    public FenceQueryRequestImpl() {
        this(1, QueryFenceOperation.a(1, null));
    }

    FenceQueryRequestImpl(int i, QueryFenceOperation queryFenceOperation) {
        this.a = i;
        this.b = queryFenceOperation;
    }

    public FenceQueryRequestImpl(Collection<String> collection) {
        this(1, QueryFenceOperation.a(2, new ArrayList(collection)));
    }

    public FenceQueryRequestImpl(String... strArr) {
        this(1, QueryFenceOperation.a(2, Arrays.asList(strArr)));
    }

    public int b() {
        return this.a;
    }

    public QueryFenceOperation c() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel, i);
    }
}
