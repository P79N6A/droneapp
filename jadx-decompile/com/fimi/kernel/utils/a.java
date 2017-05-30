package com.fimi.kernel.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.Key;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class a {
    private static int a = 128;
    private static String b = "AES";

    public static boolean a(String str, String str2, String str3) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        FileNotFoundException e;
        FileInputStream fileInputStream2;
        IOException e2;
        Throwable th;
        Exception e3;
        FileOutputStream fileOutputStream2 = null;
        try {
            byte[] a;
            File file = new File(str2);
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[((int) file.length())];
                fileInputStream.read(bArr);
                a = a(str, bArr);
                fileOutputStream = new FileOutputStream(str3);
            } catch (FileNotFoundException e4) {
                e = e4;
                fileOutputStream = null;
                fileInputStream2 = fileInputStream;
                try {
                    e.printStackTrace();
                    try {
                        fileInputStream2.close();
                        fileOutputStream.close();
                        return false;
                    } catch (IOException e22) {
                        e22.printStackTrace();
                        return false;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    fileOutputStream2 = fileOutputStream;
                    try {
                        fileInputStream.close();
                        fileOutputStream2.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                    throw th;
                }
            } catch (IOException e6) {
                e22 = e6;
                try {
                    e22.printStackTrace();
                    try {
                        fileInputStream.close();
                        fileOutputStream2.close();
                        return false;
                    } catch (IOException e222) {
                        e222.printStackTrace();
                        return false;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream.close();
                    fileOutputStream2.close();
                    throw th;
                }
            } catch (Exception e7) {
                e3 = e7;
                e3.printStackTrace();
                try {
                    fileInputStream.close();
                    fileOutputStream2.close();
                    return false;
                } catch (IOException e2222) {
                    e2222.printStackTrace();
                    return false;
                }
            }
            try {
                fileOutputStream.write(a);
                if (fileInputStream == null || fileOutputStream == null) {
                    return true;
                }
                try {
                    fileInputStream.close();
                    fileOutputStream.close();
                    return true;
                } catch (IOException e52) {
                    e52.printStackTrace();
                    return true;
                }
            } catch (FileNotFoundException e8) {
                e = e8;
                fileInputStream2 = fileInputStream;
                e.printStackTrace();
                if (!(fileInputStream2 == null || fileOutputStream == null)) {
                    fileInputStream2.close();
                    fileOutputStream.close();
                }
                return false;
            } catch (IOException e9) {
                e2222 = e9;
                fileOutputStream2 = fileOutputStream;
                e2222.printStackTrace();
                if (!(fileInputStream == null || fileOutputStream2 == null)) {
                    fileInputStream.close();
                    fileOutputStream2.close();
                }
                return false;
            } catch (Exception e10) {
                e3 = e10;
                fileOutputStream2 = fileOutputStream;
                e3.printStackTrace();
                if (!(fileInputStream == null || fileOutputStream2 == null)) {
                    fileInputStream.close();
                    fileOutputStream2.close();
                }
                return false;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream2 = fileOutputStream;
                if (!(fileInputStream == null || fileOutputStream2 == null)) {
                    fileInputStream.close();
                    fileOutputStream2.close();
                }
                throw th;
            }
        } catch (FileNotFoundException e11) {
            e = e11;
            fileOutputStream = null;
            e.printStackTrace();
            fileInputStream2.close();
            fileOutputStream.close();
            return false;
        } catch (IOException e12) {
            e2222 = e12;
            fileInputStream = null;
            e2222.printStackTrace();
            fileInputStream.close();
            fileOutputStream2.close();
            return false;
        } catch (Exception e13) {
            e3 = e13;
            fileInputStream = null;
            e3.printStackTrace();
            fileInputStream.close();
            fileOutputStream2.close();
            return false;
        } catch (Throwable th5) {
            th = th5;
            fileInputStream = null;
            fileInputStream.close();
            fileOutputStream2.close();
            throw th;
        }
    }

    public static byte[] a(String str, byte[] bArr) {
        return a(a(str.getBytes()), bArr);
    }

    private static byte[] a(byte[] bArr) {
        KeyGenerator instance = KeyGenerator.getInstance(b);
        SecureRandom instance2 = SecureRandom.getInstance("SHA1PRNG", "Crypto");
        instance2.setSeed(bArr);
        instance.init(a, instance2);
        return instance.generateKey().getEncoded();
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        Key secretKeySpec = new SecretKeySpec(bArr, b);
        Cipher instance = Cipher.getInstance(b);
        instance.init(1, secretKeySpec, new IvParameterSpec(new byte[instance.getBlockSize()]));
        return instance.doFinal(bArr2);
    }

    public static boolean b(String str, String str2, String str3) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        FileNotFoundException e;
        FileInputStream fileInputStream2;
        IOException e2;
        Throwable th;
        Exception e3;
        FileOutputStream fileOutputStream2 = null;
        try {
            byte[] b;
            File file = new File(str2);
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[((int) file.length())];
                fileInputStream.read(bArr);
                b = b(str, bArr);
                fileOutputStream = new FileOutputStream(str3);
            } catch (FileNotFoundException e4) {
                e = e4;
                fileOutputStream = null;
                fileInputStream2 = fileInputStream;
                try {
                    e.printStackTrace();
                    try {
                        fileInputStream2.close();
                        fileOutputStream.close();
                        return false;
                    } catch (IOException e22) {
                        e22.printStackTrace();
                        return false;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    fileOutputStream2 = fileOutputStream;
                    try {
                        fileInputStream.close();
                        fileOutputStream2.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                    throw th;
                }
            } catch (IOException e6) {
                e22 = e6;
                try {
                    e22.printStackTrace();
                    try {
                        fileInputStream.close();
                        fileOutputStream2.close();
                        return false;
                    } catch (IOException e222) {
                        e222.printStackTrace();
                        return false;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream.close();
                    fileOutputStream2.close();
                    throw th;
                }
            } catch (Exception e7) {
                e3 = e7;
                e3.printStackTrace();
                try {
                    fileInputStream.close();
                    fileOutputStream2.close();
                    return false;
                } catch (IOException e2222) {
                    e2222.printStackTrace();
                    return false;
                }
            }
            try {
                fileOutputStream.write(b);
                if (fileInputStream == null || fileOutputStream == null) {
                    return true;
                }
                try {
                    fileInputStream.close();
                    fileOutputStream.close();
                    return true;
                } catch (IOException e52) {
                    e52.printStackTrace();
                    return true;
                }
            } catch (FileNotFoundException e8) {
                e = e8;
                fileInputStream2 = fileInputStream;
                e.printStackTrace();
                if (!(fileInputStream2 == null || fileOutputStream == null)) {
                    fileInputStream2.close();
                    fileOutputStream.close();
                }
                return false;
            } catch (IOException e9) {
                e2222 = e9;
                fileOutputStream2 = fileOutputStream;
                e2222.printStackTrace();
                if (!(fileInputStream == null || fileOutputStream2 == null)) {
                    fileInputStream.close();
                    fileOutputStream2.close();
                }
                return false;
            } catch (Exception e10) {
                e3 = e10;
                fileOutputStream2 = fileOutputStream;
                e3.printStackTrace();
                if (!(fileInputStream == null || fileOutputStream2 == null)) {
                    fileInputStream.close();
                    fileOutputStream2.close();
                }
                return false;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream2 = fileOutputStream;
                if (!(fileInputStream == null || fileOutputStream2 == null)) {
                    fileInputStream.close();
                    fileOutputStream2.close();
                }
                throw th;
            }
        } catch (FileNotFoundException e11) {
            e = e11;
            fileOutputStream = null;
            e.printStackTrace();
            fileInputStream2.close();
            fileOutputStream.close();
            return false;
        } catch (IOException e12) {
            e2222 = e12;
            fileInputStream = null;
            e2222.printStackTrace();
            fileInputStream.close();
            fileOutputStream2.close();
            return false;
        } catch (Exception e13) {
            e3 = e13;
            fileInputStream = null;
            e3.printStackTrace();
            fileInputStream.close();
            fileOutputStream2.close();
            return false;
        } catch (Throwable th5) {
            th = th5;
            fileInputStream = null;
            fileInputStream.close();
            fileOutputStream2.close();
            throw th;
        }
    }

    public static byte[] b(String str, byte[] bArr) {
        return b(a(str.getBytes()), bArr);
    }

    private static byte[] b(byte[] bArr, byte[] bArr2) {
        Key secretKeySpec = new SecretKeySpec(bArr, b);
        Cipher instance = Cipher.getInstance(b);
        instance.init(2, secretKeySpec, new IvParameterSpec(new byte[instance.getBlockSize()]));
        return instance.doFinal(bArr2);
    }
}
