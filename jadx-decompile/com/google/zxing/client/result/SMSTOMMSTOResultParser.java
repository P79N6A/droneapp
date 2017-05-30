package com.google.zxing.client.result;

import com.google.zxing.Result;

final class SMSTOMMSTOResultParser extends ResultParser {
    private SMSTOMMSTOResultParser() {
    }

    public static SMSParsedResult parse(Result result) {
        String text = result.getText();
        if (text == null) {
            return null;
        }
        if (!text.startsWith("smsto:") && !text.startsWith("SMSTO:") && !text.startsWith("mmsto:") && !text.startsWith("MMSTO:")) {
            return null;
        }
        String substring = text.substring(6);
        int indexOf = substring.indexOf(58);
        if (indexOf >= 0) {
            text = substring.substring(indexOf + 1);
            substring = substring.substring(0, indexOf);
        } else {
            text = null;
        }
        return new SMSParsedResult(substring, null, null, text);
    }
}
