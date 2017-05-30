package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R.id;
import com.google.android.gms.internal.fq;

@Keep
public class HelpTextView
  extends LinearLayout
  implements b
{
  private TextView ok;
  private TextView ol;
  
  @Keep
  public HelpTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private void zza(TextView paramTextView, @Nullable CharSequence paramCharSequence)
  {
    paramTextView.setText(paramCharSequence);
    if (TextUtils.isEmpty(paramCharSequence)) {}
    for (int i = 8;; i = 0)
    {
      paramTextView.setVisibility(i);
      return;
    }
  }
  
  @Keep
  public View asView()
  {
    return this;
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.ok = ((TextView)fq.a((TextView)findViewById(R.id.cast_featurehighlight_help_text_header_view)));
    this.ol = ((TextView)fq.a((TextView)findViewById(R.id.cast_featurehighlight_help_text_body_view)));
  }
  
  @Keep
  public void setText(@Nullable CharSequence paramCharSequence1, @Nullable CharSequence paramCharSequence2)
  {
    zza(this.ok, paramCharSequence1);
    zza(this.ol, paramCharSequence2);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/internal/featurehighlight/HelpTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */