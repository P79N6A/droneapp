package com.google.firebase.c;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.d;
import com.google.firebase.c;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class g
  extends c
{
  public static final int a = -13000;
  public static final int b = -13010;
  public static final int c = -13011;
  public static final int d = -13012;
  public static final int e = -13013;
  public static final int f = -13020;
  public static final int g = -13021;
  public static final int h = -13030;
  public static final int i = -13031;
  public static final int j = -13040;
  static IOException k;
  private final int m;
  private final int n;
  private String o;
  private Throwable p;
  
  static
  {
    if (!g.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      l = bool;
      k = new IOException("The operation was canceled.");
      return;
    }
  }
  
  g(int paramInt1, Throwable paramThrowable, int paramInt2)
  {
    this.o = a(paramInt1);
    this.p = paramThrowable;
    this.m = paramInt1;
    this.n = paramInt2;
    paramThrowable = this.o;
    String str1 = String.valueOf(Integer.toString(this.m));
    String str2 = String.valueOf(Integer.toString(this.n));
    Log.e("StorageException", String.valueOf(paramThrowable).length() + 52 + String.valueOf(str1).length() + String.valueOf(str2).length() + "StorageException has occurred.\n" + paramThrowable + "\n Code: " + str1 + " HttpResult: " + str2);
    if (this.p != null) {
      Log.e("StorageException", this.p.getMessage(), this.p);
    }
  }
  
  g(Status paramStatus)
  {
    this(b(paramStatus), null, 0);
  }
  
  g(@Nullable Throwable paramThrowable, int paramInt)
  {
    this(b(paramThrowable, paramInt), paramThrowable, paramInt);
  }
  
  @NonNull
  public static g a(@NonNull Status paramStatus)
  {
    d.a(paramStatus);
    if (!paramStatus.f()) {}
    for (boolean bool = true;; bool = false)
    {
      d.b(bool);
      return new g(paramStatus);
    }
  }
  
  @NonNull
  public static g a(@NonNull Throwable paramThrowable)
  {
    paramThrowable = a(paramThrowable, 0);
    if ((!l) && (paramThrowable == null)) {
      throw new AssertionError();
    }
    return paramThrowable;
  }
  
  @Nullable
  public static g a(@Nullable Throwable paramThrowable, int paramInt)
  {
    if ((paramThrowable instanceof g)) {
      return (g)paramThrowable;
    }
    if ((b(paramInt)) && (paramThrowable == null)) {
      return null;
    }
    return new g(paramThrowable, paramInt);
  }
  
  static String a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "An unknown error occurred, please check the HTTP result code and inner exception for server response.";
    case -13000: 
      return "An unknown error occurred, please check the HTTP result code and inner exception for server response.";
    case -13010: 
      return "Object does not exist at location.";
    case -13011: 
      return "Bucket does not exist.";
    case -13012: 
      return "Project does not exist.";
    case -13013: 
      return "Quota for bucket exceeded, please view quota on www.firebase.google.com/storage.";
    case -13020: 
      return "User is not authenticated, please authenticate using Firebase Authentication and try again.";
    case -13021: 
      return "User does not have permission to access this object.";
    case -13030: 
      return "The operation retry limit has been exceeded.";
    case -13031: 
      return "Object has a checksum which does not match. Please retry the operation.";
    }
    return "The operation was cancelled.";
  }
  
  private static int b(Status paramStatus)
  {
    if (paramStatus.g()) {
      return 52496;
    }
    if (paramStatus == Status.d) {
      return 52506;
    }
    return 52536;
  }
  
  private static int b(@Nullable Throwable paramThrowable, int paramInt)
  {
    if (paramThrowable == k) {
      return 52496;
    }
    switch (paramInt)
    {
    default: 
      return 52536;
    case -2: 
      return 52506;
    case 401: 
      return 52516;
    case 403: 
      return 52515;
    }
    return 52526;
  }
  
  private static boolean b(int paramInt)
  {
    return (paramInt == 0) || ((paramInt >= 200) && (paramInt < 300));
  }
  
  public int a()
  {
    return this.m;
  }
  
  public int b()
  {
    return this.n;
  }
  
  public boolean c()
  {
    return a() == 52506;
  }
  
  public Throwable getCause()
  {
    if (this.p == this) {
      return null;
    }
    return this.p;
  }
  
  public String getMessage()
  {
    return this.o;
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface a {}
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/firebase/c/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */