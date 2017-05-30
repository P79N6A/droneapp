package com.google.android.gms.cast.framework.media;

import android.net.Uri;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.images.WebImage;

public class b {
    private b() {
    }

    public static String a(MediaInfo mediaInfo, int i) {
        Uri b = b(mediaInfo, i);
        return b == null ? null : b.toString();
    }

    public static Uri b(MediaInfo mediaInfo, int i) {
        if (mediaInfo == null) {
            return null;
        }
        MediaMetadata e = mediaInfo.e();
        return (e == null || e.f() == null || e.f().size() <= i) ? null : ((WebImage) e.f().get(i)).b();
    }
}
