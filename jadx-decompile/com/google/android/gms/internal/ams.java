package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

public class ams {
    private static Boolean a = null;
    private static ContentProviderClient b;

    static Intent a(Context context, String str, Intent intent) {
        return a(context, str, (Parcelable) intent, true);
    }

    @TargetApi(11)
    private static Intent a(Context context, String str, Parcelable parcelable, boolean z) {
        Throwable e;
        if (context == null || str == null) {
            throw new IllegalArgumentException("Parameter is null");
        } else if (!a(context)) {
            return null;
        } else {
            Bundle bundle;
            if (parcelable != null) {
                bundle = new Bundle(1);
                bundle.putParcelable("key_fallbackIntent", parcelable);
            } else {
                bundle = null;
            }
            try {
                bundle = a(context, "method_getInstantAppIntent", str, bundle);
                return bundle == null ? null : (Intent) bundle.getParcelable("key_instantAppIntent");
            } catch (Throwable e2) {
                Log.e("InstantAppsApi", String.format("While calling %s %s:\n", new Object[]{amq.a, "method_getInstantAppIntent"}), e2);
                a();
                return z ? a(context, str, parcelable, false) : null;
            } catch (IllegalArgumentException e3) {
                e2 = e3;
                Log.e("InstantAppsApi", String.format("While calling %s %s:\n", new Object[]{amq.a, "method_getInstantAppIntent"}), e2);
                return null;
            } catch (RemoteException e4) {
                e2 = e4;
                Log.e("InstantAppsApi", String.format("While calling %s %s:\n", new Object[]{amq.a, "method_getInstantAppIntent"}), e2);
                return null;
            }
        }
    }

    @TargetApi(11)
    private static synchronized Bundle a(Context context, String str, String str2, Bundle bundle) {
        Bundle call;
        synchronized (ams.class) {
            call = b == null ? context.getContentResolver().call(amq.a, str, str2, bundle) : a(str, str2, bundle);
        }
        return call;
    }

    @TargetApi(17)
    private static synchronized Bundle a(String str, String str2, Bundle bundle) {
        Bundle call;
        synchronized (ams.class) {
            call = b.call(str, str2, bundle);
        }
        return call;
    }

    static synchronized void a() {
        synchronized (ams.class) {
            if (b != null) {
                b.release();
                b = null;
            }
            a = null;
        }
    }

    @TargetApi(11)
    static synchronized boolean a(Context context) {
        boolean booleanValue;
        synchronized (ams.class) {
            if (context == null) {
                throw new IllegalArgumentException("Parameter is null");
            }
            if (a != null) {
                booleanValue = a.booleanValue();
            } else {
                a = Boolean.valueOf(c(context));
                booleanValue = a.booleanValue();
            }
        }
        return booleanValue;
    }

    @TargetApi(17)
    private static synchronized boolean b(Context context) {
        boolean z;
        synchronized (ams.class) {
            if (b == null) {
                b = context.getContentResolver().acquireUnstableContentProviderClient(amq.a);
            }
            z = b != null;
        }
        return z;
    }

    private static synchronized boolean c(Context context) {
        boolean z = false;
        synchronized (ams.class) {
            if (VERSION.SDK_INT >= 11) {
                if (amt.a(context)) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(amq.a.getAuthority(), 0);
                    if (resolveContentProvider != null) {
                        if (!resolveContentProvider.packageName.equals("com.google.android.gms")) {
                            String str = "InstantAppsApi";
                            String str2 = "Incorrect package name for instant apps content provider: ";
                            String valueOf = String.valueOf(resolveContentProvider.packageName);
                            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                        } else if (VERSION.SDK_INT < 17 || b(context)) {
                            z = true;
                        }
                    }
                }
            }
        }
        return z;
    }
}
