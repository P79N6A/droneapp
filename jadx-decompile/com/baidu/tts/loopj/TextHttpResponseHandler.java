package com.baidu.tts.loopj;

import org.apache.http.Header;

public abstract class TextHttpResponseHandler extends AsyncHttpResponseHandler {
    private static final String LOG_TAG = "TextHttpRH";

    public TextHttpResponseHandler() {
        this("UTF-8");
    }

    public TextHttpResponseHandler(String str) {
        setCharset(str);
    }

    public static String getResponseString(byte[] bArr, String str) {
        String str2 = bArr == null ? null : new String(bArr, str);
        if (str2 != null) {
            try {
                if (str2.startsWith(AsyncHttpResponseHandler.UTF8_BOM)) {
                    return str2.substring(1);
                }
            } catch (Throwable e) {
                AsyncHttpClient.log.e(LOG_TAG, "Encoding response into string failed", e);
                return null;
            }
        }
        return str2;
    }

    public abstract void onFailure(int i, Header[] headerArr, String str, Throwable th);

    public void onFailure(int i, Header[] headerArr, byte[] bArr, Throwable th) {
        onFailure(i, headerArr, getResponseString(bArr, getCharset()), th);
    }

    public abstract void onSuccess(int i, Header[] headerArr, String str);

    public void onSuccess(int i, Header[] headerArr, byte[] bArr) {
        onSuccess(i, headerArr, getResponseString(bArr, getCharset()));
    }
}
