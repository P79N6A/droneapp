package com.google.android.gms.nearby.messages.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface l extends IInterface {

    public static abstract class a extends Binder implements l {

        private static class a implements l {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(GetPermissionStatusRequest getPermissionStatusRequest) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (getPermissionStatusRequest != null) {
                        obtain.writeInt(1);
                        getPermissionStatusRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(HandleClientLifecycleEventRequest handleClientLifecycleEventRequest) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (handleClientLifecycleEventRequest != null) {
                        obtain.writeInt(1);
                        handleClientLifecycleEventRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(PublishRequest publishRequest) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (publishRequest != null) {
                        obtain.writeInt(1);
                        publishRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(RegisterStatusCallbackRequest registerStatusCallbackRequest) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (registerStatusCallbackRequest != null) {
                        obtain.writeInt(1);
                        registerStatusCallbackRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(8, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(SubscribeRequest subscribeRequest) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (subscribeRequest != null) {
                        obtain.writeInt(1);
                        subscribeRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(UnpublishRequest unpublishRequest) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (unpublishRequest != null) {
                        obtain.writeInt(1);
                        unpublishRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(UnsubscribeRequest unsubscribeRequest) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (unsubscribeRequest != null) {
                        obtain.writeInt(1);
                        unsubscribeRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    obtain.writeString(str);
                    this.a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

        public static l a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof l)) ? new a(iBinder) : (l) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            HandleClientLifecycleEventRequest handleClientLifecycleEventRequest = null;
            switch (i) {
                case 1:
                    PublishRequest publishRequest;
                    parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (parcel.readInt() != 0) {
                        publishRequest = (PublishRequest) PublishRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(publishRequest);
                    return true;
                case 2:
                    UnpublishRequest unpublishRequest;
                    parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (parcel.readInt() != 0) {
                        unpublishRequest = (UnpublishRequest) UnpublishRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(unpublishRequest);
                    return true;
                case 3:
                    SubscribeRequest subscribeRequest;
                    parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (parcel.readInt() != 0) {
                        subscribeRequest = (SubscribeRequest) SubscribeRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(subscribeRequest);
                    return true;
                case 4:
                    UnsubscribeRequest unsubscribeRequest;
                    parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (parcel.readInt() != 0) {
                        unsubscribeRequest = (UnsubscribeRequest) UnsubscribeRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(unsubscribeRequest);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    a(parcel.readString());
                    return true;
                case 7:
                    GetPermissionStatusRequest getPermissionStatusRequest;
                    parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (parcel.readInt() != 0) {
                        getPermissionStatusRequest = (GetPermissionStatusRequest) GetPermissionStatusRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(getPermissionStatusRequest);
                    return true;
                case 8:
                    RegisterStatusCallbackRequest registerStatusCallbackRequest;
                    parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (parcel.readInt() != 0) {
                        registerStatusCallbackRequest = (RegisterStatusCallbackRequest) RegisterStatusCallbackRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(registerStatusCallbackRequest);
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if (parcel.readInt() != 0) {
                        handleClientLifecycleEventRequest = (HandleClientLifecycleEventRequest) HandleClientLifecycleEventRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(handleClientLifecycleEventRequest);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(GetPermissionStatusRequest getPermissionStatusRequest);

    void a(HandleClientLifecycleEventRequest handleClientLifecycleEventRequest);

    void a(PublishRequest publishRequest);

    void a(RegisterStatusCallbackRequest registerStatusCallbackRequest);

    void a(SubscribeRequest subscribeRequest);

    void a(UnpublishRequest unpublishRequest);

    void a(UnsubscribeRequest unsubscribeRequest);

    void a(String str);
}
