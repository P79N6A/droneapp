package com.google.android.gms.nearby.messages.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;

public class p {
    public static <T extends Parcelable> List<T> a(Intent intent, String str) {
        Bundle bundleExtra = intent.getBundleExtra(str);
        return bundleExtra == null ? Collections.emptyList() : bundleExtra.getParcelableArrayList(str);
    }
}
