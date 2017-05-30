package com.google.android.gms.internal;

import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Field;
import java.util.Locale;

public enum no implements nq {
    IDENTITY {
        public String a(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        public String a(Field field) {
            return no.b(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        public String a(Field field) {
            return no.b(no.b(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        public String a(Field field) {
            return no.b(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        public String a(Field field) {
            return no.b(field.getName(), Constants.ACCEPT_TIME_SEPARATOR_SERVER).toLowerCase(Locale.ENGLISH);
        }
    };

    private static String a(char c, String str, int i) {
        if (i >= str.length()) {
            return String.valueOf(c);
        }
        String valueOf = String.valueOf(str.substring(i));
        return new StringBuilder(String.valueOf(valueOf).length() + 1).append(c).append(valueOf).toString();
    }

    private static String b(String str) {
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder();
        char charAt = str.charAt(0);
        while (i < str.length() - 1 && !Character.isLetter(charAt)) {
            stringBuilder.append(charAt);
            i++;
            charAt = str.charAt(i);
        }
        return i == str.length() ? stringBuilder.toString() : !Character.isUpperCase(charAt) ? stringBuilder.append(a(Character.toUpperCase(charAt), str, i + 1)).toString() : str;
    }

    private static String b(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && stringBuilder.length() != 0) {
                stringBuilder.append(str2);
            }
            stringBuilder.append(charAt);
        }
        return stringBuilder.toString();
    }
}
