package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Build.VERSION;
import com.fimi.kernel.b.e;
import com.fimi.kernel.b.e.b;
import com.fimi.kernel.c;
import com.fimi.kernel.utils.z;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.a;
import com.fimi.soul.utils.NetUtil;
import com.fimi.soul.utils.ao;
import com.xiaomi.market.sdk.j;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

public class d {
    private static d a = null;
    private Context b;
    private b c = null;

    public d(Context context) {
        this.b = context;
        this.c = (b) c.a(com.fimi.kernel.b.d.Volley);
    }

    public static d a(Context context) {
        if (a == null) {
            a = new d(context);
        }
        return a;
    }

    public void a(String str) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "commitCrashMsg"));
        arrayList.add(new BasicNameValuePair("versionCode", ao.e(this.b)));
        arrayList.add(new BasicNameValuePair(j.ax, ao.d(this.b)));
        arrayList.add(new BasicNameValuePair(j.W, this.b.getPackageName()));
        arrayList.add(new BasicNameValuePair("crashTime", ao.b(System.currentTimeMillis())));
        arrayList.add(new BasicNameValuePair("deviceName", ao.a()));
        arrayList.add(new BasicNameValuePair("systemVersion", ao.b()));
        arrayList.add(new BasicNameValuePair("sdkVersion", VERSION.SDK_INT + ""));
        arrayList.add(new BasicNameValuePair("channel", "Android"));
        arrayList.add(new BasicNameValuePair("crashMsg", str));
        NetUtil.a(arrayList, this.b);
        String format = URLEncodedUtils.format(arrayList, "UTF-8");
        this.c.a(String.format("%s?%s", new Object[]{a.j, format}), new e<String>(this) {
            final /* synthetic */ d a;

            {
                this.a = r1;
            }

            public void a(String str) {
                if (str != null && str.length() > 0) {
                    z.a(this.a.b, (int) R.string.commit_crash_msg);
                }
            }

            public void b(String str) {
            }
        });
    }
}
