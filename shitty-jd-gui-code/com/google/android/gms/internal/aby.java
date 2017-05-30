package com.google.android.gms.internal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.google.android.gms.R.string;
import com.google.android.gms.ads.internal.u;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@aaa
public class aby
{
  private final Context a;
  private String b;
  private String c;
  private final float d;
  private float e;
  private float f;
  private float g;
  private int h = 0;
  
  public aby(Context paramContext)
  {
    this.a = paramContext;
    this.d = paramContext.getResources().getDisplayMetrics().density;
  }
  
  public aby(Context paramContext, String paramString)
  {
    this(paramContext);
    this.b = paramString;
  }
  
  private void b()
  {
    if (!(this.a instanceof Activity))
    {
      abr.c("Can not create dialog without Activity Context");
      return;
    }
    Object localObject2 = u.i().q();
    Object localObject1;
    String str1;
    label52:
    String str2;
    if (localObject2 != null)
    {
      localObject1 = ((Resources)localObject2).getString(R.string.debug_menu_title);
      if (localObject2 == null) {
        break label143;
      }
      str1 = ((Resources)localObject2).getString(R.string.debug_menu_ad_information);
      if (localObject2 == null) {
        break label149;
      }
      str2 = ((Resources)localObject2).getString(R.string.debug_menu_creative_preview);
      label66:
      if (localObject2 == null) {
        break label155;
      }
    }
    label143:
    label149:
    label155:
    for (localObject2 = ((Resources)localObject2).getString(R.string.debug_menu_troubleshooting);; localObject2 = "Troubleshooting")
    {
      localObject1 = new AlertDialog.Builder(this.a).setTitle((CharSequence)localObject1);
      aby.1 local1 = new aby.1(this);
      ((AlertDialog.Builder)localObject1).setItems(new String[] { str1, str2, localObject2 }, local1).create().show();
      return;
      localObject1 = "Select a Debug Mode";
      break;
      str1 = "Ad Information";
      break label52;
      str2 = "Creative Preview";
      break label66;
    }
  }
  
  static String c(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      paramString = "No debug information";
    }
    Object localObject;
    do
    {
      return paramString;
      paramString = paramString.replaceAll("\\+", "%20");
      localObject = new Uri.Builder().encodedQuery(paramString).build();
      paramString = new StringBuilder();
      localObject = u.e().a((Uri)localObject);
      Iterator localIterator = ((Map)localObject).keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        paramString.append(str).append(" = ").append((String)((Map)localObject).get(str)).append("\n\n");
      }
      localObject = paramString.toString().trim();
      paramString = (String)localObject;
    } while (!TextUtils.isEmpty((CharSequence)localObject));
    return "No debug information";
  }
  
  private void c()
  {
    if (!(this.a instanceof Activity))
    {
      abr.c("Can not create dialog without Activity Context");
      return;
    }
    String str = c(this.b);
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.a);
    localBuilder.setMessage(str);
    localBuilder.setTitle("Ad Information");
    localBuilder.setPositiveButton("Share", new aby.2(this, str));
    localBuilder.setNegativeButton("Close", new aby.3(this));
    localBuilder.create().show();
  }
  
  public void a()
  {
    if (((Boolean)uf.cD.c()).booleanValue())
    {
      b();
      return;
    }
    c();
  }
  
  void a(int paramInt, float paramFloat1, float paramFloat2)
  {
    if (paramInt == 0)
    {
      this.h = 0;
      this.e = paramFloat1;
      this.f = paramFloat2;
      this.g = paramFloat2;
    }
    label24:
    label227:
    do
    {
      do
      {
        break label24;
        do
        {
          return;
        } while (this.h == -1);
        if (paramInt != 2) {
          break;
        }
        if (paramFloat2 > this.f) {
          this.f = paramFloat2;
        }
        while (this.f - this.g > 30.0F * this.d)
        {
          this.h = -1;
          return;
          if (paramFloat2 < this.g) {
            this.g = paramFloat2;
          }
        }
        if ((this.h == 0) || (this.h == 2)) {
          if (paramFloat1 - this.e >= 50.0F * this.d) {
            this.e = paramFloat1;
          }
        }
        for (this.h += 1;; this.h += 1)
        {
          do
          {
            if ((this.h != 1) && (this.h != 3)) {
              break label227;
            }
            if (paramFloat1 <= this.e) {
              break;
            }
            this.e = paramFloat1;
            return;
          } while (((this.h != 1) && (this.h != 3)) || (paramFloat1 - this.e > -50.0F * this.d));
          this.e = paramFloat1;
        }
      } while ((this.h != 2) || (paramFloat1 >= this.e));
      this.e = paramFloat1;
      return;
    } while ((paramInt != 1) || (this.h != 4));
    a();
  }
  
  public void a(MotionEvent paramMotionEvent)
  {
    int j = paramMotionEvent.getHistorySize();
    int i = 0;
    while (i < j)
    {
      a(paramMotionEvent.getActionMasked(), paramMotionEvent.getHistoricalX(0, i), paramMotionEvent.getHistoricalY(0, i));
      i += 1;
    }
    a(paramMotionEvent.getActionMasked(), paramMotionEvent.getX(), paramMotionEvent.getY());
  }
  
  public void a(String paramString)
  {
    this.c = paramString;
  }
  
  public void b(String paramString)
  {
    this.b = paramString;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/aby.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */