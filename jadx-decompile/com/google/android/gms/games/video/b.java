package com.google.android.gms.games.video;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.a;

public final class b extends a<Video> {
    public b(DataHolder dataHolder) {
        super(dataHolder);
    }

    public /* synthetic */ Object a(int i) {
        return b(i);
    }

    public VideoRef b(int i) {
        return new VideoRef(this.a, i);
    }
}
