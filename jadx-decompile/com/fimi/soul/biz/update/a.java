package com.fimi.soul.biz.update;

import android.content.Context;
import android.os.Message;
import android.util.Log;
import com.fimi.kernel.b.a.b;
import com.fimi.kernel.b.d;
import com.fimi.kernel.b.e;
import com.fimi.kernel.c;
import com.fimi.soul.entity.APConfig;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.entity.ServerResult;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.utils.NetUtil;
import com.fimi.soul.utils.j;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

public class a extends c {
    private static final String f = "KEY_APUPDATEBIZ_LASTEST_VERSION";
    private static final int g = 1;
    private static final String h = "ar934x_US";
    private static String k = "192.168.42.100";
    private static final String l = "192.168.42.150";
    private static final int q = 3;
    private b i;
    private com.fimi.kernel.b.e.b j;
    private String m;
    private long n;
    private long o;
    private int p;
    private boolean r;
    private com.fimi.soul.biz.e.b s;
    private i t;

    public a() {
        this.i = null;
        this.j = null;
        this.r = false;
        this.s = null;
        this.j = (com.fimi.kernel.b.e.b) c.a(d.Volley);
        this.s = new com.fimi.soul.biz.e.b();
        if (com.fimi.soul.biz.a.a.a().b() != 1) {
            k = "192.168.100.1";
        }
    }

    public static String c() {
        return j.p();
    }

    public static String d() {
        return String.format("%s%s", new Object[]{j.p(), com.fimi.soul.module.update.b.F});
    }

    protected void a(Message message) {
        super.a(message);
        if (message.what == 1) {
            if (message.arg1 == 1) {
                this.t.a(false, (long) message.arg2, 100, 0);
            } else {
                this.t.a(true, 0, 0, 0);
            }
        }
    }

    public void a(i iVar) {
        if (i() == null) {
            iVar.a(true, 0, 0, 0);
            return;
        }
        i().getUrl();
        this.m = d();
        a(i(), this.m, iVar);
    }

    public void a(final i iVar, Context context, FirmwareInfo firmwareInfo) {
        if (firmwareInfo.getSysId() == 15) {
            this.m = String.format("%s/%s/%s", new Object[]{j.a(), "firmware", l.a(firmwareInfo.getFileEncode(), firmwareInfo.getVersion())});
        } else if (firmwareInfo.getSysId() == 14) {
            this.m = String.format("%s/%s/%s", new Object[]{j.a(), "firmware", l.b(firmwareInfo.getFileEncode(), firmwareInfo.getVersion())});
        } else {
            this.m = String.format("%s/%s/%s", new Object[]{j.a(), "firmware", l.a(firmwareInfo.getFileEncode())});
        }
        File file = new File(String.format("%s/%s", new Object[]{j.a(), "firmware"}));
        if (!file.exists()) {
            file.mkdir();
        }
        file = new File(this.m);
        if (new File(this.m).isFile()) {
            if (this.i != null) {
                this.i.h();
                this.i = null;
            }
            this.i = (b) c.a(d.Ftp);
            com.fimi.kernel.b.a.c c = this.i.c();
            if (firmwareInfo.getSysId() == 14) {
                c.a(true);
                c.a(l);
            } else {
                c.a(k);
            }
            c.a(21);
            this.i.a(new com.fimi.kernel.b.c.b(this) {
                final /* synthetic */ a b;

                public void a(boolean z, String str) {
                    if (z) {
                        File file = new File(this.b.m);
                        this.b.n = file.length();
                        this.b.o = 0;
                        this.b.i.b(file, new com.fimi.kernel.b.a.a(this) {
                            final /* synthetic */ AnonymousClass4 a;

                            {
                                this.a = r1;
                            }

                            public void a(com.fimi.kernel.b.a.a.a aVar, int i) {
                                this.a.b.o = this.a.b.o + ((long) i);
                                boolean z = aVar == com.fimi.kernel.b.a.a.a.Completed || aVar == com.fimi.kernel.b.a.a.a.Aborted;
                                iVar.a(z, this.a.b.o, this.a.b.n, 0);
                            }
                        });
                        return;
                    }
                    iVar.a(true, 0, 0, 0);
                }
            });
            return;
        }
        iVar.a(true, 0, 0, 0);
    }

