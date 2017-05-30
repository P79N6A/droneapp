package com.fimi.kernel.view.dialog;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import com.fimi.kernel.R.id;
import com.fimi.kernel.R.layout;

public class b
  extends ProgressDialog
{
  private String a;
  
  public b(Context paramContext)
  {
    super(paramContext);
  }
  
  public b(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.dialog_easyprogress);
    paramBundle = (TextView)findViewById(R.id.pb_easyMessage);
    if (this.a != null) {
      paramBundle.setText(this.a);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/view/dialog/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */