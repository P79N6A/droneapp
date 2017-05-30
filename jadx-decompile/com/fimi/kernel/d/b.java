package com.fimi.kernel.d;

import android.content.Context;
import android.media.AudioManager;
import android.os.Environment;
import com.baidu.tts.auth.AuthInfo;
import com.baidu.tts.client.SpeechError;
import com.baidu.tts.client.SpeechSynthesizer;
import com.baidu.tts.client.SpeechSynthesizerListener;
import com.baidu.tts.client.TtsMode;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class b implements SpeechSynthesizerListener {
    private static boolean a = false;
    private static final String d = "baiduTTS";
    private static final String e = "bd_etts_ch_speech_female.dat";
    private static final String f = "bd_etts_ch_text.dat";
    private static final String g = "temp_license";
    private static final String h = "bd_etts_speech_female_en.dat";
    private static final String i = "bd_etts_text_en.dat";
    private static boolean j = false;
    private static b k;
    private static Context l;
    private SpeechSynthesizer b;
    private String c;
    private boolean m;
    private AudioManager n;
    private int o;
    private int p;
    private boolean q;
    private a r;

    public interface a {
        void a(boolean z);
    }

    private b() {
        if (l != null) {
            this.n = (AudioManager) l.getSystemService("audio");
            this.o = this.n.getStreamVolume(3);
            this.p = this.n.getStreamMaxVolume(3);
        }
    }

    public static b a(Context context) {
        l = context;
        if (k == null) {
            synchronized (b.class) {
                if (k == null) {
                    k = new b();
                }
            }
        }
        return k;
    }

    private void a(boolean z, String str, String str2) {
        FileNotFoundException e;
        InputStream inputStream;
        IOException e2;
        Throwable th;
        FileOutputStream fileOutputStream = null;
        File file = new File(str2);
        if (z || !(z || file.exists())) {
            InputStream open;
            FileOutputStream fileOutputStream2;
            try {
                open = l.getResources().getAssets().open(str);
                try {
                    fileOutputStream2 = new FileOutputStream(str2);
                } catch (FileNotFoundException e3) {
                    e = e3;
                    fileOutputStream2 = null;
                    inputStream = open;
                    try {
                        e.printStackTrace();
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e22) {
                                e22.printStackTrace();
                            }
                        }
                        if (inputStream == null) {
                            try {
                                inputStream.close();
                            } catch (IOException e222) {
                                e222.printStackTrace();
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        open = inputStream;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        if (open != null) {
                            try {
                                open.close();
                            } catch (IOException e42) {
                                e42.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e5) {
                    e222 = e5;
                    try {
                        e222.printStackTrace();
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e2222) {
                                e2222.printStackTrace();
                            }
                        }
                        if (open == null) {
                            try {
                                open.close();
                            } catch (IOException e22222) {
                                e22222.printStackTrace();
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        if (open != null) {
                            open.close();
                        }
                        throw th;
                    }
                }
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = open.read(bArr, 0, 1024);
                        if (read < 0) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    }
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e222222) {
                            e222222.printStackTrace();
                        }
                    }
                    if (open != null) {
                        try {
                            open.close();
                        } catch (IOException e2222222) {
                            e2222222.printStackTrace();
                        }
                    }
                } catch (FileNotFoundException e6) {
                    e = e6;
                    inputStream = open;
                    e.printStackTrace();
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                    }
                    if (inputStream == null) {
                        inputStream.close();
                    }
                } catch (IOException e7) {
                    e2222222 = e7;
                    fileOutputStream = fileOutputStream2;
                    e2222222.printStackTrace();
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    if (open == null) {
                        open.close();
                    }
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    if (open != null) {
                        open.close();
                    }
                    throw th;
                }
            } catch (FileNotFoundException e8) {
                e = e8;
                fileOutputStream2 = null;
                e.printStackTrace();
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
                if (inputStream == null) {
                    inputStream.close();
                }
            } catch (IOException e9) {
                e2222222 = e9;
                open = null;
                e2222222.printStackTrace();
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                if (open == null) {
                    open.close();
                }
            } catch (Throwable th5) {
                th = th5;
                open = null;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                if (open != null) {
                    open.close();
                }
                throw th;
            }
        }
    }

    public static b b(Context context) {
        l = context;
        return k;
    }

    private void e(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    private void g() {
        if (this.c == null) {
            this.c = Environment.getExternalStorageDirectory().toString() + "/" + d;
        }
        e(this.c);
        a(false, e, this.c + "/" + e);
        a(false, f, this.c + "/" + f);
        a(false, g, this.c + "/" + g);
        a(false, "english/bd_etts_speech_female_en.dat", this.c + "/" + h);
        a(false, "english/bd_etts_text_en.dat", this.c + "/" + i);
    }

    private void h() {
        this.b = SpeechSynthesizer.getInstance();
        this.b.setContext(l);
        this.b.setSpeechSynthesizerListener(this);
        this.b.setParam(SpeechSynthesizer.PARAM_TTS_TEXT_MODEL_FILE, this.c + "/" + f);
        this.b.setParam(SpeechSynthesizer.PARAM_TTS_SPEECH_MODEL_FILE, this.c + "/" + e);
        this.b.setAppId(a.a);
        this.b.setApiKey(a.b, a.c);
        AuthInfo auth = this.b.auth(TtsMode.MIX);
        if (auth.isSuccess()) {
            this.m = true;
            this.b.setParam(SpeechSynthesizer.PARAM_SPEAKER, "0");
            this.b.setParam(SpeechSynthesizer.PARAM_MIX_MODE, SpeechSynthesizer.MIX_MODE_HIGH_SPEED_SYNTHESIZE_WIFI);
            this.b.initTts(TtsMode.MIX);
            this.b.loadEnglishModel(this.c + "/" + i, this.c + "/" + h);
            return;
        }
        this.m = false;
        auth.getTtsError().getDetailMessage();
    }

    public void a() {
        if (!this.m) {
            g();
            h();
        }
    }

    public void a(a aVar) {
        this.r = aVar;
    }

    public void a(String str) {
        if (str != null && this.b != null) {
            if (!(this.n == null || this.o > this.p || this.q)) {
                this.q = true;
                this.n.setStreamVolume(3, this.n.getStreamMaxVolume(3), 4);
            }
            try {
                if (a) {
                    this.b.stop();
                }
                this.b.speak(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void a(boolean z) {
        this.q = z;
    }

    public void b() {
        if (this.b != null) {
            this.b.stop();
        }
    }

    public void b(String str) {
        this.b.setParam(SpeechSynthesizer.PARAM_SPEAKER, str);
    }

    public void c() {
        this.b.release();
    }

    public void c(String str) {
        this.b.setParam(SpeechSynthesizer.PARAM_VOLUME, str);
    }

    public void d(String str) {
        this.b.setParam(SpeechSynthesizer.PARAM_PITCH, str);
    }

    public boolean d() {
        return this.m;
    }

    public void e() {
        if (a) {
            this.b.stop();
        }
    }

    public boolean f() {
        return this.q;
    }

    public void onError(String str, SpeechError speechError) {
    }

    public void onSpeechFinish(String str) {
        a = false;
        if (this.r != null) {
            this.r.a(true);
        }
    }

    public void onSpeechProgressChanged(String str, int i) {
    }

    public void onSpeechStart(String str) {
        a = true;
        if (this.r != null) {
            this.r.a(false);
        }
    }

    public void onSynthesizeDataArrived(String str, byte[] bArr, int i) {
    }

    public void onSynthesizeFinish(String str) {
    }

    public void onSynthesizeStart(String str) {
    }
}
