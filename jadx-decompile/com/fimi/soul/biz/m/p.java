package com.fimi.soul.biz.m;

import android.content.Context;
import com.fimi.soul.entity.CityInfo;
import com.fimi.soul.entity.PlaneMsg;

public interface p {
    PlaneMsg a(Context context, CityInfo cityInfo);

    PlaneMsg a(CityInfo cityInfo, Context context);
}
