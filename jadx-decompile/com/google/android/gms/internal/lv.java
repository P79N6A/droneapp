package com.google.android.gms.internal;

import android.util.Base64;
import com.google.android.gms.wallet.e;
import java.net.URI;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

class lv {
    private URI a = null;
    private String b = null;
    private String c = null;
    private Map<String, String> d = null;

    public lv(URI uri, String str, Map<String, String> map) {
        this.a = uri;
        this.b = str;
        this.d = map;
        this.c = b();
    }

    private int a(int i, int i2) {
        return (int) ((Math.random() * ((double) i2)) + ((double) i));
    }

    private String a(LinkedHashMap<String, String> linkedHashMap) {
        String str = new String();
        String str2 = str;
        for (String str3 : linkedHashMap.keySet()) {
            String valueOf = String.valueOf(str2);
            str2 = (String) linkedHashMap.get(str3);
            str2 = new StringBuilder(((String.valueOf(valueOf).length() + 4) + String.valueOf(str3).length()) + String.valueOf(str2).length()).append(valueOf).append(str3).append(": ").append(str2).append("\r\n").toString();
        }
        return str2;
    }

    private String b() {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 16; i++) {
            bArr[i] = (byte) a(0, 255);
        }
        return Base64.encodeToString(bArr, 2);
    }

    public void a(String str) {
        int intValue = Integer.valueOf(str.substring(9, 12)).intValue();
        if (intValue == 407) {
            throw new lu("connection failed: proxy authentication not supported");
        } else if (intValue == e.j) {
            throw new lu("connection failed: 404 not found");
        } else if (intValue != 101) {
            throw new lu("connection failed: unknown status code " + intValue);
        }
    }

    public void a(HashMap<String, String> hashMap) {
        if (!((String) hashMap.get(org.a.a.e.X)).toLowerCase(Locale.US).equals("websocket")) {
            throw new lu("connection failed: missing header field in server handshake: Upgrade");
        } else if (!((String) hashMap.get(org.a.a.e.j)).toLowerCase(Locale.US).equals("upgrade")) {
            throw new lu("connection failed: missing header field in server handshake: Connection");
        }
    }

    public byte[] a() {
        Object obj;
        String path = this.a.getPath();
        String query = this.a.getQuery();
        String valueOf = String.valueOf(path);
        if (query == null) {
            obj = "";
        } else {
            String str = "?";
            path = String.valueOf(query);
            obj = path.length() != 0 ? str.concat(path) : new String(str);
        }
        path = String.valueOf(obj);
        valueOf = path.length() != 0 ? valueOf.concat(path) : new String(valueOf);
        obj = this.a.getHost();
        if (this.a.getPort() != -1) {
            path = String.valueOf(obj);
            obj = new StringBuilder(String.valueOf(path).length() + 12).append(path).append(":").append(this.a.getPort()).toString();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(org.a.a.e.z, obj);
        linkedHashMap.put(org.a.a.e.X, "websocket");
        linkedHashMap.put(org.a.a.e.j, org.a.a.e.X);
        linkedHashMap.put("Sec-WebSocket-Version", "13");
        linkedHashMap.put("Sec-WebSocket-Key", this.c);
        if (this.b != null) {
            linkedHashMap.put("Sec-WebSocket-Protocol", this.b);
        }
        if (this.d != null) {
            for (String path2 : this.d.keySet()) {
                if (!linkedHashMap.containsKey(path2)) {
                    linkedHashMap.put(path2, (String) this.d.get(path2));
                }
            }
        }
        query = String.valueOf(new StringBuilder(String.valueOf(valueOf).length() + 15).append("GET ").append(valueOf).append(" HTTP/1.1\r\n").toString());
        path2 = String.valueOf(a(linkedHashMap));
        path2 = String.valueOf(path2.length() != 0 ? query.concat(path2) : new String(query)).concat("\r\n");
        Object obj2 = new byte[path2.getBytes().length];
        System.arraycopy(path2.getBytes(), 0, obj2, 0, path2.getBytes().length);
        return obj2;
    }
}
