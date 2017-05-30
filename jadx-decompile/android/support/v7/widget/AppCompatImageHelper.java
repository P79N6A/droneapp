package android.support.v7.widget;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.v4.content.ContextCompat;
import android.widget.ImageView;

public class AppCompatImageHelper {
    private final AppCompatDrawableManager mDrawableManager;
    private final ImageView mView;

    public AppCompatImageHelper(ImageView imageView, AppCompatDrawableManager appCompatDrawableManager) {
        this.mView = imageView;
        this.mDrawableManager = appCompatDrawableManager;
    }

    boolean hasOverlappingRendering() {
        return VERSION.SDK_INT < 21 || !(this.mView.getBackground() instanceof RippleDrawable);
    }

    public void loadFromAttributes(android.util.AttributeSet r7, int r8) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x003d in list [B:12:0x003a]
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:42)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
        /*
        r6 = this;
        r5 = -1;
        r1 = 0;
        r0 = r6.mView;	 Catch:{ all -> 0x003e }
        r0 = r0.getDrawable();	 Catch:{ all -> 0x003e }
        if (r0 != 0) goto L_0x0033;	 Catch:{ all -> 0x003e }
    L_0x000a:
        r2 = r6.mView;	 Catch:{ all -> 0x003e }
        r2 = r2.getContext();	 Catch:{ all -> 0x003e }
        r3 = android.support.v7.appcompat.R.styleable.AppCompatImageView;	 Catch:{ all -> 0x003e }
        r4 = 0;	 Catch:{ all -> 0x003e }
        r1 = android.support.v7.widget.TintTypedArray.obtainStyledAttributes(r2, r7, r3, r8, r4);	 Catch:{ all -> 0x003e }
        r2 = android.support.v7.appcompat.R.styleable.AppCompatImageView_srcCompat;	 Catch:{ all -> 0x003e }
        r3 = -1;	 Catch:{ all -> 0x003e }
        r2 = r1.getResourceId(r2, r3);	 Catch:{ all -> 0x003e }
        if (r2 == r5) goto L_0x0033;	 Catch:{ all -> 0x003e }
    L_0x0020:
        r0 = r6.mDrawableManager;	 Catch:{ all -> 0x003e }
        r3 = r6.mView;	 Catch:{ all -> 0x003e }
        r3 = r3.getContext();	 Catch:{ all -> 0x003e }
        r0 = r0.getDrawable(r3, r2);	 Catch:{ all -> 0x003e }
        if (r0 == 0) goto L_0x0033;	 Catch:{ all -> 0x003e }
    L_0x002e:
        r2 = r6.mView;	 Catch:{ all -> 0x003e }
        r2.setImageDrawable(r0);	 Catch:{ all -> 0x003e }
    L_0x0033:
        if (r0 == 0) goto L_0x0038;	 Catch:{ all -> 0x003e }
    L_0x0035:
        android.support.v7.widget.DrawableUtils.fixDrawable(r0);	 Catch:{ all -> 0x003e }
    L_0x0038:
        if (r1 == 0) goto L_0x003d;
    L_0x003a:
        r1.recycle();
    L_0x003d:
        return;
    L_0x003e:
        r0 = move-exception;
        if (r1 == 0) goto L_0x0044;
    L_0x0041:
        r1.recycle();
    L_0x0044:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AppCompatImageHelper.loadFromAttributes(android.util.AttributeSet, int):void");
    }

    public void setImageResource(int i) {
        if (i != 0) {
            Drawable drawable = this.mDrawableManager != null ? this.mDrawableManager.getDrawable(this.mView.getContext(), i) : ContextCompat.getDrawable(this.mView.getContext(), i);
            if (drawable != null) {
                DrawableUtils.fixDrawable(drawable);
            }
            this.mView.setImageDrawable(drawable);
            return;
        }
        this.mView.setImageDrawable(null);
    }
}
