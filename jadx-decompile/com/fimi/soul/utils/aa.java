package com.fimi.soul.utils;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;

public class aa {
    private String a;
    private HttpPost b;
    private HttpResponse c;
    private HttpParams d = new BasicHttpParams();
    private HttpClient e;

    public aa(String str, Context context) {
        this.a = str;
        HttpConnectionParams.setConnectionTimeout(this.d, 15000);
        HttpConnectionParams.setSoTimeout(this.d, 15000);
        this.e = new DefaultHttpClient(this.d);
    }

    public InputStream a(List<NameValuePair> list) {
        InputStream inputStream = null;
        try {
            this.b = new HttpPost(this.a);
            if (list != null) {
                this.b.setEntity(new UrlEncodedFormEntity(list, "UTF-8"));
            }
            this.c = this.e.execute(this.b);
            if (200 == this.c.getStatusLine().getStatusCode()) {
                inputStream = this.c.getEntity().getContent();
            }
        } catch (IOException e) {
        }
        return inputStream;
    }

    public String b(List<NameValuePair> list) {
        try {
            this.b = new HttpPost(this.a);
            if (list != null) {
                this.b.setEntity(new UrlEncodedFormEntity(list, "UTF-8"));
            }
            this.c = this.e.execute(this.b);
            if (200 != this.c.getStatusLine().getStatusCode()) {
                return null;
            }
            String entityUtils = EntityUtils.toString(this.c.getEntity());
            System.out.println("ȡ�÷���ֵ" + entityUtils);
            return entityUtils;
        } catch (IOException e) {
            e.printStackTrace();
            return "Error";
        }
    }

    public int c(List<NameValuePair> list) {
        int i = -1;
        try {
            this.b = new HttpPost(this.a);
            if (list != null) {
                this.b.setEntity(new UrlEncodedFormEntity(list, "UTF-8"));
            }
            this.c = this.e.execute(this.b);
            if (200 == this.c.getStatusLine().getStatusCode()) {
                i = Integer.parseInt(EntityUtils.toString(this.c.getEntity()));
            }
        } catch (IOException e) {
        }
        return i;
    }

    public int d(List<NameValuePair> list) {
        try {
            this.b = new HttpPost(this.a);
            if (list != null) {
                this.b.setEntity(new UrlEncodedFormEntity(list, "UTF-8"));
            }
            this.c = this.e.execute(this.b);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
