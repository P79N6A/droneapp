package com.tencent.mm.sdk.platformtools;

import b.b.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MAlarmHandler {
    public static final long NEXT_FIRE_INTERVAL = Long.MAX_VALUE;
    private static Map<Integer, MAlarmHandler> aA = new HashMap();
    private static IBumper aC;
    private static boolean aD = false;
    private static int av;
    private final CallBack aB;
    private final int aw;
    private final boolean ax;
    private long ay = 0;
    private long az = 0;

    public interface CallBack {
        boolean onTimerExpired();
    }

    public interface IBumper {
        void cancel();

        void prepare();
    }

    public MAlarmHandler(CallBack callBack, boolean z) {
        a.a("bumper not initialized", aD);
        this.aB = callBack;
        this.ax = z;
        if (av >= 8192) {
            av = 0;
        }
        int i = av + 1;
        av = i;
        this.aw = i;
    }

    public static long fire() {
        List linkedList = new LinkedList();
        Set<Integer> hashSet = new HashSet();
        hashSet.addAll(aA.keySet());
        long j = Long.MAX_VALUE;
        for (Integer num : hashSet) {
            long j2;
            MAlarmHandler mAlarmHandler = (MAlarmHandler) aA.get(num);
            if (mAlarmHandler != null) {
                long ticksToNow = Util.ticksToNow(mAlarmHandler.ay);
                if (ticksToNow < 0) {
                    ticksToNow = 0;
                }
                if (ticksToNow > mAlarmHandler.az) {
                    if (mAlarmHandler.aB.onTimerExpired() && mAlarmHandler.ax) {
                        j = mAlarmHandler.az;
                    } else {
                        linkedList.add(num);
                    }
                    mAlarmHandler.ay = Util.currentTicks();
                } else if (mAlarmHandler.az - ticksToNow < j) {
                    j2 = mAlarmHandler.az - ticksToNow;
                    j = j2;
                }
            }
            j2 = j;
            j = j2;
        }
        for (int i = 0; i < linkedList.size(); i++) {
            aA.remove(linkedList.get(i));
        }
        if (j == Long.MAX_VALUE && aC != null) {
            aC.cancel();
            Log.v("MicroMsg.MAlarmHandler", "cancel bumper for no more handler");
        }
        return j;
    }

    public static void initAlarmBumper(IBumper iBumper) {
        aD = true;
        aC = iBumper;
    }

    protected void finalize() {
        stopTimer();
        super.finalize();
    }

    public void startTimer(long j) {
        this.az = j;
        this.ay = Util.currentTicks();
        long j2 = this.az;
        Log.d("MicroMsg.MAlarmHandler", "check need prepare: check=" + j2);
        long j3 = Long.MAX_VALUE;
        for (Entry value : aA.entrySet()) {
            long j4;
            MAlarmHandler mAlarmHandler = (MAlarmHandler) value.getValue();
            if (mAlarmHandler != null) {
                long ticksToNow = Util.ticksToNow(mAlarmHandler.ay);
                if (ticksToNow < 0) {
                    ticksToNow = 0;
                }
                if (ticksToNow > mAlarmHandler.az) {
                    j3 = mAlarmHandler.az;
                } else if (mAlarmHandler.az - ticksToNow < j3) {
                    j4 = mAlarmHandler.az - ticksToNow;
                    j3 = j4;
                }
            }
            j4 = j3;
            j3 = j4;
        }
        Object obj = j3 > j2 ? 1 : null;
        stopTimer();
        aA.put(Integer.valueOf(this.aw), this);
        if (aC != null && obj != null) {
            Log.v("MicroMsg.MAlarmHandler", "prepare bumper");
            aC.prepare();
        }
    }

    public void stopTimer() {
        aA.remove(Integer.valueOf(this.aw));
    }

    public boolean stopped() {
        return !aA.containsKey(Integer.valueOf(this.aw));
    }
}
