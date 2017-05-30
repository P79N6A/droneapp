package com.google.android.gms.auth.api.credentials.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;

public final class c
{
  public static Intent a(Context paramContext, HintRequest paramHintRequest, PasswordSpecification paramPasswordSpecification)
  {
    return new Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("com.google.android.gms.credentials.RequestType", "Hints").putExtra("com.google.android.gms.credentials.HintRequest", paramHintRequest).putExtra("com.google.android.gms.credentials.PasswordSpecification", paramPasswordSpecification);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/internal/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */