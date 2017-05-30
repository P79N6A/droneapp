package com.fimi.soul.media.gallery;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import com.fimi.kernel.utils.c;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.camera.entity.X11FileInfo;
import com.fimi.soul.utils.x;
import com.fimi.soul.view.photodraweeview.PhotoDraweeView;
import com.fimi.soul.view.photodraweeview.d;

public class DroneImageDetailFragment extends Fragment {
    private int a = 0;
    private String b;
    private boolean c = false;
    private String d;
    private PhotoDraweeView e;
    private ProgressBar f;
    private Bitmap g = null;
    private d h;

    private class a extends BaseControllerListener<ImageInfo> {
        final /* synthetic */ DroneImageDetailFragment a;

        private a(DroneImageDetailFragment droneImageDetailFragment) {
            this.a = droneImageDetailFragment;
        }

        public void a(String str, ImageInfo imageInfo, Animatable animatable) {
            super.onFinalImageSet(str, imageInfo, animatable);
            this.a.f.setVisibility(8);
            if (imageInfo != null && this.a.e != null) {
                this.a.e.a(imageInfo.getWidth(), imageInfo.getHeight());
            }
        }

        public void onFailure(String str, Throwable th) {
            super.onFailure(str, th);
            this.a.f.setVisibility(8);
        }

        public /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            a(str, (ImageInfo) obj, animatable);
        }
    }

    public static DroneImageDetailFragment a(String str) {
        return new DroneImageDetailFragment();
    }

    public int a() {
        return this.a;
    }

    public void a(int i) {
        this.a = i;
    }

    public void a(d dVar) {
        this.h = dVar;
    }

    public void b() {
        if (this.b.contains("&&")) {
            this.b = this.b.split("&&")[0];
        }
        if (this.d != null) {
            x.a(this.e, this.d, this.b, new a());
        } else {
            x.a(this.e, this.b, new a());
        }
        this.c = true;
    }

    public void b(String str) {
        this.b = str;
    }

    public PhotoDraweeView c() {
        return this.e;
    }

    public void c(String str) {
        this.d = str;
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return this.d;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.e.getLayoutParams().height = c.d(getActivity()).heightPixels;
        this.e.getLayoutParams().width = c.d(getActivity()).widthPixels;
        if (this.h != null) {
            this.e.setOnPhotoTapListener(this.h);
        }
        if (this.c) {
            b();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.image_detail_fragment, viewGroup, false);
        this.f = (ProgressBar) inflate.findViewById(R.id.loading);
        if (this.b == null || this.b.endsWith(X11FileInfo.FILE_TYPE_MP4)) {
            this.f.setVisibility(8);
        } else {
            this.f.setVisibility(0);
        }
        this.e = (PhotoDraweeView) inflate.findViewById(R.id.image);
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        this.g = null;
        System.gc();
    }

    public void onStop() {
        super.onStop();
        if (!(this.g == null || this.g.isRecycled())) {
            this.g.recycle();
        }
        System.gc();
    }
}
