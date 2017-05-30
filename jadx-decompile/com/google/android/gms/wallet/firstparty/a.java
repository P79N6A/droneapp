package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public class a implements Creator<ExecuteBuyFlowRequest> {
    static void a(ExecuteBuyFlowRequest executeBuyFlowRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, executeBuyFlowRequest.a());
        b.a(parcel, 2, executeBuyFlowRequest.a, false);
        b.a(parcel, 3, executeBuyFlowRequest.b, false);
        b.a(parcel, 4, executeBuyFlowRequest.c, i, false);
        b.a(parcel, a);
    }

    public ExecuteBuyFlowRequest a(Parcel parcel) {
        WalletCustomTheme walletCustomTheme = null;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        byte[] bArr = null;
        byte[] bArr2 = null;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 2:
                    bArr2 = com.google.android.gms.common.internal.safeparcel.a.t(parcel, a);
                    break;
                case 3:
                    bArr = com.google.android.gms.common.internal.safeparcel.a.t(parcel, a);
                    break;
                case 4:
                    walletCustomTheme = (WalletCustomTheme) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, WalletCustomTheme.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ExecuteBuyFlowRequest(i, bArr2, bArr, walletCustomTheme);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public ExecuteBuyFlowRequest[] a(int i) {
        return new ExecuteBuyFlowRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
