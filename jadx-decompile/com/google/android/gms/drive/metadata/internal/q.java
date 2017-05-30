package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.UserMetadata;
import com.tencent.open.SocialConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class q extends k<UserMetadata> {
    public q(String str, int i) {
        super(str, b(str), Collections.emptyList(), i);
    }

    private String a(String str) {
        return a(a(), str);
    }

    private static String a(String str, String str2) {
        return new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length()).append(str).append(".").append(str2).toString();
    }

    private static Collection<String> b(String str) {
        return Arrays.asList(new String[]{a(str, "permissionId"), a(str, "displayName"), a(str, SocialConstants.PARAM_AVATAR_URI), a(str, "isAuthenticatedUser"), a(str, "emailAddress")});
    }

    protected boolean b(DataHolder dataHolder, int i, int i2) {
        return dataHolder.a(a("permissionId")) && !dataHolder.h(a("permissionId"), i, i2);
    }

    protected /* synthetic */ Object c(DataHolder dataHolder, int i, int i2) {
        return d(dataHolder, i, i2);
    }

    protected UserMetadata d(DataHolder dataHolder, int i, int i2) {
        String c = dataHolder.c(a("permissionId"), i, i2);
        if (c == null) {
            return null;
        }
        String c2 = dataHolder.c(a("displayName"), i, i2);
        String c3 = dataHolder.c(a(SocialConstants.PARAM_AVATAR_URI), i, i2);
        Boolean valueOf = Boolean.valueOf(dataHolder.d(a("isAuthenticatedUser"), i, i2));
        return new UserMetadata(c, c2, c3, valueOf.booleanValue(), dataHolder.c(a("emailAddress"), i, i2));
    }
}
