package com.google.android.gms.internal;

import android.text.TextUtils;
import com.fimi.kernel.a;
import com.google.android.gms.cast.internal.m;
import com.google.android.gms.common.images.WebImage;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class agt {
    private static final m a = new m("MetadataUtils");
    private static final String[] b = new String[]{"Z", "+hh", "+hhmm", "+hh:mm"};
    private static final String c;

    static {
        String valueOf = String.valueOf("yyyyMMdd'T'HHmmss");
        String valueOf2 = String.valueOf(b[0]);
        c = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public static String a(Calendar calendar) {
        if (calendar == null) {
            a.b("Calendar object cannot be null", new Object[0]);
            return null;
        }
        String str = c;
        if (calendar.get(11) == 0 && calendar.get(12) == 0 && calendar.get(13) == 0) {
            str = "yyyyMMdd";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        simpleDateFormat.setTimeZone(calendar.getTimeZone());
        str = simpleDateFormat.format(calendar.getTime());
        return str.endsWith("+0000") ? str.replace("+0000", b[0]) : str;
    }

    public static Calendar a(String str) {
        if (TextUtils.isEmpty(str)) {
            a.b("Input string is empty or null", new Object[0]);
            return null;
        }
        String b = b(str);
        if (TextUtils.isEmpty(b)) {
            a.b("Invalid date format", new Object[0]);
            return null;
        }
        String c = c(str);
        String str2 = "yyyyMMdd";
        if (!TextUtils.isEmpty(c)) {
            str2 = String.valueOf(b);
            b = new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(c).length()).append(str2).append(NDEFRecord.TEXT_WELL_KNOWN_TYPE).append(c).toString();
            str2 = c.length() == "HHmmss".length() ? "yyyyMMdd'T'HHmmss" : c;
        }
        Calendar instance = GregorianCalendar.getInstance();
        try {
            instance.setTime(new SimpleDateFormat(str2).parse(b));
            return instance;
        } catch (ParseException e) {
            a.b("Error parsing string: %s", new Object[]{e.getMessage()});
            return null;
        }
    }

    public static void a(List<WebImage> list, JSONObject jSONObject) {
        try {
            list.clear();
            JSONArray jSONArray = jSONObject.getJSONArray(a.b);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    list.add(new WebImage(jSONArray.getJSONObject(i)));
                } catch (IllegalArgumentException e) {
                }
            }
        } catch (JSONException e2) {
        }
    }

    public static void a(JSONObject jSONObject, List<WebImage> list) {
        if (list != null && !list.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (WebImage e : list) {
                jSONArray.put(e.e());
            }
            try {
                jSONObject.put(a.b, jSONArray);
            } catch (JSONException e2) {
            }
        }
    }

    private static String b(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            a.b("Input string is empty or null", new Object[0]);
        } else {
            try {
                str2 = str.substring(0, "yyyyMMdd".length());
            } catch (IndexOutOfBoundsException e) {
                a.c("Error extracting the date: %s", new Object[]{e.getMessage()});
            }
        }
        return str2;
    }

    private static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            a.b("string is empty or null", new Object[0]);
            return null;
        }
        int indexOf = str.indexOf(84);
        int i = indexOf + 1;
        if (indexOf != "yyyyMMdd".length()) {
            a.b("T delimeter is not found", new Object[0]);
            return null;
        }
        try {
            String substring = str.substring(i);
            if (substring.length() == "HHmmss".length()) {
                return substring;
            }
            switch (substring.charAt("HHmmss".length())) {
                case '+':
                case '-':
                    return d(substring) ? substring.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2") : null;
                case 'Z':
                    if (substring.length() != "HHmmss".length() + b[0].length()) {
                        return null;
                    }
                    substring = String.valueOf(substring.substring(0, substring.length() - 1));
                    String valueOf = String.valueOf("+0000");
                    return valueOf.length() != 0 ? substring.concat(valueOf) : new String(substring);
                default:
                    return null;
            }
        } catch (IndexOutOfBoundsException e) {
            a.b("Error extracting the time substring: %s", new Object[]{e.getMessage()});
            return null;
        }
    }

    private static boolean d(String str) {
        int length = str.length();
        int length2 = "HHmmss".length();
        return length == b[1].length() + length2 || length == b[2].length() + length2 || length == length2 + b[3].length();
    }
}
