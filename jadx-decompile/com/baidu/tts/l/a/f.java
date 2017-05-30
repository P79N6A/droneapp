package com.baidu.tts.l.a;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.client.model.ModelFileBags;
import com.baidu.tts.f.g;
import com.baidu.tts.f.o;
import com.baidu.tts.loopj.RequestHandle;
import com.baidu.tts.loopj.RequestParams;
import com.baidu.tts.loopj.SyncHttpClient;
import com.baidu.tts.tools.JsonTool;
import java.util.Set;
import java.util.concurrent.Callable;
import org.apache.http.HttpEntity;
import org.apache.http.entity.StringEntity;
import org.json.JSONException;
import org.json.JSONObject;

public class f implements Callable<ModelFileBags> {
    private RequestHandle a;
    private Set<String> b;

    public f(Set<String> set) {
        this.b = set;
    }

    private StringEntity b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(g.FUNCTION.a(), "getURL");
            jSONObject.put(g.IVERSION.b(), "1");
            jSONObject.put(g.ID.b(), JsonTool.fromSetToJson(this.b));
            String jSONObject2 = jSONObject.toString();
            LoggerProxy.d("GetServerModelFileInfosWork", "geturl params=" + jSONObject2);
            return new StringEntity(jSONObject2);
        } catch (JSONException e) {
            return null;
        }
    }

    public ModelFileBags a() {
        SyncHttpClient syncHttpClient = new SyncHttpClient();
        String a = o.MODEL_SERVER.a();
        HttpEntity b = b();
        Object dVar = new d();
        this.a = syncHttpClient.post(null, a, b, RequestParams.APPLICATION_JSON, dVar);
        return dVar.a();
    }

    public /* synthetic */ Object call() {
        return a();
    }
}
