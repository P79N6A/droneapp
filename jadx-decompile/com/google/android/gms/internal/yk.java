package com.google.android.gms.internal;

import android.app.AlertDialog.Builder;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.R;
import com.google.android.gms.ads.internal.u;
import java.util.Map;
import org.a.a.e;

@aaa
public class yk extends yn {
    private final Map<String, String> a;
    private final Context b;

    public yk(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        super(com_google_android_gms_internal_acy, "storePicture");
        this.a = map;
        this.b = com_google_android_gms_internal_acy.f();
    }

    Request a(String str, String str2) {
        Request request = new Request(Uri.parse(str));
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
        u.g().a(request);
        return request;
    }

    String a(String str) {
        return Uri.parse(str).getLastPathSegment();
    }

    public void a() {
        if (this.b == null) {
            b("Activity context is not available");
        } else if (u.e().e(this.b).c()) {
            String str = (String) this.a.get("iurl");
            if (TextUtils.isEmpty(str)) {
                b("Image url cannot be empty.");
            } else if (URLUtil.isValidUrl(str)) {
                String a = a(str);
                if (u.e().c(a)) {
                    Resources q = u.i().q();
                    Builder d = u.e().d(this.b);
                    d.setTitle(q != null ? q.getString(R.string.store_picture_title) : "Save image");
                    d.setMessage(q != null ? q.getString(R.string.store_picture_message) : "Allow Ad to store image in Picture gallery?");
                    d.setPositiveButton(q != null ? q.getString(R.string.accept) : e.a, new 1(this, str, a));
                    d.setNegativeButton(q != null ? q.getString(R.string.decline) : "Decline", new 2(this));
                    d.create().show();
                    return;
                }
                r1 = "Image type not recognized: ";
                str = String.valueOf(a);
                b(str.length() != 0 ? r1.concat(str) : new String(r1));
            } else {
                r1 = "Invalid image url: ";
                str = String.valueOf(str);
                b(str.length() != 0 ? r1.concat(str) : new String(r1));
            }
        } else {
            b("Feature is not supported by the device.");
        }
    }
}
