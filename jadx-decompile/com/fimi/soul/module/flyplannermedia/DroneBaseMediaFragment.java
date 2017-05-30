package com.fimi.soul.module.flyplannermedia;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.MotionEventCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import com.fimi.kernel.utils.p;
import com.fimi.kernel.utils.t;
import com.fimi.overseas.soul.R;
import com.fimi.soul.b.f;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.camera.b.d;
import com.fimi.soul.biz.camera.b.e;
import com.fimi.soul.biz.camera.entity.X11FileInfo;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.drone.a;
import com.fimi.soul.entity.WifiDistanceFile;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.j;
import com.fimi.soul.view.MyGridView;
import com.google.android.gms.maps.model.b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public abstract class DroneBaseMediaFragment extends Fragment implements OnItemLongClickListener, d, e<X11RespCmd> {
    protected f a;
    float b = 0.0f;
    List<X11FileInfo> c = null;
    private MyGridView d = null;
    private TextView e = null;
    private com.fimi.soul.biz.camera.d f;
    private boolean g = false;
    private boolean h = false;
    private a i;
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;

    private DroneMediaTabActivity o() {
        return (DroneMediaTabActivity) getActivity();
    }

    abstract void a(GridView gridView);

    public void a(WifiDistanceFile wifiDistanceFile) {
        if ((wifiDistanceFile == null || this.c == null || this.c.size() == 0) && !this.l) {
            this.c = m().k().getCurDirFileList();
        }
        this.l = true;
        if (this.c != null && this.c.size() > 0) {
            X11FileInfo x11FileInfo = null;
            for (X11FileInfo x11FileInfo2 : this.c) {
                X11FileInfo x11FileInfo22;
                if (!x11FileInfo22.getAbsolutePath().equals(wifiDistanceFile.getAbsolutePath())) {
                    x11FileInfo22 = x11FileInfo;
                }
                x11FileInfo = x11FileInfo22;
            }
            if (x11FileInfo != null) {
                this.c.remove(x11FileInfo);
            }
        }
    }

    public void a(List<WifiDistanceFile> list) {
        if (list != null && list.size() != 0 && this.c != null && this.c.size() != 0) {
            Log.d("moweiru", "toDeleteFiles=" + ((WifiDistanceFile) list.get(0)).getName());
            List<X11FileInfo> arrayList = new ArrayList();
            for (WifiDistanceFile wifiDistanceFile : list) {
                for (X11FileInfo x11FileInfo : this.c) {
                    if (x11FileInfo.getName().equals(wifiDistanceFile.getName())) {
                        arrayList.add(x11FileInfo);
                    }
                }
            }
            if (arrayList != null && arrayList.size() > 0) {
                for (X11FileInfo remove : arrayList) {
                    this.c.remove(remove);
                }
            }
        }
    }

    protected void a(boolean z) {
        this.h = z;
    }

    protected boolean a() {
        return this.h;
    }

    protected f b() {
        return this.a;
    }

    protected void b(boolean z) {
        o().b().setVisibility(z ? 0 : 8);
    }

    protected Button c() {
        return (Button) o().b().findViewById(R.id.btn_topLeft);
    }

    protected void c(boolean z) {
        o().a().setVisibility(z ? 0 : 8);
    }

    protected TextView d() {
        return this.e;
    }

    protected void d(boolean z) {
        if (o() != null) {
            o().a(z);
        }
    }

    public List<X11FileInfo> e() {
        return this.c;
    }

    protected void e(boolean z) {
        o().a().findViewById(R.id.ll_bottomDownload).setVisibility(z ? 0 : 8);
    }

    protected Button f() {
        return (Button) o().b().findViewById(R.id.btn_topRight);
    }

    protected void f(boolean z) {
        View findViewById = o().a().findViewById(R.id.ll_bottomShare);
        if (z) {
            findViewById.setVisibility(8);
        } else {
            findViewById.setVisibility(8);
        }
    }

    protected TextView g() {
        return (TextView) o().b().findViewById(R.id.tv_topCenter);
    }

    protected void g(boolean z) {
        if (o() != null && o().findViewById(R.id.load_pb) != null) {
            o().findViewById(R.id.load_pb).setVisibility(z ? 0 : 8);
        }
    }

    public String h() {
        int i;
        int i2;
        File file = new File(j.o());
        if (file == null || !file.exists()) {
            i = 0;
            i2 = 0;
        } else {
            File[] listFiles = file.listFiles();
            i = 0;
            i2 = 0;
            for (File name : listFiles) {
                String name2 = name.getName();
                if (name2.endsWith(X11FileInfo.FILE_TYPE_MP4)) {
                    i++;
                }
                if (name2.endsWith(".jpg")) {
                    i2++;
                }
            }
        }
        return String.format(getActivity().getResources().getString(R.string.local_media_detail), new Object[]{i2 + "", i + ""});
    }

    protected void h(boolean z) {
        b(z);
        c(z);
        if (z) {
            this.d.setPadding(0, 0, 0, (int) p.a(getActivity(), (float) b.c));
            b().a(f.a.Choose);
            f().setText(getString(R.string.select_all));
            this.g = false;
            return;
        }
        this.d.setPadding(0, 0, 0, 0);
        b().a(f.a.Normal);
        b().g();
    }

    public String i() {
        if (!this.l) {
            this.c = m().k().getCurDirFileList();
        }
        if (this.c != null && this.c.size() == 0) {
            return "";
        }
        long j = 0;
        int i = 0;
        int i2 = 0;
        for (X11FileInfo x11FileInfo : this.c) {
            int i3 = x11FileInfo.getName().endsWith(X11FileInfo.FILE_TYPE_MP4) ? i2 + 1 : i2;
            if (x11FileInfo.getName().endsWith(".jpg")) {
                i++;
            }
            j = (x11FileInfo.getSize() / FimiMediaMeta.AV_CH_SIDE_RIGHT) + j;
            i2 = i3;
        }
        double freeKBSpace = (double) (((float) m().i().getFreeKBSpace()) / 1048576.0f);
        double totalKBSpace = (double) (((float) m().i().getTotalKBSpace()) / 1048576.0f);
        return String.format(getActivity().getResources().getString(R.string.online_media_detail), new Object[]{i + "", i2 + "", t.a(freeKBSpace, 2) + "", t.a(totalKBSpace, 2) + ""});
    }

    protected ImageButton j() {
        return (ImageButton) o().a().findViewById(R.id.btn_bottomShare);
    }

    protected ImageButton k() {
        return (ImageButton) o().a().findViewById(R.id.btn_bottomDelete);
    }

    protected ImageButton l() {
        return (ImageButton) o().a().findViewById(R.id.btn_bottomDownload);
    }

    protected com.fimi.soul.biz.camera.d m() {
        if (this.f == null) {
            this.f = (com.fimi.soul.biz.camera.d) com.fimi.soul.biz.camera.b.a().d();
        }
        return this.f;
    }

    public void n() {
        this.d.setAdapter(this.a);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.i = ((DroidPlannerApp) activity.getApplication()).a;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_gridview, null);
        this.d = (MyGridView) inflate.findViewById(R.id.gv_content);
        if (this.a == null) {
            this.a = new f(getActivity(), this.d);
            this.a.a(a());
            this.a.a(this.i);
        }
        this.e = (TextView) inflate.findViewById(R.id.media_detail);
        ao.a(o().getAssets(), this.e);
        this.d.setAdapter(this.a);
        this.d.setOnItemLongClickListener(this);
        this.d.setOnItemClickListener(this.a);
        this.d.setOnScrollListener(new OnScrollListener(this) {
            final /* synthetic */ DroneBaseMediaFragment a;
            private int b;
            private int c;

            {
                this.a = r1;
            }

            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                this.b = i;
                this.c = i2;
                this.a.a.a(absListView, i, i2, i3);
            }

            public void onScrollStateChanged(AbsListView absListView, int i) {
                this.a.a.a(absListView, i);
                if (i == 1 && this.b == 0 && this.a.j && this.a.a.e() != f.a.Choose) {
                    if (!this.a.k) {
                        if (this.a.h) {
                            this.a.e.setText(this.a.i());
                        } else {
                            this.a.e.setText(this.a.h());
                        }
                        this.a.k = true;
                    }
                    this.a.e.setVisibility(0);
                } else {
                    this.a.e.setVisibility(8);
                }
                if (this.a.m().k().getCurDirFileList().size() > this.a.d.getCount() && this.b + this.c >= this.a.d.getCount() && i == 0) {
                    this.a.a(this.a.d);
                }
            }
        });
        this.d.setOnTouchListener(new OnTouchListener(this) {
            final /* synthetic */ DroneBaseMediaFragment a;

            {
                this.a = r1;
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                float y = motionEvent.getY();
                int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
                if (actionMasked == 2) {
                    if (this.a.b - y < 0.0f) {
                        this.a.j = true;
                    } else {
                        this.a.j = false;
                    }
                }
                if (actionMasked == 0) {
                    this.a.b = y;
                    this.a.k = false;
                }
                if (actionMasked == 1) {
                    this.a.b = 0.0f;
                }
                return false;
            }
        });
        this.a.a(new f.b(this) {
            final /* synthetic */ DroneBaseMediaFragment a;

            {
                this.a = r1;
            }

            public void a(int i) {
                this.a.g().setText(String.format(this.a.getActivity().getString(R.string.media_you_select_size), new Object[]{Integer.valueOf(i)}));
            }
        });
        c().setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ DroneBaseMediaFragment a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.h(false);
            }
        });
        f().setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ DroneBaseMediaFragment a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                if (this.a.g) {
                    this.a.b().g();
                    this.a.f().setText(R.string.select_all);
                } else {
                    this.a.f().setText(R.string.undo_select_all);
                    this.a.b().f();
                }
                this.a.g = !this.a.g;
            }
        });
        return inflate;
    }

    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        h(true);
        return false;
    }

    public void onResume() {
        super.onResume();
        if (!m().d()) {
            m().t().b();
        }
        m().a((d) this);
        m().a((e) this);
    }
}
