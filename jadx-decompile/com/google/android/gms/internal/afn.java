package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import com.google.android.gms.cast.internal.m;

public abstract class afn extends AsyncTask<Uri, Long, Bitmap> {
    private static final m a = new m("FetchBitmapTask");
    private final afo b;

    private class a extends com.google.android.gms.internal.afp.a {
        final /* synthetic */ afn a;

        private a(afn com_google_android_gms_internal_afn) {
            this.a = com_google_android_gms_internal_afn;
        }

        public int a() {
            return 9683208;
        }

        public void a(long j, long j2) {
            this.a.publishProgress(new Long[]{Long.valueOf(j), Long.valueOf(j2)});
        }
    }

    public afn(Context context) {
        this(context, 0, 0, false, 2097152, 5, 333, 10000);
    }

    public afn(Context context, int i, int i2, boolean z, long j, int i3, int i4, int i5) {
        this.b = afc.a(context.getApplicationContext(), this, new a(), i, i2, z, j, i3, i4, i5);
    }

    protected Bitmap a(Uri... uriArr) {
        Bitmap bitmap = null;
        if (uriArr.length == 1 && uriArr[0] != null) {
            try {
                bitmap = this.b.a(uriArr[0]);
            } catch (Throwable e) {
                a.a(e, "Unable to call %s on %s.", new Object[]{"doFetch", afo.class.getSimpleName()});
            }
        }
        return bitmap;
    }

    @TargetApi(11)
    public AsyncTask<Uri, Long, Bitmap> a(Uri uri) {
        if (VERSION.SDK_INT >= 11) {
            return executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Uri[]{uri});
        }
        return execute(new Uri[]{uri});
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a((Uri[]) objArr);
    }
}
