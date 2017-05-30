package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class DocumentContents extends AbstractSafeParcelable {
    public static final b CREATOR = new b();
    final int a;
    final DocumentSection[] b;
    public final String c;
    public final boolean d;
    public final Account e;

    public static class a {
        private List<DocumentSection> a;
        private String b;
        private boolean c;
        private Account d;

        public a a(Account account) {
            this.d = account;
            return this;
        }

        public a a(DocumentSection documentSection) {
            if (this.a == null && documentSection != null) {
                this.a = new ArrayList();
            }
            if (documentSection != null) {
                this.a.add(documentSection);
            }
            return this;
        }

        public a a(String str) {
            this.b = str;
            return this;
        }

        public a a(boolean z) {
            this.c = z;
            return this;
        }

        public DocumentContents a() {
            return new DocumentContents(this.b, this.c, this.d, this.a != null ? (DocumentSection[]) this.a.toArray(new DocumentSection[this.a.size()]) : null);
        }
    }

    DocumentContents(int i, DocumentSection[] documentSectionArr, String str, boolean z, Account account) {
        this.a = i;
        this.b = documentSectionArr;
        this.c = str;
        this.d = z;
        this.e = account;
    }

    DocumentContents(String str, boolean z, Account account, DocumentSection... documentSectionArr) {
        this(1, documentSectionArr, str, z, account);
        if (documentSectionArr != null) {
            BitSet bitSet = new BitSet(h.a());
            for (DocumentSection documentSection : documentSectionArr) {
                int i = documentSection.e;
                if (i != -1) {
                    if (bitSet.get(i)) {
                        String str2 = "Duplicate global search section type ";
                        String valueOf = String.valueOf(h.a(i));
                        throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    }
                    bitSet.set(i);
                }
            }
        }
    }

    public DocumentSection[] a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DocumentContents)) {
            return false;
        }
        DocumentContents documentContents = (DocumentContents) obj;
        return c.a(this.c, documentContents.c) && c.a(Boolean.valueOf(this.d), Boolean.valueOf(documentContents.d)) && c.a(this.e, documentContents.e) && Arrays.equals(a(), documentContents.a());
    }

    public int hashCode() {
        return c.a(this.c, Boolean.valueOf(this.d), this.e, Integer.valueOf(Arrays.hashCode(this.b)));
    }

    public void writeToParcel(Parcel parcel, int i) {
        b bVar = CREATOR;
        b.a(this, parcel, i);
    }
}
