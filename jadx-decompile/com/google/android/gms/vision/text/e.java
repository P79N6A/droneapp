package com.google.android.gms.vision.text;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.SparseArray;
import com.google.android.gms.vision.b;
import com.google.android.gms.vision.d;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import com.google.android.gms.vision.text.internal.client.LineBoxParcel;
import com.google.android.gms.vision.text.internal.client.RecognitionOptions;
import com.google.android.gms.vision.text.internal.client.TextRecognizerOptions;
import com.google.android.gms.vision.text.internal.client.g;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;

public final class e extends b<d> {
    private final g a;

    public static class a {
        private Context a;
        private TextRecognizerOptions b = new TextRecognizerOptions();

        public a(Context context) {
            this.a = context;
        }

        public e a() {
            return new e(new g(this.a, this.b));
        }
    }

    private e() {
        throw new IllegalStateException("Default constructor called");
    }

    private e(g gVar) {
        this.a = gVar;
    }

    private Bitmap a(Bitmap bitmap, FrameMetadataParcel frameMetadataParcel) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (frameMetadataParcel.f != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate((float) b(frameMetadataParcel.f));
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        }
        if (frameMetadataParcel.f == 1 || frameMetadataParcel.f == 3) {
            frameMetadataParcel.b = height;
            frameMetadataParcel.c = width;
        }
        return bitmap;
    }

    private Bitmap a(ByteBuffer byteBuffer, int i, int i2, int i3) {
        byte[] array;
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            array = byteBuffer.array();
        } else {
            array = new byte[byteBuffer.capacity()];
            byteBuffer.get(array);
        }
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new YuvImage(array, i, i2, i3, null).compressToJpeg(new Rect(0, 0, i2, i3), 100, byteArrayOutputStream);
        byte[] toByteArray = byteArrayOutputStream.toByteArray();
        return BitmapFactory.decodeByteArray(toByteArray, 0, toByteArray.length);
    }

    private Rect a(Rect rect, int i, int i2, FrameMetadataParcel frameMetadataParcel) {
        switch (frameMetadataParcel.f) {
            case 1:
                return new Rect(i2 - rect.bottom, rect.left, i2 - rect.top, rect.right);
            case 2:
                return new Rect(i - rect.right, i2 - rect.bottom, i - rect.left, i2 - rect.top);
            case 3:
                return new Rect(rect.top, i - rect.right, rect.bottom, i - rect.left);
            default:
                return rect;
        }
    }

    private SparseArray<d> a(LineBoxParcel[] lineBoxParcelArr) {
        int i = 0;
        SparseArray sparseArray = new SparseArray();
        for (LineBoxParcel lineBoxParcel : lineBoxParcelArr) {
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(lineBoxParcel.k);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.append(lineBoxParcel.k, sparseArray2);
            }
            sparseArray2.append(lineBoxParcel.l, lineBoxParcel);
        }
        SparseArray<d> sparseArray3 = new SparseArray(sparseArray.size());
        while (i < sparseArray.size()) {
            sparseArray3.append(sparseArray.keyAt(i), new d((SparseArray) sparseArray.valueAt(i)));
            i++;
        }
        return sparseArray3;
    }

    private int b(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 90;
            case 2:
                return Opcodes.GETFIELD;
            case 3:
                return 270;
            default:
                throw new IllegalArgumentException("Unsupported rotation degree.");
        }
    }

    public SparseArray<d> a(d dVar) {
        return a(dVar, new RecognitionOptions(1, new Rect()));
    }

    public SparseArray<d> a(d dVar, RecognitionOptions recognitionOptions) {
        if (dVar == null) {
            throw new IllegalArgumentException("No frame supplied.");
        }
        Bitmap c;
        FrameMetadataParcel a = FrameMetadataParcel.a(dVar);
        if (dVar.c() != null) {
            c = dVar.c();
        } else {
            c = a(dVar.b(), dVar.a().f(), a.b, a.c);
        }
        c = a(c, a);
        if (!recognitionOptions.b.isEmpty()) {
            recognitionOptions.b.set(a(recognitionOptions.b, dVar.a().a(), dVar.a().b(), a));
        }
        a.f = 0;
        return a(this.a.a(c, a, recognitionOptions));
    }

    public void a() {
        super.a();
        this.a.c();
    }

    public boolean b() {
        return this.a.b();
    }
}
