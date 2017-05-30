package com.b.a.b.c;

import android.graphics.Bitmap;
import android.graphics.ComposeShader;
import android.graphics.Matrix;
import android.graphics.PorterDuff.Mode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import com.b.a.b.a.f;
import com.b.a.b.e.b;

public class d extends c {

    protected static class a extends com.b.a.b.c.c.a {
        a(Bitmap bitmap, int i, int i2) {
            super(bitmap, i, i2);
        }

        protected void onBoundsChange(Rect rect) {
            super.onBoundsChange(rect);
            Shader radialGradient = new RadialGradient(this.c.centerX(), (this.c.centerY() * 1.0f) / 0.7f, this.c.centerX() * 1.3f, new int[]{0, 0, 2130706432}, new float[]{0.0f, 0.7f, 1.0f}, TileMode.CLAMP);
            Matrix matrix = new Matrix();
            matrix.setScale(1.0f, 0.7f);
            radialGradient.setLocalMatrix(matrix);
            this.f.setShader(new ComposeShader(this.e, radialGradient, Mode.SRC_OVER));
        }
    }

    public d(int i, int i2) {
        super(i, i2);
    }

    public void a(Bitmap bitmap, com.b.a.b.e.a aVar, f fVar) {
        if (aVar instanceof b) {
            aVar.a(new a(bitmap, this.a, this.b));
            return;
        }
        throw new IllegalArgumentException("ImageAware should wrap ImageView. ImageViewAware is expected.");
    }
}
