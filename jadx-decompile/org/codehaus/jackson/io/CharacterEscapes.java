package org.codehaus.jackson.io;

import org.codehaus.jackson.SerializableString;
import org.codehaus.jackson.util.CharTypes;

public abstract class CharacterEscapes {
    public static final int ESCAPE_CUSTOM = -2;
    public static final int ESCAPE_NONE = 0;
    public static final int ESCAPE_STANDARD = -1;

    public static int[] standardAsciiEscapesForJSON() {
        Object obj = CharTypes.get7BitOutputEscapes();
        Object obj2 = new int[obj.length];
        System.arraycopy(obj, 0, obj2, 0, obj.length);
        return obj2;
    }

    public abstract int[] getEscapeCodesForAscii();

    public abstract SerializableString getEscapeSequence(int i);
}
