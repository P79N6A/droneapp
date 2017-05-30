package com.fimi.kernel.utils;

import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class a
{
  private static int a = 128;
  private static String b = "AES";
  
  /* Error */
  public static boolean a(String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore 6
    //   6: aconst_null
    //   7: astore 4
    //   9: aconst_null
    //   10: astore 7
    //   12: aconst_null
    //   13: astore_3
    //   14: new 29	java/io/File
    //   17: dup
    //   18: aload_1
    //   19: invokespecial 32	java/io/File:<init>	(Ljava/lang/String;)V
    //   22: astore 8
    //   24: new 34	java/io/FileInputStream
    //   27: dup
    //   28: aload 8
    //   30: invokespecial 37	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   33: astore_1
    //   34: aload 7
    //   36: astore 4
    //   38: aload_1
    //   39: astore_3
    //   40: aload 8
    //   42: invokevirtual 41	java/io/File:length	()J
    //   45: l2i
    //   46: newarray <illegal type>
    //   48: astore 8
    //   50: aload 7
    //   52: astore 4
    //   54: aload_1
    //   55: astore_3
    //   56: aload_1
    //   57: aload 8
    //   59: invokevirtual 45	java/io/FileInputStream:read	([B)I
    //   62: pop
    //   63: aload 7
    //   65: astore 4
    //   67: aload_1
    //   68: astore_3
    //   69: aload_0
    //   70: aload 8
    //   72: invokestatic 48	com/fimi/kernel/utils/a:a	(Ljava/lang/String;[B)[B
    //   75: astore 8
    //   77: aload 7
    //   79: astore 4
    //   81: aload_1
    //   82: astore_3
    //   83: new 50	java/io/FileOutputStream
    //   86: dup
    //   87: aload_2
    //   88: invokespecial 51	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   91: astore_0
    //   92: aload_0
    //   93: aload 8
    //   95: invokevirtual 55	java/io/FileOutputStream:write	([B)V
    //   98: aload_1
    //   99: ifnull +15 -> 114
    //   102: aload_0
    //   103: ifnull +11 -> 114
    //   106: aload_1
    //   107: invokevirtual 58	java/io/FileInputStream:close	()V
    //   110: aload_0
    //   111: invokevirtual 59	java/io/FileOutputStream:close	()V
    //   114: iconst_1
    //   115: ireturn
    //   116: astore_0
    //   117: aload_0
    //   118: invokevirtual 62	java/io/IOException:printStackTrace	()V
    //   121: iconst_1
    //   122: ireturn
    //   123: astore_2
    //   124: aconst_null
    //   125: astore_0
    //   126: aload_3
    //   127: astore_1
    //   128: aload_2
    //   129: invokevirtual 63	java/io/FileNotFoundException:printStackTrace	()V
    //   132: aload_1
    //   133: ifnull +15 -> 148
    //   136: aload_0
    //   137: ifnull +11 -> 148
    //   140: aload_1
    //   141: invokevirtual 58	java/io/FileInputStream:close	()V
    //   144: aload_0
    //   145: invokevirtual 59	java/io/FileOutputStream:close	()V
    //   148: iconst_0
    //   149: ireturn
    //   150: astore_0
    //   151: aload_0
    //   152: invokevirtual 62	java/io/IOException:printStackTrace	()V
    //   155: iconst_0
    //   156: ireturn
    //   157: astore_0
    //   158: aconst_null
    //   159: astore_1
    //   160: aload 5
    //   162: astore_2
    //   163: aload_2
    //   164: astore 4
    //   166: aload_1
    //   167: astore_3
    //   168: aload_0
    //   169: invokevirtual 62	java/io/IOException:printStackTrace	()V
    //   172: aload_1
    //   173: ifnull +15 -> 188
    //   176: aload_2
    //   177: ifnull +11 -> 188
    //   180: aload_1
    //   181: invokevirtual 58	java/io/FileInputStream:close	()V
    //   184: aload_2
    //   185: invokevirtual 59	java/io/FileOutputStream:close	()V
    //   188: iconst_0
    //   189: ireturn
    //   190: astore_0
    //   191: aload_0
    //   192: invokevirtual 62	java/io/IOException:printStackTrace	()V
    //   195: iconst_0
    //   196: ireturn
    //   197: astore_0
    //   198: aconst_null
    //   199: astore_1
    //   200: aload 6
    //   202: astore_2
    //   203: aload_2
    //   204: astore 4
    //   206: aload_1
    //   207: astore_3
    //   208: aload_0
    //   209: invokevirtual 64	java/lang/Exception:printStackTrace	()V
    //   212: aload_1
    //   213: ifnull +15 -> 228
    //   216: aload_2
    //   217: ifnull +11 -> 228
    //   220: aload_1
    //   221: invokevirtual 58	java/io/FileInputStream:close	()V
    //   224: aload_2
    //   225: invokevirtual 59	java/io/FileOutputStream:close	()V
    //   228: iconst_0
    //   229: ireturn
    //   230: astore_0
    //   231: aload_0
    //   232: invokevirtual 62	java/io/IOException:printStackTrace	()V
    //   235: iconst_0
    //   236: ireturn
    //   237: astore_0
    //   238: aconst_null
    //   239: astore_1
    //   240: aload_1
    //   241: ifnull +17 -> 258
    //   244: aload 4
    //   246: ifnull +12 -> 258
    //   249: aload_1
    //   250: invokevirtual 58	java/io/FileInputStream:close	()V
    //   253: aload 4
    //   255: invokevirtual 59	java/io/FileOutputStream:close	()V
    //   258: aload_0
    //   259: athrow
    //   260: astore_1
    //   261: aload_1
    //   262: invokevirtual 62	java/io/IOException:printStackTrace	()V
    //   265: goto -7 -> 258
    //   268: astore_0
    //   269: aload_3
    //   270: astore_1
    //   271: goto -31 -> 240
    //   274: astore_2
    //   275: aload_0
    //   276: astore 4
    //   278: aload_2
    //   279: astore_0
    //   280: goto -40 -> 240
    //   283: astore_2
    //   284: aload_0
    //   285: astore 4
    //   287: aload_2
    //   288: astore_0
    //   289: goto -49 -> 240
    //   292: astore_0
    //   293: aload 6
    //   295: astore_2
    //   296: goto -93 -> 203
    //   299: astore_3
    //   300: aload_0
    //   301: astore_2
    //   302: aload_3
    //   303: astore_0
    //   304: goto -101 -> 203
    //   307: astore_0
    //   308: aload 5
    //   310: astore_2
    //   311: goto -148 -> 163
    //   314: astore_3
    //   315: aload_0
    //   316: astore_2
    //   317: aload_3
    //   318: astore_0
    //   319: goto -156 -> 163
    //   322: astore_2
    //   323: aconst_null
    //   324: astore_0
    //   325: goto -197 -> 128
    //   328: astore_2
    //   329: goto -201 -> 128
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	332	0	paramString1	String
    //   0	332	1	paramString2	String
    //   0	332	2	paramString3	String
    //   13	257	3	str	String
    //   299	4	3	localException	Exception
    //   314	4	3	localIOException	java.io.IOException
    //   7	279	4	localObject1	Object
    //   1	308	5	localObject2	Object
    //   4	290	6	localObject3	Object
    //   10	68	7	localObject4	Object
    //   22	72	8	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   106	114	116	java/io/IOException
    //   14	34	123	java/io/FileNotFoundException
    //   140	148	150	java/io/IOException
    //   14	34	157	java/io/IOException
    //   180	188	190	java/io/IOException
    //   14	34	197	java/lang/Exception
    //   220	228	230	java/io/IOException
    //   14	34	237	finally
    //   249	258	260	java/io/IOException
    //   40	50	268	finally
    //   56	63	268	finally
    //   69	77	268	finally
    //   83	92	268	finally
    //   168	172	268	finally
    //   208	212	268	finally
    //   92	98	274	finally
    //   128	132	283	finally
    //   40	50	292	java/lang/Exception
    //   56	63	292	java/lang/Exception
    //   69	77	292	java/lang/Exception
    //   83	92	292	java/lang/Exception
    //   92	98	299	java/lang/Exception
    //   40	50	307	java/io/IOException
    //   56	63	307	java/io/IOException
    //   69	77	307	java/io/IOException
    //   83	92	307	java/io/IOException
    //   92	98	314	java/io/IOException
    //   40	50	322	java/io/FileNotFoundException
    //   56	63	322	java/io/FileNotFoundException
    //   69	77	322	java/io/FileNotFoundException
    //   83	92	322	java/io/FileNotFoundException
    //   92	98	328	java/io/FileNotFoundException
  }
  
  public static byte[] a(String paramString, byte[] paramArrayOfByte)
  {
    return a(a(paramString.getBytes()), paramArrayOfByte);
  }
  
  private static byte[] a(byte[] paramArrayOfByte)
  {
    KeyGenerator localKeyGenerator = KeyGenerator.getInstance(b);
    SecureRandom localSecureRandom = SecureRandom.getInstance("SHA1PRNG", "Crypto");
    localSecureRandom.setSeed(paramArrayOfByte);
    localKeyGenerator.init(a, localSecureRandom);
    return localKeyGenerator.generateKey().getEncoded();
  }
  
  private static byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    paramArrayOfByte1 = new SecretKeySpec(paramArrayOfByte1, b);
    Cipher localCipher = Cipher.getInstance(b);
    localCipher.init(1, paramArrayOfByte1, new IvParameterSpec(new byte[localCipher.getBlockSize()]));
    return localCipher.doFinal(paramArrayOfByte2);
  }
  
  /* Error */
  public static boolean b(String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore 6
    //   6: aconst_null
    //   7: astore 4
    //   9: aconst_null
    //   10: astore 7
    //   12: aconst_null
    //   13: astore_3
    //   14: new 29	java/io/File
    //   17: dup
    //   18: aload_1
    //   19: invokespecial 32	java/io/File:<init>	(Ljava/lang/String;)V
    //   22: astore 8
    //   24: new 34	java/io/FileInputStream
    //   27: dup
    //   28: aload 8
    //   30: invokespecial 37	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   33: astore_1
    //   34: aload 7
    //   36: astore 4
    //   38: aload_1
    //   39: astore_3
    //   40: aload 8
    //   42: invokevirtual 41	java/io/File:length	()J
    //   45: l2i
    //   46: newarray <illegal type>
    //   48: astore 8
    //   50: aload 7
    //   52: astore 4
    //   54: aload_1
    //   55: astore_3
    //   56: aload_1
    //   57: aload 8
    //   59: invokevirtual 45	java/io/FileInputStream:read	([B)I
    //   62: pop
    //   63: aload 7
    //   65: astore 4
    //   67: aload_1
    //   68: astore_3
    //   69: aload_0
    //   70: aload 8
    //   72: invokestatic 133	com/fimi/kernel/utils/a:b	(Ljava/lang/String;[B)[B
    //   75: astore 8
    //   77: aload 7
    //   79: astore 4
    //   81: aload_1
    //   82: astore_3
    //   83: new 50	java/io/FileOutputStream
    //   86: dup
    //   87: aload_2
    //   88: invokespecial 51	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   91: astore_0
    //   92: aload_0
    //   93: aload 8
    //   95: invokevirtual 55	java/io/FileOutputStream:write	([B)V
    //   98: aload_1
    //   99: ifnull +15 -> 114
    //   102: aload_0
    //   103: ifnull +11 -> 114
    //   106: aload_1
    //   107: invokevirtual 58	java/io/FileInputStream:close	()V
    //   110: aload_0
    //   111: invokevirtual 59	java/io/FileOutputStream:close	()V
    //   114: iconst_1
    //   115: ireturn
    //   116: astore_0
    //   117: aload_0
    //   118: invokevirtual 62	java/io/IOException:printStackTrace	()V
    //   121: iconst_1
    //   122: ireturn
    //   123: astore_2
    //   124: aconst_null
    //   125: astore_0
    //   126: aload_3
    //   127: astore_1
    //   128: aload_2
    //   129: invokevirtual 63	java/io/FileNotFoundException:printStackTrace	()V
    //   132: aload_1
    //   133: ifnull +15 -> 148
    //   136: aload_0
    //   137: ifnull +11 -> 148
    //   140: aload_1
    //   141: invokevirtual 58	java/io/FileInputStream:close	()V
    //   144: aload_0
    //   145: invokevirtual 59	java/io/FileOutputStream:close	()V
    //   148: iconst_0
    //   149: ireturn
    //   150: astore_0
    //   151: aload_0
    //   152: invokevirtual 62	java/io/IOException:printStackTrace	()V
    //   155: iconst_0
    //   156: ireturn
    //   157: astore_0
    //   158: aconst_null
    //   159: astore_1
    //   160: aload 5
    //   162: astore_2
    //   163: aload_2
    //   164: astore 4
    //   166: aload_1
    //   167: astore_3
    //   168: aload_0
    //   169: invokevirtual 62	java/io/IOException:printStackTrace	()V
    //   172: aload_1
    //   173: ifnull +15 -> 188
    //   176: aload_2
    //   177: ifnull +11 -> 188
    //   180: aload_1
    //   181: invokevirtual 58	java/io/FileInputStream:close	()V
    //   184: aload_2
    //   185: invokevirtual 59	java/io/FileOutputStream:close	()V
    //   188: iconst_0
    //   189: ireturn
    //   190: astore_0
    //   191: aload_0
    //   192: invokevirtual 62	java/io/IOException:printStackTrace	()V
    //   195: iconst_0
    //   196: ireturn
    //   197: astore_0
    //   198: aconst_null
    //   199: astore_1
    //   200: aload 6
    //   202: astore_2
    //   203: aload_2
    //   204: astore 4
    //   206: aload_1
    //   207: astore_3
    //   208: aload_0
    //   209: invokevirtual 64	java/lang/Exception:printStackTrace	()V
    //   212: aload_1
    //   213: ifnull +15 -> 228
    //   216: aload_2
    //   217: ifnull +11 -> 228
    //   220: aload_1
    //   221: invokevirtual 58	java/io/FileInputStream:close	()V
    //   224: aload_2
    //   225: invokevirtual 59	java/io/FileOutputStream:close	()V
    //   228: iconst_0
    //   229: ireturn
    //   230: astore_0
    //   231: aload_0
    //   232: invokevirtual 62	java/io/IOException:printStackTrace	()V
    //   235: iconst_0
    //   236: ireturn
    //   237: astore_0
    //   238: aconst_null
    //   239: astore_1
    //   240: aload_1
    //   241: ifnull +17 -> 258
    //   244: aload 4
    //   246: ifnull +12 -> 258
    //   249: aload_1
    //   250: invokevirtual 58	java/io/FileInputStream:close	()V
    //   253: aload 4
    //   255: invokevirtual 59	java/io/FileOutputStream:close	()V
    //   258: aload_0
    //   259: athrow
    //   260: astore_1
    //   261: aload_1
    //   262: invokevirtual 62	java/io/IOException:printStackTrace	()V
    //   265: goto -7 -> 258
    //   268: astore_0
    //   269: aload_3
    //   270: astore_1
    //   271: goto -31 -> 240
    //   274: astore_2
    //   275: aload_0
    //   276: astore 4
    //   278: aload_2
    //   279: astore_0
    //   280: goto -40 -> 240
    //   283: astore_2
    //   284: aload_0
    //   285: astore 4
    //   287: aload_2
    //   288: astore_0
    //   289: goto -49 -> 240
    //   292: astore_0
    //   293: aload 6
    //   295: astore_2
    //   296: goto -93 -> 203
    //   299: astore_3
    //   300: aload_0
    //   301: astore_2
    //   302: aload_3
    //   303: astore_0
    //   304: goto -101 -> 203
    //   307: astore_0
    //   308: aload 5
    //   310: astore_2
    //   311: goto -148 -> 163
    //   314: astore_3
    //   315: aload_0
    //   316: astore_2
    //   317: aload_3
    //   318: astore_0
    //   319: goto -156 -> 163
    //   322: astore_2
    //   323: aconst_null
    //   324: astore_0
    //   325: goto -197 -> 128
    //   328: astore_2
    //   329: goto -201 -> 128
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	332	0	paramString1	String
    //   0	332	1	paramString2	String
    //   0	332	2	paramString3	String
    //   13	257	3	str	String
    //   299	4	3	localException	Exception
    //   314	4	3	localIOException	java.io.IOException
    //   7	279	4	localObject1	Object
    //   1	308	5	localObject2	Object
    //   4	290	6	localObject3	Object
    //   10	68	7	localObject4	Object
    //   22	72	8	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   106	114	116	java/io/IOException
    //   14	34	123	java/io/FileNotFoundException
    //   140	148	150	java/io/IOException
    //   14	34	157	java/io/IOException
    //   180	188	190	java/io/IOException
    //   14	34	197	java/lang/Exception
    //   220	228	230	java/io/IOException
    //   14	34	237	finally
    //   249	258	260	java/io/IOException
    //   40	50	268	finally
    //   56	63	268	finally
    //   69	77	268	finally
    //   83	92	268	finally
    //   168	172	268	finally
    //   208	212	268	finally
    //   92	98	274	finally
    //   128	132	283	finally
    //   40	50	292	java/lang/Exception
    //   56	63	292	java/lang/Exception
    //   69	77	292	java/lang/Exception
    //   83	92	292	java/lang/Exception
    //   92	98	299	java/lang/Exception
    //   40	50	307	java/io/IOException
    //   56	63	307	java/io/IOException
    //   69	77	307	java/io/IOException
    //   83	92	307	java/io/IOException
    //   92	98	314	java/io/IOException
    //   40	50	322	java/io/FileNotFoundException
    //   56	63	322	java/io/FileNotFoundException
    //   69	77	322	java/io/FileNotFoundException
    //   83	92	322	java/io/FileNotFoundException
    //   92	98	328	java/io/FileNotFoundException
  }
  
  public static byte[] b(String paramString, byte[] paramArrayOfByte)
  {
    return b(a(paramString.getBytes()), paramArrayOfByte);
  }
  
  private static byte[] b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    paramArrayOfByte1 = new SecretKeySpec(paramArrayOfByte1, b);
    Cipher localCipher = Cipher.getInstance(b);
    localCipher.init(2, paramArrayOfByte1, new IvParameterSpec(new byte[localCipher.getBlockSize()]));
    return localCipher.doFinal(paramArrayOfByte2);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/utils/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */