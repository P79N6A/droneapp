package com.fimi.soul.module.droneui;

import android.content.res.Resources;
import android.gesture.Gesture;
import android.gesture.GestureOverlayView;
import android.gesture.GestureOverlayView.OnGestureListener;
import android.gesture.GestureStroke;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.fimi.soul.utils.al;
import java.util.ArrayList;
import java.util.List;

public class GestureMapFragment
  extends Fragment
  implements GestureOverlayView.OnGestureListener
{
  private static final int a = 15;
  private static final int b = 2;
  private double c;
  private GestureOverlayView d;
  private a e;
  
  private int a(double paramDouble)
  {
    return (int)Math.round(getResources().getDisplayMetrics().density * paramDouble);
  }
  
  private void a(List<Point> paramList)
  {
    float[] arrayOfFloat = ((GestureStroke)this.d.getGesture().getStrokes().get(0)).points;
    int i = 0;
    while (i < arrayOfFloat.length)
    {
      paramList.add(new Point((int)arrayOfFloat[i], (int)arrayOfFloat[(i + 1)]));
      i += 2;
    }
  }
  
  private List<Point> d()
  {
    ArrayList localArrayList = new ArrayList();
    a(localArrayList);
    return localArrayList;
  }
  
  public void a()
  {
    this.d.setEnabled(true);
  }
  
  public void a(GestureOverlayView paramGestureOverlayView)
  {
    this.d = paramGestureOverlayView;
  }
  
  public void a(a parama)
  {
    this.e = parama;
  }
  
  public void b()
  {
    this.d.setEnabled(false);
  }
  
  public GestureOverlayView c()
  {
    return this.d;
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968686, paramViewGroup, false);
    this.d = ((GestureOverlayView)paramLayoutInflater.findViewById(2131690214));
    this.d.addOnGestureListener(this);
    this.d.setEnabled(false);
    this.d.setGestureStrokeWidth(a(2.0D));
    this.c = a(15.0D);
    return paramLayoutInflater;
  }
  
  public void onGesture(GestureOverlayView paramGestureOverlayView, MotionEvent paramMotionEvent) {}
  
  public void onGestureCancelled(GestureOverlayView paramGestureOverlayView, MotionEvent paramMotionEvent) {}
  
  public void onGestureEnded(GestureOverlayView paramGestureOverlayView, MotionEvent paramMotionEvent)
  {
    this.d.setEnabled(false);
    paramMotionEvent = d();
    paramGestureOverlayView = paramMotionEvent;
    if (paramMotionEvent.size() > 1) {
      paramGestureOverlayView = al.a(paramMotionEvent, this.c);
    }
    this.e.a(paramGestureOverlayView);
  }
  
  public void onGestureStarted(GestureOverlayView paramGestureOverlayView, MotionEvent paramMotionEvent) {}
  
  public static abstract interface a
  {
    public abstract void a(List<Point> paramList);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneui/GestureMapFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */