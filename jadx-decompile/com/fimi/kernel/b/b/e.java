package com.fimi.kernel.b.b;

import android.os.Message;
import com.fimi.kernel.b;
import com.fimi.kernel.b.a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class e extends b implements a {
    private volatile int a = 0;
    private Map<Integer, com.fimi.kernel.b.e> b = new HashMap();

    private synchronized int b() {
        this.a++;
        return this.a;
    }

    protected void a(Message message) {
        com.fimi.kernel.b.e eVar = (com.fimi.kernel.b.e) this.b.get(Integer.valueOf(message.what));
        if (eVar != null) {
            if (message.arg1 == 1) {
                eVar.a(message.obj);
            } else {
                eVar.b(message.obj);
            }
            this.b.remove(eVar);
        }
    }

    public void a(final String str, final com.fimi.kernel.b.e<String> eVar) {
        a(new Runnable(this) {
            final /* synthetic */ e c;

            public void run() {
                int a;
                InputStreamReader inputStreamReader;
                InputStreamReader inputStreamReader2;
                Exception exception;
                Throwable th;
                HttpURLConnection httpURLConnection = null;
                do {
                    a = this.c.b();
                } while (this.c.b.containsKey(Integer.valueOf(a)));
                this.c.b.put(Integer.valueOf(a), eVar);
                Message message = new Message();
                message.what = a;
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
                    try {
                        inputStreamReader = new InputStreamReader(httpURLConnection2.getInputStream());
                    } catch (Exception e) {
                        Exception exception2 = e;
                        inputStreamReader2 = null;
                        httpURLConnection = httpURLConnection2;
                        exception = exception2;
                        try {
                            message.arg1 = 0;
                            message.obj = exception.toString();
                            exception.printStackTrace();
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            if (inputStreamReader2 != null) {
                                try {
                                    inputStreamReader2.close();
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                }
                            }
                            this.c.a().sendMessage(message);
                        } catch (Throwable th2) {
                            th = th2;
                            inputStreamReader = inputStreamReader2;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            if (inputStreamReader != null) {
                                try {
                                    inputStreamReader.close();
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        inputStreamReader = null;
                        httpURLConnection = httpURLConnection2;
                        th = th3;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        throw th;
                    }
                    try {
                        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                        StringBuffer stringBuffer = new StringBuffer();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            stringBuffer.append(readLine);
                        }
                        message.obj = stringBuffer.toString();
                        message.arg1 = 1;
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        if (inputStreamReader != null) {
                            try {
                                inputStreamReader.close();
                            } catch (IOException e22) {
                                e22.printStackTrace();
                            }
                        }
                    } catch (Exception e4) {
                        httpURLConnection = httpURLConnection2;
                        exception = e4;
                        inputStreamReader2 = inputStreamReader;
                        message.arg1 = 0;
                        message.obj = exception.toString();
                        exception.printStackTrace();
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        if (inputStreamReader2 != null) {
                            inputStreamReader2.close();
                        }
                        this.c.a().sendMessage(message);
                    } catch (Throwable th32) {
                        httpURLConnection = httpURLConnection2;
                        th = th32;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        throw th;
                    }
                } catch (Exception e5) {
                    exception = e5;
                    inputStreamReader2 = null;
                    message.arg1 = 0;
                    message.obj = exception.toString();
                    exception.printStackTrace();
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (inputStreamReader2 != null) {
                        inputStreamReader2.close();
                    }
                    this.c.a().sendMessage(message);
                } catch (Throwable th4) {
                    th = th4;
                    inputStreamReader = null;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    throw th;
                }
                this.c.a().sendMessage(message);
            }
        });
    }

    public <T> void a(String str, com.fimi.kernel.b.e<T> eVar, Class<?> cls) {
    }

    public void a(String str, Map<String, String> map, com.fimi.kernel.b.e<String> eVar) {
    }

    public <T> void a(String str, Map<String, String> map, com.fimi.kernel.b.e<T> eVar, Class<?> cls) {
    }

    public void a(String str, JSONObject jSONObject, com.fimi.kernel.b.e<JSONObject> eVar) {
    }

    public void b(String str, com.fimi.kernel.b.e<String> eVar) {
    }

    public <T> void b(String str, com.fimi.kernel.b.e<T> eVar, Class<?> cls) {
    }

    public void b(String str, JSONObject jSONObject, com.fimi.kernel.b.e<JSONObject> eVar) {
    }

    public void c(String str, com.fimi.kernel.b.e<JSONObject> eVar) {
    }

    public void d(String str, com.fimi.kernel.b.e<JSONObject> eVar) {
    }
}
