package org.a.a.f.c;

import android.util.Log;
import com.xiaomi.market.sdk.j;
import java.net.InetAddress;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.a.a.a.b;
import org.a.a.o.f;
import org.apache.http.NameValuePair;
import org.apache.http.conn.ssl.X509HostnameVerifier;

@b
public abstract class a implements X509HostnameVerifier {
    private static final String[] a = new String[]{"ac", j.ae, "com", "ed", "edu", "go", "gouv", "gov", j.ag, "lg", "ne", "net", "or", "org"};
    private static final String b = "HttpClient";

    static {
        Arrays.sort(a);
    }

    @Deprecated
    public static boolean a(String str) {
        String[] split = str.split("\\.");
        return (split.length == 3 && split[2].length() == 2 && Arrays.binarySearch(a, split[1]) >= 0) ? false : true;
    }

    public static String[] a(X509Certificate x509Certificate) {
        try {
            return c(x509Certificate.getSubjectX500Principal().toString());
        } catch (SSLException e) {
            return null;
        }
    }

    private static String[] a(X509Certificate x509Certificate, String str) {
        int i = e(str) ? 7 : 2;
        LinkedList linkedList = new LinkedList();
        Collection subjectAlternativeNames;
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException e) {
            subjectAlternativeNames = null;
        }
        if (r0 != null) {
            for (List list : r0) {
                if (((Integer) list.get(0)).intValue() == i) {
                    linkedList.add((String) list.get(1));
                }
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        String[] strArr = new String[linkedList.size()];
        linkedList.toArray(strArr);
        return strArr;
    }

    public static String[] b(X509Certificate x509Certificate) {
        return a(x509Certificate, null);
    }

    static String[] c(String str) {
        if (str == null) {
            return null;
        }
        List arrayList = new ArrayList();
        List a = d.a.a(str);
        for (int i = 0; i < a.size(); i++) {
            NameValuePair nameValuePair = (NameValuePair) a.get(i);
            Object name = nameValuePair.getName();
            String value = nameValuePair.getValue();
            if (f.b(name)) {
                throw new SSLException(str + " is not a valid X500 distinguished name");
            }
            if (name.equalsIgnoreCase("cn")) {
                arrayList.add(value);
            }
        }
        return arrayList.isEmpty() ? null : (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static int d(String str) {
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            if (str.charAt(i) == '.') {
                i2++;
            }
            i++;
        }
        return i2;
    }

    private static boolean e(String str) {
        return str != null && (org.a.a.f.d.a.a(str) || org.a.a.f.d.a.e(str));
    }

    private String f(String str) {
        if (str != null && org.a.a.f.d.a.e(str)) {
            try {
                str = InetAddress.getByName(str).getHostAddress();
            } catch (Throwable e) {
                Log.e(b, "Unexpected error converting " + str, e);
            }
        }
        return str;
    }

    public final void a(String str, String[] strArr, String[] strArr2, boolean z) {
        int i;
        LinkedList linkedList = new LinkedList();
        if (!(strArr == null || strArr.length <= 0 || strArr[0] == null)) {
            linkedList.add(strArr[0]);
        }
        if (strArr2 != null) {
            for (Object obj : strArr2) {
                if (obj != null) {
                    linkedList.add(obj);
                }
            }
        }
        if (linkedList.isEmpty()) {
            throw new SSLException("Certificate for <" + str + "> doesn't contain CN or DNS subjectAlt");
        }
        StringBuilder stringBuilder = new StringBuilder();
        String f = f(str.trim().toLowerCase(Locale.ENGLISH));
        Iterator it = linkedList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            String toLowerCase = ((String) it.next()).toLowerCase(Locale.ENGLISH);
            stringBuilder.append(" <");
            stringBuilder.append(toLowerCase);
            stringBuilder.append('>');
            if (it.hasNext()) {
                stringBuilder.append(" OR");
            }
            String[] split = toLowerCase.split("\\.");
            i = (split.length < 3 || !split[0].endsWith("*") || !b(toLowerCase) || e(str)) ? 0 : 1;
            if (i != 0) {
                String str2 = split[0];
                if (str2.length() > 1) {
                    String substring = str2.substring(0, str2.length() - 1);
                    z2 = f.startsWith(substring) && f.substring(substring.length()).endsWith(toLowerCase.substring(str2.length()));
                } else {
                    z2 = f.endsWith(toLowerCase.substring(1));
                }
                if (z2 && z) {
                    if (d(f) == d(toLowerCase)) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                }
            } else {
                z2 = f.equals(f(toLowerCase));
                continue;
            }
            if (z2) {
                break;
            }
        }
        if (!z2) {
            throw new SSLException("hostname in certificate didn't match: <" + str + "> !=" + stringBuilder);
        }
    }

    boolean b(String str) {
        String[] split = str.split("\\.");
        return (split.length == 3 && split[2].length() == 2 && Arrays.binarySearch(a, split[1]) >= 0) ? false : true;
    }

    public final void verify(String str, X509Certificate x509Certificate) {
        verify(str, a(x509Certificate), a(x509Certificate, str));
    }

    public final void verify(String str, SSLSocket sSLSocket) {
        if (str == null) {
            throw new NullPointerException("host to verify is null");
        }
        SSLSession session = sSLSocket.getSession();
        if (session == null) {
            sSLSocket.getInputStream().available();
            session = sSLSocket.getSession();
            if (session == null) {
                sSLSocket.startHandshake();
                session = sSLSocket.getSession();
            }
        }
        verify(str, (X509Certificate) session.getPeerCertificates()[0]);
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            verify(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            return true;
        } catch (SSLException e) {
            return false;
        }
    }
}
