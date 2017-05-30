package com.fimi.soul.b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;
import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.fimi.kernel.utils.p;
import com.fimi.kernel.utils.s;
import com.fimi.kernel.utils.x;
import com.fimi.kernel.utils.z;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.entity.WifiDistanceFile;
import com.fimi.soul.media.gallery.DroneImagePagerActivity;
import com.fimi.soul.media.player.FermiPlayerUtils;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.aq;
import com.fimi.soul.utils.j;
import com.fimi.soul.utils.v;
import com.fimi.soul.view.MediaImageLoadingView;
import com.fimi.soul.view.MyGridView;
import com.fimi.soul.view.StrokeDigitalView;
import com.fimi.soul.view.StrokeTextView;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class f extends BaseAdapter implements OnItemClickListener {
    public static List<WifiDistanceFile> a;
    ExecutorService b = Executors.newFixedThreadPool(3);
    Object c = new Object();
    private int d;
    private int e;
    private boolean f = true;
    private boolean g = false;
    private Context h;
    private List<e> i;
    private List<WifiDistanceFile> j;
    private a k = a.Normal;
    private b l;
    private int m = 0;
    private boolean n = false;
    private com.fimi.soul.drone.a o;
    private com.fimi.soul.biz.camera.d p;
    private float q;
    private Set<c> r;
    private MyGridView s;
    private aq t;
    private HashMap u = null;
    private HashMap<Integer, d> v = new HashMap();
    private Boolean w = Boolean.valueOf(true);
    private int x = 0;
    private int y = 0;

    public enum a {
        Normal,
        Choose
    }

    public interface b {
        void a(int i);
    }

    class c extends AsyncTask<String, Void, Bitmap> {
        String a = null;
        final /* synthetic */ f b;
        private String c;
        private String d;

        c(f fVar) {
            this.b = fVar;
        }

        protected Bitmap a(String... strArr) {
            this.d = strArr[0];
            this.c = strArr[1];
            Bitmap bitmap = null;
            if ("".equalsIgnoreCase(this.d) || new File(this.c).exists()) {
                if (v.c(this.c, this.b.h)) {
                    bitmap = ThumbnailUtils.createVideoThumbnail(this.c, 1);
                    try {
                        this.a = FermiPlayerUtils.getVideoDurationString(this.b.h, this.c, "mm:ss");
                        if (this.b.b()) {
                            this.b.u.put("getdur_online" + this.c, this.a);
                        } else {
                            this.b.u.put("getdur_local" + this.c, this.a);
                        }
                    } catch (Exception e) {
                    }
                } else {
                    try {
                        bitmap = s.a(this.b.h, this.c, 160);
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            } else if (FermiPlayerUtils.createRemoteVideoThumbnail(this.d, this.c)) {
                bitmap = BitmapFactory.decodeFile(this.c);
            }
            if (bitmap != null) {
                this.b.a(this.c, bitmap);
            }
            return bitmap;
        }

        @TargetApi(16)
        protected void a(Bitmap bitmap) {
            Object obj;
            super.onPostExecute(bitmap);
            if (this.b.b()) {
                obj = "getdur_online" + this.c;
            } else {
                String str = "getdur_local" + this.c;
            }
            ImageView imageView = (ImageView) this.b.s.findViewWithTag(this.c);
            TextView textView = (TextView) this.b.s.findViewWithTag(obj);
            if (textView != null && this.a != null) {
                textView.setVisibility(0);
                textView.setText((String) this.b.u.get(obj));
            } else if (!(this.b.b() || textView == null)) {
                textView.setVisibility(8);
            }
            Bitmap a = this.b.a(this.c);
            if (!(a == null || imageView == null)) {
                this.b.a(imageView, this.c, a);
            }
            this.b.r.remove(this);
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return a((String[]) objArr);
        }

        @TargetApi(16)
        protected /* synthetic */ void onPostExecute(Object obj) {
            a((Bitmap) obj);
        }
    }

    protected class d {
        View a;
        SimpleDraweeView b;
        ImageView c;
        ImageView d;
        MediaImageLoadingView e;
        StrokeDigitalView f;
        ImageView g;
        TextView h;
        ImageView i;
        StrokeTextView j;
        WifiDistanceFile k;
        int l;
        ImageView m;
        final /* synthetic */ f n;

        protected d(f fVar) {
            this.n = fVar;
        }
    }

    class e {
        WifiDistanceFile a;
        boolean b = false;
        final /* synthetic */ f c;

        public e(f fVar, WifiDistanceFile wifiDistanceFile) {
            this.c = fVar;
            this.a = wifiDistanceFile;
        }
    }

    public f(Context context, MyGridView myGridView) {
        this.h = context;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.r = new HashSet();
        this.t = aq.a();
        this.u = DroidPlannerApp.c();
        this.s = myGridView;
        this.q = p.b(context) < ((float) p.a(context)) ? p.b(context) : (float) p.a(context);
    }

    private d a(View view) {
        d dVar = new d(this);
        dVar.c = (ImageView) view.findViewById(R.id.iv_flleType);
        dVar.b = (SimpleDraweeView) view.findViewById(R.id.iv_thumbnail);
        dVar.d = (ImageView) view.findViewById(R.id.iv_downloadStatus);
        dVar.e = (MediaImageLoadingView) view.findViewById(R.id.iv_downloadprogress);
        dVar.m = (ImageView) view.findViewById(R.id.iv_downloading_mask);
        dVar.f = (StrokeDigitalView) view.findViewById(R.id.tv_duration);
        dVar.a = view.findViewById(R.id.v_blackMask);
        dVar.g = (ImageView) view.findViewById(R.id.iv_selected);
        dVar.h = (TextView) view.findViewById(R.id.tv_progress);
        dVar.i = (ImageView) view.findViewById(R.id.mask_iv);
        dVar.j = (StrokeTextView) view.findViewById(R.id.tv_is_down);
        ao.a(this.h.getAssets(), dVar.h);
        return dVar;
    }

    private void a(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            WifiDistanceFile wifiDistanceFile = (WifiDistanceFile) this.j.get(i3);
            String str = "";
            str = "";
            if (wifiDistanceFile.getDownloadTaskInfo() == null) {
                String name;
                String remoteThmUrl;
                if (b() && wifiDistanceFile.getType() == 2) {
                    name = wifiDistanceFile.getName();
                    remoteThmUrl = wifiDistanceFile.getRemoteThmUrl();
                    str = j.a(name, wifiDistanceFile.getDateString());
                    name = remoteThmUrl;
                } else {
                    try {
                        if (wifiDistanceFile.getType() == 1) {
                            remoteThmUrl = str;
                            str = wifiDistanceFile.getLocalThumbnailPath();
                            name = remoteThmUrl;
                        } else {
                            remoteThmUrl = str;
                            str = wifiDistanceFile.getPath();
                            name = remoteThmUrl;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                }
                if (str != null) {
                    String replace = str.replace("file://", "");
                    String str2 = "getdur" + replace;
                    Bitmap a = a(replace);
                    str = (String) this.u.get(str2);
                    if (a == null) {
                        c cVar = new c(this);
                        this.r.add(cVar);
                        cVar.executeOnExecutor(this.b, new String[]{name, replace});
                    } else {
                        ImageView imageView = (ImageView) this.s.findViewWithTag(replace);
                        TextView textView = (TextView) this.s.findViewWithTag(str2);
                        if (!b() && wifiDistanceFile.getType() == 2) {
                            if (textView != null && str != null) {
                                textView.setVisibility(0);
                                textView.setText((String) this.u.get(str2));
                            } else if (textView != null) {
                                textView.setVisibility(8);
                            }
                        }
                        if (!(imageView == null || a == null)) {
                            a(imageView, replace, a);
                        }
                    }
                }
            }
        }
    }

    @TargetApi(16)
    private void a(ImageView imageView, String str, Bitmap bitmap) {
        if (bitmap == null) {
            imageView.setBackgroundResource(R.drawable.friends_sends_pictures_no);
            return;
        }
        imageView.setBackground(s.a(bitmap));
        imageView.invalidate();
    }

    @TargetApi(16)
    private void a(com.fimi.kernel.b.b.b.a aVar, d dVar) {
        ImageView imageView = dVar.d;
        String localDownloadCachePath = dVar.k.getLocalDownloadCachePath();
        switch (aVar) {
            case Wait:
                dVar.h.setVisibility(0);
                imageView.setImageResource(R.drawable.download_icon);
                return;
            case Pause:
                dVar.h.setText(R.string.pasued);
                dVar.h.setVisibility(0);
                imageView.setImageResource(R.drawable.download_icon);
                return;
            case Error:
                dVar.h.setText(R.string.down_media_false);
                imageView.setImageResource(R.drawable.continue_icon);
                dVar.e.b();
                return;
            case Downloading:
                imageView.setImageResource(R.drawable.pause_icon);
                dVar.e.a();
                Bitmap a = a(localDownloadCachePath);
                if (a != null) {
                    dVar.m.setVisibility(0);
                    dVar.b.setBackground(s.a(a));
                } else {
                    dVar.m.setVisibility(8);
                    dVar.b.setBackgroundResource(R.drawable.friends_sends_pictures_no);
                }
                imageView.setVisibility(0);
                return;
            case Completed:
                dVar.e.setVisibility(8);
                dVar.h.setVisibility(8);
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
                dVar.m.setVisibility(8);
                return;
            default:
                return;
        }
    }

    @TargetApi(16)
    private void a(d dVar, int i, com.fimi.kernel.b.b.b bVar) {
        String str;
        String str2 = "";
        str2 = "";
        if (b() && dVar.k.getType() == 2) {
            String name = dVar.k.getName();
            str2 = dVar.k.getRemoteThmUrl();
            name = j.a(name, dVar.k.getDateString());
            dVar.k.setLocalThumbnailPath(name);
            str = str2;
            str2 = name;
        } else if (!b() && bVar != null && bVar.g() != com.fimi.kernel.b.b.b.a.Completed) {
            str = str2;
            str2 = dVar.k.getLocalDownloadCachePath();
        } else if (dVar.k.getType() == 1) {
            str = str2;
            str2 = dVar.k.getLocalThumbnailPath();
        } else {
            str = str2;
            str2 = dVar.k.getPath();
        }
        if (str2 != null) {
            Object obj;
            String replace = str2.replace("file://", "");
            if (b()) {
                obj = "getdur_online" + replace;
            } else {
                name = "getdur_local" + replace;
            }
            if (!b() && dVar.k.getType() == 2) {
                dVar.f.setTag(obj);
                str2 = (String) this.u.get(obj);
                if (str2 != null) {
                    dVar.f.setVisibility(0);
                    dVar.f.setText(str2);
                } else if (dVar.k.getDurationString() != null) {
                    dVar.f.setVisibility(0);
                    dVar.f.setText(dVar.k.getDurationString());
                } else {
                    dVar.f.setVisibility(8);
                }
            }
            dVar.b.setTag(replace);
            dVar.f.setTag(obj);
            Bitmap a = a(replace);
            if (bVar == null || bVar.g() == com.fimi.kernel.b.b.b.a.Completed) {
                dVar.m.setVisibility(8);
            } else {
                dVar.m.setVisibility(0);
            }
            a(dVar.b, replace, a);
            if (i < 12 && a == null) {
                a(replace, dVar.b);
                c cVar = new c(this);
                this.r.add(cVar);
                cVar.executeOnExecutor(this.b, new String[]{str, replace});
            }
        }
    }

    @TargetApi(16)
    private void a(String str, ImageView imageView) {
        Bitmap a = a(str);
        imageView.setBackground(null);
        if (a != null) {
            imageView.setBackground(s.a(a));
        } else {
            imageView.setBackgroundResource(R.drawable.friends_sends_pictures_no);
        }
    }

    public Bitmap a(String str) {
        return str == null ? null : this.t.a(str);
    }

    public void a() {
        this.g = true;
    }

    public void a(int i) {
        this.i.remove(i);
        notifyDataSetChanged();
    }

    public void a(int i, d dVar) {
        boolean z = false;
        if (this.k == a.Choose) {
            if (i >= 0 && i < this.i.size()) {
                e eVar = (e) this.i.get(i);
                Log.d("Good", "total " + this.i.size() + " index " + i);
                if (eVar.b) {
                    this.m--;
                    dVar.g.setVisibility(8);
                    dVar.i.setVisibility(8);
                } else {
                    this.m++;
                    dVar.g.setVisibility(0);
                    dVar.i.setVisibility(0);
                }
                if (!eVar.b) {
                    z = true;
                }
                eVar.b = z;
            }
            if (this.l != null) {
                this.l.a(this.m);
            }
        }
    }

    public void a(AbsListView absListView, int i) {
        if (i == 0) {
            a(this.d, this.e);
            this.w = Boolean.valueOf(true);
            this.x = this.d;
            this.y = this.e;
            return;
        }
        j();
        this.w = Boolean.valueOf(false);
    }

    public void a(AbsListView absListView, int i, int i2, int i3) {
        this.d = i;
        this.e = i2;
        if (this.f && i2 > 0) {
            a(i, i2);
            this.f = false;
        }
        if (this.w.booleanValue() && this.x + this.y < this.d + this.e) {
            this.x = this.d;
            this.y = this.e;
            a(this.d, this.e);
        }
    }

    public void a(a aVar) {
        this.k = aVar;
    }

    public void a(b bVar) {
        this.l = bVar;
    }

    public void a(com.fimi.soul.drone.a aVar) {
        this.o = aVar;
    }

    public void a(WifiDistanceFile wifiDistanceFile) {
        if (!this.j.contains(wifiDistanceFile)) {
            this.j.add(wifiDistanceFile);
            this.i.add(new e(this, wifiDistanceFile));
        }
        notifyDataSetChanged();
    }

    public void a(String str, Bitmap bitmap) {
        if (a(str) == null) {
            this.t.a(str, bitmap);
        }
    }

    public void a(List<WifiDistanceFile> list) {
        List arrayList = new ArrayList();
        for (WifiDistanceFile eVar : list) {
            arrayList.add(new e(this, eVar));
        }
        this.i = arrayList;
        this.j = list;
    }

    public void a(boolean z) {
        this.n = z;
    }

    public void b(WifiDistanceFile wifiDistanceFile) {
        if (this.j.contains(wifiDistanceFile)) {
            int indexOf = this.j.indexOf(wifiDistanceFile);
            this.j.remove(indexOf);
            this.i.remove(indexOf);
        }
        notifyDataSetChanged();
    }

    public void b(String str) {
        for (e eVar : this.i) {
            if (eVar.a.getPath().equals(str)) {
                this.i.remove(eVar);
                break;
            }
        }
        notifyDataSetChanged();
    }

    public boolean b() {
        return this.n;
    }

    public List<WifiDistanceFile> c() {
        List<WifiDistanceFile> arrayList = new ArrayList();
        for (e eVar : this.i) {
            if (eVar.b) {
                arrayList.add(eVar.a);
            }
        }
        return arrayList;
    }

    public void c(WifiDistanceFile wifiDistanceFile) {
        for (int i = 0; i < this.j.size(); i++) {
            if (wifiDistanceFile.getName().equals(((WifiDistanceFile) this.j.get(i)).getName())) {
                this.j.remove(i);
                this.i.remove(i);
                notifyDataSetChanged();
            }
        }
    }

    public List<WifiDistanceFile> d() {
        return this.j;
    }

    public a e() {
        return this.k;
    }

    public void f() {
        for (e eVar : this.i) {
            eVar.b = true;
        }
        this.m = this.i.size();
        if (this.l != null) {
            this.l.a(this.m);
        }
        notifyDataSetChanged();
    }

    public void g() {
        for (e eVar : this.i) {
            eVar.b = false;
        }
        this.m = 0;
        if (this.l != null) {
            this.l.a(this.m);
        }
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.i != null ? this.i.size() : 0;
    }

    public Object getItem(int i) {
        return this.i.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    @TargetApi(16)
    public View getView(int i, View view, ViewGroup viewGroup) {
        d a;
        this.s = (MyGridView) viewGroup;
        e eVar = (e) this.i.get(i);
        if (view == null) {
            view = LayoutInflater.from(this.h).inflate(R.layout.item_thumbnail_info, null);
            a = a(view);
            a.k = eVar.a;
            view.setLayoutParams(new LayoutParams(-1, (int) (((this.q - p.a(this.h, 50.0f)) - (4.0f * p.a(this.h, 5.0f))) / com.fimi.soul.view.photodraweeview.c.a)));
            view.setTag(a);
        } else {
            a = (d) view.getTag();
        }
        a.l = i;
        final com.fimi.kernel.b.b.b downloadTaskInfo = eVar.a.getDownloadTaskInfo();
        if (!this.g) {
            this.v.put(Integer.valueOf(i), a);
        }
        if (this.n) {
            if (com.fimi.soul.biz.camera.b.c(eVar.a.getName())) {
                a.j.setVisibility(8);
            } else {
                a.j.setVisibility(0);
                a.j.setText(this.h.getString(R.string.no_down));
            }
        } else if (downloadTaskInfo != null) {
            downloadTaskInfo.a(Integer.valueOf(i));
            downloadTaskInfo.a(new com.fimi.kernel.b.b.b.d(this) {
                final /* synthetic */ f a;

                {
                    this.a = r1;
                }

                public void a(com.fimi.kernel.b.b.b.a aVar, com.fimi.kernel.b.b.b bVar) {
                    if (bVar.j() != null) {
                        int intValue = ((Integer) bVar.j()).intValue();
                        d dVar = (d) this.a.v.get(Integer.valueOf(intValue));
                        if (dVar.l == intValue) {
                            com.fimi.kernel.b.b.c a = com.fimi.kernel.b.b.c.a(this.a.h);
                            if (aVar != com.fimi.kernel.b.b.b.a.Error) {
                                long k = bVar.k() / (bVar.i() / 100);
                                String replace = dVar.h.getText().toString().substring(3).replace("%", "");
                                if (!ao.e(replace) || replace.equals("")) {
                                    dVar.h.setText(String.format(this.a.h.getString(R.string.downing_media), new Object[]{k + "%"}));
                                    dVar.e.setVisibility(0);
                                    dVar.e.setSweepAngle((float) k);
                                    this.a.a(aVar, dVar);
                                    return;
                                }
                                long parseLong = Long.parseLong(replace);
                                if (bVar.g() == com.fimi.kernel.b.b.b.a.Completed) {
                                    this.a.a(bVar.g(), dVar);
                                    if (bVar.n() != null) {
                                        String replace2 = bVar.h().replace("file://", "");
                                        this.a.a(replace2, bVar.n());
                                        this.a.a(dVar.b, replace2, bVar.n());
                                        if (bVar.a() != null) {
                                            this.a.u.put("getdur_local" + replace2, bVar.a());
                                            dVar.f.setVisibility(0);
                                            dVar.f.setText(bVar.a());
                                        }
                                    }
                                    a.a(bVar);
                                    a.a();
                                } else if (parseLong != k) {
                                    if (bVar.a() != null) {
                                        dVar.f.setVisibility(0);
                                        dVar.f.setText(bVar.a());
                                    }
                                    dVar.h.setVisibility(0);
                                    dVar.h.setText(String.format(this.a.h.getString(R.string.downing_media), new Object[]{k + "%"}));
                                    dVar.e.setVisibility(0);
                                    dVar.e.setSweepAngle((float) k);
                                    this.a.a(aVar, dVar);
                                }
                            } else if (bVar != null) {
                                a.c();
                                this.a.a(aVar, dVar);
                            }
                        }
                    }
                }
            });
        }
        if (eVar.b) {
            a.g.setVisibility(0);
            a.i.setVisibility(0);
        } else {
            a.g.setVisibility(8);
            a.i.setVisibility(8);
        }
        a.k = eVar.a;
        a.c.setVisibility(8);
        a.f.setVisibility(4);
        a.d.setVisibility(4);
        a.e.setVisibility(4);
        a.b.setBackgroundResource(R.drawable.friends_sends_pictures_no);
        a.b.invalidate();
        a.b.setTag(null);
        a.h.setVisibility(4);
        if (downloadTaskInfo != null) {
            a.d.setVisibility(0);
            a.e.setVisibility(0);
            long k = downloadTaskInfo.k() / (downloadTaskInfo.i() / 100);
            a.h.setVisibility(0);
            a.e.setSweepAngle((float) k);
            a.h.setText(String.format(this.h.getString(R.string.downing_media), new Object[]{k + "%"}));
            if (k == 100) {
                downloadTaskInfo.f();
            }
            String localDownloadCachePath = a.k.getLocalDownloadCachePath();
            Bitmap a2;
            switch (downloadTaskInfo.g()) {
                case Wait:
                case Downloading:
                    a2 = a(localDownloadCachePath);
                    if (a2 != null) {
                        a.m.setVisibility(0);
                        a.b.setBackground(s.a(a2));
                    } else {
                        a.m.setVisibility(8);
                        a.b.setBackgroundResource(R.drawable.friends_sends_pictures_no);
                    }
                    a.d.setImageResource(R.drawable.pause_icon);
                    a.e.a();
                    break;
                case Pause:
                    a.h.setText(R.string.pasued);
                    a.d.setImageResource(R.drawable.download_icon);
                    a.e.a();
                    break;
                case Error:
                    a2 = a(localDownloadCachePath);
                    if (a2 != null) {
                        a.m.setVisibility(0);
                        a.b.setBackground(s.a(a2));
                    } else {
                        a.m.setVisibility(8);
                        a.b.setBackgroundResource(R.drawable.friends_sends_pictures_no);
                    }
                    a.h.setText(R.string.down_media_false);
                    a.d.setImageResource(R.drawable.continue_icon);
                    a.e.b();
                    break;
                case Completed:
                    a.d.setVisibility(8);
                    a.e.setVisibility(8);
                    a.h.setVisibility(8);
                    eVar.a.setDownloadTaskInfo(null);
                    a(a, i, downloadTaskInfo);
                    x.a(new Runnable(this) {
                        final /* synthetic */ f b;

                        public void run() {
                            com.fimi.kernel.b.b.c.a(this.b.h).a(downloadTaskInfo);
                        }
                    });
                    break;
            }
        }
        if (a.k.getType() == 2) {
            a.c.setVisibility(0);
            if (a.k.getDurationString() != null) {
                a.f.setVisibility(0);
                a.f.setText(a.k.getDurationString());
            } else {
                a.f.setVisibility(8);
            }
        }
        if (this.g) {
            this.g = false;
        } else {
            a(a, i, downloadTaskInfo);
        }
        return view;
    }

    public void h() {
        this.j.clear();
        this.i.clear();
        notifyDataSetChanged();
    }

    protected com.fimi.soul.biz.camera.d i() {
        if (this.p == null) {
            this.p = (com.fimi.soul.biz.camera.d) com.fimi.soul.biz.camera.b.a().d();
        }
        return this.p;
    }

    public void j() {
        if (this.r != null) {
            for (c cancel : this.r) {
                cancel.cancel(false);
            }
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (!this.n || i().d()) {
            a = new ArrayList();
            d dVar = (d) view.getTag();
            if (this.k == a.Choose) {
                a(i, dVar);
                return;
            }
            e eVar = (e) this.i.get(i);
            com.fimi.kernel.b.b.b downloadTaskInfo = eVar.a.getDownloadTaskInfo();
            if (downloadTaskInfo == null || downloadTaskInfo.g() == com.fimi.kernel.b.b.b.a.Completed) {
                try {
                    List arrayList = new ArrayList();
                    List arrayList2 = new ArrayList();
                    List arrayList3 = new ArrayList();
                    Intent intent = new Intent(this.h, DroneImagePagerActivity.class);
                    int i2 = 0;
                    int i3 = i;
                    while (i2 < this.i.size()) {
                        e eVar2 = (e) this.i.get(i2);
                        if (this.n) {
                            if (eVar2.a.getType() == 2) {
                                arrayList.add(eVar2.a.getRemoteThmUrl() + "&&" + eVar2.a.getRemoteUrl());
                                arrayList3.add(eVar2.a.getDurationString());
                            } else {
                                arrayList.add(eVar2.a.getRemoteUrl());
                                arrayList3.add("");
                            }
                            arrayList2.add(eVar2.a.getLocalThumbnailPath());
                            a.add(((e) this.i.get(i2)).a);
                            intent.putExtra(DroneImagePagerActivity.d, true);
                        } else {
                            downloadTaskInfo = eVar2.a.getDownloadTaskInfo();
                            if (downloadTaskInfo != null && downloadTaskInfo.g() == com.fimi.kernel.b.b.b.a.Completed) {
                                arrayList.add(eVar2.a.getLocalThumbnailPath());
                                arrayList2.add(eVar2.a.getPath());
                            }
                            if (downloadTaskInfo == null) {
                                arrayList.add(eVar2.a.getLocalThumbnailPath());
                                arrayList2.add(eVar2.a.getPath());
                            }
                            intent.putExtra(DroneImagePagerActivity.d, false);
                        }
                        i2++;
                        i3 = eVar.a == eVar2.a ? arrayList.size() - 1 : i3;
                    }
                    intent.putExtra("image_urls", (Serializable) arrayList);
                    intent.putExtra(DroneImagePagerActivity.e, (Serializable) arrayList2);
                    intent.putExtra("image_index", i3);
                    intent.putExtra(DroneImagePagerActivity.b, eVar.a.getType());
                    intent.putExtra(DroneImagePagerActivity.f, (Serializable) arrayList3);
                    ((Activity) this.h).startActivityForResult(intent, 0);
                    ((Activity) this.h).overridePendingTransition(17432576, 17432577);
                    return;
                } catch (NotFoundException e) {
                    e.printStackTrace();
                    return;
                }
            }
            switch (downloadTaskInfo.g()) {
                case Wait:
                    downloadTaskInfo.e();
                    dVar.h.setText(this.h.getResources().getString(R.string.pasued));
                    dVar.d.setImageResource(R.drawable.download_icon);
                    dVar.e.a();
                    return;
                case Pause:
                case Error:
                    long k = downloadTaskInfo.k() / (downloadTaskInfo.i() / 100);
                    Log.d("Good", "执行点击事件" + downloadTaskInfo.g());
                    if (com.fimi.kernel.b.b.c.a(this.h).b() < 3) {
                        downloadTaskInfo.c();
                    } else {
                        downloadTaskInfo.d();
                    }
                    dVar.d.setImageResource(R.drawable.pause_icon);
                    dVar.e.a();
                    dVar.h.setText(String.format(this.h.getString(R.string.downing_media), new Object[]{k + "%"}));
                    return;
                case Downloading:
                    Log.d("Good", "执行点击事件->停止");
                    downloadTaskInfo.e();
                    dVar.h.setText(this.h.getResources().getString(R.string.pasued));
                    dVar.d.setImageResource(R.drawable.download_icon);
                    dVar.e.a();
                    com.fimi.kernel.b.b.c.a(this.h).c();
                    return;
                default:
                    return;
            }
        }
        z.a(this.h, (int) R.string.no_connect_camera, z.b);
    }
}
