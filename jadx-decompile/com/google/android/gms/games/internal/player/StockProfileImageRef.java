package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.j;
import com.tencent.open.GameAppOperation;

public class StockProfileImageRef extends j implements StockProfileImage {
    public StockProfileImageRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public /* synthetic */ Object a() {
        return e();
    }

    public String c() {
        return e(GameAppOperation.QQFAV_DATALINE_IMAGEURL);
    }

    public Uri d() {
        return Uri.parse(e("image_uri"));
    }

    public int describeContents() {
        return 0;
    }

    public StockProfileImage e() {
        return new StockProfileImageEntity(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((StockProfileImageEntity) ((StockProfileImage) a())).writeToParcel(parcel, i);
    }
}
