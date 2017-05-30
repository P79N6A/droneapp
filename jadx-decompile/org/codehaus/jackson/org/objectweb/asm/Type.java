package org.codehaus.jackson.org.objectweb.asm;

import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Type {
    public static final int ARRAY = 9;
    public static final int BOOLEAN = 1;
    public static final Type BOOLEAN_TYPE = new Type(1, null, 1509950721, 1);
    public static final int BYTE = 3;
    public static final Type BYTE_TYPE = new Type(3, null, 1107297537, 1);
    public static final int CHAR = 2;
    public static final Type CHAR_TYPE = new Type(2, null, 1124075009, 1);
    public static final int DOUBLE = 8;
    public static final Type DOUBLE_TYPE = new Type(8, null, 1141048066, 1);
    public static final int FLOAT = 6;
    public static final Type FLOAT_TYPE = new Type(6, null, 1174536705, 1);
    public static final int INT = 5;
    public static final Type INT_TYPE = new Type(5, null, 1224736769, 1);
    public static final int LONG = 7;
    public static final Type LONG_TYPE = new Type(7, null, 1241579778, 1);
    public static final int OBJECT = 10;
    public static final int SHORT = 4;
    public static final Type SHORT_TYPE = new Type(4, null, 1392510721, 1);
    public static final int VOID = 0;
    public static final Type VOID_TYPE = new Type(0, null, 1443168256, 1);
    private final int a;
    private final char[] b;
    private final int c;
    private final int d;

    private Type(int i, char[] cArr, int i2, int i3) {
        this.a = i;
        this.b = cArr;
        this.c = i2;
        this.d = i3;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.codehaus.jackson.org.objectweb.asm.Type a(char[] r4, int r5) {
        /*
        r3 = 59;
        r0 = 1;
        r1 = r4[r5];
        switch(r1) {
            case 66: goto L_0x001a;
            case 67: goto L_0x0017;
            case 68: goto L_0x0029;
            case 70: goto L_0x0023;
            case 73: goto L_0x0020;
            case 74: goto L_0x0026;
            case 83: goto L_0x001d;
            case 86: goto L_0x0011;
            case 90: goto L_0x0014;
            case 91: goto L_0x002c;
            default: goto L_0x0008;
        };
    L_0x0008:
        r1 = r5 + r0;
        r1 = r4[r1];
        if (r1 == r3) goto L_0x0055;
    L_0x000e:
        r0 = r0 + 1;
        goto L_0x0008;
    L_0x0011:
        r0 = VOID_TYPE;
    L_0x0013:
        return r0;
    L_0x0014:
        r0 = BOOLEAN_TYPE;
        goto L_0x0013;
    L_0x0017:
        r0 = CHAR_TYPE;
        goto L_0x0013;
    L_0x001a:
        r0 = BYTE_TYPE;
        goto L_0x0013;
    L_0x001d:
        r0 = SHORT_TYPE;
        goto L_0x0013;
    L_0x0020:
        r0 = INT_TYPE;
        goto L_0x0013;
    L_0x0023:
        r0 = FLOAT_TYPE;
        goto L_0x0013;
    L_0x0026:
        r0 = LONG_TYPE;
        goto L_0x0013;
    L_0x0029:
        r0 = DOUBLE_TYPE;
        goto L_0x0013;
    L_0x002c:
        r1 = r5 + r0;
        r1 = r4[r1];
        r2 = 91;
        if (r1 != r2) goto L_0x0037;
    L_0x0034:
        r0 = r0 + 1;
        goto L_0x002c;
    L_0x0037:
        r1 = r5 + r0;
        r1 = r4[r1];
        r2 = 76;
        if (r1 != r2) goto L_0x004a;
    L_0x003f:
        r0 = r0 + 1;
    L_0x0041:
        r1 = r5 + r0;
        r1 = r4[r1];
        if (r1 == r3) goto L_0x004a;
    L_0x0047:
        r0 = r0 + 1;
        goto L_0x0041;
    L_0x004a:
        r1 = new org.codehaus.jackson.org.objectweb.asm.Type;
        r2 = 9;
        r0 = r0 + 1;
        r1.<init>(r2, r4, r5, r0);
        r0 = r1;
        goto L_0x0013;
    L_0x0055:
        r1 = new org.codehaus.jackson.org.objectweb.asm.Type;
        r2 = 10;
        r3 = r5 + 1;
        r0 = r0 + -1;
        r1.<init>(r2, r4, r3, r0);
        r0 = r1;
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.jackson.org.objectweb.asm.Type.a(char[], int):org.codehaus.jackson.org.objectweb.asm.Type");
    }

    private void a(StringBuffer stringBuffer) {
        if (this.b == null) {
            stringBuffer.append((char) ((this.c & ViewCompat.MEASURED_STATE_MASK) >>> 24));
        } else if (this.a == 9) {
            stringBuffer.append(this.b, this.c, this.d);
        } else {
            stringBuffer.append('L');
            stringBuffer.append(this.b, this.c, this.d);
            stringBuffer.append(';');
        }
    }

    private static void a(StringBuffer stringBuffer, Class cls) {
        char charAt;
        while (!cls.isPrimitive()) {
            if (cls.isArray()) {
                stringBuffer.append('[');
                cls = cls.getComponentType();
            } else {
                stringBuffer.append('L');
                String name = cls.getName();
                int length = name.length();
                for (int i = 0; i < length; i++) {
                    charAt = name.charAt(i);
                    if (charAt == '.') {
                        charAt = '/';
                    }
                    stringBuffer.append(charAt);
                }
                stringBuffer.append(';');
                return;
            }
        }
        charAt = cls == Integer.TYPE ? 'I' : cls == Void.TYPE ? 'V' : cls == Boolean.TYPE ? 'Z' : cls == Byte.TYPE ? 'B' : cls == Character.TYPE ? 'C' : cls == Short.TYPE ? 'S' : cls == Double.TYPE ? 'D' : cls == Float.TYPE ? 'F' : 'J';
        stringBuffer.append(charAt);
    }

    public static Type[] getArgumentTypes(String str) {
        int i = 1;
        char[] toCharArray = str.toCharArray();
        int i2 = 0;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char c = toCharArray[i3];
            if (c == ')') {
                break;
            } else if (c == 'L') {
                i3 = i4;
                while (true) {
                    i4 = i3 + 1;
                    if (toCharArray[i3] == ';') {
                        break;
                    }
                    i3 = i4;
                }
                i2++;
                i3 = i4;
            } else if (c != '[') {
                i2++;
                i3 = i4;
            } else {
                i3 = i4;
            }
        }
        Type[] typeArr = new Type[i2];
        i2 = 0;
        while (toCharArray[i] != ')') {
            typeArr[i2] = a(toCharArray, i);
            i += (typeArr[i2].a == 10 ? 2 : 0) + typeArr[i2].d;
            i2++;
        }
        return typeArr;
    }

    public static Type[] getArgumentTypes(Method method) {
        Class[] parameterTypes = method.getParameterTypes();
        Type[] typeArr = new Type[parameterTypes.length];
        for (int length = parameterTypes.length - 1; length >= 0; length--) {
            typeArr[length] = getType(parameterTypes[length]);
        }
        return typeArr;
    }

    public static int getArgumentsAndReturnSizes(String str) {
        int i;
        char charAt;
        int i2 = 1;
        int i3 = 1;
        int i4 = 1;
        while (true) {
            i = i3 + 1;
            charAt = str.charAt(i3);
            if (charAt == ')') {
                break;
            } else if (charAt == 'L') {
                i3 = i;
                while (true) {
                    i = i3 + 1;
                    if (str.charAt(i3) == ';') {
                        break;
                    }
                    i3 = i;
                }
                i4++;
                i3 = i;
            } else if (charAt == '[') {
                while (true) {
                    charAt = str.charAt(i);
                    if (charAt != '[') {
                        break;
                    }
                    i++;
                }
                if (charAt == 'D' || charAt == 'J') {
                    i4--;
                    i3 = i;
                } else {
                    i3 = i;
                }
            } else if (charAt == 'D' || charAt == 'J') {
                i4 += 2;
                i3 = i;
            } else {
                i4++;
                i3 = i;
            }
        }
        charAt = str.charAt(i);
        i4 <<= 2;
        if (charAt == 'V') {
            i2 = 0;
        } else if (charAt == 'D' || charAt == 'J') {
            i2 = 2;
        }
        return i4 | i2;
    }

    public static String getConstructorDescriptor(Constructor constructor) {
        Class[] parameterTypes = constructor.getParameterTypes();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        for (Class a : parameterTypes) {
            a(stringBuffer, a);
        }
        return stringBuffer.append(")V").toString();
    }

    public static String getDescriptor(Class cls) {
        StringBuffer stringBuffer = new StringBuffer();
        a(stringBuffer, cls);
        return stringBuffer.toString();
    }

    public static String getInternalName(Class cls) {
        return cls.getName().replace('.', '/');
    }

    public static String getMethodDescriptor(Method method) {
        Class[] parameterTypes = method.getParameterTypes();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        for (Class a : parameterTypes) {
            a(stringBuffer, a);
        }
        stringBuffer.append(')');
        a(stringBuffer, method.getReturnType());
        return stringBuffer.toString();
    }

    public static String getMethodDescriptor(Type type, Type[] typeArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        for (Type a : typeArr) {
            a.a(stringBuffer);
        }
        stringBuffer.append(')');
        type.a(stringBuffer);
        return stringBuffer.toString();
    }

    public static Type getObjectType(String str) {
        char[] toCharArray = str.toCharArray();
        return new Type(toCharArray[0] == '[' ? 9 : 10, toCharArray, 0, toCharArray.length);
    }

    public static Type getReturnType(String str) {
        return a(str.toCharArray(), str.indexOf(41) + 1);
    }

    public static Type getReturnType(Method method) {
        return getType(method.getReturnType());
    }

    public static Type getType(Class cls) {
        return cls.isPrimitive() ? cls == Integer.TYPE ? INT_TYPE : cls == Void.TYPE ? VOID_TYPE : cls == Boolean.TYPE ? BOOLEAN_TYPE : cls == Byte.TYPE ? BYTE_TYPE : cls == Character.TYPE ? CHAR_TYPE : cls == Short.TYPE ? SHORT_TYPE : cls == Double.TYPE ? DOUBLE_TYPE : cls == Float.TYPE ? FLOAT_TYPE : LONG_TYPE : getType(getDescriptor(cls));
    }

    public static Type getType(String str) {
        return a(str.toCharArray(), 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Type)) {
            return false;
        }
        Type type = (Type) obj;
        if (this.a != type.a) {
            return false;
        }
        if (this.a != 10 && this.a != 9) {
            return true;
        }
        if (this.d != type.d) {
            return false;
        }
        int i = this.c;
        int i2 = type.c;
        int i3 = this.d + i;
        while (i < i3) {
            if (this.b[i] != type.b[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public String getClassName() {
        switch (this.a) {
            case 0:
                return "void";
            case 1:
                return "boolean";
            case 2:
                return "char";
            case 3:
                return "byte";
            case 4:
                return "short";
            case 5:
                return "int";
            case 6:
                return "float";
            case 7:
                return "long";
            case 8:
                return "double";
            case 9:
                StringBuffer stringBuffer = new StringBuffer(getElementType().getClassName());
                for (int dimensions = getDimensions(); dimensions > 0; dimensions--) {
                    stringBuffer.append("[]");
                }
                return stringBuffer.toString();
            default:
                return new String(this.b, this.c, this.d).replace('/', '.');
        }
    }

    public String getDescriptor() {
        StringBuffer stringBuffer = new StringBuffer();
        a(stringBuffer);
        return stringBuffer.toString();
    }

    public int getDimensions() {
        int i = 1;
        while (this.b[this.c + i] == '[') {
            i++;
        }
        return i;
    }

    public Type getElementType() {
        return a(this.b, this.c + getDimensions());
    }

    public String getInternalName() {
        return new String(this.b, this.c, this.d);
    }

    public int getOpcode(int i) {
        int i2 = 4;
        if (i == 46 || i == 79) {
            if (this.b == null) {
                i2 = (this.c & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
            }
            return i2 + i;
        }
        if (this.b == null) {
            i2 = (this.c & 16711680) >> 16;
        }
        return i2 + i;
    }

    public int getSize() {
        return this.b == null ? this.c & 255 : 1;
    }

    public int getSort() {
        return this.a;
    }

    public int hashCode() {
        int i = this.a * 13;
        if (this.a == 10 || this.a == 9) {
            int i2 = this.c;
            int i3 = i2 + this.d;
            while (i2 < i3) {
                int i4 = (i + this.b[i2]) * 17;
                i2++;
                i = i4;
            }
        }
        return i;
    }

    public String toString() {
        return getDescriptor();
    }
}
