package com.google.android.gms.location.places;

import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.maps.model.LatLngBounds;

public interface c {
    i<e> a(g gVar, AddPlaceRequest addPlaceRequest);

    i<PlacePhotoMetadataResult> a(g gVar, String str);

    i<b> a(g gVar, String str, LatLngBounds latLngBounds, AutocompleteFilter autocompleteFilter);

    i<e> a(g gVar, String... strArr);
}
