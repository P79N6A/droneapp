package com.baidu.speechsynthesizer.utility;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;

public class SpeechDecoder {
    static {
        try {
            LoggerProxy.d("SpeechDecoder", "before load gnustl_shared");
            System.loadLibrary("gnustl_shared");
        } catch (Throwable th) {
            LoggerProxy.e("SpeechDecoder", "so file gnustl_shared load fail");
        }
        try {
            LoggerProxy.d("SpeechDecoder", "before load BDSpeechDecoder_V1");
            System.loadLibrary("BDSpeechDecoder_V1");
            LoggerProxy.d("SpeechDecoder", "after load BDSpeechDecoder_V1");
        } catch (Throwable th2) {
            LoggerProxy.e("SpeechDecoder", "so file BDSpeechDecoder_V1 load fail");
        }
    }

    public native int decode(byte[] bArr, int i, short[] sArr, int[] iArr, int i2, int i3);
}
