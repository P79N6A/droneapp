package com.google.android.gms.appinvite;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.android.gms.common.internal.d;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class c
{
  private static final String[] a = { "jpg", "jpeg", "png" };
  
  public static String[] a(int paramInt, @NonNull Intent paramIntent)
  {
    if (paramInt == -1) {
      return paramIntent.getStringArrayExtra("com.google.android.gms.appinvite.RESULT_INVITATION_IDS");
    }
    return null;
  }
  
  private static Bundle b(Map<String, String> paramMap)
  {
    Bundle localBundle = new Bundle();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localBundle.putString(str, (String)paramMap.get(str));
    }
    return localBundle;
  }
  
  private static boolean b(String paramString)
  {
    boolean bool2 = false;
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < a.length)
      {
        if (a[i].equals(paramString)) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
  
  public static final class a
  {
    public static final int a = 100;
    public static final int b = 512000;
    public static final int c = 2;
    public static final int d = 20;
    private final Intent e;
    private String f;
    private String g;
    
    public a(@NonNull CharSequence paramCharSequence)
    {
      d.a(paramCharSequence);
      this.e = new Intent("com.google.android.gms.appinvite.ACTION_APP_INVITE");
      this.e.putExtra("com.google.android.gms.appinvite.TITLE", paramCharSequence);
      this.e.setPackage("com.google.android.gms");
    }
    
    public Intent a()
    {
      if (!TextUtils.isEmpty(this.f))
      {
        d.a(this.g, "Email html content must be set when email subject is set.");
        if (this.e.getData() == null)
        {
          bool = true;
          d.b(bool, "Custom image must not be set when email html content is set.");
          d.b(TextUtils.isEmpty(this.e.getCharSequenceExtra("com.google.android.gms.appinvite.BUTTON_TEXT")), "Call to action text must not be set when email html content is set.");
          this.e.putExtra("com.google.android.gms.appinvite.EMAIL_SUBJECT", this.f);
          this.e.putExtra("com.google.android.gms.appinvite.EMAIL_CONTENT", this.g);
        }
      }
      while (TextUtils.isEmpty(this.g)) {
        for (;;)
        {
          return this.e;
          boolean bool = false;
        }
      }
      throw new IllegalArgumentException("Email subject must be set when email html content is set.");
    }
    
    public a a(int paramInt)
    {
      this.e.putExtra("com.google.android.gms.appinvite.appMinimumVersionCode", paramInt);
      return this;
    }
    
    public a a(int paramInt, String paramString)
    {
      switch (paramInt)
      {
      default: 
        throw new IllegalArgumentException("targetPlatform must be either PROJECT_PLATFORM_IOS or PROJECT_PLATFORM_ANDROID.");
      case 1: 
        this.e.putExtra("com.google.android.gms.appinvite.iosTargetApplication", paramString);
        return this;
      }
      this.e.putExtra("com.google.android.gms.appinvite.androidTargetApplication", paramString);
      return this;
    }
    
    public a a(Account paramAccount)
    {
      if ((paramAccount != null) && ("com.google".equals(paramAccount.type)))
      {
        this.e.putExtra("com.google.android.gms.appinvite.ACCOUNT_NAME", paramAccount);
        return this;
      }
      this.e.removeExtra("com.google.android.gms.appinvite.ACCOUNT_NAME");
      return this;
    }
    
    public a a(Uri paramUri)
    {
      if (paramUri != null)
      {
        this.e.putExtra("com.google.android.gms.appinvite.DEEP_LINK_URL", paramUri);
        return this;
      }
      this.e.removeExtra("com.google.android.gms.appinvite.DEEP_LINK_URL");
      return this;
    }
    
    public a a(CharSequence paramCharSequence)
    {
      if ((paramCharSequence != null) && (paramCharSequence.length() > 100)) {
        throw new IllegalArgumentException(String.format("Message must be %d chars or less.", new Object[] { Integer.valueOf(100) }));
      }
      this.e.putExtra("com.google.android.gms.appinvite.MESSAGE", paramCharSequence);
      return this;
    }
    
    public a a(String paramString)
    {
      this.f = paramString;
      return this;
    }
    
    public a a(Map<String, String> paramMap)
    {
      if (paramMap != null)
      {
        this.e.putExtra("com.google.android.gms.appinvite.REFERRAL_PARAMETERS_URI", c.a(paramMap));
        return this;
      }
      this.e.removeExtra("com.google.android.gms.appinvite.REFERRAL_PARAMETERS_URI");
      return this;
    }
    
    public a b(Uri paramUri)
    {
      boolean bool2 = false;
      d.a(paramUri);
      d.b(paramUri.isAbsolute(), "Image uri is not an absolute uri. Did you forget to add a scheme to the Uri?");
      String str2 = paramUri.getScheme().toLowerCase();
      int i;
      boolean bool1;
      label84:
      String str1;
      if ((str2.equals("android.resource")) || (str2.equals("content")) || (str2.equals("file")))
      {
        i = 1;
        if ((i == 0) && (!str2.equals("http")) && (!str2.equals("https"))) {
          break label206;
        }
        bool1 = true;
        d.b(bool1, "Image uri must be a content URI with scheme \"android.resource\", \"content\" or \"file\", or a network url with scheme \"http\" or \"https\".");
        if (i == 0)
        {
          str1 = paramUri.toString();
          str1 = str1.substring(str1.lastIndexOf("/") + 1, str1.length());
          if (str1 != null) {
            break label211;
          }
          str1 = null;
        }
      }
      for (;;)
      {
        if (!TextUtils.isEmpty(str1))
        {
          bool1 = bool2;
          if (!c.a(str1)) {}
        }
        else
        {
          bool1 = true;
        }
        d.b(bool1, String.valueOf(str1).concat(" images are not supported. Only jpg, jpeg, or png images are supported."));
        paramUri = paramUri.buildUpon().scheme(str2).build();
        this.e.setData(paramUri);
        if (i != 0) {
          this.e.addFlags(1);
        }
        return this;
        i = 0;
        break;
        label206:
        bool1 = false;
        break label84;
        label211:
        if (str1.lastIndexOf(".") == -1) {
          str1 = null;
        } else {
          str1 = str1.substring(str1.lastIndexOf(".") + 1, str1.length()).toLowerCase();
        }
      }
    }
    
    public a b(CharSequence paramCharSequence)
    {
      if ((paramCharSequence == null) || (paramCharSequence.length() < 2) || (paramCharSequence.length() > 20)) {
        throw new IllegalArgumentException(String.format("Text must be between %d and %d chars in length.", new Object[] { Integer.valueOf(2), Integer.valueOf(20) }));
      }
      this.e.putExtra("com.google.android.gms.appinvite.BUTTON_TEXT", paramCharSequence);
      return this;
    }
    
    public a b(String paramString)
    {
      if ((paramString != null) && (paramString.getBytes().length > 512000)) {
        throw new IllegalArgumentException(String.format("Email html content must be %d bytes or less.", new Object[] { Integer.valueOf(512000) }));
      }
      this.g = paramString;
      return this;
    }
    
    public a c(String paramString)
    {
      this.e.putExtra("com.google.android.gms.appinvite.GOOGLE_ANALYTICS_TRACKING_ID", paramString);
      return this;
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public static @interface a
    {
      public static final int a = 1;
      public static final int b = 2;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/appinvite/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */