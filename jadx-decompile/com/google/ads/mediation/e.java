package com.google.ads.mediation;

import android.app.Activity;
import android.view.View;
import com.google.ads.b;

@Deprecated
public interface e<ADDITIONAL_PARAMETERS extends j, SERVER_PARAMETERS extends i> extends d<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    void a(f fVar, Activity activity, SERVER_PARAMETERS server_parameters, b bVar, c cVar, ADDITIONAL_PARAMETERS additional_parameters);

    View d();
}
