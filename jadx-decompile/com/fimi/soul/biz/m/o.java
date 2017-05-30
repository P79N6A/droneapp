package com.fimi.soul.biz.m;

import android.content.Context;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.Relation;
import com.fimi.soul.entity.User;

public interface o extends b {
    PlaneMsg a(Relation relation, Context context);

    PlaneMsg a(User user, int i, String str, Context context);

    PlaneMsg a(User user, Context context);

    PlaneMsg a(String str, int i, Context context);

    PlaneMsg a(String str, String str2, Context context);

    PlaneMsg b(Context context);

    PlaneMsg b(User user, Context context);

    PlaneMsg b(String str, int i, Context context);

    PlaneMsg b(String str, String str2, Context context);

    PlaneMsg c(Context context);

    PlaneMsg c(User user, Context context);

    PlaneMsg c(String str, int i, Context context);

    PlaneMsg c(String str, Context context);

    PlaneMsg c(String str, String str2, Context context);

    PlaneMsg d(User user, Context context);

    PlaneMsg e(User user, Context context);

    PlaneMsg f(User user, Context context);

    PlaneMsg g(User user, Context context);
}
