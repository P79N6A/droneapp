package m.framework.b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONObject;

public class d {
    private String a(String str, ArrayList<Object> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[\n");
        String stringBuilder = new StringBuilder(String.valueOf(str)).append("\t").toString();
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (i > 0) {
                stringBuffer.append(",\n");
            }
            stringBuffer.append(stringBuilder);
            if (next instanceof HashMap) {
                stringBuffer.append(a(stringBuilder, (HashMap) next));
            } else if (next instanceof ArrayList) {
                stringBuffer.append(a(stringBuilder, (ArrayList) next));
            } else if (next instanceof String) {
                stringBuffer.append(l.e).append(next).append(l.e);
            } else {
                stringBuffer.append(next);
            }
            i++;
        }
        stringBuffer.append('\n').append(str).append(']');
        return stringBuffer.toString();
    }

    private String a(String str, HashMap<String, Object> hashMap) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{\n");
        String stringBuilder = new StringBuilder(String.valueOf(str)).append("\t").toString();
        int i = 0;
        for (Entry entry : hashMap.entrySet()) {
            if (i > 0) {
                stringBuffer.append(",\n");
            }
            stringBuffer.append(stringBuilder).append(l.e).append((String) entry.getKey()).append("\":");
            Object value = entry.getValue();
            if (value instanceof HashMap) {
                stringBuffer.append(a(stringBuilder, (HashMap) value));
            } else if (value instanceof ArrayList) {
                stringBuffer.append(a(stringBuilder, (ArrayList) value));
            } else if (value instanceof String) {
                stringBuffer.append(l.e).append(value).append(l.e);
            } else {
                stringBuffer.append(value);
            }
            i++;
        }
        stringBuffer.append('\n').append(str).append('}');
        return stringBuffer.toString();
    }

    private ArrayList<Object> a(JSONArray jSONArray) {
        ArrayList<Object> arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object opt = jSONArray.opt(i);
            if (opt instanceof JSONObject) {
                opt = a((JSONObject) opt);
            } else if (opt instanceof JSONArray) {
                opt = a((JSONArray) opt);
            }
            arrayList.add(opt);
        }
        return arrayList;
    }

    private HashMap<String, Object> a(JSONObject jSONObject) {
        HashMap<String, Object> hashMap = new HashMap();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            Object opt = jSONObject.opt(str);
            if (JSONObject.NULL.equals(opt)) {
                opt = null;
            }
            if (opt != null) {
                if (opt instanceof JSONObject) {
                    opt = a((JSONObject) opt);
                } else if (opt instanceof JSONArray) {
                    opt = a((JSONArray) opt);
                }
                hashMap.put(str, opt);
            }
        }
        return hashMap;
    }

    private JSONArray a(ArrayList<Object> arrayList) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof HashMap) {
                next = b((HashMap) next);
            } else if (next instanceof ArrayList) {
                next = a((ArrayList) next);
            }
            jSONArray.put(next);
        }
        return jSONArray;
    }

    private boolean a(Object obj) {
        return (obj instanceof byte[]) || (obj instanceof short[]) || (obj instanceof int[]) || (obj instanceof long[]) || (obj instanceof float[]) || (obj instanceof double[]) || (obj instanceof char[]) || (obj instanceof boolean[]) || (obj instanceof String[]);
    }

    private ArrayList<?> b(Object obj) {
        int i = 0;
        ArrayList<?> arrayList;
        int length;
        if (obj instanceof byte[]) {
            arrayList = new ArrayList();
            byte[] bArr = (byte[]) obj;
            length = bArr.length;
            while (i < length) {
                arrayList.add(Byte.valueOf(bArr[i]));
                i++;
            }
            return arrayList;
        } else if (obj instanceof short[]) {
            arrayList = new ArrayList();
            short[] sArr = (short[]) obj;
            length = sArr.length;
            while (i < length) {
                arrayList.add(Short.valueOf(sArr[i]));
                i++;
            }
            return arrayList;
        } else if (obj instanceof int[]) {
            arrayList = new ArrayList();
            int[] iArr = (int[]) obj;
            length = iArr.length;
            while (i < length) {
                arrayList.add(Integer.valueOf(iArr[i]));
                i++;
            }
            return arrayList;
        } else if (obj instanceof long[]) {
            arrayList = new ArrayList();
            long[] jArr = (long[]) obj;
            length = jArr.length;
            while (i < length) {
                arrayList.add(Long.valueOf(jArr[i]));
                i++;
            }
            return arrayList;
        } else if (obj instanceof float[]) {
            arrayList = new ArrayList();
            float[] fArr = (float[]) obj;
            length = fArr.length;
            while (i < length) {
                arrayList.add(Float.valueOf(fArr[i]));
                i++;
            }
            return arrayList;
        } else if (obj instanceof double[]) {
            arrayList = new ArrayList();
            double[] dArr = (double[]) obj;
            length = dArr.length;
            while (i < length) {
                arrayList.add(Double.valueOf(dArr[i]));
                i++;
            }
            return arrayList;
        } else if (obj instanceof char[]) {
            arrayList = new ArrayList();
            char[] cArr = (char[]) obj;
            length = cArr.length;
            while (i < length) {
                arrayList.add(Character.valueOf(cArr[i]));
                i++;
            }
            return arrayList;
        } else if (obj instanceof boolean[]) {
            arrayList = new ArrayList();
            boolean[] zArr = (boolean[]) obj;
            length = zArr.length;
            while (i < length) {
                arrayList.add(Boolean.valueOf(zArr[i]));
                i++;
            }
            return arrayList;
        } else if (!(obj instanceof String[])) {
            return null;
        } else {
            arrayList = new ArrayList();
            String[] strArr = (String[]) obj;
            length = strArr.length;
            while (i < length) {
                arrayList.add(strArr[i]);
                i++;
            }
            return arrayList;
        }
    }

    private JSONObject b(HashMap<String, Object> hashMap) {
        JSONObject jSONObject = new JSONObject();
        for (Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof HashMap) {
                value = b((HashMap) value);
            } else if (value instanceof ArrayList) {
                value = a((ArrayList) value);
            } else if (a(value)) {
                value = a(b(value));
            }
            jSONObject.put((String) entry.getKey(), value);
        }
        return jSONObject;
    }

    public String a(HashMap<String, Object> hashMap) {
        try {
            return b((HashMap) hashMap).toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public HashMap<String, Object> a(String str) {
        try {
            if (str.startsWith("[") && str.endsWith("]")) {
                str = "{\"fakelist\":" + str + "}";
            }
            return a(new JSONObject(str));
        } catch (Throwable th) {
            th.printStackTrace();
            return new HashMap();
        }
    }

    public String b(String str) {
        try {
            return a("", a(str));
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }
}
