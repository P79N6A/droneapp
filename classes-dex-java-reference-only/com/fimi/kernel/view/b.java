package com.fimi.kernel.view;

import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.content.DialogInterface.OnClickListener;
import java.util.Calendar;

public abstract interface b
{
  public abstract void a();
  
  public abstract void a(int paramInt);
  
  public abstract void a(int paramInt1, int paramInt2);
  
  public abstract void a(DatePickerDialog.OnDateSetListener paramOnDateSetListener, Calendar paramCalendar);
  
  public abstract void a(TimePickerDialog.OnTimeSetListener paramOnTimeSetListener, Calendar paramCalendar);
  
  public abstract void a(String paramString);
  
  public abstract void a(String paramString, DialogInterface.OnClickListener paramOnClickListener);
  
  public abstract Dialog b();
  
  public abstract void b(int paramInt);
  
  public abstract void b(String paramString);
  
  public abstract void b(String paramString, DialogInterface.OnClickListener paramOnClickListener);
  
  public abstract CharSequence c(int paramInt);
  
  public abstract void c();
  
  public abstract void c(String paramString);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/view/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */