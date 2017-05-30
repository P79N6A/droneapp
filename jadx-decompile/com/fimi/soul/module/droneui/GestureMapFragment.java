package com.fimi.soul.module.droneui;

import android.gesture.GestureOverlayView;
import android.gesture.GestureOverlayView.OnGestureListener;
import android.gesture.GestureStroke;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.fimi.overseas.soul.R;
import com.fimi.soul.utils.al;
import java.util.ArrayList;
import java.util.List;

public class GestureMapFragment extends Fragment implements OnGestureListener {
    private static final int a = 15;
    private static final int b = 2;
    private double c;
    private GestureOverlayView d;
    private a e;

    public interface a {
        void a(List<Point> list);
    }

    private int a(double d) {
        return (int) Math.round(((double) getResources().getDisplayMetrics().density) * d);
    }

    private void a(List<Point> list) {
        float[] fArr = ((GestureStroke) this.d.getGesture().getStrokes().get(0)).points;
        for (int i = 0; i < fArr.length; i += 2) {
            list.add(new Point((int) fArr[i], (int) fArr[i + 1]));
        }
    }

    private List<Point> d() {
        List arrayList = new ArrayList();
        a(arrayList);
        return arrayList;
    }

    public void a() {
        this.d.setEnabled(true);
    }

    public void a(GestureOverlayView gestureOverlayView) {
        this.d = gestureOverlayView;
    }

    public void a(a aVar) {
        this.e = aVar;
    }

    public void b() {
        this.d.setEnabled(false);
    }

    public GestureOverlayView c() {
        return this.d;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_gesture_map, viewGroup, false);
        this.d = (GestureOverlayView) inflate.findViewById(R.id.overlay1);
        this.d.addOnGestureListener(this);
        this.d.setEnabled(false);
        this.d.setGestureStrokeWidth((float) a(2.0d));
        this.c = (double) a(15.0d);
        return inflate;
    }

    public void onGesture(GestureOverlayView gestureOverlayView, MotionEvent motionEvent) {
    }

    public void onGestureCancelled(GestureOverlayView gestureOverlayView, MotionEvent motionEvent) {
    }

    public void onGestureEnded(GestureOverlayView gestureOverlayView, MotionEvent motionEvent) {
        this.d.setEnabled(false);
        List d = d();
        if (d.size() > 1) {
            d = al.a(d, this.c);
        }
        this.e.a(d);
    }

    public void onGestureStarted(GestureOverlayView gestureOverlayView, MotionEvent motionEvent) {
    }
}
