package com.tencent.mm.sdk.platformtools;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningServiceInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.Settings.System;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import b.b.a;
import com.facebook.imageutils.JfifUtil;
import com.google.android.gms.drive.e;
import com.google.android.gms.location.places.d;
import com.tencent.mm.algorithm.MD5;
import com.tencent.mm.sdk.plugin.MMPluginProviderConstants.PluginIntent;
import com.tencent.open.yyb.TitleBar;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.Character.UnicodeBlock;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TimeZone;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public final class Util {
    public static final int BEGIN_TIME = 22;
    public static final int BIT_OF_KB = 10;
    public static final int BIT_OF_MB = 20;
    public static final int BYTE_OF_KB = 1024;
    public static final int BYTE_OF_MB = 1048576;
    public static final String CHINA = "zh_CN";
    public static final int DAY = 0;
    public static final int END_TIME = 8;
    public static final String ENGLISH = "en";
    private static final TimeZone GMT = TimeZone.getTimeZone("GMT");
    public static final String HONGKONG = "zh_HK";
    public static final String LANGUAGE_DEFAULT = "language_default";
    public static final int MASK_16BIT = 65535;
    public static final int MASK_32BIT = -1;
    public static final int MASK_4BIT = 15;
    public static final int MASK_8BIT = 255;
    public static final long MAX_32BIT_VALUE = 4294967295L;
    public static final int MAX_ACCOUNT_LENGTH = 20;
    public static final int MAX_DECODE_PICTURE_SIZE = 2764800;
    public static final int MAX_PASSWORD_LENGTH = 9;
    public static final long MILLSECONDS_OF_DAY = 86400000;
    public static final long MILLSECONDS_OF_HOUR = 3600000;
    public static final long MILLSECONDS_OF_MINUTE = 60000;
    public static final long MILLSECONDS_OF_SECOND = 1000;
    public static final long MINUTE_OF_HOUR = 60;
    public static final int MIN_ACCOUNT_LENGTH = 6;
    public static final int MIN_PASSWORD_LENGTH = 4;
    public static final String PHOTO_DEFAULT_EXT = ".jpg";
    public static final long SECOND_OF_MINUTE = 60;
    public static final String TAIWAN = "zh_TW";
    private static final long[] bt = new long[]{300, 200, 300, 200};
    private static final char[] bu = new char[]{'\t', '\n', l.a};
    private static final char[] bv = new char[]{'<', '>', l.e, '\'', '&'};
    private static final String[] bw = new String[]{"&lt;", "&gt;", "&quot;", "&apos;", "&amp;"};

    final class AnonymousClass2 implements OnTouchListener {
        final /* synthetic */ View bx;
        final /* synthetic */ View by;

        AnonymousClass2(View view, View view2) {
            this.bx = view;
            this.by = view2;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            switch (motionEvent.getAction()) {
                case 0:
                    this.bx.setSelected(true);
                    break;
                case 1:
                case 3:
                case 4:
                    this.bx.setSelected(false);
                    break;
                case 2:
                    this.bx.setSelected(this.by.isPressed());
                    break;
            }
            return false;
        }
    }

    private Util() {
    }

    public static String GetHostIp() {
        try {
            Enumeration networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration inetAddresses = ((NetworkInterface) networkInterfaces.nextElement()).getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddress = (InetAddress) inetAddresses.nextElement();
                    if (!inetAddress.isLoopbackAddress()) {
                        return inetAddress.getHostAddress();
                    }
                }
            }
        } catch (SocketException e) {
        } catch (Exception e2) {
        }
        return null;
    }

    public static int UnZipFolder(String str, String str2) {
        try {
            Log.v("XZip", "UnZipFolder(String, String)");
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    String name = nextEntry.getName();
                    if (nextEntry.isDirectory()) {
                        new File(str2 + File.separator + name.substring(0, name.length() - 1)).mkdirs();
                    } else {
                        File file = new File(str2 + File.separator + name);
                        file.createNewFile();
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                            fileOutputStream.flush();
                        }
                        fileOutputStream.close();
                    }
                } else {
                    zipInputStream.close();
                    return 0;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return -1;
        } catch (IOException e2) {
            e2.printStackTrace();
            return -2;
        }
    }

    private static int a(char[] cArr, int i, int i2) {
        int i3 = 0;
        if (i2 > 0) {
            if (cArr[i] != '#') {
                String str = new String(cArr, i, i2);
            } else if (i2 <= 1 || !(cArr[i + 1] == 'x' || cArr[i + 1] == 'X')) {
                try {
                    i3 = Integer.parseInt(new String(cArr, i + 1, i2 - 1), 10);
                } catch (NumberFormatException e) {
                }
            } else {
                try {
                    i3 = Integer.parseInt(new String(cArr, i + 2, i2 - 2), 16);
                } catch (NumberFormatException e2) {
                }
            }
        }
        return i3;
    }

    private static void a(Map<String, String> map, String str, Node node, int i) {
        int i2 = 0;
        if (node.getNodeName().equals("#text")) {
            map.put(str, node.getNodeValue());
        } else if (node.getNodeName().equals("#cdata-section")) {
            map.put(str, node.getNodeValue());
        } else {
            int i3;
            String str2 = str + "." + node.getNodeName() + (i > 0 ? Integer.valueOf(i) : "");
            map.put(str2, node.getNodeValue());
            NamedNodeMap attributes = node.getAttributes();
            if (attributes != null) {
                for (i3 = 0; i3 < attributes.getLength(); i3++) {
                    Node item = attributes.item(i3);
                    map.put(str2 + ".$" + item.getNodeName(), item.getNodeValue());
                }
            }
            HashMap hashMap = new HashMap();
            NodeList childNodes = node.getChildNodes();
            while (i2 < childNodes.getLength()) {
                Node item2 = childNodes.item(i2);
                i3 = nullAsNil((Integer) hashMap.get(item2.getNodeName()));
                a(map, str2, item2, i3);
                hashMap.put(item2.getNodeName(), Integer.valueOf(i3 + 1));
                i2++;
            }
        }
    }

    public static byte[] bmpToByteArray(Bitmap bitmap, boolean z) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(CompressFormat.JPEG, 100, byteArrayOutputStream);
        if (z) {
            bitmap.recycle();
        }
        byte[] toByteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return toByteArray;
    }

    public static boolean checkPermission(Context context, String str) {
        a.a(context);
        String packageName = context.getPackageName();
        boolean z = context.getPackageManager().checkPermission(str, packageName) == 0;
        Log.d("MicroMsg.Util", packageName + " has " + (z ? "permission " : "no permission ") + str);
        return z;
    }

    public static boolean checkSDCardFull() {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return false;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        long blockCount = (long) statFs.getBlockCount();
        long availableBlocks = (long) statFs.getAvailableBlocks();
        if (blockCount <= 0 || blockCount - availableBlocks < 0) {
            return false;
        }
        int i = (int) (((blockCount - availableBlocks) * 100) / blockCount);
        long freeBlocks = ((long) statFs.getFreeBlocks()) * ((long) statFs.getBlockSize());
        Log.d("MicroMsg.Util", "checkSDCardFull per:" + i + " blockCount:" + blockCount + " availCount:" + availableBlocks + " availSize:" + freeBlocks);
        return 95 <= i && freeBlocks <= 52428800;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String convertStreamToString(java.io.InputStream r4) {
        /*
        r0 = new java.io.BufferedReader;
        r1 = new java.io.InputStreamReader;
        r1.<init>(r4);
        r0.<init>(r1);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
    L_0x000f:
        r2 = r0.readLine();	 Catch:{ IOException -> 0x002c }
        if (r2 == 0) goto L_0x0038;
    L_0x0015:
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x002c }
        r3.<init>();	 Catch:{ IOException -> 0x002c }
        r2 = r3.append(r2);	 Catch:{ IOException -> 0x002c }
        r3 = "\n";
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x002c }
        r2 = r2.toString();	 Catch:{ IOException -> 0x002c }
        r1.append(r2);	 Catch:{ IOException -> 0x002c }
        goto L_0x000f;
    L_0x002c:
        r0 = move-exception;
        r0.printStackTrace();	 Catch:{ all -> 0x0046 }
        r4.close();	 Catch:{ IOException -> 0x0041 }
    L_0x0033:
        r0 = r1.toString();
        return r0;
    L_0x0038:
        r4.close();	 Catch:{ IOException -> 0x003c }
        goto L_0x0033;
    L_0x003c:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x0033;
    L_0x0041:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x0033;
    L_0x0046:
        r0 = move-exception;
        r4.close();	 Catch:{ IOException -> 0x004b }
    L_0x004a:
        throw r0;
    L_0x004b:
        r1 = move-exception;
        r1.printStackTrace();
        goto L_0x004a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.sdk.platformtools.Util.convertStreamToString(java.io.InputStream):java.lang.String");
    }

    public static long currentDayInMills() {
        return (nowMilliSecond() / 86400000) * 86400000;
    }

    public static long currentMonthInMills() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), 1);
        gregorianCalendar2.setTimeZone(GMT);
        return gregorianCalendar2.getTimeInMillis();
    }

    public static long currentTicks() {
        return SystemClock.elapsedRealtime();
    }

    public static long currentWeekInMills() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
        gregorianCalendar2.setTimeZone(GMT);
        gregorianCalendar2.add(6, -(gregorianCalendar.get(7) - gregorianCalendar.getFirstDayOfWeek()));
        return gregorianCalendar2.getTimeInMillis();
    }

    public static long currentYearInMills() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(new GregorianCalendar().get(1), 1, 1);
        gregorianCalendar.setTimeZone(GMT);
        return gregorianCalendar.getTimeInMillis();
    }

    public static byte[] decodeHexString(String str) {
        if (str == null || str.length() <= 0) {
            return new byte[0];
        }
        try {
            byte[] bArr = new byte[(str.length() / 2)];
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = (byte) (Integer.parseInt(str.substring(i * 2, (i * 2) + 2), 16) & 255);
            }
            return bArr;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return new byte[0];
        }
    }

    public static String dumpArray(Object[] objArr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object append : objArr) {
            stringBuilder.append(append);
            stringBuilder.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
        return stringBuilder.toString();
    }

    public static String dumpHex(byte[] bArr) {
        int i = 0;
        if (bArr == null) {
            return "(null)";
        }
        char[] cArr = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        int length = bArr.length;
        char[] cArr2 = new char[((length * 3) + (length / 16))];
        int i2 = 0;
        while (i2 < length) {
            byte b = bArr[i2];
            int i3 = i + 1;
            cArr2[i] = l.c;
            i = i3 + 1;
            cArr2[i3] = cArr[(b >>> 4) & 15];
            i3 = i + 1;
            cArr2[i] = cArr[b & 15];
            if (i2 % 16 != 0 || i2 <= 0) {
                i = i3;
            } else {
                i = i3 + 1;
                cArr2[i3] = '\n';
            }
            i2++;
        }
        return new String(cArr2);
    }

    public static String encodeHexString(byte[] bArr) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (bArr != null) {
            for (int i = 0; i < bArr.length; i++) {
                stringBuilder.append(String.format("%02x", new Object[]{Integer.valueOf(bArr[i] & 255)}));
            }
        }
        return stringBuilder.toString();
    }

    public static String escapeSqlValue(String str) {
        return str != null ? str.replace("\\[", "[[]").replace("%", "").replace("\\^", "").replace("'", "").replace("\\{", "").replace("\\}", "").replace("\"", "") : str;
    }

    public static String escapeStringForXml(String str) {
        if (str == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ((charAt >= l.c || charAt == bu[0] || charAt == bu[1] || charAt == bu[2]) && charAt <= '') {
                int length2;
                for (length2 = bv.length - 1; length2 >= 0; length2--) {
                    if (bv[length2] == charAt) {
                        stringBuffer.append(bw[length2]);
                        length2 = 0;
                        break;
                    }
                }
                length2 = 1;
                if (length2 != 0) {
                    stringBuffer.append(charAt);
                }
            } else {
                stringBuffer.append("&#");
                stringBuffer.append(Integer.toString(charAt));
                stringBuffer.append(';');
            }
        }
        return stringBuffer.toString();
    }

    public static String expandEntities(String str) {
        int length = str.length();
        char[] cArr = new char[length];
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        while (i < length) {
            char charAt = str.charAt(i);
            int i4 = i2 + 1;
            cArr[i2] = charAt;
            if (charAt == '&' && i3 == -1) {
                i3 = i4;
            } else if (!(i3 == -1 || Character.isLetter(charAt) || Character.isDigit(charAt) || charAt == '#')) {
                if (charAt == ';') {
                    i2 = a(cArr, i3, (i4 - i3) - 1);
                    if (i2 > 65535) {
                        i4 = i2 - 65536;
                        cArr[i3 - 1] = (char) ((i4 >> 10) + 55296);
                        cArr[i3] = (char) ((i4 & d.bp) + 56320);
                        i3++;
                    } else if (i2 != 0) {
                        cArr[i3 - 1] = (char) i2;
                    } else {
                        i3 = i4;
                    }
                    i4 = i3;
                    i3 = -1;
                } else {
                    i3 = -1;
                }
            }
            i++;
            i2 = i4;
        }
        return new String(cArr, 0, i2);
    }

    public static String formatSecToMin(int i) {
        return String.format("%d:%02d", new Object[]{Long.valueOf(((long) i) / 60), Long.valueOf(((long) i) % 60)});
    }

    public static String formatUnixTime(long j) {
        return new SimpleDateFormat("[yy-MM-dd HH:mm:ss]").format(new Date(1000 * j));
    }

    public static void freeBitmapMap(Map<String, Bitmap> map) {
        for (Entry value : map.entrySet()) {
            Bitmap bitmap = (Bitmap) value.getValue();
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        map.clear();
    }

    public static String getCutPasswordMD5(String str) {
        if (str == null) {
            str = "";
        }
        return str.length() <= 16 ? getFullPasswordMD5(str) : getFullPasswordMD5(str.substring(0, 16));
    }

    public static String getDeviceId(Context context) {
        if (context == null) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return null;
            }
            String deviceId = telephonyManager.getDeviceId();
            return deviceId == null ? null : deviceId.trim();
        } catch (SecurityException e) {
            Log.e("MicroMsg.Util", "getDeviceId failed, security exception");
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String getFullPasswordMD5(String str) {
        return MD5.getMessageDigest(str.getBytes());
    }

    public static int getHex(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return (int) (Long.decode(str).longValue() & 4294967295L);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return i;
        }
    }

    public static Options getImageOptions(String str) {
        boolean z = (str == null || str.equals("")) ? false : true;
        a.a(z);
        Options options = new Options();
        options.inJustDecodeBounds = true;
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            if (decodeFile != null) {
                decodeFile.recycle();
            }
        } catch (OutOfMemoryError e) {
            Log.e("MicroMsg.Util", "decode bitmap failed: " + e.getMessage());
        }
        return options;
    }

    public static Intent getInstallPackIntent(String str, Context context) {
        boolean z = (str == null || str.equals("")) ? false : true;
        a.a(z);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(e.a_);
        intent.setDataAndType(Uri.fromFile(new File(str)), "application/vnd.android.package-archive");
        return intent;
    }

    public static int getInt(String str, int i) {
        if (str != null) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    public static int getIntRandom(int i, int i2) {
        a.a(i > i2);
        return new Random(System.currentTimeMillis()).nextInt((i - i2) + 1) + i2;
    }

    public static String getLine1Number(Context context) {
        if (context != null) {
            try {
                if (((TelephonyManager) context.getSystemService("phone")) == null) {
                    Log.e("MicroMsg.Util", "get line1 number failed, null tm");
                }
            } catch (SecurityException e) {
                Log.e("MicroMsg.Util", "getLine1Number failed, security exception");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public static long getLong(String str, long j) {
        if (str != null) {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return j;
    }

    public static Element getRootElementFromXML(byte[] bArr) {
        try {
            DocumentBuilder newDocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            if (newDocumentBuilder == null) {
                Log.e("MicroMsg.Util", "new Document Builder failed");
                return null;
            }
            try {
                Document parse = newDocumentBuilder.parse(new ByteArrayInputStream(bArr));
                if (parse != null) {
                    return parse.getDocumentElement();
                }
                Log.e("MicroMsg.Util", "new Document failed");
                return null;
            } catch (SAXException e) {
                e.printStackTrace();
                return null;
            } catch (IOException e2) {
                e2.printStackTrace();
                return null;
            }
        } catch (ParserConfigurationException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public static Bitmap getRoundedCornerBitmap(Bitmap bitmap, boolean z, float f) {
        a.a(bitmap);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-4144960);
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        if (z) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static String getSizeKB(long j) {
        if ((j >> 20) > 0) {
            return getSizeMB(j);
        }
        if ((j >> 9) <= 0) {
            return j + "B";
        }
        return (((float) Math.round((((float) j) * TitleBar.SHAREBTN_RIGHT_MARGIN) / 1024.0f)) / TitleBar.SHAREBTN_RIGHT_MARGIN) + "KB";
    }

    public static String getSizeMB(long j) {
        return (((float) Math.round((((float) j) * TitleBar.SHAREBTN_RIGHT_MARGIN) / 1048576.0f)) / TitleBar.SHAREBTN_RIGHT_MARGIN) + "MB";
    }

    public static String getStack() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace == null || stackTrace.length < 2) {
            return "";
        }
        String str = "";
        int i = 1;
        while (i < stackTrace.length && stackTrace[i].getClassName().contains(PluginIntent.APP_PACKAGE_PATTERN)) {
            str = str + "[" + stackTrace[i].getClassName().substring(15) + ":" + stackTrace[i].getMethodName() + "]";
            i++;
        }
        return str;
    }

    public static int getSystemVersion(Context context, int i) {
        return context == null ? i : System.getInt(context.getContentResolver(), "sys.settings_system_version", i);
    }

    public static String getTimeZone() {
        String timeZoneDef = getTimeZoneDef();
        int indexOf = timeZoneDef.indexOf(43);
        if (indexOf == -1) {
            indexOf = timeZoneDef.indexOf(45);
        }
        if (indexOf == -1) {
            return "";
        }
        String substring = timeZoneDef.substring(indexOf, indexOf + 3);
        return substring.charAt(1) == '0' ? substring.substring(0, 1) + substring.substring(2, 3) : substring;
    }

    public static String getTimeZoneDef() {
        int rawOffset = (int) (((long) TimeZone.getDefault().getRawOffset()) / MILLSECONDS_OF_MINUTE);
        char c = SignatureVisitor.EXTENDS;
        if (rawOffset < 0) {
            c = SignatureVisitor.SUPER;
            rawOffset = -rawOffset;
        }
        return String.format("GMT%s%02d:%02d", new Object[]{Character.valueOf(c), Long.valueOf(((long) rawOffset) / 60), Long.valueOf(((long) rawOffset) % 60)});
    }

    public static String getTimeZoneOffset() {
        TimeZone timeZone = TimeZone.getDefault();
        double rawOffset = ((double) (((long) (timeZone.getRawOffset() * 100)) / MILLSECONDS_OF_HOUR)) / 100.0d;
        int i = timeZone.useDaylightTime() ? 1 : 0;
        return String.format("%.2f", new Object[]{Double.valueOf(rawOffset + ((double) i))});
    }

    public static String getTopActivityName(Context context) {
        try {
            return ((RunningTaskInfo) ((ActivityManager) context.getSystemService("activity")).getRunningTasks(1).get(0)).topActivity.getClassName();
        } catch (Exception e) {
            e.printStackTrace();
            return "(null)";
        }
    }

    public static int guessHttpContinueRecvLength(int i) {
        return (((((i - 1) / 1462) + 1) * 52) + 52) + i;
    }

    public static int guessHttpRecvLength(int i) {
        return (((((i - 1) / 1462) + 1) * 52) + JfifUtil.MARKER_RST0) + i;
    }

    public static int guessHttpSendLength(int i) {
        return (((((i - 1) / 1462) + 1) * 52) + 224) + i;
    }

    public static int guessTcpConnectLength() {
        return Opcodes.IRETURN;
    }

    public static int guessTcpDisconnectLength() {
        return Opcodes.IFGE;
    }

    public static int guessTcpRecvLength(int i) {
        return (((((i - 1) / 1462) + 1) * 52) + 40) + i;
    }

    public static int guessTcpSendLength(int i) {
        return (((((i - 1) / 1462) + 1) * 52) + 40) + i;
    }

    public static void installPack(String str, Context context) {
        context.startActivity(getInstallPackIntent(str, context));
    }

    public static boolean isAlpha(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    public static boolean isChinese(char c) {
        UnicodeBlock of = UnicodeBlock.of(c);
        return of == UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || of == UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || of == UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || of == UnicodeBlock.GENERAL_PUNCTUATION || of == UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || of == UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS;
    }

    public static boolean isDayTimeNow() {
        int i = new GregorianCalendar().get(11);
        return ((long) i) >= 6 && ((long) i) < 18;
    }

    public static boolean isImgFile(String str) {
        if (str == null || str.length() == 0) {
            Log.e("MicroMsg.Util", "isImgFile, invalid argument");
            return false;
        } else if (str.length() < 3 || !new File(str).exists()) {
            return false;
        } else {
            Options options = new Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            return options.outWidth > 0 && options.outHeight > 0;
        }
    }

    public static boolean isIntentAvailable(Context context, Intent intent) {
        return context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }

    public static boolean isLockScreen(Context context) {
        try {
            return ((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isNightTime(int i, int i2, int i3) {
        return i2 > i3 ? i >= i2 || i <= i3 : i2 < i3 ? i <= i3 && i >= i2 : true;
    }

    public static boolean isNullOrNil(String str) {
        return str == null || str.length() <= 0;
    }

    public static boolean isNullOrNil(byte[] bArr) {
        return bArr == null || bArr.length <= 0;
    }

    public static boolean isNum(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean isProcessRunning(Context context, String str) {
        for (RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            if (runningAppProcessInfo != null && runningAppProcessInfo.processName != null && runningAppProcessInfo.processName.equals(str)) {
                Log.w("MicroMsg.Util", "process " + str + " is running");
                return true;
            }
        }
        Log.w("MicroMsg.Util", "process " + str + " is not running");
        return false;
    }

    public static boolean isServiceRunning(Context context, String str) {
        for (RunningServiceInfo runningServiceInfo : ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE)) {
            if (runningServiceInfo != null && runningServiceInfo.service != null && runningServiceInfo.service.getClassName().toString().equals(str)) {
                Log.w("MicroMsg.Util", "service " + str + " is running");
                return true;
            }
        }
        Log.w("MicroMsg.Util", "service " + str + " is not running");
        return false;
    }

    public static boolean isTopActivity(Context context) {
        String name = context.getClass().getName();
        String topActivityName = getTopActivityName(context);
        Log.d("MicroMsg.Util", "top activity=" + topActivityName + ", context=" + name);
        return topActivityName.equalsIgnoreCase(name);
    }

    public static boolean isTopApplication(Context context) {
        try {
            String className = ((RunningTaskInfo) ((ActivityManager) context.getSystemService("activity")).getRunningTasks(1).get(0)).topActivity.getClassName();
            CharSequence packageName = context.getPackageName();
            Log.d("MicroMsg.Util", "top activity=" + className + ", context=" + packageName);
            return className.contains(packageName);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isValidAccount(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.length() < 6 || trim.length() > 20 || !isAlpha(trim.charAt(0))) {
            return false;
        }
        for (int i = 0; i < trim.length(); i++) {
            char charAt = trim.charAt(i);
            if (!isAlpha(charAt) && !isNum(charAt) && charAt != SignatureVisitor.SUPER && charAt != '_') {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidEmail(String str) {
        return (str == null || str.length() <= 0) ? false : str.trim().matches("^[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]@[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]\\.[a-zA-Z][a-zA-Z\\.]*[a-zA-Z]$");
    }

    public static boolean isValidPassword(String str) {
        if (str == null || str.length() < 4) {
            return false;
        }
        if (str.length() >= 9) {
            return true;
        }
        try {
            Integer.parseInt(str);
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }

    public static boolean isValidQQNum(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        try {
            long longValue = Long.valueOf(str.trim()).longValue();
            return longValue > 0 && longValue <= 4294967295L;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean jump(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (isIntentAvailable(context, intent)) {
            context.startActivity(intent);
            return true;
        }
        Log.e("MicroMsg.Util", "jump to url failed, " + str);
        return false;
    }

    public static String listToString(List<String> list, String str) {
        if (list == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                stringBuilder.append(((String) list.get(i)).trim());
            } else {
                stringBuilder.append(((String) list.get(i)).trim() + str);
            }
        }
        return stringBuilder.toString();
    }

    public static String mapToXml(String str, LinkedHashMap<String, String> linkedHashMap) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<key>");
        for (Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null) {
                key = "unknow";
            }
            if (value == null) {
                value = "unknow";
            }
            stringBuilder.append("<" + key + ">");
            stringBuilder.append(value);
            stringBuilder.append("</" + key + ">");
        }
        stringBuilder.append("</key>");
        return stringBuilder.toString();
    }

    public static long milliSecondsToNow(long j) {
        return System.currentTimeMillis() - j;
    }

    public static long nowMilliSecond() {
        return System.currentTimeMillis();
    }

    public static long nowSecond() {
        return System.currentTimeMillis() / 1000;
    }

    public static int nullAs(Integer num, int i) {
        return num == null ? i : num.intValue();
    }

    public static long nullAs(Long l, long j) {
        return l == null ? j : l.longValue();
    }

    public static String nullAs(String str, String str2) {
        return str == null ? str2 : str;
    }

    public static boolean nullAs(Boolean bool, boolean z) {
        return bool == null ? z : bool.booleanValue();
    }

    public static boolean nullAsFalse(Boolean bool) {
        return bool == null ? false : bool.booleanValue();
    }

    public static int nullAsInt(Object obj, int i) {
        return obj == null ? i : obj instanceof Integer ? ((Integer) obj).intValue() : obj instanceof Long ? ((Long) obj).intValue() : i;
    }

    public static int nullAsNil(Integer num) {
        return num == null ? 0 : num.intValue();
    }

    public static long nullAsNil(Long l) {
        return l == null ? 0 : l.longValue();
    }

    public static String nullAsNil(String str) {
        return str == null ? "" : str;
    }

    public static boolean nullAsTrue(Boolean bool) {
        return bool == null ? true : bool.booleanValue();
    }

    public static Map<String, String> parseIni(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        Map<String, String> hashMap = new HashMap();
        for (String str2 : str.split("\n")) {
            if (str2 != null && str2.length() > 0) {
                String[] split = str2.trim().split("=", 2);
                if (split != null && split.length >= 2) {
                    String str3 = split[0];
                    Object obj = split[1];
                    if (str3 != null && str3.length() > 0 && str3.matches("^[a-zA-Z0-9_]*")) {
                        hashMap.put(str3, obj);
                    }
                }
            }
        }
        return hashMap;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, java.lang.String> parseXml(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
        r6 = 0;
        r0 = 0;
        if (r7 == 0) goto L_0x000a;
    L_0x0004:
        r1 = r7.length();
        if (r1 > 0) goto L_0x000b;
    L_0x000a:
        return r0;
    L_0x000b:
        r2 = new java.util.HashMap;
        r2.<init>();
        r1 = javax.xml.parsers.DocumentBuilderFactory.newInstance();
        r1 = r1.newDocumentBuilder();	 Catch:{ ParserConfigurationException -> 0x0022 }
        if (r1 != 0) goto L_0x0027;
    L_0x001a:
        r1 = "MicroMsg.Util";
        r2 = "new Document Builder failed";
        com.tencent.mm.sdk.platformtools.Log.e(r1, r2);
        goto L_0x000a;
    L_0x0022:
        r1 = move-exception;
        r1.printStackTrace();
        goto L_0x000a;
    L_0x0027:
        r3 = new org.xml.sax.InputSource;	 Catch:{ DOMException -> 0x004b, SAXException -> 0x0051, IOException -> 0x0056, Exception -> 0x005b }
        r4 = new java.io.ByteArrayInputStream;	 Catch:{ DOMException -> 0x004b, SAXException -> 0x0051, IOException -> 0x0056, Exception -> 0x005b }
        r5 = r7.getBytes();	 Catch:{ DOMException -> 0x004b, SAXException -> 0x0051, IOException -> 0x0056, Exception -> 0x005b }
        r4.<init>(r5);	 Catch:{ DOMException -> 0x004b, SAXException -> 0x0051, IOException -> 0x0056, Exception -> 0x005b }
        r3.<init>(r4);	 Catch:{ DOMException -> 0x004b, SAXException -> 0x0051, IOException -> 0x0056, Exception -> 0x005b }
        if (r9 == 0) goto L_0x003a;
    L_0x0037:
        r3.setEncoding(r9);	 Catch:{ DOMException -> 0x004b, SAXException -> 0x0051, IOException -> 0x0056, Exception -> 0x005b }
    L_0x003a:
        r3 = r1.parse(r3);	 Catch:{ DOMException -> 0x004b, SAXException -> 0x0051, IOException -> 0x0056, Exception -> 0x005b }
        r3.normalize();	 Catch:{ DOMException -> 0x00ed, SAXException -> 0x0051, IOException -> 0x0056, Exception -> 0x005b }
    L_0x0041:
        if (r3 != 0) goto L_0x0060;
    L_0x0043:
        r1 = "MicroMsg.Util";
        r2 = "new Document failed";
        com.tencent.mm.sdk.platformtools.Log.e(r1, r2);
        goto L_0x000a;
    L_0x004b:
        r1 = move-exception;
        r3 = r0;
    L_0x004d:
        r1.printStackTrace();
        goto L_0x0041;
    L_0x0051:
        r1 = move-exception;
        r1.printStackTrace();
        goto L_0x000a;
    L_0x0056:
        r1 = move-exception;
        r1.printStackTrace();
        goto L_0x000a;
    L_0x005b:
        r1 = move-exception;
        r1.printStackTrace();
        goto L_0x000a;
    L_0x0060:
        r1 = r3.getDocumentElement();
        if (r1 != 0) goto L_0x006e;
    L_0x0066:
        r1 = "MicroMsg.Util";
        r2 = "getDocumentElement failed";
        com.tencent.mm.sdk.platformtools.Log.e(r1, r2);
        goto L_0x000a;
    L_0x006e:
        if (r8 == 0) goto L_0x00bf;
    L_0x0070:
        r3 = r1.getNodeName();
        r3 = r8.equals(r3);
        if (r3 == 0) goto L_0x00bf;
    L_0x007a:
        r0 = "";
        a(r2, r0, r1, r6);
    L_0x007f:
        r0 = r2.entrySet();
        r3 = r0.iterator();
    L_0x0087:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x00ea;
    L_0x008d:
        r0 = r3.next();
        r1 = r0;
        r1 = (java.util.Map.Entry) r1;
        r4 = "MicroMsg.Util";
        r5 = new java.lang.StringBuilder;
        r0 = "key=";
        r5.<init>(r0);
        r0 = r1.getKey();
        r0 = (java.lang.String) r0;
        r0 = r5.append(r0);
        r5 = " value=";
        r5 = r0.append(r5);
        r0 = r1.getValue();
        r0 = (java.lang.String) r0;
        r0 = r5.append(r0);
        r0 = r0.toString();
        com.tencent.mm.sdk.platformtools.Log.v(r4, r0);
        goto L_0x0087;
    L_0x00bf:
        r1 = r1.getElementsByTagName(r8);
        r3 = r1.getLength();
        if (r3 > 0) goto L_0x00d2;
    L_0x00c9:
        r1 = "MicroMsg.Util";
        r2 = "parse item null";
        com.tencent.mm.sdk.platformtools.Log.e(r1, r2);
        goto L_0x000a;
    L_0x00d2:
        r0 = r1.getLength();
        r3 = 1;
        if (r0 <= r3) goto L_0x00e0;
    L_0x00d9:
        r0 = "MicroMsg.Util";
        r3 = "parse items more than one";
        com.tencent.mm.sdk.platformtools.Log.w(r0, r3);
    L_0x00e0:
        r0 = "";
        r1 = r1.item(r6);
        a(r2, r0, r1, r6);
        goto L_0x007f;
    L_0x00ea:
        r0 = r2;
        goto L_0x000a;
    L_0x00ed:
        r1 = move-exception;
        goto L_0x004d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.sdk.platformtools.Util.parseXml(java.lang.String, java.lang.String, java.lang.String):java.util.Map<java.lang.String, java.lang.String>");
    }

    public static MediaPlayer playSound(Context context, int i, OnCompletionListener onCompletionListener) {
        try {
            AssetFileDescriptor openFd = context.getAssets().openFd(context.getString(i));
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
            openFd.close();
            mediaPlayer.prepare();
            mediaPlayer.setLooping(false);
            mediaPlayer.start();
            mediaPlayer.setOnCompletionListener(onCompletionListener);
            return mediaPlayer;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void playSound(Context context, int i) {
        playSound(context, i, new OnCompletionListener() {
            public final void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
    }

    public static String processXml(String str) {
        return (str == null || str.length() == 0 || VERSION.SDK_INT >= 8) ? str : expandEntities(str);
    }

    public static void saveBitmapToImage(Bitmap bitmap, int i, CompressFormat compressFormat, String str, String str2, boolean z) {
        boolean z2 = (str == null || str2 == null) ? false : true;
        a.a(z2);
        Log.d("MicroMsg.Util", "saving to " + str + str2);
        File file = new File(str + str2);
        file.createNewFile();
        try {
            OutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(compressFormat, i, fileOutputStream);
            fileOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void saveBitmapToImage(Bitmap bitmap, int i, CompressFormat compressFormat, String str, boolean z) {
        FileOutputStream fileOutputStream;
        FileNotFoundException e;
        Throwable th;
        a.a(!isNullOrNil(str));
        Log.d("MicroMsg.Util", "saving to " + str);
        File file = new File(str);
        file.createNewFile();
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(compressFormat, i, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (FileNotFoundException e2) {
                e = e2;
                try {
                    e.printStackTrace();
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream.close();
                    throw th;
                }
            }
        } catch (FileNotFoundException e3) {
            e = e3;
            fileOutputStream = null;
            e.printStackTrace();
            fileOutputStream.close();
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            fileOutputStream.close();
            throw th;
        }
    }

    public static long secondsToNow(long j) {
        return (System.currentTimeMillis() / 1000) - j;
    }

    public static void selectPicture(Context context, int i) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        ((Activity) context).startActivityForResult(Intent.createChooser(intent, null), i);
    }

    public static void shake(Context context, boolean z) {
        Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
        if (vibrator != null) {
            if (z) {
                vibrator.vibrate(bt, -1);
            } else {
                vibrator.cancel();
            }
        }
    }

    public static int[] splitToIntArray(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(":");
        List arrayList = new ArrayList();
        for (String str2 : split) {
            if (str2 != null && str2.length() > 0) {
                try {
                    arrayList.add(Integer.valueOf(Integer.valueOf(str2).intValue()));
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.e("MicroMsg.Util", "invalid port num, ignore");
                }
            }
        }
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        return iArr;
    }

    public static List<String> stringsToList(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        List<String> arrayList = new ArrayList();
        for (Object add : strArr) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public static long ticksToNow(long j) {
        return SystemClock.elapsedRealtime() - j;
    }

    public static void transClickToSelect(View view, View view2) {
        view.setOnTouchListener(new AnonymousClass2(view2, view));
    }
}
