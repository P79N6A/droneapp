package com.baidu.tts.l.a;

import com.baidu.tts.client.model.ModelBags;
import com.baidu.tts.f.g;
import com.baidu.tts.f.o;
import com.baidu.tts.jni.EmbeddedSynthesizerEngine;
import com.baidu.tts.loopj.RequestHandle;
import com.baidu.tts.loopj.SyncHttpClient;
import java.util.concurrent.Callable;
import org.apache.http.entity.StringEntity;
import org.json.JSONException;
import org.json.JSONObject;

public class e
  implements Callable<ModelBags>
{
  private RequestHandle a;
  
  private StringEntity b()
  {
    Object localObject = EmbeddedSynthesizerEngine.bdTTSGetEngineParam();
    try
    {
      localObject = new JSONObject((String)localObject);
      ((JSONObject)localObject).put(g.t.a(), "getDefaultList");
      localObject = new StringEntity(((JSONObject)localObject).toString());
      return (StringEntity)localObject;
    }
    catch (JSONException localJSONException) {}
    return null;
  }
  
  public ModelBags a()
  {
    SyncHttpClient localSyncHttpClient = new SyncHttpClient();
    String str = o.b.a();
    StringEntity localStringEntity = b();
    a locala = new a();
    this.a = localSyncHttpClient.post(null, str, localStringEntity, "application/json", locala);
    return locala.a();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/baidu/tts/l/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */