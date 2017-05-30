package com.tencent.connect.common;

import android.os.Handler;
import android.os.Message;
import com.tencent.open.utils.Global;
import com.tencent.open.utils.HttpUtils.HttpStatusException;
import com.tencent.open.utils.HttpUtils.NetworkUnavailableException;
import com.tencent.tauth.IRequestListener;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public class BaseApi$TempRequestListener implements IRequestListener {
    private final Handler mHandler;
    private final IUiListener mListener;
    final /* synthetic */ BaseApi this$0;

    public BaseApi$TempRequestListener(final BaseApi baseApi, IUiListener iUiListener) {
        this.this$0 = baseApi;
        this.mListener = iUiListener;
        this.mHandler = new Handler(Global.getContext().getMainLooper()) {
            public void handleMessage(Message message) {
                if (message.what == 0) {
                    BaseApi$TempRequestListener.this.mListener.onComplete(message.obj);
                } else {
                    BaseApi$TempRequestListener.this.mListener.onError(new UiError(message.what, (String) message.obj, null));
                }
            }
        };
    }

    public void onComplete(JSONObject jSONObject) {
        Message obtainMessage = this.mHandler.obtainMessage();
        obtainMessage.obj = jSONObject;
        obtainMessage.what = 0;
        this.mHandler.sendMessage(obtainMessage);
    }

    public void onConnectTimeoutException(ConnectTimeoutException connectTimeoutException) {
        Message obtainMessage = this.mHandler.obtainMessage();
        obtainMessage.obj = connectTimeoutException.getMessage();
        obtainMessage.what = -7;
        this.mHandler.sendMessage(obtainMessage);
    }

    public void onHttpStatusException(HttpStatusException httpStatusException) {
        Message obtainMessage = this.mHandler.obtainMessage();
        obtainMessage.obj = httpStatusException.getMessage();
        obtainMessage.what = -9;
        this.mHandler.sendMessage(obtainMessage);
    }

    public void onIOException(IOException iOException) {
        Message obtainMessage = this.mHandler.obtainMessage();
        obtainMessage.obj = iOException.getMessage();
        obtainMessage.what = -2;
        this.mHandler.sendMessage(obtainMessage);
    }

    public void onJSONException(JSONException jSONException) {
        Message obtainMessage = this.mHandler.obtainMessage();
        obtainMessage.obj = jSONException.getMessage();
        obtainMessage.what = -4;
        this.mHandler.sendMessage(obtainMessage);
    }

    public void onMalformedURLException(MalformedURLException malformedURLException) {
        Message obtainMessage = this.mHandler.obtainMessage();
        obtainMessage.obj = malformedURLException.getMessage();
        obtainMessage.what = -3;
        this.mHandler.sendMessage(obtainMessage);
    }

    public void onNetworkUnavailableException(NetworkUnavailableException networkUnavailableException) {
        Message obtainMessage = this.mHandler.obtainMessage();
        obtainMessage.obj = networkUnavailableException.getMessage();
        obtainMessage.what = -10;
        this.mHandler.sendMessage(obtainMessage);
    }

    public void onSocketTimeoutException(SocketTimeoutException socketTimeoutException) {
        Message obtainMessage = this.mHandler.obtainMessage();
        obtainMessage.obj = socketTimeoutException.getMessage();
        obtainMessage.what = -8;
        this.mHandler.sendMessage(obtainMessage);
    }

    public void onUnknowException(Exception exception) {
        Message obtainMessage = this.mHandler.obtainMessage();
        obtainMessage.obj = exception.getMessage();
        obtainMessage.what = -6;
        this.mHandler.sendMessage(obtainMessage);
    }
}
