package com.loopj.android.http;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.util.EntityUtils;

public class AsyncHttpResponseHandler {
    protected static final int FAILURE_MESSAGE = 1;
    protected static final int FINISH_MESSAGE = 3;
    protected static final int START_MESSAGE = 2;
    protected static final int SUCCESS_MESSAGE = 0;
    private Handler handler;

    public AsyncHttpResponseHandler() {
        if (Looper.myLooper() != null) {
            this.handler = new Handler() {
                public void handleMessage(Message message) {
                    AsyncHttpResponseHandler.this.handleMessage(message);
                }
            };
        }
    }

    protected void handleFailureMessage(Throwable th, String str) {
        onFailure(th, str);
    }

    protected void handleMessage(Message message) {
        Object[] objArr;
        switch (message.what) {
            case 0:
                objArr = (Object[]) message.obj;
                handleSuccessMessage(((Integer) objArr[0]).intValue(), (String) objArr[1]);
                return;
            case 1:
                objArr = (Object[]) message.obj;
                handleFailureMessage((Throwable) objArr[0], (String) objArr[1]);
                return;
            case 2:
                onStart();
                return;
            case 3:
                onFinish();
                return;
            default:
                return;
        }
    }

    protected void handleSuccessMessage(int i, String str) {
        onSuccess(i, str);
    }

    protected Message obtainMessage(int i, Object obj) {
        if (this.handler != null) {
            return this.handler.obtainMessage(i, obj);
        }
        Message message = new Message();
        message.what = i;
        message.obj = obj;
        return message;
    }

    public void onFailure(Throwable th) {
    }

    public void onFailure(Throwable th, String str) {
        onFailure(th);
    }

    public void onFinish() {
    }

    public void onStart() {
    }

    public void onSuccess(int i, String str) {
        onSuccess(str);
    }

    public void onSuccess(String str) {
    }

    protected void sendFailureMessage(Throwable th, String str) {
        sendMessage(obtainMessage(1, new Object[]{th, str}));
    }

    protected void sendFailureMessage(Throwable th, byte[] bArr) {
        sendMessage(obtainMessage(1, new Object[]{th, bArr}));
    }

    protected void sendFinishMessage() {
        sendMessage(obtainMessage(3, null));
    }

    protected void sendMessage(Message message) {
        if (this.handler != null) {
            this.handler.sendMessage(message);
        } else {
            handleMessage(message);
        }
    }

    void sendResponseMessage(HttpResponse httpResponse) {
        String str = null;
        StatusLine statusLine = httpResponse.getStatusLine();
        try {
            HttpEntity entity = httpResponse.getEntity();
            if (entity != null) {
                str = EntityUtils.toString(new BufferedHttpEntity(entity), "UTF-8");
            }
        } catch (Throwable e) {
            sendFailureMessage(e, null);
        }
        if (statusLine.getStatusCode() >= 300) {
            sendFailureMessage(new HttpResponseException(statusLine.getStatusCode(), statusLine.getReasonPhrase()), str);
        } else {
            sendSuccessMessage(statusLine.getStatusCode(), str);
        }
    }

    protected void sendStartMessage() {
        sendMessage(obtainMessage(2, null));
    }

    protected void sendSuccessMessage(int i, String str) {
        sendMessage(obtainMessage(0, new Object[]{new Integer(i), str}));
    }
}