    public void a(final k<UpdateVersonBean> kVar) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getDeviceVersion"));
        arrayList.add(new BasicNameValuePair("sysID", "5"));
        arrayList.add(new BasicNameValuePair("modelName", h));
        NetUtil.a(arrayList, c.a());
        String format = URLEncodedUtils.format(arrayList, "UTF-8");
        format = String.format("%s?%s", new Object[]{com.fimi.soul.base.a.j, format});
        Log.d("Good", "请求url:" + format);
        this.j.a(format, new e<String>(this) {
            final /* synthetic */ a b;

            public void a(String str) {
                Log.d("Good", str);
                if (str != null && str.length() > 0) {
                    try {
                        ServerResult serverResult = (ServerResult) this.b.g().fromJson(str, new TypeToken<ServerResult<UpdateVersonBean>>(this) {
                            final /* synthetic */ AnonymousClass1 a;

                            {
                                this.a = r1;
                            }
                        }.getType());
                        if (serverResult != null) {
                            this.b.b((UpdateVersonBean) serverResult.getData());
                            this.b.c(this.b.i());
                            kVar.a(serverResult.getData());
                            return;
                        }
                    } catch (Exception e) {
                    }
                    kVar.a(this.b.j());
                }
            }

            public void b(String str) {
                kVar.a(this.b.j());
            }
        });
    }

    public void a(InputStream inputStream, String str) {
        try {
            OutputStream fileOutputStream = new FileOutputStream(str, true);
            byte[] bArr = new byte[512000];
            while (true) {
                int read = inputStream.read(bArr, 0, 512000);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.close();
                    inputStream.close();
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void b(i iVar) {
        if (this.i != null) {
            this.i.h();
        }
        this.t = iVar;
        a(new Runnable(this) {
            final /* synthetic */ a a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.p = 0;
                this.a.r = true;
                String format = String.format("http://%s:8080/upgrade", new Object[]{a.k});
                while (this.a.r) {
                    try {
                        this.a.j.a(format, new e<String>(this) {
                            final /* synthetic */ AnonymousClass3 a;

                            {
                                this.a = r1;
                            }

                            public void a(String str) {
                                Log.d("Good", str);
                                try {
                                    int parseInt = Integer.parseInt(str.trim().replace("\n", ""));
                                    Message message = new Message();
                                    message.what = 1;
                                    if (parseInt < 100) {
                                        message.arg1 = 1;
                                        message.arg2 = parseInt;
                                    } else {
                                        message.arg1 = 0;
                                        message.arg2 = 0;
                                        this.a.a.r = false;
                                    }
                                    this.a.a.a().sendMessage(message);
                                } catch (Exception e) {
                                    Log.d("Good", "Error");
                                    this.a.a.p = this.a.a.p + 1;
                                }
                            }

                            public void b(String str) {
                                this.a.a.p = this.a.a.p + 1;
                            }
                        });
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    public void b(final k<UpdateVersonBean> kVar) {
        this.s.b(new e<APConfig>(this) {
            final /* synthetic */ a b;

            public void a(APConfig aPConfig) {
                UpdateVersonBean updateVersonBean = new UpdateVersonBean();
                if (!(aPConfig == null || aPConfig.getVersion() == null)) {
                    String[] split = aPConfig.getVersion().split("_");
                    updateVersonBean.setNewVersion(split[split.length - 1]);
                    this.b.a(updateVersonBean);
                }
                kVar.a(updateVersonBean);
            }

            public void b(APConfig aPConfig) {
                kVar.a(new UpdateVersonBean());
            }
        });
    }

    public boolean b() {
        if (!(i() == null || h() == null)) {
            try {
                if (Integer.parseInt(i().getNewVersion()) > Integer.parseInt(h().getNewVersion())) {
                    return true;
                }
            } catch (Exception e) {
            }
        }
        return false;
    }

    public void e() {
        try {
            if (this.i != null) {
                this.i.h();
            }
        } catch (Exception e) {
            l.b("e:" + e.getMessage().toString());
        }
    }
}
