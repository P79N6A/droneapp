package com.facebook.imageutils;

import com.facebook.common.internal.Preconditions;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;

public class JfifUtil {
    public static final int APP1_EXIF_MAGIC = 1165519206;
    public static final int MARKER_APP1 = 225;
    public static final int MARKER_EOI = 217;
    public static final int MARKER_ESCAPE_BYTE = 0;
    public static final int MARKER_FIRST_BYTE = 255;
    public static final int MARKER_RST0 = 208;
    public static final int MARKER_RST7 = 215;
    public static final int MARKER_SOFn = 192;
    public static final int MARKER_SOI = 216;
    public static final int MARKER_SOS = 218;
    public static final int MARKER_TEM = 1;

    private JfifUtil() {
    }

    public static int getAutoRotateAngleFromOrientation(int i) {
        return TiffUtil.getAutoRotateAngleFromOrientation(i);
    }

    public static int getOrientation(InputStream inputStream) {
        int i = 0;
        try {
            int moveToAPP1EXIF = moveToAPP1EXIF(inputStream);
            if (moveToAPP1EXIF != 0) {
                i = TiffUtil.readOrientationFromTIFF(inputStream, moveToAPP1EXIF);
            }
        } catch (IOException e) {
        }
        return i;
    }

    public static int getOrientation(byte[] bArr) {
        return getOrientation(new ByteArrayInputStream(bArr));
    }

    private static boolean isSOFn(int i) {
        switch (i) {
            case 192:
            case 193:
            case Opcodes.MONITORENTER /*194*/:
            case Opcodes.MONITOREXIT /*195*/:
            case 197:
            case 198:
            case 199:
            case 201:
            case 202:
            case 203:
            case 205:
            case 206:
            case 207:
                return true;
            default:
                return false;
        }
    }

    private static int moveToAPP1EXIF(InputStream inputStream) {
        if (moveToMarker(inputStream, 225)) {
            int readPackedInt = StreamProcessor.readPackedInt(inputStream, 2, false) - 2;
            if (readPackedInt > 6) {
                int readPackedInt2 = StreamProcessor.readPackedInt(inputStream, 4, false);
                readPackedInt -= 4;
                int readPackedInt3 = StreamProcessor.readPackedInt(inputStream, 2, false);
                readPackedInt -= 2;
                if (readPackedInt2 == APP1_EXIF_MAGIC && readPackedInt3 == 0) {
                    return readPackedInt;
                }
            }
        }
        return 0;
    }

    public static boolean moveToMarker(InputStream inputStream, int i) {
        Preconditions.checkNotNull(inputStream);
        while (StreamProcessor.readPackedInt(inputStream, 1, false) == 255) {
            int i2 = 255;
            while (i2 == 255) {
                i2 = StreamProcessor.readPackedInt(inputStream, 1, false);
            }
            if ((i == 192 && isSOFn(i2)) || i2 == i) {
                return true;
            }
            if (!(i2 == MARKER_SOI || i2 == 1)) {
                if (i2 == MARKER_EOI || i2 == MARKER_SOS) {
                    return false;
                }
                inputStream.skip((long) (StreamProcessor.readPackedInt(inputStream, 2, false) - 2));
            }
        }
        return false;
    }
}
