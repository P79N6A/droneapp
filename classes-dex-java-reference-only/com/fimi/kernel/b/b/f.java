package com.fimi.kernel.b.b;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

class f
{
  private static f a = null;
  private SQLiteDatabase b = null;
  private Context c;
  
  private f(Context paramContext)
  {
    this.c = paramContext;
    try
    {
      this.b = new a(paramContext).getWritableDatabase();
      return;
    }
    catch (Exception paramContext)
    {
      Log.d("ljh", paramContext.getMessage());
    }
  }
  
  public static f a(Context paramContext)
  {
    if (paramContext == null) {
      return null;
    }
    if (a == null)
    {
      a = new f(paramContext);
      a.c = paramContext;
    }
    return a;
  }
  
  private SQLiteDatabase d()
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = new a(this.c).getWritableDatabase();
      return localSQLiteDatabase;
    }
    catch (Exception localException)
    {
      Log.d("Good", localException + "");
    }
    return null;
  }
  
  /* Error */
  public b a(Context paramContext, String paramString, final a parama)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 18	com/fimi/kernel/b/b/f:a	Lcom/fimi/kernel/b/b/f;
    //   5: getfield 27	com/fimi/kernel/b/b/f:b	Landroid/database/sqlite/SQLiteDatabase;
    //   8: ldc 71
    //   10: iconst_1
    //   11: anewarray 73	java/lang/String
    //   14: dup
    //   15: iconst_0
    //   16: aload_2
    //   17: aastore
    //   18: invokevirtual 79	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   21: astore 4
    //   23: aconst_null
    //   24: astore_2
    //   25: aload 4
    //   27: invokeinterface 85 1 0
    //   32: ifeq +52 -> 84
    //   35: aload_1
    //   36: aload 4
    //   38: iconst_0
    //   39: invokeinterface 89 2 0
    //   44: aload 4
    //   46: iconst_2
    //   47: invokeinterface 93 2 0
    //   52: iconst_0
    //   53: invokestatic 99	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   56: aload 4
    //   58: iconst_1
    //   59: invokeinterface 89 2 0
    //   64: new 6	com/fimi/kernel/b/b/f$1
    //   67: dup
    //   68: aload_0
    //   69: aload_3
    //   70: invokespecial 102	com/fimi/kernel/b/b/f$1:<init>	(Lcom/fimi/kernel/b/b/f;Lcom/fimi/kernel/b/b/f$a;)V
    //   73: invokestatic 107	com/fimi/kernel/b/b/b:a	(Landroid/content/Context;Ljava/lang/String;JLjava/lang/Boolean;Ljava/lang/String;Lcom/fimi/kernel/b/b/b$e;)Lcom/fimi/kernel/b/b/b;
    //   76: astore 5
    //   78: aload 5
    //   80: astore_2
    //   81: goto -56 -> 25
    //   84: aload 4
    //   86: ifnull +87 -> 173
    //   89: aload 4
    //   91: invokeinterface 110 1 0
    //   96: aload_2
    //   97: astore_3
    //   98: aload_0
    //   99: monitorexit
    //   100: aload_3
    //   101: areturn
    //   102: astore_3
    //   103: aconst_null
    //   104: astore_1
    //   105: aconst_null
    //   106: astore_2
    //   107: aload_3
    //   108: invokevirtual 113	java/lang/Exception:printStackTrace	()V
    //   111: aload_2
    //   112: astore_3
    //   113: aload_1
    //   114: ifnull -16 -> 98
    //   117: aload_1
    //   118: invokeinterface 110 1 0
    //   123: aload_2
    //   124: astore_3
    //   125: goto -27 -> 98
    //   128: astore_1
    //   129: aload_0
    //   130: monitorexit
    //   131: aload_1
    //   132: athrow
    //   133: astore_1
    //   134: aconst_null
    //   135: astore 4
    //   137: aload 4
    //   139: ifnull +10 -> 149
    //   142: aload 4
    //   144: invokeinterface 110 1 0
    //   149: aload_1
    //   150: athrow
    //   151: astore_1
    //   152: goto -15 -> 137
    //   155: astore_2
    //   156: aload_1
    //   157: astore 4
    //   159: aload_2
    //   160: astore_1
    //   161: goto -24 -> 137
    //   164: astore_1
    //   165: aload_1
    //   166: astore_3
    //   167: aload 4
    //   169: astore_1
    //   170: goto -63 -> 107
    //   173: aload_2
    //   174: astore_3
    //   175: goto -77 -> 98
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	178	0	this	f
    //   0	178	1	paramContext	Context
    //   0	178	2	paramString	String
    //   0	178	3	parama	a
    //   21	147	4	localObject	Object
    //   76	3	5	localb	b
    // Exception table:
    //   from	to	target	type
    //   2	23	102	java/lang/Exception
    //   89	96	128	finally
    //   117	123	128	finally
    //   142	149	128	finally
    //   149	151	128	finally
    //   2	23	133	finally
    //   25	78	151	finally
    //   107	111	155	finally
    //   25	78	164	java/lang/Exception
  }
  
  /* Error */
  public java.util.List<String> a()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_1
    //   4: new 116	java/util/ArrayList
    //   7: dup
    //   8: invokespecial 117	java/util/ArrayList:<init>	()V
    //   11: astore 4
    //   13: getstatic 18	com/fimi/kernel/b/b/f:a	Lcom/fimi/kernel/b/b/f;
    //   16: getfield 27	com/fimi/kernel/b/b/f:b	Landroid/database/sqlite/SQLiteDatabase;
    //   19: ldc 119
    //   21: aconst_null
    //   22: invokevirtual 79	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   25: astore_3
    //   26: aload_3
    //   27: astore_1
    //   28: aload_3
    //   29: astore_2
    //   30: aload_3
    //   31: invokeinterface 85 1 0
    //   36: ifeq +45 -> 81
    //   39: aload_3
    //   40: astore_1
    //   41: aload_3
    //   42: astore_2
    //   43: aload 4
    //   45: aload_3
    //   46: iconst_0
    //   47: invokeinterface 89 2 0
    //   52: invokeinterface 125 2 0
    //   57: pop
    //   58: goto -32 -> 26
    //   61: astore_3
    //   62: aload_1
    //   63: astore_2
    //   64: aload_3
    //   65: invokevirtual 113	java/lang/Exception:printStackTrace	()V
    //   68: aload_1
    //   69: ifnull +9 -> 78
    //   72: aload_1
    //   73: invokeinterface 110 1 0
    //   78: aload 4
    //   80: areturn
    //   81: aload_3
    //   82: ifnull -4 -> 78
    //   85: aload_3
    //   86: invokeinterface 110 1 0
    //   91: aload 4
    //   93: areturn
    //   94: astore_1
    //   95: aload_2
    //   96: ifnull +9 -> 105
    //   99: aload_2
    //   100: invokeinterface 110 1 0
    //   105: aload_1
    //   106: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	107	0	this	f
    //   3	70	1	localObject1	Object
    //   94	12	1	localObject2	Object
    //   1	99	2	localObject3	Object
    //   25	21	3	localCursor	Cursor
    //   61	25	3	localException	Exception
    //   11	81	4	localArrayList	java.util.ArrayList
    // Exception table:
    //   from	to	target	type
    //   13	26	61	java/lang/Exception
    //   30	39	61	java/lang/Exception
    //   43	58	61	java/lang/Exception
    //   13	26	94	finally
    //   30	39	94	finally
    //   43	58	94	finally
    //   64	68	94	finally
  }
  
  /* Error */
  public void a(int paramInt, long paramLong, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 18	com/fimi/kernel/b/b/f:a	Lcom/fimi/kernel/b/b/f;
    //   5: getfield 27	com/fimi/kernel/b/b/f:b	Landroid/database/sqlite/SQLiteDatabase;
    //   8: invokevirtual 131	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   11: getstatic 18	com/fimi/kernel/b/b/f:a	Lcom/fimi/kernel/b/b/f;
    //   14: getfield 27	com/fimi/kernel/b/b/f:b	Landroid/database/sqlite/SQLiteDatabase;
    //   17: ldc -123
    //   19: iconst_3
    //   20: anewarray 4	java/lang/Object
    //   23: dup
    //   24: iconst_0
    //   25: lload_2
    //   26: invokestatic 138	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   29: aastore
    //   30: dup
    //   31: iconst_1
    //   32: iload_1
    //   33: invokestatic 143	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   36: aastore
    //   37: dup
    //   38: iconst_2
    //   39: aload 4
    //   41: aastore
    //   42: invokevirtual 147	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   45: getstatic 18	com/fimi/kernel/b/b/f:a	Lcom/fimi/kernel/b/b/f;
    //   48: getfield 27	com/fimi/kernel/b/b/f:b	Landroid/database/sqlite/SQLiteDatabase;
    //   51: invokevirtual 150	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   54: getstatic 18	com/fimi/kernel/b/b/f:a	Lcom/fimi/kernel/b/b/f;
    //   57: getfield 27	com/fimi/kernel/b/b/f:b	Landroid/database/sqlite/SQLiteDatabase;
    //   60: invokevirtual 153	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   63: aload_0
    //   64: monitorexit
    //   65: return
    //   66: astore 4
    //   68: aload 4
    //   70: invokevirtual 113	java/lang/Exception:printStackTrace	()V
    //   73: getstatic 18	com/fimi/kernel/b/b/f:a	Lcom/fimi/kernel/b/b/f;
    //   76: getfield 27	com/fimi/kernel/b/b/f:b	Landroid/database/sqlite/SQLiteDatabase;
    //   79: invokevirtual 153	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   82: goto -19 -> 63
    //   85: astore 4
    //   87: goto -24 -> 63
    //   90: astore 4
    //   92: getstatic 18	com/fimi/kernel/b/b/f:a	Lcom/fimi/kernel/b/b/f;
    //   95: getfield 27	com/fimi/kernel/b/b/f:b	Landroid/database/sqlite/SQLiteDatabase;
    //   98: invokevirtual 153	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   101: aload 4
    //   103: athrow
    //   104: astore 4
    //   106: aload_0
    //   107: monitorexit
    //   108: aload 4
    //   110: athrow
    //   111: astore 5
    //   113: goto -12 -> 101
    //   116: astore 4
    //   118: goto -55 -> 63
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	121	0	this	f
    //   0	121	1	paramInt	int
    //   0	121	2	paramLong	long
    //   0	121	4	paramString	String
    //   111	1	5	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   2	54	66	java/lang/Exception
    //   73	82	85	java/lang/Exception
    //   2	54	90	finally
    //   68	73	90	finally
    //   54	63	104	finally
    //   73	82	104	finally
    //   92	101	104	finally
    //   101	104	104	finally
    //   92	101	111	java/lang/Exception
    //   54	63	116	java/lang/Exception
  }
  
  public void a(b paramb)
  {
    try
    {
      String str1 = paramb.m();
      String str2 = paramb.h();
      long l = paramb.i();
      paramb = paramb.a();
      a.b.execSQL("insert into download_task(url,local_uri,file_size,dur) values (?,?,?,?)", new Object[] { str1, str2, Long.valueOf(l), paramb });
      return;
    }
    catch (Exception paramb)
    {
      for (;;)
      {
        paramb.printStackTrace();
      }
    }
    finally {}
  }
  
  /* Error */
  public void a(java.util.List<d> paramList)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokeinterface 173 1 0
    //   8: astore_1
    //   9: aload_1
    //   10: invokeinterface 178 1 0
    //   15: ifeq +105 -> 120
    //   18: aload_1
    //   19: invokeinterface 182 1 0
    //   24: checkcast 184	com/fimi/kernel/b/b/d
    //   27: astore 9
    //   29: aload 9
    //   31: invokevirtual 187	com/fimi/kernel/b/b/d:b	()I
    //   34: istore_2
    //   35: aload 9
    //   37: invokevirtual 189	com/fimi/kernel/b/b/d:c	()J
    //   40: lstore_3
    //   41: aload 9
    //   43: invokevirtual 191	com/fimi/kernel/b/b/d:d	()J
    //   46: lstore 5
    //   48: aload 9
    //   50: invokevirtual 194	com/fimi/kernel/b/b/d:e	()J
    //   53: lstore 7
    //   55: aload 9
    //   57: invokevirtual 195	com/fimi/kernel/b/b/d:a	()Ljava/lang/String;
    //   60: astore 9
    //   62: getstatic 18	com/fimi/kernel/b/b/f:a	Lcom/fimi/kernel/b/b/f;
    //   65: getfield 27	com/fimi/kernel/b/b/f:b	Landroid/database/sqlite/SQLiteDatabase;
    //   68: ldc -59
    //   70: iconst_5
    //   71: anewarray 4	java/lang/Object
    //   74: dup
    //   75: iconst_0
    //   76: iload_2
    //   77: invokestatic 143	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   80: aastore
    //   81: dup
    //   82: iconst_1
    //   83: lload_3
    //   84: invokestatic 138	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   87: aastore
    //   88: dup
    //   89: iconst_2
    //   90: lload 5
    //   92: invokestatic 138	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   95: aastore
    //   96: dup
    //   97: iconst_3
    //   98: lload 7
    //   100: invokestatic 138	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   103: aastore
    //   104: dup
    //   105: iconst_4
    //   106: aload 9
    //   108: aastore
    //   109: invokevirtual 147	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   112: goto -103 -> 9
    //   115: astore_1
    //   116: aload_1
    //   117: invokevirtual 113	java/lang/Exception:printStackTrace	()V
    //   120: aload_0
    //   121: monitorexit
    //   122: return
    //   123: astore_1
    //   124: aload_0
    //   125: monitorexit
    //   126: aload_1
    //   127: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	128	0	this	f
    //   0	128	1	paramList	java.util.List<d>
    //   34	43	2	i	int
    //   40	44	3	l1	long
    //   46	45	5	l2	long
    //   53	46	7	l3	long
    //   27	80	9	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	9	115	java/lang/Exception
    //   9	112	115	java/lang/Exception
    //   2	9	123	finally
    //   9	112	123	finally
    //   116	120	123	finally
  }
  
  public boolean a(String paramString)
  {
    boolean bool = true;
    Object localObject = null;
    String str = null;
    for (;;)
    {
      try
      {
        paramString = a.b.rawQuery("select count(*)  from download_info where url=?", new String[] { paramString });
        str = paramString;
        localObject = paramString;
        if (!paramString.moveToFirst()) {
          break label140;
        }
        str = paramString;
        localObject = paramString;
        i = paramString.getInt(0);
        j = i;
        if (paramString != null) {}
        bool = false;
      }
      catch (Exception paramString)
      {
        paramString = paramString;
        localObject = str;
        paramString.printStackTrace();
        if (str == null) {
          break label135;
        }
        str.close();
        j = -1;
        continue;
      }
      finally
      {
        if (localObject != null) {
          ((Cursor)localObject).close();
        }
      }
      continue;
      label135:
      int j = -1;
      continue;
      label140:
      int i = -1;
    }
  }
  
  /* Error */
  public b b(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 18	com/fimi/kernel/b/b/f:a	Lcom/fimi/kernel/b/b/f;
    //   5: getfield 27	com/fimi/kernel/b/b/f:b	Landroid/database/sqlite/SQLiteDatabase;
    //   8: ldc -45
    //   10: iconst_1
    //   11: anewarray 73	java/lang/String
    //   14: dup
    //   15: iconst_0
    //   16: aload_1
    //   17: aastore
    //   18: invokevirtual 79	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   21: astore_2
    //   22: aconst_null
    //   23: astore_1
    //   24: aload_2
    //   25: astore_3
    //   26: aload_2
    //   27: invokeinterface 85 1 0
    //   32: ifeq +60 -> 92
    //   35: aload_2
    //   36: astore_3
    //   37: new 104	com/fimi/kernel/b/b/b
    //   40: dup
    //   41: aload_2
    //   42: iconst_0
    //   43: invokeinterface 89 2 0
    //   48: aload_2
    //   49: iconst_1
    //   50: invokeinterface 89 2 0
    //   55: invokespecial 214	com/fimi/kernel/b/b/b:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   58: astore 4
    //   60: aload_2
    //   61: astore_3
    //   62: aload_2
    //   63: iconst_2
    //   64: invokeinterface 89 2 0
    //   69: ifnull +110 -> 179
    //   72: aload_2
    //   73: astore_3
    //   74: aload 4
    //   76: aload_2
    //   77: iconst_2
    //   78: invokeinterface 89 2 0
    //   83: invokevirtual 217	com/fimi/kernel/b/b/b:a	(Ljava/lang/String;)V
    //   86: aload 4
    //   88: astore_1
    //   89: goto -65 -> 24
    //   92: aload_1
    //   93: astore_3
    //   94: aload_2
    //   95: ifnull +11 -> 106
    //   98: aload_2
    //   99: invokeinterface 110 1 0
    //   104: aload_1
    //   105: astore_3
    //   106: aload_0
    //   107: monitorexit
    //   108: aload_3
    //   109: areturn
    //   110: astore 4
    //   112: aconst_null
    //   113: astore_2
    //   114: aconst_null
    //   115: astore_1
    //   116: aload_2
    //   117: astore_3
    //   118: aload 4
    //   120: invokevirtual 113	java/lang/Exception:printStackTrace	()V
    //   123: aload_1
    //   124: astore_3
    //   125: aload_2
    //   126: ifnull -20 -> 106
    //   129: aload_2
    //   130: invokeinterface 110 1 0
    //   135: aload_1
    //   136: astore_3
    //   137: goto -31 -> 106
    //   140: astore_1
    //   141: aload_0
    //   142: monitorexit
    //   143: aload_1
    //   144: athrow
    //   145: astore_1
    //   146: aconst_null
    //   147: astore_3
    //   148: aload_3
    //   149: ifnull +9 -> 158
    //   152: aload_3
    //   153: invokeinterface 110 1 0
    //   158: aload_1
    //   159: athrow
    //   160: astore_1
    //   161: goto -13 -> 148
    //   164: astore 4
    //   166: goto -50 -> 116
    //   169: astore_3
    //   170: aload 4
    //   172: astore_1
    //   173: aload_3
    //   174: astore 4
    //   176: goto -60 -> 116
    //   179: aload 4
    //   181: astore_1
    //   182: goto -158 -> 24
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	185	0	this	f
    //   0	185	1	paramString	String
    //   21	109	2	localCursor	Cursor
    //   25	128	3	localObject	Object
    //   169	5	3	localException1	Exception
    //   58	29	4	localb	b
    //   110	9	4	localException2	Exception
    //   164	7	4	localException3	Exception
    //   174	6	4	localException4	Exception
    // Exception table:
    //   from	to	target	type
    //   2	22	110	java/lang/Exception
    //   98	104	140	finally
    //   129	135	140	finally
    //   152	158	140	finally
    //   158	160	140	finally
    //   2	22	145	finally
    //   26	35	160	finally
    //   37	60	160	finally
    //   62	72	160	finally
    //   74	86	160	finally
    //   118	123	160	finally
    //   26	35	164	java/lang/Exception
    //   37	60	164	java/lang/Exception
    //   62	72	169	java/lang/Exception
    //   74	86	169	java/lang/Exception
  }
  
  /* Error */
  public java.util.List<b> b()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_1
    //   4: aload_0
    //   5: monitorenter
    //   6: new 116	java/util/ArrayList
    //   9: dup
    //   10: invokespecial 117	java/util/ArrayList:<init>	()V
    //   13: astore 4
    //   15: getstatic 18	com/fimi/kernel/b/b/f:a	Lcom/fimi/kernel/b/b/f;
    //   18: getfield 27	com/fimi/kernel/b/b/f:b	Landroid/database/sqlite/SQLiteDatabase;
    //   21: ldc -37
    //   23: aconst_null
    //   24: invokevirtual 79	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   27: astore_3
    //   28: aload_3
    //   29: astore_1
    //   30: aload_3
    //   31: astore_2
    //   32: aload_3
    //   33: invokeinterface 204 1 0
    //   38: pop
    //   39: aload_3
    //   40: astore_1
    //   41: aload_3
    //   42: astore_2
    //   43: aload_3
    //   44: invokeinterface 85 1 0
    //   49: ifeq +61 -> 110
    //   52: aload_3
    //   53: astore_1
    //   54: aload_3
    //   55: astore_2
    //   56: aload 4
    //   58: new 104	com/fimi/kernel/b/b/b
    //   61: dup
    //   62: aload_3
    //   63: iconst_0
    //   64: invokeinterface 89 2 0
    //   69: aload_3
    //   70: iconst_1
    //   71: invokeinterface 89 2 0
    //   76: invokespecial 214	com/fimi/kernel/b/b/b:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   79: invokeinterface 125 2 0
    //   84: pop
    //   85: goto -46 -> 39
    //   88: astore_3
    //   89: aload_1
    //   90: astore_2
    //   91: aload_3
    //   92: invokevirtual 113	java/lang/Exception:printStackTrace	()V
    //   95: aload_1
    //   96: ifnull +9 -> 105
    //   99: aload_1
    //   100: invokeinterface 110 1 0
    //   105: aload_0
    //   106: monitorexit
    //   107: aload 4
    //   109: areturn
    //   110: aload_3
    //   111: ifnull -6 -> 105
    //   114: aload_3
    //   115: invokeinterface 110 1 0
    //   120: goto -15 -> 105
    //   123: astore_1
    //   124: aload_0
    //   125: monitorexit
    //   126: aload_1
    //   127: athrow
    //   128: astore_1
    //   129: aload_2
    //   130: ifnull +9 -> 139
    //   133: aload_2
    //   134: invokeinterface 110 1 0
    //   139: aload_1
    //   140: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	141	0	this	f
    //   3	97	1	localObject1	Object
    //   123	4	1	localObject2	Object
    //   128	12	1	localObject3	Object
    //   1	133	2	localObject4	Object
    //   27	43	3	localCursor	Cursor
    //   88	27	3	localException	Exception
    //   13	95	4	localArrayList	java.util.ArrayList
    // Exception table:
    //   from	to	target	type
    //   15	28	88	java/lang/Exception
    //   32	39	88	java/lang/Exception
    //   43	52	88	java/lang/Exception
    //   56	85	88	java/lang/Exception
    //   6	15	123	finally
    //   99	105	123	finally
    //   114	120	123	finally
    //   133	139	123	finally
    //   139	141	123	finally
    //   15	28	128	finally
    //   32	39	128	finally
    //   43	52	128	finally
    //   56	85	128	finally
    //   91	95	128	finally
  }
  
  /* Error */
  public java.util.List<d> c(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 116	java/util/ArrayList
    //   5: dup
    //   6: invokespecial 117	java/util/ArrayList:<init>	()V
    //   9: astore 4
    //   11: aconst_null
    //   12: astore_3
    //   13: getstatic 18	com/fimi/kernel/b/b/f:a	Lcom/fimi/kernel/b/b/f;
    //   16: getfield 27	com/fimi/kernel/b/b/f:b	Landroid/database/sqlite/SQLiteDatabase;
    //   19: ldc -33
    //   21: iconst_1
    //   22: anewarray 73	java/lang/String
    //   25: dup
    //   26: iconst_0
    //   27: aload_1
    //   28: aastore
    //   29: invokevirtual 79	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   32: astore_1
    //   33: aload_1
    //   34: invokeinterface 85 1 0
    //   39: ifeq +76 -> 115
    //   42: aload 4
    //   44: new 184	com/fimi/kernel/b/b/d
    //   47: dup
    //   48: aload_1
    //   49: iconst_0
    //   50: invokeinterface 208 2 0
    //   55: aload_1
    //   56: iconst_1
    //   57: invokeinterface 93 2 0
    //   62: aload_1
    //   63: iconst_2
    //   64: invokeinterface 93 2 0
    //   69: aload_1
    //   70: iconst_3
    //   71: invokeinterface 93 2 0
    //   76: aload_1
    //   77: iconst_4
    //   78: invokeinterface 89 2 0
    //   83: invokespecial 226	com/fimi/kernel/b/b/d:<init>	(IJJJLjava/lang/String;)V
    //   86: invokeinterface 125 2 0
    //   91: pop
    //   92: goto -59 -> 33
    //   95: astore_2
    //   96: aload_2
    //   97: invokevirtual 113	java/lang/Exception:printStackTrace	()V
    //   100: aload_1
    //   101: ifnull +9 -> 110
    //   104: aload_1
    //   105: invokeinterface 110 1 0
    //   110: aload_0
    //   111: monitorexit
    //   112: aload 4
    //   114: areturn
    //   115: aload_1
    //   116: ifnull -6 -> 110
    //   119: aload_1
    //   120: invokeinterface 110 1 0
    //   125: goto -15 -> 110
    //   128: astore_1
    //   129: aload_0
    //   130: monitorexit
    //   131: aload_1
    //   132: athrow
    //   133: astore_2
    //   134: aconst_null
    //   135: astore_1
    //   136: aload_1
    //   137: ifnull +9 -> 146
    //   140: aload_1
    //   141: invokeinterface 110 1 0
    //   146: aload_2
    //   147: athrow
    //   148: astore_2
    //   149: goto -13 -> 136
    //   152: astore_2
    //   153: goto -17 -> 136
    //   156: astore_2
    //   157: aload_3
    //   158: astore_1
    //   159: goto -63 -> 96
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	162	0	this	f
    //   0	162	1	paramString	String
    //   95	2	2	localException1	Exception
    //   133	14	2	localObject1	Object
    //   148	1	2	localObject2	Object
    //   152	1	2	localObject3	Object
    //   156	1	2	localException2	Exception
    //   12	146	3	localObject4	Object
    //   9	104	4	localArrayList	java.util.ArrayList
    // Exception table:
    //   from	to	target	type
    //   33	92	95	java/lang/Exception
    //   2	11	128	finally
    //   104	110	128	finally
    //   119	125	128	finally
    //   140	146	128	finally
    //   146	148	128	finally
    //   13	33	133	finally
    //   33	92	148	finally
    //   96	100	152	finally
    //   13	33	156	java/lang/Exception
  }
  
  public void c()
  {
    try
    {
      a.b.execSQL("DELETE FROM download_info");
      a.b.execSQL("DELETE FROM download_task");
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
    finally {}
  }
  
  public void d(String paramString)
  {
    try
    {
      a.b.delete("download_info", "url=?", new String[] { paramString });
      a.b.delete("download_task", "url=?", new String[] { paramString });
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
      }
    }
    finally {}
  }
  
  protected void finalize()
  {
    this.b.close();
    super.finalize();
  }
  
  public static abstract interface a
  {
    public abstract void a(b paramb);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/b/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */