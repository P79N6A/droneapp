package com.fimi.soul.biz.update;

import android.content.Context;
import android.util.Log;
import com.fimi.kernel.b.e;
import com.fimi.kernel.b.e.b;
import com.fimi.kernel.c;
import com.fimi.kernel.utils.n;
import com.fimi.kernel.utils.z;
import com.fimi.soul.base.a;
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

public class d extends c {
    public static final String f = "firmware.zip";
    private static final String g = "x1";
    private b h;

    public d() {
        this.h = null;
        this.h = (b) c.a(com.fimi.kernel.b.d.Volley);
    }

    public static String a(String str) {
        if (str != null) {
            int indexOf = str.indexOf(86);
            int indexOf2 = str.indexOf(66);
            int indexOf3 = str.indexOf("SP");
            if (indexOf3 > 0 && indexOf < indexOf3) {
                return str.substring(indexOf + 1, indexOf3);
            }
            if (indexOf < indexOf2) {
                return str.substring(indexOf + 1, indexOf2);
            }
        }
        return null;
    }

    public static String b() {
        return String.format("%s%s", new Object[]{j.p(), "firmware.zip"});
    }

    public static String c() {
        return String.format("%s%s", new Object[]{j.p(), com.fimi.soul.module.update.b.Q});
    }

    public static String d() {
        return "fimware.zip";
    }

    public static String e() {
        return n.b(d(), ".zip") + ".bin";
    }

    public void a(Context context) {
        String format = String.format("%s/%s/%s", new Object[]{j.a(), "firmware", "firmware.zip"});
        File file = new File(String.format("%s/%s", new Object[]{j.a(), "firmware"}));
        if (!file.exists()) {
            file.mkdir();
        }
        file = new File(format);
        if (file.exists()) {
            file.delete();
        }
        try {
            a(context.getAssets().open("firmware.zip"), String.format("%s/%s/%s", new Object[]{j.a(), "firmware", "firmware.zip"}));
        } catch (Exception e) {
            z.a(context, "写文件出错：" + e.getMessage());
        }
    }

    public void a(i iVar) {
        if (i() == null) {
            iVar.a(true, 0, 0, 0);
        } else {
            a(i(), b(), iVar);
        }
    }

    public void a(final k<UpdateVersonBean> kVar) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getDeviceVersion"));
        arrayList.add(new BasicNameValuePair("sysID", "04"));
        arrayList.add(new BasicNameValuePair("modelName", g));
        NetUtil.a(arrayList, c.a());
        String format = URLEncodedUtils.format(arrayList, "UTF-8");
        format = String.format("%s?%s", new Object[]{a.j, format});
        Log.d("Good", "请求url:" + format);
        this.h.a(format, new e<String>(this) {
            final /* synthetic */ d b;

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
                Log.d("Good", str);
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
}
