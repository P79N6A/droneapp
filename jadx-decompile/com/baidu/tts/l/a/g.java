package com.baidu.tts.l.a;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.client.model.Conditions;
import com.baidu.tts.client.model.ModelBags;
import com.baidu.tts.f.o;
import com.baidu.tts.loopj.RequestHandle;
import com.baidu.tts.loopj.RequestParams;
import com.baidu.tts.loopj.SyncHttpClient;
import java.util.concurrent.Callable;
import org.apache.http.HttpEntity;
import org.apache.http.entity.StringEntity;
import org.json.JSONException;
import org.json.JSONObject;

public class g implements Callable<ModelBags> {
    private Conditions a;
    private RequestHandle b;

    public g(Conditions conditions) {
        this.a = conditions;
    }

    private StringEntity b() {
        JSONObject jSONConditions = this.a.getJSONConditions();
        try {
            jSONConditions.put(com.baidu.tts.f.g.IVERSION.b(), "1");
            jSONConditions.put(com.baidu.tts.f.g.FUNCTION.a(), "getList");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String jSONObject = jSONConditions.toString();
        LoggerProxy.d("GetServerModelsWork", "getlist params=" + jSONObject);
        return new StringEntity(jSONObject);
    }

    public ModelBags a() {
        SyncHttpClient syncHttpClient = new SyncHttpClient();
        String a = o.MODEL_SERVER.a();
        HttpEntity b = b();
        Object aVar = new a();
        this.b = syncHttpClient.post(null, a, b, RequestParams.APPLICATION_JSON, aVar);
        return aVar.a();
    }

    public /* synthetic */ Object call() {
        return a();
    }
}
