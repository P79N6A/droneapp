package com.google.android.gms.analytics;

import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;

public abstract class n<T extends n> {
    public static String a(Object obj) {
        return a(obj, 0);
    }

    private static String a(Object obj, int i) {
        if (i > 10) {
            return "ERROR: Recursive toString calls";
        }
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return TextUtils.isEmpty((String) obj) ? "" : obj.toString();
        } else {
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue() == 0 ? "" : obj.toString();
            } else {
                if (obj instanceof Long) {
                    return ((Long) obj).longValue() == 0 ? "" : obj.toString();
                } else {
                    if (obj instanceof Double) {
                        return ((Double) obj).doubleValue() == 0.0d ? "" : obj.toString();
                    } else {
                        if (obj instanceof Boolean) {
                            return !((Boolean) obj).booleanValue() ? "" : obj.toString();
                        } else {
                            int length;
                            if (obj instanceof List) {
                                StringBuffer stringBuffer = new StringBuffer();
                                if (i > 0) {
                                    stringBuffer.append("[");
                                }
                                List list = (List) obj;
                                length = stringBuffer.length();
                                for (Object next : list) {
                                    if (stringBuffer.length() > length) {
                                        stringBuffer.append(", ");
                                    }
                                    stringBuffer.append(a(next, i + 1));
                                }
                                if (i > 0) {
                                    stringBuffer.append("]");
                                }
                                return stringBuffer.toString();
                            } else if (!(obj instanceof Map)) {
                                return obj.toString();
                            } else {
                                StringBuffer stringBuffer2 = new StringBuffer();
                                length = 0;
                                Object obj2 = null;
                                for (Entry entry : new TreeMap((Map) obj).entrySet()) {
                                    Object a = a(entry.getValue(), i + 1);
                                    if (!TextUtils.isEmpty(a)) {
                                        if (i > 0 && obj2 == null) {
                                            stringBuffer2.append("{");
                                            obj2 = 1;
                                            length = stringBuffer2.length();
                                        }
                                        if (stringBuffer2.length() > length) {
                                            stringBuffer2.append(", ");
                                        }
                                        stringBuffer2.append((String) entry.getKey());
                                        stringBuffer2.append(SignatureVisitor.INSTANCEOF);
                                        stringBuffer2.append(a);
                                    }
                                }
                                if (obj2 != null) {
                                    stringBuffer2.append("}");
                                }
                                return stringBuffer2.toString();
                            }
                        }
                    }
                }
            }
        }
    }

    public static String a(Map map) {
        return a(map, 1);
    }

    public abstract void a(T t);
}