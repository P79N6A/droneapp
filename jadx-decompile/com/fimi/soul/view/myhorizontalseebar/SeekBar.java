package com.fimi.soul.view.myhorizontalseebar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class SeekBar extends AbsSeekBar {
    private a n;

    public interface a {
        void a(SeekBar seekBar);

        void a(SeekBar seekBar, int i, boolean z);

        void b(SeekBar seekBar);
    }

    public SeekBar(Context context) {
        this(context, null);
    }

    public SeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842875);
    }

    public SeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    void a() {
        super.a();
        if (this.n != null) {
            this.n.a(this);
        }
    }

    void a(float f, boolean z) {
        super.a(f, z);
        if (this.n != null) {
            this.n.a(this, getProgress(), z);
        }
    }

    void b() {
        super.b();
        if (this.n != null) {
            this.n.b(this);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(SeekBar.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
    }

    public void setOnSeekBarChangeListener(a aVar) {
        this.n = aVar;
    }
}
