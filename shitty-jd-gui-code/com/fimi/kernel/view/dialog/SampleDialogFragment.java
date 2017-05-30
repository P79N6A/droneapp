package com.fimi.kernel.view.dialog;

import android.animation.Animator;
import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.fimi.kernel.utils.w;

public class SampleDialogFragment
  extends DialogFragment
{
  protected w a;
  private int b;
  private int c;
  private View d;
  private DialogInterface.OnCancelListener e = null;
  private DialogInterface.OnDismissListener f = null;
  private int g;
  private int h;
  
  public static SampleDialogFragment a(int paramInt1, int paramInt2)
  {
    return a(paramInt1, paramInt2, 17);
  }
  
  public static SampleDialogFragment a(int paramInt1, int paramInt2, int paramInt3)
  {
    SampleDialogFragment localSampleDialogFragment = new SampleDialogFragment();
    Bundle localBundle = new Bundle();
    localBundle.putInt("style", paramInt1);
    localBundle.putInt("theme", paramInt2);
    localBundle.putInt("gravity", paramInt3);
    localSampleDialogFragment.setArguments(localBundle);
    return localSampleDialogFragment;
  }
  
  public static SampleDialogFragment a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    SampleDialogFragment localSampleDialogFragment = new SampleDialogFragment();
    Bundle localBundle = new Bundle();
    localBundle.putInt("style", paramInt1);
    localBundle.putInt("theme", paramInt2);
    localBundle.putInt("gravity", paramInt3);
    localBundle.putInt("color", paramInt4);
    localSampleDialogFragment.setArguments(localBundle);
    return localSampleDialogFragment;
  }
  
  public View a()
  {
    return this.d;
  }
  
  public void a(int paramInt)
  {
    this.a.c(paramInt);
  }
  
  public void a(DialogInterface.OnCancelListener paramOnCancelListener)
  {
    this.e = paramOnCancelListener;
  }
  
  public void a(DialogInterface.OnDismissListener paramOnDismissListener)
  {
    this.f = paramOnDismissListener;
  }
  
  public void a(View paramView)
  {
    this.d = paramView;
  }
  
  protected void a(boolean paramBoolean)
  {
    Window localWindow = getActivity().getWindow();
    WindowManager.LayoutParams localLayoutParams = localWindow.getAttributes();
    if (paramBoolean) {}
    for (localLayoutParams.flags |= 0x4000000;; localLayoutParams.flags &= 0xFBFFFFFF)
    {
      localWindow.setAttributes(localLayoutParams);
      return;
    }
  }
  
  public DialogInterface.OnCancelListener b()
  {
    return this.e;
  }
  
  public DialogInterface.OnDismissListener c()
  {
    return this.f;
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    Window localWindow = getDialog().getWindow();
    localWindow.getAttributes().gravity = this.g;
    localWindow.setLayout(-1, -2);
    localWindow.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#88838B8B")));
    super.onActivityCreated(paramBundle);
  }
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.e != null) {
      this.e.onCancel(paramDialogInterface);
    }
    super.onCancel(paramDialogInterface);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    dismiss();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.c = getArguments().getInt("style");
    this.b = getArguments().getInt("theme");
    this.g = getArguments().getInt("gravity");
    this.h = getArguments().getInt("color");
    setStyle(this.c, this.b);
    this.a = new w(getActivity());
    if (Build.VERSION.SDK_INT >= 19) {
      a(true);
    }
    this.a.a(true);
    a(this.h);
  }
  
  public Animator onCreateAnimator(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    return super.onCreateAnimator(paramInt1, paramBoolean, paramInt2);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return this.d;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    dismiss();
  }
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    if (this.f != null) {
      this.f.onDismiss(paramDialogInterface);
    }
    super.onDismiss(paramDialogInterface);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/view/dialog/SampleDialogFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */