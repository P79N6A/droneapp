package org.codehaus.jackson;

import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;

public final class Base64Variants {
    public static final Base64Variant MIME = new Base64Variant("MIME", STD_BASE64_ALPHABET, true, (char) SignatureVisitor.INSTANCEOF, 76);
    public static final Base64Variant MIME_NO_LINEFEEDS = new Base64Variant(MIME, "MIME-NO-LINEFEEDS", Integer.MAX_VALUE);
    public static final Base64Variant MODIFIED_FOR_URL;
    public static final Base64Variant PEM = new Base64Variant(MIME, "PEM", true, (char) SignatureVisitor.INSTANCEOF, 64);
    static final String STD_BASE64_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    static {
        StringBuffer stringBuffer = new StringBuffer(STD_BASE64_ALPHABET);
        stringBuffer.setCharAt(stringBuffer.indexOf("+"), SignatureVisitor.SUPER);
        stringBuffer.setCharAt(stringBuffer.indexOf("/"), '_');
        MODIFIED_FOR_URL = new Base64Variant("MODIFIED-FOR-URL", stringBuffer.toString(), false, '\u0000', Integer.MAX_VALUE);
    }

    public static Base64Variant getDefaultVariant() {
        return MIME_NO_LINEFEEDS;
    }
}
