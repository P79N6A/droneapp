package com.google.android.gms.appdatasearch;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.fimi.soul.entity.User;
import com.google.android.gms.b.d.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.rd;
import java.util.List;
import java.util.Locale;
import java.util.zip.CRC32;

public class UsageInfo extends AbstractSafeParcelable {
    public static final j CREATOR = new j();
    final int a;
    final DocumentId b;
    final long c;
    int d;
    public final String e;
    final DocumentContents f;
    final boolean g;
    int h;
    int i;

    public static final class a {
        private DocumentId a;
        private long b = -1;
        private int c = -1;
        private DocumentContents d;
        private boolean e = false;
        private int f = -1;
        private int g = 0;

        public a a(int i) {
            this.c = i;
            return this;
        }

        public a a(long j) {
            this.b = j;
            return this;
        }

        public a a(DocumentContents documentContents) {
            this.d = documentContents;
            return this;
        }

        public a a(DocumentId documentId) {
            this.a = documentId;
            return this;
        }

        public a a(boolean z) {
            this.e = z;
            return this;
        }

        public UsageInfo a() {
            return new UsageInfo(this.a, this.b, this.c, null, this.d, this.e, this.f, this.g);
        }

        public a b(int i) {
            this.g = i;
            return this;
        }
    }

    UsageInfo(int i, DocumentId documentId, long j, int i2, String str, DocumentContents documentContents, boolean z, int i3, int i4) {
        this.a = i;
        this.b = documentId;
        this.c = j;
        this.d = i2;
        this.e = str;
        this.f = documentContents;
        this.g = z;
        this.h = i3;
        this.i = i4;
    }

    private UsageInfo(DocumentId documentId, long j, int i, String str, DocumentContents documentContents, boolean z, int i2, int i3) {
        this(1, documentId, j, i, str, documentContents, z, i2, i3);
    }

    public UsageInfo(String str, Intent intent, String str2, Uri uri, String str3, List<b> list, int i) {
        this(1, a(str, intent), System.currentTimeMillis(), 0, null, a(intent, str2, uri, str3, list).a(), false, -1, i);
    }

    public static com.google.android.gms.appdatasearch.DocumentContents.a a(Intent intent, String str, Uri uri, String str2, List<b> list) {
        com.google.android.gms.appdatasearch.DocumentContents.a aVar = new com.google.android.gms.appdatasearch.DocumentContents.a();
        aVar.a(a(str));
        if (uri != null) {
            aVar.a(a(uri));
        }
        if (list != null) {
            aVar.a(a((List) list));
        }
        String action = intent.getAction();
        if (action != null) {
            aVar.a(b("intent_action", action));
        }
        action = intent.getDataString();
        if (action != null) {
            aVar.a(b("intent_data", action));
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            aVar.a(b("intent_activity", component.getClassName()));
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            action = extras.getString("intent_extra_data_key");
            if (action != null) {
                aVar.a(b("intent_extra_data", action));
            }
        }
        return aVar.a(str2).a(true);
    }

    public static DocumentId a(String str, Intent intent) {
        return a(str, a(intent));
    }

    private static DocumentId a(String str, String str2) {
        return new DocumentId(str, "", str2);
    }

    private static DocumentSection a(Uri uri) {
        return new DocumentSection(uri.toString(), new com.google.android.gms.appdatasearch.RegisterSectionInfo.a("web_url").a(4).a(true).b("url").a());
    }

    private static DocumentSection a(String str) {
        return new DocumentSection(str, new com.google.android.gms.appdatasearch.RegisterSectionInfo.a("title").a(1).b(true).b(User.FN_NAME).a(), "text1");
    }

    private static DocumentSection a(List<b> list) {
        rd aVar = new com.google.android.gms.internal.amm.a();
        com.google.android.gms.internal.amm.a.a[] aVarArr = new com.google.android.gms.internal.amm.a.a[list.size()];
        for (int i = 0; i < aVarArr.length; i++) {
            aVarArr[i] = new com.google.android.gms.internal.amm.a.a();
            b bVar = (b) list.get(i);
            aVarArr[i].a = bVar.a.toString();
            aVarArr[i].c = bVar.c;
            if (bVar.b != null) {
                aVarArr[i].b = bVar.b.toString();
            }
        }
        aVar.a = aVarArr;
        return new DocumentSection(rd.a(aVar), new com.google.android.gms.appdatasearch.RegisterSectionInfo.a("outlinks").a(true).b(".private:outLinks").a("blob").a());
    }

    private static String a(Intent intent) {
        String toUri = intent.toUri(1);
        CRC32 crc32 = new CRC32();
        try {
            crc32.update(toUri.getBytes("UTF-8"));
            return Long.toHexString(crc32.getValue());
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    private static DocumentSection b(String str, String str2) {
        return new DocumentSection(str2, new com.google.android.gms.appdatasearch.RegisterSectionInfo.a(str).a(true).a(), str);
    }

    public String toString() {
        return String.format(Locale.US, "UsageInfo[documentId=%s, timestamp=%d, usageType=%d, status=%d]", new Object[]{this.b, Long.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.i)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        j jVar = CREATOR;
        j.a(this, parcel, i);
    }
}
