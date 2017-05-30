package com.fimi.soul.b;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.kernel.utils.g;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.utils.z;
import com.fimi.kernel.view.button.SwitchButton;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.camera.b.e;
import com.fimi.soul.biz.camera.d;
import com.fimi.soul.biz.camera.entity.X11DeviceInfo;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.j;
import java.io.File;

public class b extends BaseAdapter implements OnItemClickListener, e<X11RespCmd> {
    private static final float a = 0.064f;
    private Context b;
    private d c;
    private int d;
    private int e;
    private int f;
    private boolean g = false;
    private String h;
    private String i;
    private X11DeviceInfo j;
    private boolean k = true;
    private boolean l = false;
    private boolean m = false;
    private com.fimi.soul.drone.a n;
    private SharedPreferences o;

    private class a {
        TextView a;
        TextView b;
        ImageView c;
        RelativeLayout d;
        SwitchButton e;
        final /* synthetic */ b f;

        private a(b bVar) {
            this.f = bVar;
        }

        public View a(ViewGroup viewGroup) {
            View inflate = LayoutInflater.from(this.f.b).inflate(R.layout.item_setting, viewGroup, false);
            this.d = (RelativeLayout) inflate.findViewById(R.id.rl);
            this.a = (TextView) inflate.findViewById(R.id.setting_title_tv);
            this.c = (ImageView) inflate.findViewById(R.id.setting_arrow);
            this.b = (TextView) inflate.findViewById(R.id.settig_coontent_tv);
            this.e = (SwitchButton) inflate.findViewById(R.id.switch_btn);
            ao.a(this.f.b.getAssets(), this.a, this.b);
            return inflate;
        }

        public void a(boolean z) {
            this.d.setClickable(z);
        }
    }

    enum b {
        RECORD_TITLE,
        INDEX_RECORD_1080P_60,
        INDEX_RECORD_1080P_30,
        INDEX_RECORD_720P,
        VOLUME_RECORD_TITLE,
        VOLUME_RECORD_CONTENT,
        IMAGE_TITLE,
        INDEX_PHOTO_4V3_16M,
        INDEX_PHOTO_16V9_12M,
        INDEX_PHOTO_4V3_8M,
        GRID_TITLE,
        GRID_CONTENT,
        TFCARD_TITLE,
        TFCARD_CONTENT,
        BOTTOM_ITEM
    }

    enum c {
        RECORD_TITLE,
        INDEX_RECORD_2160P_30P_4K,
        INDEX_RECORD_1440P_60P_4K,
        INDEX_RECORD_1080P_100P_4K,
        INDEX_RECORD_1080P_60P_4K,
        INDEX_RECORD_1080P_30P_4K,
        IMAGE_TITLE,
        INDEX_PHOTO_4V3_12M_4K,
        INDEX_PHOTO_16V9_8M_4K,
        IMAGE_FORMAT_TITLE,
        IMAGE_JPG,
        IMAGE_RAW,
        GRID_TITLE,
        GRID_CONTENT,
        TFCARD_TITLE,
        TFCARD_CONTENT,
        BOTTOM_ITEM
    }

    public b(Context context, com.fimi.soul.drone.a aVar) {
        this.n = aVar;
        this.b = context;
        this.c = (d) com.fimi.soul.biz.camera.b.a().d();
        this.j = this.c.i().getX11DeviceInfo();
        this.g = com.fimi.soul.biz.camera.b.a().c();
        this.o = v.a(context).a();
        a();
        c();
    }

    private void a(a aVar) {
        if (this.l) {
            aVar.e.a(true, false);
        } else {
            aVar.e.a(false, false);
        }
        aVar.e.setVisibility(0);
        aVar.b.setVisibility(0);
        aVar.b.setText(R.string.vedio_recording_audio);
        aVar.e.setOnSwitchListener(new com.fimi.kernel.view.button.SwitchButton.a(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public void a(View view, boolean z) {
                SwitchButton switchButton = (SwitchButton) view.findViewById(R.id.switch_btn);
                if (!this.a.d()) {
                    z.a(this.a.b, this.a.b.getString(R.string.set_fail_no_connect_camera), z.b);
                    if (this.a.l) {
                        switchButton.a(true, false);
                    } else {
                        switchButton.a(false, false);
                    }
                } else if (this.a.d()) {
                    if (this.a.l) {
                        this.a.l = false;
                        switchButton.a(false, true);
                        this.a.i = com.fimi.soul.biz.camera.e.cp;
                    } else {
                        this.a.l = true;
                        switchButton.a(true, true);
                        this.a.i = com.fimi.soul.biz.camera.e.cq;
                    }
                    this.a.h = com.fimi.soul.biz.camera.e.bQ;
                    if (this.a.k) {
                        this.a.c.r().f();
                    }
                } else {
                    z.a(this.a.b, this.a.b.getString(R.string.set_fail_no_connect_camera), z.b);
                    if (this.a.l) {
                        switchButton.a(true, false);
                    } else {
                        switchButton.a(false, false);
                    }
                }
            }
        });
    }

