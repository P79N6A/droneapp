package com.baidu.tts.auth;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.auth.c.a;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.f.m;
import com.baidu.tts.f.n;
import com.baidu.tts.h.a.c;

public class AuthInfo {
    private m a;
    private a b;
    private b.a c;
    private TtsError d;

    public int getLeftValidDays() {
        return this.c.a();
    }

    public TtsError getMixTtsError() {
        TtsError onlineTtsError = getOnlineTtsError();
        TtsError offlineTtsError = getOfflineTtsError();
        TtsError ttsError = null;
        if (onlineTtsError != null && offlineTtsError != null) {
            ttsError = c.a().b(n.MIX_ENGINE_AUTH_FAILURE);
        } else if (onlineTtsError == null && offlineTtsError != null) {
            ttsError = c.a().b(n.OFFLINE_ENGINE_AUTH_FAILURE);
        } else if (onlineTtsError != null && offlineTtsError == null) {
            ttsError = c.a().b(n.ONLINE_ENGINE_AUTH_FAILURE);
        }
        return ttsError != null ? ttsError : this.d;
    }

    public String getNotifyMessage() {
        return this.c.c();
    }

    public b.a getOfflineResult() {
        return this.c;
    }

    public TtsError getOfflineTtsError() {
        return this.c != null ? this.c.b() : this.d;
    }

    public a getOnlineResult() {
        return this.b;
    }

    public TtsError getOnlineTtsError() {
        return this.b != null ? this.b.b() : this.d;
    }

    public m getTtsEnum() {
        return this.a;
    }

    public TtsError getTtsError() {
        if (this.d != null) {
            return this.d;
        }
        switch (this.a) {
            case ONLINE:
                return this.b.b();
            case OFFLINE:
                return this.c.b();
            case MIX:
                return getMixTtsError();
            default:
                return null;
        }
    }

    public boolean isMixSuccess() {
        return isOnlineSuccess() || isOfflineSuccess();
    }

    public boolean isOfflineSuccess() {
        return this.c != null ? this.c.g() : false;
    }

    public boolean isOnlineSuccess() {
        return this.b != null ? this.b.g() : false;
    }

    public boolean isSuccess() {
        if (this.d != null) {
            LoggerProxy.d("AuthInfo", "cause=" + this.d.getThrowable().getMessage());
            return false;
        } else if (this.a == null) {
            return false;
        } else {
            switch (this.a) {
                case ONLINE:
                    return isOnlineSuccess();
                case OFFLINE:
                    return isOfflineSuccess();
                case MIX:
                    return isMixSuccess();
                default:
                    return false;
            }
        }
    }

    public void setOfflineResult(b.a aVar) {
        this.c = aVar;
    }

    public void setOnlineResult(a aVar) {
        this.b = aVar;
    }

    public void setTtsEnum(m mVar) {
        this.a = mVar;
    }

    public void setTtsError(TtsError ttsError) {
        this.d = ttsError;
    }
}
