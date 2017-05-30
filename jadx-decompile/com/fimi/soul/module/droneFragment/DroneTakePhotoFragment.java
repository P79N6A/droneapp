package com.fimi.soul.module.droneFragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fimi.kernel.utils.v;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.c.h;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.g.c;
import com.fimi.soul.view.e;

public class DroneTakePhotoFragment extends Fragment implements b {
    v a;
    private k b;
    private j c;
    private a d;
    private View e;
    private Dialog f;
    private int g;
    private double h;

    private void a(String str) {
        if (this.f != null && this.f.isShowing()) {
            this.f.dismiss();
            this.f = null;
        }
        e.a aVar = new e.a(getActivity());
        aVar.a(str);
        aVar.a(true);
        aVar.a(getString(R.string.finish), new OnClickListener(this) {
            final /* synthetic */ DroneTakePhotoFragment a;

            {
                this.a = r1;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        this.f = aVar.a();
        this.f.setCanceledOnTouchOutside(false);
        this.f.show();
    }

    private boolean a(View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return ((float) (view.getBottom() - rect.bottom)) > view.getResources().getDisplayMetrics().density * 100.0f;
    }

    public boolean a() {
        return (this.f == null || !this.f.isShowing()) ? a(this.e) : false;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.d = ((DroidPlannerApp) activity.getApplication()).a;
        this.a = v.a(getActivity());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.drone_takephone, null);
        this.e = inflate;
        this.b = new k(inflate, this.d);
        this.c = new j(inflate);
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        this.d.b((b) this);
    }

    public void onDroneEvent(d.a aVar, a aVar2) {
        switch (aVar) {
            case CAMERARECORD:
                if (h.a(getActivity().getApplicationContext()).a().get() == 4) {
                    this.b.b();
                    return;
                }
                return;
            case GIMBAL_POSITION:
                short b = aVar2.S().b();
                if (this.g - b < 0) {
                    this.h = (double) (((b - 255) * 90) / 255);
                } else {
                    this.h = (double) (((b * 90) / 255) - 90);
                }
                this.g = b;
                this.b.a((int) this.h);
                return;
            case WXCETAKEPHOTOAGAIN:
                this.b.a();
                return;
            case TAKEPHOTOBACKDATA:
                com.fimi.soul.drone.h.a.a ap = aVar2.ap();
                if (ap.j() == (byte) 19) {
                    this.b.a(ap);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!isAdded()) {
            return;
        }
        if (z) {
            if (this.f != null) {
                this.f.dismiss();
            }
            if (this.c != null) {
                this.c.a();
            }
            if (this.b != null) {
                this.b.f();
                return;
            }
            return;
        }
        if (!this.a.a().getBoolean(c.bF, false)) {
            a(getString(R.string.fly_take_photo_tip));
        }
        this.b.d();
        this.b.e();
        this.b.h();
        this.c.b();
        this.d.a(d.a.CLEARMARKERTAKEPHOTO);
        this.d.a(d.a.CLEARDATA);
    }

    public void onStart() {
        super.onStart();
        this.d.a((b) this);
    }
}
