package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.f;
import java.util.List;

public interface AppContentCard extends Parcelable, f<AppContentCard> {
    List<AppContentAction> c();

    List<AppContentAnnotation> d();

    List<AppContentCondition> e();

    String f();

    int g();

    String h();

    Bundle i();

    String j();

    String k();

    String l();

    int m();

    String n();
}
