package com.fimi.soul.media.gallery;

import android.annotation.SuppressLint;
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
import com.fimi.kernel.utils.s;
import com.fimi.overseas.soul.R;
import com.fimi.soul.utils.v;
import com.fimi.soul.utils.x;
import com.fimi.soul.view.photodraweeview.PhotoDraweeView;
import com.fimi.soul.view.photodraweeview.d;

public class ImageDetailFragment extends Fragment {
    private static boolean e;
    Bitmap a = null;
    private String b;
    private PhotoDraweeView c;
    private ProgressBar d;

    public static ImageDetailFragment a(String str, boolean z) {
        ImageDetailFragment imageDetailFragment = new ImageDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        imageDetailFragment.setArguments(bundle);
        e = z;
        return imageDetailFragment;
    }

    @SuppressLint({"NewApi"})
    private void a(PhotoDraweeView photoDraweeView, String str, Bitmap bitmap) {
        if (bitmap == null) {
            photoDraweeView.setImageResource(R.drawable.friends_sends_pictures_no);
        } else if (v.c(str, getActivity())) {
            photoDraweeView.setBackground(s.a(bitmap));
            photoDraweeView.setImageResource(R.drawable.video_ic);
        } else {
            photoDraweeView.setImageBitmap(bitmap);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (e) {
            this.b = "file://" + this.b;
        }
        this.c.getLayoutParams().height = c.d(getActivity()).heightPixels;
        this.c.getLayoutParams().width = c.d(getActivity()).widthPixels;
        x.a(this.c, this.b, new BaseControllerListener<ImageInfo>(this) {
            final /* synthetic */ ImageDetailFragment a;

            {
                this.a = r1;
            }

            public void a(String str, ImageInfo imageInfo, Animatable animatable) {
                super.onFinalImageSet(str, imageInfo, animatable);
                if (imageInfo != null && this.a.c != null) {
                    this.a.c.a(imageInfo.getWidth(), imageInfo.getHeight());
                }
            }

            public /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                a(str, (ImageInfo) obj, animatable);
            }
        });
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b = getArguments() != null ? getArguments().getString("url") : null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.image_detail_fragment, viewGroup, false);
        this.c = (PhotoDraweeView) inflate.findViewById(R.id.image);
        this.c.setOnPhotoTapListener(new d(this) {
            final /* synthetic */ ImageDetailFragment a;

            {
                this.a = r1;
            }

            public void a(View view, float f, float f2) {
                this.a.getActivity().finish();
                this.a.getActivity().overridePendingTransition(17432576, 17432577);
            }
        });
        this.d = (ProgressBar) inflate.findViewById(R.id.loading);
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        this.a = null;
        System.gc();
    }

    public void onStop() {
        super.onStop();
        if (!(this.a == null || this.a.isRecycled())) {
            this.a.recycle();
        }
        System.gc();
    }
}
