package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitSource;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.StringUtils;
import java.io.UnsupportedEncodingException;
import java.util.Hashtable;
import java.util.Vector;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;

final class DecodedBitStreamParser {
    private static final char[] ALPHANUMERIC_CHARS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', l.c, '$', '%', '*', SignatureVisitor.EXTENDS, SignatureVisitor.SUPER, '.', '/', ':'};

    private DecodedBitStreamParser() {
    }

    static DecoderResult decode(byte[] bArr, Version version, ErrorCorrectionLevel errorCorrectionLevel, Hashtable hashtable) {
        Vector vector = null;
        BitSource bitSource = new BitSource(bArr);
        StringBuffer stringBuffer = new StringBuffer(50);
        boolean z = false;
        Vector vector2 = new Vector(1);
        CharacterSetECI characterSetECI = null;
        while (true) {
            Mode mode;
            boolean z2;
            if (bitSource.available() < 4) {
                mode = Mode.TERMINATOR;
            } else {
                try {
                    mode = Mode.forBits(bitSource.readBits(4));
                } catch (IllegalArgumentException e) {
                    throw FormatException.getFormatInstance();
                }
            }
            if (mode.equals(Mode.TERMINATOR)) {
                z2 = z;
            } else if (mode.equals(Mode.FNC1_FIRST_POSITION) || mode.equals(Mode.FNC1_SECOND_POSITION)) {
                z2 = true;
            } else if (mode.equals(Mode.STRUCTURED_APPEND)) {
                bitSource.readBits(16);
                z2 = z;
            } else if (mode.equals(Mode.ECI)) {
                characterSetECI = CharacterSetECI.getCharacterSetECIByValue(parseECIValue(bitSource));
                if (characterSetECI == null) {
                    throw FormatException.getFormatInstance();
                }
                z2 = z;
            } else {
                int readBits = bitSource.readBits(mode.getCharacterCountBits(version));
                if (mode.equals(Mode.NUMERIC)) {
                    decodeNumericSegment(bitSource, stringBuffer, readBits);
                    z2 = z;
                } else if (mode.equals(Mode.ALPHANUMERIC)) {
                    decodeAlphanumericSegment(bitSource, stringBuffer, readBits, z);
                    z2 = z;
                } else if (mode.equals(Mode.BYTE)) {
                    decodeByteSegment(bitSource, stringBuffer, readBits, characterSetECI, vector2, hashtable);
                    z2 = z;
                } else if (mode.equals(Mode.KANJI)) {
                    decodeKanjiSegment(bitSource, stringBuffer, readBits);
                    z2 = z;
                } else {
                    throw FormatException.getFormatInstance();
                }
            }
            if (mode.equals(Mode.TERMINATOR)) {
                break;
            }
            z = z2;
        }
        String stringBuffer2 = stringBuffer.toString();
        if (!vector2.isEmpty()) {
            vector = vector2;
        }
        return new DecoderResult(bArr, stringBuffer2, vector, errorCorrectionLevel);
    }

    private static void decodeAlphanumericSegment(BitSource bitSource, StringBuffer stringBuffer, int i, boolean z) {
        int length = stringBuffer.length();
        while (i > 1) {
            int readBits = bitSource.readBits(11);
            stringBuffer.append(toAlphaNumericChar(readBits / 45));
            stringBuffer.append(toAlphaNumericChar(readBits % 45));
            i -= 2;
        }
        if (i == 1) {
            stringBuffer.append(toAlphaNumericChar(bitSource.readBits(6)));
        }
        if (z) {
            while (length < stringBuffer.length()) {
                if (stringBuffer.charAt(length) == '%') {
                    if (length >= stringBuffer.length() - 1 || stringBuffer.charAt(length + 1) != '%') {
                        stringBuffer.setCharAt(length, '\u001d');
                    } else {
                        stringBuffer.deleteCharAt(length + 1);
                    }
                }
                length++;
            }
        }
    }

    private static void decodeByteSegment(BitSource bitSource, StringBuffer stringBuffer, int i, CharacterSetECI characterSetECI, Vector vector, Hashtable hashtable) {
        Object obj = new byte[i];
        if ((i << 3) > bitSource.available()) {
            throw FormatException.getFormatInstance();
        }
        for (int i2 = 0; i2 < i; i2++) {
            obj[i2] = (byte) bitSource.readBits(8);
        }
        try {
            stringBuffer.append(new String(obj, characterSetECI == null ? StringUtils.guessEncoding(obj, hashtable) : characterSetECI.getEncodingName()));
            vector.addElement(obj);
        } catch (UnsupportedEncodingException e) {
            throw FormatException.getFormatInstance();
        }
    }

    private static void decodeKanjiSegment(BitSource bitSource, StringBuffer stringBuffer, int i) {
        byte[] bArr = new byte[(i * 2)];
        int i2 = 0;
        while (i > 0) {
            int readBits = bitSource.readBits(13);
            readBits = (readBits % 192) | ((readBits / 192) << 8);
            readBits = readBits < 7936 ? readBits + 33088 : readBits + 49472;
            bArr[i2] = (byte) (readBits >> 8);
            bArr[i2 + 1] = (byte) readBits;
            i--;
            i2 += 2;
        }
        try {
            stringBuffer.append(new String(bArr, StringUtils.SHIFT_JIS));
        } catch (UnsupportedEncodingException e) {
            throw FormatException.getFormatInstance();
        }
    }

    private static void decodeNumericSegment(BitSource bitSource, StringBuffer stringBuffer, int i) {
        while (i >= 3) {
            int readBits = bitSource.readBits(10);
            if (readBits >= 1000) {
                throw FormatException.getFormatInstance();
            }
            stringBuffer.append(toAlphaNumericChar(readBits / 100));
            stringBuffer.append(toAlphaNumericChar((readBits / 10) % 10));
            stringBuffer.append(toAlphaNumericChar(readBits % 10));
            i -= 3;
        }
        if (i == 2) {
            readBits = bitSource.readBits(7);
            if (readBits >= 100) {
                throw FormatException.getFormatInstance();
            }
            stringBuffer.append(toAlphaNumericChar(readBits / 10));
            stringBuffer.append(toAlphaNumericChar(readBits % 10));
        } else if (i == 1) {
            readBits = bitSource.readBits(4);
            if (readBits >= 10) {
                throw FormatException.getFormatInstance();
            }
            stringBuffer.append(toAlphaNumericChar(readBits));
        }
    }

    private static int parseECIValue(BitSource bitSource) {
        int readBits = bitSource.readBits(8);
        if ((readBits & 128) == 0) {
            return readBits & 127;
        }
        if ((readBits & 192) == 128) {
            return ((readBits & 63) << 8) | bitSource.readBits(8);
        } else if ((readBits & 224) == 192) {
            return ((readBits & 31) << 16) | bitSource.readBits(16);
        } else {
            throw new IllegalArgumentException(new StringBuffer().append("Bad ECI bits starting with byte ").append(readBits).toString());
        }
    }

    private static char toAlphaNumericChar(int i) {
        if (i < ALPHANUMERIC_CHARS.length) {
            return ALPHANUMERIC_CHARS[i];
        }
        throw FormatException.getFormatInstance();
    }
}
