package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.m;

public class s extends com.google.android.gms.location.places.internal.h.a {
    private final b a;
    private final a b;

    public static abstract class b<A extends f> extends com.google.android.gms.location.places.y.b<PlacePhotoMetadataResult, A> {
        public b(com.google.android.gms.common.api.a aVar, g gVar) {
            super(aVar, gVar);
        }

        protected PlacePhotoMetadataResult a(Status status) {
            return new PlacePhotoMetadataResult(status, null);
        }

        protected /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    public static abstract class a<A extends f> extends com.google.android.gms.location.places.y.b<PlacePhotoResult, A> {
        public a(com.google.android.gms.common.api.a aVar, g gVar) {
            super(aVar, gVar);
        }

        protected PlacePhotoResult a(Status status) {
            return new PlacePhotoResult(status, null);
        }

        protected /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    public s(a aVar) {
        this.a = null;
        this.b = aVar;
    }

    public s(b bVar) {
        this.a = bVar;
        this.b = null;
    }

    public void a(PlacePhotoMetadataResult placePhotoMetadataResult) {
        this.a.b(placePhotoMetadataResult);
    }

    public void a(PlacePhotoResult placePhotoResult) {
        this.b.b(placePhotoResult);
    }
}
