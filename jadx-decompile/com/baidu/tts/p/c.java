package com.baidu.tts.p;

import android.content.Context;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.f.o;
import com.baidu.tts.loopj.RequestHandle;
import com.baidu.tts.loopj.SyncHttpClient;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class c {
    ExecutorService a = Executors.newSingleThreadExecutor();
    private Context b;
    private com.baidu.tts.l.a c;
    private FutureTask<Integer> d;
    private int e = 0;
    private int f = 0;

    public class a implements Callable<Integer> {
        final /* synthetic */ c a;
        private RequestHandle b;

        public a(c cVar) {
            this.a = cVar;
        }

        private UrlEncodedFormEntity b() {
            List arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject();
            ArrayList arrayList2 = (ArrayList) this.a.c.f().get("listId");
            if (arrayList2.size() != 0) {
                this.a.e = ((Integer) arrayList2.get(0)).intValue();
                this.a.f = ((Integer) arrayList2.get(arrayList2.size() - 1)).intValue();
            }
            JSONArray jSONArray = new JSONArray((ArrayList) this.a.c.f().get("list"));
            try {
                jSONObject.put("deviceInfo", a.a(this.a.b));
                jSONObject.put("appinfo", a.b(this.a.b));
                jSONObject.put("methodinfo", jSONArray);
                LoggerProxy.d("UploadStatistics", "StatisticsData= " + jSONObject.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            arrayList.add(new BasicNameValuePair("d", jSONObject.toString()));
            try {
                return new UrlEncodedFormEntity(arrayList, "UTF-8");
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
                return null;
            }
        }

        public Integer a() {
            SyncHttpClient syncHttpClient = new SyncHttpClient();
            String a = o.STATISTICS_SERVER.a();
            HttpEntity b = b();
            Object dVar = new d();
            this.b = syncHttpClient.post(null, a, b, null, dVar);
            final int a2 = dVar.a();
            this.a.a.submit(new Runnable(this) {
                final /* synthetic */ a b;

                public void run() {
                    if (a2 == 0) {
                        LoggerProxy.d("UploadStatistics", "delete database code==" + this.b.a.c.a(this.b.a.e, this.b.a.f));
                    }
                }
            });
            return Integer.valueOf(a2);
        }

        public /* synthetic */ Object call() {
            return a();
        }
    }

    public c(Context context) {
        this.b = context;
        this.c = new com.baidu.tts.l.a(context);
    }

    public FutureTask<Integer> a() {
        this.d = new FutureTask(new a(this));
        this.a.submit(this.d);
        return this.d;
    }

    public void b() {
        this.d.cancel(true);
    }
}
