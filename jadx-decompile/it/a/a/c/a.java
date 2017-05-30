package it.a.a.c;

import it.a.a.n;
import it.a.a.q;
import it.a.a.r;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a implements r {
    private static final Pattern a = Pattern.compile("^(\\d{2})-(\\d{2})-(\\d{2})\\s+(\\d{2}):(\\d{2})(AM|PM)\\s+(<DIR>|\\d+)\\s+([^\\\\/*?\"<>|]+)$");
    private static final DateFormat b = new SimpleDateFormat("MM/dd/yy hh:mm a");

    public n[] a(String[] strArr) {
        int length = strArr.length;
        n[] nVarArr = new n[length];
        int i = 0;
        while (i < length) {
            Matcher matcher = a.matcher(strArr[i]);
            if (matcher.matches()) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                String group3 = matcher.group(3);
                String group4 = matcher.group(4);
                String group5 = matcher.group(5);
                String group6 = matcher.group(6);
                String group7 = matcher.group(7);
                String group8 = matcher.group(8);
                nVarArr[i] = new n();
                nVarArr[i].a(group8);
                if (group7.equalsIgnoreCase("<DIR>")) {
                    nVarArr[i].a(1);
                    nVarArr[i].a(0);
                } else {
                    try {
                        long parseLong = Long.parseLong(group7);
                        nVarArr[i].a(0);
                        nVarArr[i].a(parseLong);
                    } catch (Throwable th) {
                        q qVar = new q();
                    }
                }
                group8 = new StringBuffer().append(group).append("/").append(group2).append("/").append(group3).append(" ").append(group4).append(":").append(group5).append(" ").append(group6).toString();
                try {
                    Date parse;
                    synchronized (b) {
                        parse = b.parse(group8);
                    }
                    nVarArr[i].a(parse);
                    i++;
                } catch (ParseException e) {
                    throw new q();
                }
            }
            throw new q();
        }
        return nVarArr;
    }
}
