package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.common.e;

public class h
  extends e.a
{
  private final Context a;
  
  public h(Context paramContext)
  {
    this.a = paramContext;
  }
  
  private void b()
  {
    if (!e.c(this.a, Binder.getCallingUid()))
    {
      int i = Binder.getCallingUid();
      throw new SecurityException(52 + "Calling UID " + i + " is not Google Play services.");
    }
  }
  
  /* Error */
  private void c()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 13	com/google/android/gms/auth/api/signin/internal/h:a	Landroid/content/Context;
    //   4: invokestatic 57	com/google/android/gms/auth/api/signin/internal/j:a	(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/internal/j;
    //   7: astore_3
    //   8: aload_3
    //   9: invokevirtual 60	com/google/android/gms/auth/api/signin/internal/j:a	()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    //   12: astore_2
    //   13: getstatic 66	com/google/android/gms/auth/api/signin/GoogleSignInOptions:d	Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;
    //   16: astore_1
    //   17: aload_2
    //   18: ifnull +8 -> 26
    //   21: aload_3
    //   22: invokevirtual 69	com/google/android/gms/auth/api/signin/internal/j:b	()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;
    //   25: astore_1
    //   26: new 71	com/google/android/gms/common/api/g$a
    //   29: dup
    //   30: aload_0
    //   31: getfield 13	com/google/android/gms/auth/api/signin/internal/h:a	Landroid/content/Context;
    //   34: invokespecial 73	com/google/android/gms/common/api/g$a:<init>	(Landroid/content/Context;)V
    //   37: getstatic 79	com/google/android/gms/auth/api/a:f	Lcom/google/android/gms/common/api/a;
    //   40: aload_1
    //   41: invokevirtual 82	com/google/android/gms/common/api/g$a:a	(Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/a$a$a;)Lcom/google/android/gms/common/api/g$a;
    //   44: invokevirtual 85	com/google/android/gms/common/api/g$a:c	()Lcom/google/android/gms/common/api/g;
    //   47: astore_1
    //   48: aload_1
    //   49: invokevirtual 90	com/google/android/gms/common/api/g:f	()Lcom/google/android/gms/common/ConnectionResult;
    //   52: invokevirtual 95	com/google/android/gms/common/ConnectionResult:b	()Z
    //   55: ifeq +17 -> 72
    //   58: aload_2
    //   59: ifnull +18 -> 77
    //   62: getstatic 99	com/google/android/gms/auth/api/a:k	Lcom/google/android/gms/auth/api/signin/a;
    //   65: aload_1
    //   66: invokeinterface 104 2 0
    //   71: pop
    //   72: aload_1
    //   73: invokevirtual 107	com/google/android/gms/common/api/g:g	()V
    //   76: return
    //   77: aload_1
    //   78: invokevirtual 111	com/google/android/gms/common/api/g:i	()Lcom/google/android/gms/common/api/i;
    //   81: pop
    //   82: goto -10 -> 72
    //   85: astore_2
    //   86: aload_1
    //   87: invokevirtual 107	com/google/android/gms/common/api/g:g	()V
    //   90: aload_2
    //   91: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	92	0	this	h
    //   16	71	1	localObject1	Object
    //   12	47	2	localGoogleSignInAccount	com.google.android.gms.auth.api.signin.GoogleSignInAccount
    //   85	6	2	localObject2	Object
    //   7	15	3	localj	j
    // Exception table:
    //   from	to	target	type
    //   48	58	85	finally
    //   62	72	85	finally
    //   77	82	85	finally
  }
  
  public void a()
  {
    b();
    c();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */