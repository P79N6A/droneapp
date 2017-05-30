package com.baidu.tts.tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.security.MessageDigest;

public class MD5 {
    private static volatile MD5 a = null;
    private char[] b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private MD5() {
    }

    private String a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    private String a(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer(i2 * 2);
        int i3 = i + i2;
        while (i < i3) {
            a(bArr[i], stringBuffer);
            i++;
        }
        return stringBuffer.toString();
    }

    private void a(byte b, StringBuffer stringBuffer) {
        char c = this.b[(b & 240) >> 4];
        char c2 = this.b[b & 15];
        stringBuffer.append(c);
        stringBuffer.append(c2);
    }

    public static MD5 getInstance() {
        if (a == null) {
            synchronized (MD5.class) {
                if (a == null) {
                    a = new MD5();
                }
            }
        }
        return a;
    }

    public String getBigFileMd5(File file) {
        FileInputStream fileInputStream;
        Throwable th;
        String str = null;
        if (file != null) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        instance.update(bArr, 0, read);
                    }
                    str = a(instance.digest());
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Exception e2) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return str;
                } catch (Throwable th2) {
                    th = th2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e32) {
                            e32.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e4) {
                Object obj = str;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return str;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                fileInputStream = str;
                th = th4;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        }
        return str;
    }

    public String getBigFileMd5(String str) {
        return getBigFileMd5(new File(str));
    }

    public String getFileMd5(String str) {
        FileInputStream fileInputStream;
        Throwable th;
        FileChannel fileChannel = null;
        FileInputStream fileInputStream2;
        FileChannel channel;
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            File file = new File(str);
            fileInputStream2 = new FileInputStream(file);
            try {
                channel = fileInputStream2.getChannel();
                try {
                    instance.update(channel.map(MapMode.READ_ONLY, 0, file.length()));
                    String a = a(instance.digest());
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (fileInputStream2 != null) {
                        fileInputStream2.close();
                    }
                    return a;
                } catch (Exception e2) {
                    fileInputStream = fileInputStream2;
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                            return null;
                        }
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    fileChannel = channel;
                    th = th2;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                            throw th;
                        }
                    }
                    if (fileInputStream2 != null) {
                        fileInputStream2.close();
                    }
                    throw th;
                }
            } catch (Exception e5) {
                channel = null;
                fileInputStream = fileInputStream2;
                if (channel != null) {
                    channel.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                if (fileChannel != null) {
                    fileChannel.close();
                }
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                throw th;
            }
        } catch (Exception e6) {
            channel = null;
            fileInputStream = null;
            if (channel != null) {
                channel.close();
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream2 = null;
            if (fileChannel != null) {
                fileChannel.close();
            }
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            throw th;
        }
    }

    public String getMD5(byte[] bArr) {
        int i = 0;
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            byte[] digest = instance.digest();
            int length = digest.length;
            char[] cArr = new char[(length * 2)];
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                cArr[i2] = this.b[(digest[i] >>> 4) & 15];
                i2 = i3 + 1;
                cArr[i3] = this.b[digest[i] & 15];
                i++;
            }
            return new String(cArr);
        } catch (Exception e) {
            return null;
        }
    }
}