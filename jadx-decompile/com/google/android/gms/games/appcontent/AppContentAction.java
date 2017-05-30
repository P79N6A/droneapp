package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.f;
import java.util.List;

public interface AppContentAction extends Parcelable, f<AppContentAction> {
    AppContentAnnotation c();

    List<AppContentCondition> d();

    String e();

    Bundle f();

    String g();

    String h();

    String i();
}