    private void a(a aVar, LayoutParams layoutParams) {
        aVar.a.setVisibility(8);
        aVar.e.setVisibility(8);
        aVar.d.setBackgroundResource(0);
        aVar.b.setTextColor(this.b.getResources().getColor(R.color.white));
        aVar.b.setAlpha(1.0f);
        aVar.c.setVisibility(8);
        aVar.e.setOnSwitchListener(null);
        layoutParams.height = (int) this.b.getResources().getDimension(R.dimen.setting_adapt_height);
        aVar.d.setLayoutParams(layoutParams);
    }

    private void a(a aVar, String str) {
        aVar.a.setVisibility(0);
        aVar.b.setVisibility(0);
        aVar.a.setText(str);
        aVar.b.setVisibility(4);
        aVar.d.setBackgroundResource(R.color.list_nomal);
        aVar.a(true);
    }

    private void a(a aVar, String str, boolean z) {
        aVar.b.setVisibility(0);
        aVar.b.setText(str);
        if (z) {
            aVar.b.setTextColor(this.b.getResources().getColor(R.color.option_choose));
            aVar.c.setVisibility(0);
        } else {
            aVar.b.setTextColor(this.b.getResources().getColor(R.color.white_90));
            aVar.c.setVisibility(4);
        }
        aVar.a(false);
    }

    private void b(a aVar) {
        this.m = this.o.getBoolean(com.fimi.soul.drone.g.c.bM, false);
        if (this.m) {
            aVar.e.a(true, false);
        } else {
            aVar.e.a(false, false);
        }
        aVar.e.setVisibility(0);
        aVar.b.setVisibility(0);
        aVar.b.setText(R.string.grid_line_set);
        aVar.e.setOnSwitchListener(new com.fimi.kernel.view.button.SwitchButton.a(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public void a(View view, boolean z) {
                SwitchButton switchButton = (SwitchButton) view.findViewById(R.id.switch_btn);
                if (z) {
                    this.a.o.edit().putBoolean(com.fimi.soul.drone.g.c.bM, true).commit();
                    this.a.n.a(com.fimi.soul.drone.d.a.Show9Grid);
                    this.a.m = true;
                    switchButton.setSwitchState(true);
                    return;
                }
                this.a.o.edit().putBoolean(com.fimi.soul.drone.g.c.bM, false).commit();
                this.a.n.a(com.fimi.soul.drone.d.a.hide9Grid);
                this.a.m = false;
                switchButton.setSwitchState(false);
            }
        });
    }

    private void b(a aVar, LayoutParams layoutParams) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) this.b).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        layoutParams.height = displayMetrics.heightPixels * 0;
        aVar.d.setLayoutParams(layoutParams);
        aVar.d.setBackgroundResource(R.color.list_nomal);
    }

    private void b(a aVar, String str, boolean z) {
        aVar.b.setVisibility(0);
        aVar.e.setVisibility(0);
        aVar.b.setText(str);
        aVar.e.setSwitchState(z);
    }

    private void c() {
        CharSequence videoResolution = this.c.i().getVideoResolution();
        CharSequence photoSize = this.c.i().getPhotoSize();
        String image_format = this.c.i().getImage_format();
        if (videoResolution != null) {
            if (videoResolution != null) {
                videoResolution = videoResolution.trim();
            }
            if (photoSize != null) {
                photoSize = photoSize.trim();
            }
            if (this.k) {
                if ("1920x1080 30P 16:9".contains(videoResolution)) {
                    this.e = b.INDEX_RECORD_1080P_30.ordinal();
                }
                if ("1920x1080 60P 16:9".contains(videoResolution)) {
                    this.e = b.INDEX_RECORD_1080P_60.ordinal();
                }
                if (com.fimi.soul.biz.camera.e.bV.contains(videoResolution)) {
                    this.e = b.INDEX_RECORD_720P.ordinal();
                }
                if (photoSize != null) {
                    if (com.fimi.soul.biz.camera.e.bX.contains(photoSize)) {
                        this.d = b.INDEX_PHOTO_16V9_12M.ordinal();
                    }
                    if (com.fimi.soul.biz.camera.e.bW.contains(photoSize)) {
                        this.d = b.INDEX_PHOTO_4V3_16M.ordinal();
                    }
                    if (com.fimi.soul.biz.camera.e.bY.contains(photoSize)) {
                        this.d = b.INDEX_PHOTO_4V3_8M.ordinal();
                    }
                }
            } else {
                if (com.fimi.soul.biz.camera.e.ce.contains(videoResolution)) {
                    this.e = c.INDEX_RECORD_2160P_30P_4K.ordinal();
                }
                if (com.fimi.soul.biz.camera.e.bZ.contains(videoResolution)) {
                    this.e = c.INDEX_RECORD_1440P_60P_4K.ordinal();
                }
                if ("1920x1080 30P 16:9".contains(videoResolution)) {
                    this.e = c.INDEX_RECORD_1080P_30P_4K.ordinal();
                }
                if ("1920x1080 60P 16:9".contains(videoResolution)) {
                    this.e = c.INDEX_RECORD_1080P_60P_4K.ordinal();
                }
                if (com.fimi.soul.biz.camera.e.cd.contains(videoResolution)) {
                    this.e = c.INDEX_RECORD_1080P_100P_4K.ordinal();
                }
                if (photoSize != null) {
                    if (com.fimi.soul.biz.camera.e.cf.contains(photoSize)) {
                        this.d = c.INDEX_PHOTO_4V3_12M_4K.ordinal();
                    }
                    if (com.fimi.soul.biz.camera.e.cg.contains(photoSize)) {
                        this.d = c.INDEX_PHOTO_16V9_8M_4K.ordinal();
                    }
                }
                if (!(image_format == null || "".equals(image_format))) {
                    if (com.fimi.soul.biz.camera.e.ch.equals(image_format)) {
                        this.f = c.IMAGE_JPG.ordinal();
                    }
                    if (com.fimi.soul.biz.camera.e.ci.equals(image_format)) {
                        this.f = c.IMAGE_RAW.ordinal();
                    }
                }
            }
            if (com.fimi.soul.biz.camera.e.cp.equals(this.c.i().getVideoMode())) {
                this.l = false;
            } else {
                this.l = true;
            }
        }
    }

    private boolean d() {
        return this.c.d();
    }

    public void a() {
        if (com.fimi.soul.biz.e.d.a().k()) {
            this.k = false;
        } else {
            this.k = true;
        }
        this.c.r().b();
    }

    public void a(boolean z, X11RespCmd x11RespCmd) {
        switch (x11RespCmd.getMsg_id()) {
            case 2:
                if (!z) {
                    z.a(this.b, this.b.getString(R.string.setting_false), z.c);
                    com.fimi.kernel.c.b().c();
                    return;
                } else if (!com.fimi.soul.biz.camera.e.by.equals(x11RespCmd.getType())) {
                    z.a(this.b, this.b.getString(R.string.set_success), z.c);
                    this.c.r().b();
                    return;
                } else {
                    return;
                }
            case 3:
                com.fimi.kernel.c.b().c();
                c();
                notifyDataSetChanged();
                return;
            case 4:
                if (z) {
                    g.b(new File(j.n()));
                    z.a(this.b, this.b.getString(R.string.format_success), z.c);
                    this.c.r().c(com.fimi.soul.biz.camera.e.cy);
                    this.c.a(true);
                } else {
                    z.a(this.b, this.b.getString(R.string.format_fail), z.c);
                }
                com.fimi.kernel.c.b().c();
                return;
            case 11:
                this.c.r().b();
                return;
            case 257:
                if (!z) {
                    com.fimi.kernel.c.b().c();
                    z.a(this.b, this.b.getString(R.string.camera_connect_state_fail), z.c);
                    return;
                }
                return;
            case 260:
                this.c.r().a(this.h, this.i);
                com.fimi.kernel.c.b().a();
                if (this.j.getChip() == null) {
                    this.c.r().d();
                    return;
                }
                return;
            case com.fimi.soul.biz.camera.e.ah /*10066329*/:
                com.fimi.kernel.c.b().c();
                return;
            default:
                return;
        }
    }

    public void b() {
        if (this.c != null) {
            this.c.a((e) this);
            if (com.fimi.soul.biz.e.d.a().m() && !this.c.d()) {
                com.fimi.kernel.c.b().a();
                this.c.t().b();
            }
        }
    }

    public int getCount() {
        return this.k ? b.values().length : c.values().length;
    }

    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        boolean z = true;
        if (view == null) {
            aVar = new a();
            view = aVar.a(viewGroup);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        a(aVar, view.getLayoutParams());
        String string;
        LayoutParams layoutParams;
        if (this.k) {
            if (i == b.RECORD_TITLE.ordinal()) {
                a(aVar, this.b.getString(R.string.record_title));
            }
            if (i == b.INDEX_RECORD_1080P_30.ordinal()) {
                a(aVar, this.b.getString(R.string.option_video_1080_30f), this.e == b.INDEX_RECORD_1080P_30.ordinal());
            }
            if (i == b.INDEX_RECORD_1080P_60.ordinal()) {
                a(aVar, this.b.getString(R.string.option_video_1080p_60), this.e == b.INDEX_RECORD_1080P_60.ordinal());
            }
            if (i == b.INDEX_RECORD_720P.ordinal()) {
                a(aVar, "1280x720", this.e == b.INDEX_RECORD_720P.ordinal());
            }
            if (i == b.IMAGE_TITLE.ordinal()) {
                a(aVar, this.b.getString(R.string.photo));
            }
            if (i == b.INDEX_PHOTO_4V3_16M.ordinal()) {
                a(aVar, this.b.getString(R.string.option_photo_16M), this.d == b.INDEX_PHOTO_4V3_16M.ordinal());
            }
            if (i == b.INDEX_PHOTO_16V9_12M.ordinal()) {
                a(aVar, this.b.getString(R.string.option_photo_12M), this.d == b.INDEX_PHOTO_16V9_12M.ordinal());
            }
            if (i == b.INDEX_PHOTO_4V3_8M.ordinal()) {
                string = this.b.getString(R.string.option_photo_8M);
                if (this.d != b.INDEX_PHOTO_4V3_8M.ordinal()) {
                    z = false;
                }
                a(aVar, string, z);
            }
            if (i == b.TFCARD_TITLE.ordinal()) {
                a(aVar, this.b.getString(R.string.sdcard_operation));
            }
            if (i == b.TFCARD_CONTENT.ordinal()) {
                aVar.b.setVisibility(0);
                aVar.b.setText(this.b.getString(R.string.camera_sd_format));
                aVar.b.setTextColor(this.b.getResources().getColor(R.color.white_90));
            }
            if (i == b.VOLUME_RECORD_TITLE.ordinal()) {
                a(aVar, this.b.getString(R.string.audio_title));
            }
            if (i == b.VOLUME_RECORD_CONTENT.ordinal()) {
                a(aVar);
            }
            if (i == b.BOTTOM_ITEM.ordinal()) {
                layoutParams = view.getLayoutParams();
                layoutParams.height = (int) this.b.getResources().getDimension(R.dimen.setting_adapt_bottom);
                aVar.d.setLayoutParams(layoutParams);
                aVar.d.setBackgroundResource(R.color.list_nomal);
                aVar.a.setVisibility(8);
                aVar.e.setVisibility(8);
                aVar.c.setVisibility(8);
                aVar.b.setVisibility(8);
                aVar.a(false);
            }
            if (i == b.GRID_TITLE.ordinal()) {
                a(aVar, this.b.getString(R.string.grid_lines));
            }
            if (i == b.GRID_CONTENT.ordinal()) {
                b(aVar);
                aVar.e.setTag(Integer.valueOf(b.GRID_CONTENT.ordinal()));
            }
        } else {
            if (i == c.RECORD_TITLE.ordinal()) {
                a(aVar, this.b.getString(R.string.record_title));
            }
            if (i == c.INDEX_RECORD_1440P_60P_4K.ordinal()) {
                a(aVar, this.b.getString(R.string.option_video_1440p_60_4k), this.e == c.INDEX_RECORD_1440P_60P_4K.ordinal());
            }
            if (i == c.INDEX_RECORD_1080P_30P_4K.ordinal()) {
                a(aVar, this.b.getString(R.string.option_video_1080p_30_4k), this.e == c.INDEX_RECORD_1080P_30P_4K.ordinal());
            }
            if (i == c.INDEX_RECORD_1080P_60P_4K.ordinal()) {
                a(aVar, this.b.getString(R.string.option_video_1080p_60_4k), this.e == c.INDEX_RECORD_1080P_60P_4K.ordinal());
            }
            if (i == c.INDEX_RECORD_1080P_100P_4K.ordinal()) {
                a(aVar, this.b.getString(R.string.option_video_1080p_100_4k), this.e == c.INDEX_RECORD_1080P_100P_4K.ordinal());
            }
            if (i == c.INDEX_RECORD_2160P_30P_4K.ordinal()) {
                a(aVar, this.b.getString(R.string.option_video_2160p_30_4k), this.e == c.INDEX_RECORD_2160P_30P_4K.ordinal());
            }
            if (i == c.IMAGE_TITLE.ordinal()) {
                a(aVar, this.b.getString(R.string.photo));
            }
            if (i == c.INDEX_PHOTO_4V3_12M_4K.ordinal()) {
                a(aVar, this.b.getString(R.string.option_photo_12M_4k), this.d == c.INDEX_PHOTO_4V3_12M_4K.ordinal());
            }
            if (i == c.INDEX_PHOTO_16V9_8M_4K.ordinal()) {
                a(aVar, this.b.getString(R.string.option_photo_8M_4k), this.d == c.INDEX_PHOTO_16V9_8M_4K.ordinal());
            }
            if (i == c.TFCARD_TITLE.ordinal()) {
                a(aVar, this.b.getString(R.string.sdcard_operation));
            }
            if (i == c.TFCARD_CONTENT.ordinal()) {
                aVar.b.setVisibility(0);
                aVar.b.setText(this.b.getString(R.string.camera_sd_format));
                aVar.b.setTextColor(this.b.getResources().getColor(R.color.white_90));
            }
            if (i == c.IMAGE_FORMAT_TITLE.ordinal()) {
                a(aVar, this.b.getString(R.string.image_format));
            }
            if (i == c.IMAGE_JPG.ordinal()) {
                a(aVar, this.b.getString(R.string.image_jpg), this.f == c.IMAGE_JPG.ordinal());
            }
            if (i == c.IMAGE_RAW.ordinal()) {
                string = this.b.getString(R.string.image_raw);
                if (this.f != c.IMAGE_RAW.ordinal()) {
                    z = false;
                }
                a(aVar, string, z);
            }
            if (i == c.GRID_TITLE.ordinal()) {
                a(aVar, this.b.getString(R.string.grid_lines));
            }
            if (i == c.GRID_CONTENT.ordinal()) {
                b(aVar);
                aVar.e.setTag(Integer.valueOf(c.GRID_CONTENT.ordinal()));
            }
            if (i == c.BOTTOM_ITEM.ordinal()) {
                layoutParams = view.getLayoutParams();
                layoutParams.height = (int) this.b.getResources().getDimension(R.dimen.setting_adapt_bottom);
                aVar.d.setLayoutParams(layoutParams);
                aVar.d.setBackgroundResource(R.color.list_nomal);
                aVar.a.setVisibility(8);
                aVar.e.setVisibility(8);
                aVar.c.setVisibility(8);
                aVar.b.setVisibility(8);
                aVar.a(false);
            }
        }
        return view;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        SwitchButton switchButton;
        if (this.k) {
            if (!(i == b.TFCARD_CONTENT.ordinal() || i == b.GRID_CONTENT.ordinal())) {
                this.c.r().f();
            }
        } else if (!(i == c.TFCARD_CONTENT.ordinal() || i == c.GRID_CONTENT.ordinal())) {
            this.c.r().f();
        }
        if (i == b.INDEX_RECORD_1080P_30.ordinal() && this.k) {
            if (d()) {
                this.h = com.fimi.soul.biz.camera.e.bF;
                this.i = "1920x1080 30P 16:9";
            } else {
                z.a(this.b, this.b.getString(R.string.set_fail_no_connect_camera), z.b);
                return;
            }
        }
        if (i == b.INDEX_RECORD_1080P_60.ordinal() && this.k) {
            if (d()) {
                this.h = com.fimi.soul.biz.camera.e.bF;
                this.i = "1920x1080 60P 16:9";
            } else {
                z.a(this.b, this.b.getString(R.string.set_fail_no_connect_camera), z.b);
                return;
            }
        }
        if (i == b.INDEX_RECORD_720P.ordinal() && this.k) {
            if (d()) {
                this.h = com.fimi.soul.biz.camera.e.bF;
                this.i = com.fimi.soul.biz.camera.e.bV;
            } else {
                z.a(this.b, this.b.getString(R.string.set_fail_no_connect_camera), z.b);
                return;
            }
        }
        if (i == b.INDEX_PHOTO_4V3_16M.ordinal() && this.k) {
            if (d()) {
                this.h = com.fimi.soul.biz.camera.e.bK;
                this.i = com.fimi.soul.biz.camera.e.bW;
            } else {
                z.a(this.b, this.b.getString(R.string.set_fail_no_connect_camera), z.b);
                return;
            }
        }
        if (i == b.INDEX_PHOTO_4V3_8M.ordinal() && this.k) {
            if (d()) {
                this.h = com.fimi.soul.biz.camera.e.bK;
                this.i = com.fimi.soul.biz.camera.e.bY;
            } else {
                z.a(this.b, this.b.getString(R.string.set_fail_no_connect_camera), z.b);
                return;
            }
        }
        if (i == b.INDEX_PHOTO_16V9_12M.ordinal() && this.k) {
            if (d()) {
                this.h = com.fimi.soul.biz.camera.e.bK;
                this.i = com.fimi.soul.biz.camera.e.bX;
            } else {
                z.a(this.b, this.b.getString(R.string.set_fail_no_connect_camera), z.b);
                return;
            }
        }
        if (i == c.INDEX_RECORD_2160P_30P_4K.ordinal() && !this.k) {
            if (d()) {
                this.h = com.fimi.soul.biz.camera.e.bF;
                this.i = com.fimi.soul.biz.camera.e.ce;
            } else {
                z.a(this.b, this.b.getString(R.string.set_fail_no_connect_camera), z.b);
                return;
            }
        }
        if (i == c.INDEX_RECORD_1440P_60P_4K.ordinal() && !this.k) {
            if (d()) {
                this.h = com.fimi.soul.biz.camera.e.bF;
                this.i = com.fimi.soul.biz.camera.e.bZ;
            } else {
                z.a(this.b, this.b.getString(R.string.set_fail_no_connect_camera), z.b);
                return;
            }
        }
        if (i == c.INDEX_RECORD_1080P_30P_4K.ordinal() && !this.k) {
            if (d()) {
                this.h = com.fimi.soul.biz.camera.e.bF;
                this.i = "1920x1080 30P 16:9";
            } else {
                z.a(this.b, this.b.getString(R.string.set_fail_no_connect_camera), z.b);
                return;
            }
        }
        if (i == c.INDEX_RECORD_1080P_60P_4K.ordinal() && !this.k) {
            if (d()) {
                this.h = com.fimi.soul.biz.camera.e.bF;
                this.i = "1920x1080 60P 16:9";
            } else {
                z.a(this.b, this.b.getString(R.string.set_fail_no_connect_camera), z.b);
                return;
            }
        }
        if (i == c.INDEX_RECORD_1080P_100P_4K.ordinal() && !this.k) {
            if (d()) {
                this.h = com.fimi.soul.biz.camera.e.bF;
                this.i = com.fimi.soul.biz.camera.e.cd;
            } else {
                z.a(this.b, this.b.getString(R.string.set_fail_no_connect_camera), z.b);
                return;
            }
        }
        if (i == c.IMAGE_JPG.ordinal() && !this.k) {
            if (d()) {
                this.h = com.fimi.soul.biz.camera.e.bS;
                this.i = com.fimi.soul.biz.camera.e.ch;
            } else {
                z.a(this.b, this.b.getString(R.string.set_fail_no_connect_camera), z.b);
                return;
            }
        }
        if (i == c.IMAGE_RAW.ordinal() && !this.k) {
            if (d()) {
                this.h = com.fimi.soul.biz.camera.e.bS;
                this.i = com.fimi.soul.biz.camera.e.ci;
            } else {
                z.a(this.b, this.b.getString(R.string.set_fail_no_connect_camera), z.b);
                return;
            }
        }
        if (i == c.GRID_CONTENT.ordinal() && !this.k) {
            switchButton = (SwitchButton) view.findViewById(R.id.switch_btn);
            if (this.o.getBoolean(com.fimi.soul.drone.g.c.bM, false)) {
                switchButton.a(false, true);
                this.n.a(com.fimi.soul.drone.d.a.hide9Grid);
                this.o.edit().putBoolean(com.fimi.soul.drone.g.c.bM, false).commit();
            } else {
                switchButton.a(true, true);
                this.n.a(com.fimi.soul.drone.d.a.Show9Grid);
                this.o.edit().putBoolean(com.fimi.soul.drone.g.c.bM, true).commit();
            }
        }
        if (i == b.GRID_CONTENT.ordinal() && this.k) {
            switchButton = (SwitchButton) view.findViewById(R.id.switch_btn);
            if (this.o.getBoolean(com.fimi.soul.drone.g.c.bM, false)) {
                switchButton.a(false, true);
                this.n.a(com.fimi.soul.drone.d.a.hide9Grid);
                this.o.edit().putBoolean(com.fimi.soul.drone.g.c.bM, false).commit();
            } else {
                switchButton.a(true, true);
                this.n.a(com.fimi.soul.drone.d.a.Show9Grid);
                this.o.edit().putBoolean(com.fimi.soul.drone.g.c.bM, true).commit();
            }
        }
        if (i == c.INDEX_PHOTO_16V9_8M_4K.ordinal() && !this.k) {
            if (d()) {
                this.h = com.fimi.soul.biz.camera.e.bK;
                this.i = com.fimi.soul.biz.camera.e.cg;
            } else {
                z.a(this.b, this.b.getString(R.string.set_fail_no_connect_camera), z.b);
                return;
            }
        }
        if (i == c.INDEX_PHOTO_4V3_12M_4K.ordinal() && !this.k) {
            if (d()) {
                this.h = com.fimi.soul.biz.camera.e.bK;
                this.i = com.fimi.soul.biz.camera.e.cf;
            } else {
                z.a(this.b, this.b.getString(R.string.set_fail_no_connect_camera), z.b);
                return;
            }
        }
        if ((this.k && i == b.TFCARD_CONTENT.ordinal()) || (i == c.TFCARD_CONTENT.ordinal() && !this.k)) {
            if (!d()) {
                z.a(this.b, this.b.getString(R.string.no_connect_camera), z.b);
                return;
            } else if (this.c.h()) {
                new com.fimi.soul.view.f.a(this.b).a(this.b.getString(R.string.you_ensure_format_tf)).a(this.b.getResources().getColor(R.color.dialog_ensure_hot)).b(this.b.getString(R.string.format), new OnClickListener(this) {
                    final /* synthetic */ b a;

                    {
                        this.a = r1;
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                        this.a.c.r().c();
                        com.fimi.kernel.c.b().a();
                    }
                }).a(this.b.getString(R.string.cancel), new OnClickListener(this) {
                    final /* synthetic */ b a;

                    {
                        this.a = r1;
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).a().show();
            } else {
                z.a(this.b, this.b.getString(R.string.format_fail_camera_no_tf_card), z.b);
            }
        }
        if (i != b.VOLUME_RECORD_CONTENT.ordinal() || !this.k) {
            return;
        }
        if (d()) {
            this.h = com.fimi.soul.biz.camera.e.bQ;
            if (this.l) {
                this.l = false;
                this.i = com.fimi.soul.biz.camera.e.cp;
                return;
            }
            this.l = true;
            this.i = com.fimi.soul.biz.camera.e.cq;
            return;
        }
        z.a(this.b, this.b.getString(R.string.set_fail_no_connect_camera), z.b);
    }
}
