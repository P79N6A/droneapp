package com.fimi.soul.utils;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import com.fimi.soul.base.a;
import com.fimi.soul.entity.WifiDistanceFile;
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

public class c
{
  public static final int a = 58880;
  public static final int b = 58885;
  public static final int c = 58887;
  public static Object d = new Object();
  
  public static int a(byte[] paramArrayOfByte, int paramInt)
  {
    return paramArrayOfByte[paramInt] & 0xFF | (paramArrayOfByte[(paramInt + 1)] & 0xFF) << 8;
  }
  
  public static WifiDistanceFile a(File paramFile)
  {
    HashMap localHashMap;
    if (paramFile.exists()) {
      localHashMap = new HashMap();
    }
    try
    {
      BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(paramFile), "UTF-8"));
      paramFile = "/media";
      WifiDistanceFile localWifiDistanceFile = new WifiDistanceFile("/media");
      localWifiDistanceFile.setType(0);
      localWifiDistanceFile.setParentStrDir("/");
      localHashMap.put("/media", localWifiDistanceFile);
      Object localObject2;
      for (;;)
      {
        localObject2 = localBufferedReader.readLine();
        if (localObject2 != null)
        {
          a.a("line=" + (String)localObject2, c.class);
          Object localObject1 = a((String)localObject2);
          if ((localObject1.length > 1) && (!((String)localObject2).startsWith("/")))
          {
            localObject2 = new WifiDistanceFile(localObject1[2]);
            ((WifiDistanceFile)localObject2).setSize(Long.parseLong(localObject1[1]));
            ((WifiDistanceFile)localObject2).setParentStrDir(paramFile);
            if (localObject1[0].startsWith("d"))
            {
              localWifiDistanceFile.setType(0);
              localHashMap.put(paramFile + "/" + localObject1[2], localObject2);
            }
            for (;;)
            {
              localObject1 = (WifiDistanceFile)localHashMap.get(paramFile);
              if (localObject1 == null) {
                break;
              }
              ((WifiDistanceFile)localObject1).addFile((WifiDistanceFile)localObject2);
              ((WifiDistanceFile)localObject2).setParentDir((WifiDistanceFile)localObject1);
              break label316;
              localWifiDistanceFile.setType(0);
            }
          }
        }
      }
    }
    catch (FileNotFoundException paramFile)
    {
      paramFile.printStackTrace();
      return null;
      ((WifiDistanceFile)localObject2).setParentDir(null);
    }
    catch (UnsupportedEncodingException paramFile)
    {
      for (;;)
      {
        paramFile.printStackTrace();
      }
      if ("/media/:".equalsIgnoreCase((String)localObject2))
      {
        paramFile = "/media";
      }
      else
      {
        paramFile = ((String)localObject2).replace(":", "");
        break label316;
        return localWifiDistanceFile;
      }
    }
    catch (IOException paramFile)
    {
      for (;;)
      {
        paramFile.printStackTrace();
      }
    }
  }
  
  public static void a(Context paramContext, String paramString, ImageView paramImageView)
  {
    if (ao.a(paramString, paramContext.getResources().getStringArray(2131558409)))
    {
      paramImageView.setImageResource(2130837930);
      return;
    }
    if (ao.a(paramString, paramContext.getResources().getStringArray(2131558408)))
    {
      paramImageView.setImageResource(2130837929);
      return;
    }
    if (ao.a(paramString, paramContext.getResources().getStringArray(2131558410)))
    {
      paramImageView.setImageResource(2130837931);
      return;
    }
    paramImageView.setImageResource(2130837928);
  }
  
  public static void a(DataOutputStream paramDataOutputStream, String paramString)
  {
    a(paramDataOutputStream, paramString.getBytes());
  }
  
  public static void a(DataOutputStream paramDataOutputStream, byte[] paramArrayOfByte)
  {
    Object localObject = d;
    if (paramDataOutputStream != null) {}
    try
    {
      paramDataOutputStream.write(paramArrayOfByte);
      paramDataOutputStream.flush();
      return;
    }
    catch (IOException paramDataOutputStream)
    {
      for (;;)
      {
        paramDataOutputStream.printStackTrace();
      }
    }
    finally {}
  }
  
  public static void a(String paramString, long paramLong, DataInputStream paramDataInputStream, CameraSocketService paramCameraSocketService, boolean paramBoolean)
  {
    a.a("localFile=" + paramString + "fileLenth=" + paramLong, c.class);
    paramString = new FileOutputStream(paramString);
    byte[] arrayOfByte = new byte[' '];
    long l1 = 0L;
    long l2 = System.currentTimeMillis();
    paramCameraSocketService.a(4, paramBoolean, "0");
    for (;;)
    {
      int i = paramDataInputStream.read(arrayOfByte);
      long l3 = l1;
      long l4;
      if (i >= 0)
      {
        paramString.write(arrayOfByte, 0, i);
        paramString.flush();
        l3 = l1 + i;
        l4 = 100L * l3 / paramLong;
        if (l3 >= paramLong) {
          paramCameraSocketService.a(4, paramBoolean, "100");
        }
      }
      else
      {
        paramString.close();
        a.a("receiveFileName readlen" + l3, CameraSocketService.class);
        return;
      }
      l1 = l3;
      if (System.currentTimeMillis() - l2 > 2000L)
      {
        l1 = l3;
        if (paramCameraSocketService != null)
        {
          l2 = System.currentTimeMillis();
          paramCameraSocketService.a(4, paramBoolean, l4 + "");
          l1 = l3;
        }
      }
    }
  }
  
  public static void a(byte[] paramArrayOfByte)
  {
    try
    {
      MulticastSocket localMulticastSocket = new MulticastSocket();
    }
    catch (IOException localIOException)
    {
      try
      {
        InetAddress localInetAddress = InetAddress.getByName("224.0.0.1");
        boolean bool = localInetAddress.isMulticastAddress();
        if (!bool) {}
        Object localObject;
        do
        {
          return;
          localIOException = localIOException;
          localIOException.printStackTrace();
          localObject = null;
          break;
          paramArrayOfByte = new DatagramPacket(paramArrayOfByte, paramArrayOfByte.length, localInetAddress, 58880);
        } while (localObject == null);
        try
        {
          ((MulticastSocket)localObject).send(paramArrayOfByte);
          ((MulticastSocket)localObject).close();
          return;
        }
        catch (IOException paramArrayOfByte)
        {
          paramArrayOfByte.printStackTrace();
          return;
        }
        return;
      }
      catch (UnknownHostException paramArrayOfByte)
      {
        paramArrayOfByte.printStackTrace();
      }
    }
  }
  
  private static String[] a(String paramString)
  {
    String[] arrayOfString1 = new String[3];
    String[] arrayOfString2 = paramString.split(" ");
    if (arrayOfString2.length > 9)
    {
      String str = "";
      int i = 0;
      int j = 0;
      if (i < arrayOfString2.length)
      {
        if ("".equalsIgnoreCase(arrayOfString2[i])) {
          paramString = str;
        }
        for (;;)
        {
          i += 1;
          str = paramString;
          break;
          int k = j + 1;
          if (k == 1)
          {
            arrayOfString1[0] = arrayOfString2[i];
            paramString = str;
            j = k;
          }
          else if (k == 5)
          {
            arrayOfString1[1] = arrayOfString2[i];
            paramString = str;
            j = k;
          }
          else
          {
            paramString = str;
            j = k;
            if (k >= 9) {
              if ("".equalsIgnoreCase(str))
              {
                paramString = str + arrayOfString2[i];
                j = k;
              }
              else
              {
                paramString = str + " " + arrayOfString2[i];
                j = k;
              }
            }
          }
        }
      }
      arrayOfString1[2] = str;
      return arrayOfString1;
    }
    return arrayOfString2;
  }
  
  public static int b(byte[] paramArrayOfByte, int paramInt)
  {
    return paramArrayOfByte[paramInt] & 0xFF | (paramArrayOfByte[(paramInt + 1)] & 0xFF) << 8 | (paramArrayOfByte[(paramInt + 2)] & 0xFF) << 16 | (paramArrayOfByte[(paramInt + 3)] & 0xFF) << 24;
  }
  
  public void a(String paramString1, String paramString2, int paramInt)
  {
    try
    {
      DatagramSocket localDatagramSocket = new DatagramSocket(58885);
      paramString2 = InetAddress.getByName(paramString2);
      paramString1 = paramString1.getBytes();
      localDatagramSocket.send(new DatagramPacket(paramString1, paramString1.length, paramString2, paramInt));
      return;
    }
    catch (SocketException paramString1)
    {
      paramString1.printStackTrace();
      return;
    }
    catch (UnknownHostException paramString1)
    {
      paramString1.printStackTrace();
      return;
    }
    catch (IOException paramString1)
    {
      paramString1.printStackTrace();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */