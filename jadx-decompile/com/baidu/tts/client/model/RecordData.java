package com.baidu.tts.client.model;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.l.a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

public class RecordData {
    ExecutorService a = Executors.newSingleThreadExecutor();
    private a b;

    public class InsertData implements Callable<Integer> {
        final /* synthetic */ RecordData a;
        private JSONObject b;
        private String c;
        private String d;

        public InsertData(RecordData recordData, JSONObject jSONObject, String str, String str2) {
            this.a = recordData;
            this.b = jSONObject;
            this.c = str;
            this.d = str2;
        }

        public Integer call() {
            if (this.b == null && this.d == null) {
                this.a.b.c(this.c);
            } else {
                this.a.b.a(this.c, this.d, this.b.toString());
            }
            return Integer.valueOf(0);
        }
    }

    public RecordData(a aVar) {
        this.b = aVar;
    }

    public void setEndInfo(String str, String str2, int i, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("modeId", str2);
            jSONObject.put("result", i);
            jSONObject.put("endTime", str3);
            LoggerProxy.d("RecordData", "EndInfo json= " + jSONObject.toString());
            this.a.submit(new InsertData(this, jSONObject, str, "endInfo"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setStartInfo(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("startTime", str3);
            jSONObject.put("modeId", str2);
            LoggerProxy.d("RecordData", " StartInfo json= " + jSONObject.toString());
            this.a.submit(new InsertData(this, null, str, null));
            this.a.submit(new InsertData(this, jSONObject, str, "startInfo"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
