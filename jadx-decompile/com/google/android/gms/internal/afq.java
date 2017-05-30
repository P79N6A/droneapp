package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Callback;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.media.session.PlaybackStateCompat.Builder;
import android.support.v7.media.MediaItemMetadata;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.google.android.gms.R;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.MediaNotificationService;
import com.google.android.gms.cast.framework.media.c;
import com.google.android.gms.cast.framework.media.c.a;
import com.google.android.gms.common.images.WebImage;

public class afq implements a {
    private final Context a;
    private final CastOptions b;
    private final afm c;
    private final ComponentName d;
    private c e;
    private CastDevice f;
    private MediaSessionCompat g;
    private Callback h;
    private afn i;
    private boolean j;

    public afq(Context context, CastOptions castOptions, afm com_google_android_gms_internal_afm) {
        this.a = context;
        this.b = castOptions;
        this.c = com_google_android_gms_internal_afm;
        if (this.b.g() == null || TextUtils.isEmpty(this.b.g().d())) {
            this.d = null;
        } else {
            this.d = new ComponentName(this.a, this.b.g().d());
        }
    }

    private Uri a(MediaMetadata mediaMetadata) {
        WebImage a = this.b.g().e() != null ? this.b.g().e().a(mediaMetadata, 0) : mediaMetadata.g() ? (WebImage) mediaMetadata.f().get(0) : null;
        return a == null ? null : a.b();
    }

    private void a(int i, MediaInfo mediaInfo) {
        if (i == 0) {
            this.g.setPlaybackState(new Builder().setState(0, 0, 1.0f).build());
            this.g.setMetadata(new MediaMetadataCompat.Builder().build());
            return;
        }
        this.g.setPlaybackState(new Builder().setState(i, 0, 1.0f).setActions(512).build());
        this.g.setSessionActivity(m());
        a(mediaInfo);
    }

    private void a(MediaInfo mediaInfo) {
        if (this.i != null) {
            this.i.cancel(true);
            this.i = null;
        }
        MediaMetadata e = mediaInfo.e();
        MediaMetadataCompat.Builder putLong = h().putString(MediaItemMetadata.KEY_TITLE, e.b(MediaMetadata.k)).putString("android.media.metadata.DISPLAY_TITLE", e.b(MediaMetadata.k)).putString("android.media.metadata.DISPLAY_SUBTITLE", e.b(MediaMetadata.l)).putLong(MediaItemMetadata.KEY_DURATION, mediaInfo.f());
        Uri a = a(e);
        if (a == null) {
            this.g.setMetadata(b(putLong, BitmapFactory.decodeResource(this.a.getResources(), VERSION.SDK_INT > 18 ? R.drawable.cast_album_art_placeholder_large : R.drawable.cast_album_art_placeholder)).build());
            return;
        }
        this.g.setMetadata(putLong.build());
        this.i = new afn(this, this.a) {
            final /* synthetic */ afq a;

            protected void a(Bitmap bitmap) {
                if (this.a.i == this) {
                    this.a.i = null;
                    if (bitmap != null) {
                        this.a.g.setMetadata(afq.b(this.a.h(), bitmap).build());
                    }
                }
            }

            protected /* synthetic */ void onPostExecute(Object obj) {
                a((Bitmap) obj);
            }
        };
        this.i.a(a);
    }

    private static MediaMetadataCompat.Builder b(MediaMetadataCompat.Builder builder, Bitmap bitmap) {
        builder.putBitmap("android.media.metadata.ALBUM_ART", bitmap);
        if (VERSION.SDK_INT < 21) {
            builder.putBitmap("android.media.metadata.DISPLAY_ICON", bitmap.copy(bitmap.getConfig(), true));
        }
        return builder;
    }

    private void g() {
        int i;
        MediaInfo mediaInfo;
        Object obj = 1;
        Object obj2 = null;
        MediaStatus g = this.e.g();
        MediaInfo f = g == null ? null : g.f();
        MediaMetadata e = f == null ? null : f.e();
        if (g != null && f != null && e != null) {
            switch (this.e.i()) {
                case 1:
                    int d = g.d();
                    Object obj3 = (this.e.k() && d == 2) ? 1 : null;
                    int m = g.m();
                    if (m == 0 || !(d == 1 || d == 3)) {
                        obj = null;
                    }
                    if (obj3 == null) {
                        if (obj == null) {
                            i = 0;
                            obj2 = obj;
                            mediaInfo = f;
                            break;
                        }
                        obj2 = obj;
                        mediaInfo = g.a(m).b();
                        i = 6;
                        break;
                    }
                    obj2 = obj;
                    i = 2;
                    mediaInfo = f;
                    break;
                    break;
                case 2:
                    i = 3;
                    mediaInfo = f;
                    break;
                case 3:
                    i = 2;
                    mediaInfo = f;
                    break;
                case 4:
                    i = 6;
                    mediaInfo = f;
                    break;
                default:
                    i = 0;
                    mediaInfo = f;
                    break;
            }
        }
        i = 0;
        mediaInfo = f;
        a(i, mediaInfo);
        if (i == 0) {
            j();
            l();
            return;
        }
        i();
        if (obj2 == null) {
            k();
        }
    }

