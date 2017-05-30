package com.xiaomi.market.sdk;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.TreeMap;

public class h {
    final /* synthetic */ c G;
    private TreeMap R;

    public h(c cVar) {
        this(cVar, true);
    }

    public h(c cVar, boolean z) {
        this.G = cVar;
        this.R = new TreeMap();
        if (z) {
            cVar.x = this;
        }
    }

    public h a(String str, boolean z) {
        if (z) {
            this.R.put(str, "true");
        } else {
            this.R.put(str, "false");
        }
        return this;
    }

    public h d(String str, String str2) {
        Object obj;
        if (str2 == null) {
            obj = "";
        }
        this.R.put(str, obj);
        return this;
    }

    public String get(String str) {
        return (String) this.R.get(str);
    }

    public boolean isEmpty() {
        return this.R.isEmpty();
    }

    public TreeMap j() {
        return this.R;
    }

    public String toString() {
        if (this.R.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : this.R.keySet()) {
            stringBuilder.append(str);
            stringBuilder.append("=");
            try {
                stringBuilder.append(URLEncoder.encode((String) this.R.get(str), "UTF-8"));
            } catch (UnsupportedEncodingException e) {
            }
            stringBuilder.append("&");
        }
        return stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString();
    }
}
