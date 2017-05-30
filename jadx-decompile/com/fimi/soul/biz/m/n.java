package com.fimi.soul.biz.m;

import android.content.Context;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.UpdateDroneItem;

public interface n extends b {
    PlaneMsg a(UpdateDroneItem updateDroneItem, Context context);

    PlaneMsg a(String str, String str2, int i, Context context);

    PlaneMsg b(UpdateDroneItem updateDroneItem, Context context);

    PlaneMsg c(String str, Context context);

    PlaneMsg d(String str, Context context);

    PlaneMsg e(String str, Context context);
}
