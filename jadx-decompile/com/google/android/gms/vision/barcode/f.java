package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.vision.barcode.Barcode.Address;
import com.google.android.gms.vision.barcode.Barcode.ContactInfo;
import com.google.android.gms.vision.barcode.Barcode.Email;
import com.google.android.gms.vision.barcode.Barcode.PersonName;
import com.google.android.gms.vision.barcode.Barcode.Phone;

public class f implements Creator<ContactInfo> {
    static void a(ContactInfo contactInfo, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, contactInfo.a);
        b.a(parcel, 2, contactInfo.b, i, false);
        b.a(parcel, 3, contactInfo.c, false);
        b.a(parcel, 4, contactInfo.d, false);
        b.a(parcel, 5, contactInfo.e, i, false);
        b.a(parcel, 6, contactInfo.f, i, false);
        b.a(parcel, 7, contactInfo.g, false);
        b.a(parcel, 8, contactInfo.h, i, false);
        b.a(parcel, a);
    }

    public ContactInfo a(Parcel parcel) {
        Address[] addressArr = null;
        int b = a.b(parcel);
        int i = 0;
        String[] strArr = null;
        Email[] emailArr = null;
        Phone[] phoneArr = null;
        String str = null;
        String str2 = null;
        PersonName personName = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    personName = (PersonName) a.a(parcel, a, PersonName.CREATOR);
                    break;
                case 3:
                    str2 = a.q(parcel, a);
                    break;
                case 4:
                    str = a.q(parcel, a);
                    break;
                case 5:
                    phoneArr = (Phone[]) a.b(parcel, a, Phone.CREATOR);
                    break;
                case 6:
                    emailArr = (Email[]) a.b(parcel, a, Email.CREATOR);
                    break;
                case 7:
                    strArr = a.C(parcel, a);
                    break;
                case 8:
                    addressArr = (Address[]) a.b(parcel, a, Address.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ContactInfo(i, personName, str2, str, phoneArr, emailArr, strArr, addressArr);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ContactInfo[] a(int i) {
        return new ContactInfo[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
