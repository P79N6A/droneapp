package com.fimi.kernel.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.os.StatFs;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.a.a.e;
import org.apache.http.Header;
import org.apache.http.HttpResponse;

public class g {
    private static String a = null;
    private static String b = null;
    private static String c = null;
    private static String d = null;
    private static String e = null;
    private static int f = 209715200;

    public static class a implements Comparator<File> {
        public int a(File file, File file2) {
            return file.lastModified() > file2.lastModified() ? 1 : file.lastModified() == file2.lastModified() ? 0 : -1;
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return a((File) obj, (File) obj2);
        }
    }

    public static Bitmap a(Context context, String str) {
        Bitmap bitmap = null;
        try {
            bitmap = BitmapFactory.decodeStream(context.getAssets().open(str));
        } catch (Exception e) {
            k.a(g.class, "获取图片异常：" + e.getMessage());
        }
        return bitmap;
    }

    public static Bitmap a(File file) {
        Bitmap bitmap = null;
        try {
            if (a() && file.exists()) {
                bitmap = s.a(file);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bitmap;
    }

    public static Bitmap a(File file, int i, int i2, int i3) {
        try {
            return (a() && file.exists()) ? i == 0 ? s.b(file, i2, i3) : i == 1 ? s.a(file, i2, i3) : s.a(file) : null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Bitmap a(String str) {
        Bitmap bitmap = null;
        try {
            bitmap = BitmapFactory.decodeStream(g.class.getResourceAsStream(str));
        } catch (Exception e) {
            k.a(g.class, "获取图片异常：" + e.getMessage());
        }
        return bitmap;
    }

    public static Bitmap a(String str, int i, int i2, int i3) {
        try {
            if (n.b(str)) {
                return null;
            }
            if (!a() || f < b()) {
                return b(str, i, i2, i3);
            }
            String a = a(str, b);
            return a != null ? a(new File(a), i, i2, i3) : null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Bitmap a(byte[] bArr, String str, int i, int i2, int i3) {
        FileOutputStream fileOutputStream;
        ByteArrayInputStream byteArrayInputStream;
        DataInputStream dataInputStream;
        Exception e;
        Throwable th;
        Object obj;
        Bitmap bitmap = null;
        Object obj2;
        if (bArr != null) {
            try {
                File file = new File(b + str);
                if (!file.exists()) {
                    file.createNewFile();
                }
                fileOutputStream = new FileOutputStream(file);
                try {
                    byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        dataInputStream = new DataInputStream(byteArrayInputStream);
                        try {
                            byte[] bArr2 = new byte[1024];
                            while (true) {
                                int read = dataInputStream.read(bArr2);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr2, 0, read);
                                try {
                                    Thread.sleep(500);
                                } catch (Exception e2) {
                                }
                            }
                            fileOutputStream.flush();
                            bitmap = a(file, i, i2, i3);
                        } catch (Exception e3) {
                            e = e3;
                            try {
                                e.printStackTrace();
                                if (dataInputStream != null) {
                                    try {
                                        dataInputStream.close();
                                    } catch (Exception e4) {
                                    }
                                }
                                if (byteArrayInputStream != null) {
                                    try {
                                        byteArrayInputStream.close();
                                    } catch (Exception e5) {
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Exception e6) {
                                    }
                                }
                                return bitmap;
                            } catch (Throwable th2) {
                                th = th2;
                                if (dataInputStream != null) {
                                    try {
                                        dataInputStream.close();
                                    } catch (Exception e7) {
                                    }
                                }
                                if (byteArrayInputStream != null) {
                                    try {
                                        byteArrayInputStream.close();
                                    } catch (Exception e8) {
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Exception e9) {
                                    }
                                }
                                throw th;
                            }
                        }
                    } catch (Exception e10) {
                        e = e10;
                        obj2 = bitmap;
                        e.printStackTrace();
                        if (dataInputStream != null) {
                            dataInputStream.close();
                        }
                        if (byteArrayInputStream != null) {
                            byteArrayInputStream.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        return bitmap;
                    } catch (Throwable th3) {
                        obj2 = bitmap;
                        th = th3;
                        if (dataInputStream != null) {
                            dataInputStream.close();
                        }
                        if (byteArrayInputStream != null) {
                            byteArrayInputStream.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                    obj = bitmap;
                    obj2 = bitmap;
                    e.printStackTrace();
                    if (dataInputStream != null) {
                        dataInputStream.close();
                    }
                    if (byteArrayInputStream != null) {
                        byteArrayInputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    return bitmap;
                } catch (Throwable th32) {
                    obj = bitmap;
                    obj2 = bitmap;
                    th = th32;
                    if (dataInputStream != null) {
                        dataInputStream.close();
                    }
                    if (byteArrayInputStream != null) {
                        byteArrayInputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
                byteArrayInputStream = bitmap;
                dataInputStream = bitmap;
                fileOutputStream = bitmap;
                e.printStackTrace();
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
                if (byteArrayInputStream != null) {
                    byteArrayInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                return bitmap;
            } catch (Throwable th322) {
                byteArrayInputStream = bitmap;
                dataInputStream = bitmap;
                fileOutputStream = bitmap;
                th = th322;
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
                if (byteArrayInputStream != null) {
                    byteArrayInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        }
        obj = bitmap;
        obj2 = bitmap;
        Object obj3 = bitmap;
        if (dataInputStream != null) {
            try {
                dataInputStream.close();
            } catch (Exception e13) {
            }
        }
        if (byteArrayInputStream != null) {
            try {
                byteArrayInputStream.close();
            } catch (Exception e14) {
            }
        }
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (Exception e15) {
            }
        }
        return bitmap;
    }

    public static String a(Context context, int i, String str) {
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        Exception e;
        Throwable th;
        try {
            inputStreamReader = new InputStreamReader(context.getResources().openRawResource(i));
            try {
                bufferedReader = new BufferedReader(inputStreamReader);
            } catch (Exception e2) {
                e = e2;
                bufferedReader = null;
                try {
                    e.printStackTrace();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception e3) {
                            e3.printStackTrace();
                            return null;
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception e4) {
                            e4.printStackTrace();
                            throw th;
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                throw th;
            }
            try {
                String readLine;
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    stringBuffer.append(readLine);
                }
                readLine = new String(stringBuffer.toString().getBytes(), str);
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception e42) {
                        e42.printStackTrace();
                        return readLine;
                    }
                }
                if (inputStreamReader == null) {
                    return readLine;
                }
                inputStreamReader.close();
                return readLine;
            } catch (Exception e5) {
                e3 = e5;
                e3.printStackTrace();
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                return null;
            }
        } catch (Exception e6) {
            e3 = e6;
            bufferedReader = null;
            inputStreamReader = null;
            e3.printStackTrace();
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (inputStreamReader != null) {
                inputStreamReader.close();
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            inputStreamReader = null;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (inputStreamReader != null) {
                inputStreamReader.close();
            }
            throw th;
        }
    }

    public static String a(Context context, String str, String str2) {
        BufferedReader bufferedReader;
        Exception e;
        Throwable th;
        InputStreamReader inputStreamReader;
        try {
            inputStreamReader = new InputStreamReader(context.getAssets().open(str));
            try {
                bufferedReader = new BufferedReader(inputStreamReader);
            } catch (Exception e2) {
                e = e2;
                bufferedReader = null;
                try {
                    e.printStackTrace();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception e3) {
                            e3.printStackTrace();
                            return null;
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception e4) {
                            e4.printStackTrace();
                            throw th;
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                throw th;
            }
            try {
                String readLine;
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    stringBuffer.append(readLine);
                }
                readLine = new String(stringBuffer.toString().getBytes(), str2);
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception e42) {
                        e42.printStackTrace();
                        return readLine;
                    }
                }
                if (inputStreamReader == null) {
                    return readLine;
                }
                inputStreamReader.close();
                return readLine;
            } catch (Exception e5) {
                e3 = e5;
                e3.printStackTrace();
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                return null;
            }
        } catch (Exception e6) {
            e3 = e6;
            bufferedReader = null;
            inputStreamReader = null;
            e3.printStackTrace();
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (inputStreamReader != null) {
                inputStreamReader.close();
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            inputStreamReader = null;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (inputStreamReader != null) {
                inputStreamReader.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r11, java.lang.String r12) {
        /*
        r0 = 0;
        r2 = 0;
        r4 = 0;
        r5 = 0;
        r1 = 0;
        r3 = a();	 Catch:{ Exception -> 0x016c, all -> 0x0138 }
        if (r3 != 0) goto L_0x002a;
    L_0x000b:
        if (r2 == 0) goto L_0x0010;
    L_0x000d:
        r4.close();	 Catch:{ Exception -> 0x001b }
    L_0x0010:
        if (r2 == 0) goto L_0x0015;
    L_0x0012:
        r5.close();	 Catch:{ Exception -> 0x0020 }
    L_0x0015:
        if (r2 == 0) goto L_0x001a;
    L_0x0017:
        r1.disconnect();	 Catch:{ Exception -> 0x0025 }
    L_0x001a:
        return r2;
    L_0x001b:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x0010;
    L_0x0020:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x0015;
    L_0x0025:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x001a;
    L_0x002a:
        r3 = d(r11);	 Catch:{ Exception -> 0x016c, all -> 0x0138 }
        r6 = new java.io.File;	 Catch:{ Exception -> 0x016c, all -> 0x0138 }
        r7 = b;	 Catch:{ Exception -> 0x016c, all -> 0x0138 }
        r6.<init>(r7);	 Catch:{ Exception -> 0x016c, all -> 0x0138 }
        r6 = r6.listFiles();	 Catch:{ Exception -> 0x016c, all -> 0x0138 }
    L_0x0039:
        r7 = r6.length;	 Catch:{ Exception -> 0x016c, all -> 0x0138 }
        if (r0 >= r7) goto L_0x007c;
    L_0x003c:
        r7 = r6[r0];	 Catch:{ Exception -> 0x016c, all -> 0x0138 }
        r7 = r7.getName();	 Catch:{ Exception -> 0x016c, all -> 0x0138 }
        r8 = 0;
        r9 = ".";
        r9 = r7.lastIndexOf(r9);	 Catch:{ Exception -> 0x016c, all -> 0x0138 }
        r7 = r7.substring(r8, r9);	 Catch:{ Exception -> 0x016c, all -> 0x0138 }
        r7 = r7.equals(r3);	 Catch:{ Exception -> 0x016c, all -> 0x0138 }
        if (r7 == 0) goto L_0x0079;
    L_0x0053:
        r0 = r6[r0];	 Catch:{ Exception -> 0x016c, all -> 0x0138 }
        r0 = r0.getPath();	 Catch:{ Exception -> 0x016c, all -> 0x0138 }
        if (r2 == 0) goto L_0x005e;
    L_0x005b:
        r4.close();	 Catch:{ Exception -> 0x006a }
    L_0x005e:
        if (r2 == 0) goto L_0x0063;
    L_0x0060:
        r5.close();	 Catch:{ Exception -> 0x006f }
    L_0x0063:
        if (r2 == 0) goto L_0x0068;
    L_0x0065:
        r1.disconnect();	 Catch:{ Exception -> 0x0074 }
    L_0x0068:
        r2 = r0;
        goto L_0x001a;
    L_0x006a:
        r3 = move-exception;
        r3.printStackTrace();
        goto L_0x005e;
    L_0x006f:
        r3 = move-exception;
        r3.printStackTrace();
        goto L_0x0063;
    L_0x0074:
        r1 = move-exception;
        r1.printStackTrace();
        goto L_0x0068;
    L_0x0079:
        r0 = r0 + 1;
        goto L_0x0039;
    L_0x007c:
        r0 = new java.net.URL;	 Catch:{ Exception -> 0x016c, all -> 0x0138 }
        r0.<init>(r11);	 Catch:{ Exception -> 0x016c, all -> 0x0138 }
        r0 = r0.openConnection();	 Catch:{ Exception -> 0x016c, all -> 0x0138 }
        r0 = (java.net.HttpURLConnection) r0;	 Catch:{ Exception -> 0x016c, all -> 0x0138 }
        r0.connect();	 Catch:{ Exception -> 0x0173, all -> 0x015a }
        r1 = a(r11, r0);	 Catch:{ Exception -> 0x0173, all -> 0x015a }
        r3 = new java.io.File;	 Catch:{ Exception -> 0x0173, all -> 0x015a }
        r6 = b;	 Catch:{ Exception -> 0x0173, all -> 0x015a }
        r3.<init>(r6, r1);	 Catch:{ Exception -> 0x0173, all -> 0x015a }
        r1 = r3.getPath();	 Catch:{ Exception -> 0x017b, all -> 0x015a }
        r6 = r3.exists();	 Catch:{ Exception -> 0x017b, all -> 0x015a }
        if (r6 != 0) goto L_0x00e2;
    L_0x009f:
        r3.createNewFile();	 Catch:{ Exception -> 0x017b, all -> 0x015a }
        r5 = r0.getInputStream();	 Catch:{ Exception -> 0x017b, all -> 0x015a }
        r4 = new java.io.FileOutputStream;	 Catch:{ Exception -> 0x0184, all -> 0x0160 }
        r4.<init>(r3);	 Catch:{ Exception -> 0x0184, all -> 0x0160 }
        r6 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r6 = new byte[r6];	 Catch:{ Exception -> 0x00bb, all -> 0x0165 }
    L_0x00af:
        r7 = r5.read(r6);	 Catch:{ Exception -> 0x00bb, all -> 0x0165 }
        r8 = -1;
        if (r7 == r8) goto L_0x0107;
    L_0x00b6:
        r8 = 0;
        r4.write(r6, r8, r7);	 Catch:{ Exception -> 0x00bb, all -> 0x0165 }
        goto L_0x00af;
    L_0x00bb:
        r1 = move-exception;
        r10 = r1;
        r1 = r3;
        r3 = r0;
        r0 = r10;
    L_0x00c0:
        r0.printStackTrace();	 Catch:{ all -> 0x0169 }
        r0 = com.fimi.kernel.utils.g.class;
        r6 = "有文件下载出错了,已删除";
        com.fimi.kernel.utils.k.c(r0, r6);	 Catch:{ all -> 0x0169 }
        if (r1 == 0) goto L_0x00cf;
    L_0x00cc:
        r1.delete();	 Catch:{ all -> 0x0169 }
    L_0x00cf:
        if (r5 == 0) goto L_0x00d4;
    L_0x00d1:
        r5.close();	 Catch:{ Exception -> 0x0128 }
    L_0x00d4:
        if (r4 == 0) goto L_0x00d9;
    L_0x00d6:
        r4.close();	 Catch:{ Exception -> 0x012d }
    L_0x00d9:
        if (r3 == 0) goto L_0x00de;
    L_0x00db:
        r3.disconnect();	 Catch:{ Exception -> 0x0132 }
    L_0x00de:
        r0 = r2;
    L_0x00df:
        r2 = r0;
        goto L_0x001a;
    L_0x00e2:
        r1 = r3.getPath();	 Catch:{ Exception -> 0x017b, all -> 0x015a }
        if (r2 == 0) goto L_0x00eb;
    L_0x00e8:
        r4.close();	 Catch:{ Exception -> 0x00f8 }
    L_0x00eb:
        if (r2 == 0) goto L_0x00f0;
    L_0x00ed:
        r5.close();	 Catch:{ Exception -> 0x00fd }
    L_0x00f0:
        if (r0 == 0) goto L_0x00f5;
    L_0x00f2:
        r0.disconnect();	 Catch:{ Exception -> 0x0102 }
    L_0x00f5:
        r2 = r1;
        goto L_0x001a;
    L_0x00f8:
        r3 = move-exception;
        r3.printStackTrace();
        goto L_0x00eb;
    L_0x00fd:
        r2 = move-exception;
        r2.printStackTrace();
        goto L_0x00f0;
    L_0x0102:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x00f5;
    L_0x0107:
        if (r5 == 0) goto L_0x010c;
    L_0x0109:
        r5.close();	 Catch:{ Exception -> 0x0118 }
    L_0x010c:
        if (r4 == 0) goto L_0x0111;
    L_0x010e:
        r4.close();	 Catch:{ Exception -> 0x011d }
    L_0x0111:
        if (r0 == 0) goto L_0x0116;
    L_0x0113:
        r0.disconnect();	 Catch:{ Exception -> 0x0122 }
    L_0x0116:
        r0 = r1;
        goto L_0x00df;
    L_0x0118:
        r2 = move-exception;
        r2.printStackTrace();
        goto L_0x010c;
    L_0x011d:
        r2 = move-exception;
        r2.printStackTrace();
        goto L_0x0111;
    L_0x0122:
        r0 = move-exception;
        r0.printStackTrace();
        r0 = r1;
        goto L_0x00df;
    L_0x0128:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x00d4;
    L_0x012d:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x00d9;
    L_0x0132:
        r0 = move-exception;
        r0.printStackTrace();
        r0 = r2;
        goto L_0x00df;
    L_0x0138:
        r0 = move-exception;
        r4 = r2;
        r5 = r2;
    L_0x013b:
        if (r5 == 0) goto L_0x0140;
    L_0x013d:
        r5.close();	 Catch:{ Exception -> 0x014b }
    L_0x0140:
        if (r4 == 0) goto L_0x0145;
    L_0x0142:
        r4.close();	 Catch:{ Exception -> 0x0150 }
    L_0x0145:
        if (r2 == 0) goto L_0x014a;
    L_0x0147:
        r2.disconnect();	 Catch:{ Exception -> 0x0155 }
    L_0x014a:
        throw r0;
    L_0x014b:
        r1 = move-exception;
        r1.printStackTrace();
        goto L_0x0140;
    L_0x0150:
        r1 = move-exception;
        r1.printStackTrace();
        goto L_0x0145;
    L_0x0155:
        r1 = move-exception;
        r1.printStackTrace();
        goto L_0x014a;
    L_0x015a:
        r1 = move-exception;
        r4 = r2;
        r5 = r2;
        r2 = r0;
        r0 = r1;
        goto L_0x013b;
    L_0x0160:
        r1 = move-exception;
        r4 = r2;
        r2 = r0;
        r0 = r1;
        goto L_0x013b;
    L_0x0165:
        r1 = move-exception;
        r2 = r0;
        r0 = r1;
        goto L_0x013b;
    L_0x0169:
        r0 = move-exception;
        r2 = r3;
        goto L_0x013b;
    L_0x016c:
        r0 = move-exception;
        r1 = r2;
        r3 = r2;
        r4 = r2;
        r5 = r2;
        goto L_0x00c0;
    L_0x0173:
        r1 = move-exception;
        r3 = r0;
        r4 = r2;
        r5 = r2;
        r0 = r1;
        r1 = r2;
        goto L_0x00c0;
    L_0x017b:
        r1 = move-exception;
        r4 = r2;
        r5 = r2;
        r10 = r0;
        r0 = r1;
        r1 = r3;
        r3 = r10;
        goto L_0x00c0;
    L_0x0184:
        r1 = move-exception;
        r4 = r2;
        r10 = r3;
        r3 = r0;
        r0 = r1;
        r1 = r10;
        goto L_0x00c0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fimi.kernel.utils.g.a(java.lang.String, java.lang.String):java.lang.String");
    }

    public static String a(String str, HttpURLConnection httpURLConnection) {
        String str2 = null;
        if (!n.b(str)) {
            try {
                String b = b(str, httpURLConnection);
                if (n.b(b)) {
                    b = ".ab";
                }
                str2 = m.b(str) + b;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return str2;
    }

    public static String a(String str, HttpResponse httpResponse) {
        String str2 = null;
        if (!n.b(str)) {
            try {
                String b = b(str, httpResponse);
                if (n.b(b)) {
                    b = ".ab";
                }
                str2 = m.b(str) + b;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return str2;
    }

    public static String a(HttpURLConnection httpURLConnection) {
        String str = null;
        if (httpURLConnection != null) {
            try {
                if (httpURLConnection.getResponseCode() == 200) {
                    Matcher matcher;
                    int i = 0;
                    while (true) {
                        String headerField = httpURLConnection.getHeaderField(i);
                        if (headerField == null) {
                            break;
                        }
                        if ("content-disposition".equals(httpURLConnection.getHeaderFieldKey(i).toLowerCase())) {
                            matcher = Pattern.compile(".*filename=(.*)").matcher(headerField.toLowerCase());
                            if (matcher.find()) {
                                break;
                            }
                        }
                        i++;
                    }
                    str = matcher.group(1).replace("\"", "");
                }
            } catch (Exception e) {
                e.printStackTrace();
                k.c(g.class, "网络上获取文件名失败");
            }
        }
        return str;
    }

    public static String a(HttpResponse httpResponse) {
        String str = null;
        if (httpResponse != null) {
            try {
                Header[] headers = httpResponse.getHeaders("content-disposition");
                for (Header value : headers) {
                    Matcher matcher = Pattern.compile(".*filename=(.*)").matcher(value.getValue());
                    if (matcher.find()) {
                        str = matcher.group(1).replace("\"", "");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                k.c(g.class, "网络上获取文件名失败");
            }
        }
        return str;
    }

    public static void a(Context context) {
        String str = File.separator + com.fimi.kernel.a.a + File.separator + c.g(context).packageName + File.separator;
        String str2 = str + com.fimi.kernel.a.b + File.separator;
        String str3 = str + com.fimi.kernel.a.c + File.separator;
        String str4 = str + com.fimi.kernel.a.d + File.separator;
        try {
            if (a()) {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                File file = new File(externalStorageDirectory.getAbsolutePath() + str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                a = file.getPath();
                File file2 = new File(externalStorageDirectory.getAbsolutePath() + str4);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                d = file2.getPath();
                file2 = new File(externalStorageDirectory.getAbsolutePath() + str2);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                b = file2.getPath();
                file2 = new File(externalStorageDirectory.getAbsolutePath() + str3);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                c = file2.getPath();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(String str, byte[] bArr, boolean z) {
        Exception e;
        Throwable th;
        FileOutputStream fileOutputStream = null;
        try {
            File file = new File(str);
            if (a()) {
                if (!file.exists()) {
                    if (z) {
                        File parentFile = file.getParentFile();
                        if (!parentFile.exists()) {
                            parentFile.mkdirs();
                            file.createNewFile();
                        }
                    } else if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                            return;
                        } catch (Exception e2) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(str);
                try {
                    fileOutputStream2.write(bArr);
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (Exception e3) {
                        }
                    }
                } catch (Exception e4) {
                    e = e4;
                    fileOutputStream = fileOutputStream2;
                    try {
                        e.printStackTrace();
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Exception e5) {
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Exception e6) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } else if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception e7) {
                }
            }
        } catch (Exception e8) {
            e = e8;
            e.printStackTrace();
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }
    }

    public static boolean a() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static int b() {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return (int) (((((double) statFs.getBlockSize()) * ((double) statFs.getAvailableBlocks())) / 1024.0d) * 1024.0d);
    }

    public static int b(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty(e.a, "image/gif, image/jpeg, image/pjpeg, image/pjpeg, application/x-shockwave-flash, application/xaml+xml, application/vnd.ms-xpsdocument, application/x-ms-xbap, application/x-ms-application, application/vnd.ms-excel, application/vnd.ms-powerpoint, application/msword, */*");
            httpURLConnection.setRequestProperty(e.d, "zh-CN");
            httpURLConnection.setRequestProperty(e.P, str);
            httpURLConnection.setRequestProperty("Charset", "UTF-8");
            httpURLConnection.setRequestProperty(e.Y, "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2; Trident/4.0; .NET CLR 1.1.4322; .NET CLR 2.0.50727; .NET CLR 3.0.04506.30; .NET CLR 3.0.4506.2152; .NET CLR 3.5.30729)");
            httpURLConnection.setRequestProperty(e.j, "Keep-Alive");
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                return httpURLConnection.getContentLength();
            }
        } catch (Exception e) {
            e.printStackTrace();
            k.a(g.class, "获取长度异常：" + e.getMessage());
        }
        return 0;
    }

    public static Bitmap b(String str, int i, int i2, int i3) {
        Bitmap bitmap = null;
        try {
            bitmap = s.a(str, i, i2, i3);
        } catch (Exception e) {
            k.a(g.class, "下载图片异常：" + e.getMessage());
        }
        return bitmap;
    }

    public static Drawable b(Context context, String str) {
        Drawable drawable = null;
        try {
            drawable = Drawable.createFromStream(context.getAssets().open(str), null);
        } catch (Exception e) {
            k.a(g.class, "获取图片异常：" + e.getMessage());
        }
        return drawable;
    }

    public static String b(Context context) {
        if (a == null) {
            a(context);
        }
        return a;
    }

    public static String b(String str, HttpURLConnection httpURLConnection) {
        Exception exception;
        String str2 = null;
        if (!n.b(str)) {
            try {
                String substring;
                if (str.lastIndexOf(".") != -1) {
                    substring = str.substring(str.lastIndexOf("."));
                    try {
                        if (substring.indexOf("/") == -1 && substring.indexOf("?") == -1 && substring.indexOf("&") == -1) {
                            str2 = substring;
                        }
                    } catch (Exception e) {
                        Exception exception2 = e;
                        str2 = substring;
                        exception = exception2;
                        exception.printStackTrace();
                        return str2;
                    }
                }
                if (n.b(str2)) {
                    substring = a(httpURLConnection);
                    if (!(substring == null || substring.lastIndexOf(".") == -1)) {
                        str2 = substring.substring(substring.lastIndexOf("."));
                    }
                }
            } catch (Exception e2) {
                exception = e2;
                exception.printStackTrace();
                return str2;
            }
        }
        return str2;
    }

    public static String b(String str, HttpResponse httpResponse) {
        Exception exception;
        String str2 = null;
        if (!n.b(str)) {
            try {
                String substring;
                if (str.lastIndexOf(".") != -1) {
                    substring = str.substring(str.lastIndexOf("."));
                    try {
                        if (substring.indexOf("/") == -1 && substring.indexOf("?") == -1 && substring.indexOf("&") == -1) {
                            str2 = substring;
                        }
                    } catch (Exception e) {
                        Exception exception2 = e;
                        str2 = substring;
                        exception = exception2;
                        exception.printStackTrace();
                        return str2;
                    }
                }
                if (n.b(str2)) {
                    substring = a(httpResponse);
                    if (!(substring == null || substring.lastIndexOf(".") == -1)) {
                        str2 = substring.substring(substring.lastIndexOf("."));
                    }
                }
            } catch (Exception e2) {
                exception = e2;
                exception.printStackTrace();
                return str2;
            }
        }
        return str2;
    }

    public static boolean b(File file) {
        try {
            if (!a()) {
                return false;
            }
            if (file == null) {
                return true;
            }
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                for (File b : listFiles) {
                    b(b);
                }
            } else {
                file.delete();
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String c(Context context) {
        if (a == null) {
            a(context);
        }
        return b;
    }

    public static String c(String str) {
        try {
            if (n.b(str)) {
                return null;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty(e.a, "image/gif, image/jpeg, image/pjpeg, image/pjpeg, application/x-shockwave-flash, application/xaml+xml, application/vnd.ms-xpsdocument, application/x-ms-xbap, application/x-ms-application, application/vnd.ms-excel, application/vnd.ms-powerpoint, application/msword, */*");
            httpURLConnection.setRequestProperty(e.d, "zh-CN");
            httpURLConnection.setRequestProperty(e.P, str);
            httpURLConnection.setRequestProperty("Charset", "UTF-8");
            httpURLConnection.setRequestProperty(e.Y, "");
            httpURLConnection.setRequestProperty(e.j, "Keep-Alive");
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                int i = 0;
                while (true) {
                    String headerField = httpURLConnection.getHeaderField(i);
                    if (headerField == null) {
                        break;
                    }
                    if ("content-disposition".equals(httpURLConnection.getHeaderFieldKey(i).toLowerCase())) {
                        Matcher matcher = Pattern.compile(".*filename=(.*)").matcher(headerField.toLowerCase());
                        if (matcher.find()) {
                            return matcher.group(1).replace("\"", "");
                        }
                    }
                    i++;
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            k.c(g.class, "网络上获取文件名失败");
        }
    }

    public static boolean c() {
        try {
            b(new File(a));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static int d() {
        return f;
    }

    public static String d(Context context) {
        if (a == null) {
            a(context);
        }
        return c;
    }

    public static String d(String str) {
        String str2 = null;
        if (!n.b(str)) {
            try {
                str2 = m.b(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return str2;
    }

    public static String e(Context context) {
        if (a == null) {
            a(context);
        }
        return d;
    }

    public static byte[] e(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        Exception e;
        Throwable th;
        byte[] bArr = null;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            File file = new File(str);
            if (a()) {
                if (file.exists()) {
                    if (file.length() <= 2147483647L) {
                        FileInputStream fileInputStream = new FileInputStream(str);
                        byteArrayOutputStream = new ByteArrayOutputStream(1024);
                        try {
                            byte[] bArr2 = new byte[1024];
                            while (true) {
                                int read = fileInputStream.read(bArr2);
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr2, 0, read);
                            }
                            fileInputStream.close();
                            bArr = byteArrayOutputStream.toByteArray();
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Exception e2) {
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                            try {
                                e.printStackTrace();
                                if (byteArrayOutputStream != null) {
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (Exception e4) {
                                    }
                                }
                                return bArr;
                            } catch (Throwable th2) {
                                th = th2;
                                if (byteArrayOutputStream != null) {
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (Exception e5) {
                                    }
                                }
                                throw th;
                            }
                        }
                    } else if (bArr != null) {
                        try {
                            byteArrayOutputStream2.close();
                        } catch (Exception e6) {
                        }
                    }
                } else if (bArr != null) {
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Exception e7) {
                    }
                }
            } else if (bArr != null) {
                try {
                    byteArrayOutputStream2.close();
                } catch (Exception e8) {
                }
            }
        } catch (Exception e9) {
            e = e9;
            byteArrayOutputStream = bArr;
            e.printStackTrace();
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            return bArr;
        } catch (Throwable th3) {
            byteArrayOutputStream = bArr;
            th = th3;
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            throw th;
        }
        return bArr;
    }

    public static File f(String str) {
        File file = new File(str);
        if (!file.exists()) {
            try {
                String substring = str.substring(0, str.lastIndexOf("/"));
                System.out.println(substring);
                File file2 = new File(substring);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }

    public static String f(Context context) {
        if (a == null) {
            a(context);
        }
        return e;
    }

    public static boolean g(String str) {
        if (str == null) {
            return false;
        }
        int lastIndexOf = str.lastIndexOf(".");
        return lastIndexOf >= 0 && "mp4".equals(str.substring(lastIndexOf + 1).toLowerCase());
    }
}
