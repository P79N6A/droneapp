package com.google.android.gms.internal;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.R;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.framework.d;
import com.google.android.gms.cast.framework.media.TracksChooserDialogFragment;
import com.google.android.gms.cast.framework.media.a.a;
import com.google.android.gms.cast.framework.media.c;
import java.lang.ref.WeakReference;
import java.util.List;

public class afs extends a {
    private final View a;
    private final WeakReference<Activity> b;
    private final String c;
    private final String d;
    private final OnClickListener e = new OnClickListener(this) {
        final /* synthetic */ afs a;

        {
            this.a = r1;
        }

        public void onClick(View view) {
            Activity activity = (Activity) this.a.b.get();
            if (activity != null) {
                c b = this.a.a();
                if (b != null && b.t() && (activity instanceof FragmentActivity)) {
                    FragmentActivity fragmentActivity = (FragmentActivity) activity;
                    FragmentTransaction beginTransaction = fragmentActivity.getSupportFragmentManager().beginTransaction();
                    Fragment findFragmentByTag = fragmentActivity.getSupportFragmentManager().findFragmentByTag("TRACKS_CHOOSER_DIALOG_TAG");
                    if (findFragmentByTag != null) {
                        beginTransaction.remove(findFragmentByTag);
                    }
                    beginTransaction.addToBackStack(null);
                    TracksChooserDialogFragment a = TracksChooserDialogFragment.a(b.h(), b.g().j());
                    if (a != null) {
                        a.show(beginTransaction, "TRACKS_CHOOSER_DIALOG_TAG");
                    }
                }
            }
        }
    };

    public afs(View view, Activity activity) {
        this.a = view;
        this.c = activity.getString(R.string.cast_closed_captions);
        this.d = activity.getString(R.string.cast_closed_captions_unavailable);
        this.b = new WeakReference(activity);
    }

    private boolean a(MediaInfo mediaInfo) {
        if (mediaInfo == null) {
            return false;
        }
        List<MediaTrack> g = mediaInfo.g();
        if (g == null || g.isEmpty()) {
            return false;
        }
        for (MediaTrack mediaTrack : g) {
            if (mediaTrack.c() != 2) {
                if (mediaTrack.c() == 1) {
                }
            }
            return true;
        }
        return false;
    }

    private void e() {
        c a = a();
        if (a == null || !a.t() || !a(a.h()) || a.u()) {
            this.a.setEnabled(false);
            this.a.setContentDescription(this.d);
            return;
        }
        this.a.setEnabled(true);
        this.a.setContentDescription(this.c);
    }

    public void a(d dVar) {
        super.a(dVar);
        this.a.setOnClickListener(this.e);
        e();
    }

    public void b() {
        this.a.setOnClickListener(null);
        super.b();
    }

    public void c() {
        e();
    }

    public void d() {
        this.a.setEnabled(false);
    }
}
