package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.List;

public interface x extends IInterface {

    public static abstract class a extends Binder implements x {

        private static class a implements x {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(DataHolder dataHolder) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(AmsEntityUpdateParcelable amsEntityUpdateParcelable) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if (amsEntityUpdateParcelable != null) {
                        obtain.writeInt(1);
                        amsEntityUpdateParcelable.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(AncsNotificationParcelable ancsNotificationParcelable) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if (ancsNotificationParcelable != null) {
                        obtain.writeInt(1);
                        ancsNotificationParcelable.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(CapabilityInfoParcelable capabilityInfoParcelable) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if (capabilityInfoParcelable != null) {
                        obtain.writeInt(1);
                        capabilityInfoParcelable.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(8, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(ChannelEventParcelable channelEventParcelable) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if (channelEventParcelable != null) {
                        obtain.writeInt(1);
                        channelEventParcelable.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(MessageEventParcelable messageEventParcelable) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if (messageEventParcelable != null) {
                        obtain.writeInt(1);
                        messageEventParcelable.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(NodeParcelable nodeParcelable) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if (nodeParcelable != null) {
                        obtain.writeInt(1);
                        nodeParcelable.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(List<NodeParcelable> list) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    obtain.writeTypedList(list);
                    this.a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void b(NodeParcelable nodeParcelable) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if (nodeParcelable != null) {
                        obtain.writeInt(1);
                        nodeParcelable.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.google.android.gms.wearable.internal.IWearableListener");
        }

        public static x a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof x)) ? new a(iBinder) : (x) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            AmsEntityUpdateParcelable amsEntityUpdateParcelable = null;
            NodeParcelable nodeParcelable;
            switch (i) {
                case 1:
                    DataHolder dataHolder;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    if (parcel.readInt() != 0) {
                        dataHolder = (DataHolder) DataHolder.CREATOR.createFromParcel(parcel);
                    }
                    a(dataHolder);
                    return true;
                case 2:
                    MessageEventParcelable messageEventParcelable;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    if (parcel.readInt() != 0) {
                        messageEventParcelable = (MessageEventParcelable) MessageEventParcelable.CREATOR.createFromParcel(parcel);
                    }
                    a(messageEventParcelable);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    if (parcel.readInt() != 0) {
                        nodeParcelable = (NodeParcelable) NodeParcelable.CREATOR.createFromParcel(parcel);
                    }
                    a(nodeParcelable);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    if (parcel.readInt() != 0) {
                        nodeParcelable = (NodeParcelable) NodeParcelable.CREATOR.createFromParcel(parcel);
                    }
                    b(nodeParcelable);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    a(parcel.createTypedArrayList(NodeParcelable.CREATOR));
                    return true;
                case 6:
                    AncsNotificationParcelable ancsNotificationParcelable;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    if (parcel.readInt() != 0) {
                        ancsNotificationParcelable = (AncsNotificationParcelable) AncsNotificationParcelable.CREATOR.createFromParcel(parcel);
                    }
                    a(ancsNotificationParcelable);
                    return true;
                case 7:
                    ChannelEventParcelable channelEventParcelable;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    if (parcel.readInt() != 0) {
                        channelEventParcelable = (ChannelEventParcelable) ChannelEventParcelable.CREATOR.createFromParcel(parcel);
                    }
                    a(channelEventParcelable);
                    return true;
                case 8:
                    CapabilityInfoParcelable capabilityInfoParcelable;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    if (parcel.readInt() != 0) {
                        capabilityInfoParcelable = (CapabilityInfoParcelable) CapabilityInfoParcelable.CREATOR.createFromParcel(parcel);
                    }
                    a(capabilityInfoParcelable);
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    if (parcel.readInt() != 0) {
                        amsEntityUpdateParcelable = (AmsEntityUpdateParcelable) AmsEntityUpdateParcelable.CREATOR.createFromParcel(parcel);
                    }
                    a(amsEntityUpdateParcelable);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.wearable.internal.IWearableListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(DataHolder dataHolder);

    void a(AmsEntityUpdateParcelable amsEntityUpdateParcelable);

    void a(AncsNotificationParcelable ancsNotificationParcelable);

    void a(CapabilityInfoParcelable capabilityInfoParcelable);

    void a(ChannelEventParcelable channelEventParcelable);

    void a(MessageEventParcelable messageEventParcelable);

    void a(NodeParcelable nodeParcelable);

    void a(List<NodeParcelable> list);

    void b(NodeParcelable nodeParcelable);
}
