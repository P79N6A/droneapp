package com.fimi.soul.utils;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;

public class aa
{
  private String a;
  private HttpPost b;
  private HttpResponse c;
  private HttpParams d;
  private HttpClient e;
  
  public aa(String paramString, Context paramContext)
  {
    this.a = paramString;
    this.d = new BasicHttpParams();
    HttpConnectionParams.setConnectionTimeout(this.d, 15000);
    HttpConnectionParams.setSoTimeout(this.d, 15000);
    this.e = new DefaultHttpClient(this.d);
  }
  
  public InputStream a(List<NameValuePair> paramList)
  {
    Object localObject = null;
    try
    {
      this.b = new HttpPost(this.a);
      if (paramList != null) {
        this.b.setEntity(new UrlEncodedFormEntity(paramList, "UTF-8"));
      }
      this.c = this.e.execute(this.b);
      paramList = (List<NameValuePair>)localObject;
      if (200 == this.c.getStatusLine().getStatusCode()) {
        paramList = this.c.getEntity().getContent();
      }
      return paramList;
    }
    catch (IOException paramList) {}
    return null;
  }
  
  public String b(List<NameValuePair> paramList)
  {
    Object localObject = null;
    try
    {
      this.b = new HttpPost(this.a);
      if (paramList != null) {
        this.b.setEntity(new UrlEncodedFormEntity(paramList, "UTF-8"));
      }
      this.c = this.e.execute(this.b);
      paramList = (List<NameValuePair>)localObject;
      if (200 == this.c.getStatusLine().getStatusCode())
      {
        paramList = EntityUtils.toString(this.c.getEntity());
        System.out.println("ȡ�÷���ֵ" + paramList);
      }
      return paramList;
    }
    catch (IOException paramList)
    {
      paramList.printStackTrace();
    }
    return "Error";
  }
  
  public int c(List<NameValuePair> paramList)
  {
    int i = -1;
    try
    {
      this.b = new HttpPost(this.a);
      if (paramList != null) {
        this.b.setEntity(new UrlEncodedFormEntity(paramList, "UTF-8"));
      }
      this.c = this.e.execute(this.b);
      if (200 == this.c.getStatusLine().getStatusCode()) {
        i = Integer.parseInt(EntityUtils.toString(this.c.getEntity()));
      }
      return i;
    }
    catch (IOException paramList) {}
    return -1;
  }
  
  public int d(List<NameValuePair> paramList)
  {
    try
    {
      this.b = new HttpPost(this.a);
      if (paramList != null) {
        this.b.setEntity(new UrlEncodedFormEntity(paramList, "UTF-8"));
      }
      this.c = this.e.execute(this.b);
      return 1;
    }
    catch (Exception paramList)
    {
      paramList.printStackTrace();
    }
    return 0;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */