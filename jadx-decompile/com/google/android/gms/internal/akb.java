package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.j;
import java.lang.reflect.Field;

public final class akb {
    public static final b a = new b() {
        public b a(Context context, String str, a aVar) {
            b bVar = new b();
            bVar.b = aVar.a(context, str, true);
            if (bVar.b != 0) {
                bVar.c = 1;
            } else {
                bVar.a = aVar.a(context, str);
                if (bVar.a != 0) {
                    bVar.c = -1;
                }
            }
            return bVar;
        }
    };
    public static final b b = new b() {
        public b a(Context context, String str, a aVar) {
            b bVar = new b();
            bVar.a = aVar.a(context, str);
            if (bVar.a != 0) {
                bVar.c = -1;
            } else {
                bVar.b = aVar.a(context, str, true);
                if (bVar.b != 0) {
                    bVar.c = 1;
                }
            }
            return bVar;
        }
    };
    public static final b c = new b() {
        public b a(Context context, String str, a aVar) {
            b bVar = new b();
            bVar.a = aVar.a(context, str);
            bVar.b = aVar.a(context, str, true);
            if (bVar.a == 0 && bVar.b == 0) {
                bVar.c = 0;
            } else if (bVar.a >= bVar.b) {
                bVar.c = -1;
            } else {
                bVar.c = 1;
            }
            return bVar;
        }
    };
    public static final b d = new b() {
        public b a(Context context, String str, a aVar) {
            b bVar = new b();
            bVar.a = aVar.a(context, str);
            bVar.b = aVar.a(context, str, true);
            if (bVar.a == 0 && bVar.b == 0) {
                bVar.c = 0;
            } else if (bVar.b >= bVar.a) {
                bVar.c = 1;
            } else {
                bVar.c = -1;
            }
            return bVar;
        }
    };
    public static final b e = new b() {
        public b a(Context context, String str, a aVar) {
            b bVar = new b();
            bVar.a = aVar.a(context, str);
            if (bVar.a != 0) {
                bVar.b = aVar.a(context, str, false);
            } else {
                bVar.b = aVar.a(context, str, true);
            }
            if (bVar.a == 0 && bVar.b == 0) {
                bVar.c = 0;
            } else if (bVar.b >= bVar.a) {
                bVar.c = 1;
            } else {
                bVar.c = -1;
            }
            return bVar;
        }
    };
    private static akc f;
    private static final a g = new a() {
        public int a(Context context, String str) {
            return akb.a(context, str);
        }

        public int a(Context context, String str, boolean z) {
            return akb.a(context, str, z);
        }
    };
    private final Context h;

    public interface b {

        public interface a {
            int a(Context context, String str);

            int a(Context context, String str, boolean z);
        }

        public static class b {
            public int a = 0;
            public int b = 0;
            public int c = 0;
        }

        b a(Context context, String str, a aVar);
    }

    class AnonymousClass7 implements a {
        final /* synthetic */ int a;

        AnonymousClass7(int i) {
            this.a = i;
        }

        public int a(Context context, String str) {
            return this.a;
        }

        public int a(Context context, String str, boolean z) {
            return 0;
        }
    }

    public static class a extends Exception {
        private a(String str) {
            super(str);
        }

        private a(String str, Throwable th) {
            super(str, th);
        }
    }

    private akb(Context context) {
        this.h = (Context) d.a(context);
    }

    public static int a(Context context, String str) {
        String valueOf;
        String valueOf2;
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            valueOf = String.valueOf("com.google.android.gms.dynamite.descriptors.");
            valueOf2 = String.valueOf("ModuleDescriptor");
            Class loadClass = classLoader.loadClass(new StringBuilder(((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(str).append(".").append(valueOf2).toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            valueOf = String.valueOf(declaredField.get(null));
            Log.e("DynamiteModule", new StringBuilder((String.valueOf(valueOf).length() + 51) + String.valueOf(str).length()).append("Module descriptor id '").append(valueOf).append("' didn't match expected id '").append(str).append("'").toString());
            return 0;
        } catch (ClassNotFoundException e) {
            Log.w("DynamiteModule", new StringBuilder(String.valueOf(str).length() + 45).append("Local module descriptor class for ").append(str).append(" not found.").toString());
            return 0;
        } catch (Exception e2) {
            valueOf = "DynamiteModule";
            valueOf2 = "Failed to load module descriptor class: ";
            String valueOf3 = String.valueOf(e2.getMessage());
            Log.e(valueOf, valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2));
            return 0;
        }
    }

    public static int a(Context context, String str, boolean z) {
        akc a = a(context);
        if (a == null) {
            return 0;
        }
        try {
            return a.a(f.a(context), str, z);
        } catch (RemoteException e) {
            String str2 = "DynamiteModule";
            String str3 = "Failed to retrieve remote module version: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return 0;
        }
    }

    public static akb a(Context context, b bVar, String str) {
        b a = bVar.a(context, str, g);
        Log.i("DynamiteModule", new StringBuilder((String.valueOf(str).length() + 68) + String.valueOf(str).length()).append("Considering local module ").append(str).append(":").append(a.a).append(" and remote module ").append(str).append(":").append(a.b).toString());
        if (a.c == 0 || ((a.c == -1 && a.a == 0) || (a.c == 1 && a.b == 0))) {
            throw new a("No acceptable module found. Local version is " + a.a + " and remote version is " + a.b + ".");
        } else if (a.c == -1) {
            return c(context, str);
        } else {
            if (a.c == 1) {
                try {
                    return a(context, str, a.b);
                } catch (Throwable e) {
                    Throwable th = e;
                    String str2 = "DynamiteModule";
                    String str3 = "Failed to load remote module: ";
                    String valueOf = String.valueOf(th.getMessage());
                    Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                    if (a.a != 0 && bVar.a(context, str, new AnonymousClass7(a.a)).c == -1) {
                        return c(context, str);
                    }
                    throw new a("Remote load failed. No local fallback found.", th);
                }
            }
            throw new a("VersionPolicy returned invalid code:" + a.c);
        }
    }

    private static akb a(Context context, String str, int i) {
        Log.i("DynamiteModule", new StringBuilder(String.valueOf(str).length() + 51).append("Selected remote version of ").append(str).append(", version >= ").append(i).toString());
        akc a = a(context);
        if (a == null) {
            throw new a("Failed to create IDynamiteLoader.");
        }
        try {
            e a2 = a.a(f.a(context), str, i);
            if (f.a(a2) != null) {
                return new akb((Context) f.a(a2));
            }
            throw new a("Failed to load remote module.");
        } catch (Throwable e) {
            throw new a("Failed to load remote module.", e);
        }
    }

    private static akc a(Context context) {
        synchronized (akb.class) {
            akc com_google_android_gms_internal_akc;
            if (f != null) {
                com_google_android_gms_internal_akc = f;
                return com_google_android_gms_internal_akc;
            } else if (j.b().a(context) != 0) {
                return null;
            } else {
                try {
                    com_google_android_gms_internal_akc = com.google.android.gms.internal.akc.a.a((IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance());
                    if (com_google_android_gms_internal_akc != null) {
                        f = com_google_android_gms_internal_akc;
                        return com_google_android_gms_internal_akc;
                    }
                } catch (Exception e) {
                    String str = "DynamiteModule";
                    String str2 = "Failed to load IDynamiteLoader from GmsCore: ";
                    String valueOf = String.valueOf(e.getMessage());
                    Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    return null;
                }
            }
        }
    }

    public static int b(Context context, String str) {
        return a(context, str, false);
    }

    private static akb c(Context context, String str) {
        String str2 = "DynamiteModule";
        String str3 = "Selected local version of ";
        String valueOf = String.valueOf(str);
        Log.i(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        return new akb(context.getApplicationContext());
    }

    public Context a() {
        return this.h;
    }

    public IBinder a(String str) {
        Throwable e;
        String str2;
        String valueOf;
        try {
            return (IBinder) this.h.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException e2) {
            e = e2;
            str2 = "Failed to instantiate module class: ";
            valueOf = String.valueOf(str);
            throw new a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
        } catch (InstantiationException e3) {
            e = e3;
            str2 = "Failed to instantiate module class: ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
            }
            throw new a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
        } catch (IllegalAccessException e4) {
            e = e4;
            str2 = "Failed to instantiate module class: ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
            }
            throw new a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
        }
    }
}
