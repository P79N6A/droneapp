package it.a.a.c;

import com.xiaomi.mipush.sdk.Constants;
import it.a.a.n;
import it.a.a.q;
import it.a.a.r;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.a.a.f.c.l;

public class e implements r {
    private static final Pattern a = Pattern.compile("^([dl\\-])[r\\-][w\\-][xSs\\-][r\\-][w\\-][xSs\\-][r\\-][w\\-][xTt\\-]\\s+(?:\\d+\\s+)?\\S+\\s*\\S+\\s+(\\d+)\\s+(?:(\\w{3})\\s+(\\d{1,2}))\\s+(?:(\\d{4})|(?:(\\d{1,2}):(\\d{1,2})))\\s+([^\\\\*?\"<>|]+)(?: -> ([^\\\\*?\"<>|]+))?$");
    private static final DateFormat b = new SimpleDateFormat("MMM dd yyyy HH:mm", Locale.US);

    public n[] a(String[] strArr) {
        int length = strArr.length;
        if (length == 0) {
            return new n[0];
        }
        if (strArr[0].startsWith("total")) {
            length--;
            String[] strArr2 = new String[length];
            for (int i = 0; i < length; i++) {
                strArr2[i] = strArr[i + 1];
            }
            strArr = strArr2;
        }
        Calendar instance = Calendar.getInstance();
        int i2 = instance.get(1);
        n[] nVarArr = new n[length];
        int i3 = 0;
        while (i3 < length) {
            Matcher matcher = a.matcher(strArr[i3]);
            if (matcher.matches()) {
                nVarArr[i3] = new n();
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                String group3 = matcher.group(3);
                String group4 = matcher.group(4);
                String group5 = matcher.group(5);
                String group6 = matcher.group(6);
                String group7 = matcher.group(7);
                String group8 = matcher.group(8);
                String group9 = matcher.group(9);
                if (group.equals(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
                    nVarArr[i3].a(0);
                } else if (group.equals("d")) {
                    nVarArr[i3].a(1);
                } else if (group.equals("l")) {
                    nVarArr[i3].a(2);
                    nVarArr[i3].b(group9);
                } else {
                    throw new q();
                }
                try {
                    Object obj;
                    nVarArr[i3].a(Long.parseLong(group2));
                    if (group4.length() == 1) {
                        group4 = new StringBuffer().append("0").append(group4).toString();
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(group3);
                    stringBuffer.append(l.c);
                    stringBuffer.append(group4);
                    stringBuffer.append(l.c);
                    if (group5 == null) {
                        stringBuffer.append(i2);
                        obj = 1;
                    } else {
                        stringBuffer.append(group5);
                        obj = null;
                    }
                    stringBuffer.append(l.c);
                    if (group6 == null || group7 == null) {
                        stringBuffer.append("00:00");
                    } else {
                        if (group6.length() == 1) {
                            group6 = new StringBuffer().append("0").append(group6).toString();
                        }
                        if (group7.length() == 1) {
                            group7 = new StringBuffer().append("0").append(group7).toString();
                        }
                        stringBuffer.append(group6);
                        stringBuffer.append(':');
                        stringBuffer.append(group7);
                    }
                    try {
                        Date parse;
                        Date time;
                        synchronized (b) {
                            parse = b.parse(stringBuffer.toString());
                        }
                        if (obj != null) {
                            Calendar instance2 = Calendar.getInstance();
                            instance2.setTime(parse);
                            if (instance2.after(instance) && instance2.getTimeInMillis() - instance.getTimeInMillis() > 86400000) {
                                instance2.set(1, i2 - 1);
                                time = instance2.getTime();
                                nVarArr[i3].a(time);
                                nVarArr[i3].a(group8);
                                i3++;
                            }
                        }
                        time = parse;
                        nVarArr[i3].a(time);
                        nVarArr[i3].a(group8);
                        i3++;
                    } catch (ParseException e) {
                        throw new q();
                    }
                } catch (Throwable th) {
                    q qVar = new q();
                }
            } else {
                throw new q();
            }
        }
        return nVarArr;
    }
}
