package com.fimi.soul.media.gallery;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import cn.sharesdk.framework.ShareSDK;
import com.fimi.kernel.b.b.b.d;
import com.fimi.kernel.b.b.c;
import com.fimi.kernel.b.b.c.b;
import com.fimi.kernel.utils.t;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.utils.z;
import com.fimi.kernel.view.progress.ProgressView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.a;
import com.fimi.soul.biz.camera.b.e;
import com.fimi.soul.biz.camera.entity.X11FileInfo;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.manager.p;
import com.fimi.soul.entity.ShareInfo;
import com.fimi.soul.entity.WifiDistanceFile;
import com.fimi.soul.media.player.FermiPlayerActivity;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.j;
import com.fimi.soul.view.HackyViewPager;
import com.fimi.soul.view.f;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DroneImagePagerActivity extends BaseActivity implements OnClickListener, d, b, e<X11RespCmd> {
    public static final String a = "image_index";
    public static final String b = "extra_type";
    public static final String c = "image_urls";
    public static final String d = "image_drone_media";
    public static final String e = "image_drone_local";
    public static final String f = "video_duration";
    private static final String l = "STATE_POSITION";
    private ImageButton A;
    private DroneImagePagerAdapter B;
    private c C;
    private com.fimi.kernel.b.b.b D;
    private ProgressView E;
    private p F;
    private Button G;
    private Button H;
    private TextView I;
    private TextView J;
    private TextView K;
    private int L;
    private List<WifiDistanceFile> M;
    public String g = "";
    public String h = "";
    v i;
    String j = a.P;
    String k = a.Q;
    private com.fimi.soul.biz.camera.d m;
    private boolean n = false;
    private HackyViewPager o;
    private int p;
    private TextView q;
    private View r;
    private View s;
    private View t;
    private boolean u = true;
    private ArrayList<String> v;
    private ArrayList<String> w;
    private ArrayList<String> x;
    private ImageButton y;
    private ImageButton z;

    private String a(int i) {
        String str = "";
        if (this.v == null || this.v.size() <= 0) {
            return str;
        }
        str = ((String) this.v.get(i)).toString();
        return str.contains("THUMB_") ? ((String) this.v.get(i)).substring(((String) this.v.get(i)).lastIndexOf("/") + 1).replace("THUMB_", "") : str.contains("_THM") ? ((String) this.v.get(i)).substring(((String) this.v.get(i)).lastIndexOf("/") + 1).replace("_THM", "") : ((String) this.v.get(i)).substring(((String) this.v.get(i)).lastIndexOf("/") + 1);
    }

    private void a() {
        this.q = (TextView) this.s.findViewById(R.id.tv_pageName);
        this.q.setVisibility(0);
        ao.a(getAssets(), this.q);
        this.p = getIntent().getIntExtra("image_index", 0);
        this.o = (HackyViewPager) findViewById(R.id.pager);
        if (this.n) {
            this.B = new DroneImagePagerAdapter(getSupportFragmentManager(), this.v, this.w);
        } else {
            this.B = new DroneImagePagerAdapter(getSupportFragmentManager(), this.v);
        }
        this.B.a(this.o);
        this.B.a(new com.fimi.soul.view.photodraweeview.d(this) {
            final /* synthetic */ DroneImagePagerActivity a;

            {
                this.a = r1;
            }

            public void a(View view, float f, float f2) {
                this.a.D = this.a.C.a(this.a, this.a.h());
                if (this.a.D == null) {
                    this.a.u = !this.a.u;
                    this.a.c(this.a.u);
                    this.a.b(this.a.u);
                }
            }
        });
        this.o.setAdapter(this.B);
        this.o.setOnPageChangeListener(new OnPageChangeListener(this) {
            final /* synthetic */ DroneImagePagerActivity a;

            {
                this.a = r1;
            }

            public void onPageScrollStateChanged(int i) {
            }

            public void onPageScrolled(int i, float f, int i2) {
                Log.v("mPager", "arg0=" + i);
                if (i2 == 0 && ((double) f) == 0.0d && this.a.B.a(i) != null) {
                    this.a.B.a(i).b();
                }
            }

            public void onPageSelected(int i) {
                this.a.u = true;
                Object a = this.a.a(i);
                this.a.q.setText(a);
                this.a.b();
                if (a.endsWith(X11FileInfo.FILE_TYPE_MP4)) {
                    this.a.A.setVisibility(0);
                } else {
                    this.a.A.setVisibility(8);
                }
                this.a.f();
            }
        });
        this.o.setCurrentItem(this.p);
        this.q.setText(a(this.p));
    }

    private void b() {
        View findViewById = this.r.findViewById(R.id.ll_bottomDownload);
        View findViewById2 = this.r.findViewById(R.id.ll_bottomShare);
        this.y = (ImageButton) this.s.findViewById(R.id.btn_back);
        this.z = (ImageButton) this.r.findViewById(R.id.btn_bottomDownload);
        ImageButton imageButton = (ImageButton) this.r.findViewById(R.id.btn_bottomShare);
        ImageButton imageButton2 = (ImageButton) this.r.findViewById(R.id.btn_bottomDelete);
        this.G.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ DroneImagePagerActivity a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                String b = j.b(this.a.g());
                if (this.a.D != null && this.a.D.g() != com.fimi.kernel.b.b.b.a.Completed) {
                    File file = new File(b.replace("file://", ""));
                    if (file.exists()) {
                        file.delete();
                    }
                    this.a.o.setScrollble(true);
                    this.a.C.a(this.a.D);
                    this.a.c(false);
                    this.a.a(false);
                    this.a.b(false);
                    this.a.b();
                }
            }
        });
        this.H.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ DroneImagePagerActivity a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                if (this.a.D != null) {
                    this.a.D.c();
                    this.a.H.setVisibility(8);
                    this.a.G.setVisibility(0);
                }
            }
        });
        if (this.n && !com.fimi.soul.biz.camera.b.c(g())) {
            findViewById2.setVisibility(8);
            findViewById.setVisibility(0);
            c(true);
            b(true);
            this.z.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ DroneImagePagerActivity a;

                {
                    this.a = r1;
                }

                public void onClick(View view) {
                    if (this.a.i.a().getBoolean(this.a.j, false)) {
                        this.a.d();
                    } else {
                        this.a.c();
                    }
                }
            });
            imageButton2.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ DroneImagePagerActivity a;

                {
                    this.a = r1;
                }

                public void onClick(View view) {
                    new f.a(this.a).a(this.a.getString(R.string.ensure_delete_file)).a(this.a.getResources().getColor(R.color.dialog_ensure_hot)).b(this.a.getString(R.string.delete), new DialogInterface.OnClickListener(this) {
                        final /* synthetic */ AnonymousClass12 a;

                        {
                            this.a = r1;
                        }

                        public void onClick(DialogInterface dialogInterface, int i) {
                            this.a.a.m.s().c(((WifiDistanceFile) this.a.a.M.get(this.a.a.o.getCurrentItem())).getAbsolutePath());
                        }
                    }).a(this.a.getString(R.string.cancel), new DialogInterface.OnClickListener(this) {
                        final /* synthetic */ AnonymousClass12 a;

                        {
                            this.a = r1;
                        }

                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    }).a().show();
                }
            });
        } else if (this.n && com.fimi.soul.biz.camera.b.c(g())) {
            this.t.setVisibility(8);
            r4 = g();
            Log.i("Good", "urlString:" + r4);
            if (r4.endsWith(X11FileInfo.FILE_TYPE_MP4)) {
                findViewById2.setVisibility(8);
            } else {
                findViewById2.setVisibility(0);
            }
            findViewById.setVisibility(8);
            imageButton.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ DroneImagePagerActivity a;

                {
                    this.a = r1;
                }

                public void onClick(View view) {
                    if (ao.b(this.a)) {
                        this.a.e();
                    } else {
                        z.a(this.a, (int) R.string.login_result_net, 1000);
                    }
                }
            });
            imageButton2.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ DroneImagePagerActivity a;

                {
                    this.a = r1;
                }

                public void onClick(View view) {
                    new f.a(this.a).a(this.a.getString(R.string.ensure_delete_file)).a(this.a.getResources().getColor(R.color.dialog_ensure_hot)).b(this.a.getString(R.string.delete), new DialogInterface.OnClickListener(this) {
                        final /* synthetic */ AnonymousClass14 a;

                        {
                            this.a = r1;
                        }

                        public void onClick(DialogInterface dialogInterface, int i) {
                            this.a.a.m.s().c(((WifiDistanceFile) this.a.a.M.get(this.a.a.o.getCurrentItem())).getAbsolutePath());
                        }
                    }).a(this.a.getString(R.string.cancel), new DialogInterface.OnClickListener(this) {
                        final /* synthetic */ AnonymousClass14 a;

                        {
                            this.a = r1;
                        }

                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    }).a().show();
                }
            });
        } else {
            r4 = h();
            Log.i("Good", "urlString:" + r4);
            if (r4.endsWith(X11FileInfo.FILE_TYPE_MP4)) {
                findViewById2.setVisibility(8);
            } else {
                findViewById2.setVisibility(0);
            }
            findViewById.setVisibility(8);
            b(true);
            c(true);
            imageButton.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ DroneImagePagerActivity a;

                {
                    this.a = r1;
                }

                public void onClick(View view) {
                    if (ao.b(this.a)) {
                        this.a.e();
                    } else {
                        z.a(this.a, (int) R.string.login_result_net, 1000);
                    }
                }
            });
            imageButton2.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ DroneImagePagerActivity a;

                {
                    this.a = r1;
                }

                public void onClick(View view) {
                    new f.a(this.a).a(this.a.getString(R.string.ensure_delete_file)).a(this.a.getResources().getColor(R.color.dialog_ensure_hot)).b(this.a.getString(R.string.delete), new DialogInterface.OnClickListener(this) {
                        final /* synthetic */ AnonymousClass3 a;

                        {
                            this.a = r1;
                        }

                        public void onClick(DialogInterface dialogInterface, int i) {
                            File file = new File(this.a.a.h().replace("file://", ""));
                            if (file.isFile() && file.exists()) {
                                file.delete();
                            }
                            Intent intent = new Intent();
                            intent.putExtra("del_file", this.a.a.h());
                            this.a.a.setResult(1, intent);
                            this.a.a.finish();
                        }
                    }).a(this.a.getString(R.string.cancel), new DialogInterface.OnClickListener(this) {
                        final /* synthetic */ AnonymousClass3 a;

                        {
                            this.a = r1;
                        }

                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    }).a().show();
                }
            });
        }
        this.y.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ DroneImagePagerActivity a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.finish();
            }
        });
    }

    private void c() {
        String b = j.b(g());
        this.r.setVisibility(8);
        this.t.setVisibility(0);
        this.I.setText(String.format(getString(R.string.download_file_phone), new Object[]{g()}));
        this.J.setText("0%");
        this.K.setText("0.00 KB/s");
        this.E.setMaxCount((float) ((WifiDistanceFile) this.M.get(this.o.getCurrentItem())).getSize());
        this.E.setCurrentCount(0.0f);
        this.C.a(h(), (String) this.x.get(this.o.getCurrentItem()), ((WifiDistanceFile) this.M.get(this.o.getCurrentItem())).getSize(), Boolean.valueOf(false), b);
        this.C.a((b) this);
    }

    private void d() {
        new com.fimi.soul.view.b().a((Context) this, getString(R.string.download_delete_file), getString(R.string.cancel), getString(R.string.delete), Boolean.valueOf(false), getString(R.string.remerber_me_choose), new com.fimi.kernel.view.dialog.a(this) {
            final /* synthetic */ DroneImagePagerActivity a;

            {
                this.a = r1;
            }

            public void a(int i) {
            }

            public void a(int i, Boolean bool) {
                if (i == -2) {
                    if (bool.booleanValue()) {
                        this.a.i.a().edit().putBoolean(this.a.j, false).commit();
                        this.a.i.a().edit().putBoolean(this.a.k, false).commit();
                    } else {
                        this.a.i.a().edit().putBoolean(this.a.j, true).commit();
                        this.a.i.a().edit().putBoolean(this.a.k, false).commit();
                    }
                } else if (i == -1) {
                    if (bool.booleanValue()) {
                        this.a.i.a().edit().putBoolean(this.a.j, false).commit();
                        this.a.i.a().edit().putBoolean(this.a.k, true).commit();
                    } else {
                        this.a.i.a().edit().putBoolean(this.a.j, true).commit();
                        this.a.i.a().edit().putBoolean(this.a.k, true).commit();
                    }
                }
                this.a.c();
            }
        });
    }

    private void e() {
        ShareInfo shareInfo = new ShareInfo();
        if (this.n) {
            shareInfo.setUrl(com.fimi.soul.biz.camera.b.d(g()));
        } else {
            shareInfo.setUrl(((String) this.v.get(this.o.getCurrentItem())).replace("file://", ""));
        }
        this.F.a(new p.b(this) {
            final /* synthetic */ DroneImagePagerActivity a;

            {
                this.a = r1;
            }

            public void a(int i) {
                this.a.o.setDrawingCacheEnabled(false);
            }
        });
        this.F.a(shareInfo);
    }

    private void f() {
        a(false);
        this.C = c.a(getApplicationContext());
        this.C.a((b) this);
        this.D = this.C.a((Context) this, h());
        long i;
        long k;
        if (this.D != null && (this.D.g() == com.fimi.kernel.b.b.b.a.Wait || this.D.g() == com.fimi.kernel.b.b.b.a.Downloading)) {
            a(true);
            this.H.setVisibility(4);
            this.G.setVisibility(0);
            i = this.D.i();
            k = this.D.k();
            this.E.setMaxCount((float) i);
            this.E.setCurrentCount((float) k);
            this.I.setText(String.format(getString(R.string.download_file_phone), new Object[]{g()}));
            this.J.setText((k / (i / 100)) + "%");
            this.K.setText("0.00 KB/s");
            this.D.a((d) this);
        } else if (this.D == null) {
        } else {
            if (this.D.g() == com.fimi.kernel.b.b.b.a.Pause || this.D.g() == com.fimi.kernel.b.b.b.a.Error) {
                a(true);
                this.H.setVisibility(0);
                this.G.setVisibility(8);
                i = this.D.i();
                k = this.D.k();
                this.E.setMaxCount((float) i);
                this.E.setCurrentCount((float) k);
                this.I.setText(String.format(getString(R.string.download_file_phone), new Object[]{g()}));
                this.J.setText((k / (i / 100)) + "%");
                this.K.setText("");
                this.D.a((d) this);
            }
        }
    }

    private String g() {
        return a(this.o.getCurrentItem());
    }

    private String h() {
        String str = (String) this.v.get(this.o.getCurrentItem());
        return str.contains("&&") ? str.split("&&")[1] : str;
    }

    private void i() {
        for (int i = 0; i < this.v.size(); i++) {
            if (com.fimi.soul.biz.camera.b.b(a(i))) {
                String format = String.format("file://%s", new Object[]{com.fimi.soul.biz.camera.b.e(a(i))});
                Log.d("Good", "Downloaded:" + format);
                this.v.set(i, format);
            }
        }
    }

    public void a(com.fimi.kernel.b.b.b.a aVar, com.fimi.kernel.b.b.b bVar) {
        if (!this.n || !bVar.h().equals(j.b(g()))) {
            return;
        }
        if (aVar == com.fimi.kernel.b.b.b.a.Completed) {
            a(false);
            this.o.setScrollble(true);
            b();
            this.E.setCurrentCount(0.0f);
            this.I.setText("0%");
            if (this.i.a().getBoolean(this.k, false)) {
                this.m.s().c(g());
            }
            c.a((Context) this).a(this.D);
            return;
        }
        this.E.setMaxCount((float) bVar.i());
        this.E.setCurrentCount((float) bVar.k());
        long l = bVar.l();
        if (l >= 0 && l < 102400) {
            this.K.setText(t.b((double) ((float) (l / FimiMediaMeta.AV_CH_SIDE_RIGHT)), 2) + " KB/s");
        } else if (l >= 102400 && l < 1024000) {
            this.K.setText(((long) ((int) (l / FimiMediaMeta.AV_CH_SIDE_RIGHT))) + " KB/s");
        } else if (l >= 1024000) {
            this.K.setText(t.b((double) (((float) l) / 1048576.0f), 2) + " MB/s");
        }
        this.J.setText((bVar.k() / (bVar.i() / 100)) + "%");
    }

    public void a(List<com.fimi.kernel.b.b.b> list, boolean z, com.fimi.kernel.b.b.b bVar) {
        if (bVar != null) {
            this.D = bVar;
            if (!isFinishing()) {
                this.D.a((d) this);
            }
        }
    }

    protected void a(boolean z) {
        if (z) {
            this.r.setVisibility(8);
            this.t.setVisibility(0);
            return;
        }
        this.r.setVisibility(0);
        this.t.setVisibility(4);
    }

    public void a(boolean z, X11RespCmd x11RespCmd) {
        if (z && this.n) {
            switch (x11RespCmd.getMsg_id()) {
                case com.fimi.soul.biz.camera.e.R /*1281*/:
                    if (this.w.get(this.o.getCurrentItem()) != null) {
                        File file = new File(((String) this.w.get(this.o.getCurrentItem())).replace("file://", ""));
                        if (file.exists()) {
                            file.delete();
                        }
                    }
                    this.m.a(true);
                    Intent intent = new Intent();
                    Bundle bundle = new Bundle();
                    if (this.M.size() > this.o.getCurrentItem()) {
                        bundle.putSerializable(a.O, (Serializable) this.M.get(this.o.getCurrentItem()));
                    }
                    intent.putExtras(bundle);
                    setResult(2, intent);
                    finish();
                    return;
                default:
                    return;
            }
        } else if (!z && this.n) {
            switch (x11RespCmd.getMsg_id()) {
                case com.fimi.soul.biz.camera.e.R /*1281*/:
                    z.a((Context) this, getResources().getString(R.string.del_fail), z.b);
                    return;
                default:
                    return;
            }
        }
    }

    protected void b(boolean z) {
        this.r.setVisibility(z ? 0 : 8);
    }

    protected void c(boolean z) {
        this.s.setVisibility(z ? 0 : 8);
    }

    public void finish() {
        overridePendingTransition(17432576, 17432577);
        super.finish();
    }

    public void onClick(View view) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_image_pager);
        ShareSDK.initSDK(this);
        this.A = (ImageButton) findViewById(R.id.playButton);
        getWindow().setFlags(128, 128);
        this.m = (com.fimi.soul.biz.camera.d) com.fimi.soul.biz.camera.b.a().d();
        this.m.a((e) this);
        findViewById(R.id.prll_tab_top).setBackgroundResource(R.color.light_black_80);
        findViewById(R.id.ll_progressBottom).setBackgroundResource(R.color.light_black_80);
        this.s = findViewById(R.id.rl_tab_top);
        this.s.setOnClickListener(this);
        this.r = findViewById(R.id.ll_actionBottom);
        this.r.setOnClickListener(this);
        this.r.setBackgroundResource(R.drawable.title_bottom_share_bg);
        this.t = findViewById(R.id.ll_progressBottom);
        this.I = (TextView) findViewById(R.id.file_name_tv);
        this.J = (TextView) findViewById(R.id.file_percent_tv);
        this.K = (TextView) findViewById(R.id.down_speed);
        this.G = (Button) findViewById(R.id.btn_cancel);
        this.H = (Button) findViewById(R.id.btn_start);
        ao.a(getAssets(), this.G, this.H, this.I, this.J, this.K);
        this.E = (ProgressView) this.t.findViewById(R.id.pv_progress);
        this.E.setFrontColor(-42978);
        this.M = com.fimi.soul.b.f.a;
        this.v = getIntent().getStringArrayListExtra("image_urls");
        this.w = getIntent().getStringArrayListExtra(e);
        this.n = getIntent().getBooleanExtra(d, false);
        this.x = getIntent().getStringArrayListExtra(f);
        if (getIntent().getIntExtra(b, 1) == 2) {
            this.A.setVisibility(0);
        } else {
            this.A.setVisibility(8);
        }
        if (bundle != null) {
            this.p = bundle.getInt(l);
        }
        this.F = new p(this);
        a();
        b();
        f();
        this.A.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ DroneImagePagerActivity a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.h = (String) this.a.v.get(this.a.o.getCurrentItem());
                if (this.a.w != null) {
                    this.a.g = (String) this.a.w.get(this.a.o.getCurrentItem());
                }
                Intent intent = new Intent(this.a, FermiPlayerActivity.class);
                if (this.a.h != null) {
                    intent.putExtra("SP_KEY_PLAYER_ADDR_VideoDialogFragment", this.a.h.split("&&")[0]);
                } else {
                    intent.putExtra("SP_KEY_PLAYER_ADDR_VideoDialogFragment", this.a.w);
                }
                intent.putExtra(FermiPlayerActivity.SP_KEY_PLAYER_IS_REMOTE_ADDR, this.a.g);
                intent.putExtra(FermiPlayerActivity.PLAY_NOW, true);
                intent.putExtra(FermiPlayerActivity.ONLINEFILE, this.a.n);
                this.a.startActivity(intent);
            }
        });
    }

    protected void onResume() {
        super.onResume();
        if (this.D == null || this.D.g() != com.fimi.kernel.b.b.b.a.Pause) {
            this.H.setVisibility(8);
            this.G.setVisibility(0);
            return;
        }
        this.H.setVisibility(0);
        this.G.setVisibility(8);
        long i = this.D.i();
        long k = this.D.k();
        this.E.setMaxCount((float) i);
        this.E.setCurrentCount((float) k);
        this.I.setText(String.format(getString(R.string.download_file_phone), new Object[]{g()}));
        this.J.setText((k / (i / 100)) + "%");
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(l, this.o.getCurrentItem());
    }

    protected void onStart() {
        super.onStart();
        this.i = v.a((Context) this);
    }
}
