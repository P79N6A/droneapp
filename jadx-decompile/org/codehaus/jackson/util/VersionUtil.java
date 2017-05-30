package org.codehaus.jackson.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import org.codehaus.jackson.Version;

public class VersionUtil {
    public static final String VERSION_FILE = "VERSION.txt";
    private static final Pattern VERSION_SEPARATOR = Pattern.compile("[-_./;:]");

    public static Version parseVersion(String str) {
        int i = 0;
        String str2 = null;
        if (str == null) {
            return null;
        }
        CharSequence trim = str.trim();
        if (trim.length() == 0) {
            return null;
        }
        String[] split = VERSION_SEPARATOR.split(trim);
        if (split.length < 2) {
            return null;
        }
        int parseVersionPart = parseVersionPart(split[0]);
        int parseVersionPart2 = parseVersionPart(split[1]);
        if (split.length > 2) {
            i = parseVersionPart(split[2]);
        }
        if (split.length > 3) {
            str2 = split[3];
        }
        return new Version(parseVersionPart, parseVersionPart2, i, str2);
    }

    protected static int parseVersionPart(String str) {
        int i = 0;
        String str2 = str.toString();
        int length = str2.length();
        int i2 = 0;
        while (i < length) {
            char charAt = str2.charAt(i);
            if (charAt > '9' || charAt < '0') {
                break;
            }
            i2 = (i2 * 10) + (charAt - 48);
            i++;
        }
        return i2;
    }

    public static Version versionFor(Class<?> cls) {
        InputStream resourceAsStream;
        Version version = null;
        try {
            resourceAsStream = cls.getResourceAsStream(VERSION_FILE);
            if (resourceAsStream != null) {
                version = parseVersion(new BufferedReader(new InputStreamReader(resourceAsStream, "UTF-8")).readLine());
                resourceAsStream.close();
            }
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        } catch (IOException e3) {
        } catch (Throwable th) {
            resourceAsStream.close();
        }
        return version == null ? Version.unknownVersion() : version;
    }
}
