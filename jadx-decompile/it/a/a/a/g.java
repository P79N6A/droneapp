package it.a.a.a;

import it.a.a.h;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class g extends h {
    private String d;
    private int e;
    private String f;

    public g(String str, int i) {
        this(str, i, null);
    }

    public g(String str, int i, String str2) {
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    private int a(InputStream inputStream) {
        int read = inputStream.read();
        if (read >= 0) {
            return read;
        }
        throw new IOException("SOCKS4Connector: connection closed by the proxy");
    }

    private Socket a(String str, int i, boolean z) {
        byte[] address;
        Socket b;
        IOException e;
        InputStream inputStream;
        OutputStream outputStream;
        InputStream inputStream2 = null;
        Object obj = null;
        try {
            address = InetAddress.getByName(str).getAddress();
        } catch (Exception e2) {
            address = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 1};
            int i2 = 1;
        }
        if (z) {
            try {
                b = b(this.d, this.e);
            } catch (IOException e3) {
                e = e3;
                OutputStream outputStream2 = null;
                Socket socket = null;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    inputStream = inputStream2;
                    b = socket;
                    outputStream = outputStream2;
                }
            } catch (Throwable th2) {
                Throwable th3;
                th3 = th2;
                outputStream = null;
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
                throw th3;
            }
        }
        b = a(this.d, this.e);
        try {
            inputStream = b.getInputStream();
            try {
                outputStream = b.getOutputStream();
                try {
                    outputStream.write(4);
                    outputStream.write(1);
                    outputStream.write(i >> 8);
                    outputStream.write(i);
                    outputStream.write(address);
                    if (this.f != null) {
                        outputStream.write(this.f.getBytes("UTF-8"));
                    }
                    outputStream.write(0);
                    if (obj != null) {
                        outputStream.write(str.getBytes("UTF-8"));
                        outputStream.write(0);
                    }
                    if (a(inputStream) != 0) {
                        throw new IOException("SOCKS4Connector: invalid proxy response");
                    }
                    switch (a(inputStream)) {
                        case 90:
                            inputStream.skip(6);
                            return b;
                        case 91:
                            throw new IOException("SOCKS4Connector: connection refused/failed");
                        case 92:
                            throw new IOException("SOCKS4Connector: cannot validate the user");
                        case 93:
                            throw new IOException("SOCKS4Connector: invalid user");
                        default:
                            throw new IOException("SOCKS4Connector: invalid proxy response");
                    }
                } catch (IOException e4) {
                    e = e4;
                    outputStream2 = outputStream;
                    inputStream2 = inputStream;
                    socket = b;
                    throw e;
                } catch (Throwable th7) {
                    th3 = th7;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (b != null) {
                        b.close();
                    }
                    throw th3;
                }
            } catch (IOException e5) {
                e = e5;
                outputStream2 = null;
                socket = b;
                inputStream2 = inputStream;
                throw e;
            } catch (Throwable th8) {
                th3 = th8;
                outputStream = null;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                if (b != null) {
                    b.close();
                }
                throw th3;
            }
        } catch (IOException e6) {
            e = e6;
            outputStream2 = null;
            socket = b;
            throw e;
        } catch (Throwable th9) {
            th3 = th9;
            outputStream = null;
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
            throw th3;
        }
    }

    public Socket c(String str, int i) {
        return a(str, i, false);
    }

    public Socket d(String str, int i) {
        return a(str, i, true);
    }
}
