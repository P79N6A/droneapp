package com.xiaomi.infra.galaxy.fds.android.util;

import com.xiaomi.infra.galaxy.fds.android.auth.GalaxyFDSCredential;
import com.xiaomi.infra.galaxy.fds.android.model.HttpMethod;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;

public class RequestFactory {
    public static HttpUriRequest createRequest(String str, GalaxyFDSCredential galaxyFDSCredential, HttpMethod httpMethod, Map<String, String> map) {
        HttpUriRequest httpUriRequest;
        String addParam = galaxyFDSCredential.addParam(str);
        Object httpGet;
        switch (httpMethod) {
            case GET:
                httpGet = new HttpGet(addParam);
                break;
            case PUT:
                httpGet = new HttpPut(addParam);
                break;
            case POST:
                httpGet = new HttpPost(addParam);
                break;
            case DELETE:
                httpGet = new HttpDelete(addParam);
                break;
            case HEAD:
                httpGet = new HttpHead(addParam);
                break;
            default:
                httpUriRequest = null;
                break;
        }
        if (httpUriRequest != null) {
            if (map != null) {
                map.remove("Content-Length");
                for (Entry entry : map.entrySet()) {
                    httpUriRequest.addHeader((String) entry.getKey(), (String) entry.getValue());
                }
            }
            httpUriRequest.addHeader("Date", Util.formatDateString(new Date()));
            galaxyFDSCredential.addHeader(httpUriRequest);
        }
        return httpUriRequest;
    }
}
