package com.google.android.gms.games.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.c$a;
import com.google.android.gms.games.c$c;
import com.google.android.gms.games.c$g;
import com.google.android.gms.games.internal.player.ProfileSettingsEntity;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.n$b;
import com.google.android.gms.games.n$c;
import com.google.android.gms.games.n$d;
import com.google.android.gms.games.n$f;
import com.google.android.gms.games.n$g;
import com.google.android.gms.games.quest.Milestone;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestEntity;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotContentsEntity;
import com.google.android.gms.games.snapshot.SnapshotEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import com.google.android.gms.games.social.SocialInvite;
import com.google.android.gms.games.social.SocialInviteEntity;
import com.google.android.gms.games.stats.PlayerStats;
import com.google.android.gms.games.stats.PlayerStatsEntity;
import com.google.android.gms.games.video.VideoCapabilities;
import com.google.android.gms.games.video.VideoConfiguration;
import com.google.android.gms.internal.ahs;
import com.google.android.gms.internal.aht;
import com.google.android.gms.internal.ail;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public final class d extends com.google.android.gms.common.internal.w<k> {
    com.google.android.gms.games.internal.d.c a = new com.google.android.gms.games.internal.d.c(this) {
        final /* synthetic */ d a;

        {
            this.a = r1;
        }

        public com.google.android.gms.games.internal.d.a a() {
            return new ap(this.a);
        }
    };
    private final String e;
    private PlayerEntity f;
    private GameEntity g;
    private final n h;
    private boolean i = false;
    private final Binder j;
    private final long k;
    private final c$c l;

    private static abstract class c extends ahs<com.google.android.gms.games.multiplayer.realtime.g> {
        c(DataHolder dataHolder) {
            super(dataHolder);
        }

        protected void a(com.google.android.gms.games.multiplayer.realtime.g gVar, DataHolder dataHolder) {
            a(gVar, d.b(dataHolder));
        }

        protected abstract void a(com.google.android.gms.games.multiplayer.realtime.g gVar, Room room);
    }

    private static abstract class a extends c {
        private final ArrayList<String> a = new ArrayList();

        a(DataHolder dataHolder, String[] strArr) {
            super(dataHolder);
            for (Object add : strArr) {
                this.a.add(add);
            }
        }

        protected void a(com.google.android.gms.games.multiplayer.realtime.g gVar, Room room) {
            a(gVar, room, this.a);
        }

        protected abstract void a(com.google.android.gms.games.multiplayer.realtime.g gVar, Room room, ArrayList<String> arrayList);
    }

    private static final class aa implements com.google.android.gms.common.api.m {
        public Status a() {
            return null;
        }
    }

    private static final class ab extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.video.f.h> a;

        ab(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.video.f.h> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void a(int i, String str, String str2) {
            this.a.a(new ac(new Status(i), str, str2));
        }
    }

    private static final class ac implements com.google.android.gms.games.video.f.h {
        private final Status a;
        private final String b;
        private final String c;

        ac(Status status, String str, String str2) {
            this.a = status;
            this.b = str;
            this.c = str2;
        }

        public Status a() {
            return this.a;
        }
    }

    private static final class ad extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.video.f.i> a;

        ad(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.video.f.i> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void f(int i, String str) {
            this.a.a(new ae(new Status(i), str));
        }
    }

    private static final class ae implements com.google.android.gms.games.video.f.i {
        private final Status a;
        private final String b;

        ae(Status status, String str) {
            this.a = status;
            this.b = str;
        }

        public Status a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    private static abstract class ax extends aht {
        protected ax(DataHolder dataHolder) {
            super(dataHolder, com.google.android.gms.games.f.a(dataHolder.e()));
        }
    }

    private static final class af extends ax implements com.google.android.gms.games.quest.f.b {
        private final Milestone a;
        private final Quest d;

        af(DataHolder dataHolder, String str) {
            super(dataHolder);
            com.google.android.gms.games.quest.c cVar = new com.google.android.gms.games.quest.c(dataHolder);
            try {
                if (cVar.c() > 0) {
                    this.d = new QuestEntity((Quest) cVar.a(0));
                    List i = this.d.i();
                    int size = i.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (((Milestone) i.get(i2)).c().equals(str)) {
                            this.a = (Milestone) i.get(i2);
                            return;
                        }
                    }
                    this.a = null;
                } else {
                    this.a = null;
                    this.d = null;
                }
                cVar.b();
            } finally {
                cVar.b();
            }
        }

        public Milestone c() {
            return this.a;
        }

        public Quest d() {
            return this.d;
        }
    }

    private static final class ag extends ax implements com.google.android.gms.games.snapshot.g.a {
        private final SnapshotMetadata a;

        ag(DataHolder dataHolder) {
            super(dataHolder);
            com.google.android.gms.games.snapshot.c cVar = new com.google.android.gms.games.snapshot.c(dataHolder);
            try {
                if (cVar.c() > 0) {
                    this.a = new SnapshotMetadataEntity((SnapshotMetadata) cVar.a(0));
                } else {
                    this.a = null;
                }
                cVar.b();
            } catch (Throwable th) {
                cVar.b();
            }
        }

        public SnapshotMetadata c() {
            return this.a;
        }
    }

    private static final class ah extends c {
        ah(DataHolder dataHolder) {
            super(dataHolder);
        }

        public void a(com.google.android.gms.games.multiplayer.realtime.g gVar, Room room) {
            gVar.c(room);
        }
    }

    private static final class ai extends ax implements com.google.android.gms.games.g.a {
        ai(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    private static final class aj extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.g.a> a;

        aj(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.g.a> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void B(DataHolder dataHolder) {
            this.a.a(new ai(dataHolder));
        }
    }

    private static final class ak extends a {
        private final com.google.android.gms.internal.ahl.b<Status> a;

        ak(com.google.android.gms.internal.ahl.b<Status> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void b(int i) {
            this.a.a(com.google.android.gms.games.f.a(i));
        }
    }

    private static final class al extends a {
        private final com.google.android.gms.internal.ahl.b<Status> a;

        al(com.google.android.gms.internal.ahl.b<Status> bVar) {
            this.a = bVar;
        }

        public void f(int i) {
            this.a.a(new Status(i));
        }
    }

    private static final class am implements com.google.android.gms.games.snapshot.g.b {
        private final Status a;
        private final String b;

        am(int i, String str) {
            this.a = com.google.android.gms.games.f.a(i);
            this.b = str;
        }

        public Status a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    private static final class an extends c {
        an(DataHolder dataHolder) {
            super(dataHolder);
        }

        public void a(com.google.android.gms.games.multiplayer.realtime.g gVar, Room room) {
            gVar.d(room);
        }
    }

    private static final class ao extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.event.c.a> a;

        ao(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.event.c.a> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void b(DataHolder dataHolder) {
            this.a.a(new by(dataHolder));
        }
    }

    private class ap extends com.google.android.gms.games.internal.d.a {
        final /* synthetic */ d a;

        public ap(d dVar) {
            this.a = dVar;
            super(dVar.B().getMainLooper(), 1000);
        }

        protected void a(String str, int i) {
            try {
                if (this.a.t()) {
                    ((k) this.a.G()).e(str, i);
                } else {
                    h.b("GamesClientImpl", new StringBuilder(String.valueOf(str).length() + 89).append("Unable to increment event ").append(str).append(" by ").append(i).append(" because the games client is no longer connected").toString());
                }
            } catch (RemoteException e) {
                this.a.a(e);
            }
        }
    }

    private static final class aq extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.e.a> a;

        aq(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.e.a> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void i(DataHolder dataHolder) {
            this.a.a(new bz(dataHolder));
        }
    }

    private static final class ar implements com.google.android.gms.games.g.b {
        private final Status a;
        private final String b;
        private final boolean c;

        public ar(int i, String str, boolean z) {
            this.a = com.google.android.gms.games.f.a(i);
            this.b = str;
            this.c = z;
        }

        public Status a() {
            return this.a;
        }
    }

    private static final class as extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.g.b> a;

        as(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.g.b> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void a(int i, String str, boolean z) {
            this.a.a(new ar(i, str, z));
        }
    }

    private static final class at implements com.google.android.gms.games.g.c {
        private final Status a;
        private final String b;
        private final boolean c;

        public at(DataHolder dataHolder) {
            try {
                this.a = com.google.android.gms.games.f.a(dataHolder.e());
                if (dataHolder.g() > 0) {
                    this.b = dataHolder.c("external_game_id", 0, 0);
                    this.c = dataHolder.d("muted", 0, 0);
                } else {
                    this.b = null;
                    this.c = false;
                }
                dataHolder.close();
            } catch (Throwable th) {
                dataHolder.close();
            }
        }

        public Status a() {
            return this.a;
        }
    }

    private static final class au extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.g.c> a;

        au(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.g.c> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void z(DataHolder dataHolder) {
            this.a.a(new at(dataHolder));
        }
    }

    private static final class av extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.e.b> a;

        av(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.e.b> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void j(DataHolder dataHolder) {
            this.a.a(new ca(dataHolder));
        }
    }

    private static final class aw extends a {
        private final com.google.android.gms.internal.ahl.b<n$g> a;

        aw(com.google.android.gms.internal.ahl.b<n$g> bVar) {
            this.a = bVar;
        }

        public void f(int i, Bundle bundle) {
            this.a.a(new fe(i, bundle));
        }
    }

    private static final class ay extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.e.c> a;

        ay(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.e.c> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void g(DataHolder dataHolder) {
            this.a.a(new cb(dataHolder));
        }
    }

    private static final class az extends a {
        private final com.google.android.gms.internal.ahl.b<c$g> a;

        public az(com.google.android.gms.internal.ahl.b<c$g> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void a(int i, String str) {
            this.a.a(new bc(com.google.android.gms.games.f.a(i), str));
        }
    }

    private static abstract class b extends ahs<com.google.android.gms.games.multiplayer.realtime.h> {
        b(DataHolder dataHolder) {
            super(dataHolder);
        }

        protected void a(com.google.android.gms.games.multiplayer.realtime.h hVar, DataHolder dataHolder) {
            a(hVar, d.b(dataHolder), dataHolder.e());
        }

        protected abstract void a(com.google.android.gms.games.multiplayer.realtime.h hVar, Room room, int i);
    }

    private static final class ba extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.c.e> a;

        public ba(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.c.e> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void a(int i, String str) {
            this.a.a(new bb(com.google.android.gms.games.f.a(i), str));
        }
    }

    private static final class bb implements com.google.android.gms.games.c.e {
        private final Status a;
        private final String b;

        bb(Status status, String str) {
            this.a = status;
            this.b = str;
        }

        public Status a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    private static final class bc implements c$g {
        private final Status a;
        private final String b;

        bc(Status status, String str) {
            this.a = status;
            this.b = str;
        }

        public Status a() {
            return this.a;
        }
    }

    private static final class bd extends a {
        private final com.google.android.gms.internal.ahl.b<Status> a;

        bd(com.google.android.gms.internal.ahl.b<Status> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void b(Status status) {
            this.a.a(status);
        }
    }

    private static final class be extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.social.b.c> a;

        be(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.social.b.c> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void W(DataHolder dataHolder) {
            this.a.a(new bm(dataHolder));
        }
    }

    private static final class bf implements com.google.android.gms.games.g.d {
        private final Status a;
        private final Bundle b;

        bf(Status status, Bundle bundle) {
            this.a = status;
            this.b = bundle;
        }

        public Status a() {
            return this.a;
        }
    }

    private static final class bg extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.g.d> a;

        bg(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.g.d> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void e(int i, Bundle bundle) {
            bundle.setClassLoader(getClass().getClassLoader());
            this.a.a(new bf(com.google.android.gms.games.f.a(i), bundle));
        }
    }

    private static abstract class ez extends ax {
        final TurnBasedMatch a;

        ez(DataHolder dataHolder) {
            super(dataHolder);
            com.google.android.gms.games.multiplayer.turnbased.c cVar = new com.google.android.gms.games.multiplayer.turnbased.c(dataHolder);
            try {
                if (cVar.c() > 0) {
                    this.a = (TurnBasedMatch) ((TurnBasedMatch) cVar.a(0)).a();
                } else {
                    this.a = null;
                }
                cVar.b();
            } catch (Throwable th) {
                cVar.b();
            }
        }

        public TurnBasedMatch c() {
            return this.a;
        }
    }

    private static final class bh extends ez implements com.google.android.gms.games.multiplayer.turnbased.g.b {
        bh(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    private static final class bi extends a {
        private final ail<com.google.android.gms.games.multiplayer.e> a;

        bi(ail<com.google.android.gms.games.multiplayer.e> com_google_android_gms_internal_ail_com_google_android_gms_games_multiplayer_e) {
            this.a = com_google_android_gms_internal_ail_com_google_android_gms_games_multiplayer_e;
        }

        public void a(String str) {
            this.a.a(new bk(str));
        }

        public void l(DataHolder dataHolder) {
            com.google.android.gms.games.multiplayer.a aVar = new com.google.android.gms.games.multiplayer.a(dataHolder);
            Invitation invitation = null;
            try {
                if (aVar.c() > 0) {
                    invitation = (Invitation) ((Invitation) aVar.a(0)).a();
                }
                aVar.b();
                if (invitation != null) {
                    this.a.a(new bj(invitation));
                }
            } catch (Throwable th) {
                aVar.b();
            }
        }
    }

    private static final class bj implements com.google.android.gms.internal.ail.c<com.google.android.gms.games.multiplayer.e> {
        private final Invitation a;

        bj(Invitation invitation) {
            this.a = invitation;
        }

        public void a() {
        }

        public void a(com.google.android.gms.games.multiplayer.e eVar) {
            eVar.a(this.a);
        }

        public /* synthetic */ void a(Object obj) {
            a((com.google.android.gms.games.multiplayer.e) obj);
        }
    }

    private static final class bk implements com.google.android.gms.internal.ail.c<com.google.android.gms.games.multiplayer.e> {
        private final String a;

        bk(String str) {
            this.a = str;
        }

        public void a() {
        }

        public void a(com.google.android.gms.games.multiplayer.e eVar) {
            eVar.a(this.a);
        }

        public /* synthetic */ void a(Object obj) {
            a((com.google.android.gms.games.multiplayer.e) obj);
        }
    }

    private static final class bl extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.multiplayer.c.a> a;

        bl(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.multiplayer.c.a> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void k(DataHolder dataHolder) {
            this.a.a(new cc(dataHolder));
        }
    }

    private static final class bm extends ax implements com.google.android.gms.games.social.b.c {
        private final SocialInvite a;

        bm(DataHolder dataHolder) {
            super(dataHolder);
            com.google.android.gms.games.social.c cVar = new com.google.android.gms.games.social.c(dataHolder);
            try {
                if (cVar.c() > 0) {
                    this.a = new SocialInviteEntity((SocialInvite) cVar.a(0));
                } else {
                    this.a = null;
                }
                cVar.b();
            } catch (Throwable th) {
                cVar.b();
            }
        }
    }

    private static final class bn extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.social.b.d> a;

        bn(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.social.b.d> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void aa(DataHolder dataHolder) {
            this.a.a(new cd(dataHolder));
        }
    }

    private static final class bo extends b {
        public bo(DataHolder dataHolder) {
            super(dataHolder);
        }

        public void a(com.google.android.gms.games.multiplayer.realtime.h hVar, Room room, int i) {
            hVar.b(i, room);
        }
    }

    private static final class bp extends ax implements com.google.android.gms.games.a.m.a {
        private final com.google.android.gms.games.a.b a;

        bp(DataHolder dataHolder) {
            super(dataHolder);
            this.a = new com.google.android.gms.games.a.b(dataHolder);
        }

        public com.google.android.gms.games.a.b c() {
            return this.a;
        }
    }

    private static final class bq extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.a.m.c> a;

        bq(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.a.m.c> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void a(DataHolder dataHolder, DataHolder dataHolder2) {
            this.a.a(new cm(dataHolder, dataHolder2));
        }
    }

    private static final class br extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.a.m.a> a;

        br(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.a.m.a> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void c(DataHolder dataHolder) {
            this.a.a(new bp(dataHolder));
        }
    }

    private static final class bs extends ez implements com.google.android.gms.games.multiplayer.turnbased.g.c {
        bs(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    private static final class bt implements com.google.android.gms.internal.ail.c<com.google.android.gms.games.multiplayer.realtime.h> {
        private final int a;
        private final String b;

        bt(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public void a() {
        }

        public void a(com.google.android.gms.games.multiplayer.realtime.h hVar) {
            hVar.a(this.a, this.b);
        }

        public /* synthetic */ void a(Object obj) {
            a((com.google.android.gms.games.multiplayer.realtime.h) obj);
        }
    }

    private static final class bu extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.video.f.j> a;

        bu(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.video.f.j> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void Q(DataHolder dataHolder) {
            this.a.a(new bv(dataHolder));
        }
    }

    private static final class bv extends ax implements com.google.android.gms.games.video.f.j {
        private final com.google.android.gms.games.video.b a;

        public bv(DataHolder dataHolder) {
            super(dataHolder);
            this.a = new com.google.android.gms.games.video.b(dataHolder);
        }
    }

    private static final class bw extends ax implements com.google.android.gms.games.achievement.c.a {
        private final com.google.android.gms.games.achievement.a a;

        bw(DataHolder dataHolder) {
            super(dataHolder);
            this.a = new com.google.android.gms.games.achievement.a(dataHolder);
        }

        public com.google.android.gms.games.achievement.a c() {
            return this.a;
        }
    }

    private static final class bx extends ax implements com.google.android.gms.games.appcontent.i.a {
        private final ArrayList<DataHolder> a;

        bx(DataHolder[] dataHolderArr) {
            super(dataHolderArr[0]);
            this.a = new ArrayList(Arrays.asList(dataHolderArr));
        }
    }

    private static final class by extends ax implements com.google.android.gms.games.event.c.a {
        private final com.google.android.gms.games.event.a a;

        by(DataHolder dataHolder) {
            super(dataHolder);
            this.a = new com.google.android.gms.games.event.a(dataHolder);
        }

        public com.google.android.gms.games.event.a c() {
            return this.a;
        }
    }

    private static final class bz extends ax implements com.google.android.gms.games.e.a {
        private final com.google.android.gms.games.internal.game.d a;

        bz(DataHolder dataHolder) {
            super(dataHolder);
            this.a = new com.google.android.gms.games.internal.game.d(dataHolder);
        }
    }

    private static final class ca extends ax implements com.google.android.gms.games.e.b {
        private final com.google.android.gms.games.internal.game.g a;

        ca(DataHolder dataHolder) {
            super(dataHolder);
            this.a = new com.google.android.gms.games.internal.game.g(dataHolder);
        }
    }

    private static final class cb extends ax implements com.google.android.gms.games.e.c {
        private final com.google.android.gms.games.a a;

        cb(DataHolder dataHolder) {
            super(dataHolder);
            this.a = new com.google.android.gms.games.a(dataHolder);
        }

        public com.google.android.gms.games.a c() {
            return this.a;
        }
    }

    private static final class cc extends ax implements com.google.android.gms.games.multiplayer.c.a {
        private final com.google.android.gms.games.multiplayer.a a;

        cc(DataHolder dataHolder) {
            super(dataHolder);
            this.a = new com.google.android.gms.games.multiplayer.a(dataHolder);
        }

        public com.google.android.gms.games.multiplayer.a c() {
            return this.a;
        }
    }

    private static final class cd extends ax implements com.google.android.gms.games.social.b.d {
        private final com.google.android.gms.games.social.c a;

        cd(DataHolder dataHolder) {
            super(dataHolder);
            this.a = new com.google.android.gms.games.social.c(dataHolder);
        }
    }

    private static final class ce extends ez implements com.google.android.gms.games.multiplayer.turnbased.g.d {
        ce(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    private static final class cf implements com.google.android.gms.games.multiplayer.turnbased.g.e {
        private final Status a;
        private final com.google.android.gms.games.multiplayer.turnbased.a b;

        cf(Status status, Bundle bundle) {
            this.a = status;
            this.b = new com.google.android.gms.games.multiplayer.turnbased.a(bundle);
        }

        public Status a() {
            return this.a;
        }

        public void b() {
            this.b.f();
        }

        public com.google.android.gms.games.multiplayer.turnbased.a c() {
            return this.b;
        }
    }

    private static final class cg extends ax implements com.google.android.gms.games.a.m.b {
        private final com.google.android.gms.games.a.h a;

        cg(DataHolder dataHolder) {
            super(dataHolder);
            com.google.android.gms.games.a.f fVar = new com.google.android.gms.games.a.f(dataHolder);
            try {
                if (fVar.c() > 0) {
                    this.a = (com.google.android.gms.games.a.h) ((com.google.android.gms.games.a.e) fVar.a(0)).a();
                } else {
                    this.a = null;
                }
                fVar.b();
            } catch (Throwable th) {
                fVar.b();
            }
        }

        public com.google.android.gms.games.a.e c() {
            return this.a;
        }
    }

    private static final class ch extends ax implements com.google.android.gms.games.stats.c.a {
        private final PlayerStats a;

        ch(DataHolder dataHolder) {
            super(dataHolder);
            com.google.android.gms.games.stats.a aVar = new com.google.android.gms.games.stats.a(dataHolder);
            try {
                if (aVar.c() > 0) {
                    this.a = new PlayerStatsEntity((PlayerStats) aVar.a(0));
                } else {
                    this.a = null;
                }
                aVar.b();
            } catch (Throwable th) {
                aVar.b();
            }
        }

        public PlayerStats c() {
            return this.a;
        }
    }

    private static final class ci extends ax implements com.google.android.gms.games.n.a {
        private final com.google.android.gms.games.j a;

        ci(DataHolder dataHolder) {
            super(dataHolder);
            this.a = new com.google.android.gms.games.j(dataHolder);
        }

        public com.google.android.gms.games.j c() {
            return this.a;
        }
    }

    private static final class cj extends ax implements com.google.android.gms.games.quest.f.c {
        private final DataHolder a;

        cj(DataHolder dataHolder) {
            super(dataHolder);
            this.a = dataHolder;
        }

        public com.google.android.gms.games.quest.c c() {
            return new com.google.android.gms.games.quest.c(this.a);
        }
    }

    private static final class ck extends ax implements com.google.android.gms.games.request.g.a {
        ck(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    private static final class cl implements com.google.android.gms.games.request.g.b {
        private final Status a;
        private final Bundle b;

        cl(Status status, Bundle bundle) {
            this.a = status;
            this.b = bundle;
        }

        public Status a() {
            return this.a;
        }

        public com.google.android.gms.games.request.a a(int i) {
            String a = com.google.android.gms.games.internal.b.r.a(i);
            return !this.b.containsKey(a) ? null : new com.google.android.gms.games.request.a((DataHolder) this.b.get(a));
        }

        public void b() {
            for (String parcelable : this.b.keySet()) {
                DataHolder dataHolder = (DataHolder) this.b.getParcelable(parcelable);
                if (dataHolder != null) {
                    dataHolder.close();
                }
            }
        }
    }

    private static final class cm extends ax implements com.google.android.gms.games.a.m.c {
        private final com.google.android.gms.games.a.c a;
        private final com.google.android.gms.games.a.f d;

        cm(DataHolder dataHolder, DataHolder dataHolder2) {
            super(dataHolder2);
            com.google.android.gms.games.a.b bVar = new com.google.android.gms.games.a.b(dataHolder);
            try {
                if (bVar.c() > 0) {
                    this.a = (com.google.android.gms.games.a.c) ((com.google.android.gms.games.a.a) bVar.a(0)).a();
                } else {
                    this.a = null;
                }
                bVar.b();
                this.d = new com.google.android.gms.games.a.f(dataHolder2);
            } catch (Throwable th) {
                bVar.b();
            }
        }

        public com.google.android.gms.games.a.a c() {
            return this.a;
        }

        public com.google.android.gms.games.a.f d() {
            return this.d;
        }
    }

    private static final class cn extends ax implements com.google.android.gms.games.snapshot.g.c {
        cn(DataHolder dataHolder) {
            super(dataHolder);
        }

        public com.google.android.gms.games.snapshot.c c() {
            return new com.google.android.gms.games.snapshot.c(this.c);
        }
    }

    private static final class co extends ax implements n$c {
        private final com.google.android.gms.games.internal.player.d a;

        co(DataHolder dataHolder) {
            super(dataHolder);
            this.a = new com.google.android.gms.games.internal.player.d(dataHolder);
        }

        public Status a() {
            return this.b;
        }
    }

    private static final class cp implements n$d {
        private final Status a;
        private final List<String> b;
        private final Bundle c;

        cp(Status status, Bundle bundle) {
            this.a = status;
            this.b = bundle.getStringArrayList("game_category_list");
            this.c = bundle;
        }

        public Status a() {
            return this.a;
        }
    }

    private static final class cq extends ax implements n$f {
        private final com.google.android.gms.games.internal.experience.a a;

        cq(DataHolder dataHolder) {
            super(dataHolder);
            this.a = new com.google.android.gms.games.internal.experience.a(dataHolder);
        }
    }

    private static final class cr implements com.google.android.gms.internal.ail.c<com.google.android.gms.games.multiplayer.turnbased.b> {
        private final String a;

        cr(String str) {
            this.a = str;
        }

        public void a() {
        }

        public void a(com.google.android.gms.games.multiplayer.turnbased.b bVar) {
            bVar.a(this.a);
        }

        public /* synthetic */ void a(Object obj) {
            a((com.google.android.gms.games.multiplayer.turnbased.b) obj);
        }
    }

    private static final class cs extends a {
        private final ail<com.google.android.gms.games.multiplayer.turnbased.b> a;

        cs(ail<com.google.android.gms.games.multiplayer.turnbased.b> com_google_android_gms_internal_ail_com_google_android_gms_games_multiplayer_turnbased_b) {
            this.a = com_google_android_gms_internal_ail_com_google_android_gms_games_multiplayer_turnbased_b;
        }

        public void c(String str) {
            this.a.a(new cr(str));
        }

        public void r(DataHolder dataHolder) {
            com.google.android.gms.games.multiplayer.turnbased.c cVar = new com.google.android.gms.games.multiplayer.turnbased.c(dataHolder);
            TurnBasedMatch turnBasedMatch = null;
            try {
                if (cVar.c() > 0) {
                    turnBasedMatch = (TurnBasedMatch) ((TurnBasedMatch) cVar.a(0)).a();
                }
                cVar.b();
                if (turnBasedMatch != null) {
                    this.a.a(new ct(turnBasedMatch));
                }
            } catch (Throwable th) {
                cVar.b();
            }
        }
    }

    private static final class ct implements com.google.android.gms.internal.ail.c<com.google.android.gms.games.multiplayer.turnbased.b> {
        private final TurnBasedMatch a;

        ct(TurnBasedMatch turnBasedMatch) {
            this.a = turnBasedMatch;
        }

        public void a() {
        }

        public void a(com.google.android.gms.games.multiplayer.turnbased.b bVar) {
            bVar.a(this.a);
        }

        public /* synthetic */ void a(Object obj) {
            a((com.google.android.gms.games.multiplayer.turnbased.b) obj);
        }
    }

    private static final class cu implements com.google.android.gms.internal.ail.c<com.google.android.gms.games.multiplayer.realtime.a> {
        private final RealTimeMessage a;

        cu(RealTimeMessage realTimeMessage) {
            this.a = realTimeMessage;
        }

        public void a() {
        }

        public void a(com.google.android.gms.games.multiplayer.realtime.a aVar) {
            aVar.a(this.a);
        }

        public /* synthetic */ void a(Object obj) {
            a((com.google.android.gms.games.multiplayer.realtime.a) obj);
        }
    }

    private static final class cv implements com.google.android.gms.internal.ail.c<com.google.android.gms.games.h> {
        public void a() {
        }

        public void a(com.google.android.gms.games.h hVar) {
            hVar.a(null);
        }

        public /* synthetic */ void a(Object obj) {
            a((com.google.android.gms.games.h) obj);
        }
    }

    private static final class cw extends ax implements com.google.android.gms.games.snapshot.g.d {
        private final Snapshot a;
        private final String d;
        private final Snapshot e;
        private final Contents f;
        private final SnapshotContents g;

        cw(DataHolder dataHolder, Contents contents) {
            this(dataHolder, null, contents, null, null);
        }

        cw(DataHolder dataHolder, String str, Contents contents, Contents contents2, Contents contents3) {
            boolean z = true;
            super(dataHolder);
            com.google.android.gms.games.snapshot.c cVar = new com.google.android.gms.games.snapshot.c(dataHolder);
            try {
                if (cVar.c() == 0) {
                    this.a = null;
                    this.e = null;
                } else if (cVar.c() == 1) {
                    if (dataHolder.e() == 4004) {
                        z = false;
                    }
                    com.google.android.gms.common.internal.n.a(z);
                    this.a = new SnapshotEntity(new SnapshotMetadataEntity((SnapshotMetadata) cVar.a(0)), new SnapshotContentsEntity(contents));
                    this.e = null;
                } else {
                    this.a = new SnapshotEntity(new SnapshotMetadataEntity((SnapshotMetadata) cVar.a(0)), new SnapshotContentsEntity(contents));
                    this.e = new SnapshotEntity(new SnapshotMetadataEntity((SnapshotMetadata) cVar.a(1)), new SnapshotContentsEntity(contents2));
                }
                cVar.b();
                this.d = str;
                this.f = contents3;
                this.g = new SnapshotContentsEntity(contents3);
            } catch (Throwable th) {
                cVar.b();
            }
        }

        public Snapshot c() {
            return this.a;
        }

        public String d() {
            return this.d;
        }

        public Snapshot e() {
            return this.e;
        }

        public SnapshotContents f() {
            return this.g;
        }
    }

    private static final class cx implements com.google.android.gms.internal.ail.c<com.google.android.gms.games.multiplayer.realtime.g> {
        private final String a;

        cx(String str) {
            this.a = str;
        }

        public void a() {
        }

        public void a(com.google.android.gms.games.multiplayer.realtime.g gVar) {
            gVar.a(this.a);
        }

        public /* synthetic */ void a(Object obj) {
            a((com.google.android.gms.games.multiplayer.realtime.g) obj);
        }
    }

    private static final class cy implements com.google.android.gms.internal.ail.c<com.google.android.gms.games.multiplayer.realtime.g> {
        private final String a;

        cy(String str) {
            this.a = str;
        }

        public void a() {
        }

        public void a(com.google.android.gms.games.multiplayer.realtime.g gVar) {
            gVar.b(this.a);
        }

        public /* synthetic */ void a(Object obj) {
            a((com.google.android.gms.games.multiplayer.realtime.g) obj);
        }
    }

    private static final class cz extends a {
        cz(DataHolder dataHolder, String[] strArr) {
            super(dataHolder, strArr);
        }

        protected void a(com.google.android.gms.games.multiplayer.realtime.g gVar, Room room, ArrayList<String> arrayList) {
            gVar.e(room, arrayList);
        }
    }

    private static final class d extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.social.b.c> a;

        d(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.social.b.c> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void T(DataHolder dataHolder) {
            this.a.a(new bm(dataHolder));
        }
    }

    private static final class da extends a {
        da(DataHolder dataHolder, String[] strArr) {
            super(dataHolder, strArr);
        }

        protected void a(com.google.android.gms.games.multiplayer.realtime.g gVar, Room room, ArrayList<String> arrayList) {
            gVar.b(room, arrayList);
        }
    }

    private static final class db extends a {
        db(DataHolder dataHolder, String[] strArr) {
            super(dataHolder, strArr);
        }

        protected void a(com.google.android.gms.games.multiplayer.realtime.g gVar, Room room, ArrayList<String> arrayList) {
            gVar.f(room, arrayList);
        }
    }

    private static final class dc extends a {
        dc(DataHolder dataHolder, String[] strArr) {
            super(dataHolder, strArr);
        }

        protected void a(com.google.android.gms.games.multiplayer.realtime.g gVar, Room room, ArrayList<String> arrayList) {
            gVar.a(room, arrayList);
        }
    }

    private static final class dd extends a {
        dd(DataHolder dataHolder, String[] strArr) {
            super(dataHolder, strArr);
        }

        protected void a(com.google.android.gms.games.multiplayer.realtime.g gVar, Room room, ArrayList<String> arrayList) {
            gVar.c(room, arrayList);
        }
    }

    private static final class de extends a {
        de(DataHolder dataHolder, String[] strArr) {
            super(dataHolder, strArr);
        }

        protected void a(com.google.android.gms.games.multiplayer.realtime.g gVar, Room room, ArrayList<String> arrayList) {
            gVar.d(room, arrayList);
        }
    }

    private static final class df extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.a.m.b> a;

        df(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.a.m.b> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void C(DataHolder dataHolder) {
            this.a.a(new cg(dataHolder));
        }
    }

    private static final class dg extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.stats.c.a> a;

        public dg(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.stats.c.a> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void P(DataHolder dataHolder) {
            this.a.a(new ch(dataHolder));
        }
    }

    private static final class dh extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.n.a> a;

        dh(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.n.a> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void Y(DataHolder dataHolder) {
            this.a.a(new ci(dataHolder));
        }
    }

    private static final class di extends a {
        private final com.google.android.gms.internal.ahl.b<n$d> a;

        di(com.google.android.gms.internal.ahl.b<n$d> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void d(int i, Bundle bundle) {
            bundle.setClassLoader(getClass().getClassLoader());
            this.a.a(new cp(com.google.android.gms.games.f.a(i), bundle));
        }
    }

    static final class dj extends a {
        private final com.google.android.gms.internal.ahl.b<n$f> a;

        dj(com.google.android.gms.internal.ahl.b<n$f> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void N(DataHolder dataHolder) {
            this.a.a(new cq(dataHolder));
        }
    }

    private static final class dk extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.n.a> a;

        dk(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.n.a> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void e(DataHolder dataHolder) {
            this.a.a(new ci(dataHolder));
        }

        public void f(DataHolder dataHolder) {
            this.a.a(new ci(dataHolder));
        }
    }

    private static final class dl extends b {
        private final n a;

        public dl(n nVar) {
            this.a = nVar;
        }

        public PopupLocationInfoParcelable a() {
            return new PopupLocationInfoParcelable(this.a.d());
        }
    }

    private static final class dm extends a {
        private final com.google.android.gms.internal.ahl.b<n$b> a;

        dm(com.google.android.gms.internal.ahl.b<n$b> bVar) {
            this.a = bVar;
        }

        public void O(DataHolder dataHolder) {
            this.a.a(new ProfileSettingsEntity(dataHolder));
            dataHolder.close();
        }
    }

    private static final class dn extends a {
        private final com.google.android.gms.internal.ahl.b<Status> a;

        dn(com.google.android.gms.internal.ahl.b<Status> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void c(int i) {
            this.a.a(com.google.android.gms.games.f.a(i));
        }
    }

    private static final class do extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.quest.f.a> a;

        public do(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.quest.f.a> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void J(DataHolder dataHolder) {
            this.a.a(new e(dataHolder));
        }
    }

    private static final class dp implements com.google.android.gms.internal.ail.c<com.google.android.gms.games.quest.e> {
        private final Quest a;

        dp(Quest quest) {
            this.a = quest;
        }

        public void a() {
        }

        public void a(com.google.android.gms.games.quest.e eVar) {
            eVar.a(this.a);
        }

        public /* synthetic */ void a(Object obj) {
            a((com.google.android.gms.games.quest.e) obj);
        }
    }

    private static final class dq extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.quest.f.b> a;
        private final String b;

        public dq(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.quest.f.b> bVar, String str) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
            this.b = (String) com.google.android.gms.common.internal.d.a(str, "MilestoneId must not be null");
        }

        public void I(DataHolder dataHolder) {
            this.a.a(new af(dataHolder, this.b));
        }
    }

    private static final class dr extends a {
        private final ail<com.google.android.gms.games.quest.e> a;

        dr(ail<com.google.android.gms.games.quest.e> com_google_android_gms_internal_ail_com_google_android_gms_games_quest_e) {
            this.a = com_google_android_gms_internal_ail_com_google_android_gms_games_quest_e;
        }

        private Quest ab(DataHolder dataHolder) {
            com.google.android.gms.games.quest.c cVar = new com.google.android.gms.games.quest.c(dataHolder);
            Quest quest = null;
            try {
                if (cVar.c() > 0) {
                    quest = (Quest) ((Quest) cVar.a(0)).a();
                }
                cVar.b();
                return quest;
            } catch (Throwable th) {
                cVar.b();
            }
        }

        public void K(DataHolder dataHolder) {
            Quest ab = ab(dataHolder);
            if (ab != null) {
                this.a.a(new dp(ab));
            }
        }
    }

    private static final class ds extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.quest.f.c> a;

        public ds(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.quest.f.c> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void M(DataHolder dataHolder) {
            this.a.a(new cj(dataHolder));
        }
    }

    private static final class dt implements com.google.android.gms.internal.ail.c<com.google.android.gms.games.multiplayer.realtime.b.a> {
        private final int a;
        private final String b;
        private final int c;

        dt(int i, int i2, String str) {
            this.a = i;
            this.c = i2;
            this.b = str;
        }

        public void a() {
        }

        public void a(com.google.android.gms.games.multiplayer.realtime.b.a aVar) {
            if (aVar != null) {
                aVar.a(this.a, this.c, this.b);
            }
        }

        public /* synthetic */ void a(Object obj) {
            a((com.google.android.gms.games.multiplayer.realtime.b.a) obj);
        }
    }

    private static final class du extends a {
        final ail<com.google.android.gms.games.multiplayer.realtime.b.a> a;

        public du(ail<com.google.android.gms.games.multiplayer.realtime.b.a> com_google_android_gms_internal_ail_com_google_android_gms_games_multiplayer_realtime_b_a) {
            this.a = com_google_android_gms_internal_ail_com_google_android_gms_games_multiplayer_realtime_b_a;
        }

        public void a(int i, int i2, String str) {
            if (this.a != null) {
                this.a.a(new dt(i, i2, str));
            }
        }
    }

    private static final class dv extends a {
        private final ail<com.google.android.gms.games.request.f> a;

        dv(ail<com.google.android.gms.games.request.f> com_google_android_gms_internal_ail_com_google_android_gms_games_request_f) {
            this.a = com_google_android_gms_internal_ail_com_google_android_gms_games_request_f;
        }

        public void b(String str) {
            this.a.a(new dx(str));
        }

        public void m(DataHolder dataHolder) {
            com.google.android.gms.games.request.a aVar = new com.google.android.gms.games.request.a(dataHolder);
            GameRequest gameRequest = null;
            try {
                if (aVar.c() > 0) {
                    gameRequest = (GameRequest) ((GameRequest) aVar.a(0)).a();
                }
                aVar.b();
                if (gameRequest != null) {
                    this.a.a(new dw(gameRequest));
                }
            } catch (Throwable th) {
                aVar.b();
            }
        }
    }

    private static final class dw implements com.google.android.gms.internal.ail.c<com.google.android.gms.games.request.f> {
        private final GameRequest a;

        dw(GameRequest gameRequest) {
            this.a = gameRequest;
        }

        public void a() {
        }

        public void a(com.google.android.gms.games.request.f fVar) {
            fVar.a(this.a);
        }

        public /* synthetic */ void a(Object obj) {
            a((com.google.android.gms.games.request.f) obj);
        }
    }

    private static final class dx implements com.google.android.gms.internal.ail.c<com.google.android.gms.games.request.f> {
        private final String a;

        dx(String str) {
            this.a = str;
        }

        public void a() {
        }

        public void a(com.google.android.gms.games.request.f fVar) {
            fVar.a(this.a);
        }

        public /* synthetic */ void a(Object obj) {
            a((com.google.android.gms.games.request.f) obj);
        }
    }

    private static final class dy extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.request.g.c> a;

        public dy(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.request.g.c> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void E(DataHolder dataHolder) {
            this.a.a(new ei(dataHolder));
        }
    }

    private static final class dz extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.request.g.a> a;

        public dz(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.request.g.a> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void F(DataHolder dataHolder) {
            this.a.a(new ck(dataHolder));
        }
    }

    private static final class e extends ax implements com.google.android.gms.games.quest.f.a {
        private final Quest a;

        e(DataHolder dataHolder) {
            super(dataHolder);
            com.google.android.gms.games.quest.c cVar = new com.google.android.gms.games.quest.c(dataHolder);
            try {
                if (cVar.c() > 0) {
                    this.a = new QuestEntity((Quest) cVar.a(0));
                } else {
                    this.a = null;
                }
                cVar.b();
            } catch (Throwable th) {
                cVar.b();
            }
        }

        public Quest c() {
            return this.a;
        }
    }

    private static final class ea extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.request.g.b> a;

        public ea(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.request.g.b> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void b(int i, Bundle bundle) {
            bundle.setClassLoader(getClass().getClassLoader());
            this.a.a(new cl(com.google.android.gms.games.f.a(i), bundle));
        }
    }

    private static final class eb extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.request.g.d> a;

        public eb(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.request.g.d> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void D(DataHolder dataHolder) {
            this.a.a(new fi(dataHolder));
        }
    }

    private static final class ec extends c {
        ec(DataHolder dataHolder) {
            super(dataHolder);
        }

        public void a(com.google.android.gms.games.multiplayer.realtime.g gVar, Room room) {
            gVar.b(room);
        }
    }

    private static final class ed extends a {
        private final ail<? extends com.google.android.gms.games.multiplayer.realtime.h> a;
        private final ail<? extends com.google.android.gms.games.multiplayer.realtime.g> b;
        private final ail<com.google.android.gms.games.multiplayer.realtime.a> c;

        public ed(ail<com.google.android.gms.games.multiplayer.realtime.h> com_google_android_gms_internal_ail_com_google_android_gms_games_multiplayer_realtime_h) {
            this.a = (ail) com.google.android.gms.common.internal.d.a(com_google_android_gms_internal_ail_com_google_android_gms_games_multiplayer_realtime_h, "Callbacks must not be null");
            this.b = null;
            this.c = null;
        }

        public ed(ail<? extends com.google.android.gms.games.multiplayer.realtime.h> com_google_android_gms_internal_ail__extends_com_google_android_gms_games_multiplayer_realtime_h, ail<? extends com.google.android.gms.games.multiplayer.realtime.g> com_google_android_gms_internal_ail__extends_com_google_android_gms_games_multiplayer_realtime_g, ail<com.google.android.gms.games.multiplayer.realtime.a> com_google_android_gms_internal_ail_com_google_android_gms_games_multiplayer_realtime_a) {
            this.a = (ail) com.google.android.gms.common.internal.d.a(com_google_android_gms_internal_ail__extends_com_google_android_gms_games_multiplayer_realtime_h, "Callbacks must not be null");
            this.b = com_google_android_gms_internal_ail__extends_com_google_android_gms_games_multiplayer_realtime_g;
            this.c = com_google_android_gms_internal_ail_com_google_android_gms_games_multiplayer_realtime_a;
        }

        public void a(DataHolder dataHolder, String[] strArr) {
            if (this.b != null) {
                this.b.a(new dc(dataHolder, strArr));
            }
        }

        public void a(RealTimeMessage realTimeMessage) {
            if (this.c != null) {
                this.c.a(new cu(realTimeMessage));
            }
        }

        public void b(DataHolder dataHolder, String[] strArr) {
            if (this.b != null) {
                this.b.a(new dd(dataHolder, strArr));
            }
        }

        public void c(DataHolder dataHolder, String[] strArr) {
            if (this.b != null) {
                this.b.a(new de(dataHolder, strArr));
            }
        }

        public void d(int i, String str) {
            this.a.a(new bt(i, str));
        }

        public void d(DataHolder dataHolder, String[] strArr) {
            if (this.b != null) {
                this.b.a(new da(dataHolder, strArr));
            }
        }

        public void d(String str) {
            if (this.b != null) {
                this.b.a(new cx(str));
            }
        }

        public void e(DataHolder dataHolder, String[] strArr) {
            if (this.b != null) {
                this.b.a(new cz(dataHolder, strArr));
            }
        }

        public void e(String str) {
            if (this.b != null) {
                this.b.a(new cy(str));
            }
        }

        public void f(DataHolder dataHolder, String[] strArr) {
            if (this.b != null) {
                this.b.a(new db(dataHolder, strArr));
            }
        }

        public void s(DataHolder dataHolder) {
            this.a.a(new eg(dataHolder));
        }

        public void t(DataHolder dataHolder) {
            this.a.a(new bo(dataHolder));
        }

        public void u(DataHolder dataHolder) {
            if (this.b != null) {
                this.b.a(new ef(dataHolder));
            }
        }

        public void v(DataHolder dataHolder) {
            if (this.b != null) {
                this.b.a(new ec(dataHolder));
            }
        }

        public void w(DataHolder dataHolder) {
            this.a.a(new ee(dataHolder));
        }

        public void x(DataHolder dataHolder) {
            if (this.b != null) {
                this.b.a(new ah(dataHolder));
            }
        }

        public void y(DataHolder dataHolder) {
            if (this.b != null) {
                this.b.a(new an(dataHolder));
            }
        }
    }

    private static final class ee extends b {
        ee(DataHolder dataHolder) {
            super(dataHolder);
        }

        public void a(com.google.android.gms.games.multiplayer.realtime.h hVar, Room room, int i) {
            hVar.c(i, room);
        }
    }

    private static final class ef extends c {
        ef(DataHolder dataHolder) {
            super(dataHolder);
        }

        public void a(com.google.android.gms.games.multiplayer.realtime.g gVar, Room room) {
            gVar.a(room);
        }
    }

    private static final class eg extends b {
        public eg(DataHolder dataHolder) {
            super(dataHolder);
        }

        public void a(com.google.android.gms.games.multiplayer.realtime.h hVar, Room room, int i) {
            hVar.a(i, room);
        }
    }

    private static final class eh extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.social.b.c> a;

        eh(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.social.b.c> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void S(DataHolder dataHolder) {
            this.a.a(new bm(dataHolder));
        }
    }

    private static final class ei extends ax implements com.google.android.gms.games.request.g.c {
        private final GameRequest a;

        ei(DataHolder dataHolder) {
            super(dataHolder);
            com.google.android.gms.games.request.a aVar = new com.google.android.gms.games.request.a(dataHolder);
            try {
                if (aVar.c() > 0) {
                    this.a = (GameRequest) ((GameRequest) aVar.a(0)).a();
                } else {
                    this.a = null;
                }
                aVar.b();
            } catch (Throwable th) {
                aVar.b();
            }
        }
    }

    private static final class ej extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.n.a> a;

        ej(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.n.a> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void Z(DataHolder dataHolder) {
            this.a.a(new ci(dataHolder));
        }
    }

    private static final class ek extends a {
        private final com.google.android.gms.internal.ahl.b<Status> a;

        public ek(com.google.android.gms.internal.ahl.b<Status> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void a() {
            this.a.a(com.google.android.gms.games.f.a(0));
        }
    }

    private static final class el extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.snapshot.g.a> a;

        public el(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.snapshot.g.a> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void H(DataHolder dataHolder) {
            this.a.a(new ag(dataHolder));
        }
    }

    static final class em extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.snapshot.g.b> a;

        public em(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.snapshot.g.b> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void e(int i, String str) {
            this.a.a(new am(i, str));
        }
    }

    private static final class en extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.snapshot.g.d> a;

        public en(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.snapshot.g.d> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void a(DataHolder dataHolder, Contents contents) {
            this.a.a(new cw(dataHolder, contents));
        }

        public void a(DataHolder dataHolder, String str, Contents contents, Contents contents2, Contents contents3) {
            this.a.a(new cw(dataHolder, str, contents, contents2, contents3));
        }
    }

    private static final class eo extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.snapshot.g.c> a;

        public eo(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.snapshot.g.c> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void G(DataHolder dataHolder) {
            this.a.a(new cn(dataHolder));
        }
    }

    private static final class ep implements com.google.android.gms.internal.ail.c<com.google.android.gms.games.social.a> {
        private final SocialInvite a;

        ep(SocialInvite socialInvite) {
            this.a = socialInvite;
        }

        public void a() {
        }

        public void a(com.google.android.gms.games.social.a aVar) {
            aVar.b(this.a);
        }

        public /* synthetic */ void a(Object obj) {
            a((com.google.android.gms.games.social.a) obj);
        }
    }

    private static final class eq extends a {
        public void U(DataHolder dataHolder) {
            ail com_google_android_gms_internal_ail = null;
            com.google.android.gms.games.social.c cVar = new com.google.android.gms.games.social.c(dataHolder);
            try {
                SocialInvite socialInvite;
                if (cVar.c() > 0) {
                    socialInvite = (SocialInvite) ((SocialInvite) cVar.a(0)).a();
                } else {
                    Object obj = com_google_android_gms_internal_ail;
                }
                cVar.b();
                if (socialInvite != null) {
                    com_google_android_gms_internal_ail.a(new er(socialInvite));
                }
            } catch (Throwable th) {
                cVar.b();
            }
        }

        public void V(DataHolder dataHolder) {
            ail com_google_android_gms_internal_ail = null;
            com.google.android.gms.games.social.c cVar = new com.google.android.gms.games.social.c(dataHolder);
            try {
                SocialInvite socialInvite;
                if (cVar.c() > 0) {
                    socialInvite = (SocialInvite) ((SocialInvite) cVar.a(0)).a();
                } else {
                    Object obj = com_google_android_gms_internal_ail;
                }
                cVar.b();
                if (socialInvite != null) {
                    com_google_android_gms_internal_ail.a(new ep(socialInvite));
                }
            } catch (Throwable th) {
                cVar.b();
            }
        }
    }

    private static final class er implements com.google.android.gms.internal.ail.c<com.google.android.gms.games.social.a> {
        private final SocialInvite a;

        er(SocialInvite socialInvite) {
            this.a = socialInvite;
        }

        public void a() {
        }

        public void a(com.google.android.gms.games.social.a aVar) {
            aVar.a(this.a);
        }

        public /* synthetic */ void a(Object obj) {
            a((com.google.android.gms.games.social.a) obj);
        }
    }

    private static final class es extends a {
        private final com.google.android.gms.internal.ahl.b<n$c> a;

        es(com.google.android.gms.internal.ahl.b<n$c> bVar) {
            this.a = bVar;
        }

        public void R(DataHolder dataHolder) {
            this.a.a(new co(dataHolder));
        }
    }

    private static final class et extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.a.m.d> a;

        public et(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.a.m.d> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void d(DataHolder dataHolder) {
            this.a.a(new eu(dataHolder));
        }
    }

    private static final class eu extends ax implements com.google.android.gms.games.a.m.d {
        private final com.google.android.gms.games.a.n a;

        public eu(DataHolder dataHolder) {
            super(dataHolder);
            try {
                this.a = new com.google.android.gms.games.a.n(dataHolder);
            } finally {
                dataHolder.close();
            }
        }

        public com.google.android.gms.games.a.n c() {
            return this.a;
        }
    }

    private static final class ev extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.multiplayer.turnbased.g.a> a;

        public ev(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.multiplayer.turnbased.g.a> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void c(int i, String str) {
            this.a.a(new j(com.google.android.gms.games.f.a(i), str));
        }
    }

    private static final class ew extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.multiplayer.turnbased.g.b> a;

        public ew(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.multiplayer.turnbased.g.b> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void o(DataHolder dataHolder) {
            this.a.a(new bh(dataHolder));
        }
    }

    private static final class ex extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.multiplayer.turnbased.g.c> a;

        public ex(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.multiplayer.turnbased.g.c> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void q(DataHolder dataHolder) {
            this.a.a(new bs(dataHolder));
        }
    }

    private static final class ey extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.multiplayer.turnbased.g.d> a;

        public ey(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.multiplayer.turnbased.g.d> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void n(DataHolder dataHolder) {
            this.a.a(new ce(dataHolder));
        }
    }

    private static final class f extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.achievement.c.b> a;

        f(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.achievement.c.b> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void b(int i, String str) {
            this.a.a(new fc(i, str));
        }
    }

    private static final class fa extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.multiplayer.turnbased.g.f> a;

        public fa(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.multiplayer.turnbased.g.f> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void p(DataHolder dataHolder) {
            this.a.a(new fg(dataHolder));
        }
    }

    private static final class fb extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.multiplayer.turnbased.g.e> a;

        public fb(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.multiplayer.turnbased.g.e> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void a(int i, Bundle bundle) {
            bundle.setClassLoader(getClass().getClassLoader());
            this.a.a(new cf(com.google.android.gms.games.f.a(i), bundle));
        }
    }

    private static final class fc implements com.google.android.gms.games.achievement.c.b {
        private final Status a;
        private final String b;

        fc(int i, String str) {
            this.a = com.google.android.gms.games.f.a(i);
            this.b = str;
        }

        public Status a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    private static final class fd extends a {
        private final com.google.android.gms.internal.ahl.b<Status> a;

        fd(com.google.android.gms.internal.ahl.b<Status> bVar) {
            this.a = bVar;
        }

        public void g(int i) {
            this.a.a(new Status(i));
        }
    }

    private static final class fe implements n$g {
        private final Status a;
        private final Bundle b;

        fe(int i, Bundle bundle) {
            this.a = new Status(i);
            this.b = bundle;
        }

        public Status a() {
            return this.a;
        }
    }

    private static final class ff extends a {
        private final com.google.android.gms.internal.ahl.b<Status> a;

        ff(com.google.android.gms.internal.ahl.b<Status> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void c(Status status) {
            this.a.a(status);
        }
    }

    private static final class fg extends ez implements com.google.android.gms.games.multiplayer.turnbased.g.f {
        fg(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    private static final class fh extends a {
        private final com.google.android.gms.internal.ahl.b<Status> a;

        fh(com.google.android.gms.internal.ahl.b<Status> bVar) {
            this.a = bVar;
        }

        public void h(int i) {
            this.a.a(new Status(i));
        }
    }

    private static final class fi extends ax implements com.google.android.gms.games.request.g.d {
        private final com.google.android.gms.games.internal.request.b a;

        fi(DataHolder dataHolder) {
            super(dataHolder);
            this.a = com.google.android.gms.games.internal.request.b.a(dataHolder);
        }

        public int a(String str) {
            return this.a.a(str);
        }

        public Set<String> c() {
            return this.a.a();
        }
    }

    private static final class g extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.achievement.c.a> a;

        g(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.achievement.c.a> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void a(DataHolder dataHolder) {
            this.a.a(new bw(dataHolder));
        }
    }

    private static final class h extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.appcontent.i.a> a;

        public h(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.appcontent.i.a> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void a(DataHolder[] dataHolderArr) {
            this.a.a(new bx(dataHolderArr));
        }
    }

    private static final class i extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.social.b.c> a;

        i(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.social.b.c> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void X(DataHolder dataHolder) {
            this.a.a(new bm(dataHolder));
        }
    }

    private static final class j implements com.google.android.gms.games.multiplayer.turnbased.g.a {
        private final Status a;
        private final String b;

        j(Status status, String str) {
            this.a = status;
            this.b = str;
        }

        public Status a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    private static final class k extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.video.f.a> a;

        k(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.video.f.a> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void a(int i, boolean z) {
            this.a.a(new l(new Status(i), z));
        }
    }

    private static final class l implements com.google.android.gms.games.video.f.a {
        private final Status a;
        private final boolean b;

        l(Status status, boolean z) {
            this.a = status;
            this.b = z;
        }

        public Status a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }
    }

    private static final class m extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.video.f.b> a;

        m(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.video.f.b> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void a(int i, VideoCapabilities videoCapabilities) {
            this.a.a(new n(new Status(i), videoCapabilities));
        }
    }

    private static final class n implements com.google.android.gms.games.video.f.b {
        private final Status a;
        private final VideoCapabilities b;

        n(Status status, VideoCapabilities videoCapabilities) {
            this.a = status;
            this.b = videoCapabilities;
        }

        public Status a() {
            return this.a;
        }

        public VideoCapabilities b() {
            return this.b;
        }
    }

    private static final class o extends a {
        private final c$a<Status> a;

        o(c$a<Status> com_google_android_gms_games_c_a_com_google_android_gms_common_api_Status) {
            this.a = (c$a) com.google.android.gms.common.internal.d.a(com_google_android_gms_games_c_a_com_google_android_gms_common_api_Status, "Holder must not be null");
        }

        public void a(Status status) {
            this.a.b(status);
        }

        public void d(int i) {
            this.a.b(new Status(i));
        }
    }

    private static final class p extends a {
        private final ail<com.google.android.gms.games.video.f.c> a;

        p(ail<com.google.android.gms.games.video.f.c> com_google_android_gms_internal_ail_com_google_android_gms_games_video_f_c) {
            this.a = (ail) com.google.android.gms.common.internal.d.a(com_google_android_gms_internal_ail_com_google_android_gms_games_video_f_c, "Callback must not be null");
        }

        public void k(int i) {
            this.a.a(new q(i));
        }
    }

    private static final class q implements com.google.android.gms.internal.ail.c<com.google.android.gms.games.video.f.c> {
        private final int a;

        q(int i) {
            this.a = i;
        }

        public void a() {
        }

        public void a(com.google.android.gms.games.video.f.c cVar) {
            cVar.a(this.a);
        }

        public /* synthetic */ void a(Object obj) {
            a((com.google.android.gms.games.video.f.c) obj);
        }
    }

    private static final class r extends a {
        private final com.google.android.gms.internal.ahl.b<Status> a;

        public r(com.google.android.gms.internal.ahl.b<Status> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void j(int i) {
            this.a.a(new Status(i));
        }
    }

    private static final class s extends a {
        private final com.google.android.gms.internal.ahl.b<Status> a;
        private final com.google.android.gms.games.video.f.d b;

        public s(com.google.android.gms.internal.ahl.b<Status> bVar, com.google.android.gms.games.video.f.d dVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
            this.b = (com.google.android.gms.games.video.f.d) com.google.android.gms.common.internal.d.a(dVar, "Callback must not be null");
        }

        public void d(Status status) {
            this.a.a(status);
        }

        public void i(int i) {
            this.b.a(i);
        }
    }

    private static final class t extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.video.f.e> a;

        public t(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.video.f.e> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void g(int i, Bundle bundle) {
            this.a.a(new u(new Status(i), com.google.android.gms.games.video.a.a(bundle)));
        }
    }

    private static final class u implements com.google.android.gms.games.video.f.e {
        private final Status a;
        private final com.google.android.gms.games.video.a b;

        u(Status status, com.google.android.gms.games.video.a aVar) {
            this.a = status;
            this.b = aVar;
        }

        public Status a() {
            return this.a;
        }

        public com.google.android.gms.games.video.a b() {
            return this.b;
        }
    }

    private static final class v extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.video.f.f> a;

        public v(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.video.f.f> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void a(int i, Uri uri) {
            this.a.a(new w(new Status(i), uri));
        }
    }

    private static final class w implements com.google.android.gms.games.video.f.f {
        private final Status a;
        private final Uri b;

        w(Status status, Uri uri) {
            this.a = status;
            this.b = uri;
        }

        public Status a() {
            return this.a;
        }
    }

    private static final class x extends a {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.games.video.f.g> a;

        x(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.video.f.g> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void a(int i, boolean z, boolean z2) {
            this.a.a(new y(new Status(i), z, z2));
        }
    }

    private static final class y implements com.google.android.gms.games.video.f.g {
        private final Status a;
        private final boolean b;
        private final boolean c;

        y(Status status, boolean z, boolean z2) {
            this.a = status;
            this.b = z;
            this.c = z2;
        }

        public Status a() {
            return this.a;
        }
    }

    private static final class z extends a {
        private final com.google.android.gms.internal.ahl.b<Status> a;

        z(com.google.android.gms.internal.ahl.b<Status> bVar) {
            this.a = (com.google.android.gms.internal.ahl.b) com.google.android.gms.common.internal.d.a(bVar, "Holder must not be null");
        }

        public void e(int i) {
            this.a.a(new Status(i));
        }
    }

    public d(Context context, Looper looper, com.google.android.gms.common.internal.s sVar, c$c com_google_android_gms_games_c_c, com.google.android.gms.common.api.g.b bVar, com.google.android.gms.common.api.g.c cVar) {
        super(context, looper, 1, sVar, bVar, cVar);
        this.e = sVar.h();
        this.j = new Binder();
        this.h = n.a(this, sVar.d());
        a(sVar.j());
        this.k = (long) hashCode();
        this.l = com_google_android_gms_games_c_c;
    }

    private void X() {
        this.f = null;
        this.g = null;
    }

    private void a(RemoteException remoteException) {
        h.b("GamesClientImpl", "service died", remoteException);
    }

    private static Room b(DataHolder dataHolder) {
        com.google.android.gms.games.multiplayer.realtime.c cVar = new com.google.android.gms.games.multiplayer.realtime.c(dataHolder);
        Room room = null;
        try {
            if (cVar.c() > 0) {
                room = (Room) ((Room) cVar.a(0)).a();
            }
            cVar.b();
            return room;
        } catch (Throwable th) {
            cVar.b();
        }
    }

    public Intent K() {
        try {
            return ((k) G()).p();
        } catch (RemoteException e) {
            a(e);
            return null;
        }
    }

    public int L() {
        try {
            return ((k) G()).r();
        } catch (RemoteException e) {
            a(e);
            return 4368;
        }
    }

    public String M() {
        try {
            return ((k) G()).a();
        } catch (RemoteException e) {
            a(e);
            return null;
        }
    }

    public int N() {
        try {
            return ((k) G()).i();
        } catch (RemoteException e) {
            a(e);
            return -1;
        }
    }

    public Intent O() {
        try {
            return ((k) G()).u();
        } catch (RemoteException e) {
            a(e);
            return null;
        }
    }

    public int P() {
        try {
            return ((k) G()).s();
        } catch (RemoteException e) {
            a(e);
            return -1;
        }
    }

    public int Q() {
        try {
            return ((k) G()).t();
        } catch (RemoteException e) {
            a(e);
            return -1;
        }
    }

    public int R() {
        try {
            return ((k) G()).w();
        } catch (RemoteException e) {
            a(e);
            return -1;
        }
    }

    public int S() {
        try {
            return ((k) G()).x();
        } catch (RemoteException e) {
            a(e);
            return -1;
        }
    }

    public Intent T() {
        try {
            return ((k) G()).A();
        } catch (RemoteException e) {
            a(e);
            return null;
        }
    }

    public boolean U() {
        try {
            return ((k) G()).C();
        } catch (RemoteException e) {
            a(e);
            return false;
        }
    }

    public void V() {
        try {
            ((k) G()).h(this.k);
        } catch (RemoteException e) {
            a(e);
        }
    }

    public void W() {
        if (t()) {
            try {
                ((k) G()).c();
            } catch (RemoteException e) {
                a(e);
            }
        }
    }

    public int a(ail<com.google.android.gms.games.multiplayer.realtime.b.a> com_google_android_gms_internal_ail_com_google_android_gms_games_multiplayer_realtime_b_a, byte[] bArr, String str, String str2) {
        try {
            return ((k) G()).a(new du(com_google_android_gms_internal_ail_com_google_android_gms_games_multiplayer_realtime_b_a), bArr, str, str2);
        } catch (RemoteException e) {
            a(e);
            return -1;
        }
    }

    public int a(byte[] bArr, String str) {
        try {
            return ((k) G()).a(bArr, str, null);
        } catch (RemoteException e) {
            a(e);
            return -1;
        }
    }

    public int a(byte[] bArr, String str, String[] strArr) {
        com.google.android.gms.common.internal.d.a(strArr, "Participant IDs must not be null");
        try {
            return ((k) G()).a(bArr, str, strArr);
        } catch (RemoteException e) {
            a(e);
            return -1;
        }
    }

    public Intent a(int i, int i2, boolean z) {
        try {
            return ((k) G()).a(i, i2, z);
        } catch (RemoteException e) {
            a(e);
            return null;
        }
    }

    public Intent a(int i, byte[] bArr, int i2, Bitmap bitmap, String str) {
        try {
            Intent a = ((k) G()).a(i, bArr, i2, str);
            com.google.android.gms.common.internal.d.a(bitmap, "Must provide a non null icon");
            a.putExtra("com.google.android.gms.games.REQUEST_ITEM_ICON", bitmap);
            return a;
        } catch (RemoteException e) {
            a(e);
            return null;
        }
    }

    public Intent a(PlayerEntity playerEntity) {
        try {
            return ((k) G()).a(playerEntity);
        } catch (RemoteException e) {
            a(e);
            return null;
        }
    }

    public Intent a(Room room, int i) {
        try {
            return ((k) G()).a((RoomEntity) room.a(), i);
        } catch (RemoteException e) {
            a(e);
            return null;
        }
    }

    public Intent a(String str, int i, int i2) {
        try {
            return ((k) G()).a(str, i, i2);
        } catch (RemoteException e) {
            a(e);
            return null;
        }
    }

    public Intent a(String str, boolean z, boolean z2, int i) {
        try {
            return ((k) G()).a(str, z, z2, i);
        } catch (RemoteException e) {
            a(e);
            return null;
        }
    }

    public Intent a(int[] iArr) {
        try {
            return ((k) G()).a(iArr);
        } catch (RemoteException e) {
            a(e);
            return null;
        }
    }

    protected k a(IBinder iBinder) {
        return com.google.android.gms.games.internal.k.a.a(iBinder);
    }

    protected String a() {
        return "com.google.android.gms.games.service.START";
    }

    public String a(boolean z) {
        if (z && this.f != null) {
            return this.f.c();
        }
        try {
            return ((k) G()).e();
        } catch (RemoteException e) {
            a(e);
            return null;
        }
    }

    protected Set<Scope> a(Set<Scope> set) {
        Scope scope = new Scope(com.google.android.gms.common.f.f);
        Scope scope2 = new Scope("https://www.googleapis.com/auth/games.firstparty");
        int i = 0;
        boolean z = false;
        for (Scope scope3 : set) {
            int i2;
            boolean z2;
            if (scope3.equals(scope)) {
                i2 = i;
                z2 = true;
            } else if (scope3.equals(scope2)) {
                i2 = 1;
                z2 = z;
            } else {
                i2 = i;
                z2 = z;
            }
            z = z2;
            i = i2;
        }
        if (i != 0) {
            com.google.android.gms.common.internal.d.a(!z, "Cannot have both %s and %s!", new Object[]{com.google.android.gms.common.f.f, "https://www.googleapis.com/auth/games.firstparty"});
        } else {
            com.google.android.gms.common.internal.d.a(z, "Games APIs requires %s to function.", new Object[]{com.google.android.gms.common.f.f});
        }
        return set;
    }

    protected void a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0 && bundle != null) {
            bundle.setClassLoader(d.class.getClassLoader());
            this.i = bundle.getBoolean("show_welcome_popup");
            this.f = (PlayerEntity) bundle.getParcelable("com.google.android.gms.games.current_player");
            this.g = (GameEntity) bundle.getParcelable("com.google.android.gms.games.current_game");
        }
        super.a(i, iBinder, bundle, i2);
    }

    public void a(Account account) {
        ((k) G()).a(account);
    }

    public void a(Account account, byte[] bArr) {
        ((k) G()).a(account, bArr);
    }

    public void a(IBinder iBinder, Bundle bundle) {
        if (t()) {
            try {
                ((k) G()).a(iBinder, bundle);
            } catch (RemoteException e) {
                a(e);
            }
        }
    }

    public void a(View view) {
        this.h.a(view);
    }

    public void a(ConnectionResult connectionResult) {
        super.a(connectionResult);
        this.i = false;
    }

    public void a(com.google.android.gms.common.internal.p.f fVar) {
        X();
        super.a(fVar);
    }

    public void a(c$a<Status> com_google_android_gms_games_c_a_com_google_android_gms_common_api_Status, String str, VideoConfiguration videoConfiguration) {
        ((k) G()).a(new o(com_google_android_gms_games_c_a_com_google_android_gms_common_api_Status), str, videoConfiguration);
    }

    public void a(@NonNull k kVar) {
        super.a(kVar);
        if (this.i) {
            this.h.a();
            this.i = false;
        }
        if (!this.l.a && !this.l.i) {
            b(kVar);
        }
    }

    public void a(Snapshot snapshot) {
        SnapshotContents d = snapshot.d();
        com.google.android.gms.common.internal.d.a(!d.d(), "Snapshot already closed");
        Contents b = d.b();
        d.c();
        try {
            ((k) G()).a(b);
        } catch (RemoteException e) {
            a(e);
        }
    }

    public void a(com.google.android.gms.internal.ahl.b<c$g> bVar) {
        ((k) G()).j(new az(bVar));
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.multiplayer.c.a> bVar, int i) {
        ((k) G()).a(new bl(bVar), i);
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.request.g.b> bVar, int i, int i2, int i3) {
        ((k) G()).a(new ea(bVar), i, i2, i3);
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.appcontent.i.a> bVar, int i, String str, String[] strArr, boolean z) {
        ((k) G()).a(new h(bVar), i, str, strArr, z);
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.n.a> bVar, int i, boolean z, boolean z2) {
        ((k) G()).a(new dk(bVar), i, z, z2);
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.multiplayer.turnbased.g.e> bVar, int i, int[] iArr) {
        ((k) G()).a(new fb(bVar), i, iArr);
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.n.a> bVar, Account account) {
        ((k) G()).a(new dk(bVar), account);
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.a.m.c> bVar, com.google.android.gms.games.a.f fVar, int i, int i2) {
        ((k) G()).a(new bq(bVar), fVar.a().a(), i, i2);
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.multiplayer.turnbased.g.b> bVar, com.google.android.gms.games.multiplayer.turnbased.d dVar) {
        ((k) G()).a(new ew(bVar), dVar.a(), dVar.b(), dVar.c(), dVar.d());
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.snapshot.g.a> bVar, Snapshot snapshot, com.google.android.gms.games.snapshot.d dVar) {
        SnapshotContents d = snapshot.d();
        com.google.android.gms.common.internal.d.a(!d.d(), "Snapshot already closed");
        BitmapTeleporter c = dVar.c();
        if (c != null) {
            c.a(B().getCacheDir());
        }
        Contents b = d.b();
        d.c();
        ((k) G()).a(new el(bVar), snapshot.c().e(), (SnapshotMetadataChangeEntity) dVar, b);
    }

    public void a(com.google.android.gms.internal.ahl.b<Status> bVar, VideoConfiguration videoConfiguration, com.google.android.gms.games.video.f.d dVar) {
        ((k) G()).a(new s(bVar, dVar), videoConfiguration);
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.achievement.c.b> bVar, String str) {
        i iVar;
        if (bVar == null) {
            iVar = null;
        } else {
            Object fVar = new f(bVar);
        }
        ((k) G()).a(iVar, str, this.h.c(), this.h.b());
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.achievement.c.b> bVar, String str, int i) {
        ((k) G()).a(bVar == null ? null : new f(bVar), str, i, this.h.c(), this.h.b());
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.a.m.c> bVar, String str, int i, int i2, int i3, boolean z) {
        ((k) G()).a(new bq(bVar), str, i, i2, i3, z);
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.n.a> bVar, String str, int i, boolean z, boolean z2) {
        Object obj = -1;
        switch (str.hashCode()) {
            case 156408498:
                if (str.equals("played_with")) {
                    obj = null;
                    break;
                }
                break;
        }
        switch (obj) {
            case null:
                ((k) G()).d(new dk(bVar), str, i, z, z2);
                return;
            default:
                String str2 = "Invalid player collection: ";
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.multiplayer.turnbased.g.e> bVar, String str, int i, int[] iArr) {
        ((k) G()).a(new fb(bVar), str, i, iArr);
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.a.m.d> bVar, String str, long j, String str2) {
        ((k) G()).a(bVar == null ? null : new et(bVar), str, j, str2);
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.multiplayer.turnbased.g.c> bVar, String str, String str2) {
        ((k) G()).c(new ex(bVar), str, str2);
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.a.m.b> bVar, String str, String str2, int i, int i2) {
        ((k) G()).a(new df(bVar), str, str2, i, i2);
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.request.g.b> bVar, String str, String str2, int i, int i2, int i3) {
        ((k) G()).a(new ea(bVar), str, str2, i, i2, i3);
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.a.m.c> bVar, String str, String str2, int i, int i2, int i3, boolean z) {
        ((k) G()).a(new bq(bVar), str, str2, i, i2, i3, z);
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.n.a> bVar, String str, String str2, int i, boolean z, boolean z2) {
        Object obj = -1;
        switch (str.hashCode()) {
            case -1049482625:
                if (str.equals("nearby")) {
                    obj = 2;
                    break;
                }
                break;
            case 156408498:
                if (str.equals("played_with")) {
                    obj = 1;
                    break;
                }
                break;
            case 782949780:
                if (str.equals("circled")) {
                    obj = null;
                    break;
                }
                break;
        }
        switch (obj) {
            case null:
            case 1:
            case 2:
                ((k) G()).a(new dk(bVar), str, str2, i, z, z2);
                return;
            default:
                String str3 = "Invalid player collection: ";
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.snapshot.g.d> bVar, String str, String str2, com.google.android.gms.games.snapshot.d dVar, SnapshotContents snapshotContents) {
        com.google.android.gms.common.internal.d.a(!snapshotContents.d(), "SnapshotContents already closed");
        BitmapTeleporter c = dVar.c();
        if (c != null) {
            c.a(B().getCacheDir());
        }
        Contents b = snapshotContents.b();
        snapshotContents.c();
        ((k) G()).a(new en(bVar), str, str2, (SnapshotMetadataChangeEntity) dVar, b);
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.a.m.a> bVar, String str, String str2, boolean z) {
        ((k) G()).b(new br(bVar), str, str2, z);
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.quest.f.c> bVar, String str, String str2, boolean z, String[] strArr) {
        this.a.b();
        ((k) G()).a(new ds(bVar), str, str2, strArr, z);
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.quest.f.c> bVar, String str, String str2, int[] iArr, int i, boolean z) {
        this.a.b();
        ((k) G()).a(new ds(bVar), str, str2, iArr, i, z);
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.request.g.d> bVar, String str, String str2, String[] strArr) {
        ((k) G()).a(new eb(bVar), str, str2, strArr);
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.n.a> bVar, String str, boolean z) {
        ((k) G()).f(new dk(bVar), str, z);
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.snapshot.g.d> bVar, String str, boolean z, int i) {
        ((k) G()).a(new en(bVar), str, z, i);
    }

    public void a(com.google.android.gms.internal.ahl.b<n$g> bVar, String str, boolean z, String str2, boolean z2, boolean z3) {
        ((k) G()).a(new aw(bVar), str, z, str2, z2, z3);
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.multiplayer.turnbased.g.f> bVar, String str, byte[] bArr, String str2, ParticipantResult[] participantResultArr) {
        ((k) G()).a(new fa(bVar), str, bArr, str2, participantResultArr);
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.multiplayer.turnbased.g.f> bVar, String str, byte[] bArr, ParticipantResult[] participantResultArr) {
        ((k) G()).a(new fa(bVar), str, bArr, participantResultArr);
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.request.g.c> bVar, String str, String[] strArr, int i, byte[] bArr, int i2) {
        ((k) G()).a(new dy(bVar), str, strArr, i, bArr, i2);
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.n.a> bVar, boolean z) {
        ((k) G()).c(new dk(bVar), z);
    }

    public void a(com.google.android.gms.internal.ahl.b<n$b> bVar, boolean z, boolean z2) {
        ((k) G()).a(new dm(bVar), z, z2);
    }

    public void a(com.google.android.gms.internal.ahl.b<Status> bVar, boolean z, boolean z2, Bundle bundle) {
        ((k) G()).a(new ak(bVar), z, z2, bundle);
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.event.c.a> bVar, boolean z, String... strArr) {
        this.a.b();
        ((k) G()).a(new ao(bVar), z, strArr);
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.quest.f.c> bVar, int[] iArr, int i, boolean z) {
        this.a.b();
        ((k) G()).a(new ds(bVar), iArr, i, z);
    }

    public void a(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.n.a> bVar, String[] strArr) {
        ((k) G()).c(new dk(bVar), strArr);
    }

    public void a(ail<com.google.android.gms.games.multiplayer.e> com_google_android_gms_internal_ail_com_google_android_gms_games_multiplayer_e) {
        try {
            ((k) G()).a(new bi(com_google_android_gms_internal_ail_com_google_android_gms_games_multiplayer_e), this.k);
        } catch (RemoteException e) {
            a(e);
        }
    }

    public void a(ail<com.google.android.gms.games.multiplayer.realtime.h> com_google_android_gms_internal_ail_com_google_android_gms_games_multiplayer_realtime_h, ail<com.google.android.gms.games.multiplayer.realtime.g> com_google_android_gms_internal_ail_com_google_android_gms_games_multiplayer_realtime_g, ail<com.google.android.gms.games.multiplayer.realtime.a> com_google_android_gms_internal_ail_com_google_android_gms_games_multiplayer_realtime_a, com.google.android.gms.games.multiplayer.realtime.d dVar) {
        try {
            ((k) G()).a(new ed(com_google_android_gms_internal_ail_com_google_android_gms_games_multiplayer_realtime_h, com_google_android_gms_internal_ail_com_google_android_gms_games_multiplayer_realtime_g, com_google_android_gms_internal_ail_com_google_android_gms_games_multiplayer_realtime_a), this.j, dVar.e(), dVar.f(), dVar.g(), false, this.k);
        } catch (RemoteException e) {
            a(e);
        }
    }

    public void a(ail<com.google.android.gms.games.multiplayer.realtime.h> com_google_android_gms_internal_ail_com_google_android_gms_games_multiplayer_realtime_h, String str) {
        try {
            ((k) G()).c(new ed(com_google_android_gms_internal_ail_com_google_android_gms_games_multiplayer_realtime_h), str);
        } catch (RemoteException e) {
            a(e);
        }
    }

    public void a(String str) {
        try {
            ((k) G()).f(str);
        } catch (RemoteException e) {
            a(e);
        }
    }

    public void a(String str, int i) {
        this.a.a(str, i);
    }

    public void a(String str, com.google.android.gms.internal.ahl.b<com.google.android.gms.games.c.e> bVar) {
        com.google.android.gms.common.internal.d.a(str, "Please provide a valid serverClientId");
        ((k) G()).a(str, new ba(bVar));
    }

    public Intent b(int i, int i2, boolean z) {
        try {
            return ((k) G()).b(i, i2, z);
        } catch (RemoteException e) {
            a(e);
            return null;
        }
    }

    public Intent b(String str) {
        try {
            return ((k) G()).i(str);
        } catch (RemoteException e) {
            a(e);
            return null;
        }
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    public void b(k kVar) {
        try {
            kVar.a(new dl(this.h), this.k);
        } catch (RemoteException e) {
            a(e);
        }
    }

    public void b(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.e.c> bVar) {
        ((k) G()).d(new ay(bVar));
    }

    public void b(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.video.f.a> bVar, int i) {
        ((k) G()).c(new k(bVar), i);
    }

    public void b(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.n.a> bVar, int i, boolean z, boolean z2) {
        ((k) G()).b(new dk(bVar), i, z, z2);
    }

    public void b(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.achievement.c.b> bVar, String str) {
        i iVar;
        if (bVar == null) {
            iVar = null;
        } else {
            Object fVar = new f(bVar);
        }
        ((k) G()).b(iVar, str, this.h.c(), this.h.b());
    }

    public void b(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.achievement.c.b> bVar, String str, int i) {
        ((k) G()).b(bVar == null ? null : new f(bVar), str, i, this.h.c(), this.h.b());
    }

    public void b(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.a.m.c> bVar, String str, int i, int i2, int i3, boolean z) {
        ((k) G()).b(new bq(bVar), str, i, i2, i3, z);
    }

    public void b(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.n.a> bVar, String str, int i, boolean z, boolean z2) {
        ((k) G()).b(new dk(bVar), str, i, z, z2);
    }

    public void b(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.quest.f.b> bVar, String str, String str2) {
        this.a.b();
        ((k) G()).f(new dq(bVar, str2), str, str2);
    }

    public void b(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.a.m.c> bVar, String str, String str2, int i, int i2, int i3, boolean z) {
        ((k) G()).b(new bq(bVar), str, str2, i, i2, i3, z);
    }

    public void b(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.n.a> bVar, String str, String str2, int i, boolean z, boolean z2) {
        ((k) G()).b(new dk(bVar), str, str2, i, z, z2);
    }

    public void b(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.achievement.c.a> bVar, String str, String str2, boolean z) {
        ((k) G()).a(new g(bVar), str, str2, z);
    }

    public void b(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.a.m.a> bVar, String str, boolean z) {
        ((k) G()).c(new br(bVar), str, z);
    }

    public void b(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.a.m.a> bVar, boolean z) {
        ((k) G()).b(new br(bVar), z);
    }

    public void b(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.quest.f.c> bVar, boolean z, String[] strArr) {
        this.a.b();
        ((k) G()).a(new ds(bVar), strArr, z);
    }

    public void b(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.request.g.d> bVar, String[] strArr) {
        ((k) G()).a(new eb(bVar), strArr);
    }

    public void b(ail<com.google.android.gms.games.multiplayer.turnbased.b> com_google_android_gms_internal_ail_com_google_android_gms_games_multiplayer_turnbased_b) {
        try {
            ((k) G()).b(new cs(com_google_android_gms_internal_ail_com_google_android_gms_games_multiplayer_turnbased_b), this.k);
        } catch (RemoteException e) {
            a(e);
        }
    }

    public void b(ail<com.google.android.gms.games.multiplayer.realtime.h> com_google_android_gms_internal_ail_com_google_android_gms_games_multiplayer_realtime_h, ail<com.google.android.gms.games.multiplayer.realtime.g> com_google_android_gms_internal_ail_com_google_android_gms_games_multiplayer_realtime_g, ail<com.google.android.gms.games.multiplayer.realtime.a> com_google_android_gms_internal_ail_com_google_android_gms_games_multiplayer_realtime_a, com.google.android.gms.games.multiplayer.realtime.d dVar) {
        try {
            ((k) G()).a(new ed(com_google_android_gms_internal_ail_com_google_android_gms_games_multiplayer_realtime_h, com_google_android_gms_internal_ail_com_google_android_gms_games_multiplayer_realtime_g, com_google_android_gms_internal_ail_com_google_android_gms_games_multiplayer_realtime_a), this.j, dVar.b(), false, this.k);
        } catch (RemoteException e) {
            a(e);
        }
    }

    public void b(String str, int i) {
        try {
            ((k) G()).b(str, i);
        } catch (RemoteException e) {
            a(e);
        }
    }

    protected Bundle c() {
        String locale = B().getResources().getConfiguration().locale.toString();
        Bundle a = this.l.a();
        a.putString("com.google.android.gms.games.key.gamePackageName", this.e);
        a.putString("com.google.android.gms.games.key.desiredLocale", locale);
        a.putParcelable("com.google.android.gms.games.key.popupWindowToken", new BinderWrapper(this.h.c()));
        a.putInt("com.google.android.gms.games.key.API_VERSION", 4);
        a.putBundle("com.google.android.gms.games.key.signInOptions", com.google.android.gms.signin.internal.g.a(J()));
        return a;
    }

    public void c(int i) {
        this.h.b(i);
    }

    public void c(com.google.android.gms.internal.ahl.b<Status> bVar) {
        this.a.b();
        ((k) G()).a(new ek(bVar));
    }

    public void c(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.social.b.d> bVar, int i) {
        ((k) G()).b(new bn(bVar), i);
    }

    public void c(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.n.a> bVar, int i, boolean z, boolean z2) {
        ((k) G()).c(new dk(bVar), i, z, z2);
    }

    public void c(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.multiplayer.turnbased.g.b> bVar, String str) {
        ((k) G()).k(new ew(bVar), str);
    }

    public void c(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.video.f.j> bVar, String str, int i) {
        ((k) G()).d(new bu(bVar), str, i);
    }

    public void c(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.multiplayer.turnbased.g.b> bVar, String str, String str2) {
        ((k) G()).d(new ew(bVar), str, str2);
    }

    public void c(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.snapshot.g.c> bVar, String str, String str2, boolean z) {
        ((k) G()).c(new eo(bVar), str, str2, z);
    }

    public void c(com.google.android.gms.internal.ahl.b<Status> bVar, String str, boolean z) {
        ((k) G()).h(new ff(bVar), str, z);
    }

    public void c(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.achievement.c.a> bVar, boolean z) {
        ((k) G()).a(new g(bVar), z);
    }

    public void c(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.request.g.d> bVar, String[] strArr) {
        ((k) G()).b(new eb(bVar), strArr);
    }

    public void c(ail<com.google.android.gms.games.quest.e> com_google_android_gms_internal_ail_com_google_android_gms_games_quest_e) {
        try {
            ((k) G()).d(new dr(com_google_android_gms_internal_ail_com_google_android_gms_games_quest_e), this.k);
        } catch (RemoteException e) {
            a(e);
        }
    }

    public void c(String str) {
        try {
            ((k) G()).a(str, this.h.c(), this.h.b());
        } catch (RemoteException e) {
            a(e);
        }
    }

    public void c(String str, int i) {
        try {
            ((k) G()).a(str, i);
        } catch (RemoteException e) {
            a(e);
        }
    }

    public void d(int i) {
        try {
            ((k) G()).a(i);
        } catch (RemoteException e) {
            a(e);
        }
    }

    public void d(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.video.f.b> bVar) {
        ((k) G()).l(new m(bVar));
    }

    public void d(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.n.a> bVar, int i, boolean z, boolean z2) {
        ((k) G()).e(new dk(bVar), i, z, z2);
    }

    public void d(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.multiplayer.turnbased.g.b> bVar, String str) {
        ((k) G()).l(new ew(bVar), str);
    }

    public void d(com.google.android.gms.internal.ahl.b<n$f> bVar, String str, int i) {
        ((k) G()).b(new dj(bVar), str, i);
    }

    public void d(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.multiplayer.turnbased.g.b> bVar, String str, String str2) {
        ((k) G()).e(new ew(bVar), str, str2);
    }

    public void d(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.a.m.a> bVar, String str, boolean z) {
        ((k) G()).d(new br(bVar), str, z);
    }

    public void d(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.event.c.a> bVar, boolean z) {
        this.a.b();
        ((k) G()).f(new ao(bVar), z);
    }

    public void d(ail<com.google.android.gms.games.request.f> com_google_android_gms_internal_ail_com_google_android_gms_games_request_f) {
        try {
            ((k) G()).c(new dv(com_google_android_gms_internal_ail_com_google_android_gms_games_request_f), this.k);
        } catch (RemoteException e) {
            a(e);
        }
    }

    public void e(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.video.f.e> bVar) {
        ((k) G()).v(new t(bVar));
    }

    public void e(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.n.a> bVar, int i, boolean z, boolean z2) {
        ((k) G()).f(new dk(bVar), i, z, z2);
    }

    public void e(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.multiplayer.turnbased.g.c> bVar, String str) {
        ((k) G()).n(new ex(bVar), str);
    }

    public void e(com.google.android.gms.internal.ahl.b<n$f> bVar, String str, int i) {
        ((k) G()).c(new dj(bVar), str, i);
    }

    public void e(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.g.b> bVar, String str, boolean z) {
        ((k) G()).a(new as(bVar), str, z);
    }

    public void e(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.stats.c.a> bVar, boolean z) {
        ((k) G()).i(new dg(bVar), z);
    }

    public void e(ail<com.google.android.gms.games.video.f.c> com_google_android_gms_internal_ail_com_google_android_gms_games_video_f_c) {
        try {
            ((k) G()).f(new p(com_google_android_gms_internal_ail_com_google_android_gms_games_video_f_c), this.k);
        } catch (RemoteException e) {
            a(e);
        }
    }

    public void f() {
        this.i = false;
        if (t()) {
            try {
                k kVar = (k) G();
                kVar.c();
                this.a.b();
                kVar.a(this.k);
            } catch (RemoteException e) {
                h.a("GamesClientImpl", "Failed to notify client disconnect.");
            }
        }
        super.f();
    }

    public void f(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.video.f.g> bVar) {
        ((k) G()).s(new x(bVar));
    }

    public void f(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.multiplayer.turnbased.g.a> bVar, String str) {
        ((k) G()).m(new ev(bVar), str);
    }

    public void f(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.multiplayer.c.a> bVar, String str, int i) {
        ((k) G()).b(new bl(bVar), str, i, false);
    }

    public void f(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.n.a> bVar, String str, boolean z) {
        ((k) G()).g(new ej(bVar), str, z);
    }

    public void f(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.snapshot.g.c> bVar, boolean z) {
        ((k) G()).d(new eo(bVar), z);
    }

    public Bundle g() {
        try {
            Bundle b = ((k) G()).b();
            if (b == null) {
                return b;
            }
            b.setClassLoader(d.class.getClassLoader());
            return b;
        } catch (RemoteException e) {
            a(e);
            return null;
        }
    }

    public void g(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.video.f.h> bVar) {
        ((k) G()).q(new ab(bVar));
    }

    public void g(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.multiplayer.turnbased.g.d> bVar, String str) {
        ((k) G()).o(new ey(bVar), str);
    }

    public void g(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.request.g.a> bVar, String str, int i) {
        ((k) G()).a(new dz(bVar), str, i);
    }

    public void g(com.google.android.gms.internal.ahl.b<Status> bVar, boolean z) {
        ((k) G()).m(new r(bVar), z);
    }

    public String h() {
        try {
            return ((k) G()).d();
        } catch (RemoteException e) {
            a(e);
            return null;
        }
    }

    public void h(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.video.f.i> bVar) {
        ((k) G()).r(new ad(bVar));
    }

    public void h(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.quest.f.a> bVar, String str) {
        this.a.b();
        ((k) G()).t(new do(bVar), str);
    }

    public void h(com.google.android.gms.internal.ahl.b<Status> bVar, boolean z) {
        ((k) G()).h(new dn(bVar), z);
    }

    public Player i() {
        F();
        synchronized (this) {
            if (this.f == null) {
                com.google.android.gms.games.j jVar;
                try {
                    jVar = new com.google.android.gms.games.j(((k) G()).f());
                    if (jVar.c() > 0) {
                        this.f = (PlayerEntity) ((Player) jVar.a(0)).a();
                    }
                    jVar.b();
                } catch (RemoteException e) {
                    a(e);
                } catch (Throwable th) {
                    jVar.b();
                }
            }
        }
        return this.f;
    }

    public void i(com.google.android.gms.internal.ahl.b<Status> bVar) {
        ((k) G()).t(new bd(bVar));
    }

    public void i(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.snapshot.g.b> bVar, String str) {
        ((k) G()).q(new em(bVar), str);
    }

    public void i(com.google.android.gms.internal.ahl.b<Status> bVar, boolean z) {
        ((k) G()).j(new al(bVar), z);
    }

    public Game j() {
        F();
        synchronized (this) {
            if (this.g == null) {
                com.google.android.gms.games.a aVar;
                try {
                    aVar = new com.google.android.gms.games.a(((k) G()).h());
                    if (aVar.c() > 0) {
                        this.g = (GameEntity) ((Game) aVar.a(0)).a();
                    }
                    aVar.b();
                } catch (RemoteException e) {
                    a(e);
                } catch (Throwable th) {
                    aVar.b();
                }
            }
        }
        return this.g;
    }

    public void j(com.google.android.gms.internal.ahl.b<Status> bVar) {
        ((k) G()).o(new z(bVar));
    }

    public void j(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.e.a> bVar, String str) {
        ((k) G()).f(new aq(bVar), str);
    }

    public void j(com.google.android.gms.internal.ahl.b<Status> bVar, boolean z) {
        ((k) G()).k(new fd(bVar), z);
    }

    public Intent k() {
        try {
            return ((k) G()).k();
        } catch (RemoteException e) {
            a(e);
            return null;
        }
    }

    public void k(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.video.f.j> bVar) {
        ((k) G()).k(new bu(bVar));
    }

    public void k(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.e.b> bVar, String str) {
        ((k) G()).p(new av(bVar), str);
    }

    public void k(com.google.android.gms.internal.ahl.b<Status> bVar, boolean z) {
        ((k) G()).l(new fh(bVar), z);
    }

    public Intent l() {
        try {
            return ((k) G()).l();
        } catch (RemoteException e) {
            a(e);
            return null;
        }
    }

    public void l(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.video.f.f> bVar) {
        ((k) G()).u(new v(bVar));
    }

    public void l(com.google.android.gms.internal.ahl.b<n$d> bVar, String str) {
        ((k) G()).r(new di(bVar), str);
    }

    public void l(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.g.a> bVar, boolean z) {
        ((k) G()).e(new aj(bVar), z);
    }

    public Intent m() {
        try {
            return ((k) G()).m();
        } catch (RemoteException e) {
            a(e);
            return null;
        }
    }

    public void m(com.google.android.gms.internal.ahl.b<n$c> bVar) {
        ((k) G()).p(new es(bVar));
    }

    public void m(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.multiplayer.c.a> bVar, String str) {
        ((k) G()).j(new bl(bVar), str);
    }

    public Intent n() {
        try {
            return ((k) G()).n();
        } catch (RemoteException e) {
            a(e);
            return null;
        }
    }

    public void n(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.g.d> bVar) {
        ((k) G()).s(new bg(bVar), null);
    }

    public void n(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.g.c> bVar, String str) {
        ((k) G()).i(new au(bVar), str);
    }

    public void o() {
        try {
            ((k) G()).b(this.k);
        } catch (RemoteException e) {
            a(e);
        }
    }

    public void o(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.social.b.c> bVar, String str) {
        ((k) G()).u(new eh(bVar), str);
    }

    public void p() {
        try {
            ((k) G()).c(this.k);
        } catch (RemoteException e) {
            a(e);
        }
    }

    public void p(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.social.b.c> bVar, String str) {
        ((k) G()).v(new d(bVar), str);
    }

    public void q() {
        try {
            ((k) G()).e(this.k);
        } catch (RemoteException e) {
            a(e);
        }
    }

    public void q(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.social.b.c> bVar, String str) {
        ((k) G()).w(new be(bVar), str);
    }

    public void r() {
        try {
            ((k) G()).d(this.k);
        } catch (RemoteException e) {
            a(e);
        }
    }

    public void r(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.social.b.c> bVar, String str) {
        ((k) G()).x(new i(bVar), str);
    }

    public Intent s() {
        try {
            return ((k) G()).o();
        } catch (RemoteException e) {
            a(e);
            return null;
        }
    }

    public void s(com.google.android.gms.internal.ahl.b<com.google.android.gms.games.n.a> bVar, String str) {
        ((k) G()).y(new dh(bVar), str);
    }

    public boolean v() {
        return true;
    }
}
