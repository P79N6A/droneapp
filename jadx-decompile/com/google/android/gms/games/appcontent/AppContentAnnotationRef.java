package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

public final class AppContentAnnotationRef extends j implements AppContentAnnotation {
    AppContentAnnotationRef(ArrayList<DataHolder> arrayList, int i) {
        super(arrayList, 2, i);
    }

    public /* synthetic */ Object a() {
        return l();
    }

    public String c() {
        return e("annotation_description");
    }

    public String d() {
        return e("annotation_id");
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return e("annotation_image_default_id");
    }

    public boolean equals(Object obj) {
        return AppContentAnnotationEntity.a(this, obj);
    }

    public int f() {
        return c("annotation_image_height");
    }

    public Uri g() {
        return h("annotation_image_uri");
    }

    public Bundle h() {
        return h.d(this.c_, this.c, "annotation_modifiers", this.d_);
    }

    public int hashCode() {
        return AppContentAnnotationEntity.a(this);
    }

    public int i() {
        return c("annotation_image_width");
    }

    public String j() {
        return e("annotation_layout_slot");
    }

    public String k() {
        return e("annotation_title");
    }

    public AppContentAnnotation l() {
        return new AppContentAnnotationEntity(this);
    }

    public String toString() {
        return AppContentAnnotationEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((AppContentAnnotationEntity) ((AppContentAnnotation) a())).writeToParcel(parcel, i);
    }
}
