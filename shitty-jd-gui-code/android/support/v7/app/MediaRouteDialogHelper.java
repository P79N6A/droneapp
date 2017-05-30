package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.mediarouter.R.dimen;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

final class MediaRouteDialogHelper
{
  public static int getDialogWidth(Context paramContext)
  {
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    TypedValue localTypedValue;
    if (localDisplayMetrics.widthPixels < localDisplayMetrics.heightPixels)
    {
      i = 1;
      localTypedValue = new TypedValue();
      paramContext = paramContext.getResources();
      if (i == 0) {
        break label69;
      }
    }
    label69:
    for (int i = R.dimen.mr_dialog_fixed_width_minor;; i = R.dimen.mr_dialog_fixed_width_major)
    {
      paramContext.getValue(i, localTypedValue, true);
      if (localTypedValue.type != 5) {
        break label76;
      }
      return (int)localTypedValue.getDimension(localDisplayMetrics);
      i = 0;
      break;
    }
    label76:
    if (localTypedValue.type == 6) {
      return (int)localTypedValue.getFraction(localDisplayMetrics.widthPixels, localDisplayMetrics.widthPixels);
    }
    return -2;
  }
  
  public static <E> HashMap<E, BitmapDrawable> getItemBitmapMap(Context paramContext, ListView paramListView, ArrayAdapter<E> paramArrayAdapter)
  {
    HashMap localHashMap = new HashMap();
    int j = paramListView.getFirstVisiblePosition();
    int i = 0;
    while (i < paramListView.getChildCount())
    {
      localHashMap.put(paramArrayAdapter.getItem(j + i), getViewBitmap(paramContext, paramListView.getChildAt(i)));
      i += 1;
    }
    return localHashMap;
  }
  
  public static <E> HashMap<E, Rect> getItemBoundMap(ListView paramListView, ArrayAdapter<E> paramArrayAdapter)
  {
    HashMap localHashMap = new HashMap();
    int j = paramListView.getFirstVisiblePosition();
    int i = 0;
    while (i < paramListView.getChildCount())
    {
      Object localObject = paramArrayAdapter.getItem(j + i);
      View localView = paramListView.getChildAt(i);
      localHashMap.put(localObject, new Rect(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom()));
      i += 1;
    }
    return localHashMap;
  }
  
  public static <E> Set<E> getItemsAdded(List<E> paramList1, List<E> paramList2)
  {
    paramList2 = new HashSet(paramList2);
    paramList2.removeAll(paramList1);
    return paramList2;
  }
  
  public static <E> Set<E> getItemsRemoved(List<E> paramList1, List<E> paramList2)
  {
    paramList1 = new HashSet(paramList1);
    paramList1.removeAll(paramList2);
    return paramList1;
  }
  
  private static BitmapDrawable getViewBitmap(Context paramContext, View paramView)
  {
    Bitmap localBitmap = Bitmap.createBitmap(paramView.getWidth(), paramView.getHeight(), Bitmap.Config.ARGB_8888);
    paramView.draw(new Canvas(localBitmap));
    return new BitmapDrawable(paramContext.getResources(), localBitmap);
  }
  
  public static <E> boolean listUnorderedEquals(List<E> paramList1, List<E> paramList2)
  {
    return new HashSet(paramList1).equals(new HashSet(paramList2));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/app/MediaRouteDialogHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */