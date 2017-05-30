package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.x;
import java.io.File;
import java.io.IOException;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

class f
{
  SharedPreferences a;
  Context b;
  
  public f(Context paramContext)
  {
    this(paramContext, "com.google.android.gms.appid");
  }
  
  public f(Context paramContext, String paramString)
  {
    this.b = paramContext;
    this.a = paramContext.getSharedPreferences(paramString, 4);
    paramContext = String.valueOf(paramString);
    paramString = String.valueOf("-no-backup");
    if (paramString.length() != 0) {}
    for (paramContext = paramContext.concat(paramString);; paramContext = new String(paramContext))
    {
      f(paramContext);
      return;
    }
  }
  
  private String a(String paramString1, String paramString2)
  {
    String str = String.valueOf("|S|");
    return String.valueOf(paramString1).length() + 0 + String.valueOf(str).length() + String.valueOf(paramString2).length() + paramString1 + str + paramString2;
  }
  
  private String c(String paramString1, String paramString2, String paramString3)
  {
    String str = String.valueOf("|T|");
    return String.valueOf(paramString1).length() + 1 + String.valueOf(str).length() + String.valueOf(paramString2).length() + String.valueOf(paramString3).length() + paramString1 + str + paramString2 + "|" + paramString3;
  }
  
  private void f(String paramString)
  {
    paramString = new File(x.a(this.b), paramString);
    if (paramString.exists()) {}
    do
    {
      for (;;)
      {
        return;
        try
        {
          if ((paramString.createNewFile()) && (!b()))
          {
            Log.i("InstanceID/Store", "App restored, clearing state");
            FirebaseInstanceId.a(this.b, this);
            return;
          }
        }
        catch (IOException paramString) {}
      }
    } while (!Log.isLoggable("InstanceID/Store", 3));
    paramString = String.valueOf(paramString.getMessage());
    if (paramString.length() != 0) {}
    for (paramString = "Error creating file in no backup dir: ".concat(paramString);; paramString = new String("Error creating file in no backup dir: "))
    {
      Log.d("InstanceID/Store", paramString);
      return;
    }
  }
  
