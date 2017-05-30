package com.google.android.gms.games.internal.c;

import android.net.Uri;
import com.google.android.gms.games.c;

public final class a {
    public static final Uri a = c.buildUpon().appendPath("invitations").build();
    public static final Uri b = c.buildUpon().appendEncodedPath(c.a).build();
    private static final Uri c = Uri.parse("content://com.google.android.gms.games/").buildUpon().appendPath("data_change").build();
}
