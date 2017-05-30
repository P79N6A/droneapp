package com.google.android.gms.internal;

import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.j;
import com.google.android.gms.drive.metadata.internal.k;
import com.google.android.gms.drive.metadata.internal.m;
import com.google.android.gms.drive.metadata.internal.o;
import com.google.android.gms.drive.metadata.internal.p;
import com.google.android.gms.drive.metadata.internal.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ajw {
    public static final q A = new q("lastModifyingUser", 6000000);
    public static final q B = new q("sharingUser", 6000000);
    public static final m C = new m(4100000);
    public static final d D = new d("quotaBytesUsed", 4300000);
    public static final f E = new f("starred", 4100000);
    public static final com.google.android.gms.drive.metadata.a<BitmapTeleporter> F = new AnonymousClass2("thumbnail", Collections.emptySet(), Collections.emptySet(), 4400000);
    public static final g G = new g("title", 4100000);
    public static final h H = new h("trashed", 4100000);
    public static final com.google.android.gms.drive.metadata.a<String> I = new p("webContentLink", 4300000);
    public static final com.google.android.gms.drive.metadata.a<String> J = new p("webViewLink", 4300000);
    public static final com.google.android.gms.drive.metadata.a<String> K = new p("uniqueIdentifier", 5000000);
    public static final com.google.android.gms.drive.metadata.internal.b L = new com.google.android.gms.drive.metadata.internal.b("writersCanShare", 6000000);
    public static final com.google.android.gms.drive.metadata.a<String> M = new p("role", 6000000);
    public static final com.google.android.gms.drive.metadata.a<String> N = new p("md5Checksum", 7000000);
    public static final e O = new e(7000000);
    public static final com.google.android.gms.drive.metadata.a<String> P = new p("recencyReason", 8000000);
    public static final com.google.android.gms.drive.metadata.a<Boolean> Q = new com.google.android.gms.drive.metadata.internal.b("subscribed", 8000000);
    public static final com.google.android.gms.drive.metadata.a<DriveId> a = ajz.a;
    public static final com.google.android.gms.drive.metadata.a<String> b = new p("alternateLink", 4300000);
    public static final a c = new a(5000000);
    public static final com.google.android.gms.drive.metadata.a<String> d = new p("description", 4300000);
    public static final com.google.android.gms.drive.metadata.a<String> e = new p("embedLink", 4300000);
    public static final com.google.android.gms.drive.metadata.a<String> f = new p("fileExtension", 4300000);
    public static final com.google.android.gms.drive.metadata.a<Long> g = new com.google.android.gms.drive.metadata.internal.g("fileSize", 4300000);
    public static final com.google.android.gms.drive.metadata.a<String> h = new p("folderColorRgb", 7500000);
    public static final com.google.android.gms.drive.metadata.a<Boolean> i = new com.google.android.gms.drive.metadata.internal.b("hasThumbnail", 4300000);
    public static final com.google.android.gms.drive.metadata.a<String> j = new p("indexableText", 4300000);
    public static final com.google.android.gms.drive.metadata.a<Boolean> k = new com.google.android.gms.drive.metadata.internal.b("isAppData", 4300000);
    public static final com.google.android.gms.drive.metadata.a<Boolean> l = new com.google.android.gms.drive.metadata.internal.b("isCopyable", 4300000);
    public static final com.google.android.gms.drive.metadata.a<Boolean> m = new com.google.android.gms.drive.metadata.internal.b("isEditable", 4100000);
    public static final com.google.android.gms.drive.metadata.a<Boolean> n = new AnonymousClass1("isExplicitlyTrashed", Collections.singleton("trashed"), Collections.emptySet(), 7000000);
    public static final com.google.android.gms.drive.metadata.a<Boolean> o = new com.google.android.gms.drive.metadata.internal.b("isLocalContentUpToDate", 7800000);
    public static final b p = new b("isPinned", 4100000);
    public static final com.google.android.gms.drive.metadata.a<Boolean> q = new com.google.android.gms.drive.metadata.internal.b("isOpenable", 7200000);
    public static final com.google.android.gms.drive.metadata.a<Boolean> r = new com.google.android.gms.drive.metadata.internal.b("isRestricted", 4300000);
    public static final com.google.android.gms.drive.metadata.a<Boolean> s = new com.google.android.gms.drive.metadata.internal.b("isShared", 4300000);
    public static final com.google.android.gms.drive.metadata.a<Boolean> t = new com.google.android.gms.drive.metadata.internal.b("isGooglePhotosFolder", 7000000);
    public static final com.google.android.gms.drive.metadata.a<Boolean> u = new com.google.android.gms.drive.metadata.internal.b("isGooglePhotosRootFolder", 7000000);
    public static final com.google.android.gms.drive.metadata.a<Boolean> v = new com.google.android.gms.drive.metadata.internal.b("isTrashable", 4400000);
    public static final com.google.android.gms.drive.metadata.a<Boolean> w = new com.google.android.gms.drive.metadata.internal.b("isViewed", 4300000);
    public static final c x = new c(4100000);
    public static final com.google.android.gms.drive.metadata.a<String> y = new p("originalFilename", 4300000);
    public static final com.google.android.gms.drive.metadata.g<String> z = new o("ownerNames", 4300000);

    class AnonymousClass1 extends com.google.android.gms.drive.metadata.internal.b {
        AnonymousClass1(String str, Collection collection, Collection collection2, int i) {
            super(str, collection, collection2, i);
        }

        protected Boolean a_(DataHolder dataHolder, int i, int i2) {
            return Boolean.valueOf(dataHolder.b("trashed", i, i2) == 2);
        }

        protected /* synthetic */ Object c(DataHolder dataHolder, int i, int i2) {
            return a_(dataHolder, i, i2);
        }
    }

    class AnonymousClass2 extends k<BitmapTeleporter> {
        AnonymousClass2(String str, Collection collection, Collection collection2, int i) {
            super(str, collection, collection2, i);
        }

        protected /* synthetic */ Object c(DataHolder dataHolder, int i, int i2) {
            return d(dataHolder, i, i2);
        }

        protected BitmapTeleporter d(DataHolder dataHolder, int i, int i2) {
            throw new IllegalStateException("Thumbnail field is write only");
        }
    }

    public static class a extends ajx implements com.google.android.gms.drive.metadata.c<AppVisibleCustomProperties> {
        public a(int i) {
            super(i);
        }
    }

    public static class b extends com.google.android.gms.drive.metadata.internal.b implements com.google.android.gms.drive.metadata.c<Boolean> {
        public b(String str, int i) {
            super(str, i);
        }
    }

    public static class c extends p implements com.google.android.gms.drive.metadata.c<String> {
        public c(int i) {
            super("mimeType", i);
        }
    }

    public static class d extends com.google.android.gms.drive.metadata.internal.g implements com.google.android.gms.drive.metadata.e<Long> {
        public d(String str, int i) {
            super(str, i);
        }
    }

    public static class e extends j<DriveSpace> {
        public e(int i) {
            super("spaces", Arrays.asList(new String[]{"inDriveSpace", "isAppData", "inGooglePhotosSpace"}), Collections.emptySet(), i);
        }

        protected /* synthetic */ Object c(DataHolder dataHolder, int i, int i2) {
            return e_(dataHolder, i, i2);
        }

        protected Collection<DriveSpace> e_(DataHolder dataHolder, int i, int i2) {
            Collection arrayList = new ArrayList();
            if (dataHolder.d("inDriveSpace", i, i2)) {
                arrayList.add(DriveSpace.a);
            }
            if (dataHolder.d("isAppData", i, i2)) {
                arrayList.add(DriveSpace.b);
            }
            if (dataHolder.d("inGooglePhotosSpace", i, i2)) {
                arrayList.add(DriveSpace.c);
            }
            return arrayList;
        }
    }

    public static class f extends com.google.android.gms.drive.metadata.internal.b implements com.google.android.gms.drive.metadata.c<Boolean> {
        public f(String str, int i) {
            super(str, i);
        }
    }

    public static class g extends p implements com.google.android.gms.drive.metadata.c<String>, com.google.android.gms.drive.metadata.e<String> {
        public g(String str, int i) {
            super(str, i);
        }
    }

    public static class h extends com.google.android.gms.drive.metadata.internal.b implements com.google.android.gms.drive.metadata.c<Boolean> {
        public h(String str, int i) {
            super(str, i);
        }

        protected Boolean a_(DataHolder dataHolder, int i, int i2) {
            return Boolean.valueOf(dataHolder.b(a(), i, i2) != 0);
        }

        protected /* synthetic */ Object c(DataHolder dataHolder, int i, int i2) {
            return a_(dataHolder, i, i2);
        }
    }
}
