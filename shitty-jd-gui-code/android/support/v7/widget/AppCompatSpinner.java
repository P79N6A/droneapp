package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.TintableBackgroundView;
import android.support.v4.view.ViewCompat;
import android.support.v7.appcompat.R.attr;
import android.support.v7.view.menu.ShowableListMenu;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class AppCompatSpinner
  extends Spinner
  implements TintableBackgroundView
{
  private static final int[] ATTRS_ANDROID_SPINNERMODE;
  private static final boolean IS_AT_LEAST_JB;
  private static final boolean IS_AT_LEAST_M;
  private static final int MAX_ITEMS_MEASURED = 15;
  private static final int MODE_DIALOG = 0;
  private static final int MODE_DROPDOWN = 1;
  private static final int MODE_THEME = -1;
  private static final String TAG = "AppCompatSpinner";
  private AppCompatBackgroundHelper mBackgroundTintHelper;
  private AppCompatDrawableManager mDrawableManager;
  private int mDropDownWidth;
  private ForwardingListener mForwardingListener;
  private DropdownPopup mPopup;
  private Context mPopupContext;
  private boolean mPopupSet;
  private SpinnerAdapter mTempAdapter;
  private final Rect mTempRect;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 23)
    {
      bool = true;
      IS_AT_LEAST_M = bool;
      if (Build.VERSION.SDK_INT < 16) {
        break label45;
      }
    }
    label45:
    for (boolean bool = true;; bool = false)
    {
      IS_AT_LEAST_JB = bool;
      ATTRS_ANDROID_SPINNERMODE = new int[] { 16843505 };
      return;
      bool = false;
      break;
    }
  }
  
  public AppCompatSpinner(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AppCompatSpinner(Context paramContext, int paramInt)
  {
    this(paramContext, null, R.attr.spinnerStyle, paramInt);
  }
  
  public AppCompatSpinner(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.spinnerStyle);
  }
  
  public AppCompatSpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, -1);
  }
  
  public AppCompatSpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    this(paramContext, paramAttributeSet, paramInt1, paramInt2, null);
  }
  
  /* Error */
  public AppCompatSpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2, final Resources.Theme paramTheme)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: iload_3
    //   4: invokespecial 92	android/widget/Spinner:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   7: aload_0
    //   8: new 94	android/graphics/Rect
    //   11: dup
    //   12: invokespecial 96	android/graphics/Rect:<init>	()V
    //   15: putfield 98	android/support/v7/widget/AppCompatSpinner:mTempRect	Landroid/graphics/Rect;
    //   18: aload_1
    //   19: aload_2
    //   20: getstatic 103	android/support/v7/appcompat/R$styleable:Spinner	[I
    //   23: iload_3
    //   24: iconst_0
    //   25: invokestatic 109	android/support/v7/widget/TintTypedArray:obtainStyledAttributes	(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/widget/TintTypedArray;
    //   28: astore 10
    //   30: aload_0
    //   31: invokestatic 115	android/support/v7/widget/AppCompatDrawableManager:get	()Landroid/support/v7/widget/AppCompatDrawableManager;
    //   34: putfield 117	android/support/v7/widget/AppCompatSpinner:mDrawableManager	Landroid/support/v7/widget/AppCompatDrawableManager;
    //   37: aload_0
    //   38: new 119	android/support/v7/widget/AppCompatBackgroundHelper
    //   41: dup
    //   42: aload_0
    //   43: aload_0
    //   44: getfield 117	android/support/v7/widget/AppCompatSpinner:mDrawableManager	Landroid/support/v7/widget/AppCompatDrawableManager;
    //   47: invokespecial 122	android/support/v7/widget/AppCompatBackgroundHelper:<init>	(Landroid/view/View;Landroid/support/v7/widget/AppCompatDrawableManager;)V
    //   50: putfield 124	android/support/v7/widget/AppCompatSpinner:mBackgroundTintHelper	Landroid/support/v7/widget/AppCompatBackgroundHelper;
    //   53: aload 5
    //   55: ifnull +285 -> 340
    //   58: aload_0
    //   59: new 126	android/support/v7/view/ContextThemeWrapper
    //   62: dup
    //   63: aload_1
    //   64: aload 5
    //   66: invokespecial 129	android/support/v7/view/ContextThemeWrapper:<init>	(Landroid/content/Context;Landroid/content/res/Resources$Theme;)V
    //   69: putfield 131	android/support/v7/widget/AppCompatSpinner:mPopupContext	Landroid/content/Context;
    //   72: aload_0
    //   73: getfield 131	android/support/v7/widget/AppCompatSpinner:mPopupContext	Landroid/content/Context;
    //   76: ifnull +184 -> 260
    //   79: iload 4
    //   81: istore 7
    //   83: iload 4
    //   85: iconst_m1
    //   86: if_icmpne +71 -> 157
    //   89: getstatic 61	android/os/Build$VERSION:SDK_INT	I
    //   92: bipush 11
    //   94: if_icmplt +359 -> 453
    //   97: aload_1
    //   98: aload_2
    //   99: getstatic 68	android/support/v7/widget/AppCompatSpinner:ATTRS_ANDROID_SPINNERMODE	[I
    //   102: iload_3
    //   103: iconst_0
    //   104: invokevirtual 136	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   107: astore 8
    //   109: iload 4
    //   111: istore 6
    //   113: aload 8
    //   115: astore 5
    //   117: aload 8
    //   119: iconst_0
    //   120: invokevirtual 142	android/content/res/TypedArray:hasValue	(I)Z
    //   123: ifeq +16 -> 139
    //   126: aload 8
    //   128: astore 5
    //   130: aload 8
    //   132: iconst_0
    //   133: iconst_0
    //   134: invokevirtual 146	android/content/res/TypedArray:getInt	(II)I
    //   137: istore 6
    //   139: iload 6
    //   141: istore 7
    //   143: aload 8
    //   145: ifnull +12 -> 157
    //   148: aload 8
    //   150: invokevirtual 149	android/content/res/TypedArray:recycle	()V
    //   153: iload 6
    //   155: istore 7
    //   157: iload 7
    //   159: iconst_1
    //   160: if_icmpne +100 -> 260
    //   163: new 13	android/support/v7/widget/AppCompatSpinner$DropdownPopup
    //   166: dup
    //   167: aload_0
    //   168: aload_0
    //   169: getfield 131	android/support/v7/widget/AppCompatSpinner:mPopupContext	Landroid/content/Context;
    //   172: aload_2
    //   173: iload_3
    //   174: invokespecial 152	android/support/v7/widget/AppCompatSpinner$DropdownPopup:<init>	(Landroid/support/v7/widget/AppCompatSpinner;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   177: astore 5
    //   179: aload_0
    //   180: getfield 131	android/support/v7/widget/AppCompatSpinner:mPopupContext	Landroid/content/Context;
    //   183: aload_2
    //   184: getstatic 103	android/support/v7/appcompat/R$styleable:Spinner	[I
    //   187: iload_3
    //   188: iconst_0
    //   189: invokestatic 109	android/support/v7/widget/TintTypedArray:obtainStyledAttributes	(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/widget/TintTypedArray;
    //   192: astore 8
    //   194: aload_0
    //   195: aload 8
    //   197: getstatic 155	android/support/v7/appcompat/R$styleable:Spinner_android_dropDownWidth	I
    //   200: bipush -2
    //   202: invokevirtual 158	android/support/v7/widget/TintTypedArray:getLayoutDimension	(II)I
    //   205: putfield 160	android/support/v7/widget/AppCompatSpinner:mDropDownWidth	I
    //   208: aload 5
    //   210: aload 8
    //   212: getstatic 163	android/support/v7/appcompat/R$styleable:Spinner_android_popupBackground	I
    //   215: invokevirtual 167	android/support/v7/widget/TintTypedArray:getDrawable	(I)Landroid/graphics/drawable/Drawable;
    //   218: invokevirtual 171	android/support/v7/widget/AppCompatSpinner$DropdownPopup:setBackgroundDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   221: aload 5
    //   223: aload 10
    //   225: getstatic 174	android/support/v7/appcompat/R$styleable:Spinner_android_prompt	I
    //   228: invokevirtual 178	android/support/v7/widget/TintTypedArray:getString	(I)Ljava/lang/String;
    //   231: invokevirtual 182	android/support/v7/widget/AppCompatSpinner$DropdownPopup:setPromptText	(Ljava/lang/CharSequence;)V
    //   234: aload 8
    //   236: invokevirtual 183	android/support/v7/widget/TintTypedArray:recycle	()V
    //   239: aload_0
    //   240: aload 5
    //   242: putfield 185	android/support/v7/widget/AppCompatSpinner:mPopup	Landroid/support/v7/widget/AppCompatSpinner$DropdownPopup;
    //   245: aload_0
    //   246: new 8	android/support/v7/widget/AppCompatSpinner$1
    //   249: dup
    //   250: aload_0
    //   251: aload_0
    //   252: aload 5
    //   254: invokespecial 188	android/support/v7/widget/AppCompatSpinner$1:<init>	(Landroid/support/v7/widget/AppCompatSpinner;Landroid/view/View;Landroid/support/v7/widget/AppCompatSpinner$DropdownPopup;)V
    //   257: putfield 190	android/support/v7/widget/AppCompatSpinner:mForwardingListener	Landroid/support/v7/widget/ForwardingListener;
    //   260: aload 10
    //   262: getstatic 193	android/support/v7/appcompat/R$styleable:Spinner_android_entries	I
    //   265: invokevirtual 197	android/support/v7/widget/TintTypedArray:getTextArray	(I)[Ljava/lang/CharSequence;
    //   268: astore 5
    //   270: aload 5
    //   272: ifnull +28 -> 300
    //   275: new 199	android/widget/ArrayAdapter
    //   278: dup
    //   279: aload_1
    //   280: ldc -56
    //   282: aload 5
    //   284: invokespecial 203	android/widget/ArrayAdapter:<init>	(Landroid/content/Context;I[Ljava/lang/Object;)V
    //   287: astore_1
    //   288: aload_1
    //   289: getstatic 208	android/support/v7/appcompat/R$layout:support_simple_spinner_dropdown_item	I
    //   292: invokevirtual 212	android/widget/ArrayAdapter:setDropDownViewResource	(I)V
    //   295: aload_0
    //   296: aload_1
    //   297: invokevirtual 216	android/support/v7/widget/AppCompatSpinner:setAdapter	(Landroid/widget/SpinnerAdapter;)V
    //   300: aload 10
    //   302: invokevirtual 183	android/support/v7/widget/TintTypedArray:recycle	()V
    //   305: aload_0
    //   306: iconst_1
    //   307: putfield 218	android/support/v7/widget/AppCompatSpinner:mPopupSet	Z
    //   310: aload_0
    //   311: getfield 220	android/support/v7/widget/AppCompatSpinner:mTempAdapter	Landroid/widget/SpinnerAdapter;
    //   314: ifnull +16 -> 330
    //   317: aload_0
    //   318: aload_0
    //   319: getfield 220	android/support/v7/widget/AppCompatSpinner:mTempAdapter	Landroid/widget/SpinnerAdapter;
    //   322: invokevirtual 216	android/support/v7/widget/AppCompatSpinner:setAdapter	(Landroid/widget/SpinnerAdapter;)V
    //   325: aload_0
    //   326: aconst_null
    //   327: putfield 220	android/support/v7/widget/AppCompatSpinner:mTempAdapter	Landroid/widget/SpinnerAdapter;
    //   330: aload_0
    //   331: getfield 124	android/support/v7/widget/AppCompatSpinner:mBackgroundTintHelper	Landroid/support/v7/widget/AppCompatBackgroundHelper;
    //   334: aload_2
    //   335: iload_3
    //   336: invokevirtual 224	android/support/v7/widget/AppCompatBackgroundHelper:loadFromAttributes	(Landroid/util/AttributeSet;I)V
    //   339: return
    //   340: aload 10
    //   342: getstatic 227	android/support/v7/appcompat/R$styleable:Spinner_popupTheme	I
    //   345: iconst_0
    //   346: invokevirtual 230	android/support/v7/widget/TintTypedArray:getResourceId	(II)I
    //   349: istore 6
    //   351: iload 6
    //   353: ifeq +20 -> 373
    //   356: aload_0
    //   357: new 126	android/support/v7/view/ContextThemeWrapper
    //   360: dup
    //   361: aload_1
    //   362: iload 6
    //   364: invokespecial 232	android/support/v7/view/ContextThemeWrapper:<init>	(Landroid/content/Context;I)V
    //   367: putfield 131	android/support/v7/widget/AppCompatSpinner:mPopupContext	Landroid/content/Context;
    //   370: goto -298 -> 72
    //   373: getstatic 63	android/support/v7/widget/AppCompatSpinner:IS_AT_LEAST_M	Z
    //   376: ifne +15 -> 391
    //   379: aload_1
    //   380: astore 5
    //   382: aload_0
    //   383: aload 5
    //   385: putfield 131	android/support/v7/widget/AppCompatSpinner:mPopupContext	Landroid/content/Context;
    //   388: goto -316 -> 72
    //   391: aconst_null
    //   392: astore 5
    //   394: goto -12 -> 382
    //   397: astore 9
    //   399: aconst_null
    //   400: astore 8
    //   402: aload 8
    //   404: astore 5
    //   406: ldc 38
    //   408: ldc -22
    //   410: aload 9
    //   412: invokestatic 240	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   415: pop
    //   416: iload 4
    //   418: istore 7
    //   420: aload 8
    //   422: ifnull -265 -> 157
    //   425: aload 8
    //   427: invokevirtual 149	android/content/res/TypedArray:recycle	()V
    //   430: iload 4
    //   432: istore 7
    //   434: goto -277 -> 157
    //   437: astore_1
    //   438: aconst_null
    //   439: astore 5
    //   441: aload 5
    //   443: ifnull +8 -> 451
    //   446: aload 5
    //   448: invokevirtual 149	android/content/res/TypedArray:recycle	()V
    //   451: aload_1
    //   452: athrow
    //   453: iconst_1
    //   454: istore 7
    //   456: goto -299 -> 157
    //   459: astore_1
    //   460: goto -19 -> 441
    //   463: astore 9
    //   465: goto -63 -> 402
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	468	0	this	AppCompatSpinner
    //   0	468	1	paramContext	Context
    //   0	468	2	paramAttributeSet	AttributeSet
    //   0	468	3	paramInt1	int
    //   0	468	4	paramInt2	int
    //   0	468	5	paramTheme	Resources.Theme
    //   111	252	6	i	int
    //   81	374	7	j	int
    //   107	319	8	localObject	Object
    //   397	14	9	localException1	Exception
    //   463	1	9	localException2	Exception
    //   28	313	10	localTintTypedArray	TintTypedArray
    // Exception table:
    //   from	to	target	type
    //   97	109	397	java/lang/Exception
    //   97	109	437	finally
    //   117	126	459	finally
    //   130	139	459	finally
    //   406	416	459	finally
    //   117	126	463	java/lang/Exception
    //   130	139	463	java/lang/Exception
  }
  
  private int compatMeasureContentWidth(SpinnerAdapter paramSpinnerAdapter, Drawable paramDrawable)
  {
    if (paramSpinnerAdapter == null) {
      return 0;
    }
    int n = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
    int i1 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
    int i = Math.max(0, getSelectedItemPosition());
    int i2 = Math.min(paramSpinnerAdapter.getCount(), i + 15);
    int j = Math.max(0, i - (15 - (i2 - i)));
    View localView = null;
    int k = 0;
    i = 0;
    if (j < i2)
    {
      int m = paramSpinnerAdapter.getItemViewType(j);
      if (m == i) {
        break label204;
      }
      localView = null;
      i = m;
    }
    label204:
    for (;;)
    {
      localView = paramSpinnerAdapter.getView(j, localView, this);
      if (localView.getLayoutParams() == null) {
        localView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
      }
      localView.measure(n, i1);
      k = Math.max(k, localView.getMeasuredWidth());
      j += 1;
      break;
      if (paramDrawable != null)
      {
        paramDrawable.getPadding(this.mTempRect);
        return this.mTempRect.left + this.mTempRect.right + k;
      }
      return k;
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (this.mBackgroundTintHelper != null) {
      this.mBackgroundTintHelper.applySupportBackgroundTint();
    }
  }
  
  public int getDropDownHorizontalOffset()
  {
    if (this.mPopup != null) {
      return this.mPopup.getHorizontalOffset();
    }
    if (IS_AT_LEAST_JB) {
      return super.getDropDownHorizontalOffset();
    }
    return 0;
  }
  
  public int getDropDownVerticalOffset()
  {
    if (this.mPopup != null) {
      return this.mPopup.getVerticalOffset();
    }
    if (IS_AT_LEAST_JB) {
      return super.getDropDownVerticalOffset();
    }
    return 0;
  }
  
  public int getDropDownWidth()
  {
    if (this.mPopup != null) {
      return this.mDropDownWidth;
    }
    if (IS_AT_LEAST_JB) {
      return super.getDropDownWidth();
    }
    return 0;
  }
  
  public Drawable getPopupBackground()
  {
    if (this.mPopup != null) {
      return this.mPopup.getBackground();
    }
    if (IS_AT_LEAST_JB) {
      return super.getPopupBackground();
    }
    return null;
  }
  
  public Context getPopupContext()
  {
    if (this.mPopup != null) {
      return this.mPopupContext;
    }
    if (IS_AT_LEAST_M) {
      return super.getPopupContext();
    }
    return null;
  }
  
  public CharSequence getPrompt()
  {
    if (this.mPopup != null) {
      return this.mPopup.getHintText();
    }
    return super.getPrompt();
  }
  
  @Nullable
  public ColorStateList getSupportBackgroundTintList()
  {
    if (this.mBackgroundTintHelper != null) {
      return this.mBackgroundTintHelper.getSupportBackgroundTintList();
    }
    return null;
  }
  
  @Nullable
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    if (this.mBackgroundTintHelper != null) {
      return this.mBackgroundTintHelper.getSupportBackgroundTintMode();
    }
    return null;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if ((this.mPopup != null) && (this.mPopup.isShowing())) {
      this.mPopup.dismiss();
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((this.mPopup != null) && (View.MeasureSpec.getMode(paramInt1) == Integer.MIN_VALUE)) {
      setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), compatMeasureContentWidth(getAdapter(), getBackground())), View.MeasureSpec.getSize(paramInt1)), getMeasuredHeight());
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((this.mForwardingListener != null) && (this.mForwardingListener.onTouch(this, paramMotionEvent))) {
      return true;
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public boolean performClick()
  {
    if (this.mPopup != null)
    {
      if (!this.mPopup.isShowing()) {
        this.mPopup.show();
      }
      return true;
    }
    return super.performClick();
  }
  
  public void setAdapter(SpinnerAdapter paramSpinnerAdapter)
  {
    if (!this.mPopupSet) {
      this.mTempAdapter = paramSpinnerAdapter;
    }
    do
    {
      return;
      super.setAdapter(paramSpinnerAdapter);
    } while (this.mPopup == null);
    if (this.mPopupContext == null) {}
    for (Context localContext = getContext();; localContext = this.mPopupContext)
    {
      this.mPopup.setAdapter(new DropDownAdapter(paramSpinnerAdapter, localContext.getTheme()));
      return;
    }
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    if (this.mBackgroundTintHelper != null) {
      this.mBackgroundTintHelper.onSetBackgroundDrawable(paramDrawable);
    }
  }
  
  public void setBackgroundResource(@DrawableRes int paramInt)
  {
    super.setBackgroundResource(paramInt);
    if (this.mBackgroundTintHelper != null) {
      this.mBackgroundTintHelper.onSetBackgroundResource(paramInt);
    }
  }
  
  public void setDropDownHorizontalOffset(int paramInt)
  {
    if (this.mPopup != null) {
      this.mPopup.setHorizontalOffset(paramInt);
    }
    while (!IS_AT_LEAST_JB) {
      return;
    }
    super.setDropDownHorizontalOffset(paramInt);
  }
  
  public void setDropDownVerticalOffset(int paramInt)
  {
    if (this.mPopup != null) {
      this.mPopup.setVerticalOffset(paramInt);
    }
    while (!IS_AT_LEAST_JB) {
      return;
    }
    super.setDropDownVerticalOffset(paramInt);
  }
  
  public void setDropDownWidth(int paramInt)
  {
    if (this.mPopup != null) {
      this.mDropDownWidth = paramInt;
    }
    while (!IS_AT_LEAST_JB) {
      return;
    }
    super.setDropDownWidth(paramInt);
  }
  
  public void setPopupBackgroundDrawable(Drawable paramDrawable)
  {
    if (this.mPopup != null) {
      this.mPopup.setBackgroundDrawable(paramDrawable);
    }
    while (!IS_AT_LEAST_JB) {
      return;
    }
    super.setPopupBackgroundDrawable(paramDrawable);
  }
  
  public void setPopupBackgroundResource(@DrawableRes int paramInt)
  {
    setPopupBackgroundDrawable(ContextCompat.getDrawable(getPopupContext(), paramInt));
  }
  
  public void setPrompt(CharSequence paramCharSequence)
  {
    if (this.mPopup != null)
    {
      this.mPopup.setPromptText(paramCharSequence);
      return;
    }
    super.setPrompt(paramCharSequence);
  }
  
  public void setSupportBackgroundTintList(@Nullable ColorStateList paramColorStateList)
  {
    if (this.mBackgroundTintHelper != null) {
      this.mBackgroundTintHelper.setSupportBackgroundTintList(paramColorStateList);
    }
  }
  
  public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode paramMode)
  {
    if (this.mBackgroundTintHelper != null) {
      this.mBackgroundTintHelper.setSupportBackgroundTintMode(paramMode);
    }
  }
  
  private static class DropDownAdapter
    implements ListAdapter, SpinnerAdapter
  {
    private SpinnerAdapter mAdapter;
    private ListAdapter mListAdapter;
    
    public DropDownAdapter(@Nullable SpinnerAdapter paramSpinnerAdapter, @Nullable Resources.Theme paramTheme)
    {
      this.mAdapter = paramSpinnerAdapter;
      if ((paramSpinnerAdapter instanceof ListAdapter)) {
        this.mListAdapter = ((ListAdapter)paramSpinnerAdapter);
      }
      if (paramTheme != null)
      {
        if ((!AppCompatSpinner.IS_AT_LEAST_M) || (!(paramSpinnerAdapter instanceof android.widget.ThemedSpinnerAdapter))) {
          break label64;
        }
        paramSpinnerAdapter = (android.widget.ThemedSpinnerAdapter)paramSpinnerAdapter;
        if (paramSpinnerAdapter.getDropDownViewTheme() != paramTheme) {
          paramSpinnerAdapter.setDropDownViewTheme(paramTheme);
        }
      }
      label64:
      do
      {
        do
        {
          return;
        } while (!(paramSpinnerAdapter instanceof ThemedSpinnerAdapter));
        paramSpinnerAdapter = (ThemedSpinnerAdapter)paramSpinnerAdapter;
      } while (paramSpinnerAdapter.getDropDownViewTheme() != null);
      paramSpinnerAdapter.setDropDownViewTheme(paramTheme);
    }
    
    public boolean areAllItemsEnabled()
    {
      ListAdapter localListAdapter = this.mListAdapter;
      if (localListAdapter != null) {
        return localListAdapter.areAllItemsEnabled();
      }
      return true;
    }
    
    public int getCount()
    {
      if (this.mAdapter == null) {
        return 0;
      }
      return this.mAdapter.getCount();
    }
    
    public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      if (this.mAdapter == null) {
        return null;
      }
      return this.mAdapter.getDropDownView(paramInt, paramView, paramViewGroup);
    }
    
    public Object getItem(int paramInt)
    {
      if (this.mAdapter == null) {
        return null;
      }
      return this.mAdapter.getItem(paramInt);
    }
    
    public long getItemId(int paramInt)
    {
      if (this.mAdapter == null) {
        return -1L;
      }
      return this.mAdapter.getItemId(paramInt);
    }
    
    public int getItemViewType(int paramInt)
    {
      return 0;
    }
    
    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      return getDropDownView(paramInt, paramView, paramViewGroup);
    }
    
    public int getViewTypeCount()
    {
      return 1;
    }
    
    public boolean hasStableIds()
    {
      return (this.mAdapter != null) && (this.mAdapter.hasStableIds());
    }
    
    public boolean isEmpty()
    {
      return getCount() == 0;
    }
    
    public boolean isEnabled(int paramInt)
    {
      ListAdapter localListAdapter = this.mListAdapter;
      if (localListAdapter != null) {
        return localListAdapter.isEnabled(paramInt);
      }
      return true;
    }
    
    public void registerDataSetObserver(DataSetObserver paramDataSetObserver)
    {
      if (this.mAdapter != null) {
        this.mAdapter.registerDataSetObserver(paramDataSetObserver);
      }
    }
    
    public void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
    {
      if (this.mAdapter != null) {
        this.mAdapter.unregisterDataSetObserver(paramDataSetObserver);
      }
    }
  }
  
  private class DropdownPopup
    extends ListPopupWindow
  {
    private ListAdapter mAdapter;
    private CharSequence mHintText;
    private final Rect mVisibleRect = new Rect();
    
    public DropdownPopup(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
    {
      super(paramAttributeSet, paramInt);
      setAnchorView(AppCompatSpinner.this);
      setModal(true);
      setPromptPosition(0);
      setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          AppCompatSpinner.this.setSelection(paramAnonymousInt);
          if (AppCompatSpinner.this.getOnItemClickListener() != null) {
            AppCompatSpinner.this.performItemClick(paramAnonymousView, paramAnonymousInt, AppCompatSpinner.DropdownPopup.this.mAdapter.getItemId(paramAnonymousInt));
          }
          AppCompatSpinner.DropdownPopup.this.dismiss();
        }
      });
    }
    
    private boolean isVisibleToUser(View paramView)
    {
      return (ViewCompat.isAttachedToWindow(paramView)) && (paramView.getGlobalVisibleRect(this.mVisibleRect));
    }
    
    void computeContentWidth()
    {
      Object localObject = getBackground();
      int i;
      int m;
      int n;
      int i1;
      int j;
      if (localObject != null)
      {
        ((Drawable)localObject).getPadding(AppCompatSpinner.this.mTempRect);
        if (ViewUtils.isLayoutRtl(AppCompatSpinner.this))
        {
          i = AppCompatSpinner.this.mTempRect.right;
          m = AppCompatSpinner.this.getPaddingLeft();
          n = AppCompatSpinner.this.getPaddingRight();
          i1 = AppCompatSpinner.this.getWidth();
          if (AppCompatSpinner.this.mDropDownWidth != -2) {
            break label240;
          }
          j = AppCompatSpinner.this.compatMeasureContentWidth((SpinnerAdapter)this.mAdapter, getBackground());
          int k = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels - AppCompatSpinner.this.mTempRect.left - AppCompatSpinner.this.mTempRect.right;
          if (j <= k) {
            break label288;
          }
          j = k;
        }
      }
      label165:
      label240:
      label288:
      for (;;)
      {
        setContentWidth(Math.max(j, i1 - m - n));
        if (ViewUtils.isLayoutRtl(AppCompatSpinner.this)) {
          i = i1 - n - getWidth() + i;
        }
        for (;;)
        {
          setHorizontalOffset(i);
          return;
          i = -AppCompatSpinner.this.mTempRect.left;
          break;
          localObject = AppCompatSpinner.this.mTempRect;
          AppCompatSpinner.this.mTempRect.right = 0;
          ((Rect)localObject).left = 0;
          i = 0;
          break;
          if (AppCompatSpinner.this.mDropDownWidth == -1)
          {
            setContentWidth(i1 - m - n);
            break label165;
          }
          setContentWidth(AppCompatSpinner.this.mDropDownWidth);
          break label165;
          i += m;
        }
      }
    }
    
    public CharSequence getHintText()
    {
      return this.mHintText;
    }
    
    public void setAdapter(ListAdapter paramListAdapter)
    {
      super.setAdapter(paramListAdapter);
      this.mAdapter = paramListAdapter;
    }
    
    public void setPromptText(CharSequence paramCharSequence)
    {
      this.mHintText = paramCharSequence;
    }
    
    public void show()
    {
      boolean bool = isShowing();
      computeContentWidth();
      setInputMethodMode(2);
      super.show();
      getListView().setChoiceMode(1);
      setSelection(AppCompatSpinner.this.getSelectedItemPosition());
      if (bool) {}
      ViewTreeObserver localViewTreeObserver;
      do
      {
        return;
        localViewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
      } while (localViewTreeObserver == null);
      final ViewTreeObserver.OnGlobalLayoutListener local2 = new ViewTreeObserver.OnGlobalLayoutListener()
      {
        public void onGlobalLayout()
        {
          if (!AppCompatSpinner.DropdownPopup.this.isVisibleToUser(AppCompatSpinner.this))
          {
            AppCompatSpinner.DropdownPopup.this.dismiss();
            return;
          }
          AppCompatSpinner.DropdownPopup.this.computeContentWidth();
          AppCompatSpinner.DropdownPopup.this.show();
        }
      };
      localViewTreeObserver.addOnGlobalLayoutListener(local2);
      setOnDismissListener(new PopupWindow.OnDismissListener()
      {
        public void onDismiss()
        {
          ViewTreeObserver localViewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
          if (localViewTreeObserver != null) {
            localViewTreeObserver.removeGlobalOnLayoutListener(local2);
          }
        }
      });
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/AppCompatSpinner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */