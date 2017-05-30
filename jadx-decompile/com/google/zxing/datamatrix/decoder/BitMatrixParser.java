package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;

final class BitMatrixParser {
    private final BitMatrix mappingBitMatrix;
    private final BitMatrix readMappingMatrix;
    private final Version version;

    BitMatrixParser(BitMatrix bitMatrix) {
        int height = bitMatrix.getHeight();
        if (height < 10 || height > 144 || (height & 1) != 0) {
            throw FormatException.getFormatInstance();
        }
        this.version = readVersion(bitMatrix);
        this.mappingBitMatrix = extractDataRegion(bitMatrix);
        this.readMappingMatrix = new BitMatrix(this.mappingBitMatrix.getHeight());
    }

    BitMatrix extractDataRegion(BitMatrix bitMatrix) {
        int symbolSizeRows = this.version.getSymbolSizeRows();
        int symbolSizeColumns = this.version.getSymbolSizeColumns();
        if (bitMatrix.getHeight() != symbolSizeRows) {
            throw new IllegalArgumentException("Dimension of bitMarix must match the version size");
        }
        int dataRegionSizeRows = this.version.getDataRegionSizeRows();
        int dataRegionSizeColumns = this.version.getDataRegionSizeColumns();
        int i = symbolSizeRows / dataRegionSizeRows;
        int i2 = symbolSizeColumns / dataRegionSizeColumns;
        BitMatrix bitMatrix2 = new BitMatrix(i * dataRegionSizeRows);
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i3 * dataRegionSizeRows;
            for (int i5 = 0; i5 < i2; i5++) {
                int i6 = i5 * dataRegionSizeColumns;
                for (symbolSizeColumns = 0; symbolSizeColumns < dataRegionSizeRows; symbolSizeColumns++) {
                    int i7 = (((dataRegionSizeRows + 2) * i3) + 1) + symbolSizeColumns;
                    int i8 = i4 + symbolSizeColumns;
                    for (symbolSizeRows = 0; symbolSizeRows < dataRegionSizeColumns; symbolSizeRows++) {
                        if (bitMatrix.get((((dataRegionSizeColumns + 2) * i5) + 1) + symbolSizeRows, i7)) {
                            bitMatrix2.set(i6 + symbolSizeRows, i8);
                        }
                    }
                }
            }
        }
        return bitMatrix2;
    }

    byte[] readCodewords() {
        Object obj = null;
        byte[] bArr = new byte[this.version.getTotalCodewords()];
        int height = this.mappingBitMatrix.getHeight();
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        int i = 0;
        int i2 = 4;
        int i3 = 0;
        while (true) {
            int i4;
            if (i2 == height && i == 0 && r4 == null) {
                i4 = i3 + 1;
                bArr[i3] = (byte) readCorner1(height, height);
                int i5 = i + 2;
                i = i4;
                i4 = i2 - 2;
                i2 = i5;
                obj4 = 1;
            } else if (i2 == height - 2 && i == 0 && (height & 3) != 0 && r3 == null) {
                i4 = i3 + 1;
                bArr[i3] = (byte) readCorner2(height, height);
                int i6 = i + 2;
                i = i4;
                i4 = i2 - 2;
                i2 = i6;
                i6 = 1;
            } else if (i2 == height + 4 && i == 2 && (height & 7) == 0 && r2 == null) {
                i4 = i3 + 1;
                bArr[i3] = (byte) readCorner3(height, height);
                int i7 = i + 2;
                i = i4;
                i4 = i2 - 2;
                i2 = i7;
                i7 = 1;
            } else if (i2 == height - 2 && i == 0 && (height & 7) == 4 && r0 == null) {
                i4 = i3 + 1;
                bArr[i3] = (byte) readCorner4(height, height);
                int i8 = i + 2;
                i = i4;
                i4 = i2 - 2;
                i2 = i8;
                i8 = 1;
            } else {
                i4 = i;
                int i9 = i2;
                i2 = i3;
                i3 = i9;
                while (true) {
                    if (i3 >= height || i4 < 0 || this.readMappingMatrix.get(i4, i3)) {
                        i = i2;
                    } else {
                        i = i2 + 1;
                        bArr[i2] = (byte) readUtah(i3, i4, height, height);
                    }
                    i3 -= 2;
                    i2 = i4 + 2;
                    if (i3 < 0 || i2 >= height) {
                        i3++;
                        i4 = i2 + 3;
                        i2 = i;
                    } else {
                        i4 = i2;
                        i2 = i;
                    }
                }
                i3++;
                i4 = i2 + 3;
                i2 = i;
                while (true) {
                    if (i3 < 0 || i4 >= height || this.readMappingMatrix.get(i4, i3)) {
                        i = i2;
                    } else {
                        i = i2 + 1;
                        bArr[i2] = (byte) readUtah(i3, i4, height, height);
                    }
                    i3 += 2;
                    i2 = i4 - 2;
                    if (i3 >= height || i2 < 0) {
                        i4 = i3 + 3;
                        i2++;
                    } else {
                        i4 = i2;
                        i2 = i;
                    }
                }
                i4 = i3 + 3;
                i2++;
            }
            if (i4 >= height && i2 >= height) {
                break;
            }
            i3 = i;
            i = i2;
            i2 = i4;
        }
        if (i == this.version.getTotalCodewords()) {
            return bArr;
        }
        throw FormatException.getFormatInstance();
    }

    int readCorner1(int i, int i2) {
        int i3 = (readModule(i + -1, 0, i, i2) ? 1 : 0) << 1;
        if (readModule(i - 1, 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (readModule(i - 1, 2, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (readModule(0, i2 - 2, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (readModule(0, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (readModule(1, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (readModule(2, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        return readModule(3, i2 + -1, i, i2) ? i3 | 1 : i3;
    }

    int readCorner2(int i, int i2) {
        int i3 = (readModule(i + -3, 0, i, i2) ? 1 : 0) << 1;
        if (readModule(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (readModule(i - 1, 0, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (readModule(0, i2 - 4, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (readModule(0, i2 - 3, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (readModule(0, i2 - 2, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (readModule(0, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        return readModule(1, i2 + -1, i, i2) ? i3 | 1 : i3;
    }

    int readCorner3(int i, int i2) {
        int i3 = (readModule(i + -1, 0, i, i2) ? 1 : 0) << 1;
        if (readModule(i - 1, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (readModule(0, i2 - 3, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (readModule(0, i2 - 2, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (readModule(0, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (readModule(1, i2 - 3, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (readModule(1, i2 - 2, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        return readModule(1, i2 + -1, i, i2) ? i3 | 1 : i3;
    }

    int readCorner4(int i, int i2) {
        int i3 = (readModule(i + -3, 0, i, i2) ? 1 : 0) << 1;
        if (readModule(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (readModule(i - 1, 0, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (readModule(0, i2 - 2, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (readModule(0, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (readModule(1, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (readModule(2, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        return readModule(3, i2 + -1, i, i2) ? i3 | 1 : i3;
    }

    boolean readModule(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (i < 0) {
            i5 = i + i3;
            i6 = (4 - ((i3 + 4) & 7)) + i2;
        } else {
            i6 = i2;
            i5 = i;
        }
        if (i6 < 0) {
            i6 += i4;
            i5 += 4 - ((i4 + 4) & 7);
        }
        this.readMappingMatrix.set(i6, i5);
        return this.mappingBitMatrix.get(i6, i5);
    }

    int readUtah(int i, int i2, int i3, int i4) {
        int i5 = 0;
        if (readModule(i - 2, i2 - 2, i3, i4)) {
            i5 = 1;
        }
        i5 <<= 1;
        if (readModule(i - 2, i2 - 1, i3, i4)) {
            i5 |= 1;
        }
        i5 <<= 1;
        if (readModule(i - 1, i2 - 2, i3, i4)) {
            i5 |= 1;
        }
        i5 <<= 1;
        if (readModule(i - 1, i2 - 1, i3, i4)) {
            i5 |= 1;
        }
        i5 <<= 1;
        if (readModule(i - 1, i2, i3, i4)) {
            i5 |= 1;
        }
        i5 <<= 1;
        if (readModule(i, i2 - 2, i3, i4)) {
            i5 |= 1;
        }
        i5 <<= 1;
        if (readModule(i, i2 - 1, i3, i4)) {
            i5 |= 1;
        }
        i5 <<= 1;
        return readModule(i, i2, i3, i4) ? i5 | 1 : i5;
    }

    Version readVersion(BitMatrix bitMatrix) {
        if (this.version != null) {
            return this.version;
        }
        int height = bitMatrix.getHeight();
        return Version.getVersionForDimensions(height, height);
    }
}
