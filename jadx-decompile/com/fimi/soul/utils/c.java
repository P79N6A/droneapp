package com.fimi.soul.utils;

import android.content.Context;
import android.widget.ImageView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.a;
import com.fimi.soul.entity.WifiDistanceFile;
import com.fimi.soul.module.setting.i;
import com.fimi.soul.service.CameraSocketService;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.HashMap;

public class c {
    public static final int a = 58880;
    public static final int b = 58885;
    public static final int c = 58887;
    public static Object d = new Object();

    public static int a(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    public static WifiDistanceFile a(File file) {
        if (file.exists()) {
            HashMap hashMap = new HashMap();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
                String str = "/media";
                WifiDistanceFile wifiDistanceFile = new WifiDistanceFile(str);
                wifiDistanceFile.setType(0);
                wifiDistanceFile.setParentStrDir("/");
                hashMap.put(str, wifiDistanceFile);
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        return wifiDistanceFile;
                    }
                    a.a("line=" + readLine, c.class);
                    String[] a = a(readLine);
                    if (a.length <= 1 || readLine.startsWith("/")) {
                        readLine = "/media/:".equalsIgnoreCase(readLine) ? "/media" : readLine.replace(":", "");
                    } else {
                        WifiDistanceFile wifiDistanceFile2 = new WifiDistanceFile(a[2]);
                        wifiDistanceFile2.setSize(Long.parseLong(a[1]));
                        wifiDistanceFile2.setParentStrDir(str);
                        if (a[0].startsWith("d")) {
                            wifiDistanceFile.setType(0);
                            hashMap.put(str + "/" + a[2], wifiDistanceFile2);
                        } else {
                            wifiDistanceFile.setType(0);
                        }
                        WifiDistanceFile wifiDistanceFile3 = (WifiDistanceFile) hashMap.get(str);
                        if (wifiDistanceFile3 != null) {
                            wifiDistanceFile3.addFile(wifiDistanceFile2);
                            wifiDistanceFile2.setParentDir(wifiDistanceFile3);
                        } else {
                            wifiDistanceFile2.setParentDir(null);
                        }
                        readLine = str;
                    }
                    str = readLine;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
        return null;
    }

    public static void a(Context context, String str, ImageView imageView) {
        if (ao.a(str, context.getResources().getStringArray(R.array.fileEndingImage))) {
            imageView.setImageResource(R.drawable.file_icon_picture);
        } else if (ao.a(str, context.getResources().getStringArray(R.array.fileEndingAudio))) {
            imageView.setImageResource(R.drawable.file_icon_mp3);
        } else if (ao.a(str, context.getResources().getStringArray(R.array.fileEndingVideo))) {
            imageView.setImageResource(R.drawable.file_icon_video);
        } else {
            imageView.setImageResource(R.drawable.file);
        }
    }

    public static void a(DataOutputStream dataOutputStream, String str) {
        a(dataOutputStream, str.getBytes());
    }

    public static void a(DataOutputStream dataOutputStream, byte[] bArr) {
        synchronized (d) {
            if (dataOutputStream != null) {
                try {
                    dataOutputStream.write(bArr);
                    dataOutputStream.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void a(String str, long j, DataInputStream dataInputStream, CameraSocketService cameraSocketService, boolean z) {
        a.a("localFile=" + str + "fileLenth=" + j, c.class);
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        byte[] bArr = new byte[8192];
        long j2 = 0;
        long currentTimeMillis = System.currentTimeMillis();
        cameraSocketService.a(4, z, "0");
        while (true) {
            int read = dataInputStream.read(bArr);
            if (read < 0) {
                break;
            }
            fileOutputStream.write(bArr, 0, read);
            fileOutputStream.flush();
            j2 += (long) read;
            long j3 = (100 * j2) / j;
            if (j2 >= j) {
                break;
            } else if (System.currentTimeMillis() - currentTimeMillis > 2000 && cameraSocketService != null) {
                currentTimeMillis = System.currentTimeMillis();
                cameraSocketService.a(4, z, j3 + "");
            }
        }
        cameraSocketService.a(4, z, i.b);
        fileOutputStream.close();
        a.a("receiveFileName readlen" + j2, CameraSocketService.class);
    }

    public static void a(byte[] bArr) {
        MulticastSocket multicastSocket;
        try {
            multicastSocket = new MulticastSocket();
        } catch (IOException e) {
            e.printStackTrace();
            multicastSocket = null;
        }
        try {
            InetAddress byName = InetAddress.getByName("224.0.0.1");
            if (byName.isMulticastAddress()) {
                DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length, byName, a);
                if (multicastSocket != null) {
                    try {
                        multicastSocket.send(datagramPacket);
                        multicastSocket.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        } catch (UnknownHostException e3) {
            e3.printStackTrace();
        }
    }

    private static String[] a(String str) {
        String[] strArr = new String[3];
        String[] split = str.split(" ");
        if (split.length <= 9) {
            return split;
        }
        String str2 = "";
        int i = 0;
        for (int i2 = 0; i2 < split.length; i2++) {
            if (!"".equalsIgnoreCase(split[i2])) {
                i++;
                if (i == 1) {
                    strArr[0] = split[i2];
                } else if (i == 5) {
                    strArr[1] = split[i2];
                } else if (i >= 9) {
                    str2 = "".equalsIgnoreCase(str2) ? str2 + split[i2] : str2 + " " + split[i2];
                }
            }
        }
        strArr[2] = str2;
        return strArr;
    }

    public static int b(byte[] bArr, int i) {
        return (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16)) | ((bArr[i + 3] & 255) << 24);
    }

    public void a(String str, String str2, int i) {
        try {
            DatagramSocket datagramSocket = new DatagramSocket(b);
            InetAddress byName = InetAddress.getByName(str2);
            byte[] bytes = str.getBytes();
            datagramSocket.send(new DatagramPacket(bytes, bytes.length, byName, i));
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }
}
