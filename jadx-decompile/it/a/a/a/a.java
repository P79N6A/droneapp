package it.a.a.a;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;

class a {
    static String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    static char b = SignatureVisitor.INSTANCEOF;

    a() {
    }

    public static String a(String str) {
        try {
            return new String(a(str.getBytes()), "ASCII");
        } catch (Throwable e) {
            throw new RuntimeException("ASCII is not supported!", e);
        }
    }

    public static String a(String str, String str2) {
        try {
            try {
                return new String(a(str.getBytes(str2)), "ASCII");
            } catch (Throwable e) {
                throw new RuntimeException("ASCII is not supported!", e);
            }
        } catch (Throwable e2) {
            throw new RuntimeException(new StringBuffer().append("Unsupported charset: ").append(str2).toString(), e2);
        }
    }

    public static void a(File file, File file2) {
        OutputStream fileOutputStream;
        Throwable th;
        InputStream inputStream = null;
        try {
            InputStream fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    a(fileInputStream, fileOutputStream);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                        }
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    inputStream = fileInputStream;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th5) {
                        }
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th6) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                fileOutputStream = null;
                inputStream = fileInputStream;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            fileOutputStream = null;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public static void a(File file, File file2, int i) {
        OutputStream fileOutputStream;
        Throwable th;
        InputStream inputStream = null;
        try {
            InputStream fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    a(fileInputStream, fileOutputStream, i);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                        }
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    inputStream = fileInputStream;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th5) {
                        }
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th6) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                fileOutputStream = null;
                inputStream = fileInputStream;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            fileOutputStream = null;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public static void a(InputStream inputStream, OutputStream outputStream) {
        a(inputStream, outputStream, 0);
    }

    public static void a(InputStream inputStream, OutputStream outputStream, int i) {
        OutputStream cVar = new c(outputStream, i);
        c(inputStream, cVar);
        cVar.a();
    }

    public static byte[] a(byte[] bArr) {
        return a(bArr, 0);
    }

    public static byte[] a(byte[] bArr, int i) {
        InputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a(byteArrayInputStream, byteArrayOutputStream, i);
            try {
                byteArrayInputStream.close();
            } catch (Throwable th) {
            }
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable e) {
            throw new RuntimeException("Unexpected I/O error", e);
        } catch (Throwable th3) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th4) {
            }
            byteArrayOutputStream.close();
        }
    }

    public static String b(String str) {
        try {
            return new String(b(str.getBytes("ASCII")));
        } catch (Throwable e) {
            throw new RuntimeException("ASCII is not supported!", e);
        }
    }

    public static String b(String str, String str2) {
        try {
            try {
                return new String(b(str.getBytes("ASCII")), str2);
            } catch (Throwable e) {
                throw new RuntimeException(new StringBuffer().append("Unsupported charset: ").append(str2).toString(), e);
            }
        } catch (Throwable e2) {
            throw new RuntimeException("ASCII is not supported!", e2);
        }
    }

    public static void b(File file, File file2) {
        OutputStream fileOutputStream;
        Throwable th;
        InputStream inputStream = null;
        try {
            InputStream fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    b(fileInputStream, fileOutputStream);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                        }
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    inputStream = fileInputStream;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th5) {
                        }
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th6) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                fileOutputStream = null;
                inputStream = fileInputStream;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            fileOutputStream = null;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public static void b(InputStream inputStream, OutputStream outputStream) {
        c(new b(inputStream), outputStream);
    }

    public static byte[] b(byte[] bArr) {
        InputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(byteArrayInputStream, byteArrayOutputStream);
            try {
                byteArrayInputStream.close();
            } catch (Throwable th) {
            }
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable e) {
            throw new RuntimeException("Unexpected I/O error", e);
        } catch (Throwable th3) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th4) {
            }
            byteArrayOutputStream.close();
        }
    }

    private static void c(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }
}