  private void g(String paramString)
  {
    SharedPreferences.Editor localEditor = this.a.edit();
    Iterator localIterator = this.a.getAll().keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (str.startsWith(paramString)) {
        localEditor.remove(str);
      }
    }
    localEditor.commit();
  }
  
  /* Error */
  public long a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: ldc -83
    //   6: invokespecial 175	com/google/firebase/iid/f:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 31	com/google/firebase/iid/f:a	Landroid/content/SharedPreferences;
    //   14: aload_1
    //   15: aconst_null
    //   16: invokeinterface 178 3 0
    //   21: astore_1
    //   22: aload_1
    //   23: ifnull +13 -> 36
    //   26: aload_1
    //   27: invokestatic 183	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   30: lstore_2
    //   31: aload_0
    //   32: monitorexit
    //   33: lload_2
    //   34: lreturn
    //   35: astore_1
    //   36: lconst_0
    //   37: lstore_2
    //   38: goto -7 -> 31
    //   41: astore_1
    //   42: aload_0
    //   43: monitorexit
    //   44: aload_1
    //   45: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	46	0	this	f
    //   0	46	1	paramString	String
    //   30	8	2	l	long
    // Exception table:
    //   from	to	target	type
    //   26	31	35	java/lang/NumberFormatException
    //   2	22	41	finally
    //   26	31	41	finally
  }
  
  public SharedPreferences a()
  {
    return this.a;
  }
  
  public a a(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      paramString1 = a.a(this.a.getString(c(paramString1, paramString2, paramString3), null));
      return paramString1;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  /* Error */
  public void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload 4
    //   4: aload 5
    //   6: invokestatic 197	java/lang/System:currentTimeMillis	()J
    //   9: invokestatic 200	com/google/firebase/iid/f$a:a	(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;
    //   12: astore 4
    //   14: aload 4
    //   16: ifnonnull +6 -> 22
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: aload_0
    //   23: getfield 31	com/google/firebase/iid/f:a	Landroid/content/SharedPreferences;
    //   26: invokeinterface 130 1 0
    //   31: astore 5
    //   33: aload 5
    //   35: aload_0
    //   36: aload_1
    //   37: aload_2
    //   38: aload_3
    //   39: invokespecial 187	com/google/firebase/iid/f:c	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   42: aload 4
    //   44: invokeinterface 204 3 0
    //   49: pop
    //   50: aload 5
    //   52: invokeinterface 168 1 0
    //   57: pop
    //   58: goto -39 -> 19
    //   61: astore_1
    //   62: aload_0
    //   63: monitorexit
    //   64: aload_1
    //   65: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	this	f
    //   0	66	1	paramString1	String
    //   0	66	2	paramString2	String
    //   0	66	3	paramString3	String
    //   0	66	4	paramString4	String
    //   0	66	5	paramString5	String
    // Exception table:
    //   from	to	target	type
    //   2	14	61	finally
    //   22	58	61	finally
  }
  
  KeyPair b(String paramString)
  {
    try
    {
      KeyPair localKeyPair = a.a();
      long l = System.currentTimeMillis();
      SharedPreferences.Editor localEditor = this.a.edit();
      localEditor.putString(a(paramString, "|P|"), FirebaseInstanceId.a(localKeyPair.getPublic().getEncoded()));
      localEditor.putString(a(paramString, "|K|"), FirebaseInstanceId.a(localKeyPair.getPrivate().getEncoded()));
      localEditor.putString(a(paramString, "cre"), Long.toString(l));
      localEditor.commit();
      return localKeyPair;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void b(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      paramString1 = c(paramString1, paramString2, paramString3);
      paramString2 = this.a.edit();
      paramString2.remove(paramString1);
      paramString2.commit();
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  public boolean b()
  {
    try
    {
      boolean bool = this.a.getAll().isEmpty();
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void c()
  {
    try
    {
      this.a.edit().clear().commit();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  void c(String paramString)
  {
    try
    {
      g(String.valueOf(paramString).concat("|"));
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void d(String paramString)
  {
    try
    {
      g(String.valueOf(paramString).concat("|T|"));
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  /* Error */
  public KeyPair e(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 31	com/google/firebase/iid/f:a	Landroid/content/SharedPreferences;
    //   6: aload_0
    //   7: aload_1
    //   8: ldc -44
    //   10: invokespecial 175	com/google/firebase/iid/f:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   13: aconst_null
    //   14: invokeinterface 178 3 0
    //   19: astore_2
    //   20: aload_0
    //   21: getfield 31	com/google/firebase/iid/f:a	Landroid/content/SharedPreferences;
    //   24: aload_0
    //   25: aload_1
    //   26: ldc -27
    //   28: invokespecial 175	com/google/firebase/iid/f:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   31: aconst_null
    //   32: invokeinterface 178 3 0
    //   37: astore_3
    //   38: aload_2
    //   39: ifnull +7 -> 46
    //   42: aload_3
    //   43: ifnonnull +9 -> 52
    //   46: aconst_null
    //   47: astore_1
    //   48: aload_0
    //   49: monitorexit
    //   50: aload_1
    //   51: areturn
    //   52: aload_2
    //   53: bipush 8
    //   55: invokestatic 259	android/util/Base64:decode	(Ljava/lang/String;I)[B
    //   58: astore_1
    //   59: aload_3
    //   60: bipush 8
    //   62: invokestatic 259	android/util/Base64:decode	(Ljava/lang/String;I)[B
    //   65: astore_2
    //   66: ldc_w 261
    //   69: invokestatic 267	java/security/KeyFactory:getInstance	(Ljava/lang/String;)Ljava/security/KeyFactory;
    //   72: astore_3
    //   73: new 214	java/security/KeyPair
    //   76: dup
    //   77: aload_3
    //   78: new 269	java/security/spec/X509EncodedKeySpec
    //   81: dup
    //   82: aload_1
    //   83: invokespecial 272	java/security/spec/X509EncodedKeySpec:<init>	([B)V
    //   86: invokevirtual 276	java/security/KeyFactory:generatePublic	(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    //   89: aload_3
    //   90: new 278	java/security/spec/PKCS8EncodedKeySpec
    //   93: dup
    //   94: aload_2
    //   95: invokespecial 279	java/security/spec/PKCS8EncodedKeySpec:<init>	([B)V
    //   98: invokevirtual 283	java/security/KeyFactory:generatePrivate	(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;
    //   101: invokespecial 286	java/security/KeyPair:<init>	(Ljava/security/PublicKey;Ljava/security/PrivateKey;)V
    //   104: astore_1
    //   105: goto -57 -> 48
    //   108: astore_1
    //   109: aload_1
    //   110: invokestatic 37	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   113: astore_1
    //   114: ldc 98
    //   116: new 58	java/lang/StringBuilder
    //   119: dup
    //   120: aload_1
    //   121: invokestatic 37	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   124: invokevirtual 43	java/lang/String:length	()I
    //   127: bipush 19
    //   129: iadd
    //   130: invokespecial 61	java/lang/StringBuilder:<init>	(I)V
    //   133: ldc_w 288
    //   136: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: aload_1
    //   140: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   146: invokestatic 291	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   149: pop
    //   150: aload_0
    //   151: getfield 23	com/google/firebase/iid/f:b	Landroid/content/Context;
    //   154: aload_0
    //   155: invokestatic 111	com/google/firebase/iid/FirebaseInstanceId:a	(Landroid/content/Context;Lcom/google/firebase/iid/f;)V
    //   158: aconst_null
    //   159: astore_1
    //   160: goto -112 -> 48
    //   163: astore_1
    //   164: aload_0
    //   165: monitorexit
    //   166: aload_1
    //   167: athrow
    //   168: astore_1
    //   169: goto -60 -> 109
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	172	0	this	f
    //   0	172	1	paramString	String
    //   19	76	2	localObject1	Object
    //   37	53	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   52	105	108	java/security/spec/InvalidKeySpecException
    //   2	38	163	finally
    //   52	105	163	finally
    //   109	158	163	finally
    //   52	105	168	java/security/NoSuchAlgorithmException
  }
  
  static class a
  {
    private static final long d = TimeUnit.DAYS.toMillis(7L);
    final String a;
    final String b;
    final long c;
    
    private a(String paramString1, String paramString2, long paramLong)
    {
      this.a = paramString1;
      this.b = paramString2;
      this.c = paramLong;
    }
    
    static a a(String paramString)
    {
      if (TextUtils.isEmpty(paramString)) {
        return null;
      }
      if (paramString.startsWith("{")) {
        try
        {
          paramString = new JSONObject(paramString);
          paramString = new a(paramString.getString("token"), paramString.getString("appVersion"), paramString.getLong("timestamp"));
          return paramString;
        }
        catch (JSONException paramString)
        {
          paramString = String.valueOf(paramString);
          Log.w("InstanceID/Store", String.valueOf(paramString).length() + 23 + "Failed to parse token: " + paramString);
          return null;
        }
      }
      return new a(paramString, null, 0L);
    }
    
    static String a(String paramString1, String paramString2, long paramLong)
    {
      try
      {
        JSONObject localJSONObject = new JSONObject();
        localJSONObject.put("token", paramString1);
        localJSONObject.put("appVersion", paramString2);
        localJSONObject.put("timestamp", paramLong);
        paramString1 = localJSONObject.toString();
        return paramString1;
      }
      catch (JSONException paramString1)
      {
        paramString1 = String.valueOf(paramString1);
        Log.w("InstanceID/Store", String.valueOf(paramString1).length() + 24 + "Failed to encode token: " + paramString1);
      }
      return null;
    }
    
    boolean b(String paramString)
    {
      return (System.currentTimeMillis() > this.c + d) || (!paramString.equals(this.b));
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/firebase/iid/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */