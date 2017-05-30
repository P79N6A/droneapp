package org.a.a.i.b;

import org.a.a.a.b;
import org.a.a.o.d;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.ResponseHandler;

@b
public class f implements ResponseHandler<String> {
    public String a(HttpResponse httpResponse) {
        StatusLine statusLine = httpResponse.getStatusLine();
        HttpEntity entity = httpResponse.getEntity();
        if (statusLine.getStatusCode() < 300) {
            return entity == null ? null : d.f(entity);
        } else {
            d.b(entity);
            throw new HttpResponseException(statusLine.getStatusCode(), statusLine.getReasonPhrase());
        }
    }

    public /* synthetic */ Object handleResponse(HttpResponse httpResponse) {
        return a(httpResponse);
    }
}
