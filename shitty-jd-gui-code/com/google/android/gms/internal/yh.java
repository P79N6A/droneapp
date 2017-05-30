package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract.Events;
import android.text.TextUtils;
import com.google.android.gms.R.string;
import com.google.android.gms.ads.internal.u;
import java.util.Map;

@aaa
public class yh
  extends yn
{
  private final Map<String, String> a;
  private final Context b;
  private String c;
  private long d;
  private long e;
  private String f;
  private String g;
  
  public yh(acy paramacy, Map<String, String> paramMap)
  {
    super(paramacy, "createCalendarEvent");
    this.a = paramMap;
    this.b = paramacy.f();
    c();
  }
  
  private String a(String paramString)
  {
    if (TextUtils.isEmpty((CharSequence)this.a.get(paramString))) {
      return "";
    }
    return (String)this.a.get(paramString);
  }
  
  private void c()
  {
    this.c = a("description");
    this.f = a("summary");
    this.d = e("start_ticks");
    this.e = e("end_ticks");
    this.g = a("location");
  }
  
  private long e(String paramString)
  {
    paramString = (String)this.a.get(paramString);
    if (paramString == null) {
      return -1L;
    }
    try
    {
      long l = Long.parseLong(paramString);
      return l;
    }
    catch (NumberFormatException paramString) {}
    return -1L;
  }
  
  public void a()
  {
    if (this.b == null)
    {
      b("Activity context is not available.");
      return;
    }
    if (!u.e().e(this.b).f())
    {
      b("This feature is not available on the device.");
      return;
    }
    AlertDialog.Builder localBuilder = u.e().d(this.b);
    Resources localResources = u.i().q();
    if (localResources != null)
    {
      str = localResources.getString(R.string.create_calendar_title);
      localBuilder.setTitle(str);
      if (localResources == null) {
        break label157;
      }
      str = localResources.getString(R.string.create_calendar_message);
      label85:
      localBuilder.setMessage(str);
      if (localResources == null) {
        break label163;
      }
      str = localResources.getString(R.string.accept);
      label103:
      localBuilder.setPositiveButton(str, new yh.1(this));
      if (localResources == null) {
        break label169;
      }
    }
    label157:
    label163:
    label169:
    for (String str = localResources.getString(R.string.decline);; str = "Decline")
    {
      localBuilder.setNegativeButton(str, new yh.2(this));
      localBuilder.create().show();
      return;
      str = "Create calendar event";
      break;
      str = "Allow Ad to create a calendar event?";
      break label85;
      str = "Accept";
      break label103;
    }
  }
  
  @TargetApi(14)
  Intent b()
  {
    Intent localIntent = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
    localIntent.putExtra("title", this.c);
    localIntent.putExtra("eventLocation", this.g);
    localIntent.putExtra("description", this.f);
    if (this.d > -1L) {
      localIntent.putExtra("beginTime", this.d);
    }
    if (this.e > -1L) {
      localIntent.putExtra("endTime", this.e);
    }
    localIntent.setFlags(268435456);
    return localIntent;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/yh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */