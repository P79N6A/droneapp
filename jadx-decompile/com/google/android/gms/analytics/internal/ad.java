package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.common.internal.d;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class ad extends t {
    private volatile String a;
    private Future<String> b;

    protected ad(v vVar) {
        super(vVar);
    }

    private boolean a(Context context, String str) {
        d.a(str);
        d.c("ClientId should be saved from worker thread");
        FileOutputStream fileOutputStream = null;
        try {
            a("Storing clientId", str);
            fileOutputStream = context.openFileOutput("gaClientId", 0);
            fileOutputStream.write(str.getBytes());
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e("Failed to close clientId writing stream", e);
                }
            }
            return true;
        } catch (FileNotFoundException e2) {
            e("Error creating clientId file", e2);
            if (fileOutputStream == null) {
                return false;
            }
            try {
                fileOutputStream.close();
                return false;
            } catch (IOException e3) {
                e("Failed to close clientId writing stream", e3);
                return false;
            }
        } catch (IOException e32) {
            e("Error writing to clientId file", e32);
            if (fileOutputStream == null) {
                return false;
            }
            try {
                fileOutputStream.close();
                return false;
            } catch (IOException e322) {
                e("Failed to close clientId writing stream", e322);
                return false;
            }
        } catch (Throwable th) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e3222) {
                    e("Failed to close clientId writing stream", e3222);
                }
            }
        }
    }

    private String f() {
        String e = e();
        try {
            return !a(r().c(), e) ? "0" : e;
        } catch (Exception e2) {
            e("Error saving clientId file", e2);
            return "0";
        }
    }

    protected String a(Context context) {
        FileInputStream openFileInput;
        FileInputStream fileInputStream;
        Object e;
        Throwable th;
        d.c("ClientId should be loaded from worker thread");
        try {
            openFileInput = context.openFileInput("gaClientId");
            try {
                byte[] bArr = new byte[36];
                int read = openFileInput.read(bArr, 0, 36);
                if (openFileInput.available() > 0) {
                    t("clientId file seems corrupted, deleting it.");
                    openFileInput.close();
                    context.deleteFile("gaClientId");
                    if (openFileInput == null) {
                        return null;
                    }
                    try {
                        openFileInput.close();
                        return null;
                    } catch (IOException e2) {
                        e("Failed to close client id reading stream", e2);
                        return null;
                    }
                } else if (read < 14) {
                    t("clientId file is empty, deleting it.");
                    openFileInput.close();
                    context.deleteFile("gaClientId");
                    if (openFileInput == null) {
                        return null;
                    }
                    try {
                        openFileInput.close();
                        return null;
                    } catch (IOException e22) {
                        e("Failed to close client id reading stream", e22);
                        return null;
                    }
                } else {
                    openFileInput.close();
                    String str = new String(bArr, 0, read);
                    a("Read client id from disk", str);
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (IOException e3) {
                            e("Failed to close client id reading stream", e3);
                        }
                    }
                    return str;
                }
            } catch (FileNotFoundException e4) {
                fileInputStream = openFileInput;
                if (fileInputStream != null) {
                    return null;
                }
                try {
                    fileInputStream.close();
                    return null;
                } catch (IOException e222) {
                    e("Failed to close client id reading stream", e222);
                    return null;
                }
            } catch (IOException e5) {
                e = e5;
                try {
                    e("Error reading client id file, deleting it", e);
                    context.deleteFile("gaClientId");
                    if (openFileInput != null) {
                        return null;
                    }
                    try {
                        openFileInput.close();
                        return null;
                    } catch (IOException e2222) {
                        e("Failed to close client id reading stream", e2222);
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (IOException e22222) {
                            e("Failed to close client id reading stream", e22222);
                        }
                    }
                    throw th;
                }
            }
        } catch (FileNotFoundException e6) {
            fileInputStream = null;
            if (fileInputStream != null) {
                return null;
            }
            fileInputStream.close();
            return null;
        } catch (IOException e7) {
            e = e7;
            openFileInput = null;
            e("Error reading client id file, deleting it", e);
            context.deleteFile("gaClientId");
            if (openFileInput != null) {
                return null;
            }
            openFileInput.close();
            return null;
        } catch (Throwable th3) {
            openFileInput = null;
            th = th3;
            if (openFileInput != null) {
                openFileInput.close();
            }
            throw th;
        }
    }

    protected void a() {
    }

    public String b() {
        String str;
        D();
        synchronized (this) {
            if (this.a == null) {
                this.b = r().a(new Callable<String>(this) {
                    final /* synthetic */ ad a;

                    {
                        this.a = r1;
                    }

                    public String a() {
                        return this.a.d();
                    }

                    public /* synthetic */ Object call() {
                        return a();
                    }
                });
            }
            if (this.b != null) {
                try {
                    this.a = (String) this.b.get();
                } catch (InterruptedException e) {
                    d("ClientId loading or generation was interrupted", e);
                    this.a = "0";
                } catch (ExecutionException e2) {
                    e("Failed to load or generate client id", e2);
                    this.a = "0";
                }
                if (this.a == null) {
                    this.a = "0";
                }
                a("Loaded clientId", this.a);
                this.b = null;
            }
            str = this.a;
        }
        return str;
    }

    String c() {
        synchronized (this) {
            this.a = null;
            this.b = r().a(new Callable<String>(this) {
                final /* synthetic */ ad a;

                {
                    this.a = r1;
                }

                public String a() {
                    return this.a.f();
                }

                public /* synthetic */ Object call() {
                    return a();
                }
            });
        }
        return b();
    }

    String d() {
        String a = a(r().c());
        return a == null ? f() : a;
    }

    protected String e() {
        return UUID.randomUUID().toString().toLowerCase();
    }
}
