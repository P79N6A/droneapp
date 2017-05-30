package it.a.a.c;

import com.xiaomi.mipush.sdk.Constants;
import it.a.a.n;
import it.a.a.q;
import it.a.a.r;
import java.util.Date;
import java.util.StringTokenizer;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;

public class b implements r {
    public static void b(String[] strArr) {
        int i = 0;
        n[] a = new b().a(new String[]{"+i8388621.29609,m824255902,/,\tdev", "+i8388621.44468,m839956783,r,s10376,\tRFCEPLF"});
        while (i < a.length) {
            System.out.println(a[i]);
            i++;
        }
    }

    public n[] a(String[] strArr) {
        int length = strArr.length;
        n[] nVarArr = null;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            if (str.charAt(0) != SignatureVisitor.EXTENDS) {
                throw new q();
            }
            int indexOf = str.indexOf(9);
            if (indexOf == -1) {
                throw new q();
            }
            String substring = str.substring(1, indexOf);
            String substring2 = str.substring(indexOf + 1, str.length());
            Date date = null;
            Object obj = null;
            long j = 0;
            StringTokenizer stringTokenizer = new StringTokenizer(substring, Constants.ACCEPT_TIME_SEPARATOR_SP);
            while (stringTokenizer.hasMoreTokens()) {
                substring = stringTokenizer.nextToken();
                int length2 = substring.length();
                if (length2 > 0) {
                    if (length2 != 1) {
                        char charAt = substring.charAt(0);
                        substring = substring.substring(1, length2);
                        if (charAt == 's') {
                            try {
                                j = Long.parseLong(substring);
                            } catch (Throwable th) {
                            }
                        } else if (charAt == 'm') {
                            try {
                                date = new Date(Long.parseLong(substring) * 1000);
                            } catch (Throwable th2) {
                            }
                        }
                    } else if (substring.equals("/")) {
                        obj = 1;
                    }
                }
            }
            if (nVarArr == null) {
                nVarArr = new n[length];
            }
            nVarArr[i] = new n();
            nVarArr[i].a(substring2);
            nVarArr[i].a(date);
            nVarArr[i].a(j);
            nVarArr[i].a(obj != null ? 1 : 0);
        }
        return nVarArr;
    }
}
