package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.PutDataRequest;

public interface y extends IInterface {

    public static abstract class a extends Binder implements y {

        private static class a implements y {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(w wVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    this.a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(w wVar, byte b) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    obtain.writeByte(b);
                    this.a.transact(53, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(w wVar, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    obtain.writeInt(i);
                    this.a.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(w wVar, Uri uri) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(w wVar, Uri uri, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.a.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(w wVar, Asset asset) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    if (asset != null) {
                        obtain.writeInt(1);
                        asset.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(w wVar, ConnectionConfiguration connectionConfiguration) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    if (connectionConfiguration != null) {
                        obtain.writeInt(1);
                        connectionConfiguration.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(w wVar, PutDataRequest putDataRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    if (putDataRequest != null) {
                        obtain.writeInt(1);
                        putDataRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(w wVar, AddListenerRequest addListenerRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    if (addListenerRequest != null) {
                        obtain.writeInt(1);
                        addListenerRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(w wVar, AncsNotificationParcelable ancsNotificationParcelable) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    if (ancsNotificationParcelable != null) {
                        obtain.writeInt(1);
                        ancsNotificationParcelable.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(w wVar, RemoveListenerRequest removeListenerRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    if (removeListenerRequest != null) {
                        obtain.writeInt(1);
                        removeListenerRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(w wVar, v vVar, String str) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    if (vVar != null) {
                        iBinder = vVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    this.a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(w wVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    obtain.writeString(str);
                    this.a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(w wVar, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.a.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(w wVar, String str, ParcelFileDescriptor parcelFileDescriptor) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    obtain.writeString(str);
                    if (parcelFileDescriptor != null) {
                        obtain.writeInt(1);
                        parcelFileDescriptor.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(w wVar, String str, ParcelFileDescriptor parcelFileDescriptor, long j, long j2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    obtain.writeString(str);
                    if (parcelFileDescriptor != null) {
                        obtain.writeInt(1);
                        parcelFileDescriptor.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    this.a.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(w wVar, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(w wVar, String str, String str2, byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeByteArray(bArr);
                    this.a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(w wVar, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.a.transact(48, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void b(w wVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    this.a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void b(w wVar, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    obtain.writeInt(i);
                    this.a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void b(w wVar, Uri uri) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void b(w wVar, Uri uri, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void b(w wVar, ConnectionConfiguration connectionConfiguration) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    if (connectionConfiguration != null) {
                        obtain.writeInt(1);
                        connectionConfiguration.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void b(w wVar, v vVar, String str) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    if (vVar != null) {
                        iBinder = vVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    this.a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void b(w wVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    obtain.writeString(str);
                    this.a.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void b(w wVar, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void b(w wVar, boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.a.transact(50, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void c(w wVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    this.a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void c(w wVar, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    obtain.writeInt(i);
                    this.a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void c(w wVar, Uri uri) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void c(w wVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    obtain.writeString(str);
                    this.a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void d(w wVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    this.a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void d(w wVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    obtain.writeString(str);
                    this.a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void e(w wVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    this.a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void e(w wVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    obtain.writeString(str);
                    this.a.transact(47, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void f(w wVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    this.a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void f(w wVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    obtain.writeString(str);
                    this.a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void g(w wVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    this.a.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void h(w wVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    this.a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void i(w wVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    this.a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void j(w wVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    this.a.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void k(w wVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    this.a.transact(49, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void l(w wVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    this.a.transact(51, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void m(w wVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    this.a.transact(52, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void n(w wVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void o(w wVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void p(w wVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static y a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof y)) ? new a(iBinder) : (y) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            boolean z = false;
            ConnectionConfiguration connectionConfiguration = null;
            w a;
            Uri uri;
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a = com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        connectionConfiguration = (ConnectionConfiguration) ConnectionConfiguration.CREATOR.createFromParcel(parcel);
                    }
                    b(a, connectionConfiguration);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    n(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    o(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    p(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    PutDataRequest putDataRequest;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a = com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        putDataRequest = (PutDataRequest) PutDataRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(a, putDataRequest);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a = com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                    }
                    a(a, uri);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    b(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a = com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                    }
                    b(a, uri);
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a = com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                    }
                    c(a, uri);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    Asset asset;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a = com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        asset = (Asset) Asset.CREATOR.createFromParcel(parcel);
                    }
                    a(a, asset);
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    c(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    d(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    AddListenerRequest addListenerRequest;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a = com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        addListenerRequest = (AddListenerRequest) AddListenerRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(a, addListenerRequest);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    RemoveListenerRequest removeListenerRequest;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a = com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        removeListenerRequest = (RemoveListenerRequest) RemoveListenerRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(a, removeListenerRequest);
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    e(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    f(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a = com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        connectionConfiguration = (ConnectionConfiguration) ConnectionConfiguration.CREATOR.createFromParcel(parcel);
                    }
                    a(a, connectionConfiguration);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    b(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    c(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    g(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    h(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 27:
                    AncsNotificationParcelable ancsNotificationParcelable;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a = com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        ancsNotificationParcelable = (AncsNotificationParcelable) AncsNotificationParcelable.CREATOR.createFromParcel(parcel);
                    }
                    a(a, ancsNotificationParcelable);
                    parcel2.writeNoException();
                    return true;
                case 28:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    b(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 29:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    c(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 30:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    i(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 31:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 32:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    f(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 33:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    b(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), com.google.android.gms.wearable.internal.v.a.a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    b(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), com.google.android.gms.wearable.internal.v.a.a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    j(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 38:
                    ParcelFileDescriptor parcelFileDescriptor;
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a = com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        parcelFileDescriptor = (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
                    }
                    a(a, readString, parcelFileDescriptor);
                    parcel2.writeNoException();
                    return true;
                case 39:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel) : null, parcel.readLong(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a = com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                    }
                    a(a, uri, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a = com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                    }
                    b(a, uri, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 46:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    d(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 47:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    e(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 48:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 49:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    k(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 50:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    w a2 = com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    b(a2, z);
                    parcel2.writeNoException();
                    return true;
                case 51:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    l(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 52:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    m(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 53:
                    parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    a(com.google.android.gms.wearable.internal.w.a.a(parcel.readStrongBinder()), parcel.readByte());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.wearable.internal.IWearableService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(w wVar);

    void a(w wVar, byte b);

    void a(w wVar, int i);

    void a(w wVar, Uri uri);

    void a(w wVar, Uri uri, int i);

    void a(w wVar, Asset asset);

    void a(w wVar, ConnectionConfiguration connectionConfiguration);

    void a(w wVar, PutDataRequest putDataRequest);

    void a(w wVar, AddListenerRequest addListenerRequest);

    void a(w wVar, AncsNotificationParcelable ancsNotificationParcelable);

    void a(w wVar, RemoveListenerRequest removeListenerRequest);

    void a(w wVar, v vVar, String str);

    void a(w wVar, String str);

    void a(w wVar, String str, int i);

    void a(w wVar, String str, ParcelFileDescriptor parcelFileDescriptor);

    void a(w wVar, String str, ParcelFileDescriptor parcelFileDescriptor, long j, long j2);

    void a(w wVar, String str, String str2);

    void a(w wVar, String str, String str2, byte[] bArr);

    void a(w wVar, boolean z);

    void b(w wVar);

    void b(w wVar, int i);

    void b(w wVar, Uri uri);

    void b(w wVar, Uri uri, int i);

    void b(w wVar, ConnectionConfiguration connectionConfiguration);

    void b(w wVar, v vVar, String str);

    void b(w wVar, String str);

    void b(w wVar, String str, int i);

    void b(w wVar, boolean z);

    void c(w wVar);

    void c(w wVar, int i);

    void c(w wVar, Uri uri);

    void c(w wVar, String str);

    void d(w wVar);

    void d(w wVar, String str);

    void e(w wVar);

    void e(w wVar, String str);

    void f(w wVar);

    void f(w wVar, String str);

    void g(w wVar);

    void h(w wVar);

    void i(w wVar);

    void j(w wVar);

    void k(w wVar);

    void l(w wVar);

    void m(w wVar);

    void n(w wVar);

    void o(w wVar);

    void p(w wVar);
}
