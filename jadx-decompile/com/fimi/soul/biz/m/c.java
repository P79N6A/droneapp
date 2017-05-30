package com.fimi.soul.biz.m;

import android.content.Context;
import com.fimi.soul.entity.BroadcastComment;
import com.fimi.soul.entity.BroadcastMode;
import com.fimi.soul.entity.PlaneMsg;

public interface c extends b {
    PlaneMsg a(Context context, int i);

    PlaneMsg a(Context context, BroadcastComment broadcastComment);

    PlaneMsg a(Context context, String str, int i);

    PlaneMsg a(Context context, String str, String str2);

    PlaneMsg a(BroadcastMode broadcastMode, Context context);

    PlaneMsg b(Context context, int i);

    PlaneMsg b(Context context, String str, int i);

    PlaneMsg b(Context context, String str, String str2);

    PlaneMsg b(BroadcastMode broadcastMode, Context context);

    PlaneMsg c(Context context, String str, int i);

    PlaneMsg c(BroadcastMode broadcastMode, Context context);

    PlaneMsg c(String str, Context context);
}
