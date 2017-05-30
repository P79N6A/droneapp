package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.reward.client.b;
import com.google.android.gms.c.e;
import com.google.android.gms.internal.uw;
import com.google.android.gms.internal.xq;
import com.google.android.gms.internal.yq;
import com.google.android.gms.internal.yz;

public interface an extends IInterface {

    public static abstract class a extends Binder implements an {

        private static class a implements an {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public IBinder asBinder() {
                return this.a;
            }

            public ai createAdLoaderBuilder(e eVar, String str, xq xqVar, int i) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    obtain.writeString(str);
                    if (xqVar != null) {
                        iBinder = xqVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    ai a = com.google.android.gms.ads.internal.client.ai.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public yq createAdOverlay(e eVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    this.a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    yq a = com.google.android.gms.internal.yq.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public ak createBannerAdManager(e eVar, AdSizeParcel adSizeParcel, String str, xq xqVar, int i) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    if (adSizeParcel != null) {
                        obtain.writeInt(1);
                        adSizeParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (xqVar != null) {
                        iBinder = xqVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    ak a = com.google.android.gms.ads.internal.client.ak.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public yz createInAppPurchaseManager(e eVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    this.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    yz a = com.google.android.gms.internal.yz.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public ak createInterstitialAdManager(e eVar, AdSizeParcel adSizeParcel, String str, xq xqVar, int i) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    if (adSizeParcel != null) {
                        obtain.writeInt(1);
                        adSizeParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (xqVar != null) {
                        iBinder = xqVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    ak a = com.google.android.gms.ads.internal.client.ak.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public uw createNativeAdViewDelegate(e eVar, e eVar2) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    if (eVar2 != null) {
                        iBinder = eVar2.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    uw a = com.google.android.gms.internal.uw.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public b createRewardedVideoAd(e eVar, xq xqVar, int i) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    if (xqVar != null) {
                        iBinder = xqVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    b a = com.google.android.gms.ads.internal.reward.client.b.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public ak createSearchAdManager(e eVar, AdSizeParcel adSizeParcel, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    if (adSizeParcel != null) {
                        obtain.writeInt(1);
                        adSizeParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    ak a = com.google.android.gms.ads.internal.client.ak.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public ap getMobileAdsSettingsManager(e eVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    ap a = com.google.android.gms.ads.internal.client.ap.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public ap getMobileAdsSettingsManagerWithClientJarVersion(e eVar, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    obtain.writeInt(i);
                    this.a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    ap a = com.google.android.gms.ads.internal.client.ap.a.a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.google.android.gms.ads.internal.client.IClientApi");
        }

        public static an asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof an)) ? new a(iBinder) : (an) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IBinder iBinder = null;
            ak createBannerAdManager;
            ap mobileAdsSettingsManager;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    createBannerAdManager = createBannerAdManager(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (AdSizeParcel) AdSizeParcel.CREATOR.createFromParcel(parcel) : null, parcel.readString(), com.google.android.gms.internal.xq.a.a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    if (createBannerAdManager != null) {
                        iBinder = createBannerAdManager.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    createBannerAdManager = createInterstitialAdManager(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (AdSizeParcel) AdSizeParcel.CREATOR.createFromParcel(parcel) : null, parcel.readString(), com.google.android.gms.internal.xq.a.a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    if (createBannerAdManager != null) {
                        iBinder = createBannerAdManager.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    ai createAdLoaderBuilder = createAdLoaderBuilder(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), parcel.readString(), com.google.android.gms.internal.xq.a.a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    if (createAdLoaderBuilder != null) {
                        iBinder = createAdLoaderBuilder.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    mobileAdsSettingsManager = getMobileAdsSettingsManager(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (mobileAdsSettingsManager != null) {
                        iBinder = mobileAdsSettingsManager.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    uw createNativeAdViewDelegate = createNativeAdViewDelegate(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), com.google.android.gms.c.e.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (createNativeAdViewDelegate != null) {
                        iBinder = createNativeAdViewDelegate.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    b createRewardedVideoAd = createRewardedVideoAd(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), com.google.android.gms.internal.xq.a.a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    if (createRewardedVideoAd != null) {
                        iBinder = createRewardedVideoAd.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    yz createInAppPurchaseManager = createInAppPurchaseManager(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (createInAppPurchaseManager != null) {
                        iBinder = createInAppPurchaseManager.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    yq createAdOverlay = createAdOverlay(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (createAdOverlay != null) {
                        iBinder = createAdOverlay.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    mobileAdsSettingsManager = getMobileAdsSettingsManagerWithClientJarVersion(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    if (mobileAdsSettingsManager != null) {
                        iBinder = mobileAdsSettingsManager.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    createBannerAdManager = createSearchAdManager(com.google.android.gms.c.e.a.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (AdSizeParcel) AdSizeParcel.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    if (createBannerAdManager != null) {
                        iBinder = createBannerAdManager.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.client.IClientApi");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    ai createAdLoaderBuilder(e eVar, String str, xq xqVar, int i);

    yq createAdOverlay(e eVar);

    ak createBannerAdManager(e eVar, AdSizeParcel adSizeParcel, String str, xq xqVar, int i);

    yz createInAppPurchaseManager(e eVar);

    ak createInterstitialAdManager(e eVar, AdSizeParcel adSizeParcel, String str, xq xqVar, int i);

    uw createNativeAdViewDelegate(e eVar, e eVar2);

    b createRewardedVideoAd(e eVar, xq xqVar, int i);

    ak createSearchAdManager(e eVar, AdSizeParcel adSizeParcel, String str, int i);

    ap getMobileAdsSettingsManager(e eVar);

    ap getMobileAdsSettingsManagerWithClientJarVersion(e eVar, int i);
}