    private MediaMetadataCompat.Builder h() {
        MediaMetadataCompat metadata = this.g.getController().getMetadata();
        return metadata == null ? new MediaMetadataCompat.Builder() : new MediaMetadataCompat.Builder(metadata);
    }

    private void i() {
        boolean z = true;
        if (this.b.g().c() != null && this.e != null) {
            Intent intent = new Intent(this.a, MediaNotificationService.class);
            intent.setPackage(this.a.getPackageName());
            intent.setAction(MediaNotificationService.a);
            intent.putExtra("extra_media_info", this.e.h());
            intent.putExtra("extra_remote_media_client_player_state", this.e.i());
            intent.putExtra("extra_cast_device", this.f);
            intent.putExtra("extra_media_session_token", f());
            MediaStatus g = this.e.g();
            if (g != null) {
                boolean z2;
                switch (g.o()) {
                    case 1:
                    case 2:
                    case 3:
                        z2 = true;
                        break;
                    default:
                        Integer e = g.e(g.l());
                        if (e == null) {
                            z2 = false;
                            z = false;
                            break;
                        }
                        z2 = e.intValue() > 0;
                        if (e.intValue() >= g.q() - 1) {
                            z = false;
                            break;
                        }
                        break;
                }
                intent.putExtra("extra_can_skip_next", z);
                intent.putExtra("extra_can_skip_prev", z2);
            }
            this.a.startService(intent);
        }
    }

    private void j() {
        if (this.b.g().c() != null) {
            Intent intent = new Intent(this.a, MediaNotificationService.class);
            intent.setPackage(this.a.getPackageName());
            intent.setAction(MediaNotificationService.a);
            this.a.stopService(intent);
        }
    }

    private void k() {
        if (this.b.h()) {
            Intent intent = new Intent(this.a, ReconnectionService.class);
            intent.setPackage(this.a.getPackageName());
            this.a.startService(intent);
        }
    }

    private void l() {
        if (this.b.h()) {
            Intent intent = new Intent(this.a, ReconnectionService.class);
            intent.setPackage(this.a.getPackageName());
            this.a.stopService(intent);
        }
    }

    private PendingIntent m() {
        if (this.d == null) {
            return null;
        }
        Intent intent = new Intent();
        intent.setComponent(this.d);
        return PendingIntent.getActivity(this.a, 0, intent, 134217728);
    }

    public void a() {
        g();
    }

    public void a(int i) {
        if (this.j) {
            this.j = false;
            if (this.e != null) {
                this.e.b(this);
            }
            ((AudioManager) this.a.getSystemService("audio")).abandonAudioFocus(null);
            this.c.a(null);
            if (this.i != null) {
                this.i.cancel(true);
                this.i = null;
            }
            if (this.g != null) {
                this.g.setSessionActivity(null);
                this.g.setCallback(null);
                this.g.setMetadata(new MediaMetadataCompat.Builder().build());
                a(0, null);
                this.g.setActive(false);
                this.g.release();
                this.g = null;
            }
            this.e = null;
            this.f = null;
            this.h = null;
            j();
            if (i == 0) {
                l();
            }
        }
    }

    public void a(c cVar, CastDevice castDevice) {
        if (!this.j && this.b != null && this.b.g() != null && cVar != null && castDevice != null) {
            this.e = cVar;
            this.e.a(this);
            this.f = castDevice;
            ((AudioManager) this.a.getSystemService("audio")).requestAudioFocus(null, 3, 3);
            ComponentName componentName = new ComponentName(this.a, this.b.g().b());
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            this.g = new MediaSessionCompat(this.a, "CastMediaSession", componentName, PendingIntent.getBroadcast(this.a, 0, intent, 0));
            this.g.setFlags(3);
            a(0, null);
            if (!(this.f == null || TextUtils.isEmpty(this.f.e()))) {
                this.g.setMetadata(new MediaMetadataCompat.Builder().putString(MediaItemMetadata.KEY_ALBUM_ARTIST, this.a.getResources().getString(R.string.cast_casting_to_device, new Object[]{this.f.e()})).build());
            }
            this.h = new Callback(this) {
                final /* synthetic */ afq a;

                {
                    this.a = r1;
                }

                public void a() {
                    this.a.e.s();
                }

                public boolean a(Intent intent) {
                    KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                    if (keyEvent != null && (keyEvent.getKeyCode() == 127 || keyEvent.getKeyCode() == 126)) {
                        this.a.e.s();
                    }
                    return true;
                }

                public void b() {
                    this.a.e.s();
                }
            };
            this.g.setCallback(this.h);
            this.g.setActive(true);
            this.c.a(this.g);
            this.j = true;
            g();
        }
    }

    public void b() {
        g();
    }

    public void c() {
        g();
    }

    public void d() {
        g();
    }

    public void e() {
    }

    public Token f() {
        return this.g == null ? null : this.g.getSessionToken();
    }
}
