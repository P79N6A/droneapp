package org.a.a.k;

import org.a.a.a.b;
import org.a.a.f.c.l;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.message.HeaderValueFormatter;
import org.apache.http.util.CharArrayBuffer;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;

@b
public class a implements HeaderValueFormatter {
    @Deprecated
    public static final a a = new a();
    public static final a b = new a();
    public static final String c = " ;,:@()<>\\\"/[]?={}\t";
    public static final String d = "\"\\";

    public static String a(HeaderElement headerElement, boolean z, HeaderValueFormatter headerValueFormatter) {
        if (headerValueFormatter == null) {
            headerValueFormatter = b;
        }
        return headerValueFormatter.formatHeaderElement(null, headerElement, z).toString();
    }

    public static String a(NameValuePair nameValuePair, boolean z, HeaderValueFormatter headerValueFormatter) {
        if (headerValueFormatter == null) {
            headerValueFormatter = b;
        }
        return headerValueFormatter.formatNameValuePair(null, nameValuePair, z).toString();
    }

    public static String a(HeaderElement[] headerElementArr, boolean z, HeaderValueFormatter headerValueFormatter) {
        if (headerValueFormatter == null) {
            headerValueFormatter = b;
        }
        return headerValueFormatter.formatElements(null, headerElementArr, z).toString();
    }

    public static String a(NameValuePair[] nameValuePairArr, boolean z, HeaderValueFormatter headerValueFormatter) {
        if (headerValueFormatter == null) {
            headerValueFormatter = b;
        }
        return headerValueFormatter.formatParameters(null, nameValuePairArr, z).toString();
    }

    protected int a(HeaderElement headerElement) {
        int i = 0;
        if (headerElement == null) {
            return 0;
        }
        int length = headerElement.getName().length();
        String value = headerElement.getValue();
        if (value != null) {
            length += value.length() + 3;
        }
        int parameterCount = headerElement.getParameterCount();
        if (parameterCount <= 0) {
            return length;
        }
        while (i < parameterCount) {
            length += a(headerElement.getParameter(i)) + 2;
            i++;
        }
        return length;
    }

    protected int a(NameValuePair nameValuePair) {
        if (nameValuePair == null) {
            return 0;
        }
        int length = nameValuePair.getName().length();
        String value = nameValuePair.getValue();
        return value != null ? length + (value.length() + 3) : length;
    }

    protected int a(HeaderElement[] headerElementArr) {
        int i = 0;
        if (headerElementArr != null && headerElementArr.length >= 1) {
            int length = (headerElementArr.length - 1) * 2;
            i = length;
            length = 0;
            while (length < headerElementArr.length) {
                int a = a(headerElementArr[length]) + i;
                length++;
                i = a;
            }
        }
        return i;
    }

    protected int a(NameValuePair[] nameValuePairArr) {
        int i = 0;
        if (nameValuePairArr != null && nameValuePairArr.length >= 1) {
            int length = (nameValuePairArr.length - 1) * 2;
            i = length;
            length = 0;
            while (length < nameValuePairArr.length) {
                int a = a(nameValuePairArr[length]) + i;
                length++;
                i = a;
            }
        }
        return i;
    }

    protected void a(CharArrayBuffer charArrayBuffer, String str, boolean z) {
        int i = 0;
        if (!z) {
            for (int i2 = 0; i2 < str.length() && !r7; i2++) {
                z = a(str.charAt(i2));
            }
        }
        if (z) {
            charArrayBuffer.append(l.e);
        }
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (b(charAt)) {
                charArrayBuffer.append(l.f);
            }
            charArrayBuffer.append(charAt);
            i++;
        }
        if (z) {
            charArrayBuffer.append(l.e);
        }
    }

    protected boolean a(char c) {
        return c.indexOf(c) >= 0;
    }

    protected boolean b(char c) {
        return d.indexOf(c) >= 0;
    }

    public CharArrayBuffer formatElements(CharArrayBuffer charArrayBuffer, HeaderElement[] headerElementArr, boolean z) {
        org.a.a.o.a.a(headerElementArr, "Header element array");
        int a = a(headerElementArr);
        if (charArrayBuffer == null) {
            charArrayBuffer = new CharArrayBuffer(a);
        } else {
            charArrayBuffer.ensureCapacity(a);
        }
        for (a = 0; a < headerElementArr.length; a++) {
            if (a > 0) {
                charArrayBuffer.append(", ");
            }
            formatHeaderElement(charArrayBuffer, headerElementArr[a], z);
        }
        return charArrayBuffer;
    }

    public CharArrayBuffer formatHeaderElement(CharArrayBuffer charArrayBuffer, HeaderElement headerElement, boolean z) {
        org.a.a.o.a.a(headerElement, "Header element");
        int a = a(headerElement);
        if (charArrayBuffer == null) {
            charArrayBuffer = new CharArrayBuffer(a);
        } else {
            charArrayBuffer.ensureCapacity(a);
        }
        charArrayBuffer.append(headerElement.getName());
        String value = headerElement.getValue();
        if (value != null) {
            charArrayBuffer.append(SignatureVisitor.INSTANCEOF);
            a(charArrayBuffer, value, z);
        }
        int parameterCount = headerElement.getParameterCount();
        if (parameterCount > 0) {
            for (a = 0; a < parameterCount; a++) {
                charArrayBuffer.append("; ");
                formatNameValuePair(charArrayBuffer, headerElement.getParameter(a), z);
            }
        }
        return charArrayBuffer;
    }

    public CharArrayBuffer formatNameValuePair(CharArrayBuffer charArrayBuffer, NameValuePair nameValuePair, boolean z) {
        org.a.a.o.a.a(nameValuePair, "Name / value pair");
        int a = a(nameValuePair);
        if (charArrayBuffer == null) {
            charArrayBuffer = new CharArrayBuffer(a);
        } else {
            charArrayBuffer.ensureCapacity(a);
        }
        charArrayBuffer.append(nameValuePair.getName());
        String value = nameValuePair.getValue();
        if (value != null) {
            charArrayBuffer.append(SignatureVisitor.INSTANCEOF);
            a(charArrayBuffer, value, z);
        }
        return charArrayBuffer;
    }

    public CharArrayBuffer formatParameters(CharArrayBuffer charArrayBuffer, NameValuePair[] nameValuePairArr, boolean z) {
        org.a.a.o.a.a(nameValuePairArr, "Header parameter array");
        int a = a(nameValuePairArr);
        if (charArrayBuffer == null) {
            charArrayBuffer = new CharArrayBuffer(a);
        } else {
            charArrayBuffer.ensureCapacity(a);
        }
        for (a = 0; a < nameValuePairArr.length; a++) {
            if (a > 0) {
                charArrayBuffer.append("; ");
            }
            formatNameValuePair(charArrayBuffer, nameValuePairArr[a], z);
        }
        return charArrayBuffer;
    }
}
