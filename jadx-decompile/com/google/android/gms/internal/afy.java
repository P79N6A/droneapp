package com.google.android.gms.internal;

import android.widget.TextView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.framework.media.a.a;
import com.google.android.gms.cast.framework.media.c;
import java.util.ArrayList;
import java.util.List;

public class afy extends a {
    private final TextView a;
    private final List<String> b = new ArrayList();

    public afy(TextView textView, List<String> list) {
        this.a = textView;
        this.b.addAll(list);
    }

    public void c() {
        c a = a();
        if (a != null && a.t()) {
            MediaQueueItem r = a.r();
            if (r != null) {
                MediaInfo b = r.b();
                if (b != null) {
                    MediaMetadata e = b.e();
                    if (e != null) {
                        for (String str : this.b) {
                            if (e.a(str)) {
                                this.a.setText(e.b(str));
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}
