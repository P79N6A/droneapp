package com.fimi.soul.media.gallery;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import com.fimi.overseas.soul.R;
import com.fimi.soul.view.photodraweeview.PhotoDraweeView;
import com.fimi.soul.view.photodraweeview.d;

public class b extends AlertDialog implements OnClickListener {
    private Bitmap a;
    private ProgressBar b;

    public b(Context context, Bitmap bitmap, int i) {
        super(context, i);
        this.a = bitmap;
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.gallery:
                dismiss();
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gallery_dialog);
        PhotoDraweeView photoDraweeView = (PhotoDraweeView) findViewById(R.id.gallery);
        photoDraweeView.setOnPhotoTapListener(new d(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public void a(View view, float f, float f2) {
                this.a.dismiss();
            }
        });
        this.b = (ProgressBar) findViewById(R.id.progress);
        photoDraweeView.setOnClickListener(this);
        if (this.a != null) {
            photoDraweeView.setImageBitmap(this.a);
            this.b.setVisibility(4);
            photoDraweeView.setVisibility(0);
        }
    }
}
