package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.aif;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GestureRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.x;
import java.util.List;

public interface i extends IInterface {

    public static abstract class a extends Binder implements i {

        private static class a implements i {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public Location a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    this.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    Location location = obtain2.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return location;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public ActivityRecognitionResult a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeString(str);
                    this.a.transact(64, obtain, obtain2, 0);
                    obtain2.readException();
                    ActivityRecognitionResult activityRecognitionResult = obtain2.readInt() != 0 ? (ActivityRecognitionResult) ActivityRecognitionResult.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return activityRecognitionResult;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(long j, boolean z, PendingIntent pendingIntent) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeLong(j);
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(PendingIntent pendingIntent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
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

            public void a(PendingIntent pendingIntent, aif com_google_android_gms_internal_aif) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_internal_aif != null ? com_google_android_gms_internal_aif.asBinder() : null);
                    this.a.transact(73, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(PendingIntent pendingIntent, h hVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    obtain.writeString(str);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(Location location) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (location != null) {
                        obtain.writeInt(1);
                        location.writeToParcel(obtain, 0);
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

            public void a(Location location, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (location != null) {
                        obtain.writeInt(1);
                        location.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(aif com_google_android_gms_internal_aif) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeStrongBinder(com_google_android_gms_internal_aif != null ? com_google_android_gms_internal_aif.asBinder() : null);
                    this.a.transact(71, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(ActivityRecognitionRequest activityRecognitionRequest, PendingIntent pendingIntent, aif com_google_android_gms_internal_aif) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (activityRecognitionRequest != null) {
                        obtain.writeInt(1);
                        activityRecognitionRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_internal_aif != null ? com_google_android_gms_internal_aif.asBinder() : null);
                    this.a.transact(70, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, aif com_google_android_gms_internal_aif) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (activityTransitionRequest != null) {
                        obtain.writeInt(1);
                        activityTransitionRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_internal_aif != null ? com_google_android_gms_internal_aif.asBinder() : null);
                    this.a.transact(72, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, h hVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (geofencingRequest != null) {
                        obtain.writeInt(1);
                        geofencingRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    this.a.transact(57, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(GestureRequest gestureRequest, PendingIntent pendingIntent, aif com_google_android_gms_internal_aif) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (gestureRequest != null) {
                        obtain.writeInt(1);
                        gestureRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_internal_aif != null ? com_google_android_gms_internal_aif.asBinder() : null);
                    this.a.transact(60, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(LocationRequest locationRequest, PendingIntent pendingIntent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (locationRequest != null) {
                        obtain.writeInt(1);
                        locationRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
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

            public void a(LocationRequest locationRequest, x xVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (locationRequest != null) {
                        obtain.writeInt(1);
                        locationRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(xVar != null ? xVar.asBinder() : null);
                    this.a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(LocationRequest locationRequest, x xVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (locationRequest != null) {
                        obtain.writeInt(1);
                        locationRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(xVar != null ? xVar.asBinder() : null);
                    obtain.writeString(str);
                    this.a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(LocationSettingsRequest locationSettingsRequest, j jVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (locationSettingsRequest != null) {
                        obtain.writeInt(1);
                        locationSettingsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
                    obtain.writeString(str);
                    this.a.transact(63, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (locationRequestInternal != null) {
                        obtain.writeInt(1);
                        locationRequestInternal.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(53, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(LocationRequestInternal locationRequestInternal, x xVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (locationRequestInternal != null) {
                        obtain.writeInt(1);
                        locationRequestInternal.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(xVar != null ? xVar.asBinder() : null);
                    this.a.transact(52, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(LocationRequestUpdateData locationRequestUpdateData) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (locationRequestUpdateData != null) {
                        obtain.writeInt(1);
                        locationRequestUpdateData.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(59, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(g gVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    this.a.transact(67, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(h hVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    obtain.writeString(str);
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(x xVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeStrongBinder(xVar != null ? xVar.asBinder() : null);
                    this.a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(List<ParcelableGeofence> list, PendingIntent pendingIntent, h hVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeTypedList(list);
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    obtain.writeString(str);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(String[] strArr, h hVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeStringArray(strArr);
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    obtain.writeString(str);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            public Location b(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeString(str);
                    this.a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                    Location location = obtain2.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return location;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void b(PendingIntent pendingIntent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
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

            public void b(PendingIntent pendingIntent, aif com_google_android_gms_internal_aif) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_internal_aif != null ? com_google_android_gms_internal_aif.asBinder() : null);
                    this.a.transact(65, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public LocationAvailability c(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeString(str);
                    this.a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                    LocationAvailability locationAvailability = obtain2.readInt() != 0 ? (LocationAvailability) LocationAvailability.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return locationAvailability;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void c(PendingIntent pendingIntent, aif com_google_android_gms_internal_aif) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_internal_aif != null ? com_google_android_gms_internal_aif.asBinder() : null);
                    this.a.transact(66, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void d(PendingIntent pendingIntent, aif com_google_android_gms_internal_aif) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_internal_aif != null ? com_google_android_gms_internal_aif.asBinder() : null);
                    this.a.transact(61, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void e(PendingIntent pendingIntent, aif com_google_android_gms_internal_aif) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_internal_aif != null ? com_google_android_gms_internal_aif.asBinder() : null);
                    this.a.transact(68, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void f(PendingIntent pendingIntent, aif com_google_android_gms_internal_aif) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_internal_aif != null ? com_google_android_gms_internal_aif.asBinder() : null);
                    this.a.transact(69, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static i a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof i)) ? new a(iBinder) : (i) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            boolean z = false;
            Location a;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.createTypedArrayList(ParcelableGeofence.CREATOR), parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.location.internal.h.a.a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.location.internal.h.a.a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.createStringArray(), com.google.android.gms.location.internal.h.a.a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(com.google.android.gms.location.internal.h.a.a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readLong(), parcel.readInt() != 0, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a = a();
                    parcel2.writeNoException();
                    if (a != null) {
                        parcel2.writeInt(1);
                        a.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? (LocationRequest) LocationRequest.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.location.x.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? (LocationRequest) LocationRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(com.google.android.gms.location.x.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    b(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(z);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? (LocationRequest) LocationRequest.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.location.x.a.a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a = b(parcel.readString());
                    parcel2.writeNoException();
                    if (a != null) {
                        parcel2.writeInt(1);
                        a.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 26:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    LocationAvailability c = c(parcel.readString());
                    parcel2.writeNoException();
                    if (c != null) {
                        parcel2.writeInt(1);
                        c.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 52:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? (LocationRequestInternal) LocationRequestInternal.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.location.x.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 53:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? (LocationRequestInternal) LocationRequestInternal.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 57:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? (GeofencingRequest) GeofencingRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.location.internal.h.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 59:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? (LocationRequestUpdateData) LocationRequestUpdateData.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 60:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? (GestureRequest) GestureRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.internal.aif.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 61:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    d(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.internal.aif.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 63:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? (LocationSettingsRequest) LocationSettingsRequest.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.location.internal.j.a.a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 64:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    ActivityRecognitionResult a2 = a(parcel.readString());
                    parcel2.writeNoException();
                    if (a2 != null) {
                        parcel2.writeInt(1);
                        a2.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 65:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    b(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.internal.aif.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 66:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    c(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.internal.aif.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 67:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(com.google.android.gms.location.internal.g.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 68:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    e(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.internal.aif.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 69:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    f(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.internal.aif.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 70:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? (ActivityRecognitionRequest) ActivityRecognitionRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.internal.aif.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 71:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(com.google.android.gms.internal.aif.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 72:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? (ActivityTransitionRequest) ActivityTransitionRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.internal.aif.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 73:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.internal.aif.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    Location a();

    ActivityRecognitionResult a(String str);

    void a(long j, boolean z, PendingIntent pendingIntent);

    void a(PendingIntent pendingIntent);

    void a(PendingIntent pendingIntent, aif com_google_android_gms_internal_aif);

    void a(PendingIntent pendingIntent, h hVar, String str);

    void a(Location location);

    void a(Location location, int i);

    void a(aif com_google_android_gms_internal_aif);

    void a(ActivityRecognitionRequest activityRecognitionRequest, PendingIntent pendingIntent, aif com_google_android_gms_internal_aif);

    void a(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, aif com_google_android_gms_internal_aif);

    void a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, h hVar);

    void a(GestureRequest gestureRequest, PendingIntent pendingIntent, aif com_google_android_gms_internal_aif);

    void a(LocationRequest locationRequest, PendingIntent pendingIntent);

    void a(LocationRequest locationRequest, x xVar);

    void a(LocationRequest locationRequest, x xVar, String str);

    void a(LocationSettingsRequest locationSettingsRequest, j jVar, String str);

    void a(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent);

    void a(LocationRequestInternal locationRequestInternal, x xVar);

    void a(LocationRequestUpdateData locationRequestUpdateData);

    void a(g gVar);

    void a(h hVar, String str);

    void a(x xVar);

    void a(List<ParcelableGeofence> list, PendingIntent pendingIntent, h hVar, String str);

    void a(boolean z);

    void a(String[] strArr, h hVar, String str);

    Location b(String str);

    void b(PendingIntent pendingIntent);

    void b(PendingIntent pendingIntent, aif com_google_android_gms_internal_aif);

    LocationAvailability c(String str);

    void c(PendingIntent pendingIntent, aif com_google_android_gms_internal_aif);

    void d(PendingIntent pendingIntent, aif com_google_android_gms_internal_aif);

    void e(PendingIntent pendingIntent, aif com_google_android_gms_internal_aif);

    void f(PendingIntent pendingIntent, aif com_google_android_gms_internal_aif);
}
