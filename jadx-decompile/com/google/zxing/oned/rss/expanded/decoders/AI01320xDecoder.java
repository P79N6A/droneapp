package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;

final class AI01320xDecoder extends AI013x0xDecoder {
    AI01320xDecoder(BitArray bitArray) {
        super(bitArray);
    }

    protected void addWeightCode(StringBuffer stringBuffer, int i) {
        if (i < 10000) {
            stringBuffer.append("(3202)");
        } else {
            stringBuffer.append("(3203)");
        }
    }

    protected int checkWeight(int i) {
        return i < 10000 ? i : i - 10000;
    }
}
