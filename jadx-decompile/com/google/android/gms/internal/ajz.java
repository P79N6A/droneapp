package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.f;
import com.google.android.gms.drive.metadata.internal.k;
import java.util.Arrays;

public class ajz extends k<DriveId> {
    public static final ajz a = new ajz();

    private ajz() {
        super("driveId", Arrays.asList(new String[]{"sqlId", "resourceId", "mimeType"}), Arrays.asList(new String[]{"dbInstanceId"}), 4100000);
    }

    protected boolean b(DataHolder dataHolder, int i, int i2) {
        for (String a : b()) {
            if (!dataHolder.a(a)) {
                return false;
            }
        }
        return true;
    }

    protected /* synthetic */ Object c(DataHolder dataHolder, int i, int i2) {
        return d(dataHolder, i, i2);
    }

    protected DriveId d(DataHolder dataHolder, int i, int i2) {
        long j = dataHolder.f().getLong("dbInstanceId");
        int i3 = f.b_.equals(dataHolder.c(ajw.x.a(), i, i2)) ? 1 : 0;
        String c = dataHolder.c("resourceId", i, i2);
        Long valueOf = Long.valueOf(dataHolder.a("sqlId", i, i2));
        if ("generated-android-null".equals(c)) {
            c = null;
        }
        return new DriveId(c, valueOf.longValue(), j, i3);
    }
}
