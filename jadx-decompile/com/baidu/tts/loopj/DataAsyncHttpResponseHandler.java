package com.baidu.tts.loopj;

import android.os.Message;
import com.fimi.soul.media.player.FimiMediaMeta;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.util.ByteArrayBuffer;

public abstract class DataAsyncHttpResponseHandler extends AsyncHttpResponseHandler {
    private static final String LOG_TAG = "DataAsyncHttpRH";
    protected static final int PROGRESS_DATA_MESSAGE = 7;

    public static byte[] copyOfRange(byte[] bArr, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        int length = bArr.length;
        if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = i2 - i;
        length = Math.min(i3, length - i);
        Object obj = new byte[i3];
        System.arraycopy(bArr, i, obj, 0, length);
        return obj;
    }

    byte[] getResponseData(HttpEntity httpEntity) {
        byte[] bArr = null;
        if (httpEntity != null) {
            InputStream content = httpEntity.getContent();
            if (content != null) {
                long contentLength = httpEntity.getContentLength();
                if (contentLength > 2147483647L) {
                    throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
                }
                if (contentLength < 0) {
                    contentLength = FimiMediaMeta.AV_CH_TOP_FRONT_LEFT;
                }
                try {
                    ByteArrayBuffer byteArrayBuffer = new ByteArrayBuffer((int) contentLength);
                    byte[] bArr2 = new byte[4096];
                    while (true) {
                        int read = content.read(bArr2);
                        if (read == -1 || Thread.currentThread().isInterrupted()) {
                            break;
                        }
                        byteArrayBuffer.append(bArr2, 0, read);
                        sendProgressDataMessage(copyOfRange(bArr2, 0, read));
                        sendProgressMessage((long) 0, contentLength);
                    }
                    AsyncHttpClient.silentCloseInputStream(content);
                    bArr = byteArrayBuffer.toByteArray();
                } catch (OutOfMemoryError e) {
                    System.gc();
                    throw new IOException("File too large to fit into available memory");
                } catch (Throwable th) {
                    AsyncHttpClient.silentCloseInputStream(content);
                }
            }
        }
        return bArr;
    }

    protected void handleMessage(Message message) {
        super.handleMessage(message);
        switch (message.what) {
            case 7:
                Object[] objArr = (Object[]) message.obj;
                if (objArr == null || objArr.length < 1) {
                    AsyncHttpClient.log.e(LOG_TAG, "PROGRESS_DATA_MESSAGE didn't got enough params");
                    return;
                }
                try {
                    onProgressData((byte[]) objArr[0]);
                    return;
                } catch (Throwable th) {
                    AsyncHttpClient.log.e(LOG_TAG, "custom onProgressData contains an error", th);
                    return;
                }
            default:
                return;
        }
    }

    public void onProgressData(byte[] bArr) {
        AsyncHttpClient.log.d(LOG_TAG, "onProgressData(byte[]) was not overriden, but callback was received");
    }

    public final void sendProgressDataMessage(byte[] bArr) {
        sendMessage(obtainMessage(7, new Object[]{bArr}));
    }
}
