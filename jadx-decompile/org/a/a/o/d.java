package org.a.a.o;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import org.a.a.h.e;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

public final class d {
    private d() {
    }

    public static String a(HttpEntity httpEntity, String str) {
        return a(httpEntity, str != null ? Charset.forName(str) : null);
    }

    public static String a(HttpEntity httpEntity, Charset charset) {
        String charArrayBuffer;
        Charset charset2 = null;
        boolean z = false;
        a.a(httpEntity, "Entity");
        InputStream content = httpEntity.getContent();
        if (content != null) {
            try {
                if (httpEntity.getContentLength() <= 2147483647L) {
                    z = true;
                }
                a.a(z, "HTTP entity too large to be buffered in memory");
                int contentLength = (int) httpEntity.getContentLength();
                if (contentLength < 0) {
                    contentLength = 4096;
                }
                e a = e.a(httpEntity);
                if (a != null) {
                    charset2 = a.b();
                }
                if (charset2 == null) {
                    charset2 = charset;
                }
                if (charset2 == null) {
                    charset2 = Charset.forName("ISO-8859-1");
                }
                Reader inputStreamReader = new InputStreamReader(content, charset2);
                CharArrayBuffer charArrayBuffer2 = new CharArrayBuffer(contentLength);
                char[] cArr = new char[1024];
                while (true) {
                    int read = inputStreamReader.read(cArr);
                    if (read == -1) {
                        break;
                    }
                    charArrayBuffer2.append(cArr, 0, read);
                }
                charArrayBuffer = charArrayBuffer2.toString();
                content.close();
            } catch (UnsupportedCharsetException e) {
                throw new UnsupportedEncodingException(e.getMessage());
            } catch (Throwable th) {
                content.close();
            }
        }
        return charArrayBuffer;
    }

    public static void a(HttpEntity httpEntity) {
        try {
            b(httpEntity);
        } catch (IOException e) {
        }
    }

    public static void a(HttpResponse httpResponse, HttpEntity httpEntity) {
        a.a(httpResponse, "Response");
        b(httpResponse.getEntity());
        httpResponse.setEntity(httpEntity);
    }

    public static void b(HttpEntity httpEntity) {
        if (httpEntity != null && httpEntity.isStreaming()) {
            InputStream content = httpEntity.getContent();
            if (content != null) {
                content.close();
            }
        }
    }

    public static byte[] c(HttpEntity httpEntity) {
        int i = 4096;
        boolean z = false;
        a.a(httpEntity, "Entity");
        InputStream content = httpEntity.getContent();
        if (content == null) {
            return null;
        }
        try {
            if (httpEntity.getContentLength() <= 2147483647L) {
                z = true;
            }
            a.a(z, "HTTP entity too large to be buffered in memory");
            int contentLength = (int) httpEntity.getContentLength();
            if (contentLength >= 0) {
                i = contentLength;
            }
            ByteArrayBuffer byteArrayBuffer = new ByteArrayBuffer(i);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = content.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayBuffer.append(bArr, 0, read);
            }
            bArr = byteArrayBuffer.toByteArray();
            return bArr;
        } finally {
            content.close();
        }
    }

    @Deprecated
    public static String d(HttpEntity httpEntity) {
        a.a(httpEntity, "Entity");
        if (httpEntity.getContentType() == null) {
            return null;
        }
        HeaderElement[] elements = httpEntity.getContentType().getElements();
        if (elements.length <= 0) {
            return null;
        }
        NameValuePair parameterByName = elements[0].getParameterByName("charset");
        return parameterByName != null ? parameterByName.getValue() : null;
    }

    @Deprecated
    public static String e(HttpEntity httpEntity) {
        a.a(httpEntity, "Entity");
        if (httpEntity.getContentType() == null) {
            return null;
        }
        HeaderElement[] elements = httpEntity.getContentType().getElements();
        return elements.length > 0 ? elements[0].getName() : null;
    }

    public static String f(HttpEntity httpEntity) {
        return a(httpEntity, (Charset) null);
    }
}
