package com.baidu.tts.loopj;

import org.apache.http.Header;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonHttpResponseHandler extends TextHttpResponseHandler {
    private static final String LOG_TAG = "JsonHttpRH";
    private boolean useRFC5179CompatibilityMode = true;

    public JsonHttpResponseHandler() {
        super("UTF-8");
    }

    public JsonHttpResponseHandler(String str) {
        super(str);
    }

    public JsonHttpResponseHandler(String str, boolean z) {
        super(str);
        this.useRFC5179CompatibilityMode = z;
    }

    public JsonHttpResponseHandler(boolean z) {
        super("UTF-8");
        this.useRFC5179CompatibilityMode = z;
    }

    public boolean isUseRFC5179CompatibilityMode() {
        return this.useRFC5179CompatibilityMode;
    }

    public void onFailure(int i, Header[] headerArr, String str, Throwable th) {
        AsyncHttpClient.log.w(LOG_TAG, "onFailure(int, Header[], String, Throwable) was not overriden, but callback was received", th);
    }

    public void onFailure(int i, Header[] headerArr, Throwable th, JSONArray jSONArray) {
        AsyncHttpClient.log.w(LOG_TAG, "onFailure(int, Header[], Throwable, JSONArray) was not overriden, but callback was received", th);
    }

    public void onFailure(int i, Header[] headerArr, Throwable th, JSONObject jSONObject) {
        AsyncHttpClient.log.w(LOG_TAG, "onFailure(int, Header[], Throwable, JSONObject) was not overriden, but callback was received", th);
    }

    public final void onFailure(int i, Header[] headerArr, byte[] bArr, Throwable th) {
        if (bArr != null) {
            final byte[] bArr2 = bArr;
            final int i2 = i;
            final Header[] headerArr2 = headerArr;
            final Throwable th2 = th;
            Runnable anonymousClass2 = new Runnable() {
                public void run() {
                    try {
                        final Object parseResponse = JsonHttpResponseHandler.this.parseResponse(bArr2);
                        JsonHttpResponseHandler.this.postRunnable(new Runnable() {
                            public void run() {
                                if (!JsonHttpResponseHandler.this.useRFC5179CompatibilityMode && parseResponse == null) {
                                    JsonHttpResponseHandler.this.onFailure(i2, headerArr2, (String) null, th2);
                                } else if (parseResponse instanceof JSONObject) {
                                    JsonHttpResponseHandler.this.onFailure(i2, headerArr2, th2, (JSONObject) parseResponse);
                                } else if (parseResponse instanceof JSONArray) {
                                    JsonHttpResponseHandler.this.onFailure(i2, headerArr2, th2, (JSONArray) parseResponse);
                                } else if (parseResponse instanceof String) {
                                    JsonHttpResponseHandler.this.onFailure(i2, headerArr2, (String) parseResponse, th2);
                                } else {
                                    JsonHttpResponseHandler.this.onFailure(i2, headerArr2, new JSONException("Unexpected response type " + parseResponse.getClass().getName()), (JSONObject) null);
                                }
                            }
                        });
                    } catch (final JSONException e) {
                        JsonHttpResponseHandler.this.postRunnable(new Runnable() {
                            public void run() {
                                JsonHttpResponseHandler.this.onFailure(i2, headerArr2, e, (JSONObject) null);
                            }
                        });
                    }
                }
            };
            if (getUseSynchronousMode() || getUsePoolThread()) {
                anonymousClass2.run();
                return;
            } else {
                new Thread(anonymousClass2).start();
                return;
            }
        }
        AsyncHttpClient.log.v(LOG_TAG, "response body is null, calling onFailure(Throwable, JSONObject)");
        onFailure(i, headerArr, th, (JSONObject) null);
    }

    public void onSuccess(int i, Header[] headerArr, String str) {
        AsyncHttpClient.log.w(LOG_TAG, "onSuccess(int, Header[], String) was not overriden, but callback was received");
    }

    public void onSuccess(int i, Header[] headerArr, JSONArray jSONArray) {
        AsyncHttpClient.log.w(LOG_TAG, "onSuccess(int, Header[], JSONArray) was not overriden, but callback was received");
    }

    public void onSuccess(int i, Header[] headerArr, JSONObject jSONObject) {
        AsyncHttpClient.log.w(LOG_TAG, "onSuccess(int, Header[], JSONObject) was not overriden, but callback was received");
    }

    public final void onSuccess(final int i, final Header[] headerArr, final byte[] bArr) {
        if (i != 204) {
            Runnable anonymousClass1 = new Runnable() {
                public void run() {
                    try {
                        final Object parseResponse = JsonHttpResponseHandler.this.parseResponse(bArr);
                        JsonHttpResponseHandler.this.postRunnable(new Runnable() {
                            public void run() {
                                if (!JsonHttpResponseHandler.this.useRFC5179CompatibilityMode && parseResponse == null) {
                                    JsonHttpResponseHandler.this.onSuccess(i, headerArr, (String) null);
                                } else if (parseResponse instanceof JSONObject) {
                                    JsonHttpResponseHandler.this.onSuccess(i, headerArr, (JSONObject) parseResponse);
                                } else if (parseResponse instanceof JSONArray) {
                                    JsonHttpResponseHandler.this.onSuccess(i, headerArr, (JSONArray) parseResponse);
                                } else if (!(parseResponse instanceof String)) {
                                    JsonHttpResponseHandler.this.onFailure(i, headerArr, new JSONException("Unexpected response type " + parseResponse.getClass().getName()), (JSONObject) null);
                                } else if (JsonHttpResponseHandler.this.useRFC5179CompatibilityMode) {
                                    JsonHttpResponseHandler.this.onFailure(i, headerArr, (String) parseResponse, new JSONException("Response cannot be parsed as JSON data"));
                                } else {
                                    JsonHttpResponseHandler.this.onSuccess(i, headerArr, (String) parseResponse);
                                }
                            }
                        });
                    } catch (final JSONException e) {
                        JsonHttpResponseHandler.this.postRunnable(new Runnable() {
                            public void run() {
                                JsonHttpResponseHandler.this.onFailure(i, headerArr, e, (JSONObject) null);
                            }
                        });
                    }
                }
            };
            if (getUseSynchronousMode() || getUsePoolThread()) {
                anonymousClass1.run();
                return;
            } else {
                new Thread(anonymousClass1).start();
                return;
            }
        }
        onSuccess(i, headerArr, new JSONObject());
    }

    protected Object parseResponse(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        String str;
        Object nextValue;
        Object obj;
        String str2;
        String responseString = TextHttpResponseHandler.getResponseString(bArr, getCharset());
        if (responseString != null) {
            responseString = responseString.trim();
            if (this.useRFC5179CompatibilityMode) {
                if (responseString.startsWith("{") || responseString.startsWith("[")) {
                    str = responseString;
                    nextValue = new JSONTokener(responseString).nextValue();
                    obj = str;
                    return nextValue == null ? nextValue : obj;
                }
            } else if ((responseString.startsWith("{") && responseString.endsWith("}")) || (responseString.startsWith("[") && responseString.endsWith("]"))) {
                str = responseString;
                nextValue = new JSONTokener(responseString).nextValue();
                str2 = str;
                if (nextValue == null) {
                }
            } else if (responseString.startsWith("\"") && responseString.endsWith("\"")) {
                str = responseString;
                responseString = responseString.substring(1, responseString.length() - 1);
                str2 = str;
                if (nextValue == null) {
                }
            }
        }
        str = responseString;
        nextValue = null;
        str2 = str;
        if (nextValue == null) {
        }
    }

    public void setUseRFC5179CompatibilityMode(boolean z) {
        this.useRFC5179CompatibilityMode = z;
    }
}
