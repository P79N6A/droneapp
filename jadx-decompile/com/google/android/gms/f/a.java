package com.google.android.gms.f;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.common.j;
import com.google.android.gms.common.l;
import java.lang.reflect.Method;

public class a {
    public static final String a = "GmsCore_OpenSSL";
    private static final j b = j.b();
    private static final Object c = new Object();
    private static Method d = null;

    class AnonymousClass1 extends AsyncTask<Void, Void, Integer> {
        final /* synthetic */ Context a;
        final /* synthetic */ a b;

        AnonymousClass1(Context context, a aVar) {
            this.a = context;
            this.b = aVar;
        }

        protected Integer a(Void... voidArr) {
            try {
                a.a(this.a);
                return Integer.valueOf(0);
            } catch (d e) {
                return Integer.valueOf(e.a());
            } catch (c e2) {
                return Integer.valueOf(e2.a);
            }
        }

        protected void a(Integer num) {
            if (num.intValue() == 0) {
                this.b.a();
                return;
            }
            this.b.a(num.intValue(), a.b.a(this.a, num.intValue(), "pi"));
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return a((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            a((Integer) obj);
        }
    }

    public interface a {
        void a();

        void a(int i, Intent intent);
    }

    public static void a(Context context) {
        com.google.android.gms.common.internal.d.a(context, "Context must not be null");
        b.d(context);
        Context l = l.l(context);
        if (l == null) {
            Log.e("ProviderInstaller", "Failed to get remote context");
            throw new c(8);
        }
        synchronized (c) {
            try {
                if (d == null) {
                    b(l);
                }
                d.invoke(null, new Object[]{l});
            } catch (Exception e) {
                String str = "ProviderInstaller";
                String str2 = "Failed to install provider: ";
                String valueOf = String.valueOf(e.getMessage());
                Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                throw new c(8);
            }
        }
    }

    public static void a(Context context, a aVar) {
        com.google.android.gms.common.internal.d.a(context, "Context must not be null");
        com.google.android.gms.common.internal.d.a(aVar, "Listener must not be null");
        com.google.android.gms.common.internal.d.b("Must be called on the UI thread");
        new AnonymousClass1(context, aVar).execute(new Void[0]);
    }

    private static void b(Context context) {
        d = context.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("insertProvider", new Class[]{Context.class});
    }
}
