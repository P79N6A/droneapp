package m.framework.a;

import com.baidu.tts.loopj.RequestParams;
import com.facebook.common.util.UriUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import org.a.a.c.f.j;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;

public class g {
    public static int a;
    public static int b;

    private String a(ArrayList<d<String>> arrayList) {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            String encode = URLEncoder.encode(dVar.a, "utf-8");
            String encode2 = dVar.b != null ? URLEncoder.encode((String) dVar.b, "utf-8") : "";
            if (stringBuilder.length() > 0) {
                stringBuilder.append('&');
            }
            stringBuilder.append(encode).append(SignatureVisitor.INSTANCEOF).append(encode2);
        }
        return stringBuilder.toString();
    }

    private HttpClient a() {
        KeyStore instance = KeyStore.getInstance(KeyStore.getDefaultType());
        instance.load(null, null);
        SocketFactory iVar = new i(instance);
        iVar.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
        HttpParams basicHttpParams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(basicHttpParams, "UTF-8");
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme(UriUtil.HTTP_SCHEME, PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme(UriUtil.HTTPS_SCHEME, iVar, 443));
        return new DefaultHttpClient(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams);
    }

    private HttpPost a(String str, ArrayList<d<String>> arrayList) {
        HttpPost httpPost = new HttpPost(str);
        if (arrayList != null) {
            j jVar = new j();
            jVar.a(a(arrayList));
            HttpEntity c = jVar.c();
            c.setContentType(j.a);
            httpPost.setEntity(c);
        }
        return httpPost;
    }

    private HttpPost a(String str, ArrayList<d<String>> arrayList, d<String> dVar) {
        HttpPost httpPost = new HttpPost(str);
        String uuid = UUID.randomUUID().toString();
        e eVar = new e();
        c jVar = new j();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                d dVar2 = (d) it.next();
                jVar.a("--").a(uuid).a("\r\n");
                jVar.a("content-disposition: form-data; name=\"").a(dVar2.a).a("\"\r\n\r\n");
                jVar.a((String) dVar2.b).a("\r\n");
            }
        }
        httpPost.setHeader("Content-Type", "multipart/form-data; boundary=" + uuid);
        jVar.a("--").a(uuid).a("\r\n");
        jVar.a("Content-Disposition: form-data; name=\"").a(dVar.a).a("\"; filename=\"").a(new File((String) dVar.b).getName()).a("\"\r\n");
        String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor((String) dVar.b);
        if (contentTypeFor == null || contentTypeFor.length() <= 0) {
            if (((String) dVar.b).toLowerCase().endsWith("jpg") || ((String) dVar.b).toLowerCase().endsWith("jepg")) {
                contentTypeFor = "image/jpeg";
            } else if (((String) dVar.b).toLowerCase().endsWith("png")) {
                contentTypeFor = "image/png";
            } else if (((String) dVar.b).toLowerCase().endsWith("gif")) {
                contentTypeFor = "image/gif";
            } else {
                InputStream fileInputStream = new FileInputStream((String) dVar.b);
                contentTypeFor = URLConnection.guessContentTypeFromStream(fileInputStream);
                fileInputStream.close();
                if (contentTypeFor == null || contentTypeFor.length() <= 0) {
                    contentTypeFor = RequestParams.APPLICATION_OCTET_STREAM;
                }
            }
        }
        jVar.a("Content-Type: ").a(contentTypeFor).a("\r\n\r\n");
        eVar.a(jVar);
        jVar = new b();
        jVar.a((String) dVar.b);
        eVar.a(jVar);
        c jVar2 = new j();
        jVar2.a("\r\n--").a(uuid).a("--\r\n");
        eVar.a(jVar2);
        httpPost.setEntity(eVar.c());
        return httpPost;
    }

    public String a(String str, ArrayList<d<String>> arrayList, ArrayList<d<String>> arrayList2) {
        if (arrayList != null) {
            String a = a(arrayList);
            if (a.length() > 0) {
                str = new StringBuilder(String.valueOf(str)).append("?").append(a).toString();
            }
        }
        HttpUriRequest httpGet = new HttpGet(str);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                httpGet.setHeader(dVar.a, (String) dVar.b);
            }
        }
        HttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, a);
        HttpConnectionParams.setSoTimeout(basicHttpParams, b);
        httpGet.setParams(basicHttpParams);
        HttpClient a2 = str.startsWith("https://") ? a() : new DefaultHttpClient();
        HttpResponse execute = a2.execute(httpGet);
        if (execute.getStatusLine().getStatusCode() == 200) {
            String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
            a2.getConnectionManager().shutdown();
            return entityUtils;
        }
        entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
        a2.getConnectionManager().shutdown();
        throw new Throwable(entityUtils);
    }

    public String a(String str, ArrayList<d<String>> arrayList, d<String> dVar, ArrayList<d<String>> arrayList2) {
        HttpUriRequest a;
        if (dVar == null || dVar.b == null || !new File((String) dVar.b).exists()) {
            Object a2 = a(str, (ArrayList) arrayList);
        } else {
            a = a(str, (ArrayList) arrayList, (d) dVar);
        }
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                d dVar2 = (d) it.next();
                a.setHeader(dVar2.a, (String) dVar2.b);
            }
        }
        HttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, a);
        HttpConnectionParams.setSoTimeout(basicHttpParams, b);
        a.setParams(basicHttpParams);
        HttpClient a3 = str.startsWith("https://") ? a() : new DefaultHttpClient();
        HttpResponse execute = a3.execute(a);
        int statusCode = execute.getStatusLine().getStatusCode();
        if (statusCode == 200 || statusCode == 201) {
            String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
            a3.getConnectionManager().shutdown();
            return entityUtils;
        }
        entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
        a3.getConnectionManager().shutdown();
        throw new Throwable(entityUtils);
    }

    public void a(String str, File file) {
        HttpUriRequest httpGet = new HttpGet(str);
        HttpClient a = str.startsWith("https://") ? a() : new DefaultHttpClient();
        HttpResponse execute = a.execute(httpGet);
        if (execute.getStatusLine().getStatusCode() == 200) {
            InputStream content = execute.getEntity().getContent();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            for (int read = content.read(bArr); read > 0; read = content.read(bArr)) {
                fileOutputStream.write(bArr, 0, read);
            }
            fileOutputStream.flush();
            content.close();
            fileOutputStream.close();
            a.getConnectionManager().shutdown();
            return;
        }
        String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
        a.getConnectionManager().shutdown();
        throw new Throwable(entityUtils);
    }

    public void a(String str, ArrayList<d<String>> arrayList, ArrayList<d<String>> arrayList2, h hVar) {
        if (arrayList != null) {
            String a = a(arrayList);
            if (a.length() > 0) {
                str = new StringBuilder(String.valueOf(str)).append("?").append(a).toString();
            }
        }
        HttpUriRequest httpGet = new HttpGet(str);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                httpGet.setHeader(dVar.a, (String) dVar.b);
            }
        }
        HttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, a);
        HttpConnectionParams.setSoTimeout(basicHttpParams, b);
        httpGet.setParams(basicHttpParams);
        HttpClient a2 = str.startsWith("https://") ? a() : new DefaultHttpClient();
        HttpResponse execute = a2.execute(httpGet);
        if (execute.getStatusLine().getStatusCode() == 200) {
            InputStream content = execute.getEntity().getContent();
            if (hVar != null) {
                hVar.a(content);
            }
            content.close();
            a2.getConnectionManager().shutdown();
            return;
        }
        String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
        a2.getConnectionManager().shutdown();
        throw new Throwable(entityUtils);
    }

    public void a(String str, ArrayList<d<String>> arrayList, c cVar, h hVar) {
        HttpUriRequest httpPost = new HttpPost(str);
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                httpPost.setHeader(dVar.a, (String) dVar.b);
            }
        }
        httpPost.setEntity(cVar.c());
        HttpClient a = str.startsWith("https://") ? a() : new DefaultHttpClient();
        HttpResponse execute = a.execute(httpPost);
        if (execute.getStatusLine().getStatusCode() == 200) {
            InputStream content = execute.getEntity().getContent();
            if (hVar != null) {
                hVar.a(content);
            }
            content.close();
            a.getConnectionManager().shutdown();
        }
        String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
        a.getConnectionManager().shutdown();
        throw new Throwable(entityUtils);
    }

    public void a(String str, ArrayList<d<String>> arrayList, d<String> dVar, ArrayList<d<String>> arrayList2, h hVar) {
        HttpUriRequest a;
        if (dVar == null || dVar.b == null || !new File((String) dVar.b).exists()) {
            Object a2 = a(str, (ArrayList) arrayList);
        } else {
            a = a(str, (ArrayList) arrayList, (d) dVar);
        }
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                d dVar2 = (d) it.next();
                a.setHeader(dVar2.a, (String) dVar2.b);
            }
        }
        HttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, a);
        HttpConnectionParams.setSoTimeout(basicHttpParams, b);
        a.setParams(basicHttpParams);
        HttpClient a3 = str.startsWith("https://") ? a() : new DefaultHttpClient();
        HttpResponse execute = a3.execute(a);
        int statusCode = execute.getStatusLine().getStatusCode();
        if (statusCode == 200 || statusCode == 201) {
            InputStream content = execute.getEntity().getContent();
            if (hVar != null) {
                hVar.a(content);
            }
            content.close();
            a3.getConnectionManager().shutdown();
            return;
        }
        String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
        a3.getConnectionManager().shutdown();
        throw new Throwable(entityUtils);
    }

    public void a(String str, h hVar) {
        HttpUriRequest httpGet = new HttpGet(str);
        HttpClient a = str.startsWith("https://") ? a() : new DefaultHttpClient();
        HttpResponse execute = a.execute(httpGet);
        if (execute.getStatusLine().getStatusCode() == 200) {
            InputStream content = execute.getEntity().getContent();
            if (hVar != null) {
                hVar.a(content);
            }
            content.close();
            a.getConnectionManager().shutdown();
            return;
        }
        String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
        a.getConnectionManager().shutdown();
        throw new Throwable(entityUtils);
    }

    public String b(String str, ArrayList<d<String>> arrayList, d<String> dVar, ArrayList<d<String>> arrayList2) {
        if (arrayList != null) {
            String a = a(arrayList);
            if (a.length() > 0) {
                str = new StringBuilder(String.valueOf(str)).append("?").append(a).toString();
            }
        }
        HttpUriRequest httpPut = new HttpPut(str);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                d dVar2 = (d) it.next();
                httpPut.setHeader(dVar2.a, (String) dVar2.b);
            }
        }
        b bVar = new b();
        bVar.a((String) dVar.b);
        HttpEntity c = bVar.c();
        c.setContentEncoding(RequestParams.APPLICATION_OCTET_STREAM);
        httpPut.setEntity(c);
        HttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, a);
        HttpConnectionParams.setSoTimeout(basicHttpParams, b);
        httpPut.setParams(basicHttpParams);
        HttpClient a2 = str.startsWith("https://") ? a() : new DefaultHttpClient();
        HttpResponse execute = a2.execute(httpPut);
        int statusCode = execute.getStatusLine().getStatusCode();
        if (statusCode == 200 || statusCode == 201) {
            String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
            a2.getConnectionManager().shutdown();
            return entityUtils;
        }
        entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
        a2.getConnectionManager().shutdown();
        throw new Throwable(entityUtils);
    }
}
