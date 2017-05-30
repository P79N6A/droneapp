package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class i {
    private final int a;
    private final int b;
    private final List<f> c;
    private final Location d;

    private i(int i, int i2, List<f> list, Location location) {
        this.a = i;
        this.b = i2;
        this.c = list;
        this.d = location;
    }

    public static i a(Intent intent) {
        return intent == null ? null : new i(intent.getIntExtra("gms_error_code", -1), b(intent), c(intent), (Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location"));
    }

    private static int b(Intent intent) {
        int intExtra = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
        return intExtra == -1 ? -1 : (intExtra == 1 || intExtra == 2 || intExtra == 4) ? intExtra : -1;
    }

    private static List<f> c(Intent intent) {
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
        if (arrayList == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(ParcelableGeofence.a((byte[]) it.next()));
        }
        return arrayList2;
    }

    public boolean a() {
        return this.a != -1;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public List<f> d() {
        return this.c;
    }

    public Location e() {
        return this.d;
    }
}
