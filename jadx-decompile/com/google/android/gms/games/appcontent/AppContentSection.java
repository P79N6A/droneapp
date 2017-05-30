package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.f;
import java.util.List;

public interface AppContentSection extends Parcelable, f<AppContentSection> {
    List<AppContentAction> c();

    List<AppContentAnnotation> d();

    List<AppContentCard> e();

    String f();

    String g();

    Bundle h();

    String i();

    String j();

    String k();

    String l();
}
