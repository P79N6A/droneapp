package com.tencent.mm.sdk.platformtools;

import java.util.HashSet;
import java.util.Set;

public final class MMEntryLock {
    private static Set<String> aF = new HashSet();

    private MMEntryLock() {
    }

    public static boolean isLocked(String str) {
        return aF.contains(str);
    }

    public static boolean lock(String str) {
        if (isLocked(str)) {
            Log.d("MicroMsg.MMEntryLock", "locked-" + str);
            return false;
        }
        Log.d("MicroMsg.MMEntryLock", "lock-" + str);
        return aF.add(str);
    }

    public static void unlock(String str) {
        aF.remove(str);
        Log.d("MicroMsg.MMEntryLock", "unlock-" + str);
    }
}