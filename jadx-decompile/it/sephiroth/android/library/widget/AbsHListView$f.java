package it.sephiroth.android.library.widget;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.widget.ListAdapter;

@TargetApi(14)
class AbsHListView$f extends AccessibilityDelegateCompat {
    final /* synthetic */ AbsHListView a;

    AbsHListView$f(AbsHListView absHListView) {
        this.a = absHListView;
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        int a = this.a.a(view);
        ListAdapter listAdapter = (ListAdapter) this.a.getAdapter();
        if (a != -1 && listAdapter != null && this.a.isEnabled() && listAdapter.isEnabled(a)) {
            if (a == this.a.getSelectedItemPosition()) {
                accessibilityNodeInfoCompat.setSelected(true);
                accessibilityNodeInfoCompat.addAction(8);
            } else {
                accessibilityNodeInfoCompat.addAction(4);
            }
            if (this.a.isClickable()) {
                accessibilityNodeInfoCompat.addAction(16);
                accessibilityNodeInfoCompat.setClickable(true);
            }
            if (this.a.isLongClickable()) {
                accessibilityNodeInfoCompat.addAction(32);
                accessibilityNodeInfoCompat.setLongClickable(true);
            }
        }
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        int a = this.a.a(view);
        ListAdapter listAdapter = (ListAdapter) this.a.getAdapter();
        if (a == -1 || listAdapter == null) {
            return false;
        }
        if (!this.a.isEnabled() || !listAdapter.isEnabled(a)) {
            return false;
        }
        long i2 = this.a.i(a);
        switch (i) {
            case 4:
                if (this.a.getSelectedItemPosition() == a) {
                    return false;
                }
                this.a.setSelection(a);
                return true;
            case 8:
                if (this.a.getSelectedItemPosition() != a) {
                    return false;
                }
                this.a.setSelection(-1);
                return true;
            case 16:
                return this.a.isClickable() ? this.a.a(view, a, i2) : false;
            case 32:
                return this.a.isLongClickable() ? this.a.c(view, a, i2) : false;
            default:
                return false;
        }
    }
}
