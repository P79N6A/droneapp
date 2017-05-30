package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.fimi.soul.entity.User;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.j;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;

public final class AchievementRef extends j implements Achievement {
    AchievementRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public /* synthetic */ Object a() {
        return q();
    }

    public void a(CharArrayBuffer charArrayBuffer) {
        a(User.FN_NAME, charArrayBuffer);
    }

    public void b(CharArrayBuffer charArrayBuffer) {
        a("description", charArrayBuffer);
    }

    public String c() {
        return e("external_achievement_id");
    }

    public void c(CharArrayBuffer charArrayBuffer) {
        boolean z = true;
        if (d() != 1) {
            z = false;
        }
        n.a(z);
        a("formatted_total_steps", charArrayBuffer);
    }

    public int d() {
        return c("type");
    }

    public void d(CharArrayBuffer charArrayBuffer) {
        boolean z = true;
        if (d() != 1) {
            z = false;
        }
        n.a(z);
        a("formatted_current_steps", charArrayBuffer);
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return e(User.FN_NAME);
    }

    public String f() {
        return e("description");
    }

    public Uri g() {
        return h("unlocked_icon_image_uri");
    }

    public String getRevealedImageUrl() {
        return e("revealed_icon_image_url");
    }

    public String getUnlockedImageUrl() {
        return e("unlocked_icon_image_url");
    }

    public Uri h() {
        return h("revealed_icon_image_uri");
    }

    public int i() {
        boolean z = true;
        if (d() != 1) {
            z = false;
        }
        n.a(z);
        return c("total_steps");
    }

    public String j() {
        boolean z = true;
        if (d() != 1) {
            z = false;
        }
        n.a(z);
        return e("formatted_total_steps");
    }

    public Player k() {
        return new PlayerRef(this.c_, this.d_);
    }

    public int l() {
        return c(XiaomiOAuthConstants.EXTRA_STATE_2);
    }

    public int m() {
        boolean z = true;
        if (d() != 1) {
            z = false;
        }
        n.a(z);
        return c("current_steps");
    }

    public String n() {
        boolean z = true;
        if (d() != 1) {
            z = false;
        }
        n.a(z);
        return e("formatted_current_steps");
    }

    public long o() {
        return b("last_updated_timestamp");
    }

    public long p() {
        return (!d_("instance_xp_value") || i("instance_xp_value")) ? b("definition_xp_value") : b("instance_xp_value");
    }

    public Achievement q() {
        return new AchievementEntity(this);
    }

    public String toString() {
        return AchievementEntity.b((Achievement) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((AchievementEntity) ((Achievement) a())).writeToParcel(parcel, i);
    }
}
