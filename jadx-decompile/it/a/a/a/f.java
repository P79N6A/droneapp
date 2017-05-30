package it.a.a.a;

import it.a.a.h;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class f extends h {
    private String d;
    private int e;
    private String f;
    private String g;

    public f(String str, int i) {
        this(str, i, null, null);
    }

    public f(String str, int i, String str2, String str3) {
        this.d = str;
        this.e = i;
        this.f = str2;
        this.g = str3;
    }

    private Socket a(String str, int i, boolean z) {
        Socket b;
        IOException e;
        InputStream inputStream;
        Throwable th;
        OutputStream outputStream = null;
        byte[] bytes = "\r\n".getBytes("UTF-8");
        String stringBuffer = new StringBuffer().append("CONNECT ").append(str).append(":").append(i).append(" HTTP/1.1").toString();
        String stringBuffer2 = new StringBuffer().append("Host: ").append(str).append(":").append(i).toString();
        if (z) {
            try {
                b = b(this.d, this.e);
            } catch (IOException e2) {
                e = e2;
                inputStream = null;
                b = null;
                try {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
                b = null;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                    }
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th5) {
                    }
                }
                if (b != null) {
                    try {
                        b.close();
                    } catch (Throwable th6) {
                    }
                }
                throw th;
            }
        }
        b = a(this.d, this.e);
        try {
            inputStream = b.getInputStream();
            try {
                outputStream = b.getOutputStream();
                outputStream.write(stringBuffer.getBytes("UTF-8"));
                outputStream.write(bytes);
                outputStream.write(stringBuffer2.getBytes("UTF-8"));
                outputStream.write(bytes);
                if (!(this.f == null || this.g == null)) {
                    outputStream.write(new StringBuffer().append("Proxy-Authorization: Basic ").append(a.a(new StringBuffer().append(this.f).append(":").append(this.g).toString())).toString().getBytes("UTF-8"));
                    outputStream.write(bytes);
                }
                outputStream.write(bytes);
                outputStream.flush();
                ArrayList arrayList = new ArrayList();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                String readLine = bufferedReader.readLine();
                while (readLine != null && readLine.length() > 0) {
                    arrayList.add(readLine);
                    readLine = bufferedReader.readLine();
                }
                int size = arrayList.size();
                if (size < 1) {
                    throw new IOException("HTTPTunnelConnector: invalid proxy response");
                }
                readLine = (String) arrayList.get(0);
                if (!readLine.startsWith("HTTP/") || readLine.length() < 12) {
                    throw new IOException("HTTPTunnelConnector: invalid proxy response");
                }
                if ("200".equals(readLine.substring(9, 12))) {
                    return b;
                }
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("HTTPTunnelConnector: connection failed\r\n");
                stringBuffer3.append("Response received from the proxy:\r\n");
                for (int i2 = 0; i2 < size; i2++) {
                    stringBuffer3.append((String) arrayList.get(i2));
                    stringBuffer3.append("\r\n");
                }
                throw new IOException(stringBuffer3.toString());
            } catch (IOException e3) {
                e = e3;
                throw e;
            }
        } catch (IOException e4) {
            e = e4;
            inputStream = null;
            throw e;
        } catch (Throwable th7) {
            th = th7;
            inputStream = null;
            if (outputStream != null) {
                outputStream.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            if (b != null) {
                b.close();
            }
            throw th;
        }
    }

    public Socket c(String str, int i) {
        return a(str, i, false);
    }

    public Socket d(String str, int i) {
        return a(str, i, true);
    }
}
