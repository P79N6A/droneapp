package com.fimi.soul.drone.g;

import java.util.ArrayList;
import java.util.List;

public class a {
    public static int[] a(byte[] bArr) {
        int i = 0;
        int length = bArr.length;
        List arrayList = new ArrayList();
        byte[] bArr2 = new byte[4];
        for (length = 0; length < bArr.length; length += 4) {
            if (bArr.length - length < 4 && bArr.length % 4 == 1) {
                bArr2[0] = bArr[length];
                bArr2[1] = (byte) 0;
                bArr2[2] = (byte) 0;
                bArr2[3] = (byte) 0;
            } else if (bArr.length - length < 4 && bArr.length % 4 == 2) {
                bArr2[0] = bArr[length];
                bArr2[1] = bArr[length + 1];
                bArr2[2] = (byte) 0;
                bArr2[3] = (byte) 0;
            } else if (bArr.length - length >= 4 || bArr.length % 4 != 3) {
                bArr2[0] = bArr[length];
                bArr2[1] = bArr[length + 1];
                bArr2[2] = bArr[length + 2];
                bArr2[3] = bArr[length + 3];
            } else {
                bArr2[0] = bArr[length];
                bArr2[1] = bArr[length + 1];
                bArr2[2] = bArr[length + 2];
                bArr2[3] = (byte) 0;
            }
            arrayList.add(b(bArr2));
            bArr2 = new byte[4];
        }
        int[] iArr = new int[arrayList.size()];
        while (i < arrayList.size()) {
            iArr[i] = c((byte[]) arrayList.get(i));
            i++;
        }
        return iArr;
    }

    public static byte[] b(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = bArr[(bArr.length - i) - 1];
        }
        return bArr2;
    }

    public static int c(byte[] bArr) {
        return (((bArr[3] & 255) | ((bArr[2] & 255) << 8)) | ((bArr[1] & 255) << 16)) | ((bArr[0] & 255) << 24);
    }
}
