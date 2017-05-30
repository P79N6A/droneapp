package com.google.android.gms.appinvite;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;

public interface b {
    i<d> a(@NonNull g gVar, Activity activity, boolean z);

    @Deprecated
    i<Status> a(@NonNull g gVar, String str);

    i<Status> b(@NonNull g gVar, String str);
}
