package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.support.v4.widget.AutoScrollHelper;
import android.support.v4.widget.EdgeEffectCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.google.android.gms.maps.model.b;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ViewPager extends ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final Comparator<ItemInfo> COMPARATOR = new Comparator<ItemInfo>() {
        public int compare(ItemInfo itemInfo, ItemInfo itemInfo2) {
            return itemInfo.position - itemInfo2.position;
        }
    };
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    private static final int[] LAYOUT_ATTRS = new int[]{16842931};
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    private static final Interpolator sInterpolator = new Interpolator() {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * (((f2 * f2) * f2) * f2)) + 1.0f;
        }
    };
    private static final ViewPositionComparator sPositionComparator = new ViewPositionComparator();
    private int mActivePointerId = -1;
    private PagerAdapter mAdapter;
    private OnAdapterChangeListener mAdapterChangeListener;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    private int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable = new Runnable() {
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.populate();
        }
    };
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout = true;
    private float mFirstOffset = -3.4028235E38f;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mIgnoreGutter;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private OnPageChangeListener mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsUnableToDrag;
    private final ArrayList<ItemInfo> mItems = new ArrayList();
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset = AutoScrollHelper.NO_MAX;
    private EdgeEffectCompat mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets = false;
    private PagerObserver mObserver;
    private int mOffscreenPageLimit = 1;
    private OnPageChangeListener mOnPageChangeListener;
    private int mPageMargin;
    private PageTransformer mPageTransformer;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState = null;
    private ClassLoader mRestoredClassLoader = null;
    private int mRestoredCurItem = -1;
    private EdgeEffectCompat mRightEdge;
    private int mScrollState = 0;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private Method mSetChildrenDrawingOrderEnabled;
    private final ItemInfo mTempItem = new ItemInfo();
    private final Rect mTempRect = new Rect();
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;

    interface Decor {
    }

    interface OnAdapterChangeListener {
        void onAdapterChanged(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2);
    }

    public interface OnPageChangeListener {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, int i2);

        void onPageSelected(int i);
    }

    static class ItemInfo {
        Object object;
        float offset;
        int position;
        boolean scrolling;
        float widthFactor;

        ItemInfo() {
        }
    }

    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {
        int childIndex;
        public int gravity;
        public boolean isDecor;
        boolean needsMeasure;
        int position;
        float widthFactor = 0.0f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.LAYOUT_ATTRS);
            this.gravity = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    class MyAccessibilityDelegate extends AccessibilityDelegateCompat {
        MyAccessibilityDelegate() {
        }

        private boolean canScroll() {
            return ViewPager.this.mAdapter != null && ViewPager.this.mAdapter.getCount() > 1;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            AccessibilityRecordCompat obtain = AccessibilityRecordCompat.obtain();
            obtain.setScrollable(canScroll());
            if (accessibilityEvent.getEventType() == 4096 && ViewPager.this.mAdapter != null) {
                obtain.setItemCount(ViewPager.this.mAdapter.getCount());
                obtain.setFromIndex(ViewPager.this.mCurItem);
                obtain.setToIndex(ViewPager.this.mCurItem);
            }
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setClassName(ViewPager.class.getName());
            accessibilityNodeInfoCompat.setScrollable(canScroll());
            if (ViewPager.this.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.addAction(8192);
            }
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            switch (i) {
                case 4096:
                    if (!ViewPager.this.canScrollHorizontally(1)) {
                        return false;
                    }
                    ViewPager.this.setCurrentItem(ViewPager.this.mCurItem + 1);
                    return true;
                case 8192:
                    if (!ViewPager.this.canScrollHorizontally(-1)) {
                        return false;
                    }
                    ViewPager.this.setCurrentItem(ViewPager.this.mCurItem - 1);
                    return true;
                default:
                    return false;
            }
        }
    }

    public interface PageTransformer {
        void transformPage(View view, float f);
    }

    private class PagerObserver extends DataSetObserver {
        private PagerObserver() {
        }

        public void onChanged() {
            ViewPager.this.dataSetChanged();
        }

        public void onInvalidated() {
            ViewPager.this.dataSetChanged();
        }
    }

    public static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks<SavedState>() {
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        });
        Parcelable adapterState;
        ClassLoader loader;
        int position;

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.position = parcel.readInt();
            this.adapterState = parcel.readParcelable(classLoader);
            this.loader = classLoader;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.position + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.position);
            parcel.writeParcelable(this.adapterState, i);
        }
    }

    public static class SimpleOnPageChangeListener implements OnPageChangeListener {
        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
        }
    }

    static class ViewPositionComparator implements Comparator<View> {
        ViewPositionComparator() {
        }

        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            return layoutParams.isDecor != layoutParams2.isDecor ? layoutParams.isDecor ? 1 : -1 : layoutParams.position - layoutParams2.position;
        }
    }

    public ViewPager(Context context) {
        super(context);
        initViewPager();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initViewPager();
    }

    private void calculatePageOffsets(ItemInfo itemInfo, int i, ItemInfo itemInfo2) {
        float f;
        int i2;
        ItemInfo itemInfo3;
        int i3;
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? ((float) this.mPageMargin) / ((float) clientWidth) : 0.0f;
        if (itemInfo2 != null) {
            clientWidth = itemInfo2.position;
            int i4;
            if (clientWidth < itemInfo.position) {
                f = (itemInfo2.offset + itemInfo2.widthFactor) + f2;
                i4 = clientWidth + 1;
                i2 = 0;
                while (i4 <= itemInfo.position && i2 < this.mItems.size()) {
                    itemInfo3 = (ItemInfo) this.mItems.get(i2);
                    while (i4 > itemInfo3.position && i2 < this.mItems.size() - 1) {
                        i2++;
                        itemInfo3 = (ItemInfo) this.mItems.get(i2);
                    }
                    while (i4 < itemInfo3.position) {
                        f += this.mAdapter.getPageWidth(i4) + f2;
                        i4++;
                    }
                    itemInfo3.offset = f;
                    f += itemInfo3.widthFactor + f2;
                    i4++;
                }
            } else if (clientWidth > itemInfo.position) {
                i2 = this.mItems.size() - 1;
                f = itemInfo2.offset;
                i4 = clientWidth - 1;
                while (i4 >= itemInfo.position && i2 >= 0) {
                    itemInfo3 = (ItemInfo) this.mItems.get(i2);
                    while (i4 < itemInfo3.position && i2 > 0) {
                        i2--;
                        itemInfo3 = (ItemInfo) this.mItems.get(i2);
                    }
                    while (i4 > itemInfo3.position) {
                        f -= this.mAdapter.getPageWidth(i4) + f2;
                        i4--;
                    }
                    f -= itemInfo3.widthFactor + f2;
                    itemInfo3.offset = f;
                    i4--;
                }
            }
        }
        int size = this.mItems.size();
        float f3 = itemInfo.offset;
        i2 = itemInfo.position - 1;
        this.mFirstOffset = itemInfo.position == 0 ? itemInfo.offset : -3.4028235E38f;
        this.mLastOffset = itemInfo.position == count + -1 ? (itemInfo.offset + itemInfo.widthFactor) - 1.0f : AutoScrollHelper.NO_MAX;
        for (i3 = i - 1; i3 >= 0; i3--) {
            itemInfo3 = (ItemInfo) this.mItems.get(i3);
            f = f3;
            while (i2 > itemInfo3.position) {
                f -= this.mAdapter.getPageWidth(i2) + f2;
                i2--;
            }
            f3 = f - (itemInfo3.widthFactor + f2);
            itemInfo3.offset = f3;
            if (itemInfo3.position == 0) {
                this.mFirstOffset = f3;
            }
            i2--;
        }
        f3 = (itemInfo.offset + itemInfo.widthFactor) + f2;
        i2 = itemInfo.position + 1;
        for (i3 = i + 1; i3 < size; i3++) {
            itemInfo3 = (ItemInfo) this.mItems.get(i3);
            f = f3;
            while (i2 < itemInfo3.position) {
                f = (this.mAdapter.getPageWidth(i2) + f2) + f;
                i2++;
            }
            if (itemInfo3.position == count - 1) {
                this.mLastOffset = (itemInfo3.widthFactor + f) - 1.0f;
            }
            itemInfo3.offset = f;
            f3 = f + (itemInfo3.widthFactor + f2);
            i2++;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    private void completeScroll(boolean z) {
        int scrollX;
        boolean z2 = this.mScrollState == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            this.mScroller.abortAnimation();
            scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
            }
        }
        this.mPopulatePending = false;
        boolean z3 = z2;
        for (scrollX = 0; scrollX < this.mItems.size(); scrollX++) {
            ItemInfo itemInfo = (ItemInfo) this.mItems.get(scrollX);
            if (itemInfo.scrolling) {
                itemInfo.scrolling = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z) {
            ViewCompat.postOnAnimation(this, this.mEndScrollRunnable);
        } else {
            this.mEndScrollRunnable.run();
        }
    }

    private int determineTargetPage(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.mFlingDistance || Math.abs(i2) <= this.mMinimumVelocity) {
            i = (int) ((i >= this.mCurItem ? 0.4f : 0.6f) + (((float) i) + f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.mItems.size() <= 0) {
            return i;
        }
        return Math.max(((ItemInfo) this.mItems.get(0)).position, Math.min(i, ((ItemInfo) this.mItems.get(this.mItems.size() - 1)).position));
    }

    private void enableLayers(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewCompat.setLayerType(getChildAt(i), z ? 2 : 0, null);
        }
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        if (this.mVelocityTracker != null) {
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        Rect rect2 = rect == null ? new Rect() : rect;
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewPager parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = parent;
            rect2.left += viewGroup.getLeft();
            rect2.right += viewGroup.getRight();
            rect2.top += viewGroup.getTop();
            rect2.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect2;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private ItemInfo infoForCurrentScrollPosition() {
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f = clientWidth > 0 ? ((float) this.mPageMargin) / ((float) clientWidth) : 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = -1;
        int i2 = 0;
        Object obj = 1;
        ItemInfo itemInfo = null;
        while (i2 < this.mItems.size()) {
            int i3;
            ItemInfo itemInfo2;
            ItemInfo itemInfo3 = (ItemInfo) this.mItems.get(i2);
            ItemInfo itemInfo4;
            if (obj != null || itemInfo3.position == i + 1) {
                itemInfo4 = itemInfo3;
                i3 = i2;
                itemInfo2 = itemInfo4;
            } else {
                itemInfo3 = this.mTempItem;
                itemInfo3.offset = (f2 + f3) + f;
                itemInfo3.position = i + 1;
                itemInfo3.widthFactor = this.mAdapter.getPageWidth(itemInfo3.position);
                itemInfo4 = itemInfo3;
                i3 = i2 - 1;
                itemInfo2 = itemInfo4;
            }
            f2 = itemInfo2.offset;
            f3 = (itemInfo2.widthFactor + f2) + f;
            if (obj == null && scrollX < f2) {
                return itemInfo;
            }
            if (scrollX < f3 || i3 == this.mItems.size() - 1) {
                return itemInfo2;
            }
            f3 = f2;
            i = itemInfo2.position;
            obj = null;
            f2 = itemInfo2.widthFactor;
            itemInfo = itemInfo2;
            i2 = i3 + 1;
        }
        return itemInfo;
    }

    private boolean isGutterDrag(float f, float f2) {
        return (f < ((float) this.mGutterSize) && f2 > 0.0f) || (f > ((float) (getWidth() - this.mGutterSize)) && f2 < 0.0f);
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.mActivePointerId) {
            actionIndex = actionIndex == 0 ? 1 : 0;
            this.mLastMotionX = MotionEventCompat.getX(motionEvent, actionIndex);
            this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, actionIndex);
            if (this.mVelocityTracker != null) {
                this.mVelocityTracker.clear();
            }
        }
    }

    private boolean pageScrolled(int i) {
        if (this.mItems.size() == 0) {
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        ItemInfo infoForCurrentScrollPosition = infoForCurrentScrollPosition();
        int clientWidth = getClientWidth();
        int i2 = this.mPageMargin + clientWidth;
        float f = ((float) this.mPageMargin) / ((float) clientWidth);
        int i3 = infoForCurrentScrollPosition.position;
        float f2 = ((((float) i) / ((float) clientWidth)) - infoForCurrentScrollPosition.offset) / (infoForCurrentScrollPosition.widthFactor + f);
        clientWidth = (int) (((float) i2) * f2);
        this.mCalledSuper = false;
        onPageScrolled(i3, f2, clientWidth);
        if (this.mCalledSuper) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean performDrag(float f) {
        boolean z;
        float f2;
        boolean z2 = true;
        boolean z3 = false;
        float f3 = this.mLastMotionX - f;
        this.mLastMotionX = f;
        float scrollX = ((float) getScrollX()) + f3;
        int clientWidth = getClientWidth();
        float f4 = ((float) clientWidth) * this.mFirstOffset;
        float f5 = ((float) clientWidth) * this.mLastOffset;
        ItemInfo itemInfo = (ItemInfo) this.mItems.get(0);
        ItemInfo itemInfo2 = (ItemInfo) this.mItems.get(this.mItems.size() - 1);
        if (itemInfo.position != 0) {
            f4 = itemInfo.offset * ((float) clientWidth);
            z = false;
        } else {
            z = true;
        }
        if (itemInfo2.position != this.mAdapter.getCount() - 1) {
            f2 = itemInfo2.offset * ((float) clientWidth);
            z2 = false;
        } else {
            f2 = f5;
        }
        if (scrollX < f4) {
            if (z) {
                z3 = this.mLeftEdge.onPull(Math.abs(f4 - scrollX) / ((float) clientWidth));
            }
        } else if (scrollX > f2) {
            if (z2) {
                z3 = this.mRightEdge.onPull(Math.abs(scrollX - f2) / ((float) clientWidth));
            }
            f4 = f2;
        } else {
            f4 = scrollX;
        }
        this.mLastMotionX += f4 - ((float) ((int) f4));
        scrollTo((int) f4, getScrollY());
        pageScrolled((int) f4);
        return z3;
    }

    private void recomputeScrollPosition(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.mItems.isEmpty()) {
            ItemInfo infoForPosition = infoForPosition(this.mCurItem);
            int min = (int) ((infoForPosition != null ? Math.min(infoForPosition.offset, this.mLastOffset) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                completeScroll(false);
                scrollTo(min, getScrollY());
                return;
            }
            return;
        }
        int paddingLeft = (int) (((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3)) * (((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))));
        scrollTo(paddingLeft, getScrollY());
        if (!this.mScroller.isFinished()) {
            this.mScroller.startScroll(paddingLeft, 0, (int) (infoForPosition(this.mCurItem).offset * ((float) i)), 0, this.mScroller.getDuration() - this.mScroller.timePassed());
        }
    }

    private void removeNonDecorViews() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).isDecor) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private void scrollToItem(int i, boolean z, int i2, boolean z2) {
        int max;
        ItemInfo infoForPosition = infoForPosition(i);
        if (infoForPosition != null) {
            max = (int) (Math.max(this.mFirstOffset, Math.min(infoForPosition.offset, this.mLastOffset)) * ((float) getClientWidth()));
        } else {
            max = 0;
        }
        if (z) {
            smoothScrollTo(max, 0, i2);
            if (z2 && this.mOnPageChangeListener != null) {
                this.mOnPageChangeListener.onPageSelected(i);
            }
            if (z2 && this.mInternalPageChangeListener != null) {
                this.mInternalPageChangeListener.onPageSelected(i);
                return;
            }
            return;
        }
        if (z2 && this.mOnPageChangeListener != null) {
            this.mOnPageChangeListener.onPageSelected(i);
        }
        if (z2 && this.mInternalPageChangeListener != null) {
            this.mInternalPageChangeListener.onPageSelected(i);
        }
        completeScroll(false);
        scrollTo(max, 0);
        pageScrolled(max);
    }

    private void setScrollState(int i) {
        if (this.mScrollState != i) {
            this.mScrollState = i;
            if (this.mPageTransformer != null) {
                enableLayers(i != 0);
            }
            if (this.mOnPageChangeListener != null) {
                this.mOnPageChangeListener.onPageScrollStateChanged(i);
            }
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.mScrollingCacheEnabled != z) {
            this.mScrollingCacheEnabled = z;
        }
    }

    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            if (this.mDrawingOrderedChildren == null) {
                this.mDrawingOrderedChildren = new ArrayList();
            } else {
                this.mDrawingOrderedChildren.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.mDrawingOrderedChildren.add(getChildAt(i));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    ItemInfo infoForChild = infoForChild(childAt);
                    if (infoForChild != null && infoForChild.position == this.mCurItem) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if ((descendantFocusability == AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    ItemInfo addNewItem(int i, int i2) {
        ItemInfo itemInfo = new ItemInfo();
        itemInfo.position = i;
        itemInfo.object = this.mAdapter.instantiateItem((ViewGroup) this, i);
        itemInfo.widthFactor = this.mAdapter.getPageWidth(i);
        if (i2 < 0 || i2 >= this.mItems.size()) {
            this.mItems.add(itemInfo);
        } else {
            this.mItems.add(i2, itemInfo);
        }
        return itemInfo;
    }

    public void addTouchables(ArrayList<View> arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                ItemInfo infoForChild = infoForChild(childAt);
                if (infoForChild != null && infoForChild.position == this.mCurItem) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        android.view.ViewGroup.LayoutParams generateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : layoutParams;
        LayoutParams layoutParams2 = (LayoutParams) generateLayoutParams;
        layoutParams2.isDecor |= view instanceof Decor;
        if (!this.mInLayout) {
            super.addView(view, i, generateLayoutParams);
        } else if (layoutParams2 == null || !layoutParams2.isDecor) {
            layoutParams2.needsMeasure = true;
            addViewInLayout(view, i, generateLayoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public boolean arrowScroll(int i) {
        View view;
        boolean pageLeft;
        View findFocus = findFocus();
        if (findFocus == this) {
            view = null;
        } else {
            if (findFocus != null) {
                Object obj;
                for (ViewPager parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    if (parent == this) {
                        obj = 1;
                        break;
                    }
                }
                obj = null;
                if (obj == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        stringBuilder.append(" => ").append(parent2.getClass().getSimpleName());
                    }
                    Log.e(TAG, "arrowScroll tried to find focus based on non-child current focused view " + stringBuilder.toString());
                    view = null;
                }
            }
            view = findFocus;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (findNextFocus == null || findNextFocus == view) {
            if (i == 17 || i == 1) {
                pageLeft = pageLeft();
            } else {
                if (i == 66 || i == 2) {
                    pageLeft = pageRight();
                }
                pageLeft = false;
            }
        } else if (i == 17) {
            pageLeft = (view == null || getChildRectInPagerCoordinates(this.mTempRect, findNextFocus).left < getChildRectInPagerCoordinates(this.mTempRect, view).left) ? findNextFocus.requestFocus() : pageLeft();
        } else {
            if (i == 66) {
                pageLeft = (view == null || getChildRectInPagerCoordinates(this.mTempRect, findNextFocus).left > getChildRectInPagerCoordinates(this.mTempRect, view).left) ? findNextFocus.requestFocus() : pageRight();
            }
            pageLeft = false;
        }
        if (pageLeft) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return pageLeft;
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            this.mVelocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
    }

    protected boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i2 + scrollX >= childAt.getLeft() && i2 + scrollX < childAt.getRight() && i3 + scrollY >= childAt.getTop() && i3 + scrollY < childAt.getBottom()) {
                    if (canScroll(childAt, true, i, (i2 + scrollX) - childAt.getLeft(), (i3 + scrollY) - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && ViewCompat.canScrollHorizontally(view, -i);
    }

    public boolean canScrollHorizontally(int i) {
        boolean z = true;
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX <= ((int) (((float) clientWidth) * this.mFirstOffset))) {
                z = false;
            }
            return z;
        } else if (i <= 0) {
            return false;
        } else {
            if (scrollX >= ((int) (((float) clientWidth) * this.mLastOffset))) {
                z = false;
            }
            return z;
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            completeScroll(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!pageScrolled(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    void dataSetChanged() {
        int i;
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        boolean z = this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < count;
        boolean z2 = false;
        int i2 = this.mCurItem;
        boolean z3 = z;
        int i3 = 0;
        while (i3 < this.mItems.size()) {
            int i4;
            boolean z4;
            boolean z5;
            ItemInfo itemInfo = (ItemInfo) this.mItems.get(i3);
            int itemPosition = this.mAdapter.getItemPosition(itemInfo.object);
            if (itemPosition == -1) {
                i4 = i3;
                z4 = z2;
                i = i2;
                z5 = z3;
            } else if (itemPosition == -2) {
                this.mItems.remove(i3);
                i3--;
                if (!z2) {
                    this.mAdapter.startUpdate((ViewGroup) this);
                    z2 = true;
                }
                this.mAdapter.destroyItem((ViewGroup) this, itemInfo.position, itemInfo.object);
                if (this.mCurItem == itemInfo.position) {
                    i4 = i3;
                    z4 = z2;
                    i = Math.max(0, Math.min(this.mCurItem, count - 1));
                    z5 = true;
                } else {
                    i4 = i3;
                    z4 = z2;
                    i = i2;
                    z5 = true;
                }
            } else if (itemInfo.position != itemPosition) {
                if (itemInfo.position == this.mCurItem) {
                    i2 = itemPosition;
                }
                itemInfo.position = itemPosition;
                i4 = i3;
                z4 = z2;
                i = i2;
                z5 = true;
            } else {
                i4 = i3;
                z4 = z2;
                i = i2;
                z5 = z3;
            }
            z3 = z5;
            i2 = i;
            z2 = z4;
            i3 = i4 + 1;
        }
        if (z2) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z3) {
            i = getChildCount();
            for (i3 = 0; i3 < i; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                if (!layoutParams.isDecor) {
                    layoutParams.widthFactor = 0.0f;
                }
            }
            setCurrentItemInternal(i2, false, true);
            requestLayout();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                ItemInfo infoForChild = infoForChild(childAt);
                if (infoForChild != null && infoForChild.position == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    float distanceInfluenceForSnapDuration(float f) {
        return (float) Math.sin((double) ((float) (((double) (f - 0.5f)) * 0.4712389167638204d)));
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int i = 0;
        int overScrollMode = ViewCompat.getOverScrollMode(this);
        if (overScrollMode == 0 || (overScrollMode == 1 && this.mAdapter != null && this.mAdapter.getCount() > 1)) {
            int height;
            int width;
            if (!this.mLeftEdge.isFinished()) {
                overScrollMode = canvas.save();
                height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                width = getWidth();
                canvas.rotate(b.h);
                canvas.translate((float) ((-height) + getPaddingTop()), this.mFirstOffset * ((float) width));
                this.mLeftEdge.setSize(height, width);
                i = 0 | this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(overScrollMode);
            }
            if (!this.mRightEdge.isFinished()) {
                overScrollMode = canvas.save();
                height = getWidth();
                width = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.mLastOffset + 1.0f)) * ((float) height));
                this.mRightEdge.setSize(width, height);
                i |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(overScrollMode);
            }
        } else {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
        }
        if (i != 0) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public void endFakeDrag() {
        if (this.mFakeDragging) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, (float) this.mMaximumVelocity);
            int xVelocity = (int) VelocityTrackerCompat.getXVelocity(velocityTracker, this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            ItemInfo infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.position, ((((float) scrollX) / ((float) clientWidth)) - infoForCurrentScrollPosition.offset) / infoForCurrentScrollPosition.widthFactor, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
            endDrag();
            this.mFakeDragging = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        switch (keyEvent.getKeyCode()) {
            case 21:
                return arrowScroll(17);
            case 22:
                return arrowScroll(66);
            case 61:
                return VERSION.SDK_INT >= 11 ? KeyEventCompat.hasNoModifiers(keyEvent) ? arrowScroll(2) : KeyEventCompat.hasModifiers(keyEvent, 1) ? arrowScroll(1) : false : false;
            default:
                return false;
        }
    }

    public void fakeDragBy(float f) {
        if (this.mFakeDragging) {
            this.mLastMotionX += f;
            float scrollX = ((float) getScrollX()) - f;
            int clientWidth = getClientWidth();
            float f2 = ((float) clientWidth) * this.mLastOffset;
            ItemInfo itemInfo = (ItemInfo) this.mItems.get(0);
            ItemInfo itemInfo2 = (ItemInfo) this.mItems.get(this.mItems.size() - 1);
            float f3 = itemInfo.position != 0 ? itemInfo.offset * ((float) clientWidth) : ((float) clientWidth) * this.mFirstOffset;
            float f4 = itemInfo2.position != this.mAdapter.getCount() + -1 ? itemInfo2.offset * ((float) clientWidth) : f2;
            if (scrollX >= f3) {
                f3 = scrollX > f4 ? f4 : scrollX;
            }
            this.mLastMotionX += f3 - ((float) ((int) f3));
            scrollTo((int) f3, getScrollY());
            pageScrolled((int) f3);
            MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
            this.mVelocityTracker.addMovement(obtain);
            obtain.recycle();
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public PagerAdapter getAdapter() {
        return this.mAdapter;
    }

    protected int getChildDrawingOrder(int i, int i2) {
        if (this.mDrawingOrder == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) ((View) this.mDrawingOrderedChildren.get(i2)).getLayoutParams()).childIndex;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    ItemInfo infoForAnyChild(View view) {
        while (true) {
            ViewPager parent = view.getParent();
            if (parent == this) {
                return infoForChild(view);
            }
            if (parent != null && (parent instanceof View)) {
                view = parent;
            }
        }
        return null;
    }

    ItemInfo infoForChild(View view) {
        for (int i = 0; i < this.mItems.size(); i++) {
            ItemInfo itemInfo = (ItemInfo) this.mItems.get(i);
            if (this.mAdapter.isViewFromObject(view, itemInfo.object)) {
                return itemInfo;
            }
        }
        return null;
    }

    ItemInfo infoForPosition(int i) {
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            ItemInfo itemInfo = (ItemInfo) this.mItems.get(i2);
            if (itemInfo.position == i) {
                return itemInfo;
            }
        }
        return null;
    }

    void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = ViewConfigurationCompat.getScaledPagingTouchSlop(viewConfiguration);
        this.mMinimumVelocity = (int) (400.0f * f);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffectCompat(context);
        this.mRightEdge = new EdgeEffectCompat(context);
        this.mFlingDistance = (int) (25.0f * f);
        this.mCloseEnough = (int) (2.0f * f);
        this.mDefaultGutterSize = (int) (16.0f * f);
        ViewCompat.setAccessibilityDelegate(this, new MyAccessibilityDelegate());
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mPageMargin > 0 && this.mMarginDrawable != null && this.mItems.size() > 0 && this.mAdapter != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f = ((float) this.mPageMargin) / ((float) width);
            ItemInfo itemInfo = (ItemInfo) this.mItems.get(0);
            float f2 = itemInfo.offset;
            int size = this.mItems.size();
            int i = itemInfo.position;
            int i2 = ((ItemInfo) this.mItems.get(size - 1)).position;
            int i3 = 0;
            int i4 = i;
            while (i4 < i2) {
                float f3;
                while (i4 > itemInfo.position && i3 < size) {
                    i3++;
                    itemInfo = (ItemInfo) this.mItems.get(i3);
                }
                if (i4 == itemInfo.position) {
                    f3 = (itemInfo.offset + itemInfo.widthFactor) * ((float) width);
                    f2 = (itemInfo.offset + itemInfo.widthFactor) + f;
                } else {
                    float pageWidth = this.mAdapter.getPageWidth(i4);
                    f3 = (f2 + pageWidth) * ((float) width);
                    f2 += pageWidth + f;
                }
                if (((float) this.mPageMargin) + f3 > ((float) scrollX)) {
                    this.mMarginDrawable.setBounds((int) f3, this.mTopPageBounds, (int) ((((float) this.mPageMargin) + f3) + 0.5f), this.mBottomPageBounds);
                    this.mMarginDrawable.draw(canvas);
                }
                if (f3 <= ((float) (scrollX + width))) {
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.mIsBeingDragged = false;
            this.mIsUnableToDrag = false;
            this.mActivePointerId = -1;
            if (this.mVelocityTracker == null) {
                return false;
            }
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
            return false;
        }
        if (action != 0) {
            if (this.mIsBeingDragged) {
                return true;
            }
            if (this.mIsUnableToDrag) {
                return false;
            }
        }
        switch (action) {
            case 0:
                float x = motionEvent.getX();
                this.mInitialMotionX = x;
                this.mLastMotionX = x;
                x = motionEvent.getY();
                this.mInitialMotionY = x;
                this.mLastMotionY = x;
                this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, 0);
                this.mIsUnableToDrag = false;
                this.mScroller.computeScrollOffset();
                if (this.mScrollState == 2 && Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) > this.mCloseEnough) {
                    this.mScroller.abortAnimation();
                    this.mPopulatePending = false;
                    populate();
                    this.mIsBeingDragged = true;
                    requestParentDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                    break;
                }
                completeScroll(false);
                this.mIsBeingDragged = false;
                break;
                break;
            case 2:
                action = this.mActivePointerId;
                if (action != -1) {
                    action = MotionEventCompat.findPointerIndex(motionEvent, action);
                    float x2 = MotionEventCompat.getX(motionEvent, action);
                    float f = x2 - this.mLastMotionX;
                    float abs = Math.abs(f);
                    float y = MotionEventCompat.getY(motionEvent, action);
                    float abs2 = Math.abs(y - this.mInitialMotionY);
                    if (f == 0.0f || isGutterDrag(this.mLastMotionX, f) || !canScroll(this, false, (int) f, (int) x2, (int) y)) {
                        if (abs > ((float) this.mTouchSlop) && 0.5f * abs > abs2) {
                            this.mIsBeingDragged = true;
                            requestParentDisallowInterceptTouchEvent(true);
                            setScrollState(1);
                            this.mLastMotionX = f > 0.0f ? this.mInitialMotionX + ((float) this.mTouchSlop) : this.mInitialMotionX - ((float) this.mTouchSlop);
                            this.mLastMotionY = y;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > ((float) this.mTouchSlop)) {
                            this.mIsUnableToDrag = true;
                        }
                        if (this.mIsBeingDragged && performDrag(x2)) {
                            ViewCompat.postInvalidateOnAnimation(this);
                            break;
                        }
                    }
                    this.mLastMotionX = x2;
                    this.mLastMotionY = y;
                    this.mIsUnableToDrag = true;
                    return false;
                }
                break;
            case 6:
                onSecondaryPointerUp(motionEvent);
                break;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        return this.mIsBeingDragged;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int max;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        int i8 = 0;
        while (i8 < childCount) {
            LayoutParams layoutParams;
            int measuredWidth;
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isDecor) {
                    int i9 = layoutParams.gravity & 112;
                    switch (layoutParams.gravity & 7) {
                        case 1:
                            max = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        case 3:
                            max = paddingLeft;
                            paddingLeft = childAt.getMeasuredWidth() + paddingLeft;
                            break;
                        case 5:
                            measuredWidth = (i5 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                            max = measuredWidth;
                            break;
                        default:
                            max = paddingLeft;
                            break;
                    }
                    int i10;
                    switch (i9) {
                        case 16:
                            measuredWidth = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                            i10 = paddingBottom;
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                        case 48:
                            measuredWidth = childAt.getMeasuredHeight() + paddingTop;
                            i10 = paddingTop;
                            paddingTop = paddingBottom;
                            paddingBottom = measuredWidth;
                            measuredWidth = i10;
                            break;
                        case 80:
                            measuredWidth = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                            i10 = paddingBottom + childAt.getMeasuredHeight();
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                        default:
                            measuredWidth = paddingTop;
                            i10 = paddingBottom;
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                    }
                    max += scrollX;
                    childAt.layout(max, measuredWidth, childAt.getMeasuredWidth() + max, childAt.getMeasuredHeight() + measuredWidth);
                    measuredWidth = i7 + 1;
                    i7 = paddingBottom;
                    paddingBottom = paddingTop;
                    paddingTop = paddingRight;
                    paddingRight = paddingLeft;
                    i8++;
                    paddingLeft = paddingRight;
                    paddingRight = paddingTop;
                    paddingTop = i7;
                    i7 = measuredWidth;
                }
            }
            measuredWidth = i7;
            i7 = paddingTop;
            paddingTop = paddingRight;
            paddingRight = paddingLeft;
            i8++;
            paddingLeft = paddingRight;
            paddingRight = paddingTop;
            paddingTop = i7;
            i7 = measuredWidth;
        }
        max = (i5 - paddingLeft) - paddingRight;
        for (paddingRight = 0; paddingRight < childCount; paddingRight++) {
            View childAt2 = getChildAt(paddingRight);
            if (childAt2.getVisibility() != 8) {
                layoutParams = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams.isDecor) {
                    ItemInfo infoForChild = infoForChild(childAt2);
                    if (infoForChild != null) {
                        i5 = ((int) (infoForChild.offset * ((float) max))) + paddingLeft;
                        if (layoutParams.needsMeasure) {
                            layoutParams.needsMeasure = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (layoutParams.widthFactor * ((float) max)), 1073741824), MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                        }
                        childAt2.layout(i5, paddingTop, childAt2.getMeasuredWidth() + i5, childAt2.getMeasuredHeight() + paddingTop);
                    }
                }
            }
        }
        this.mTopPageBounds = paddingTop;
        this.mBottomPageBounds = i6 - paddingBottom;
        this.mDecorChildCount = i7;
        if (this.mFirstLayout) {
            scrollToItem(this.mCurItem, false, 0, false);
        }
        this.mFirstLayout = false;
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            LayoutParams layoutParams;
            int i5;
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams != null && layoutParams.isDecor) {
                    int i6 = layoutParams.gravity & 7;
                    int i7 = layoutParams.gravity & 112;
                    i3 = Integer.MIN_VALUE;
                    i5 = Integer.MIN_VALUE;
                    Object obj = (i7 == 48 || i7 == 80) ? 1 : null;
                    Object obj2 = (i6 == 3 || i6 == 5) ? 1 : null;
                    if (obj != null) {
                        i3 = 1073741824;
                    } else if (obj2 != null) {
                        i5 = 1073741824;
                    }
                    if (layoutParams.width != -2) {
                        i7 = 1073741824;
                        i3 = layoutParams.width != -1 ? layoutParams.width : paddingLeft;
                    } else {
                        i7 = i3;
                        i3 = paddingLeft;
                    }
                    if (layoutParams.height != -2) {
                        i5 = 1073741824;
                        if (layoutParams.height != -1) {
                            measuredWidth = layoutParams.height;
                            childAt.measure(MeasureSpec.makeMeasureSpec(i3, i7), MeasureSpec.makeMeasureSpec(measuredWidth, i5));
                            if (obj != null) {
                                measuredHeight -= childAt.getMeasuredHeight();
                            } else if (obj2 != null) {
                                paddingLeft -= childAt.getMeasuredWidth();
                            }
                        }
                    }
                    measuredWidth = measuredHeight;
                    childAt.measure(MeasureSpec.makeMeasureSpec(i3, i7), MeasureSpec.makeMeasureSpec(measuredWidth, i5));
                    if (obj != null) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (obj2 != null) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
            }
        }
        this.mChildWidthMeasureSpec = MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.mChildHeightMeasureSpec = MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        i3 = getChildCount();
        for (i5 = 0; i5 < i3; i5++) {
            View childAt2 = getChildAt(i5);
            if (childAt2.getVisibility() != 8) {
                layoutParams = (LayoutParams) childAt2.getLayoutParams();
                if (layoutParams == null || !layoutParams.isDecor) {
                    childAt2.measure(MeasureSpec.makeMeasureSpec((int) (layoutParams.widthFactor * ((float) paddingLeft)), 1073741824), this.mChildHeightMeasureSpec);
                }
            }
        }
    }

    protected void onPageScrolled(int i, float f, int i2) {
        int paddingLeft;
        int paddingRight;
        int i3;
        if (this.mDecorChildCount > 0) {
            int scrollX = getScrollX();
            paddingLeft = getPaddingLeft();
            paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            i3 = 0;
            while (i3 < childCount) {
                int i4;
                View childAt = getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isDecor) {
                    int max;
                    switch (layoutParams.gravity & 7) {
                        case 1:
                            max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            i4 = paddingRight;
                            paddingRight = paddingLeft;
                            paddingLeft = i4;
                            break;
                        case 3:
                            max = childAt.getWidth() + paddingLeft;
                            i4 = paddingLeft;
                            paddingLeft = paddingRight;
                            paddingRight = max;
                            max = i4;
                            break;
                        case 5:
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            i4 = paddingRight + childAt.getMeasuredWidth();
                            paddingRight = paddingLeft;
                            paddingLeft = i4;
                            break;
                        default:
                            max = paddingLeft;
                            i4 = paddingRight;
                            paddingRight = paddingLeft;
                            paddingLeft = i4;
                            break;
                    }
                    max = (max + scrollX) - childAt.getLeft();
                    if (max != 0) {
                        childAt.offsetLeftAndRight(max);
                    }
                } else {
                    i4 = paddingRight;
                    paddingRight = paddingLeft;
                    paddingLeft = i4;
                }
                i3++;
                i4 = paddingLeft;
                paddingLeft = paddingRight;
                paddingRight = i4;
            }
        }
        if (this.mOnPageChangeListener != null) {
            this.mOnPageChangeListener.onPageScrolled(i, f, i2);
        }
        if (this.mInternalPageChangeListener != null) {
            this.mInternalPageChangeListener.onPageScrolled(i, f, i2);
        }
        if (this.mPageTransformer != null) {
            paddingRight = getScrollX();
            i3 = getChildCount();
            for (paddingLeft = 0; paddingLeft < i3; paddingLeft++) {
                View childAt2 = getChildAt(paddingLeft);
                if (!((LayoutParams) childAt2.getLayoutParams()).isDecor) {
                    this.mPageTransformer.transformPage(childAt2, ((float) (childAt2.getLeft() - paddingRight)) / ((float) getClientWidth()));
                }
            }
        }
        this.mCalledSuper = true;
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3 = -1;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = 1;
            i2 = 0;
        } else {
            i2 = childCount - 1;
            childCount = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                ItemInfo infoForChild = infoForChild(childAt);
                if (infoForChild != null && infoForChild.position == this.mCurItem && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            i2 += i3;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            if (this.mAdapter != null) {
                this.mAdapter.restoreState(savedState.adapterState, savedState.loader);
                setCurrentItemInternal(savedState.position, false, true);
                return;
            }
            this.mRestoredCurItem = savedState.position;
            this.mRestoredAdapterState = savedState.adapterState;
            this.mRestoredClassLoader = savedState.loader;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.position = this.mCurItem;
        if (this.mAdapter != null) {
            savedState.adapterState = this.mAdapter.saveState();
        }
        return savedState;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            recomputeScrollPosition(i, i3, this.mPageMargin, this.mPageMargin);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.mFakeDragging) {
            return true;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.mAdapter == null || this.mAdapter.getCount() == 0) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        float x;
        int xVelocity;
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                x = motionEvent.getX();
                this.mInitialMotionX = x;
                this.mLastMotionX = x;
                x = motionEvent.getY();
                this.mInitialMotionY = x;
                this.mLastMotionY = x;
                this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, 0);
                break;
            case 1:
                if (this.mIsBeingDragged) {
                    VelocityTracker velocityTracker = this.mVelocityTracker;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.mMaximumVelocity);
                    xVelocity = (int) VelocityTrackerCompat.getXVelocity(velocityTracker, this.mActivePointerId);
                    this.mPopulatePending = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    ItemInfo infoForCurrentScrollPosition = infoForCurrentScrollPosition();
                    setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.position, ((((float) scrollX) / ((float) clientWidth)) - infoForCurrentScrollPosition.offset) / infoForCurrentScrollPosition.widthFactor, xVelocity, (int) (MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId)) - this.mInitialMotionX)), true, true, xVelocity);
                    this.mActivePointerId = -1;
                    endDrag();
                    z = this.mRightEdge.onRelease() | this.mLeftEdge.onRelease();
                    break;
                }
                break;
            case 2:
                if (!this.mIsBeingDragged) {
                    xVelocity = MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId);
                    float x2 = MotionEventCompat.getX(motionEvent, xVelocity);
                    float abs = Math.abs(x2 - this.mLastMotionX);
                    float y = MotionEventCompat.getY(motionEvent, xVelocity);
                    x = Math.abs(y - this.mLastMotionY);
                    if (abs > ((float) this.mTouchSlop) && abs > x) {
                        this.mIsBeingDragged = true;
                        requestParentDisallowInterceptTouchEvent(true);
                        this.mLastMotionX = x2 - this.mInitialMotionX > 0.0f ? this.mInitialMotionX + ((float) this.mTouchSlop) : this.mInitialMotionX - ((float) this.mTouchSlop);
                        this.mLastMotionY = y;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (this.mIsBeingDragged) {
                    z = false | performDrag(MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId)));
                    break;
                }
                break;
            case 3:
                if (this.mIsBeingDragged) {
                    scrollToItem(this.mCurItem, true, 0, false);
                    this.mActivePointerId = -1;
                    endDrag();
                    z = this.mRightEdge.onRelease() | this.mLeftEdge.onRelease();
                    break;
                }
                break;
            case 5:
                xVelocity = MotionEventCompat.getActionIndex(motionEvent);
                this.mLastMotionX = MotionEventCompat.getX(motionEvent, xVelocity);
                this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, xVelocity);
                break;
            case 6:
                onSecondaryPointerUp(motionEvent);
                this.mLastMotionX = MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId));
                break;
        }
        if (z) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        return true;
    }

    boolean pageLeft() {
        if (this.mCurItem <= 0) {
            return false;
        }
        setCurrentItem(this.mCurItem - 1, true);
        return true;
    }

    boolean pageRight() {
        if (this.mAdapter == null || this.mCurItem >= this.mAdapter.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    void populate() {
        populate(this.mCurItem);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void populate(int r19) {
        /*
        r18 = this;
        r3 = 0;
        r2 = 2;
        r0 = r18;
        r4 = r0.mCurItem;
        r0 = r19;
        if (r4 == r0) goto L_0x033f;
    L_0x000a:
        r0 = r18;
        r2 = r0.mCurItem;
        r0 = r19;
        if (r2 >= r0) goto L_0x0030;
    L_0x0012:
        r2 = 66;
    L_0x0014:
        r0 = r18;
        r3 = r0.mCurItem;
        r0 = r18;
        r3 = r0.infoForPosition(r3);
        r0 = r19;
        r1 = r18;
        r1.mCurItem = r0;
        r4 = r3;
        r3 = r2;
    L_0x0026:
        r0 = r18;
        r2 = r0.mAdapter;
        if (r2 != 0) goto L_0x0033;
    L_0x002c:
        r18.sortChildDrawingOrder();
    L_0x002f:
        return;
    L_0x0030:
        r2 = 17;
        goto L_0x0014;
    L_0x0033:
        r0 = r18;
        r2 = r0.mPopulatePending;
        if (r2 == 0) goto L_0x003d;
    L_0x0039:
        r18.sortChildDrawingOrder();
        goto L_0x002f;
    L_0x003d:
        r2 = r18.getWindowToken();
        if (r2 == 0) goto L_0x002f;
    L_0x0043:
        r0 = r18;
        r2 = r0.mAdapter;
        r0 = r18;
        r2.startUpdate(r0);
        r0 = r18;
        r2 = r0.mOffscreenPageLimit;
        r5 = 0;
        r0 = r18;
        r6 = r0.mCurItem;
        r6 = r6 - r2;
        r11 = java.lang.Math.max(r5, r6);
        r0 = r18;
        r5 = r0.mAdapter;
        r12 = r5.getCount();
        r5 = r12 + -1;
        r0 = r18;
        r6 = r0.mCurItem;
        r2 = r2 + r6;
        r13 = java.lang.Math.min(r5, r2);
        r0 = r18;
        r2 = r0.mExpectedAdapterCount;
        if (r12 == r2) goto L_0x00da;
    L_0x0073:
        r2 = r18.getResources();	 Catch:{ NotFoundException -> 0x00d0 }
        r3 = r18.getId();	 Catch:{ NotFoundException -> 0x00d0 }
        r2 = r2.getResourceName(r3);	 Catch:{ NotFoundException -> 0x00d0 }
    L_0x007f:
        r3 = new java.lang.IllegalStateException;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ";
        r4 = r4.append(r5);
        r0 = r18;
        r5 = r0.mExpectedAdapterCount;
        r4 = r4.append(r5);
        r5 = ", found: ";
        r4 = r4.append(r5);
        r4 = r4.append(r12);
        r5 = " Pager id: ";
        r4 = r4.append(r5);
        r2 = r4.append(r2);
        r4 = " Pager class: ";
        r2 = r2.append(r4);
        r4 = r18.getClass();
        r2 = r2.append(r4);
        r4 = " Problematic adapter: ";
        r2 = r2.append(r4);
        r0 = r18;
        r4 = r0.mAdapter;
        r4 = r4.getClass();
        r2 = r2.append(r4);
        r2 = r2.toString();
        r3.<init>(r2);
        throw r3;
    L_0x00d0:
        r2 = move-exception;
        r2 = r18.getId();
        r2 = java.lang.Integer.toHexString(r2);
        goto L_0x007f;
    L_0x00da:
        r6 = 0;
        r2 = 0;
        r5 = r2;
    L_0x00dd:
        r0 = r18;
        r2 = r0.mItems;
        r2 = r2.size();
        if (r5 >= r2) goto L_0x033c;
    L_0x00e7:
        r0 = r18;
        r2 = r0.mItems;
        r2 = r2.get(r5);
        r2 = (android.support.v4.view.ViewPager.ItemInfo) r2;
        r7 = r2.position;
        r0 = r18;
        r8 = r0.mCurItem;
        if (r7 < r8) goto L_0x01cf;
    L_0x00f9:
        r7 = r2.position;
        r0 = r18;
        r8 = r0.mCurItem;
        if (r7 != r8) goto L_0x033c;
    L_0x0101:
        if (r2 != 0) goto L_0x0339;
    L_0x0103:
        if (r12 <= 0) goto L_0x0339;
    L_0x0105:
        r0 = r18;
        r2 = r0.mCurItem;
        r0 = r18;
        r2 = r0.addNewItem(r2, r5);
        r10 = r2;
    L_0x0110:
        if (r10 == 0) goto L_0x0180;
    L_0x0112:
        r9 = 0;
        r8 = r5 + -1;
        if (r8 < 0) goto L_0x01d4;
    L_0x0117:
        r0 = r18;
        r2 = r0.mItems;
        r2 = r2.get(r8);
        r2 = (android.support.v4.view.ViewPager.ItemInfo) r2;
    L_0x0121:
        r14 = r18.getClientWidth();
        if (r14 > 0) goto L_0x01d7;
    L_0x0127:
        r6 = 0;
    L_0x0128:
        r0 = r18;
        r7 = r0.mCurItem;
        r7 = r7 + -1;
        r16 = r7;
        r7 = r9;
        r9 = r16;
        r17 = r8;
        r8 = r5;
        r5 = r17;
    L_0x0138:
        if (r9 < 0) goto L_0x0142;
    L_0x013a:
        r15 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1));
        if (r15 < 0) goto L_0x0216;
    L_0x013e:
        if (r9 >= r11) goto L_0x0216;
    L_0x0140:
        if (r2 != 0) goto L_0x01e6;
    L_0x0142:
        r6 = r10.widthFactor;
        r9 = r8 + 1;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x017b;
    L_0x014c:
        r0 = r18;
        r2 = r0.mItems;
        r2 = r2.size();
        if (r9 >= r2) goto L_0x024c;
    L_0x0156:
        r0 = r18;
        r2 = r0.mItems;
        r2 = r2.get(r9);
        r2 = (android.support.v4.view.ViewPager.ItemInfo) r2;
        r7 = r2;
    L_0x0161:
        if (r14 > 0) goto L_0x024f;
    L_0x0163:
        r2 = 0;
        r5 = r2;
    L_0x0165:
        r0 = r18;
        r2 = r0.mCurItem;
        r2 = r2 + 1;
        r16 = r2;
        r2 = r7;
        r7 = r9;
        r9 = r16;
    L_0x0171:
        if (r9 >= r12) goto L_0x017b;
    L_0x0173:
        r11 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1));
        if (r11 < 0) goto L_0x029a;
    L_0x0177:
        if (r9 <= r13) goto L_0x029a;
    L_0x0179:
        if (r2 != 0) goto L_0x025c;
    L_0x017b:
        r0 = r18;
        r0.calculatePageOffsets(r10, r8, r4);
    L_0x0180:
        r0 = r18;
        r4 = r0.mAdapter;
        r0 = r18;
        r5 = r0.mCurItem;
        if (r10 == 0) goto L_0x02e8;
    L_0x018a:
        r2 = r10.object;
    L_0x018c:
        r0 = r18;
        r4.setPrimaryItem(r0, r5, r2);
        r0 = r18;
        r2 = r0.mAdapter;
        r0 = r18;
        r2.finishUpdate(r0);
        r5 = r18.getChildCount();
        r2 = 0;
        r4 = r2;
    L_0x01a0:
        if (r4 >= r5) goto L_0x02eb;
    L_0x01a2:
        r0 = r18;
        r6 = r0.getChildAt(r4);
        r2 = r6.getLayoutParams();
        r2 = (android.support.v4.view.ViewPager.LayoutParams) r2;
        r2.childIndex = r4;
        r7 = r2.isDecor;
        if (r7 != 0) goto L_0x01cb;
    L_0x01b4:
        r7 = r2.widthFactor;
        r8 = 0;
        r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r7 != 0) goto L_0x01cb;
    L_0x01bb:
        r0 = r18;
        r6 = r0.infoForChild(r6);
        if (r6 == 0) goto L_0x01cb;
    L_0x01c3:
        r7 = r6.widthFactor;
        r2.widthFactor = r7;
        r6 = r6.position;
        r2.position = r6;
    L_0x01cb:
        r2 = r4 + 1;
        r4 = r2;
        goto L_0x01a0;
    L_0x01cf:
        r2 = r5 + 1;
        r5 = r2;
        goto L_0x00dd;
    L_0x01d4:
        r2 = 0;
        goto L_0x0121;
    L_0x01d7:
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r7 = r10.widthFactor;
        r6 = r6 - r7;
        r7 = r18.getPaddingLeft();
        r7 = (float) r7;
        r15 = (float) r14;
        r7 = r7 / r15;
        r6 = r6 + r7;
        goto L_0x0128;
    L_0x01e6:
        r15 = r2.position;
        if (r9 != r15) goto L_0x0210;
    L_0x01ea:
        r15 = r2.scrolling;
        if (r15 != 0) goto L_0x0210;
    L_0x01ee:
        r0 = r18;
        r15 = r0.mItems;
        r15.remove(r5);
        r0 = r18;
        r15 = r0.mAdapter;
        r2 = r2.object;
        r0 = r18;
        r15.destroyItem(r0, r9, r2);
        r5 = r5 + -1;
        r8 = r8 + -1;
        if (r5 < 0) goto L_0x0214;
    L_0x0206:
        r0 = r18;
        r2 = r0.mItems;
        r2 = r2.get(r5);
        r2 = (android.support.v4.view.ViewPager.ItemInfo) r2;
    L_0x0210:
        r9 = r9 + -1;
        goto L_0x0138;
    L_0x0214:
        r2 = 0;
        goto L_0x0210;
    L_0x0216:
        if (r2 == 0) goto L_0x0230;
    L_0x0218:
        r15 = r2.position;
        if (r9 != r15) goto L_0x0230;
    L_0x021c:
        r2 = r2.widthFactor;
        r7 = r7 + r2;
        r5 = r5 + -1;
        if (r5 < 0) goto L_0x022e;
    L_0x0223:
        r0 = r18;
        r2 = r0.mItems;
        r2 = r2.get(r5);
        r2 = (android.support.v4.view.ViewPager.ItemInfo) r2;
        goto L_0x0210;
    L_0x022e:
        r2 = 0;
        goto L_0x0210;
    L_0x0230:
        r2 = r5 + 1;
        r0 = r18;
        r2 = r0.addNewItem(r9, r2);
        r2 = r2.widthFactor;
        r7 = r7 + r2;
        r8 = r8 + 1;
        if (r5 < 0) goto L_0x024a;
    L_0x023f:
        r0 = r18;
        r2 = r0.mItems;
        r2 = r2.get(r5);
        r2 = (android.support.v4.view.ViewPager.ItemInfo) r2;
        goto L_0x0210;
    L_0x024a:
        r2 = 0;
        goto L_0x0210;
    L_0x024c:
        r7 = 0;
        goto L_0x0161;
    L_0x024f:
        r2 = r18.getPaddingRight();
        r2 = (float) r2;
        r5 = (float) r14;
        r2 = r2 / r5;
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r2 + r5;
        r5 = r2;
        goto L_0x0165;
    L_0x025c:
        r11 = r2.position;
        if (r9 != r11) goto L_0x0332;
    L_0x0260:
        r11 = r2.scrolling;
        if (r11 != 0) goto L_0x0332;
    L_0x0264:
        r0 = r18;
        r11 = r0.mItems;
        r11.remove(r7);
        r0 = r18;
        r11 = r0.mAdapter;
        r2 = r2.object;
        r0 = r18;
        r11.destroyItem(r0, r9, r2);
        r0 = r18;
        r2 = r0.mItems;
        r2 = r2.size();
        if (r7 >= r2) goto L_0x0298;
    L_0x0280:
        r0 = r18;
        r2 = r0.mItems;
        r2 = r2.get(r7);
        r2 = (android.support.v4.view.ViewPager.ItemInfo) r2;
    L_0x028a:
        r16 = r6;
        r6 = r2;
        r2 = r16;
    L_0x028f:
        r9 = r9 + 1;
        r16 = r2;
        r2 = r6;
        r6 = r16;
        goto L_0x0171;
    L_0x0298:
        r2 = 0;
        goto L_0x028a;
    L_0x029a:
        if (r2 == 0) goto L_0x02c1;
    L_0x029c:
        r11 = r2.position;
        if (r9 != r11) goto L_0x02c1;
    L_0x02a0:
        r2 = r2.widthFactor;
        r6 = r6 + r2;
        r7 = r7 + 1;
        r0 = r18;
        r2 = r0.mItems;
        r2 = r2.size();
        if (r7 >= r2) goto L_0x02bf;
    L_0x02af:
        r0 = r18;
        r2 = r0.mItems;
        r2 = r2.get(r7);
        r2 = (android.support.v4.view.ViewPager.ItemInfo) r2;
    L_0x02b9:
        r16 = r6;
        r6 = r2;
        r2 = r16;
        goto L_0x028f;
    L_0x02bf:
        r2 = 0;
        goto L_0x02b9;
    L_0x02c1:
        r0 = r18;
        r2 = r0.addNewItem(r9, r7);
        r7 = r7 + 1;
        r2 = r2.widthFactor;
        r6 = r6 + r2;
        r0 = r18;
        r2 = r0.mItems;
        r2 = r2.size();
        if (r7 >= r2) goto L_0x02e6;
    L_0x02d6:
        r0 = r18;
        r2 = r0.mItems;
        r2 = r2.get(r7);
        r2 = (android.support.v4.view.ViewPager.ItemInfo) r2;
    L_0x02e0:
        r16 = r6;
        r6 = r2;
        r2 = r16;
        goto L_0x028f;
    L_0x02e6:
        r2 = 0;
        goto L_0x02e0;
    L_0x02e8:
        r2 = 0;
        goto L_0x018c;
    L_0x02eb:
        r18.sortChildDrawingOrder();
        r2 = r18.hasFocus();
        if (r2 == 0) goto L_0x002f;
    L_0x02f4:
        r2 = r18.findFocus();
        if (r2 == 0) goto L_0x0330;
    L_0x02fa:
        r0 = r18;
        r2 = r0.infoForAnyChild(r2);
    L_0x0300:
        if (r2 == 0) goto L_0x030a;
    L_0x0302:
        r2 = r2.position;
        r0 = r18;
        r4 = r0.mCurItem;
        if (r2 == r4) goto L_0x002f;
    L_0x030a:
        r2 = 0;
    L_0x030b:
        r4 = r18.getChildCount();
        if (r2 >= r4) goto L_0x002f;
    L_0x0311:
        r0 = r18;
        r4 = r0.getChildAt(r2);
        r0 = r18;
        r5 = r0.infoForChild(r4);
        if (r5 == 0) goto L_0x032d;
    L_0x031f:
        r5 = r5.position;
        r0 = r18;
        r6 = r0.mCurItem;
        if (r5 != r6) goto L_0x032d;
    L_0x0327:
        r4 = r4.requestFocus(r3);
        if (r4 != 0) goto L_0x002f;
    L_0x032d:
        r2 = r2 + 1;
        goto L_0x030b;
    L_0x0330:
        r2 = 0;
        goto L_0x0300;
    L_0x0332:
        r16 = r6;
        r6 = r2;
        r2 = r16;
        goto L_0x028f;
    L_0x0339:
        r10 = r2;
        goto L_0x0110;
    L_0x033c:
        r2 = r6;
        goto L_0x0101;
    L_0x033f:
        r4 = r3;
        r3 = r2;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.populate(int):void");
    }

    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        if (this.mAdapter != null) {
            this.mAdapter.unregisterDataSetObserver(this.mObserver);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.mItems.size(); i++) {
                ItemInfo itemInfo = (ItemInfo) this.mItems.get(i);
                this.mAdapter.destroyItem((ViewGroup) this, itemInfo.position, itemInfo.object);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter2 = this.mAdapter;
        this.mAdapter = pagerAdapter;
        this.mExpectedAdapterCount = 0;
        if (this.mAdapter != null) {
            if (this.mObserver == null) {
                this.mObserver = new PagerObserver();
            }
            this.mAdapter.registerDataSetObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (z) {
                requestLayout();
            } else {
                populate();
            }
        }
        if (this.mAdapterChangeListener != null && pagerAdapter2 != pagerAdapter) {
            this.mAdapterChangeListener.onAdapterChanged(pagerAdapter2, pagerAdapter);
        }
    }

    void setChildrenDrawingOrderEnabledCompat(boolean z) {
        if (VERSION.SDK_INT >= 7) {
            if (this.mSetChildrenDrawingOrderEnabled == null) {
                try {
                    this.mSetChildrenDrawingOrderEnabled = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE});
                } catch (Throwable e) {
                    Log.e(TAG, "Can't find setChildrenDrawingOrderEnabled", e);
                }
            }
            try {
                this.mSetChildrenDrawingOrderEnabled.invoke(this, new Object[]{Boolean.valueOf(z)});
            } catch (Throwable e2) {
                Log.e(TAG, "Error changing children drawing order", e2);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, !this.mFirstLayout, false);
    }

    public void setCurrentItem(int i, boolean z) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, z, false);
    }

    void setCurrentItemInternal(int i, boolean z, boolean z2) {
        setCurrentItemInternal(i, z, z2, 0);
    }

    void setCurrentItemInternal(int i, boolean z, boolean z2, int i2) {
        boolean z3 = false;
        if (this.mAdapter == null || this.mAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.mCurItem != i || this.mItems.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.mAdapter.getCount()) {
                i = this.mAdapter.getCount() - 1;
            }
            int i3 = this.mOffscreenPageLimit;
            if (i > this.mCurItem + i3 || i < this.mCurItem - i3) {
                for (int i4 = 0; i4 < this.mItems.size(); i4++) {
                    ((ItemInfo) this.mItems.get(i4)).scrolling = true;
                }
            }
            if (this.mCurItem != i) {
                z3 = true;
            }
            if (this.mFirstLayout) {
                this.mCurItem = i;
                if (z3 && this.mOnPageChangeListener != null) {
                    this.mOnPageChangeListener.onPageSelected(i);
                }
                if (z3 && this.mInternalPageChangeListener != null) {
                    this.mInternalPageChangeListener.onPageSelected(i);
                }
                requestLayout();
                return;
            }
            populate(i);
            scrollToItem(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    OnPageChangeListener setInternalPageChangeListener(OnPageChangeListener onPageChangeListener) {
        OnPageChangeListener onPageChangeListener2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = onPageChangeListener;
        return onPageChangeListener2;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w(TAG, "Requested offscreen page limit " + i + " too small; defaulting to " + 1);
            i = 1;
        }
        if (i != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i;
            populate();
        }
    }

    void setOnAdapterChangeListener(OnAdapterChangeListener onAdapterChangeListener) {
        this.mAdapterChangeListener = onAdapterChangeListener;
    }

    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.mOnPageChangeListener = onPageChangeListener;
    }

    public void setPageMargin(int i) {
        int i2 = this.mPageMargin;
        this.mPageMargin = i;
        int width = getWidth();
        recomputeScrollPosition(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z, PageTransformer pageTransformer) {
        int i = 1;
        if (VERSION.SDK_INT >= 11) {
            boolean z2 = pageTransformer != null;
            int i2 = z2 != (this.mPageTransformer != null) ? 1 : 0;
            this.mPageTransformer = pageTransformer;
            setChildrenDrawingOrderEnabledCompat(z2);
            if (z2) {
                if (z) {
                    i = 2;
                }
                this.mDrawingOrder = i;
            } else {
                this.mDrawingOrder = 0;
            }
            if (i2 != 0) {
                populate();
            }
        }
    }

    void smoothScrollTo(int i, int i2) {
        smoothScrollTo(i, i2, 0);
    }

    void smoothScrollTo(int i, int i2, int i3) {
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i4 = i - scrollX;
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i6 = clientWidth / 2;
        float distanceInfluenceForSnapDuration = (((float) i6) * distanceInfluenceForSnapDuration(Math.min(1.0f, (((float) Math.abs(i4)) * 1.0f) / ((float) clientWidth)))) + ((float) i6);
        int abs = Math.abs(i3);
        if (abs > 0) {
            clientWidth = Math.round(1000.0f * Math.abs(distanceInfluenceForSnapDuration / ((float) abs))) * 4;
        } else {
            clientWidth = (int) (((((float) Math.abs(i4)) / ((((float) clientWidth) * this.mAdapter.getPageWidth(this.mCurItem)) + ((float) this.mPageMargin))) + 1.0f) * 100.0f);
        }
        this.mScroller.startScroll(scrollX, scrollY, i4, i5, Math.min(clientWidth, MAX_SETTLE_DURATION));
        ViewCompat.postInvalidateOnAnimation(this);
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mMarginDrawable;
    }
}