package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.a;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Set;

class e {
    static a<?> a(MetadataBundle metadataBundle) {
        Set c = metadataBundle.c();
        if (c.size() == 1) {
            return (a) c.iterator().next();
        }
        throw new IllegalArgumentException("bundle should have exactly 1 populated field");
    }
}
