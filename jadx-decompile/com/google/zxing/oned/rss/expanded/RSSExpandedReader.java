package com.google.zxing.oned.rss.expanded;

import com.facebook.imageutils.JfifUtil;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.OneDReader;
import com.google.zxing.oned.rss.AbstractRSSReader;
import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;
import com.google.zxing.oned.rss.RSSUtils;
import com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder;
import it.a.a.e;
import java.util.Hashtable;
import java.util.Vector;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
import org.codehaus.jackson.smile.SmileConstants;

public final class RSSExpandedReader extends AbstractRSSReader {
    private static final int[] EVEN_TOTAL_SUBSET = new int[]{4, 20, 52, 104, 204};
    private static final int[][] FINDER_PATTERNS = new int[][]{new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};
    private static final int[][] FINDER_PATTERN_SEQUENCES = new int[][]{new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};
    private static final int FINDER_PAT_A = 0;
    private static final int FINDER_PAT_B = 1;
    private static final int FINDER_PAT_C = 2;
    private static final int FINDER_PAT_D = 3;
    private static final int FINDER_PAT_E = 4;
    private static final int FINDER_PAT_F = 5;
    private static final int[] GSUM = new int[]{0, 348, 1388, 2948, 3988};
    private static final int LONGEST_SEQUENCE_SIZE = FINDER_PATTERN_SEQUENCES[FINDER_PATTERN_SEQUENCES.length - 1].length;
    private static final int MAX_PAIRS = 11;
    private static final int[] SYMBOL_WIDEST = new int[]{7, 5, 4, 3, 1};
    private static final int[][] WEIGHTS = new int[][]{new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, Opcodes.GETFIELD, Opcodes.FNEG, Opcodes.D2L, 7, 21, 63}, new int[]{Opcodes.ANEWARRAY, 145, 13, 39, Opcodes.LNEG, Opcodes.F2L, 209, 205}, new int[]{193, Opcodes.IFGT, 49, 147, 19, 57, Opcodes.LOOKUPSWITCH, 91}, new int[]{62, Opcodes.INVOKEDYNAMIC, 136, 197, Opcodes.RET, 85, 44, 132}, new int[]{Opcodes.INVOKEINTERFACE, 133, Opcodes.NEWARRAY, Opcodes.D2I, 4, 12, 36, 108}, new int[]{113, 128, Opcodes.LRETURN, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, Opcodes.LSHR, Opcodes.IFLE, 52, Opcodes.IFGE}, new int[]{46, 138, 203, Opcodes.NEW, Opcodes.F2I, 206, SmileConstants.MIN_BUFFER_FOR_POSSIBLE_SHORT_STRING, Opcodes.IF_ACMPNE}, new int[]{76, 17, 51, 153, 37, 111, 122, Opcodes.IFLT}, new int[]{43, 129, 176, 106, 107, 110, Opcodes.DNEG, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, Opcodes.RETURN}, new int[]{109, Opcodes.INEG, 137, 200, Opcodes.GETSTATIC, 112, 125, Opcodes.IF_ICMPLE}, new int[]{70, 210, JfifUtil.MARKER_RST0, 202, Opcodes.INVOKESTATIC, 130, Opcodes.PUTSTATIC, Opcodes.DREM}, new int[]{134, Opcodes.ATHROW, 151, 31, 93, 68, 204, Opcodes.ARRAYLENGTH}, new int[]{148, 22, 66, 198, Opcodes.IRETURN, 94, 71, 2}, new int[]{6, 18, 54, Opcodes.IF_ICMPGE, 64, 192, Opcodes.IFNE, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, Opcodes.GOTO}, new int[]{79, 26, 78, 23, 69, 207, 199, Opcodes.DRETURN}, new int[]{103, 98, 83, 38, 114, 131, Opcodes.INVOKEVIRTUAL, 124}, new int[]{Opcodes.IF_ICMPLT, 61, Opcodes.INVOKESPECIAL, 127, 170, 88, 53, Opcodes.IF_ICMPEQ}, new int[]{55, Opcodes.IF_ACMPEQ, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, Opcodes.MONITORENTER, 160, 58, Opcodes.FRETURN, 100, 89}};
    private final int[] currentSequence = new int[LONGEST_SEQUENCE_SIZE];
    private final Vector pairs = new Vector(11);
    private final int[] startEnd = new int[2];

    private void adjustOddEvenCounts(int i) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4 = null;
        Object obj5 = 1;
        int count = AbstractRSSReader.count(this.oddCounts);
        int count2 = AbstractRSSReader.count(this.evenCounts);
        int i2 = (count + count2) - i;
        Object obj6 = (count & 1) == 1 ? 1 : null;
        Object obj7 = (count2 & 1) == 0 ? 1 : null;
        if (count > 13) {
            obj = 1;
            obj2 = null;
        } else if (count < 4) {
            obj = null;
            int i3 = 1;
        } else {
            obj = null;
            obj2 = null;
        }
        if (count2 > 13) {
            obj3 = null;
            obj4 = 1;
        } else if (count2 < 4) {
            int i4 = 1;
        } else {
            obj3 = null;
        }
        int i5;
        if (i2 == 1) {
            if (obj6 != null) {
                if (obj7 != null) {
                    throw NotFoundException.getNotFoundInstance();
                }
                obj = obj2;
                obj5 = obj3;
                obj3 = 1;
            } else if (obj7 == null) {
                throw NotFoundException.getNotFoundInstance();
            } else {
                i5 = 1;
                obj5 = obj3;
                obj3 = obj;
                obj = obj2;
            }
        } else if (i2 == -1) {
            if (obj6 != null) {
                if (obj7 != null) {
                    throw NotFoundException.getNotFoundInstance();
                }
                r12 = obj3;
                obj3 = obj;
                r3 = 1;
                obj5 = r12;
            } else if (obj7 == null) {
                throw NotFoundException.getNotFoundInstance();
            } else {
                obj3 = obj;
                obj = obj2;
            }
        } else if (i2 != 0) {
            throw NotFoundException.getNotFoundInstance();
        } else if (obj6 != null) {
            if (obj7 == null) {
                throw NotFoundException.getNotFoundInstance();
            } else if (count < count2) {
                i5 = 1;
                r12 = obj3;
                obj3 = obj;
                r3 = 1;
                obj5 = r12;
            } else {
                i4 = 1;
                obj = obj2;
            }
        } else if (obj7 != null) {
            throw NotFoundException.getNotFoundInstance();
        } else {
            obj5 = obj3;
            obj3 = obj;
            obj = obj2;
        }
        if (obj != null) {
            if (obj3 != null) {
                throw NotFoundException.getNotFoundInstance();
            }
            AbstractRSSReader.increment(this.oddCounts, this.oddRoundingErrors);
        }
        if (obj3 != null) {
            AbstractRSSReader.decrement(this.oddCounts, this.oddRoundingErrors);
        }
        if (obj5 != null) {
            if (obj4 != null) {
                throw NotFoundException.getNotFoundInstance();
            }
            AbstractRSSReader.increment(this.evenCounts, this.oddRoundingErrors);
        }
        if (obj4 != null) {
            AbstractRSSReader.decrement(this.evenCounts, this.evenRoundingErrors);
        }
    }

    private boolean checkChecksum() {
        ExpandedPair expandedPair = (ExpandedPair) this.pairs.elementAt(0);
        DataCharacter leftChar = expandedPair.getLeftChar();
        int i = 2;
        int checksumPortion = expandedPair.getRightChar().getChecksumPortion();
        for (int i2 = 1; i2 < this.pairs.size(); i2++) {
            expandedPair = (ExpandedPair) this.pairs.elementAt(i2);
            checksumPortion += expandedPair.getLeftChar().getChecksumPortion();
            i++;
            if (expandedPair.getRightChar() != null) {
                checksumPortion += expandedPair.getRightChar().getChecksumPortion();
                i++;
            }
        }
        return (checksumPortion % e.v) + ((i + -4) * e.v) == leftChar.getValue();
    }

    private boolean checkPairSequence(Vector vector, FinderPattern finderPattern) {
        int size = vector.size() + 1;
        if (size > this.currentSequence.length) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i;
        for (i = 0; i < vector.size(); i++) {
            this.currentSequence[i] = ((ExpandedPair) vector.elementAt(i)).getFinderPattern().getValue();
        }
        this.currentSequence[size - 1] = finderPattern.getValue();
        for (int[] iArr : FINDER_PATTERN_SEQUENCES) {
            if (iArr.length >= size) {
                boolean z;
                for (i = 0; i < size; i++) {
                    if (this.currentSequence[i] != iArr[i]) {
                        z = false;
                        break;
                    }
                }
                z = true;
                if (z) {
                    return size == iArr.length;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static Result constructResult(Vector vector) {
        String parseInformation = AbstractExpandedDecoder.createDecoder(BitArrayBuilder.buildBitArray(vector)).parseInformation();
        ResultPoint[] resultPoints = ((ExpandedPair) vector.elementAt(0)).getFinderPattern().getResultPoints();
        ResultPoint[] resultPoints2 = ((ExpandedPair) vector.lastElement()).getFinderPattern().getResultPoints();
        return new Result(parseInformation, null, new ResultPoint[]{resultPoints[0], resultPoints[1], resultPoints2[0], resultPoints2[1]}, BarcodeFormat.RSS_EXPANDED);
    }

    private void findNextPair(BitArray bitArray, Vector vector, int i) {
        int[] iArr = this.decodeFinderCounters;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        int size = bitArray.getSize();
        if (i < 0) {
            i = vector.isEmpty() ? 0 : ((ExpandedPair) vector.lastElement()).getFinderPattern().getStartEnd()[1];
        }
        Object obj = vector.size() % 2 != 0 ? 1 : null;
        int i2 = 0;
        int i3 = i;
        while (i3 < size) {
            i2 = !bitArray.get(i3) ? 1 : 0;
            if (i2 == 0) {
                break;
            }
            i3++;
        }
        int i4 = i3;
        i3 = 0;
        int i5 = i2;
        i2 = i4;
        for (int i6 = i3; i6 < size; i6++) {
            if ((bitArray.get(i6) ^ i5) != 0) {
                iArr[i3] = iArr[i3] + 1;
            } else {
                if (i3 == 3) {
                    if (obj != null) {
                        reverseCounters(iArr);
                    }
                    if (AbstractRSSReader.isFinderPattern(iArr)) {
                        this.startEnd[0] = i2;
                        this.startEnd[1] = i6;
                        return;
                    }
                    if (obj != null) {
                        reverseCounters(iArr);
                    }
                    i2 += iArr[0] + iArr[1];
                    iArr[0] = iArr[2];
                    iArr[1] = iArr[3];
                    iArr[2] = 0;
                    iArr[3] = 0;
                    i3--;
                } else {
                    i3++;
                }
                iArr[i3] = 1;
                i5 = i5 == 0 ? 1 : 0;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int getNextSecondBar(BitArray bitArray, int i) {
        boolean z = bitArray.get(i);
        while (i < bitArray.size && bitArray.get(i) == z) {
            i++;
        }
        z = !z;
        while (i < bitArray.size && bitArray.get(i) == r0) {
            i++;
        }
        return i;
    }

    private static boolean isNotA1left(FinderPattern finderPattern, boolean z, boolean z2) {
        return (finderPattern.getValue() == 0 && z && z2) ? false : true;
    }

    private FinderPattern parseFoundFinderPattern(BitArray bitArray, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (z) {
            i2 = this.startEnd[0] - 1;
            while (i2 >= 0 && !bitArray.get(i2)) {
                i2--;
            }
            i3 = i2 + 1;
            i2 = this.startEnd[0] - i3;
            i4 = this.startEnd[1];
        } else {
            i3 = this.startEnd[0];
            i2 = this.startEnd[1] + 1;
            while (bitArray.get(i2) && i2 < bitArray.size) {
                i2++;
            }
            i4 = i2;
            i2 -= this.startEnd[1];
        }
        int[] iArr = this.decodeFinderCounters;
        for (int length = iArr.length - 1; length > 0; length--) {
            iArr[length] = iArr[length - 1];
        }
        iArr[0] = i2;
        try {
            return new FinderPattern(AbstractRSSReader.parseFinderValue(iArr, FINDER_PATTERNS), new int[]{i3, i4}, i3, i4, i);
        } catch (NotFoundException e) {
            return null;
        }
    }

    private static void reverseCounters(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(length - i) - 1];
            iArr[(length - i) - 1] = i2;
        }
    }

    DataCharacter decodeDataCharacter(BitArray bitArray, FinderPattern finderPattern, boolean z, boolean z2) {
        int i;
        int length;
        int i2;
        int length2;
        int[] iArr = this.dataCharacterCounters;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
        if (z2) {
            OneDReader.recordPatternInReverse(bitArray, finderPattern.getStartEnd()[0], iArr);
        } else {
            OneDReader.recordPattern(bitArray, finderPattern.getStartEnd()[1] + 1, iArr);
            i = 0;
            for (length = iArr.length - 1; i < length; length--) {
                i2 = iArr[i];
                iArr[i] = iArr[length];
                iArr[length] = i2;
                i++;
            }
        }
        float count = ((float) AbstractRSSReader.count(iArr)) / ((float) 17);
        int[] iArr2 = this.oddCounts;
        int[] iArr3 = this.evenCounts;
        float[] fArr = this.oddRoundingErrors;
        float[] fArr2 = this.evenRoundingErrors;
        for (length = 0; length < iArr.length; length++) {
            float f = (1.0f * ((float) iArr[length])) / count;
            i = (int) (0.5f + f);
            if (i < 1) {
                i = 1;
            } else if (i > 8) {
                i = 8;
            }
            int i3 = length >> 1;
            if ((length & 1) == 0) {
                iArr2[i3] = i;
                fArr[i3] = f - ((float) i);
            } else {
                iArr3[i3] = i;
                fArr2[i3] = f - ((float) i);
            }
        }
        adjustOddEvenCounts(17);
        int value = ((z2 ? 0 : 1) + ((finderPattern.getValue() * 4) + (z ? 0 : 2))) - 1;
        int i4 = 0;
        i = iArr2.length - 1;
        length = 0;
        while (i >= 0) {
            if (isNotA1left(finderPattern, z, z2)) {
                length += WEIGHTS[value][i * 2] * iArr2[i];
            }
            i--;
            i4 = iArr2[i] + i4;
        }
        i = 0;
        i2 = 0;
        for (length2 = iArr3.length - 1; length2 >= 0; length2--) {
            if (isNotA1left(finderPattern, z, z2)) {
                i += WEIGHTS[value][(length2 * 2) + 1] * iArr3[length2];
            }
            i2 += iArr3[length2];
        }
        length += i;
        if ((i4 & 1) != 0 || i4 > 13 || i4 < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        i = (13 - i4) / 2;
        length2 = SYMBOL_WIDEST[i];
        return new DataCharacter(GSUM[i] + ((RSSUtils.getRSSvalue(iArr2, length2, true) * EVEN_TOTAL_SUBSET[i]) + RSSUtils.getRSSvalue(iArr3, 9 - length2, false)), length);
    }

    public Result decodeRow(int i, BitArray bitArray, Hashtable hashtable) {
        reset();
        decodeRow2pairs(i, bitArray);
        return constructResult(this.pairs);
    }

    Vector decodeRow2pairs(int i, BitArray bitArray) {
        while (true) {
            ExpandedPair retrieveNextPair = retrieveNextPair(bitArray, this.pairs, i);
            this.pairs.addElement(retrieveNextPair);
            if (retrieveNextPair.mayBeLast()) {
                if (checkChecksum()) {
                    return this.pairs;
                }
                if (retrieveNextPair.mustBeLast()) {
                    throw NotFoundException.getNotFoundInstance();
                }
            }
        }
    }

    public void reset() {
        this.pairs.setSize(0);
    }

    ExpandedPair retrieveNextPair(BitArray bitArray, Vector vector, int i) {
        FinderPattern parseFoundFinderPattern;
        DataCharacter decodeDataCharacter;
        boolean z = vector.size() % 2 == 0;
        int i2 = -1;
        boolean z2 = true;
        do {
            findNextPair(bitArray, vector, i2);
            parseFoundFinderPattern = parseFoundFinderPattern(bitArray, i, z);
            if (parseFoundFinderPattern == null) {
                i2 = getNextSecondBar(bitArray, this.startEnd[0]);
                continue;
            } else {
                z2 = false;
                continue;
            }
        } while (z2);
        boolean checkPairSequence = checkPairSequence(vector, parseFoundFinderPattern);
        DataCharacter decodeDataCharacter2 = decodeDataCharacter(bitArray, parseFoundFinderPattern, z, true);
        try {
            decodeDataCharacter = decodeDataCharacter(bitArray, parseFoundFinderPattern, z, false);
        } catch (NotFoundException e) {
            if (checkPairSequence) {
                decodeDataCharacter = null;
            } else {
                throw e;
            }
        }
        return new ExpandedPair(decodeDataCharacter2, decodeDataCharacter, parseFoundFinderPattern, checkPairSequence);
    }
}
