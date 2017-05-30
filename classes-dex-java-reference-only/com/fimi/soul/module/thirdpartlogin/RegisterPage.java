package com.fimi.soul.module.thirdpartlogin;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler.Callback;
import android.os.Message;
import android.provider.MediaStore.Images.Media;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformDb;
import cn.sharesdk.framework.ShareSDK;
import java.io.File;

public class RegisterPage
  extends Activity
  implements Handler.Callback, View.OnClickListener
{
  private static final int a = 0;
  private static final int b = 1;
  private static final int c = 2;
  private static final int d = 3;
  private static final String e = "UserIcon.jpg";
  private static d f;
  private static String g;
  private d h;
  private Platform i;
  private ImageView j;
  private ImageView k;
  private ImageView l;
  private TextView m;
  private EditText n;
  private String o;
  private f p = new f();
  
  private void a()
  {
    if (this.i != null)
    {
      if (!this.i.getDb().getUserGender().equals("m")) {
        break label256;
      }
      this.p.a(f.a.a);
      this.k.setVisibility(0);
      this.l.setVisibility(4);
    }
    for (;;)
    {
      this.p.a(this.i.getDb().getUserIcon());
      this.p.b(this.i.getDb().getUserName());
      this.p.c(this.i.getDb().getUserId());
      this.n.setText(this.p.b());
      this.m.setText(this.p.d());
      if (!TextUtils.isEmpty(this.p.a())) {
        b();
      }
      if (Environment.getExternalStorageState().equals("mounted"))
      {
        File localFile2 = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + getPackageName() + "/download");
        File localFile1 = new File(localFile2, "UserIcon.jpg");
        if (!localFile2.exists()) {
          localFile2.mkdirs();
        }
        try
        {
          if (!localFile1.exists()) {
            localFile1.createNewFile();
          }
          this.o = localFile1.getAbsolutePath();
          Log.d("picturePath ==>>", this.o);
          return;
          label256:
          this.p.a(f.a.b);
          this.k.setVisibility(4);
          this.l.setVisibility(0);
        }
        catch (Exception localException)
        {
          for (;;)
          {
            localException.printStackTrace();
          }
        }
      }
    }
    Log.d("change user icon ==>>", "there is not sdcard!");
  }
  
  static final void a(d paramd)
  {
    f = paramd;
  }
  
  static final void a(String paramString)
  {
    g = paramString;
  }
  
  private void b()
  {
    new Thread(new Runnable()
    {
      /* Error */
      public void run()
      {
        // Byte code:
        //   0: new 34	java/net/URL
        //   3: dup
        //   4: aload_0
        //   5: getfield 22	com/fimi/soul/module/thirdpartlogin/RegisterPage$1:a	Ljava/lang/String;
        //   8: invokespecial 37	java/net/URL:<init>	(Ljava/lang/String;)V
        //   11: invokevirtual 41	java/net/URL:openStream	()Ljava/io/InputStream;
        //   14: invokestatic 47	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
        //   17: astore_3
        //   18: aconst_null
        //   19: astore_1
        //   20: new 49	java/io/FileOutputStream
        //   23: dup
        //   24: aload_0
        //   25: getfield 20	com/fimi/soul/module/thirdpartlogin/RegisterPage$1:b	Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;
        //   28: invokestatic 52	com/fimi/soul/module/thirdpartlogin/RegisterPage:a	(Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;)Ljava/lang/String;
        //   31: invokespecial 53	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
        //   34: astore_2
        //   35: aload_2
        //   36: astore_1
        //   37: aload_3
        //   38: getstatic 59	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
        //   41: bipush 100
        //   43: aload_2
        //   44: invokevirtual 65	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
        //   47: pop
        //   48: aload_2
        //   49: invokevirtual 68	java/io/FileOutputStream:flush	()V
        //   52: aload_2
        //   53: invokevirtual 71	java/io/FileOutputStream:close	()V
        //   56: aload_0
        //   57: getfield 20	com/fimi/soul/module/thirdpartlogin/RegisterPage$1:b	Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;
        //   60: invokestatic 74	com/fimi/soul/module/thirdpartlogin/RegisterPage:b	(Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;)Lcom/fimi/soul/module/thirdpartlogin/f;
        //   63: aload_0
        //   64: getfield 20	com/fimi/soul/module/thirdpartlogin/RegisterPage$1:b	Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;
        //   67: invokestatic 52	com/fimi/soul/module/thirdpartlogin/RegisterPage:a	(Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;)Ljava/lang/String;
        //   70: invokevirtual 78	com/fimi/soul/module/thirdpartlogin/f:a	(Ljava/lang/String;)V
        //   73: new 80	android/os/Message
        //   76: dup
        //   77: invokespecial 81	android/os/Message:<init>	()V
        //   80: iconst_3
        //   81: putfield 85	android/os/Message:what	I
        //   84: aload_0
        //   85: getfield 20	com/fimi/soul/module/thirdpartlogin/RegisterPage$1:b	Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;
        //   88: invokestatic 89	com/fimi/soul/module/thirdpartlogin/RegisterPage:c	(Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;)Landroid/widget/ImageView;
        //   91: new 13	com/fimi/soul/module/thirdpartlogin/RegisterPage$1$1
        //   94: dup
        //   95: aload_0
        //   96: invokespecial 92	com/fimi/soul/module/thirdpartlogin/RegisterPage$1$1:<init>	(Lcom/fimi/soul/module/thirdpartlogin/RegisterPage$1;)V
        //   99: invokevirtual 98	android/widget/ImageView:post	(Ljava/lang/Runnable;)Z
        //   102: pop
        //   103: return
        //   104: astore_1
        //   105: aload_1
        //   106: invokevirtual 101	java/io/IOException:printStackTrace	()V
        //   109: goto -53 -> 56
        //   112: astore_1
        //   113: aload_1
        //   114: invokevirtual 102	java/lang/Exception:printStackTrace	()V
        //   117: return
        //   118: astore_3
        //   119: aconst_null
        //   120: astore_2
        //   121: aload_2
        //   122: astore_1
        //   123: aload_3
        //   124: invokevirtual 103	java/io/FileNotFoundException:printStackTrace	()V
        //   127: aload_2
        //   128: invokevirtual 68	java/io/FileOutputStream:flush	()V
        //   131: aload_2
        //   132: invokevirtual 71	java/io/FileOutputStream:close	()V
        //   135: goto -79 -> 56
        //   138: astore_1
        //   139: aload_1
        //   140: invokevirtual 101	java/io/IOException:printStackTrace	()V
        //   143: goto -87 -> 56
        //   146: astore_3
        //   147: aload_1
        //   148: astore_2
        //   149: aload_3
        //   150: astore_1
        //   151: aload_2
        //   152: invokevirtual 68	java/io/FileOutputStream:flush	()V
        //   155: aload_2
        //   156: invokevirtual 71	java/io/FileOutputStream:close	()V
        //   159: aload_1
        //   160: athrow
        //   161: astore_2
        //   162: aload_2
        //   163: invokevirtual 101	java/io/IOException:printStackTrace	()V
        //   166: goto -7 -> 159
        //   169: astore_3
        //   170: aload_1
        //   171: astore_2
        //   172: aload_3
        //   173: astore_1
        //   174: goto -23 -> 151
        //   177: astore_3
        //   178: goto -57 -> 121
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	181	0	this	1
        //   19	18	1	localObject1	Object
        //   104	2	1	localIOException1	java.io.IOException
        //   112	2	1	localException	Exception
        //   122	1	1	localObject2	Object
        //   138	10	1	localIOException2	java.io.IOException
        //   150	24	1	localObject3	Object
        //   34	122	2	localObject4	Object
        //   161	2	2	localIOException3	java.io.IOException
        //   171	1	2	localObject5	Object
        //   17	21	3	localBitmap	android.graphics.Bitmap
        //   118	6	3	localFileNotFoundException1	java.io.FileNotFoundException
        //   146	4	3	localObject6	Object
        //   169	4	3	localObject7	Object
        //   177	1	3	localFileNotFoundException2	java.io.FileNotFoundException
        // Exception table:
        //   from	to	target	type
        //   48	56	104	java/io/IOException
        //   0	18	112	java/lang/Exception
        //   48	56	112	java/lang/Exception
        //   56	103	112	java/lang/Exception
        //   105	109	112	java/lang/Exception
        //   127	135	112	java/lang/Exception
        //   139	143	112	java/lang/Exception
        //   151	159	112	java/lang/Exception
        //   159	161	112	java/lang/Exception
        //   162	166	112	java/lang/Exception
        //   20	35	118	java/io/FileNotFoundException
        //   127	135	138	java/io/IOException
        //   20	35	146	finally
        //   151	159	161	java/io/IOException
        //   37	48	169	finally
        //   123	127	169	finally
        //   37	48	177	java/io/FileNotFoundException
      }
    }).start();
  }
  
  private void c()
  {
    Intent localIntent = new Intent("android.intent.action.PICK");
    localIntent.setType("image/*");
    localIntent.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    startActivityForResult(localIntent, 0);
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      return false;
      this.j.setImageURI(Uri.parse(this.o));
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 0) && (paramInt2 == -1) && (paramIntent != null))
    {
      paramIntent = getBaseContext().getContentResolver().query(paramIntent.getData(), null, null, null, null);
      paramIntent.moveToNext();
      String str = paramIntent.getString(paramIntent.getColumnIndex("_data"));
      paramIntent.close();
      if (new File(str).exists())
      {
        Log.d(getClass().getSimpleName(), "onActivityResult == " + str + " == exist");
        this.p.a(str);
        this.j.setImageBitmap(e.a(str));
      }
    }
    do
    {
      return;
      if ((paramInt1 == 1) && (paramInt2 == -1))
      {
        this.p.a(this.o);
        this.j.setImageDrawable(Drawable.createFromPath(this.o));
        return;
      }
    } while ((paramInt1 != 2) || (paramInt2 != -1) || (paramIntent == null));
    this.j.setImageDrawable(Drawable.createFromPath(this.o));
  }
  
  public void onClick(View paramView) {}
  
  protected void onCreate(Bundle paramBundle)
  {
    this.h = f;
    this.i = ShareSDK.getPlatform(g);
    f = null;
    g = null;
    super.onCreate(paramBundle);
    a();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/thirdpartlogin/RegisterPage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */