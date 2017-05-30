package com.tencent.mm.sdk.storage;

import android.os.Looper;

public abstract class MStorage {
    private final MStorageEvent<IOnStorageChange, String> bM = new MStorageEvent<IOnStorageChange, String>(this) {
        final /* synthetic */ MStorage bO;

        {
            this.bO = r1;
        }

        protected /* synthetic */ void processEvent(Object obj, Object obj2) {
            IOnStorageChange iOnStorageChange = (IOnStorageChange) obj;
            String str = (String) obj2;
            MStorage mStorage = this.bO;
            iOnStorageChange.onNotifyChange(str);
        }
    };
    private final MStorageEvent<IOnStorageLoaded, String> bN = new MStorageEvent<IOnStorageLoaded, String>(this) {
        final /* synthetic */ MStorage bO;

        {
            this.bO = r1;
        }

        protected /* synthetic */ void processEvent(Object obj, Object obj2) {
            IOnStorageLoaded iOnStorageLoaded = (IOnStorageLoaded) obj;
            MStorage mStorage = this.bO;
            iOnStorageLoaded.onNotifyLoaded();
        }
    };

    public interface IOnStorageChange {
        void onNotifyChange(String str);
    }

    public interface IOnStorageLoaded {
        void onNotifyLoaded();
    }

    public void add(IOnStorageChange iOnStorageChange) {
        this.bM.add(iOnStorageChange, Looper.getMainLooper());
    }

    public void addLoadedListener(IOnStorageLoaded iOnStorageLoaded) {
        this.bN.add(iOnStorageLoaded, Looper.getMainLooper());
    }

    public void doNotify() {
        this.bM.event("*");
        this.bM.doNotify();
    }

    public void doNotify(String str) {
        this.bM.event(str);
        this.bM.doNotify();
    }

    public void lock() {
        this.bM.lock();
    }

    public void remove(IOnStorageChange iOnStorageChange) {
        this.bM.remove(iOnStorageChange);
    }

    public void removeLoadedListener(IOnStorageLoaded iOnStorageLoaded) {
        this.bN.remove(iOnStorageLoaded);
    }

    public void unlock() {
        this.bM.unlock();
    }
}
