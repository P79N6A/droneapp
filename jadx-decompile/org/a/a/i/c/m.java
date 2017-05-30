package org.a.a.i.c;

import android.util.Log;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.a.a.f.b;
import org.a.a.o.a;

public class m implements b {
    private static final String a = "HttpClient";
    private final Map<String, InetAddress[]> b = new ConcurrentHashMap();

    public void a(String str, InetAddress... inetAddressArr) {
        a.a((Object) str, "Host name");
        a.a((Object) inetAddressArr, "Array of IP addresses");
        this.b.put(str, inetAddressArr);
    }

    public InetAddress[] a(String str) {
        InetAddress[] inetAddressArr = (InetAddress[]) this.b.get(str);
        if (Log.isLoggable(a, 4)) {
            Log.i(a, "Resolving " + str + " to " + Arrays.deepToString(inetAddressArr));
        }
        if (inetAddressArr != null) {
            return inetAddressArr;
        }
        throw new UnknownHostException(str + " cannot be resolved");
    }
}
