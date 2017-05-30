package org.a.a.f.c;

import java.util.BitSet;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.CharArrayBuffer;

class l {
    public static final char a = '\r';
    public static final char b = '\n';
    public static final char c = ' ';
    public static final char d = '\t';
    public static final char e = '\"';
    public static final char f = '\\';
    public static final l g = new l();

    l() {
    }

    public static BitSet a(int... iArr) {
        BitSet bitSet = new BitSet();
        for (int i : iArr) {
            bitSet.set(i);
        }
        return bitSet;
    }

    public static boolean a(char c) {
        return c == c || c == '\t' || c == a || c == '\n';
    }

    public String a(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor, BitSet bitSet) {
        StringBuilder stringBuilder = new StringBuilder();
        Object obj = null;
        while (!parserCursor.atEnd()) {
            char charAt = charArrayBuffer.charAt(parserCursor.getPos());
            if (bitSet != null && bitSet.get(charAt)) {
                break;
            } else if (a(charAt)) {
                a(charArrayBuffer, parserCursor);
                obj = 1;
            } else {
                if (obj != null && stringBuilder.length() > 0) {
                    stringBuilder.append(c);
                }
                b(charArrayBuffer, parserCursor, bitSet, stringBuilder);
                obj = null;
            }
        }
        return stringBuilder.toString();
    }

    public void a(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        int pos = parserCursor.getPos();
        int pos2 = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        while (pos2 < upperBound && a(charArrayBuffer.charAt(pos2))) {
            pos++;
            pos2++;
        }
        parserCursor.updatePos(pos);
    }

    public void a(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor, StringBuilder stringBuilder) {
        if (!parserCursor.atEnd()) {
            int pos = parserCursor.getPos();
            int pos2 = parserCursor.getPos();
            int upperBound = parserCursor.getUpperBound();
            if (charArrayBuffer.charAt(pos) == e) {
                int i = pos + 1;
                pos2++;
                Object obj = null;
                while (pos2 < upperBound) {
                    char charAt = charArrayBuffer.charAt(pos2);
                    if (obj != null) {
                        if (!(charAt == e || charAt == f)) {
                            stringBuilder.append(f);
                        }
                        stringBuilder.append(charAt);
                        obj = null;
                    } else if (charAt == e) {
                        pos = i + 1;
                        break;
                    } else if (charAt == f) {
                        obj = 1;
                    } else if (!(charAt == a || charAt == '\n')) {
                        stringBuilder.append(charAt);
                    }
                    pos2++;
                    i++;
                }
                pos = i;
                parserCursor.updatePos(pos);
            }
        }
    }

    public void a(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor, BitSet bitSet, StringBuilder stringBuilder) {
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        for (int pos2 = parserCursor.getPos(); pos2 < upperBound; pos2++) {
            char charAt = charArrayBuffer.charAt(pos2);
            if ((bitSet != null && bitSet.get(charAt)) || a(charAt) || charAt == e) {
                break;
            }
            pos++;
            stringBuilder.append(charAt);
        }
        parserCursor.updatePos(pos);
    }

    public String b(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor, BitSet bitSet) {
        StringBuilder stringBuilder = new StringBuilder();
        Object obj = null;
        while (!parserCursor.atEnd()) {
            char charAt = charArrayBuffer.charAt(parserCursor.getPos());
            if (bitSet != null && bitSet.get(charAt)) {
                break;
            } else if (a(charAt)) {
                a(charArrayBuffer, parserCursor);
                obj = 1;
            } else if (charAt == e) {
                if (obj != null && stringBuilder.length() > 0) {
                    stringBuilder.append(c);
                }
                a(charArrayBuffer, parserCursor, stringBuilder);
                obj = null;
            } else {
                if (obj != null && stringBuilder.length() > 0) {
                    stringBuilder.append(c);
                }
                a(charArrayBuffer, parserCursor, bitSet, stringBuilder);
                obj = null;
            }
        }
        return stringBuilder.toString();
    }

    public void b(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor, BitSet bitSet, StringBuilder stringBuilder) {
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        for (int pos2 = parserCursor.getPos(); pos2 < upperBound; pos2++) {
            char charAt = charArrayBuffer.charAt(pos2);
            if ((bitSet != null && bitSet.get(charAt)) || a(charAt)) {
                break;
            }
            pos++;
            stringBuilder.append(charAt);
        }
        parserCursor.updatePos(pos);
    }
}
