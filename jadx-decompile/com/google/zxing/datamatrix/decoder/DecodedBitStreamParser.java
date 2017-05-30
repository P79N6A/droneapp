package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitSource;
import com.google.zxing.common.DecoderResult;
import it.a.a.e;
import java.io.UnsupportedEncodingException;
import java.util.Vector;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;
import org.codehaus.jackson.smile.SmileConstants;

final class DecodedBitStreamParser {
    private static final int ANSIX12_ENCODE = 4;
    private static final int ASCII_ENCODE = 1;
    private static final int BASE256_ENCODE = 6;
    private static final char[] C40_BASIC_SET_CHARS = new char[]{'*', '*', '*', l.c, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private static final int C40_ENCODE = 2;
    private static final char[] C40_SHIFT2_SET_CHARS = new char[]{'!', l.e, '#', '$', '%', '&', '\'', '(', ')', '*', SignatureVisitor.EXTENDS, ',', SignatureVisitor.SUPER, '.', '/', ':', ';', '<', SignatureVisitor.INSTANCEOF, '>', '?', '@', '[', l.f, ']', '^', '_'};
    private static final int EDIFACT_ENCODE = 5;
    private static final int PAD_ENCODE = 0;
    private static final char[] TEXT_BASIC_SET_CHARS = new char[]{'*', '*', '*', l.c, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private static final int TEXT_ENCODE = 3;
    private static final char[] TEXT_SHIFT3_SET_CHARS = new char[]{'\'', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', ''};

    private DecodedBitStreamParser() {
    }

    static DecoderResult decode(byte[] bArr) {
        String stringBuffer;
        BitSource bitSource = new BitSource(bArr);
        StringBuffer stringBuffer2 = new StringBuffer(100);
        StringBuffer stringBuffer3 = new StringBuffer(0);
        Vector vector = new Vector(1);
        int i = 1;
        do {
            if (i == 1) {
                i = decodeAsciiSegment(bitSource, stringBuffer2, stringBuffer3);
            } else {
                switch (i) {
                    case 2:
                        decodeC40Segment(bitSource, stringBuffer2);
                        break;
                    case 3:
                        decodeTextSegment(bitSource, stringBuffer2);
                        break;
                    case 4:
                        decodeAnsiX12Segment(bitSource, stringBuffer2);
                        break;
                    case 5:
                        decodeEdifactSegment(bitSource, stringBuffer2);
                        break;
                    case 6:
                        decodeBase256Segment(bitSource, stringBuffer2, vector);
                        break;
                    default:
                        throw FormatException.getFormatInstance();
                }
                i = 1;
            }
            if (i != 0) {
            }
            if (stringBuffer3.length() > 0) {
                stringBuffer2.append(stringBuffer3.toString());
            }
            stringBuffer = stringBuffer2.toString();
            if (vector.isEmpty()) {
                vector = null;
            }
            return new DecoderResult(bArr, stringBuffer, vector, null);
        } while (bitSource.available() > 0);
        if (stringBuffer3.length() > 0) {
            stringBuffer2.append(stringBuffer3.toString());
        }
        stringBuffer = stringBuffer2.toString();
        if (vector.isEmpty()) {
            vector = null;
        }
        return new DecoderResult(bArr, stringBuffer, vector, null);
    }

    private static void decodeAnsiX12Segment(BitSource bitSource, StringBuffer stringBuffer) {
        int[] iArr = new int[3];
        while (bitSource.available() != 8) {
            int readBits = bitSource.readBits(8);
            if (readBits != 254) {
                parseTwoBytes(readBits, bitSource.readBits(8), iArr);
                for (readBits = 0; readBits < 3; readBits++) {
                    int i = iArr[readBits];
                    if (i == 0) {
                        stringBuffer.append(l.a);
                    } else if (i == 1) {
                        stringBuffer.append('*');
                    } else if (i == 2) {
                        stringBuffer.append('>');
                    } else if (i == 3) {
                        stringBuffer.append(l.c);
                    } else if (i < 14) {
                        stringBuffer.append((char) (i + 44));
                    } else if (i < 40) {
                        stringBuffer.append((char) (i + 51));
                    } else {
                        throw FormatException.getFormatInstance();
                    }
                }
                if (bitSource.available() <= 0) {
                    return;
                }
            }
            return;
        }
    }

    private static int decodeAsciiSegment(BitSource bitSource, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        int i = 0;
        do {
            int readBits = bitSource.readBits(8);
            if (readBits == 0) {
                throw FormatException.getFormatInstance();
            } else if (readBits <= 128) {
                stringBuffer.append((char) ((i != 0 ? readBits + 128 : readBits) - 1));
                return 1;
            } else if (readBits == 129) {
                return 0;
            } else {
                if (readBits <= 229) {
                    readBits -= 130;
                    if (readBits < 10) {
                        stringBuffer.append('0');
                    }
                    stringBuffer.append(readBits);
                } else if (readBits == e.F) {
                    return 2;
                } else {
                    if (readBits == 231) {
                        return 6;
                    }
                    if (!(readBits == SmileConstants.TOKEN_MISC_BINARY_7BIT || readBits == 233 || readBits == 234)) {
                        if (readBits == 235) {
                            i = 1;
                        } else if (readBits == SmileConstants.TOKEN_MISC_SHARED_STRING_LONG) {
                            stringBuffer.append("[)>\u001e05\u001d");
                            stringBuffer2.insert(0, "\u001e\u0004");
                        } else if (readBits == 237) {
                            stringBuffer.append("[)>\u001e06\u001d");
                            stringBuffer2.insert(0, "\u001e\u0004");
                        } else if (readBits == 238) {
                            return 4;
                        } else {
                            if (readBits == 239) {
                                return 3;
                            }
                            if (readBits == 240) {
                                return 5;
                            }
                            if (readBits != 241 && readBits >= 242) {
                                throw FormatException.getFormatInstance();
                            }
                        }
                    }
                }
            }
        } while (bitSource.available() > 0);
        return 1;
    }

    private static void decodeBase256Segment(BitSource bitSource, StringBuffer stringBuffer, Vector vector) {
        int readBits = bitSource.readBits(8);
        if (readBits == 0) {
            readBits = bitSource.available() / 8;
        } else if (readBits >= e.G) {
            readBits = ((readBits - 249) * e.G) + bitSource.readBits(8);
        }
        Object obj = new byte[readBits];
        for (int i = 0; i < readBits; i++) {
            if (bitSource.available() < 8) {
                throw FormatException.getFormatInstance();
            }
            obj[i] = unrandomize255State(bitSource.readBits(8), i);
        }
        vector.addElement(obj);
        try {
            stringBuffer.append(new String(obj, "ISO8859_1"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(new StringBuffer().append("Platform does not support required encoding: ").append(e).toString());
        }
    }

    private static void decodeC40Segment(BitSource bitSource, StringBuffer stringBuffer) {
        int[] iArr = new int[3];
        Object obj = null;
        while (bitSource.available() != 8) {
            int readBits = bitSource.readBits(8);
            if (readBits != 254) {
                parseTwoBytes(readBits, bitSource.readBits(8), iArr);
                int i = 0;
                readBits = 0;
                while (i < 3) {
                    int i2;
                    Object obj2;
                    int i3;
                    int i4 = iArr[i];
                    switch (readBits) {
                        case 0:
                            if (i4 >= 3) {
                                if (obj == null) {
                                    stringBuffer.append(C40_BASIC_SET_CHARS[i4]);
                                    i2 = readBits;
                                    obj2 = obj;
                                    i3 = i2;
                                    break;
                                }
                                stringBuffer.append((char) (C40_BASIC_SET_CHARS[i4] + 128));
                                i3 = readBits;
                                obj2 = null;
                                break;
                            }
                            obj2 = obj;
                            i3 = i4 + 1;
                            break;
                        case 1:
                            if (obj != null) {
                                stringBuffer.append((char) (i4 + 128));
                                obj = null;
                            } else {
                                stringBuffer.append(i4);
                            }
                            obj2 = obj;
                            i3 = 0;
                            break;
                        case 2:
                            if (i4 < 27) {
                                if (obj != null) {
                                    stringBuffer.append((char) (C40_SHIFT2_SET_CHARS[i4] + 128));
                                    obj = null;
                                } else {
                                    stringBuffer.append(C40_SHIFT2_SET_CHARS[i4]);
                                }
                            } else if (i4 == 27) {
                                throw FormatException.getFormatInstance();
                            } else if (i4 == 30) {
                                obj = 1;
                            } else {
                                throw FormatException.getFormatInstance();
                            }
                            obj2 = obj;
                            i3 = 0;
                            break;
                        case 3:
                            if (obj != null) {
                                stringBuffer.append((char) (i4 + 224));
                                obj = null;
                            } else {
                                stringBuffer.append((char) (i4 + 96));
                            }
                            obj2 = obj;
                            i3 = 0;
                            break;
                        default:
                            throw FormatException.getFormatInstance();
                    }
                    i++;
                    i2 = i3;
                    obj = obj2;
                    readBits = i2;
                }
                if (bitSource.available() <= 0) {
                    return;
                }
            }
            return;
        }
    }

    private static void decodeEdifactSegment(BitSource bitSource, StringBuffer stringBuffer) {
        Object obj = null;
        while (bitSource.available() > 16) {
            int i = 0;
            while (i < 4) {
                int readBits = bitSource.readBits(6);
                Object obj2 = readBits == 11111 ? 1 : obj;
                if (obj2 == null) {
                    stringBuffer.append((readBits & 32) == 0 ? readBits | 64 : readBits);
                }
                i++;
                obj = obj2;
            }
            if (obj != null) {
                return;
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    private static void decodeTextSegment(BitSource bitSource, StringBuffer stringBuffer) {
        int[] iArr = new int[3];
        Object obj = null;
        while (bitSource.available() != 8) {
            int readBits = bitSource.readBits(8);
            if (readBits != 254) {
                parseTwoBytes(readBits, bitSource.readBits(8), iArr);
                int i = 0;
                readBits = 0;
                while (i < 3) {
                    int i2;
                    Object obj2;
                    int i3;
                    int i4 = iArr[i];
                    switch (readBits) {
                        case 0:
                            if (i4 >= 3) {
                                if (obj == null) {
                                    stringBuffer.append(TEXT_BASIC_SET_CHARS[i4]);
                                    i2 = readBits;
                                    obj2 = obj;
                                    i3 = i2;
                                    break;
                                }
                                stringBuffer.append((char) (TEXT_BASIC_SET_CHARS[i4] + 128));
                                i3 = readBits;
                                obj2 = null;
                                break;
                            }
                            obj2 = obj;
                            i3 = i4 + 1;
                            break;
                        case 1:
                            if (obj != null) {
                                stringBuffer.append((char) (i4 + 128));
                                obj = null;
                            } else {
                                stringBuffer.append(i4);
                            }
                            obj2 = obj;
                            i3 = 0;
                            break;
                        case 2:
                            if (i4 < 27) {
                                if (obj != null) {
                                    stringBuffer.append((char) (C40_SHIFT2_SET_CHARS[i4] + 128));
                                    obj = null;
                                } else {
                                    stringBuffer.append(C40_SHIFT2_SET_CHARS[i4]);
                                }
                            } else if (i4 == 27) {
                                throw FormatException.getFormatInstance();
                            } else if (i4 == 30) {
                                obj = 1;
                            } else {
                                throw FormatException.getFormatInstance();
                            }
                            obj2 = obj;
                            i3 = 0;
                            break;
                        case 3:
                            if (obj != null) {
                                stringBuffer.append((char) (TEXT_SHIFT3_SET_CHARS[i4] + 128));
                                obj = null;
                            } else {
                                stringBuffer.append(TEXT_SHIFT3_SET_CHARS[i4]);
                            }
                            obj2 = obj;
                            i3 = 0;
                            break;
                        default:
                            throw FormatException.getFormatInstance();
                    }
                    i++;
                    i2 = i3;
                    obj = obj2;
                    readBits = i2;
                }
                if (bitSource.available() <= 0) {
                    return;
                }
            }
            return;
        }
    }

    private static void parseTwoBytes(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / 1600;
        iArr[0] = i4;
        i3 -= i4 * 1600;
        i4 = i3 / 40;
        iArr[1] = i4;
        iArr[2] = i3 - (i4 * 40);
    }

    private static byte unrandomize255State(int i, int i2) {
        int i3 = i - (((i2 * 149) % 255) + 1);
        if (i3 < 0) {
            i3 += 256;
        }
        return (byte) i3;
    }
}
