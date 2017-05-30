package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.fimi.soul.entity.User;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.a.a.a.b;
import com.google.android.gms.plus.a.a.a.d;
import com.google.android.gms.plus.a.a.a.e;
import com.google.android.gms.plus.a.a.a.g;
import com.google.android.gms.plus.a.a.a.h;
import com.google.android.gms.plus.a.a.a.j;
import com.tencent.mm.sdk.contact.RContact;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class PersonEntity extends FastSafeParcelableJsonResponse implements com.google.android.gms.plus.a.a.a {
    private static final HashMap<String, Field<?, ?>> A = new HashMap();
    public static final a CREATOR = new a();
    final Set<Integer> a;
    final int b;
    String c;
    AgeRangeEntity d;
    String e;
    String f;
    int g;
    CoverEntity h;
    String i;
    String j;
    int k;
    String l;
    ImageEntity m;
    boolean n;
    String o;
    NameEntity p;
    String q;
    int r;
    List<OrganizationsEntity> s;
    List<PlacesLivedEntity> t;
    int u;
    int v;
    String w;
    String x;
    List<UrlsEntity> y;
    boolean z;

    public static final class AgeRangeEntity extends FastSafeParcelableJsonResponse implements com.google.android.gms.plus.a.a.a.a {
        public static final b CREATOR = new b();
        private static final HashMap<String, Field<?, ?>> e = new HashMap();
        final Set<Integer> a;
        final int b;
        int c;
        int d;

        static {
            e.put("max", Field.a("max", 2));
            e.put("min", Field.a("min", 3));
        }

        public AgeRangeEntity() {
            this.b = 1;
            this.a = new HashSet();
        }

        AgeRangeEntity(Set<Integer> set, int i, int i2, int i3) {
            this.a = set;
            this.b = i;
            this.c = i2;
            this.d = i3;
        }

        public /* synthetic */ Object a() {
            return k();
        }

        protected boolean a(Field field) {
            return this.a.contains(Integer.valueOf(field.g()));
        }

        protected Object b(Field field) {
            switch (field.g()) {
                case 2:
                    return Integer.valueOf(this.c);
                case 3:
                    return Integer.valueOf(this.d);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + field.g());
            }
        }

        public boolean b() {
            return true;
        }

        public /* synthetic */ Map c() {
            return f();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof AgeRangeEntity)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            AgeRangeEntity ageRangeEntity = (AgeRangeEntity) obj;
            for (Field field : e.values()) {
                if (a(field)) {
                    if (!ageRangeEntity.a(field)) {
                        return false;
                    }
                    if (!b(field).equals(ageRangeEntity.b(field))) {
                        return false;
                    }
                } else if (ageRangeEntity.a(field)) {
                    return false;
                }
            }
            return true;
        }

        public HashMap<String, Field<?, ?>> f() {
            return e;
        }

        public int g() {
            return this.c;
        }

        public boolean h() {
            return this.a.contains(Integer.valueOf(2));
        }

        public int hashCode() {
            int i = 0;
            for (Field field : e.values()) {
                int hashCode;
                if (a(field)) {
                    hashCode = b(field).hashCode() + (i + field.g());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public int i() {
            return this.d;
        }

        public boolean j() {
            return this.a.contains(Integer.valueOf(3));
        }

        public AgeRangeEntity k() {
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            b bVar = CREATOR;
            b.a(this, parcel, i);
        }
    }

    public static final class CoverEntity extends FastSafeParcelableJsonResponse implements b {
        public static final c CREATOR = new c();
        private static final HashMap<String, Field<?, ?>> f = new HashMap();
        final Set<Integer> a;
        final int b;
        CoverInfoEntity c;
        CoverPhotoEntity d;
        int e;

        public static final class CoverInfoEntity extends FastSafeParcelableJsonResponse implements com.google.android.gms.plus.a.a.a.b.a {
            public static final d CREATOR = new d();
            private static final HashMap<String, Field<?, ?>> e = new HashMap();
            final Set<Integer> a;
            final int b;
            int c;
            int d;

            static {
                e.put("leftImageOffset", Field.a("leftImageOffset", 2));
                e.put("topImageOffset", Field.a("topImageOffset", 3));
            }

            public CoverInfoEntity() {
                this.b = 1;
                this.a = new HashSet();
            }

            CoverInfoEntity(Set<Integer> set, int i, int i2, int i3) {
                this.a = set;
                this.b = i;
                this.c = i2;
                this.d = i3;
            }

            public /* synthetic */ Object a() {
                return k();
            }

            protected boolean a(Field field) {
                return this.a.contains(Integer.valueOf(field.g()));
            }

            protected Object b(Field field) {
                switch (field.g()) {
                    case 2:
                        return Integer.valueOf(this.c);
                    case 3:
                        return Integer.valueOf(this.d);
                    default:
                        throw new IllegalStateException("Unknown safe parcelable id=" + field.g());
                }
            }

            public boolean b() {
                return true;
            }

            public /* synthetic */ Map c() {
                return f();
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof CoverInfoEntity)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                CoverInfoEntity coverInfoEntity = (CoverInfoEntity) obj;
                for (Field field : e.values()) {
                    if (a(field)) {
                        if (!coverInfoEntity.a(field)) {
                            return false;
                        }
                        if (!b(field).equals(coverInfoEntity.b(field))) {
                            return false;
                        }
                    } else if (coverInfoEntity.a(field)) {
                        return false;
                    }
                }
                return true;
            }

            public HashMap<String, Field<?, ?>> f() {
                return e;
            }

            public int g() {
                return this.c;
            }

            public boolean h() {
                return this.a.contains(Integer.valueOf(2));
            }

            public int hashCode() {
                int i = 0;
                for (Field field : e.values()) {
                    int hashCode;
                    if (a(field)) {
                        hashCode = b(field).hashCode() + (i + field.g());
                    } else {
                        hashCode = i;
                    }
                    i = hashCode;
                }
                return i;
            }

            public int i() {
                return this.d;
            }

            public boolean j() {
                return this.a.contains(Integer.valueOf(3));
            }

            public CoverInfoEntity k() {
                return this;
            }

            public void writeToParcel(Parcel parcel, int i) {
                d dVar = CREATOR;
                d.a(this, parcel, i);
            }
        }

        public static final class CoverPhotoEntity extends FastSafeParcelableJsonResponse implements b.b {
            public static final e CREATOR = new e();
            private static final HashMap<String, Field<?, ?>> f = new HashMap();
            final Set<Integer> a;
            final int b;
            int c;
            String d;
            int e;

            static {
                f.put(FimiMediaMeta.IJKM_KEY_HEIGHT, Field.a(FimiMediaMeta.IJKM_KEY_HEIGHT, 2));
                f.put("url", Field.c("url", 3));
                f.put(FimiMediaMeta.IJKM_KEY_WIDTH, Field.a(FimiMediaMeta.IJKM_KEY_WIDTH, 4));
            }

            public CoverPhotoEntity() {
                this.b = 1;
                this.a = new HashSet();
            }

            CoverPhotoEntity(Set<Integer> set, int i, int i2, String str, int i3) {
                this.a = set;
                this.b = i;
                this.c = i2;
                this.d = str;
                this.e = i3;
            }

            public /* synthetic */ Object a() {
                return m();
            }

            protected boolean a(Field field) {
                return this.a.contains(Integer.valueOf(field.g()));
            }

            protected Object b(Field field) {
                switch (field.g()) {
                    case 2:
                        return Integer.valueOf(this.c);
                    case 3:
                        return this.d;
                    case 4:
                        return Integer.valueOf(this.e);
                    default:
                        throw new IllegalStateException("Unknown safe parcelable id=" + field.g());
                }
            }

            public boolean b() {
                return true;
            }

            public /* synthetic */ Map c() {
                return f();
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof CoverPhotoEntity)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                CoverPhotoEntity coverPhotoEntity = (CoverPhotoEntity) obj;
                for (Field field : f.values()) {
                    if (a(field)) {
                        if (!coverPhotoEntity.a(field)) {
                            return false;
                        }
                        if (!b(field).equals(coverPhotoEntity.b(field))) {
                            return false;
                        }
                    } else if (coverPhotoEntity.a(field)) {
                        return false;
                    }
                }
                return true;
            }

            public HashMap<String, Field<?, ?>> f() {
                return f;
            }

            public int g() {
                return this.c;
            }

            public boolean h() {
                return this.a.contains(Integer.valueOf(2));
            }

            public int hashCode() {
                int i = 0;
                for (Field field : f.values()) {
                    int hashCode;
                    if (a(field)) {
                        hashCode = b(field).hashCode() + (i + field.g());
                    } else {
                        hashCode = i;
                    }
                    i = hashCode;
                }
                return i;
            }

            public String i() {
                return this.d;
            }

            public boolean j() {
                return this.a.contains(Integer.valueOf(3));
            }

            public int k() {
                return this.e;
            }

            public boolean l() {
                return this.a.contains(Integer.valueOf(4));
            }

            public CoverPhotoEntity m() {
                return this;
            }

            public void writeToParcel(Parcel parcel, int i) {
                e eVar = CREATOR;
                e.a(this, parcel, i);
            }
        }

        static {
            f.put("coverInfo", Field.a("coverInfo", 2, CoverInfoEntity.class));
            f.put("coverPhoto", Field.a("coverPhoto", 3, CoverPhotoEntity.class));
            f.put("layout", Field.a("layout", 4, new StringToIntConverter().a("banner", 0), false));
        }

        public CoverEntity() {
            this.b = 1;
            this.a = new HashSet();
        }

        CoverEntity(Set<Integer> set, int i, CoverInfoEntity coverInfoEntity, CoverPhotoEntity coverPhotoEntity, int i2) {
            this.a = set;
            this.b = i;
            this.c = coverInfoEntity;
            this.d = coverPhotoEntity;
            this.e = i2;
        }

        public /* synthetic */ Object a() {
            return m();
        }

        protected boolean a(Field field) {
            return this.a.contains(Integer.valueOf(field.g()));
        }

        protected Object b(Field field) {
            switch (field.g()) {
                case 2:
                    return this.c;
                case 3:
                    return this.d;
                case 4:
                    return Integer.valueOf(this.e);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + field.g());
            }
        }

        public boolean b() {
            return true;
        }

        public /* synthetic */ Map c() {
            return f();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof CoverEntity)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            CoverEntity coverEntity = (CoverEntity) obj;
            for (Field field : f.values()) {
                if (a(field)) {
                    if (!coverEntity.a(field)) {
                        return false;
                    }
                    if (!b(field).equals(coverEntity.b(field))) {
                        return false;
                    }
                } else if (coverEntity.a(field)) {
                    return false;
                }
            }
            return true;
        }

        public HashMap<String, Field<?, ?>> f() {
            return f;
        }

        public com.google.android.gms.plus.a.a.a.b.a g() {
            return this.c;
        }

        public boolean h() {
            return this.a.contains(Integer.valueOf(2));
        }

        public int hashCode() {
            int i = 0;
            for (Field field : f.values()) {
                int hashCode;
                if (a(field)) {
                    hashCode = b(field).hashCode() + (i + field.g());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public b.b i() {
            return this.d;
        }

        public boolean j() {
            return this.a.contains(Integer.valueOf(3));
        }

        public int k() {
            return this.e;
        }

        public boolean l() {
            return this.a.contains(Integer.valueOf(4));
        }

        public CoverEntity m() {
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            c cVar = CREATOR;
            c.a(this, parcel, i);
        }
    }

    public static final class ImageEntity extends FastSafeParcelableJsonResponse implements d {
        public static final f CREATOR = new f();
        private static final HashMap<String, Field<?, ?>> d = new HashMap();
        final Set<Integer> a;
        final int b;
        String c;

        static {
            d.put("url", Field.c("url", 2));
        }

        public ImageEntity() {
            this.b = 1;
            this.a = new HashSet();
        }

        public ImageEntity(String str) {
            this.a = new HashSet();
            this.b = 1;
            this.c = str;
            this.a.add(Integer.valueOf(2));
        }

        ImageEntity(Set<Integer> set, int i, String str) {
            this.a = set;
            this.b = i;
            this.c = str;
        }

        public /* synthetic */ Object a() {
            return i();
        }

        protected boolean a(Field field) {
            return this.a.contains(Integer.valueOf(field.g()));
        }

        protected Object b(Field field) {
            switch (field.g()) {
                case 2:
                    return this.c;
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + field.g());
            }
        }

        public boolean b() {
            return true;
        }

        public /* synthetic */ Map c() {
            return f();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ImageEntity)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            ImageEntity imageEntity = (ImageEntity) obj;
            for (Field field : d.values()) {
                if (a(field)) {
                    if (!imageEntity.a(field)) {
                        return false;
                    }
                    if (!b(field).equals(imageEntity.b(field))) {
                        return false;
                    }
                } else if (imageEntity.a(field)) {
                    return false;
                }
            }
            return true;
        }

        public HashMap<String, Field<?, ?>> f() {
            return d;
        }

        public String g() {
            return this.c;
        }

        public boolean h() {
            return this.a.contains(Integer.valueOf(2));
        }

        public int hashCode() {
            int i = 0;
            for (Field field : d.values()) {
                int hashCode;
                if (a(field)) {
                    hashCode = b(field).hashCode() + (i + field.g());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public ImageEntity i() {
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            f fVar = CREATOR;
            f.a(this, parcel, i);
        }
    }

    public static final class NameEntity extends FastSafeParcelableJsonResponse implements e {
        public static final g CREATOR = new g();
        private static final HashMap<String, Field<?, ?>> i = new HashMap();
        final Set<Integer> a;
        final int b;
        String c;
        String d;
        String e;
        String f;
        String g;
        String h;

        static {
            i.put("familyName", Field.c("familyName", 2));
            i.put("formatted", Field.c("formatted", 3));
            i.put("givenName", Field.c("givenName", 4));
            i.put("honorificPrefix", Field.c("honorificPrefix", 5));
            i.put("honorificSuffix", Field.c("honorificSuffix", 6));
            i.put("middleName", Field.c("middleName", 7));
        }

        public NameEntity() {
            this.b = 1;
            this.a = new HashSet();
        }

        NameEntity(Set<Integer> set, int i, String str, String str2, String str3, String str4, String str5, String str6) {
            this.a = set;
            this.b = i;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = str5;
            this.h = str6;
        }

        public /* synthetic */ Object a() {
            return s();
        }

        protected boolean a(Field field) {
            return this.a.contains(Integer.valueOf(field.g()));
        }

        protected Object b(Field field) {
            switch (field.g()) {
                case 2:
                    return this.c;
                case 3:
                    return this.d;
                case 4:
                    return this.e;
                case 5:
                    return this.f;
                case 6:
                    return this.g;
                case 7:
                    return this.h;
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + field.g());
            }
        }

        public boolean b() {
            return true;
        }

        public /* synthetic */ Map c() {
            return f();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof NameEntity)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            NameEntity nameEntity = (NameEntity) obj;
            for (Field field : i.values()) {
                if (a(field)) {
                    if (!nameEntity.a(field)) {
                        return false;
                    }
                    if (!b(field).equals(nameEntity.b(field))) {
                        return false;
                    }
                } else if (nameEntity.a(field)) {
                    return false;
                }
            }
            return true;
        }

        public HashMap<String, Field<?, ?>> f() {
            return i;
        }

        public String g() {
            return this.c;
        }

        public boolean h() {
            return this.a.contains(Integer.valueOf(2));
        }

        public int hashCode() {
            int i = 0;
            for (Field field : i.values()) {
                int hashCode;
                if (a(field)) {
                    hashCode = b(field).hashCode() + (i + field.g());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public String i() {
            return this.d;
        }

        public boolean j() {
            return this.a.contains(Integer.valueOf(3));
        }

        public String k() {
            return this.e;
        }

        public boolean l() {
            return this.a.contains(Integer.valueOf(4));
        }

        public String m() {
            return this.f;
        }

        public boolean n() {
            return this.a.contains(Integer.valueOf(5));
        }

        public String o() {
            return this.g;
        }

        public boolean p() {
            return this.a.contains(Integer.valueOf(6));
        }

        public String q() {
            return this.h;
        }

        public boolean r() {
            return this.a.contains(Integer.valueOf(7));
        }

        public NameEntity s() {
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            g gVar = CREATOR;
            g.a(this, parcel, i);
        }
    }

    public static final class OrganizationsEntity extends FastSafeParcelableJsonResponse implements g {
        public static final h CREATOR = new h();
        private static final HashMap<String, Field<?, ?>> l = new HashMap();
        final Set<Integer> a;
        final int b;
        String c;
        String d;
        String e;
        String f;
        String g;
        boolean h;
        String i;
        String j;
        int k;

        static {
            l.put("department", Field.c("department", 2));
            l.put("description", Field.c("description", 3));
            l.put("endDate", Field.c("endDate", 4));
            l.put(com.google.firebase.a.a.b.p, Field.c(com.google.firebase.a.a.b.p, 5));
            l.put(User.FN_NAME, Field.c(User.FN_NAME, 6));
            l.put("primary", Field.b("primary", 7));
            l.put("startDate", Field.c("startDate", 8));
            l.put("title", Field.c("title", 9));
            l.put("type", Field.a("type", 10, new StringToIntConverter().a("work", 0).a("school", 1), false));
        }

        public OrganizationsEntity() {
            this.b = 1;
            this.a = new HashSet();
        }

        OrganizationsEntity(Set<Integer> set, int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, int i2) {
            this.a = set;
            this.b = i;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = str5;
            this.h = z;
            this.i = str6;
            this.j = str7;
            this.k = i2;
        }

        public /* synthetic */ Object a() {
            return y();
        }

        protected boolean a(Field field) {
            return this.a.contains(Integer.valueOf(field.g()));
        }

        protected Object b(Field field) {
            switch (field.g()) {
                case 2:
                    return this.c;
                case 3:
                    return this.d;
                case 4:
                    return this.e;
                case 5:
                    return this.f;
                case 6:
                    return this.g;
                case 7:
                    return Boolean.valueOf(this.h);
                case 8:
                    return this.i;
                case 9:
                    return this.j;
                case 10:
                    return Integer.valueOf(this.k);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + field.g());
            }
        }

        public boolean b() {
            return true;
        }

        public /* synthetic */ Map c() {
            return f();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof OrganizationsEntity)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            OrganizationsEntity organizationsEntity = (OrganizationsEntity) obj;
            for (Field field : l.values()) {
                if (a(field)) {
                    if (!organizationsEntity.a(field)) {
                        return false;
                    }
                    if (!b(field).equals(organizationsEntity.b(field))) {
                        return false;
                    }
                } else if (organizationsEntity.a(field)) {
                    return false;
                }
            }
            return true;
        }

        public HashMap<String, Field<?, ?>> f() {
            return l;
        }

        public String g() {
            return this.c;
        }

        public boolean h() {
            return this.a.contains(Integer.valueOf(2));
        }

        public int hashCode() {
            int i = 0;
            for (Field field : l.values()) {
                int hashCode;
                if (a(field)) {
                    hashCode = b(field).hashCode() + (i + field.g());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public String i() {
            return this.d;
        }

        public boolean j() {
            return this.a.contains(Integer.valueOf(3));
        }

        public String k() {
            return this.e;
        }

        public boolean l() {
            return this.a.contains(Integer.valueOf(4));
        }

        public String m() {
            return this.f;
        }

        public boolean n() {
            return this.a.contains(Integer.valueOf(5));
        }

        public String o() {
            return this.g;
        }

        public boolean p() {
            return this.a.contains(Integer.valueOf(6));
        }

        public boolean q() {
            return this.h;
        }

        public boolean r() {
            return this.a.contains(Integer.valueOf(7));
        }

        public String s() {
            return this.i;
        }

        public boolean t() {
            return this.a.contains(Integer.valueOf(8));
        }

        public String u() {
            return this.j;
        }

        public boolean v() {
            return this.a.contains(Integer.valueOf(9));
        }

        public int w() {
            return this.k;
        }

        public void writeToParcel(Parcel parcel, int i) {
            h hVar = CREATOR;
            h.a(this, parcel, i);
        }

        public boolean x() {
            return this.a.contains(Integer.valueOf(10));
        }

        public OrganizationsEntity y() {
            return this;
        }
    }

    public static final class PlacesLivedEntity extends FastSafeParcelableJsonResponse implements h {
        public static final i CREATOR = new i();
        private static final HashMap<String, Field<?, ?>> e = new HashMap();
        final Set<Integer> a;
        final int b;
        boolean c;
        String d;

        static {
            e.put("primary", Field.b("primary", 2));
            e.put("value", Field.c("value", 3));
        }

        public PlacesLivedEntity() {
            this.b = 1;
            this.a = new HashSet();
        }

        PlacesLivedEntity(Set<Integer> set, int i, boolean z, String str) {
            this.a = set;
            this.b = i;
            this.c = z;
            this.d = str;
        }

        public /* synthetic */ Object a() {
            return k();
        }

        protected boolean a(Field field) {
            return this.a.contains(Integer.valueOf(field.g()));
        }

        protected Object b(Field field) {
            switch (field.g()) {
                case 2:
                    return Boolean.valueOf(this.c);
                case 3:
                    return this.d;
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + field.g());
            }
        }

        public boolean b() {
            return true;
        }

        public /* synthetic */ Map c() {
            return f();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof PlacesLivedEntity)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            PlacesLivedEntity placesLivedEntity = (PlacesLivedEntity) obj;
            for (Field field : e.values()) {
                if (a(field)) {
                    if (!placesLivedEntity.a(field)) {
                        return false;
                    }
                    if (!b(field).equals(placesLivedEntity.b(field))) {
                        return false;
                    }
                } else if (placesLivedEntity.a(field)) {
                    return false;
                }
            }
            return true;
        }

        public HashMap<String, Field<?, ?>> f() {
            return e;
        }

        public boolean g() {
            return this.c;
        }

        public boolean h() {
            return this.a.contains(Integer.valueOf(2));
        }

        public int hashCode() {
            int i = 0;
            for (Field field : e.values()) {
                int hashCode;
                if (a(field)) {
                    hashCode = b(field).hashCode() + (i + field.g());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public String i() {
            return this.d;
        }

        public boolean j() {
            return this.a.contains(Integer.valueOf(3));
        }

        public PlacesLivedEntity k() {
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            i iVar = CREATOR;
            i.a(this, parcel, i);
        }
    }

    public static class a {
        public static int a(String str) {
            if (str.equals("person")) {
                return 0;
            }
            if (str.equals("page")) {
                return 1;
            }
            String str2 = "Unknown objectType string: ";
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    static {
        A.put("aboutMe", Field.c("aboutMe", 2));
        A.put("ageRange", Field.a("ageRange", 3, AgeRangeEntity.class));
        A.put("birthday", Field.c("birthday", 4));
        A.put("braggingRights", Field.c("braggingRights", 5));
        A.put("circledByCount", Field.a("circledByCount", 6));
        A.put("cover", Field.a("cover", 7, CoverEntity.class));
        A.put("currentLocation", Field.c("currentLocation", 8));
        A.put("displayName", Field.c("displayName", 9));
        A.put("gender", Field.a("gender", 12, new StringToIntConverter().a("male", 0).a("female", 1).a(com.google.android.gms.fitness.d.ad, 2), false));
        A.put("id", Field.c("id", 14));
        A.put("image", Field.a("image", 15, ImageEntity.class));
        A.put("isPlusUser", Field.b("isPlusUser", 16));
        A.put("language", Field.c("language", 18));
        A.put(User.FN_NAME, Field.a(User.FN_NAME, 19, NameEntity.class));
        A.put(RContact.COL_NICKNAME, Field.c(RContact.COL_NICKNAME, 20));
        A.put("objectType", Field.a("objectType", 21, new StringToIntConverter().a("person", 0).a("page", 1), false));
        A.put("organizations", Field.b("organizations", 22, OrganizationsEntity.class));
        A.put("placesLived", Field.b("placesLived", 23, PlacesLivedEntity.class));
        A.put("plusOneCount", Field.a("plusOneCount", 24));
        A.put("relationshipStatus", Field.a("relationshipStatus", 25, new StringToIntConverter().a("single", 0).a("in_a_relationship", 1).a("engaged", 2).a("married", 3).a("its_complicated", 4).a("open_relationship", 5).a("widowed", 6).a("in_domestic_partnership", 7).a("in_civil_union", 8), false));
        A.put("tagline", Field.c("tagline", 26));
        A.put("url", Field.c("url", 27));
        A.put("urls", Field.b("urls", 28, UrlsEntity.class));
        A.put("verified", Field.b("verified", 29));
    }

    public PersonEntity() {
        this.b = 1;
        this.a = new HashSet();
    }

    public PersonEntity(String str, String str2, ImageEntity imageEntity, int i, String str3) {
        this.b = 1;
        this.a = new HashSet();
        this.j = str;
        this.a.add(Integer.valueOf(9));
        this.l = str2;
        this.a.add(Integer.valueOf(14));
        this.m = imageEntity;
        this.a.add(Integer.valueOf(15));
        this.r = i;
        this.a.add(Integer.valueOf(21));
        this.x = str3;
        this.a.add(Integer.valueOf(27));
    }

    PersonEntity(Set<Integer> set, int i, String str, AgeRangeEntity ageRangeEntity, String str2, String str3, int i2, CoverEntity coverEntity, String str4, String str5, int i3, String str6, ImageEntity imageEntity, boolean z, String str7, NameEntity nameEntity, String str8, int i4, List<OrganizationsEntity> list, List<PlacesLivedEntity> list2, int i5, int i6, String str9, String str10, List<UrlsEntity> list3, boolean z2) {
        this.a = set;
        this.b = i;
        this.c = str;
        this.d = ageRangeEntity;
        this.e = str2;
        this.f = str3;
        this.g = i2;
        this.h = coverEntity;
        this.i = str4;
        this.j = str5;
        this.k = i3;
        this.l = str6;
        this.m = imageEntity;
        this.n = z;
        this.o = str7;
        this.p = nameEntity;
        this.q = str8;
        this.r = i4;
        this.s = list;
        this.t = list2;
        this.u = i5;
        this.v = i6;
        this.w = str9;
        this.x = str10;
        this.y = list3;
        this.z = z2;
    }

    public static PersonEntity a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        PersonEntity personEntity = (PersonEntity) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return personEntity;
    }

    public d A() {
        return this.m;
    }

    public boolean B() {
        return this.a.contains(Integer.valueOf(15));
    }

    public boolean C() {
        return this.n;
    }

    public boolean D() {
        return this.a.contains(Integer.valueOf(16));
    }

    public String E() {
        return this.o;
    }

    public boolean F() {
        return this.a.contains(Integer.valueOf(18));
    }

    public e G() {
        return this.p;
    }

    public boolean H() {
        return this.a.contains(Integer.valueOf(19));
    }

    public String I() {
        return this.q;
    }

    public boolean J() {
        return this.a.contains(Integer.valueOf(20));
    }

    public int K() {
        return this.r;
    }

    public boolean L() {
        return this.a.contains(Integer.valueOf(21));
    }

    public List<g> M() {
        return (ArrayList) this.s;
    }

    public boolean N() {
        return this.a.contains(Integer.valueOf(22));
    }

    public List<h> O() {
        return (ArrayList) this.t;
    }

    public boolean P() {
        return this.a.contains(Integer.valueOf(23));
    }

    public int Q() {
        return this.u;
    }

    public boolean R() {
        return this.a.contains(Integer.valueOf(24));
    }

    public int S() {
        return this.v;
    }

    public boolean T() {
        return this.a.contains(Integer.valueOf(25));
    }

    public String U() {
        return this.w;
    }

    public boolean V() {
        return this.a.contains(Integer.valueOf(26));
    }

    public String W() {
        return this.x;
    }

    public boolean X() {
        return this.a.contains(Integer.valueOf(27));
    }

    public List<j> Y() {
        return (ArrayList) this.y;
    }

    public boolean Z() {
        return this.a.contains(Integer.valueOf(28));
    }

    public /* synthetic */ Object a() {
        return ac();
    }

    protected boolean a(Field field) {
        return this.a.contains(Integer.valueOf(field.g()));
    }

    public boolean aa() {
        return this.z;
    }

    public boolean ab() {
        return this.a.contains(Integer.valueOf(29));
    }

    public PersonEntity ac() {
        return this;
    }

    protected Object b(Field field) {
        switch (field.g()) {
            case 2:
                return this.c;
            case 3:
                return this.d;
            case 4:
                return this.e;
            case 5:
                return this.f;
            case 6:
                return Integer.valueOf(this.g);
            case 7:
                return this.h;
            case 8:
                return this.i;
            case 9:
                return this.j;
            case 12:
                return Integer.valueOf(this.k);
            case 14:
                return this.l;
            case 15:
                return this.m;
            case 16:
                return Boolean.valueOf(this.n);
            case 18:
                return this.o;
            case 19:
                return this.p;
            case 20:
                return this.q;
            case 21:
                return Integer.valueOf(this.r);
            case 22:
                return this.s;
            case 23:
                return this.t;
            case 24:
                return Integer.valueOf(this.u);
            case 25:
                return Integer.valueOf(this.v);
            case 26:
                return this.w;
            case 27:
                return this.x;
            case 28:
                return this.y;
            case 29:
                return Boolean.valueOf(this.z);
            default:
                throw new IllegalStateException("Unknown safe parcelable id=" + field.g());
        }
    }

    public boolean b() {
        return true;
    }

    public /* synthetic */ Map c() {
        return f();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PersonEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        PersonEntity personEntity = (PersonEntity) obj;
        for (Field field : A.values()) {
            if (a(field)) {
                if (!personEntity.a(field)) {
                    return false;
                }
                if (!b(field).equals(personEntity.b(field))) {
                    return false;
                }
            } else if (personEntity.a(field)) {
                return false;
            }
        }
        return true;
    }

    public HashMap<String, Field<?, ?>> f() {
        return A;
    }

    public String g() {
        return this.c;
    }

    public boolean h() {
        return this.a.contains(Integer.valueOf(2));
    }

    public int hashCode() {
        int i = 0;
        for (Field field : A.values()) {
            int hashCode;
            if (a(field)) {
                hashCode = b(field).hashCode() + (i + field.g());
            } else {
                hashCode = i;
            }
            i = hashCode;
        }
        return i;
    }

    public com.google.android.gms.plus.a.a.a.a i() {
        return this.d;
    }

    public boolean j() {
        return this.a.contains(Integer.valueOf(3));
    }

    public String k() {
        return this.e;
    }

    public boolean l() {
        return this.a.contains(Integer.valueOf(4));
    }

    public String m() {
        return this.f;
    }

    public boolean n() {
        return this.a.contains(Integer.valueOf(5));
    }

    public int o() {
        return this.g;
    }

    public boolean p() {
        return this.a.contains(Integer.valueOf(6));
    }

    public b q() {
        return this.h;
    }

    public boolean r() {
        return this.a.contains(Integer.valueOf(7));
    }

    public String s() {
        return this.i;
    }

    public boolean t() {
        return this.a.contains(Integer.valueOf(8));
    }

    public String u() {
        return this.j;
    }

    public boolean v() {
        return this.a.contains(Integer.valueOf(9));
    }

    public int w() {
        return this.k;
    }

    public void writeToParcel(Parcel parcel, int i) {
        a aVar = CREATOR;
        a.a(this, parcel, i);
    }

    public boolean x() {
        return this.a.contains(Integer.valueOf(12));
    }

    public String y() {
        return this.l;
    }

    public boolean z() {
        return this.a.contains(Integer.valueOf(14));
    }
}
