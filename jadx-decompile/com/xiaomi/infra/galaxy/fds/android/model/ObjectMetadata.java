package com.xiaomi.infra.galaxy.fds.android.model;

import com.xiaomi.infra.galaxy.fds.android.util.Consts;
import com.xiaomi.infra.galaxy.fds.android.util.Util;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.apache.http.Header;

public class ObjectMetadata {
    private static final Set<String> PREDEFINED_HEADERS = new HashSet();
    private final Map<String, String> predefinedMetadata = new HashMap();
    private final Map<String, String> userMetadata = new HashMap();

    static {
        PREDEFINED_HEADERS.add("Last-Modified");
        PREDEFINED_HEADERS.add("Content-MD5");
        PREDEFINED_HEADERS.add("Content-Type");
        PREDEFINED_HEADERS.add("Content-Length");
        PREDEFINED_HEADERS.add("Content-Encoding");
        PREDEFINED_HEADERS.add("Cache-Control");
    }

    public static ObjectMetadata parseObjectMetadata(Header[] headerArr) {
        ObjectMetadata objectMetadata = new ObjectMetadata();
        for (Header header : headerArr) {
            String name = header.getName();
            String value = header.getValue();
            if (name.startsWith(Consts.XIAOMI_META_HEADER_PREFIX)) {
                objectMetadata.addUserMetadata(name, value);
            } else if (PREDEFINED_HEADERS.contains(name)) {
                objectMetadata.addPredefinedMetadata(name, value);
            }
        }
        return objectMetadata;
    }

    public void addPredefinedMetadata(String str, String str2) {
        this.predefinedMetadata.put(str, str2);
    }

    public void addUserMetadata(String str, String str2) {
        this.userMetadata.put(str, str2);
    }

    public Map<String, String> getAllMetadata() {
        Map<String, String> hashMap = new HashMap(this.predefinedMetadata);
        hashMap.putAll(this.userMetadata);
        return hashMap;
    }

    public String getCacheControl() {
        return (String) this.predefinedMetadata.get("Cache-Control");
    }

    public String getContentEncoding() {
        return (String) this.predefinedMetadata.get("Content-Encoding");
    }

    public long getContentLength() {
        String str = (String) this.predefinedMetadata.get("Content-Length");
        return str != null ? Long.parseLong(str) : -1;
    }

    public String getContentMD5() {
        return (String) this.predefinedMetadata.get("Content-MD5");
    }

    public String getContentType() {
        return (String) this.predefinedMetadata.get("Content-Type");
    }

    public Date getLastModified() {
        String str = (String) this.predefinedMetadata.get("Last-Modified");
        if (str == null) {
            return null;
        }
        try {
            return Util.parseDate(str);
        } catch (ParseException e) {
            return null;
        }
    }

    public Map<String, String> getUserMetadata() {
        return this.userMetadata;
    }

    public void setCacheControl(String str) {
        this.predefinedMetadata.put("Cache-Control", str);
    }

    public void setContentEncoding(String str) {
        this.predefinedMetadata.put("Content-Encoding", str);
    }

    public void setContentLength(long j) {
        this.predefinedMetadata.put("Content-Length", Long.toString(j));
    }

    public void setContentMD5(String str) {
        this.predefinedMetadata.put("Content-MD5", str);
    }

    public void setContentType(String str) {
        this.predefinedMetadata.put("Content-Type", str);
    }

    public void setLastModified(Date date) {
        this.predefinedMetadata.put("Last-Modified", Util.formatDateString(date));
    }
}
