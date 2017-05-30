package com.fimi.soul.biz.m;

import android.content.Context;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.UpgradeResultInfo;

public interface q extends b {
    PlaneMsg a(Context context);

    PlaneMsg a(Context context, UpgradeResultInfo upgradeResultInfo);

    PlaneMsg a(Context context, String str);

    PlaneMsg b(Context context);
}
