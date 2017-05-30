package com.fimi.soul.drone.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import com.fimi.soul.utils.ao;

public class b
{
  private static final int a = 6;
  
  public static Bitmap a(int paramInt, String paramString, Context paramContext)
  {
    return a(paramContext, 2130838137, paramInt, paramString);
  }
  
  public static Bitmap a(int paramInt, String paramString1, String paramString2, Context paramContext)
  {
    return a(paramContext, paramInt, paramString1, paramString2);
  }
  
  private static Bitmap a(Context paramContext, int paramInt1, int paramInt2, String paramString)
  {
    paramContext = paramContext.getResources();
    float f = paramContext.getDisplayMetrics().density;
    Object localObject2 = BitmapFactory.decodeResource(paramContext, paramInt1);
    Object localObject1 = ((Bitmap)localObject2).getConfig();
    paramContext = (Context)localObject1;
    if (localObject1 == null) {
      paramContext = Bitmap.Config.ARGB_8888;
    }
    paramContext = ((Bitmap)localObject2).copy(paramContext, true);
    localObject2 = new Paint();
    ((Paint)localObject2).setColorFilter(new LightingColorFilter(0, paramInt2));
    localObject1 = new Canvas(paramContext);
    ((Canvas)localObject1).drawBitmap(paramContext, 0.0F, 0.0F, (Paint)localObject2);
    localObject2 = new Paint(1);
    ((Paint)localObject2).setColor(-16777216);
    ((Paint)localObject2).setTextSize((int)(f * 15.0F));
    ((Paint)localObject2).setShadowLayer(1.0F, 0.0F, 1.0F, -1);
    Rect localRect = new Rect();
    ((Paint)localObject2).getTextBounds(paramString, 0, paramString.length(), localRect);
    paramInt1 = (paramContext.getWidth() - localRect.width()) / 2;
    paramInt2 = paramContext.getHeight();
    paramInt2 = (localRect.height() + paramInt2) * 5 / 12;
    ((Canvas)localObject1).drawText(paramString, paramInt1, paramInt2, (Paint)localObject2);
    return paramContext;
  }
  
  private static Bitmap a(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    paramContext = paramContext.getResources();
    float f = paramContext.getDisplayMetrics().density;
    Object localObject2 = BitmapFactory.decodeResource(paramContext, paramInt);
    Object localObject1 = ((Bitmap)localObject2).getConfig();
    paramContext = (Context)localObject1;
    if (localObject1 == null) {
      paramContext = Bitmap.Config.ARGB_8888;
    }
    localObject1 = ((Bitmap)localObject2).copy(paramContext, true);
    paramContext = new Paint();
    localObject2 = new Canvas((Bitmap)localObject1);
    ((Canvas)localObject2).drawBitmap((Bitmap)localObject1, 0.0F, 0.0F, paramContext);
    Paint localPaint = new Paint();
    localPaint.setColor(-1);
    localPaint.setAntiAlias(true);
    localPaint.setTextSize((int)(11.0F * f));
    localPaint.setFakeBoldText(true);
    localPaint.setShadowLayer(1.0F, 0.0F, 1.0F, -16777216);
    Rect localRect = new Rect();
    localPaint.getTextBounds(paramString1, 0, paramString1.length(), localRect);
    localRect.offsetTo(-6, localRect.height() / 2);
    if (paramString2 != null)
    {
      paramContext = new Rect();
      paramContext.offsetTo(0, localRect.bottom);
    }
    for (;;)
    {
      paramString2 = new Rect(localRect);
      paramString2.union(paramContext);
      paramString2.offsetTo((((Bitmap)localObject1).getWidth() - paramString2.width()) / 2, localRect.top + (((Bitmap)localObject1).getHeight() - paramString2.height()) / 2 - localRect.height());
      paramString2.set(paramString2.left - 6, paramString2.top - 6, paramString2.right + 6, paramString2.bottom + 6);
      paramInt = (((Bitmap)localObject1).getWidth() - localRect.width()) / 2;
      int i = localRect.top;
      int j = ((Bitmap)localObject1).getHeight();
      int k = localRect.height();
      j = (j - (paramContext.height() + k)) / 2;
      ((Canvas)localObject2).drawText(paramString1, paramInt, j + i + 5, localPaint);
      return (Bitmap)localObject1;
      paramContext = new Rect(0, 0, 0, 0);
    }
  }
  
  public static Bitmap b(int paramInt, String paramString1, String paramString2, Context paramContext)
  {
    return b(paramContext, paramInt, paramString1, paramString2);
  }
  
  private static Bitmap b(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    Object localObject1 = paramContext.getResources();
    float f = ((Resources)localObject1).getDisplayMetrics().density;
    Object localObject3 = BitmapFactory.decodeResource((Resources)localObject1, paramInt);
    Object localObject2 = ((Bitmap)localObject3).getConfig();
    localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = Bitmap.Config.ARGB_8888;
    }
    localObject1 = ((Bitmap)localObject3).copy((Bitmap.Config)localObject1, true);
    localObject3 = new Paint();
    localObject2 = new Canvas((Bitmap)localObject1);
    ((Canvas)localObject2).drawBitmap((Bitmap)localObject1, 0.0F, 0.0F, (Paint)localObject3);
    localObject3 = new Paint();
    ((Paint)localObject3).setColor(-1);
    ((Paint)localObject3).setAlpha(204);
    ((Paint)localObject3).setAntiAlias(true);
    ((Paint)localObject3).setTextSize((int)(f * 11.2D));
    TextView localTextView = new TextView(paramContext);
    localTextView.setText(paramString1);
    ao.a(paramContext.getAssets(), new View[] { localTextView });
    Rect localRect = new Rect();
    ((Paint)localObject3).getTextBounds(localTextView.getText().toString(), 0, paramString1.length(), localRect);
    localRect.offsetTo(-6, localRect.height() / 2);
    if (paramString2 != null)
    {
      paramContext = new Rect();
      paramContext.offsetTo(0, localRect.bottom);
    }
    for (;;)
    {
      paramString2 = new Rect(localRect);
      paramString2.union(paramContext);
      paramString2.offsetTo((((Bitmap)localObject1).getWidth() - paramString2.width()) / 2, localRect.top + (((Bitmap)localObject1).getHeight() - paramString2.height()) / 2 - localRect.height());
      paramString2.set(paramString2.left - 6, paramString2.top - 6, paramString2.right + 6, paramString2.bottom + 6);
      paramInt = (((Bitmap)localObject1).getWidth() - localRect.width()) / 2;
      int i = localRect.top;
      int j = ((Bitmap)localObject1).getHeight();
      int k = localRect.height();
      j = (j - (paramContext.height() + k)) / 2;
      ((Canvas)localObject2).drawText(paramString1, paramInt, (j + i) / 2 + 5, (Paint)localObject3);
      return (Bitmap)localObject1;
      paramContext = new Rect(0, 0, 0, 0);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */