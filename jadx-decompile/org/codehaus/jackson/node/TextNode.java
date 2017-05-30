package org.codehaus.jackson.node;

import org.codehaus.jackson.Base64Variant;
import org.codehaus.jackson.Base64Variants;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonLocation;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.io.NumberInput;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.util.CharTypes;

public final class TextNode extends ValueNode {
    static final TextNode EMPTY_STRING_NODE = new TextNode("");
    static final int INT_SPACE = 32;
    final String _value;

    public TextNode(String str) {
        this._value = str;
    }

    protected static void appendQuoted(StringBuilder stringBuilder, String str) {
        stringBuilder.append(l.e);
        CharTypes.appendQuoted(stringBuilder, str);
        stringBuilder.append(l.e);
    }

    public static TextNode valueOf(String str) {
        return str == null ? null : str.length() == 0 ? EMPTY_STRING_NODE : new TextNode(str);
    }

    protected void _reportBase64EOF() {
        throw new JsonParseException("Unexpected end-of-String when base64 content", JsonLocation.NA);
    }

    protected void _reportInvalidBase64(Base64Variant base64Variant, char c, int i) {
        _reportInvalidBase64(base64Variant, c, i, null);
    }

    protected void _reportInvalidBase64(Base64Variant base64Variant, char c, int i, String str) {
        r0 = c <= l.c ? "Illegal white space character (code 0x" + Integer.toHexString(c) + ") as character #" + (i + 1) + " of 4-char base64 unit: can only used between units" : base64Variant.usesPaddingChar(c) ? "Unexpected padding character ('" + base64Variant.getPaddingChar() + "') as character #" + (i + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character" : (!Character.isDefined(c) || Character.isISOControl(c)) ? "Illegal character (code 0x" + Integer.toHexString(c) + ") in base64 content" : "Illegal character '" + c + "' (code 0x" + Integer.toHexString(c) + ") in base64 content";
        if (str != null) {
            r0 = r0 + ": " + str;
        }
        throw new JsonParseException(r0, JsonLocation.NA);
    }

    public JsonToken asToken() {
        return JsonToken.VALUE_STRING;
    }

    public boolean equals(Object obj) {
        return obj == this ? true : (obj == null || obj.getClass() != getClass()) ? false : ((TextNode) obj)._value.equals(this._value);
    }

    public byte[] getBinaryValue() {
        return getBinaryValue(Base64Variants.getDefaultVariant());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getBinaryValue(org.codehaus.jackson.Base64Variant r12) {
        /*
        r11 = this;
        r10 = 3;
        r2 = 0;
        r9 = -2;
        r3 = new org.codehaus.jackson.util.ByteArrayBuilder;
        r0 = 100;
        r3.<init>(r0);
        r4 = r11._value;
        r5 = r4.length();
        r0 = r2;
    L_0x0011:
        if (r0 >= r5) goto L_0x001b;
    L_0x0013:
        r1 = r0 + 1;
        r0 = r4.charAt(r0);
        if (r1 < r5) goto L_0x0020;
    L_0x001b:
        r0 = r3.toByteArray();
        return r0;
    L_0x0020:
        r6 = 32;
        if (r0 <= r6) goto L_0x00d6;
    L_0x0024:
        r6 = r12.decodeBase64Char(r0);
        if (r6 >= 0) goto L_0x002d;
    L_0x002a:
        r11._reportInvalidBase64(r12, r0, r2);
    L_0x002d:
        if (r1 < r5) goto L_0x0032;
    L_0x002f:
        r11._reportBase64EOF();
    L_0x0032:
        r0 = r1 + 1;
        r1 = r4.charAt(r1);
        r7 = r12.decodeBase64Char(r1);
        if (r7 >= 0) goto L_0x0042;
    L_0x003e:
        r8 = 1;
        r11._reportInvalidBase64(r12, r1, r8);
    L_0x0042:
        r1 = r6 << 6;
        r1 = r1 | r7;
        if (r0 < r5) goto L_0x0056;
    L_0x0047:
        r6 = r12.usesPadding();
        if (r6 != 0) goto L_0x0053;
    L_0x004d:
        r0 = r1 >> 4;
        r3.append(r0);
        goto L_0x001b;
    L_0x0053:
        r11._reportBase64EOF();
    L_0x0056:
        r6 = r0 + 1;
        r0 = r4.charAt(r0);
        r7 = r12.decodeBase64Char(r0);
        if (r7 >= 0) goto L_0x00a0;
    L_0x0062:
        if (r7 == r9) goto L_0x0068;
    L_0x0064:
        r7 = 2;
        r11._reportInvalidBase64(r12, r0, r7);
    L_0x0068:
        if (r6 < r5) goto L_0x006d;
    L_0x006a:
        r11._reportBase64EOF();
    L_0x006d:
        r0 = r6 + 1;
        r6 = r4.charAt(r6);
        r7 = r12.usesPaddingChar(r6);
        if (r7 != 0) goto L_0x0099;
    L_0x0079:
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = "expected padding character '";
        r7 = r7.append(r8);
        r8 = r12.getPaddingChar();
        r7 = r7.append(r8);
        r8 = "'";
        r7 = r7.append(r8);
        r7 = r7.toString();
        r11._reportInvalidBase64(r12, r6, r10, r7);
    L_0x0099:
        r1 = r1 >> 4;
        r3.append(r1);
        goto L_0x0011;
    L_0x00a0:
        r0 = r1 << 6;
        r1 = r0 | r7;
        if (r6 < r5) goto L_0x00b6;
    L_0x00a6:
        r0 = r12.usesPadding();
        if (r0 != 0) goto L_0x00b3;
    L_0x00ac:
        r0 = r1 >> 2;
        r3.appendTwoBytes(r0);
        goto L_0x001b;
    L_0x00b3:
        r11._reportBase64EOF();
    L_0x00b6:
        r0 = r6 + 1;
        r6 = r4.charAt(r6);
        r7 = r12.decodeBase64Char(r6);
        if (r7 >= 0) goto L_0x00ce;
    L_0x00c2:
        if (r7 == r9) goto L_0x00c7;
    L_0x00c4:
        r11._reportInvalidBase64(r12, r6, r10);
    L_0x00c7:
        r1 = r1 >> 2;
        r3.appendTwoBytes(r1);
        goto L_0x0011;
    L_0x00ce:
        r1 = r1 << 6;
        r1 = r1 | r7;
        r3.appendThreeBytes(r1);
        goto L_0x0011;
    L_0x00d6:
        r0 = r1;
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.jackson.node.TextNode.getBinaryValue(org.codehaus.jackson.Base64Variant):byte[]");
    }

    public String getTextValue() {
        return this._value;
    }

    public boolean getValueAsBoolean(boolean z) {
        return (this._value == null || !"true".equals(this._value.trim())) ? z : true;
    }

    public double getValueAsDouble(double d) {
        return NumberInput.parseAsDouble(this._value, d);
    }

    public int getValueAsInt(int i) {
        return NumberInput.parseAsInt(this._value, i);
    }

    public long getValueAsLong(long j) {
        return NumberInput.parseAsLong(this._value, j);
    }

    public String getValueAsText() {
        return this._value;
    }

    public int hashCode() {
        return this._value.hashCode();
    }

    public boolean isTextual() {
        return true;
    }

    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (this._value == null) {
            jsonGenerator.writeNull();
        } else {
            jsonGenerator.writeString(this._value);
        }
    }

    public String toString() {
        int length = this._value.length();
        StringBuilder stringBuilder = new StringBuilder((length >> 4) + (length + 2));
        appendQuoted(stringBuilder, this._value);
        return stringBuilder.toString();
    }
}
