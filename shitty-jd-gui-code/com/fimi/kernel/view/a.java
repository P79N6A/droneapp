package com.fimi.kernel.view;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.widget.Toast;
import com.fimi.kernel.R.string;
import com.fimi.kernel.c;
import com.fimi.kernel.d;
import java.util.Calendar;

class a
  implements b
{
  private com.fimi.kernel.view.dialog.b a;
  private ProgressDialog b;
  
  private Activity d()
  {
    return c.d();
  }
  
  public void a()
  {
    b("");
  }
  
  public void a(int paramInt)
  {
    Toast.makeText(d(), d().getResources().getString(paramInt), 0).show();
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    if (this.b != null)
    {
      this.b.setMax(paramInt2);
      this.b.setProgress(paramInt1);
    }
  }
  
  public void a(DatePickerDialog.OnDateSetListener paramOnDateSetListener, Calendar paramCalendar)
  {
    new DatePickerDialog(d(), paramOnDateSetListener, paramCalendar.get(1), paramCalendar.get(2), paramCalendar.get(5)).show();
  }
  
  public void a(TimePickerDialog.OnTimeSetListener paramOnTimeSetListener, Calendar paramCalendar)
  {
    new TimePickerDialog(d(), paramOnTimeSetListener, paramCalendar.get(11), paramCalendar.get(12), true).show();
  }
  
  public void a(String paramString)
  {
    Toast.makeText(d(), paramString, 0).show();
  }
  
  public void a(String paramString, DialogInterface.OnClickListener paramOnClickListener)
  {
    new AlertDialog.Builder(d()).setTitle(c(R.string.message)).setMessage(paramString).setPositiveButton(c(R.string.confirm), paramOnClickListener).show();
  }
  
  public Dialog b()
  {
    if (this.b != null) {
      return this.b;
    }
    if (this.a != null) {
      return this.a;
    }
    return null;
  }
  
  public void b(int paramInt)
  {
    if (this.b != null)
    {
      this.b.setMax(100);
      this.b.setProgress(paramInt);
    }
  }
  
  public void b(String paramString)
  {
    if (d() == null) {
      return;
    }
    this.a = new com.fimi.kernel.view.dialog.b(d());
    this.a.setProgressStyle(0);
    this.a.a(paramString);
    this.a.setTitle(paramString);
    this.a.show();
  }
  
  public void b(String paramString, DialogInterface.OnClickListener paramOnClickListener)
  {
    new AlertDialog.Builder(d()).setTitle(c(R.string.message)).setMessage(paramString).setPositiveButton(c(R.string.confirm), paramOnClickListener).setNegativeButton(c(R.string.cancel), paramOnClickListener).show();
  }
  
  public CharSequence c(int paramInt)
  {
    return d().getResources().getText(paramInt);
  }
  
  public void c()
  {
    if (this.b != null) {
      this.b.dismiss();
    }
    if (this.a != null) {
      this.a.dismiss();
    }
  }
  
  public void c(String paramString)
  {
    this.b = new ProgressDialog(d());
    this.b.setProgressStyle(1);
    this.b.setMessage(paramString);
    this.b.setMax(d.a);
    this.b.setCancelable(false);
    this.b.show();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/view/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */